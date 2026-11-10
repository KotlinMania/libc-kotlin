@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.MqdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeLinuxGnuNapiAddon(): Boolean

private val _unixLinuxlikeLinuxGnuNapiAvailable: Boolean = _initUnixLinuxlikeLinuxGnuNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_fgetspentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_fgetspentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_sgetspentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_sgetspentR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getspentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getspentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_qsortR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_qsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_sendmmsg(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_sendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_recvmmsg(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_recvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getrlimit64(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_setrlimit64(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_setrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_prlimit(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_prlimit(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_prlimit64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_prlimit64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_utmpname(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_utmpname(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_utmpxname(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_utmpxname(p0: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getutxent()")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getutxid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getutxline(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_pututxline(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_pututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_setutxent()")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_setutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_endutxent()")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_endutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getpt()")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getpt(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_mallopt(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_mallopt(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getentropy(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getauxval(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getauxval(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_adjtimex(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_adjtimex(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_ntpAdjtime(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_ntpAdjtime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_ntpGettime(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_ntpGettime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_clockAdjtime(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_clockAdjtime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_fanotifyMark(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_fanotifyMark(p0: Int, p1: Int, p2: String, p3: Int, p4: String?): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_preadv2(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_preadv2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_pwritev2(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_pwritev2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_preadv64v2(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_preadv64v2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_pwritev64v2(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_pwritev64v2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_renameat2(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_renameat2(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_explicitBzero(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_explicitBzero(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_reallocarray(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_reallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_ctermid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_ctermid(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_backtrace(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_backtrace(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_backtraceSymbols(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_backtraceSymbols(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_backtraceSymbolsFd(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_backtraceSymbolsFd(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_glob64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_glob64(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_globfree64(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_globfree64(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_ptrace(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_ptrace(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_pthreadAttrGetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_pthreadAttrGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_pthreadAttrSetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_pthreadAttrSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getpriority(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_pthreadRwlockattrGetkindNp(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_pthreadRwlockattrGetkindNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_pthreadRwlockattrSetkindNp(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_pthreadRwlockattrSetkindNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_pthreadTryjoinNp(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_pthreadTryjoinNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_pthreadTimedjoinNp(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_pthreadTimedjoinNp(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_mallocStats()")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_mallocStats()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_mallocInfo(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_mallocInfo(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_mallocUsableSize(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_mallocUsableSize(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getpwentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getpwentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getgrentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getgrentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_fgetpwentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_fgetpwentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_fgetgrentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_fgetgrentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_putpwent(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_putpwent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_putgrent(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_putgrent(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_sethostid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_sethostid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_memfdCreate(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_memfdCreate(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_mlock2(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_mlock2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_euidaccess(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_euidaccess(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_eaccess(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_eaccess(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_asctimeR(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_asctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_ctimeR(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_ctimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_dirname(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_dirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_posixBasename(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_posixBasename(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_gnuBasename(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_gnuBasename(p0: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_dlmopen(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_dlmopen(p0: String, p1: String?, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_dlinfo(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_dlinfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_dladdr1(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_dladdr1(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_dlvsym(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_dlvsym(p0: String, p1: String?, p2: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_mallocTrim(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_mallocTrim(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_gnuGetLibcRelease()")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_gnuGetLibcRelease(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_gnuGetLibcVersion()")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_gnuGetLibcVersion(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddchdirNp(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddchdirNp(p0: String, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddfchdirNp(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddfchdirNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddclosefromNp(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddclosefromNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddtcsetpgrpNp(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddtcsetpgrpNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_getmntentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_getmntentR(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_execveat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_execveat(p0: Int, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_closeRange(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_closeRange(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_mqNotify(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_mqNotify(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_epollPwait2(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_epollPwait2(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_mempcpy(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_mempcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_gnu_tgkill(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_gnu_tgkill(p0: Int, p1: Int, p2: Int): Int

public actual fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_fgetspentR((fp?.handle ?: 0L).toString(), (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_sgetspentR(s, (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getspentR((spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    if (_unixLinuxlikeLinuxGnuNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_gnu_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getrlimit64(resource.toInt(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_setrlimit64(resource.toInt(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getrlimit(resource.toInt(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_setrlimit(resource.toInt(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_prlimit(pid, resource.toInt(), (newLimit?.value ?: 0L).toString(), (oldLimit?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_prlimit64(pid, resource.toInt(), (newLimit?.value ?: 0L).toString(), (oldLimit?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: String?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_utmpname(file) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: String?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_utmpxname(file) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getutxent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getutxid((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getutxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_pututxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (_unixLinuxlikeLinuxGnuNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_gnu_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_unixLinuxlikeLinuxGnuNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_gnu_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpt(): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getpt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_mallopt(param, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtimex(buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_adjtimex((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_ntpAdjtime((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_ntpGettime((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_clockAdjtime(clkId, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_fanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_preadv2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_pwritev2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_preadv64v2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_pwritev64v2(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_renameat2(olddirfd, oldpath, newdirfd, newpath, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    if (_unixLinuxlikeLinuxGnuNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_gnu_explicitBzero((s?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_ctermid((s?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_backtrace((buf?.value ?: 0L).toString(), sz) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_backtraceSymbols((buffer?.value ?: 0L).toString(), len).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    if (_unixLinuxlikeLinuxGnuNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_gnu_backtraceSymbolsFd((buffer?.value ?: 0L).toString(), len, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_glob64(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: COpaquePointer?) {
    if (_unixLinuxlikeLinuxGnuNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_gnu_globfree64((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_ptrace(request.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_pthreadAttrGetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_pthreadAttrSetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getpriority(which.toInt(), who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_setpriority(which.toInt(), who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_pthreadRwlockattrGetkindNp((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_pthreadRwlockattrSetkindNp((attr?.value ?: 0L).toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_pthreadTryjoinNp(thread.toLong().toString(), (retval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_pthreadTimedjoinNp(thread.toLong().toString(), (retval?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo2(): Mallinfo2 =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocStats() {
    if (_unixLinuxlikeLinuxGnuNapiAvailable) {
        _wasm_libc_unix_linuxlike_linux_gnu_mallocStats()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_mallocInfo(options, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_mallocUsableSize((ptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getgrentR((grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_fgetpwentR((stream?.handle ?: 0L).toString(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_fgetgrentR((stream?.handle ?: 0L).toString(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putpwent(p: COpaquePointer?, stream: FILE?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_putpwent((p?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_putgrent((grp?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_sethostid(hostid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_memfdCreate(name, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_mlock2((addr?.value ?: 0L).toString(), len.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_euidaccess(pathname, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_eaccess(pathname, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_ctimeR((timep?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_dirname((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_posixBasename((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuBasename(path: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_gnuBasename(path).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_dlmopen(lmid.toString(), filename, flag).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_dlinfo((handle?.value ?: 0L).toString(), request, (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_dladdr1((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (extraInfo?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_dlvsym((handle?.value ?: 0L).toString(), symbol, version).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocTrim(pad: SizeT): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_mallocTrim(pad.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_gnuGetLibcRelease().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_gnuGetLibcVersion().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L).toString(), path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddclosefromNp((actions?.value ?: 0L).toString(), from) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_posixSpawnFileActionsAddtcsetpgrpNp((actions?.value ?: 0L).toString(), tcfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_getmntentR((stream?.handle ?: 0L).toString(), (mntbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_execveat(dirfd, pathname, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_closeRange(first.toInt(), last.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqdes: MqdT, sevp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_mqNotify(mqdes.toLong().toString(), (sevp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait2(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_epollPwait2(epfd, (events?.value ?: 0L).toString(), maxevents, (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_mempcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    if (_unixLinuxlikeLinuxGnuNapiAvailable) _wasm_libc_unix_linuxlike_linux_gnu_tgkill(tgid, tid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")
