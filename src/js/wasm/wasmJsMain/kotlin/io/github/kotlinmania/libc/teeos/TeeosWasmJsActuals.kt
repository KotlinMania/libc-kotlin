@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initTeeosNapiAddon(): Boolean

private val teeosNapiAvailable: Boolean = initTeeosNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosCalloc(p0, p1)")
private external fun wasmLibcTeeosCalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosMalloc(p0)")
private external fun wasmLibcTeeosMalloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosRealloc(p0, p1)")
private external fun wasmLibcTeeosRealloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosAlignedAlloc(p0, p1)")
private external fun wasmLibcTeeosAlignedAlloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosFree(p0)")
private external fun wasmLibcTeeosFree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosPosixMemalign(p0, p1, p2)")
private external fun wasmLibcTeeosPosixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosMemchr(p0, p1, p2)")
private external fun wasmLibcTeeosMemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosWmemchr(p0, p1, p2)")
private external fun wasmLibcTeeosWmemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosMemcmp(p0, p1, p2)")
private external fun wasmLibcTeeosMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosMemcpy(p0, p1, p2)")
private external fun wasmLibcTeeosMemcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosMemmove(p0, p1, p2)")
private external fun wasmLibcTeeosMemmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosMemset(p0, p1, p2)")
private external fun wasmLibcTeeosMemset(p0: String, p1: Int, p2: String): String

