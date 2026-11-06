package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.COpaquePointer

public actual fun libcCurrentSigrtmax(): CInt =
    js("require('@kotlinmania/libc-native-bindings').libcCurrentSigrtmax()") as CInt

public actual fun libcCurrentSigrtmin(): CInt =
    js("require('@kotlinmania/libc-native-bindings').libcCurrentSigrtmin()") as CInt

public actual fun semDestroy(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun fdatasync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fdatasync(fd)") as CInt

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: CUchar?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mincore(addr?.value ?: 0L, len, vec?.toLong() ?: 0L)") as CInt

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGetcpuclockid(pid: PidT, clkId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)") as CInt

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getitimer(which, currValue?.toLong() ?: 0L)") as CInt

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setitimer(which, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: SizeT, ptr: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgroups(ngroups, ptr?.toLong() ?: 0L)") as CInt

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe2(fds?.toLong() ?: 0L, flags)") as CInt

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memrchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise(fd, offset, len, advise)") as CInt

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun duplocale(base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(base)") as LocaleT

public actual fun freelocale(loc: LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as LocaleT

public actual fun uselocale(loc: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').uselocale(loc)") as LocaleT

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(dirfd, pathname, mode, dev)") as CInt

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptsnameR(fd, buf?.value ?: 0L, buflen)") as CInt

public actual fun clearenv(): CInt =
    js("require('@kotlinmania/libc-native-bindings').clearenv()") as CInt

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)") as CInt

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)") as CInt

public actual fun acct(filename: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').acct(filename)") as CInt

public actual fun brk(addr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').brk(addr?.value ?: 0L)") as CInt

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sbrk(increment)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun vfork(): PidT =
    js("require('@kotlinmania/libc-native-bindings').vfork()") as PidT

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresgid(rgid, egid, sgid)") as CInt

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresuid(ruid, euid, suid)") as CInt

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    js("require('@kotlinmania/libc-native-bindings').wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)") as PidT

public actual fun loginTty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').loginTty(fd)") as CInt

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getifaddrs(ifap?.value ?: 0L)") as CInt

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    js("require('@kotlinmania/libc-native-bindings').freeifaddrs(ifa?.toLong() ?: 0L)")
}

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(socket, address?.toLong() ?: 0L, addressLen)") as CInt

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strchrnul(s, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(s?.value ?: 0L, max, format, tm?.toLong() ?: 0L)") as SizeT

public actual fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?, locale: LocaleT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftimeL(s?.value ?: 0L, max, format, tm?.toLong() ?: 0L, locale)") as SizeT

public actual fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strptime(s, format, tm?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemp(template?.value ?: 0L, flags)") as CInt

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemps(template?.value ?: 0L, suffixlen, flags)") as CInt

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdomainname(name?.value ?: 0L, len)") as CInt

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setdomainname(name, len)") as CInt

public actual fun ifNameindex(): IfNameindex? =
    js("require('@kotlinmania/libc-native-bindings').ifNameindex()") as IfNameindex?

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    js("require('@kotlinmania/libc-native-bindings').ifFreenameindex(ptr?.toLong() ?: 0L)")
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs64(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statvfs64(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatvfs64(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs64(path, buf?.toLong() ?: 0L)") as CInt

public actual fun creat64(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').creat64(path, mode)") as CInt

public actual fun fstat64(fildes: CInt, buf: Stat64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat64(fildes, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: Stat64?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatat64(dirfd, pathname, buf?.toLong() ?: 0L, flags)") as CInt

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').ftruncate64(fd, length)") as CInt

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    js("require('@kotlinmania/libc-native-bindings').lseek64(fd, offset, whence)") as Off64T

public actual fun lstat64(path: String?, buf: Stat64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lstat64(path, buf?.toLong() ?: 0L)") as CInt

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mmap64(addr?.value ?: 0L, len, prot, flags, fd, offset)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise64(fd, offset, len, advise)") as CInt

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pread64(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwrite64(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun readdir64(dirp: DIR?): Dirent64? =
    js("require('@kotlinmania/libc-native-bindings').readdir64(dirp?.toLong() ?: 0L)") as Dirent64?

public actual fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').readdir64R(dirp?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)") as CInt

public actual fun stat64(path: String?, buf: Stat64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat64(path, buf?.toLong() ?: 0L)") as CInt

public actual fun truncate64(path: String?, length: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').truncate64(path, length)") as CInt

public actual fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv64(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev64(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as PidT

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: Statx?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statx(dirfd, pathname, flags, mask, statxbuf?.toLong() ?: 0L)") as CInt
