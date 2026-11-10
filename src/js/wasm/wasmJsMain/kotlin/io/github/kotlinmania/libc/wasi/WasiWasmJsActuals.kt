@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.wasi

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
private external fun _initWasiNapiAddon(): Boolean

private val _wasiNapiAvailable: Boolean = _initWasiNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_get_ENVIRON()")
private external fun _wasm_libc_wasi_get_ENVIRON(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_set_ENVIRON(p0)")
private external fun _wasm_libc_wasi_set_ENVIRON(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_get_CLOCK_MONOTONIC1()")
private external fun _wasm_libc_wasi_get_CLOCK_MONOTONIC1(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_get_CLOCK_REALTIME1()")
private external fun _wasm_libc_wasi_get_CLOCK_REALTIME1(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_exit(p0)")
private external fun _wasm_libc_wasi_exit(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_abort()")
private external fun _wasm_libc_wasi_abort()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_alignedAlloc(p0, p1)")
private external fun _wasm_libc_wasi_alignedAlloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_calloc(p0, p1)")
private external fun _wasm_libc_wasi_calloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_free(p0)")
private external fun _wasm_libc_wasi_free(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_getenv(p0)")
private external fun _wasm_libc_wasi_getenv(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_malloc(p0)")
private external fun _wasm_libc_wasi_malloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_mallocUsableSize(p0)")
private external fun _wasm_libc_wasi_mallocUsableSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_sbrk(p0)")
private external fun _wasm_libc_wasi_sbrk(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_rand()")
private external fun _wasm_libc_wasi_rand(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_read(p0, p1, p2)")
private external fun _wasm_libc_wasi_read(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_realloc(p0, p1)")
private external fun _wasm_libc_wasi_realloc(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_setenv(p0, p1, p2)")
private external fun _wasm_libc_wasi_setenv(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_unsetenv(p0)")
private external fun _wasm_libc_wasi_unsetenv(p0: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_clearenv()")
private external fun _wasm_libc_wasi_clearenv(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_write(p0, p1, p2)")
private external fun _wasm_libc_wasi_write(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_fopen(p0, p1)")
private external fun _wasm_libc_wasi_fopen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_freopen(p0, p1, p2)")
private external fun _wasm_libc_wasi_freopen(p0: String?, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_fclose(p0)")
private external fun _wasm_libc_wasi_fclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_remove(p0)")
private external fun _wasm_libc_wasi_remove(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_rename(p0, p1)")
private external fun _wasm_libc_wasi_rename(p0: String?, p1: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_feof(p0)")
private external fun _wasm_libc_wasi_feof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_ferror(p0)")
private external fun _wasm_libc_wasi_ferror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_fflush(p0)")
private external fun _wasm_libc_wasi_fflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_clearerr(p0)")
private external fun _wasm_libc_wasi_clearerr(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_fseek(p0, p1, p2)")
private external fun _wasm_libc_wasi_fseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_ftell(p0)")
private external fun _wasm_libc_wasi_ftell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_rewind(p0)")
private external fun _wasm_libc_wasi_rewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_fgetpos(p0, p1)")
private external fun _wasm_libc_wasi_fgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_fsetpos(p0, p1)")
private external fun _wasm_libc_wasi_fsetpos(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_fread(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_fread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_fwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_fwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_fgetc(p0)")
private external fun _wasm_libc_wasi_fgetc(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_getc(p0)")
private external fun _wasm_libc_wasi_getc(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_getchar()")
private external fun _wasm_libc_wasi_getchar(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_ungetc(p0, p1)")
private external fun _wasm_libc_wasi_ungetc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_fputc(p0, p1)")
private external fun _wasm_libc_wasi_fputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_putc(p0, p1)")
private external fun _wasm_libc_wasi_putc(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_putchar(p0)")
private external fun _wasm_libc_wasi_putchar(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_fputs(p0, p1)")
private external fun _wasm_libc_wasi_fputs(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_puts(p0)")
private external fun _wasm_libc_wasi_puts(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_perror(p0)")
private external fun _wasm_libc_wasi_perror(p0: String?)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_srand(p0)")
private external fun _wasm_libc_wasi_srand(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_atexit(p0)")
private external fun _wasm_libc_wasi_atexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_atQuickExit(p0)")
private external fun _wasm_libc_wasi_atQuickExit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_quickExit(p0)")
private external fun _wasm_libc_wasi_quickExit(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_posixMemalign(p0, p1, p2)")
private external fun _wasm_libc_wasi_posixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_randR(p0)")
private external fun _wasm_libc_wasi_randR(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_random()")
private external fun _wasm_libc_wasi_random(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_srandom(p0)")
private external fun _wasm_libc_wasi_srandom(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_putenv(p0)")
private external fun _wasm_libc_wasi_putenv(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_clock()")
private external fun _wasm_libc_wasi_clock(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_time(p0)")
private external fun _wasm_libc_wasi_time(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_difftime(p0, p1)")
private external fun _wasm_libc_wasi_difftime(p0: String, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_mktime(p0)")
private external fun _wasm_libc_wasi_mktime(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_strftime(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_strftime(p0: String, p1: String, p2: String?, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_gmtime(p0)")
private external fun _wasm_libc_wasi_gmtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_gmtimeR(p0, p1)")
private external fun _wasm_libc_wasi_gmtimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_localtime(p0)")
private external fun _wasm_libc_wasi_localtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_localtimeR(p0, p1)")
private external fun _wasm_libc_wasi_localtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_asctimeR(p0, p1)")
private external fun _wasm_libc_wasi_asctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_ctimeR(p0, p1)")
private external fun _wasm_libc_wasi_ctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_nanosleep(p0, p1)")
private external fun _wasm_libc_wasi_nanosleep(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isalnum(p0)")
private external fun _wasm_libc_wasi_isalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isalpha(p0)")
private external fun _wasm_libc_wasi_isalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_iscntrl(p0)")
private external fun _wasm_libc_wasi_iscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isdigit(p0)")
private external fun _wasm_libc_wasi_isdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isgraph(p0)")
private external fun _wasm_libc_wasi_isgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_islower(p0)")
private external fun _wasm_libc_wasi_islower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isprint(p0)")
private external fun _wasm_libc_wasi_isprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_ispunct(p0)")
private external fun _wasm_libc_wasi_ispunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isspace(p0)")
private external fun _wasm_libc_wasi_isspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isupper(p0)")
private external fun _wasm_libc_wasi_isupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isxdigit(p0)")
private external fun _wasm_libc_wasi_isxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isblank(p0)")
private external fun _wasm_libc_wasi_isblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_tolower(p0)")
private external fun _wasm_libc_wasi_tolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_toupper(p0)")
private external fun _wasm_libc_wasi_toupper(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_setvbuf(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_setvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_setbuf(p0, p1)")
private external fun _wasm_libc_wasi_setbuf(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_fgets(p0, p1, p2)")
private external fun _wasm_libc_wasi_fgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_atof(p0)")
private external fun _wasm_libc_wasi_atof(p0: String?): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_atoi(p0)")
private external fun _wasm_libc_wasi_atoi(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_atol(p0)")
private external fun _wasm_libc_wasi_atol(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_atoll(p0)")
private external fun _wasm_libc_wasi_atoll(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strtod(p0, p1)")
private external fun _wasm_libc_wasi_strtod(p0: String?, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strtof(p0, p1)")
private external fun _wasm_libc_wasi_strtof(p0: String?, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strtol(p0, p1, p2)")
private external fun _wasm_libc_wasi_strtol(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strtoll(p0, p1, p2)")
private external fun _wasm_libc_wasi_strtoll(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strtoul(p0, p1, p2)")
private external fun _wasm_libc_wasi_strtoul(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strtoull(p0, p1, p2)")
private external fun _wasm_libc_wasi_strtoull(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strcpy(p0, p1)")
private external fun _wasm_libc_wasi_strcpy(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strncpy(p0, p1, p2)")
private external fun _wasm_libc_wasi_strncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strcat(p0, p1)")
private external fun _wasm_libc_wasi_strcat(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strncat(p0, p1, p2)")
private external fun _wasm_libc_wasi_strncat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strcmp(p0, p1)")
private external fun _wasm_libc_wasi_strcmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strncmp(p0, p1, p2)")
private external fun _wasm_libc_wasi_strncmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strcoll(p0, p1)")
private external fun _wasm_libc_wasi_strcoll(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strchr(p0, p1)")
private external fun _wasm_libc_wasi_strchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strrchr(p0, p1)")
private external fun _wasm_libc_wasi_strrchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strspn(p0, p1)")
private external fun _wasm_libc_wasi_strspn(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strcspn(p0, p1)")
private external fun _wasm_libc_wasi_strcspn(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_strdup(p0)")
private external fun _wasm_libc_wasi_strdup(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strndup(p0, p1)")
private external fun _wasm_libc_wasi_strndup(p0: String?, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strpbrk(p0, p1)")
private external fun _wasm_libc_wasi_strpbrk(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strstr(p0, p1)")
private external fun _wasm_libc_wasi_strstr(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strcasecmp(p0, p1)")
private external fun _wasm_libc_wasi_strcasecmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strncasecmp(p0, p1, p2)")
private external fun _wasm_libc_wasi_strncasecmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_strlen(p0)")
private external fun _wasm_libc_wasi_strlen(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strnlen(p0, p1)")
private external fun _wasm_libc_wasi_strnlen(p0: String?, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_strerror(p0)")
private external fun _wasm_libc_wasi_strerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strtok(p0, p1)")
private external fun _wasm_libc_wasi_strtok(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strxfrm(p0, p1, p2)")
private external fun _wasm_libc_wasi_strxfrm(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_memchr(p0, p1, p2)")
private external fun _wasm_libc_wasi_memchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_memcmp(p0, p1, p2)")
private external fun _wasm_libc_wasi_memcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_memcpy(p0, p1, p2)")
private external fun _wasm_libc_wasi_memcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_memmove(p0, p1, p2)")
private external fun _wasm_libc_wasi_memmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_memset(p0, p1, p2)")
private external fun _wasm_libc_wasi_memset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_wasi_fprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_wasi_fprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_wasi_printf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_wasi_printf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_wasi_snprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_wasi_snprintf(p0: String, p1: String, p2: String?, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_wasi_sprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_wasi_sprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_wasi_fscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_wasi_fscanf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_wasi_scanf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_wasi_scanf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_wasi_sscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_wasi_sscanf(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_getcharUnlocked()")
private external fun _wasm_libc_wasi_getcharUnlocked(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_putcharUnlocked(p0)")
private external fun _wasm_libc_wasi_putcharUnlocked(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_shutdown(p0, p1)")
private external fun _wasm_libc_wasi_shutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_fstat(p0, p1)")
private external fun _wasm_libc_wasi_fstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_mkdir(p0, p1)")
private external fun _wasm_libc_wasi_mkdir(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_stat(p0, p1)")
private external fun _wasm_libc_wasi_stat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_fdopen(p0, p1)")
private external fun _wasm_libc_wasi_fdopen(p0: Int, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_fileno(p0)")
private external fun _wasm_libc_wasi_fileno(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_wasi_open(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_wasi_open(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_creat(p0, p1)")
private external fun _wasm_libc_wasi_creat(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_wasi_fcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_wasi_fcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_opendir(p0)")
private external fun _wasm_libc_wasi_opendir(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_fdopendir(p0)")
private external fun _wasm_libc_wasi_fdopendir(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_readdir(p0)")
private external fun _wasm_libc_wasi_readdir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_closedir(p0)")
private external fun _wasm_libc_wasi_closedir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_rewinddir(p0)")
private external fun _wasm_libc_wasi_rewinddir(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_dirfd(p0)")
private external fun _wasm_libc_wasi_dirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_seekdir(p0, p1)")
private external fun _wasm_libc_wasi_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_telldir(p0)")
private external fun _wasm_libc_wasi_telldir(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_wasi_openat(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_wasi_openat(p0: Int, p1: String?, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_fstatat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_fstatat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_wasi_linkat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_wasi_linkat(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_mkdirat(p0, p1, p2)")
private external fun _wasm_libc_wasi_mkdirat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_readlinkat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_readlinkat(p0: Int, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_renameat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_renameat(p0: Int, p1: String?, p2: Int, p3: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_symlinkat(p0, p1, p2)")
private external fun _wasm_libc_wasi_symlinkat(p0: String?, p1: Int, p2: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_unlinkat(p0, p1, p2)")
private external fun _wasm_libc_wasi_unlinkat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_access(p0, p1)")
private external fun _wasm_libc_wasi_access(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_close(p0)")
private external fun _wasm_libc_wasi_close(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_fpathconf(p0, p1)")
private external fun _wasm_libc_wasi_fpathconf(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_getopt(p0, p1, p2)")
private external fun _wasm_libc_wasi_getopt(p0: Int, p1: String, p2: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_isatty(p0)")
private external fun _wasm_libc_wasi_isatty(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_link(p0, p1)")
private external fun _wasm_libc_wasi_link(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_lseek(p0, p1, p2)")
private external fun _wasm_libc_wasi_lseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pathconf(p0, p1)")
private external fun _wasm_libc_wasi_pathconf(p0: String?, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_rmdir(p0)")
private external fun _wasm_libc_wasi_rmdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_sleep(p0)")
private external fun _wasm_libc_wasi_sleep(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_unlink(p0)")
private external fun _wasm_libc_wasi_unlink(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_pread(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_pread(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_pwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_pwrite(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_lstat(p0, p1)")
private external fun _wasm_libc_wasi_lstat(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_fsync(p0)")
private external fun _wasm_libc_wasi_fsync(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_fdatasync(p0)")
private external fun _wasm_libc_wasi_fdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_symlink(p0, p1)")
private external fun _wasm_libc_wasi_symlink(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_truncate(p0, p1)")
private external fun _wasm_libc_wasi_truncate(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_ftruncate(p0, p1)")
private external fun _wasm_libc_wasi_ftruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_getrusage(p0, p1)")
private external fun _wasm_libc_wasi_getrusage(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_gettimeofday(p0, p1)")
private external fun _wasm_libc_wasi_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_times(p0)")
private external fun _wasm_libc_wasi_times(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_wasi_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_usleep(p0)")
private external fun _wasm_libc_wasi_usleep(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_send(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_send(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_recv(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_recv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_poll(p0, p1, p2)")
private external fun _wasm_libc_wasi_poll(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_setlocale(p0, p1)")
private external fun _wasm_libc_wasi_setlocale(p0: Int, p1: String?): String

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_localeconv()")
private external fun _wasm_libc_wasi_localeconv(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_readlink(p0, p1, p2)")
private external fun _wasm_libc_wasi_readlink(p0: String?, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_timegm(p0)")
private external fun _wasm_libc_wasi_timegm(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_sysconf(p0)")
private external fun _wasm_libc_wasi_sysconf(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_wasi_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_wasi_ioctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_fseeko(p0, p1, p2)")
private external fun _wasm_libc_wasi_fseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_ftello(p0)")
private external fun _wasm_libc_wasi_ftello(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_wasi_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_strcasestr(p0, p1)")
private external fun _wasm_libc_wasi_strcasestr(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_getline(p0, p1, p2)")
private external fun _wasm_libc_wasi_getline(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_writev(p0, p1, p2)")
private external fun _wasm_libc_wasi_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_readv(p0, p1, p2)")
private external fun _wasm_libc_wasi_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_posixFadvise(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_posixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_futimens(p0, p1)")
private external fun _wasm_libc_wasi_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_getentropy(p0, p1)")
private external fun _wasm_libc_wasi_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_memrchr(p0, p1, p2)")
private external fun _wasm_libc_wasi_memrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_abs(p0)")
private external fun _wasm_libc_wasi_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_labs(p0)")
private external fun _wasm_libc_wasi_labs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_duplocale(p0)")
private external fun _wasm_libc_wasi_duplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_freelocale(p0)")
private external fun _wasm_libc_wasi_freelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_newlocale(p0, p1, p2)")
private external fun _wasm_libc_wasi_newlocale(p0: Int, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_uselocale(p0)")
private external fun _wasm_libc_wasi_uselocale(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_schedYield()")
private external fun _wasm_libc_wasi_schedYield(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_getcwd(p0, p1)")
private external fun _wasm_libc_wasi_getcwd(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_chdir(p0)")
private external fun _wasm_libc_wasi_chdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_nlLanginfo(p0)")
private external fun _wasm_libc_wasi_nlLanginfo(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_nlLanginfoL(p0, p1)")
private external fun _wasm_libc_wasi_nlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_wasi_select(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_wasi_select(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_wasilibcRegisterPreopenedFd(p0, p1)")
private external fun _wasm_libc_wasi_wasilibcRegisterPreopenedFd(p0: Int, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_wasilibcFdRenumber(p0, p1)")
private external fun _wasm_libc_wasi_wasilibcFdRenumber(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_wasilibcUnlinkat(p0, p1)")
private external fun _wasm_libc_wasi_wasilibcUnlinkat(p0: Int, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_wasilibcRmdirat(p0, p1)")
private external fun _wasm_libc_wasi_wasilibcRmdirat(p0: Int, p1: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_wasilibcFindRelpath(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_wasilibcFindRelpath(p0: String?, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_wasilibcTell(p0)")
private external fun _wasm_libc_wasi_wasilibcTell(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdWasilibcUnlinkat(p0, p1)")
private external fun _wasm_libc_wasi_wasilibcNocwdWasilibcUnlinkat(p0: Int, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdWasilibcRmdirat(p0, p1)")
private external fun _wasm_libc_wasi_wasilibcNocwdWasilibcRmdirat(p0: Int, p1: String?): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdLinkat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_wasi_wasilibcNocwdLinkat(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdSymlinkat(p0, p1, p2)")
private external fun _wasm_libc_wasi_wasilibcNocwdSymlinkat(p0: String?, p1: Int, p2: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdReadlinkat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_wasilibcNocwdReadlinkat(p0: Int, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdFaccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_wasilibcNocwdFaccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdRenameat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_wasilibcNocwdRenameat(p0: Int, p1: String?, p2: Int, p3: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdOpenatNomode(p0, p1, p2)")
private external fun _wasm_libc_wasi_wasilibcNocwdOpenatNomode(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdFstatat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_wasilibcNocwdFstatat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdMkdiratNomode(p0, p1)")
private external fun _wasm_libc_wasi_wasilibcNocwdMkdiratNomode(p0: Int, p1: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdUtimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_wasilibcNocwdUtimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_wasilibcNocwdOpendirat(p0, p1)")
private external fun _wasm_libc_wasi_wasilibcNocwdOpendirat(p0: Int, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_wasilibcAccess(p0, p1, p2)")
private external fun _wasm_libc_wasi_wasilibcAccess(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_wasilibcStat(p0, p1, p2)")
private external fun _wasm_libc_wasi_wasilibcStat(p0: String?, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_wasilibcUtimens(p0, p1, p2)")
private external fun _wasm_libc_wasi_wasilibcUtimens(p0: String?, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_wasilibcLink(p0, p1, p2)")
private external fun _wasm_libc_wasi_wasilibcLink(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_wasilibcLinkOldat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_wasilibcLinkOldat(p0: Int, p1: String?, p2: String?, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_wasilibcLinkNewat(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_wasilibcLinkNewat(p0: String?, p1: Int, p2: String?, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_wasilibcRenameOldat(p0, p1, p2)")
private external fun _wasm_libc_wasi_wasilibcRenameOldat(p0: Int, p1: String?, p2: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_wasilibcRenameNewat(p0, p1, p2)")
private external fun _wasm_libc_wasi_wasilibcRenameNewat(p0: String?, p1: Int, p2: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_arc4random()")
private external fun _wasm_libc_wasi_arc4random(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_arc4randomBuf(p0, p1)")
private external fun _wasm_libc_wasi_arc4randomBuf(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_arc4randomUniform(p0)")
private external fun _wasm_libc_wasi_arc4randomUniform(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_errnoLocation()")
private external fun _wasm_libc_wasi_errnoLocation(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_chmod(p0, p1)")
private external fun _wasm_libc_wasi_chmod(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_fchmod(p0, p1)")
private external fun _wasm_libc_wasi_fchmod(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_realpath(p0, p1)")
private external fun _wasm_libc_wasi_realpath(p0: String?, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_wasi_pthreadSelf()")
private external fun _wasm_libc_wasi_pthreadSelf(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadEqual(p0, p1)")
private external fun _wasm_libc_wasi_pthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadJoin(p0, p1)")
private external fun _wasm_libc_wasi_pthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadAttrInit(p0)")
private external fun _wasm_libc_wasi_pthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadAttrDestroy(p0)")
private external fun _wasm_libc_wasi_pthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadAttrGetstacksize(p0, p1)")
private external fun _wasm_libc_wasi_pthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadAttrSetstacksize(p0, p1)")
private external fun _wasm_libc_wasi_pthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadAttrSetdetachstate(p0, p1)")
private external fun _wasm_libc_wasi_pthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadDetach(p0)")
private external fun _wasm_libc_wasi_pthreadDetach(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadKeyCreate(p0, p1)")
private external fun _wasm_libc_wasi_pthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadKeyDelete(p0)")
private external fun _wasm_libc_wasi_pthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadGetspecific(p0)")
private external fun _wasm_libc_wasi_pthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadSetspecific(p0, p1)")
private external fun _wasm_libc_wasi_pthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadMutexInit(p0, p1)")
private external fun _wasm_libc_wasi_pthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadMutexDestroy(p0)")
private external fun _wasm_libc_wasi_pthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadMutexLock(p0)")
private external fun _wasm_libc_wasi_pthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadMutexTrylock(p0)")
private external fun _wasm_libc_wasi_pthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadMutexUnlock(p0)")
private external fun _wasm_libc_wasi_pthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadMutexattrInit(p0)")
private external fun _wasm_libc_wasi_pthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadMutexattrDestroy(p0)")
private external fun _wasm_libc_wasi_pthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadMutexattrSettype(p0, p1)")
private external fun _wasm_libc_wasi_pthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadCondInit(p0, p1)")
private external fun _wasm_libc_wasi_pthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadCondWait(p0, p1)")
private external fun _wasm_libc_wasi_pthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_pthreadCondTimedwait(p0, p1, p2)")
private external fun _wasm_libc_wasi_pthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadCondSignal(p0)")
private external fun _wasm_libc_wasi_pthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadCondBroadcast(p0)")
private external fun _wasm_libc_wasi_pthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadCondDestroy(p0)")
private external fun _wasm_libc_wasi_pthreadCondDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadCondattrInit(p0)")
private external fun _wasm_libc_wasi_pthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadCondattrDestroy(p0)")
private external fun _wasm_libc_wasi_pthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_pthreadRwlockInit(p0, p1)")
private external fun _wasm_libc_wasi_pthreadRwlockInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadRwlockDestroy(p0)")
private external fun _wasm_libc_wasi_pthreadRwlockDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadRwlockRdlock(p0)")
private external fun _wasm_libc_wasi_pthreadRwlockRdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadRwlockTryrdlock(p0)")
private external fun _wasm_libc_wasi_pthreadRwlockTryrdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadRwlockWrlock(p0)")
private external fun _wasm_libc_wasi_pthreadRwlockWrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadRwlockTrywrlock(p0)")
private external fun _wasm_libc_wasi_pthreadRwlockTrywrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadRwlockUnlock(p0)")
private external fun _wasm_libc_wasi_pthreadRwlockUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadRwlockattrInit(p0)")
private external fun _wasm_libc_wasi_pthreadRwlockattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_pthreadRwlockattrDestroy(p0)")
private external fun _wasm_libc_wasi_pthreadRwlockattrDestroy(p0: String): Int

public actual var ENVIRON: COpaquePointer?
    get() = if (_wasiNapiAvailable) _wasm_libc_wasi_get_ENVIRON().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_wasiNapiAvailable) {
            _wasm_libc_wasi_set_ENVIRON((value?.value ?: 0L).toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual val CLOCK_MONOTONIC1: UByte
    get() = if (_wasiNapiAvailable) _wasm_libc_wasi_get_CLOCK_MONOTONIC1().toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual val CLOCK_REALTIME1: UByte
    get() = if (_wasiNapiAvailable) _wasm_libc_wasi_get_CLOCK_REALTIME1().toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exit(code: CInt): Nothing {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_exit(code)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_alignedAlloc(a.toString(), b.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_calloc(amt.toString(), amt2.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(ptr: COpaquePointer?) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_free((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getenv(s: String?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_getenv(s).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(amt: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_malloc(amt.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_mallocUsableSize((ptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_sbrk(increment.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_read(fd, (ptr?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_realloc((ptr?.value ?: 0L).toString(), amt.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_setenv(k, v, a) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(k: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_unsetenv(k) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_clearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_write(fd, (ptr?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(a: String?, b: String?): FILE? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fopen(a, b).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_freopen(a, b, (f?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fclose((f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(a: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_remove(a) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(a: String?, b: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_rename(a, b) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_feof((f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_ferror((f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fflush((f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(f: FILE?) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_clearerr((f?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fseek((f?.handle ?: 0L).toString(), b.toString(), c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(f: FILE?): CLong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_ftell((f?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(f: FILE?) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_rewind((f?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(f: FILE?, pos: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fgetpos((f?.handle ?: 0L).toString(), (pos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(f: FILE?, pos: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fsetpos((f?.handle ?: 0L).toString(), (pos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fread((buf?.value ?: 0L).toString(), a.toString(), b.toString(), (f?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fwrite((buf?.value ?: 0L).toString(), a.toString(), b.toString(), (f?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fgetc((f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getc(f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_getc((f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_getchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_ungetc(a, (f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(a: CInt, f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fputc(a, (f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putc(a: CInt, f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_putc(a, (f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(a: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_putchar(a) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(a: String?, f: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fputs(a, (f?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(a: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_puts(a) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(a: String?) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_perror(a)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srand(a: CUint) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_srand(a.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atexit(a: AtexitACallback): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_atexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atQuickExit(a: AtexitACallback): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_atQuickExit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quickExit(a: CInt): Nothing {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_quickExit(a)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_posixMemalign((a?.value ?: 0L).toString(), b.toString(), c.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randR(a: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_randR((a?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun random(): CLong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_random().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srandom(a: CUint) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_srandom(a.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun putenv(a: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_putenv((a?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_clock().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(a: COpaquePointer?): TimeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_time((a?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    if (_wasiNapiAvailable) _wasm_libc_wasi_difftime(a.toString(), b.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(a: COpaquePointer?): TimeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_mktime((a?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: COpaquePointer?): SizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strftime((a?.value ?: 0L).toString(), b.toString(), c, (d?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(a: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_gmtime((a?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_gmtimeR((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(a: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_localtime((a?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_localtimeR((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_asctimeR((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_ctimeR((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(a: COpaquePointer?, b: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_nanosleep((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(a: ClockidT, b: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(a: ClockidT, b: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: COpaquePointer?, c: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalnum(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_iscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_islower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_ispunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_tolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_toupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atof(s: String?): CDouble =
    if (_wasiNapiAvailable) _wasm_libc_wasi_atof(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_atoi(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: String?): CLong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_atol(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: String?): CLonglong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_atoll(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strtod(s, (endp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strtof(s, (endp?.value ?: 0L).toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strtol(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strtoll(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strtoul(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strtoull(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strcpy((dst?.value ?: 0L).toString(), src).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strncpy((dst?.value ?: 0L).toString(), src, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strcat((s?.value ?: 0L).toString(), ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strncat((s?.value ?: 0L).toString(), ct, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strcmp(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strncmp(cs, ct, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strcoll(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strrchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strcspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strdup(cs).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strndup(cs, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strpbrk(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strstr(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strcasecmp(s1, s2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strncasecmp(s1, s2, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strlen(cs).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strnlen(cs, maxlen.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strerror(n).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strtok((s?.value ?: 0L).toString(), t).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_memchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_memset((dest?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fprintf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_printf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_snprintf((s?.value ?: 0L).toString(), n.toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_sprintf((s?.value ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fscanf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_scanf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_sscanf(s, format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_getcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_putcharUnlocked(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_shutdown(socket, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fstat(fildes, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_mkdir(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_stat(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fdopen(fd, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: FILE?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fileno((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_open(path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: String?, mode: ModeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_creat(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: String?): DIR? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_opendir(dirname).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): DIR? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fdopendir(fd).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_readdir((dirp?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: DIR?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_closedir((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: DIR?) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_rewinddir((dirp?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dirfd(dirp: DIR?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_openat(dirfd, pathname, flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fstatat(dirfd, pathname, (buf?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_linkat(olddirfd, oldpath, newdirfd, newpath, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_mkdirat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_readlinkat(dirfd, pathname, (buf?.value ?: 0L).toString(), bufsiz.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_renameat(olddirfd, oldpath, newdirfd, newpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_symlinkat(target, newdirfd, linkpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_unlinkat(dirfd, pathname, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: String?, amode: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_access(path, amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_close(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fpathconf(filedes, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_getopt(argc, (argv?.value ?: 0L).toString(), optstr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_isatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: String?, dst: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_link(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_lseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: String?, name: CInt): CLong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pathconf(path, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_rmdir(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (_wasiNapiAvailable) _wasm_libc_wasi_sleep(secs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_unlink(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pread(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pwrite(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_lstat(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fsync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: String?, path2: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_symlink(path1, path2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: String?, length: OffT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_truncate(path, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_ftruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_getrusage(resource, (usage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: COpaquePointer?): ClockT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_times((buf?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: CUint): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_usleep(secs.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_send(socket, (buf?.value ?: 0L).toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_recv(socket, (buf?.value ?: 0L).toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_poll((fds?.value ?: 0L).toString(), nfds.toString(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_setlocale(category, locale).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_localeconv().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_readlink(path, (buf?.value ?: 0L).toString(), bufsz.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: COpaquePointer?): TimeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_timegm((tm?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_sysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: FILE?): OffT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_ftello((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_strcasestr(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_getline((lineptr?.value ?: 0L).toString(), (n?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_faccessat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_posixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_memrchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_wasiNapiAvailable) _wasm_libc_wasi_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_duplocale((base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_newlocale(mask, locale, (base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_uselocale((loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_schedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_getcwd((buf?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_chdir(dir) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_nlLanginfo(item).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_nlLanginfoL(item, (loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_select(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcRegisterPreopenedFd(fd, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcFdRenumber(fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcUnlinkat(fd, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcRmdirat(fd, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcFindRelpath(path, (absPrefix?.value ?: 0L).toString(), (relativePath?.value ?: 0L).toString(), relativePathLen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcTell(fd: CInt): OffT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcTell(fd).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdWasilibcUnlinkat(dirfd, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdWasilibcRmdirat(dirfd, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdLinkat(olddirfd, oldpath, newdirfd, newpath, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdSymlinkat(target, dirfd, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdReadlinkat(dirfd, path, (buf?.value ?: 0L).toString(), bufsize.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdFaccessat(dirfd, path, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdRenameat(olddirfd, oldpath, newdirfd, newpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdOpenatNomode(dirfd, path, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdFstatat(dirfd, path, (buf?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdMkdiratNomode(dirfd, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdUtimensat(dirfd, path, (times?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcNocwdOpendirat(dirfd, path).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcAccess(pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcStat(pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcStat(pathname, (buf?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcUtimens(pathname: String?, times: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcUtimens(pathname, (times?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcLink(oldpath, newpath, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcLinkOldat(olddirfd, oldpath, newpath, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcLinkNewat(oldpath, newdirfd, newpath, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcRenameOldat(olddirfd, oldpath, newpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_wasilibcRenameNewat(oldpath, newdirfd, newpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_arc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
    if (_wasiNapiAvailable) {
        _wasm_libc_wasi_arc4randomBuf((a?.value ?: 0L).toString(), b.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(a: UInt): UInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_arc4randomUniform(a.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_errnoLocation().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_chmod(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_fchmod(fd, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_realpath(pathname, (resolved?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadSelf().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadEqual((t1?.value ?: 0L).toString(), (t2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadJoin((native?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadAttrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadAttrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stackSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadDetach((thread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadKeyDelete(key.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadGetspecific(key.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadSetspecific(key.toInt(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadMutexInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadMutexDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadMutexLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadMutexTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadMutexUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadMutexattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadCondWait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadCondSignal((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadCondBroadcast((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadCondDestroy((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadCondattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadRwlockInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadRwlockDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadRwlockRdlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadRwlockTryrdlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadRwlockWrlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadRwlockTrywrlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadRwlockUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadRwlockattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    if (_wasiNapiAvailable) _wasm_libc_wasi_pthreadRwlockattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
