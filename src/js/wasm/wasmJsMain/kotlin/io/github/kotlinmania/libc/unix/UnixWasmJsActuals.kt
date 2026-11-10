@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix

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

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixNapiAddon(): Boolean

private val _unixNapiAvailable: Boolean = _initUnixNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isalnum(p0)")
private external fun _wasm_libc_unix_isalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isalpha(p0)")
private external fun _wasm_libc_unix_isalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_iscntrl(p0)")
private external fun _wasm_libc_unix_iscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isdigit(p0)")
private external fun _wasm_libc_unix_isdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isgraph(p0)")
private external fun _wasm_libc_unix_isgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_islower(p0)")
private external fun _wasm_libc_unix_islower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isprint(p0)")
private external fun _wasm_libc_unix_isprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_ispunct(p0)")
private external fun _wasm_libc_unix_ispunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isspace(p0)")
private external fun _wasm_libc_unix_isspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isupper(p0)")
private external fun _wasm_libc_unix_isupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isxdigit(p0)")
private external fun _wasm_libc_unix_isxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isblank(p0)")
private external fun _wasm_libc_unix_isblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_tolower(p0)")
private external fun _wasm_libc_unix_tolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_toupper(p0)")
private external fun _wasm_libc_unix_toupper(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_qsort(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_qsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsearch(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fopen(p0, p1)")
private external fun _wasm_libc_unix_fopen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_freopen(p0, p1, p2)")
private external fun _wasm_libc_unix_freopen(p0: String?, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_fflush(p0)")
private external fun _wasm_libc_unix_fflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_fclose(p0)")
private external fun _wasm_libc_unix_fclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_remove(p0)")
private external fun _wasm_libc_unix_remove(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_rename(p0, p1)")
private external fun _wasm_libc_unix_rename(p0: String?, p1: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_tmpfile()")
private external fun _wasm_libc_unix_tmpfile(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_setvbuf(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_setvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_setbuf(p0, p1)")
private external fun _wasm_libc_unix_setbuf(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getchar()")
private external fun _wasm_libc_unix_getchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_putchar(p0)")
private external fun _wasm_libc_unix_putchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_fgetc(p0)")
private external fun _wasm_libc_unix_fgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_fgets(p0, p1, p2)")
private external fun _wasm_libc_unix_fgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fputc(p0, p1)")
private external fun _wasm_libc_unix_fputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fputs(p0, p1)")
private external fun _wasm_libc_unix_fputs(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_puts(p0)")
private external fun _wasm_libc_unix_puts(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_ungetc(p0, p1)")
private external fun _wasm_libc_unix_ungetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_fread(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_fread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_fwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_fwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_fseek(p0, p1, p2)")
private external fun _wasm_libc_unix_fseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_ftell(p0)")
private external fun _wasm_libc_unix_ftell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_rewind(p0)")
private external fun _wasm_libc_unix_rewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fgetpos(p0, p1)")
private external fun _wasm_libc_unix_fgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fsetpos(p0, p1)")
private external fun _wasm_libc_unix_fsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_feof(p0)")
private external fun _wasm_libc_unix_feof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_ferror(p0)")
private external fun _wasm_libc_unix_ferror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_clearerr(p0)")
private external fun _wasm_libc_unix_clearerr(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_perror(p0)")
private external fun _wasm_libc_unix_perror(p0: String?)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_atof(p0)")
private external fun _wasm_libc_unix_atof(p0: String?): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_atoi(p0)")
private external fun _wasm_libc_unix_atoi(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_atol(p0)")
private external fun _wasm_libc_unix_atol(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_atoll(p0)")
private external fun _wasm_libc_unix_atoll(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strtod(p0, p1)")
private external fun _wasm_libc_unix_strtod(p0: String?, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strtof(p0, p1)")
private external fun _wasm_libc_unix_strtof(p0: String?, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strtol(p0, p1, p2)")
private external fun _wasm_libc_unix_strtol(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strtoll(p0, p1, p2)")
private external fun _wasm_libc_unix_strtoll(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strtoul(p0, p1, p2)")
private external fun _wasm_libc_unix_strtoul(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strtoull(p0, p1, p2)")
private external fun _wasm_libc_unix_strtoull(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_calloc(p0, p1)")
private external fun _wasm_libc_unix_calloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_malloc(p0)")
private external fun _wasm_libc_unix_malloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_realloc(p0, p1)")
private external fun _wasm_libc_unix_realloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_free(p0)")
private external fun _wasm_libc_unix_free(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_abort()")
private external fun _wasm_libc_unix_abort()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_exit(p0)")
private external fun _wasm_libc_unix_exit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_system(p0)")
private external fun _wasm_libc_unix_system(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_getenv(p0)")
private external fun _wasm_libc_unix_getenv(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strcpy(p0, p1)")
private external fun _wasm_libc_unix_strcpy(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strncpy(p0, p1, p2)")
private external fun _wasm_libc_unix_strncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_stpcpy(p0, p1)")
private external fun _wasm_libc_unix_stpcpy(p0: String, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strcat(p0, p1)")
private external fun _wasm_libc_unix_strcat(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strncat(p0, p1, p2)")
private external fun _wasm_libc_unix_strncat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strcmp(p0, p1)")
private external fun _wasm_libc_unix_strcmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strncmp(p0, p1, p2)")
private external fun _wasm_libc_unix_strncmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strcoll(p0, p1)")
private external fun _wasm_libc_unix_strcoll(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strchr(p0, p1)")
private external fun _wasm_libc_unix_strchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strrchr(p0, p1)")
private external fun _wasm_libc_unix_strrchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strspn(p0, p1)")
private external fun _wasm_libc_unix_strspn(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strcspn(p0, p1)")
private external fun _wasm_libc_unix_strcspn(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_strdup(p0)")
private external fun _wasm_libc_unix_strdup(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strndup(p0, p1)")
private external fun _wasm_libc_unix_strndup(p0: String?, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strpbrk(p0, p1)")
private external fun _wasm_libc_unix_strpbrk(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strstr(p0, p1)")
private external fun _wasm_libc_unix_strstr(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strcasecmp(p0, p1)")
private external fun _wasm_libc_unix_strcasecmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strncasecmp(p0, p1, p2)")
private external fun _wasm_libc_unix_strncasecmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_strlen(p0)")
private external fun _wasm_libc_unix_strlen(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strnlen(p0, p1)")
private external fun _wasm_libc_unix_strnlen(p0: String?, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_strerror(p0)")
private external fun _wasm_libc_unix_strerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strtok(p0, p1)")
private external fun _wasm_libc_unix_strtok(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strtokR(p0, p1, p2)")
private external fun _wasm_libc_unix_strtokR(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_strxfrm(p0, p1, p2)")
private external fun _wasm_libc_unix_strxfrm(p0: String, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_strsignal(p0)")
private external fun _wasm_libc_unix_strsignal(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_wcslen(p0)")
private external fun _wasm_libc_unix_wcslen(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_wcstombs(p0, p1, p2)")
private external fun _wasm_libc_unix_wcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_memchr(p0, p1, p2)")
private external fun _wasm_libc_unix_memchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_wmemchr(p0, p1, p2)")
private external fun _wasm_libc_unix_wmemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_memcmp(p0, p1, p2)")
private external fun _wasm_libc_unix_memcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_memcpy(p0, p1, p2)")
private external fun _wasm_libc_unix_memcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_memmove(p0, p1, p2)")
private external fun _wasm_libc_unix_memmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_memset(p0, p1, p2)")
private external fun _wasm_libc_unix_memset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_memccpy(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_memccpy(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_getpwnam(p0)")
private external fun _wasm_libc_unix_getpwnam(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_getpwuid(p0)")
private external fun _wasm_libc_unix_getpwuid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_fprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_fprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_printf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_printf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_snprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_snprintf(p0: String, p1: String, p2: String?, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_sprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_sprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_fscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_fscanf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_scanf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_scanf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_sscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_sscanf(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getcharUnlocked()")
private external fun _wasm_libc_unix_getcharUnlocked(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_putcharUnlocked(p0)")
private external fun _wasm_libc_unix_putcharUnlocked(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_socket(p0, p1, p2)")
private external fun _wasm_libc_unix_socket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_connect(p0, p1, p2)")
private external fun _wasm_libc_unix_connect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_listen(p0, p1)")
private external fun _wasm_libc_unix_listen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_accept(p0, p1, p2)")
private external fun _wasm_libc_unix_accept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_getpeername(p0, p1, p2)")
private external fun _wasm_libc_unix_getpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_getsockname(p0, p1, p2)")
private external fun _wasm_libc_unix_getsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_setsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_setsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_socketpair(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_socketpair(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_sendto(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_sendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_shutdown(p0, p1)")
private external fun _wasm_libc_unix_shutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_chmod(p0, p1)")
private external fun _wasm_libc_unix_chmod(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fchmod(p0, p1)")
private external fun _wasm_libc_unix_fchmod(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fstat(p0, p1)")
private external fun _wasm_libc_unix_fstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_mkdir(p0, p1)")
private external fun _wasm_libc_unix_mkdir(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_stat(p0, p1)")
private external fun _wasm_libc_unix_stat(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pclose(p0)")
private external fun _wasm_libc_unix_pclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fdopen(p0, p1)")
private external fun _wasm_libc_unix_fdopen(p0: Int, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_fileno(p0)")
private external fun _wasm_libc_unix_fileno(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_open(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_open(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_creat(p0, p1)")
private external fun _wasm_libc_unix_creat(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_fcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_fcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_opendir(p0)")
private external fun _wasm_libc_unix_opendir(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_readdir(p0)")
private external fun _wasm_libc_unix_readdir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_closedir(p0)")
private external fun _wasm_libc_unix_closedir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_rewinddir(p0)")
private external fun _wasm_libc_unix_rewinddir(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_fchmodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_fchmodat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_fchown(p0, p1, p2)")
private external fun _wasm_libc_unix_fchown(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_fchownat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_fchownat(p0: Int, p1: String?, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_fstatat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_fstatat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linkat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linkat(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_renameat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_renameat(p0: Int, p1: String?, p2: Int, p3: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_symlinkat(p0, p1, p2)")
private external fun _wasm_libc_unix_symlinkat(p0: String?, p1: Int, p2: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_unlinkat(p0, p1, p2)")
private external fun _wasm_libc_unix_unlinkat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_access(p0, p1)")
private external fun _wasm_libc_unix_access(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_alarm(p0)")
private external fun _wasm_libc_unix_alarm(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_chdir(p0)")
private external fun _wasm_libc_unix_chdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_fchdir(p0)")
private external fun _wasm_libc_unix_fchdir(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_chown(p0, p1, p2)")
private external fun _wasm_libc_unix_chown(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_lchown(p0, p1, p2)")
private external fun _wasm_libc_unix_lchown(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_close(p0)")
private external fun _wasm_libc_unix_close(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_dup(p0)")
private external fun _wasm_libc_unix_dup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_dup2(p0, p1)")
private external fun _wasm_libc_unix_dup2(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_execl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_execl(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_execle(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_execle(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_execlp(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_execlp(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_execv(p0, p1)")
private external fun _wasm_libc_unix_execv(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_execve(p0, p1, p2)")
private external fun _wasm_libc_unix_execve(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_execvp(p0, p1)")
private external fun _wasm_libc_unix_execvp(p0: String?, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_fork()")
private external fun _wasm_libc_unix_fork(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fpathconf(p0, p1)")
private external fun _wasm_libc_unix_fpathconf(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_getcwd(p0, p1)")
private external fun _wasm_libc_unix_getcwd(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getegid()")
private external fun _wasm_libc_unix_getegid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_geteuid()")
private external fun _wasm_libc_unix_geteuid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getgid()")
private external fun _wasm_libc_unix_getgid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_getgroups(p0, p1)")
private external fun _wasm_libc_unix_getgroups(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getlogin()")
private external fun _wasm_libc_unix_getlogin(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_getopt(p0, p1, p2)")
private external fun _wasm_libc_unix_getopt(p0: Int, p1: String, p2: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_getpgid(p0)")
private external fun _wasm_libc_unix_getpgid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getpgrp()")
private external fun _wasm_libc_unix_getpgrp(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getpid()")
private external fun _wasm_libc_unix_getpid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getppid()")
private external fun _wasm_libc_unix_getppid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getuid()")
private external fun _wasm_libc_unix_getuid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_isatty(p0)")
private external fun _wasm_libc_unix_isatty(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_link(p0, p1)")
private external fun _wasm_libc_unix_link(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_lseek(p0, p1, p2)")
private external fun _wasm_libc_unix_lseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pathconf(p0, p1)")
private external fun _wasm_libc_unix_pathconf(p0: String?, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pipe(p0)")
private external fun _wasm_libc_unix_pipe(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_posixMemalign(p0, p1, p2)")
private external fun _wasm_libc_unix_posixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_alignedAlloc(p0, p1)")
private external fun _wasm_libc_unix_alignedAlloc(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_read(p0, p1, p2)")
private external fun _wasm_libc_unix_read(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_rmdir(p0)")
private external fun _wasm_libc_unix_rmdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_seteuid(p0)")
private external fun _wasm_libc_unix_seteuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_setegid(p0)")
private external fun _wasm_libc_unix_setegid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_setgid(p0)")
private external fun _wasm_libc_unix_setgid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_setpgid(p0, p1)")
private external fun _wasm_libc_unix_setpgid(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_setsid()")
private external fun _wasm_libc_unix_setsid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_setuid(p0)")
private external fun _wasm_libc_unix_setuid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_setreuid(p0, p1)")
private external fun _wasm_libc_unix_setreuid(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_setregid(p0, p1)")
private external fun _wasm_libc_unix_setregid(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_sleep(p0)")
private external fun _wasm_libc_unix_sleep(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nanosleep(p0, p1)")
private external fun _wasm_libc_unix_nanosleep(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_tcgetpgrp(p0)")
private external fun _wasm_libc_unix_tcgetpgrp(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_tcsetpgrp(p0, p1)")
private external fun _wasm_libc_unix_tcsetpgrp(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_ttyname(p0)")
private external fun _wasm_libc_unix_ttyname(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_ttynameR(p0, p1, p2)")
private external fun _wasm_libc_unix_ttynameR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_unlink(p0)")
private external fun _wasm_libc_unix_unlink(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_wait(p0)")
private external fun _wasm_libc_unix_wait(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_waitpid(p0, p1, p2)")
private external fun _wasm_libc_unix_waitpid(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_write(p0, p1, p2)")
private external fun _wasm_libc_unix_write(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_pread(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_pread(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_pwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_pwrite(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_umask(p0)")
private external fun _wasm_libc_unix_umask(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_utime(p0, p1)")
private external fun _wasm_libc_unix_utime(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_kill(p0, p1)")
private external fun _wasm_libc_unix_kill(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_killpg(p0, p1)")
private external fun _wasm_libc_unix_killpg(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_mlock(p0, p1)")
private external fun _wasm_libc_unix_mlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_munlock(p0, p1)")
private external fun _wasm_libc_unix_munlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_mlockall(p0)")
private external fun _wasm_libc_unix_mlockall(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_munlockall()")
private external fun _wasm_libc_unix_munlockall(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_mmap(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_mmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_munmap(p0, p1)")
private external fun _wasm_libc_unix_munmap(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_ifNametoindex(p0)")
private external fun _wasm_libc_unix_ifNametoindex(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_ifIndextoname(p0, p1)")
private external fun _wasm_libc_unix_ifIndextoname(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_lstat(p0, p1)")
private external fun _wasm_libc_unix_lstat(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_fsync(p0)")
private external fun _wasm_libc_unix_fsync(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_setenv(p0, p1, p2)")
private external fun _wasm_libc_unix_setenv(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_unsetenv(p0)")
private external fun _wasm_libc_unix_unsetenv(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_symlink(p0, p1)")
private external fun _wasm_libc_unix_symlink(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_truncate(p0, p1)")
private external fun _wasm_libc_unix_truncate(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_ftruncate(p0, p1)")
private external fun _wasm_libc_unix_ftruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_signal(p0, p1)")
private external fun _wasm_libc_unix_signal(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_getrusage(p0, p1)")
private external fun _wasm_libc_unix_getrusage(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_realpath(p0, p1)")
private external fun _wasm_libc_unix_realpath(p0: String?, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_times(p0)")
private external fun _wasm_libc_unix_times(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_pthreadSelf()")
private external fun _wasm_libc_unix_pthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadEqual(p0, p1)")
private external fun _wasm_libc_unix_pthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadJoin(p0, p1)")
private external fun _wasm_libc_unix_pthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadExit(p0)")
private external fun _wasm_libc_unix_pthreadExit(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadAttrInit(p0)")
private external fun _wasm_libc_unix_pthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadAttrDestroy(p0)")
private external fun _wasm_libc_unix_pthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadAttrGetstacksize(p0, p1)")
private external fun _wasm_libc_unix_pthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadAttrSetstacksize(p0, p1)")
private external fun _wasm_libc_unix_pthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadAttrSetdetachstate(p0, p1)")
private external fun _wasm_libc_unix_pthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadDetach(p0)")
private external fun _wasm_libc_unix_pthreadDetach(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_schedYield()")
private external fun _wasm_libc_unix_schedYield(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadKeyCreate(p0, p1)")
private external fun _wasm_libc_unix_pthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadKeyDelete(p0)")
private external fun _wasm_libc_unix_pthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadGetspecific(p0)")
private external fun _wasm_libc_unix_pthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadSetspecific(p0, p1)")
private external fun _wasm_libc_unix_pthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadMutexInit(p0, p1)")
private external fun _wasm_libc_unix_pthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadMutexDestroy(p0)")
private external fun _wasm_libc_unix_pthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadMutexLock(p0)")
private external fun _wasm_libc_unix_pthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadMutexTrylock(p0)")
private external fun _wasm_libc_unix_pthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadMutexUnlock(p0)")
private external fun _wasm_libc_unix_pthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadMutexattrInit(p0)")
private external fun _wasm_libc_unix_pthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadMutexattrDestroy(p0)")
private external fun _wasm_libc_unix_pthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadMutexattrSettype(p0, p1)")
private external fun _wasm_libc_unix_pthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadCondInit(p0, p1)")
private external fun _wasm_libc_unix_pthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadCondWait(p0, p1)")
private external fun _wasm_libc_unix_pthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_pthreadCondTimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_pthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadCondSignal(p0)")
private external fun _wasm_libc_unix_pthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadCondBroadcast(p0)")
private external fun _wasm_libc_unix_pthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadCondDestroy(p0)")
private external fun _wasm_libc_unix_pthreadCondDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadCondattrInit(p0)")
private external fun _wasm_libc_unix_pthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadCondattrDestroy(p0)")
private external fun _wasm_libc_unix_pthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_pthreadRwlockInit(p0, p1)")
private external fun _wasm_libc_unix_pthreadRwlockInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadRwlockDestroy(p0)")
private external fun _wasm_libc_unix_pthreadRwlockDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadRwlockRdlock(p0)")
private external fun _wasm_libc_unix_pthreadRwlockRdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadRwlockTryrdlock(p0)")
private external fun _wasm_libc_unix_pthreadRwlockTryrdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadRwlockWrlock(p0)")
private external fun _wasm_libc_unix_pthreadRwlockWrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadRwlockTrywrlock(p0)")
private external fun _wasm_libc_unix_pthreadRwlockTrywrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadRwlockUnlock(p0)")
private external fun _wasm_libc_unix_pthreadRwlockUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadRwlockattrInit(p0)")
private external fun _wasm_libc_unix_pthreadRwlockattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_pthreadRwlockattrDestroy(p0)")
private external fun _wasm_libc_unix_pthreadRwlockattrDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_getsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_getsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_raise(p0)")
private external fun _wasm_libc_unix_raise(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_utimes(p0, p1)")
private external fun _wasm_libc_unix_utimes(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_dlopen(p0, p1)")
private external fun _wasm_libc_unix_dlopen(p0: String?, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_dlerror()")
private external fun _wasm_libc_unix_dlerror(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_dlsym(p0, p1)")
private external fun _wasm_libc_unix_dlsym(p0: String, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_dlclose(p0)")
private external fun _wasm_libc_unix_dlclose(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_getaddrinfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_getaddrinfo(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_freeaddrinfo(p0)")
private external fun _wasm_libc_unix_freeaddrinfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hstrerror(p0)")
private external fun _wasm_libc_unix_hstrerror(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_gaiStrerror(p0)")
private external fun _wasm_libc_unix_gaiStrerror(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_resInit()")
private external fun _wasm_libc_unix_resInit(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_gmtimeR(p0, p1)")
private external fun _wasm_libc_unix_gmtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_localtimeR(p0, p1)")
private external fun _wasm_libc_unix_localtimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_mktime(p0)")
private external fun _wasm_libc_unix_mktime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_time(p0)")
private external fun _wasm_libc_unix_time(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_gmtime(p0)")
private external fun _wasm_libc_unix_gmtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_localtime(p0)")
private external fun _wasm_libc_unix_localtime(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_difftime(p0, p1)")
private external fun _wasm_libc_unix_difftime(p0: String, p1: String): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_timegm(p0)")
private external fun _wasm_libc_unix_timegm(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_mknod(p0, p1, p2)")
private external fun _wasm_libc_unix_mknod(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_gethostname(p0, p1)")
private external fun _wasm_libc_unix_gethostname(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_endservent()")
private external fun _wasm_libc_unix_endservent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_getservbyname(p0, p1)")
private external fun _wasm_libc_unix_getservbyname(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_getservbyport(p0, p1)")
private external fun _wasm_libc_unix_getservbyport(p0: Int, p1: String?): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_getservent()")
private external fun _wasm_libc_unix_getservent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_setservent(p0)")
private external fun _wasm_libc_unix_setservent(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_getprotobyname(p0)")
private external fun _wasm_libc_unix_getprotobyname(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_getprotobynumber(p0)")
private external fun _wasm_libc_unix_getprotobynumber(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_chroot(p0)")
private external fun _wasm_libc_unix_chroot(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_usleep(p0)")
private external fun _wasm_libc_unix_usleep(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_send(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_send(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_recv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_recv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_putenv(p0)")
private external fun _wasm_libc_unix_putenv(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_poll(p0, p1, p2)")
private external fun _wasm_libc_unix_poll(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_select(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_select(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_setlocale(p0, p1)")
private external fun _wasm_libc_unix_setlocale(p0: Int, p1: String?): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_localeconv()")
private external fun _wasm_libc_unix_localeconv(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_semWait(p0)")
private external fun _wasm_libc_unix_semWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_semTrywait(p0)")
private external fun _wasm_libc_unix_semTrywait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_semPost(p0)")
private external fun _wasm_libc_unix_semPost(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_statvfs(p0, p1)")
private external fun _wasm_libc_unix_statvfs(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_fstatvfs(p0, p1)")
private external fun _wasm_libc_unix_fstatvfs(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_sigemptyset(p0)")
private external fun _wasm_libc_unix_sigemptyset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_sigaddset(p0, p1)")
private external fun _wasm_libc_unix_sigaddset(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_sigfillset(p0)")
private external fun _wasm_libc_unix_sigfillset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_sigdelset(p0, p1)")
private external fun _wasm_libc_unix_sigdelset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_sigismember(p0, p1)")
private external fun _wasm_libc_unix_sigismember(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_sigprocmask(p0, p1, p2)")
private external fun _wasm_libc_unix_sigprocmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_sigpending(p0)")
private external fun _wasm_libc_unix_sigpending(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_sysconf(p0)")
private external fun _wasm_libc_unix_sysconf(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_mkfifo(p0, p1)")
private external fun _wasm_libc_unix_mkfifo(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_fseeko(p0, p1, p2)")
private external fun _wasm_libc_unix_fseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_ftello(p0)")
private external fun _wasm_libc_unix_ftello(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_tcdrain(p0)")
private external fun _wasm_libc_unix_tcdrain(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cfgetispeed(p0)")
private external fun _wasm_libc_unix_cfgetispeed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cfgetospeed(p0)")
private external fun _wasm_libc_unix_cfgetospeed(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cfsetispeed(p0, p1)")
private external fun _wasm_libc_unix_cfsetispeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cfsetospeed(p0, p1)")
private external fun _wasm_libc_unix_cfsetospeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_tcgetattr(p0, p1)")
private external fun _wasm_libc_unix_tcgetattr(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_tcsetattr(p0, p1, p2)")
private external fun _wasm_libc_unix_tcsetattr(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_tcflow(p0, p1)")
private external fun _wasm_libc_unix_tcflow(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_tcflush(p0, p1)")
private external fun _wasm_libc_unix_tcflush(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_tcgetsid(p0)")
private external fun _wasm_libc_unix_tcgetsid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_tcsendbreak(p0, p1)")
private external fun _wasm_libc_unix_tcsendbreak(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_mkstemp(p0)")
private external fun _wasm_libc_unix_mkstemp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_mkdtemp(p0)")
private external fun _wasm_libc_unix_mkdtemp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_tmpnam(p0)")
private external fun _wasm_libc_unix_tmpnam(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_openlog(p0, p1, p2)")
private external fun _wasm_libc_unix_openlog(p0: String?, p1: Int, p2: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_closelog()")
private external fun _wasm_libc_unix_closelog()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_setlogmask(p0)")
private external fun _wasm_libc_unix_setlogmask(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_syslog(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_syslog(p0: Int, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nice(p0)")
private external fun _wasm_libc_unix_nice(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_grantpt(p0)")
private external fun _wasm_libc_unix_grantpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_posixOpenpt(p0)")
private external fun _wasm_libc_unix_posixOpenpt(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_ptsname(p0)")
private external fun _wasm_libc_unix_ptsname(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_unlockpt(p0)")
private external fun _wasm_libc_unix_unlockpt(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_strcasestr(p0, p1)")
private external fun _wasm_libc_unix_strcasestr(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_getline(p0, p1, p2)")
private external fun _wasm_libc_unix_getline(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_lockf(p0, p1, p2)")
private external fun _wasm_libc_unix_lockf(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_adjtime(p0, p1)")
private external fun _wasm_libc_unix_adjtime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_stpncpy(p0, p1, p2)")
private external fun _wasm_libc_unix_stpncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_confstr(p0, p1, p2)")
private external fun _wasm_libc_unix_confstr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_dladdr(p0, p1)")
private external fun _wasm_libc_unix_dladdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_flock(p0, p1)")
private external fun _wasm_libc_unix_flock(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_openWmemstream(p0, p1)")
private external fun _wasm_libc_unix_openWmemstream(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_getsid(p0)")
private external fun _wasm_libc_unix_getsid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_pause()")
private external fun _wasm_libc_unix_pause(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_mkdirat(p0, p1, p2)")
private external fun _wasm_libc_unix_mkdirat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_openat(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_openat(p0: Int, p1: String?, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_fdopendir(p0)")
private external fun _wasm_libc_unix_fdopendir(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_readdirR(p0, p1, p2)")
private external fun _wasm_libc_unix_readdirR(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_readlinkat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_readlinkat(p0: Int, p1: String?, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_readlink(p0, p1, p2)")
private external fun _wasm_libc_unix_readlink(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_pselect(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_pselect(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_sigaction(p0, p1, p2)")
private external fun _wasm_libc_unix_sigaction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_fmemopen(p0, p1, p2)")
private external fun _wasm_libc_unix_fmemopen(p0: String, p1: String, p2: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_openMemstream(p0, p1)")
private external fun _wasm_libc_unix_openMemstream(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_atexit(p0)")
private external fun _wasm_libc_unix_atexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_cfmakeraw(p0)")
private external fun _wasm_libc_unix_cfmakeraw(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_cfsetspeed(p0, p1)")
private external fun _wasm_libc_unix_cfsetspeed(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_fnmatch(p0, p1, p2)")
private external fun _wasm_libc_unix_fnmatch(p0: String?, p1: String?, p2: Int): Int

public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = In6Addr()

public actual val IN6ADDR_ANY: In6Addr
    get() = In6Addr()

public actual fun isalnum(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_iscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_islower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_ispunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_tolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_toupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_qsort((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_bsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_unixNapiAvailable) _wasm_libc_unix_fopen(filename, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_unixNapiAvailable) _wasm_libc_unix_freopen(filename, mode, (file?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fflush((file?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fclose((file?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_remove(filename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: String?, newname: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_rename(oldname, newname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): FILE? =
    if (_unixNapiAvailable) _wasm_libc_unix_tmpfile().toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_getchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_putchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fgetc((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fputc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fputs(s, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_puts(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_ungetc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_fread((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: FILE?): CLong =
    if (_unixNapiAvailable) _wasm_libc_unix_ftell((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: FILE?) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_rewind((stream?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fgetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fsetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_feof((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_ferror((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(stream: FILE?) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_clearerr((stream?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun perror(s: String?) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_perror(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: String?): CDouble =
    if (_unixNapiAvailable) _wasm_libc_unix_atof(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_atoi(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: String?): CLong =
    if (_unixNapiAvailable) _wasm_libc_unix_atol(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: String?): CLonglong =
    if (_unixNapiAvailable) _wasm_libc_unix_atoll(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_unixNapiAvailable) _wasm_libc_unix_strtod(s, (endp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_unixNapiAvailable) _wasm_libc_unix_strtof(s, (endp?.value ?: 0L).toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_unixNapiAvailable) _wasm_libc_unix_strtol(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_unixNapiAvailable) _wasm_libc_unix_strtoll(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_unixNapiAvailable) _wasm_libc_unix_strtoul(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_unixNapiAvailable) _wasm_libc_unix_strtoull(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_calloc(nobj.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_malloc(size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_realloc((p?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: COpaquePointer?) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_free((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun system(s: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_system(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getenv(s).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strcpy((dst?.value ?: 0L).toString(), src).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strncpy((dst?.value ?: 0L).toString(), src, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_stpcpy((dst?.value ?: 0L).toString(), src).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strcat((s?.value ?: 0L).toString(), ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strncat((s?.value ?: 0L).toString(), ct, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_strcmp(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_strncmp(cs, ct, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_strcoll(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strrchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_strspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_strcspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strdup(cs).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strndup(cs, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strpbrk(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strstr(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_strcasecmp(s1, s2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_strncasecmp(s1, s2, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_strlen(cs).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_strnlen(cs, maxlen.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strerror(n).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strtok((s?.value ?: 0L).toString(), t).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtokR(s: COpaquePointer?, t: String?, p: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strtokR((s?.value ?: 0L).toString(), t, (p?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsignal(sig: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strsignal(sig).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_wcslen((buf?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_wcstombs((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_memchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_wmemchr((cx?.value ?: 0L).toString(), c.toInt(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_memset((dest?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_memccpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnam(name: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getpwnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getpwuid(uid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fprintf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_printf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_snprintf((s?.value ?: 0L).toString(), n.toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sprintf((s?.value ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fscanf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_scanf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sscanf(s, format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_getcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_putcharUnlocked(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_socket(domain, ty, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_connect(socket, (address?.value ?: 0L).toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_listen(socket, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_accept(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_getpeername(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_getsockname(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setsockopt(socket, level, name, (value?.value ?: 0L).toString(), optionLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_socketpair(domain, type, protocol, (socketVector?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_sendto(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), addrlen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_shutdown(socket, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_chmod(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fchmod(fd, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fstat(fildes, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_mkdir(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_stat(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pclose((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_unixNapiAvailable) _wasm_libc_unix_fdopen(fd, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: FILE?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fileno((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_open(path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: String?, mode: ModeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_creat(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: String?): DIR? =
    if (_unixNapiAvailable) _wasm_libc_unix_opendir(dirname).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_readdir((dirp?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: DIR?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_closedir((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: DIR?) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_rewinddir((dirp?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fchmodat(dirfd, pathname, mode.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fchown(fd, owner.toInt(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fchownat(dirfd, pathname, owner.toInt(), group.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fstatat(dirfd, pathname, (buf?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_linkat(olddirfd, oldpath, newdirfd, newpath, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_renameat(olddirfd, oldpath, newdirfd, newpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_symlinkat(target, newdirfd, linkpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_unlinkat(dirfd, pathname, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: String?, amode: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_access(path, amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (_unixNapiAvailable) _wasm_libc_unix_alarm(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_chdir(dir) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchdir(dirfd: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fchdir(dirfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_chown(path, uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_lchown(path, uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_close(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_dup(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_dup2(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_execl(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_execle(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_execlp(file, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_execv(prog, (argv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_execve(prog, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_execvp(c, (argv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_fork() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (_unixNapiAvailable) _wasm_libc_unix_fpathconf(filedes, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getcwd((buf?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (_unixNapiAvailable) _wasm_libc_unix_getegid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (_unixNapiAvailable) _wasm_libc_unix_geteuid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (_unixNapiAvailable) _wasm_libc_unix_getgid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_getgroups(ngroupsMax, (groups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getlogin().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_getopt(argc, (argv?.value ?: 0L).toString(), optstr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgid(pid: PidT): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_getpgid(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgrp(): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_getpgrp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_getpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_getppid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (_unixNapiAvailable) _wasm_libc_unix_getuid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_isatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: String?, dst: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_link(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_unixNapiAvailable) _wasm_libc_unix_lseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: String?, name: CInt): CLong =
    if (_unixNapiAvailable) _wasm_libc_unix_pathconf(path, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pipe((fds?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_posixMemalign((memptr?.value ?: 0L).toString(), align.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_alignedAlloc(alignment.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_read(fd, (buf?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_rmdir(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_seteuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setegid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setpgid(pid, pgid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsid(): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_setsid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setreuid(ruid.toInt(), euid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setregid(rgid.toInt(), egid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (_unixNapiAvailable) _wasm_libc_unix_sleep(secs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_nanosleep((rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetpgrp(fd: CInt): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_tcgetpgrp(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_tcsetpgrp(fd, pgrp) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_ttyname(fd).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_ttynameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_unlink(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: COpaquePointer?): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_wait((status?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_waitpid(pid, (status?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_write(fd, (buf?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_pread(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_pwrite(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (_unixNapiAvailable) _wasm_libc_unix_umask(mask.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_utime(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_kill(pid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_killpg(pgrp, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_mlock((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_munlock((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_mlockall(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_munlockall() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_munmap((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(ifname: String?): CUint =
    if (_unixNapiAvailable) _wasm_libc_unix_ifNametoindex(ifname).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_ifIndextoname(ifindex.toInt(), (ifname?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_lstat(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fsync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setenv(name, value, overwrite) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_unsetenv(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: String?, path2: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_symlink(path1, path2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: String?, length: OffT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_truncate(path, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_ftruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (_unixNapiAvailable) _wasm_libc_unix_signal(signum, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_getrusage(resource, (usage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_realpath(pathname, (resolved?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: COpaquePointer?): ClockT =
    if (_unixNapiAvailable) _wasm_libc_unix_times((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadSelf().toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadEqual(t1.toLong().toString(), t2.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadJoin(native.toLong().toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_pthreadExit((value?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadAttrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadAttrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stackSize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadDetach(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_schedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadKeyDelete(key) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadGetspecific(key).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadSetspecific(key, (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadMutexInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadMutexDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadMutexLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadMutexTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadMutexUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadMutexattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadCondWait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadCondSignal((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadCondBroadcast((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadCondDestroy((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadCondattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadRwlockInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadRwlockDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadRwlockRdlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadRwlockTryrdlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadRwlockWrlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadRwlockTrywrlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadRwlockUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadRwlockattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pthreadRwlockattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_raise(signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_utimes(filename, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_dlopen(filename, flag).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_dlerror().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_dlsym((handle?.value ?: 0L).toString(), symbol).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_dlclose((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_getaddrinfo(node, service, (hints?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: COpaquePointer?) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_freeaddrinfo((res?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hstrerror(errcode: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_hstrerror(errcode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_gaiStrerror(errcode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resInit(): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_resInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_gmtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_localtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: COpaquePointer?): TimeT =
    if (_unixNapiAvailable) _wasm_libc_unix_mktime((tm?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: COpaquePointer?): TimeT =
    if (_unixNapiAvailable) _wasm_libc_unix_time((time?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_gmtime((timeP?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_localtime((timeP?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (_unixNapiAvailable) _wasm_libc_unix_difftime(time1.toString(), time0.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: COpaquePointer?): TimeT =
    if (_unixNapiAvailable) _wasm_libc_unix_timegm((tm?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_mknod(pathname, mode.toInt(), dev) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_gethostname((name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endservent() {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_endservent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getservbyname(name, proto).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyport(port: CInt, proto: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getservbyport(port, proto).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservent(): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getservent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setservent(stayopen: CInt) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_setservent(stayopen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getprotobyname(name: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getprotobyname(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_getprotobynumber(proto).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chroot(name: String?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_chroot(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: UsecondsT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_usleep(secs.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_send(socket, (buf?.value ?: 0L).toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_recv(socket, (buf?.value ?: 0L).toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_putenv((string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_poll((fds?.value ?: 0L).toString(), nfds.toString(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_select(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_setlocale(category, locale).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_localeconv().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_semWait((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_semTrywait((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_semPost((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_statvfs(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fstatvfs(fd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sigemptyset((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sigaddset((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sigfillset((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sigdelset((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sigismember((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sigprocmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sigpending((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (_unixNapiAvailable) _wasm_libc_unix_sysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_mkfifo(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: FILE?): OffT =
    if (_unixNapiAvailable) _wasm_libc_unix_ftello((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcdrain(fd: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_tcdrain(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    if (_unixNapiAvailable) _wasm_libc_unix_cfgetispeed((termios?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    if (_unixNapiAvailable) _wasm_libc_unix_cfgetospeed((termios?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_cfsetispeed((termios?.value ?: 0L).toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_cfsetospeed((termios?.value ?: 0L).toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_tcgetattr(fd, (termios?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_tcsetattr(fd, optionalActions, (termios?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_tcflow(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_tcflush(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetsid(fd: CInt): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_tcgetsid(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_tcsendbreak(fd, duration) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_mkstemp((template?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_mkdtemp((template?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_tmpnam((ptr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_openlog(ident, logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_closelog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_setlogmask(maskpri) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    if (_unixNapiAvailable) {
        _wasm_libc_unix_syslog(priority, message, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nice(incr: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_nice(incr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun grantpt(fd: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_grantpt(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixOpenpt(flags: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_posixOpenpt(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsname(fd: CInt): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_ptsname(fd).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockpt(fd: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_unlockpt(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_strcasestr(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_getline((lineptr?.value ?: 0L).toString(), (n?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_lockf(fd, cmd, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtime(delta: COpaquePointer?, olddelta: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_adjtime((delta?.value ?: 0L).toString(), (olddelta?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_unixNapiAvailable) _wasm_libc_unix_stpncpy((dst?.value ?: 0L).toString(), src, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    if (_unixNapiAvailable) _wasm_libc_unix_confstr(name, (buf?.value ?: 0L).toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_dladdr((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_flock(fd, operation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    if (_unixNapiAvailable) _wasm_libc_unix_openWmemstream((ptr?.value ?: 0L).toString(), (sizeloc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsid(pid: PidT): PidT =
    if (_unixNapiAvailable) _wasm_libc_unix_getsid(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pause() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_mkdirat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_openat(dirfd, pathname, flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): DIR? =
    if (_unixNapiAvailable) _wasm_libc_unix_fdopendir(fd).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_readdirR((dirp?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_readlinkat(dirfd, pathname, (buf?.value ?: 0L).toString(), bufsiz.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_readlink(path, (buf?.value ?: 0L).toString(), bufsz.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_pselect(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_sigaction(signum, (act?.value ?: 0L).toString(), (oldact?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmemopen(buf: COpaquePointer?, size: SizeT, mode: String?): FILE? =
    if (_unixNapiAvailable) _wasm_libc_unix_fmemopen((buf?.value ?: 0L).toString(), size.toString(), mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    if (_unixNapiAvailable) _wasm_libc_unix_openMemstream((ptr?.value ?: 0L).toString(), (sizeloc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_atexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_cfmakeraw((termios?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_cfsetspeed((termios?.value ?: 0L).toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    if (_unixNapiAvailable) _wasm_libc_unix_fnmatch(pattern, name, flags) else throw UnsupportedOperationException("Native FFI addon is not available")
