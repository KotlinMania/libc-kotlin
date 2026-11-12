@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd

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
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.GlobT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.NlItem
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadAttrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SigsetT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Tm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.SemT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.StackT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetrlimit")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSetrlimit")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdStrerrorR")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAbs")
private external fun wasiLibcUnixBsdAbs(i: Int): Int

public actual fun abs(i: CInt): CInt =
    wasiLibcUnixBsdAbs(i).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdLabs")
private external fun wasiLibcUnixBsdLabs(i: Long): Long

public actual fun labs(i: CLong): CLong =
    wasiLibcUnixBsdLabs(i).toLong()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdRand")
private external fun wasiLibcUnixBsdRand(): Int

public actual fun rand(): CInt =
    wasiLibcUnixBsdRand().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdSrand")
private external fun wasiLibcUnixBsdSrand(seed: Int): Unit

public actual fun srand(seed: CUint): Unit =
    wasiLibcUnixBsdSrand(seed.toInt())

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetifaddrs")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreeifaddrs")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSetgroups")

public actual fun setlogin(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSetlogin")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdIoctl")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdKqueue")
private external fun wasiLibcUnixBsdKqueue(): Int

public actual fun kqueue(): CInt =
    wasiLibcUnixBsdKqueue().toInt()

public actual fun unmount(target: ConstPtr<CChar>, arg: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdUnmount")

public actual fun syscall(num: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSyscall")

public actual fun getpwent(): MutPtr<Passwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetpwent")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdSetpwent")
private external fun wasiLibcUnixBsdSetpwent(): Unit

public actual fun setpwent(): Unit =
    wasiLibcUnixBsdSetpwent()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdEndpwent")
private external fun wasiLibcUnixBsdEndpwent(): Unit

public actual fun endpwent(): Unit =
    wasiLibcUnixBsdEndpwent()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdEndgrent")
private external fun wasiLibcUnixBsdEndgrent(): Unit

public actual fun endgrent(): Unit =
    wasiLibcUnixBsdEndgrent()

public actual fun getgrent(): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetgrent")

public actual fun getprogname(): ConstPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetprogname")

public actual fun setprogname(name: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSetprogname")

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetloadavg")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdIfNameindex")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdIfFreenameindex")

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetpeereid")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGlob")

public actual fun globfree(pglob: MutPtr<GlobT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGlobfree")

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdPosixMadvise")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdShmUnlink")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSeekdir")

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdTelldir")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdMadvise")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdMsync")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdRecvfrom")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdMkstemps")

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFutimes")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNlLanginfo")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdBind")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdWritev")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdReadv")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSendmsg")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdRecvmsg")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdSync")
private external fun wasiLibcUnixBsdSync(): Unit

public actual fun sync(): Unit =
    wasiLibcUnixBsdSync()

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetgrgidR")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSigaltstack")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSigsuspend")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSemClose")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdGetdtablesize")
private external fun wasiLibcUnixBsdGetdtablesize(): Int

public actual fun getdtablesize(): CInt =
    wasiLibcUnixBsdGetdtablesize().toInt()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetgrnamR")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdPthreadSigmask")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSemOpen")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetgrnam")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdPthreadCancel")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdPthreadKill")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdSchedGetPriorityMin")
private external fun wasiLibcUnixBsdSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcUnixBsdSchedGetPriorityMin(policy).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdSchedGetPriorityMax")
private external fun wasiLibcUnixBsdSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcUnixBsdSchedGetPriorityMax(policy).toInt()

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSemUnlink")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetpwnamR")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetpwuidR")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSigwait")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdPthreadAtfork")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetgrgid")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdPopen")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFaccessat")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdPthreadCreate")

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAcct")

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdWait4")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetitimer")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSetitimer")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdRegcomp")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdRegexec")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdRegerror")

public actual fun regfree(preg: MutPtr<RegexT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdRegfree")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdArc4random")
private external fun wasiLibcUnixBsdArc4random(): Int

public actual fun arc4random(): UInt =
    wasiLibcUnixBsdArc4random().toUInt()

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, size: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdArc4randomBuf")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdArc4randomUniform")
private external fun wasiLibcUnixBsdArc4randomUniform(l: Int): Int

public actual fun arc4randomUniform(l: UInt): UInt =
    wasiLibcUnixBsdArc4randomUniform(l.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdDrand48")
private external fun wasiLibcUnixBsdDrand48(): Double

public actual fun drand48(): CDouble =
    wasiLibcUnixBsdDrand48().toDouble()

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdErand48")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdLrand48")
private external fun wasiLibcUnixBsdLrand48(): Long

public actual fun lrand48(): CLong =
    wasiLibcUnixBsdLrand48().toLong()

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNrand48")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdMrand48")
private external fun wasiLibcUnixBsdMrand48(): Long

public actual fun mrand48(): CLong =
    wasiLibcUnixBsdMrand48().toLong()

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdJrand48")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdSrand48")
private external fun wasiLibcUnixBsdSrand48(seed: Long): Unit

public actual fun srand48(seed: CLong): Unit =
    wasiLibcUnixBsdSrand48(seed)

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdSeed48")

public actual fun lcong48(p: MutPtr<CUshort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdLcong48")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdGetoptLong")

public actual fun strftime(buf: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdStrftime")

public actual fun strftimeL(buf: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>, locale: LocaleT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdStrftimeL")

public actual fun devname(dev: DevT, modeT: ModeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdDevname")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdIssetugid")
private external fun wasiLibcUnixBsdIssetugid(): Int

public actual fun issetugid(): CInt =
    wasiLibcUnixBsdIssetugid().toInt()
