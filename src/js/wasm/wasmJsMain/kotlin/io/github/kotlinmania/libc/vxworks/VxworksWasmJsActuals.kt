@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initVxworksNapiAddon(): Boolean

private val vxworksNapiAvailable: Boolean = initVxworksNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsalnum(p0)")
private external fun wasmLibcVxworksIsalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsalpha(p0)")
private external fun wasmLibcVxworksIsalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIscntrl(p0)")
private external fun wasmLibcVxworksIscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsdigit(p0)")
private external fun wasmLibcVxworksIsdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsgraph(p0)")
private external fun wasmLibcVxworksIsgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIslower(p0)")
private external fun wasmLibcVxworksIslower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsprint(p0)")
private external fun wasmLibcVxworksIsprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIspunct(p0)")
private external fun wasmLibcVxworksIspunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsspace(p0)")
private external fun wasmLibcVxworksIsspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsupper(p0)")
private external fun wasmLibcVxworksIsupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsxdigit(p0)")
private external fun wasmLibcVxworksIsxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsblank(p0)")
private external fun wasmLibcVxworksIsblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksTolower(p0)")
private external fun wasmLibcVxworksTolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksToupper(p0)")
private external fun wasmLibcVxworksToupper(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFopen(p0, p1)")
private external fun wasmLibcVxworksFopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksFreopen(p0, p1, p2)")
private external fun wasmLibcVxworksFreopen(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFflush(p0)")
private external fun wasmLibcVxworksFflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFclose(p0)")
private external fun wasmLibcVxworksFclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksRemove(p0)")
private external fun wasmLibcVxworksRemove(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksRename(p0, p1)")
private external fun wasmLibcVxworksRename(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksTmpfile()")
private external fun wasmLibcVxworksTmpfile(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksSetvbuf(p0, p1, p2, p3)")
private external fun wasmLibcVxworksSetvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSetbuf(p0, p1)")
private external fun wasmLibcVxworksSetbuf(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libcVxworksGetchar()")
private external fun wasmLibcVxworksGetchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPutchar(p0)")
private external fun wasmLibcVxworksPutchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFgetc(p0)")
private external fun wasmLibcVxworksFgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksFgets(p0, p1, p2)")
private external fun wasmLibcVxworksFgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFputc(p0, p1)")
private external fun wasmLibcVxworksFputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFputs(p0, p1)")
private external fun wasmLibcVxworksFputs(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPuts(p0)")
private external fun wasmLibcVxworksPuts(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksUngetc(p0, p1)")
private external fun wasmLibcVxworksUngetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksFread(p0, p1, p2, p3)")
private external fun wasmLibcVxworksFread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksFwrite(p0, p1, p2, p3)")
private external fun wasmLibcVxworksFwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksFseek(p0, p1, p2)")
private external fun wasmLibcVxworksFseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFtell(p0)")
private external fun wasmLibcVxworksFtell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksRewind(p0)")
private external fun wasmLibcVxworksRewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFgetpos(p0, p1)")
private external fun wasmLibcVxworksFgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFsetpos(p0, p1)")
private external fun wasmLibcVxworksFsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFeof(p0)")
private external fun wasmLibcVxworksFeof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFerror(p0)")
private external fun wasmLibcVxworksFerror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPerror(p0)")
private external fun wasmLibcVxworksPerror(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksAtof(p0)")
private external fun wasmLibcVxworksAtof(p0: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksAtoi(p0)")
private external fun wasmLibcVxworksAtoi(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksAtol(p0)")
private external fun wasmLibcVxworksAtol(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksAtoll(p0)")
private external fun wasmLibcVxworksAtoll(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrtod(p0, p1)")
private external fun wasmLibcVxworksStrtod(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrtof(p0, p1)")
private external fun wasmLibcVxworksStrtof(p0: String, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrtol(p0, p1, p2)")
private external fun wasmLibcVxworksStrtol(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrtoll(p0, p1, p2)")
private external fun wasmLibcVxworksStrtoll(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrtoul(p0, p1, p2)")
private external fun wasmLibcVxworksStrtoul(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrtoull(p0, p1, p2)")
private external fun wasmLibcVxworksStrtoull(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksCalloc(p0, p1)")
private external fun wasmLibcVxworksCalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksMalloc(p0)")
private external fun wasmLibcVxworksMalloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksRealloc(p0, p1)")
private external fun wasmLibcVxworksRealloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFree(p0)")
private external fun wasmLibcVxworksFree(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcVxworksAbort()")
private external fun wasmLibcVxworksAbort()

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksExit(p0)")
private external fun wasmLibcVxworksExit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksAtexit(p0)")
private external fun wasmLibcVxworksAtexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSystem(p0)")
private external fun wasmLibcVxworksSystem(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksGetenv(p0)")
private external fun wasmLibcVxworksGetenv(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksCfgetospeed(p0)")
private external fun wasmLibcVxworksCfgetospeed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksCfmakeraw(p0)")
private external fun wasmLibcVxworksCfmakeraw(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksCfsetispeed(p0, p1)")
private external fun wasmLibcVxworksCfsetispeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksCfsetospeed(p0, p1)")
private external fun wasmLibcVxworksCfsetospeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrcpy(p0, p1)")
private external fun wasmLibcVxworksStrcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrncpy(p0, p1, p2)")
private external fun wasmLibcVxworksStrncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrcat(p0, p1)")
private external fun wasmLibcVxworksStrcat(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrncat(p0, p1, p2)")
private external fun wasmLibcVxworksStrncat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrcmp(p0, p1)")
private external fun wasmLibcVxworksStrcmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrncmp(p0, p1, p2)")
private external fun wasmLibcVxworksStrncmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrcoll(p0, p1)")
private external fun wasmLibcVxworksStrcoll(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrchr(p0, p1)")
private external fun wasmLibcVxworksStrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrrchr(p0, p1)")
private external fun wasmLibcVxworksStrrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrspn(p0, p1)")
private external fun wasmLibcVxworksStrspn(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrcspn(p0, p1)")
private external fun wasmLibcVxworksStrcspn(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksStrdup(p0)")
private external fun wasmLibcVxworksStrdup(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrpbrk(p0, p1)")
private external fun wasmLibcVxworksStrpbrk(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrstr(p0, p1)")
private external fun wasmLibcVxworksStrstr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrcasecmp(p0, p1)")
private external fun wasmLibcVxworksStrcasecmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrncasecmp(p0, p1, p2)")
private external fun wasmLibcVxworksStrncasecmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksStrlen(p0)")
private external fun wasmLibcVxworksStrlen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrnlen(p0, p1)")
private external fun wasmLibcVxworksStrnlen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksStrerror(p0)")
private external fun wasmLibcVxworksStrerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStrtok(p0, p1)")
private external fun wasmLibcVxworksStrtok(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrxfrm(p0, p1, p2)")
private external fun wasmLibcVxworksStrxfrm(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksWcslen(p0)")
private external fun wasmLibcVxworksWcslen(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksWcstombs(p0, p1, p2)")
private external fun wasmLibcVxworksWcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksMemchr(p0, p1, p2)")
private external fun wasmLibcVxworksMemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksWmemchr(p0, p1, p2)")
private external fun wasmLibcVxworksWmemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksMemcmp(p0, p1, p2)")
private external fun wasmLibcVxworksMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksMemcpy(p0, p1, p2)")
private external fun wasmLibcVxworksMemcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksMemccpy(p0, p1, p2, p3)")
private external fun wasmLibcVxworksMemccpy(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksMemmove(p0, p1, p2)")
private external fun wasmLibcVxworksMemmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksMemset(p0, p1, p2)")
private external fun wasmLibcVxworksMemset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksAlignedAlloc(p0, p1)")
private external fun wasmLibcVxworksAlignedAlloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksUname(p0)")
private external fun wasmLibcVxworksUname(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksTimes(p0)")
private external fun wasmLibcVxworksTimes(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksTcflush(p0, p1)")
private external fun wasmLibcVxworksTcflush(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPclose(p0)")
private external fun wasmLibcVxworksPclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksMkdtemp(p0)")
private external fun wasmLibcVxworksMkdtemp(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcVxworksLinkat(p0, p1, p2, p3, p4)")
private external fun wasmLibcVxworksLinkat(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksUnlinkat(p0, p1, p2)")
private external fun wasmLibcVxworksUnlinkat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksGetprotobyname(p0)")
private external fun wasmLibcVxworksGetprotobyname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksGetprotobynumber(p0)")
private external fun wasmLibcVxworksGetprotobynumber(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksGetservbyname(p0, p1)")
private external fun wasmLibcVxworksGetservbyname(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcVxworksFchownat(p0, p1, p2, p3, p4)")
private external fun wasmLibcVxworksFchownat(p0: Int, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksFprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksFprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcVxworksPrintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcVxworksPrintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcVxworksSnprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcVxworksSnprintf(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksSprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksSprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksFscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksFscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcVxworksScanf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcVxworksScanf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksSscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksSscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksGetcharUnlocked()")
private external fun wasmLibcVxworksGetcharUnlocked(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPutcharUnlocked(p0)")
private external fun wasmLibcVxworksPutcharUnlocked(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksStat(p0, p1)")
private external fun wasmLibcVxworksStat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFdopen(p0, p1)")
private external fun wasmLibcVxworksFdopen(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFileno(p0)")
private external fun wasmLibcVxworksFileno(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksCreat(p0, p1)")
private external fun wasmLibcVxworksCreat(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksRewinddir(p0)")
private external fun wasmLibcVxworksRewinddir(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksFchown(p0, p1, p2)")
private external fun wasmLibcVxworksFchown(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksAccess(p0, p1)")
private external fun wasmLibcVxworksAccess(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksAlarm(p0)")
private external fun wasmLibcVxworksAlarm(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFchdir(p0)")
private external fun wasmLibcVxworksFchdir(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksChown(p0, p1, p2)")
private external fun wasmLibcVxworksChown(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFpathconf(p0, p1)")
private external fun wasmLibcVxworksFpathconf(p0: Int, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcVxworksGetegid()")
private external fun wasmLibcVxworksGetegid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksGeteuid()")
private external fun wasmLibcVxworksGeteuid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksGetgroups(p0, p1)")
private external fun wasmLibcVxworksGetgroups(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksGetlogin()")
private external fun wasmLibcVxworksGetlogin(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksGetopt(p0, p1, p2)")
private external fun wasmLibcVxworksGetopt(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPathconf(p0, p1)")
private external fun wasmLibcVxworksPathconf(p0: String, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcVxworksPause()")
private external fun wasmLibcVxworksPause(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSeteuid(p0)")
private external fun wasmLibcVxworksSeteuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSetegid(p0)")
private external fun wasmLibcVxworksSetegid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSleep(p0)")
private external fun wasmLibcVxworksSleep(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksTtyname(p0)")
private external fun wasmLibcVxworksTtyname(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksWait(p0)")
private external fun wasmLibcVxworksWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksUmask(p0)")
private external fun wasmLibcVxworksUmask(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksMlock(p0, p1)")
private external fun wasmLibcVxworksMlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksMlockall(p0)")
private external fun wasmLibcVxworksMlockall(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksMunlock(p0, p1)")
private external fun wasmLibcVxworksMunlock(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksMunlockall()")
private external fun wasmLibcVxworksMunlockall(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcVxworksMmap(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcVxworksMmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksMunmap(p0, p1)")
private external fun wasmLibcVxworksMunmap(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksMprotect(p0, p1, p2)")
private external fun wasmLibcVxworksMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksMsync(p0, p1, p2)")
private external fun wasmLibcVxworksMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksTruncate(p0, p1)")
private external fun wasmLibcVxworksTruncate(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksShmOpen(p0, p1, p2)")
private external fun wasmLibcVxworksShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksShmUnlink(p0)")
private external fun wasmLibcVxworksShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksGettimeofday(p0, p1)")
private external fun wasmLibcVxworksGettimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadExit(p0)")
private external fun wasmLibcVxworksPthreadExit(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadAttrSetdetachstate(p0, p1)")
private external fun wasmLibcVxworksPthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadEqual(p0, p1)")
private external fun wasmLibcVxworksPthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksStrerrorR(p0, p1, p2)")
private external fun wasmLibcVxworksStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSigaddset(p0, p1)")
private external fun wasmLibcVxworksSigaddset(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksSigaction(p0, p1, p2)")
private external fun wasmLibcVxworksSigaction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksUtimes(p0, p1)")
private external fun wasmLibcVxworksUtimes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFutimens(p0, p1)")
private external fun wasmLibcVxworksFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcVxworksUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksDlopen(p0, p1)")
private external fun wasmLibcVxworksDlopen(p0: String, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcVxworksDlerror()")
private external fun wasmLibcVxworksDlerror(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksDlsym(p0, p1)")
private external fun wasmLibcVxworksDlsym(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksDlclose(p0)")
private external fun wasmLibcVxworksDlclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksDladdr(p0, p1)")
private external fun wasmLibcVxworksDladdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksGmtimeR(p0, p1)")
private external fun wasmLibcVxworksGmtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksLocaltimeR(p0, p1)")
private external fun wasmLibcVxworksLocaltimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksMktime(p0)")
private external fun wasmLibcVxworksMktime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksTime(p0)")
private external fun wasmLibcVxworksTime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksGmtime(p0)")
private external fun wasmLibcVxworksGmtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksLocaltime(p0)")
private external fun wasmLibcVxworksLocaltime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksTimegm(p0)")
private external fun wasmLibcVxworksTimegm(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksDifftime(p0, p1)")
private external fun wasmLibcVxworksDifftime(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksGethostname(p0, p1)")
private external fun wasmLibcVxworksGethostname(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksUsleep(p0)")
private external fun wasmLibcVxworksUsleep(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPutenv(p0)")
private external fun wasmLibcVxworksPutenv(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSetlocale(p0, p1)")
private external fun wasmLibcVxworksSetlocale(p0: Int, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcVxworksLocaleconv()")
private external fun wasmLibcVxworksLocaleconv(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksSigprocmask(p0, p1, p2)")
private external fun wasmLibcVxworksSigprocmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSigpending(p0)")
private external fun wasmLibcVxworksSigpending(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksMkfifo(p0, p1)")
private external fun wasmLibcVxworksMkfifo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksFseeko(p0, p1, p2)")
private external fun wasmLibcVxworksFseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFtello(p0)")
private external fun wasmLibcVxworksFtello(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksMkstemp(p0)")
private external fun wasmLibcVxworksMkstemp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksTmpnam(p0)")
private external fun wasmLibcVxworksTmpnam(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksOpenlog(p0, p1, p2)")
private external fun wasmLibcVxworksOpenlog(p0: String, p1: Int, p2: Int)

@JsFun("() => globalThis.__km_napi_libc.libcVxworksCloselog()")
private external fun wasmLibcVxworksCloselog()

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSetlogmask(p0)")
private external fun wasmLibcVxworksSetlogmask(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksSyslog(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksSyslog(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksGetline(p0, p1, p2)")
private external fun wasmLibcVxworksGetline(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksTcsetattr(p0, p1, p2)")
private external fun wasmLibcVxworksTcsetattr(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksTcgetattr(p0, p1)")
private external fun wasmLibcVxworksTcgetattr(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksTcsendbreak(p0, p1)")
private external fun wasmLibcVxworksTcsendbreak(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksConfstr(p0, p1, p2)")
private external fun wasmLibcVxworksConfstr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksFnmatch(p0, p1, p2)")
private external fun wasmLibcVxworksFnmatch(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksSymlinkat(p0, p1, p2)")
private external fun wasmLibcVxworksSymlinkat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksFchmodat(p0, p1, p2, p3)")
private external fun wasmLibcVxworksFchmodat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksUtime(p0, p1)")
private external fun wasmLibcVxworksUtime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksMemalign(p0, p1)")
private external fun wasmLibcVxworksMemalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksGetcwd(p0, p1)")
private external fun wasmLibcVxworksGetcwd(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksChdir(p0)")
private external fun wasmLibcVxworksChdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadMutexattrInit(p0)")
private external fun wasmLibcVxworksPthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadMutexattrDestroy(p0)")
private external fun wasmLibcVxworksPthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadMutexattrSettype(p0, p1)")
private external fun wasmLibcVxworksPthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadMutexInit(p0, p1)")
private external fun wasmLibcVxworksPthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadMutexDestroy(p0)")
private external fun wasmLibcVxworksPthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadMutexLock(p0)")
private external fun wasmLibcVxworksPthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadMutexTrylock(p0)")
private external fun wasmLibcVxworksPthreadMutexTrylock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcVxworksPthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadMutexUnlock(p0)")
private external fun wasmLibcVxworksPthreadMutexUnlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadAttrSetname(p0, p1)")
private external fun wasmLibcVxworksPthreadAttrSetname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadAttrSetstacksize(p0, p1)")
private external fun wasmLibcVxworksPthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadAttrGetstacksize(p0, p1)")
private external fun wasmLibcVxworksPthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadAttrInit(p0)")
private external fun wasmLibcVxworksPthreadAttrInit(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcVxworksPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksPthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcVxworksPthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksPthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcVxworksPthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadAttrSetinheritsched(p0, p1)")
private external fun wasmLibcVxworksPthreadAttrSetinheritsched(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadAttrSetschedpolicy(p0, p1)")
private external fun wasmLibcVxworksPthreadAttrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadAttrDestroy(p0)")
private external fun wasmLibcVxworksPthreadAttrDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadDetach(p0)")
private external fun wasmLibcVxworksPthreadDetach(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcVxworksPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFstat(p0, p1)")
private external fun wasmLibcVxworksFstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksLstat(p0, p1)")
private external fun wasmLibcVxworksLstat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFtruncate(p0, p1)")
private external fun wasmLibcVxworksFtruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksReaddirR(p0, p1, p2)")
private external fun wasmLibcVxworksReaddirR(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksReaddir(p0)")
private external fun wasmLibcVxworksReaddir(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksPoll(p0, p1, p2)")
private external fun wasmLibcVxworksPoll(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadCondattrInit(p0)")
private external fun wasmLibcVxworksPthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadCondattrDestroy(p0)")
private external fun wasmLibcVxworksPthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcVxworksPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcVxworksPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadCondInit(p0, p1)")
private external fun wasmLibcVxworksPthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadCondDestroy(p0)")
private external fun wasmLibcVxworksPthreadCondDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadCondSignal(p0)")
private external fun wasmLibcVxworksPthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadCondBroadcast(p0)")
private external fun wasmLibcVxworksPthreadCondBroadcast(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadCondWait(p0, p1)")
private external fun wasmLibcVxworksPthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockattrInit(p0)")
private external fun wasmLibcVxworksPthreadRwlockattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockattrDestroy(p0)")
private external fun wasmLibcVxworksPthreadRwlockattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockattrSetmaxreaders(p0, p1)")
private external fun wasmLibcVxworksPthreadRwlockattrSetmaxreaders(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockInit(p0, p1)")
private external fun wasmLibcVxworksPthreadRwlockInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockDestroy(p0)")
private external fun wasmLibcVxworksPthreadRwlockDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockRdlock(p0)")
private external fun wasmLibcVxworksPthreadRwlockRdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockTryrdlock(p0)")
private external fun wasmLibcVxworksPthreadRwlockTryrdlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockTimedrdlock(p0, p1)")
private external fun wasmLibcVxworksPthreadRwlockTimedrdlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockWrlock(p0)")
private external fun wasmLibcVxworksPthreadRwlockWrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockTrywrlock(p0)")
private external fun wasmLibcVxworksPthreadRwlockTrywrlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockTimedwrlock(p0, p1)")
private external fun wasmLibcVxworksPthreadRwlockTimedwrlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadRwlockUnlock(p0)")
private external fun wasmLibcVxworksPthreadRwlockUnlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadKeyCreate(p0, p1)")
private external fun wasmLibcVxworksPthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadKeyDelete(p0)")
private external fun wasmLibcVxworksPthreadKeyDelete(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadSetspecific(p0, p1)")
private external fun wasmLibcVxworksPthreadSetspecific(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPthreadGetspecific(p0)")
private external fun wasmLibcVxworksPthreadGetspecific(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksPthreadCondTimedwait(p0, p1, p2)")
private external fun wasmLibcVxworksPthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadAttrGetname(p0, p1)")
private external fun wasmLibcVxworksPthreadAttrGetname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPthreadJoin(p0, p1)")
private external fun wasmLibcVxworksPthreadJoin(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksPthreadSelf()")
private external fun wasmLibcVxworksPthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksClockGettime(p0, p1)")
private external fun wasmLibcVxworksClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksClockSettime(p0, p1)")
private external fun wasmLibcVxworksClockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksClockGetres(p0, p1)")
private external fun wasmLibcVxworksClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcVxworksClockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksNanosleep(p0, p1)")
private external fun wasmLibcVxworksNanosleep(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksAccept(p0, p1, p2)")
private external fun wasmLibcVxworksAccept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksBind(p0, p1, p2)")
private external fun wasmLibcVxworksBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksConnect(p0, p1, p2)")
private external fun wasmLibcVxworksConnect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksGetpeername(p0, p1, p2)")
private external fun wasmLibcVxworksGetpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksGetsockname(p0, p1, p2)")
private external fun wasmLibcVxworksGetsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcVxworksGetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcVxworksGetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksListen(p0, p1)")
private external fun wasmLibcVxworksListen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksRecv(p0, p1, p2, p3)")
private external fun wasmLibcVxworksRecv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcVxworksRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcVxworksRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksRecvmsg(p0, p1, p2)")
private external fun wasmLibcVxworksRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksSend(p0, p1, p2, p3)")
private external fun wasmLibcVxworksSend(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksSendmsg(p0, p1, p2)")
private external fun wasmLibcVxworksSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcVxworksSendto(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcVxworksSendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcVxworksSetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcVxworksSetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksShutdown(p0, p1)")
private external fun wasmLibcVxworksShutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksSocket(p0, p1, p2)")
private external fun wasmLibcVxworksSocket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksIoctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksFcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksFcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksGaiStrerror(p0)")
private external fun wasmLibcVxworksGaiStrerror(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksClose(p0)")
private external fun wasmLibcVxworksClose(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksRead(p0, p1, p2)")
private external fun wasmLibcVxworksRead(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksWrite(p0, p1, p2)")
private external fun wasmLibcVxworksWrite(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksIsatty(p0)")
private external fun wasmLibcVxworksIsatty(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksDup(p0)")
private external fun wasmLibcVxworksDup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksDup2(p0, p1)")
private external fun wasmLibcVxworksDup2(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksPipe(p0)")
private external fun wasmLibcVxworksPipe(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksUnlink(p0)")
private external fun wasmLibcVxworksUnlink(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksLseek(p0, p1, p2)")
private external fun wasmLibcVxworksLseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksGetaddrinfo(p0, p1, p2, p3)")
private external fun wasmLibcVxworksGetaddrinfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFreeaddrinfo(p0)")
private external fun wasmLibcVxworksFreeaddrinfo(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSignal(p0, p1)")
private external fun wasmLibcVxworksSignal(p0: Int, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcVxworksGetpid()")
private external fun wasmLibcVxworksGetpid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksGetppid()")
private external fun wasmLibcVxworksGetppid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSetpgid(p0, p1)")
private external fun wasmLibcVxworksSetpgid(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksWaitpid(p0, p1, p2)")
private external fun wasmLibcVxworksWaitpid(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSysconf(p0)")
private external fun wasmLibcVxworksSysconf(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksSetenv(p0, p1, p2)")
private external fun wasmLibcVxworksSetenv(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksUnsetenv(p0)")
private external fun wasmLibcVxworksUnsetenv(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksRealpath(p0, p1)")
private external fun wasmLibcVxworksRealpath(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksLink(p0, p1)")
private external fun wasmLibcVxworksLink(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksReadlink(p0, p1, p2)")
private external fun wasmLibcVxworksReadlink(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSymlink(p0, p1)")
private external fun wasmLibcVxworksSymlink(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksOpendir(p0)")
private external fun wasmLibcVxworksOpendir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksRmdir(p0)")
private external fun wasmLibcVxworksRmdir(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksMkdir(p0, p1)")
private external fun wasmLibcVxworksMkdir(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksChmod(p0, p1)")
private external fun wasmLibcVxworksChmod(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksFchmod(p0, p1)")
private external fun wasmLibcVxworksFchmod(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksFsync(p0)")
private external fun wasmLibcVxworksFsync(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksClosedir(p0)")
private external fun wasmLibcVxworksClosedir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSchedGetPriorityMax(p0)")
private external fun wasmLibcVxworksSchedGetPriorityMax(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSchedGetPriorityMin(p0)")
private external fun wasmLibcVxworksSchedGetPriorityMin(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSchedSetparam(p0, p1)")
private external fun wasmLibcVxworksSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSchedGetparam(p0, p1)")
private external fun wasmLibcVxworksSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcVxworksSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSchedGetscheduler(p0)")
private external fun wasmLibcVxworksSchedGetscheduler(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSchedRrGetInterval(p0, p1)")
private external fun wasmLibcVxworksSchedRrGetInterval(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksSchedYield()")
private external fun wasmLibcVxworksSchedYield(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksErrnoSet(p0)")
private external fun wasmLibcVxworksErrnoSet(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksErrnoGet()")
private external fun wasmLibcVxworksErrnoGet(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSetgid(p0)")
private external fun wasmLibcVxworksSetgid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksGetgid()")
private external fun wasmLibcVxworksGetgid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSetuid(p0)")
private external fun wasmLibcVxworksSetuid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksGetuid()")
private external fun wasmLibcVxworksGetuid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSigemptyset(p0)")
private external fun wasmLibcVxworksSigemptyset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksSigfillset(p0)")
private external fun wasmLibcVxworksSigfillset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSigdelset(p0, p1)")
private external fun wasmLibcVxworksSigdelset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksSigismember(p0, p1)")
private external fun wasmLibcVxworksSigismember(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcVxworksPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksKill(p0, p1)")
private external fun wasmLibcVxworksKill(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksTaskKill(p0, p1)")
private external fun wasmLibcVxworksTaskKill(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksRaise(p0)")
private external fun wasmLibcVxworksRaise(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksTaskIdSelf()")
private external fun wasmLibcVxworksTaskIdSelf(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksTaskDelay(p0)")
private external fun wasmLibcVxworksTaskDelay(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksTaskNameSet(p0, p1)")
private external fun wasmLibcVxworksTaskNameSet(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksTaskNameGet(p0, p1, p2)")
private external fun wasmLibcVxworksTaskNameGet(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksRtpInfoGet(p0, p1)")
private external fun wasmLibcVxworksRtpInfoGet(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksRtpSpawn(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksRtpSpawn(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksPathIsAbsolute(p0, p1)")
private external fun wasmLibcVxworksPathIsAbsolute(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksWritev(p0, p1, p2)")
private external fun wasmLibcVxworksWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksReadv(p0, p1, p2)")
private external fun wasmLibcVxworksReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksRandBytes(p0, p1)")
private external fun wasmLibcVxworksRandBytes(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksRandABytes(p0, p1)")
private external fun wasmLibcVxworksRandABytes(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksRandUBytes(p0, p1)")
private external fun wasmLibcVxworksRandUBytes(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksRandSecure()")
private external fun wasmLibcVxworksRandSecure(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcVxworksMqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcVxworksMqOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksMqClose(p0)")
private external fun wasmLibcVxworksMqClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcVxworksMqUnlink(p0)")
private external fun wasmLibcVxworksMqUnlink(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksMqReceive(p0, p1, p2, p3)")
private external fun wasmLibcVxworksMqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcVxworksMqTimedreceive(p0, p1, p2, p3, p4)")
private external fun wasmLibcVxworksMqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcVxworksMqSend(p0, p1, p2, p3)")
private external fun wasmLibcVxworksMqSend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcVxworksMqTimedsend(p0, p1, p2, p3, p4)")
private external fun wasmLibcVxworksMqTimedsend(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcVxworksMqGetattr(p0, p1)")
private external fun wasmLibcVxworksMqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcVxworksMqSetattr(p0, p1, p2)")
private external fun wasmLibcVxworksMqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksVxCpuEnabledGet()")
private external fun wasmLibcVxworksVxCpuEnabledGet(): Int

@JsFun("() => globalThis.__km_napi_libc.libcVxworksVxCpuConfiguredGet()")
private external fun wasmLibcVxworksVxCpuConfiguredGet(): Int

public actual fun isalnum(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIslower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIspunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksToupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksFopen(filename.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFflush(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFclose(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksRemove(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr<FILE> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksTmpfile().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGetchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPutchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFgetc(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFputc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFputs(s.rawAddress.toString(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPuts(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksUngetc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksFread(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksFwrite(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFseek(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    if (vxworksNapiAvailable) wasmLibcVxworksFtell(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr<FILE>) {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFgetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFsetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFeof(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFerror(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: ConstPtr<CChar>) {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    if (vxworksNapiAvailable) wasmLibcVxworksAtof(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksAtoi(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    if (vxworksNapiAvailable) wasmLibcVxworksAtol(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    if (vxworksNapiAvailable) wasmLibcVxworksAtoll(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    if (vxworksNapiAvailable) wasmLibcVxworksStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    if (vxworksNapiAvailable) wasmLibcVxworksStrtof(s.rawAddress.toString(), endp.rawAddress.toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    if (vxworksNapiAvailable) wasmLibcVxworksStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    if (vxworksNapiAvailable) wasmLibcVxworksStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    if (vxworksNapiAvailable) wasmLibcVxworksStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    if (vxworksNapiAvailable) wasmLibcVxworksStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksCalloc(nobj.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksMalloc(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksRealloc(p.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr<CVoid>) {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksAtexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSystem(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksGetenv(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    if (vxworksNapiAvailable) wasmLibcVxworksCfgetospeed(termios.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: MutPtr<Termios>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksCfmakeraw(termios.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksCfsetispeed(termios.rawAddress.toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksCfsetospeed(termios.rawAddress.toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrcat(s.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrdup(cs.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksStrlen(cs.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr<CChar>, n: SizeT): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksStrnlen(cs.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrerror(n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksStrtok(s.rawAddress.toString(), t.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksWcslen(buf.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksWcstombs(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksMemchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksWmemchr(cx.rawAddress.toString(), c.toInt(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksMemccpy(dest.rawAddress.toString(), src.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksMemset(dest.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksAlignedAlloc(alignment.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr<Tms>): ClockT =
    if (vxworksNapiAvailable) wasmLibcVxworksTimes(buf.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTcflush(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPclose(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksMkdtemp(template.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksUnlinkat(dirfd, pathname.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksGetprotobyname(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksGetprotobynumber(proto).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksGetservbyname(name.rawAddress.toString(), proto.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFchownat(dirfd, pathname.rawAddress.toString(), owner.toInt(), group.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGetcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPutcharUnlocked(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksStat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksFdopen(fd, mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFileno(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksCreat(path.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFchown(fd, owner.toInt(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksAccess(path.rawAddress.toString(), amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (vxworksNapiAvailable) wasmLibcVxworksAlarm(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchdir(dirfd: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFchdir(dirfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksChown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (vxworksNapiAvailable) wasmLibcVxworksFpathconf(filedes, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (vxworksNapiAvailable) wasmLibcVxworksGetegid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (vxworksNapiAvailable) wasmLibcVxworksGeteuid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGetgroups(ngroupsMax, groups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksGetlogin().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    if (vxworksNapiAvailable) wasmLibcVxworksPathconf(path.rawAddress.toString(), name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPause() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSeteuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSetegid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (vxworksNapiAvailable) wasmLibcVxworksSleep(secs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksTtyname(fd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: MutPtr<CInt>): PidT =
    if (vxworksNapiAvailable) wasmLibcVxworksWait(status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (vxworksNapiAvailable) wasmLibcVxworksUmask(mask) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMlock(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMlockall(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMunlock(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMunlockall() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMunmap(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: ConstPtr<CChar>, length: OffT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTruncate(path.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksShmOpen(name.rawAddress.toString(), oflag, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksPthreadExit(value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadEqual(t1.toLong().toString(), t2.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSigaddset(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSigaction(signum, act.rawAddress.toString(), oldact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksUtimes(filename.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksDlopen(filename.rawAddress.toString(), flag).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksDlerror().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksDlsym(handle.rawAddress.toString(), symbol.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksDlclose(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: MutPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksDladdr(addr.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksGmtimeR(timeP.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksLocaltimeR(timeP.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    if (vxworksNapiAvailable) wasmLibcVxworksMktime(tm.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: MutPtr<TimeT>): TimeT =
    if (vxworksNapiAvailable) wasmLibcVxworksTime(time.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksGmtime(timeP.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksLocaltime(timeP.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    if (vxworksNapiAvailable) wasmLibcVxworksTimegm(tm.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (vxworksNapiAvailable) wasmLibcVxworksDifftime(time1.toString(), time0.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: UsecondsT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksUsleep(secs.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: MutPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPutenv(string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksSetlocale(category, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr<Lconv> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksLocaleconv().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSigprocmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSigpending(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMkfifo(path.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFseeko(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    if (vxworksNapiAvailable) wasmLibcVxworksFtello(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMkstemp(template.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksTmpnam(ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt) {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksOpenlog(ident.rawAddress.toString(), logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksCloselog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSetlogmask(maskpri) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksSyslog(priority, message.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksGetline(lineptr.rawAddress.toString(), n.rawAddress.toString(), stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTcsetattr(fd, optionalActions, termios.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTcgetattr(fd, termios.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTcsendbreak(fd, duration) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun confstr(name: CInt, buf: MutPtr<CChar>, len: SizeT): SizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksConfstr(name, buf.rawAddress.toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fnmatch(pattern: ConstPtr<CChar>, name: ConstPtr<CChar>, flags: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFnmatch(pattern.rawAddress.toString(), name.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFchmodat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksUtime(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksMemalign(blockSize.toString(), sizeArg.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksGetcwd(buf.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(attr: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksChdir(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadMutexattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadMutexattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(pAttr: MutPtr<PthreadMutexattrT>, pType: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadMutexattrSettype(pAttr.rawAddress.toString(), pType) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(mutex: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadMutexInit(mutex.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadMutexDestroy(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadMutexLock(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadMutexTrylock(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(attr: MutPtr<PthreadMutexT>, spec: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadMutexTimedlock(attr.rawAddress.toString(), spec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadMutexUnlock(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetname(pAttr: MutPtr<PthreadAttrT>, name: MutPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAttrSetname(pAttr.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stacksize: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAttrSetstacksize(attr.rawAddress.toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, size: MutPtr<SizeT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAttrGetstacksize(attr.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAttrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(pThread: MutPtr<PthreadT>, pAttr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, value: MutPtr<CVoid>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCreate(pThread.rawAddress.toString(), pAttr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAttrSetinheritsched(attr.rawAddress.toString(), inheritsched) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAttrSetschedpolicy(attr.rawAddress.toString(), policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(thread: MutPtr<PthreadAttrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAttrDestroy(thread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadDetach(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFstat(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksLstat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFtruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(pDir: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksReaddirR(pDir.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(pDir: MutPtr<DIR>): MutPtr<Dirent> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksReaddir(pDir.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPoll(fds.rawAddress.toString(), nfds.toInt(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(pAttr: ConstPtr<PthreadCondattrT>, pClockId: MutPtr<ClockidT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondattrGetclock(pAttr.rawAddress.toString(), pClockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(pAttr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondattrSetclock(pAttr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondDestroy(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondSignal(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondBroadcast(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondWait(cond.rawAddress.toString(), mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetmaxreaders(attr: MutPtr<PthreadRwlockattrT>, attr2: CUint): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockattrSetmaxreaders(attr.rawAddress.toString(), attr2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<PthreadRwlockattrT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockInit(attr.rawAddress.toString(), host.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockRdlock(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockTryrdlock(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedrdlock(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockTimedrdlock(attr.rawAddress.toString(), host.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockWrlock(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockTrywrlock(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedwrlock(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockTimedwrlock(attr.rawAddress.toString(), host.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadRwlockUnlock(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadKeyDelete(key.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadSetspecific(key.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksPthreadGetspecific(key.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadCondTimedwait(cond.rawAddress.toString(), mutex.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetname(attr: MutPtr<PthreadAttrT>, name: MutPtr<MutPtr<CChar>>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadAttrGetname(attr.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(thread: PthreadT, status: MutPtr<MutPtr<CVoid>>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadJoin(thread.toLong().toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadSelf().toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksClockGettime(clockId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksClockSettime(clockId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksClockGetres(clockId, res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksClockNanosleep(clockId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksNanosleep(rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksAccept(s, addr.rawAddress.toString(), addrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksBind(fd, addr.rawAddress.toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: CInt, name: ConstPtr<Sockaddr>, namelen: SocklenT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksConnect(s, name.rawAddress.toString(), namelen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: CInt, name: MutPtr<Sockaddr>, namelen: MutPtr<SocklenT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGetpeername(s, name.rawAddress.toString(), namelen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGetsockname(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksListen(socket, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(s: CInt, buf: MutPtr<CVoid>, bufLen: SizeT, flags: CInt): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksRecv(s, buf.rawAddress.toString(), bufLen.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: CInt, buf: MutPtr<CVoid>, bufLen: SizeT, flags: CInt, from: MutPtr<Sockaddr>, pFromLen: MutPtr<SocklenT>): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksRecvfrom(s, buf.rawAddress.toString(), bufLen.toString(), flags, from.rawAddress.toString(), pFromLen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(socket: CInt, mp: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksRecvmsg(socket, mp.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksSend(socket, buf.rawAddress.toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(socket: CInt, mp: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksSendmsg(socket, mp.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksSendto(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSetsockopt(socket, level, name, value.rawAddress.toString(), optionLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(s: CInt, how: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksShutdown(s, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSocket(domain, type, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gaiStrerror(errcode: CInt): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksGaiStrerror(errcode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksClose(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksRead(fd, buf.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksWrite(fd, buf.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksIsatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(src: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksDup(src) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksDup2(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPipe(fds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(pathname: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksUnlink(pathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (vxworksNapiAvailable) wasmLibcVxworksLseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksGetaddrinfo(node.rawAddress.toString(), service.rawAddress.toString(), hints.rawAddress.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>) {
    if (vxworksNapiAvailable) {
        wasmLibcVxworksFreeaddrinfo(res.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (vxworksNapiAvailable) wasmLibcVxworksSignal(signum, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (vxworksNapiAvailable) wasmLibcVxworksGetpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (vxworksNapiAvailable) wasmLibcVxworksGetppid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    if (vxworksNapiAvailable) wasmLibcVxworksSetpgid(pid, pgid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    if (vxworksNapiAvailable) wasmLibcVxworksWaitpid(pid, status.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(attr: CInt): CLong =
    if (vxworksNapiAvailable) wasmLibcVxworksSysconf(attr).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(envVarName: ConstPtr<CChar>, envVarValue: ConstPtr<CChar>, overwrite: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSetenv(envVarName.rawAddress.toString(), envVarValue.rawAddress.toString(), overwrite) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(envVarName: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksUnsetenv(envVarName.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(fileName: ConstPtr<CChar>, resolvedName: MutPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksRealpath(fileName.rawAddress.toString(), resolvedName.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksLink(src.rawAddress.toString(), dst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsize: SizeT): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsize.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(name: ConstPtr<CChar>): MutPtr<DIR> =
    if (vxworksNapiAvailable) MutPtr(wasmLibcVxworksOpendir(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksRmdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(dirName: ConstPtr<CChar>, mode: ModeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMkdir(dirName.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksChmod(path.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFchmod(attr1, attr2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksFsync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(ptr: MutPtr<DIR>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksClosedir(ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSchedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSchedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSchedRrGetInterval(pid, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSchedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoSet(err: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksErrnoSet(err) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoGet(): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksErrnoGet() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSetgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (vxworksNapiAvailable) wasmLibcVxworksGetgid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSetuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (vxworksNapiAvailable) wasmLibcVxworksGetuid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSigemptyset(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSigfillset(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSigdelset(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksSigismember(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksPthreadSigmask(how, set.rawAddress.toString(), oset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, signo: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksKill(pid, signo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTaskKill(taskId, signo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signo: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksRaise(signo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskIdSelf(): TaskId =
    if (vxworksNapiAvailable) wasmLibcVxworksTaskIdSelf() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDelay(ticks: VxTicksT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTaskDelay(ticks.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskNameSet(taskId: TaskId, taskName: MutPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTaskNameSet(taskId, taskName.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskNameGet(taskId: TaskId, bufName: MutPtr<CChar>, bufsize: SizeT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksTaskNameGet(taskId, bufName.rawAddress.toString(), bufsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: MutPtr<RtpDesc>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksRtpInfoGet(rtpId, rtpStruct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpSpawn(pubrtpFileName: ConstPtr<CChar>, argv: MutPtr<ConstPtr<CChar>>, envp: MutPtr<ConstPtr<CChar>>, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    if (vxworksNapiAvailable) wasmLibcVxworksRtpSpawn(pubrtpFileName.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString(), priority, uStackSize.toString(), options, taskOptions) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsAbsolute(filepath: ConstPtr<CChar>, pNameTail: MutPtr<ConstPtr<CChar>>): Bool =
    if (vxworksNapiAvailable) wasmLibcVxworksPathIsAbsolute(filepath.rawAddress.toString(), pNameTail.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randBytes(buf: MutPtr<CUchar>, length: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksRandBytes(buf.rawAddress.toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randABytes(buf: MutPtr<CUchar>, length: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksRandABytes(buf.rawAddress.toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randUBytes(buf: MutPtr<CUchar>, length: CInt): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksRandUBytes(buf.rawAddress.toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randSecure(): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksRandSecure() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (vxworksNapiAvailable) wasmLibcVxworksMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMqClose(mqd.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMqUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (vxworksNapiAvailable) wasmLibcVxworksMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (vxworksNapiAvailable) wasmLibcVxworksMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuEnabledGet(): CpusetT =
    if (vxworksNapiAvailable) wasmLibcVxworksVxCpuEnabledGet().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuConfiguredGet(): CpusetT =
    if (vxworksNapiAvailable) wasmLibcVxworksVxCpuConfiguredGet().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
