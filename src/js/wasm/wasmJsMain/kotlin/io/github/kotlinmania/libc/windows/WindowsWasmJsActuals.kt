@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initWindowsNapiAddon(): Boolean

private val windowsNapiAvailable: Boolean = initWindowsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcWindowsPrintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcWindowsPrintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsFprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsFprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsalnum(p0)")
private external fun wasmLibcWindowsIsalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsalpha(p0)")
private external fun wasmLibcWindowsIsalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIscntrl(p0)")
private external fun wasmLibcWindowsIscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsdigit(p0)")
private external fun wasmLibcWindowsIsdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsgraph(p0)")
private external fun wasmLibcWindowsIsgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIslower(p0)")
private external fun wasmLibcWindowsIslower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsprint(p0)")
private external fun wasmLibcWindowsIsprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIspunct(p0)")
private external fun wasmLibcWindowsIspunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsspace(p0)")
private external fun wasmLibcWindowsIsspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsupper(p0)")
private external fun wasmLibcWindowsIsupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsxdigit(p0)")
private external fun wasmLibcWindowsIsxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsblank(p0)")
private external fun wasmLibcWindowsIsblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsTolower(p0)")
private external fun wasmLibcWindowsTolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsToupper(p0)")
private external fun wasmLibcWindowsToupper(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWindowsQsort(p0, p1, p2, p3)")
private external fun wasmLibcWindowsQsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcWindowsQsortS(p0, p1, p2, p3, p4)")
private external fun wasmLibcWindowsQsortS(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsFopen(p0, p1)")
private external fun wasmLibcWindowsFopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsFreopen(p0, p1, p2)")
private external fun wasmLibcWindowsFreopen(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsFflush(p0)")
private external fun wasmLibcWindowsFflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsFclose(p0)")
private external fun wasmLibcWindowsFclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsRemove(p0)")
private external fun wasmLibcWindowsRemove(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsRename(p0, p1)")
private external fun wasmLibcWindowsRename(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcWindowsTmpfile()")
private external fun wasmLibcWindowsTmpfile(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWindowsSetvbuf(p0, p1, p2, p3)")
private external fun wasmLibcWindowsSetvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsSetbuf(p0, p1)")
private external fun wasmLibcWindowsSetbuf(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libcWindowsGetchar()")
private external fun wasmLibcWindowsGetchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsPutchar(p0)")
private external fun wasmLibcWindowsPutchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsFgetc(p0)")
private external fun wasmLibcWindowsFgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsFgets(p0, p1, p2)")
private external fun wasmLibcWindowsFgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsFputc(p0, p1)")
private external fun wasmLibcWindowsFputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsFputs(p0, p1)")
private external fun wasmLibcWindowsFputs(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsPuts(p0)")
private external fun wasmLibcWindowsPuts(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsUngetc(p0, p1)")
private external fun wasmLibcWindowsUngetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWindowsFread(p0, p1, p2, p3)")
private external fun wasmLibcWindowsFread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWindowsFwrite(p0, p1, p2, p3)")
private external fun wasmLibcWindowsFwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsFseek(p0, p1, p2)")
private external fun wasmLibcWindowsFseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsFtell(p0)")
private external fun wasmLibcWindowsFtell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsRewind(p0)")
private external fun wasmLibcWindowsRewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsFgetpos(p0, p1)")
private external fun wasmLibcWindowsFgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsFsetpos(p0, p1)")
private external fun wasmLibcWindowsFsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsFeof(p0)")
private external fun wasmLibcWindowsFeof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsFerror(p0)")
private external fun wasmLibcWindowsFerror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsPerror(p0)")
private external fun wasmLibcWindowsPerror(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsAtof(p0)")
private external fun wasmLibcWindowsAtof(p0: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsAtoi(p0)")
private external fun wasmLibcWindowsAtoi(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsAtol(p0)")
private external fun wasmLibcWindowsAtol(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsAtoll(p0)")
private external fun wasmLibcWindowsAtoll(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrtod(p0, p1)")
private external fun wasmLibcWindowsStrtod(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrtof(p0, p1)")
private external fun wasmLibcWindowsStrtof(p0: String, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsStrtol(p0, p1, p2)")
private external fun wasmLibcWindowsStrtol(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsStrtoll(p0, p1, p2)")
private external fun wasmLibcWindowsStrtoll(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsStrtoul(p0, p1, p2)")
private external fun wasmLibcWindowsStrtoul(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsStrtoull(p0, p1, p2)")
private external fun wasmLibcWindowsStrtoull(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsCalloc(p0, p1)")
private external fun wasmLibcWindowsCalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsMalloc(p0)")
private external fun wasmLibcWindowsMalloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsMsize(p0)")
private external fun wasmLibcWindowsMsize(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsRealloc(p0, p1)")
private external fun wasmLibcWindowsRealloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsFree(p0)")
private external fun wasmLibcWindowsFree(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcWindowsAbort()")
private external fun wasmLibcWindowsAbort()

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsExit(p0)")
private external fun wasmLibcWindowsExit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsAtexit(p0)")
private external fun wasmLibcWindowsAtexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsSystem(p0)")
private external fun wasmLibcWindowsSystem(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsGetenv(p0)")
private external fun wasmLibcWindowsGetenv(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrcpy(p0, p1)")
private external fun wasmLibcWindowsStrcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsStrncpy(p0, p1, p2)")
private external fun wasmLibcWindowsStrncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrcat(p0, p1)")
private external fun wasmLibcWindowsStrcat(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsStrncat(p0, p1, p2)")
private external fun wasmLibcWindowsStrncat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrcmp(p0, p1)")
private external fun wasmLibcWindowsStrcmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsStrncmp(p0, p1, p2)")
private external fun wasmLibcWindowsStrncmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrcoll(p0, p1)")
private external fun wasmLibcWindowsStrcoll(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrchr(p0, p1)")
private external fun wasmLibcWindowsStrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrrchr(p0, p1)")
private external fun wasmLibcWindowsStrrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrspn(p0, p1)")
private external fun wasmLibcWindowsStrspn(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrcspn(p0, p1)")
private external fun wasmLibcWindowsStrcspn(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsStrdup(p0)")
private external fun wasmLibcWindowsStrdup(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrpbrk(p0, p1)")
private external fun wasmLibcWindowsStrpbrk(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrstr(p0, p1)")
private external fun wasmLibcWindowsStrstr(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsStrlen(p0)")
private external fun wasmLibcWindowsStrlen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrnlen(p0, p1)")
private external fun wasmLibcWindowsStrnlen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsStrerror(p0)")
private external fun wasmLibcWindowsStrerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStrtok(p0, p1)")
private external fun wasmLibcWindowsStrtok(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsStrxfrm(p0, p1, p2)")
private external fun wasmLibcWindowsStrxfrm(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsWcslen(p0)")
private external fun wasmLibcWindowsWcslen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsWcsnlen(p0, p1)")
private external fun wasmLibcWindowsWcsnlen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsWcstombs(p0, p1, p2)")
private external fun wasmLibcWindowsWcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsMemchr(p0, p1, p2)")
private external fun wasmLibcWindowsMemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsMemcmp(p0, p1, p2)")
private external fun wasmLibcWindowsMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsMemcpy(p0, p1, p2)")
private external fun wasmLibcWindowsMemcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsMemmove(p0, p1, p2)")
private external fun wasmLibcWindowsMemmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsMemset(p0, p1, p2)")
private external fun wasmLibcWindowsMemset(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsAbs(p0)")
private external fun wasmLibcWindowsAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsLabs(p0)")
private external fun wasmLibcWindowsLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcWindowsRand()")
private external fun wasmLibcWindowsRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsSrand(p0)")
private external fun wasmLibcWindowsSrand(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsSignal(p0, p1)")
private external fun wasmLibcWindowsSignal(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsRaise(p0)")
private external fun wasmLibcWindowsRaise(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcWindowsClock()")
private external fun wasmLibcWindowsClock(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsCtime(p0)")
private external fun wasmLibcWindowsCtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsDifftime(p0, p1)")
private external fun wasmLibcWindowsDifftime(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsGmtimeS(p0, p1)")
private external fun wasmLibcWindowsGmtimeS(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsGetDaylight(p0)")
private external fun wasmLibcWindowsGetDaylight(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsGetDstbias(p0)")
private external fun wasmLibcWindowsGetDstbias(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsGetTimezone(p0)")
private external fun wasmLibcWindowsGetTimezone(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWindowsGetTzname(p0, p1, p2, p3)")
private external fun wasmLibcWindowsGetTzname(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsLocaltimeS(p0, p1)")
private external fun wasmLibcWindowsLocaltimeS(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsTime(p0)")
private external fun wasmLibcWindowsTime(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcWindowsTzset()")
private external fun wasmLibcWindowsTzset()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsChmod(p0, p1)")
private external fun wasmLibcWindowsChmod(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsWchmod(p0, p1)")
private external fun wasmLibcWindowsWchmod(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsMkdir(p0)")
private external fun wasmLibcWindowsMkdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsWrmdir(p0)")
private external fun wasmLibcWindowsWrmdir(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsFstat(p0, p1)")
private external fun wasmLibcWindowsFstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsStat(p0, p1)")
private external fun wasmLibcWindowsStat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsWstat(p0, p1)")
private external fun wasmLibcWindowsWstat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsWutime(p0, p1)")
private external fun wasmLibcWindowsWutime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsPopen(p0, p1)")
private external fun wasmLibcWindowsPopen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsPclose(p0)")
private external fun wasmLibcWindowsPclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsFdopen(p0, p1)")
private external fun wasmLibcWindowsFdopen(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsFileno(p0)")
private external fun wasmLibcWindowsFileno(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsWopen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsWopen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsCreat(p0, p1)")
private external fun wasmLibcWindowsCreat(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsAccess(p0, p1)")
private external fun wasmLibcWindowsAccess(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsChdir(p0)")
private external fun wasmLibcWindowsChdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsClose(p0)")
private external fun wasmLibcWindowsClose(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsDup(p0)")
private external fun wasmLibcWindowsDup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsDup2(p0, p1)")
private external fun wasmLibcWindowsDup2(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsExecl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsExecl(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsWexecl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsWexecl(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsExecle(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsExecle(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsWexecle(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsWexecle(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsExeclp(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsExeclp(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsWexeclp(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsWexeclp(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsExeclpe(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsExeclpe(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcWindowsWexeclpe(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcWindowsWexeclpe(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsExecv(p0, p1)")
private external fun wasmLibcWindowsExecv(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsExecve(p0, p1, p2)")
private external fun wasmLibcWindowsExecve(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsExecvp(p0, p1)")
private external fun wasmLibcWindowsExecvp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsExecvpe(p0, p1, p2)")
private external fun wasmLibcWindowsExecvpe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsWexecv(p0, p1)")
private external fun wasmLibcWindowsWexecv(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsWexecve(p0, p1, p2)")
private external fun wasmLibcWindowsWexecve(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsWexecvp(p0, p1)")
private external fun wasmLibcWindowsWexecvp(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsWexecvpe(p0, p1, p2)")
private external fun wasmLibcWindowsWexecvpe(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsGetcwd(p0, p1)")
private external fun wasmLibcWindowsGetcwd(p0: String, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcWindowsGetpid()")
private external fun wasmLibcWindowsGetpid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsIsatty(p0)")
private external fun wasmLibcWindowsIsatty(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsLseek(p0, p1, p2)")
private external fun wasmLibcWindowsLseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsLseek64(p0, p1, p2)")
private external fun wasmLibcWindowsLseek64(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsPipe(p0, p1, p2)")
private external fun wasmLibcWindowsPipe(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsRead(p0, p1, p2)")
private external fun wasmLibcWindowsRead(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsRmdir(p0)")
private external fun wasmLibcWindowsRmdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsUnlink(p0)")
private external fun wasmLibcWindowsUnlink(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsWrite(p0, p1, p2)")
private external fun wasmLibcWindowsWrite(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsCommit(p0)")
private external fun wasmLibcWindowsCommit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsGetOsfhandle(p0)")
private external fun wasmLibcWindowsGetOsfhandle(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsOpenOsfhandle(p0, p1)")
private external fun wasmLibcWindowsOpenOsfhandle(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsSetlocale(p0, p1)")
private external fun wasmLibcWindowsSetlocale(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsWsetlocale(p0, p1)")
private external fun wasmLibcWindowsWsetlocale(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsAlignedMalloc(p0, p1)")
private external fun wasmLibcWindowsAlignedMalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsAlignedFree(p0)")
private external fun wasmLibcWindowsAlignedFree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsAlignedRealloc(p0, p1, p2)")
private external fun wasmLibcWindowsAlignedRealloc(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsPutenv(p0)")
private external fun wasmLibcWindowsPutenv(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWindowsWputenv(p0)")
private external fun wasmLibcWindowsWputenv(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsPutenvS(p0, p1)")
private external fun wasmLibcWindowsPutenvS(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsWputenvS(p0, p1)")
private external fun wasmLibcWindowsWputenvS(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWindowsListen(p0, p1)")
private external fun wasmLibcWindowsListen(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsAccept(p0, p1, p2)")
private external fun wasmLibcWindowsAccept(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsBind(p0, p1, p2)")
private external fun wasmLibcWindowsBind(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsConnect(p0, p1, p2)")
private external fun wasmLibcWindowsConnect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsGetpeername(p0, p1, p2)")
private external fun wasmLibcWindowsGetpeername(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsGetsockname(p0, p1, p2)")
private external fun wasmLibcWindowsGetsockname(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcWindowsGetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcWindowsGetsockopt(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcWindowsRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcWindowsRecvfrom(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcWindowsSendto(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcWindowsSendto(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcWindowsSetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcWindowsSetsockopt(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWindowsSocket(p0, p1, p2)")
private external fun wasmLibcWindowsSocket(p0: Int, p1: Int, p2: Int): String

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalnum(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIslower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIspunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsTolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsToupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    if (windowsNapiAvailable) {
        wasmLibcWindowsQsort(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsortS(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: MutPtr<CVoid>) {
    if (windowsNapiAvailable) {
        wasmLibcWindowsQsortS(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsFopen(filename.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFflush(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFclose(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsRemove(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr<FILE> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsTmpfile().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    if (windowsNapiAvailable) {
        wasmLibcWindowsSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsGetchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsPutchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFgetc(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFputc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFputs(s.rawAddress.toString(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsPuts(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsUngetc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsFread(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsFwrite(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFseek(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    if (windowsNapiAvailable) wasmLibcWindowsFtell(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr<FILE>) {
    if (windowsNapiAvailable) {
        wasmLibcWindowsRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFgetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFsetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFeof(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFerror(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: ConstPtr<CChar>) {
    if (windowsNapiAvailable) {
        wasmLibcWindowsPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    if (windowsNapiAvailable) wasmLibcWindowsAtof(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsAtoi(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    if (windowsNapiAvailable) wasmLibcWindowsAtol(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    if (windowsNapiAvailable) wasmLibcWindowsAtoll(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    if (windowsNapiAvailable) wasmLibcWindowsStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    if (windowsNapiAvailable) wasmLibcWindowsStrtof(s.rawAddress.toString(), endp.rawAddress.toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    if (windowsNapiAvailable) wasmLibcWindowsStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    if (windowsNapiAvailable) wasmLibcWindowsStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    if (windowsNapiAvailable) wasmLibcWindowsStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    if (windowsNapiAvailable) wasmLibcWindowsStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsCalloc(nobj.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsMalloc(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msize(p: MutPtr<CVoid>): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsMsize(p.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsRealloc(p.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr<CVoid>) {
    if (windowsNapiAvailable) {
        wasmLibcWindowsFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (windowsNapiAvailable) {
        wasmLibcWindowsAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (windowsNapiAvailable) {
        wasmLibcWindowsExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsAtexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsSystem(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsGetenv(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrcat(s.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrdup(cs.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsStrlen(cs.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsStrnlen(cs.rawAddress.toString(), maxlen.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrerror(n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsStrtok(s.rawAddress.toString(), t.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsWcslen(buf.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsnlen(str: ConstPtr<WcharT>, numberOfElements: SizeT): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsWcsnlen(str.rawAddress.toString(), numberOfElements.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    if (windowsNapiAvailable) wasmLibcWindowsWcstombs(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsMemchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsMemset(dest.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (windowsNapiAvailable) wasmLibcWindowsLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (windowsNapiAvailable) {
        wasmLibcWindowsSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (windowsNapiAvailable) wasmLibcWindowsSignal(signum, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsRaise(signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (windowsNapiAvailable) wasmLibcWindowsClock() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(sourceTime: ConstPtr<TimeT>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsCtime(sourceTime.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    if (windowsNapiAvailable) wasmLibcWindowsDifftime(timeEnd.toString(), timeStart.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeS(destTime: MutPtr<Tm>, srcTime: ConstPtr<TimeT>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsGmtimeS(destTime.rawAddress.toString(), srcTime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDaylight(hours: MutPtr<CInt>): ErrnoT =
    if (windowsNapiAvailable) wasmLibcWindowsGetDaylight(hours.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDstbias(seconds: MutPtr<CLong>): ErrnoT =
    if (windowsNapiAvailable) wasmLibcWindowsGetDstbias(seconds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimezone(seconds: MutPtr<CLong>): ErrnoT =
    if (windowsNapiAvailable) wasmLibcWindowsGetTimezone(seconds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTzname(pReturnValue: MutPtr<SizeT>, timeZoneName: MutPtr<CChar>, sizeInBytes: SizeT, index: CInt): ErrnoT =
    if (windowsNapiAvailable) wasmLibcWindowsGetTzname(pReturnValue.rawAddress.toString(), timeZoneName.rawAddress.toString(), sizeInBytes.toString(), index) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeS(tmDest: MutPtr<Tm>, sourceTime: ConstPtr<TimeT>): ErrnoT =
    if (windowsNapiAvailable) wasmLibcWindowsLocaltimeS(tmDest.rawAddress.toString(), sourceTime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(destTime: MutPtr<TimeT>): TimeT =
    if (windowsNapiAvailable) wasmLibcWindowsTime(destTime.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzset() {
    if (windowsNapiAvailable) {
        wasmLibcWindowsTzset()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun chmod(path: ConstPtr<CChar>, mode: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsChmod(path.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wchmod(path: ConstPtr<WcharT>, mode: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsWchmod(path.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsMkdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrmdir(path: ConstPtr<WcharT>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsWrmdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFstat(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsStat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wstat(path: ConstPtr<WcharT>, buf: MutPtr<Stat>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsWstat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wutime(file: ConstPtr<WcharT>, buf: MutPtr<Utimbuf>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsWutime(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsPclose(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsFdopen(fd, mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsFileno(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wopen(path: ConstPtr<WcharT>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsWopen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr<CChar>, mode: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsCreat(path.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsAccess(path.rawAddress.toString(), amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsChdir(dir.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsClose(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsDup(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsDup2(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsExecl(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecl(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsWexecl(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsExecle(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecle(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsWexecle(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsExeclp(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexeclp(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsWexeclp(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlpe(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsExeclpe(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexeclpe(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsWexeclpe(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsExecv(prog.rawAddress.toString(), argv.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsExecve(prog.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsExecvp(c.rawAddress.toString(), argv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsExecvpe(c.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecv(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsWexecv(prog.rawAddress.toString(), argv.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecve(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsWexecve(prog.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecvp(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsWexecvp(c.rawAddress.toString(), argv.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecvpe(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsWexecvpe(c.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr<CChar>, size: CInt): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsGetcwd(buf.rawAddress.toString(), size).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsGetpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsIsatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    if (windowsNapiAvailable) wasmLibcWindowsLseek(fd, offset.toString(), origin).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    if (windowsNapiAvailable) wasmLibcWindowsLseek64(fd, offset.toString(), origin).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: MutPtr<CInt>, psize: CUint, textmode: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsPipe(fds.rawAddress.toString(), psize.toInt(), textmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: CUint): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsRead(fd, buf.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsRmdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsUnlink(c.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: CUint): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsWrite(fd, buf.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commit(fd: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsCommit(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOsfhandle(fd: CInt): IntptrT =
    if (windowsNapiAvailable) wasmLibcWindowsGetOsfhandle(fd).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsOpenOsfhandle(osfhandle.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsSetlocale(category, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsetlocale(category: CInt, locale: ConstPtr<WcharT>): MutPtr<WcharT> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsWsetlocale(category, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsAlignedMalloc(size.toString(), alignment.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedFree(ptr: MutPtr<CVoid>) {
    if (windowsNapiAvailable) {
        wasmLibcWindowsAlignedFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alignedRealloc(memblock: MutPtr<CVoid>, size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    if (windowsNapiAvailable) MutPtr(wasmLibcWindowsAlignedRealloc(memblock.rawAddress.toString(), size.toString(), alignment.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(envstring: ConstPtr<CChar>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsPutenv(envstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wputenv(envstring: ConstPtr<WcharT>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsWputenv(envstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenvS(envstring: ConstPtr<CChar>, valueString: ConstPtr<CChar>): ErrnoT =
    if (windowsNapiAvailable) wasmLibcWindowsPutenvS(envstring.rawAddress.toString(), valueString.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wputenvS(envstring: ConstPtr<WcharT>, valueString: ConstPtr<WcharT>): ErrnoT =
    if (windowsNapiAvailable) wasmLibcWindowsWputenvS(envstring.rawAddress.toString(), valueString.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(s: Socket, backlog: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsListen(s.toString(), backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<CInt>): Socket =
    if (windowsNapiAvailable) wasmLibcWindowsAccept(s.toString(), addr.rawAddress.toString(), addrlen.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsBind(s.toString(), name.rawAddress.toString(), namelen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsConnect(s.toString(), name.rawAddress.toString(), namelen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsGetpeername(s.toString(), name.rawAddress.toString(), nameln.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsGetsockname(s.toString(), name.rawAddress.toString(), nameln.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: MutPtr<CChar>, optlen: MutPtr<CInt>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsGetsockopt(s.toString(), level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: Socket, buf: MutPtr<CChar>, len: CInt, flags: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<CInt>): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsRecvfrom(s.toString(), buf.rawAddress.toString(), len, flags, from.rawAddress.toString(), fromlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(s: Socket, buf: ConstPtr<CChar>, len: CInt, flags: CInt, to: ConstPtr<Sockaddr>, tolen: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsSendto(s.toString(), buf.rawAddress.toString(), len, flags, to.rawAddress.toString(), tolen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: ConstPtr<CChar>, optlen: CInt): CInt =
    if (windowsNapiAvailable) wasmLibcWindowsSetsockopt(s.toString(), level, optname, optval.rawAddress.toString(), optlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    if (windowsNapiAvailable) wasmLibcWindowsSocket(af, socketType, protocol).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
