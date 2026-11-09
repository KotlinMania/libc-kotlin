@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.DIR
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

private object UnixLinuxlikeJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_libcCurrentSigrtmax(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_libcCurrentSigrtmin(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_mincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_clockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_clockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_clockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_getitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_setitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_setgroups(ngroups: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_pipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_statfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_fstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_memrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_ptsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_clearenv(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_waitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_getresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_getresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_acct(filename: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_brk(addr: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_sbrk(increment: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_vfork(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_setresgid(rgid: Short, egid: Short, sgid: Short): Int

    @JvmStatic
    external fun libc_unix_linuxlike_setresuid(ruid: Short, euid: Short, suid: Short): Int

    @JvmStatic
    external fun libc_unix_linuxlike_wait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_loginTty(fd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_execvpe(file: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_fexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_getifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_freeifaddrs(ifa: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_bind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_sendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_recvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_strchrnul(s: String?, c: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_strftime(s: Long, max: Long, format: String?, tm: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_strftimeL(s: Long, max: Long, format: String?, tm: Long, locale: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_strptime(s: String?, format: String?, tm: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_mkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_mkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_getdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_setdomainname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_ifNameindex(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_ifFreenameindex(ptr: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_getpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_fstatfs64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_statvfs64(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_fstatvfs64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_statfs64(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_creat64(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_fstat64(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_fstatat64(dirfd: Int, pathname: String?, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_ftruncate64(fd: Int, length: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_lseek64(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_lstat64(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_mmap64(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_pread64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_pwrite64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_readdir64(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_readdir64R(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_stat64(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_truncate64(path: String?, length: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_preadv64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_pwritev64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_statx(dirfd: Int, pathname: String?, flags: Int, mask: Int, statxbuf: Long): Int
}

public actual fun ioctl(fd: CInt, request: Ioctl): CInt =
    0

public actual fun libcCurrentSigrtmax(): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_libcCurrentSigrtmax()

public actual fun libcCurrentSigrtmin(): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_libcCurrentSigrtmin()

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_semDestroy((sem?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun fdatasync(fd: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_fdatasync(fd)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_mincore((addr?.value ?: 0L), len.toLong(), (vec?.value ?: 0L))

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_clockGetres(clkId, (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_clockSettime(clkId, (tp?.value ?: 0L))

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_clockGetcpuclockid(pid, (clkId?.value ?: 0L))

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_getitimer(which, (currValue?.value ?: 0L))

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_setitimer(which, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun dirfd(dirp: DIR?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_dirfd((dirp?.handle ?: 0L))

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_setgroups(ngroups.toLong(), (ptr?.value ?: 0L))

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_pipe2((fds?.value ?: 0L), flags)

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_statfs(path, (buf?.value ?: 0L))

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_fstatfs(fd, (buf?.value ?: 0L))

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_memrchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_futimens(fd, (times?.value ?: 0L))

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_duplocale(base.toLong()).toULong()()

public actual fun freelocale(loc: LocaleT) {
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_freelocale(loc.toLong())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_newlocale(mask, locale, base.toLong()).toULong()()

public actual fun uselocale(loc: LocaleT): LocaleT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_uselocale(loc.toLong()).toULong()()

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_mknodat(dirfd, pathname, mode.toInt(), dev.toLong())

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_ptsnameR(fd, (buf?.value ?: 0L), buflen.toLong())

public actual fun clearenv(): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L), options)

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_getresuid((ruid?.value ?: 0L), (euid?.value ?: 0L), (suid?.value ?: 0L))

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_getresgid((rgid?.value ?: 0L), (egid?.value ?: 0L), (sgid?.value ?: 0L))

public actual fun acct(filename: String?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_acct(filename)

public actual fun brk(addr: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_brk((addr?.value ?: 0L))

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun vfork(): PidT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_vfork()

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_setresgid(rgid.toShort(), egid.toShort(), sgid.toShort())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_setresuid(ruid.toShort(), euid.toShort(), suid.toShort())

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_wait4(pid, (status?.value ?: 0L), options, (rusage?.value ?: 0L))

public actual fun loginTty(fd: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_loginTty(fd)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_execvpe(file, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_fexecve(fd, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_getifaddrs((ifap?.value ?: 0L))

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_freeifaddrs((ifa?.value ?: 0L))
}

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_bind(socket, (address?.value ?: 0L), addressLen.toInt())

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_sendmsg(fd, (msg?.value ?: 0L), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_recvmsg(fd, (msg?.value ?: 0L), flags)

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_uname((buf?.value ?: 0L))

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_strchrnul(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_strftime((s?.value ?: 0L), max.toLong(), format, (tm?.value ?: 0L)).toULong()

public actual fun strftimeL(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?, locale: LocaleT): SizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_strftimeL((s?.value ?: 0L), max.toLong(), format, (tm?.value ?: 0L), locale.toLong()).toULong()

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_strptime(s, format, (tm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_mkostemp((template?.value ?: 0L), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_mkostemps((template?.value ?: 0L), suffixlen, flags)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_getdomainname((name?.value ?: 0L), len.toLong())

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_setdomainname(name, len.toLong())

public actual fun ifNameindex(): COpaquePointer? =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_ifNameindex().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_ifFreenameindex((ptr?.value ?: 0L))
}

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_getpwuidR(uid.toShort(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_fstatfs64(fd, (buf?.value ?: 0L))

public actual fun statvfs64(path: String?, buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_statvfs64(path, (buf?.value ?: 0L))

public actual fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_fstatvfs64(fd, (buf?.value ?: 0L))

public actual fun statfs64(path: String?, buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_statfs64(path, (buf?.value ?: 0L))

public actual fun creat64(path: String?, mode: ModeT): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_creat64(path, mode.toInt())

public actual fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_fstat64(fildes, (buf?.value ?: 0L))

public actual fun fstatat64(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_fstatat64(dirfd, pathname, (buf?.value ?: 0L), flags)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_ftruncate64(fd, length)

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_lseek64(fd, offset, whence)

public actual fun lstat64(path: String?, buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_lstat64(path, (buf?.value ?: 0L))

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_mmap64((addr?.value ?: 0L), len.toLong(), prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun open64(path: String?, oflag: CInt): CInt =
    0

public actual fun openat64(fd: CInt, path: String?, oflag: CInt): CInt =
    0

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_posixFadvise64(fd, offset, len, advise)

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_pread64(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_pwrite64(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun readdir64(dirp: DIR?): COpaquePointer? =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_readdir64((dirp?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_readdir64R((dirp?.handle ?: 0L), (entry?.value ?: 0L), (result?.value ?: 0L))

public actual fun stat64(path: String?, buf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_stat64(path, (buf?.value ?: 0L))

public actual fun truncate64(path: String?, length: Off64T): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_truncate64(path, length)

public actual fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_preadv64(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_pwritev64(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt =
    UnixLinuxlikeJniBridge.libc_unix_linuxlike_statx(dirfd, pathname, flags, mask.toInt(), (statxbuf?.value ?: 0L))
