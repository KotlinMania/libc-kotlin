@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initTrustyNapiAddon(): Boolean

private val trustyNapiAvailable: Boolean = initTrustyNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTrustyCalloc(p0, p1)")
private external fun wasmLibcTrustyCalloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTrustyMalloc(p0)")
private external fun wasmLibcTrustyMalloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTrustyRealloc(p0, p1)")
private external fun wasmLibcTrustyRealloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTrustyFree(p0)")
private external fun wasmLibcTrustyFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTrustyMemalign(p0, p1)")
private external fun wasmLibcTrustyMemalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTrustyPosixMemalign(p0, p1, p2)")
private external fun wasmLibcTrustyPosixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTrustyWrite(p0, p1, p2)")
private external fun wasmLibcTrustyWrite(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcTrustyWritev(p0, p1, p2)")
private external fun wasmLibcTrustyWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTrustyClose(p0)")
private external fun wasmLibcTrustyClose(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcTrustyStrlen(p0)")
private external fun wasmLibcTrustyStrlen(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcTrustyGetauxval(p0)")
private external fun wasmLibcTrustyGetauxval(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcTrustyMmap(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcTrustyMmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTrustyMunmap(p0, p1)")
private external fun wasmLibcTrustyMunmap(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTrustyClockGettime(p0, p1)")
private external fun wasmLibcTrustyClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcTrustyNanosleep(p0, p1)")
private external fun wasmLibcTrustyNanosleep(p0: String, p1: String): Int

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    if (trustyNapiAvailable) MutPtr(wasmLibcTrustyCalloc(nobj.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr =
    if (trustyNapiAvailable) MutPtr(wasmLibcTrustyMalloc(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    if (trustyNapiAvailable) MutPtr(wasmLibcTrustyRealloc(p.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr) {
    if (trustyNapiAvailable) {
        wasmLibcTrustyFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    if (trustyNapiAvailable) MutPtr(wasmLibcTrustyMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt =
    if (trustyNapiAvailable) wasmLibcTrustyPosixMemalign(memptr.rawAddress.toString(), align.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    if (trustyNapiAvailable) wasmLibcTrustyWrite(fd, buf.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (trustyNapiAvailable) wasmLibcTrustyWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (trustyNapiAvailable) wasmLibcTrustyClose(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr): SizeT =
    if (trustyNapiAvailable) wasmLibcTrustyStrlen(cs.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (trustyNapiAvailable) wasmLibcTrustyGetauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    if (trustyNapiAvailable) MutPtr(wasmLibcTrustyMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    if (trustyNapiAvailable) wasmLibcTrustyMunmap(addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    if (trustyNapiAvailable) wasmLibcTrustyClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (trustyNapiAvailable) wasmLibcTrustyNanosleep(rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
