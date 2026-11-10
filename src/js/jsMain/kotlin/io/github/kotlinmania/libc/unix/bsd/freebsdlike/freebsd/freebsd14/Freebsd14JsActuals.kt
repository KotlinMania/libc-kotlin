@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT

private val _unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun setgrent() {
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_cpusetGetdomain(level, which, id.toString(), setsize.toString(), (mask?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_cpusetSetdomain(level, which, id.toString(), setsize.toString(), (mask?.value ?: 0L).toString(), policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_dirname((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_basename((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kvmKerndisp(kd: COpaquePointer?): KssizeT =
    if (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd14NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd14_kvmKerndisp((kd?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
