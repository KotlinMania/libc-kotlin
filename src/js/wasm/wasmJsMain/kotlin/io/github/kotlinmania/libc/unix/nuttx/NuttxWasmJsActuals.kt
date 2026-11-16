@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixNuttxNapiAddon(): Boolean

private val unixNuttxNapiAvailable: Boolean = initUnixNuttxNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcUnixNuttxErrno()")
private external fun wasmLibcUnixNuttxErrno(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNuttxBind(p0, p1, p2)")
private external fun wasmLibcUnixNuttxBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixNuttxIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixNuttxIoctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNuttxDirfd(p0)")
private external fun wasmLibcUnixNuttxDirfd(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNuttxRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNuttxRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNuttxPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixNuttxPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNuttxClockGettime(p0, p1)")
private external fun wasmLibcUnixNuttxClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNuttxFutimens(p0, p1)")
private external fun wasmLibcUnixNuttxFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNuttxPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixNuttxPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNuttxPthreadSetnameNp(p0, p1)")
private external fun wasmLibcUnixNuttxPthreadSetnameNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNuttxPthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcUnixNuttxPthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNuttxGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixNuttxGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixNuttxArc4random()")
private external fun wasmLibcUnixNuttxArc4random(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNuttxArc4randomBuf(p0, p1)")
private external fun wasmLibcUnixNuttxArc4randomBuf(p0: String, p1: String)

public actual fun errno(): MutPtr =
    if (unixNuttxNapiAvailable) MutPtr(wasmLibcUnixNuttxErrno().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(sockfd: Int, addr: ConstPtr, addrlen: SocklenT): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxBind(sockfd, addr.rawAddress.toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(sockfd: Int, buf: MutPtr, len: ULong, flags: Int, srcAddr: MutPtr, addrlen: MutPtr): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxRecvfrom(sockfd, buf.rawAddress.toString(), len.toString(), flags, srcAddr.rawAddress.toString(), addrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(thread: MutPtr, attr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxPthreadCreate(thread.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxClockGettime(clockid, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: Int, times: ConstPtr): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxPthreadSetnameNp(thread.toLong().toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: ULong): Int =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxPthreadGetnameNp(thread.toLong().toString(), name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr, buflen: ULong, flags: UInt): Long =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (unixNuttxNapiAvailable) wasmLibcUnixNuttxArc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(bytes: MutPtr, nbytes: ULong) {
    if (unixNuttxNapiAvailable) {
        wasmLibcUnixNuttxArc4randomBuf(bytes.rawAddress.toString(), nbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
