@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.fuchsia

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
import io.github.kotlinmania.libc.fuchsia.aarch64.Stat
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initFuchsiaNapiAddon(): Boolean

private val fuchsiaNapiAvailable: Boolean = initFuchsiaNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsalnum(p0)")
private external fun wasmLibcFuchsiaIsalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsalpha(p0)")
private external fun wasmLibcFuchsiaIsalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIscntrl(p0)")
private external fun wasmLibcFuchsiaIscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsdigit(p0)")
private external fun wasmLibcFuchsiaIsdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsgraph(p0)")
private external fun wasmLibcFuchsiaIsgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIslower(p0)")
private external fun wasmLibcFuchsiaIslower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsprint(p0)")
private external fun wasmLibcFuchsiaIsprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIspunct(p0)")
private external fun wasmLibcFuchsiaIspunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsspace(p0)")
private external fun wasmLibcFuchsiaIsspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsupper(p0)")
private external fun wasmLibcFuchsiaIsupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsxdigit(p0)")
private external fun wasmLibcFuchsiaIsxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsblank(p0)")
private external fun wasmLibcFuchsiaIsblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTolower(p0)")
private external fun wasmLibcFuchsiaTolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaToupper(p0)")
private external fun wasmLibcFuchsiaToupper(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFopen(p0, p1)")
private external fun wasmLibcFuchsiaFopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaFreopen(p0, p1, p2)")
private external fun wasmLibcFuchsiaFreopen(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFflush(p0)")
private external fun wasmLibcFuchsiaFflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFclose(p0)")
private external fun wasmLibcFuchsiaFclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaRemove(p0)")
private external fun wasmLibcFuchsiaRemove(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaRename(p0, p1)")
private external fun wasmLibcFuchsiaRename(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaTmpfile()")
private external fun wasmLibcFuchsiaTmpfile(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaSetvbuf(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaSetvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSetbuf(p0, p1)")
private external fun wasmLibcFuchsiaSetbuf(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetchar()")
private external fun wasmLibcFuchsiaGetchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPutchar(p0)")
private external fun wasmLibcFuchsiaPutchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFgetc(p0)")
private external fun wasmLibcFuchsiaFgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaFgets(p0, p1, p2)")
private external fun wasmLibcFuchsiaFgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFputc(p0, p1)")
private external fun wasmLibcFuchsiaFputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFputs(p0, p1)")
private external fun wasmLibcFuchsiaFputs(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPuts(p0)")
private external fun wasmLibcFuchsiaPuts(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaUngetc(p0, p1)")
private external fun wasmLibcFuchsiaUngetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaFread(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaFread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaFwrite(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaFwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaFseek(p0, p1, p2)")
private external fun wasmLibcFuchsiaFseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFtell(p0)")
private external fun wasmLibcFuchsiaFtell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaRewind(p0)")
private external fun wasmLibcFuchsiaRewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFgetpos(p0, p1)")
private external fun wasmLibcFuchsiaFgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFsetpos(p0, p1)")
private external fun wasmLibcFuchsiaFsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFeof(p0)")
private external fun wasmLibcFuchsiaFeof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFerror(p0)")
private external fun wasmLibcFuchsiaFerror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPerror(p0)")
private external fun wasmLibcFuchsiaPerror(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaAtof(p0)")
private external fun wasmLibcFuchsiaAtof(p0: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaAtoi(p0)")
private external fun wasmLibcFuchsiaAtoi(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaAtol(p0)")
private external fun wasmLibcFuchsiaAtol(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaAtoll(p0)")
private external fun wasmLibcFuchsiaAtoll(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrtod(p0, p1)")
private external fun wasmLibcFuchsiaStrtod(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrtof(p0, p1)")
private external fun wasmLibcFuchsiaStrtof(p0: String, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaStrtol(p0, p1, p2)")
private external fun wasmLibcFuchsiaStrtol(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaStrtoll(p0, p1, p2)")
private external fun wasmLibcFuchsiaStrtoll(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaStrtoul(p0, p1, p2)")
private external fun wasmLibcFuchsiaStrtoul(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaStrtoull(p0, p1, p2)")
private external fun wasmLibcFuchsiaStrtoull(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaCalloc(p0, p1)")
private external fun wasmLibcFuchsiaCalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaMalloc(p0)")
private external fun wasmLibcFuchsiaMalloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaRealloc(p0, p1)")
private external fun wasmLibcFuchsiaRealloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFree(p0)")
private external fun wasmLibcFuchsiaFree(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaAbort()")
private external fun wasmLibcFuchsiaAbort()

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaExit(p0)")
private external fun wasmLibcFuchsiaExit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaAtexit(p0)")
private external fun wasmLibcFuchsiaAtexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSystem(p0)")
private external fun wasmLibcFuchsiaSystem(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetenv(p0)")
private external fun wasmLibcFuchsiaGetenv(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrcpy(p0, p1)")
private external fun wasmLibcFuchsiaStrcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaStrncpy(p0, p1, p2)")
private external fun wasmLibcFuchsiaStrncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrcat(p0, p1)")
private external fun wasmLibcFuchsiaStrcat(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaStrncat(p0, p1, p2)")
private external fun wasmLibcFuchsiaStrncat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrcmp(p0, p1)")
private external fun wasmLibcFuchsiaStrcmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaStrncmp(p0, p1, p2)")
private external fun wasmLibcFuchsiaStrncmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrcoll(p0, p1)")
private external fun wasmLibcFuchsiaStrcoll(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrchr(p0, p1)")
private external fun wasmLibcFuchsiaStrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrrchr(p0, p1)")
private external fun wasmLibcFuchsiaStrrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrspn(p0, p1)")
private external fun wasmLibcFuchsiaStrspn(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrcspn(p0, p1)")
private external fun wasmLibcFuchsiaStrcspn(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaStrdup(p0)")
private external fun wasmLibcFuchsiaStrdup(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrpbrk(p0, p1)")
private external fun wasmLibcFuchsiaStrpbrk(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrstr(p0, p1)")
private external fun wasmLibcFuchsiaStrstr(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaStrlen(p0)")
private external fun wasmLibcFuchsiaStrlen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrnlen(p0, p1)")
private external fun wasmLibcFuchsiaStrnlen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaStrerror(p0)")
private external fun wasmLibcFuchsiaStrerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStrtok(p0, p1)")
private external fun wasmLibcFuchsiaStrtok(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaStrxfrm(p0, p1, p2)")
private external fun wasmLibcFuchsiaStrxfrm(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaWcslen(p0)")
private external fun wasmLibcFuchsiaWcslen(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaWcstombs(p0, p1, p2)")
private external fun wasmLibcFuchsiaWcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMemchr(p0, p1, p2)")
private external fun wasmLibcFuchsiaMemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaWmemchr(p0, p1, p2)")
private external fun wasmLibcFuchsiaWmemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMemcmp(p0, p1, p2)")
private external fun wasmLibcFuchsiaMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMemcpy(p0, p1, p2)")
private external fun wasmLibcFuchsiaMemcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMemmove(p0, p1, p2)")
private external fun wasmLibcFuchsiaMemmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMemset(p0, p1, p2)")
private external fun wasmLibcFuchsiaMemset(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaAbs(p0)")
private external fun wasmLibcFuchsiaAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaLabs(p0)")
private external fun wasmLibcFuchsiaLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaRand()")
private external fun wasmLibcFuchsiaRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSrand(p0)")
private external fun wasmLibcFuchsiaSrand(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetpwnam(p0)")
private external fun wasmLibcFuchsiaGetpwnam(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetpwuid(p0)")
private external fun wasmLibcFuchsiaGetpwuid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaFprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaFprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcFuchsiaPrintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcFuchsiaPrintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcFuchsiaSnprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcFuchsiaSnprintf(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaSprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaSprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaFscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaFscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcFuchsiaScanf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcFuchsiaScanf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaSscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaSscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetcharUnlocked()")
private external fun wasmLibcFuchsiaGetcharUnlocked(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPutcharUnlocked(p0)")
private external fun wasmLibcFuchsiaPutcharUnlocked(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSocket(p0, p1, p2)")
private external fun wasmLibcFuchsiaSocket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaConnect(p0, p1, p2)")
private external fun wasmLibcFuchsiaConnect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaListen(p0, p1)")
private external fun wasmLibcFuchsiaListen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaAccept(p0, p1, p2)")
private external fun wasmLibcFuchsiaAccept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaGetpeername(p0, p1, p2)")
private external fun wasmLibcFuchsiaGetpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaGetsockname(p0, p1, p2)")
private external fun wasmLibcFuchsiaGetsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaSetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaSetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaSocketpair(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaSocketpair(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcFuchsiaSendto(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcFuchsiaSendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaShutdown(p0, p1)")
private external fun wasmLibcFuchsiaShutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaChmod(p0, p1)")
private external fun wasmLibcFuchsiaChmod(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFchmod(p0, p1)")
private external fun wasmLibcFuchsiaFchmod(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFstat(p0, p1)")
private external fun wasmLibcFuchsiaFstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaMkdir(p0, p1)")
private external fun wasmLibcFuchsiaMkdir(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStat(p0, p1)")
private external fun wasmLibcFuchsiaStat(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPclose(p0)")
private external fun wasmLibcFuchsiaPclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFdopen(p0, p1)")
private external fun wasmLibcFuchsiaFdopen(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFileno(p0)")
private external fun wasmLibcFuchsiaFileno(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaCreat(p0, p1)")
private external fun wasmLibcFuchsiaCreat(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaFcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaFcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaOpendir(p0)")
private external fun wasmLibcFuchsiaOpendir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaReaddir(p0)")
private external fun wasmLibcFuchsiaReaddir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaReaddirR(p0, p1, p2)")
private external fun wasmLibcFuchsiaReaddirR(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaClosedir(p0)")
private external fun wasmLibcFuchsiaClosedir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaRewinddir(p0)")
private external fun wasmLibcFuchsiaRewinddir(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcFuchsiaOpenat(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcFuchsiaOpenat(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaFchmodat(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaFchmodat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaFchown(p0, p1, p2)")
private external fun wasmLibcFuchsiaFchown(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaFchownat(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaFchownat(p0: Int, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaFstatat(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaFstatat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaLinkat(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaLinkat(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMkdirat(p0, p1, p2)")
private external fun wasmLibcFuchsiaMkdirat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaReadlinkat(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaReadlinkat(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaRenameat(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaRenameat(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSymlinkat(p0, p1, p2)")
private external fun wasmLibcFuchsiaSymlinkat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaUnlinkat(p0, p1, p2)")
private external fun wasmLibcFuchsiaUnlinkat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaAccess(p0, p1)")
private external fun wasmLibcFuchsiaAccess(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaAlarm(p0)")
private external fun wasmLibcFuchsiaAlarm(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaChdir(p0)")
private external fun wasmLibcFuchsiaChdir(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaChown(p0, p1, p2)")
private external fun wasmLibcFuchsiaChown(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaLchown(p0, p1, p2)")
private external fun wasmLibcFuchsiaLchown(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaClose(p0)")
private external fun wasmLibcFuchsiaClose(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaDup(p0)")
private external fun wasmLibcFuchsiaDup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaDup2(p0, p1)")
private external fun wasmLibcFuchsiaDup2(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaExecl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaExecl(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaExecle(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaExecle(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaExeclp(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaExeclp(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaExecv(p0, p1)")
private external fun wasmLibcFuchsiaExecv(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaExecve(p0, p1, p2)")
private external fun wasmLibcFuchsiaExecve(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaExecvp(p0, p1)")
private external fun wasmLibcFuchsiaExecvp(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaFork()")
private external fun wasmLibcFuchsiaFork(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFpathconf(p0, p1)")
private external fun wasmLibcFuchsiaFpathconf(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaGetcwd(p0, p1)")
private external fun wasmLibcFuchsiaGetcwd(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetegid()")
private external fun wasmLibcFuchsiaGetegid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGeteuid()")
private external fun wasmLibcFuchsiaGeteuid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetgid()")
private external fun wasmLibcFuchsiaGetgid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaGetgroups(p0, p1)")
private external fun wasmLibcFuchsiaGetgroups(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetlogin()")
private external fun wasmLibcFuchsiaGetlogin(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaGetopt(p0, p1, p2)")
private external fun wasmLibcFuchsiaGetopt(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetpgid(p0)")
private external fun wasmLibcFuchsiaGetpgid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetpgrp()")
private external fun wasmLibcFuchsiaGetpgrp(): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetpid()")
private external fun wasmLibcFuchsiaGetpid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetppid()")
private external fun wasmLibcFuchsiaGetppid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetuid()")
private external fun wasmLibcFuchsiaGetuid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIsatty(p0)")
private external fun wasmLibcFuchsiaIsatty(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaLink(p0, p1)")
private external fun wasmLibcFuchsiaLink(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaLseek(p0, p1, p2)")
private external fun wasmLibcFuchsiaLseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPathconf(p0, p1)")
private external fun wasmLibcFuchsiaPathconf(p0: String, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaPause()")
private external fun wasmLibcFuchsiaPause(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPipe(p0)")
private external fun wasmLibcFuchsiaPipe(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPosixMemalign(p0, p1, p2)")
private external fun wasmLibcFuchsiaPosixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaRead(p0, p1, p2)")
private external fun wasmLibcFuchsiaRead(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaRmdir(p0)")
private external fun wasmLibcFuchsiaRmdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSeteuid(p0)")
private external fun wasmLibcFuchsiaSeteuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSetegid(p0)")
private external fun wasmLibcFuchsiaSetegid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSetgid(p0)")
private external fun wasmLibcFuchsiaSetgid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSetpgid(p0, p1)")
private external fun wasmLibcFuchsiaSetpgid(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaSetsid()")
private external fun wasmLibcFuchsiaSetsid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSetuid(p0)")
private external fun wasmLibcFuchsiaSetuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSleep(p0)")
private external fun wasmLibcFuchsiaSleep(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaNanosleep(p0, p1)")
private external fun wasmLibcFuchsiaNanosleep(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTcgetpgrp(p0)")
private external fun wasmLibcFuchsiaTcgetpgrp(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaTcsetpgrp(p0, p1)")
private external fun wasmLibcFuchsiaTcsetpgrp(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTtyname(p0)")
private external fun wasmLibcFuchsiaTtyname(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaUnlink(p0)")
private external fun wasmLibcFuchsiaUnlink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaWait(p0)")
private external fun wasmLibcFuchsiaWait(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaWaitpid(p0, p1, p2)")
private external fun wasmLibcFuchsiaWaitpid(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaWrite(p0, p1, p2)")
private external fun wasmLibcFuchsiaWrite(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaPread(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaPread(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaPwrite(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaPwrite(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaUmask(p0)")
private external fun wasmLibcFuchsiaUmask(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaUtime(p0, p1)")
private external fun wasmLibcFuchsiaUtime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaKill(p0, p1)")
private external fun wasmLibcFuchsiaKill(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaMlock(p0, p1)")
private external fun wasmLibcFuchsiaMlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaMunlock(p0, p1)")
private external fun wasmLibcFuchsiaMunlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaMlockall(p0)")
private external fun wasmLibcFuchsiaMlockall(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaMunlockall()")
private external fun wasmLibcFuchsiaMunlockall(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcFuchsiaMmap(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcFuchsiaMmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaMunmap(p0, p1)")
private external fun wasmLibcFuchsiaMunmap(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIfNametoindex(p0)")
private external fun wasmLibcFuchsiaIfNametoindex(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaIfIndextoname(p0, p1)")
private external fun wasmLibcFuchsiaIfIndextoname(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaLstat(p0, p1)")
private external fun wasmLibcFuchsiaLstat(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFsync(p0)")
private external fun wasmLibcFuchsiaFsync(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSetenv(p0, p1, p2)")
private external fun wasmLibcFuchsiaSetenv(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaUnsetenv(p0)")
private external fun wasmLibcFuchsiaUnsetenv(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSymlink(p0, p1)")
private external fun wasmLibcFuchsiaSymlink(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFtruncate(p0, p1)")
private external fun wasmLibcFuchsiaFtruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSignal(p0, p1)")
private external fun wasmLibcFuchsiaSignal(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaRealpath(p0, p1)")
private external fun wasmLibcFuchsiaRealpath(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFlock(p0, p1)")
private external fun wasmLibcFuchsiaFlock(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaGettimeofday(p0, p1)")
private external fun wasmLibcFuchsiaGettimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTimes(p0)")
private external fun wasmLibcFuchsiaTimes(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaPthreadSelf()")
private external fun wasmLibcFuchsiaPthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadJoin(p0, p1)")
private external fun wasmLibcFuchsiaPthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadExit(p0)")
private external fun wasmLibcFuchsiaPthreadExit(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadAttrInit(p0)")
private external fun wasmLibcFuchsiaPthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadAttrDestroy(p0)")
private external fun wasmLibcFuchsiaPthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadAttrGetstacksize(p0, p1)")
private external fun wasmLibcFuchsiaPthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadAttrSetstacksize(p0, p1)")
private external fun wasmLibcFuchsiaPthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadAttrSetdetachstate(p0, p1)")
private external fun wasmLibcFuchsiaPthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadDetach(p0)")
private external fun wasmLibcFuchsiaPthreadDetach(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaSchedYield()")
private external fun wasmLibcFuchsiaSchedYield(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadKeyCreate(p0, p1)")
private external fun wasmLibcFuchsiaPthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadKeyDelete(p0)")
private external fun wasmLibcFuchsiaPthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadGetspecific(p0)")
private external fun wasmLibcFuchsiaPthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadSetspecific(p0, p1)")
private external fun wasmLibcFuchsiaPthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadMutexInit(p0, p1)")
private external fun wasmLibcFuchsiaPthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadMutexDestroy(p0)")
private external fun wasmLibcFuchsiaPthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadMutexLock(p0)")
private external fun wasmLibcFuchsiaPthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadMutexTrylock(p0)")
private external fun wasmLibcFuchsiaPthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadMutexUnlock(p0)")
private external fun wasmLibcFuchsiaPthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadMutexattrInit(p0)")
private external fun wasmLibcFuchsiaPthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadMutexattrDestroy(p0)")
private external fun wasmLibcFuchsiaPthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadMutexattrSettype(p0, p1)")
private external fun wasmLibcFuchsiaPthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondInit(p0, p1)")
private external fun wasmLibcFuchsiaPthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondWait(p0, p1)")
private external fun wasmLibcFuchsiaPthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondTimedwait(p0, p1, p2)")
private external fun wasmLibcFuchsiaPthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondSignal(p0)")
private external fun wasmLibcFuchsiaPthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondBroadcast(p0)")
private external fun wasmLibcFuchsiaPthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondDestroy(p0)")
private external fun wasmLibcFuchsiaPthreadCondDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondattrInit(p0)")
private external fun wasmLibcFuchsiaPthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondattrDestroy(p0)")
private external fun wasmLibcFuchsiaPthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadRwlockInit(p0, p1)")
private external fun wasmLibcFuchsiaPthreadRwlockInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadRwlockDestroy(p0)")
private external fun wasmLibcFuchsiaPthreadRwlockDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadRwlockRdlock(p0)")
private external fun wasmLibcFuchsiaPthreadRwlockRdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadRwlockTryrdlock(p0)")
private external fun wasmLibcFuchsiaPthreadRwlockTryrdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadRwlockWrlock(p0)")
private external fun wasmLibcFuchsiaPthreadRwlockWrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadRwlockTrywrlock(p0)")
private external fun wasmLibcFuchsiaPthreadRwlockTrywrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadRwlockUnlock(p0)")
private external fun wasmLibcFuchsiaPthreadRwlockUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadRwlockattrInit(p0)")
private external fun wasmLibcFuchsiaPthreadRwlockattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadRwlockattrDestroy(p0)")
private external fun wasmLibcFuchsiaPthreadRwlockattrDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcFuchsiaPthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadSetnameNp(p0, p1)")
private external fun wasmLibcFuchsiaPthreadSetnameNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaStrerrorR(p0, p1, p2)")
private external fun wasmLibcFuchsiaStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaGetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaGetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaRaise(p0)")
private external fun wasmLibcFuchsiaRaise(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSigaction(p0, p1, p2)")
private external fun wasmLibcFuchsiaSigaction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaUtimes(p0, p1)")
private external fun wasmLibcFuchsiaUtimes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaDlopen(p0, p1)")
private external fun wasmLibcFuchsiaDlopen(p0: String, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaDlerror()")
private external fun wasmLibcFuchsiaDlerror(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaDlsym(p0, p1)")
private external fun wasmLibcFuchsiaDlsym(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaDlclose(p0)")
private external fun wasmLibcFuchsiaDlclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaDladdr(p0, p1)")
private external fun wasmLibcFuchsiaDladdr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaGetaddrinfo(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaGetaddrinfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFreeaddrinfo(p0)")
private external fun wasmLibcFuchsiaFreeaddrinfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGaiStrerror(p0)")
private external fun wasmLibcFuchsiaGaiStrerror(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaResInit()")
private external fun wasmLibcFuchsiaResInit(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaGmtimeR(p0, p1)")
private external fun wasmLibcFuchsiaGmtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaLocaltimeR(p0, p1)")
private external fun wasmLibcFuchsiaLocaltimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaMktime(p0)")
private external fun wasmLibcFuchsiaMktime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTime(p0)")
private external fun wasmLibcFuchsiaTime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGmtime(p0)")
private external fun wasmLibcFuchsiaGmtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaLocaltime(p0)")
private external fun wasmLibcFuchsiaLocaltime(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMknod(p0, p1, p2)")
private external fun wasmLibcFuchsiaMknod(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaUname(p0)")
private external fun wasmLibcFuchsiaUname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaGethostname(p0, p1)")
private external fun wasmLibcFuchsiaGethostname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaGetservbyname(p0, p1)")
private external fun wasmLibcFuchsiaGetservbyname(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetprotobyname(p0)")
private external fun wasmLibcFuchsiaGetprotobyname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetprotobynumber(p0)")
private external fun wasmLibcFuchsiaGetprotobynumber(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaUsleep(p0)")
private external fun wasmLibcFuchsiaUsleep(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaSend(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaSend(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaRecv(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaRecv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPutenv(p0)")
private external fun wasmLibcFuchsiaPutenv(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPoll(p0, p1, p2)")
private external fun wasmLibcFuchsiaPoll(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaSelect(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaSelect(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSetlocale(p0, p1)")
private external fun wasmLibcFuchsiaSetlocale(p0: Int, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaLocaleconv()")
private external fun wasmLibcFuchsiaLocaleconv(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSemDestroy(p0)")
private external fun wasmLibcFuchsiaSemDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSemWait(p0)")
private external fun wasmLibcFuchsiaSemWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSemTrywait(p0)")
private external fun wasmLibcFuchsiaSemTrywait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSemPost(p0)")
private external fun wasmLibcFuchsiaSemPost(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSemInit(p0, p1, p2)")
private external fun wasmLibcFuchsiaSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStatvfs(p0, p1)")
private external fun wasmLibcFuchsiaStatvfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFstatvfs(p0, p1)")
private external fun wasmLibcFuchsiaFstatvfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaReadlink(p0, p1, p2)")
private external fun wasmLibcFuchsiaReadlink(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSigemptyset(p0)")
private external fun wasmLibcFuchsiaSigemptyset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSigaddset(p0, p1)")
private external fun wasmLibcFuchsiaSigaddset(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSigfillset(p0)")
private external fun wasmLibcFuchsiaSigfillset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSigdelset(p0, p1)")
private external fun wasmLibcFuchsiaSigdelset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSigismember(p0, p1)")
private external fun wasmLibcFuchsiaSigismember(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSigprocmask(p0, p1, p2)")
private external fun wasmLibcFuchsiaSigprocmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSigpending(p0)")
private external fun wasmLibcFuchsiaSigpending(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTimegm(p0)")
private external fun wasmLibcFuchsiaTimegm(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetsid(p0)")
private external fun wasmLibcFuchsiaGetsid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSysconf(p0)")
private external fun wasmLibcFuchsiaSysconf(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaMkfifo(p0, p1)")
private external fun wasmLibcFuchsiaMkfifo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcFuchsiaPselect(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcFuchsiaPselect(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaFseeko(p0, p1, p2)")
private external fun wasmLibcFuchsiaFseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFtello(p0)")
private external fun wasmLibcFuchsiaFtello(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTcdrain(p0)")
private external fun wasmLibcFuchsiaTcdrain(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaCfgetispeed(p0)")
private external fun wasmLibcFuchsiaCfgetispeed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaCfgetospeed(p0)")
private external fun wasmLibcFuchsiaCfgetospeed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaCfmakeraw(p0)")
private external fun wasmLibcFuchsiaCfmakeraw(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaCfsetispeed(p0, p1)")
private external fun wasmLibcFuchsiaCfsetispeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaCfsetospeed(p0, p1)")
private external fun wasmLibcFuchsiaCfsetospeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaCfsetspeed(p0, p1)")
private external fun wasmLibcFuchsiaCfsetspeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaTcgetattr(p0, p1)")
private external fun wasmLibcFuchsiaTcgetattr(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaTcsetattr(p0, p1, p2)")
private external fun wasmLibcFuchsiaTcsetattr(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaTcflow(p0, p1)")
private external fun wasmLibcFuchsiaTcflow(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaTcflush(p0, p1)")
private external fun wasmLibcFuchsiaTcflush(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTcgetsid(p0)")
private external fun wasmLibcFuchsiaTcgetsid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaTcsendbreak(p0, p1)")
private external fun wasmLibcFuchsiaTcsendbreak(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaMkstemp(p0)")
private external fun wasmLibcFuchsiaMkstemp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaMkdtemp(p0)")
private external fun wasmLibcFuchsiaMkdtemp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTmpnam(p0)")
private external fun wasmLibcFuchsiaTmpnam(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaOpenlog(p0, p1, p2)")
private external fun wasmLibcFuchsiaOpenlog(p0: String, p1: Int, p2: Int)

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaCloselog()")
private external fun wasmLibcFuchsiaCloselog()

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSetlogmask(p0)")
private external fun wasmLibcFuchsiaSetlogmask(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaSyslog(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaSyslog(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGrantpt(p0)")
private external fun wasmLibcFuchsiaGrantpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPosixOpenpt(p0)")
private external fun wasmLibcFuchsiaPosixOpenpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPtsname(p0)")
private external fun wasmLibcFuchsiaPtsname(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaUnlockpt(p0)")
private external fun wasmLibcFuchsiaUnlockpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFdatasync(p0)")
private external fun wasmLibcFuchsiaFdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaClockGetres(p0, p1)")
private external fun wasmLibcFuchsiaClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaClockGettime(p0, p1)")
private external fun wasmLibcFuchsiaClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaClockSettime(p0, p1)")
private external fun wasmLibcFuchsiaClockSettime(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaDirfd(p0)")
private external fun wasmLibcFuchsiaDirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadGetattrNp(p0, p1)")
private external fun wasmLibcFuchsiaPthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcFuchsiaPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaMemalign(p0, p1)")
private external fun wasmLibcFuchsiaMemalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSetgroups(p0, p1)")
private external fun wasmLibcFuchsiaSetgroups(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPipe2(p0, p1)")
private external fun wasmLibcFuchsiaPipe2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaStatfs(p0, p1)")
private external fun wasmLibcFuchsiaStatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFstatfs(p0, p1)")
private external fun wasmLibcFuchsiaFstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMemrchr(p0, p1, p2)")
private external fun wasmLibcFuchsiaMemrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaPosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaPosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFutimens(p0, p1)")
private external fun wasmLibcFuchsiaFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaDuplocale(p0)")
private external fun wasmLibcFuchsiaDuplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFreelocale(p0)")
private external fun wasmLibcFuchsiaFreelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaNewlocale(p0, p1, p2)")
private external fun wasmLibcFuchsiaNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaUselocale(p0)")
private external fun wasmLibcFuchsiaUselocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFdopendir(p0)")
private external fun wasmLibcFuchsiaFdopendir(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaMknodat(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaMknodat(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcFuchsiaPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcFuchsiaPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaAccept4(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaAccept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPtsnameR(p0, p1, p2)")
private external fun wasmLibcFuchsiaPtsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaClearenv()")
private external fun wasmLibcFuchsiaClearenv(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaWaitid(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaWaitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSetreuid(p0, p1)")
private external fun wasmLibcFuchsiaSetreuid(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSetregid(p0, p1)")
private external fun wasmLibcFuchsiaSetregid(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaGetresuid(p0, p1, p2)")
private external fun wasmLibcFuchsiaGetresuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaGetresgid(p0, p1, p2)")
private external fun wasmLibcFuchsiaGetresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaAcct(p0)")
private external fun wasmLibcFuchsiaAcct(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaBrk(p0)")
private external fun wasmLibcFuchsiaBrk(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSetresgid(p0, p1, p2)")
private external fun wasmLibcFuchsiaSetresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSetresuid(p0, p1, p2)")
private external fun wasmLibcFuchsiaSetresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaExecvpe(p0, p1, p2)")
private external fun wasmLibcFuchsiaExecvpe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaFexecve(p0, p1, p2)")
private external fun wasmLibcFuchsiaFexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaIoctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaLutimes(p0, p1)")
private external fun wasmLibcFuchsiaLutimes(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaSetpwent()")
private external fun wasmLibcFuchsiaSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaEndpwent()")
private external fun wasmLibcFuchsiaEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetpwent()")
private external fun wasmLibcFuchsiaGetpwent(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaShmOpen(p0, p1, p2)")
private external fun wasmLibcFuchsiaShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaShmget(p0, p1, p2)")
private external fun wasmLibcFuchsiaShmget(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaShmat(p0, p1, p2)")
private external fun wasmLibcFuchsiaShmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaShmdt(p0)")
private external fun wasmLibcFuchsiaShmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaShmctl(p0, p1, p2)")
private external fun wasmLibcFuchsiaShmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFtok(p0, p1)")
private external fun wasmLibcFuchsiaFtok(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSemget(p0, p1, p2)")
private external fun wasmLibcFuchsiaSemget(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSemop(p0, p1, p2)")
private external fun wasmLibcFuchsiaSemop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcFuchsiaSemctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcFuchsiaSemctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMsgctl(p0, p1, p2)")
private external fun wasmLibcFuchsiaMsgctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaMsgget(p0, p1)")
private external fun wasmLibcFuchsiaMsgget(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaMsgrcv(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaMsgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaMsgsnd(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaMsgsnd(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMprotect(p0, p1, p2)")
private external fun wasmLibcFuchsiaMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaErrnoLocation()")
private external fun wasmLibcFuchsiaErrnoLocation(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaFallocate(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaFallocate(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPosixFallocate(p0, p1, p2)")
private external fun wasmLibcFuchsiaPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaReadahead(p0, p1, p2)")
private external fun wasmLibcFuchsiaReadahead(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSignalfd(p0, p1, p2)")
private external fun wasmLibcFuchsiaSignalfd(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaTimerfdCreate(p0, p1)")
private external fun wasmLibcFuchsiaTimerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaTimerfdGettime(p0, p1)")
private external fun wasmLibcFuchsiaTimerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaTimerfdSettime(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaTimerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaPwritev(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaPreadv(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaQuotactl(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaQuotactl(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaDup3(p0, p1, p2)")
private external fun wasmLibcFuchsiaDup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaMkostemp(p0, p1)")
private external fun wasmLibcFuchsiaMkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMkostemps(p0, p1, p2)")
private external fun wasmLibcFuchsiaMkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSigtimedwait(p0, p1, p2)")
private external fun wasmLibcFuchsiaSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSigwaitinfo(p0, p1)")
private external fun wasmLibcFuchsiaSigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaNlLanginfoL(p0, p1)")
private external fun wasmLibcFuchsiaNlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaReboot(p0)")
private external fun wasmLibcFuchsiaReboot(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSetfsgid(p0)")
private external fun wasmLibcFuchsiaSetfsgid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSetfsuid(p0)")
private external fun wasmLibcFuchsiaSetfsuid(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMkfifoat(p0, p1, p2)")
private external fun wasmLibcFuchsiaMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaIfNameindex()")
private external fun wasmLibcFuchsiaIfNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaIfFreenameindex(p0)")
private external fun wasmLibcFuchsiaIfFreenameindex(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaSyncFileRange(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaSyncFileRange(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetifaddrs(p0)")
private external fun wasmLibcFuchsiaGetifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaFreeifaddrs(p0)")
private external fun wasmLibcFuchsiaFreeifaddrs(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaGlob(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaGlob(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGlobfree(p0)")
private external fun wasmLibcFuchsiaGlobfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPosixMadvise(p0, p1, p2)")
private external fun wasmLibcFuchsiaPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaShmUnlink(p0)")
private external fun wasmLibcFuchsiaShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSeekdir(p0, p1)")
private external fun wasmLibcFuchsiaSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaTelldir(p0)")
private external fun wasmLibcFuchsiaTelldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMadvise(p0, p1, p2)")
private external fun wasmLibcFuchsiaMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaMsync(p0, p1, p2)")
private external fun wasmLibcFuchsiaMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcFuchsiaRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcFuchsiaRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaMkstemps(p0, p1)")
private external fun wasmLibcFuchsiaMkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaFutimes(p0, p1)")
private external fun wasmLibcFuchsiaFutimes(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaNlLanginfo(p0)")
private external fun wasmLibcFuchsiaNlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaBind(p0, p1, p2)")
private external fun wasmLibcFuchsiaBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaWritev(p0, p1, p2)")
private external fun wasmLibcFuchsiaWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaReadv(p0, p1, p2)")
private external fun wasmLibcFuchsiaReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSendmsg(p0, p1, p2)")
private external fun wasmLibcFuchsiaSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaRecvmsg(p0, p1, p2)")
private external fun wasmLibcFuchsiaRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaGetdomainname(p0, p1)")
private external fun wasmLibcFuchsiaGetdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSetdomainname(p0, p1)")
private external fun wasmLibcFuchsiaSetdomainname(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaVhangup()")
private external fun wasmLibcFuchsiaVhangup(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaSendmmsg(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaSendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaRecvmmsg(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaRecvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaSync()")
private external fun wasmLibcFuchsiaSync()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcFuchsiaSyscall(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcFuchsiaSyscall(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSchedGetaffinity(p0, p1, p2)")
private external fun wasmLibcFuchsiaSchedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSchedSetaffinity(p0, p1, p2)")
private external fun wasmLibcFuchsiaSchedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaUmount(p0)")
private external fun wasmLibcFuchsiaUmount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSchedGetPriorityMax(p0)")
private external fun wasmLibcFuchsiaSchedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaTee(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaTee(p0: Int, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSettimeofday(p0, p1)")
private external fun wasmLibcFuchsiaSettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcFuchsiaSplice(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcFuchsiaSplice(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaEventfd(p0, p1)")
private external fun wasmLibcFuchsiaEventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSchedRrGetInterval(p0, p1)")
private external fun wasmLibcFuchsiaSchedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSemTimedwait(p0, p1)")
private external fun wasmLibcFuchsiaSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSemGetvalue(p0, p1)")
private external fun wasmLibcFuchsiaSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSchedSetparam(p0, p1)")
private external fun wasmLibcFuchsiaSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSwapoff(p0)")
private external fun wasmLibcFuchsiaSwapoff(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaVmsplice(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaVmsplice(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaMount(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaMount(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPersonality(p0)")
private external fun wasmLibcFuchsiaPersonality(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSchedGetparam(p0, p1)")
private external fun wasmLibcFuchsiaSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaPpoll(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaPpoll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcFuchsiaPthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libcFuchsiaClone(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmLibcFuchsiaClone(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSchedGetscheduler(p0)")
private external fun wasmLibcFuchsiaSchedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaClockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcFuchsiaPthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadAttrSetguardsize(p0, p1)")
private external fun wasmLibcFuchsiaPthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSethostname(p0, p1)")
private external fun wasmLibcFuchsiaSethostname(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSchedGetPriorityMin(p0)")
private external fun wasmLibcFuchsiaSchedGetPriorityMin(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaUmount2(p0, p1)")
private external fun wasmLibcFuchsiaUmount2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSwapon(p0, p1)")
private external fun wasmLibcFuchsiaSwapon(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcFuchsiaSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSigsuspend(p0)")
private external fun wasmLibcFuchsiaSigsuspend(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSigaltstack(p0, p1)")
private external fun wasmLibcFuchsiaSigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSemClose(p0)")
private external fun wasmLibcFuchsiaSemClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetdtablesize()")
private external fun wasmLibcFuchsiaGetdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaInitgroups(p0, p1)")
private external fun wasmLibcFuchsiaInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcFuchsiaPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcFuchsiaSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcFuchsiaSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetgrnam(p0)")
private external fun wasmLibcFuchsiaGetgrnam(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaPthreadCancel(p0)")
private external fun wasmLibcFuchsiaPthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPthreadKill(p0, p1)")
private external fun wasmLibcFuchsiaPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaSemUnlink(p0)")
private external fun wasmLibcFuchsiaSemUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaDaemon(p0, p1)")
private external fun wasmLibcFuchsiaDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcFuchsiaGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcFuchsiaGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaSigwait(p0, p1)")
private external fun wasmLibcFuchsiaSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcFuchsiaPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcFuchsiaPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcFuchsiaGetgrgid(p0)")
private external fun wasmLibcFuchsiaGetgrgid(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaSetgrent()")
private external fun wasmLibcFuchsiaSetgrent()

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaEndgrent()")
private external fun wasmLibcFuchsiaEndgrent()

@JsFun("() => globalThis.__km_napi_libc.libcFuchsiaGetgrent()")
private external fun wasmLibcFuchsiaGetgrent(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaPopen(p0, p1)")
private external fun wasmLibcFuchsiaPopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcFuchsiaPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcFuchsiaPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcFuchsiaDlIteratePhdr(p0, p1)")
private external fun wasmLibcFuchsiaDlIteratePhdr(p0: String, p1: String): Int

public actual fun isalnum(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIslower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIspunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaToupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaFopen(filename.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFflush(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFclose(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRemove(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr<FILE> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaTmpfile().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPutchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFgetc(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFputc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFputs(s.rawAddress.toString(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPuts(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUngetc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFread(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFwrite(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFseek(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFtell(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr<FILE>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFgetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFsetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFeof(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFerror(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: ConstPtr<CChar>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAtof(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAtoi(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAtol(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAtoll(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrtof(s.rawAddress.toString(), endp.rawAddress.toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaCalloc(nobj.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaMalloc(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaRealloc(p.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr<CVoid>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAtexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSystem(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetenv(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrcat(s.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrdup(cs.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrlen(cs.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrnlen(cs.rawAddress.toString(), maxlen.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrerror(n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaStrtok(s.rawAddress.toString(), t.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaWcslen(buf.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaWcstombs(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaMemchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaWmemchr(cx.rawAddress.toString(), c.toInt(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaMemset(dest.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnam(name: ConstPtr<CChar>): MutPtr<Passwd> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetpwnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuid(uid: UidT): MutPtr<Passwd> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetpwuid(uid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPutcharUnlocked(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSocket(domain, ty, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(socket: CInt, address: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaConnect(socket, address.rawAddress.toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaListen(socket, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAccept(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetpeername(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetsockname(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetsockopt(socket, level, name, value.rawAddress.toString(), optionLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSocketpair(domain, type, protocol, socketVector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSendto(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaShutdown(socket, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaChmod(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFchmod(fd, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFstat(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMkdir(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPclose(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaFdopen(fd, mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFileno(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaCreat(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaOpendir(dirname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaReaddir(dirp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaReaddirR(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaClosedir(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaOpenat(dirfd, pathname.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFchmodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFchown(fd, owner.toInt(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFchownat(dirfd, pathname.rawAddress.toString(), owner.toInt(), group.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFstatat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMkdirat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaReadlinkat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), bufsiz.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUnlinkat(dirfd, pathname.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAccess(path.rawAddress.toString(), amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAlarm(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaChdir(dir.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaChown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaLchown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaClose(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaDup(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaDup2(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaExecl(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaExecle(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(file: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaExeclp(file.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaExecv(prog.rawAddress.toString(), argv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaExecve(prog.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaExecvp(c.rawAddress.toString(), argv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFork() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFpathconf(filedes, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetcwd(buf.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetegid().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGeteuid().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetgid().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetgroups(ngroupsMax, groups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetlogin().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgid(pid: PidT): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetpgid(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgrp(): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetpgrp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetppid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetuid().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIsatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaLink(src.rawAddress.toString(), dst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaLseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPathconf(path.rawAddress.toString(), name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPause() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPipe(fds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPosixMemalign(memptr.rawAddress.toString(), align.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRead(fd, buf.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRmdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSeteuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetegid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetpgid(pid, pgid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsid(): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetsid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSleep(secs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaNanosleep(rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetpgrp(fd: CInt): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTcgetpgrp(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTcsetpgrp(fd, pgrp) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaTtyname(fd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUnlink(c.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: MutPtr<CInt>): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaWait(status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaWaitpid(pid, status.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaWrite(fd, buf.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPread(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPwrite(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUmask(mask.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUtime(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaKill(pid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMlock(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMunlock(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMlockall(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMunlockall() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMunmap(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(ifname: ConstPtr<CChar>): CUint =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIfNametoindex(ifname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaIfIndextoname(ifindex.toInt(), ifname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaLstat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFsync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetenv(name.rawAddress.toString(), value.rawAddress.toString(), overwrite) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUnsetenv(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFtruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSignal(signum, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaRealpath(pathname.rawAddress.toString(), resolved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFlock(fd, operation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr<Tms>): ClockT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTimes(buf.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadSelf().toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadJoin(native.toLong().toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaPthreadExit(value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadAttrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadAttrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadAttrGetstacksize(attr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadAttrSetstacksize(attr.rawAddress.toString(), stackSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadDetach(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadKeyDelete(key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaPthreadGetspecific(key.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadSetspecific(key.toInt(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadMutexInit(lock.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadMutexDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadMutexLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadMutexTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadMutexUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadMutexattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadMutexattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadMutexattrSettype(attr.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondWait(cond.rawAddress.toString(), lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondTimedwait(cond.rawAddress.toString(), lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondSignal(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondBroadcast(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondDestroy(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadRwlockInit(lock.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadRwlockDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadRwlockRdlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadRwlockTryrdlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadRwlockWrlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadRwlockTrywrlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadRwlockUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadRwlockattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadRwlockattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadGetnameNp(thread.toLong().toString(), name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadSetnameNp(thread.toLong().toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRaise(signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigaction(signum, act.rawAddress.toString(), oldact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUtimes(filename.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaDlopen(filename.rawAddress.toString(), flag).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaDlerror().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaDlsym(handle.rawAddress.toString(), symbol.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaDlclose(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaDladdr(addr.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetaddrinfo(node.rawAddress.toString(), service.rawAddress.toString(), hints.rawAddress.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaFreeaddrinfo(res.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gaiStrerror(errcode: CInt): ConstPtr<CChar> =
    if (fuchsiaNapiAvailable) ConstPtr(wasmLibcFuchsiaGaiStrerror(errcode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resInit(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaResInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGmtimeR(timeP.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaLocaltimeR(timeP.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMktime(tm.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: MutPtr<TimeT>): TimeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTime(time.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGmtime(timeP.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaLocaltime(timeP.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknod(pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMknod(pathname.rawAddress.toString(), mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetservbyname(name.rawAddress.toString(), proto.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetprotobyname(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetprotobynumber(proto).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: CUint): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUsleep(secs.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSend(socket, buf.rawAddress.toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRecv(socket, buf.rawAddress.toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: MutPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPutenv(string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPoll(fds.rawAddress.toString(), nfds.toString(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timeval>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSelect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaSetlocale(category, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr<Lconv> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaLocaleconv().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemWait(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTrywait(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemTrywait(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemPost(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(path: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStatvfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fd: CInt, buf: MutPtr<Statvfs>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFstatvfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsz.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigemptyset(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigaddset(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigfillset(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigdelset(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigismember(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigprocmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigpending(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTimegm(tm.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsid(pid: PidT): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetsid(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMkfifo(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pselect(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPselect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFseeko(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFtello(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcdrain(fd: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTcdrain(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetispeed(termios: ConstPtr<Termios>): SpeedT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaCfgetispeed(termios.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaCfgetospeed(termios.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: MutPtr<Termios>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaCfmakeraw(termios.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaCfsetispeed(termios.rawAddress.toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaCfsetospeed(termios.rawAddress.toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaCfsetspeed(termios.rawAddress.toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTcgetattr(fd, termios.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTcsetattr(fd, optionalActions, termios.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTcflow(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTcflush(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetsid(fd: CInt): PidT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTcgetsid(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTcsendbreak(fd, duration) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMkstemp(template.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaMkdtemp(template.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaTmpnam(ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaOpenlog(ident.rawAddress.toString(), logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaCloselog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetlogmask(maskpri) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaSyslog(priority, message.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun grantpt(fd: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGrantpt(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixOpenpt(flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPosixOpenpt(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsname(fd: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaPtsname(fd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockpt(fd: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUnlockpt(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaClockGetres(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaClockSettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadGetattrNp(native.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetgroups(ngroups.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPipe2(fds.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFstatfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaMemrchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPosixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaFdopendir(fd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAccept4(fd, addr.rawAddress.toString(), len.rawAddress.toString(), flg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaClearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetreuid(ruid.toInt(), euid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetregid(rgid.toInt(), egid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaAcct(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaBrk(addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaLutimes(file.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr<Passwd> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaShmget(key, size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaShmat(shmid, shmaddr.rawAddress.toString(), shmflg).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaShmdt(shmaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaShmctl(shmid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFtok(pathname.rawAddress.toString(), projId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemget(key, nsems, semflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemop(semid, sops.rawAddress.toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMsgctl(msqid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMsgget(key, msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMsgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr<CInt> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaErrnoLocation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFallocate(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaReadahead(fd, offset.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSignalfd(fd, mask.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTimerfdCreate(clockid, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTimerfdGettime(fd, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: CInt, special: ConstPtr<CChar>, id: CInt, data: MutPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaQuotactl(cmd, special.rawAddress.toString(), id, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaDup3(oldfd, newfd, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMkostemp(template.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMkostemps(template.rawAddress.toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaNlLanginfoL(item, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaReboot(howTo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetfsgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetfsuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaIfNameindex().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSyncFileRange(fd, offset.toString(), nbytes.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetifaddrs(ifap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMkstemps(template.rawAddress.toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFutimes(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaBind(socket, address.rawAddress.toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSendmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRecvmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaVhangup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSyscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedGetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUmount(target.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaTee(fdIn, fdOut, len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSplice(fdIn, offIn.rawAddress.toString(), fdOut, offOut.rawAddress.toString(), len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaEventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedRrGetInterval(pid, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(puath: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSwapoff(puath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaVmsplice(fd, iov.rawAddress.toString(), nrSegs.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaMount(src.rawAddress.toString(), target.rawAddress.toString(), fstype.rawAddress.toString(), flags.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUlong): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPersonality(persona.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPpoll(fds.rawAddress.toString(), nfds.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaClone(0L.toString(), childStack.rawAddress.toString(), flags, arg.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaUmount2(target.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSwapon(path.rawAddress.toString(), swapflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaInitgroups(user.rawAddress.toString(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCancel(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (fuchsiaNapiAvailable) {
        wasmLibcFuchsiaEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (fuchsiaNapiAvailable) MutPtr(wasmLibcFuchsiaPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAvailable) wasmLibcFuchsiaDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
