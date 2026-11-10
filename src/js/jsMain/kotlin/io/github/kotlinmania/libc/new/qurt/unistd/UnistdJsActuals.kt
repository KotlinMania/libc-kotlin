@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _newQurtUnistdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun access(pathname: String?, mode: CInt): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_access(pathname, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_close(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_lseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_read(fd, (buf?.value ?: 0L).toString(), count.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_write(fd, (buf?.value ?: 0L).toString(), count.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_ftruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(pathname: String?): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_unlink(pathname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_getcwd((buf?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(pathname: String?): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_rmdir(pathname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_getpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(seconds: CUint): CUint =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_sleep(seconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_sysconf(name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
