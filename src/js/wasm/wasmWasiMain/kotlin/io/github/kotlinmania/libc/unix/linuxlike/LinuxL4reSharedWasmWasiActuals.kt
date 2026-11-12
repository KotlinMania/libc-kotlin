@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Aiocb
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.RegexT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Sysinfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.ShmidDs
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedIopl")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedIopl(level: Int): Int

public actual fun iopl(level: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedIopl(level).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedIoperm")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedIoperm(from: Long, num: Long, turnOn: Int): Int

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedIoperm(from.toLong(), num.toLong(), turnOn).toInt()

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioRead")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioWrite")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioFsync")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioError")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioReturn")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioSuspend")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioCancel")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedLioListio")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPwritev")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPreadv")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetnameinfo")

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetloadavg")

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr<Iovec>, liovcnt: CUlong, remoteIov: ConstPtr<Iovec>, riovcnt: CUlong, flags: CUlong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedProcessVmReadv")

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr<Iovec>, liovcnt: CUlong, remoteIov: ConstPtr<Iovec>, riovcnt: CUlong, flags: CUlong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedProcessVmWritev")

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFutimes")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedStrerrorR")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedAbs")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedAbs(i: Int): Int

public actual fun abs(i: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedAbs(i).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedLabs")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedLabs(i: Long): Long

public actual fun labs(i: CLong): CLong =
    wasiLibcUnixLinuxlikeLinuxL4reSharedLabs(i).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedRand")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedRand(): Int

public actual fun rand(): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedRand().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSrand")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSrand(seed: Int): Unit

public actual fun srand(seed: CUint): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSrand(seed.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedDrand48")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedDrand48(): Double

public actual fun drand48(): CDouble =
    wasiLibcUnixLinuxlikeLinuxL4reSharedDrand48().toDouble()

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedErand48")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedLrand48")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedLrand48(): Long

public actual fun lrand48(): CLong =
    wasiLibcUnixLinuxlikeLinuxL4reSharedLrand48().toLong()

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedNrand48")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedJrand48")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSrand48")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSrand48(seed: Long): Unit

public actual fun srand48(seed: CLong): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSrand48(seed)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSetpwent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSetpwent(): Unit

public actual fun setpwent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSetpwent()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedEndpwent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedEndpwent(): Unit

public actual fun endpwent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedEndpwent()

public actual fun getpwent(): MutPtr<Passwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetpwent")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSetgrent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSetgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSetgrent()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedEndgrent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedEndgrent(): Unit

public actual fun endgrent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedEndgrent()

public actual fun getgrent(): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrent")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSetspent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSetspent(): Unit

public actual fun setspent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSetspent()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedEndspent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedEndspent(): Unit

public actual fun endspent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedEndspent()

public actual fun getspent(): MutPtr<Spwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetspent")

public actual fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetspnam")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedShmget")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedShmget(key: Int, size: Long, shmflg: Int): Int

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedShmget(key, size.toLong(), shmflg).toInt()

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedShmat")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedShmdt")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedShmctl")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMprotect")

public actual fun errnoLocation(): MutPtr<CInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedErrnoLocation")

public actual fun mremap(addr: MutPtr<CVoid>, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMremap")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGlob")

public actual fun globfree(pglob: MutPtr<GlobT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGlobfree")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSeekdir")

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTelldir")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMadvise")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMsync")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRecvfrom")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedNlLanginfo")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedNlLanginfoL")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(policy).toInt()

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSettimeofday")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemTimedwait")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemGetvalue")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMount")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPrctl")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPpoll")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSethostname")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(policy).toInt()

public actual fun sysinfo(info: MutPtr<Sysinfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSysinfo")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSigsuspend")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrgidR")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemClose")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrnamR")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedInitgroups")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemOpen")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrnam")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemUnlink")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedDaemon")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedDaemon(nochdir: Int, noclose: Int): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedDaemon(nochdir, noclose).toInt()

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSigwait")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrgid")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPopen")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFaccessat")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr")

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSetmntent")

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetmntent")

public actual fun addmntent(stream: MutPtr<FILE>, mnt: ConstPtr<Mntent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAddmntent")

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedEndmntent")

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedHasmntopt")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRegcomp")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRegexec")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRegerror")

public actual fun regfree(preg: MutPtr<RegexT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRegfree")

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedIconvOpen")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedIconv")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedIconvClose")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedGettid")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedGettid(): Int

public actual fun gettid(): PidT =
    wasiLibcUnixLinuxlikeLinuxL4reSharedGettid().toInt()

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerCreate")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerDelete")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerGettime")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerSettime")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMemmem")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSchedGetcpu")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetcpu(): Int

public actual fun schedGetcpu(): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetcpu().toInt()

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetoptLong")

public actual fun copyFileRange(fdIn: CInt, offIn: MutPtr<Off64T>, fdOut: CInt, offOut: MutPtr<Off64T>, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedCopyFileRange")

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFreopen64")

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFseeko64")

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFsetpos64")

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFtello64")
