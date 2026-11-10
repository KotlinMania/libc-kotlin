@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtNapiAddon(): Boolean

private val _newQurtNapiAvailable: Boolean = _initNewQurtNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_opendir(p0)")
private external fun _wasm_libc_new_qurt_opendir(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_readdir(p0)")
private external fun _wasm_libc_new_qurt_readdir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_closedir(p0)")
private external fun _wasm_libc_new_qurt_closedir(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_mkdir(p0, p1)")
private external fun _wasm_libc_new_qurt_mkdir(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_pthreadAttrSetstack(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_pthreadAttrSetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_clockGetcpuclockid(p0, p1)")
private external fun _wasm_libc_new_qurt_clockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_new_qurt_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_new_qurt_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_semClose(p0)")
private external fun _wasm_libc_new_qurt_semClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_semUnlink(p0)")
private external fun _wasm_libc_new_qurt_semUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_alignedAlloc(p0, p1)")
private external fun _wasm_libc_new_qurt_alignedAlloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_strlen(p0)")
private external fun _wasm_libc_new_qurt_strlen(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strcpy(p0, p1)")
private external fun _wasm_libc_new_qurt_strcpy(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_strncpy(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_strncpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strcat(p0, p1)")
private external fun _wasm_libc_new_qurt_strcat(p0: String, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_strncat(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_strncat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strcmp(p0, p1)")
private external fun _wasm_libc_new_qurt_strcmp(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_strncmp(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_strncmp(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strcoll(p0, p1)")
private external fun _wasm_libc_new_qurt_strcoll(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_strxfrm(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_strxfrm(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strchr(p0, p1)")
private external fun _wasm_libc_new_qurt_strchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strrchr(p0, p1)")
private external fun _wasm_libc_new_qurt_strrchr(p0: String?, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strspn(p0, p1)")
private external fun _wasm_libc_new_qurt_strspn(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strcspn(p0, p1)")
private external fun _wasm_libc_new_qurt_strcspn(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strpbrk(p0, p1)")
private external fun _wasm_libc_new_qurt_strpbrk(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strstr(p0, p1)")
private external fun _wasm_libc_new_qurt_strstr(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_strtok(p0, p1)")
private external fun _wasm_libc_new_qurt_strtok(p0: String, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_strerror(p0)")
private external fun _wasm_libc_new_qurt_strerror(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_memchr(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_memchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_memcmp(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_memcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_memcpy(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_memcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_memmove(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_memmove(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_memset(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_memset(p0: String, p1: Int, p2: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_fork()")
private external fun _wasm_libc_new_qurt_fork(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_execve(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_execve(p0: String?, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_isalnum(p0)")
private external fun _wasm_libc_new_qurt_isalnum(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_isalpha(p0)")
private external fun _wasm_libc_new_qurt_isalpha(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_iscntrl(p0)")
private external fun _wasm_libc_new_qurt_iscntrl(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_isdigit(p0)")
private external fun _wasm_libc_new_qurt_isdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_isgraph(p0)")
private external fun _wasm_libc_new_qurt_isgraph(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_islower(p0)")
private external fun _wasm_libc_new_qurt_islower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_isprint(p0)")
private external fun _wasm_libc_new_qurt_isprint(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_ispunct(p0)")
private external fun _wasm_libc_new_qurt_ispunct(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_isspace(p0)")
private external fun _wasm_libc_new_qurt_isspace(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_isupper(p0)")
private external fun _wasm_libc_new_qurt_isupper(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_isxdigit(p0)")
private external fun _wasm_libc_new_qurt_isxdigit(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_tolower(p0)")
private external fun _wasm_libc_new_qurt_tolower(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_toupper(p0)")
private external fun _wasm_libc_new_qurt_toupper(p0: Int): Int

public actual fun opendir(name: String?): DIR? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_opendir(name).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_readdir((dirp?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: DIR?): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_closedir((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_mkdir(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_pthreadAttrSetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clockId: COpaquePointer?): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_clockGetcpuclockid(pid, (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_alignedAlloc(alignment.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(s: String?): SizeT =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strlen(s).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strcpy((dest?.value ?: 0L).toString(), src).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strncpy((dest?.value ?: 0L).toString(), src, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(dest: COpaquePointer?, src: String?): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strcat((dest?.value ?: 0L).toString(), src).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strncat((dest?.value ?: 0L).toString(), src, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(s1: String?, s2: String?): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strcmp(s1, s2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(s1: String?, s2: String?, n: SizeT): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strncmp(s1, s2, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(s1: String?, s2: String?): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strcoll(s1, s2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strxfrm((dest?.value ?: 0L).toString(), src, n.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(s: String?, c: CInt): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strchr(s, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(s: String?, c: CInt): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strrchr(s, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(s: String?, accept: String?): SizeT =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strspn(s, accept).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(s: String?, reject: String?): SizeT =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strcspn(s, reject).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(s: String?, accept: String?): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strpbrk(s, accept).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(haystack: String?, needle: String?): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strstr(haystack, needle).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: COpaquePointer?, delim: String?): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strtok((s?.value ?: 0L).toString(), delim).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(errnum: CInt): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_strerror(errnum).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_memchr((s?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: SizeT): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_memcmp((s1?.value ?: 0L).toString(), (s2?.value ?: 0L).toString(), n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(s: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_memset((s?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_fork() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(filename: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_execve(filename, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalnum(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_isalnum(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_isalpha(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_iscntrl(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_isdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_isgraph(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_islower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_isprint(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_ispunct(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_isspace(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_isupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_isxdigit(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_tolower(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_newQurtNapiAvailable) _wasm_libc_new_qurt_toupper(c) else throw UnsupportedOperationException("Native FFI addon is not available")
