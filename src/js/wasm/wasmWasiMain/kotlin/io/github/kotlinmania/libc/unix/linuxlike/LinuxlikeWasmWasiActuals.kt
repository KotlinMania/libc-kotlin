@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeIoctl")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLibcCurrentSigrtmax")
private external fun wasiLibcUnixLinuxlikeLibcCurrentSigrtmax(): Int

public actual fun libcCurrentSigrtmax(): CInt =
    wasiLibcUnixLinuxlikeLibcCurrentSigrtmax()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLibcCurrentSigrtmin")
private external fun wasiLibcUnixLinuxlikeLibcCurrentSigrtmin(): Int

public actual fun libcCurrentSigrtmin(): CInt =
    wasiLibcUnixLinuxlikeLibcCurrentSigrtmin()

public actual fun semDestroy(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSemDestroy")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSemInit")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeFdatasync")
private external fun wasiLibcUnixLinuxlikeFdatasync(fd: Int): Int

public actual fun fdatasync(fd: CInt): CInt =
    wasiLibcUnixLinuxlikeFdatasync(fd)

public actual fun mincore(addr: MutPtr, len: SizeT, vec: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMincore")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeClockGetres")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeClockGettime")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeClockSettime")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeClockGetcpuclockid")

public actual fun getitimer(which: CInt, currValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetitimer")

public actual fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSetitimer")

public actual fun dirfd(dirp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeDirfd")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMemalign")

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSetgroups")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePipe2")

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStatfs")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstatfs")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMemrchr")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikePosixFadvise")
private external fun wasiLibcUnixLinuxlikePosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    wasiLibcUnixLinuxlikePosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFutimens")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeUtimensat")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeDuplocale")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFreelocale")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeNewlocale")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeUselocale")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMknodat")

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePtsnameR")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeClearenv")
private external fun wasiLibcUnixLinuxlikeClearenv(): Int

public actual fun clearenv(): CInt =
    wasiLibcUnixLinuxlikeClearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeWaitid")

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetresuid")

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetresgid")

public actual fun acct(filename: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeAcct")

public actual fun brk(addr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeBrk")

public actual fun sbrk(increment: IntptrT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSbrk")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeVfork")
private external fun wasiLibcUnixLinuxlikeVfork(): Int

public actual fun vfork(): PidT =
    wasiLibcUnixLinuxlikeVfork()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeSetresgid")
private external fun wasiLibcUnixLinuxlikeSetresgid(rgid: Int, egid: Int, sgid: Int): Int

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    wasiLibcUnixLinuxlikeSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeSetresuid")
private external fun wasiLibcUnixLinuxlikeSetresuid(ruid: Int, euid: Int, suid: Int): Int

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    wasiLibcUnixLinuxlikeSetresuid(ruid.toInt(), euid.toInt(), suid.toInt())

public actual fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeWait4")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLoginTty")
private external fun wasiLibcUnixLinuxlikeLoginTty(fd: Int): Int

public actual fun loginTty(fd: CInt): CInt =
    wasiLibcUnixLinuxlikeLoginTty(fd)

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeExecvpe")

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFexecve")

public actual fun getifaddrs(ifap: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetifaddrs")

public actual fun freeifaddrs(ifa: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFreeifaddrs")

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeBind")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeWritev")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeReadv")

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSendmsg")

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeRecvmsg")

public actual fun uname(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeUname")

public actual fun strchrnul(s: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStrchrnul")

public actual fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStrftime")

public actual fun strftimeL(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr, locale: LocaleT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStrftimeL")

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStrptime")

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMkostemp")

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMkostemps")

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetdomainname")

public actual fun setdomainname(name: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeSetdomainname")

public actual fun ifNameindex(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeIfNameindex")

public actual fun ifFreenameindex(ptr: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeIfFreenameindex")

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetpwnamR")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeGetpwuidR")

public actual fun fstatfs64(fd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstatfs64")

public actual fun statvfs64(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStatvfs64")

public actual fun fstatvfs64(fd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstatvfs64")

public actual fun statfs64(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStatfs64")

public actual fun creat64(path: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeCreat64")

public actual fun fstat64(fildes: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstat64")

public actual fun fstatat64(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeFstatat64")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeFtruncate64")
private external fun wasiLibcUnixLinuxlikeFtruncate64(fd: Int, length: Long): Int

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    wasiLibcUnixLinuxlikeFtruncate64(fd, length)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLseek64")
private external fun wasiLibcUnixLinuxlikeLseek64(fd: Int, offset: Long, whence: Int): Long

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    wasiLibcUnixLinuxlikeLseek64(fd, offset, whence)

public actual fun lstat64(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLstat64")

public actual fun mmap64(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeMmap64")

public actual fun open64(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeOpen64")

public actual fun openat64(fd: CInt, path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeOpenat64")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikePosixFadvise64")
private external fun wasiLibcUnixLinuxlikePosixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    wasiLibcUnixLinuxlikePosixFadvise64(fd, offset, len, advise)

public actual fun pread64(fd: CInt, buf: MutPtr, count: SizeT, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePread64")

public actual fun pwrite64(fd: CInt, buf: ConstPtr, count: SizeT, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePwrite64")

public actual fun readdir64(dirp: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeReaddir64")

public actual fun readdir64R(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeReaddir64R")

public actual fun stat64(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStat64")

public actual fun truncate64(path: ConstPtr, length: Off64T): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeTruncate64")

public actual fun preadv64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePreadv64")

public actual fun pwritev64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikePwritev64")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeForkpty")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeOpenpty")

public actual fun statx(dirfd: CInt, pathname: ConstPtr, flags: CInt, mask: CUint, statxbuf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeStatx")
