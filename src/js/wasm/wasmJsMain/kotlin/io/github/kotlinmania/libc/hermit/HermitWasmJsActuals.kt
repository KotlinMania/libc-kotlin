@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initHermitNapiAddon(): Boolean

private val _hermitNapiAvailable: Boolean = _initHermitNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_alloc(p0, p1)")
private external fun _wasm_libc_hermit_alloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_allocZeroed(p0, p1)")
private external fun _wasm_libc_hermit_allocZeroed(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_hermit_realloc(p0, p1, p2, p3)")
private external fun _wasm_libc_hermit_realloc(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_dealloc(p0, p1, p2)")
private external fun _wasm_libc_hermit_dealloc(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_hermit_exit(p0)")
private external fun _wasm_libc_hermit_exit(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_hermit_abort()")
private external fun _wasm_libc_hermit_abort()

@JsFun("() => globalThis.__km_napi_libc.libc_hermit_errno()")
private external fun _wasm_libc_hermit_errno(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_clockGettime(p0, p1)")
private external fun _wasm_libc_hermit_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_hermit_nanosleep(p0)")
private external fun _wasm_libc_hermit_nanosleep(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_hermit_availableParallelism()")
private external fun _wasm_libc_hermit_availableParallelism(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_hermit_futexWait(p0, p1, p2, p3)")
private external fun _wasm_libc_hermit_futexWait(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_futexWake(p0, p1)")
private external fun _wasm_libc_hermit_futexWake(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_stat(p0, p1)")
private external fun _wasm_libc_hermit_stat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_fstat(p0, p1)")
private external fun _wasm_libc_hermit_fstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_lstat(p0, p1)")
private external fun _wasm_libc_hermit_lstat(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_open(p0, p1, p2)")
private external fun _wasm_libc_hermit_open(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_hermit_unlink(p0)")
private external fun _wasm_libc_hermit_unlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_mkdir(p0, p1)")
private external fun _wasm_libc_hermit_mkdir(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_hermit_rmdir(p0)")
private external fun _wasm_libc_hermit_rmdir(p0: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_read(p0, p1, p2)")
private external fun _wasm_libc_hermit_read(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_write(p0, p1, p2)")
private external fun _wasm_libc_hermit_write(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_readv(p0, p1, p2)")
private external fun _wasm_libc_hermit_readv(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_writev(p0, p1, p2)")
private external fun _wasm_libc_hermit_writev(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_hermit_close(p0)")
private external fun _wasm_libc_hermit_close(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_hermit_dup(p0)")
private external fun _wasm_libc_hermit_dup(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_fcntl(p0, p1, p2)")
private external fun _wasm_libc_hermit_fcntl(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_getdents64(p0, p1, p2)")
private external fun _wasm_libc_hermit_getdents64(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_hermit_getaddrinfo(p0, p1, p2, p3)")
private external fun _wasm_libc_hermit_getaddrinfo(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_hermit_freeaddrinfo(p0)")
private external fun _wasm_libc_hermit_freeaddrinfo(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_socket(p0, p1, p2)")
private external fun _wasm_libc_hermit_socket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_bind(p0, p1, p2)")
private external fun _wasm_libc_hermit_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_listen(p0, p1)")
private external fun _wasm_libc_hermit_listen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_accept(p0, p1, p2)")
private external fun _wasm_libc_hermit_accept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_connect(p0, p1, p2)")
private external fun _wasm_libc_hermit_connect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_hermit_recv(p0, p1, p2, p3)")
private external fun _wasm_libc_hermit_recv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_hermit_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_hermit_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_hermit_send(p0, p1, p2, p3)")
private external fun _wasm_libc_hermit_send(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_hermit_sendto(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_hermit_sendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_getpeername(p0, p1, p2)")
private external fun _wasm_libc_hermit_getpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_getsockname(p0, p1, p2)")
private external fun _wasm_libc_hermit_getsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_hermit_getsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_hermit_getsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_hermit_setsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_hermit_setsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_ioctl(p0, p1, p2)")
private external fun _wasm_libc_hermit_ioctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_shutdown(p0, p1)")
private external fun _wasm_libc_hermit_shutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_hermit_eventfd(p0, p1)")
private external fun _wasm_libc_hermit_eventfd(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_hermit_poll(p0, p1, p2)")
private external fun _wasm_libc_hermit_poll(p0: String, p1: String, p2: Int): Int

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    if (_hermitNapiAvailable) _wasm_libc_hermit_alloc(size.toString(), align.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? =
    if (_hermitNapiAvailable) _wasm_libc_hermit_allocZeroed(size.toString(), align.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? =
    if (_hermitNapiAvailable) _wasm_libc_hermit_realloc((ptr?.value ?: 0L).toString(), size.toString(), align.toString(), newSize.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong) {
    if (_hermitNapiAvailable) {
        _wasm_libc_hermit_dealloc((ptr?.value ?: 0L).toString(), size.toString(), align.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exit(status: Int): Nothing {
    if (_hermitNapiAvailable) {
        _wasm_libc_hermit_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (_hermitNapiAvailable) {
        _wasm_libc_hermit_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun errno(): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_errno() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_clockGettime(clockid, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(req: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_nanosleep((req?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun availableParallelism(): ULong =
    if (_hermitNapiAvailable) _wasm_libc_hermit_availableParallelism().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futexWait(address: COpaquePointer?, expected: UInt, timeout: COpaquePointer?, flags: UInt): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_futexWait((address?.value ?: 0L).toString(), expected.toInt(), (timeout?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futexWake(address: COpaquePointer?, count: Int): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_futexWake((address?.value ?: 0L).toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: String?, stat: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_stat(path, (stat?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fd: Int, stat: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_fstat(fd, (stat?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: String?, stat: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_lstat(path, (stat?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_open(path, flags, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(path: String?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_unlink(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: String?, mode: ModeT): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_mkdir(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: String?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_rmdir(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    if (_hermitNapiAvailable) _wasm_libc_hermit_read(fd, (buf?.value ?: 0L).toString(), len.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    if (_hermitNapiAvailable) _wasm_libc_hermit_write(fd, (buf?.value ?: 0L).toString(), len.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    if (_hermitNapiAvailable) _wasm_libc_hermit_readv(fd, (iov?.value ?: 0L).toString(), iovcnt.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    if (_hermitNapiAvailable) _wasm_libc_hermit_writev(fd, (iov?.value ?: 0L).toString(), iovcnt.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: Int): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_close(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: Int): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_dup(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_fcntl(fd, cmd, arg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdents64(fd: Int, dirp: COpaquePointer?, count: ULong): Long =
    if (_hermitNapiAvailable) _wasm_libc_hermit_getdents64(fd, (dirp?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(nodename: String?, servname: String?, hints: COpaquePointer?, res: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_getaddrinfo(nodename, servname, (hints?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(ai: COpaquePointer?) {
    if (_hermitNapiAvailable) {
        _wasm_libc_hermit_freeaddrinfo((ai?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_socket(domain, ty, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_bind(sockfd, (addr?.value ?: 0L).toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(sockfd: Int, backlog: Int): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_listen(sockfd, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_accept(sockfd, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_connect(sockfd, (addr?.value ?: 0L).toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    if (_hermitNapiAvailable) _wasm_libc_hermit_recv(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Long =
    if (_hermitNapiAvailable) _wasm_libc_hermit_recvfrom(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    if (_hermitNapiAvailable) _wasm_libc_hermit_send(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, tolen: SocklenT): Long =
    if (_hermitNapiAvailable) _wasm_libc_hermit_sendto(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags, (to?.value ?: 0L).toString(), tolen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_getpeername(sockfd, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_getsockname(sockfd, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_setsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), optlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_ioctl(sockfd, cmd, (argp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(sockfd: Int, how: Int): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_shutdown(sockfd, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: ULong, flags: Short): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_eventfd(initval.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: Int): Int =
    if (_hermitNapiAvailable) _wasm_libc_hermit_poll((fds?.value ?: 0L).toString(), nfds.toString(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")
