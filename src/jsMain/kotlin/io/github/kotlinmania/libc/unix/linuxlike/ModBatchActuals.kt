// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires N-API addon")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires N-API addon")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires N-API addon")
}

public actual fun sIGRTMAX(): CInt =
    throw UnsupportedOperationException("sIGRTMAX requires N-API addon")

public actual fun sIGRTMIN(): CInt =
    throw UnsupportedOperationException("sIGRTMIN requires N-API addon")

public actual fun ioctl(fd: CInt, request: Ioctl, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun libcCurrentSigrtmax(): CInt =
    throw UnsupportedOperationException("libcCurrentSigrtmax requires N-API addon")

public actual fun libcCurrentSigrtmin(): CInt =
    throw UnsupportedOperationException("libcCurrentSigrtmin requires N-API addon")

public actual fun semDestroy(sem: SemT): CInt =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semInit(sem: SemT, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mincore requires N-API addon")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires N-API addon")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer requires N-API addon")

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer requires N-API addon")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun setgroups(ngroups: ULong, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires N-API addon")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires N-API addon")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR requires N-API addon")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires N-API addon")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid requires N-API addon")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid requires N-API addon")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct requires N-API addon")

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("brk requires N-API addon")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires N-API addon")

public actual fun vfork(): PidT =
    throw UnsupportedOperationException("vfork requires N-API addon")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid requires N-API addon")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid requires N-API addon")

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 requires N-API addon")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve requires N-API addon")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs requires N-API addon")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs requires N-API addon")
}

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun strchrnul(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchrnul requires N-API addon")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun strftimeL(s: String?, max: ULong, format: String?, tm: Tm?, locale: LocaleT): ULong =
    throw UnsupportedOperationException("strftimeL requires N-API addon")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires N-API addon")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

public actual fun getdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun setdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex requires N-API addon")
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("fstatfs64 requires N-API addon")

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("statvfs64 requires N-API addon")

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("fstatvfs64 requires N-API addon")

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("statfs64 requires N-API addon")

public actual fun creat64(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat64 requires N-API addon")


public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: Stat64?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat64 requires N-API addon")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    throw UnsupportedOperationException("ftruncate64 requires N-API addon")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    throw UnsupportedOperationException("lseek64 requires N-API addon")


public actual fun mmap64(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    throw UnsupportedOperationException("mmap64 requires N-API addon")


public actual fun openat64(fd: CInt, path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat64 requires N-API addon")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise64 requires N-API addon")

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pread64 requires N-API addon")

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwrite64 requires N-API addon")

public actual fun readdir64(dirp: DIR?): Dirent64? =
    throw UnsupportedOperationException("readdir64 requires N-API addon")

public actual fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdir64R requires N-API addon")


public actual fun truncate64(path: String?, length: Off64T): CInt =
    throw UnsupportedOperationException("truncate64 requires N-API addon")

public actual fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("preadv64 requires N-API addon")

public actual fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwritev64 requires N-API addon")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUInt, statxbuf: Statx?): CInt =
    throw UnsupportedOperationException("statx requires N-API addon")
}

