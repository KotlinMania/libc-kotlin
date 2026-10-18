@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.emscripten
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_endpwent
import libc.cinterop.libc_getpriority
import libc.cinterop.libc_getrlimit
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_labs
import libc.cinterop.libc_mkstemps
import libc.cinterop.libc_rand
import libc.cinterop.libc_setpriority
import libc.cinterop.libc_setpwent
import libc.cinterop.libc_setrlimit
import libc.cinterop.libc_shm_open
import libc.cinterop.libc_shm_unlink
import libc.cinterop.libc_srand

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun cpuZero(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO requires manual FFI bridge — not yet implemented")

public actual fun cpuSet(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET requires manual FFI bridge — not yet implemented")

public actual fun cpuClear(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR requires manual FFI bridge — not yet implemented")

public actual fun cpuIsSet(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires manual FFI bridge — not yet implemented")

public actual fun cpuEqual(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int {
    if (rlim == null) return -1
    val rlimPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc_getrlimit(resource, rlimPtr)
    return result
}

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int {
    if (rlim == null) return -1
    val rlpPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc_setrlimit(resource, rlpPtr)
    return result
}

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires FFI bridge")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs requires FFI bridge")

public actual fun labs(i: Long): Long =
    libc.cinterop.libc_labs(i)

public actual fun rand(): Int =
    libc.cinterop.libc_rand()

public actual fun srand(seed: UInt) {
    libc_srand(seed)
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun setpwent() {
    libc_setpwent()
}

public actual fun endpwent() {
    libc_endpwent()
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires manual FFI bridge — not yet implemented")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int {
    val result = libc_shm_open(name, oflag, mode.toInt())
    return result
}

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires FFI bridge")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires FFI bridge")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires FFI bridge")

public actual fun dup3(oldfd: Int, newfd: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg requires manual FFI bridge — not yet implemented")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat requires FFI bridge")

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: Int, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap requires manual FFI bridge — not yet implemented")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree requires manual FFI bridge — not yet implemented")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise requires FFI bridge")

public actual fun shmUnlink(name: String?): Int {
    val result = libc_shm_unlink(name)
    return result
}

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires FFI bridge")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires FFI bridge")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires FFI bridge")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun mkstemps(template: String?, suffixlen: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkstemps(template, suffixlen)
}

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt): Int =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: Int, who: UInt): Int {
    val result = libc_getpriority(which, who.toInt())
    return result
}

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int {
    val result = libc_setpriority(which, who.toInt(), prio)
    return result
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires manual FFI bridge — not yet implemented")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob requires manual FFI bridge — not yet implemented")
