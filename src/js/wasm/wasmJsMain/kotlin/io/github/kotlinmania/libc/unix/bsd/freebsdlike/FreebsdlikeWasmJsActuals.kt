@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.ClockidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdFreebsdlikeNapiAddon(): Boolean

private val unixBsdFreebsdlikeNapiAvailable: Boolean = initUnixBsdFreebsdlikeNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSemDestroy(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeSemDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSemInit(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDaemon(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGettimeofday(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeAccept4(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeAccept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeChflags(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeChflags(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeChflagsat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeChflagsat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeClockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeClockGetres(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeClockGettime(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeClockSettime(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeClockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeClockGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeClockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDirfd(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDirfd(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDuplocale(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeDuplocale(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeEndutxent()")
private external fun wasmLibcUnixBsdFreebsdlikeEndutxent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFchflags(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFchflags(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFexecve(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFutimens(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetdomainname(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeGetdomainname(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetgrentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeGetgrentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetpwentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeGetpwentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdFreebsdlikeGetnameinfo(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetpriority(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetresgid(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeGetresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetresuid(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeGetresuid(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetutxent()")
private external fun wasmLibcUnixBsdFreebsdlikeGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetutxid(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetutxline(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeGetutxline(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeInitgroups(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeKevent(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeKevent(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeLchflags(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeLchflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeLutimes(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeLutimes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMemrchr(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeMemrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeMknodat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMallocUsableSize(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeMallocUsableSize(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMincore(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeMincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeNewlocale(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeNlLanginfoL(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeNlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePipe2(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePipe2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikePosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikePosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePpoll(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikePpoll(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikePreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadAttrGetNp(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadAttrGetNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadAttrSetguardsize(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadCondattrGetpshared(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadCondattrSetpshared(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadMainNp()")
private external fun wasmLibcUnixBsdFreebsdlikePthreadMainNp(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadMutexattrGetpshared(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadMutexattrSetpshared(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadRwlockattrGetpshared(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadRwlockattrSetpshared(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadBarrierattrInit(p0)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadBarrierattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadBarrierattrDestroy(p0)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadBarrierattrGetpshared(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadBarrierattrSetpshared(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadBarrierInit(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadBarrierDestroy(p0)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadBarrierDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadBarrierWait(p0)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadBarrierWait(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadGetNameNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadGetNameNp(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadSetNameNp(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadSetNameNp(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadSetnameNp(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadSetnameNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikePthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePtrace(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikePtrace(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeUtrace(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeUtrace(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePututxline(p0)")
private external fun wasmLibcUnixBsdFreebsdlikePututxline(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikePwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeQuerylocale(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeQuerylocale(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeRtprio(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeRtprio(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSchedRrGetInterval(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeSchedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSchedGetparam(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSchedSetparam(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSchedGetscheduler(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeSchedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSemGetvalue(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSemTimedwait(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSendfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdFreebsdlikeSendfile(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSetdomainname(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeSetdomainname(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSethostname(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeSethostname(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSetresgid(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeSetresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSetresuid(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeSetresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSettimeofday(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeSettimeofday(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSetutxent()")
private external fun wasmLibcUnixBsdFreebsdlikeSetutxent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSigwaitinfo(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeSigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSysctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeSysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSysctlbyname(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeSysctlbyname(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSysctlnametomib(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeSysctlnametomib(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeUselocale(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeUselocale(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeNtpAdjtime(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeNtpAdjtime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeNtpGettime(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeNtpGettime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeDlIteratePhdr(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeDlIteratePhdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeIconvOpen(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeIconvOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeIconv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeIconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeIconvClose(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeIconvClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeExplicitBzero(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeExplicitBzero(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMemsetS(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeMemsetS(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGethostid()")
private external fun wasmLibcUnixBsdFreebsdlikeGethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeSethostid(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeSethostid(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeEui64Aton(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeEui64Aton(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeEui64Ntoa(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeEui64Ntoa(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeEui64Ntohost(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeEui64Ntohost(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeEui64Hostton(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeEui64Hostton(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeEaccess(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeEaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeKenv(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeKenv(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeReboot(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeReboot(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeExect(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeExect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeExecvP(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeExecvP(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMkostemp(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeMkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMkostemps(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeMkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrInit(p0)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrGetschedparam(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnattrSetschedparam(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqClose(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeMqClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqGetattr(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeMqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqNotify(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeMqNotify(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdFreebsdlikeMqOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqReceive(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeMqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqSend(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeMqSend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqSetattr(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeMqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqTimedreceive(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeMqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqTimedsend(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeMqTimedsend(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeMqUnlink(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeMqUnlink(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeGetentropy(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeLoginTty(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeLoginTty(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFparseln(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFparseln(p0: String, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeBacktrace(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeBacktrace(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeBacktraceSymbols(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeBacktraceSymbols(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeBacktraceSymbolsFd(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeBacktraceSymbolsFd(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeKvmOpen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeKvmOpen(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeKvmClose(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeKvmClose(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeKvmGetprocs(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeKvmGetprocs(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeKvmGetloadavg(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeKvmGetloadavg(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeKvmOpenfiles(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeKvmOpenfiles(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeKvmRead(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeKvmRead(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeKvmWrite(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeKvmWrite(p0: String, p1: String, p2: String, p3: String): String

public actual fun semDestroy(sem: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeAccept4(s, addr.rawAddress.toString(), addrlen.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: ConstPtr, flags: CUlong): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeChflags(path.rawAddress.toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflagsat(fd: CInt, path: ConstPtr, flags: CUlong, atflag: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeChflagsat(fd, path.rawAddress.toString(), flags.toString(), atflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeClockGetres(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeClockSettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeClockGetcpuclockid(pid, clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadGetcpuclockid(thread.toLong().toString(), clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endutxent() {
    if (unixBsdFreebsdlikeNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeFchflags(fd, flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetdomainname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetgrouplist(name.rawAddress.toString(), basegid.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toString(), serv.rawAddress.toString(), servlen.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetpriority(which, who) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeGetutxid(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeGetutxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr, basegid: GidT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeInitgroups(name.rawAddress.toString(), basegid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeKevent(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchflags(path: ConstPtr, flags: CUlong): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeLchflags(path.rawAddress.toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeLutimes(file.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeMemrchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: ConstPtr): SizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMallocUsableSize(ptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeNlLanginfoL(item, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePipe2(fds.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePpoll(fds.rawAddress.toString(), nfds.toInt(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadAttrGetNp(tid.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMainNp(): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadMainNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadBarrierattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadBarrierattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadBarrierattrGetpshared(attr.rawAddress.toString(), shared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadBarrierattrSetpshared(attr.rawAddress.toString(), shared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadBarrierDestroy(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadBarrierWait(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr, len: SizeT) {
    if (unixBsdFreebsdlikeNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikePthreadGetNameNp(tid.toLong().toString(), name.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr) {
    if (unixBsdFreebsdlikeNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikePthreadSetNameNp(tid.toLong().toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr, length: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadGetnameNp(thread.toLong().toString(), buffer.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadSetnameNp(thread.toLong().toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePtrace(request, pid, addr.rawAddress.toString(), data) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utrace(addr: ConstPtr, len: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeUtrace(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikePututxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr =
    if (unixBsdFreebsdlikeNapiAvailable) ConstPtr(wasmLibcUnixBsdFreebsdlikeQuerylocale(mask, loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtprio(function: CInt, pid: PidT, rtp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeRtprio(function, pid, rtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSchedRrGetInterval(pid, t.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: MutPtr, sbytes: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSendfile(fd, s, offset.toString(), nbytes.toString(), hdtr.rawAddress.toString(), sbytes.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSetdomainname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSethostname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSetpriority(which, who, prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixBsdFreebsdlikeNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSysctl(name.rawAddress.toString(), namelen.toInt(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSysctlbyname(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeSysctlnametomib(name.rawAddress.toString(), mibp.rawAddress.toString(), sizep.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeNtpAdjtime(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeNtpGettime(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeIconvClose(cd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    if (unixBsdFreebsdlikeNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMemsetS(s.rawAddress.toString(), smax.toString(), c, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong) {
    if (unixBsdFreebsdlikeNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeSethostid(hostid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eui64Aton(a: ConstPtr, e: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeEui64Aton(a.rawAddress.toString(), e.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Ntoa(id: ConstPtr, a: MutPtr, len: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeEui64Ntoa(id.rawAddress.toString(), a.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Ntohost(hostname: MutPtr, len: SizeT, id: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeEui64Ntohost(hostname.rawAddress.toString(), len.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Hostton(hostname: ConstPtr, id: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeEui64Hostton(hostname.rawAddress.toString(), id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(path: ConstPtr, mode: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeEaccess(path.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kenv(action: CInt, name: ConstPtr, value: MutPtr, len: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeKenv(action, name.rawAddress.toString(), value.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howto: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeReboot(howto) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exect(path: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeExect(path.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeExecvP(file.rawAddress.toString(), searchPath.rawAddress.toString(), argv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMkostemp(template.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMkostemps(template.rawAddress.toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsInit(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMqClose(mqd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMqGetattr(mqd.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMqNotify(mqd.rawAddress.toString(), notification.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMqReceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMqSend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMqSetattr(mqd.rawAddress.toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMqTimedreceive(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMqTimedsend(mqd.rawAddress.toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeMqUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeLoginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fparseln(stream: MutPtr, len: MutPtr, lineno: MutPtr, delim: ConstPtr, flags: CInt): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFparseln(stream.rawAddress.toString(), len.rawAddress.toString(), lineno.rawAddress.toString(), delim.rawAddress.toString(), flags).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeBacktrace(addrlist.rawAddress.toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeBacktraceSymbols(addrlist.rawAddress.toString(), len.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeBacktraceSymbolsFd(addrlist.rawAddress.toString(), len.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmOpen(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errstr: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeKvmOpen(execfile.rawAddress.toString(), corefile.rawAddress.toString(), swapfile.rawAddress.toString(), flags, errstr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmClose(kd: MutPtr): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeKvmClose(kd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetprocs(kd: MutPtr, op: CInt, arg: CInt, cnt: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeKvmGetprocs(kd.rawAddress.toString(), op, arg, cnt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetloadavg(kd: MutPtr, loadavg: MutPtr, nelem: CInt): CInt =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeKvmGetloadavg(kd.rawAddress.toString(), loadavg.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmOpenfiles(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errbuf: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeKvmOpenfiles(execfile.rawAddress.toString(), corefile.rawAddress.toString(), swapfile.rawAddress.toString(), flags, errbuf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmRead(kd: MutPtr, addr: CUlong, buf: MutPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeKvmRead(kd.rawAddress.toString(), addr.toString(), buf.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmWrite(kd: MutPtr, addr: CUlong, buf: ConstPtr, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeNapiAvailable) wasmLibcUnixBsdFreebsdlikeKvmWrite(kd.rawAddress.toString(), addr.toString(), buf.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
