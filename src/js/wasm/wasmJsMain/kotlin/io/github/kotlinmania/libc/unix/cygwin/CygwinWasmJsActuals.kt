@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixCygwinNapiAddon(): Boolean

private val unixCygwinNapiAvailable: Boolean = initUnixCygwinNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSigwait(p0, p1)")
private external fun wasmLibcUnixCygwinSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSigwaitinfo(p0, p1)")
private external fun wasmLibcUnixCygwinSigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSigsuspend(p0)")
private external fun wasmLibcUnixCygwinSigsuspend(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSigaltstack(p0, p1)")
private external fun wasmLibcUnixCygwinSigaltstack(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadKill(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixCygwinSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinStrftime(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinAsctimeR(p0, p1)")
private external fun wasmLibcUnixCygwinAsctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinCtimeR(p0, p1)")
private external fun wasmLibcUnixCygwinCtimeR(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinStrptime(p0, p1, p2)")
private external fun wasmLibcUnixCygwinStrptime(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinClockSettime(p0, p1)")
private external fun wasmLibcUnixCygwinClockSettime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinClockGettime(p0, p1)")
private external fun wasmLibcUnixCygwinClockGettime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinClockGetres(p0, p1)")
private external fun wasmLibcUnixCygwinClockGetres(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinTimerCreate(p0, p1, p2)")
private external fun wasmLibcUnixCygwinTimerCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinTimerDelete(p0)")
private external fun wasmLibcUnixCygwinTimerDelete(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinTimerSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinTimerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinTimerGettime(p0, p1)")
private external fun wasmLibcUnixCygwinTimerGettime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinTimerGetoverrun(p0)")
private external fun wasmLibcUnixCygwinTimerGetoverrun(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinClockNanosleep(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinClockGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixCygwinClockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinFutimes(p0, p1)")
private external fun wasmLibcUnixCygwinFutimes(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinLutimes(p0, p1)")
private external fun wasmLibcUnixCygwinLutimes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSettimeofday(p0, p1)")
private external fun wasmLibcUnixCygwinSettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinGetitimer(p0, p1)")
private external fun wasmLibcUnixCygwinGetitimer(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinSetitimer(p0, p1, p2)")
private external fun wasmLibcUnixCygwinSetitimer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinGettimeofday(p0, p1)")
private external fun wasmLibcUnixCygwinGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinFutimesat(p0, p1, p2)")
private external fun wasmLibcUnixCygwinFutimesat(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinGetrlimit(p0, p1)")
private external fun wasmLibcUnixCygwinGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSetrlimit(p0, p1)")
private external fun wasmLibcUnixCygwinSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinGetpriority(p0, p1)")
private external fun wasmLibcUnixCygwinGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixCygwinSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixCygwinGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixCygwinGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixCygwinGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixCygwinGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinGetpwent()")
private external fun wasmLibcUnixCygwinGetpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinSetpwent()")
private external fun wasmLibcUnixCygwinSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinEndpwent()")
private external fun wasmLibcUnixCygwinEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinIfNameindex()")
private external fun wasmLibcUnixCygwinIfNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinIfFreenameindex(p0)")
private external fun wasmLibcUnixCygwinIfFreenameindex(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinReadv(p0, p1, p2)")
private external fun wasmLibcUnixCygwinReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinWritev(p0, p1, p2)")
private external fun wasmLibcUnixCygwinWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixCygwinMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinMknodat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinFutimens(p0, p1)")
private external fun wasmLibcUnixCygwinFutimens(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinDlfork(p0)")
private external fun wasmLibcUnixCygwinDlfork(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinAccept4(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinAccept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinBind(p0, p1, p2)")
private external fun wasmLibcUnixCygwinBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixCygwinRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixCygwinRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixCygwinRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixCygwinSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixCygwinGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixCygwinGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinPpoll(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinPpoll(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinNewlocale(p0, p1, p2)")
private external fun wasmLibcUnixCygwinNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinFreelocale(p0)")
private external fun wasmLibcUnixCygwinFreelocale(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinDuplocale(p0)")
private external fun wasmLibcUnixCygwinDuplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinUselocale(p0)")
private external fun wasmLibcUnixCygwinUselocale(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinSemInit(p0, p1, p2)")
private external fun wasmLibcUnixCygwinSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSemDestroy(p0)")
private external fun wasmLibcUnixCygwinSemDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixCygwinSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixCygwinSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSemClose(p0)")
private external fun wasmLibcUnixCygwinSemClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSemUnlink(p0)")
private external fun wasmLibcUnixCygwinSemUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSemTimedwait(p0, p1)")
private external fun wasmLibcUnixCygwinSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSemGetvalue(p0, p1)")
private external fun wasmLibcUnixCygwinSemGetvalue(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinClearenv()")
private external fun wasmLibcUnixCygwinClearenv(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPtsnameR(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPtsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinGetpt()")
private external fun wasmLibcUnixCygwinGetpt(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinMemalign(p0, p1)")
private external fun wasmLibcUnixCygwinMemalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinGetloadavg(p0, p1)")
private external fun wasmLibcUnixCygwinGetloadavg(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinAbs(p0)")
private external fun wasmLibcUnixCygwinAbs(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinArc4random()")
private external fun wasmLibcUnixCygwinArc4random(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinArc4randomUniform(p0)")
private external fun wasmLibcUnixCygwinArc4randomUniform(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinArc4randomBuf(p0, p1)")
private external fun wasmLibcUnixCygwinArc4randomBuf(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinLabs(p0)")
private external fun wasmLibcUnixCygwinLabs(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinMkostemp(p0, p1)")
private external fun wasmLibcUnixCygwinMkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinMkostemps(p0, p1, p2)")
private external fun wasmLibcUnixCygwinMkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinMkstemps(p0, p1)")
private external fun wasmLibcUnixCygwinMkstemps(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinRand()")
private external fun wasmLibcUnixCygwinRand(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinReallocarray(p0, p1, p2)")
private external fun wasmLibcUnixCygwinReallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinReallocf(p0, p1)")
private external fun wasmLibcUnixCygwinReallocf(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSrand(p0)")
private external fun wasmLibcUnixCygwinSrand(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinDrand48()")
private external fun wasmLibcUnixCygwinDrand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinErand48(p0)")
private external fun wasmLibcUnixCygwinErand48(p0: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinJrand48(p0)")
private external fun wasmLibcUnixCygwinJrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinLcong48(p0)")
private external fun wasmLibcUnixCygwinLcong48(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinLrand48()")
private external fun wasmLibcUnixCygwinLrand48(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinMrand48()")
private external fun wasmLibcUnixCygwinMrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinNrand48(p0)")
private external fun wasmLibcUnixCygwinNrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSeed48(p0)")
private external fun wasmLibcUnixCygwinSeed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSrand48(p0)")
private external fun wasmLibcUnixCygwinSrand48(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixCygwinQsortR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixCygwinQsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinMprotect(p0, p1, p2)")
private external fun wasmLibcUnixCygwinMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinMsync(p0, p1, p2)")
private external fun wasmLibcUnixCygwinMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPosixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinMadvise(p0, p1, p2)")
private external fun wasmLibcUnixCygwinMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixCygwinShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinShmUnlink(p0)")
private external fun wasmLibcUnixCygwinShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinExplicitBzero(p0, p1)")
private external fun wasmLibcUnixCygwinExplicitBzero(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinFfs(p0)")
private external fun wasmLibcUnixCygwinFfs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinFfsl(p0)")
private external fun wasmLibcUnixCygwinFfsl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinFfsll(p0)")
private external fun wasmLibcUnixCygwinFfsll(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinFls(p0)")
private external fun wasmLibcUnixCygwinFls(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinFlsl(p0)")
private external fun wasmLibcUnixCygwinFlsl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinFlsll(p0)")
private external fun wasmLibcUnixCygwinFlsll(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinStrcasecmpL(p0, p1, p2)")
private external fun wasmLibcUnixCygwinStrcasecmpL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinStrncasecmpL(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinStrncasecmpL(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinTimingsafeBcmp(p0, p1, p2)")
private external fun wasmLibcUnixCygwinTimingsafeBcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinTimingsafeMemcmp(p0, p1, p2)")
private external fun wasmLibcUnixCygwinTimingsafeMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinMemrchr(p0, p1, p2)")
private external fun wasmLibcUnixCygwinMemrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixCygwinStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinStrsep(p0, p1)")
private external fun wasmLibcUnixCygwinStrsep(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinBasename(p0)")
private external fun wasmLibcUnixCygwinBasename(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinDaemon(p0, p1)")
private external fun wasmLibcUnixCygwinDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinDup3(p0, p1, p2)")
private external fun wasmLibcUnixCygwinDup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinEaccess(p0, p1)")
private external fun wasmLibcUnixCygwinEaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinEuidaccess(p0, p1)")
private external fun wasmLibcUnixCygwinEuidaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinExecvpe(p0, p1, p2)")
private external fun wasmLibcUnixCygwinExecvpe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinFexecve(p0, p1, p2)")
private external fun wasmLibcUnixCygwinFexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinFdatasync(p0)")
private external fun wasmLibcUnixCygwinFdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinGetdomainname(p0, p1)")
private external fun wasmLibcUnixCygwinGetdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinGetentropy(p0, p1)")
private external fun wasmLibcUnixCygwinGetentropy(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinGethostid()")
private external fun wasmLibcUnixCygwinGethostid(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinGetpagesize()")
private external fun wasmLibcUnixCygwinGetpagesize(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinGetpeereid(p0, p1, p2)")
private external fun wasmLibcUnixCygwinGetpeereid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPipe2(p0, p1)")
private external fun wasmLibcUnixCygwinPipe2(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSbrk(p0)")
private external fun wasmLibcUnixCygwinSbrk(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSetgroups(p0, p1)")
private external fun wasmLibcUnixCygwinSetgroups(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSethostname(p0, p1)")
private external fun wasmLibcUnixCygwinSethostname(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinVhangup()")
private external fun wasmLibcUnixCygwinVhangup(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinGetdtablesize()")
private external fun wasmLibcUnixCygwinGetdtablesize(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinSync()")
private external fun wasmLibcUnixCygwinSync()

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinErrno()")
private external fun wasmLibcUnixCygwinErrno(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSchedSetparam(p0, p1)")
private external fun wasmLibcUnixCygwinSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSchedGetparam(p0, p1)")
private external fun wasmLibcUnixCygwinSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcUnixCygwinSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSchedGetscheduler(p0)")
private external fun wasmLibcUnixCygwinSchedGetscheduler(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSchedGetPriorityMax(p0)")
private external fun wasmLibcUnixCygwinSchedGetPriorityMax(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinSchedGetPriorityMin(p0)")
private external fun wasmLibcUnixCygwinSchedGetPriorityMin(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSchedRrGetInterval(p0, p1)")
private external fun wasmLibcUnixCygwinSchedRrGetInterval(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinSchedGetcpu()")
private external fun wasmLibcUnixCygwinSchedGetcpu(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinSchedGetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixCygwinSchedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinSchedSetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixCygwinSchedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadAttrGetschedparam(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadAttrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadAttrSetschedparam(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadAttrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPthreadCancel(p0)")
private external fun wasmLibcUnixCygwinPthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadCondattrGetpshared(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadCondattrSetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadCondattrSetpshared(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPthreadBarrierattrInit(p0)")
private external fun wasmLibcUnixCygwinPthreadBarrierattrInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadBarrierattrSetpshared(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadBarrierattrGetpshared(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPthreadBarrierattrDestroy(p0)")
private external fun wasmLibcUnixCygwinPthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPthreadBarrierInit(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPthreadBarrierDestroy(p0)")
private external fun wasmLibcUnixCygwinPthreadBarrierDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPthreadBarrierWait(p0)")
private external fun wasmLibcUnixCygwinPthreadBarrierWait(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadMutexattrGetprotocol(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadMutexattrGetprotocol(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadMutexattrGetpshared(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadMutexattrSetprotocol(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadMutexattrSetprotocol(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadMutexattrSetpshared(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSpinDestroy(p0)")
private external fun wasmLibcUnixCygwinPthreadSpinDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSpinInit(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSpinLock(p0)")
private external fun wasmLibcUnixCygwinPthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSpinTrylock(p0)")
private external fun wasmLibcUnixCygwinPthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSpinUnlock(p0)")
private external fun wasmLibcUnixCygwinPthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadRwlockattrGetpshared(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadRwlockattrSetpshared(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSetschedprio(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadSetschedprio(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPthreadGetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPthreadGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadGetattrNp(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPthreadSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPthreadSetnameNp(p0, p1)")
private external fun wasmLibcUnixCygwinPthreadSetnameNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixCygwinIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixCygwinIoctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixCygwinGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinMount(p0, p1, p2)")
private external fun wasmLibcUnixCygwinMount(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinUmount(p0)")
private external fun wasmLibcUnixCygwinUmount(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinCygwinUmount(p0, p1)")
private external fun wasmLibcUnixCygwinCygwinUmount(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinDirfd(p0)")
private external fun wasmLibcUnixCygwinDirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinSeekdir(p0, p1)")
private external fun wasmLibcUnixCygwinSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinTelldir(p0)")
private external fun wasmLibcUnixCygwinTelldir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinUname(p0)")
private external fun wasmLibcUnixCygwinUname(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixCygwinPosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixCygwinPosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrInit(p0)")
private external fun wasmLibcUnixCygwinPosixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixCygwinPosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrGetschedpolicy(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrSetschedpolicy(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrGetschedparam(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnattrSetschedparam(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixCygwinPosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixCygwinPosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixCygwinPosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnFileActionsAddchdir(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnFileActionsAddchdir(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnFileActionsAddfchdir(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnFileActionsAddfchdir(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnFileActionsAddchdirNp(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnFileActionsAddchdirNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinPosixSpawnFileActionsAddfchdirNp(p0, p1)")
private external fun wasmLibcUnixCygwinPosixSpawnFileActionsAddfchdirNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixCygwinOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixCygwinOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinGetgrgid(p0)")
private external fun wasmLibcUnixCygwinGetgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixCygwinGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixCygwinGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinGetgrnam(p0)")
private external fun wasmLibcUnixCygwinGetgrnam(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixCygwinGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixCygwinGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinInitgroups(p0, p1)")
private external fun wasmLibcUnixCygwinInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinStatfs(p0, p1)")
private external fun wasmLibcUnixCygwinStatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinFstatfs(p0, p1)")
private external fun wasmLibcUnixCygwinFstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinPosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinPosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixCygwinPosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixCygwinPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixCygwinFallocate(p0, p1, p2, p3)")
private external fun wasmLibcUnixCygwinFallocate(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinEndutxent()")
private external fun wasmLibcUnixCygwinEndutxent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinGetutxent()")
private external fun wasmLibcUnixCygwinGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinGetutxid(p0)")
private external fun wasmLibcUnixCygwinGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinGetutxline(p0)")
private external fun wasmLibcUnixCygwinGetutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinPututxline(p0)")
private external fun wasmLibcUnixCygwinPututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixCygwinSetutxent()")
private external fun wasmLibcUnixCygwinSetutxent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCygwinUtmpxname(p0)")
private external fun wasmLibcUnixCygwinUtmpxname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCygwinUpdwtmpx(p0, p1)")
private external fun wasmLibcUnixCygwinUpdwtmpx(p0: String, p1: String)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadKill(thread.rawAddress.toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinStrftime(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinCtimeR(timep.rawAddress.toString(), buf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinClockSettime(clkId.toString(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinClockGettime(clkId.toString(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinClockGetres(clkId.toString(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinTimerCreate(clockid.toString(), sevp.rawAddress.toString(), timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinTimerDelete(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinTimerSettime(timerid.toLong().toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinTimerGettime(timerid.toLong().toString(), currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinTimerGetoverrun(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinClockNanosleep(clkId.toString(), flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinClockGetcpuclockid(pid, clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFutimes(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinLutimes(file.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetitimer(which, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimesat(fd: CInt, path: ConstPtr, times: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFutimesat(fd, path.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSetpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ifNameindex(): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinIfNameindex().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlfork(value: CInt) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinDlfork(value)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinAccept4(s, addr.rawAddress.toString(), addrlen.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinBind(socket, address.rawAddress.toString(), addressLen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinRecvmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSendmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, sevlen: SocklenT, flags: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetnameinfo(sa.rawAddress.toString(), salen, host.rawAddress.toString(), hostlen, serv.rawAddress.toString(), sevlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPpoll(fds.rawAddress.toString(), nfds.toInt(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinClearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpt(): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetpt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetloadavg(loadavg.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinArc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomUniform(l: UInt): UInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinArc4randomUniform(l.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr, size: SizeT) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinArc4randomBuf(buf.rawAddress.toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun labs(i: CLong): CLong =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMkostemp(template.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMkostemps(template.rawAddress.toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMkstemps(template.rawAddress.toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocf(ptr: MutPtr, size: SizeT): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinReallocf(ptr.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinDrand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr): CDouble =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinErand48(xseed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr): CLong =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinJrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lrand48(): CLong =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinLrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr): CLong =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinNrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(xseed: MutPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinSeed48(xseed.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinQsortR(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ffs(value: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFfs(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsl(value: CLong): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFfsl(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsll(value: CLonglong): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFfsll(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fls(value: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFls(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsl(value: CLong): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFlsl(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsll(value: CLonglong): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFlsll(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(s1: ConstPtr, s2: ConstPtr, loc: LocaleT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinStrcasecmpL(s1.rawAddress.toString(), s2.rawAddress.toString(), loc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(s1: ConstPtr, s2: ConstPtr, n: SizeT, loc: LocaleT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinStrncasecmpL(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString(), loc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeBcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinTimingsafeBcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeMemcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinTimingsafeMemcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinMemrchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: MutPtr, delim: ConstPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinStrsep(string.rawAddress.toString(), delim.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: ConstPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinDup3(src, dst, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinEaccess(pathname.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinEuidaccess(pathname.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetpagesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetpeereid(socket, euid.rawAddress.toString(), egid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPipe2(fds.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinSbrk(increment.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSetgroups(ngroups, ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinVhangup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun errno(): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinErrno().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedRrGetInterval(pid, t.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedGetcpu() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedGetaffinity(pid, cpusetsize.toString(), mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadAttrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadAttrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadCancel(thread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadCondattrSetclock(attr.rawAddress.toString(), clockId.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadBarrierattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadBarrierattrSetpshared(attr.rawAddress.toString(), shared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadBarrierattrGetpshared(attr.rawAddress.toString(), shared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadBarrierattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadBarrierDestroy(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadBarrierWait(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadGetcpuclockid(thread.rawAddress.toString(), clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadGetschedparam(native.rawAddress.toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr, protocol: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadMutexattrGetprotocol(attr.rawAddress.toString(), protocol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr, protocol: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadMutexattrSetprotocol(attr.rawAddress.toString(), protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSetschedparam(native.rawAddress.toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSetschedprio(native.rawAddress.toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadGetaffinityNp(thread.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadGetattrNp(native.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadGetnameNp(thread.rawAddress.toString(), name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSetaffinityNp(thread.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPthreadSetnameNp(thread.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CUint): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinMount(src.rawAddress.toString(), target.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinUmount(target.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cygwinUmount(target: ConstPtr, flags: CUint): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinCygwinUmount(target.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnFileActionsInit(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnFileActionsDestroy(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdir(actions: MutPtr, path: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnFileActionsAddchdir(actions.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdir(actions: MutPtr, fd: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnFileActionsAddfchdir(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinInitgroups(user.rawAddress.toString(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFstatfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinFallocate(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endutxent() {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutxent(): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(id: ConstPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinGetutxid(id.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(line: ConstPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinGetutxline(line.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(utmpx: ConstPtr): MutPtr =
    if (unixCygwinNapiAvailable) MutPtr(wasmLibcUnixCygwinPututxline(utmpx.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: ConstPtr): CInt =
    if (unixCygwinNapiAvailable) wasmLibcUnixCygwinUtmpxname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: ConstPtr, utmpx: ConstPtr) {
    if (unixCygwinNapiAvailable) {
        wasmLibcUnixCygwinUpdwtmpx(file.rawAddress.toString(), utmpx.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
