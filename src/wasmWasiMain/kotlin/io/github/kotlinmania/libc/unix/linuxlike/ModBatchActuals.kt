// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on WASI — no C library access")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on WASI — no C library access")

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR not available on WASI — no C library access")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on WASI — no C library access")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET not available on WASI — no C library access")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO not available on WASI — no C library access")
}

public actual fun sIGRTMAX(): CInt =
    throw UnsupportedOperationException("sIGRTMAX not available on WASI — no C library access")

public actual fun sIGRTMIN(): CInt =
    throw UnsupportedOperationException("sIGRTMIN not available on WASI — no C library access")

public actual fun ioctl(fd: CInt, request: Ioctl, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on WASI — no C library access")

public actual fun libcCurrentSigrtmax(): CInt =
    throw UnsupportedOperationException("libcCurrentSigrtmax not available on WASI — no C library access")

public actual fun libcCurrentSigrtmin(): CInt =
    throw UnsupportedOperationException("libcCurrentSigrtmin not available on WASI — no C library access")

public actual fun semDestroy(sem: SemT): CInt =
    throw UnsupportedOperationException("semDestroy not available on WASI — no C library access")

public actual fun semInit(sem: SemT, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on WASI — no C library access")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync not available on WASI — no C library access")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mincore not available on WASI — no C library access")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on WASI — no C library access")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on WASI — no C library access")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime not available on WASI — no C library access")

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid not available on WASI — no C library access")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer not available on WASI — no C library access")

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer not available on WASI — no C library access")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on WASI — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on WASI — no C library access")

public actual fun setgroups(ngroups: ULong, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups not available on WASI — no C library access")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 not available on WASI — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs not available on WASI — no C library access")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs not available on WASI — no C library access")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on WASI — no C library access")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise not available on WASI — no C library access")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on WASI — no C library access")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat not available on WASI — no C library access")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on WASI — no C library access")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on WASI — no C library access")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on WASI — no C library access")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale not available on WASI — no C library access")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat not available on WASI — no C library access")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR not available on WASI — no C library access")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv not available on WASI — no C library access")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid not available on WASI — no C library access")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid not available on WASI — no C library access")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid not available on WASI — no C library access")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct not available on WASI — no C library access")

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("brk not available on WASI — no C library access")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on WASI — no C library access")

public actual fun vfork(): PidT =
    throw UnsupportedOperationException("vfork not available on WASI — no C library access")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid not available on WASI — no C library access")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid not available on WASI — no C library access")

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 not available on WASI — no C library access")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty not available on WASI — no C library access")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe not available on WASI — no C library access")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve not available on WASI — no C library access")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs not available on WASI — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs not available on WASI — no C library access")
}

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind not available on WASI — no C library access")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on WASI — no C library access")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on WASI — no C library access")

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg not available on WASI — no C library access")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg not available on WASI — no C library access")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on WASI — no C library access")

public actual fun strchrnul(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchrnul not available on WASI — no C library access")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on WASI — no C library access")

public actual fun strftimeL(s: String?, max: ULong, format: String?, tm: Tm?, locale: LocaleT): ULong =
    throw UnsupportedOperationException("strftimeL not available on WASI — no C library access")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime not available on WASI — no C library access")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp not available on WASI — no C library access")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps not available on WASI — no C library access")

public actual fun getdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("getdomainname not available on WASI — no C library access")

public actual fun setdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("setdomainname not available on WASI — no C library access")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on WASI — no C library access")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex not available on WASI — no C library access")
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR not available on WASI — no C library access")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR not available on WASI — no C library access")

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("fstatfs64 not available on WASI — no C library access")

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("statvfs64 not available on WASI — no C library access")

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("fstatvfs64 not available on WASI — no C library access")

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("statfs64 not available on WASI — no C library access")

public actual fun creat64(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat64 not available on WASI — no C library access")


public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: Stat64?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat64 not available on WASI — no C library access")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    throw UnsupportedOperationException("ftruncate64 not available on WASI — no C library access")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    throw UnsupportedOperationException("lseek64 not available on WASI — no C library access")


public actual fun mmap64(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    throw UnsupportedOperationException("mmap64 not available on WASI — no C library access")


public actual fun openat64(fd: CInt, path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat64 not available on WASI — no C library access")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise64 not available on WASI — no C library access")

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pread64 not available on WASI — no C library access")

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwrite64 not available on WASI — no C library access")

public actual fun readdir64(dirp: DIR?): Dirent64? =
    throw UnsupportedOperationException("readdir64 not available on WASI — no C library access")

public actual fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdir64R not available on WASI — no C library access")


public actual fun truncate64(path: String?, length: Off64T): CInt =
    throw UnsupportedOperationException("truncate64 not available on WASI — no C library access")

public actual fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("preadv64 not available on WASI — no C library access")

public actual fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwritev64 not available on WASI — no C library access")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty not available on WASI — no C library access")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty not available on WASI — no C library access")

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUInt, statxbuf: Statx?): CInt =
    throw UnsupportedOperationException("statx not available on WASI — no C library access")


public actual fun fstat64(fildes: CInt, buf: Stat64?): CInt =
    throw UnsupportedOperationException("fstat64 not available on WASI — no C library access")

public actual fun lstat64(path: String?, buf: Stat64?): CInt =
    throw UnsupportedOperationException("lstat64 not available on WASI — no C library access")

public actual fun open64(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open64 not available on WASI — no C library access")

public actual fun stat64(path: String?, buf: Stat64?): CInt =
    throw UnsupportedOperationException("stat64 not available on WASI — no C library access")
