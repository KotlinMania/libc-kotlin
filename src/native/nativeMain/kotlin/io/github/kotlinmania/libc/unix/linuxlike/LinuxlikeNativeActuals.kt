@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeAcct
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeBind
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeBrk
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeClearenv
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeClockGetcpuclockid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeClockGetres
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeClockGettime
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeClockSettime
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeCreat64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeDirfd
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeDuplocale
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeExecvpe
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFdatasync
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFexecve
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeForkpty
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFreeifaddrs
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFreelocale
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFstat64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFstatat64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFstatfs
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFstatfs64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFstatvfs64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFtruncate64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeFutimens
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeGetdomainname
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeGetifaddrs
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeGetitimer
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeGetpwnamR
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeGetpwuidR
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeGetresgid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeGetresuid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeIfFreenameindex
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeIfNameindex
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeIoctl
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLibcCurrentSigrtmax
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLibcCurrentSigrtmin
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLoginTty
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLseek64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeLstat64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeMemalign
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeMemrchr
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeMincore
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeMknodat
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeMkostemp
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeMkostemps
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeMmap64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeNewlocale
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeOpen64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeOpenat64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeOpenpty
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikePipe2
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikePosixFadvise
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikePosixFadvise64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikePread64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikePreadv64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikePtsnameR
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikePwrite64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikePwritev64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeReaddir64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeReaddir64R
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeReadv
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeRecvmsg
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeSbrk
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeSemDestroy
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeSemInit
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeSendmsg
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeSetdomainname
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeSetgroups
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeSetitimer
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeSetresgid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeSetresuid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeStat64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeStatfs
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeStatfs64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeStatvfs64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeStatx
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeStrchrnul
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeStrftime
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeStrftimeL
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeStrptime
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeTruncate64
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeUname
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeUselocale
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeUtimensat
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeVfork
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeWait4
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeWaitid
import io.github.kotlinmania.libc.unix.linuxlike.cinterop.libcUnixLinuxlikeWritev
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.IdtypeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SiginfoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Stat64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statfs64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statvfs64
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.powerpc64.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    libcUnixLinuxlikeIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun libcCurrentSigrtmax(): CInt =
    libcUnixLinuxlikeLibcCurrentSigrtmax()

public actual fun libcCurrentSigrtmin(): CInt =
    libcUnixLinuxlikeLibcCurrentSigrtmin()

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcUnixLinuxlikeSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcUnixLinuxlikeSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun fdatasync(fd: CInt): CInt =
    libcUnixLinuxlikeFdatasync(fd)

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CUchar>): CInt =
    libcUnixLinuxlikeMincore(addr.rawAddress.toCPointer<ByteVar>(), len, vec.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixLinuxlikeClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixLinuxlikeClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcUnixLinuxlikeClockSettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    libcUnixLinuxlikeClockGetcpuclockid(pid, clkId.rawAddress.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    libcUnixLinuxlikeGetitimer(which, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    libcUnixLinuxlikeSetitimer(which, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    libcUnixLinuxlikeDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeMemalign(align, size)?.toLong() ?: 0L)

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    libcUnixLinuxlikeSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    libcUnixLinuxlikePipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    libcUnixLinuxlikeStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    libcUnixLinuxlikeFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libcUnixLinuxlikePosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcUnixLinuxlikeFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcUnixLinuxlikeUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixLinuxlikeDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixLinuxlikeFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(libcUnixLinuxlikeNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixLinuxlikeUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcUnixLinuxlikeMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixLinuxlikePtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun clearenv(): CInt =
    libcUnixLinuxlikeClearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    libcUnixLinuxlikeWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    libcUnixLinuxlikeGetresuid(ruid.rawAddress.toCPointer<ByteVar>(), euid.rawAddress.toCPointer<ByteVar>(), suid.rawAddress.toCPointer<ByteVar>())

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    libcUnixLinuxlikeGetresgid(rgid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>(), sgid.rawAddress.toCPointer<ByteVar>())

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeAcct(filename.rawAddress.toCPointer<ByteVar>())

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    libcUnixLinuxlikeBrk(addr.rawAddress.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeSbrk(increment)?.toLong() ?: 0L)

public actual fun vfork(): PidT =
    libcUnixLinuxlikeVfork()

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    libcUnixLinuxlikeSetresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    libcUnixLinuxlikeSetresuid(ruid, euid, suid)

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    libcUnixLinuxlikeWait4(pid, status.rawAddress.toCPointer<ByteVar>(), options, rusage.rawAddress.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    libcUnixLinuxlikeLoginTty(fd)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixLinuxlikeExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixLinuxlikeFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    libcUnixLinuxlikeGetifaddrs(ifap.rawAddress.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    libcUnixLinuxlikeFreeifaddrs(ifa.rawAddress.toCPointer<ByteVar>())
}

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    libcUnixLinuxlikeBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixLinuxlikeWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixLinuxlikeReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixLinuxlikeSendmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixLinuxlikeRecvmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcUnixLinuxlikeUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeStrchrnul(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    libcUnixLinuxlikeStrftime(s.rawAddress.toCPointer<ByteVar>(), max, format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())

public actual fun strftimeL(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>, locale: LocaleT): SizeT =
    libcUnixLinuxlikeStrftimeL(s.rawAddress.toCPointer<ByteVar>(), max, format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>(), locale.rawAddress.toCPointer<ByteVar>())

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeStrptime(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    libcUnixLinuxlikeMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    libcUnixLinuxlikeMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    libcUnixLinuxlikeGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcUnixLinuxlikeSetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(libcUnixLinuxlikeIfNameindex()?.toLong() ?: 0L)

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    libcUnixLinuxlikeIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixLinuxlikeGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixLinuxlikeGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    libcUnixLinuxlikeFstatfs64(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    libcUnixLinuxlikeStatvfs64(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    libcUnixLinuxlikeFstatvfs64(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    libcUnixLinuxlikeStatfs64(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixLinuxlikeCreat64(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    libcUnixLinuxlikeFstat64(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatat64(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    libcUnixLinuxlikeFstatat64(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    libcUnixLinuxlikeFtruncate64(fd, length)

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    libcUnixLinuxlikeLseek64(fd, offset, whence)

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    libcUnixLinuxlikeLstat64(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun mmap64(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeMmap64(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixLinuxlikeOpen64(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat64(fd: CInt, path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixLinuxlikeOpenat64(fd, path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    libcUnixLinuxlikePosixFadvise64(fd, offset, len, advise)

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    libcUnixLinuxlikePread64(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    libcUnixLinuxlikePwrite64(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun readdir64(dirp: MutPtr<DIR>): MutPtr<Dirent64> =
    MutPtr(libcUnixLinuxlikeReaddir64(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdir64R(dirp: MutPtr<DIR>, entry: MutPtr<Dirent64>, result: MutPtr<MutPtr<Dirent64>>): CInt =
    libcUnixLinuxlikeReaddir64R(dirp.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    libcUnixLinuxlikeStat64(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    libcUnixLinuxlikeTruncate64(path.rawAddress.toCPointer<ByteVar>(), length)

public actual fun preadv64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixLinuxlikePreadv64(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixLinuxlikePwritev64(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    libcUnixLinuxlikeForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    libcUnixLinuxlikeOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun statx(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, mask: CUint, statxbuf: MutPtr<Statx>): CInt =
    libcUnixLinuxlikeStatx(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags, mask, statxbuf.rawAddress.toCPointer<ByteVar>())
