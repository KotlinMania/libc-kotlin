package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.COpaquePointer

internal object LinuxLikeModRawLibc {
    external fun libcCurrentSigrtmax(): Int
    external fun libcCurrentSigrtmin(): Int
    external fun semDestroy(sem: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun fdatasync(fd: Int): Int
    external fun mincore(addr: Long, len: Long, vec: Long): Int
    external fun clockGetres(clkId: Long, tp: Long): Int
    external fun clockGettime(clkId: Long, tp: Long): Int
    external fun clockSettime(clkId: Long, tp: Long): Int
    external fun clockGetcpuclockid(pid: Int, clkId: Long): Int
    external fun getitimer(which: Int, currValue: Long): Int
    external fun setitimer(which: Int, newValue: Long, oldValue: Long): Int
    external fun dirfd(dirp: Long): Int
    external fun memalign(align: Long, size: Long): Long?
    external fun setgroups(ngroups: Long, ptr: Long): Int
    external fun pipe2(fds: Long, flags: Int): Int
    external fun statfs(path: String?, buf: Long): Int
    external fun fstatfs(fd: Int, buf: Long): Int
    external fun memrchr(cx: Long, c: Int, n: Long): Long?
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun duplocale(base: Long): Long
    external fun freelocale(loc: Long)
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun uselocale(loc: Long): Long
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun ptsnameR(fd: Int, buf: Long, buflen: Long): Int
    external fun clearenv(): Int
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun getresuid(ruid: Long, euid: Long, suid: Long): Int
    external fun getresgid(rgid: Long, egid: Long, sgid: Long): Int
    external fun acct(filename: String?): Int
    external fun brk(addr: Long): Int
    external fun sbrk(increment: Long): Long?
    external fun vfork(): Int
    external fun setresgid(rgid: Int, egid: Int, sgid: Int): Int
    external fun setresuid(ruid: Int, euid: Int, suid: Int): Int
    external fun wait4(pid: Int, status: Long, options: Int, rusage: Long): Int
    external fun loginTty(fd: Int): Int
    external fun execvpe(file: String?, argv: Long, envp: Long): Int
    external fun fexecve(fd: Int, argv: Long, envp: Long): Int
    external fun getifaddrs(ifap: Long): Int
    external fun freeifaddrs(ifa: Long)
    external fun bind(socket: Int, address: Long, addressLen: Int): Int
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun sendmsg(fd: Int, msg: Long, flags: Int): Long
    external fun recvmsg(fd: Int, msg: Long, flags: Int): Long
    external fun uname(buf: Long): Int
    external fun strchrnul(s: String?, c: Int): Long?
    external fun strftime(s: Long, max: Long, format: String?, tm: Long): Long
    external fun strftimeL(s: Long, max: Long, format: String?, tm: Long, locale: Long): Long
    external fun strptime(s: String?, format: String?, tm: Long): Long?
    external fun mkostemp(template: Long, flags: Int): Int
    external fun mkostemps(template: Long, suffixlen: Int, flags: Int): Int
    external fun getdomainname(name: Long, len: Long): Int
    external fun setdomainname(name: String?, len: Long): Int
    external fun ifNameindex(): Long?
    external fun ifFreenameindex(ptr: Long)
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun fstatfs64(fd: Int, buf: Long): Int
    external fun statvfs64(path: String?, buf: Long): Int
    external fun fstatvfs64(fd: Int, buf: Long): Int
    external fun statfs64(path: String?, buf: Long): Int
    external fun creat64(path: String?, mode: Int): Int
    external fun fstat64(fildes: Int, buf: Long): Int
    external fun fstatat64(dirfd: Int, pathname: String?, buf: Long, flags: Int): Int
    external fun ftruncate64(fd: Int, length: Long): Int
    external fun lseek64(fd: Int, offset: Long, whence: Int): Long
    external fun lstat64(path: String?, buf: Long): Int
    external fun mmap64(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long?
    external fun posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun pread64(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun pwrite64(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun readdir64(dirp: Long): Long?
    external fun readdir64R(dirp: Long, entry: Long, result: Long): Int
    external fun stat64(path: String?, buf: Long): Int
    external fun truncate64(path: String?, length: Long): Int
    external fun preadv64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun pwritev64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun statx(dirfd: Int, pathname: String?, flags: Int, mask: Int, statxbuf: Long): Int
}

public actual fun libcCurrentSigrtmax(): CInt =
    LinuxLikeModRawLibc.libcCurrentSigrtmax()

public actual fun libcCurrentSigrtmin(): CInt =
    LinuxLikeModRawLibc.libcCurrentSigrtmin()

public actual fun semDestroy(sem: SemT?): CInt =
    LinuxLikeModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    LinuxLikeModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun fdatasync(fd: CInt): CInt =
    LinuxLikeModRawLibc.fdatasync(fd)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: CUchar?): CInt =
    LinuxLikeModRawLibc.mincore(addr?.value ?: 0L, len, vec?.toLong() ?: 0L)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    LinuxLikeModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    LinuxLikeModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    LinuxLikeModRawLibc.clockSettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockGetcpuclockid(pid: PidT, clkId: CInt?): CInt =
    LinuxLikeModRawLibc.clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    LinuxLikeModRawLibc.getitimer(which, currValue?.toLong() ?: 0L)

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    LinuxLikeModRawLibc.setitimer(which, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun dirfd(dirp: DIR?): CInt =
    LinuxLikeModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    LinuxLikeModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: SizeT, ptr: GidT?): CInt =
    LinuxLikeModRawLibc.setgroups(ngroups, ptr?.toLong() ?: 0L)

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    LinuxLikeModRawLibc.pipe2(fds?.toLong() ?: 0L, flags)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    LinuxLikeModRawLibc.statfs(path, buf?.toLong() ?: 0L)

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    LinuxLikeModRawLibc.fstatfs(fd, buf?.toLong() ?: 0L)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    LinuxLikeModRawLibc.memrchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    LinuxLikeModRawLibc.posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    LinuxLikeModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    LinuxLikeModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    LinuxLikeModRawLibc.duplocale(base)

public actual fun freelocale(loc: LocaleT) {
    LinuxLikeModRawLibc.freelocale(loc)
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    LinuxLikeModRawLibc.newlocale(mask, locale, base)

public actual fun uselocale(loc: LocaleT): LocaleT =
    LinuxLikeModRawLibc.uselocale(loc)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    LinuxLikeModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    LinuxLikeModRawLibc.ptsnameR(fd, buf?.value ?: 0L, buflen)

public actual fun clearenv(): CInt =
    LinuxLikeModRawLibc.clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    LinuxLikeModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    LinuxLikeModRawLibc.getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    LinuxLikeModRawLibc.getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)

public actual fun acct(filename: String?): CInt =
    LinuxLikeModRawLibc.acct(filename)

public actual fun brk(addr: COpaquePointer?): CInt =
    LinuxLikeModRawLibc.brk(addr?.value ?: 0L)

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    LinuxLikeModRawLibc.sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun vfork(): PidT =
    LinuxLikeModRawLibc.vfork()

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    LinuxLikeModRawLibc.setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    LinuxLikeModRawLibc.setresuid(ruid, euid, suid)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    LinuxLikeModRawLibc.wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)

public actual fun loginTty(fd: CInt): CInt =
    LinuxLikeModRawLibc.loginTty(fd)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    LinuxLikeModRawLibc.execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    LinuxLikeModRawLibc.fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    LinuxLikeModRawLibc.getifaddrs(ifap?.value ?: 0L)

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    LinuxLikeModRawLibc.freeifaddrs(ifa?.toLong() ?: 0L)
}

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: SocklenT): CInt =
    LinuxLikeModRawLibc.bind(socket, address?.toLong() ?: 0L, addressLen)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    LinuxLikeModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    LinuxLikeModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    LinuxLikeModRawLibc.sendmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    LinuxLikeModRawLibc.recvmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    LinuxLikeModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    LinuxLikeModRawLibc.strchrnul(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT =
    LinuxLikeModRawLibc.strftime(s?.value ?: 0L, max, format, tm?.toLong() ?: 0L)

public actual fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?, locale: LocaleT): SizeT =
    LinuxLikeModRawLibc.strftimeL(s?.value ?: 0L, max, format, tm?.toLong() ?: 0L, locale)

