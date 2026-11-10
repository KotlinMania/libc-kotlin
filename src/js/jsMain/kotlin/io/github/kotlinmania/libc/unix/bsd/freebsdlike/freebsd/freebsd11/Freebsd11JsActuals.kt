@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT

private val _unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun setgrent(): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_setgrent() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_freelocale((loc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_dirname(path) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_basename(path) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), (arg?.value ?: 0L).toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
