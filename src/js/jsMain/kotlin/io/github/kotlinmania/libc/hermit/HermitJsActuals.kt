@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val hermitNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun alloc(size: ULong, align: ULong): MutPtr =
    if (hermitNapiAddon != null) MutPtr((hermitNapiAddon.libcHermitAlloc(size.toString(), align.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocZeroed(size: ULong, align: ULong): MutPtr =
    if (hermitNapiAddon != null) MutPtr((hermitNapiAddon.libcHermitAllocZeroed(size.toString(), align.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: MutPtr, size: ULong, align: ULong, newSize: ULong): MutPtr =
    if (hermitNapiAddon != null) MutPtr((hermitNapiAddon.libcHermitRealloc(ptr.rawAddress.toString(), size.toString(), align.toString(), newSize.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dealloc(ptr: MutPtr, size: ULong, align: ULong) {
    if (hermitNapiAddon != null) {
        hermitNapiAddon.libcHermitDealloc(ptr.rawAddress.toString(), size.toString(), align.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exit(status: Int): Nothing {
    if (hermitNapiAddon != null) {
        hermitNapiAddon.libcHermitExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (hermitNapiAddon != null) {
        hermitNapiAddon.libcHermitAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun errno(): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitErrno() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitClockGettime(clockid, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(req: ConstPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitNanosleep(req.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun availableParallelism(): ULong =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitAvailableParallelism() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futexWait(address: MutPtr, expected: UInt, timeout: ConstPtr, flags: UInt): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitFutexWait(address.rawAddress.toString(), expected.toInt(), timeout.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futexWake(address: MutPtr, count: Int): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitFutexWake(address.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr, stat: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitStat(path.rawAddress.toString(), stat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fd: Int, stat: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitFstat(fd, stat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr, stat: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitLstat(path.rawAddress.toString(), stat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr, flags: Int, mode: ModeT): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitOpen(path.rawAddress.toString(), flags, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(path: ConstPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitUnlink(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr, mode: ModeT): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitMkdir(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitRmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: Int, buf: MutPtr, len: ULong): Long =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitRead(fd, buf.rawAddress.toString(), len.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: Int, buf: ConstPtr, len: ULong): Long =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitWrite(fd, buf.rawAddress.toString(), len.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: Int, iov: ConstPtr, iovcnt: ULong): Long =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitReadv(fd, iov.rawAddress.toString(), iovcnt.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: Int, iov: ConstPtr, iovcnt: ULong): Long =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitWritev(fd, iov.rawAddress.toString(), iovcnt.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: Int): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitClose(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: Int): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitDup(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitFcntl(fd, cmd, arg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdents64(fd: Int, dirp: MutPtr, count: ULong): Long =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitGetdents64(fd, dirp.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(nodename: ConstPtr, servname: ConstPtr, hints: ConstPtr, res: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitGetaddrinfo(nodename.rawAddress.toString(), servname.rawAddress.toString(), hints.rawAddress.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(ai: MutPtr) {
    if (hermitNapiAddon != null) {
        hermitNapiAddon.libcHermitFreeaddrinfo(ai.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitSocket(domain, ty, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(sockfd: Int, addr: ConstPtr, addrlen: SocklenT): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitBind(sockfd, addr.rawAddress.toString(), addrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(sockfd: Int, backlog: Int): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitListen(sockfd, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(sockfd: Int, addr: MutPtr, addrlen: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitAccept(sockfd, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(sockfd: Int, addr: ConstPtr, addrlen: SocklenT): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitConnect(sockfd, addr.rawAddress.toString(), addrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(sockfd: Int, buf: MutPtr, len: ULong, flags: Int): Long =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitRecv(sockfd, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(sockfd: Int, buf: MutPtr, len: ULong, flags: Int, addr: MutPtr, addrlen: MutPtr): Long =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitRecvfrom(sockfd, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(sockfd: Int, buf: ConstPtr, len: ULong, flags: Int): Long =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitSend(sockfd, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(sockfd: Int, buf: ConstPtr, len: ULong, flags: Int, to: ConstPtr, tolen: SocklenT): Long =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitSendto(sockfd, buf.rawAddress.toString(), len.toString(), flags, to.rawAddress.toString(), tolen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(sockfd: Int, addr: MutPtr, addrlen: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitGetpeername(sockfd, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(sockfd: Int, addr: MutPtr, addrlen: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitGetsockname(sockfd, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: MutPtr, optlen: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitGetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: ConstPtr, optlen: SocklenT): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitSetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(sockfd: Int, cmd: Int, argp: MutPtr): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitIoctl(sockfd, cmd, argp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(sockfd: Int, how: Int): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitShutdown(sockfd, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: ULong, flags: Short): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitEventfd(initval.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: Int): Int =
    if (hermitNapiAddon != null) (hermitNapiAddon.libcHermitPoll(fds.rawAddress.toString(), nfds.toString(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
