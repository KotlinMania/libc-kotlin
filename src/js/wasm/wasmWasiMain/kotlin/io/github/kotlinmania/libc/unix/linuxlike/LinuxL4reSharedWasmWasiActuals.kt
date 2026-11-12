@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedIopl")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedIopl(level: Int): Int

public actual fun iopl(level: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedIopl(level)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedIoperm")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedIoperm(from: Long, num: Long, turnOn: Int): Int

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedIoperm(from.toLong(), num.toLong(), turnOn)

public actual fun aioRead(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioRead")

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioWrite")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioFsync")

public actual fun aioError(aiocbp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioError")

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioReturn")

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioSuspend")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAioCancel")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedLioListio")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPwritev")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPreadv")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetnameinfo")

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetloadavg")

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr, liovcnt: CUlong, remoteIov: ConstPtr, riovcnt: CUlong, flags: CUlong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedProcessVmReadv")

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr, liovcnt: CUlong, remoteIov: ConstPtr, riovcnt: CUlong, flags: CUlong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedProcessVmWritev")

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFutimes")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedStrerrorR")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedAbs")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedAbs(i: Int): Int

public actual fun abs(i: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedAbs(i)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedLabs")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedLabs(i: Long): Long

public actual fun labs(i: CLong): CLong =
    wasiLibcUnixLinuxlikeLinuxL4reSharedLabs(i)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedRand")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedRand(): Int

public actual fun rand(): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedRand()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSrand")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSrand(seed: Int): Unit

public actual fun srand(seed: CUint): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSrand(seed.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedDrand48")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedDrand48(): Double

public actual fun drand48(): CDouble =
    wasiLibcUnixLinuxlikeLinuxL4reSharedDrand48()

public actual fun erand48(xseed: MutPtr): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedErand48")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedLrand48")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedLrand48(): Long

public actual fun lrand48(): CLong =
    wasiLibcUnixLinuxlikeLinuxL4reSharedLrand48()

public actual fun nrand48(xseed: MutPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedNrand48")

public actual fun jrand48(xseed: MutPtr): CLong =
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

public actual fun getpwent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetpwent")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSetgrent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSetgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSetgrent()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedEndgrent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedEndgrent(): Unit

public actual fun endgrent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedEndgrent()

public actual fun getgrent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrent")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSetspent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSetspent(): Unit

public actual fun setspent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSetspent()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedEndspent")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedEndspent(): Unit

public actual fun endspent(): Unit =
    wasiLibcUnixLinuxlikeLinuxL4reSharedEndspent()

public actual fun getspent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetspent")

public actual fun getspnam(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetspnam")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedShmget")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedShmget(key: Int, size: Long, shmflg: Int): Int

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedShmat")

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedShmdt")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedShmctl")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMprotect")

public actual fun errnoLocation(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedErrnoLocation")

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMremap")

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGlob")

public actual fun globfree(pglob: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGlobfree")

public actual fun seekdir(dirp: MutPtr, loc: CLong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSeekdir")

public actual fun telldir(dirp: MutPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTelldir")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMadvise")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMsync")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRecvfrom")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedNlLanginfo")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedNlLanginfoL")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(policy)

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSettimeofday")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemTimedwait")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemGetvalue")

public actual fun mount(src: ConstPtr, target: ConstPtr, fstype: ConstPtr, flags: CUlong, data: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMount")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPrctl")

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPpoll")

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSethostname")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(policy)

public actual fun sysinfo(info: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSysinfo")

public actual fun sigsuspend(mask: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSigsuspend")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrgidR")

public actual fun semClose(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemClose")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrnamR")

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedInitgroups")

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemOpen")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrnam")

public actual fun semUnlink(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSemUnlink")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedDaemon")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedDaemon(nochdir: Int, noclose: Int): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedDaemon(nochdir, noclose)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSigwait")

public actual fun getgrgid(gid: GidT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetgrgid")

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedPopen")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFaccessat")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr")

public actual fun setmntent(filename: ConstPtr, ty: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedSetmntent")

public actual fun getmntent(stream: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetmntent")

public actual fun addmntent(stream: MutPtr, mnt: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedAddmntent")

public actual fun endmntent(streamp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedEndmntent")

public actual fun hasmntopt(mnt: ConstPtr, opt: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedHasmntopt")

public actual fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRegcomp")

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRegexec")

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRegerror")

public actual fun regfree(preg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedRegfree")

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedIconvOpen")

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedIconv")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedIconvClose")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedGettid")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedGettid(): Int

public actual fun gettid(): PidT =
    wasiLibcUnixLinuxlikeLinuxL4reSharedGettid()

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerCreate")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerDelete")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerGettime")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedTimerSettime")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedMemmem")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxL4reSharedSchedGetcpu")
private external fun wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetcpu(): Int

public actual fun schedGetcpu(): CInt =
    wasiLibcUnixLinuxlikeLinuxL4reSharedSchedGetcpu()

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedGetoptLong")

public actual fun copyFileRange(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedCopyFileRange")

public actual fun freopen64(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFreopen64")

public actual fun fseeko64(stream: MutPtr, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFseeko64")

public actual fun fsetpos64(stream: MutPtr, ptr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFsetpos64")

public actual fun ftello64(stream: MutPtr): Off64T =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxL4reSharedFtello64")
