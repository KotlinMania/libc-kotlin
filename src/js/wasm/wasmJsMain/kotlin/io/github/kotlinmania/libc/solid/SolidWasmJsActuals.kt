@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.solid.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initSolidNapiAddon(): Boolean

private val solidNapiAvailable: Boolean = initSolidNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetOPTARG()")
private external fun wasmLibcSolidGetOPTARG(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSetOPTARG(p0)")
private external fun wasmLibcSolidSetOPTARG(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetOPTERR()")
private external fun wasmLibcSolidGetOPTERR(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSetOPTERR(p0)")
private external fun wasmLibcSolidSetOPTERR(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetOPTIND()")
private external fun wasmLibcSolidGetOPTIND(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSetOPTIND(p0)")
private external fun wasmLibcSolidSetOPTIND(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetOPTOPT()")
private external fun wasmLibcSolidGetOPTOPT(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSetOPTOPT(p0)")
private external fun wasmLibcSolidSetOPTOPT(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetOPTRESET()")
private external fun wasmLibcSolidGetOPTRESET(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSetOPTRESET(p0)")
private external fun wasmLibcSolidSetOPTRESET(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetSUBOPTARG()")
private external fun wasmLibcSolidGetSUBOPTARG(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSetSUBOPTARG(p0)")
private external fun wasmLibcSolidSetSUBOPTARG(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIsalnum(p0)")
private external fun wasmLibcSolidIsalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIsalpha(p0)")
private external fun wasmLibcSolidIsalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIscntrl(p0)")
private external fun wasmLibcSolidIscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIsdigit(p0)")
private external fun wasmLibcSolidIsdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIsgraph(p0)")
private external fun wasmLibcSolidIsgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIslower(p0)")
private external fun wasmLibcSolidIslower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIsprint(p0)")
private external fun wasmLibcSolidIsprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIspunct(p0)")
private external fun wasmLibcSolidIspunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIsspace(p0)")
private external fun wasmLibcSolidIsspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIsupper(p0)")
private external fun wasmLibcSolidIsupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIsxdigit(p0)")
private external fun wasmLibcSolidIsxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidIsblank(p0)")
private external fun wasmLibcSolidIsblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidTolower(p0)")
private external fun wasmLibcSolidTolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidToupper(p0)")
private external fun wasmLibcSolidToupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidGetStdioFile(p0)")
private external fun wasmLibcSolidGetStdioFile(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidClearerr(p0)")
private external fun wasmLibcSolidClearerr(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFclose(p0)")
private external fun wasmLibcSolidFclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFeof(p0)")
private external fun wasmLibcSolidFeof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFerror(p0)")
private external fun wasmLibcSolidFerror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFflush(p0)")
private external fun wasmLibcSolidFflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFgetc(p0)")
private external fun wasmLibcSolidFgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidFgets(p0, p1, p2)")
private external fun wasmLibcSolidFgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidFopen(p0, p1)")
private external fun wasmLibcSolidFopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidFprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidFprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidFputc(p0, p1)")
private external fun wasmLibcSolidFputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidFputs(p0, p1)")
private external fun wasmLibcSolidFputs(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidFread(p0, p1, p2, p3)")
private external fun wasmLibcSolidFread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidFreopen(p0, p1, p2)")
private external fun wasmLibcSolidFreopen(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidFscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidFscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidFseek(p0, p1, p2)")
private external fun wasmLibcSolidFseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFtell(p0)")
private external fun wasmLibcSolidFtell(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidFwrite(p0, p1, p2, p3)")
private external fun wasmLibcSolidFwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidGetc(p0)")
private external fun wasmLibcSolidGetc(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetchar()")
private external fun wasmLibcSolidGetchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPerror(p0)")
private external fun wasmLibcSolidPerror(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcSolidPrintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcSolidPrintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidPutc(p0, p1)")
private external fun wasmLibcSolidPutc(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPutchar(p0)")
private external fun wasmLibcSolidPutchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPuts(p0)")
private external fun wasmLibcSolidPuts(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidRemove(p0)")
private external fun wasmLibcSolidRemove(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidRewind(p0)")
private external fun wasmLibcSolidRewind(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcSolidScanf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcSolidScanf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidSetbuf(p0, p1)")
private external fun wasmLibcSolidSetbuf(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidSetvbuf(p0, p1, p2, p3)")
private external fun wasmLibcSolidSetvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidSscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidSscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcSolidTmpfile()")
private external fun wasmLibcSolidTmpfile(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidUngetc(p0, p1)")
private external fun wasmLibcSolidUngetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidVfprintf(p0, p1, p2)")
private external fun wasmLibcSolidVfprintf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidVprintf(p0, p1)")
private external fun wasmLibcSolidVprintf(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidGets(p0)")
private external fun wasmLibcSolidGets(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidSprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidSprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidTmpnam(p0)")
private external fun wasmLibcSolidTmpnam(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidVsprintf(p0, p1, p2)")
private external fun wasmLibcSolidVsprintf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidRename(p0, p1)")
private external fun wasmLibcSolidRename(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidAsiprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidAsiprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidFiprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidFiprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidFiscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidFiscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcSolidIprintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcSolidIprintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcSolidIscanf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcSolidIscanf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidSiprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidSiprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidSiscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidSiscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcSolidSniprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcSolidSniprintf(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidVasiprintf(p0, p1, p2)")
private external fun wasmLibcSolidVasiprintf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidVfiprintf(p0, p1, p2)")
private external fun wasmLibcSolidVfiprintf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidVfiscanf(p0, p1, p2)")
private external fun wasmLibcSolidVfiscanf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidViprintf(p0, p1)")
private external fun wasmLibcSolidViprintf(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidViscanf(p0, p1)")
private external fun wasmLibcSolidViscanf(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidVsiprintf(p0, p1, p2)")
private external fun wasmLibcSolidVsiprintf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidVsiscanf(p0, p1, p2)")
private external fun wasmLibcSolidVsiscanf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidVsniprintf(p0, p1, p2, p3)")
private external fun wasmLibcSolidVsniprintf(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidVdiprintf(p0, p1, p2)")
private external fun wasmLibcSolidVdiprintf(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidDiprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidDiprintf(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidFgetpos(p0, p1)")
private external fun wasmLibcSolidFgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidFsetpos(p0, p1)")
private external fun wasmLibcSolidFsetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidFdopen(p0, p1)")
private external fun wasmLibcSolidFdopen(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFileno(p0)")
private external fun wasmLibcSolidFileno(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFlockfile(p0)")
private external fun wasmLibcSolidFlockfile(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFtrylockfile(p0)")
private external fun wasmLibcSolidFtrylockfile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFunlockfile(p0)")
private external fun wasmLibcSolidFunlockfile(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidGetcUnlocked(p0)")
private external fun wasmLibcSolidGetcUnlocked(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetcharUnlocked()")
private external fun wasmLibcSolidGetcharUnlocked(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidPutcUnlocked(p0, p1)")
private external fun wasmLibcSolidPutcUnlocked(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPutcharUnlocked(p0)")
private external fun wasmLibcSolidPutcharUnlocked(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcSolidSnprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcSolidSnprintf(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidVsnprintf(p0, p1, p2, p3)")
private external fun wasmLibcSolidVsnprintf(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidGetw(p0)")
private external fun wasmLibcSolidGetw(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidPutw(p0, p1)")
private external fun wasmLibcSolidPutw(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidTempnam(p0, p1)")
private external fun wasmLibcSolidTempnam(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidFseeko(p0, p1, p2)")
private external fun wasmLibcSolidFseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFtello(p0)")
private external fun wasmLibcSolidFtello(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidAtof(p0)")
private external fun wasmLibcSolidAtof(p0: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrtod(p0, p1)")
private external fun wasmLibcSolidStrtod(p0: String, p1: String): Double

@JsFun("() => globalThis.__km_napi_libc.libcSolidDrand48()")
private external fun wasmLibcSolidDrand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidErand48(p0)")
private external fun wasmLibcSolidErand48(p0: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrtof(p0, p1)")
private external fun wasmLibcSolidStrtof(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrtold(p0, p1)")
private external fun wasmLibcSolidStrtold(p0: String, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtodL(p0, p1, p2)")
private external fun wasmLibcSolidStrtodL(p0: String, p1: String, p2: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtofL(p0, p1, p2)")
private external fun wasmLibcSolidStrtofL(p0: String, p1: String, p2: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtoldL(p0, p1, p2)")
private external fun wasmLibcSolidStrtoldL(p0: String, p1: String, p2: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidExit(p0)")
private external fun wasmLibcSolidExit(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcSolidAbort()")
private external fun wasmLibcSolidAbort()

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidAbs(p0)")
private external fun wasmLibcSolidAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidAtexit(p0)")
private external fun wasmLibcSolidAtexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidAtoi(p0)")
private external fun wasmLibcSolidAtoi(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidAtol(p0)")
private external fun wasmLibcSolidAtol(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidItoa(p0, p1, p2)")
private external fun wasmLibcSolidItoa(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidLtoa(p0, p1, p2)")
private external fun wasmLibcSolidLtoa(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidUltoa(p0, p1, p2)")
private external fun wasmLibcSolidUltoa(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcSolidBsearch(p0, p1, p2, p3, p4)")
private external fun wasmLibcSolidBsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidCalloc(p0, p1)")
private external fun wasmLibcSolidCalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFree(p0)")
private external fun wasmLibcSolidFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidGetenv(p0)")
private external fun wasmLibcSolidGetenv(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidLabs(p0)")
private external fun wasmLibcSolidLabs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidMalloc(p0)")
private external fun wasmLibcSolidMalloc(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidQsort(p0, p1, p2, p3)")
private external fun wasmLibcSolidQsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("() => globalThis.__km_napi_libc.libcSolidRand()")
private external fun wasmLibcSolidRand(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidRealloc(p0, p1)")
private external fun wasmLibcSolidRealloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSrand(p0)")
private external fun wasmLibcSolidSrand(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtol(p0, p1, p2)")
private external fun wasmLibcSolidStrtol(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtoul(p0, p1, p2)")
private external fun wasmLibcSolidStrtoul(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidMblen(p0, p1)")
private external fun wasmLibcSolidMblen(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMbstowcs(p0, p1, p2)")
private external fun wasmLibcSolidMbstowcs(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidWctomb(p0, p1)")
private external fun wasmLibcSolidWctomb(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMbtowc(p0, p1, p2)")
private external fun wasmLibcSolidMbtowc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidWcstombs(p0, p1, p2)")
private external fun wasmLibcSolidWcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidRandR(p0)")
private external fun wasmLibcSolidRandR(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidJrand48(p0)")
private external fun wasmLibcSolidJrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidLcong48(p0)")
private external fun wasmLibcSolidLcong48(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcSolidLrand48()")
private external fun wasmLibcSolidLrand48(): String

@JsFun("() => globalThis.__km_napi_libc.libcSolidMrand48()")
private external fun wasmLibcSolidMrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidNrand48(p0)")
private external fun wasmLibcSolidNrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSeed48(p0)")
private external fun wasmLibcSolidSeed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSrand48(p0)")
private external fun wasmLibcSolidSrand48(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPutenv(p0)")
private external fun wasmLibcSolidPutenv(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidA64l(p0)")
private external fun wasmLibcSolidA64l(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidL64a(p0)")
private external fun wasmLibcSolidL64a(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcSolidRandom()")
private external fun wasmLibcSolidRandom(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSetstate(p0)")
private external fun wasmLibcSolidSetstate(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidInitstate(p0, p1, p2)")
private external fun wasmLibcSolidInitstate(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSrandom(p0)")
private external fun wasmLibcSolidSrandom(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidMkostemp(p0, p1)")
private external fun wasmLibcSolidMkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMkostemps(p0, p1, p2)")
private external fun wasmLibcSolidMkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidMkdtemp(p0)")
private external fun wasmLibcSolidMkdtemp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidMkstemp(p0)")
private external fun wasmLibcSolidMkstemp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidMktemp(p0)")
private external fun wasmLibcSolidMktemp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidAtoll(p0)")
private external fun wasmLibcSolidAtoll(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidLlabs(p0)")
private external fun wasmLibcSolidLlabs(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtoll(p0, p1, p2)")
private external fun wasmLibcSolidStrtoll(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtoull(p0, p1, p2)")
private external fun wasmLibcSolidStrtoull(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidAlignedAlloc(p0, p1)")
private external fun wasmLibcSolidAlignedAlloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidAtQuickExit(p0)")
private external fun wasmLibcSolidAtQuickExit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidQuickExit(p0)")
private external fun wasmLibcSolidQuickExit(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidSetenv(p0, p1, p2)")
private external fun wasmLibcSolidSetenv(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidUnsetenv(p0)")
private external fun wasmLibcSolidUnsetenv(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcSolidHumanizeNumber(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcSolidHumanizeNumber(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidDehumanizeNumber(p0, p1)")
private external fun wasmLibcSolidDehumanizeNumber(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidGetenvR(p0, p1, p2)")
private external fun wasmLibcSolidGetenvR(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidHeapsort(p0, p1, p2, p3)")
private external fun wasmLibcSolidHeapsort(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidMergesort(p0, p1, p2, p3)")
private external fun wasmLibcSolidMergesort(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidRadixsort(p0, p1, p2, p3)")
private external fun wasmLibcSolidRadixsort(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidSradixsort(p0, p1, p2, p3)")
private external fun wasmLibcSolidSradixsort(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetprogname()")
private external fun wasmLibcSolidGetprogname(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSetprogname(p0)")
private external fun wasmLibcSolidSetprogname(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidQabs(p0)")
private external fun wasmLibcSolidQabs(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtoq(p0, p1, p2)")
private external fun wasmLibcSolidStrtoq(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtouq(p0, p1, p2)")
private external fun wasmLibcSolidStrtouq(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidStrsuftoll(p0, p1, p2, p3)")
private external fun wasmLibcSolidStrsuftoll(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcSolidStrsuftollx(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcSolidStrsuftollx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidL64aR(p0, p1, p2)")
private external fun wasmLibcSolidL64aR(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidStrtolL(p0, p1, p2, p3)")
private external fun wasmLibcSolidStrtolL(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidStrtoulL(p0, p1, p2, p3)")
private external fun wasmLibcSolidStrtoulL(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidStrtollL(p0, p1, p2, p3)")
private external fun wasmLibcSolidStrtollL(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidStrtoullL(p0, p1, p2, p3)")
private external fun wasmLibcSolidStrtoullL(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidStrtoqL(p0, p1, p2, p3)")
private external fun wasmLibcSolidStrtoqL(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidStrtouqL(p0, p1, p2, p3)")
private external fun wasmLibcSolidStrtouqL(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidMbCurMaxL(p0)")
private external fun wasmLibcSolidMbCurMaxL(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMblenL(p0, p1, p2)")
private external fun wasmLibcSolidMblenL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidMbstowcsL(p0, p1, p2, p3)")
private external fun wasmLibcSolidMbstowcsL(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidWctombL(p0, p1, p2)")
private external fun wasmLibcSolidWctombL(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidMbtowcL(p0, p1, p2, p3)")
private external fun wasmLibcSolidMbtowcL(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidWcstombsL(p0, p1, p2, p3)")
private external fun wasmLibcSolidWcstombsL(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMemchr(p0, p1, p2)")
private external fun wasmLibcSolidMemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMemcmp(p0, p1, p2)")
private external fun wasmLibcSolidMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMemcpy(p0, p1, p2)")
private external fun wasmLibcSolidMemcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMemmove(p0, p1, p2)")
private external fun wasmLibcSolidMemmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMemset(p0, p1, p2)")
private external fun wasmLibcSolidMemset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrcat(p0, p1)")
private external fun wasmLibcSolidStrcat(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrchr(p0, p1)")
private external fun wasmLibcSolidStrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrcmp(p0, p1)")
private external fun wasmLibcSolidStrcmp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrcoll(p0, p1)")
private external fun wasmLibcSolidStrcoll(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrcpy(p0, p1)")
private external fun wasmLibcSolidStrcpy(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrcspn(p0, p1)")
private external fun wasmLibcSolidStrcspn(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidStrerror(p0)")
private external fun wasmLibcSolidStrerror(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidStrlen(p0)")
private external fun wasmLibcSolidStrlen(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrncat(p0, p1, p2)")
private external fun wasmLibcSolidStrncat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrncmp(p0, p1, p2)")
private external fun wasmLibcSolidStrncmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrncpy(p0, p1, p2)")
private external fun wasmLibcSolidStrncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrpbrk(p0, p1)")
private external fun wasmLibcSolidStrpbrk(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrrchr(p0, p1)")
private external fun wasmLibcSolidStrrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrspn(p0, p1)")
private external fun wasmLibcSolidStrspn(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrstr(p0, p1)")
private external fun wasmLibcSolidStrstr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrtok(p0, p1)")
private external fun wasmLibcSolidStrtok(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrtokR(p0, p1, p2)")
private external fun wasmLibcSolidStrtokR(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrerrorR(p0, p1, p2)")
private external fun wasmLibcSolidStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrxfrm(p0, p1, p2)")
private external fun wasmLibcSolidStrxfrm(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidMemccpy(p0, p1, p2, p3)")
private external fun wasmLibcSolidMemccpy(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidStrdup(p0)")
private external fun wasmLibcSolidStrdup(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStpcpy(p0, p1)")
private external fun wasmLibcSolidStpcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStpncpy(p0, p1, p2)")
private external fun wasmLibcSolidStpncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrnlen(p0, p1)")
private external fun wasmLibcSolidStrnlen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidMemmem(p0, p1, p2, p3)")
private external fun wasmLibcSolidMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrcasestr(p0, p1)")
private external fun wasmLibcSolidStrcasestr(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrlcat(p0, p1, p2)")
private external fun wasmLibcSolidStrlcat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrlcpy(p0, p1, p2)")
private external fun wasmLibcSolidStrlcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrsep(p0, p1)")
private external fun wasmLibcSolidStrsep(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStresep(p0, p1, p2)")
private external fun wasmLibcSolidStresep(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrndup(p0, p1)")
private external fun wasmLibcSolidStrndup(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidMemrchr(p0, p1, p2)")
private external fun wasmLibcSolidMemrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidExplicitMemset(p0, p1, p2)")
private external fun wasmLibcSolidExplicitMemset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidConsttimeMemequal(p0, p1, p2)")
private external fun wasmLibcSolidConsttimeMemequal(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrcollL(p0, p1, p2)")
private external fun wasmLibcSolidStrcollL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidStrxfrmL(p0, p1, p2, p3)")
private external fun wasmLibcSolidStrxfrmL(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrerrorL(p0, p1)")
private external fun wasmLibcSolidStrerrorL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidBcmp(p0, p1, p2)")
private external fun wasmLibcSolidBcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidBcopy(p0, p1, p2)")
private external fun wasmLibcSolidBcopy(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidBzero(p0, p1)")
private external fun wasmLibcSolidBzero(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFfs(p0)")
private external fun wasmLibcSolidFfs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPopcount(p0)")
private external fun wasmLibcSolidPopcount(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPopcountl(p0)")
private external fun wasmLibcSolidPopcountl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPopcountll(p0)")
private external fun wasmLibcSolidPopcountll(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPopcount32(p0)")
private external fun wasmLibcSolidPopcount32(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidPopcount64(p0)")
private external fun wasmLibcSolidPopcount64(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidRindex(p0, p1)")
private external fun wasmLibcSolidRindex(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStrcasecmp(p0, p1)")
private external fun wasmLibcSolidStrcasecmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidStrncasecmp(p0, p1, p2)")
private external fun wasmLibcSolidStrncasecmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidSignal(p0, p1)")
private external fun wasmLibcSolidSignal(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidRaise(p0)")
private external fun wasmLibcSolidRaise(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidAsctime(p0)")
private external fun wasmLibcSolidAsctime(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcSolidClock()")
private external fun wasmLibcSolidClock(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidCtime(p0)")
private external fun wasmLibcSolidCtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidDifftime(p0, p1)")
private external fun wasmLibcSolidDifftime(p0: String, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidGmtime(p0)")
private external fun wasmLibcSolidGmtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidLocaltime(p0)")
private external fun wasmLibcSolidLocaltime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidTime(p0)")
private external fun wasmLibcSolidTime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidMktime(p0)")
private external fun wasmLibcSolidMktime(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcSolidStrftime(p0, p1, p2, p3)")
private external fun wasmLibcSolidStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidUtime(p0, p1)")
private external fun wasmLibcSolidUtime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidAsctimeR(p0, p1)")
private external fun wasmLibcSolidAsctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidCtimeR(p0, p1)")
private external fun wasmLibcSolidCtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidGmtimeR(p0, p1)")
private external fun wasmLibcSolidGmtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidLocaltimeR(p0, p1)")
private external fun wasmLibcSolidLocaltimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidStat(p0, p1)")
private external fun wasmLibcSolidStat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidLstat(p0, p1)")
private external fun wasmLibcSolidLstat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidFstat(p0, p1)")
private external fun wasmLibcSolidFstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidChmod(p0, p1)")
private external fun wasmLibcSolidChmod(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidMkdir(p0, p1)")
private external fun wasmLibcSolidMkdir(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidCreat(p0, p1)")
private external fun wasmLibcSolidCreat(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidClose(p0)")
private external fun wasmLibcSolidClose(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidRead(p0, p1, p2)")
private external fun wasmLibcSolidRead(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidWrite(p0, p1, p2)")
private external fun wasmLibcSolidWrite(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidUnlink(p0)")
private external fun wasmLibcSolidUnlink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidTell(p0)")
private external fun wasmLibcSolidTell(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidDup(p0)")
private external fun wasmLibcSolidDup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidDup2(p0, p1)")
private external fun wasmLibcSolidDup2(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidAccess(p0, p1)")
private external fun wasmLibcSolidAccess(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidRmdir(p0)")
private external fun wasmLibcSolidRmdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidChdir(p0)")
private external fun wasmLibcSolidChdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidGetwd(p0)")
private external fun wasmLibcSolidGetwd(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidGetcwd(p0, p1)")
private external fun wasmLibcSolidGetcwd(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidGetopt(p0, p1, p2)")
private external fun wasmLibcSolidGetopt(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidGetsubopt(p0, p1, p2)")
private external fun wasmLibcSolidGetsubopt(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcSolidFcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcSolidFcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcSolidGetpid()")
private external fun wasmLibcSolidGetpid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidSleep(p0)")
private external fun wasmLibcSolidSleep(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidUsleep(p0)")
private external fun wasmLibcSolidUsleep(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcSolidLocaleconv()")
private external fun wasmLibcSolidLocaleconv(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidSetlocale(p0, p1)")
private external fun wasmLibcSolidSetlocale(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidDuplocale(p0)")
private external fun wasmLibcSolidDuplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidFreelocale(p0)")
private external fun wasmLibcSolidFreelocale(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidLocaleconvL(p0)")
private external fun wasmLibcSolidLocaleconvL(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidNewlocale(p0, p1, p2)")
private external fun wasmLibcSolidNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcSolidNlLanginfo(p0)")
private external fun wasmLibcSolidNlLanginfo(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidNlLanginfoL(p0, p1)")
private external fun wasmLibcSolidNlLanginfoL(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcSolidMemalign(p0, p1)")
private external fun wasmLibcSolidMemalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcSolidLseek(p0, p1, p2)")
private external fun wasmLibcSolidLseek(p0: Int, p1: String, p2: Int): String

public actual var OPTARG: MutPtr
    get() = if (solidNapiAvailable) MutPtr(wasmLibcSolidGetOPTARG().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAvailable) {
            wasmLibcSolidSetOPTARG(value.rawAddress.toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTERR: CInt
    get() = if (solidNapiAvailable) wasmLibcSolidGetOPTERR() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAvailable) {
            wasmLibcSolidSetOPTERR(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTIND: CInt
    get() = if (solidNapiAvailable) wasmLibcSolidGetOPTIND() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAvailable) {
            wasmLibcSolidSetOPTIND(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTOPT: CInt
    get() = if (solidNapiAvailable) wasmLibcSolidGetOPTOPT() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAvailable) {
            wasmLibcSolidSetOPTOPT(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTRESET: CInt
    get() = if (solidNapiAvailable) wasmLibcSolidGetOPTRESET() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAvailable) {
            wasmLibcSolidSetOPTRESET(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var SUBOPTARG: MutPtr
    get() = if (solidNapiAvailable) MutPtr(wasmLibcSolidGetSUBOPTARG().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (solidNapiAvailable) {
            wasmLibcSolidSetSUBOPTARG(value.rawAddress.toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual fun isalnum(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIsalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIsalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIsdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIsgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIslower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIsprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIspunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIsspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIsupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIsxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidIsblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidTolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidToupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStdioFile(fileno: CInt): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidGetStdioFile(fileno).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(arg1: MutPtr) {
    if (solidNapiAvailable) {
        wasmLibcSolidClearerr(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fclose(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFclose(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFeof(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFerror(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFflush(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFgetc(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(arg1: MutPtr, arg2: CInt, arg3: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidFgets(arg1.rawAddress.toString(), arg2, arg3.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidFopen(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidFprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFputc(arg1, arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFputs(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: MutPtr): SizeT =
    if (solidNapiAvailable) wasmLibcSolidFread(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), arg4.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(arg1: ConstPtr, arg2: ConstPtr, arg3: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidFreopen(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidFscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(arg1: MutPtr, arg2: CLong, arg3: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidFseek(arg1.rawAddress.toString(), arg2.toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(arg1: MutPtr): CLong =
    if (solidNapiAvailable) wasmLibcSolidFtell(arg1.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(arg1: ConstPtr, arg2: SizeT, arg3: SizeT, arg4: MutPtr): SizeT =
    if (solidNapiAvailable) wasmLibcSolidFwrite(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), arg4.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getc(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidGetc(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (solidNapiAvailable) wasmLibcSolidGetchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(arg1: ConstPtr) {
    if (solidNapiAvailable) {
        wasmLibcSolidPerror(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun printf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidPrintf(arg1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putc(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidPutc(arg1, arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(arg1: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidPutchar(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(arg1: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidPuts(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(arg1: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidRemove(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(arg1: MutPtr) {
    if (solidNapiAvailable) {
        wasmLibcSolidRewind(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun scanf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidScanf(arg1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(arg1: MutPtr, arg2: MutPtr) {
    if (solidNapiAvailable) {
        wasmLibcSolidSetbuf(arg1.rawAddress.toString(), arg2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setvbuf(arg1: MutPtr, arg2: MutPtr, arg3: CInt, arg4: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidSetvbuf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(arg1: ConstPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidSscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidTmpfile().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidUngetc(arg1, arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVfprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vprintf(arg1: ConstPtr, arg2: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gets(arg1: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidGets(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidSprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(arg1: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidTmpnam(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVsprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(arg1: ConstPtr, arg2: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidRename(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asiprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidAsiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fiprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidFiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fiscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidFiscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iprintf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidIprintf(arg1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscanf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidIscanf(arg1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun siprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidSiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun siscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidSiscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sniprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidSniprintf(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vasiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVasiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVfiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfiscanf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVfiscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun viprintf(arg1: ConstPtr, arg2: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidViprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun viscanf(arg1: ConstPtr, arg2: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidViscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVsiprintf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsiscanf(arg1: ConstPtr, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVsiscanf(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsniprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVsniprintf(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vdiprintf(arg1: CInt, arg2: ConstPtr, arg3: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVdiprintf(arg1, arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diprintf(arg1: CInt, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidDiprintf(arg1, arg2.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos(arg1: MutPtr, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFgetpos(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(arg1: MutPtr, arg2: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFsetpos(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(arg1: CInt, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidFdopen(arg1, arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFileno(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flockfile(arg1: MutPtr) {
    if (solidNapiAvailable) {
        wasmLibcSolidFlockfile(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ftrylockfile(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFtrylockfile(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun funlockfile(arg1: MutPtr) {
    if (solidNapiAvailable) {
        wasmLibcSolidFunlockfile(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getcUnlocked(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidGetcUnlocked(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (solidNapiAvailable) wasmLibcSolidGetcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcUnlocked(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidPutcUnlocked(arg1, arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(arg1: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidPutcharUnlocked(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidSnprintf(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: VaList): CInt =
    if (solidNapiAvailable) wasmLibcSolidVsnprintf(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getw(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidGetw(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putw(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidPutw(arg1, arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tempnam(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidTempnam(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidFseeko(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr): OffT =
    if (solidNapiAvailable) wasmLibcSolidFtello(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(arg1: ConstPtr): Double =
    if (solidNapiAvailable) wasmLibcSolidAtof(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(arg1: ConstPtr, arg2: MutPtr): Double =
    if (solidNapiAvailable) wasmLibcSolidStrtod(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): Double =
    if (solidNapiAvailable) wasmLibcSolidDrand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(arg1: MutPtr): Double =
    if (solidNapiAvailable) wasmLibcSolidErand48(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(arg1: ConstPtr, arg2: MutPtr): Float =
    if (solidNapiAvailable) wasmLibcSolidStrtof(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtold(arg1: ConstPtr, arg2: MutPtr): Double =
    if (solidNapiAvailable) wasmLibcSolidStrtold(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtodL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Double =
    if (solidNapiAvailable) wasmLibcSolidStrtodL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtofL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Float =
    if (solidNapiAvailable) wasmLibcSolidStrtofL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toLong().toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoldL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Double =
    if (solidNapiAvailable) wasmLibcSolidStrtoldL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exit(arg1: CInt): Nothing {
    if (solidNapiAvailable) {
        wasmLibcSolidExit(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (solidNapiAvailable) {
        wasmLibcSolidAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidAbs(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    if (solidNapiAvailable) wasmLibcSolidAtexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(arg1: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidAtoi(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(arg1: ConstPtr): CLong =
    if (solidNapiAvailable) wasmLibcSolidAtol(arg1.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun itoa(arg1: CInt, arg2: MutPtr, arg3: CInt): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidItoa(arg1, arg2.rawAddress.toString(), arg3).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ltoa(arg1: CLong, arg2: MutPtr, arg3: CInt): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidLtoa(arg1.toString(), arg2.rawAddress.toString(), arg3).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ultoa(arg1: CUlong, arg2: MutPtr, arg3: CInt): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidUltoa(arg1.toString(), arg2.rawAddress.toString(), arg3).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bsearch(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidBsearch(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(arg1: SizeT, arg2: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidCalloc(arg1.toString(), arg2.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(arg1: MutPtr) {
    if (solidNapiAvailable) {
        wasmLibcSolidFree(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getenv(arg1: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidGetenv(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(arg1: CLong): CLong =
    if (solidNapiAvailable) wasmLibcSolidLabs(arg1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(arg1: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMalloc(arg1.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    if (solidNapiAvailable) {
        wasmLibcSolidQsort(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rand(): CInt =
    if (solidNapiAvailable) wasmLibcSolidRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(arg1: MutPtr, arg2: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidRealloc(arg1.rawAddress.toString(), arg2.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(arg1: CUint) {
    if (solidNapiAvailable) {
        wasmLibcSolidSrand(arg1.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtol(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CLong =
    if (solidNapiAvailable) wasmLibcSolidStrtol(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CUlong =
    if (solidNapiAvailable) wasmLibcSolidStrtoul(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mblen(arg1: ConstPtr, arg2: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidMblen(arg1.rawAddress.toString(), arg2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbstowcs(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidMbstowcs(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctomb(arg1: MutPtr, arg2: WcharT): CInt =
    if (solidNapiAvailable) wasmLibcSolidWctomb(arg1.rawAddress.toString(), arg2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbtowc(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidMbtowc(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidWcstombs(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randR(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidRandR(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(arg1: MutPtr): CLong =
    if (solidNapiAvailable) wasmLibcSolidJrand48(arg1.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(arg1: MutPtr) {
    if (solidNapiAvailable) {
        wasmLibcSolidLcong48(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lrand48(): CLong =
    if (solidNapiAvailable) wasmLibcSolidLrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (solidNapiAvailable) wasmLibcSolidMrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(arg1: MutPtr): CLong =
    if (solidNapiAvailable) wasmLibcSolidNrand48(arg1.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(arg1: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidSeed48(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(arg1: CLong) {
    if (solidNapiAvailable) {
        wasmLibcSolidSrand48(arg1.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun putenv(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidPutenv(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun a64l(arg1: ConstPtr): CLong =
    if (solidNapiAvailable) wasmLibcSolidA64l(arg1.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun l64a(arg1: CLong): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidL64a(arg1.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (solidNapiAvailable) wasmLibcSolidRandom().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setstate(arg1: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidSetstate(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initstate(arg1: CUint, arg2: MutPtr, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidInitstate(arg1.toInt(), arg2.rawAddress.toString(), arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(arg1: CUint) {
    if (solidNapiAvailable) {
        wasmLibcSolidSrandom(arg1.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mkostemp(arg1: MutPtr, arg2: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidMkostemp(arg1.rawAddress.toString(), arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(arg1: MutPtr, arg2: CInt, arg3: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidMkostemps(arg1.rawAddress.toString(), arg2, arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(arg1: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMkdtemp(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(arg1: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidMkstemp(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktemp(arg1: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMktemp(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(arg1: ConstPtr): CLonglong =
    if (solidNapiAvailable) wasmLibcSolidAtoll(arg1.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(arg1: CLonglong): CLonglong =
    if (solidNapiAvailable) wasmLibcSolidLlabs(arg1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CLonglong =
    if (solidNapiAvailable) wasmLibcSolidStrtoll(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CUlonglong =
    if (solidNapiAvailable) wasmLibcSolidStrtoull(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidAlignedAlloc(arg1.toString(), arg2.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    if (solidNapiAvailable) wasmLibcSolidAtQuickExit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quickExit(arg1: CInt) {
    if (solidNapiAvailable) {
        wasmLibcSolidQuickExit(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setenv(arg1: ConstPtr, arg2: ConstPtr, arg3: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidSetenv(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(arg1: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidUnsetenv(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun humanizeNumber(arg1: MutPtr, arg2: SizeT, arg3: Long, arg4: ConstPtr, arg5: CInt, arg6: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidHumanizeNumber(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), arg4.rawAddress.toString(), arg5, arg6) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dehumanizeNumber(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidDehumanizeNumber(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenvR(arg1: ConstPtr, arg2: MutPtr, arg3: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidGetenvR(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapsort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    if (solidNapiAvailable) wasmLibcSolidHeapsort(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergesort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    if (solidNapiAvailable) wasmLibcSolidMergesort(arg1.rawAddress.toString(), arg2.toString(), arg3.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun radixsort(arg1: MutPtr, arg2: CInt, arg3: ConstPtr, arg4: CUint): CInt =
    if (solidNapiAvailable) wasmLibcSolidRadixsort(arg1.rawAddress.toString(), arg2, arg3.rawAddress.toString(), arg4.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sradixsort(arg1: MutPtr, arg2: CInt, arg3: ConstPtr, arg4: CUint): CInt =
    if (solidNapiAvailable) wasmLibcSolidSradixsort(arg1.rawAddress.toString(), arg2, arg3.rawAddress.toString(), arg4.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): ConstPtr =
    if (solidNapiAvailable) ConstPtr(wasmLibcSolidGetprogname().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(arg1: ConstPtr) {
    if (solidNapiAvailable) {
        wasmLibcSolidSetprogname(arg1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qabs(arg1: QuadT): QuadT =
    if (solidNapiAvailable) wasmLibcSolidQabs(arg1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoq(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): QuadT =
    if (solidNapiAvailable) wasmLibcSolidStrtoq(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtouq(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): UQuadT =
    if (solidNapiAvailable) wasmLibcSolidStrtouq(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsuftoll(arg1: ConstPtr, arg2: ConstPtr, arg3: CLonglong, arg4: CLonglong): CLonglong =
    if (solidNapiAvailable) wasmLibcSolidStrsuftoll(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsuftollx(arg1: ConstPtr, arg2: ConstPtr, arg3: CLonglong, arg4: CLonglong, arg5: MutPtr, arg6: SizeT): CLonglong =
    if (solidNapiAvailable) wasmLibcSolidStrsuftollx(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toString(), arg5.rawAddress.toString(), arg6.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun l64aR(arg1: CLong, arg2: MutPtr, arg3: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidL64aR(arg1.toString(), arg2.rawAddress.toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtolL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CLong =
    if (solidNapiAvailable) wasmLibcSolidStrtolL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoulL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CUlong =
    if (solidNapiAvailable) wasmLibcSolidStrtoulL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtollL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CLonglong =
    if (solidNapiAvailable) wasmLibcSolidStrtollL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoullL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CUlonglong =
    if (solidNapiAvailable) wasmLibcSolidStrtoullL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoqL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): QuadT =
    if (solidNapiAvailable) wasmLibcSolidStrtoqL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtouqL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): UQuadT =
    if (solidNapiAvailable) wasmLibcSolidStrtouqL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidMbCurMaxL(arg1.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mblenL(arg1: ConstPtr, arg2: SizeT, arg3: LocaleT): CInt =
    if (solidNapiAvailable) wasmLibcSolidMblenL(arg1.rawAddress.toString(), arg2.toString(), arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbstowcsL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidMbstowcsL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctombL(arg1: MutPtr, arg2: WcharT, arg3: LocaleT): CInt =
    if (solidNapiAvailable) wasmLibcSolidWctombL(arg1.rawAddress.toString(), arg2.toInt(), arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbtowcL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): CInt =
    if (solidNapiAvailable) wasmLibcSolidMbtowcL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombsL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidWcstombsL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(arg1: ConstPtr, arg2: CInt, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMemchr(arg1.rawAddress.toString(), arg2, arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidMemcmp(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMemcpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMemmove(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(arg1: MutPtr, arg2: CInt, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMemset(arg1.rawAddress.toString(), arg2, arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrcat(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(arg1: ConstPtr, arg2: CInt): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrchr(arg1.rawAddress.toString(), arg2).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(arg1: ConstPtr, arg2: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidStrcmp(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(arg1: ConstPtr, arg2: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidStrcoll(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrcpy(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(arg1: ConstPtr, arg2: ConstPtr): SizeT =
    if (solidNapiAvailable) wasmLibcSolidStrcspn(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(arg1: CInt): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrerror(arg1).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(arg1: ConstPtr): SizeT =
    if (solidNapiAvailable) wasmLibcSolidStrlen(arg1.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrncat(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidStrncmp(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrncpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrpbrk(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(arg1: ConstPtr, arg2: CInt): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrrchr(arg1.rawAddress.toString(), arg2).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(arg1: ConstPtr, arg2: ConstPtr): SizeT =
    if (solidNapiAvailable) wasmLibcSolidStrspn(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrstr(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrtok(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtokR(arg1: MutPtr, arg2: ConstPtr, arg3: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrtokR(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(arg1: CInt, arg2: MutPtr, arg3: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidStrerrorR(arg1, arg2.rawAddress.toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidStrxfrm(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(arg1: MutPtr, arg2: ConstPtr, arg3: CInt, arg4: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMemccpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3, arg4.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(arg1: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrdup(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpcpy(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStpcpy(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpncpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStpncpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(arg1: ConstPtr, arg2: SizeT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidStrnlen(arg1.rawAddress.toString(), arg2.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(arg1: ConstPtr, arg2: SizeT, arg3: ConstPtr, arg4: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMemmem(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrcasestr(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcat(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidStrlcat(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidStrlcpy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrsep(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stresep(arg1: MutPtr, arg2: ConstPtr, arg3: CInt): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStresep(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(arg1: ConstPtr, arg2: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrndup(arg1.rawAddress.toString(), arg2.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(arg1: ConstPtr, arg2: CInt, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMemrchr(arg1.rawAddress.toString(), arg2, arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitMemset(arg1: MutPtr, arg2: CInt, arg3: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidExplicitMemset(arg1.rawAddress.toString(), arg2, arg3.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun consttimeMemequal(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidConsttimeMemequal(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcollL(arg1: ConstPtr, arg2: ConstPtr, arg3: LocaleT): CInt =
    if (solidNapiAvailable) wasmLibcSolidStrcollL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrmL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT =
    if (solidNapiAvailable) wasmLibcSolidStrxfrmL(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString(), arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidStrerrorL(arg1, arg2.toLong().toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidBcmp(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcopy(arg1: ConstPtr, arg2: MutPtr, arg3: SizeT) {
    if (solidNapiAvailable) {
        wasmLibcSolidBcopy(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bzero(arg1: MutPtr, arg2: SizeT) {
    if (solidNapiAvailable) {
        wasmLibcSolidBzero(arg1.rawAddress.toString(), arg2.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ffs(arg1: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidFfs(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount(arg1: CUint): CUint =
    if (solidNapiAvailable) wasmLibcSolidPopcount(arg1.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcountl(arg1: CUlong): CUint =
    if (solidNapiAvailable) wasmLibcSolidPopcountl(arg1.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcountll(arg1: CUlonglong): CUint =
    if (solidNapiAvailable) wasmLibcSolidPopcountll(arg1.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount32(arg1: UInt): CUint =
    if (solidNapiAvailable) wasmLibcSolidPopcount32(arg1.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount64(arg1: ULong): CUint =
    if (solidNapiAvailable) wasmLibcSolidPopcount64(arg1.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rindex(arg1: ConstPtr, arg2: CInt): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidRindex(arg1.rawAddress.toString(), arg2).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(arg1: ConstPtr, arg2: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidStrcasecmp(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidStrncasecmp(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    if (solidNapiAvailable) wasmLibcSolidSignal(arg1, arg2.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(arg1: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidRaise(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(arg1: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidAsctime(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (solidNapiAvailable) wasmLibcSolidClock().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(arg1: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidCtime(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    if (solidNapiAvailable) wasmLibcSolidDifftime(arg1.toString(), arg2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(arg1: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidGmtime(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(arg1: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidLocaltime(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(arg1: MutPtr): TimeT =
    if (solidNapiAvailable) wasmLibcSolidTime(arg1.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(arg1: MutPtr): TimeT =
    if (solidNapiAvailable) wasmLibcSolidMktime(arg1.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: ConstPtr): SizeT =
    if (solidNapiAvailable) wasmLibcSolidStrftime(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidUtime(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidAsctimeR(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidCtimeR(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidGmtimeR(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidLocaltimeR(arg1.rawAddress.toString(), arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidStat(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(arg1: ConstPtr, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidLstat(arg1.rawAddress.toString(), arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(arg1: CInt, arg2: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidFstat(arg1, arg2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(arg1: ConstPtr, arg2: ModeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidChmod(arg1.rawAddress.toString(), arg2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(arg1: ConstPtr, arg2: ModeT): CInt =
    if (solidNapiAvailable) wasmLibcSolidMkdir(arg1.rawAddress.toString(), arg2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(arg1: ConstPtr, arg2: CInt, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidOpen(arg1.rawAddress.toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(arg1: ConstPtr, arg2: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidCreat(arg1.rawAddress.toString(), arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(arg1: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidClose(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(arg1: CInt, arg2: MutPtr, arg3: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidRead(arg1, arg2.rawAddress.toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(arg1: CInt, arg2: ConstPtr, arg3: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidWrite(arg1, arg2.rawAddress.toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(arg1: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidUnlink(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tell(arg1: CInt): CLong =
    if (solidNapiAvailable) wasmLibcSolidTell(arg1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(arg1: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidDup(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidDup2(arg1, arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(arg1: ConstPtr, arg2: CInt): CInt =
    if (solidNapiAvailable) wasmLibcSolidAccess(arg1.rawAddress.toString(), arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(arg1: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidRmdir(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(arg1: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidChdir(arg1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getwd(arg1: MutPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidGetwd(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(arg1: MutPtr, arg2: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidGetcwd(arg1.rawAddress.toString(), arg2.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(arg1: CInt, arg2: MutPtr, arg3: ConstPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidGetopt(arg1, arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsubopt(arg1: MutPtr, arg2: ConstPtr, arg3: MutPtr): CInt =
    if (solidNapiAvailable) wasmLibcSolidGetsubopt(arg1.rawAddress.toString(), arg2.rawAddress.toString(), arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    if (solidNapiAvailable) wasmLibcSolidFcntl(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (solidNapiAvailable) wasmLibcSolidGetpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(arg1: CUint): CUint =
    if (solidNapiAvailable) wasmLibcSolidSleep(arg1.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(arg1: UsecondsT): CInt =
    if (solidNapiAvailable) wasmLibcSolidUsleep(arg1.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidLocaleconv().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(arg1: CInt, arg2: ConstPtr): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidSetlocale(arg1, arg2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    if (solidNapiAvailable) wasmLibcSolidDuplocale(arg1.toLong().toString()).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(arg1: LocaleT) {
    if (solidNapiAvailable) {
        wasmLibcSolidFreelocale(arg1.toLong().toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun localeconvL(arg1: LocaleT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidLocaleconvL(arg1.toLong().toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(arg1: CInt, arg2: ConstPtr, arg3: LocaleT): LocaleT =
    if (solidNapiAvailable) wasmLibcSolidNewlocale(arg1, arg2.rawAddress.toString(), arg3.toLong().toString()).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidNlLanginfo(item.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidNlLanginfoL(item.toString(), locale.toLong().toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    if (solidNapiAvailable) MutPtr(wasmLibcSolidMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    if (solidNapiAvailable) wasmLibcSolidLseek(arg1, arg2.toString(), arg3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
