@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.windows

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

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initWindowsNapiAddon(): Boolean

private val _windowsNapiAvailable: Boolean = _initWindowsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_windows_printf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_windows_printf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_fprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_fprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isalnum(p0)")
private external fun _wasm_libc_windows_isalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isalpha(p0)")
private external fun _wasm_libc_windows_isalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_iscntrl(p0)")
private external fun _wasm_libc_windows_iscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isdigit(p0)")
private external fun _wasm_libc_windows_isdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isgraph(p0)")
private external fun _wasm_libc_windows_isgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_islower(p0)")
private external fun _wasm_libc_windows_islower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isprint(p0)")
private external fun _wasm_libc_windows_isprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_ispunct(p0)")
private external fun _wasm_libc_windows_ispunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isspace(p0)")
private external fun _wasm_libc_windows_isspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isupper(p0)")
private external fun _wasm_libc_windows_isupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isxdigit(p0)")
private external fun _wasm_libc_windows_isxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isblank(p0)")
private external fun _wasm_libc_windows_isblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_tolower(p0)")
private external fun _wasm_libc_windows_tolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_toupper(p0)")
private external fun _wasm_libc_windows_toupper(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_windows_qsort(p0, p1, p2, p3)")
private external fun _wasm_libc_windows_qsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_windows_qsortS(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_windows_qsortS(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_fopen(p0, p1)")
private external fun _wasm_libc_windows_fopen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_freopen(p0, p1, p2)")
private external fun _wasm_libc_windows_freopen(p0: String?, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_fflush(p0)")
private external fun _wasm_libc_windows_fflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_fclose(p0)")
private external fun _wasm_libc_windows_fclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_remove(p0)")
private external fun _wasm_libc_windows_remove(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_rename(p0, p1)")
private external fun _wasm_libc_windows_rename(p0: String?, p1: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_windows_tmpfile()")
private external fun _wasm_libc_windows_tmpfile(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_windows_setvbuf(p0, p1, p2, p3)")
private external fun _wasm_libc_windows_setvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_setbuf(p0, p1)")
private external fun _wasm_libc_windows_setbuf(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libc_windows_getchar()")
private external fun _wasm_libc_windows_getchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_putchar(p0)")
private external fun _wasm_libc_windows_putchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_fgetc(p0)")
private external fun _wasm_libc_windows_fgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_fgets(p0, p1, p2)")
private external fun _wasm_libc_windows_fgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_fputc(p0, p1)")
private external fun _wasm_libc_windows_fputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_fputs(p0, p1)")
private external fun _wasm_libc_windows_fputs(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_puts(p0)")
private external fun _wasm_libc_windows_puts(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_ungetc(p0, p1)")
private external fun _wasm_libc_windows_ungetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_windows_fread(p0, p1, p2, p3)")
private external fun _wasm_libc_windows_fread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_windows_fwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_windows_fwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_fseek(p0, p1, p2)")
private external fun _wasm_libc_windows_fseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_ftell(p0)")
private external fun _wasm_libc_windows_ftell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_rewind(p0)")
private external fun _wasm_libc_windows_rewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_fgetpos(p0, p1)")
private external fun _wasm_libc_windows_fgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_fsetpos(p0, p1)")
private external fun _wasm_libc_windows_fsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_feof(p0)")
private external fun _wasm_libc_windows_feof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_ferror(p0)")
private external fun _wasm_libc_windows_ferror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_perror(p0)")
private external fun _wasm_libc_windows_perror(p0: String?)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_atof(p0)")
private external fun _wasm_libc_windows_atof(p0: String?): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_atoi(p0)")
private external fun _wasm_libc_windows_atoi(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_atol(p0)")
private external fun _wasm_libc_windows_atol(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_atoll(p0)")
private external fun _wasm_libc_windows_atoll(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strtod(p0, p1)")
private external fun _wasm_libc_windows_strtod(p0: String?, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strtof(p0, p1)")
private external fun _wasm_libc_windows_strtof(p0: String?, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_strtol(p0, p1, p2)")
private external fun _wasm_libc_windows_strtol(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_strtoll(p0, p1, p2)")
private external fun _wasm_libc_windows_strtoll(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_strtoul(p0, p1, p2)")
private external fun _wasm_libc_windows_strtoul(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_strtoull(p0, p1, p2)")
private external fun _wasm_libc_windows_strtoull(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_calloc(p0, p1)")
private external fun _wasm_libc_windows_calloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_malloc(p0)")
private external fun _wasm_libc_windows_malloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_msize(p0)")
private external fun _wasm_libc_windows_msize(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_realloc(p0, p1)")
private external fun _wasm_libc_windows_realloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_free(p0)")
private external fun _wasm_libc_windows_free(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_windows_abort()")
private external fun _wasm_libc_windows_abort()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_exit(p0)")
private external fun _wasm_libc_windows_exit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_atexit(p0)")
private external fun _wasm_libc_windows_atexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_system(p0)")
private external fun _wasm_libc_windows_system(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_getenv(p0)")
private external fun _wasm_libc_windows_getenv(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strcpy(p0, p1)")
private external fun _wasm_libc_windows_strcpy(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_strncpy(p0, p1, p2)")
private external fun _wasm_libc_windows_strncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strcat(p0, p1)")
private external fun _wasm_libc_windows_strcat(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_strncat(p0, p1, p2)")
private external fun _wasm_libc_windows_strncat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strcmp(p0, p1)")
private external fun _wasm_libc_windows_strcmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_strncmp(p0, p1, p2)")
private external fun _wasm_libc_windows_strncmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strcoll(p0, p1)")
private external fun _wasm_libc_windows_strcoll(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strchr(p0, p1)")
private external fun _wasm_libc_windows_strchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strrchr(p0, p1)")
private external fun _wasm_libc_windows_strrchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strspn(p0, p1)")
private external fun _wasm_libc_windows_strspn(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strcspn(p0, p1)")
private external fun _wasm_libc_windows_strcspn(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_strdup(p0)")
private external fun _wasm_libc_windows_strdup(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strpbrk(p0, p1)")
private external fun _wasm_libc_windows_strpbrk(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strstr(p0, p1)")
private external fun _wasm_libc_windows_strstr(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_strlen(p0)")
private external fun _wasm_libc_windows_strlen(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strnlen(p0, p1)")
private external fun _wasm_libc_windows_strnlen(p0: String?, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_strerror(p0)")
private external fun _wasm_libc_windows_strerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_strtok(p0, p1)")
private external fun _wasm_libc_windows_strtok(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_strxfrm(p0, p1, p2)")
private external fun _wasm_libc_windows_strxfrm(p0: String, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_wcslen(p0)")
private external fun _wasm_libc_windows_wcslen(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_wcsnlen(p0, p1)")
private external fun _wasm_libc_windows_wcsnlen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_wcstombs(p0, p1, p2)")
private external fun _wasm_libc_windows_wcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_memchr(p0, p1, p2)")
private external fun _wasm_libc_windows_memchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_memcmp(p0, p1, p2)")
private external fun _wasm_libc_windows_memcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_memcpy(p0, p1, p2)")
private external fun _wasm_libc_windows_memcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_memmove(p0, p1, p2)")
private external fun _wasm_libc_windows_memmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_memset(p0, p1, p2)")
private external fun _wasm_libc_windows_memset(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_abs(p0)")
private external fun _wasm_libc_windows_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_labs(p0)")
private external fun _wasm_libc_windows_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_windows_rand()")
private external fun _wasm_libc_windows_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_srand(p0)")
private external fun _wasm_libc_windows_srand(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_signal(p0, p1)")
private external fun _wasm_libc_windows_signal(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_raise(p0)")
private external fun _wasm_libc_windows_raise(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_windows_clock()")
private external fun _wasm_libc_windows_clock(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_ctime(p0)")
private external fun _wasm_libc_windows_ctime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_difftime(p0, p1)")
private external fun _wasm_libc_windows_difftime(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_gmtimeS(p0, p1)")
private external fun _wasm_libc_windows_gmtimeS(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_getDaylight(p0)")
private external fun _wasm_libc_windows_getDaylight(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_getDstbias(p0)")
private external fun _wasm_libc_windows_getDstbias(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_getTimezone(p0)")
private external fun _wasm_libc_windows_getTimezone(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_windows_getTzname(p0, p1, p2, p3)")
private external fun _wasm_libc_windows_getTzname(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_localtimeS(p0, p1)")
private external fun _wasm_libc_windows_localtimeS(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_time(p0)")
private external fun _wasm_libc_windows_time(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_windows_tzset()")
private external fun _wasm_libc_windows_tzset()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_chmod(p0, p1)")
private external fun _wasm_libc_windows_chmod(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_wchmod(p0, p1)")
private external fun _wasm_libc_windows_wchmod(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_mkdir(p0)")
private external fun _wasm_libc_windows_mkdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_wrmdir(p0)")
private external fun _wasm_libc_windows_wrmdir(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_fstat(p0, p1)")
private external fun _wasm_libc_windows_fstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_stat(p0, p1)")
private external fun _wasm_libc_windows_stat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_wstat(p0, p1)")
private external fun _wasm_libc_windows_wstat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_wutime(p0, p1)")
private external fun _wasm_libc_windows_wutime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_popen(p0, p1)")
private external fun _wasm_libc_windows_popen(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_pclose(p0)")
private external fun _wasm_libc_windows_pclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_fdopen(p0, p1)")
private external fun _wasm_libc_windows_fdopen(p0: Int, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_fileno(p0)")
private external fun _wasm_libc_windows_fileno(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_open(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_open(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_wopen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_wopen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_creat(p0, p1)")
private external fun _wasm_libc_windows_creat(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_access(p0, p1)")
private external fun _wasm_libc_windows_access(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_chdir(p0)")
private external fun _wasm_libc_windows_chdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_close(p0)")
private external fun _wasm_libc_windows_close(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_dup(p0)")
private external fun _wasm_libc_windows_dup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_dup2(p0, p1)")
private external fun _wasm_libc_windows_dup2(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_execl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_execl(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_wexecl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_wexecl(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_execle(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_execle(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_wexecle(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_wexecle(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_execlp(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_execlp(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_wexeclp(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_wexeclp(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_execlpe(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_execlpe(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_windows_wexeclpe(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_windows_wexeclpe(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_execv(p0, p1)")
private external fun _wasm_libc_windows_execv(p0: String?, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_execve(p0, p1, p2)")
private external fun _wasm_libc_windows_execve(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_execvp(p0, p1)")
private external fun _wasm_libc_windows_execvp(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_execvpe(p0, p1, p2)")
private external fun _wasm_libc_windows_execvpe(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_wexecv(p0, p1)")
private external fun _wasm_libc_windows_wexecv(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_wexecve(p0, p1, p2)")
private external fun _wasm_libc_windows_wexecve(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_wexecvp(p0, p1)")
private external fun _wasm_libc_windows_wexecvp(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_wexecvpe(p0, p1, p2)")
private external fun _wasm_libc_windows_wexecvpe(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_getcwd(p0, p1)")
private external fun _wasm_libc_windows_getcwd(p0: String, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_windows_getpid()")
private external fun _wasm_libc_windows_getpid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_isatty(p0)")
private external fun _wasm_libc_windows_isatty(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_lseek(p0, p1, p2)")
private external fun _wasm_libc_windows_lseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_lseek64(p0, p1, p2)")
private external fun _wasm_libc_windows_lseek64(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_pipe(p0, p1, p2)")
private external fun _wasm_libc_windows_pipe(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_read(p0, p1, p2)")
private external fun _wasm_libc_windows_read(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_rmdir(p0)")
private external fun _wasm_libc_windows_rmdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_unlink(p0)")
private external fun _wasm_libc_windows_unlink(p0: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_write(p0, p1, p2)")
private external fun _wasm_libc_windows_write(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_commit(p0)")
private external fun _wasm_libc_windows_commit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_getOsfhandle(p0)")
private external fun _wasm_libc_windows_getOsfhandle(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_openOsfhandle(p0, p1)")
private external fun _wasm_libc_windows_openOsfhandle(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_setlocale(p0, p1)")
private external fun _wasm_libc_windows_setlocale(p0: Int, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_wsetlocale(p0, p1)")
private external fun _wasm_libc_windows_wsetlocale(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_alignedMalloc(p0, p1)")
private external fun _wasm_libc_windows_alignedMalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_alignedFree(p0)")
private external fun _wasm_libc_windows_alignedFree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_alignedRealloc(p0, p1, p2)")
private external fun _wasm_libc_windows_alignedRealloc(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_putenv(p0)")
private external fun _wasm_libc_windows_putenv(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_windows_wputenv(p0)")
private external fun _wasm_libc_windows_wputenv(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_putenvS(p0, p1)")
private external fun _wasm_libc_windows_putenvS(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_wputenvS(p0, p1)")
private external fun _wasm_libc_windows_wputenvS(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_windows_listen(p0, p1)")
private external fun _wasm_libc_windows_listen(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_accept(p0, p1, p2)")
private external fun _wasm_libc_windows_accept(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_bind(p0, p1, p2)")
private external fun _wasm_libc_windows_bind(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_connect(p0, p1, p2)")
private external fun _wasm_libc_windows_connect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_getpeername(p0, p1, p2)")
private external fun _wasm_libc_windows_getpeername(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_getsockname(p0, p1, p2)")
private external fun _wasm_libc_windows_getsockname(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_windows_getsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_windows_getsockopt(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_windows_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_windows_recvfrom(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_windows_sendto(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_windows_sendto(p0: String, p1: String?, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_windows_setsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_windows_setsockopt(p0: String, p1: Int, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_windows_socket(p0, p1, p2)")
private external fun _wasm_libc_windows_socket(p0: Int, p1: Int, p2: Int): String

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_printf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fprintf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalnum(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_iscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_islower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_ispunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_tolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_toupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_qsort((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?) {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_qsortS((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_windowsNapiAvailable) _wasm_libc_windows_fopen(filename, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_windowsNapiAvailable) _wasm_libc_windows_freopen(filename, mode, (file?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fflush((file?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fclose((file?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_remove(filename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: String?, newname: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_rename(oldname, newname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): FILE? =
    if (_windowsNapiAvailable) _wasm_libc_windows_tmpfile().toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_getchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_putchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fgetc((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fputc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fputs(s, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_puts(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_ungetc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_fread((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: FILE?): CLong =
    if (_windowsNapiAvailable) _wasm_libc_windows_ftell((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: FILE?) {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_rewind((stream?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fgetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fsetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_feof((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_ferror((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: String?) {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_perror(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: String?): CDouble =
    if (_windowsNapiAvailable) _wasm_libc_windows_atof(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_atoi(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: String?): CLong =
    if (_windowsNapiAvailable) _wasm_libc_windows_atol(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: String?): CLonglong =
    if (_windowsNapiAvailable) _wasm_libc_windows_atoll(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_windowsNapiAvailable) _wasm_libc_windows_strtod(s, (endp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_windowsNapiAvailable) _wasm_libc_windows_strtof(s, (endp?.value ?: 0L).toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_windowsNapiAvailable) _wasm_libc_windows_strtol(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_windowsNapiAvailable) _wasm_libc_windows_strtoll(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_windowsNapiAvailable) _wasm_libc_windows_strtoul(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_windowsNapiAvailable) _wasm_libc_windows_strtoull(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_calloc(nobj.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_malloc(size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msize(p: COpaquePointer?): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_msize((p?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_realloc((p?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: COpaquePointer?) {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_free((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_atexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_system(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: String?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_getenv(s).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strcpy((dst?.value ?: 0L).toString(), src).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strncpy((dst?.value ?: 0L).toString(), src, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strcat((s?.value ?: 0L).toString(), ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strncat((s?.value ?: 0L).toString(), ct, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_strcmp(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_strncmp(cs, ct, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_strcoll(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strrchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_strspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_strcspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strdup(cs).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strpbrk(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strstr(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_strlen(cs).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_strnlen(cs, maxlen.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strerror(n).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_strtok((s?.value ?: 0L).toString(), t).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wcslen((buf?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsnlen(str: COpaquePointer?, numberOfElements: SizeT): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wcsnlen((str?.value ?: 0L).toString(), numberOfElements.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wcstombs((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_memchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_memset((dest?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_windowsNapiAvailable) _wasm_libc_windows_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (_windowsNapiAvailable) _wasm_libc_windows_signal(signum, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_raise(signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (_windowsNapiAvailable) _wasm_libc_windows_clock() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(sourceTime: COpaquePointer?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_ctime((sourceTime?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    if (_windowsNapiAvailable) _wasm_libc_windows_difftime(timeEnd.toString(), timeStart.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeS(destTime: COpaquePointer?, srcTime: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_gmtimeS((destTime?.value ?: 0L).toString(), (srcTime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDaylight(hours: COpaquePointer?): ErrnoT =
    if (_windowsNapiAvailable) _wasm_libc_windows_getDaylight((hours?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDstbias(seconds: COpaquePointer?): ErrnoT =
    if (_windowsNapiAvailable) _wasm_libc_windows_getDstbias((seconds?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimezone(seconds: COpaquePointer?): ErrnoT =
    if (_windowsNapiAvailable) _wasm_libc_windows_getTimezone((seconds?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTzname(pReturnValue: COpaquePointer?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT =
    if (_windowsNapiAvailable) _wasm_libc_windows_getTzname((pReturnValue?.value ?: 0L).toString(), (timeZoneName?.value ?: 0L).toString(), sizeInBytes.toString(), index) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeS(tmDest: COpaquePointer?, sourceTime: COpaquePointer?): ErrnoT =
    if (_windowsNapiAvailable) _wasm_libc_windows_localtimeS((tmDest?.value ?: 0L).toString(), (sourceTime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(destTime: COpaquePointer?): TimeT =
    if (_windowsNapiAvailable) _wasm_libc_windows_time((destTime?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzset() {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_tzset()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_chmod(path, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wchmod(path: COpaquePointer?, mode: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_wchmod((path?.value ?: 0L).toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_mkdir(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrmdir(path: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_wrmdir((path?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fstat(fildes, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_stat(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wstat(path: COpaquePointer?, buf: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_wstat((path?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wutime(file: COpaquePointer?, buf: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_wutime((file?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_windowsNapiAvailable) _wasm_libc_windows_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_pclose((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_windowsNapiAvailable) _wasm_libc_windows_fdopen(fd, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: FILE?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_fileno((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_open(path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wopen(path: COpaquePointer?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_wopen((path?.value ?: 0L).toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: String?, mode: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_creat(path, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: String?, amode: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_access(path, amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_chdir(dir) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_close(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_dup(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_dup2(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_execl(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecl(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wexecl((path?.value ?: 0L).toString(), (arg0?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_execle(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecle(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wexecle((path?.value ?: 0L).toString(), (arg0?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_execlp(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexeclp(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wexeclp((path?.value ?: 0L).toString(), (arg0?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlpe(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_execlpe(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexeclpe(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wexeclpe((path?.value ?: 0L).toString(), (arg0?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_execv(prog, (argv?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_execve(prog, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_execvp(c, (argv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_execvpe(c, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecv(prog: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wexecv((prog?.value ?: 0L).toString(), (argv?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecve(prog: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wexecve((prog?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecvp(c: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wexecvp((c?.value ?: 0L).toString(), (argv?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecvpe(c: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wexecvpe((c?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_getcwd((buf?.value ?: 0L).toString(), size).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_getpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_isatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    if (_windowsNapiAvailable) _wasm_libc_windows_lseek(fd, offset.toString(), origin).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    if (_windowsNapiAvailable) _wasm_libc_windows_lseek64(fd, offset.toString(), origin).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: COpaquePointer?, psize: CUint, textmode: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_pipe((fds?.value ?: 0L).toString(), psize.toInt(), textmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_read(fd, (buf?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_rmdir(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_unlink(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_write(fd, (buf?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commit(fd: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_commit(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOsfhandle(fd: CInt): IntptrT =
    if (_windowsNapiAvailable) _wasm_libc_windows_getOsfhandle(fd).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_openOsfhandle(osfhandle.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_setlocale(category, locale).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsetlocale(category: CInt, locale: COpaquePointer?): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_wsetlocale(category, (locale?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_alignedMalloc(size.toString(), alignment.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedFree(ptr: COpaquePointer?) {
    if (_windowsNapiAvailable) {
        _wasm_libc_windows_alignedFree((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? =
    if (_windowsNapiAvailable) _wasm_libc_windows_alignedRealloc((memblock?.value ?: 0L).toString(), size.toString(), alignment.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(envstring: String?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_putenv(envstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wputenv(envstring: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_wputenv((envstring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenvS(envstring: String?, valueString: String?): ErrnoT =
    if (_windowsNapiAvailable) _wasm_libc_windows_putenvS(envstring, valueString) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wputenvS(envstring: COpaquePointer?, valueString: COpaquePointer?): ErrnoT =
    if (_windowsNapiAvailable) _wasm_libc_windows_wputenvS((envstring?.value ?: 0L).toString(), (valueString?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(s: Socket, backlog: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_listen(s.toString(), backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket =
    if (_windowsNapiAvailable) _wasm_libc_windows_accept(s.toString(), (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_bind(s.toString(), (name?.value ?: 0L).toString(), namelen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_connect(s.toString(), (name?.value ?: 0L).toString(), namelen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_getpeername(s.toString(), (name?.value ?: 0L).toString(), (nameln?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_getsockname(s.toString(), (name?.value ?: 0L).toString(), (nameln?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_getsockopt(s.toString(), level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: COpaquePointer?, fromlen: COpaquePointer?): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_recvfrom(s.toString(), (buf?.value ?: 0L).toString(), len, flags, (from?.value ?: 0L).toString(), (fromlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: COpaquePointer?, tolen: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_sendto(s.toString(), buf, len, flags, (to?.value ?: 0L).toString(), tolen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt =
    if (_windowsNapiAvailable) _wasm_libc_windows_setsockopt(s.toString(), level, optname, optval, optlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    if (_windowsNapiAvailable) _wasm_libc_windows_socket(af, socketType, protocol).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