@JsFun("() => globalThis.__km_napi_libc.libcTeeosPthreadSelf()")
private external fun wasmLibcTeeosPthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadJoin(p0, p1)")
private external fun wasmLibcTeeosPthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadExit(p0)")
private external fun wasmLibcTeeosPthreadExit(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadAttrInit(p0)")
private external fun wasmLibcTeeosPthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadAttrDestroy(p0)")
private external fun wasmLibcTeeosPthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcTeeosPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadAttrSetstacksize(p0, p1)")
private external fun wasmLibcTeeosPthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadAttrGetstacksize(p0, p1)")
private external fun wasmLibcTeeosPthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcTeeosPthreadAttrSettee(p0, p1, p2, p3)")
private external fun wasmLibcTeeosPthreadAttrSettee(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcTeeosSchedYield()")
private external fun wasmLibcTeeosSchedYield(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadKeyCreate(p0, p1)")
private external fun wasmLibcTeeosPthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadKeyDelete(p0)")
private external fun wasmLibcTeeosPthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadGetspecific(p0)")
private external fun wasmLibcTeeosPthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadSetspecific(p0, p1)")
private external fun wasmLibcTeeosPthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadMutexDestroy(p0)")
private external fun wasmLibcTeeosPthreadMutexDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadMutexInit(p0, p1)")
private external fun wasmLibcTeeosPthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadMutexLock(p0)")
private external fun wasmLibcTeeosPthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadMutexTrylock(p0)")
private external fun wasmLibcTeeosPthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadMutexUnlock(p0)")
private external fun wasmLibcTeeosPthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadMutexattrDestroy(p0)")
private external fun wasmLibcTeeosPthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadMutexattrInit(p0)")
private external fun wasmLibcTeeosPthreadMutexattrInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadMutexattrSettype(p0, p1)")
private external fun wasmLibcTeeosPthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadMutexattrSetpshared(p0, p1)")
private external fun wasmLibcTeeosPthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadCondBroadcast(p0)")
private external fun wasmLibcTeeosPthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadCondDestroy(p0)")
private external fun wasmLibcTeeosPthreadCondDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadCondInit(p0, p1)")
private external fun wasmLibcTeeosPthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadCondSignal(p0)")
private external fun wasmLibcTeeosPthreadCondSignal(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadCondWait(p0, p1)")
private external fun wasmLibcTeeosPthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosPthreadCondTimedwait(p0, p1, p2)")
private external fun wasmLibcTeeosPthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadMutexattrSetrobust(p0, p1)")
private external fun wasmLibcTeeosPthreadMutexattrSetrobust(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcTeeosPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcTeeosPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadSpinInit(p0, p1)")
private external fun wasmLibcTeeosPthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadSpinDestroy(p0)")
private external fun wasmLibcTeeosPthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadSpinLock(p0)")
private external fun wasmLibcTeeosPthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadSpinTrylock(p0)")
private external fun wasmLibcTeeosPthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosPthreadSpinUnlock(p0)")
private external fun wasmLibcTeeosPthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadSetschedprio(p0, p1)")
private external fun wasmLibcTeeosPthreadSetschedprio(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadOnce(p0, p1)")
private external fun wasmLibcTeeosPthreadOnce(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadEqual(p0, p1)")
private external fun wasmLibcTeeosPthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPthreadMutexattrSetprotocol(p0, p1)")
private external fun wasmLibcTeeosPthreadMutexattrSetprotocol(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosPthreadAttrSetstack(p0, p1, p2)")
private external fun wasmLibcTeeosPthreadAttrSetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosPthreadSetaffinityNp(p0, p1, p2)")
private external fun wasmLibcTeeosPthreadSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosPthreadGetaffinityNp(p0, p1, p2)")
private external fun wasmLibcTeeosPthreadGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcTeeosPrintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcTeeosPrintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcTeeosScanf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcTeeosScanf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcTeeosSnprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcTeeosSnprintf(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcTeeosSprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcTeeosSprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcTeeosVsnprintf(p0, p1, p2, p3)")
private external fun wasmLibcTeeosVsnprintf(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosVsprintf(p0, p1, p2)")
private external fun wasmLibcTeeosVsprintf(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcTeeosAbort()")
private external fun wasmLibcTeeosAbort()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosSchedGetaffinity(p0, p1, p2)")
private external fun wasmLibcTeeosSchedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosSchedSetaffinity(p0, p1, p2)")
private external fun wasmLibcTeeosSchedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosSysconf(p0)")
private external fun wasmLibcTeeosSysconf(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcTeeosMmap(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcTeeosMmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosMunmap(p0, p1)")
private external fun wasmLibcTeeosMunmap(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcTeeosErrnoLocation()")
private external fun wasmLibcTeeosErrnoLocation(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosStrerror(p0)")
private external fun wasmLibcTeeosStrerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosClockGettime(p0, p1)")
private external fun wasmLibcTeeosClockGettime(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcTeeosGetpid()")
private external fun wasmLibcTeeosGetpid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosGettimeofday(p0, p1)")
private external fun wasmLibcTeeosGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcTeeosStrftime(p0, p1, p2, p3)")
private external fun wasmLibcTeeosStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosTime(p0)")
private external fun wasmLibcTeeosTime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosSemClose(p0)")
private external fun wasmLibcTeeosSemClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosSemDestroy(p0)")
private external fun wasmLibcTeeosSemDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosSemGetvalue(p0, p1)")
private external fun wasmLibcTeeosSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosSemInit(p0, p1, p2)")
private external fun wasmLibcTeeosSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcTeeosSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcTeeosSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosSemPost(p0)")
private external fun wasmLibcTeeosSemPost(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosSemUnlink(p0)")
private external fun wasmLibcTeeosSemUnlink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosSemWait(p0)")
private external fun wasmLibcTeeosSemWait(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosSetlocale(p0, p1)")
private external fun wasmLibcTeeosSetlocale(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosStrcoll(p0, p1)")
private external fun wasmLibcTeeosStrcoll(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosStrxfrm(p0, p1, p2)")
private external fun wasmLibcTeeosStrxfrm(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosStrtod(p0, p1)")
private external fun wasmLibcTeeosStrtod(p0: String, p1: String): Double

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcTeeosMbrtowc(p0, p1, p2, p3)")
private external fun wasmLibcTeeosMbrtowc(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosWcrtomb(p0, p1, p2)")
private external fun wasmLibcTeeosWcrtomb(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosWctob(p0)")
private external fun wasmLibcTeeosWctob(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosSrandom(p0)")
private external fun wasmLibcTeeosSrandom(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosInitstate(p0, p1, p2)")
private external fun wasmLibcTeeosInitstate(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosSetstate(p0)")
private external fun wasmLibcTeeosSetstate(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcTeeosRandom()")
private external fun wasmLibcTeeosRandom(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosStrchr(p0, p1)")
private external fun wasmLibcTeeosStrchr(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosStrlen(p0)")
private external fun wasmLibcTeeosStrlen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosStrcmp(p0, p1)")
private external fun wasmLibcTeeosStrcmp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosStrcpy(p0, p1)")
private external fun wasmLibcTeeosStrcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosStrncmp(p0, p1, p2)")
private external fun wasmLibcTeeosStrncmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosStrncpy(p0, p1, p2)")
private external fun wasmLibcTeeosStrncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosStrnlen(p0, p1)")
private external fun wasmLibcTeeosStrnlen(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosStrrchr(p0, p1)")
private external fun wasmLibcTeeosStrrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosStrstr(p0, p1)")
private external fun wasmLibcTeeosStrstr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosWcschr(p0, p1)")
private external fun wasmLibcTeeosWcschr(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosWcslen(p0)")
private external fun wasmLibcTeeosWcslen(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIsalpha(p0)")
private external fun wasmLibcTeeosIsalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIsascii(p0)")
private external fun wasmLibcTeeosIsascii(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIsdigit(p0)")
private external fun wasmLibcTeeosIsdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIslower(p0)")
private external fun wasmLibcTeeosIslower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIsprint(p0)")
private external fun wasmLibcTeeosIsprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIsspace(p0)")
private external fun wasmLibcTeeosIsspace(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosIswctype(p0, p1)")
private external fun wasmLibcTeeosIswctype(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIswdigit(p0)")
private external fun wasmLibcTeeosIswdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIswlower(p0)")
private external fun wasmLibcTeeosIswlower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIswspace(p0)")
private external fun wasmLibcTeeosIswspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosIswupper(p0)")
private external fun wasmLibcTeeosIswupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosTowupper(p0)")
private external fun wasmLibcTeeosTowupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosTowlower(p0)")
private external fun wasmLibcTeeosTowlower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosAtan(p0)")
private external fun wasmLibcTeeosAtan(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosCeil(p0)")
private external fun wasmLibcTeeosCeil(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosCeilf(p0)")
private external fun wasmLibcTeeosCeilf(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosExp(p0)")
private external fun wasmLibcTeeosExp(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosFabs(p0)")
private external fun wasmLibcTeeosFabs(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosFloor(p0)")
private external fun wasmLibcTeeosFloor(p0: Double): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosFrexp(p0, p1)")
private external fun wasmLibcTeeosFrexp(p0: Double, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosLog(p0)")
private external fun wasmLibcTeeosLog(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosLog2(p0)")
private external fun wasmLibcTeeosLog2(p0: Double): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosPow(p0, p1)")
private external fun wasmLibcTeeosPow(p0: Double, p1: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosRoundf(p0)")
private external fun wasmLibcTeeosRoundf(p0: Double): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosScalbn(p0, p1)")
private external fun wasmLibcTeeosScalbn(p0: Double, p1: Int): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosSqrt(p0)")
private external fun wasmLibcTeeosSqrt(p0: Double): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosAbs(p0)")
private external fun wasmLibcTeeosAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosAtof(p0)")
private external fun wasmLibcTeeosAtof(p0: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosAtoi(p0)")
private external fun wasmLibcTeeosAtoi(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosAtol(p0)")
private external fun wasmLibcTeeosAtol(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosAtoll(p0)")
private external fun wasmLibcTeeosAtoll(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcTeeosBsearch(p0, p1, p2, p3, p4)")
private external fun wasmLibcTeeosBsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcTeeosEcvt(p0, p1, p2, p3)")
private external fun wasmLibcTeeosEcvt(p0: Double, p1: Int, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosImaxabs(p0)")
private external fun wasmLibcTeeosImaxabs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTeeosLlabs(p0)")
private external fun wasmLibcTeeosLlabs(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcTeeosQsort(p0, p1, p2, p3)")
private external fun wasmLibcTeeosQsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosStrtoul(p0, p1, p2)")
private external fun wasmLibcTeeosStrtoul(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTeeosStrtol(p0, p1, p2)")
private external fun wasmLibcTeeosStrtol(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTeeosWcstod(p0, p1)")
private external fun wasmLibcTeeosWcstod(p0: String, p1: String): Double

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosCalloc(nobj.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosMalloc(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosRealloc(p.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(align: SizeT, len: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosAlignedAlloc(align.toString(), len.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr) {
    if (teeosNapiAvailable) {
        wasmLibcTeeosFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPosixMemalign(memptr.rawAddress.toString(), align.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosMemchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosWmemchr(cx.rawAddress.toString(), c.toInt(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosMemset(dest.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadSelf().toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadJoin(native.toLong().toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: MutPtr): Nothing {
    if (teeosNapiAvailable) {
        wasmLibcTeeosPthreadExit(value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadAttrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadAttrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadAttrSetstacksize(attr.rawAddress.toString(), stackSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, size: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadAttrGetstacksize(attr.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSettee(attr: MutPtr, ca: CInt, taskId: CInt, shadow: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadAttrSettee(attr.rawAddress.toString(), ca, taskId, shadow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSchedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadKeyDelete(key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosPthreadGetspecific(key.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadSetspecific(key.toInt(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexInit(lock.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexattrSettype(attr.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadCondBroadcast(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadCondDestroy(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadCondSignal(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadCondWait(cond.rawAddress.toString(), lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadCondTimedwait(cond.rawAddress.toString(), lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexattrSetrobust(attr.rawAddress.toString(), robustness) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadSetschedprio(native.toLong().toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(pot: MutPtr, f: OnceFn?): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadOnce(pot.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadEqual(p1.toLong().toString(), p2.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(a: MutPtr, protocol: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadMutexattrSetprotocol(a.rawAddress.toString(), protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr, stack: MutPtr, size: SizeT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadAttrSetstack(attr.rawAddress.toString(), stack.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadSetaffinityNp(td.toLong().toString(), size.toString(), set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPthreadGetaffinityNp(td.toLong().toString(), size.toString(), set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosPrintf(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosScanf(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr, n: SizeT, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSnprintf(s.rawAddress.toString(), n.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSprintf(s.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(s: MutPtr, n: SizeT, fmt: ConstPtr, ap: VaList): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosVsnprintf(s.rawAddress.toString(), n.toString(), fmt.rawAddress.toString(), ap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(s: MutPtr, fmt: ConstPtr, ap: VaList): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosVsprintf(s.rawAddress.toString(), fmt.rawAddress.toString(), ap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abort(): Nothing {
    if (teeosNapiAvailable) {
        wasmLibcTeeosAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSchedGetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (teeosNapiAvailable) wasmLibcTeeosSysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosMunmap(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosErrnoLocation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(e: CInt): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosStrerror(e).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosClockGettime(clockId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (teeosNapiAvailable) wasmLibcTeeosGetpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tv: MutPtr, tz: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosGettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(restrict: MutPtr, sz: SizeT, restrict_2: ConstPtr, restrict_3: ConstPtr): SizeT =
    if (teeosNapiAvailable) wasmLibcTeeosStrftime(restrict.rawAddress.toString(), sz.toString(), restrict_2.rawAddress.toString(), restrict_3.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(t: MutPtr): TimeT =
    if (teeosNapiAvailable) wasmLibcTeeosTime(t.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr, valp: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSemGetvalue(sem.rawAddress.toString(), valp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr, flags: CInt, vararg variadicArgs: Long): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosSemOpen(name.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSemPost(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: MutPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosSemWait(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(cat: CInt, name: ConstPtr): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosSetlocale(cat, name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(l: ConstPtr, r: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosStrcoll(l.rawAddress.toString(), r.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    if (teeosNapiAvailable) wasmLibcTeeosStrxfrm(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr, p: MutPtr): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosStrtod(s.rawAddress.toString(), p.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbrtowc(wc: MutPtr, src: ConstPtr, n: SizeT, st: MutPtr): SizeT =
    if (teeosNapiAvailable) wasmLibcTeeosMbrtowc(wc.rawAddress.toString(), src.rawAddress.toString(), n.toString(), st.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcrtomb(s: MutPtr, wc: WcharT, st: MutPtr): SizeT =
    if (teeosNapiAvailable) wasmLibcTeeosWcrtomb(s.rawAddress.toString(), wc.toInt(), st.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctob(c: WintT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosWctob(c.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(seed: CUint) {
    if (teeosNapiAvailable) {
        wasmLibcTeeosSrandom(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initstate(seed: CUint, state: MutPtr, size: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosInitstate(seed.toInt(), state.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setstate(state: MutPtr): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosSetstate(state.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (teeosNapiAvailable) wasmLibcTeeosRandom().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(s: ConstPtr, c: CInt): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosStrchr(s.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr): SizeT =
    if (teeosNapiAvailable) wasmLibcTeeosStrlen(cs.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(l: ConstPtr, r: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosStrcmp(l.rawAddress.toString(), r.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dest: MutPtr, src: ConstPtr): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosStrcpy(dest.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(l: ConstPtr, r: ConstPtr, n: SizeT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosStrncmp(l.rawAddress.toString(), r.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosStrncpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr, n: SizeT): SizeT =
    if (teeosNapiAvailable) wasmLibcTeeosStrnlen(cs.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(s: ConstPtr, c: CInt): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosStrrchr(s.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(h: ConstPtr, n: ConstPtr): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosStrstr(h.rawAddress.toString(), n.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcschr(s: ConstPtr, c: WcharT): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosWcschr(s.rawAddress.toString(), c.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(s: ConstPtr): SizeT =
    if (teeosNapiAvailable) wasmLibcTeeosWcslen(s.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIsalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isascii(c: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIsascii(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIsdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIslower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIsprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIsspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswctype(wc: WintT, ttype: WctypeT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIswctype(wc.toInt(), ttype.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswdigit(wc: WintT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIswdigit(wc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswlower(wc: WintT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIswlower(wc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswspace(wc: WintT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIswspace(wc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iswupper(wc: WintT): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosIswupper(wc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun towupper(wc: WintT): WintT =
    if (teeosNapiAvailable) wasmLibcTeeosTowupper(wc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun towlower(wc: WintT): WintT =
    if (teeosNapiAvailable) wasmLibcTeeosTowlower(wc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atan(x: CDouble): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosAtan(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ceil(x: CDouble): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosCeil(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ceilf(x: CFloat): CFloat =
    if (teeosNapiAvailable) wasmLibcTeeosCeilf(x.toDouble()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exp(x: CDouble): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosExp(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fabs(x: CDouble): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosFabs(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun floor(x: CDouble): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosFloor(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frexp(x: CDouble, e: MutPtr): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosFrexp(x, e.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun log(x: CDouble): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosLog(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun log2(x: CDouble): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosLog2(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pow(x: CDouble, y: CDouble): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosPow(x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun roundf(x: CFloat): CFloat =
    if (teeosNapiAvailable) wasmLibcTeeosRoundf(x.toDouble()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scalbn(x: CDouble, n: CInt): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosScalbn(x, n) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sqrt(x: CDouble): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosSqrt(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(x: CInt): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosAbs(x) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(s: ConstPtr): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosAtof(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr): CInt =
    if (teeosNapiAvailable) wasmLibcTeeosAtoi(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr): CLong =
    if (teeosNapiAvailable) wasmLibcTeeosAtol(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr): CLonglong =
    if (teeosNapiAvailable) wasmLibcTeeosAtoll(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bsearch(key: ConstPtr, base: ConstPtr, nel: SizeT, width: SizeT, cmp: Cmpfunc): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosBsearch(key.rawAddress.toString(), base.rawAddress.toString(), nel.toString(), width.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(num: CInt, den: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecvt(x: CDouble, n: CInt, dp: MutPtr, sign: MutPtr): MutPtr =
    if (teeosNapiAvailable) MutPtr(wasmLibcTeeosEcvt(x, n, dp.rawAddress.toString(), sign.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imaxabs(a: IntmaxT): IntmaxT =
    if (teeosNapiAvailable) wasmLibcTeeosImaxabs(a.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(a: CLonglong): CLonglong =
    if (teeosNapiAvailable) wasmLibcTeeosLlabs(a.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: MutPtr, nel: SizeT, width: SizeT, cmp: Cmpfunc) {
    if (teeosNapiAvailable) {
        wasmLibcTeeosQsort(base.rawAddress.toString(), nel.toString(), width.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtoul(s: ConstPtr, p: MutPtr, base: CInt): CUlong =
    if (teeosNapiAvailable) wasmLibcTeeosStrtoul(s.rawAddress.toString(), p.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr, p: MutPtr, base: CInt): CLong =
    if (teeosNapiAvailable) wasmLibcTeeosStrtol(s.rawAddress.toString(), p.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstod(s: ConstPtr, p: MutPtr): CDouble =
    if (teeosNapiAvailable) wasmLibcTeeosWcstod(s.rawAddress.toString(), p.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
