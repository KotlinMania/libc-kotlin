@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
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

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeLinuxL4reSharedNapiAddon(): Boolean

private val _unixLinuxlikeLinuxL4reSharedNapiAvailable: Boolean = _initUnixLinuxlikeLinuxL4reSharedNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_iopl(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_iopl(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_ioperm(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_ioperm(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_aioRead(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_aioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_aioWrite(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_aioWrite(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_aioFsync(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_aioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_aioError(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_aioError(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_aioReturn(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_aioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_aioSuspend(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_aioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_aioCancel(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_aioCancel(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_lioListio(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_lioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getloadavg(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getloadavg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_processVmReadv(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_processVmReadv(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_processVmWritev(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_processVmWritev(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_futimes(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_futimes(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_abs(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_labs(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_rand()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_srand(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_srand(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_drand48()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_drand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_erand48(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_erand48(p0: String): Double

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_lrand48()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_lrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_nrand48(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_nrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_jrand48(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_jrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_srand48(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_srand48(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_setpwent()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_endpwent()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_endpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getpwent()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_setgrent()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_setgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_endgrent()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_endgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getgrent()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_setspent()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_setspent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_endspent()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_endspent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getspent()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getspent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getspnam(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getspnam(p0: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_shmget(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_shmget(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_shmat(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_shmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_shmdt(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_shmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_shmctl(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_shmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_errnoLocation()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_errnoLocation(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_mremap(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_mremap(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_glob(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_glob(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_globfree(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_globfree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_seekdir(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_telldir(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_telldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_madvise(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_nlLanginfo(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_nlLanginfo(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_nlLanginfoL(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_nlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_schedGetaffinity(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_schedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMax(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_settimeofday(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_settimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_semTimedwait(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_semTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_semGetvalue(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_semGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_mount(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_mount(p0: String?, p1: String?, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_prctl(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_prctl(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_ppoll(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_ppoll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_sethostname(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_sethostname(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMin(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMin(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_sysinfo(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_sysinfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_sigsuspend(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_sigsuspend(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_semClose(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_semClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_initgroups(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getgrnam(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrnam(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_semUnlink(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_semUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_daemon(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_sigwait(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_sigwait(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getgrgid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrgid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_popen(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_popen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_dlIteratePhdr(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_dlIteratePhdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_setmntent(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_setmntent(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getmntent(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getmntent(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_addmntent(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_addmntent(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_endmntent(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_endmntent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_hasmntopt(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_hasmntopt(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_regcomp(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_regcomp(p0: String, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_regexec(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_regexec(p0: String, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_regerror(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_regerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_regfree(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_regfree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_iconvOpen(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_iconvOpen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_iconv(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_iconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_iconvClose(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_iconvClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_gettid()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_gettid(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_timerCreate(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_timerCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_timerDelete(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_timerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_timerGetoverrun(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_timerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_timerGettime(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_timerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_timerSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_timerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_memmem(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_memmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_schedGetcpu()")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_schedGetcpu(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_getoptLong(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_getoptLong(p0: Int, p1: String, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_copyFileRange(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_copyFileRange(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_freopen64(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_freopen64(p0: String?, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_fseeko64(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_fseeko64(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_fsetpos64(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_fsetpos64(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_l4re_shared_ftello64(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_l4re_shared_ftello64(p0: String): String

public actual fun iopl(level: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_iopl(level) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_ioperm(from.toString(), num.toString(), turnOn) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_aioRead((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_aioWrite((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_aioFsync(op, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_aioError((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_aioReturn((aiocbp?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getloadavg((loadavg?.value ?: 0L).toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_processVmReadv(pid, (localIov?.value ?: 0L).toString(), liovcnt.toString(), (remoteIov?.value ?: 0L).toString(), riovcnt.toString(), flags.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_processVmWritev(pid, (localIov?.value ?: 0L).toString(), liovcnt.toString(), (remoteIov?.value ?: 0L).toString(), riovcnt.toString(), flags.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_futimes(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_drand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_erand48((xseed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_lrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_nrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_jrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_srand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setpwent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_setspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_endspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspent(): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getspent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnam(name: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getspnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_shmget(key, size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_shmdt((shmaddr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_errnoLocation().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_mremap((addr?.value ?: 0L).toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_nlLanginfo(item).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_nlLanginfoL(item, (locale?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_schedGetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_mount(src, target, fstype, flags.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_prctl(option, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_ppoll((fds?.value ?: 0L).toString(), nfds.toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_sethostname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(info: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_sysinfo((info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_initgroups(user, group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_faccessat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_setmntent(filename, ty).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getmntent((stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_addmntent((stream?.handle ?: 0L).toString(), (mnt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endmntent(streamp: FILE?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_endmntent((streamp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_hasmntopt((mnt?.value ?: 0L).toString(), opt).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_l4re_shared_regfree((preg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_iconvOpen(tocode, fromcode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_iconvClose((cd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettid(): PidT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_gettid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_timerCreate(clockid, (sevp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_timerDelete((timerid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_timerGetoverrun((timerid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_timerGettime((timerid?.value ?: 0L).toString(), (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_timerSettime((timerid?.value ?: 0L).toString(), flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_schedGetcpu() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileRange(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_copyFileRange(fdIn, (offIn?.value ?: 0L).toString(), fdOut, (offOut?.value ?: 0L).toString(), len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_freopen64(filename, mode, (file?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_fseeko64((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_fsetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: FILE?): Off64T =
    if (_unixLinuxlikeLinuxL4reSharedNapiAvailable) _wasm_libc_unix_linuxlike_linux_l4re_shared_ftello64((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
