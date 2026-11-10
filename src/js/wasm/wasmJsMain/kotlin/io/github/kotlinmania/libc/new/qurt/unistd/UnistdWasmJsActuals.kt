@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtUnistdNapiAddon(): Boolean

private val _newQurtUnistdNapiAvailable: Boolean = _initNewQurtUnistdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_unistd_access(p0, p1)")
private external fun _wasm_libc_new_qurt_unistd_access(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_unistd_close(p0)")
private external fun _wasm_libc_new_qurt_unistd_close(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_unistd_lseek(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_unistd_lseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_unistd_read(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_unistd_read(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_unistd_write(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_unistd_write(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_unistd_ftruncate(p0, p1)")
private external fun _wasm_libc_new_qurt_unistd_ftruncate(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_unistd_unlink(p0)")
private external fun _wasm_libc_new_qurt_unistd_unlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_unistd_getcwd(p0, p1)")
private external fun _wasm_libc_new_qurt_unistd_getcwd(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_unistd_rmdir(p0)")
private external fun _wasm_libc_new_qurt_unistd_rmdir(p0: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_unistd_getpid()")
private external fun _wasm_libc_new_qurt_unistd_getpid(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_unistd_sleep(p0)")
private external fun _wasm_libc_new_qurt_unistd_sleep(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_unistd_sysconf(p0)")
private external fun _wasm_libc_new_qurt_unistd_sysconf(p0: Int): String

public actual fun access(pathname: String?, mode: CInt): CInt =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_access(pathname, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_close(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_lseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_read(fd, (buf?.value ?: 0L).toString(), count.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_write(fd, (buf?.value ?: 0L).toString(), count.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_ftruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(pathname: String?): CInt =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_unlink(pathname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_getcwd((buf?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(pathname: String?): CInt =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_rmdir(pathname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_getpid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(seconds: CUint): CUint =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_sleep(seconds.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (_newQurtUnistdNapiAvailable) _wasm_libc_new_qurt_unistd_sysconf(name).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
