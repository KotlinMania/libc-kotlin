@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.sys.mman

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewQurtSysMmanNapiAddon(): Boolean

private val newQurtSysMmanNapiAvailable: Boolean = initNewQurtSysMmanNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcNewQurtSysMmanMmap(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcNewQurtSysMmanMmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtSysMmanMunmap(p0, p1)")
private external fun wasmLibcNewQurtSysMmanMunmap(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtSysMmanMprotect(p0, p1, p2)")
private external fun wasmLibcNewQurtSysMmanMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtSysMmanMlock(p0, p1)")
private external fun wasmLibcNewQurtSysMmanMlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtSysMmanMunlock(p0, p1)")
private external fun wasmLibcNewQurtSysMmanMunlock(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtSysMmanMlockall(p0)")
private external fun wasmLibcNewQurtSysMmanMlockall(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtSysMmanMunlockall()")
private external fun wasmLibcNewQurtSysMmanMunlockall(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtSysMmanMsync(p0, p1, p2)")
private external fun wasmLibcNewQurtSysMmanMsync(p0: String, p1: String, p2: Int): Int

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    if (newQurtSysMmanNapiAvailable) MutPtr(wasmLibcNewQurtSysMmanMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    if (newQurtSysMmanNapiAvailable) wasmLibcNewQurtSysMmanMunmap(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (newQurtSysMmanNapiAvailable) wasmLibcNewQurtSysMmanMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (newQurtSysMmanNapiAvailable) wasmLibcNewQurtSysMmanMlock(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (newQurtSysMmanNapiAvailable) wasmLibcNewQurtSysMmanMunlock(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (newQurtSysMmanNapiAvailable) wasmLibcNewQurtSysMmanMlockall(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (newQurtSysMmanNapiAvailable) wasmLibcNewQurtSysMmanMunlockall() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (newQurtSysMmanNapiAvailable) wasmLibcNewQurtSysMmanMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")
