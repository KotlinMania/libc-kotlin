@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd

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
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.NlItem
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdNapiAddon(): Boolean

private val unixBsdNapiAvailable: Boolean = initUnixBsdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdGetrlimit(p0, p1)")
private external fun wasmLibcUnixBsdGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdSetrlimit(p0, p1)")
private external fun wasmLibcUnixBsdSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixBsdStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAbs(p0)")
private external fun wasmLibcUnixBsdAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdLabs(p0)")
private external fun wasmLibcUnixBsdLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdRand()")
private external fun wasmLibcUnixBsdRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSrand(p0)")
private external fun wasmLibcUnixBsdSrand(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdGetifaddrs(p0)")
private external fun wasmLibcUnixBsdGetifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreeifaddrs(p0)")
private external fun wasmLibcUnixBsdFreeifaddrs(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdSetgroups(p0, p1)")
private external fun wasmLibcUnixBsdSetgroups(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSetlogin(p0)")
private external fun wasmLibcUnixBsdSetlogin(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdIoctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdKqueue()")
private external fun wasmLibcUnixBsdKqueue(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdUnmount(p0, p1)")
private external fun wasmLibcUnixBsdUnmount(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdSyscall(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdSyscall(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdGetpwent()")
private external fun wasmLibcUnixBsdGetpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdSetpwent()")
private external fun wasmLibcUnixBsdSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdEndpwent()")
private external fun wasmLibcUnixBsdEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdEndgrent()")
private external fun wasmLibcUnixBsdEndgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdGetgrent()")
private external fun wasmLibcUnixBsdGetgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdGetprogname()")
private external fun wasmLibcUnixBsdGetprogname(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSetprogname(p0)")
private external fun wasmLibcUnixBsdSetprogname(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdGetloadavg(p0, p1)")
private external fun wasmLibcUnixBsdGetloadavg(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdIfNameindex()")
private external fun wasmLibcUnixBsdIfNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdIfFreenameindex(p0)")
private external fun wasmLibcUnixBsdIfFreenameindex(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdGetpeereid(p0, p1, p2)")
private external fun wasmLibcUnixBsdGetpeereid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdGlob(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdGlob(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdGlobfree(p0)")
private external fun wasmLibcUnixBsdGlobfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdPosixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixBsdPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdShmUnlink(p0)")
private external fun wasmLibcUnixBsdShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdSeekdir(p0, p1)")
private external fun wasmLibcUnixBsdSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdTelldir(p0)")
private external fun wasmLibcUnixBsdTelldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdMadvise(p0, p1, p2)")
private external fun wasmLibcUnixBsdMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdMsync(p0, p1, p2)")
private external fun wasmLibcUnixBsdMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdMkstemps(p0, p1)")
private external fun wasmLibcUnixBsdMkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFutimes(p0, p1)")
private external fun wasmLibcUnixBsdFutimes(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNlLanginfo(p0)")
private external fun wasmLibcUnixBsdNlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdBind(p0, p1, p2)")
private external fun wasmLibcUnixBsdBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdWritev(p0, p1, p2)")
private external fun wasmLibcUnixBsdWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdReadv(p0, p1, p2)")
private external fun wasmLibcUnixBsdReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixBsdSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixBsdRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdSync()")
private external fun wasmLibcUnixBsdSync()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdSigaltstack(p0, p1)")
private external fun wasmLibcUnixBsdSigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSigsuspend(p0)")
private external fun wasmLibcUnixBsdSigsuspend(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSemClose(p0)")
private external fun wasmLibcUnixBsdSemClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdGetdtablesize()")
private external fun wasmLibcUnixBsdGetdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcUnixBsdPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdGetgrnam(p0)")
private external fun wasmLibcUnixBsdGetgrnam(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdPthreadCancel(p0)")
private external fun wasmLibcUnixBsdPthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdPthreadKill(p0, p1)")
private external fun wasmLibcUnixBsdPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSchedGetPriorityMin(p0)")
private external fun wasmLibcUnixBsdSchedGetPriorityMin(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSchedGetPriorityMax(p0)")
private external fun wasmLibcUnixBsdSchedGetPriorityMax(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSemUnlink(p0)")
private external fun wasmLibcUnixBsdSemUnlink(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdSigwait(p0, p1)")
private external fun wasmLibcUnixBsdSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcUnixBsdPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdGetgrgid(p0)")
private external fun wasmLibcUnixBsdGetgrgid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdPopen(p0, p1)")
private external fun wasmLibcUnixBsdPopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAcct(p0)")
private external fun wasmLibcUnixBsdAcct(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdWait4(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdWait4(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdGetitimer(p0, p1)")
private external fun wasmLibcUnixBsdGetitimer(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdSetitimer(p0, p1, p2)")
private external fun wasmLibcUnixBsdSetitimer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdRegcomp(p0, p1, p2)")
private external fun wasmLibcUnixBsdRegcomp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdRegexec(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdRegexec(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdRegerror(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdRegerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdRegfree(p0)")
private external fun wasmLibcUnixBsdRegfree(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdArc4random()")
private external fun wasmLibcUnixBsdArc4random(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdArc4randomBuf(p0, p1)")
private external fun wasmLibcUnixBsdArc4randomBuf(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdArc4randomUniform(p0)")
private external fun wasmLibcUnixBsdArc4randomUniform(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdDrand48()")
private external fun wasmLibcUnixBsdDrand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdErand48(p0)")
private external fun wasmLibcUnixBsdErand48(p0: String): Double

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdLrand48()")
private external fun wasmLibcUnixBsdLrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNrand48(p0)")
private external fun wasmLibcUnixBsdNrand48(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdMrand48()")
private external fun wasmLibcUnixBsdMrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdJrand48(p0)")
private external fun wasmLibcUnixBsdJrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSrand48(p0)")
private external fun wasmLibcUnixBsdSrand48(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdSeed48(p0)")
private external fun wasmLibcUnixBsdSeed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdLcong48(p0)")
private external fun wasmLibcUnixBsdLcong48(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdGetoptLong(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdGetoptLong(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdStrftime(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdStrftimeL(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdStrftimeL(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdDevname(p0, p1)")
private external fun wasmLibcUnixBsdDevname(p0: Int, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdIssetugid()")
private external fun wasmLibcUnixBsdIssetugid(): Int

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getifaddrs(ifap: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetifaddrs(ifap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSetgroups(ngroups, ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlogin(name: ConstPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSetlogin(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kqueue(): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdKqueue() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmount(target: ConstPtr, arg: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdUnmount(target.rawAddress.toString(), arg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscall(num: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSyscall(num, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): ConstPtr =
    if (unixBsdNapiAvailable) ConstPtr(wasmLibcUnixBsdGetprogname().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(name: ConstPtr) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdSetprogname(name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetloadavg(loadavg.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdIfNameindex().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetpeereid(socket, euid.rawAddress.toString(), egid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdMkstemps(template.rawAddress.toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdFutimes(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdBind(socket, address.rawAddress.toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSendmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdRecvmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdPthreadCancel(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdPthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSchedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSchedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdAcct(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetitimer(which, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4random(): UInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdArc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr, size: SizeT) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdArc4randomBuf(buf.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(l: UInt): UInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdArc4randomUniform(l.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): CDouble =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdDrand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr): CDouble =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdErand48(xseed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdLrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr): CLong =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdNrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdMrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr): CLong =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdJrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48(xseed: MutPtr): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdSeed48(xseed.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr) {
    if (unixBsdNapiAvailable) {
        wasmLibcUnixBsdLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(buf: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdStrftime(buf.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftimeL(buf: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr, locale: LocaleT): SizeT =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdStrftimeL(buf.rawAddress.toString(), maxsize.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString(), locale.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devname(dev: DevT, modeT: ModeT): MutPtr =
    if (unixBsdNapiAvailable) MutPtr(wasmLibcUnixBsdDevname(dev, modeT.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun issetugid(): CInt =
    if (unixBsdNapiAvailable) wasmLibcUnixBsdIssetugid() else throw UnsupportedOperationException("Native FFI addon is not available")
