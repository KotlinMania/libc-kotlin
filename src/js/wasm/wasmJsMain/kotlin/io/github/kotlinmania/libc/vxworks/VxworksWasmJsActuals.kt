@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.vxworks

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
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initVxworksNapiAddon(): Boolean

private val _vxworksNapiAvailable: Boolean = _initVxworksNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isalnum(p0)")
private external fun _wasm_libc_vxworks_isalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isalpha(p0)")
private external fun _wasm_libc_vxworks_isalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_iscntrl(p0)")
private external fun _wasm_libc_vxworks_iscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isdigit(p0)")
private external fun _wasm_libc_vxworks_isdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isgraph(p0)")
private external fun _wasm_libc_vxworks_isgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_islower(p0)")
private external fun _wasm_libc_vxworks_islower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isprint(p0)")
private external fun _wasm_libc_vxworks_isprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_ispunct(p0)")
private external fun _wasm_libc_vxworks_ispunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isspace(p0)")
private external fun _wasm_libc_vxworks_isspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isupper(p0)")
private external fun _wasm_libc_vxworks_isupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isxdigit(p0)")
private external fun _wasm_libc_vxworks_isxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isblank(p0)")
private external fun _wasm_libc_vxworks_isblank(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_tolower(p0)")
private external fun _wasm_libc_vxworks_tolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_toupper(p0)")
private external fun _wasm_libc_vxworks_toupper(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_fopen(p0, p1)")
private external fun _wasm_libc_vxworks_fopen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_freopen(p0, p1, p2)")
private external fun _wasm_libc_vxworks_freopen(p0: String?, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_fflush(p0)")
private external fun _wasm_libc_vxworks_fflush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_fclose(p0)")
private external fun _wasm_libc_vxworks_fclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_remove(p0)")
private external fun _wasm_libc_vxworks_remove(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_rename(p0, p1)")
private external fun _wasm_libc_vxworks_rename(p0: String?, p1: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_tmpfile()")
private external fun _wasm_libc_vxworks_tmpfile(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_setvbuf(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_setvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_setbuf(p0, p1)")
private external fun _wasm_libc_vxworks_setbuf(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_getchar()")
private external fun _wasm_libc_vxworks_getchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_putchar(p0)")
private external fun _wasm_libc_vxworks_putchar(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_fgetc(p0)")
private external fun _wasm_libc_vxworks_fgetc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_fgets(p0, p1, p2)")
private external fun _wasm_libc_vxworks_fgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_fputc(p0, p1)")
private external fun _wasm_libc_vxworks_fputc(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_fputs(p0, p1)")
private external fun _wasm_libc_vxworks_fputs(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_puts(p0)")
private external fun _wasm_libc_vxworks_puts(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_ungetc(p0, p1)")
private external fun _wasm_libc_vxworks_ungetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_fread(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_fread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_fwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_fwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_fseek(p0, p1, p2)")
private external fun _wasm_libc_vxworks_fseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_ftell(p0)")
private external fun _wasm_libc_vxworks_ftell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_rewind(p0)")
private external fun _wasm_libc_vxworks_rewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_fgetpos(p0, p1)")
private external fun _wasm_libc_vxworks_fgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_fsetpos(p0, p1)")
private external fun _wasm_libc_vxworks_fsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_feof(p0)")
private external fun _wasm_libc_vxworks_feof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_ferror(p0)")
private external fun _wasm_libc_vxworks_ferror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_perror(p0)")
private external fun _wasm_libc_vxworks_perror(p0: String?)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_atof(p0)")
private external fun _wasm_libc_vxworks_atof(p0: String?): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_atoi(p0)")
private external fun _wasm_libc_vxworks_atoi(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_atol(p0)")
private external fun _wasm_libc_vxworks_atol(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_atoll(p0)")
private external fun _wasm_libc_vxworks_atoll(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strtod(p0, p1)")
private external fun _wasm_libc_vxworks_strtod(p0: String?, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strtof(p0, p1)")
private external fun _wasm_libc_vxworks_strtof(p0: String?, p1: String): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strtol(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strtol(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strtoll(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strtoll(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strtoul(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strtoul(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strtoull(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strtoull(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_calloc(p0, p1)")
private external fun _wasm_libc_vxworks_calloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_malloc(p0)")
private external fun _wasm_libc_vxworks_malloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_realloc(p0, p1)")
private external fun _wasm_libc_vxworks_realloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_free(p0)")
private external fun _wasm_libc_vxworks_free(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_abort()")
private external fun _wasm_libc_vxworks_abort()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_exit(p0)")
private external fun _wasm_libc_vxworks_exit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_atexit(p0)")
private external fun _wasm_libc_vxworks_atexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_system(p0)")
private external fun _wasm_libc_vxworks_system(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_getenv(p0)")
private external fun _wasm_libc_vxworks_getenv(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_cfgetospeed(p0)")
private external fun _wasm_libc_vxworks_cfgetospeed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_cfmakeraw(p0)")
private external fun _wasm_libc_vxworks_cfmakeraw(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_cfsetispeed(p0, p1)")
private external fun _wasm_libc_vxworks_cfsetispeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_cfsetospeed(p0, p1)")
private external fun _wasm_libc_vxworks_cfsetospeed(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strcpy(p0, p1)")
private external fun _wasm_libc_vxworks_strcpy(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strncpy(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strcat(p0, p1)")
private external fun _wasm_libc_vxworks_strcat(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strncat(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strncat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strcmp(p0, p1)")
private external fun _wasm_libc_vxworks_strcmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strncmp(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strncmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strcoll(p0, p1)")
private external fun _wasm_libc_vxworks_strcoll(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strchr(p0, p1)")
private external fun _wasm_libc_vxworks_strchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strrchr(p0, p1)")
private external fun _wasm_libc_vxworks_strrchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strspn(p0, p1)")
private external fun _wasm_libc_vxworks_strspn(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strcspn(p0, p1)")
private external fun _wasm_libc_vxworks_strcspn(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_strdup(p0)")
private external fun _wasm_libc_vxworks_strdup(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strpbrk(p0, p1)")
private external fun _wasm_libc_vxworks_strpbrk(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strstr(p0, p1)")
private external fun _wasm_libc_vxworks_strstr(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strcasecmp(p0, p1)")
private external fun _wasm_libc_vxworks_strcasecmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strncasecmp(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strncasecmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_strlen(p0)")
private external fun _wasm_libc_vxworks_strlen(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strnlen(p0, p1)")
private external fun _wasm_libc_vxworks_strnlen(p0: String?, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_strerror(p0)")
private external fun _wasm_libc_vxworks_strerror(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_strtok(p0, p1)")
private external fun _wasm_libc_vxworks_strtok(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strxfrm(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strxfrm(p0: String, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_wcslen(p0)")
private external fun _wasm_libc_vxworks_wcslen(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_wcstombs(p0, p1, p2)")
private external fun _wasm_libc_vxworks_wcstombs(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_memchr(p0, p1, p2)")
private external fun _wasm_libc_vxworks_memchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_wmemchr(p0, p1, p2)")
private external fun _wasm_libc_vxworks_wmemchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_memcmp(p0, p1, p2)")
private external fun _wasm_libc_vxworks_memcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_memcpy(p0, p1, p2)")
private external fun _wasm_libc_vxworks_memcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_memccpy(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_memccpy(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_memmove(p0, p1, p2)")
private external fun _wasm_libc_vxworks_memmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_memset(p0, p1, p2)")
private external fun _wasm_libc_vxworks_memset(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_alignedAlloc(p0, p1)")
private external fun _wasm_libc_vxworks_alignedAlloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_uname(p0)")
private external fun _wasm_libc_vxworks_uname(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_times(p0)")
private external fun _wasm_libc_vxworks_times(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_tcflush(p0, p1)")
private external fun _wasm_libc_vxworks_tcflush(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pclose(p0)")
private external fun _wasm_libc_vxworks_pclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_mkdtemp(p0)")
private external fun _wasm_libc_vxworks_mkdtemp(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_vxworks_linkat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_vxworks_linkat(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_unlinkat(p0, p1, p2)")
private external fun _wasm_libc_vxworks_unlinkat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_getprotobyname(p0)")
private external fun _wasm_libc_vxworks_getprotobyname(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_getprotobynumber(p0)")
private external fun _wasm_libc_vxworks_getprotobynumber(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_getservbyname(p0, p1)")
private external fun _wasm_libc_vxworks_getservbyname(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_vxworks_fchownat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_vxworks_fchownat(p0: Int, p1: String?, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_fprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_fprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_vxworks_printf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_vxworks_printf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_vxworks_snprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_vxworks_snprintf(p0: String, p1: String, p2: String?, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_sprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_sprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_fscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_fscanf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_vxworks_scanf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_vxworks_scanf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_sscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_sscanf(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_getcharUnlocked()")
private external fun _wasm_libc_vxworks_getcharUnlocked(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_putcharUnlocked(p0)")
private external fun _wasm_libc_vxworks_putcharUnlocked(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_stat(p0, p1)")
private external fun _wasm_libc_vxworks_stat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_fdopen(p0, p1)")
private external fun _wasm_libc_vxworks_fdopen(p0: Int, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_fileno(p0)")
private external fun _wasm_libc_vxworks_fileno(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_creat(p0, p1)")
private external fun _wasm_libc_vxworks_creat(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_rewinddir(p0)")
private external fun _wasm_libc_vxworks_rewinddir(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_fchown(p0, p1, p2)")
private external fun _wasm_libc_vxworks_fchown(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_access(p0, p1)")
private external fun _wasm_libc_vxworks_access(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_alarm(p0)")
private external fun _wasm_libc_vxworks_alarm(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_fchdir(p0)")
private external fun _wasm_libc_vxworks_fchdir(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_chown(p0, p1, p2)")
private external fun _wasm_libc_vxworks_chown(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_fpathconf(p0, p1)")
private external fun _wasm_libc_vxworks_fpathconf(p0: Int, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_getegid()")
private external fun _wasm_libc_vxworks_getegid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_geteuid()")
private external fun _wasm_libc_vxworks_geteuid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_getgroups(p0, p1)")
private external fun _wasm_libc_vxworks_getgroups(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_getlogin()")
private external fun _wasm_libc_vxworks_getlogin(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_getopt(p0, p1, p2)")
private external fun _wasm_libc_vxworks_getopt(p0: Int, p1: String, p2: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pathconf(p0, p1)")
private external fun _wasm_libc_vxworks_pathconf(p0: String?, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_pause()")
private external fun _wasm_libc_vxworks_pause(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_seteuid(p0)")
private external fun _wasm_libc_vxworks_seteuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_setegid(p0)")
private external fun _wasm_libc_vxworks_setegid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_sleep(p0)")
private external fun _wasm_libc_vxworks_sleep(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_ttyname(p0)")
private external fun _wasm_libc_vxworks_ttyname(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_wait(p0)")
private external fun _wasm_libc_vxworks_wait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_umask(p0)")
private external fun _wasm_libc_vxworks_umask(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_mlock(p0, p1)")
private external fun _wasm_libc_vxworks_mlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_mlockall(p0)")
private external fun _wasm_libc_vxworks_mlockall(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_munlock(p0, p1)")
private external fun _wasm_libc_vxworks_munlock(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_munlockall()")
private external fun _wasm_libc_vxworks_munlockall(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_vxworks_mmap(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_vxworks_mmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_munmap(p0, p1)")
private external fun _wasm_libc_vxworks_munmap(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_mprotect(p0, p1, p2)")
private external fun _wasm_libc_vxworks_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_msync(p0, p1, p2)")
private external fun _wasm_libc_vxworks_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_truncate(p0, p1)")
private external fun _wasm_libc_vxworks_truncate(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_vxworks_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_shmUnlink(p0)")
private external fun _wasm_libc_vxworks_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_gettimeofday(p0, p1)")
private external fun _wasm_libc_vxworks_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadExit(p0)")
private external fun _wasm_libc_vxworks_pthreadExit(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadAttrSetdetachstate(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadEqual(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_vxworks_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_sigaddset(p0, p1)")
private external fun _wasm_libc_vxworks_sigaddset(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_sigaction(p0, p1, p2)")
private external fun _wasm_libc_vxworks_sigaction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_utimes(p0, p1)")
private external fun _wasm_libc_vxworks_utimes(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_futimens(p0, p1)")
private external fun _wasm_libc_vxworks_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_dlopen(p0, p1)")
private external fun _wasm_libc_vxworks_dlopen(p0: String?, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_dlerror()")
private external fun _wasm_libc_vxworks_dlerror(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_dlsym(p0, p1)")
private external fun _wasm_libc_vxworks_dlsym(p0: String, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_dlclose(p0)")
private external fun _wasm_libc_vxworks_dlclose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_dladdr(p0, p1)")
private external fun _wasm_libc_vxworks_dladdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_gmtimeR(p0, p1)")
private external fun _wasm_libc_vxworks_gmtimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_localtimeR(p0, p1)")
private external fun _wasm_libc_vxworks_localtimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_mktime(p0)")
private external fun _wasm_libc_vxworks_mktime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_time(p0)")
private external fun _wasm_libc_vxworks_time(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_gmtime(p0)")
private external fun _wasm_libc_vxworks_gmtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_localtime(p0)")
private external fun _wasm_libc_vxworks_localtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_timegm(p0)")
private external fun _wasm_libc_vxworks_timegm(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_difftime(p0, p1)")
private external fun _wasm_libc_vxworks_difftime(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_gethostname(p0, p1)")
private external fun _wasm_libc_vxworks_gethostname(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_usleep(p0)")
private external fun _wasm_libc_vxworks_usleep(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_putenv(p0)")
private external fun _wasm_libc_vxworks_putenv(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_setlocale(p0, p1)")
private external fun _wasm_libc_vxworks_setlocale(p0: Int, p1: String?): String

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_localeconv()")
private external fun _wasm_libc_vxworks_localeconv(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_sigprocmask(p0, p1, p2)")
private external fun _wasm_libc_vxworks_sigprocmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_sigpending(p0)")
private external fun _wasm_libc_vxworks_sigpending(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_mkfifo(p0, p1)")
private external fun _wasm_libc_vxworks_mkfifo(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_fseeko(p0, p1, p2)")
private external fun _wasm_libc_vxworks_fseeko(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_ftello(p0)")
private external fun _wasm_libc_vxworks_ftello(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_mkstemp(p0)")
private external fun _wasm_libc_vxworks_mkstemp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_tmpnam(p0)")
private external fun _wasm_libc_vxworks_tmpnam(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_openlog(p0, p1, p2)")
private external fun _wasm_libc_vxworks_openlog(p0: String?, p1: Int, p2: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_closelog()")
private external fun _wasm_libc_vxworks_closelog()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_setlogmask(p0)")
private external fun _wasm_libc_vxworks_setlogmask(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_syslog(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_syslog(p0: Int, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_getline(p0, p1, p2)")
private external fun _wasm_libc_vxworks_getline(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_tcsetattr(p0, p1, p2)")
private external fun _wasm_libc_vxworks_tcsetattr(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_tcgetattr(p0, p1)")
private external fun _wasm_libc_vxworks_tcgetattr(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_tcsendbreak(p0, p1)")
private external fun _wasm_libc_vxworks_tcsendbreak(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_confstr(p0, p1, p2)")
private external fun _wasm_libc_vxworks_confstr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_fnmatch(p0, p1, p2)")
private external fun _wasm_libc_vxworks_fnmatch(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_symlinkat(p0, p1, p2)")
private external fun _wasm_libc_vxworks_symlinkat(p0: String?, p1: Int, p2: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_fchmodat(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_fchmodat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_utime(p0, p1)")
private external fun _wasm_libc_vxworks_utime(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_memalign(p0, p1)")
private external fun _wasm_libc_vxworks_memalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_getcwd(p0, p1)")
private external fun _wasm_libc_vxworks_getcwd(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_chdir(p0)")
private external fun _wasm_libc_vxworks_chdir(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadMutexattrInit(p0)")
private external fun _wasm_libc_vxworks_pthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadMutexattrDestroy(p0)")
private external fun _wasm_libc_vxworks_pthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadMutexattrSettype(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadMutexInit(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadMutexDestroy(p0)")
private external fun _wasm_libc_vxworks_pthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadMutexLock(p0)")
private external fun _wasm_libc_vxworks_pthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadMutexTrylock(p0)")
private external fun _wasm_libc_vxworks_pthreadMutexTrylock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadMutexUnlock(p0)")
private external fun _wasm_libc_vxworks_pthreadMutexUnlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadAttrSetname(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadAttrSetname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadAttrSetstacksize(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadAttrGetstacksize(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadAttrInit(p0)")
private external fun _wasm_libc_vxworks_pthreadAttrInit(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_pthreadSetschedparam(p0, p1, p2)")
private external fun _wasm_libc_vxworks_pthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_pthreadGetschedparam(p0, p1, p2)")
private external fun _wasm_libc_vxworks_pthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadAttrSetinheritsched(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadAttrSetinheritsched(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadAttrSetschedpolicy(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadAttrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadAttrDestroy(p0)")
private external fun _wasm_libc_vxworks_pthreadAttrDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadDetach(p0)")
private external fun _wasm_libc_vxworks_pthreadDetach(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_vxworks_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_fstat(p0, p1)")
private external fun _wasm_libc_vxworks_fstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_lstat(p0, p1)")
private external fun _wasm_libc_vxworks_lstat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_ftruncate(p0, p1)")
private external fun _wasm_libc_vxworks_ftruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_readdirR(p0, p1, p2)")
private external fun _wasm_libc_vxworks_readdirR(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_readdir(p0)")
private external fun _wasm_libc_vxworks_readdir(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_open(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_open(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_poll(p0, p1, p2)")
private external fun _wasm_libc_vxworks_poll(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondattrInit(p0)")
private external fun _wasm_libc_vxworks_pthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondattrDestroy(p0)")
private external fun _wasm_libc_vxworks_pthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondInit(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondDestroy(p0)")
private external fun _wasm_libc_vxworks_pthreadCondDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondSignal(p0)")
private external fun _wasm_libc_vxworks_pthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondBroadcast(p0)")
private external fun _wasm_libc_vxworks_pthreadCondBroadcast(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondWait(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockattrInit(p0)")
private external fun _wasm_libc_vxworks_pthreadRwlockattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockattrDestroy(p0)")
private external fun _wasm_libc_vxworks_pthreadRwlockattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockattrSetmaxreaders(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadRwlockattrSetmaxreaders(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockInit(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadRwlockInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockDestroy(p0)")
private external fun _wasm_libc_vxworks_pthreadRwlockDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockRdlock(p0)")
private external fun _wasm_libc_vxworks_pthreadRwlockRdlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockTryrdlock(p0)")
private external fun _wasm_libc_vxworks_pthreadRwlockTryrdlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockTimedrdlock(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadRwlockTimedrdlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockWrlock(p0)")
private external fun _wasm_libc_vxworks_pthreadRwlockWrlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockTrywrlock(p0)")
private external fun _wasm_libc_vxworks_pthreadRwlockTrywrlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockTimedwrlock(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadRwlockTimedwrlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadRwlockUnlock(p0)")
private external fun _wasm_libc_vxworks_pthreadRwlockUnlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadKeyCreate(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadKeyDelete(p0)")
private external fun _wasm_libc_vxworks_pthreadKeyDelete(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadSetspecific(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadSetspecific(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pthreadGetspecific(p0)")
private external fun _wasm_libc_vxworks_pthreadGetspecific(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_pthreadCondTimedwait(p0, p1, p2)")
private external fun _wasm_libc_vxworks_pthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadAttrGetname(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadAttrGetname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pthreadJoin(p0, p1)")
private external fun _wasm_libc_vxworks_pthreadJoin(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_pthreadSelf()")
private external fun _wasm_libc_vxworks_pthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_clockGettime(p0, p1)")
private external fun _wasm_libc_vxworks_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_clockSettime(p0, p1)")
private external fun _wasm_libc_vxworks_clockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_clockGetres(p0, p1)")
private external fun _wasm_libc_vxworks_clockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_clockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_nanosleep(p0, p1)")
private external fun _wasm_libc_vxworks_nanosleep(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_accept(p0, p1, p2)")
private external fun _wasm_libc_vxworks_accept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_bind(p0, p1, p2)")
private external fun _wasm_libc_vxworks_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_connect(p0, p1, p2)")
private external fun _wasm_libc_vxworks_connect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_getpeername(p0, p1, p2)")
private external fun _wasm_libc_vxworks_getpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_getsockname(p0, p1, p2)")
private external fun _wasm_libc_vxworks_getsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_vxworks_getsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_vxworks_getsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_listen(p0, p1)")
private external fun _wasm_libc_vxworks_listen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_recv(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_recv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_vxworks_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_vxworks_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_vxworks_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_send(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_send(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_vxworks_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_vxworks_sendto(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_vxworks_sendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_vxworks_setsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_vxworks_setsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_shutdown(p0, p1)")
private external fun _wasm_libc_vxworks_shutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_socket(p0, p1, p2)")
private external fun _wasm_libc_vxworks_socket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_ioctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_fcntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_fcntl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_gaiStrerror(p0)")
private external fun _wasm_libc_vxworks_gaiStrerror(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_close(p0)")
private external fun _wasm_libc_vxworks_close(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_read(p0, p1, p2)")
private external fun _wasm_libc_vxworks_read(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_write(p0, p1, p2)")
private external fun _wasm_libc_vxworks_write(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_isatty(p0)")
private external fun _wasm_libc_vxworks_isatty(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_dup(p0)")
private external fun _wasm_libc_vxworks_dup(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_dup2(p0, p1)")
private external fun _wasm_libc_vxworks_dup2(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_pipe(p0)")
private external fun _wasm_libc_vxworks_pipe(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_unlink(p0)")
private external fun _wasm_libc_vxworks_unlink(p0: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_lseek(p0, p1, p2)")
private external fun _wasm_libc_vxworks_lseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_getaddrinfo(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_getaddrinfo(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_freeaddrinfo(p0)")
private external fun _wasm_libc_vxworks_freeaddrinfo(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_signal(p0, p1)")
private external fun _wasm_libc_vxworks_signal(p0: Int, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_getpid()")
private external fun _wasm_libc_vxworks_getpid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_getppid()")
private external fun _wasm_libc_vxworks_getppid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_setpgid(p0, p1)")
private external fun _wasm_libc_vxworks_setpgid(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_waitpid(p0, p1, p2)")
private external fun _wasm_libc_vxworks_waitpid(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_sysconf(p0)")
private external fun _wasm_libc_vxworks_sysconf(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_setenv(p0, p1, p2)")
private external fun _wasm_libc_vxworks_setenv(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_unsetenv(p0)")
private external fun _wasm_libc_vxworks_unsetenv(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_realpath(p0, p1)")
private external fun _wasm_libc_vxworks_realpath(p0: String?, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_link(p0, p1)")
private external fun _wasm_libc_vxworks_link(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_readlink(p0, p1, p2)")
private external fun _wasm_libc_vxworks_readlink(p0: String?, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_symlink(p0, p1)")
private external fun _wasm_libc_vxworks_symlink(p0: String?, p1: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_opendir(p0)")
private external fun _wasm_libc_vxworks_opendir(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_rmdir(p0)")
private external fun _wasm_libc_vxworks_rmdir(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_mkdir(p0, p1)")
private external fun _wasm_libc_vxworks_mkdir(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_chmod(p0, p1)")
private external fun _wasm_libc_vxworks_chmod(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_fchmod(p0, p1)")
private external fun _wasm_libc_vxworks_fchmod(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_fsync(p0)")
private external fun _wasm_libc_vxworks_fsync(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_closedir(p0)")
private external fun _wasm_libc_vxworks_closedir(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_schedGetPriorityMax(p0)")
private external fun _wasm_libc_vxworks_schedGetPriorityMax(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_schedGetPriorityMin(p0)")
private external fun _wasm_libc_vxworks_schedGetPriorityMin(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_schedSetparam(p0, p1)")
private external fun _wasm_libc_vxworks_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_schedGetparam(p0, p1)")
private external fun _wasm_libc_vxworks_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_vxworks_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_schedGetscheduler(p0)")
private external fun _wasm_libc_vxworks_schedGetscheduler(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_schedRrGetInterval(p0, p1)")
private external fun _wasm_libc_vxworks_schedRrGetInterval(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_schedYield()")
private external fun _wasm_libc_vxworks_schedYield(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_errnoSet(p0)")
private external fun _wasm_libc_vxworks_errnoSet(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_errnoGet()")
private external fun _wasm_libc_vxworks_errnoGet(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_setgid(p0)")
private external fun _wasm_libc_vxworks_setgid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_getgid()")
private external fun _wasm_libc_vxworks_getgid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_setuid(p0)")
private external fun _wasm_libc_vxworks_setuid(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_getuid()")
private external fun _wasm_libc_vxworks_getuid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_sigemptyset(p0)")
private external fun _wasm_libc_vxworks_sigemptyset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_sigfillset(p0)")
private external fun _wasm_libc_vxworks_sigfillset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_sigdelset(p0, p1)")
private external fun _wasm_libc_vxworks_sigdelset(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_sigismember(p0, p1)")
private external fun _wasm_libc_vxworks_sigismember(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_vxworks_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_kill(p0, p1)")
private external fun _wasm_libc_vxworks_kill(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_taskKill(p0, p1)")
private external fun _wasm_libc_vxworks_taskKill(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_raise(p0)")
private external fun _wasm_libc_vxworks_raise(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_taskIdSelf()")
private external fun _wasm_libc_vxworks_taskIdSelf(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_taskDelay(p0)")
private external fun _wasm_libc_vxworks_taskDelay(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_taskNameSet(p0, p1)")
private external fun _wasm_libc_vxworks_taskNameSet(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_taskNameGet(p0, p1, p2)")
private external fun _wasm_libc_vxworks_taskNameGet(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_rtpInfoGet(p0, p1)")
private external fun _wasm_libc_vxworks_rtpInfoGet(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_rtpSpawn(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_rtpSpawn(p0: String?, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_pathIsAbsolute(p0, p1)")
private external fun _wasm_libc_vxworks_pathIsAbsolute(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_writev(p0, p1, p2)")
private external fun _wasm_libc_vxworks_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_readv(p0, p1, p2)")
private external fun _wasm_libc_vxworks_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_randBytes(p0, p1)")
private external fun _wasm_libc_vxworks_randBytes(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_randABytes(p0, p1)")
private external fun _wasm_libc_vxworks_randABytes(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_randUBytes(p0, p1)")
private external fun _wasm_libc_vxworks_randUBytes(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_randSecure()")
private external fun _wasm_libc_vxworks_randSecure(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_vxworks_mqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_vxworks_mqOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_mqClose(p0)")
private external fun _wasm_libc_vxworks_mqClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_vxworks_mqUnlink(p0)")
private external fun _wasm_libc_vxworks_mqUnlink(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_mqReceive(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_mqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_vxworks_mqTimedreceive(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_vxworks_mqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_vxworks_mqSend(p0, p1, p2, p3)")
private external fun _wasm_libc_vxworks_mqSend(p0: String, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_vxworks_mqTimedsend(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_vxworks_mqTimedsend(p0: String, p1: String?, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_vxworks_mqGetattr(p0, p1)")
private external fun _wasm_libc_vxworks_mqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_vxworks_mqSetattr(p0, p1, p2)")
private external fun _wasm_libc_vxworks_mqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_vxCpuEnabledGet()")
private external fun _wasm_libc_vxworks_vxCpuEnabledGet(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_vxworks_vxCpuConfiguredGet()")
private external fun _wasm_libc_vxworks_vxCpuConfiguredGet(): Int

public actual fun isalnum(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_iscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_islower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_ispunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isblank(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_tolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_toupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fopen(filename, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_freopen(filename, mode, (file?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fflush((file?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fclose((file?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_remove(filename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: String?, newname: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_rename(oldname, newname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): FILE? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_tmpfile().toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_putchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fgetc((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fputc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fputs(s, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_puts(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_ungetc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fread((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: FILE?): CLong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_ftell((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: FILE?) {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_rewind((stream?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fgetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fsetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_feof((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_ferror((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: String?) {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_perror(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: String?): CDouble =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_atof(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_atoi(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: String?): CLong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_atol(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: String?): CLonglong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_atoll(s).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strtod(s, (endp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strtof(s, (endp?.value ?: 0L).toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strtol(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strtoll(s, (endp?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strtoul(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strtoull(s, (endp?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_calloc(nobj.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_malloc(size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_realloc((p?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: COpaquePointer?) {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_free((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_atexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_system(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getenv(s).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_cfgetospeed((termios?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_cfmakeraw((termios?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_cfsetispeed((termios?.value ?: 0L).toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_cfsetospeed((termios?.value ?: 0L).toString(), speed.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strcpy((dst?.value ?: 0L).toString(), src).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strncpy((dst?.value ?: 0L).toString(), src, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strcat((s?.value ?: 0L).toString(), ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strncat((s?.value ?: 0L).toString(), ct, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strcmp(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strncmp(cs, ct, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strcoll(cs, ct) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strrchr(cs, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strcspn(cs, ct).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strdup(cs).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strpbrk(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strstr(cs, ct).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strcasecmp(s1, s2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strncasecmp(s1, s2, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strlen(cs).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strnlen(cs, n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strerror(n).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strtok((s?.value ?: 0L).toString(), t).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_wcslen((buf?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_wcstombs((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_memchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_wmemchr((cx?.value ?: 0L).toString(), c.toInt(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_memccpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_memset((dest?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_alignedAlloc(alignment.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: COpaquePointer?): ClockT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_times((buf?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_tcflush(fd, action) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pclose((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mkdtemp((template?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_linkat(olddirfd, oldpath, newdirfd, newpath, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_unlinkat(dirfd, pathname, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getprotobyname(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getprotobynumber(proto).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getservbyname(name, proto).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fchownat(dirfd, pathname, owner.toInt(), group.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fprintf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_printf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_snprintf((s?.value ?: 0L).toString(), n.toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sprintf((s?.value ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fscanf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_scanf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sscanf(s, format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getcharUnlocked() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_putcharUnlocked(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_stat(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fdopen(fd, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: FILE?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fileno((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: String?, mode: ModeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_creat(path, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: DIR?) {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_rewinddir((dirp?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fchown(fd, owner.toInt(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: String?, amode: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_access(path, amode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_alarm(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchdir(dirfd: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fchdir(dirfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_chown(path, uid.toInt(), gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fpathconf(filedes, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getegid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_geteuid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getgroups(ngroupsMax, (groups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getlogin().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getopt(argc, (argv?.value ?: 0L).toString(), optstr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: String?, name: CInt): CLong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pathconf(path, name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pause() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_seteuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_setegid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sleep(secs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_ttyname(fd).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: COpaquePointer?): PidT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_wait((status?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_umask(mask) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mlock((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mlockall(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_munlock((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_munlockall() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_munmap((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: String?, length: OffT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_truncate(path, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_shmOpen(name, oflag, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_pthreadExit((value?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadEqual(t1.toLong().toString(), t2.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sigaddset((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sigaction(signum, (act?.value ?: 0L).toString(), (oldact?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_utimes(filename, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_dlopen(filename, flag).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_dlerror().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_dlsym((handle?.value ?: 0L).toString(), symbol).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_dlclose((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_dladdr((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_gmtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_localtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: COpaquePointer?): TimeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mktime((tm?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: COpaquePointer?): TimeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_time((time?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_gmtime((timeP?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_localtime((timeP?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: COpaquePointer?): TimeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_timegm((tm?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_difftime(time1.toString(), time0.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_gethostname((name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: UsecondsT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_usleep(secs.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_putenv((string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_setlocale(category, locale).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_localeconv().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sigprocmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sigpending((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mkfifo(path, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: FILE?): OffT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_ftello((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mkstemp((template?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_tmpnam((ptr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_openlog(ident, logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_closelog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_setlogmask(maskpri) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_syslog(priority, message, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getline((lineptr?.value ?: 0L).toString(), (n?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_tcsetattr(fd, optionalActions, (termios?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_tcgetattr(fd, (termios?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_tcsendbreak(fd, duration) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_confstr(name, (buf?.value ?: 0L).toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fnmatch(pattern, name, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_symlinkat(target, newdirfd, linkpath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fchmodat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_utime(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_memalign(blockSize.toString(), sizeArg.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getcwd((buf?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(attr: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_chdir(attr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadMutexattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(pAttr: COpaquePointer?, pType: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadMutexattrSettype((pAttr?.value ?: 0L).toString(), pType) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadMutexInit((mutex?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadMutexDestroy((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadMutexLock((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadMutexTrylock((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(attr: COpaquePointer?, spec: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadMutexTimedlock((attr?.value ?: 0L).toString(), (spec?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadMutexUnlock((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetname(pAttr: COpaquePointer?, name: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAttrSetname((pAttr?.value ?: 0L).toString(), (name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAttrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(pThread: COpaquePointer?, pAttr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCreate((pThread?.value ?: 0L).toString(), (pAttr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAttrSetinheritsched((attr?.value ?: 0L).toString(), inheritsched) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAttrSetschedpolicy((attr?.value ?: 0L).toString(), policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(thread: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAttrDestroy((thread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadDetach(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fstat(fildes, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_lstat(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_ftruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(pDir: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_readdirR((pDir?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(pDir: DIR?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_readdir((pDir?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_open(path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_poll((fds?.value ?: 0L).toString(), nfds.toInt(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(pAttr: COpaquePointer?, pClockId: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondattrGetclock((pAttr?.value ?: 0L).toString(), (pClockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(pAttr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondattrSetclock((pAttr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondDestroy((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondSignal((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondBroadcast((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondWait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetmaxreaders(attr: COpaquePointer?, attr2: CUint): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockattrSetmaxreaders((attr?.value ?: 0L).toString(), attr2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockInit((attr?.value ?: 0L).toString(), (host?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockRdlock((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockTryrdlock((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedrdlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockTimedrdlock((attr?.value ?: 0L).toString(), (host?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockWrlock((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockTrywrlock((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedwrlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockTimedwrlock((attr?.value ?: 0L).toString(), (host?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadRwlockUnlock((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadKeyDelete(key.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadSetspecific(key.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadGetspecific(key.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetname(attr: COpaquePointer?, name: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadAttrGetname((attr?.value ?: 0L).toString(), (name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadJoin(thread.toLong().toString(), (status?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadSelf().toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_clockGettime(clockId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_clockSettime(clockId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_clockGetres(clockId, (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_clockNanosleep(clockId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_nanosleep((rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_accept(s, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_bind(fd, (addr?.value ?: 0L).toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: CInt, name: COpaquePointer?, namelen: SocklenT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_connect(s, (name?.value ?: 0L).toString(), namelen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: CInt, name: COpaquePointer?, namelen: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getpeername(s, (name?.value ?: 0L).toString(), (namelen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getsockname(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_listen(socket, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_recv(s, (buf?.value ?: 0L).toString(), bufLen.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: COpaquePointer?, pFromLen: COpaquePointer?): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_recvfrom(s, (buf?.value ?: 0L).toString(), bufLen.toString(), flags, (from?.value ?: 0L).toString(), (pFromLen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_recvmsg(socket, (mp?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_send(socket, (buf?.value ?: 0L).toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sendmsg(socket, (mp?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sendto(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), addrlen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_setsockopt(socket, level, name, (value?.value ?: 0L).toString(), optionLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(s: CInt, how: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_shutdown(s, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_socket(domain, type, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_gaiStrerror(errcode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_close(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_read(fd, (buf?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_write(fd, (buf?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_isatty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(src: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_dup(src) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_dup2(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pipe((fds?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(pathname: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_unlink(pathname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_lseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getaddrinfo(node, service, (hints?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: COpaquePointer?) {
    if (_vxworksNapiAvailable) {
        _wasm_libc_vxworks_freeaddrinfo((res?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_signal(signum, handler.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getppid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_setpgid(pid, pgid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_waitpid(pid, (status?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(attr: CInt): CLong =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sysconf(attr).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_setenv(envVarName, envVarValue, overwrite) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(envVarName: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_unsetenv(envVarName) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_realpath(fileName, (resolvedName?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: String?, dst: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_link(src, dst) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_readlink(path, (buf?.value ?: 0L).toString(), bufsize.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: String?, path2: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_symlink(path1, path2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(name: String?): DIR? =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_opendir(name).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_rmdir(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mkdir(dirName, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_chmod(path, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fchmod(attr1, attr2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_fsync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(ptr: DIR?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_closedir((ptr?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_schedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_schedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_schedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoSet(err: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_errnoSet(err) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoGet(): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_errnoGet() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_setgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getgid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_setuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_getuid().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sigemptyset((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sigfillset((set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sigdelset((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_sigismember((set?.value ?: 0L).toString(), signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, signo: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_kill(pid, signo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_taskKill(taskId, signo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signo: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_raise(signo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskIdSelf(): TaskId =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_taskIdSelf() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDelay(ticks: VxTicksT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_taskDelay(ticks.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskNameSet(taskId: TaskId, taskName: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_taskNameSet(taskId, (taskName?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskNameGet(taskId: TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_taskNameGet(taskId, (bufName?.value ?: 0L).toString(), bufsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_rtpInfoGet(rtpId, (rtpStruct?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_rtpSpawn(pubrtpFileName, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString(), priority, uStackSize.toString(), options, taskOptions) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_pathIsAbsolute(filepath, (pNameTail?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randBytes(buf: COpaquePointer?, length: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_randBytes((buf?.value ?: 0L).toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randABytes(buf: COpaquePointer?, length: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_randABytes((buf?.value ?: 0L).toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randUBytes(buf: COpaquePointer?, length: CInt): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_randUBytes((buf?.value ?: 0L).toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randSecure(): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_randSecure() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mqClose(mqd.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: String?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mqUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mqReceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mqTimedreceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mqSend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mqTimedsend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mqGetattr(mqd.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_mqSetattr(mqd.toLong().toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuEnabledGet(): CpusetT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_vxCpuEnabledGet().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuConfiguredGet(): CpusetT =
    if (_vxworksNapiAvailable) _wasm_libc_vxworks_vxCpuConfiguredGet().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
