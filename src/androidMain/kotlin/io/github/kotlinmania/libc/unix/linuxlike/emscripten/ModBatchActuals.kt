// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on Android host — use androidNative target for FFI")

public actual fun cPUZERO(cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUZERO not available on Android host — use androidNative target for FFI")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUSET not available on Android host — use androidNative target for FFI")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUCLR not available on Android host — use androidNative target for FFI")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on Android host — use androidNative target for FFI")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL not available on Android host — use androidNative target for FFI")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on Android host — use androidNative target for FFI")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on Android host — use androidNative target for FFI")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on Android host — use androidNative target for FFI")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on Android host — use androidNative target for FFI")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent not available on Android host — use androidNative target for FFI")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent not available on Android host — use androidNative target for FFI")
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on Android host — use androidNative target for FFI")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen not available on Android host — use androidNative target for FFI")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on Android host — use androidNative target for FFI")

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation not available on Android host — use androidNative target for FFI")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on Android host — use androidNative target for FFI")

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt =
    throw UnsupportedOperationException("accept4 not available on Android host — use androidNative target for FFI")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on Android host — use androidNative target for FFI")

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg not available on Android host — use androidNative target for FFI")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat not available on Android host — use androidNative target for FFI")

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: CInt, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap not available on Android host — use androidNative target for FFI")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree not available on Android host — use androidNative target for FFI")
}

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise not available on Android host — use androidNative target for FFI")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink not available on Android host — use androidNative target for FFI")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir not available on Android host — use androidNative target for FFI")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir not available on Android host — use androidNative target for FFI")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise not available on Android host — use androidNative target for FFI")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync not available on Android host — use androidNative target for FFI")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom not available on Android host — use androidNative target for FFI")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo not available on Android host — use androidNative target for FFI")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("sendmmsg not available on Android host — use androidNative target for FFI")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg not available on Android host — use androidNative target for FFI")

public actual fun sync() {
    throw UnsupportedOperationException("sync not available on Android host — use androidNative target for FFI")
}

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on Android host — use androidNative target for FFI")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority not available on Android host — use androidNative target for FFI")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority not available on Android host — use androidNative target for FFI")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy not available on Android host — use androidNative target for FFI")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid not available on Android host — use androidNative target for FFI")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on Android host — use androidNative target for FFI")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR not available on Android host — use androidNative target for FFI")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR not available on Android host — use androidNative target for FFI")

