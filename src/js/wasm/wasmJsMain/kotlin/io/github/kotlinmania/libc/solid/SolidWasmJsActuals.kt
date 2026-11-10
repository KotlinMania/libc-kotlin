@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.solid.aarch64.WcharT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initSolidNapiAddon(): Boolean

private val _solidNapiAvailable: Boolean = _initSolidNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_solid_get_OPTARG()")
private external fun _wasm_libc_solid_get_OPTARG(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_set_OPTARG(p0)")
private external fun _wasm_libc_solid_set_OPTARG(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_solid_get_OPTERR()")
private external fun _wasm_libc_solid_get_OPTERR(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_set_OPTERR(p0)")
private external fun _wasm_libc_solid_set_OPTERR(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_solid_get_OPTIND()")
private external fun _wasm_libc_solid_get_OPTIND(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_set_OPTIND(p0)")
private external fun _wasm_libc_solid_set_OPTIND(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_solid_get_OPTOPT()")
private external fun _wasm_libc_solid_get_OPTOPT(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_set_OPTOPT(p0)")
private external fun _wasm_libc_solid_set_OPTOPT(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_solid_get_OPTRESET()")
private external fun _wasm_libc_solid_get_OPTRESET(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_set_OPTRESET(p0)")
private external fun _wasm_libc_solid_set_OPTRESET(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_solid_get_SUBOPTARG()")
private external fun _wasm_libc_solid_get_SUBOPTARG(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_set_SUBOPTARG(p0)")
private external fun _wasm_libc_solid_set_SUBOPTARG(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_isalnum(p0)")
private external fun _wasm_libc_solid_isalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_isalpha(p0)")
private external fun _wasm_libc_solid_isalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_iscntrl(p0)")
private external fun _wasm_libc_solid_iscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_isdigit(p0)")
private external fun _wasm_libc_solid_isdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_isgraph(p0)")
private external fun _wasm_libc_solid_isgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_islower(p0)")
private external fun _wasm_libc_solid_islower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_isprint(p0)")
private external fun _wasm_libc_solid_isprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_ispunct(p0)")
private external fun _wasm_libc_solid_ispunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_isspace(p0)")
private external fun _wasm_libc_solid_isspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_isupper(p0)")
private external fun _wasm_libc_solid_isupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_isxdigit(p0)")
private external fun _wasm_libc_solid_isxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_isblank(p0)")
private external fun _wasm_libc_solid_isblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_tolower(p0)")
private external fun _wasm_libc_solid_tolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_toupper(p0)")
private external fun _wasm_libc_solid_toupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_getStdioFile(p0)")
private external fun _wasm_libc_solid_getStdioFile(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_clearerr(p0)")
private external fun _wasm_libc_solid_clearerr(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_fclose(p0)")
private external fun _wasm_libc_solid_fclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_feof(p0)")
private external fun _wasm_libc_solid_feof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_ferror(p0)")
private external fun _wasm_libc_solid_ferror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_fflush(p0)")
private external fun _wasm_libc_solid_fflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_fgetc(p0)")
private external fun _wasm_libc_solid_fgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_fgets(p0, p1, p2)")
private external fun _wasm_libc_solid_fgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_fopen(p0, p1)")
private external fun _wasm_libc_solid_fopen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_fprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_fprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_fputc(p0, p1)")
private external fun _wasm_libc_solid_fputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_fputs(p0, p1)")
private external fun _wasm_libc_solid_fputs(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_fread(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_fread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_freopen(p0, p1, p2)")
private external fun _wasm_libc_solid_freopen(p0: String?, p1: String?, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_fscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_fscanf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_fseek(p0, p1, p2)")
private external fun _wasm_libc_solid_fseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_ftell(p0)")
private external fun _wasm_libc_solid_ftell(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_fwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_fwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_getc(p0)")
private external fun _wasm_libc_solid_getc(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_solid_getchar()")
private external fun _wasm_libc_solid_getchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_perror(p0)")
private external fun _wasm_libc_solid_perror(p0: String?)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_solid_printf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_solid_printf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_putc(p0, p1)")
private external fun _wasm_libc_solid_putc(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_putchar(p0)")
private external fun _wasm_libc_solid_putchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_puts(p0)")
private external fun _wasm_libc_solid_puts(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_remove(p0)")
private external fun _wasm_libc_solid_remove(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_rewind(p0)")
private external fun _wasm_libc_solid_rewind(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_solid_scanf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_solid_scanf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_setbuf(p0, p1)")
private external fun _wasm_libc_solid_setbuf(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_setvbuf(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_setvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_sscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_sscanf(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_solid_tmpfile()")
private external fun _wasm_libc_solid_tmpfile(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_ungetc(p0, p1)")
private external fun _wasm_libc_solid_ungetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_vfprintf(p0, p1, p2)")
private external fun _wasm_libc_solid_vfprintf(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_vprintf(p0, p1)")
private external fun _wasm_libc_solid_vprintf(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_gets(p0)")
private external fun _wasm_libc_solid_gets(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_sprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_sprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_tmpnam(p0)")
private external fun _wasm_libc_solid_tmpnam(p0: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_vsprintf(p0, p1, p2)")
private external fun _wasm_libc_solid_vsprintf(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_rename(p0, p1)")
private external fun _wasm_libc_solid_rename(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_asiprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_asiprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_fiprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_fiprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_fiscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_fiscanf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_solid_iprintf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_solid_iprintf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_solid_iscanf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_solid_iscanf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_siprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_siprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_siscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_siscanf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_solid_sniprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_solid_sniprintf(p0: String, p1: String, p2: String?, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_vasiprintf(p0, p1, p2)")
private external fun _wasm_libc_solid_vasiprintf(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_vfiprintf(p0, p1, p2)")
private external fun _wasm_libc_solid_vfiprintf(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_vfiscanf(p0, p1, p2)")
private external fun _wasm_libc_solid_vfiscanf(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_viprintf(p0, p1)")
private external fun _wasm_libc_solid_viprintf(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_viscanf(p0, p1)")
private external fun _wasm_libc_solid_viscanf(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_vsiprintf(p0, p1, p2)")
private external fun _wasm_libc_solid_vsiprintf(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_vsiscanf(p0, p1, p2)")
private external fun _wasm_libc_solid_vsiscanf(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_vsniprintf(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_vsniprintf(p0: String, p1: String, p2: String?, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_vdiprintf(p0, p1, p2)")
private external fun _wasm_libc_solid_vdiprintf(p0: Int, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_diprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_diprintf(p0: Int, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_fgetpos(p0, p1)")
private external fun _wasm_libc_solid_fgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_fsetpos(p0, p1)")
private external fun _wasm_libc_solid_fsetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_fdopen(p0, p1)")
private external fun _wasm_libc_solid_fdopen(p0: Int, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_fileno(p0)")
private external fun _wasm_libc_solid_fileno(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_flockfile(p0)")
private external fun _wasm_libc_solid_flockfile(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_ftrylockfile(p0)")
private external fun _wasm_libc_solid_ftrylockfile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_funlockfile(p0)")
private external fun _wasm_libc_solid_funlockfile(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_getcUnlocked(p0)")
private external fun _wasm_libc_solid_getcUnlocked(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_solid_getcharUnlocked()")
private external fun _wasm_libc_solid_getcharUnlocked(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_putcUnlocked(p0, p1)")
private external fun _wasm_libc_solid_putcUnlocked(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_putcharUnlocked(p0)")
private external fun _wasm_libc_solid_putcharUnlocked(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_solid_snprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_solid_snprintf(p0: String, p1: String, p2: String?, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_vsnprintf(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_vsnprintf(p0: String, p1: String, p2: String?, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_getw(p0)")
private external fun _wasm_libc_solid_getw(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_putw(p0, p1)")
private external fun _wasm_libc_solid_putw(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_tempnam(p0, p1)")
private external fun _wasm_libc_solid_tempnam(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_fseeko(p0, p1, p2)")
private external fun _wasm_libc_solid_fseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_ftello(p0)")
private external fun _wasm_libc_solid_ftello(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_atof(p0)")
private external fun _wasm_libc_solid_atof(p0: String?): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strtod(p0, p1)")
private external fun _wasm_libc_solid_strtod(p0: String?, p1: String): Double

@JsFun("() => globalThis.__km_napi_libc.libc_solid_drand48()")
private external fun _wasm_libc_solid_drand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_erand48(p0)")
private external fun _wasm_libc_solid_erand48(p0: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strtof(p0, p1)")
private external fun _wasm_libc_solid_strtof(p0: String?, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strtold(p0, p1)")
private external fun _wasm_libc_solid_strtold(p0: String?, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtodL(p0, p1, p2)")
private external fun _wasm_libc_solid_strtodL(p0: String?, p1: String, p2: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtofL(p0, p1, p2)")
private external fun _wasm_libc_solid_strtofL(p0: String?, p1: String, p2: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtoldL(p0, p1, p2)")
private external fun _wasm_libc_solid_strtoldL(p0: String?, p1: String, p2: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_exit(p0)")
private external fun _wasm_libc_solid_exit(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_solid_abort()")
private external fun _wasm_libc_solid_abort()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_abs(p0)")
private external fun _wasm_libc_solid_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_atexit(p0)")
private external fun _wasm_libc_solid_atexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_atoi(p0)")
private external fun _wasm_libc_solid_atoi(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_atol(p0)")
private external fun _wasm_libc_solid_atol(p0: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_itoa(p0, p1, p2)")
private external fun _wasm_libc_solid_itoa(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_ltoa(p0, p1, p2)")
private external fun _wasm_libc_solid_ltoa(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_ultoa(p0, p1, p2)")
private external fun _wasm_libc_solid_ultoa(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_solid_bsearch(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_solid_bsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_calloc(p0, p1)")
private external fun _wasm_libc_solid_calloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_free(p0)")
private external fun _wasm_libc_solid_free(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_getenv(p0)")
private external fun _wasm_libc_solid_getenv(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_labs(p0)")
private external fun _wasm_libc_solid_labs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_malloc(p0)")
private external fun _wasm_libc_solid_malloc(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_qsort(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_qsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("() => globalThis.__km_napi_libc.libc_solid_rand()")
private external fun _wasm_libc_solid_rand(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_realloc(p0, p1)")
private external fun _wasm_libc_solid_realloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_srand(p0)")
private external fun _wasm_libc_solid_srand(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtol(p0, p1, p2)")
private external fun _wasm_libc_solid_strtol(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtoul(p0, p1, p2)")
private external fun _wasm_libc_solid_strtoul(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_mblen(p0, p1)")
private external fun _wasm_libc_solid_mblen(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_mbstowcs(p0, p1, p2)")
private external fun _wasm_libc_solid_mbstowcs(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_wctomb(p0, p1)")
private external fun _wasm_libc_solid_wctomb(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_mbtowc(p0, p1, p2)")
private external fun _wasm_libc_solid_mbtowc(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_wcstombs(p0, p1, p2)")
private external fun _wasm_libc_solid_wcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_randR(p0)")
private external fun _wasm_libc_solid_randR(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_jrand48(p0)")
private external fun _wasm_libc_solid_jrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_lcong48(p0)")
private external fun _wasm_libc_solid_lcong48(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_solid_lrand48()")
private external fun _wasm_libc_solid_lrand48(): String

@JsFun("() => globalThis.__km_napi_libc.libc_solid_mrand48()")
private external fun _wasm_libc_solid_mrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_nrand48(p0)")
private external fun _wasm_libc_solid_nrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_seed48(p0)")
private external fun _wasm_libc_solid_seed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_srand48(p0)")
private external fun _wasm_libc_solid_srand48(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_putenv(p0)")
private external fun _wasm_libc_solid_putenv(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_a64l(p0)")
private external fun _wasm_libc_solid_a64l(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_l64a(p0)")
private external fun _wasm_libc_solid_l64a(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_solid_random()")
private external fun _wasm_libc_solid_random(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_setstate(p0)")
private external fun _wasm_libc_solid_setstate(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_initstate(p0, p1, p2)")
private external fun _wasm_libc_solid_initstate(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_srandom(p0)")
private external fun _wasm_libc_solid_srandom(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_mkostemp(p0, p1)")
private external fun _wasm_libc_solid_mkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_mkostemps(p0, p1, p2)")
private external fun _wasm_libc_solid_mkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_mkdtemp(p0)")
private external fun _wasm_libc_solid_mkdtemp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_mkstemp(p0)")
private external fun _wasm_libc_solid_mkstemp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_mktemp(p0)")
private external fun _wasm_libc_solid_mktemp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_atoll(p0)")
private external fun _wasm_libc_solid_atoll(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_llabs(p0)")
private external fun _wasm_libc_solid_llabs(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtoll(p0, p1, p2)")
private external fun _wasm_libc_solid_strtoll(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtoull(p0, p1, p2)")
private external fun _wasm_libc_solid_strtoull(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_alignedAlloc(p0, p1)")
private external fun _wasm_libc_solid_alignedAlloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_atQuickExit(p0)")
private external fun _wasm_libc_solid_atQuickExit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_quickExit(p0)")
private external fun _wasm_libc_solid_quickExit(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_setenv(p0, p1, p2)")
private external fun _wasm_libc_solid_setenv(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_unsetenv(p0)")
private external fun _wasm_libc_solid_unsetenv(p0: String?): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_solid_humanizeNumber(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_solid_humanizeNumber(p0: String, p1: String, p2: String, p3: String?, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_dehumanizeNumber(p0, p1)")
private external fun _wasm_libc_solid_dehumanizeNumber(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_getenvR(p0, p1, p2)")
private external fun _wasm_libc_solid_getenvR(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_heapsort(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_heapsort(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_mergesort(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_mergesort(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_radixsort(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_radixsort(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_sradixsort(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_sradixsort(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_solid_getprogname()")
private external fun _wasm_libc_solid_getprogname(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_setprogname(p0)")
private external fun _wasm_libc_solid_setprogname(p0: String?)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_qabs(p0)")
private external fun _wasm_libc_solid_qabs(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtoq(p0, p1, p2)")
private external fun _wasm_libc_solid_strtoq(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtouq(p0, p1, p2)")
private external fun _wasm_libc_solid_strtouq(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_strsuftoll(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_strsuftoll(p0: String?, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_solid_strsuftollx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_solid_strsuftollx(p0: String?, p1: String?, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_l64aR(p0, p1, p2)")
private external fun _wasm_libc_solid_l64aR(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_strtolL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_strtolL(p0: String?, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_strtoulL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_strtoulL(p0: String?, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_strtollL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_strtollL(p0: String?, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_strtoullL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_strtoullL(p0: String?, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_strtoqL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_strtoqL(p0: String?, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_strtouqL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_strtouqL(p0: String?, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_mbCurMaxL(p0)")
private external fun _wasm_libc_solid_mbCurMaxL(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_mblenL(p0, p1, p2)")
private external fun _wasm_libc_solid_mblenL(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_mbstowcsL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_mbstowcsL(p0: String, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_wctombL(p0, p1, p2)")
private external fun _wasm_libc_solid_wctombL(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_mbtowcL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_mbtowcL(p0: String, p1: String?, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_wcstombsL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_wcstombsL(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_memchr(p0, p1, p2)")
private external fun _wasm_libc_solid_memchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_memcmp(p0, p1, p2)")
private external fun _wasm_libc_solid_memcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_memcpy(p0, p1, p2)")
private external fun _wasm_libc_solid_memcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_memmove(p0, p1, p2)")
private external fun _wasm_libc_solid_memmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_memset(p0, p1, p2)")
private external fun _wasm_libc_solid_memset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strcat(p0, p1)")
private external fun _wasm_libc_solid_strcat(p0: String, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strchr(p0, p1)")
private external fun _wasm_libc_solid_strchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strcmp(p0, p1)")
private external fun _wasm_libc_solid_strcmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strcoll(p0, p1)")
private external fun _wasm_libc_solid_strcoll(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strcpy(p0, p1)")
private external fun _wasm_libc_solid_strcpy(p0: String, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strcspn(p0, p1)")
private external fun _wasm_libc_solid_strcspn(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_strerror(p0)")
private external fun _wasm_libc_solid_strerror(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_strlen(p0)")
private external fun _wasm_libc_solid_strlen(p0: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strncat(p0, p1, p2)")
private external fun _wasm_libc_solid_strncat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strncmp(p0, p1, p2)")
private external fun _wasm_libc_solid_strncmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strncpy(p0, p1, p2)")
private external fun _wasm_libc_solid_strncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strpbrk(p0, p1)")
private external fun _wasm_libc_solid_strpbrk(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strrchr(p0, p1)")
private external fun _wasm_libc_solid_strrchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strspn(p0, p1)")
private external fun _wasm_libc_solid_strspn(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strstr(p0, p1)")
private external fun _wasm_libc_solid_strstr(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strtok(p0, p1)")
private external fun _wasm_libc_solid_strtok(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strtokR(p0, p1, p2)")
private external fun _wasm_libc_solid_strtokR(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_solid_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strxfrm(p0, p1, p2)")
private external fun _wasm_libc_solid_strxfrm(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_memccpy(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_memccpy(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_strdup(p0)")
private external fun _wasm_libc_solid_strdup(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_stpcpy(p0, p1)")
private external fun _wasm_libc_solid_stpcpy(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_stpncpy(p0, p1, p2)")
private external fun _wasm_libc_solid_stpncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strnlen(p0, p1)")
private external fun _wasm_libc_solid_strnlen(p0: String?, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_memmem(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_memmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strcasestr(p0, p1)")
private external fun _wasm_libc_solid_strcasestr(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strlcat(p0, p1, p2)")
private external fun _wasm_libc_solid_strlcat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strlcpy(p0, p1, p2)")
private external fun _wasm_libc_solid_strlcpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strsep(p0, p1)")
private external fun _wasm_libc_solid_strsep(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_stresep(p0, p1, p2)")
private external fun _wasm_libc_solid_stresep(p0: String, p1: String?, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strndup(p0, p1)")
private external fun _wasm_libc_solid_strndup(p0: String?, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_memrchr(p0, p1, p2)")
private external fun _wasm_libc_solid_memrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_explicitMemset(p0, p1, p2)")
private external fun _wasm_libc_solid_explicitMemset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_consttimeMemequal(p0, p1, p2)")
private external fun _wasm_libc_solid_consttimeMemequal(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strcollL(p0, p1, p2)")
private external fun _wasm_libc_solid_strcollL(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_strxfrmL(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_strxfrmL(p0: String, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strerrorL(p0, p1)")
private external fun _wasm_libc_solid_strerrorL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_bcmp(p0, p1, p2)")
private external fun _wasm_libc_solid_bcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_bcopy(p0, p1, p2)")
private external fun _wasm_libc_solid_bcopy(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_bzero(p0, p1)")
private external fun _wasm_libc_solid_bzero(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_ffs(p0)")
private external fun _wasm_libc_solid_ffs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_popcount(p0)")
private external fun _wasm_libc_solid_popcount(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_popcountl(p0)")
private external fun _wasm_libc_solid_popcountl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_popcountll(p0)")
private external fun _wasm_libc_solid_popcountll(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_popcount32(p0)")
private external fun _wasm_libc_solid_popcount32(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_popcount64(p0)")
private external fun _wasm_libc_solid_popcount64(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_rindex(p0, p1)")
private external fun _wasm_libc_solid_rindex(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_strcasecmp(p0, p1)")
private external fun _wasm_libc_solid_strcasecmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_strncasecmp(p0, p1, p2)")
private external fun _wasm_libc_solid_strncasecmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_signal(p0, p1)")
private external fun _wasm_libc_solid_signal(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_raise(p0)")
private external fun _wasm_libc_solid_raise(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_asctime(p0)")
private external fun _wasm_libc_solid_asctime(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_solid_clock()")
private external fun _wasm_libc_solid_clock(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_ctime(p0)")
private external fun _wasm_libc_solid_ctime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_difftime(p0, p1)")
private external fun _wasm_libc_solid_difftime(p0: String, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_gmtime(p0)")
private external fun _wasm_libc_solid_gmtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_localtime(p0)")
private external fun _wasm_libc_solid_localtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_time(p0)")
private external fun _wasm_libc_solid_time(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_mktime(p0)")
private external fun _wasm_libc_solid_mktime(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_solid_strftime(p0, p1, p2, p3)")
private external fun _wasm_libc_solid_strftime(p0: String, p1: String, p2: String?, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_utime(p0, p1)")
private external fun _wasm_libc_solid_utime(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_asctimeR(p0, p1)")
private external fun _wasm_libc_solid_asctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_ctimeR(p0, p1)")
private external fun _wasm_libc_solid_ctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_gmtimeR(p0, p1)")
private external fun _wasm_libc_solid_gmtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_localtimeR(p0, p1)")
private external fun _wasm_libc_solid_localtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_stat(p0, p1)")
private external fun _wasm_libc_solid_stat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_lstat(p0, p1)")
private external fun _wasm_libc_solid_lstat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_fstat(p0, p1)")
private external fun _wasm_libc_solid_fstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_chmod(p0, p1)")
private external fun _wasm_libc_solid_chmod(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_mkdir(p0, p1)")
private external fun _wasm_libc_solid_mkdir(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_open(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_open(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_creat(p0, p1)")
private external fun _wasm_libc_solid_creat(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_close(p0)")
private external fun _wasm_libc_solid_close(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_read(p0, p1, p2)")
private external fun _wasm_libc_solid_read(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_write(p0, p1, p2)")
private external fun _wasm_libc_solid_write(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_unlink(p0)")
private external fun _wasm_libc_solid_unlink(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_tell(p0)")
private external fun _wasm_libc_solid_tell(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_dup(p0)")
private external fun _wasm_libc_solid_dup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_dup2(p0, p1)")
private external fun _wasm_libc_solid_dup2(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_access(p0, p1)")
private external fun _wasm_libc_solid_access(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_rmdir(p0)")
private external fun _wasm_libc_solid_rmdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_chdir(p0)")
private external fun _wasm_libc_solid_chdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_getwd(p0)")
private external fun _wasm_libc_solid_getwd(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_getcwd(p0, p1)")
private external fun _wasm_libc_solid_getcwd(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_getopt(p0, p1, p2)")
private external fun _wasm_libc_solid_getopt(p0: Int, p1: String, p2: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_getsubopt(p0, p1, p2)")
private external fun _wasm_libc_solid_getsubopt(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_solid_fcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_solid_fcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_solid_getpid()")
private external fun _wasm_libc_solid_getpid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_sleep(p0)")
private external fun _wasm_libc_solid_sleep(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_usleep(p0)")
private external fun _wasm_libc_solid_usleep(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_solid_localeconv()")
private external fun _wasm_libc_solid_localeconv(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_setlocale(p0, p1)")
private external fun _wasm_libc_solid_setlocale(p0: Int, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_duplocale(p0)")
private external fun _wasm_libc_solid_duplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_freelocale(p0)")
private external fun _wasm_libc_solid_freelocale(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_localeconvL(p0)")
private external fun _wasm_libc_solid_localeconvL(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_newlocale(p0, p1, p2)")
private external fun _wasm_libc_solid_newlocale(p0: Int, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_solid_nlLanginfo(p0)")
private external fun _wasm_libc_solid_nlLanginfo(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_nlLanginfoL(p0, p1)")
private external fun _wasm_libc_solid_nlLanginfoL(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_solid_memalign(p0, p1)")
private external fun _wasm_libc_solid_memalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_solid_lseek(p0, p1, p2)")
private external fun _wasm_libc_solid_lseek(p0: Int, p1: String, p2: Int): String

public actual var OPTARG: COpaquePointer?
    get() = if (_solidNapiAvailable) _wasm_libc_solid_get_OPTARG().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAvailable) {
            _wasm_libc_solid_set_OPTARG((value?.value ?: 0L).toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTERR: CInt
    get() = if (_solidNapiAvailable) _wasm_libc_solid_get_OPTERR() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAvailable) {
            _wasm_libc_solid_set_OPTERR(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTIND: CInt
    get() = if (_solidNapiAvailable) _wasm_libc_solid_get_OPTIND() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAvailable) {
            _wasm_libc_solid_set_OPTIND(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTOPT: CInt
    get() = if (_solidNapiAvailable) _wasm_libc_solid_get_OPTOPT() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAvailable) {
            _wasm_libc_solid_set_OPTOPT(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var OPTRESET: CInt
    get() = if (_solidNapiAvailable) _wasm_libc_solid_get_OPTRESET() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAvailable) {
            _wasm_libc_solid_set_OPTRESET(value)
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual var SUBOPTARG: COpaquePointer?
    get() = if (_solidNapiAvailable) _wasm_libc_solid_get_SUBOPTARG().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_solidNapiAvailable) {
            _wasm_libc_solid_set_SUBOPTARG((value?.value ?: 0L).toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual fun isalnum(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_isalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_isalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_iscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_isdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_isgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_islower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_isprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_ispunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_isspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_isupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_isxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_isblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_tolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_toupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStdioFile(fileno: CInt): FILE? =
    if (_solidNapiAvailable) _wasm_libc_solid_getStdioFile(fileno).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(arg1: FILE?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_clearerr((arg1?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fclose(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fclose((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_feof((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_ferror((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fflush((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fgetc((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_fgets((arg1?.value ?: 0L).toString(), arg2, (arg3?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    if (_solidNapiAvailable) _wasm_libc_solid_fopen(arg1, arg2).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fprintf((arg1?.handle ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fputc(arg1, (arg2?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fputs(arg1, (arg2?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_fread((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), (arg4?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    if (_solidNapiAvailable) _wasm_libc_solid_freopen(arg1, arg2, (arg3?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fscanf((arg1?.handle ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fseek((arg1?.handle ?: 0L).toString(), arg2.toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(arg1: FILE?): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_ftell((arg1?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_fwrite((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), (arg4?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getc(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_getc((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_getchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(arg1: String?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_perror(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun printf(arg1: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_printf(arg1, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_putc(arg1, (arg2?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(arg1: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_putchar(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(arg1: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_puts(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(arg1: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_remove(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(arg1: FILE?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_rewind((arg1?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun scanf(arg1: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_scanf(arg1, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_setbuf((arg1?.handle ?: 0L).toString(), (arg2?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_setvbuf((arg1?.handle ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3, arg4.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(arg1: String?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_sscanf(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): FILE? =
    if (_solidNapiAvailable) _wasm_libc_solid_tmpfile().toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_ungetc(arg1, (arg2?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vfprintf((arg1?.handle ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vprintf(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_gets((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_sprintf((arg1?.value ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_tmpnam(arg1).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vsprintf((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(arg1: String?, arg2: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_rename(arg1, arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_asiprintf((arg1?.value ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fiprintf((arg1?.handle ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fiscanf((arg1?.handle ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iprintf(arg1: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_iprintf(arg1, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscanf(arg1: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_iscanf(arg1, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun siprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_siprintf((arg1?.value ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun siscanf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_siscanf((arg1?.value ?: 0L).toString(), arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_sniprintf((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vasiprintf((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vfiprintf((arg1?.handle ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vfiscanf((arg1?.handle ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_viprintf(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_viscanf(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vsiprintf((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vsiscanf(arg1, arg2, (arg3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vsniprintf((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, (arg4?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vdiprintf(arg1, arg2, (arg3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun diprintf(arg1: CInt, arg2: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_diprintf(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fgetpos((arg1?.handle ?: 0L).toString(), (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fsetpos((arg1?.handle ?: 0L).toString(), (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    if (_solidNapiAvailable) _wasm_libc_solid_fdopen(arg1, arg2).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fileno((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flockfile(arg1: FILE?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_flockfile((arg1?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_ftrylockfile((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun funlockfile(arg1: FILE?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_funlockfile((arg1?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_getcUnlocked((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_getcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_putcUnlocked(arg1, (arg2?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(arg1: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_putcharUnlocked(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_snprintf((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_vsnprintf((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, (arg4?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getw(arg1: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_getw((arg1?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_putw(arg1, (arg2?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_tempnam(arg1, arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: FILE?): OffT =
    if (_solidNapiAvailable) _wasm_libc_solid_ftello((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(arg1: String?): Double =
    if (_solidNapiAvailable) _wasm_libc_solid_atof(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    if (_solidNapiAvailable) _wasm_libc_solid_strtod(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): Double =
    if (_solidNapiAvailable) _wasm_libc_solid_drand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(arg1: COpaquePointer?): Double =
    if (_solidNapiAvailable) _wasm_libc_solid_erand48((arg1?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    if (_solidNapiAvailable) _wasm_libc_solid_strtof(arg1, (arg2?.value ?: 0L).toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    if (_solidNapiAvailable) _wasm_libc_solid_strtold(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    if (_solidNapiAvailable) _wasm_libc_solid_strtodL(arg1, (arg2?.value ?: 0L).toString(), arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    if (_solidNapiAvailable) _wasm_libc_solid_strtofL(arg1, (arg2?.value ?: 0L).toString(), arg3.toLong().toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    if (_solidNapiAvailable) _wasm_libc_solid_strtoldL(arg1, (arg2?.value ?: 0L).toString(), arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exit(arg1: CInt): Nothing {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_exit(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_abs(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_atexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(arg1: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_atoi(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(arg1: String?): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_atol(arg1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_itoa(arg1, (arg2?.value ?: 0L).toString(), arg3).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_ltoa(arg1.toString(), (arg2?.value ?: 0L).toString(), arg3).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_ultoa(arg1.toString(), (arg2?.value ?: 0L).toString(), arg3).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_bsearch((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString(), arg4.toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_calloc(arg1.toString(), arg2.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(arg1: COpaquePointer?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_free((arg1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_getenv(arg1).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(arg1: CLong): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_labs(arg1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_malloc(arg1.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_qsort((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rand(): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_realloc((arg1?.value ?: 0L).toString(), arg2.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(arg1: CUint) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_srand(arg1.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_strtol(arg1, (arg2?.value ?: 0L).toString(), arg3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    if (_solidNapiAvailable) _wasm_libc_solid_strtoul(arg1, (arg2?.value ?: 0L).toString(), arg3).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_mblen(arg1, arg2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbstowcs(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_mbstowcs((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_wctomb((arg1?.value ?: 0L).toString(), arg2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbtowc(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_mbtowc((arg1?.value ?: 0L).toString(), arg2, arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_wcstombs((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randR(arg1: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_randR((arg1?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(arg1: COpaquePointer?): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_jrand48((arg1?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(arg1: COpaquePointer?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_lcong48((arg1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lrand48(): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_lrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_mrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(arg1: COpaquePointer?): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_nrand48((arg1?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_seed48((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(arg1: CLong) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_srand48(arg1.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_putenv((arg1?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun a64l(arg1: String?): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_a64l(arg1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun l64a(arg1: CLong): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_l64a(arg1.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_random().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_setstate((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_initstate(arg1.toInt(), (arg2?.value ?: 0L).toString(), arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(arg1: CUint) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_srandom(arg1.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_mkostemp((arg1?.value ?: 0L).toString(), arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_mkostemps((arg1?.value ?: 0L).toString(), arg2, arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_mkdtemp((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_mkstemp((arg1?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_mktemp((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(arg1: String?): CLonglong =
    if (_solidNapiAvailable) _wasm_libc_solid_atoll(arg1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(arg1: CLonglong): CLonglong =
    if (_solidNapiAvailable) _wasm_libc_solid_llabs(arg1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    if (_solidNapiAvailable) _wasm_libc_solid_strtoll(arg1, (arg2?.value ?: 0L).toString(), arg3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    if (_solidNapiAvailable) _wasm_libc_solid_strtoull(arg1, (arg2?.value ?: 0L).toString(), arg3).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_alignedAlloc(arg1.toString(), arg2.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_atQuickExit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quickExit(arg1: CInt) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_quickExit(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_setenv(arg1, arg2, arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(arg1: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_unsetenv(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_humanizeNumber((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), arg4, arg5, arg6) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dehumanizeNumber(arg1: String?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_dehumanizeNumber(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_getenvR(arg1, (arg2?.value ?: 0L).toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_heapsort((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_mergesort((arg1?.value ?: 0L).toString(), arg2.toString(), arg3.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_radixsort((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString(), arg4.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_sradixsort((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString(), arg4.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_getprogname().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(arg1: String?) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_setprogname(arg1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qabs(arg1: QuadT): QuadT =
    if (_solidNapiAvailable) _wasm_libc_solid_qabs(arg1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    if (_solidNapiAvailable) _wasm_libc_solid_strtoq(arg1, (arg2?.value ?: 0L).toString(), arg3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    if (_solidNapiAvailable) _wasm_libc_solid_strtouq(arg1, (arg2?.value ?: 0L).toString(), arg3).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    if (_solidNapiAvailable) _wasm_libc_solid_strsuftoll(arg1, arg2, arg3.toString(), arg4.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    if (_solidNapiAvailable) _wasm_libc_solid_strsuftollx(arg1, arg2, arg3.toString(), arg4.toString(), (arg5?.value ?: 0L).toString(), arg6.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_l64aR(arg1.toString(), (arg2?.value ?: 0L).toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_strtolL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    if (_solidNapiAvailable) _wasm_libc_solid_strtoulL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    if (_solidNapiAvailable) _wasm_libc_solid_strtollL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    if (_solidNapiAvailable) _wasm_libc_solid_strtoullL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    if (_solidNapiAvailable) _wasm_libc_solid_strtoqL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    if (_solidNapiAvailable) _wasm_libc_solid_strtouqL(arg1, (arg2?.value ?: 0L).toString(), arg3, arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_mbCurMaxL(arg1.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_mblenL(arg1, arg2.toString(), arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbstowcsL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_mbstowcsL((arg1?.value ?: 0L).toString(), arg2, arg3.toString(), arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_wctombL((arg1?.value ?: 0L).toString(), arg2.toInt(), arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mbtowcL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_mbtowcL((arg1?.value ?: 0L).toString(), arg2, arg3.toString(), arg4.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: LocaleT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_wcstombsL((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString(), arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_memchr((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_memcmp((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_memcpy((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_memmove((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_memset((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strcat((arg1?.value ?: 0L).toString(), arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strchr(arg1, arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_strcmp(arg1, arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_strcoll(arg1, arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strcpy((arg1?.value ?: 0L).toString(), arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_strcspn(arg1, arg2).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(arg1: CInt): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strerror(arg1).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(arg1: String?): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_strlen(arg1).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strncat((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_strncmp(arg1, arg2, arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strncpy((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strpbrk(arg1, arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strrchr(arg1, arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_strspn(arg1, arg2).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strstr(arg1, arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strtok((arg1?.value ?: 0L).toString(), arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strtokR((arg1?.value ?: 0L).toString(), arg2, (arg3?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_strerrorR(arg1, (arg2?.value ?: 0L).toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_strxfrm((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_memccpy((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3, arg4.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(arg1: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strdup(arg1).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_stpcpy((arg1?.value ?: 0L).toString(), arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_stpncpy((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_strnlen(arg1, arg2.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_memmem((arg1?.value ?: 0L).toString(), arg2.toString(), (arg3?.value ?: 0L).toString(), arg4.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strcasestr(arg1, arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_strlcat((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_strlcpy((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strsep((arg1?.value ?: 0L).toString(), arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_stresep((arg1?.value ?: 0L).toString(), arg2, arg3).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strndup(arg1, arg2.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_memrchr((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_explicitMemset((arg1?.value ?: 0L).toString(), arg2, arg3.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_consttimeMemequal((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_strcollL(arg1, arg2, arg3.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_strxfrmL((arg1?.value ?: 0L).toString(), arg2, arg3.toString(), arg4.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_strerrorL(arg1, arg2.toLong().toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_bcmp((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_bcopy((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), arg3.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_bzero((arg1?.value ?: 0L).toString(), arg2.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ffs(arg1: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_ffs(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount(arg1: CUint): CUint =
    if (_solidNapiAvailable) _wasm_libc_solid_popcount(arg1.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcountl(arg1: CUlong): CUint =
    if (_solidNapiAvailable) _wasm_libc_solid_popcountl(arg1.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcountll(arg1: CUlonglong): CUint =
    if (_solidNapiAvailable) _wasm_libc_solid_popcountll(arg1.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount32(arg1: UInt): CUint =
    if (_solidNapiAvailable) _wasm_libc_solid_popcount32(arg1.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popcount64(arg1: ULong): CUint =
    if (_solidNapiAvailable) _wasm_libc_solid_popcount64(arg1.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_rindex(arg1, arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_strcasecmp(arg1, arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_strncasecmp(arg1, arg2, arg3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    if (_solidNapiAvailable) _wasm_libc_solid_signal(arg1, arg2.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(arg1: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_raise(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_asctime((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (_solidNapiAvailable) _wasm_libc_solid_clock().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_ctime((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    if (_solidNapiAvailable) _wasm_libc_solid_difftime(arg1.toString(), arg2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_gmtime((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_localtime((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(arg1: COpaquePointer?): TimeT =
    if (_solidNapiAvailable) _wasm_libc_solid_time((arg1?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(arg1: COpaquePointer?): TimeT =
    if (_solidNapiAvailable) _wasm_libc_solid_mktime((arg1?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    if (_solidNapiAvailable) _wasm_libc_solid_strftime((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, (arg4?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(arg1: String?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_utime(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_asctimeR((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_ctimeR((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_gmtimeR((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_localtimeR((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(arg1: String?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_stat(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(arg1: String?, arg2: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_lstat(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(arg1: CInt, arg2: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fstat(arg1, (arg2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_chmod(arg1, arg2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_mkdir(arg1, arg2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(arg1: String?, arg2: CInt, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_open(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_creat(arg1, arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(arg1: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_close(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_read(arg1, (arg2?.value ?: 0L).toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_write(arg1, (arg2?.value ?: 0L).toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(arg1: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_unlink(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tell(arg1: CInt): CLong =
    if (_solidNapiAvailable) _wasm_libc_solid_tell(arg1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(arg1: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_dup(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_dup2(arg1, arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(arg1: String?, arg2: CInt): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_access(arg1, arg2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(arg1: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_rmdir(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(arg1: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_chdir(arg1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_getwd((arg1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_getcwd((arg1?.value ?: 0L).toString(), arg2.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_getopt(arg1, (arg2?.value ?: 0L).toString(), arg3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_getsubopt((arg1?.value ?: 0L).toString(), (arg2?.value ?: 0L).toString(), (arg3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_fcntl(arg1, arg2, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_solidNapiAvailable) _wasm_libc_solid_getpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(arg1: CUint): CUint =
    if (_solidNapiAvailable) _wasm_libc_solid_sleep(arg1.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(arg1: UsecondsT): CInt =
    if (_solidNapiAvailable) _wasm_libc_solid_usleep(arg1.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_localeconv().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_setlocale(arg1, arg2).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    if (_solidNapiAvailable) _wasm_libc_solid_duplocale(arg1.toLong().toString()).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(arg1: LocaleT) {
    if (_solidNapiAvailable) {
        _wasm_libc_solid_freelocale(arg1.toLong().toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun localeconvL(arg1: LocaleT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_localeconvL(arg1.toLong().toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    if (_solidNapiAvailable) _wasm_libc_solid_newlocale(arg1, arg2, arg3.toLong().toString()).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_nlLanginfo(item.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_nlLanginfoL(item.toString(), locale.toLong().toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_solidNapiAvailable) _wasm_libc_solid_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    if (_solidNapiAvailable) _wasm_libc_solid_lseek(arg1, arg2.toString(), arg3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
