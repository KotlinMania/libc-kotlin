@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun setgrent(): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: ConstPtr, len: SizeT, prot: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(loc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: ConstPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?) {
    if (unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) {
        unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(base.rawAddress.toString(), num.toString(), size.toString(), arg.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
