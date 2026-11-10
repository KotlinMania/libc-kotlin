@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixNewlibNapiAddon(): Boolean

private val _unixNewlibNapiAvailable: Boolean = _initUnixNewlibNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_newlib_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_newlib_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_semDestroy(p0)")
private external fun _wasm_libc_unix_newlib_semDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_semInit(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_abs(p0)")
private external fun _wasm_libc_unix_newlib_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_labs(p0)")
private external fun _wasm_libc_unix_newlib_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_newlib_rand()")
private external fun _wasm_libc_unix_newlib_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_srand(p0)")
private external fun _wasm_libc_unix_newlib_srand(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_bind(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_clockSettime(p0, p1)")
private external fun _wasm_libc_unix_newlib_clockSettime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_newlib_clockGettime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_clockGetres(p0, p1)")
private external fun _wasm_libc_unix_newlib_clockGetres(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_closesocket(p0)")
private external fun _wasm_libc_unix_newlib_closesocket(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_newlib_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_newlib_ioctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_newlib_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_newlib_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_newlib_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_newlib_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_memalign(p0, p1)")
private external fun _wasm_libc_unix_newlib_memalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_fexecve(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_fexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_newlib_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_newlib_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_newlib_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_sigaltstack(p0, p1)")
private external fun _wasm_libc_unix_newlib_sigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_semClose(p0)")
private external fun _wasm_libc_unix_newlib_semClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_newlib_getdtablesize()")
private external fun _wasm_libc_unix_newlib_getdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_newlib_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_newlib_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_newlib_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_newlib_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_getgrnam(p0)")
private external fun _wasm_libc_unix_newlib_getgrnam(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_pthreadKill(p0, p1)")
private external fun _wasm_libc_unix_newlib_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_semUnlink(p0)")
private external fun _wasm_libc_unix_newlib_semUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_daemon(p0, p1)")
private external fun _wasm_libc_unix_newlib_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_newlib_getpwnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_newlib_getpwnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_newlib_getpwuidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_newlib_getpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_sigwait(p0, p1)")
private external fun _wasm_libc_unix_newlib_sigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_getgrgid(p0)")
private external fun _wasm_libc_unix_newlib_getgrgid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_popen(p0, p1)")
private external fun _wasm_libc_unix_newlib_popen(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_newlib_uname(p0)")
private external fun _wasm_libc_unix_newlib_uname(p0: String): Int

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_getrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_setrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixNewlibNapiAvailable) {
        _wasm_libc_unix_newlib_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_bind(fd, (addr?.value ?: 0L).toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_clockSettime(clockId.toString(), (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_clockGettime(clockId.toString(), (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_clockGetres(clockId.toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closesocket(sockfd: CInt): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_closesocket(sockfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_ioctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: COpaquePointer?, addrLen: COpaquePointer?): Long =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_recvfrom(fd, (buf?.value ?: 0L).toString(), n.toString(), flags, (addr?.value ?: 0L).toString(), (addrLen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_pthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixNewlibNapiAvailable) _wasm_libc_unix_newlib_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
