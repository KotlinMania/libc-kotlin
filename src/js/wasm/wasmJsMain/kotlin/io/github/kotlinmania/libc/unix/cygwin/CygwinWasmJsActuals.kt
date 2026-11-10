@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixCygwinNapiAddon(): Boolean

private val _unixCygwinNapiAvailable: Boolean = _initUnixCygwinNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_sigwait(p0, p1)")
private external fun _wasm_libc_unix_cygwin_sigwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_sigwaitinfo(p0, p1)")
private external fun _wasm_libc_unix_cygwin_sigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_sigsuspend(p0)")
private external fun _wasm_libc_unix_cygwin_sigsuspend(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_sigaltstack(p0, p1)")
private external fun _wasm_libc_unix_cygwin_sigaltstack(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadKill(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_strftime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_strftime(p0: String, p1: String, p2: String?, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_asctimeR(p0, p1)")
private external fun _wasm_libc_unix_cygwin_asctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_ctimeR(p0, p1)")
private external fun _wasm_libc_unix_cygwin_ctimeR(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_strptime(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_strptime(p0: String?, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_clockSettime(p0, p1)")
private external fun _wasm_libc_unix_cygwin_clockSettime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_cygwin_clockGettime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_clockGetres(p0, p1)")
private external fun _wasm_libc_unix_cygwin_clockGetres(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_timerCreate(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_timerCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_timerDelete(p0)")
private external fun _wasm_libc_unix_cygwin_timerDelete(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_timerSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_timerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_timerGettime(p0, p1)")
private external fun _wasm_libc_unix_cygwin_timerGettime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_timerGetoverrun(p0)")
private external fun _wasm_libc_unix_cygwin_timerGetoverrun(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_clockNanosleep(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_clockGetcpuclockid(p0, p1)")
private external fun _wasm_libc_unix_cygwin_clockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_futimes(p0, p1)")
private external fun _wasm_libc_unix_cygwin_futimes(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_lutimes(p0, p1)")
private external fun _wasm_libc_unix_cygwin_lutimes(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_settimeofday(p0, p1)")
private external fun _wasm_libc_unix_cygwin_settimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_getitimer(p0, p1)")
private external fun _wasm_libc_unix_cygwin_getitimer(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_setitimer(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_setitimer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_cygwin_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_futimesat(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_futimesat(p0: Int, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_cygwin_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_cygwin_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_getpriority(p0, p1)")
private external fun _wasm_libc_unix_cygwin_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_cygwin_getpwnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_cygwin_getpwnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_cygwin_getpwuidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_cygwin_getpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_getpwent()")
private external fun _wasm_libc_unix_cygwin_getpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_setpwent()")
private external fun _wasm_libc_unix_cygwin_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_endpwent()")
private external fun _wasm_libc_unix_cygwin_endpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_ifNameindex()")
private external fun _wasm_libc_unix_cygwin_ifNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_ifFreenameindex(p0)")
private external fun _wasm_libc_unix_cygwin_ifFreenameindex(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_readv(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_writev(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_mknodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_mknodat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_futimens(p0, p1)")
private external fun _wasm_libc_unix_cygwin_futimens(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_dlfork(p0)")
private external fun _wasm_libc_unix_cygwin_dlfork(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_bind(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_cygwin_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_cygwin_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_cygwin_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_cygwin_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_ppoll(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_ppoll(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_newlocale(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_newlocale(p0: Int, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_freelocale(p0)")
private external fun _wasm_libc_unix_cygwin_freelocale(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_duplocale(p0)")
private external fun _wasm_libc_unix_cygwin_duplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_uselocale(p0)")
private external fun _wasm_libc_unix_cygwin_uselocale(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_semInit(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_semDestroy(p0)")
private external fun _wasm_libc_unix_cygwin_semDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_cygwin_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_cygwin_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_semClose(p0)")
private external fun _wasm_libc_unix_cygwin_semClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_semUnlink(p0)")
private external fun _wasm_libc_unix_cygwin_semUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_semTimedwait(p0, p1)")
private external fun _wasm_libc_unix_cygwin_semTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_semGetvalue(p0, p1)")
private external fun _wasm_libc_unix_cygwin_semGetvalue(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_clearenv()")
private external fun _wasm_libc_unix_cygwin_clearenv(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_ptsnameR(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_ptsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_getpt()")
private external fun _wasm_libc_unix_cygwin_getpt(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_memalign(p0, p1)")
private external fun _wasm_libc_unix_cygwin_memalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_getloadavg(p0, p1)")
private external fun _wasm_libc_unix_cygwin_getloadavg(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_abs(p0)")
private external fun _wasm_libc_unix_cygwin_abs(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_arc4random()")
private external fun _wasm_libc_unix_cygwin_arc4random(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_arc4randomUniform(p0)")
private external fun _wasm_libc_unix_cygwin_arc4randomUniform(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_arc4randomBuf(p0, p1)")
private external fun _wasm_libc_unix_cygwin_arc4randomBuf(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_labs(p0)")
private external fun _wasm_libc_unix_cygwin_labs(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_mkostemp(p0, p1)")
private external fun _wasm_libc_unix_cygwin_mkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_mkostemps(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_mkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_mkstemps(p0, p1)")
private external fun _wasm_libc_unix_cygwin_mkstemps(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_rand()")
private external fun _wasm_libc_unix_cygwin_rand(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_reallocarray(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_reallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_reallocf(p0, p1)")
private external fun _wasm_libc_unix_cygwin_reallocf(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_srand(p0)")
private external fun _wasm_libc_unix_cygwin_srand(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_drand48()")
private external fun _wasm_libc_unix_cygwin_drand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_erand48(p0)")
private external fun _wasm_libc_unix_cygwin_erand48(p0: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_jrand48(p0)")
private external fun _wasm_libc_unix_cygwin_jrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_lcong48(p0)")
private external fun _wasm_libc_unix_cygwin_lcong48(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_lrand48()")
private external fun _wasm_libc_unix_cygwin_lrand48(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_mrand48()")
private external fun _wasm_libc_unix_cygwin_mrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_nrand48(p0)")
private external fun _wasm_libc_unix_cygwin_nrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_seed48(p0)")
private external fun _wasm_libc_unix_cygwin_seed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_srand48(p0)")
private external fun _wasm_libc_unix_cygwin_srand48(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_cygwin_qsortR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_cygwin_qsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_posixMadvise(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_posixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_madvise(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_shmUnlink(p0)")
private external fun _wasm_libc_unix_cygwin_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_explicitBzero(p0, p1)")
private external fun _wasm_libc_unix_cygwin_explicitBzero(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_ffs(p0)")
private external fun _wasm_libc_unix_cygwin_ffs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_ffsl(p0)")
private external fun _wasm_libc_unix_cygwin_ffsl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_ffsll(p0)")
private external fun _wasm_libc_unix_cygwin_ffsll(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_fls(p0)")
private external fun _wasm_libc_unix_cygwin_fls(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_flsl(p0)")
private external fun _wasm_libc_unix_cygwin_flsl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_flsll(p0)")
private external fun _wasm_libc_unix_cygwin_flsll(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_strcasecmpL(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_strcasecmpL(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_strncasecmpL(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_strncasecmpL(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_timingsafeBcmp(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_timingsafeBcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_timingsafeMemcmp(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_timingsafeMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_memmem(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_memmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_memrchr(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_memrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_strsep(p0, p1)")
private external fun _wasm_libc_unix_cygwin_strsep(p0: String, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_basename(p0)")
private external fun _wasm_libc_unix_cygwin_basename(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_daemon(p0, p1)")
private external fun _wasm_libc_unix_cygwin_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_dup3(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_dup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_eaccess(p0, p1)")
private external fun _wasm_libc_unix_cygwin_eaccess(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_euidaccess(p0, p1)")
private external fun _wasm_libc_unix_cygwin_euidaccess(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_execvpe(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_execvpe(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_fexecve(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_fexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_fdatasync(p0)")
private external fun _wasm_libc_unix_cygwin_fdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_getdomainname(p0, p1)")
private external fun _wasm_libc_unix_cygwin_getdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_getentropy(p0, p1)")
private external fun _wasm_libc_unix_cygwin_getentropy(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_gethostid()")
private external fun _wasm_libc_unix_cygwin_gethostid(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_getpagesize()")
private external fun _wasm_libc_unix_cygwin_getpagesize(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_getpeereid(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_getpeereid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pipe2(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pipe2(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_sbrk(p0)")
private external fun _wasm_libc_unix_cygwin_sbrk(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_setgroups(p0, p1)")
private external fun _wasm_libc_unix_cygwin_setgroups(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_sethostname(p0, p1)")
private external fun _wasm_libc_unix_cygwin_sethostname(p0: String?, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_vhangup()")
private external fun _wasm_libc_unix_cygwin_vhangup(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_getdtablesize()")
private external fun _wasm_libc_unix_cygwin_getdtablesize(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_sync()")
private external fun _wasm_libc_unix_cygwin_sync()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_errno()")
private external fun _wasm_libc_unix_cygwin_errno(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_schedSetparam(p0, p1)")
private external fun _wasm_libc_unix_cygwin_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_schedGetparam(p0, p1)")
private external fun _wasm_libc_unix_cygwin_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_schedGetscheduler(p0)")
private external fun _wasm_libc_unix_cygwin_schedGetscheduler(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_schedGetPriorityMax(p0)")
private external fun _wasm_libc_unix_cygwin_schedGetPriorityMax(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_schedGetPriorityMin(p0)")
private external fun _wasm_libc_unix_cygwin_schedGetPriorityMin(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_schedRrGetInterval(p0, p1)")
private external fun _wasm_libc_unix_cygwin_schedRrGetInterval(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_schedGetcpu()")
private external fun _wasm_libc_unix_cygwin_schedGetcpu(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_schedGetaffinity(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_schedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_schedSetaffinity(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_schedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadAttrGetguardsize(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadAttrGetschedparam(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadAttrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadAttrSetschedparam(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadAttrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadCancel(p0)")
private external fun _wasm_libc_unix_cygwin_pthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadCondattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadCondattrSetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadCondattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadBarrierattrInit(p0)")
private external fun _wasm_libc_unix_cygwin_pthreadBarrierattrInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadBarrierattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadBarrierattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadBarrierattrDestroy(p0)")
private external fun _wasm_libc_unix_cygwin_pthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadBarrierInit(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_pthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadBarrierDestroy(p0)")
private external fun _wasm_libc_unix_cygwin_pthreadBarrierDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadBarrierWait(p0)")
private external fun _wasm_libc_unix_cygwin_pthreadBarrierWait(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadGetcpuclockid(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadGetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_pthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadMutexattrGetprotocol(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadMutexattrGetprotocol(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadMutexattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadMutexattrSetprotocol(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadMutexattrSetprotocol(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadMutexattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSpinDestroy(p0)")
private external fun _wasm_libc_unix_cygwin_pthreadSpinDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSpinInit(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSpinLock(p0)")
private external fun _wasm_libc_unix_cygwin_pthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSpinTrylock(p0)")
private external fun _wasm_libc_unix_cygwin_pthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSpinUnlock(p0)")
private external fun _wasm_libc_unix_cygwin_pthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadRwlockattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadRwlockattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_pthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSetschedprio(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadSetschedprio(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadGetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_pthreadGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadGetattrNp(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_pthreadSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_pthreadSetnameNp(p0, p1)")
private external fun _wasm_libc_unix_cygwin_pthreadSetnameNp(p0: String, p1: String?): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_cygwin_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_cygwin_ioctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_getrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_getrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_mount(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_mount(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_umount(p0)")
private external fun _wasm_libc_unix_cygwin_umount(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_cygwinUmount(p0, p1)")
private external fun _wasm_libc_unix_cygwin_cygwinUmount(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_dirfd(p0)")
private external fun _wasm_libc_unix_cygwin_dirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_seekdir(p0, p1)")
private external fun _wasm_libc_unix_cygwin_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_telldir(p0)")
private external fun _wasm_libc_unix_cygwin_telldir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_uname(p0)")
private external fun _wasm_libc_unix_cygwin_uname(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_cygwin_posixSpawn(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_cygwin_posixSpawnp(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrInit(p0)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrDestroy(p0)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrGetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrSetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrGetsigmask(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrSetsigmask(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrGetflags(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrSetflags(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrGetpgroup(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrSetpgroup(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrGetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrSetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrGetschedparam(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnattrSetschedparam(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnFileActionsInit(p0)")
private external fun _wasm_libc_unix_cygwin_posixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnFileActionsDestroy(p0)")
private external fun _wasm_libc_unix_cygwin_posixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_cygwin_posixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String?, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnFileActionsAddclose(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_posixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnFileActionsAddchdir(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnFileActionsAddchdir(p0: String, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnFileActionsAddfchdir(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnFileActionsAddfchdir(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnFileActionsAddchdirNp(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnFileActionsAddchdirNp(p0: String, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_posixSpawnFileActionsAddfchdirNp(p0, p1)")
private external fun _wasm_libc_unix_cygwin_posixSpawnFileActionsAddfchdirNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_forkpty(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_forkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_cygwin_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_cygwin_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_getgrgid(p0)")
private external fun _wasm_libc_unix_cygwin_getgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_cygwin_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_cygwin_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_getgrnam(p0)")
private external fun _wasm_libc_unix_cygwin_getgrnam(p0: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_cygwin_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_cygwin_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_initgroups(p0, p1)")
private external fun _wasm_libc_unix_cygwin_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_statfs(p0, p1)")
private external fun _wasm_libc_unix_cygwin_statfs(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_fstatfs(p0, p1)")
private external fun _wasm_libc_unix_cygwin_fstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_posixFadvise(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_posixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_cygwin_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_cygwin_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_cygwin_fallocate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_cygwin_fallocate(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_endutxent()")
private external fun _wasm_libc_unix_cygwin_endutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_getutxent()")
private external fun _wasm_libc_unix_cygwin_getutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_getutxid(p0)")
private external fun _wasm_libc_unix_cygwin_getutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_getutxline(p0)")
private external fun _wasm_libc_unix_cygwin_getutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_pututxline(p0)")
private external fun _wasm_libc_unix_cygwin_pututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_cygwin_setutxent()")
private external fun _wasm_libc_unix_cygwin_setutxent()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cygwin_utmpxname(p0)")
private external fun _wasm_libc_unix_cygwin_utmpxname(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cygwin_updwtmpx(p0, p1)")
private external fun _wasm_libc_unix_cygwin_updwtmpx(p0: String?, p1: String)

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadKill((thread?.value ?: 0L).toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_strftime((s?.value ?: 0L).toString(), max.toString(), format, (tm?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_ctimeR((timep?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_strptime(s, format, (tm?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_clockSettime(clkId.toString(), (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_clockGettime(clkId.toString(), (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_clockGetres(clkId.toString(), (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_timerCreate(clockid.toString(), (sevp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_timerDelete(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_timerSettime(timerid.toLong().toString(), flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_timerGettime(timerid.toLong().toString(), (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_timerGetoverrun(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_clockNanosleep(clkId.toString(), flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_futimes(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_lutimes(file, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getitimer(which, (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_setitimer(which, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_futimesat(fd, path, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_setrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_setpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_ifNameindex().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_ifFreenameindex((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_mknodat(dirfd, pathname, mode.toInt(), dev.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlfork(value: CInt) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_dlfork(value)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_accept4(s, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_bind(socket, (address?.value ?: 0L).toString(), addressLen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_recvmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_sendmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, sevlen: SocklenT, flags: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getnameinfo((sa?.value ?: 0L).toString(), salen, (host?.value ?: 0L).toString(), hostlen, (serv?.value ?: 0L).toString(), sevlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_ppoll((fds?.value ?: 0L).toString(), nfds.toInt(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_newlocale(mask, locale, (base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_duplocale((base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_uselocale((loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_clearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpt(): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getpt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getloadavg((loadavg?.value ?: 0L).toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_arc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomUniform(l: UInt): UInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_arc4randomUniform(l.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_arc4randomBuf((buf?.value ?: 0L).toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun labs(i: CLong): CLong =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_mkostemp((template?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_mkstemps((template?.value ?: 0L).toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_reallocf((ptr?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_drand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_erand48((xseed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_jrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_lcong48((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lrand48(): CLong =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_lrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_mrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_nrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_seed48((xseed?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_srand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_explicitBzero((s?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ffs(value: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_ffs(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsl(value: CLong): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_ffsl(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsll(value: CLonglong): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_ffsll(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fls(value: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_fls(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsl(value: CLong): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_flsl(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsll(value: CLonglong): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_flsll(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_strcasecmpL(s1, s2, (loc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_strncasecmpL(s1, s2, n.toString(), (loc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_timingsafeBcmp((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_timingsafeMemcmp((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_memrchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_strsep((string?.value ?: 0L).toString(), delim).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: String?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_basename(path).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_dup3(src, dst, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_eaccess(pathname, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_euidaccess(pathname, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_faccessat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_fdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getdomainname((name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_gethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getpagesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getpeereid(socket, (euid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pipe2((fds?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_sbrk(increment.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_setgroups(ngroups, (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_sethostname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_vhangup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun errno(): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_errno().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedRrGetInterval(pid, (t?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedGetcpu() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedGetaffinity(pid, cpusetsize.toString(), (mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadAttrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadAttrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadCancel((thread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), shared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (shared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadBarrierWait((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadGetcpuclockid((thread?.value ?: 0L).toString(), (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadGetschedparam((native?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadMutexattrGetprotocol((attr?.value ?: 0L).toString(), (protocol?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadMutexattrSetprotocol((attr?.value ?: 0L).toString(), protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSpinDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSpinLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSpinTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSpinUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSetschedparam((native?.value ?: 0L).toString(), policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSetschedprio((native?.value ?: 0L).toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadGetaffinityNp((thread?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadGetattrNp((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadGetnameNp((thread?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSetaffinityNp((thread?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pthreadSetnameNp((thread?.value ?: 0L).toString(), name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: String?, target: String?, flags: CUint): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_mount(src, target, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: String?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_umount(target) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cygwinUmount(target: String?, flags: CUint): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_cygwinUmount(target, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdir(actions: COpaquePointer?, path: String?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnFileActionsAddchdir((actions?.value ?: 0L).toString(), path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdir(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnFileActionsAddfchdir((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L).toString(), path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_initgroups(user, group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_statfs(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_fstatfs(fd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_fallocate(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endutxent() {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutxent(): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getutxent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(id: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getutxid((id?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(line: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_getutxline((line?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(utmpx: COpaquePointer?): COpaquePointer? =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_pututxline((utmpx?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_unixCygwinNapiAvailable) _wasm_libc_unix_cygwin_utmpxname(file) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: String?, utmpx: COpaquePointer?) {
    if (_unixCygwinNapiAvailable) {
        _wasm_libc_unix_cygwin_updwtmpx(file, (utmpx?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
