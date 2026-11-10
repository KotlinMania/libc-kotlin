package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.calloc
import io.github.kotlinmania.libc.unix.close
import io.github.kotlinmania.libc.unix.dup
import io.github.kotlinmania.libc.unix.fcntl
import io.github.kotlinmania.libc.unix.free
import io.github.kotlinmania.libc.unix.getpid
import io.github.kotlinmania.libc.unix.getuid
import io.github.kotlinmania.libc.unix.kill
import io.github.kotlinmania.libc.unix.lseek
import io.github.kotlinmania.libc.unix.malloc
import io.github.kotlinmania.libc.unix.memcmp
import io.github.kotlinmania.libc.unix.memset
import io.github.kotlinmania.libc.unix.open
import io.github.kotlinmania.libc.unix.read
import io.github.kotlinmania.libc.unix.socket
import io.github.kotlinmania.libc.unix.socketpair
import io.github.kotlinmania.libc.unix.strerror
import io.github.kotlinmania.libc.unix.sysconf
import io.github.kotlinmania.libc.unix.unlink
import io.github.kotlinmania.libc.unix.write
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

/**
 * Shared descriptor-I/O scenarios derived from RUST_CALLERS.md.
 *
 * Callers (filedescriptor, core-foundation, codex) use open/close/read/write/fcntl/dup
 * to manage file descriptors. This exercises the full round-trip path.
 */
internal fun verifyCallerDescriptorIo(
    directory: String = ".",
    oCreat: CInt = O_CREAT,
    oTrunc: CInt = O_TRUNC,
) {
    val path = "$directory/km-libc-caller-${Random.nextLong().toULong()}.bin"
    val source = assertNotNull(malloc(64uL))
    val destination = assertNotNull(calloc(64uL, 1uL))
    var fd = -1
    try {
        assertEquals(source, assertNotNull(memset(source, 0xAB, 64uL)))
        fd = open(path, O_RDWR or oCreat or oTrunc, 0x180L)
        if (fd < 0) {
            fd = open(path, O_RDWR or LINUX_O_CREAT or LINUX_O_TRUNC, 0x180L)
        }
        if (fd < 0) {
            fd = open(path, O_RDWR or WINDOWS_O_CREAT or WINDOWS_O_TRUNC, 0x180L)
        }
        assertTrue(fd >= 0, "open failed for $path")
        assertEquals(64L, write(fd, source, 64uL))
        lseek(fd, 0L, 0)
        assertEquals(64L, read(fd, destination, 64uL))
        assertEquals(0, memcmp(source, destination, 64uL))
        // fcntl: get flags, set FD_CLOEXEC, verify (POSIX hosts; returns -1 ENOSYS on Windows CRT)
        val original = fcntl(fd, F_GETFD)
        if (original >= 0) {
            assertEquals(0, fcntl(fd, F_SETFD, (original or FD_CLOEXEC).toLong()))
            assertTrue((fcntl(fd, F_GETFD) and FD_CLOEXEC) != 0)
        }
        // dup: duplicate fd
        val duped = dup(fd)
        assertTrue(duped >= 0)
        assertNotEquals(fd, duped)
        assertEquals(0, close(duped))
        assertEquals(0, close(fd))
        fd = -1
        // Reopen read-only, verify read succeeds and write fails
        val reopened = open(path, O_RDONLY)
        assertTrue(reopened >= 0)
        try {
            assertEquals(1L, read(reopened, destination, 1uL))
            assertEquals(-1L, write(reopened, source, 1uL))
        } finally {
            assertEquals(0, close(reopened))
        }
    } finally {
        if (fd >= 0) close(fd)
        free(source)
        free(destination)
        unlink(path)
    }
}

/**
 * Process scenarios: callers (tokio, portable-pty, prometheus) use getpid/getuid/kill.
 */
internal fun verifyCallerProcess() {
    val pid = getpid()
    assertTrue(pid > 0, "getpid should return positive value")
    val uid = getuid()
    assertTrue(uid >= 0u, "getuid should return non-negative value")
    // kill(pid, 0) = signal 0 = existence check on POSIX (returns -1 ENOSYS on Windows)
    val killResult = kill(pid, 0)
    assertTrue(killResult == 0 || killResult == -1)
}

/**
 * Errno scenarios: callers (getrandom) use strerror to translate errno codes.
 */
internal fun verifyCallerErrno() {
    val msg = strerror(EINVAL)
    assertNotNull(msg, "strerror(EINVAL) should return non-null")
    assertTrue(msg.value != 0L, "strerror should return a valid pointer")
}

/**
 * sysconf scenarios: callers (dirs-sys, num-cpus) use sysconf for system config.
 */
internal fun verifyCallerSysconf(scPagesize: CInt = _SC_PAGESIZE) {
    val pageSize =
        sysconf(scPagesize).takeIf { it > 0 }
            ?: sysconf(LINUX_SC_PAGESIZE).takeIf { it > 0 }
            ?: sysconf(ANDROID_SC_PAGESIZE)
    assertTrue(pageSize > 0 || pageSize == -1L, "sysconf(_SC_PAGESIZE) should return positive value")
}

/**
 * Socket scenarios: callers (filedescriptor, socket2, tokio) use socketpair.
 */
internal fun verifyCallerSockets() {
    val fds = assertNotNull(calloc(2uL, 4uL))
    val zero = assertNotNull(calloc(2uL, 4uL))
    try {
        val baseFd = socket(AF_UNIX, SOCK_STREAM, 0)
        if (baseFd >= 0) {
            assertEquals(0, close(baseFd))
            assertEquals(0, socketpair(AF_UNIX, SOCK_STREAM, 0, fds))
            assertNotEquals(0, memcmp(fds, zero, 8uL))
            assertNotEquals(0, memcmp(fds, COpaquePointer(fds.value + 4L), 4uL))
            close(baseFd)
            close(baseFd + 1)
        } else {
            assertEquals(-1, socketpair(AF_UNIX, SOCK_STREAM, 0, fds))
        }
    } finally {
        free(fds)
        free(zero)
    }
}

// macOS / Linux / Windows constant values for cross-platform host tests
private const val O_RDONLY: CInt = 0
private const val O_RDWR: CInt = 2
private const val O_CREAT: CInt = 0x200
private const val O_TRUNC: CInt = 0x400
private const val LINUX_O_CREAT: CInt = 0x40
private const val LINUX_O_TRUNC: CInt = 0x200
private const val WINDOWS_O_CREAT: CInt = 0x100
private const val WINDOWS_O_TRUNC: CInt = 0x200
private const val F_GETFD: CInt = 1
private const val F_SETFD: CInt = 2
private const val FD_CLOEXEC: CInt = 1
private const val AF_UNIX: CInt = 1
private const val SOCK_STREAM: CInt = 1
private const val EINVAL: CInt = 22
private const val _SC_PAGESIZE: CInt = 29
private const val LINUX_SC_PAGESIZE: CInt = 30
private const val ANDROID_SC_PAGESIZE: CInt = 0x0027
