package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.calloc
import io.github.kotlinmania.libc.free
import io.github.kotlinmania.libc.malloc
import io.github.kotlinmania.libc.realloc
import io.github.kotlinmania.libc.unix.close
import io.github.kotlinmania.libc.unix.dup
import io.github.kotlinmania.libc.unix.fcntl
import io.github.kotlinmania.libc.unix.getpid
import io.github.kotlinmania.libc.unix.getuid
import io.github.kotlinmania.libc.unix.kill
import io.github.kotlinmania.libc.unix.lseek
import io.github.kotlinmania.libc.unix.open
import io.github.kotlinmania.libc.unix.read
import io.github.kotlinmania.libc.unix.socketpair
import io.github.kotlinmania.libc.unix.strerror
import io.github.kotlinmania.libc.unix.sysconf
import io.github.kotlinmania.libc.unix.unlink
import io.github.kotlinmania.libc.unix.write
import io.github.kotlinmania.libc.vxworks.memcmp
import io.github.kotlinmania.libc.vxworks.memcpy
import io.github.kotlinmania.libc.vxworks.memset
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
internal fun verifyCallerDescriptorIo(directory: String = ".") {
    val path = "$directory/km-libc-caller-${Random.nextLong().toULong()}.bin"
    val source = assertNotNull(malloc(64uL))
    val destination = assertNotNull(calloc(64uL, 1uL))
    var fd = -1
    try {
        assertEquals(source, assertNotNull(memset(source, 0xAB, 64uL)))
        fd = open(path, O_RDWR or O_CREAT or O_TRUNC, 0x180)
        assertTrue(fd >= 0, "open failed for $path")
        assertEquals(64L, write(fd, source, 64uL))
        lseek(fd, 0L, 0)
        assertEquals(64L, read(fd, destination, 64uL))
        assertEquals(0, memcmp(source, destination, 64uL))
        // fcntl: get flags, set FD_CLOEXEC, verify
        val original = fcntl(fd, F_GETFD)
        assertTrue(original >= 0)
        assertEquals(0, fcntl(fd, F_SETFD, original or FD_CLOEXEC))
        assertTrue((fcntl(fd, F_GETFD) and FD_CLOEXEC) != 0)
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
    // kill(pid, 0) = signal 0 = existence check, should succeed
    assertEquals(0, kill(pid, 0))
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
internal fun verifyCallerSysconf() {
    val pageSize = sysconf(_SC_PAGESIZE)
    assertTrue(pageSize > 0, "sysconf(_SC_PAGESIZE) should return positive value")
}

/**
 * Socket scenarios: callers (filedescriptor, socket2, tokio) use socketpair.
 */
internal fun verifyCallerSockets() {
    val fds = IntArray(2)
    assertEquals(0, socketpair(AF_UNIX, SOCK_STREAM, 0, fds))
    assertTrue(fds[0] >= 0)
    assertTrue(fds[1] >= 0)
    assertNotEquals(fds[0], fds[1])
    assertEquals(0, close(fds[0]))
    assertEquals(0, close(fds[1]))
}

// macOS constant values (host platform for tests)
// These match the values in Rust libc for apple targets
private const val O_RDONLY: CInt = 0
private const val O_RDWR: CInt = 2
private const val O_CREAT: CInt = 0x200
private const val O_TRUNC: CInt = 0x400
private const val F_GETFD: CInt = 1
private const val F_SETFD: CInt = 2
private const val FD_CLOEXEC: CInt = 1
private const val AF_UNIX: CInt = 1
private const val SOCK_STREAM: CInt = 1
private const val EINVAL: CInt = 22
private const val _SC_PAGESIZE: CInt = 29
