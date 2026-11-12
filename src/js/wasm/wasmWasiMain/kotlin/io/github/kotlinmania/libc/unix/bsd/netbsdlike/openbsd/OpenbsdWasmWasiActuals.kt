@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGettimeofday")

public actual fun settimeofday(tp: ConstPtr, tz: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdSettimeofday")

public actual fun pledge(promises: ConstPtr, execpromises: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPledge")

public actual fun unveil(path: ConstPtr, permissions: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdUnveil")

public actual fun strtonum(nptr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstr: MutPtr): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdStrtonum")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdDup3")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdDup3(src: Int, dst: Int, flags: Int): Int

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdDup3(src, dst, flags)

public actual fun chflags(path: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdChflags")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdFchflags")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdFchflags(fd: Int, flags: Int): Int

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdFchflags(fd, flags.toInt())

public actual fun chflagsat(fd: CInt, path: ConstPtr, flags: CUint, atflag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdChflagsat")

public actual fun dirfd(dirp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdDirfd")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetnameinfo")

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetresgid")

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetresuid")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdKevent")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdMprotect")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdGetthrid")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdGetthrid(): Int

public actual fun getthrid(): PidT =
    wasiLibcUnixBsdNetbsdlikeOpenbsdGetthrid()

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize")

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdPthreadMainNp")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdPthreadMainNp(): Int

public actual fun pthreadMainNp(): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdPthreadMainNp()

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp")

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp")

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdOpenpty")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdForkpty")

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
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

public actual fun utrace(label: ConstPtr, addr: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdUtrace")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdMemmem")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdUselocale")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdFreelocale")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdNewlocale")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdDuplocale")

public actual fun explicitBzero(s: MutPtr, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdExplicitBzero")

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdSetproctitle")

public actual fun freezero(ptr: MutPtr, size: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdFreezero")

public actual fun mallocConceal(size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdMallocConceal")

public actual fun callocConceal(nmemb: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdCallocConceal")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(seed: Long): Unit

public actual fun srand48Deterministic(seed: CLong): Unit =
    wasiLibcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(seed)

public actual fun seed48Deterministic(xseed: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic")

public actual fun lcong48Deterministic(p: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic")

public actual fun lsearch(key: ConstPtr, base: MutPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdLsearch")

public actual fun lfind(key: ConstPtr, base: ConstPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdLfind")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdHcreate")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdHcreate(nelt: Long): Int

public actual fun hcreate(nelt: SizeT): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdHcreate(nelt.toLong())

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdHdestroy")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdHdestroy(): Unit

public actual fun hdestroy(): Unit =
    wasiLibcUnixBsdNetbsdlikeOpenbsdHdestroy()

public actual fun hsearch(entry: Entry, action: Action): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdHsearch")

public actual fun futex(uaddr: MutPtr, op: CInt, value: CInt, timeout: ConstPtr, uaddr2: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdFutex")

public actual fun mimmutable(addr: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdMimmutable")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdNetbsdlikeOpenbsdReboot")
private external fun wasiLibcUnixBsdNetbsdlikeOpenbsdReboot(mode: Int): Int

public actual fun reboot(mode: CInt): CInt =
    wasiLibcUnixBsdNetbsdlikeOpenbsdReboot(mode)

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdStatfs")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdFstatfs")

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetmntinfo")

public actual fun getfsstat(buf: MutPtr, bufsize: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdGetfsstat")

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr, buflen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdElfAuxInfo")

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdBacktrace")

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd")

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr, len: SizeT, fmt: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt")
