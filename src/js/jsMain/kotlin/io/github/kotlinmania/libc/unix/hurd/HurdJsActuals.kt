@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixHurdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLutimes(file.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFutimes(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(fd: CInt, path: ConstPtr, mode: ModeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMkfifoat(fd, path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmin(): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLibcCurrentSigrtmin() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmax(): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLibcCurrentSigrtmax() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPipe2(fds.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdDup3(oldfd, newfd, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread64(fd: CInt, buf: MutPtr, count: SizeT, offset: Off64T): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPread64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite64(fd: CInt, buf: ConstPtr, count: SizeT, offset: Off64T): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPwrite64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iovec: ConstPtr, count: CInt): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdReadv(fd, iovec.rawAddress.toString(), count) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iovec: ConstPtr, count: CInt): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdWritev(fd, iovec.rawAddress.toString(), count) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iovec: ConstPtr, count: CInt, offset: OffT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPreadv(fd, iovec.rawAddress.toString(), count, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iovec: ConstPtr, count: CInt, offset: OffT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPwritev(fd, iovec.rawAddress.toString(), count, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPreadv64(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPwritev64(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFreadUnlocked(buf.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAioRead(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAioWrite(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAioFsync(op, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAioError(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAioReturn(aiocbp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAioCancel(fd, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMqClose(mqd.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMqUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLseek64(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos64(stream: MutPtr, ptr: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFgetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: MutPtr, offset: Off64T, whence: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFseeko64(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: MutPtr, ptr: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFsetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: MutPtr): Off64T =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFtello64(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdBind(fd, addr.rawAddress.toString(), len.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAccept4(fd, addr.rawAddress.toString(), len.rawAddress.toString(), flg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPpoll(fds.rawAddress.toString(), nfds.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, message: MutPtr, flags: CInt): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdRecvmsg(fd, message.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, message: ConstPtr, flags: CInt): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSendmsg(fd, message.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSendfile(outFd, inFd, offset.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSendfile64(outFd, inFd, offset.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdShutdown(fd, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetdomainname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr, len: SizeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSetdomainname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdIfNameindex() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetifaddrs(ifap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uname(buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSethostid(hostid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetgrent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdSetspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdEndspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspent(): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetspent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnam(name: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetspnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwentR(stream: MutPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFgetpwentR(stream.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrentR(stream: MutPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFgetgrentR(stream.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putpwent(p: ConstPtr, stream: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPutpwent(p.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putgrent(grp: ConstPtr, stream: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPutgrent(grp.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetspentR(fp: MutPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFgetspentR(fp.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(s: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSgetspentR(s.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetspentR(spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnamR(name: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetspnamR(name.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntentR(stream: MutPtr, mntbuf: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetmntentR(stream.rawAddress.toString(), mntbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdUtmpname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdUtmpxname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetutxid(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetutxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdPututxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdInitgroups(user.rawAddress.toString(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSetgroups(ngroups.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAcct(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: ConstPtr, ty: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdSetmntent(filename.rawAddress.toString(), ty.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGetmntent(stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addmntent(stream: MutPtr, mnt: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAddmntent(stream.rawAddress.toString(), mnt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endmntent(streamp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdEndmntent(streamp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasmntopt(mnt: ConstPtr, opt: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdHasmntopt(mnt.rawAddress.toString(), opt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadKill(threadid.toString(), signo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadCancel(thread.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadEqual(t1.toString(), t2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thr: PthreadT, attr: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadGetattrNp(thr.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(control: MutPtr, routine: PthreadOnceRoutineCallback): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadOnce(control.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadBarrierattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadBarrierattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadBarrierattrGetpshared(attr.rawAddress.toString(), shared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadBarrierattrSetpshared(attr.rawAddress.toString(), shared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadBarrierDestroy(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadBarrierWait(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, newmask: ConstPtr, oldmask: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadSigmask(how, newmask.rawAddress.toString(), oldmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadGetschedparam(native.toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadSetschedparam(native.toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPthreadGetcpuclockid(thread.toString(), clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdClockGetres(clockId, res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdClockGettime(clockId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdClockSettime(clockId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdClockGetcpuclockid(pid, clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdCtimeR(timep.rawAddress.toString(), buf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdStrftime(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdTimerCreate(clockid, sevp.rawAddress.toString(), timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdTimerDelete(timerid.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdTimerGetoverrun(timerid.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdTimerGettime(timerid.toLong().toString(), currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdTimerSettime(timerid.toLong().toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fd: CInt, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFstat(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat64(fd: CInt, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFstat64(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(fd: CInt, file: ConstPtr, buf: MutPtr, flag: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFstatat(fd, file.rawAddress.toString(), buf.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat64(fd: CInt, file: ConstPtr, buf: MutPtr, flag: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFstatat64(fd, file.rawAddress.toString(), buf.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statx(dirfd: CInt, pathname: ConstPtr, flags: CInt, mask: CUint, statxbuf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdStatx(dirfd, pathname.rawAddress.toString(), flags, mask.toInt(), statxbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFtruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFtruncate64(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate64(file: ConstPtr, length: Off64T): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdTruncate64(file.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(file: ConstPtr, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLstat(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat64(file: ConstPtr, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLstat64(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs64(file: ConstPtr, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdStatfs64(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs64(fildes: CInt, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFstatfs64(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(file: ConstPtr, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdStatvfs(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs64(file: ConstPtr, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdStatvfs64(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fildes: CInt, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFstatvfs(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs64(fildes: CInt, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFstatvfs64(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdOpen(file.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open64(file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdOpen64(file.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(fd: CInt, file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdOpenat(fd, file.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat64(fd: CInt, file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdOpenat64(fd, file.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen64(filename: ConstPtr, mode: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdFopen64(filename.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen64(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdFreopen64(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat64(path: ConstPtr, mode: ModeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdCreat64(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMkostemp(template.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMkostemps(template.rawAddress.toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMkstemps(template.rawAddress.toString(), suffixlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile64(): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdTmpfile64() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdPopen(command.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdCloseRange(first.toInt(), last.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpt(): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetpt() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLoginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdCtermid(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdClearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execveat(dirfd: CInt, pathname: ConstPtr, argv: ConstPtr, envp: ConstPtr, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdExecveat(dirfd, pathname.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnFileActionsInit(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnFileActionsDestroy(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr, from: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnFileActionsAddclosefromNp(actions.rawAddress.toString(), from) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr, tcfd: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress.toString(), tcfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdEuidaccess(pathname.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdEaccess(pathname.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(file: ConstPtr, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdStat(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat64(file: ConstPtr, buf: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdStat64(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdReaddir(dirp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64(dirp: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdReaddir64(dirp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdReaddirR(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64R(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdReaddir64R(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdErrnoLocation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap64(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdMmap64(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdMremap(addr.rawAddress.toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSyncfs(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFallocate64(fd, mode, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixFallocate64(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixFadvise64(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetrlimit(resource.toInt(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetrlimit64(resource.toInt(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSetrlimit(resource.toInt(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSetrlimit64(resource.toInt(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetpriority(which.toInt(), who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSetpriority(which.toInt(), who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buffer: MutPtr, length: SizeT, flags: CUint): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetrandom(buffer.rawAddress.toString(), length.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buffer: MutPtr, length: SizeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetentropy(buffer.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdMemrchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: ConstPtr, c: CInt): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdStrchrnul(s.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdDrand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr): CDouble =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdErand48(xseed.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr): CLong =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdNrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr): CLong =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdJrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48(xseed: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdSeed48(xseed.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdQsortR(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun brk(addr: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdBrk(addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdSbrk(increment.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdMemalign(align.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMallopt(param, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo2(): Mallinfo2 =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocInfo(options: CInt, stream: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMallocInfo(options, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMallocUsableSize(ptr.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocTrim(pad: SizeT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdMallocTrim(pad.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdIconvClose(cd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdBacktrace(buf.rawAddress.toString(), sz) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdReboot(howTo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetloadavg(loadavg.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob64(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGlob64(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: MutPtr) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdGlobfree64(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLgetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLsetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLlistxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFlistxattr(filedes, list.rawAddress.toString(), size.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdRemovexattr(path.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdLremovexattr(path.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdFremovexattr(filedes, name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdDirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixBasename(path: MutPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdPosixBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuBasename(path: ConstPtr): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdGnuBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr, flag: CInt): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdDlmopen(lmid.toString(), filename.rawAddress.toString(), flag) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlinfo(handle: MutPtr, request: CInt, info: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdDlinfo(handle.rawAddress.toString(), request, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr1(addr: ConstPtr, info: MutPtr, extraInfo: MutPtr, flags: CInt): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdDladdr1(addr.rawAddress.toString(), info.rawAddress.toString(), extraInfo.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixHurdNapiAddon != null) {
        unixHurdNapiAddon.libcUnixHurdFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    if (unixHurdNapiAddon != null) MutPtr((unixHurdNapiAddon.libcUnixHurdNlLanginfoL(item, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    if (unixHurdNapiAddon != null) (unixHurdNapiAddon.libcUnixHurdDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcRelease(): ConstPtr =
    if (unixHurdNapiAddon != null) ConstPtr((unixHurdNapiAddon.libcUnixHurdGnuGetLibcRelease() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcVersion(): ConstPtr =
    if (unixHurdNapiAddon != null) ConstPtr((unixHurdNapiAddon.libcUnixHurdGnuGetLibcVersion() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
