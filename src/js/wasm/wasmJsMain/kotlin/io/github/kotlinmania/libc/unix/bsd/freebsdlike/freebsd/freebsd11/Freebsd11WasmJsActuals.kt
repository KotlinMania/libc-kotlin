@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdFreebsdlikeFreebsdFreebsd11NapiAddon(): Boolean

private val unixBsdFreebsdlikeFreebsdFreebsd11NapiAvailable: Boolean = initUnixBsdFreebsdlikeFreebsdFreebsd11NapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

public actual fun setgrent(): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: ConstPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(loc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, arg: MutPtr<CVoid>, compar: QsortRComparCallback?) {
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(base.rawAddress.toString(), num.toString(), size.toString(), arg.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
