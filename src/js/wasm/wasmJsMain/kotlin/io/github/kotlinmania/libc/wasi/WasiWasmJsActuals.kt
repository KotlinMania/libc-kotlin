@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initWasiNapiAddon(): Boolean

private val wasiNapiAvailable: Boolean = initWasiNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcWasiGetENVIRON()")
private external fun wasmLibcWasiGetENVIRON(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiSetENVIRON(p0)")
private external fun wasmLibcWasiSetENVIRON(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcWasiGetCLOCKMONOTONIC1()")
private external fun wasmLibcWasiGetCLOCKMONOTONIC1(): Int

@JsFun("() => globalThis.__km_napi_libc.libcWasiGetCLOCKREALTIME1()")
private external fun wasmLibcWasiGetCLOCKREALTIME1(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiExit(p0)")
private external fun wasmLibcWasiExit(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcWasiAbort()")
private external fun wasmLibcWasiAbort()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiAlignedAlloc(p0, p1)")
private external fun wasmLibcWasiAlignedAlloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiCalloc(p0, p1)")
private external fun wasmLibcWasiCalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFree(p0)")
private external fun wasmLibcWasiFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiGetenv(p0)")
private external fun wasmLibcWasiGetenv(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiMalloc(p0)")
private external fun wasmLibcWasiMalloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiMallocUsableSize(p0)")
private external fun wasmLibcWasiMallocUsableSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiSbrk(p0)")
private external fun wasmLibcWasiSbrk(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcWasiRand()")
private external fun wasmLibcWasiRand(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiRead(p0, p1, p2)")
private external fun wasmLibcWasiRead(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiRealloc(p0, p1)")
private external fun wasmLibcWasiRealloc(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiSetenv(p0, p1, p2)")
private external fun wasmLibcWasiSetenv(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiUnsetenv(p0)")
private external fun wasmLibcWasiUnsetenv(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcWasiClearenv()")
private external fun wasmLibcWasiClearenv(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWrite(p0, p1, p2)")
private external fun wasmLibcWasiWrite(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFopen(p0, p1)")
private external fun wasmLibcWasiFopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiFreopen(p0, p1, p2)")
private external fun wasmLibcWasiFreopen(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFclose(p0)")
private external fun wasmLibcWasiFclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiRemove(p0)")
private external fun wasmLibcWasiRemove(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiRename(p0, p1)")
private external fun wasmLibcWasiRename(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFeof(p0)")
private external fun wasmLibcWasiFeof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFerror(p0)")
private external fun wasmLibcWasiFerror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFflush(p0)")
private external fun wasmLibcWasiFflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiClearerr(p0)")
private external fun wasmLibcWasiClearerr(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiFseek(p0, p1, p2)")
private external fun wasmLibcWasiFseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFtell(p0)")
private external fun wasmLibcWasiFtell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiRewind(p0)")
private external fun wasmLibcWasiRewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFgetpos(p0, p1)")
private external fun wasmLibcWasiFgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFsetpos(p0, p1)")
private external fun wasmLibcWasiFsetpos(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiFread(p0, p1, p2, p3)")
private external fun wasmLibcWasiFread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiFwrite(p0, p1, p2, p3)")
private external fun wasmLibcWasiFwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFgetc(p0)")
private external fun wasmLibcWasiFgetc(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiGetc(p0)")
private external fun wasmLibcWasiGetc(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcWasiGetchar()")
private external fun wasmLibcWasiGetchar(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiUngetc(p0, p1)")
private external fun wasmLibcWasiUngetc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFputc(p0, p1)")
private external fun wasmLibcWasiFputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPutc(p0, p1)")
private external fun wasmLibcWasiPutc(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPutchar(p0)")
private external fun wasmLibcWasiPutchar(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFputs(p0, p1)")
private external fun wasmLibcWasiFputs(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPuts(p0)")
private external fun wasmLibcWasiPuts(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPerror(p0)")
private external fun wasmLibcWasiPerror(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiSrand(p0)")
private external fun wasmLibcWasiSrand(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiAtexit(p0)")
private external fun wasmLibcWasiAtexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiAtQuickExit(p0)")
private external fun wasmLibcWasiAtQuickExit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiQuickExit(p0)")
private external fun wasmLibcWasiQuickExit(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiPosixMemalign(p0, p1, p2)")
private external fun wasmLibcWasiPosixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiRandR(p0)")
private external fun wasmLibcWasiRandR(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcWasiRandom()")
private external fun wasmLibcWasiRandom(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiSrandom(p0)")
private external fun wasmLibcWasiSrandom(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPutenv(p0)")
private external fun wasmLibcWasiPutenv(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcWasiClock()")
private external fun wasmLibcWasiClock(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiTime(p0)")
private external fun wasmLibcWasiTime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiDifftime(p0, p1)")
private external fun wasmLibcWasiDifftime(p0: String, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiMktime(p0)")
private external fun wasmLibcWasiMktime(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiStrftime(p0, p1, p2, p3)")
private external fun wasmLibcWasiStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiGmtime(p0)")
private external fun wasmLibcWasiGmtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiGmtimeR(p0, p1)")
private external fun wasmLibcWasiGmtimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiLocaltime(p0)")
private external fun wasmLibcWasiLocaltime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiLocaltimeR(p0, p1)")
private external fun wasmLibcWasiLocaltimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiAsctimeR(p0, p1)")
private external fun wasmLibcWasiAsctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiCtimeR(p0, p1)")
private external fun wasmLibcWasiCtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiNanosleep(p0, p1)")
private external fun wasmLibcWasiNanosleep(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsalnum(p0)")
private external fun wasmLibcWasiIsalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsalpha(p0)")
private external fun wasmLibcWasiIsalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIscntrl(p0)")
private external fun wasmLibcWasiIscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsdigit(p0)")
private external fun wasmLibcWasiIsdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsgraph(p0)")
private external fun wasmLibcWasiIsgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIslower(p0)")
private external fun wasmLibcWasiIslower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsprint(p0)")
private external fun wasmLibcWasiIsprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIspunct(p0)")
private external fun wasmLibcWasiIspunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsspace(p0)")
private external fun wasmLibcWasiIsspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsupper(p0)")
private external fun wasmLibcWasiIsupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsxdigit(p0)")
private external fun wasmLibcWasiIsxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsblank(p0)")
private external fun wasmLibcWasiIsblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiTolower(p0)")
private external fun wasmLibcWasiTolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiToupper(p0)")
private external fun wasmLibcWasiToupper(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiSetvbuf(p0, p1, p2, p3)")
private external fun wasmLibcWasiSetvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiSetbuf(p0, p1)")
private external fun wasmLibcWasiSetbuf(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiFgets(p0, p1, p2)")
private external fun wasmLibcWasiFgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiAtof(p0)")
private external fun wasmLibcWasiAtof(p0: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiAtoi(p0)")
private external fun wasmLibcWasiAtoi(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiAtol(p0)")
private external fun wasmLibcWasiAtol(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiAtoll(p0)")
private external fun wasmLibcWasiAtoll(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrtod(p0, p1)")
private external fun wasmLibcWasiStrtod(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrtof(p0, p1)")
private external fun wasmLibcWasiStrtof(p0: String, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrtol(p0, p1, p2)")
private external fun wasmLibcWasiStrtol(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrtoll(p0, p1, p2)")
private external fun wasmLibcWasiStrtoll(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrtoul(p0, p1, p2)")
private external fun wasmLibcWasiStrtoul(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrtoull(p0, p1, p2)")
private external fun wasmLibcWasiStrtoull(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrcpy(p0, p1)")
private external fun wasmLibcWasiStrcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrncpy(p0, p1, p2)")
private external fun wasmLibcWasiStrncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrcat(p0, p1)")
private external fun wasmLibcWasiStrcat(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrncat(p0, p1, p2)")
private external fun wasmLibcWasiStrncat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrcmp(p0, p1)")
private external fun wasmLibcWasiStrcmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrncmp(p0, p1, p2)")
private external fun wasmLibcWasiStrncmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrcoll(p0, p1)")
private external fun wasmLibcWasiStrcoll(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrchr(p0, p1)")
private external fun wasmLibcWasiStrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrrchr(p0, p1)")
private external fun wasmLibcWasiStrrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrspn(p0, p1)")
private external fun wasmLibcWasiStrspn(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrcspn(p0, p1)")
private external fun wasmLibcWasiStrcspn(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiStrdup(p0)")
private external fun wasmLibcWasiStrdup(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrndup(p0, p1)")
private external fun wasmLibcWasiStrndup(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrpbrk(p0, p1)")
private external fun wasmLibcWasiStrpbrk(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrstr(p0, p1)")
private external fun wasmLibcWasiStrstr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrcasecmp(p0, p1)")
private external fun wasmLibcWasiStrcasecmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrncasecmp(p0, p1, p2)")
private external fun wasmLibcWasiStrncasecmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiStrlen(p0)")
private external fun wasmLibcWasiStrlen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrnlen(p0, p1)")
private external fun wasmLibcWasiStrnlen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiStrerror(p0)")
private external fun wasmLibcWasiStrerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrtok(p0, p1)")
private external fun wasmLibcWasiStrtok(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrxfrm(p0, p1, p2)")
private external fun wasmLibcWasiStrxfrm(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiMemchr(p0, p1, p2)")
private external fun wasmLibcWasiMemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiMemcmp(p0, p1, p2)")
private external fun wasmLibcWasiMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiMemcpy(p0, p1, p2)")
private external fun wasmLibcWasiMemcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiMemmove(p0, p1, p2)")
private external fun wasmLibcWasiMemmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiMemset(p0, p1, p2)")
private external fun wasmLibcWasiMemset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWasiFprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWasiFprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcWasiPrintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcWasiPrintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcWasiSnprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcWasiSnprintf(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWasiSprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWasiSprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWasiFscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWasiFscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcWasiScanf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcWasiScanf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWasiSscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWasiSscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcWasiGetcharUnlocked()")
private external fun wasmLibcWasiGetcharUnlocked(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPutcharUnlocked(p0)")
private external fun wasmLibcWasiPutcharUnlocked(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiShutdown(p0, p1)")
private external fun wasmLibcWasiShutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFstat(p0, p1)")
private external fun wasmLibcWasiFstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiMkdir(p0, p1)")
private external fun wasmLibcWasiMkdir(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStat(p0, p1)")
private external fun wasmLibcWasiStat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFdopen(p0, p1)")
private external fun wasmLibcWasiFdopen(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFileno(p0)")
private external fun wasmLibcWasiFileno(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWasiOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWasiOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiCreat(p0, p1)")
private external fun wasmLibcWasiCreat(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWasiFcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWasiFcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiOpendir(p0)")
private external fun wasmLibcWasiOpendir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFdopendir(p0)")
private external fun wasmLibcWasiFdopendir(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiReaddir(p0)")
private external fun wasmLibcWasiReaddir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiClosedir(p0)")
private external fun wasmLibcWasiClosedir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiRewinddir(p0)")
private external fun wasmLibcWasiRewinddir(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiDirfd(p0)")
private external fun wasmLibcWasiDirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiSeekdir(p0, p1)")
private external fun wasmLibcWasiSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiTelldir(p0)")
private external fun wasmLibcWasiTelldir(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcWasiOpenat(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcWasiOpenat(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiFstatat(p0, p1, p2, p3)")
private external fun wasmLibcWasiFstatat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcWasiLinkat(p0, p1, p2, p3, p4)")
private external fun wasmLibcWasiLinkat(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiMkdirat(p0, p1, p2)")
private external fun wasmLibcWasiMkdirat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiReadlinkat(p0, p1, p2, p3)")
private external fun wasmLibcWasiReadlinkat(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiRenameat(p0, p1, p2, p3)")
private external fun wasmLibcWasiRenameat(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiSymlinkat(p0, p1, p2)")
private external fun wasmLibcWasiSymlinkat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiUnlinkat(p0, p1, p2)")
private external fun wasmLibcWasiUnlinkat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiAccess(p0, p1)")
private external fun wasmLibcWasiAccess(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiClose(p0)")
private external fun wasmLibcWasiClose(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFpathconf(p0, p1)")
private external fun wasmLibcWasiFpathconf(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiGetopt(p0, p1, p2)")
private external fun wasmLibcWasiGetopt(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiIsatty(p0)")
private external fun wasmLibcWasiIsatty(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiLink(p0, p1)")
private external fun wasmLibcWasiLink(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiLseek(p0, p1, p2)")
private external fun wasmLibcWasiLseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPathconf(p0, p1)")
private external fun wasmLibcWasiPathconf(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiRmdir(p0)")
private external fun wasmLibcWasiRmdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiSleep(p0)")
private external fun wasmLibcWasiSleep(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiUnlink(p0)")
private external fun wasmLibcWasiUnlink(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiPread(p0, p1, p2, p3)")
private external fun wasmLibcWasiPread(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiPwrite(p0, p1, p2, p3)")
private external fun wasmLibcWasiPwrite(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiLstat(p0, p1)")
private external fun wasmLibcWasiLstat(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFsync(p0)")
private external fun wasmLibcWasiFsync(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFdatasync(p0)")
private external fun wasmLibcWasiFdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiSymlink(p0, p1)")
private external fun wasmLibcWasiSymlink(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiTruncate(p0, p1)")
private external fun wasmLibcWasiTruncate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFtruncate(p0, p1)")
private external fun wasmLibcWasiFtruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiGetrusage(p0, p1)")
private external fun wasmLibcWasiGetrusage(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiGettimeofday(p0, p1)")
private external fun wasmLibcWasiGettimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiTimes(p0)")
private external fun wasmLibcWasiTimes(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiStrerrorR(p0, p1, p2)")
private external fun wasmLibcWasiStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiUsleep(p0)")
private external fun wasmLibcWasiUsleep(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiSend(p0, p1, p2, p3)")
private external fun wasmLibcWasiSend(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiRecv(p0, p1, p2, p3)")
private external fun wasmLibcWasiRecv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiPoll(p0, p1, p2)")
private external fun wasmLibcWasiPoll(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiSetlocale(p0, p1)")
private external fun wasmLibcWasiSetlocale(p0: Int, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcWasiLocaleconv()")
private external fun wasmLibcWasiLocaleconv(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiReadlink(p0, p1, p2)")
private external fun wasmLibcWasiReadlink(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiTimegm(p0)")
private external fun wasmLibcWasiTimegm(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiSysconf(p0)")
private external fun wasmLibcWasiSysconf(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWasiIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWasiIoctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiFseeko(p0, p1, p2)")
private external fun wasmLibcWasiFseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFtello(p0)")
private external fun wasmLibcWasiFtello(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiPosixFallocate(p0, p1, p2)")
private external fun wasmLibcWasiPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiStrcasestr(p0, p1)")
private external fun wasmLibcWasiStrcasestr(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiGetline(p0, p1, p2)")
private external fun wasmLibcWasiGetline(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcWasiFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWritev(p0, p1, p2)")
private external fun wasmLibcWasiWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiReadv(p0, p1, p2)")
private external fun wasmLibcWasiReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiPwritev(p0, p1, p2, p3)")
private external fun wasmLibcWasiPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiPreadv(p0, p1, p2, p3)")
private external fun wasmLibcWasiPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiPosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcWasiPosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFutimens(p0, p1)")
private external fun wasmLibcWasiFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcWasiUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiGetentropy(p0, p1)")
private external fun wasmLibcWasiGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiMemrchr(p0, p1, p2)")
private external fun wasmLibcWasiMemrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiAbs(p0)")
private external fun wasmLibcWasiAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiLabs(p0)")
private external fun wasmLibcWasiLabs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiDuplocale(p0)")
private external fun wasmLibcWasiDuplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiFreelocale(p0)")
private external fun wasmLibcWasiFreelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiNewlocale(p0, p1, p2)")
private external fun wasmLibcWasiNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiUselocale(p0)")
private external fun wasmLibcWasiUselocale(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcWasiSchedYield()")
private external fun wasmLibcWasiSchedYield(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiGetcwd(p0, p1)")
private external fun wasmLibcWasiGetcwd(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiChdir(p0)")
private external fun wasmLibcWasiChdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiNlLanginfo(p0)")
private external fun wasmLibcWasiNlLanginfo(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiNlLanginfoL(p0, p1)")
private external fun wasmLibcWasiNlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcWasiSelect(p0, p1, p2, p3, p4)")
private external fun wasmLibcWasiSelect(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiWasilibcRegisterPreopenedFd(p0, p1)")
private external fun wasmLibcWasiWasilibcRegisterPreopenedFd(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiWasilibcFdRenumber(p0, p1)")
private external fun wasmLibcWasiWasilibcFdRenumber(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiWasilibcUnlinkat(p0, p1)")
private external fun wasmLibcWasiWasilibcUnlinkat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiWasilibcRmdirat(p0, p1)")
private external fun wasmLibcWasiWasilibcRmdirat(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiWasilibcFindRelpath(p0, p1, p2, p3)")
private external fun wasmLibcWasiWasilibcFindRelpath(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiWasilibcTell(p0)")
private external fun wasmLibcWasiWasilibcTell(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdWasilibcUnlinkat(p0, p1)")
private external fun wasmLibcWasiWasilibcNocwdWasilibcUnlinkat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdWasilibcRmdirat(p0, p1)")
private external fun wasmLibcWasiWasilibcNocwdWasilibcRmdirat(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdLinkat(p0, p1, p2, p3, p4)")
private external fun wasmLibcWasiWasilibcNocwdLinkat(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdSymlinkat(p0, p1, p2)")
private external fun wasmLibcWasiWasilibcNocwdSymlinkat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdReadlinkat(p0, p1, p2, p3)")
private external fun wasmLibcWasiWasilibcNocwdReadlinkat(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcWasiWasilibcNocwdFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdRenameat(p0, p1, p2, p3)")
private external fun wasmLibcWasiWasilibcNocwdRenameat(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdOpenatNomode(p0, p1, p2)")
private external fun wasmLibcWasiWasilibcNocwdOpenatNomode(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdFstatat(p0, p1, p2, p3)")
private external fun wasmLibcWasiWasilibcNocwdFstatat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdMkdiratNomode(p0, p1)")
private external fun wasmLibcWasiWasilibcNocwdMkdiratNomode(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcWasiWasilibcNocwdUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiWasilibcNocwdOpendirat(p0, p1)")
private external fun wasmLibcWasiWasilibcNocwdOpendirat(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWasilibcAccess(p0, p1, p2)")
private external fun wasmLibcWasiWasilibcAccess(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWasilibcStat(p0, p1, p2)")
private external fun wasmLibcWasiWasilibcStat(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWasilibcUtimens(p0, p1, p2)")
private external fun wasmLibcWasiWasilibcUtimens(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWasilibcLink(p0, p1, p2)")
private external fun wasmLibcWasiWasilibcLink(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiWasilibcLinkOldat(p0, p1, p2, p3)")
private external fun wasmLibcWasiWasilibcLinkOldat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiWasilibcLinkNewat(p0, p1, p2, p3)")
private external fun wasmLibcWasiWasilibcLinkNewat(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWasilibcRenameOldat(p0, p1, p2)")
private external fun wasmLibcWasiWasilibcRenameOldat(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiWasilibcRenameNewat(p0, p1, p2)")
private external fun wasmLibcWasiWasilibcRenameNewat(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcWasiArc4random()")
private external fun wasmLibcWasiArc4random(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiArc4randomBuf(p0, p1)")
private external fun wasmLibcWasiArc4randomBuf(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiArc4randomUniform(p0)")
private external fun wasmLibcWasiArc4randomUniform(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcWasiErrnoLocation()")
private external fun wasmLibcWasiErrnoLocation(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiChmod(p0, p1)")
private external fun wasmLibcWasiChmod(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiFchmod(p0, p1)")
private external fun wasmLibcWasiFchmod(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiRealpath(p0, p1)")
private external fun wasmLibcWasiRealpath(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcWasiPthreadSelf()")
private external fun wasmLibcWasiPthreadSelf(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcWasiPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadEqual(p0, p1)")
private external fun wasmLibcWasiPthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadJoin(p0, p1)")
private external fun wasmLibcWasiPthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadAttrInit(p0)")
private external fun wasmLibcWasiPthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadAttrDestroy(p0)")
private external fun wasmLibcWasiPthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadAttrGetstacksize(p0, p1)")
private external fun wasmLibcWasiPthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadAttrSetstacksize(p0, p1)")
private external fun wasmLibcWasiPthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadAttrSetdetachstate(p0, p1)")
private external fun wasmLibcWasiPthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadDetach(p0)")
private external fun wasmLibcWasiPthreadDetach(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadKeyCreate(p0, p1)")
private external fun wasmLibcWasiPthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadKeyDelete(p0)")
private external fun wasmLibcWasiPthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadGetspecific(p0)")
private external fun wasmLibcWasiPthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadSetspecific(p0, p1)")
private external fun wasmLibcWasiPthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadMutexInit(p0, p1)")
private external fun wasmLibcWasiPthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadMutexDestroy(p0)")
private external fun wasmLibcWasiPthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadMutexLock(p0)")
private external fun wasmLibcWasiPthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadMutexTrylock(p0)")
private external fun wasmLibcWasiPthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadMutexUnlock(p0)")
private external fun wasmLibcWasiPthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadMutexattrInit(p0)")
private external fun wasmLibcWasiPthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadMutexattrDestroy(p0)")
private external fun wasmLibcWasiPthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadMutexattrSettype(p0, p1)")
private external fun wasmLibcWasiPthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadCondInit(p0, p1)")
private external fun wasmLibcWasiPthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadCondWait(p0, p1)")
private external fun wasmLibcWasiPthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiPthreadCondTimedwait(p0, p1, p2)")
private external fun wasmLibcWasiPthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadCondSignal(p0)")
private external fun wasmLibcWasiPthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadCondBroadcast(p0)")
private external fun wasmLibcWasiPthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadCondDestroy(p0)")
private external fun wasmLibcWasiPthreadCondDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadCondattrInit(p0)")
private external fun wasmLibcWasiPthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadCondattrDestroy(p0)")
private external fun wasmLibcWasiPthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiPthreadRwlockInit(p0, p1)")
private external fun wasmLibcWasiPthreadRwlockInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadRwlockDestroy(p0)")
private external fun wasmLibcWasiPthreadRwlockDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadRwlockRdlock(p0)")
private external fun wasmLibcWasiPthreadRwlockRdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadRwlockTryrdlock(p0)")
private external fun wasmLibcWasiPthreadRwlockTryrdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadRwlockWrlock(p0)")
private external fun wasmLibcWasiPthreadRwlockWrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadRwlockTrywrlock(p0)")
private external fun wasmLibcWasiPthreadRwlockTrywrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadRwlockUnlock(p0)")
private external fun wasmLibcWasiPthreadRwlockUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadRwlockattrInit(p0)")
private external fun wasmLibcWasiPthreadRwlockattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiPthreadRwlockattrDestroy(p0)")
private external fun wasmLibcWasiPthreadRwlockattrDestroy(p0: String): Int

public actual var ENVIRON: MutPtr
    get() = if (wasiNapiAvailable) MutPtr(wasmLibcWasiGetENVIRON().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (wasiNapiAvailable) {
            wasmLibcWasiSetENVIRON(value.rawAddress.toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual val CLOCK_MONOTONIC1: UByte
    get() = if (wasiNapiAvailable) wasmLibcWasiGetCLOCKMONOTONIC1().toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual val CLOCK_REALTIME1: UByte
    get() = if (wasiNapiAvailable) wasmLibcWasiGetCLOCKREALTIME1().toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exit(code: CInt): Nothing {
    if (wasiNapiAvailable) {
        wasmLibcWasiExit(code)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (wasiNapiAvailable) {
        wasmLibcWasiAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiAlignedAlloc(a.toString(), b.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(amt: SizeT, amt2: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiCalloc(amt.toString(), amt2.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(ptr: MutPtr) {
    if (wasiNapiAvailable) {
        wasmLibcWasiFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getenv(s: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiGetenv(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(amt: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiMalloc(amt.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    if (wasiNapiAvailable) wasmLibcWasiMallocUsableSize(ptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiSbrk(increment.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (wasiNapiAvailable) wasmLibcWasiRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, ptr: MutPtr, size: SizeT): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiRead(fd, ptr.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: MutPtr, amt: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiRealloc(ptr.rawAddress.toString(), amt.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(k: ConstPtr, v: ConstPtr, a: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiSetenv(k.rawAddress.toString(), v.rawAddress.toString(), a) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(k: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiUnsetenv(k.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (wasiNapiAvailable) wasmLibcWasiClearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, ptr: ConstPtr, size: SizeT): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiWrite(fd, ptr.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(a: ConstPtr, b: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiFopen(a.rawAddress.toString(), b.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(a: ConstPtr, b: ConstPtr, f: MutPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiFreopen(a.rawAddress.toString(), b.rawAddress.toString(), f.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFclose(f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(a: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiRemove(a.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(a: ConstPtr, b: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiRename(a.rawAddress.toString(), b.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFeof(f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFerror(f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFflush(f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(f: MutPtr) {
    if (wasiNapiAvailable) {
        wasmLibcWasiClearerr(f.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fseek(f: MutPtr, b: CLong, c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFseek(f.rawAddress.toString(), b.toString(), c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(f: MutPtr): CLong =
    if (wasiNapiAvailable) wasmLibcWasiFtell(f.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(f: MutPtr) {
    if (wasiNapiAvailable) {
        wasmLibcWasiRewind(f.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(f: MutPtr, pos: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFgetpos(f.rawAddress.toString(), pos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(f: MutPtr, pos: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFsetpos(f.rawAddress.toString(), pos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(buf: MutPtr, a: SizeT, b: SizeT, f: MutPtr): SizeT =
    if (wasiNapiAvailable) wasmLibcWasiFread(buf.rawAddress.toString(), a.toString(), b.toString(), f.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(buf: ConstPtr, a: SizeT, b: SizeT, f: MutPtr): SizeT =
    if (wasiNapiAvailable) wasmLibcWasiFwrite(buf.rawAddress.toString(), a.toString(), b.toString(), f.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFgetc(f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getc(f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiGetc(f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (wasiNapiAvailable) wasmLibcWasiGetchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(a: CInt, f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiUngetc(a, f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(a: CInt, f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFputc(a, f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putc(a: CInt, f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPutc(a, f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(a: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPutchar(a) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(a: ConstPtr, f: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFputs(a.rawAddress.toString(), f.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(a: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPuts(a.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(a: ConstPtr) {
    if (wasiNapiAvailable) {
        wasmLibcWasiPerror(a.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srand(a: CUint) {
    if (wasiNapiAvailable) {
        wasmLibcWasiSrand(a.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atexit(a: AtexitACallback): CInt =
    if (wasiNapiAvailable) wasmLibcWasiAtexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atQuickExit(a: AtexitACallback): CInt =
    if (wasiNapiAvailable) wasmLibcWasiAtQuickExit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quickExit(a: CInt): Nothing {
    if (wasiNapiAvailable) {
        wasmLibcWasiQuickExit(a)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: MutPtr, b: SizeT, c: SizeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPosixMemalign(a.rawAddress.toString(), b.toString(), c.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randR(a: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiRandR(a.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (wasiNapiAvailable) wasmLibcWasiRandom().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(a: CUint) {
    if (wasiNapiAvailable) {
        wasmLibcWasiSrandom(a.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun putenv(a: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPutenv(a.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (wasiNapiAvailable) wasmLibcWasiClock().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(a: MutPtr): TimeT =
    if (wasiNapiAvailable) wasmLibcWasiTime(a.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    if (wasiNapiAvailable) wasmLibcWasiDifftime(a.toString(), b.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(a: MutPtr): TimeT =
    if (wasiNapiAvailable) wasmLibcWasiMktime(a.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(a: MutPtr, b: SizeT, c: ConstPtr, d: ConstPtr): SizeT =
    if (wasiNapiAvailable) wasmLibcWasiStrftime(a.rawAddress.toString(), b.toString(), c.rawAddress.toString(), d.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(a: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiGmtime(a.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(a: ConstPtr, b: MutPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiGmtimeR(a.rawAddress.toString(), b.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(a: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiLocaltime(a.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(a: ConstPtr, b: MutPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiLocaltimeR(a.rawAddress.toString(), b.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(a: ConstPtr, b: MutPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiAsctimeR(a.rawAddress.toString(), b.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(a: ConstPtr, b: MutPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiCtimeR(a.rawAddress.toString(), b.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(a: ConstPtr, b: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiNanosleep(a.rawAddress.toString(), b.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(a: ClockidT, b: MutPtr): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(a: ClockidT, b: MutPtr): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: ConstPtr, c: MutPtr): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalnum(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIslower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIspunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiTolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiToupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    if (wasiNapiAvailable) {
        wasmLibcWasiSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(s: ConstPtr): CDouble =
    if (wasiNapiAvailable) wasmLibcWasiAtof(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiAtoi(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr): CLong =
    if (wasiNapiAvailable) wasmLibcWasiAtol(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr): CLonglong =
    if (wasiNapiAvailable) wasmLibcWasiAtoll(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    if (wasiNapiAvailable) wasmLibcWasiStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    if (wasiNapiAvailable) wasmLibcWasiStrtof(s.rawAddress.toString(), endp.rawAddress.toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    if (wasiNapiAvailable) wasmLibcWasiStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    if (wasiNapiAvailable) wasmLibcWasiStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    if (wasiNapiAvailable) wasmLibcWasiStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    if (wasiNapiAvailable) wasmLibcWasiStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrcat(s.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (wasiNapiAvailable) wasmLibcWasiStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (wasiNapiAvailable) wasmLibcWasiStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrdup(cs.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(cs: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrndup(cs.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr): SizeT =
    if (wasiNapiAvailable) wasmLibcWasiStrlen(cs.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT =
    if (wasiNapiAvailable) wasmLibcWasiStrnlen(cs.rawAddress.toString(), maxlen.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrerror(n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrtok(s.rawAddress.toString(), t.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    if (wasiNapiAvailable) wasmLibcWasiStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiMemchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiMemset(dest.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (wasiNapiAvailable) wasmLibcWasiGetcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPutcharUnlocked(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiShutdown(socket, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFstat(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiMkdir(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiStat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiFdopen(fd, mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFileno(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiCreat(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiOpendir(dirname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiFdopendir(fd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiReaddir(dirp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiClosedir(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr) {
    if (wasiNapiAvailable) {
        wasmLibcWasiRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dirfd(dirp: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (wasiNapiAvailable) {
        wasmLibcWasiSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (wasiNapiAvailable) wasmLibcWasiTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiOpenat(dirfd, pathname.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFstatat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiMkdirat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiReadlinkat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), bufsiz.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiUnlinkat(dirfd, pathname.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiAccess(path.rawAddress.toString(), amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiClose(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (wasiNapiAvailable) wasmLibcWasiFpathconf(filedes, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIsatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiLink(src.rawAddress.toString(), dst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (wasiNapiAvailable) wasmLibcWasiLseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    if (wasiNapiAvailable) wasmLibcWasiPathconf(path.rawAddress.toString(), name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiRmdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (wasiNapiAvailable) wasmLibcWasiSleep(secs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiUnlink(c.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiPread(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiPwrite(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiLstat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFsync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiTruncate(path.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFtruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrusage(resource: CInt, usage: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiGetrusage(resource, usage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr): ClockT =
    if (wasiNapiAvailable) wasmLibcWasiTimes(buf.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: CUint): CInt =
    if (wasiNapiAvailable) wasmLibcWasiUsleep(secs.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiSend(socket, buf.rawAddress.toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiRecv(socket, buf.rawAddress.toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPoll(fds.rawAddress.toString(), nfds.toString(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiSetlocale(category, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiLocaleconv().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsz.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr): TimeT =
    if (wasiNapiAvailable) wasmLibcWasiTimegm(tm.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (wasiNapiAvailable) wasmLibcWasiSysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (wasiNapiAvailable) wasmLibcWasiIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFseeko(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr): OffT =
    if (wasiNapiAvailable) wasmLibcWasiFtello(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiStrcasestr(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiGetline(lineptr.rawAddress.toString(), n.rawAddress.toString(), stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (wasiNapiAvailable) wasmLibcWasiPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPosixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiMemrchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (wasiNapiAvailable) wasmLibcWasiLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (wasiNapiAvailable) {
        wasmLibcWasiFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (wasiNapiAvailable) wasmLibcWasiSchedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiGetcwd(buf.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiChdir(dir.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiNlLanginfoL(item, loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiSelect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcRegisterPreopenedFd(fd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcFdRenumber(fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcUnlinkat(fd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcUnlinkat(fd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRmdirat(fd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcRmdirat(fd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcFindRelpath(path: ConstPtr, absPrefix: MutPtr, relativePath: MutPtr, relativePathLen: ULong): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcFindRelpath(path.rawAddress.toString(), absPrefix.rawAddress.toString(), relativePath.rawAddress.toString(), relativePathLen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcTell(fd: CInt): OffT =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcTell(fd).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdWasilibcUnlinkat(dirfd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdWasilibcRmdirat(dirfd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdSymlinkat(target: ConstPtr, dirfd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdSymlinkat(target.rawAddress.toString(), dirfd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: ConstPtr, buf: MutPtr, bufsize: ULong): Long =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdReadlinkat(dirfd, path.rawAddress.toString(), buf.rawAddress.toString(), bufsize.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdFaccessat(dirfd, path.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdOpenatNomode(dirfd, path.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdFstatat(dirfd, path.rawAddress.toString(), buf.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdMkdiratNomode(dirfd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcNocwdUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: ConstPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiWasilibcNocwdOpendirat(dirfd, path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcAccess(pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcAccess(pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcStat(pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcStat(pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcUtimens(pathname: ConstPtr, times: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcUtimens(pathname.rawAddress.toString(), times.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLink(oldpath: ConstPtr, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcLink(oldpath.rawAddress.toString(), newpath.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: ConstPtr, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcLinkOldat(olddirfd, oldpath.rawAddress.toString(), newpath.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLinkNewat(oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcLinkNewat(oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: ConstPtr, newpath: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcRenameOldat(olddirfd, oldpath.rawAddress.toString(), newpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRenameNewat(oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiWasilibcRenameNewat(oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (wasiNapiAvailable) wasmLibcWasiArc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(a: MutPtr, b: SizeT) {
    if (wasiNapiAvailable) {
        wasmLibcWasiArc4randomBuf(a.rawAddress.toString(), b.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(a: UInt): UInt =
    if (wasiNapiAvailable) wasmLibcWasiArc4randomUniform(a.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiErrnoLocation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiChmod(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiFchmod(fd, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiRealpath(pathname.rawAddress.toString(), resolved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiPthreadSelf().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadEqual(t1.rawAddress.toString(), t2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadJoin(native.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadAttrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadAttrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadAttrGetstacksize(attr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadAttrSetstacksize(attr.rawAddress.toString(), stackSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadDetach(thread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadKeyDelete(key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    if (wasiNapiAvailable) MutPtr(wasmLibcWasiPthreadGetspecific(key.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadSetspecific(key.toInt(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadMutexInit(lock.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadMutexDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadMutexLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadMutexTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadMutexUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadMutexattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadMutexattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadMutexattrSettype(attr.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadCondWait(cond.rawAddress.toString(), lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadCondTimedwait(cond.rawAddress.toString(), lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadCondSignal(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadCondBroadcast(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadCondDestroy(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadCondattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadCondattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadRwlockInit(lock.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadRwlockDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadRwlockRdlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadRwlockTryrdlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadRwlockWrlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadRwlockTrywrlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadRwlockUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadRwlockattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    if (wasiNapiAvailable) wasmLibcWasiPthreadRwlockattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
