@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeLinuxUclibcNapiAddon(): Boolean

private val _unixLinuxlikeLinuxUclibcNapiAvailable: Boolean = _initUnixLinuxlikeLinuxUclibcNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrGetkindNp(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrGetkindNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrSetkindNp(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrSetkindNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_ptrace(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_ptrace(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_sendmmsg(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_sendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_recvmmsg(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_recvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_forkpty(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_forkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_sethostid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_sethostid(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_fanotifyMark(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_fanotifyMark(p0: Int, p1: Int, p2: String, p3: Int, p4: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_getrlimit64(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_getrlimit64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_setrlimit64(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_setrlimit64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_getrlimit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_setrlimit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_getpriority(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_uclibc_getauxval(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_uclibc_getauxval(p0: String): String

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrGetkindNp((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_pthreadRwlockattrSetkindNp((attr?.value ?: 0L).toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_ptrace(request.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_sethostid(hostid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_fanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_getrlimit64(resource.toString(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_setrlimit64(resource.toString(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_getrlimit(resource.toString(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_setrlimit(resource.toString(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_getpriority(which.toInt(), who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_setpriority(which.toInt(), who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (_unixLinuxlikeLinuxUclibcNapiAvailable) _wasm_libc_unix_linuxlike_linux_uclibc_getauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
