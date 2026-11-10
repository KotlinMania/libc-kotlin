@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

private val _hermitNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun alloc(size: ULong, align: ULong): COpaquePointer? =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_alloc(size.toString(), align.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocZeroed(size: ULong, align: ULong): COpaquePointer? =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_allocZeroed(size.toString(), align.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: COpaquePointer?, size: ULong, align: ULong, newSize: ULong): COpaquePointer? =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_realloc((ptr?.value ?: 0L).toString(), size.toString(), align.toString(), newSize.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dealloc(ptr: COpaquePointer?, size: ULong, align: ULong) {
    if (_hermitNapiAddon != null) {
        _hermitNapiAddon.libc_hermit_dealloc((ptr?.value ?: 0L).toString(), size.toString(), align.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exit(status: Int): Nothing {
    if (_hermitNapiAddon != null) {
        _hermitNapiAddon.libc_hermit_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (_hermitNapiAddon != null) {
        _hermitNapiAddon.libc_hermit_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun errno(): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_errno() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_clockGettime(clockid, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(req: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_nanosleep((req?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun availableParallelism(): ULong =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_availableParallelism() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futexWait(address: COpaquePointer?, expected: UInt, timeout: COpaquePointer?, flags: UInt): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_futexWait((address?.value ?: 0L).toString(), expected.toInt(), (timeout?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futexWake(address: COpaquePointer?, count: Int): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_futexWake((address?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: String?, stat: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_stat(path, (stat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fd: Int, stat: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_fstat(fd, (stat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: String?, stat: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_lstat(path, (stat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: String?, flags: Int, mode: ModeT): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_open(path, flags, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(path: String?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_unlink(path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: String?, mode: ModeT): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_mkdir(path, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: String?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_rmdir(path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_read(fd, (buf?.value ?: 0L).toString(), len.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: Int, buf: COpaquePointer?, len: ULong): Long =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_write(fd, (buf?.value ?: 0L).toString(), len.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_readv(fd, (iov?.value ?: 0L).toString(), iovcnt.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: Int, iov: COpaquePointer?, iovcnt: ULong): Long =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_writev(fd, (iov?.value ?: 0L).toString(), iovcnt.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: Int): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_close(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: Int): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_dup(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_fcntl(fd, cmd, arg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdents64(fd: Int, dirp: COpaquePointer?, count: ULong): Long =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_getdents64(fd, (dirp?.value ?: 0L).toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(nodename: String?, servname: String?, hints: COpaquePointer?, res: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_getaddrinfo(nodename, servname, (hints?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(ai: COpaquePointer?) {
    if (_hermitNapiAddon != null) {
        _hermitNapiAddon.libc_hermit_freeaddrinfo((ai?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_socket(domain, ty, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_bind(sockfd, (addr?.value ?: 0L).toString(), addrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(sockfd: Int, backlog: Int): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_listen(sockfd, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_accept(sockfd, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_connect(sockfd, (addr?.value ?: 0L).toString(), addrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_recv(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Long =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_recvfrom(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_send(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, tolen: SocklenT): Long =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_sendto(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags, (to?.value ?: 0L).toString(), tolen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_getpeername(sockfd, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(sockfd: Int, addr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_getsockname(sockfd, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: SocklenT): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_setsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), optlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(sockfd: Int, cmd: Int, argp: COpaquePointer?): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_ioctl(sockfd, cmd, (argp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(sockfd: Int, how: Int): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_shutdown(sockfd, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: ULong, flags: Short): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_eventfd(initval.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: Int): Int =
    if (_hermitNapiAddon != null) (_hermitNapiAddon.libc_hermit_poll((fds?.value ?: 0L).toString(), nfds.toString(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
