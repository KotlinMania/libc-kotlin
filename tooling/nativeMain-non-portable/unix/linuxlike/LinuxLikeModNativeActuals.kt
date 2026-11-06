@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun libcCurrentSigrtmax(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_libc_current_sigrtmax()

public actual fun libcCurrentSigrtmin(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_libc_current_sigrtmin()

public actual fun semDestroy(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_fdatasync(fd)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: CUchar?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_clock_settime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_clock_getcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: SizeT, ptr: GidT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_posix_fadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_duplocale(base.toInt())

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_freelocale(loc.toInt())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_newlocale(mask, locale, base.toInt())

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_uselocale(loc.toInt())

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_mknodat(dirfd, pathname, mode, dev.toInt())

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_ptsname_r(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_waitid(idtype.toInt(), id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun acct(filename: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_acct(filename)

public actual fun brk(addr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun vfork(): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_vfork()

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_setresuid(ruid, euid, suid)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_login_tty(fd)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_strchrnul(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_strftime(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>())

public actual fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?, locale: LocaleT): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_strftime_l(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>(), locale.toInt())

public actual fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_setdomainname(name, len)

public actual fun ifNameindex(): IfNameindex? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_if_nameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_if_freenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_fstatfs64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_statvfs64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_fstatvfs64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_statfs64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun creat64(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_creat64(path, mode)

public actual fun fstat64(fildes: CInt, buf: Stat64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_fstat64(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: Stat64?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_fstatat64(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_ftruncate64(fd, length)

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_lseek64(fd, offset, whence)

public actual fun lstat64(path: String?, buf: Stat64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_lstat64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_mmap64(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_posix_fadvise64(fd, offset, len, advise)

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_pread64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_pwrite64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun readdir64(dirp: DIR?): Dirent64? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_readdir64(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_readdir64r(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun stat64(path: String?, buf: Stat64?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_stat64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun truncate64(path: String?, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_truncate64(path, length)

public actual fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_preadv64(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_pwritev64(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: Statx?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_linux_like_mod_statx(dirfd, pathname, flags, mask, statxbuf?.value?.toCPointer<ByteVar>())
