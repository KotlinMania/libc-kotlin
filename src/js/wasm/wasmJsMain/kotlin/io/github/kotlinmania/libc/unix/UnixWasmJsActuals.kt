@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadKeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixNapiAddon(): Boolean

private val unixNapiAvailable: Boolean = initUnixNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsalnum(p0)")
private external fun wasmLibcUnixIsalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsalpha(p0)")
private external fun wasmLibcUnixIsalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIscntrl(p0)")
private external fun wasmLibcUnixIscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsdigit(p0)")
private external fun wasmLibcUnixIsdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsgraph(p0)")
private external fun wasmLibcUnixIsgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIslower(p0)")
private external fun wasmLibcUnixIslower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsprint(p0)")
private external fun wasmLibcUnixIsprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIspunct(p0)")
private external fun wasmLibcUnixIspunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsspace(p0)")
private external fun wasmLibcUnixIsspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsupper(p0)")
private external fun wasmLibcUnixIsupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsxdigit(p0)")
private external fun wasmLibcUnixIsxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsblank(p0)")
private external fun wasmLibcUnixIsblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixTolower(p0)")
private external fun wasmLibcUnixTolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixToupper(p0)")
private external fun wasmLibcUnixToupper(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixQsort(p0, p1, p2, p3)")
private external fun wasmLibcUnixQsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsearch(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFopen(p0, p1)")
private external fun wasmLibcUnixFopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixFreopen(p0, p1, p2)")
private external fun wasmLibcUnixFreopen(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFflush(p0)")
private external fun wasmLibcUnixFflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFclose(p0)")
private external fun wasmLibcUnixFclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRemove(p0)")
private external fun wasmLibcUnixRemove(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRename(p0, p1)")
private external fun wasmLibcUnixRename(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixTmpfile()")
private external fun wasmLibcUnixTmpfile(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSetvbuf(p0, p1, p2, p3)")
private external fun wasmLibcUnixSetvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSetbuf(p0, p1)")
private external fun wasmLibcUnixSetbuf(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetchar()")
private external fun wasmLibcUnixGetchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPutchar(p0)")
private external fun wasmLibcUnixPutchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFgetc(p0)")
private external fun wasmLibcUnixFgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixFgets(p0, p1, p2)")
private external fun wasmLibcUnixFgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFputc(p0, p1)")
private external fun wasmLibcUnixFputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFputs(p0, p1)")
private external fun wasmLibcUnixFputs(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPuts(p0)")
private external fun wasmLibcUnixPuts(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixUngetc(p0, p1)")
private external fun wasmLibcUnixUngetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixFread(p0, p1, p2, p3)")
private external fun wasmLibcUnixFread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixFwrite(p0, p1, p2, p3)")
private external fun wasmLibcUnixFwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixFseek(p0, p1, p2)")
private external fun wasmLibcUnixFseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFtell(p0)")
private external fun wasmLibcUnixFtell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRewind(p0)")
private external fun wasmLibcUnixRewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFgetpos(p0, p1)")
private external fun wasmLibcUnixFgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFsetpos(p0, p1)")
private external fun wasmLibcUnixFsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFeof(p0)")
private external fun wasmLibcUnixFeof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFerror(p0)")
private external fun wasmLibcUnixFerror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixClearerr(p0)")
private external fun wasmLibcUnixClearerr(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPerror(p0)")
private external fun wasmLibcUnixPerror(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAtof(p0)")
private external fun wasmLibcUnixAtof(p0: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAtoi(p0)")
private external fun wasmLibcUnixAtoi(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAtol(p0)")
private external fun wasmLibcUnixAtol(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAtoll(p0)")
private external fun wasmLibcUnixAtoll(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrtod(p0, p1)")
private external fun wasmLibcUnixStrtod(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrtof(p0, p1)")
private external fun wasmLibcUnixStrtof(p0: String, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrtol(p0, p1, p2)")
private external fun wasmLibcUnixStrtol(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrtoll(p0, p1, p2)")
private external fun wasmLibcUnixStrtoll(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrtoul(p0, p1, p2)")
private external fun wasmLibcUnixStrtoul(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrtoull(p0, p1, p2)")
private external fun wasmLibcUnixStrtoull(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCalloc(p0, p1)")
private external fun wasmLibcUnixCalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixMalloc(p0)")
private external fun wasmLibcUnixMalloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRealloc(p0, p1)")
private external fun wasmLibcUnixRealloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFree(p0)")
private external fun wasmLibcUnixFree(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixAbort()")
private external fun wasmLibcUnixAbort()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixExit(p0)")
private external fun wasmLibcUnixExit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSystem(p0)")
private external fun wasmLibcUnixSystem(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGetenv(p0)")
private external fun wasmLibcUnixGetenv(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrcpy(p0, p1)")
private external fun wasmLibcUnixStrcpy(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrncpy(p0, p1, p2)")
private external fun wasmLibcUnixStrncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStpcpy(p0, p1)")
private external fun wasmLibcUnixStpcpy(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrcat(p0, p1)")
private external fun wasmLibcUnixStrcat(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrncat(p0, p1, p2)")
private external fun wasmLibcUnixStrncat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrcmp(p0, p1)")
private external fun wasmLibcUnixStrcmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrncmp(p0, p1, p2)")
private external fun wasmLibcUnixStrncmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrcoll(p0, p1)")
private external fun wasmLibcUnixStrcoll(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrchr(p0, p1)")
private external fun wasmLibcUnixStrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrrchr(p0, p1)")
private external fun wasmLibcUnixStrrchr(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrspn(p0, p1)")
private external fun wasmLibcUnixStrspn(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrcspn(p0, p1)")
private external fun wasmLibcUnixStrcspn(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixStrdup(p0)")
private external fun wasmLibcUnixStrdup(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrndup(p0, p1)")
private external fun wasmLibcUnixStrndup(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrpbrk(p0, p1)")
private external fun wasmLibcUnixStrpbrk(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrstr(p0, p1)")
private external fun wasmLibcUnixStrstr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrcasecmp(p0, p1)")
private external fun wasmLibcUnixStrcasecmp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrncasecmp(p0, p1, p2)")
private external fun wasmLibcUnixStrncasecmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixStrlen(p0)")
private external fun wasmLibcUnixStrlen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrnlen(p0, p1)")
private external fun wasmLibcUnixStrnlen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixStrerror(p0)")
private external fun wasmLibcUnixStrerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrtok(p0, p1)")
private external fun wasmLibcUnixStrtok(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrtokR(p0, p1, p2)")
private external fun wasmLibcUnixStrtokR(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStrxfrm(p0, p1, p2)")
private external fun wasmLibcUnixStrxfrm(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixStrsignal(p0)")
private external fun wasmLibcUnixStrsignal(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixWcslen(p0)")
private external fun wasmLibcUnixWcslen(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixWcstombs(p0, p1, p2)")
private external fun wasmLibcUnixWcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixMemchr(p0, p1, p2)")
private external fun wasmLibcUnixMemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixWmemchr(p0, p1, p2)")
private external fun wasmLibcUnixWmemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixMemcmp(p0, p1, p2)")
private external fun wasmLibcUnixMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixMemcpy(p0, p1, p2)")
private external fun wasmLibcUnixMemcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixMemmove(p0, p1, p2)")
private external fun wasmLibcUnixMemmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixMemset(p0, p1, p2)")
private external fun wasmLibcUnixMemset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixMemccpy(p0, p1, p2, p3)")
private external fun wasmLibcUnixMemccpy(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGetpwnam(p0)")
private external fun wasmLibcUnixGetpwnam(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGetpwuid(p0)")
private external fun wasmLibcUnixGetpwuid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixFprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixFprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixPrintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixPrintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixSnprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixSnprintf(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixSprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixSprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixFscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixFscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixScanf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixScanf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixSscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixSscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetcharUnlocked()")
private external fun wasmLibcUnixGetcharUnlocked(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPutcharUnlocked(p0)")
private external fun wasmLibcUnixPutcharUnlocked(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSocket(p0, p1, p2)")
private external fun wasmLibcUnixSocket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixConnect(p0, p1, p2)")
private external fun wasmLibcUnixConnect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixListen(p0, p1)")
private external fun wasmLibcUnixListen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAccept(p0, p1, p2)")
private external fun wasmLibcUnixAccept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixGetpeername(p0, p1, p2)")
private external fun wasmLibcUnixGetpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixGetsockname(p0, p1, p2)")
private external fun wasmLibcUnixGetsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSocketpair(p0, p1, p2, p3)")
private external fun wasmLibcUnixSocketpair(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixSendto(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixSendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixShutdown(p0, p1)")
private external fun wasmLibcUnixShutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixChmod(p0, p1)")
private external fun wasmLibcUnixChmod(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFchmod(p0, p1)")
private external fun wasmLibcUnixFchmod(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFstat(p0, p1)")
private external fun wasmLibcUnixFstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixMkdir(p0, p1)")
private external fun wasmLibcUnixMkdir(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStat(p0, p1)")
private external fun wasmLibcUnixStat(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPclose(p0)")
private external fun wasmLibcUnixPclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFdopen(p0, p1)")
private external fun wasmLibcUnixFdopen(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFileno(p0)")
private external fun wasmLibcUnixFileno(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCreat(p0, p1)")
private external fun wasmLibcUnixCreat(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixFcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixFcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixOpendir(p0)")
private external fun wasmLibcUnixOpendir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixReaddir(p0)")
private external fun wasmLibcUnixReaddir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixClosedir(p0)")
private external fun wasmLibcUnixClosedir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRewinddir(p0)")
private external fun wasmLibcUnixRewinddir(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixFchmodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixFchmodat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixFchown(p0, p1, p2)")
private external fun wasmLibcUnixFchown(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixFchownat(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixFchownat(p0: Int, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixFstatat(p0, p1, p2, p3)")
private external fun wasmLibcUnixFstatat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinkat(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinkat(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixRenameat(p0, p1, p2, p3)")
private external fun wasmLibcUnixRenameat(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSymlinkat(p0, p1, p2)")
private external fun wasmLibcUnixSymlinkat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixUnlinkat(p0, p1, p2)")
private external fun wasmLibcUnixUnlinkat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAccess(p0, p1)")
private external fun wasmLibcUnixAccess(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAlarm(p0)")
private external fun wasmLibcUnixAlarm(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixChdir(p0)")
private external fun wasmLibcUnixChdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFchdir(p0)")
private external fun wasmLibcUnixFchdir(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixChown(p0, p1, p2)")
private external fun wasmLibcUnixChown(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLchown(p0, p1, p2)")
private external fun wasmLibcUnixLchown(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixClose(p0)")
private external fun wasmLibcUnixClose(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixDup(p0)")
private external fun wasmLibcUnixDup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixDup2(p0, p1)")
private external fun wasmLibcUnixDup2(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixExecl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixExecl(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixExecle(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixExecle(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixExeclp(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixExeclp(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixExecv(p0, p1)")
private external fun wasmLibcUnixExecv(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixExecve(p0, p1, p2)")
private external fun wasmLibcUnixExecve(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixExecvp(p0, p1)")
private external fun wasmLibcUnixExecvp(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixFork()")
private external fun wasmLibcUnixFork(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFpathconf(p0, p1)")
private external fun wasmLibcUnixFpathconf(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixGetcwd(p0, p1)")
private external fun wasmLibcUnixGetcwd(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetegid()")
private external fun wasmLibcUnixGetegid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixGeteuid()")
private external fun wasmLibcUnixGeteuid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetgid()")
private external fun wasmLibcUnixGetgid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixGetgroups(p0, p1)")
private external fun wasmLibcUnixGetgroups(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetlogin()")
private external fun wasmLibcUnixGetlogin(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixGetopt(p0, p1, p2)")
private external fun wasmLibcUnixGetopt(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGetpgid(p0)")
private external fun wasmLibcUnixGetpgid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetpgrp()")
private external fun wasmLibcUnixGetpgrp(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetpid()")
private external fun wasmLibcUnixGetpid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetppid()")
private external fun wasmLibcUnixGetppid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetuid()")
private external fun wasmLibcUnixGetuid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIsatty(p0)")
private external fun wasmLibcUnixIsatty(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLink(p0, p1)")
private external fun wasmLibcUnixLink(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLseek(p0, p1, p2)")
private external fun wasmLibcUnixLseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPathconf(p0, p1)")
private external fun wasmLibcUnixPathconf(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPipe(p0)")
private external fun wasmLibcUnixPipe(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixPosixMemalign(p0, p1, p2)")
private external fun wasmLibcUnixPosixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAlignedAlloc(p0, p1)")
private external fun wasmLibcUnixAlignedAlloc(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixRead(p0, p1, p2)")
private external fun wasmLibcUnixRead(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRmdir(p0)")
private external fun wasmLibcUnixRmdir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSeteuid(p0)")
private external fun wasmLibcUnixSeteuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSetegid(p0)")
private external fun wasmLibcUnixSetegid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSetgid(p0)")
private external fun wasmLibcUnixSetgid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSetpgid(p0, p1)")
private external fun wasmLibcUnixSetpgid(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSetsid()")
private external fun wasmLibcUnixSetsid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSetuid(p0)")
private external fun wasmLibcUnixSetuid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSetreuid(p0, p1)")
private external fun wasmLibcUnixSetreuid(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSetregid(p0, p1)")
private external fun wasmLibcUnixSetregid(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSleep(p0)")
private external fun wasmLibcUnixSleep(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNanosleep(p0, p1)")
private external fun wasmLibcUnixNanosleep(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixTcgetpgrp(p0)")
private external fun wasmLibcUnixTcgetpgrp(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixTcsetpgrp(p0, p1)")
private external fun wasmLibcUnixTcsetpgrp(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixTtyname(p0)")
private external fun wasmLibcUnixTtyname(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixTtynameR(p0, p1, p2)")
private external fun wasmLibcUnixTtynameR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixUnlink(p0)")
private external fun wasmLibcUnixUnlink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixWait(p0)")
private external fun wasmLibcUnixWait(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixWaitpid(p0, p1, p2)")
private external fun wasmLibcUnixWaitpid(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixWrite(p0, p1, p2)")
private external fun wasmLibcUnixWrite(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixPread(p0, p1, p2, p3)")
private external fun wasmLibcUnixPread(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixPwrite(p0, p1, p2, p3)")
private external fun wasmLibcUnixPwrite(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixUmask(p0)")
private external fun wasmLibcUnixUmask(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixUtime(p0, p1)")
private external fun wasmLibcUnixUtime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixKill(p0, p1)")
private external fun wasmLibcUnixKill(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixKillpg(p0, p1)")
private external fun wasmLibcUnixKillpg(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixMlock(p0, p1)")
private external fun wasmLibcUnixMlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixMunlock(p0, p1)")
private external fun wasmLibcUnixMunlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixMlockall(p0)")
private external fun wasmLibcUnixMlockall(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixMunlockall()")
private external fun wasmLibcUnixMunlockall(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixMmap(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixMmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixMunmap(p0, p1)")
private external fun wasmLibcUnixMunmap(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixIfNametoindex(p0)")
private external fun wasmLibcUnixIfNametoindex(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixIfIndextoname(p0, p1)")
private external fun wasmLibcUnixIfIndextoname(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLstat(p0, p1)")
private external fun wasmLibcUnixLstat(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFsync(p0)")
private external fun wasmLibcUnixFsync(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSetenv(p0, p1, p2)")
private external fun wasmLibcUnixSetenv(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixUnsetenv(p0)")
private external fun wasmLibcUnixUnsetenv(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSymlink(p0, p1)")
private external fun wasmLibcUnixSymlink(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixTruncate(p0, p1)")
private external fun wasmLibcUnixTruncate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFtruncate(p0, p1)")
private external fun wasmLibcUnixFtruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSignal(p0, p1)")
private external fun wasmLibcUnixSignal(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixGetrusage(p0, p1)")
private external fun wasmLibcUnixGetrusage(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixRealpath(p0, p1)")
private external fun wasmLibcUnixRealpath(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixTimes(p0)")
private external fun wasmLibcUnixTimes(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixPthreadSelf()")
private external fun wasmLibcUnixPthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadEqual(p0, p1)")
private external fun wasmLibcUnixPthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadJoin(p0, p1)")
private external fun wasmLibcUnixPthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadExit(p0)")
private external fun wasmLibcUnixPthreadExit(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadAttrInit(p0)")
private external fun wasmLibcUnixPthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadAttrDestroy(p0)")
private external fun wasmLibcUnixPthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadAttrGetstacksize(p0, p1)")
private external fun wasmLibcUnixPthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadAttrSetstacksize(p0, p1)")
private external fun wasmLibcUnixPthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadAttrSetdetachstate(p0, p1)")
private external fun wasmLibcUnixPthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadDetach(p0)")
private external fun wasmLibcUnixPthreadDetach(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixSchedYield()")
private external fun wasmLibcUnixSchedYield(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadKeyCreate(p0, p1)")
private external fun wasmLibcUnixPthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadKeyDelete(p0)")
private external fun wasmLibcUnixPthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadGetspecific(p0)")
private external fun wasmLibcUnixPthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadSetspecific(p0, p1)")
private external fun wasmLibcUnixPthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadMutexInit(p0, p1)")
private external fun wasmLibcUnixPthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadMutexDestroy(p0)")
private external fun wasmLibcUnixPthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadMutexLock(p0)")
private external fun wasmLibcUnixPthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadMutexTrylock(p0)")
private external fun wasmLibcUnixPthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadMutexUnlock(p0)")
private external fun wasmLibcUnixPthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadMutexattrInit(p0)")
private external fun wasmLibcUnixPthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadMutexattrDestroy(p0)")
private external fun wasmLibcUnixPthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadMutexattrSettype(p0, p1)")
private external fun wasmLibcUnixPthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadCondInit(p0, p1)")
private external fun wasmLibcUnixPthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadCondWait(p0, p1)")
private external fun wasmLibcUnixPthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixPthreadCondTimedwait(p0, p1, p2)")
private external fun wasmLibcUnixPthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadCondSignal(p0)")
private external fun wasmLibcUnixPthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadCondBroadcast(p0)")
private external fun wasmLibcUnixPthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadCondDestroy(p0)")
private external fun wasmLibcUnixPthreadCondDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadCondattrInit(p0)")
private external fun wasmLibcUnixPthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadCondattrDestroy(p0)")
private external fun wasmLibcUnixPthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixPthreadRwlockInit(p0, p1)")
private external fun wasmLibcUnixPthreadRwlockInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadRwlockDestroy(p0)")
private external fun wasmLibcUnixPthreadRwlockDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadRwlockRdlock(p0)")
private external fun wasmLibcUnixPthreadRwlockRdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadRwlockTryrdlock(p0)")
private external fun wasmLibcUnixPthreadRwlockTryrdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadRwlockWrlock(p0)")
private external fun wasmLibcUnixPthreadRwlockWrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadRwlockTrywrlock(p0)")
private external fun wasmLibcUnixPthreadRwlockTrywrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadRwlockUnlock(p0)")
private external fun wasmLibcUnixPthreadRwlockUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadRwlockattrInit(p0)")
private external fun wasmLibcUnixPthreadRwlockattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPthreadRwlockattrDestroy(p0)")
private external fun wasmLibcUnixPthreadRwlockattrDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixGetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixGetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixRaise(p0)")
private external fun wasmLibcUnixRaise(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixUtimes(p0, p1)")
private external fun wasmLibcUnixUtimes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixDlopen(p0, p1)")
private external fun wasmLibcUnixDlopen(p0: String, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixDlerror()")
private external fun wasmLibcUnixDlerror(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixDlsym(p0, p1)")
private external fun wasmLibcUnixDlsym(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixDlclose(p0)")
private external fun wasmLibcUnixDlclose(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixGetaddrinfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixGetaddrinfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFreeaddrinfo(p0)")
private external fun wasmLibcUnixFreeaddrinfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHstrerror(p0)")
private external fun wasmLibcUnixHstrerror(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGaiStrerror(p0)")
private external fun wasmLibcUnixGaiStrerror(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixResInit()")
private external fun wasmLibcUnixResInit(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixGmtimeR(p0, p1)")
private external fun wasmLibcUnixGmtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLocaltimeR(p0, p1)")
private external fun wasmLibcUnixLocaltimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixMktime(p0)")
private external fun wasmLibcUnixMktime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixTime(p0)")
private external fun wasmLibcUnixTime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGmtime(p0)")
private external fun wasmLibcUnixGmtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLocaltime(p0)")
private external fun wasmLibcUnixLocaltime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixDifftime(p0, p1)")
private external fun wasmLibcUnixDifftime(p0: String, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixTimegm(p0)")
private external fun wasmLibcUnixTimegm(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixMknod(p0, p1, p2)")
private external fun wasmLibcUnixMknod(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixGethostname(p0, p1)")
private external fun wasmLibcUnixGethostname(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixEndservent()")
private external fun wasmLibcUnixEndservent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixGetservbyname(p0, p1)")
private external fun wasmLibcUnixGetservbyname(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixGetservbyport(p0, p1)")
private external fun wasmLibcUnixGetservbyport(p0: Int, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixGetservent()")
private external fun wasmLibcUnixGetservent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSetservent(p0)")
private external fun wasmLibcUnixSetservent(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGetprotobyname(p0)")
private external fun wasmLibcUnixGetprotobyname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGetprotobynumber(p0)")
private external fun wasmLibcUnixGetprotobynumber(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixChroot(p0)")
private external fun wasmLibcUnixChroot(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixUsleep(p0)")
private external fun wasmLibcUnixUsleep(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSend(p0, p1, p2, p3)")
private external fun wasmLibcUnixSend(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixRecv(p0, p1, p2, p3)")
private external fun wasmLibcUnixRecv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPutenv(p0)")
private external fun wasmLibcUnixPutenv(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixPoll(p0, p1, p2)")
private external fun wasmLibcUnixPoll(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSelect(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSelect(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSetlocale(p0, p1)")
private external fun wasmLibcUnixSetlocale(p0: Int, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLocaleconv()")
private external fun wasmLibcUnixLocaleconv(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSemWait(p0)")
private external fun wasmLibcUnixSemWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSemTrywait(p0)")
private external fun wasmLibcUnixSemTrywait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSemPost(p0)")
private external fun wasmLibcUnixSemPost(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStatvfs(p0, p1)")
private external fun wasmLibcUnixStatvfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFstatvfs(p0, p1)")
private external fun wasmLibcUnixFstatvfs(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSigemptyset(p0)")
private external fun wasmLibcUnixSigemptyset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSigaddset(p0, p1)")
private external fun wasmLibcUnixSigaddset(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSigfillset(p0)")
private external fun wasmLibcUnixSigfillset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSigdelset(p0, p1)")
private external fun wasmLibcUnixSigdelset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSigismember(p0, p1)")
private external fun wasmLibcUnixSigismember(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSigprocmask(p0, p1, p2)")
private external fun wasmLibcUnixSigprocmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSigpending(p0)")
private external fun wasmLibcUnixSigpending(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSysconf(p0)")
private external fun wasmLibcUnixSysconf(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixMkfifo(p0, p1)")
private external fun wasmLibcUnixMkfifo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixFseeko(p0, p1, p2)")
private external fun wasmLibcUnixFseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFtello(p0)")
private external fun wasmLibcUnixFtello(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixTcdrain(p0)")
private external fun wasmLibcUnixTcdrain(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCfgetispeed(p0)")
private external fun wasmLibcUnixCfgetispeed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCfgetospeed(p0)")
private external fun wasmLibcUnixCfgetospeed(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCfsetispeed(p0, p1)")
private external fun wasmLibcUnixCfsetispeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCfsetospeed(p0, p1)")
private external fun wasmLibcUnixCfsetospeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixTcgetattr(p0, p1)")
private external fun wasmLibcUnixTcgetattr(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixTcsetattr(p0, p1, p2)")
private external fun wasmLibcUnixTcsetattr(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixTcflow(p0, p1)")
private external fun wasmLibcUnixTcflow(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixTcflush(p0, p1)")
private external fun wasmLibcUnixTcflush(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixTcgetsid(p0)")
private external fun wasmLibcUnixTcgetsid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixTcsendbreak(p0, p1)")
private external fun wasmLibcUnixTcsendbreak(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixMkstemp(p0)")
private external fun wasmLibcUnixMkstemp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixMkdtemp(p0)")
private external fun wasmLibcUnixMkdtemp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixTmpnam(p0)")
private external fun wasmLibcUnixTmpnam(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixOpenlog(p0, p1, p2)")
private external fun wasmLibcUnixOpenlog(p0: String, p1: Int, p2: Int)

@JsFun("() => globalThis.__km_napi_libc.libcUnixCloselog()")
private external fun wasmLibcUnixCloselog()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSetlogmask(p0)")
private external fun wasmLibcUnixSetlogmask(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixSyslog(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixSyslog(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNice(p0)")
private external fun wasmLibcUnixNice(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGrantpt(p0)")
private external fun wasmLibcUnixGrantpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPosixOpenpt(p0)")
private external fun wasmLibcUnixPosixOpenpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixPtsname(p0)")
private external fun wasmLibcUnixPtsname(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixUnlockpt(p0)")
private external fun wasmLibcUnixUnlockpt(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixStrcasestr(p0, p1)")
private external fun wasmLibcUnixStrcasestr(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixGetline(p0, p1, p2)")
private external fun wasmLibcUnixGetline(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLockf(p0, p1, p2)")
private external fun wasmLibcUnixLockf(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAdjtime(p0, p1)")
private external fun wasmLibcUnixAdjtime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixStpncpy(p0, p1, p2)")
private external fun wasmLibcUnixStpncpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixConfstr(p0, p1, p2)")
private external fun wasmLibcUnixConfstr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixDladdr(p0, p1)")
private external fun wasmLibcUnixDladdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixFlock(p0, p1)")
private external fun wasmLibcUnixFlock(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixOpenWmemstream(p0, p1)")
private external fun wasmLibcUnixOpenWmemstream(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixGetsid(p0)")
private external fun wasmLibcUnixGetsid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixPause()")
private external fun wasmLibcUnixPause(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixMkdirat(p0, p1, p2)")
private external fun wasmLibcUnixMkdirat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixOpenat(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixOpenat(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixFdopendir(p0)")
private external fun wasmLibcUnixFdopendir(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixReaddirR(p0, p1, p2)")
private external fun wasmLibcUnixReaddirR(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixReadlinkat(p0, p1, p2, p3)")
private external fun wasmLibcUnixReadlinkat(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixReadlink(p0, p1, p2)")
private external fun wasmLibcUnixReadlink(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixPselect(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixPselect(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSigaction(p0, p1, p2)")
private external fun wasmLibcUnixSigaction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixFmemopen(p0, p1, p2)")
private external fun wasmLibcUnixFmemopen(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixOpenMemstream(p0, p1)")
private external fun wasmLibcUnixOpenMemstream(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAtexit(p0)")
private external fun wasmLibcUnixAtexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixCfmakeraw(p0)")
private external fun wasmLibcUnixCfmakeraw(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixCfsetspeed(p0, p1)")
private external fun wasmLibcUnixCfsetspeed(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixFnmatch(p0, p1, p2)")
private external fun wasmLibcUnixFnmatch(p0: String, p1: String, p2: Int): Int

public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = In6Addr()

public actual val IN6ADDR_ANY: In6Addr
    get() = In6Addr()

public actual fun isalnum(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIslower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIspunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixTolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixToupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: MutPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    if (unixNapiAvailable) {
        wasmLibcUnixQsort(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bsearch(key: ConstPtr, base: ConstPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixBsearch(key.rawAddress.toString(), base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixFopen(filename.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFflush(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFclose(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixRemove(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: ConstPtr, newname: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixTmpfile().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    if (unixNapiAvailable) {
        wasmLibcUnixSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (unixNapiAvailable) wasmLibcUnixGetchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixPutchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFgetc(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFputc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFputs(s.rawAddress.toString(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPuts(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixUngetc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    if (unixNapiAvailable) wasmLibcUnixFread(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    if (unixNapiAvailable) wasmLibcUnixFwrite(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixFseek(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr): CLong =
    if (unixNapiAvailable) wasmLibcUnixFtell(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr) {
    if (unixNapiAvailable) {
        wasmLibcUnixRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFgetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFsetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFeof(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFerror(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(stream: MutPtr) {
    if (unixNapiAvailable) {
        wasmLibcUnixClearerr(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun perror(s: ConstPtr) {
    if (unixNapiAvailable) {
        wasmLibcUnixPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: ConstPtr): CDouble =
    if (unixNapiAvailable) wasmLibcUnixAtof(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixAtoi(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr): CLong =
    if (unixNapiAvailable) wasmLibcUnixAtol(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr): CLonglong =
    if (unixNapiAvailable) wasmLibcUnixAtoll(s.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    if (unixNapiAvailable) wasmLibcUnixStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    if (unixNapiAvailable) wasmLibcUnixStrtof(s.rawAddress.toString(), endp.rawAddress.toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    if (unixNapiAvailable) wasmLibcUnixStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    if (unixNapiAvailable) wasmLibcUnixStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    if (unixNapiAvailable) wasmLibcUnixStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    if (unixNapiAvailable) wasmLibcUnixStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixCalloc(nobj.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixMalloc(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixRealloc(p.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr) {
    if (unixNapiAvailable) {
        wasmLibcUnixFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (unixNapiAvailable) {
        wasmLibcUnixAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (unixNapiAvailable) {
        wasmLibcUnixExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun system(s: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSystem(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetenv(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStpcpy(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrcat(s.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrrchr(cs.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (unixNapiAvailable) wasmLibcUnixStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (unixNapiAvailable) wasmLibcUnixStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrdup(cs.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(cs: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrndup(cs.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr): SizeT =
    if (unixNapiAvailable) wasmLibcUnixStrlen(cs.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT =
    if (unixNapiAvailable) wasmLibcUnixStrnlen(cs.rawAddress.toString(), maxlen.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrerror(n).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrtok(s.rawAddress.toString(), t.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtokR(s: MutPtr, t: ConstPtr, p: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrtokR(s.rawAddress.toString(), t.rawAddress.toString(), p.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    if (unixNapiAvailable) wasmLibcUnixStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsignal(sig: CInt): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrsignal(sig).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: ConstPtr): SizeT =
    if (unixNapiAvailable) wasmLibcUnixWcslen(buf.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    if (unixNapiAvailable) wasmLibcUnixWcstombs(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixMemchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixWmemchr(cx.rawAddress.toString(), c.toInt(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixMemset(dest.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixMemccpy(dest.rawAddress.toString(), src.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnam(name: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetpwnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuid(uid: UidT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetpwuid(uid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (unixNapiAvailable) wasmLibcUnixGetcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixPutcharUnlocked(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixSocket(domain, ty, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(socket: CInt, address: ConstPtr, len: SocklenT): CInt =
    if (unixNapiAvailable) wasmLibcUnixConnect(socket, address.rawAddress.toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixListen(socket, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixAccept(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixGetpeername(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixGetsockname(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetsockopt(socket, level, name, value.rawAddress.toString(), optionLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSocketpair(domain, type, protocol, socketVector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    if (unixNapiAvailable) wasmLibcUnixSendto(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixShutdown(socket, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixChmod(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixFchmod(fd, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFstat(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixMkdir(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixStat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPclose(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixFdopen(fd, mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFileno(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixCreat(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixOpendir(dirname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixReaddir(dirp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixClosedir(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr) {
    if (unixNapiAvailable) {
        wasmLibcUnixRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixFchmodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixFchown(fd, owner.toInt(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixFchownat(dirfd, pathname.rawAddress.toString(), owner.toInt(), group.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixFstatat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixUnlinkat(dirfd, pathname.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixAccess(path.rawAddress.toString(), amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (unixNapiAvailable) wasmLibcUnixAlarm(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixChdir(dir.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchdir(dirfd: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixFchdir(dirfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixChown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixLchown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixClose(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixDup(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixDup2(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixExecl(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixExecle(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(file: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixExeclp(file.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: ConstPtr, argv: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixExecv(prog.rawAddress.toString(), argv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixExecve(prog.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: ConstPtr, argv: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixExecvp(c.rawAddress.toString(), argv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (unixNapiAvailable) wasmLibcUnixFork() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (unixNapiAvailable) wasmLibcUnixFpathconf(filedes, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetcwd(buf.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (unixNapiAvailable) wasmLibcUnixGetegid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (unixNapiAvailable) wasmLibcUnixGeteuid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (unixNapiAvailable) wasmLibcUnixGetgid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixGetgroups(ngroupsMax, groups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetlogin().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgid(pid: PidT): PidT =
    if (unixNapiAvailable) wasmLibcUnixGetpgid(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgrp(): PidT =
    if (unixNapiAvailable) wasmLibcUnixGetpgrp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (unixNapiAvailable) wasmLibcUnixGetpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (unixNapiAvailable) wasmLibcUnixGetppid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (unixNapiAvailable) wasmLibcUnixGetuid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixIsatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixLink(src.rawAddress.toString(), dst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (unixNapiAvailable) wasmLibcUnixLseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    if (unixNapiAvailable) wasmLibcUnixPathconf(path.rawAddress.toString(), name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPipe(fds.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixPosixMemalign(memptr.rawAddress.toString(), align.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixAlignedAlloc(alignment.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    if (unixNapiAvailable) wasmLibcUnixRead(fd, buf.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixRmdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixSeteuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetegid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetpgid(pid, pgid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsid(): PidT =
    if (unixNapiAvailable) wasmLibcUnixSetsid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetreuid(ruid.toInt(), euid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetregid(rgid.toInt(), egid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (unixNapiAvailable) wasmLibcUnixSleep(secs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixNanosleep(rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetpgrp(fd: CInt): PidT =
    if (unixNapiAvailable) wasmLibcUnixTcgetpgrp(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    if (unixNapiAvailable) wasmLibcUnixTcsetpgrp(fd, pgrp) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixTtyname(fd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttynameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixTtynameR(fd, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixUnlink(c.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: MutPtr): PidT =
    if (unixNapiAvailable) wasmLibcUnixWait(status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT =
    if (unixNapiAvailable) wasmLibcUnixWaitpid(pid, status.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    if (unixNapiAvailable) wasmLibcUnixWrite(fd, buf.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT =
    if (unixNapiAvailable) wasmLibcUnixPread(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT =
    if (unixNapiAvailable) wasmLibcUnixPwrite(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (unixNapiAvailable) wasmLibcUnixUmask(mask.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: ConstPtr, buf: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixUtime(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixKill(pid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixKillpg(pgrp, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: ConstPtr, len: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixMlock(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: ConstPtr, len: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixMunlock(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixMlockall(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (unixNapiAvailable) wasmLibcUnixMunlockall() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixMunmap(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(ifname: ConstPtr): CUint =
    if (unixNapiAvailable) wasmLibcUnixIfNametoindex(ifname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixIfIndextoname(ifindex.toInt(), ifname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixLstat(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixFsync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: ConstPtr, value: ConstPtr, overwrite: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetenv(name.rawAddress.toString(), value.rawAddress.toString(), overwrite) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixUnsetenv(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    if (unixNapiAvailable) wasmLibcUnixTruncate(path.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (unixNapiAvailable) wasmLibcUnixFtruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (unixNapiAvailable) wasmLibcUnixSignal(signum, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrusage(resource: CInt, usage: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixGetrusage(resource, usage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixRealpath(pathname.rawAddress.toString(), resolved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr): ClockT =
    if (unixNapiAvailable) wasmLibcUnixTimes(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (unixNapiAvailable) wasmLibcUnixPthreadSelf().toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadEqual(t1.toLong().toString(), t2.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadJoin(native.toLong().toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: MutPtr): Nothing {
    if (unixNapiAvailable) {
        wasmLibcUnixPthreadExit(value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadAttrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadAttrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadAttrGetstacksize(attr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadAttrSetstacksize(attr.rawAddress.toString(), stackSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadDetach(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (unixNapiAvailable) wasmLibcUnixSchedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadKeyDelete(key) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixPthreadGetspecific(key).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadSetspecific(key, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadMutexInit(lock.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadMutexDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadMutexLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadMutexTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadMutexUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadMutexattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadMutexattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadMutexattrSettype(attr.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadCondWait(cond.rawAddress.toString(), lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadCondTimedwait(cond.rawAddress.toString(), lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadCondSignal(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadCondBroadcast(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadCondDestroy(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadCondattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadCondattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadRwlockInit(lock.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadRwlockDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadRwlockRdlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadRwlockTryrdlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadRwlockWrlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadRwlockTrywrlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadRwlockUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadRwlockattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPthreadRwlockattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixGetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixRaise(signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: ConstPtr, times: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixUtimes(filename.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixDlopen(filename.rawAddress.toString(), flag).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixDlerror().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixDlsym(handle.rawAddress.toString(), symbol.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixDlclose(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixGetaddrinfo(node.rawAddress.toString(), service.rawAddress.toString(), hints.rawAddress.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: MutPtr) {
    if (unixNapiAvailable) {
        wasmLibcUnixFreeaddrinfo(res.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hstrerror(errcode: CInt): ConstPtr =
    if (unixNapiAvailable) ConstPtr(wasmLibcUnixHstrerror(errcode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gaiStrerror(errcode: CInt): ConstPtr =
    if (unixNapiAvailable) ConstPtr(wasmLibcUnixGaiStrerror(errcode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resInit(): CInt =
    if (unixNapiAvailable) wasmLibcUnixResInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGmtimeR(timeP.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixLocaltimeR(timeP.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: MutPtr): TimeT =
    if (unixNapiAvailable) wasmLibcUnixMktime(tm.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: MutPtr): TimeT =
    if (unixNapiAvailable) wasmLibcUnixTime(time.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGmtime(timeP.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixLocaltime(timeP.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (unixNapiAvailable) wasmLibcUnixDifftime(time1.toString(), time0.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr): TimeT =
    if (unixNapiAvailable) wasmLibcUnixTimegm(tm.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknod(pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixNapiAvailable) wasmLibcUnixMknod(pathname.rawAddress.toString(), mode.toInt(), dev) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: MutPtr, len: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixGethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endservent() {
    if (unixNapiAvailable) {
        wasmLibcUnixEndservent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetservbyname(name.rawAddress.toString(), proto.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyport(port: CInt, proto: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetservbyport(port, proto.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservent(): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetservent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setservent(stayopen: CInt) {
    if (unixNapiAvailable) {
        wasmLibcUnixSetservent(stayopen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getprotobyname(name: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetprotobyname(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixGetprotobynumber(proto).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chroot(name: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixChroot(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: UsecondsT): CInt =
    if (unixNapiAvailable) wasmLibcUnixUsleep(secs.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    if (unixNapiAvailable) wasmLibcUnixSend(socket, buf.rawAddress.toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT =
    if (unixNapiAvailable) wasmLibcUnixRecv(socket, buf.rawAddress.toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPutenv(string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixPoll(fds.rawAddress.toString(), nfds.toString(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSelect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixSetlocale(category, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixLocaleconv().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSemWait(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTrywait(sem: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSemTrywait(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSemPost(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(path: ConstPtr, buf: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixStatvfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fd: CInt, buf: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixFstatvfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSigemptyset(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixSigaddset(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSigfillset(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixSigdelset(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixSigismember(set.rawAddress.toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSigprocmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSigpending(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (unixNapiAvailable) wasmLibcUnixSysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixMkfifo(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixFseeko(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr): OffT =
    if (unixNapiAvailable) wasmLibcUnixFtello(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcdrain(fd: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixTcdrain(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetispeed(termios: ConstPtr): SpeedT =
    if (unixNapiAvailable) wasmLibcUnixCfgetispeed(termios.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: ConstPtr): SpeedT =
    if (unixNapiAvailable) wasmLibcUnixCfgetospeed(termios.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt =
    if (unixNapiAvailable) wasmLibcUnixCfsetispeed(termios.rawAddress.toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt =
    if (unixNapiAvailable) wasmLibcUnixCfsetospeed(termios.rawAddress.toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixTcgetattr(fd, termios.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixTcsetattr(fd, optionalActions, termios.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixTcflow(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixTcflush(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetsid(fd: CInt): PidT =
    if (unixNapiAvailable) wasmLibcUnixTcgetsid(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixTcsendbreak(fd, duration) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixMkstemp(template.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixMkdtemp(template.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixTmpnam(ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt) {
    if (unixNapiAvailable) {
        wasmLibcUnixOpenlog(ident.rawAddress.toString(), logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (unixNapiAvailable) {
        wasmLibcUnixCloselog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixSetlogmask(maskpri) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long) {
    if (unixNapiAvailable) {
        wasmLibcUnixSyslog(priority, message.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nice(incr: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixNice(incr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun grantpt(fd: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixGrantpt(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixOpenpt(flags: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixPosixOpenpt(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsname(fd: CInt): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixPtsname(fd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockpt(fd: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixUnlockpt(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStrcasestr(cs.rawAddress.toString(), ct.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    if (unixNapiAvailable) wasmLibcUnixGetline(lineptr.rawAddress.toString(), n.rawAddress.toString(), stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    if (unixNapiAvailable) wasmLibcUnixLockf(fd, cmd, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtime(delta: ConstPtr, olddelta: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixAdjtime(delta.rawAddress.toString(), olddelta.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixStpncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT =
    if (unixNapiAvailable) wasmLibcUnixConfstr(name, buf.rawAddress.toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: ConstPtr, info: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixDladdr(addr.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixFlock(fd, operation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWmemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixOpenWmemstream(ptr.rawAddress.toString(), sizeloc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsid(pid: PidT): PidT =
    if (unixNapiAvailable) wasmLibcUnixGetsid(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (unixNapiAvailable) wasmLibcUnixPause() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixMkdirat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    if (unixNapiAvailable) wasmLibcUnixOpenat(dirfd, pathname.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixFdopendir(fd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixReaddirR(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixReadlinkat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), bufsiz.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): CInt =
    if (unixNapiAvailable) wasmLibcUnixReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsz.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pselect(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr, sigmask: ConstPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixPselect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixSigaction(signum, act.rawAddress.toString(), oldact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmemopen(buf: MutPtr, size: SizeT, mode: ConstPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixFmemopen(buf.rawAddress.toString(), size.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openMemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    if (unixNapiAvailable) MutPtr(wasmLibcUnixOpenMemstream(ptr.rawAddress.toString(), sizeloc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (unixNapiAvailable) wasmLibcUnixAtexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: MutPtr): CInt =
    if (unixNapiAvailable) wasmLibcUnixCfmakeraw(termios.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetspeed(termios: MutPtr, speed: SpeedT): CInt =
    if (unixNapiAvailable) wasmLibcUnixCfsetspeed(termios.rawAddress.toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    if (unixNapiAvailable) wasmLibcUnixFnmatch(pattern.rawAddress.toString(), name.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")
