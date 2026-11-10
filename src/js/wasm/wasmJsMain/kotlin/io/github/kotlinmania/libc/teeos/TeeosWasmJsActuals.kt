@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initTeeosNapiAddon(): Boolean

private val _teeosNapiAvailable: Boolean = _initTeeosNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_calloc(p0, p1)")
private external fun _wasm_libc_teeos_calloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_malloc(p0)")
private external fun _wasm_libc_teeos_malloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_realloc(p0, p1)")
private external fun _wasm_libc_teeos_realloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_alignedAlloc(p0, p1)")
private external fun _wasm_libc_teeos_alignedAlloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_free(p0)")
private external fun _wasm_libc_teeos_free(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_posixMemalign(p0, p1, p2)")
private external fun _wasm_libc_teeos_posixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_memchr(p0, p1, p2)")
private external fun _wasm_libc_teeos_memchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_wmemchr(p0, p1, p2)")
private external fun _wasm_libc_teeos_wmemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_memcmp(p0, p1, p2)")
private external fun _wasm_libc_teeos_memcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_memcpy(p0, p1, p2)")
private external fun _wasm_libc_teeos_memcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_memmove(p0, p1, p2)")
private external fun _wasm_libc_teeos_memmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_memset(p0, p1, p2)")
private external fun _wasm_libc_teeos_memset(p0: String, p1: Int, p2: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_teeos_pthreadSelf()")
private external fun _wasm_libc_teeos_pthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadJoin(p0, p1)")
private external fun _wasm_libc_teeos_pthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadExit(p0)")
private external fun _wasm_libc_teeos_pthreadExit(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadAttrInit(p0)")
private external fun _wasm_libc_teeos_pthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadAttrDestroy(p0)")
private external fun _wasm_libc_teeos_pthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_teeos_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadAttrSetstacksize(p0, p1)")
private external fun _wasm_libc_teeos_pthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadAttrGetstacksize(p0, p1)")
private external fun _wasm_libc_teeos_pthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_teeos_pthreadAttrSettee(p0, p1, p2, p3)")
private external fun _wasm_libc_teeos_pthreadAttrSettee(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_teeos_schedYield()")
private external fun _wasm_libc_teeos_schedYield(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadKeyCreate(p0, p1)")
private external fun _wasm_libc_teeos_pthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadKeyDelete(p0)")
private external fun _wasm_libc_teeos_pthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadGetspecific(p0)")
private external fun _wasm_libc_teeos_pthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadSetspecific(p0, p1)")
private external fun _wasm_libc_teeos_pthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexDestroy(p0)")
private external fun _wasm_libc_teeos_pthreadMutexDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexInit(p0, p1)")
private external fun _wasm_libc_teeos_pthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexLock(p0)")
private external fun _wasm_libc_teeos_pthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexTrylock(p0)")
private external fun _wasm_libc_teeos_pthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexUnlock(p0)")
private external fun _wasm_libc_teeos_pthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexattrDestroy(p0)")
private external fun _wasm_libc_teeos_pthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexattrInit(p0)")
private external fun _wasm_libc_teeos_pthreadMutexattrInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexattrSettype(p0, p1)")
private external fun _wasm_libc_teeos_pthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexattrSetpshared(p0, p1)")
private external fun _wasm_libc_teeos_pthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadCondBroadcast(p0)")
private external fun _wasm_libc_teeos_pthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadCondDestroy(p0)")
private external fun _wasm_libc_teeos_pthreadCondDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadCondInit(p0, p1)")
private external fun _wasm_libc_teeos_pthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadCondSignal(p0)")
private external fun _wasm_libc_teeos_pthreadCondSignal(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadCondWait(p0, p1)")
private external fun _wasm_libc_teeos_pthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_pthreadCondTimedwait(p0, p1, p2)")
private external fun _wasm_libc_teeos_pthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexattrSetrobust(p0, p1)")
private external fun _wasm_libc_teeos_pthreadMutexattrSetrobust(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_teeos_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_teeos_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadSpinInit(p0, p1)")
private external fun _wasm_libc_teeos_pthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadSpinDestroy(p0)")
private external fun _wasm_libc_teeos_pthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadSpinLock(p0)")
private external fun _wasm_libc_teeos_pthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadSpinTrylock(p0)")
private external fun _wasm_libc_teeos_pthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_pthreadSpinUnlock(p0)")
private external fun _wasm_libc_teeos_pthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadSetschedprio(p0, p1)")
private external fun _wasm_libc_teeos_pthreadSetschedprio(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadOnce(p0, p1)")
private external fun _wasm_libc_teeos_pthreadOnce(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadEqual(p0, p1)")
private external fun _wasm_libc_teeos_pthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pthreadMutexattrSetprotocol(p0, p1)")
private external fun _wasm_libc_teeos_pthreadMutexattrSetprotocol(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_pthreadAttrSetstack(p0, p1, p2)")
private external fun _wasm_libc_teeos_pthreadAttrSetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_pthreadSetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_teeos_pthreadSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_pthreadGetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_teeos_pthreadGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_teeos_printf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_teeos_printf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_teeos_scanf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_teeos_scanf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_teeos_snprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_teeos_snprintf(p0: String, p1: String, p2: String?, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_teeos_sprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_teeos_sprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_teeos_vsnprintf(p0, p1, p2, p3)")
private external fun _wasm_libc_teeos_vsnprintf(p0: String, p1: String, p2: String?, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_vsprintf(p0, p1, p2)")
private external fun _wasm_libc_teeos_vsprintf(p0: String, p1: String?, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_teeos_abort()")
private external fun _wasm_libc_teeos_abort()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_schedGetaffinity(p0, p1, p2)")
private external fun _wasm_libc_teeos_schedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_schedSetaffinity(p0, p1, p2)")
private external fun _wasm_libc_teeos_schedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_sysconf(p0)")
private external fun _wasm_libc_teeos_sysconf(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_teeos_mmap(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_teeos_mmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_munmap(p0, p1)")
private external fun _wasm_libc_teeos_munmap(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_teeos_errnoLocation()")
private external fun _wasm_libc_teeos_errnoLocation(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_strerror(p0)")
private external fun _wasm_libc_teeos_strerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_clockGettime(p0, p1)")
private external fun _wasm_libc_teeos_clockGettime(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_teeos_getpid()")
private external fun _wasm_libc_teeos_getpid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_gettimeofday(p0, p1)")
private external fun _wasm_libc_teeos_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_teeos_strftime(p0, p1, p2, p3)")
private external fun _wasm_libc_teeos_strftime(p0: String, p1: String, p2: String?, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_time(p0)")
private external fun _wasm_libc_teeos_time(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_semClose(p0)")
private external fun _wasm_libc_teeos_semClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_semDestroy(p0)")
private external fun _wasm_libc_teeos_semDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_semGetvalue(p0, p1)")
private external fun _wasm_libc_teeos_semGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_semInit(p0, p1, p2)")
private external fun _wasm_libc_teeos_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_teeos_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_teeos_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_semPost(p0)")
private external fun _wasm_libc_teeos_semPost(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_semUnlink(p0)")
private external fun _wasm_libc_teeos_semUnlink(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_semWait(p0)")
private external fun _wasm_libc_teeos_semWait(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_setlocale(p0, p1)")
private external fun _wasm_libc_teeos_setlocale(p0: Int, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_strcoll(p0, p1)")
private external fun _wasm_libc_teeos_strcoll(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_strxfrm(p0, p1, p2)")
private external fun _wasm_libc_teeos_strxfrm(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_strtod(p0, p1)")
private external fun _wasm_libc_teeos_strtod(p0: String?, p1: String): Double

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_teeos_mbrtowc(p0, p1, p2, p3)")
private external fun _wasm_libc_teeos_mbrtowc(p0: String, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_wcrtomb(p0, p1, p2)")
private external fun _wasm_libc_teeos_wcrtomb(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_wctob(p0)")
private external fun _wasm_libc_teeos_wctob(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_srandom(p0)")
private external fun _wasm_libc_teeos_srandom(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_initstate(p0, p1, p2)")
private external fun _wasm_libc_teeos_initstate(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_setstate(p0)")
private external fun _wasm_libc_teeos_setstate(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_teeos_random()")
private external fun _wasm_libc_teeos_random(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_strchr(p0, p1)")
private external fun _wasm_libc_teeos_strchr(p0: String?, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_strlen(p0)")
private external fun _wasm_libc_teeos_strlen(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_strcmp(p0, p1)")
private external fun _wasm_libc_teeos_strcmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_strcpy(p0, p1)")
private external fun _wasm_libc_teeos_strcpy(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_strncmp(p0, p1, p2)")
private external fun _wasm_libc_teeos_strncmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_strncpy(p0, p1, p2)")
private external fun _wasm_libc_teeos_strncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_strnlen(p0, p1)")
private external fun _wasm_libc_teeos_strnlen(p0: String?, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_strrchr(p0, p1)")
private external fun _wasm_libc_teeos_strrchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_strstr(p0, p1)")
private external fun _wasm_libc_teeos_strstr(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_wcschr(p0, p1)")
private external fun _wasm_libc_teeos_wcschr(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_wcslen(p0)")
private external fun _wasm_libc_teeos_wcslen(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_isalpha(p0)")
private external fun _wasm_libc_teeos_isalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_isascii(p0)")
private external fun _wasm_libc_teeos_isascii(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_isdigit(p0)")
private external fun _wasm_libc_teeos_isdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_islower(p0)")
private external fun _wasm_libc_teeos_islower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_isprint(p0)")
private external fun _wasm_libc_teeos_isprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_isspace(p0)")
private external fun _wasm_libc_teeos_isspace(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_iswctype(p0, p1)")
private external fun _wasm_libc_teeos_iswctype(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_iswdigit(p0)")
private external fun _wasm_libc_teeos_iswdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_iswlower(p0)")
private external fun _wasm_libc_teeos_iswlower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_iswspace(p0)")
private external fun _wasm_libc_teeos_iswspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_iswupper(p0)")
private external fun _wasm_libc_teeos_iswupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_towupper(p0)")
private external fun _wasm_libc_teeos_towupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_towlower(p0)")
private external fun _wasm_libc_teeos_towlower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_atan(p0)")
private external fun _wasm_libc_teeos_atan(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_ceil(p0)")
private external fun _wasm_libc_teeos_ceil(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_ceilf(p0)")
private external fun _wasm_libc_teeos_ceilf(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_exp(p0)")
private external fun _wasm_libc_teeos_exp(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_fabs(p0)")
private external fun _wasm_libc_teeos_fabs(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_floor(p0)")
private external fun _wasm_libc_teeos_floor(p0: Double): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_frexp(p0, p1)")
private external fun _wasm_libc_teeos_frexp(p0: Double, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_log(p0)")
private external fun _wasm_libc_teeos_log(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_log2(p0)")
private external fun _wasm_libc_teeos_log2(p0: Double): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_pow(p0, p1)")
private external fun _wasm_libc_teeos_pow(p0: Double, p1: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_roundf(p0)")
private external fun _wasm_libc_teeos_roundf(p0: Double): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_scalbn(p0, p1)")
private external fun _wasm_libc_teeos_scalbn(p0: Double, p1: Int): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_sqrt(p0)")
private external fun _wasm_libc_teeos_sqrt(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_abs(p0)")
private external fun _wasm_libc_teeos_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_atof(p0)")
private external fun _wasm_libc_teeos_atof(p0: String?): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_atoi(p0)")
private external fun _wasm_libc_teeos_atoi(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_atol(p0)")
private external fun _wasm_libc_teeos_atol(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_atoll(p0)")
private external fun _wasm_libc_teeos_atoll(p0: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_teeos_bsearch(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_teeos_bsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_teeos_ecvt(p0, p1, p2, p3)")
private external fun _wasm_libc_teeos_ecvt(p0: Double, p1: Int, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_imaxabs(p0)")
private external fun _wasm_libc_teeos_imaxabs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_teeos_llabs(p0)")
private external fun _wasm_libc_teeos_llabs(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_teeos_qsort(p0, p1, p2, p3)")
private external fun _wasm_libc_teeos_qsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_strtoul(p0, p1, p2)")
private external fun _wasm_libc_teeos_strtoul(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_teeos_strtol(p0, p1, p2)")
private external fun _wasm_libc_teeos_strtol(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_teeos_wcstod(p0, p1)")
private external fun _wasm_libc_teeos_wcstod(p0: String, p1: String): Double

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_calloc(nobj.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_malloc(size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_realloc((p?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_alignedAlloc(align.toString(), len.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: COpaquePointer?) {
    if (_teeosNapiAvailable) {
        _wasm_libc_teeos_free((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_posixMemalign((memptr?.value ?: 0L).toString(), align.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_memchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_wmemchr((cx?.value ?: 0L).toString(), c.toInt(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_memset((dest?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadSelf().toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadJoin(native.toLong().toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    if (_teeosNapiAvailable) {
        _wasm_libc_teeos_pthreadExit((value?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadAttrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadAttrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stackSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSettee(attr: COpaquePointer?, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadAttrSettee((attr?.value ?: 0L).toString(), ca, taskId, shadow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_schedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadKeyDelete(key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadGetspecific(key.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadSetspecific(key.toInt(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadCondBroadcast((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadCondDestroy((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadCondSignal((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadCondWait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexattrSetrobust((attr?.value ?: 0L).toString(), robustness) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadSpinDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadSpinLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadSpinTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadSpinUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadSetschedprio(native.toLong().toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(pot: COpaquePointer?, f: OnceFn?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadOnce((pot?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadEqual(p1.toLong().toString(), p2.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(a: COpaquePointer?, protocol: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadMutexattrSetprotocol((a?.value ?: 0L).toString(), protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stack: COpaquePointer?, size: SizeT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadAttrSetstack((attr?.value ?: 0L).toString(), (stack?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadSetaffinityNp(td.toLong().toString(), size.toString(), (set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pthreadGetaffinityNp(td.toLong().toString(), size.toString(), (set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(fmt: String?, vararg variadicArgs: Long): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_printf(fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(fmt: String?, vararg variadicArgs: Long): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_scanf(fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, fmt: String?, vararg variadicArgs: Long): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_snprintf((s?.value ?: 0L).toString(), n.toString(), fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_sprintf((s?.value ?: 0L).toString(), fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_vsnprintf((s?.value ?: 0L).toString(), n.toString(), fmt, (ap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_vsprintf((s?.value ?: 0L).toString(), fmt, (ap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abort(): Nothing {
    if (_teeosNapiAvailable) {
        _wasm_libc_teeos_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_schedGetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (_teeosNapiAvailable) _wasm_libc_teeos_sysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_munmap((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_errnoLocation().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(e: CInt): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strerror(e).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_clockGettime(clockId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_getpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_gettimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict_2: String?, restrict_3: COpaquePointer?): SizeT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strftime((restrict?.value ?: 0L).toString(), sz.toString(), restrict_2, (restrict_3?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(t: COpaquePointer?): TimeT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_time((t?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, valp: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_semGetvalue((sem?.value ?: 0L).toString(), (valp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_semOpen(name, flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_semPost((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: COpaquePointer?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_semWait((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(cat: CInt, name: String?): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_setlocale(cat, name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(l: String?, r: String?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strcoll(l, r) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strxfrm((dest?.value ?: 0L).toString(), src, n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: String?, p: COpaquePointer?): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strtod(s, (p?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbrtowc(wc: COpaquePointer?, src: String?, n: SizeT, st: COpaquePointer?): SizeT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_mbrtowc((wc?.value ?: 0L).toString(), src, n.toString(), (st?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: COpaquePointer?): SizeT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_wcrtomb((s?.value ?: 0L).toString(), wc.toInt(), (st?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctob(c: WintT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_wctob(c.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(seed: CUint) {
    if (_teeosNapiAvailable) {
        _wasm_libc_teeos_srandom(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_initstate(seed.toInt(), (state?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setstate(state: COpaquePointer?): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_setstate((state?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (_teeosNapiAvailable) _wasm_libc_teeos_random().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strchr(s, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strlen(cs).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(l: String?, r: String?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strcmp(l, r) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strcpy((dest?.value ?: 0L).toString(), src).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(l: String?, r: String?, n: SizeT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strncmp(l, r, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strncpy((dest?.value ?: 0L).toString(), src, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strnlen(cs, n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strrchr(s, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(h: String?, n: String?): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strstr(h, n).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcschr(s: COpaquePointer?, c: WcharT): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_wcschr((s?.value ?: 0L).toString(), c.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(s: COpaquePointer?): SizeT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_wcslen((s?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_isalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isascii(c: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_isascii(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_isdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_islower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_isprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_isspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_iswctype(wc.toInt(), ttype.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswdigit(wc: WintT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_iswdigit(wc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswlower(wc: WintT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_iswlower(wc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswspace(wc: WintT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_iswspace(wc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswupper(wc: WintT): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_iswupper(wc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun towupper(wc: WintT): WintT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_towupper(wc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun towlower(wc: WintT): WintT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_towlower(wc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atan(x: CDouble): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_atan(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ceil(x: CDouble): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_ceil(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ceilf(x: CFloat): CFloat =
    if (_teeosNapiAvailable) _wasm_libc_teeos_ceilf(x.toDouble()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exp(x: CDouble): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_exp(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fabs(x: CDouble): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_fabs(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun floor(x: CDouble): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_floor(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frexp(x: CDouble, e: COpaquePointer?): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_frexp(x, (e?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun log(x: CDouble): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_log(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun log2(x: CDouble): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_log2(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_pow(x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun roundf(x: CFloat): CFloat =
    if (_teeosNapiAvailable) _wasm_libc_teeos_roundf(x.toDouble()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_scalbn(x, n) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sqrt(x: CDouble): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_sqrt(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(x: CInt): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_abs(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(s: String?): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_atof(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: String?): CInt =
    if (_teeosNapiAvailable) _wasm_libc_teeos_atoi(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: String?): CLong =
    if (_teeosNapiAvailable) _wasm_libc_teeos_atol(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: String?): CLonglong =
    if (_teeosNapiAvailable) _wasm_libc_teeos_atoll(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_bsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), nel.toString(), width.toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(num: CInt, den: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecvt(x: CDouble, n: CInt, dp: COpaquePointer?, sign: COpaquePointer?): COpaquePointer? =
    if (_teeosNapiAvailable) _wasm_libc_teeos_ecvt(x, n, (dp?.value ?: 0L).toString(), (sign?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    if (_teeosNapiAvailable) _wasm_libc_teeos_imaxabs(a.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(a: CLonglong): CLonglong =
    if (_teeosNapiAvailable) _wasm_libc_teeos_llabs(a.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    if (_teeosNapiAvailable) {
        _wasm_libc_teeos_qsort((base?.value ?: 0L).toString(), nel.toString(), width.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strtoul(s, (p?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong =
    if (_teeosNapiAvailable) _wasm_libc_teeos_strtol(s, (p?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstod(s: COpaquePointer?, p: COpaquePointer?): CDouble =
    if (_teeosNapiAvailable) _wasm_libc_teeos_wcstod((s?.value ?: 0L).toString(), (p?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
