@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdFreebsdlikeFreebsdFreebsd13NapiAddon(): Boolean

private val unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable: Boolean = initUnixBsdFreebsdlikeFreebsdFreebsd13NapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13Setgrent()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Setgrent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13Mprotect(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13Freelocale(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Freelocale(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13Msgrcv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Msgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetGetdomain(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetGetdomain(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetSetdomain(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetSetdomain(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13Dirname(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Dirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13Basename(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Basename(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13QsortR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13QsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFreebsd13KvmKerndisp(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13KvmKerndisp(p0: String): String

public actual fun setgrent() {
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Mprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Freelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Msgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr, policy: MutPtr): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetGetdomain(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr, policy: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13CpusetSetdomain(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString(), policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Dirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr): MutPtr =
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13Basename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?) {
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13QsortR(base.rawAddress.toString(), num.toString(), size.toString(), arg.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kvmKerndisp(kd: MutPtr): KssizeT =
    if (unixBsdFreebsdlikeFreebsdFreebsd13NapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFreebsd13KvmKerndisp(kd.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
