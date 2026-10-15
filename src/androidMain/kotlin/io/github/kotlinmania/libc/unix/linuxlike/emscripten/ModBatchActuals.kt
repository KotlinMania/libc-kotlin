// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on Android host — use androidNative target for FFI")

public actual fun cpuZero(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO not available on Android host — use androidNative target for FFI")

public actual fun cpuSet(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET not available on Android host — use androidNative target for FFI")

public actual fun cpuClear(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR not available on Android host — use androidNative target for FFI")

public actual fun cpuIsSet(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on Android host — use androidNative target for FFI")

public actual fun cpuEqual(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL not available on Android host — use androidNative target for FFI")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on Android host — use androidNative target for FFI")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on Android host — use androidNative target for FFI")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on Android host — use androidNative target for FFI")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on Android host — use androidNative target for FFI")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent not available on Android host — use androidNative target for FFI")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent not available on Android host — use androidNative target for FFI")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on Android host — use androidNative target for FFI")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen not available on Android host — use androidNative target for FFI")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on Android host — use androidNative target for FFI")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation not available on Android host — use androidNative target for FFI")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun dup3(oldfd: Int, newfd: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on Android host — use androidNative target for FFI")

public actual fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 not available on Android host — use androidNative target for FFI")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on Android host — use androidNative target for FFI")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg not available on Android host — use androidNative target for FFI")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat not available on Android host — use androidNative target for FFI")

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: Int, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap not available on Android host — use androidNative target for FFI")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on Android host — use androidNative target for FFI")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise not available on Android host — use androidNative target for FFI")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on Android host — use androidNative target for FFI")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on Android host — use androidNative target for FFI")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on Android host — use androidNative target for FFI")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise not available on Android host — use androidNative target for FFI")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on Android host — use androidNative target for FFI")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom not available on Android host — use androidNative target for FFI")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on Android host — use androidNative target for FFI")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt): Int =
    throw UnsupportedOperationException("sendmmsg not available on Android host — use androidNative target for FFI")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg not available on Android host — use androidNative target for FFI")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on Android host — use androidNative target for FFI")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on Android host — use androidNative target for FFI")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority not available on Android host — use androidNative target for FFI")

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority not available on Android host — use androidNative target for FFI")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on Android host — use androidNative target for FFI")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on Android host — use androidNative target for FFI")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on Android host — use androidNative target for FFI")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on Android host — use androidNative target for FFI")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on Android host — use androidNative target for FFI")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on Android host — use androidNative target for FFI")
