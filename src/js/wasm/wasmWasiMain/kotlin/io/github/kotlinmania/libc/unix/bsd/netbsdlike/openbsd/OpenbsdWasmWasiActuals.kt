@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Timezone
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGettimeofday")

public actual fun settimeofday(tp: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdSettimeofday")

public actual fun pledge(promises: ConstPtr<CChar>, execpromises: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPledge")

public actual fun unveil(path: ConstPtr<CChar>, permissions: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdUnveil")

public actual fun strtonum(nptr: ConstPtr<CChar>, minval: CLonglong, maxval: CLonglong, errstr: MutPtr<ConstPtr<CChar>>): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdStrtonum")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdDup3")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdDup3(src: Int, dst: Int, flags: Int): Int

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdDup3(src, dst, flags)

public actual fun chflags(path: ConstPtr<CChar>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdChflags")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdFchflags")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdFchflags(fd: Int, flags: Int): Int

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdFchflags(fd, flags.toInt())

public actual fun chflagsat(fd: CInt, path: ConstPtr<CChar>, flags: CUint, atflag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdChflagsat")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdDirfd")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetnameinfo")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetresgid")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetresuid")

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdKevent")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdMprotect")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdGetthrid")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdGetthrid(): Int

public actual fun getthrid(): PidT =
    wasiLibcUnixBsdNetbsdlikeOpenbsdGetthrid()

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdPthreadMainNp")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdPthreadMainNp(): Int

public actual fun pthreadMainNp(): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdPthreadMainNp()

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp")

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp")

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: MutPtr<StackT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdOpenpty")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdForkpty")

public actual fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdSysctl")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdSetresgid")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdSetresgid(rgid: Int, egid: Int, sgid: Int): Int

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdSetresuid")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdSetresuid(ruid: Int, euid: Int, suid: Int): Int

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdSetresuid(ruid.toInt(), euid.toInt(), suid.toInt())

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPtrace")

public actual fun utrace(label: ConstPtr<CChar>, addr: ConstPtr<CVoid>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdUtrace")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdMemmem")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdUselocale")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdFreelocale")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdNewlocale")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdDuplocale")

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdExplicitBzero")

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdSetproctitle")

public actual fun freezero(ptr: MutPtr<CVoid>, size: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdFreezero")

public actual fun mallocConceal(size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdMallocConceal")

public actual fun callocConceal(nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdCallocConceal")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(seed: Long): Unit

public actual fun srand48Deterministic(seed: CLong): Unit =
    wasiLibcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(seed)

public actual fun seed48Deterministic(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic")

public actual fun lcong48Deterministic(p: MutPtr<CUshort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic")

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdLsearch")

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdLfind")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdHcreate")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdHcreate(nelt: Long): Int

public actual fun hcreate(nelt: SizeT): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdHcreate(nelt.toLong())

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdHdestroy")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdHdestroy(): Unit

public actual fun hdestroy(): Unit =
    wasiLibcUnixBsdNetbsdlikeOpenbsdHdestroy()

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdHsearch")

public actual fun futex(uaddr: MutPtr<UInt>, op: CInt, value: CInt, timeout: ConstPtr<Timespec>, uaddr2: MutPtr<UInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdFutex")

public actual fun mimmutable(addr: MutPtr<CVoid>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdMimmutable")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdReboot")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdReboot(mode: Int): Int

public actual fun reboot(mode: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdReboot(mode)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdStatfs")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdFstatfs")

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetmntinfo")

public actual fun getfsstat(buf: MutPtr<Statfs>, bufsize: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetfsstat")

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr<CVoid>, buflen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdElfAuxInfo")

public actual fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdBacktrace")

public actual fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd")

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fmt: ConstPtr<CChar>): MutPtr<MutPtr<CChar>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt")
