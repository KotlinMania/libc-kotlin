@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.bioniclibc.sys.socket

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SocklenT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Mmsghdr
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewBioniclibcSysSocketNapiAddon(): Boolean

private val newBioniclibcSysSocketNapiAvailable: Boolean = initNewBioniclibcSysSocketNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcNewBioniclibcSysSocketRecvmmsg(p0, p1, p2, p3, p4)")
private external fun wasmLibcNewBioniclibcSysSocketRecvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcNewBioniclibcSysSocketSendmmsg(p0, p1, p2, p3)")
private external fun wasmLibcNewBioniclibcSysSocketSendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcNewBioniclibcSysSocketRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcNewBioniclibcSysSocketRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (newBioniclibcSysSocketNapiAvailable) wasmLibcNewBioniclibcSysSocketRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: ConstPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (newBioniclibcSysSocketNapiAvailable) wasmLibcNewBioniclibcSysSocketSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (newBioniclibcSysSocketNapiAvailable) wasmLibcNewBioniclibcSysSocketRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
