@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val newQurtUnistdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun access(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdAccess(pathname.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdClose(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdLseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdRead(fd, buf.rawAddress.toString(), count.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdWrite(fd, buf.rawAddress.toString(), count.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdFtruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(pathname: ConstPtr<CChar>): CInt =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdUnlink(pathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    if (newQurtUnistdNapiAddon != null) MutPtr((newQurtUnistdNapiAddon.libcNewQurtUnistdGetcwd(buf.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(pathname: ConstPtr<CChar>): CInt =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdRmdir(pathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdGetpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(seconds: CUint): CUint =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdSleep(seconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (newQurtUnistdNapiAddon != null) (newQurtUnistdNapiAddon.libcNewQurtUnistdSysconf(name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
