@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeEmscriptenNapiAddon(): Boolean

private val _unixLinuxlikeEmscriptenNapiAvailable: Boolean = _initUnixLinuxlikeEmscriptenNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_emscripten_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_emscripten_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_abs(p0)")
private external fun _wasm_libc_unix_linuxlike_emscripten_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_labs(p0)")
private external fun _wasm_libc_unix_linuxlike_emscripten_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_rand()")
private external fun _wasm_libc_unix_linuxlike_emscripten_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_srand(p0)")
private external fun _wasm_libc_unix_linuxlike_emscripten_srand(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_emscripten_gettimeofday(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_setpwent()")
private external fun _wasm_libc_unix_linuxlike_emscripten_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_endpwent()")
private external fun _wasm_libc_unix_linuxlike_emscripten_endpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getpwent()")
private external fun _wasm_libc_unix_linuxlike_emscripten_getpwent(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_errnoLocation()")
private external fun _wasm_libc_unix_linuxlike_emscripten_errnoLocation(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_emscripten_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_emscripten_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_dup3(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_dup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_nlLanginfoL(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_emscripten_nlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_emscripten_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_linuxlike_emscripten_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getloadavg(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_emscripten_getloadavg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_mremap(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_libc_unix_linuxlike_emscripten_mremap(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_glob(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_emscripten_glob(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_globfree(p0)")
private external fun _wasm_libc_unix_linuxlike_emscripten_globfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_posixMadvise(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_posixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_shmUnlink(p0)")
private external fun _wasm_libc_unix_linuxlike_emscripten_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_seekdir(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_emscripten_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_telldir(p0)")
private external fun _wasm_libc_unix_linuxlike_emscripten_telldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_madvise(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_emscripten_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_mkstemps(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_emscripten_mkstemps(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_nlLanginfo(p0)")
private external fun _wasm_libc_unix_linuxlike_emscripten_nlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_sendmmsg(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_emscripten_sendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_recvmmsg(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_emscripten_recvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_sync()")
private external fun _wasm_libc_unix_linuxlike_emscripten_sync()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_linuxlike_emscripten_ioctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getpriority(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_emscripten_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_emscripten_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getentropy(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_emscripten_getentropy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getgrgid(p0)")
private external fun _wasm_libc_unix_linuxlike_emscripten_getgrgid(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getgrnam(p0)")
private external fun _wasm_libc_unix_linuxlike_emscripten_getgrnam(p0: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_emscripten_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_emscripten_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_emscripten_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_setrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixLinuxlikeEmscriptenNapiAvailable) {
        _wasm_libc_unix_linuxlike_emscripten_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_unixLinuxlikeEmscriptenNapiAvailable) {
        _wasm_libc_unix_linuxlike_emscripten_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixLinuxlikeEmscriptenNapiAvailable) {
        _wasm_libc_unix_linuxlike_emscripten_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_errnoLocation().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_dup3(oldfd, newfd, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_nlLanginfoL(item, (locale?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_accept4(fd, (addr?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), flg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getloadavg((loadavg?.value ?: 0L).toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_mremap((addr?.value ?: 0L).toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixLinuxlikeEmscriptenNapiAvailable) {
        _wasm_libc_unix_linuxlike_emscripten_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixLinuxlikeEmscriptenNapiAvailable) {
        _wasm_libc_unix_linuxlike_emscripten_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_mkstemps((template?.value ?: 0L).toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_nlLanginfo(item).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags.toInt(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixLinuxlikeEmscriptenNapiAvailable) {
        _wasm_libc_unix_linuxlike_emscripten_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_setpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeEmscriptenNapiAvailable) _wasm_libc_unix_linuxlike_emscripten_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