public actual fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    LinuxLikeModRawLibc.strptime(s, format, tm?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    LinuxLikeModRawLibc.mkostemp(template?.value ?: 0L, flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    LinuxLikeModRawLibc.mkostemps(template?.value ?: 0L, suffixlen, flags)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    LinuxLikeModRawLibc.getdomainname(name?.value ?: 0L, len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    LinuxLikeModRawLibc.setdomainname(name, len)

public actual fun ifNameindex(): IfNameindex? =
    LinuxLikeModRawLibc.ifNameindex()

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    LinuxLikeModRawLibc.ifFreenameindex(ptr?.toLong() ?: 0L)
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    LinuxLikeModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    LinuxLikeModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    LinuxLikeModRawLibc.fstatfs64(fd, buf?.toLong() ?: 0L)

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    LinuxLikeModRawLibc.statvfs64(path, buf?.toLong() ?: 0L)

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    LinuxLikeModRawLibc.fstatvfs64(fd, buf?.toLong() ?: 0L)

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    LinuxLikeModRawLibc.statfs64(path, buf?.toLong() ?: 0L)

public actual fun creat64(path: String?, mode: ModeT): CInt =
    LinuxLikeModRawLibc.creat64(path, mode)

public actual fun fstat64(fildes: CInt, buf: Stat64?): CInt =
    LinuxLikeModRawLibc.fstat64(fildes, buf?.toLong() ?: 0L)

public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: Stat64?, flags: CInt): CInt =
    LinuxLikeModRawLibc.fstatat64(dirfd, pathname, buf?.toLong() ?: 0L, flags)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    LinuxLikeModRawLibc.ftruncate64(fd, length)

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    LinuxLikeModRawLibc.lseek64(fd, offset, whence)

public actual fun lstat64(path: String?, buf: Stat64?): CInt =
    LinuxLikeModRawLibc.lstat64(path, buf?.toLong() ?: 0L)

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    LinuxLikeModRawLibc.mmap64(addr?.value ?: 0L, len, prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    LinuxLikeModRawLibc.posixFadvise64(fd, offset, len, advise)

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    LinuxLikeModRawLibc.pread64(fd, buf?.value ?: 0L, count, offset)

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    LinuxLikeModRawLibc.pwrite64(fd, buf?.value ?: 0L, count, offset)

public actual fun readdir64(dirp: DIR?): Dirent64? =
    LinuxLikeModRawLibc.readdir64(dirp?.toLong() ?: 0L)

public actual fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt =
    LinuxLikeModRawLibc.readdir64R(dirp?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)

public actual fun stat64(path: String?, buf: Stat64?): CInt =
    LinuxLikeModRawLibc.stat64(path, buf?.toLong() ?: 0L)

public actual fun truncate64(path: String?, length: Off64T): CInt =
    LinuxLikeModRawLibc.truncate64(path, length)

public actual fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    LinuxLikeModRawLibc.preadv64(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    LinuxLikeModRawLibc.pwritev64(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    LinuxLikeModRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    LinuxLikeModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: Statx?): CInt =
    LinuxLikeModRawLibc.statx(dirfd, pathname, flags, mask, statxbuf?.toLong() ?: 0L)
