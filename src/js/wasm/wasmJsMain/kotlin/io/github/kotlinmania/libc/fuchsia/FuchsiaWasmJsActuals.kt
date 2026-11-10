@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initFuchsiaNapiAddon(): Boolean

private val _fuchsiaNapiAvailable: Boolean = _initFuchsiaNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isalnum(p0)")
private external fun _wasm_libc_fuchsia_isalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isalpha(p0)")
private external fun _wasm_libc_fuchsia_isalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_iscntrl(p0)")
private external fun _wasm_libc_fuchsia_iscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isdigit(p0)")
private external fun _wasm_libc_fuchsia_isdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isgraph(p0)")
private external fun _wasm_libc_fuchsia_isgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_islower(p0)")
private external fun _wasm_libc_fuchsia_islower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isprint(p0)")
private external fun _wasm_libc_fuchsia_isprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_ispunct(p0)")
private external fun _wasm_libc_fuchsia_ispunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isspace(p0)")
private external fun _wasm_libc_fuchsia_isspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isupper(p0)")
private external fun _wasm_libc_fuchsia_isupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isxdigit(p0)")
private external fun _wasm_libc_fuchsia_isxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isblank(p0)")
private external fun _wasm_libc_fuchsia_isblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_tolower(p0)")
private external fun _wasm_libc_fuchsia_tolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_toupper(p0)")
private external fun _wasm_libc_fuchsia_toupper(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fopen(p0, p1)")
private external fun _wasm_libc_fuchsia_fopen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_freopen(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_freopen(p0: String?, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_fflush(p0)")
private external fun _wasm_libc_fuchsia_fflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_fclose(p0)")
private external fun _wasm_libc_fuchsia_fclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_remove(p0)")
private external fun _wasm_libc_fuchsia_remove(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_rename(p0, p1)")
private external fun _wasm_libc_fuchsia_rename(p0: String?, p1: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_tmpfile()")
private external fun _wasm_libc_fuchsia_tmpfile(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_setvbuf(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_setvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_setbuf(p0, p1)")
private external fun _wasm_libc_fuchsia_setbuf(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getchar()")
private external fun _wasm_libc_fuchsia_getchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_putchar(p0)")
private external fun _wasm_libc_fuchsia_putchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_fgetc(p0)")
private external fun _wasm_libc_fuchsia_fgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_fgets(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_fgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fputc(p0, p1)")
private external fun _wasm_libc_fuchsia_fputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fputs(p0, p1)")
private external fun _wasm_libc_fuchsia_fputs(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_puts(p0)")
private external fun _wasm_libc_fuchsia_puts(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_ungetc(p0, p1)")
private external fun _wasm_libc_fuchsia_ungetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_fread(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_fread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_fwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_fwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_fseek(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_fseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_ftell(p0)")
private external fun _wasm_libc_fuchsia_ftell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_rewind(p0)")
private external fun _wasm_libc_fuchsia_rewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fgetpos(p0, p1)")
private external fun _wasm_libc_fuchsia_fgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fsetpos(p0, p1)")
private external fun _wasm_libc_fuchsia_fsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_feof(p0)")
private external fun _wasm_libc_fuchsia_feof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_ferror(p0)")
private external fun _wasm_libc_fuchsia_ferror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_perror(p0)")
private external fun _wasm_libc_fuchsia_perror(p0: String?)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_atof(p0)")
private external fun _wasm_libc_fuchsia_atof(p0: String?): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_atoi(p0)")
private external fun _wasm_libc_fuchsia_atoi(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_atol(p0)")
private external fun _wasm_libc_fuchsia_atol(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_atoll(p0)")
private external fun _wasm_libc_fuchsia_atoll(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strtod(p0, p1)")
private external fun _wasm_libc_fuchsia_strtod(p0: String?, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strtof(p0, p1)")
private external fun _wasm_libc_fuchsia_strtof(p0: String?, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_strtol(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_strtol(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_strtoll(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_strtoll(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_strtoul(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_strtoul(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_strtoull(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_strtoull(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_calloc(p0, p1)")
private external fun _wasm_libc_fuchsia_calloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_malloc(p0)")
private external fun _wasm_libc_fuchsia_malloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_realloc(p0, p1)")
private external fun _wasm_libc_fuchsia_realloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_free(p0)")
private external fun _wasm_libc_fuchsia_free(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_abort()")
private external fun _wasm_libc_fuchsia_abort()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_exit(p0)")
private external fun _wasm_libc_fuchsia_exit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_atexit(p0)")
private external fun _wasm_libc_fuchsia_atexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_system(p0)")
private external fun _wasm_libc_fuchsia_system(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getenv(p0)")
private external fun _wasm_libc_fuchsia_getenv(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strcpy(p0, p1)")
private external fun _wasm_libc_fuchsia_strcpy(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_strncpy(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_strncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strcat(p0, p1)")
private external fun _wasm_libc_fuchsia_strcat(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_strncat(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_strncat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strcmp(p0, p1)")
private external fun _wasm_libc_fuchsia_strcmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_strncmp(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_strncmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strcoll(p0, p1)")
private external fun _wasm_libc_fuchsia_strcoll(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strchr(p0, p1)")
private external fun _wasm_libc_fuchsia_strchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strrchr(p0, p1)")
private external fun _wasm_libc_fuchsia_strrchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strspn(p0, p1)")
private external fun _wasm_libc_fuchsia_strspn(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strcspn(p0, p1)")
private external fun _wasm_libc_fuchsia_strcspn(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_strdup(p0)")
private external fun _wasm_libc_fuchsia_strdup(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strpbrk(p0, p1)")
private external fun _wasm_libc_fuchsia_strpbrk(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strstr(p0, p1)")
private external fun _wasm_libc_fuchsia_strstr(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_strlen(p0)")
private external fun _wasm_libc_fuchsia_strlen(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strnlen(p0, p1)")
private external fun _wasm_libc_fuchsia_strnlen(p0: String?, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_strerror(p0)")
private external fun _wasm_libc_fuchsia_strerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_strtok(p0, p1)")
private external fun _wasm_libc_fuchsia_strtok(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_strxfrm(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_strxfrm(p0: String, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_wcslen(p0)")
private external fun _wasm_libc_fuchsia_wcslen(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_wcstombs(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_wcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_memchr(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_memchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_wmemchr(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_wmemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_memcmp(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_memcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_memcpy(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_memcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_memmove(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_memmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_memset(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_memset(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_abs(p0)")
private external fun _wasm_libc_fuchsia_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_labs(p0)")
private external fun _wasm_libc_fuchsia_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_rand()")
private external fun _wasm_libc_fuchsia_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_srand(p0)")
private external fun _wasm_libc_fuchsia_srand(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getpwnam(p0)")
private external fun _wasm_libc_fuchsia_getpwnam(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getpwuid(p0)")
private external fun _wasm_libc_fuchsia_getpwuid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_fprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_fprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_fuchsia_printf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_fuchsia_printf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_fuchsia_snprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_fuchsia_snprintf(p0: String, p1: String, p2: String?, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_sprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_sprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_fscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_fscanf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_fuchsia_scanf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_fuchsia_scanf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_sscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_sscanf(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getcharUnlocked()")
private external fun _wasm_libc_fuchsia_getcharUnlocked(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_putcharUnlocked(p0)")
private external fun _wasm_libc_fuchsia_putcharUnlocked(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_socket(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_socket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_connect(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_connect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_listen(p0, p1)")
private external fun _wasm_libc_fuchsia_listen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_accept(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_accept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_getpeername(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_getpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_getsockname(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_getsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_setsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_setsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_socketpair(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_socketpair(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_fuchsia_sendto(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_fuchsia_sendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_shutdown(p0, p1)")
private external fun _wasm_libc_fuchsia_shutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_chmod(p0, p1)")
private external fun _wasm_libc_fuchsia_chmod(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fchmod(p0, p1)")
private external fun _wasm_libc_fuchsia_fchmod(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fstat(p0, p1)")
private external fun _wasm_libc_fuchsia_fstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_mkdir(p0, p1)")
private external fun _wasm_libc_fuchsia_mkdir(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_stat(p0, p1)")
private external fun _wasm_libc_fuchsia_stat(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pclose(p0)")
private external fun _wasm_libc_fuchsia_pclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fdopen(p0, p1)")
private external fun _wasm_libc_fuchsia_fdopen(p0: Int, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_fileno(p0)")
private external fun _wasm_libc_fuchsia_fileno(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_open(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_open(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_creat(p0, p1)")
private external fun _wasm_libc_fuchsia_creat(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_fcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_fcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_opendir(p0)")
private external fun _wasm_libc_fuchsia_opendir(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_readdir(p0)")
private external fun _wasm_libc_fuchsia_readdir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_readdirR(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_readdirR(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_closedir(p0)")
private external fun _wasm_libc_fuchsia_closedir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_rewinddir(p0)")
private external fun _wasm_libc_fuchsia_rewinddir(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_fuchsia_openat(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_fuchsia_openat(p0: Int, p1: String?, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_fchmodat(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_fchmodat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_fchown(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_fchown(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_fchownat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_fchownat(p0: Int, p1: String?, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_fstatat(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_fstatat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_linkat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_linkat(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_mkdirat(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_mkdirat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_readlinkat(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_readlinkat(p0: Int, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_renameat(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_renameat(p0: Int, p1: String?, p2: Int, p3: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_symlinkat(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_symlinkat(p0: String?, p1: Int, p2: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_unlinkat(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_unlinkat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_access(p0, p1)")
private external fun _wasm_libc_fuchsia_access(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_alarm(p0)")
private external fun _wasm_libc_fuchsia_alarm(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_chdir(p0)")
private external fun _wasm_libc_fuchsia_chdir(p0: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_chown(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_chown(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_lchown(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_lchown(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_close(p0)")
private external fun _wasm_libc_fuchsia_close(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_dup(p0)")
private external fun _wasm_libc_fuchsia_dup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_dup2(p0, p1)")
private external fun _wasm_libc_fuchsia_dup2(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_execl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_execl(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_execle(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_execle(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_execlp(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_execlp(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_execv(p0, p1)")
private external fun _wasm_libc_fuchsia_execv(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_execve(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_execve(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_execvp(p0, p1)")
private external fun _wasm_libc_fuchsia_execvp(p0: String?, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_fork()")
private external fun _wasm_libc_fuchsia_fork(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fpathconf(p0, p1)")
private external fun _wasm_libc_fuchsia_fpathconf(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_getcwd(p0, p1)")
private external fun _wasm_libc_fuchsia_getcwd(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getegid()")
private external fun _wasm_libc_fuchsia_getegid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_geteuid()")
private external fun _wasm_libc_fuchsia_geteuid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getgid()")
private external fun _wasm_libc_fuchsia_getgid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_getgroups(p0, p1)")
private external fun _wasm_libc_fuchsia_getgroups(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getlogin()")
private external fun _wasm_libc_fuchsia_getlogin(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_getopt(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_getopt(p0: Int, p1: String, p2: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getpgid(p0)")
private external fun _wasm_libc_fuchsia_getpgid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getpgrp()")
private external fun _wasm_libc_fuchsia_getpgrp(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getpid()")
private external fun _wasm_libc_fuchsia_getpid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getppid()")
private external fun _wasm_libc_fuchsia_getppid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getuid()")
private external fun _wasm_libc_fuchsia_getuid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_isatty(p0)")
private external fun _wasm_libc_fuchsia_isatty(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_link(p0, p1)")
private external fun _wasm_libc_fuchsia_link(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_lseek(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_lseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pathconf(p0, p1)")
private external fun _wasm_libc_fuchsia_pathconf(p0: String?, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_pause()")
private external fun _wasm_libc_fuchsia_pause(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pipe(p0)")
private external fun _wasm_libc_fuchsia_pipe(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_posixMemalign(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_posixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_read(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_read(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_rmdir(p0)")
private external fun _wasm_libc_fuchsia_rmdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_seteuid(p0)")
private external fun _wasm_libc_fuchsia_seteuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_setegid(p0)")
private external fun _wasm_libc_fuchsia_setegid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_setgid(p0)")
private external fun _wasm_libc_fuchsia_setgid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_setpgid(p0, p1)")
private external fun _wasm_libc_fuchsia_setpgid(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_setsid()")
private external fun _wasm_libc_fuchsia_setsid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_setuid(p0)")
private external fun _wasm_libc_fuchsia_setuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_sleep(p0)")
private external fun _wasm_libc_fuchsia_sleep(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_nanosleep(p0, p1)")
private external fun _wasm_libc_fuchsia_nanosleep(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_tcgetpgrp(p0)")
private external fun _wasm_libc_fuchsia_tcgetpgrp(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_tcsetpgrp(p0, p1)")
private external fun _wasm_libc_fuchsia_tcsetpgrp(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_ttyname(p0)")
private external fun _wasm_libc_fuchsia_ttyname(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_unlink(p0)")
private external fun _wasm_libc_fuchsia_unlink(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_wait(p0)")
private external fun _wasm_libc_fuchsia_wait(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_waitpid(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_waitpid(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_write(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_write(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_pread(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_pread(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_pwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_pwrite(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_umask(p0)")
private external fun _wasm_libc_fuchsia_umask(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_utime(p0, p1)")
private external fun _wasm_libc_fuchsia_utime(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_kill(p0, p1)")
private external fun _wasm_libc_fuchsia_kill(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_mlock(p0, p1)")
private external fun _wasm_libc_fuchsia_mlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_munlock(p0, p1)")
private external fun _wasm_libc_fuchsia_munlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_mlockall(p0)")
private external fun _wasm_libc_fuchsia_mlockall(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_munlockall()")
private external fun _wasm_libc_fuchsia_munlockall(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_fuchsia_mmap(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_fuchsia_mmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_munmap(p0, p1)")
private external fun _wasm_libc_fuchsia_munmap(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_ifNametoindex(p0)")
private external fun _wasm_libc_fuchsia_ifNametoindex(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_ifIndextoname(p0, p1)")
private external fun _wasm_libc_fuchsia_ifIndextoname(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_lstat(p0, p1)")
private external fun _wasm_libc_fuchsia_lstat(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_fsync(p0)")
private external fun _wasm_libc_fuchsia_fsync(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_setenv(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_setenv(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_unsetenv(p0)")
private external fun _wasm_libc_fuchsia_unsetenv(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_symlink(p0, p1)")
private external fun _wasm_libc_fuchsia_symlink(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_ftruncate(p0, p1)")
private external fun _wasm_libc_fuchsia_ftruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_signal(p0, p1)")
private external fun _wasm_libc_fuchsia_signal(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_realpath(p0, p1)")
private external fun _wasm_libc_fuchsia_realpath(p0: String?, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_flock(p0, p1)")
private external fun _wasm_libc_fuchsia_flock(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_gettimeofday(p0, p1)")
private external fun _wasm_libc_fuchsia_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_times(p0)")
private external fun _wasm_libc_fuchsia_times(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_pthreadSelf()")
private external fun _wasm_libc_fuchsia_pthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadJoin(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadExit(p0)")
private external fun _wasm_libc_fuchsia_pthreadExit(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadAttrInit(p0)")
private external fun _wasm_libc_fuchsia_pthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadAttrDestroy(p0)")
private external fun _wasm_libc_fuchsia_pthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadAttrGetstacksize(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadAttrSetstacksize(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadAttrSetdetachstate(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadDetach(p0)")
private external fun _wasm_libc_fuchsia_pthreadDetach(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_schedYield()")
private external fun _wasm_libc_fuchsia_schedYield(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadKeyCreate(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadKeyDelete(p0)")
private external fun _wasm_libc_fuchsia_pthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadGetspecific(p0)")
private external fun _wasm_libc_fuchsia_pthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadSetspecific(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadMutexInit(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadMutexDestroy(p0)")
private external fun _wasm_libc_fuchsia_pthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadMutexLock(p0)")
private external fun _wasm_libc_fuchsia_pthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadMutexTrylock(p0)")
private external fun _wasm_libc_fuchsia_pthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadMutexUnlock(p0)")
private external fun _wasm_libc_fuchsia_pthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadMutexattrInit(p0)")
private external fun _wasm_libc_fuchsia_pthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadMutexattrDestroy(p0)")
private external fun _wasm_libc_fuchsia_pthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadMutexattrSettype(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondInit(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondWait(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondTimedwait(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_pthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondSignal(p0)")
private external fun _wasm_libc_fuchsia_pthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondBroadcast(p0)")
private external fun _wasm_libc_fuchsia_pthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondDestroy(p0)")
private external fun _wasm_libc_fuchsia_pthreadCondDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondattrInit(p0)")
private external fun _wasm_libc_fuchsia_pthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondattrDestroy(p0)")
private external fun _wasm_libc_fuchsia_pthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadRwlockInit(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadRwlockInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadRwlockDestroy(p0)")
private external fun _wasm_libc_fuchsia_pthreadRwlockDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadRwlockRdlock(p0)")
private external fun _wasm_libc_fuchsia_pthreadRwlockRdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadRwlockTryrdlock(p0)")
private external fun _wasm_libc_fuchsia_pthreadRwlockTryrdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadRwlockWrlock(p0)")
private external fun _wasm_libc_fuchsia_pthreadRwlockWrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadRwlockTrywrlock(p0)")
private external fun _wasm_libc_fuchsia_pthreadRwlockTrywrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadRwlockUnlock(p0)")
private external fun _wasm_libc_fuchsia_pthreadRwlockUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadRwlockattrInit(p0)")
private external fun _wasm_libc_fuchsia_pthreadRwlockattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadRwlockattrDestroy(p0)")
private external fun _wasm_libc_fuchsia_pthreadRwlockattrDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadSetnameNp(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadSetnameNp(p0: String, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_getsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_getsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_raise(p0)")
private external fun _wasm_libc_fuchsia_raise(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_sigaction(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_sigaction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_utimes(p0, p1)")
private external fun _wasm_libc_fuchsia_utimes(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_dlopen(p0, p1)")
private external fun _wasm_libc_fuchsia_dlopen(p0: String?, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_dlerror()")
private external fun _wasm_libc_fuchsia_dlerror(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_dlsym(p0, p1)")
private external fun _wasm_libc_fuchsia_dlsym(p0: String, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_dlclose(p0)")
private external fun _wasm_libc_fuchsia_dlclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_dladdr(p0, p1)")
private external fun _wasm_libc_fuchsia_dladdr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_getaddrinfo(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_getaddrinfo(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_freeaddrinfo(p0)")
private external fun _wasm_libc_fuchsia_freeaddrinfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_gaiStrerror(p0)")
private external fun _wasm_libc_fuchsia_gaiStrerror(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_resInit()")
private external fun _wasm_libc_fuchsia_resInit(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_gmtimeR(p0, p1)")
private external fun _wasm_libc_fuchsia_gmtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_localtimeR(p0, p1)")
private external fun _wasm_libc_fuchsia_localtimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_mktime(p0)")
private external fun _wasm_libc_fuchsia_mktime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_time(p0)")
private external fun _wasm_libc_fuchsia_time(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_gmtime(p0)")
private external fun _wasm_libc_fuchsia_gmtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_localtime(p0)")
private external fun _wasm_libc_fuchsia_localtime(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_mknod(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_mknod(p0: String?, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_uname(p0)")
private external fun _wasm_libc_fuchsia_uname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_gethostname(p0, p1)")
private external fun _wasm_libc_fuchsia_gethostname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_getservbyname(p0, p1)")
private external fun _wasm_libc_fuchsia_getservbyname(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getprotobyname(p0)")
private external fun _wasm_libc_fuchsia_getprotobyname(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getprotobynumber(p0)")
private external fun _wasm_libc_fuchsia_getprotobynumber(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_usleep(p0)")
private external fun _wasm_libc_fuchsia_usleep(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_send(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_send(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_recv(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_recv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_putenv(p0)")
private external fun _wasm_libc_fuchsia_putenv(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_poll(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_poll(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_select(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_select(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_setlocale(p0, p1)")
private external fun _wasm_libc_fuchsia_setlocale(p0: Int, p1: String?): String

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_localeconv()")
private external fun _wasm_libc_fuchsia_localeconv(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_semDestroy(p0)")
private external fun _wasm_libc_fuchsia_semDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_semWait(p0)")
private external fun _wasm_libc_fuchsia_semWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_semTrywait(p0)")
private external fun _wasm_libc_fuchsia_semTrywait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_semPost(p0)")
private external fun _wasm_libc_fuchsia_semPost(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_semInit(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_statvfs(p0, p1)")
private external fun _wasm_libc_fuchsia_statvfs(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fstatvfs(p0, p1)")
private external fun _wasm_libc_fuchsia_fstatvfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_readlink(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_readlink(p0: String?, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_sigemptyset(p0)")
private external fun _wasm_libc_fuchsia_sigemptyset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_sigaddset(p0, p1)")
private external fun _wasm_libc_fuchsia_sigaddset(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_sigfillset(p0)")
private external fun _wasm_libc_fuchsia_sigfillset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_sigdelset(p0, p1)")
private external fun _wasm_libc_fuchsia_sigdelset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_sigismember(p0, p1)")
private external fun _wasm_libc_fuchsia_sigismember(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_sigprocmask(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_sigprocmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_sigpending(p0)")
private external fun _wasm_libc_fuchsia_sigpending(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_timegm(p0)")
private external fun _wasm_libc_fuchsia_timegm(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getsid(p0)")
private external fun _wasm_libc_fuchsia_getsid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_sysconf(p0)")
private external fun _wasm_libc_fuchsia_sysconf(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_mkfifo(p0, p1)")
private external fun _wasm_libc_fuchsia_mkfifo(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_fuchsia_pselect(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_fuchsia_pselect(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_fseeko(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_fseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_ftello(p0)")
private external fun _wasm_libc_fuchsia_ftello(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_tcdrain(p0)")
private external fun _wasm_libc_fuchsia_tcdrain(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_cfgetispeed(p0)")
private external fun _wasm_libc_fuchsia_cfgetispeed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_cfgetospeed(p0)")
private external fun _wasm_libc_fuchsia_cfgetospeed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_cfmakeraw(p0)")
private external fun _wasm_libc_fuchsia_cfmakeraw(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_cfsetispeed(p0, p1)")
private external fun _wasm_libc_fuchsia_cfsetispeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_cfsetospeed(p0, p1)")
private external fun _wasm_libc_fuchsia_cfsetospeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_cfsetspeed(p0, p1)")
private external fun _wasm_libc_fuchsia_cfsetspeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_tcgetattr(p0, p1)")
private external fun _wasm_libc_fuchsia_tcgetattr(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_tcsetattr(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_tcsetattr(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_tcflow(p0, p1)")
private external fun _wasm_libc_fuchsia_tcflow(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_tcflush(p0, p1)")
private external fun _wasm_libc_fuchsia_tcflush(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_tcgetsid(p0)")
private external fun _wasm_libc_fuchsia_tcgetsid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_tcsendbreak(p0, p1)")
private external fun _wasm_libc_fuchsia_tcsendbreak(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_mkstemp(p0)")
private external fun _wasm_libc_fuchsia_mkstemp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_mkdtemp(p0)")
private external fun _wasm_libc_fuchsia_mkdtemp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_tmpnam(p0)")
private external fun _wasm_libc_fuchsia_tmpnam(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_openlog(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_openlog(p0: String?, p1: Int, p2: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_closelog()")
private external fun _wasm_libc_fuchsia_closelog()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_setlogmask(p0)")
private external fun _wasm_libc_fuchsia_setlogmask(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_syslog(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_syslog(p0: Int, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_grantpt(p0)")
private external fun _wasm_libc_fuchsia_grantpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_posixOpenpt(p0)")
private external fun _wasm_libc_fuchsia_posixOpenpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_ptsname(p0)")
private external fun _wasm_libc_fuchsia_ptsname(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_unlockpt(p0)")
private external fun _wasm_libc_fuchsia_unlockpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_fdatasync(p0)")
private external fun _wasm_libc_fuchsia_fdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_clockGetres(p0, p1)")
private external fun _wasm_libc_fuchsia_clockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_clockGettime(p0, p1)")
private external fun _wasm_libc_fuchsia_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_clockSettime(p0, p1)")
private external fun _wasm_libc_fuchsia_clockSettime(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_dirfd(p0)")
private external fun _wasm_libc_fuchsia_dirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadGetattrNp(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_memalign(p0, p1)")
private external fun _wasm_libc_fuchsia_memalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_setgroups(p0, p1)")
private external fun _wasm_libc_fuchsia_setgroups(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pipe2(p0, p1)")
private external fun _wasm_libc_fuchsia_pipe2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_statfs(p0, p1)")
private external fun _wasm_libc_fuchsia_statfs(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_fstatfs(p0, p1)")
private external fun _wasm_libc_fuchsia_fstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_memrchr(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_memrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_posixFadvise(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_posixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_futimens(p0, p1)")
private external fun _wasm_libc_fuchsia_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_duplocale(p0)")
private external fun _wasm_libc_fuchsia_duplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_freelocale(p0)")
private external fun _wasm_libc_fuchsia_freelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_newlocale(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_newlocale(p0: Int, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_uselocale(p0)")
private external fun _wasm_libc_fuchsia_uselocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_fdopendir(p0)")
private external fun _wasm_libc_fuchsia_fdopendir(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_mknodat(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_mknodat(p0: Int, p1: String?, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_ptsnameR(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_ptsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_clearenv()")
private external fun _wasm_libc_fuchsia_clearenv(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_waitid(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_waitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_setreuid(p0, p1)")
private external fun _wasm_libc_fuchsia_setreuid(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_setregid(p0, p1)")
private external fun _wasm_libc_fuchsia_setregid(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_getresuid(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_getresuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_getresgid(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_getresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_acct(p0)")
private external fun _wasm_libc_fuchsia_acct(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_brk(p0)")
private external fun _wasm_libc_fuchsia_brk(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_setresgid(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_setresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_setresuid(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_setresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_execvpe(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_execvpe(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_fexecve(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_fexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_ioctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_lutimes(p0, p1)")
private external fun _wasm_libc_fuchsia_lutimes(p0: String?, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_setpwent()")
private external fun _wasm_libc_fuchsia_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_endpwent()")
private external fun _wasm_libc_fuchsia_endpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getpwent()")
private external fun _wasm_libc_fuchsia_getpwent(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_shmget(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_shmget(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_shmat(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_shmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_shmdt(p0)")
private external fun _wasm_libc_fuchsia_shmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_shmctl(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_shmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_ftok(p0, p1)")
private external fun _wasm_libc_fuchsia_ftok(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_semget(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_semget(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_semop(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_semop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_fuchsia_semctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_fuchsia_semctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_msgctl(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_msgctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_msgget(p0, p1)")
private external fun _wasm_libc_fuchsia_msgget(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_msgrcv(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_msgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_msgsnd(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_msgsnd(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_mprotect(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_errnoLocation()")
private external fun _wasm_libc_fuchsia_errnoLocation(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_fallocate(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_fallocate(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_readahead(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_readahead(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_signalfd(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_signalfd(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_timerfdCreate(p0, p1)")
private external fun _wasm_libc_fuchsia_timerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_timerfdGettime(p0, p1)")
private external fun _wasm_libc_fuchsia_timerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_timerfdSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_timerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_quotactl(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_quotactl(p0: Int, p1: String?, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_dup3(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_dup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_mkostemp(p0, p1)")
private external fun _wasm_libc_fuchsia_mkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_mkostemps(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_mkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_sigwaitinfo(p0, p1)")
private external fun _wasm_libc_fuchsia_sigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_nlLanginfoL(p0, p1)")
private external fun _wasm_libc_fuchsia_nlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_reboot(p0)")
private external fun _wasm_libc_fuchsia_reboot(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_setfsgid(p0)")
private external fun _wasm_libc_fuchsia_setfsgid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_setfsuid(p0)")
private external fun _wasm_libc_fuchsia_setfsuid(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_ifNameindex()")
private external fun _wasm_libc_fuchsia_ifNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_ifFreenameindex(p0)")
private external fun _wasm_libc_fuchsia_ifFreenameindex(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_syncFileRange(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_syncFileRange(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getifaddrs(p0)")
private external fun _wasm_libc_fuchsia_getifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_freeifaddrs(p0)")
private external fun _wasm_libc_fuchsia_freeifaddrs(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_glob(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_glob(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_globfree(p0)")
private external fun _wasm_libc_fuchsia_globfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_posixMadvise(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_posixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_shmUnlink(p0)")
private external fun _wasm_libc_fuchsia_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_seekdir(p0, p1)")
private external fun _wasm_libc_fuchsia_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_telldir(p0)")
private external fun _wasm_libc_fuchsia_telldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_madvise(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_msync(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_fuchsia_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_fuchsia_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_mkstemps(p0, p1)")
private external fun _wasm_libc_fuchsia_mkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_futimes(p0, p1)")
private external fun _wasm_libc_fuchsia_futimes(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_nlLanginfo(p0)")
private external fun _wasm_libc_fuchsia_nlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_bind(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_writev(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_readv(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_getdomainname(p0, p1)")
private external fun _wasm_libc_fuchsia_getdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_setdomainname(p0, p1)")
private external fun _wasm_libc_fuchsia_setdomainname(p0: String?, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_vhangup()")
private external fun _wasm_libc_fuchsia_vhangup(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_sendmmsg(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_sendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_recvmmsg(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_recvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_sync()")
private external fun _wasm_libc_fuchsia_sync()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_fuchsia_syscall(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_fuchsia_syscall(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_schedGetaffinity(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_schedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_schedSetaffinity(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_schedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_umount(p0)")
private external fun _wasm_libc_fuchsia_umount(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_schedGetPriorityMax(p0)")
private external fun _wasm_libc_fuchsia_schedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_tee(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_tee(p0: Int, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_settimeofday(p0, p1)")
private external fun _wasm_libc_fuchsia_settimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_fuchsia_splice(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_fuchsia_splice(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_eventfd(p0, p1)")
private external fun _wasm_libc_fuchsia_eventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_schedRrGetInterval(p0, p1)")
private external fun _wasm_libc_fuchsia_schedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_semTimedwait(p0, p1)")
private external fun _wasm_libc_fuchsia_semTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_semGetvalue(p0, p1)")
private external fun _wasm_libc_fuchsia_semGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_schedSetparam(p0, p1)")
private external fun _wasm_libc_fuchsia_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_swapoff(p0)")
private external fun _wasm_libc_fuchsia_swapoff(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_vmsplice(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_vmsplice(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_mount(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_mount(p0: String?, p1: String?, p2: String?, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_personality(p0)")
private external fun _wasm_libc_fuchsia_personality(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_schedGetparam(p0, p1)")
private external fun _wasm_libc_fuchsia_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_ppoll(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_ppoll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libc_fuchsia_clone(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_libc_fuchsia_clone(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_schedGetscheduler(p0)")
private external fun _wasm_libc_fuchsia_schedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_clockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadAttrGetguardsize(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadAttrSetguardsize(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_sethostname(p0, p1)")
private external fun _wasm_libc_fuchsia_sethostname(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_schedGetPriorityMin(p0)")
private external fun _wasm_libc_fuchsia_schedGetPriorityMin(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_umount2(p0, p1)")
private external fun _wasm_libc_fuchsia_umount2(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_swapon(p0, p1)")
private external fun _wasm_libc_fuchsia_swapon(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_sigsuspend(p0)")
private external fun _wasm_libc_fuchsia_sigsuspend(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_sigaltstack(p0, p1)")
private external fun _wasm_libc_fuchsia_sigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_semClose(p0)")
private external fun _wasm_libc_fuchsia_semClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getdtablesize()")
private external fun _wasm_libc_fuchsia_getdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_initgroups(p0, p1)")
private external fun _wasm_libc_fuchsia_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_fuchsia_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_fuchsia_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getgrnam(p0)")
private external fun _wasm_libc_fuchsia_getgrnam(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCancel(p0)")
private external fun _wasm_libc_fuchsia_pthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_pthreadKill(p0, p1)")
private external fun _wasm_libc_fuchsia_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_semUnlink(p0)")
private external fun _wasm_libc_fuchsia_semUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_daemon(p0, p1)")
private external fun _wasm_libc_fuchsia_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_getpwnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_getpwnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_fuchsia_getpwuidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_fuchsia_getpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_sigwait(p0, p1)")
private external fun _wasm_libc_fuchsia_sigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_fuchsia_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_fuchsia_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_fuchsia_getgrgid(p0)")
private external fun _wasm_libc_fuchsia_getgrgid(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_setgrent()")
private external fun _wasm_libc_fuchsia_setgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_endgrent()")
private external fun _wasm_libc_fuchsia_endgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_fuchsia_getgrent()")
private external fun _wasm_libc_fuchsia_getgrent(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_popen(p0, p1)")
private external fun _wasm_libc_fuchsia_popen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_fuchsia_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_fuchsia_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_fuchsia_dlIteratePhdr(p0, p1)")
private external fun _wasm_libc_fuchsia_dlIteratePhdr(p0: String, p1: String): Int

public actual fun isalnum(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_iscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_islower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ispunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_toupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fopen(filename, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_freopen(filename, mode, (file?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fflush((file?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fclose((file?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_remove(filename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: String?, newname: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_rename(oldname, newname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): FILE? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tmpfile().toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_putchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fgetc((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fputc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fputs(s, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_puts(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ungetc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fread((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: FILE?): CLong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ftell((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: FILE?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_rewind((stream?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fgetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fsetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_feof((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ferror((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: String?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_perror(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: String?): CDouble =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_atof(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_atoi(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: String?): CLong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_atol(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: String?): CLonglong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_atoll(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strtod(s, (endp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strtof(s, (endp?.value ?: 0L).toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strtol(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strtoll(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strtoul(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strtoull(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_calloc(nobj.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_malloc(size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_realloc((p?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: COpaquePointer?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_free((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_atexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_system(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getenv(s).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strcpy((dst?.value ?: 0L).toString(), src).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strncpy((dst?.value ?: 0L).toString(), src, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strcat((s?.value ?: 0L).toString(), ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strncat((s?.value ?: 0L).toString(), ct, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strcmp(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strncmp(cs, ct, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strcoll(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strrchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strcspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strdup(cs).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strpbrk(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strstr(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strlen(cs).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strnlen(cs, maxlen.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strerror(n).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strtok((s?.value ?: 0L).toString(), t).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_wcslen((buf?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_wcstombs((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_memchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_wmemchr((cx?.value ?: 0L).toString(), c.toInt(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_memset((dest?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnam(name: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getpwnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getpwuid(uid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fprintf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_printf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_snprintf((s?.value ?: 0L).toString(), n.toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sprintf((s?.value ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fscanf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_scanf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sscanf(s, format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_putcharUnlocked(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_socket(domain, ty, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_connect(socket, (address?.value ?: 0L).toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_listen(socket, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_accept(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getpeername(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getsockname(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setsockopt(socket, level, name, (value?.value ?: 0L).toString(), optionLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_socketpair(domain, type, protocol, (socketVector?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sendto(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), addrlen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_shutdown(socket, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_chmod(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fchmod(fd, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fstat(fildes, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mkdir(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_stat(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pclose((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fdopen(fd, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: FILE?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fileno((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_open(path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_creat(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: String?): DIR? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_opendir(dirname).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_readdir((dirp?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_readdirR((dirp?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: DIR?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_closedir((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: DIR?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_rewinddir((dirp?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_openat(dirfd, pathname, flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fchmodat(dirfd, pathname, mode.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fchown(fd, owner.toInt(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fchownat(dirfd, pathname, owner.toInt(), group.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fstatat(dirfd, pathname, (buf?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_linkat(olddirfd, oldpath, newdirfd, newpath, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mkdirat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_readlinkat(dirfd, pathname, (buf?.value ?: 0L).toString(), bufsiz.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_renameat(olddirfd, oldpath, newdirfd, newpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_symlinkat(target, newdirfd, linkpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_unlinkat(dirfd, pathname, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: String?, amode: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_access(path, amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_alarm(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_chdir(dir) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_chown(path, uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_lchown(path, uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_close(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dup(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dup2(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_execl(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_execle(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_execlp(file, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_execv(prog, (argv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_execve(prog, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_execvp(c, (argv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fork() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fpathconf(filedes, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getcwd((buf?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getegid().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_geteuid().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getgid().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getgroups(ngroupsMax, (groups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getlogin().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getopt(argc, (argv?.value ?: 0L).toString(), optstr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgid(pid: PidT): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getpgid(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgrp(): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getpgrp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getppid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getuid().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_isatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: String?, dst: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_link(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_lseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: String?, name: CInt): CLong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pathconf(path, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pause() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pipe((fds?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_posixMemalign((memptr?.value ?: 0L).toString(), align.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_read(fd, (buf?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_rmdir(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_seteuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setegid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setpgid(pid, pgid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsid(): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setsid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sleep(secs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_nanosleep((rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetpgrp(fd: CInt): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tcgetpgrp(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tcsetpgrp(fd, pgrp) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ttyname(fd).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_unlink(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: COpaquePointer?): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_wait((status?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_waitpid(pid, (status?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_write(fd, (buf?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pread(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pwrite(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_umask(mask.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_utime(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_kill(pid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mlock((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_munlock((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mlockall(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_munlockall() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_munmap((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(ifname: String?): CUint =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ifNametoindex(ifname).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ifIndextoname(ifindex.toInt(), (ifname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_lstat(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fsync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setenv(name, value, overwrite) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_unsetenv(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: String?, path2: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_symlink(path1, path2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ftruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_signal(signum, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_realpath(pathname, (resolved?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_flock(fd, operation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: COpaquePointer?): ClockT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_times((buf?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadSelf().toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadJoin(native.toLong().toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_pthreadExit((value?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadAttrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadAttrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stackSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadDetach(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadKeyDelete(key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadGetspecific(key.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadSetspecific(key.toInt(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadMutexInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadMutexDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadMutexLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadMutexTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadMutexUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadMutexattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondWait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondSignal((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondBroadcast((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondDestroy((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadRwlockInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadRwlockDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadRwlockRdlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadRwlockTryrdlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadRwlockWrlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadRwlockTrywrlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadRwlockUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadRwlockattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadRwlockattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadSetnameNp(thread.toLong().toString(), name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_raise(signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigaction(signum, (act?.value ?: 0L).toString(), (oldact?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_utimes(filename, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dlopen(filename, flag).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dlerror().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dlsym((handle?.value ?: 0L).toString(), symbol).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dlclose((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dladdr((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getaddrinfo(node, service, (hints?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: COpaquePointer?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_freeaddrinfo((res?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_gaiStrerror(errcode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resInit(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_resInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_gmtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_localtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: COpaquePointer?): TimeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mktime((tm?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: COpaquePointer?): TimeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_time((time?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_gmtime((timeP?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_localtime((timeP?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mknod(pathname, mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_gethostname((name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getservbyname(name, proto).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getprotobyname(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getprotobynumber(proto).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: CUint): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_usleep(secs.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_send(socket, (buf?.value ?: 0L).toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_recv(socket, (buf?.value ?: 0L).toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_putenv((string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_poll((fds?.value ?: 0L).toString(), nfds.toString(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_select(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setlocale(category, locale).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_localeconv().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semWait((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semTrywait((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semPost((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_statvfs(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fstatvfs(fd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_readlink(path, (buf?.value ?: 0L).toString(), bufsz.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigemptyset((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigaddset((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigfillset((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigdelset((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigismember((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigprocmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigpending((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: COpaquePointer?): TimeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_timegm((tm?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsid(pid: PidT): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getsid(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mkfifo(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pselect(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: FILE?): OffT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ftello((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcdrain(fd: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tcdrain(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_cfgetispeed((termios?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_cfgetospeed((termios?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: COpaquePointer?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_cfmakeraw((termios?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_cfsetispeed((termios?.value ?: 0L).toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_cfsetospeed((termios?.value ?: 0L).toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_cfsetspeed((termios?.value ?: 0L).toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tcgetattr(fd, (termios?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tcsetattr(fd, optionalActions, (termios?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tcflow(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tcflush(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetsid(fd: CInt): PidT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tcgetsid(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tcsendbreak(fd, duration) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mkstemp((template?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mkdtemp((template?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tmpnam((ptr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_openlog(ident, logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_closelog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setlogmask(maskpri) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_syslog(priority, message, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun grantpt(fd: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_grantpt(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixOpenpt(flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_posixOpenpt(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsname(fd: CInt): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ptsname(fd).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockpt(fd: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_unlockpt(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_clockGetres(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_clockGettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_clockSettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadGetattrNp(native.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setgroups(ngroups.toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pipe2((fds?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_statfs(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fstatfs(fd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_memrchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_posixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_duplocale((base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_newlocale(mask, locale, (base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_uselocale((loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): DIR? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fdopendir(fd).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mknodat(dirfd, pathname, mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_accept4(fd, (addr?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), flg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_clearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setreuid(ruid.toInt(), euid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setregid(rgid.toInt(), egid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_acct(filename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_brk((addr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setresuid(ruid.toInt(), euid.toInt(), suid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_lutimes(file, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_shmget(key, size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_shmdt((shmaddr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ftok(pathname, projId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semget(key, nsems, semflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_msgctl(msqid, cmd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_msgget(key, msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_msgsnd(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_errnoLocation().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_fallocate(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_readahead(fd, offset.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_signalfd(fd, (mask?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_timerfdCreate(clockid, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_timerfdGettime(fd, (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_quotactl(cmd, special, id, (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dup3(oldfd, newfd, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mkostemp((template?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_nlLanginfoL(item, (locale?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_reboot(howTo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setfsgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setfsuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ifNameindex().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_ifFreenameindex((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_syncFileRange(fd, offset.toString(), nbytes.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getifaddrs((ifap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_freeifaddrs((ifa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mkstemps((template?.value ?: 0L).toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_futimes(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_nlLanginfo(item).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sendmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_recvmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getdomainname((name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_setdomainname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_vhangup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_syscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedGetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_umount(target) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_tee(fdIn, fdOut, len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_splice(fdIn, (offIn?.value ?: 0L).toString(), fdOut, (offOut?.value ?: 0L).toString(), len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_eventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(puath: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_swapoff(puath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_vmsplice(fd, (iov?.value ?: 0L).toString(), nrSegs.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_mount(src, target, fstype, flags.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUlong): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_personality(persona.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_ppoll((fds?.value ?: 0L).toString(), nfds.toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_clone(0L.toString(), (childStack?.value ?: 0L).toString(), flags, (arg?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sethostname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: String?, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_umount2(target, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_swapon(path, swapflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_initgroups(user, group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCancel(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_fuchsiaNapiAvailable) {
        _wasm_libc_fuchsia_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getgrent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_faccessat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_fuchsiaNapiAvailable) _wasm_libc_fuchsia_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
