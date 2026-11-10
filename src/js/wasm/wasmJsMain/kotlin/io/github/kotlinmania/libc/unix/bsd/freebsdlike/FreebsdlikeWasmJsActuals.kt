@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
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

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixBsdFreebsdlikeNapiAddon(): Boolean

private val _unixBsdFreebsdlikeNapiAvailable: Boolean = _initUnixBsdFreebsdlikeNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_semDestroy(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_semDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_semInit(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_daemon(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_chflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_chflags(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_chflagsat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_chflagsat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_clockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_clockGetres(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_clockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_clockSettime(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_clockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_clockGetcpuclockid(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_clockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadGetcpuclockid(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_dirfd(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_dirfd(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_duplocale(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_duplocale(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_endutxent()")
private external fun _wasm_libc_unix_bsd_freebsdlike_endutxent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_fchflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_fchflags(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_fexecve(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_fexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_futimens(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getdomainname(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getdomainname(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getgrentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getgrentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getpwentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getpwentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getnameinfo(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getpriority(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getresgid(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getresuid(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getresuid(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getutxent()")
private external fun _wasm_libc_unix_bsd_freebsdlike_getutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getutxid(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getutxline(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getutxline(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_initgroups(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_kevent(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_freebsdlike_kevent(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_lchflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_lchflags(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_lutimes(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_lutimes(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_memrchr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_memrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mknodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mknodat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mallocUsableSize(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mallocUsableSize(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mincore(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_newlocale(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_newlocale(p0: Int, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_nlLanginfoL(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_nlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pipe2(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pipe2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixFadvise(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_ppoll(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_ppoll(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadAttrGetNp(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadAttrGetNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadAttrGetguardsize(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadAttrSetguardsize(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadCondattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadCondattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadMainNp()")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadMainNp(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadMutexattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadMutexattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadRwlockattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadRwlockattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadBarrierattrInit(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadBarrierattrDestroy(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadBarrierattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadBarrierattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadBarrierInit(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadBarrierDestroy(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadBarrierWait(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierWait(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadGetNameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadGetNameNp(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadSetNameNp(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadSetNameNp(p0: String, p1: String?)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadSetnameNp(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadSetnameNp(p0: String, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadSetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pthreadGetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_ptrace(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_ptrace(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_utrace(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_utrace(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pututxline(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pututxline(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_querylocale(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_querylocale(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_rtprio(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_rtprio(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_schedRrGetInterval(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_schedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_schedGetparam(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_schedSetparam(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_schedGetscheduler(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_schedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_semGetvalue(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_semGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_semTimedwait(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_semTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_sendfile(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_freebsdlike_sendfile(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_setdomainname(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_setdomainname(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_sethostname(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_sethostname(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_setresgid(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_setresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_setresuid(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_setresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_settimeofday(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_settimeofday(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_setutxent()")
private external fun _wasm_libc_unix_bsd_freebsdlike_setutxent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_sigwaitinfo(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_sigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_sysctl(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_freebsdlike_sysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_sysctlbyname(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_sysctlbyname(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_sysctlnametomib(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_sysctlnametomib(p0: String?, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_uselocale(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_uselocale(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_ntpAdjtime(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_ntpAdjtime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_ntpGettime(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_ntpGettime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_dlIteratePhdr(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_dlIteratePhdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_iconvOpen(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_iconvOpen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_iconv(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_iconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_iconvClose(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_iconvClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_explicitBzero(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_explicitBzero(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_memsetS(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_memsetS(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_gethostid()")
private external fun _wasm_libc_unix_bsd_freebsdlike_gethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_sethostid(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_sethostid(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_eui64Aton(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_eui64Aton(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_eui64Ntoa(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_eui64Ntoa(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_eui64Ntohost(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_eui64Ntohost(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_eui64Hostton(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_eui64Hostton(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_eaccess(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_eaccess(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_kenv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_kenv(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_reboot(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_reboot(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_exect(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_exect(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_execvP(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_execvP(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mkostemp(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mkostemps(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawn(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnp(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrInit(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrDestroy(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrGetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrSetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrGetsigmask(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrSetsigmask(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrGetflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrSetflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrGetpgroup(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrSetpgroup(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrGetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrSetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrGetschedparam(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnattrSetschedparam(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnFileActionsInit(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnFileActionsDestroy(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String?, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddclose(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqClose(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqGetattr(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqNotify(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqNotify(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqReceive(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqSend(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqSend(p0: String, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqSetattr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqTimedreceive(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqTimedsend(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqTimedsend(p0: String, p1: String?, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_mqUnlink(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_mqUnlink(p0: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_getentropy(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_forkpty(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_forkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_loginTty(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_loginTty(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_fparseln(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_fparseln(p0: String, p1: String, p2: String, p3: String?, p4: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_backtrace(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_backtrace(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_backtraceSymbols(p0, p1)")
private external fun _wasm_libc_unix_bsd_freebsdlike_backtraceSymbols(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_backtraceSymbolsFd(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_backtraceSymbolsFd(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_kvmOpen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_kvmOpen(p0: String?, p1: String?, p2: String?, p3: Int, p4: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_kvmClose(p0)")
private external fun _wasm_libc_unix_bsd_freebsdlike_kvmClose(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_kvmGetprocs(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_kvmGetprocs(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_kvmGetloadavg(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_freebsdlike_kvmGetloadavg(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_kvmOpenfiles(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_freebsdlike_kvmOpenfiles(p0: String?, p1: String?, p2: String?, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_kvmRead(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_kvmRead(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_freebsdlike_kvmWrite(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_freebsdlike_kvmWrite(p0: String, p1: String, p2: String, p3: String): String

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_accept4(s, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: String?, flags: CUlong): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_chflags(path, flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_chflagsat(fd, path, flags.toString(), atflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_clockGetres(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_clockGettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_clockSettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadGetcpuclockid(thread.toLong().toString(), (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_duplocale((base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endutxent() {
    if (_unixBsdFreebsdlikeNapiAvailable) {
        _wasm_libc_unix_bsd_freebsdlike_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_fchflags(fd, flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getdomainname((name?.value ?: 0L).toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getgrentR((grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getgrouplist(name, basegid.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toString(), (serv?.value ?: 0L).toString(), servlen.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getpriority(which, who) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getutxent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getutxid((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getutxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_initgroups(name, basegid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_kevent(kq, (changelist?.value ?: 0L).toString(), nchanges, (eventlist?.value ?: 0L).toString(), nevents, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_lchflags(path, flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_lutimes(file, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_memrchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mknodat(dirfd, pathname, mode.toInt(), dev.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mallocUsableSize((ptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_newlocale(mask, locale, (base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_nlLanginfoL(item, (locale?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pipe2((fds?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_ppoll((fds?.value ?: 0L).toString(), nfds.toInt(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadAttrGetNp(tid.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMainNp(): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadMainNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (shared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), shared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadBarrierWait((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    if (_unixBsdFreebsdlikeNapiAvailable) {
        _wasm_libc_unix_bsd_freebsdlike_pthreadGetNameNp(tid.toLong().toString(), (name?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    if (_unixBsdFreebsdlikeNapiAvailable) {
        _wasm_libc_unix_bsd_freebsdlike_pthreadSetNameNp(tid.toLong().toString(), name)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadGetnameNp(thread.toLong().toString(), (buffer?.value ?: 0L).toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadSetnameNp(thread.toLong().toString(), name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_ptrace(request, pid, (addr?.value ?: 0L).toString(), data) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utrace(addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_utrace((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pututxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_querylocale(mask, (loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtprio(function: CInt, pid: PidT, rtp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_rtprio(function, pid, (rtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_schedRrGetInterval(pid, (t?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: COpaquePointer?, sbytes: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_sendfile(fd, s, offset.toString(), nbytes.toString(), (hdtr?.value ?: 0L).toString(), (sbytes?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_setdomainname(name, len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_sethostname(name, len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_setpriority(which, who, prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_setresuid(ruid.toInt(), euid.toInt(), suid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (_unixBsdFreebsdlikeNapiAvailable) {
        _wasm_libc_unix_bsd_freebsdlike_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_sysctl((name?.value ?: 0L).toString(), namelen.toInt(), (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_sysctlbyname(name, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_sysctlnametomib(name, (mibp?.value ?: 0L).toString(), (sizep?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_uselocale((loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_ntpAdjtime((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_ntpGettime((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_iconvOpen(tocode, fromcode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_iconvClose((cd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    if (_unixBsdFreebsdlikeNapiAvailable) {
        _wasm_libc_unix_bsd_freebsdlike_explicitBzero((s?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_memsetS((s?.value ?: 0L).toString(), smax.toString(), c, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_gethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong) {
    if (_unixBsdFreebsdlikeNapiAvailable) {
        _wasm_libc_unix_bsd_freebsdlike_sethostid(hostid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eui64Aton(a: String?, e: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_eui64Aton(a, (e?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Ntoa(id: COpaquePointer?, a: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_eui64Ntoa((id?.value ?: 0L).toString(), (a?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_eui64Ntohost((hostname?.value ?: 0L).toString(), len.toString(), (id?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eui64Hostton(hostname: String?, id: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_eui64Hostton(hostname, (id?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(path: String?, mode: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_eaccess(path, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_kenv(action, name, (value?.value ?: 0L).toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howto: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_reboot(howto) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_exect(path, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_execvP(file, searchPath, (argv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mkostemp((template?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqClose((mqd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqGetattr((mqd?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqNotify((mqd?.value ?: 0L).toString(), (notification?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqReceive((mqd?.value ?: 0L).toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqSend((mqd?.value ?: 0L).toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqSetattr((mqd?.value ?: 0L).toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqTimedreceive((mqd?.value ?: 0L).toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqTimedsend((mqd?.value ?: 0L).toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: String?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_mqUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_loginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fparseln(stream: FILE?, len: COpaquePointer?, lineno: COpaquePointer?, delim: String?, flags: CInt): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_fparseln((stream?.handle ?: 0L).toString(), (len?.value ?: 0L).toString(), (lineno?.value ?: 0L).toString(), delim, flags).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_backtrace((addrlist?.value ?: 0L).toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_backtraceSymbols((addrlist?.value ?: 0L).toString(), len.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_backtraceSymbolsFd((addrlist?.value ?: 0L).toString(), len.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_kvmOpen(execfile, corefile, swapfile, flags, errstr).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmClose(kd: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_kvmClose((kd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_kvmGetprocs((kd?.value ?: 0L).toString(), op, arg, (cnt?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetloadavg(kd: COpaquePointer?, loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_kvmGetloadavg((kd?.value ?: 0L).toString(), (loadavg?.value ?: 0L).toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_kvmOpenfiles(execfile, corefile, swapfile, flags, (errbuf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_kvmRead((kd?.value ?: 0L).toString(), addr.toString(), (buf?.value ?: 0L).toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdFreebsdlikeNapiAvailable) _wasm_libc_unix_bsd_freebsdlike_kvmWrite((kd?.value ?: 0L).toString(), addr.toString(), (buf?.value ?: 0L).toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
