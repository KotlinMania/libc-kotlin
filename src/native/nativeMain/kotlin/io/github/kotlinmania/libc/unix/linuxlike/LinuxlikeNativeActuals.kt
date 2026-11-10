@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.IdtypeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun libcCurrentSigrtmax(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_libcCurrentSigrtmax()

public actual fun libcCurrentSigrtmin(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_libcCurrentSigrtmin()

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_fdatasync(fd)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_clockSettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_clockGetcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_mknodat(dirfd, pathname, mode, dev)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_ptsnameR(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun acct(filename: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_acct(filename)

public actual fun brk(addr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun vfork(): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_vfork()

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_setresuid(ruid, euid, suid)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_loginTty(fd)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun uname(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_strchrnul(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_strftime(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>())

public actual fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?, locale: LocaleT): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_strftimeL(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>())

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_setdomainname(name, len)

public actual fun ifNameindex(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_ifNameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_ifFreenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_fstatfs64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun statvfs64(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_statvfs64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_fstatvfs64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun statfs64(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_statfs64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun creat64(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_creat64(path, mode)

public actual fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_fstat64(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_fstatat64(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_ftruncate64(fd, length)

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_lseek64(fd, offset, whence)

public actual fun lstat64(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_lstat64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_mmap64(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_open64(path, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat64(fd: CInt, path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_openat64(fd, path, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_posixFadvise64(fd, offset, len, advise)

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_pread64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_pwrite64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun readdir64(dirp: DIR?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_readdir64(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_readdir64R(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun stat64(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_stat64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun truncate64(path: String?, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_truncate64(path, length)

public actual fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_preadv64(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_pwritev64(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.cinterop.libc_unix_linuxlike_statx(dirfd, pathname, flags, mask, statxbuf?.value?.toCPointer<ByteVar>())
