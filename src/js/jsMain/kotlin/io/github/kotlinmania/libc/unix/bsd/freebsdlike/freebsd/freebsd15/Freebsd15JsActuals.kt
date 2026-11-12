@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun setgrent() {
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) {
        unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15Setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15Mprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) {
        unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15Freelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15Msgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<DomainsetT>, policy: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetGetdomain(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<DomainsetT>, policy: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15CpusetSetdomain(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString(), policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15Dirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) MutPtr((unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15Basename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) {
        unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15QsortR(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kvmKerndisp(kd: MutPtr<KvmT>): KssizeT =
    if (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libcUnixBsdFreebsdlikeFreebsdFreebsd15KvmKerndisp(kd.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
