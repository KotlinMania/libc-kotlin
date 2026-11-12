@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module libc.
public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeIoctl")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLibcCurrentSigrtmax")
private external fun wasiLibcUnixLinuxlikeLibcCurrentSigrtmax(): Int

public actual fun libcCurrentSigrtmax(): CInt =
    wasiLibcUnixLinuxlikeLibcCurrentSigrtmax().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLibcCurrentSigrtmin")
private external fun wasiLibcUnixLinuxlikeLibcCurrentSigrtmin(): Int

public actual fun libcCurrentSigrtmin(): CInt =
    wasiLibcUnixLinuxlikeLibcCurrentSigrtmin().toInt()

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSemDestroy")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSemInit")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeFdatasync")
private external fun wasiLibcUnixLinuxlikeFdatasync(fd: Int): Int

public actual fun fdatasync(fd: CInt): CInt =
    wasiLibcUnixLinuxlikeFdatasync(fd).toInt()

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CUchar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMincore")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeClockGetres")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeClockGettime")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeClockSettime")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeClockGetcpuclockid")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetitimer")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSetitimer")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeDirfd")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMemalign")

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSetgroups")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePipe2")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStatfs")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstatfs")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMemrchr")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikePosixFadvise")
private external fun wasiLibcUnixLinuxlikePosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    wasiLibcUnixLinuxlikePosixFadvise(fd, offset, len, advise).toInt()

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFutimens")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeUtimensat")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeDuplocale")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFreelocale")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeNewlocale")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeUselocale")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMknodat")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePtsnameR")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeClearenv")
private external fun wasiLibcUnixLinuxlikeClearenv(): Int

public actual fun clearenv(): CInt =
    wasiLibcUnixLinuxlikeClearenv().toInt()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeWaitid")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetresuid")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetresgid")

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAcct")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeBrk")

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSbrk")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeVfork")
private external fun wasiLibcUnixLinuxlikeVfork(): Int

public actual fun vfork(): PidT =
    wasiLibcUnixLinuxlikeVfork().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeSetresgid")
private external fun wasiLibcUnixLinuxlikeSetresgid(rgid: Int, egid: Int, sgid: Int): Int

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    wasiLibcUnixLinuxlikeSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeSetresuid")
private external fun wasiLibcUnixLinuxlikeSetresuid(ruid: Int, euid: Int, suid: Int): Int

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    wasiLibcUnixLinuxlikeSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()).toInt()

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeWait4")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLoginTty")
private external fun wasiLibcUnixLinuxlikeLoginTty(fd: Int): Int

public actual fun loginTty(fd: CInt): CInt =
    wasiLibcUnixLinuxlikeLoginTty(fd).toInt()

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeExecvpe")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFexecve")

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetifaddrs")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFreeifaddrs")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeBind")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeWritev")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeReadv")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSendmsg")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeRecvmsg")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeUname")

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStrchrnul")

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStrftime")

public actual fun strftimeL(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>, locale: LocaleT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStrftimeL")

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStrptime")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMkostemp")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMkostemps")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetdomainname")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSetdomainname")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeIfNameindex")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeIfFreenameindex")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetpwnamR")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetpwuidR")

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstatfs64")

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStatvfs64")

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstatvfs64")

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStatfs64")

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeCreat64")

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstat64")

public actual fun fstatat64(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstatat64")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeFtruncate64")
private external fun wasiLibcUnixLinuxlikeFtruncate64(fd: Int, length: Long): Int

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    wasiLibcUnixLinuxlikeFtruncate64(fd, length).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLseek64")
private external fun wasiLibcUnixLinuxlikeLseek64(fd: Int, offset: Long, whence: Int): Long

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    wasiLibcUnixLinuxlikeLseek64(fd, offset, whence).toLong()

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLstat64")

public actual fun mmap64(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMmap64")

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeOpen64")

public actual fun openat64(fd: CInt, path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeOpenat64")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikePosixFadvise64")
private external fun wasiLibcUnixLinuxlikePosixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    wasiLibcUnixLinuxlikePosixFadvise64(fd, offset, len, advise).toInt()

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePread64")

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePwrite64")

public actual fun readdir64(dirp: MutPtr<DIR>): MutPtr<Dirent64> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeReaddir64")

public actual fun readdir64R(dirp: MutPtr<DIR>, entry: MutPtr<Dirent64>, result: MutPtr<MutPtr<Dirent64>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeReaddir64R")

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStat64")

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeTruncate64")

public actual fun preadv64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePreadv64")

public actual fun pwritev64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePwritev64")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeForkpty")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeOpenpty")

public actual fun statx(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, mask: CUint, statxbuf: MutPtr<Statx>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStatx")
