@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initHermitNapiAddon(): Boolean

private val hermitNapiAvailable: Boolean = initHermitNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitAlloc(p0, p1)")
private external fun wasmLibcHermitAlloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitAllocZeroed(p0, p1)")
private external fun wasmLibcHermitAllocZeroed(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcHermitRealloc(p0, p1, p2, p3)")
private external fun wasmLibcHermitRealloc(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitDealloc(p0, p1, p2)")
private external fun wasmLibcHermitDealloc(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcHermitExit(p0)")
private external fun wasmLibcHermitExit(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcHermitAbort()")
private external fun wasmLibcHermitAbort()

@JsFun("() => globalThis.__km_napi_libc.libcHermitErrno()")
private external fun wasmLibcHermitErrno(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitClockGettime(p0, p1)")
private external fun wasmLibcHermitClockGettime(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcHermitNanosleep(p0)")
private external fun wasmLibcHermitNanosleep(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcHermitAvailableParallelism()")
private external fun wasmLibcHermitAvailableParallelism(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcHermitFutexWait(p0, p1, p2, p3)")
private external fun wasmLibcHermitFutexWait(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitFutexWake(p0, p1)")
private external fun wasmLibcHermitFutexWake(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitStat(p0, p1)")
private external fun wasmLibcHermitStat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitFstat(p0, p1)")
private external fun wasmLibcHermitFstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitLstat(p0, p1)")
private external fun wasmLibcHermitLstat(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitOpen(p0, p1, p2)")
private external fun wasmLibcHermitOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcHermitUnlink(p0)")
private external fun wasmLibcHermitUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitMkdir(p0, p1)")
private external fun wasmLibcHermitMkdir(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcHermitRmdir(p0)")
private external fun wasmLibcHermitRmdir(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitRead(p0, p1, p2)")
private external fun wasmLibcHermitRead(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitWrite(p0, p1, p2)")
private external fun wasmLibcHermitWrite(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitReadv(p0, p1, p2)")
private external fun wasmLibcHermitReadv(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitWritev(p0, p1, p2)")
private external fun wasmLibcHermitWritev(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcHermitClose(p0)")
private external fun wasmLibcHermitClose(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcHermitDup(p0)")
private external fun wasmLibcHermitDup(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitFcntl(p0, p1, p2)")
private external fun wasmLibcHermitFcntl(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitGetdents64(p0, p1, p2)")
private external fun wasmLibcHermitGetdents64(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcHermitGetaddrinfo(p0, p1, p2, p3)")
private external fun wasmLibcHermitGetaddrinfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcHermitFreeaddrinfo(p0)")
private external fun wasmLibcHermitFreeaddrinfo(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitSocket(p0, p1, p2)")
private external fun wasmLibcHermitSocket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitBind(p0, p1, p2)")
private external fun wasmLibcHermitBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitListen(p0, p1)")
private external fun wasmLibcHermitListen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitAccept(p0, p1, p2)")
private external fun wasmLibcHermitAccept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitConnect(p0, p1, p2)")
private external fun wasmLibcHermitConnect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcHermitRecv(p0, p1, p2, p3)")
private external fun wasmLibcHermitRecv(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcHermitRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcHermitRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcHermitSend(p0, p1, p2, p3)")
private external fun wasmLibcHermitSend(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcHermitSendto(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcHermitSendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitGetpeername(p0, p1, p2)")
private external fun wasmLibcHermitGetpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitGetsockname(p0, p1, p2)")
private external fun wasmLibcHermitGetsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcHermitGetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcHermitGetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcHermitSetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcHermitSetsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitIoctl(p0, p1, p2)")
private external fun wasmLibcHermitIoctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitShutdown(p0, p1)")
private external fun wasmLibcHermitShutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcHermitEventfd(p0, p1)")
private external fun wasmLibcHermitEventfd(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcHermitPoll(p0, p1, p2)")
private external fun wasmLibcHermitPoll(p0: String, p1: String, p2: Int): Int

public actual fun alloc(size: ULong, align: ULong): MutPtr<UByte> =
    if (hermitNapiAvailable) MutPtr(wasmLibcHermitAlloc(size.toString(), align.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocZeroed(size: ULong, align: ULong): MutPtr<UByte> =
    if (hermitNapiAvailable) MutPtr(wasmLibcHermitAllocZeroed(size.toString(), align.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: MutPtr<UByte>, size: ULong, align: ULong, newSize: ULong): MutPtr<UByte> =
    if (hermitNapiAvailable) MutPtr(wasmLibcHermitRealloc(ptr.rawAddress.toString(), size.toString(), align.toString(), newSize.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dealloc(ptr: MutPtr<UByte>, size: ULong, align: ULong) {
    if (hermitNapiAvailable) {
        wasmLibcHermitDealloc(ptr.rawAddress.toString(), size.toString(), align.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exit(status: Int): Nothing {
    if (hermitNapiAvailable) {
        wasmLibcHermitExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (hermitNapiAvailable) {
        wasmLibcHermitAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun errno(): Int =
    if (hermitNapiAvailable) wasmLibcHermitErrno() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr<Timespec>): Int =
    if (hermitNapiAvailable) wasmLibcHermitClockGettime(clockid, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(req: ConstPtr<Timespec>): Int =
    if (hermitNapiAvailable) wasmLibcHermitNanosleep(req.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun availableParallelism(): ULong =
    if (hermitNapiAvailable) wasmLibcHermitAvailableParallelism().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futexWait(address: MutPtr<UInt>, expected: UInt, timeout: ConstPtr<Timespec>, flags: UInt): Int =
    if (hermitNapiAvailable) wasmLibcHermitFutexWait(address.rawAddress.toString(), expected.toInt(), timeout.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futexWake(address: MutPtr<UInt>, count: Int): Int =
    if (hermitNapiAvailable) wasmLibcHermitFutexWake(address.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr<CChar>, stat: MutPtr<Stat>): Int =
    if (hermitNapiAvailable) wasmLibcHermitStat(path.rawAddress.toString(), stat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fd: Int, stat: MutPtr<Stat>): Int =
    if (hermitNapiAvailable) wasmLibcHermitFstat(fd, stat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr<CChar>, stat: MutPtr<Stat>): Int =
    if (hermitNapiAvailable) wasmLibcHermitLstat(path.rawAddress.toString(), stat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr<CChar>, flags: Int, mode: ModeT): Int =
    if (hermitNapiAvailable) wasmLibcHermitOpen(path.rawAddress.toString(), flags, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(path: ConstPtr<CChar>): Int =
    if (hermitNapiAvailable) wasmLibcHermitUnlink(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): Int =
    if (hermitNapiAvailable) wasmLibcHermitMkdir(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr<CChar>): Int =
    if (hermitNapiAvailable) wasmLibcHermitRmdir(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: Int, buf: MutPtr<UByte>, len: ULong): Long =
    if (hermitNapiAvailable) wasmLibcHermitRead(fd, buf.rawAddress.toString(), len.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: Int, buf: ConstPtr<UByte>, len: ULong): Long =
    if (hermitNapiAvailable) wasmLibcHermitWrite(fd, buf.rawAddress.toString(), len.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: Int, iov: ConstPtr<Iovec>, iovcnt: ULong): Long =
    if (hermitNapiAvailable) wasmLibcHermitReadv(fd, iov.rawAddress.toString(), iovcnt.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: Int, iov: ConstPtr<Iovec>, iovcnt: ULong): Long =
    if (hermitNapiAvailable) wasmLibcHermitWritev(fd, iov.rawAddress.toString(), iovcnt.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: Int): Int =
    if (hermitNapiAvailable) wasmLibcHermitClose(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: Int): Int =
    if (hermitNapiAvailable) wasmLibcHermitDup(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    if (hermitNapiAvailable) wasmLibcHermitFcntl(fd, cmd, arg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdents64(fd: Int, dirp: MutPtr<Dirent64>, count: ULong): Long =
    if (hermitNapiAvailable) wasmLibcHermitGetdents64(fd, dirp.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(nodename: ConstPtr<CChar>, servname: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): Int =
    if (hermitNapiAvailable) wasmLibcHermitGetaddrinfo(nodename.rawAddress.toString(), servname.rawAddress.toString(), hints.rawAddress.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(ai: MutPtr<Addrinfo>) {
    if (hermitNapiAvailable) {
        wasmLibcHermitFreeaddrinfo(ai.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    if (hermitNapiAvailable) wasmLibcHermitSocket(domain, ty, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int =
    if (hermitNapiAvailable) wasmLibcHermitBind(sockfd, addr.rawAddress.toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(sockfd: Int, backlog: Int): Int =
    if (hermitNapiAvailable) wasmLibcHermitListen(sockfd, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(sockfd: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    if (hermitNapiAvailable) wasmLibcHermitAccept(sockfd, addr.rawAddress.toString(), addrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int =
    if (hermitNapiAvailable) wasmLibcHermitConnect(sockfd, addr.rawAddress.toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(sockfd: Int, buf: MutPtr<UByte>, len: ULong, flags: Int): Long =
    if (hermitNapiAvailable) wasmLibcHermitRecv(sockfd, buf.rawAddress.toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(sockfd: Int, buf: MutPtr<CVoid>, len: ULong, flags: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Long =
    if (hermitNapiAvailable) wasmLibcHermitRecvfrom(sockfd, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(sockfd: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int): Long =
    if (hermitNapiAvailable) wasmLibcHermitSend(sockfd, buf.rawAddress.toString(), len.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(sockfd: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int, to: ConstPtr<Sockaddr>, tolen: SocklenT): Long =
    if (hermitNapiAvailable) wasmLibcHermitSendto(sockfd, buf.rawAddress.toString(), len.toString(), flags, to.rawAddress.toString(), tolen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(sockfd: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    if (hermitNapiAvailable) wasmLibcHermitGetpeername(sockfd, addr.rawAddress.toString(), addrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(sockfd: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    if (hermitNapiAvailable) wasmLibcHermitGetsockname(sockfd, addr.rawAddress.toString(), addrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): Int =
    if (hermitNapiAvailable) wasmLibcHermitGetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: ConstPtr<CVoid>, optlen: SocklenT): Int =
    if (hermitNapiAvailable) wasmLibcHermitSetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(sockfd: Int, cmd: Int, argp: MutPtr<CVoid>): Int =
    if (hermitNapiAvailable) wasmLibcHermitIoctl(sockfd, cmd, argp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(sockfd: Int, how: Int): Int =
    if (hermitNapiAvailable) wasmLibcHermitShutdown(sockfd, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: ULong, flags: Short): Int =
    if (hermitNapiAvailable) wasmLibcHermitEventfd(initval.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: Int): Int =
    if (hermitNapiAvailable) wasmLibcHermitPoll(fds.rawAddress.toString(), nfds.toString(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")
