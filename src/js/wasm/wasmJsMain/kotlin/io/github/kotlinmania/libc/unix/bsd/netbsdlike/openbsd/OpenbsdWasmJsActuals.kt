@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdNetbsdlikeOpenbsdNapiAddon(): Boolean

private val unixBsdNetbsdlikeOpenbsdNapiAvailable: Boolean = initUnixBsdNetbsdlikeOpenbsdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdGettimeofday(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdSettimeofday(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdSettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdPledge(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdPledge(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdUnveil(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdUnveil(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdStrtonum(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdStrtonum(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdDup3(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdDup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdChflags(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdChflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdFchflags(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdFchflags(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdChflagsat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdChflagsat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdDirfd(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdDirfd(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdGetnameinfo(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdGetresgid(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdGetresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdGetresuid(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdGetresuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdKevent(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdKevent(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdMprotect(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdGetthrid()")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdGetthrid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdPthreadMainNp()")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadMainNp(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdSysctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdSysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdSetresgid(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdSetresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdSetresuid(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdSetresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdPtrace(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdPtrace(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdUtrace(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdUtrace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdUselocale(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdUselocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdFreelocale(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdFreelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdNewlocale(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdDuplocale(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdDuplocale(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdExplicitBzero(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdExplicitBzero(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdSetproctitle(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdSetproctitle(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdFreezero(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdFreezero(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdMallocConceal(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdMallocConceal(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdCallocConceal(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdCallocConceal(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdLsearch(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdLsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdLfind(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdLfind(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdHcreate(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdHcreate(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdHdestroy()")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdHdestroy()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdFutex(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdFutex(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdMimmutable(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdMimmutable(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdReboot(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdReboot(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdStatfs(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdStatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdFstatfs(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdFstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdGetmntinfo(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdGetmntinfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdGetfsstat(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdGetfsstat(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdElfAuxInfo(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdElfAuxInfo(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdBacktrace(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdBacktrace(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt(p0: String, p1: String, p2: String): String

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tp: ConstPtr, tz: ConstPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdSettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pledge(promises: ConstPtr, execpromises: ConstPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdPledge(promises.rawAddress.toString(), execpromises.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unveil(path: ConstPtr, permissions: ConstPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdUnveil(path.rawAddress.toString(), permissions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtonum(nptr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstr: MutPtr): CLonglong =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdStrtonum(nptr.rawAddress.toString(), minval.toString(), maxval.toString(), errstr.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdDup3(src, dst, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: ConstPtr, flags: CUint): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdChflags(path.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdFchflags(fd, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflagsat(fd: CInt, path: ConstPtr, flags: CUint, atflag: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdChflagsat(fd, path.rawAddress.toString(), flags.toInt(), atflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toString(), serv.rawAddress.toString(), servlen.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdKevent(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getthrid(): PidT =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdGetthrid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMainNp(): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadMainNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr, len: SizeT) {
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadGetNameNp(tid.toLong().toString(), name.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr) {
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadSetNameNp(tid.toLong().toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadStacksegNp(thread: PthreadT, sinfo: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdPthreadStacksegNp(thread.toLong().toString(), sinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdSysctl(name.rawAddress.toString(), namelen.toInt(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: CaddrT, data: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdPtrace(request, pid, addr.rawAddress.toString(), data) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utrace(label: ConstPtr, addr: ConstPtr, len: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdUtrace(label.rawAddress.toString(), addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeOpenbsdFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeOpenbsdExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long) {
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeOpenbsdSetproctitle(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freezero(ptr: MutPtr, size: SizeT) {
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeOpenbsdFreezero(ptr.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocConceal(size: SizeT): MutPtr =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdMallocConceal(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callocConceal(nmemb: SizeT, size: SizeT): MutPtr =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdCallocConceal(nmemb.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48Deterministic(seed: CLong) {
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeOpenbsdSrand48Deterministic(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48Deterministic(xseed: MutPtr): MutPtr =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdSeed48Deterministic(xseed.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48Deterministic(p: MutPtr) {
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeOpenbsdLcong48Deterministic(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lsearch(key: ConstPtr, base: MutPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdLsearch(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lfind(key: ConstPtr, base: ConstPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdLfind(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcreate(nelt: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdHcreate(nelt.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdestroy() {
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeOpenbsdHdestroy()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futex(uaddr: MutPtr, op: CInt, value: CInt, timeout: ConstPtr, uaddr2: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdFutex(uaddr.rawAddress.toString(), op, value, timeout.rawAddress.toString(), uaddr2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mimmutable(addr: MutPtr, len: SizeT): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdMimmutable(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(mode: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdReboot(mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdFstatfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdGetmntinfo(mntbufp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsstat(buf: MutPtr, bufsize: SizeT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdGetfsstat(buf.rawAddress.toString(), bufsize.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr, buflen: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdElfAuxInfo(aux, buf.rawAddress.toString(), buflen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdBacktrace(addrlist.rawAddress.toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdBacktraceSymbols(addrlist.rawAddress.toString(), len.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFd(addrlist.rawAddress.toString(), len.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr, len: SizeT, fmt: ConstPtr): MutPtr =
    if (unixBsdNetbsdlikeOpenbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeOpenbsdBacktraceSymbolsFmt(addrlist.rawAddress.toString(), len.toString(), fmt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
