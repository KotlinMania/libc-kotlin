@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewQurtUnistdNapiAddon(): Boolean

private val newQurtUnistdNapiAvailable: Boolean = initNewQurtUnistdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtUnistdAccess(p0, p1)")
private external fun wasmLibcNewQurtUnistdAccess(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtUnistdClose(p0)")
private external fun wasmLibcNewQurtUnistdClose(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtUnistdLseek(p0, p1, p2)")
private external fun wasmLibcNewQurtUnistdLseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtUnistdRead(p0, p1, p2)")
private external fun wasmLibcNewQurtUnistdRead(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtUnistdWrite(p0, p1, p2)")
private external fun wasmLibcNewQurtUnistdWrite(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtUnistdFtruncate(p0, p1)")
private external fun wasmLibcNewQurtUnistdFtruncate(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtUnistdUnlink(p0)")
private external fun wasmLibcNewQurtUnistdUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtUnistdGetcwd(p0, p1)")
private external fun wasmLibcNewQurtUnistdGetcwd(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtUnistdRmdir(p0)")
private external fun wasmLibcNewQurtUnistdRmdir(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtUnistdGetpid()")
private external fun wasmLibcNewQurtUnistdGetpid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtUnistdSleep(p0)")
private external fun wasmLibcNewQurtUnistdSleep(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtUnistdSysconf(p0)")
private external fun wasmLibcNewQurtUnistdSysconf(p0: Int): String

public actual fun access(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdAccess(pathname.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdClose(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdLseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdRead(fd, buf.rawAddress.toString(), count.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdWrite(fd, buf.rawAddress.toString(), count.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdFtruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(pathname: ConstPtr<CChar>): CInt =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdUnlink(pathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    if (newQurtUnistdNapiAvailable) MutPtr(wasmLibcNewQurtUnistdGetcwd(buf.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(pathname: ConstPtr<CChar>): CInt =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdRmdir(pathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdGetpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(seconds: CUint): CUint =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdSleep(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (newQurtUnistdNapiAvailable) wasmLibcNewQurtUnistdSysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
