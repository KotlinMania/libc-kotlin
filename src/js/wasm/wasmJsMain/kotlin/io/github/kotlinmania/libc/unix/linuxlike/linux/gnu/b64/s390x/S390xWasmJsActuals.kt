@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeLinuxGnuB64S390xNapiAddon(): Boolean

private val unixLinuxlikeLinuxGnuB64S390xNapiAvailable: Boolean = initUnixLinuxlikeLinuxGnuB64S390xNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuB64S390xSysctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuB64S390xSysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuB64S390xGetcontext(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuB64S390xGetcontext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuB64S390xSetcontext(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuB64S390xSetcontext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuB64S390xMakecontext(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuB64S390xMakecontext(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuB64S390xSwapcontext(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuB64S390xSwapcontext(p0: String, p1: String): Int

public actual fun sysctl(name: MutPtr, namelen: CInt, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    if (unixLinuxlikeLinuxGnuB64S390xNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuB64S390xSysctl(name.rawAddress.toString(), namelen, oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcontext(ucp: MutPtr): CInt =
    if (unixLinuxlikeLinuxGnuB64S390xNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuB64S390xGetcontext(ucp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setcontext(ucp: ConstPtr): CInt =
    if (unixLinuxlikeLinuxGnuB64S390xNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuB64S390xSetcontext(ucp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makecontext(ucp: MutPtr, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    if (unixLinuxlikeLinuxGnuB64S390xNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxGnuB64S390xMakecontext(ucp.rawAddress.toString(), 0L.toString(), argc, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun swapcontext(uocp: MutPtr, ucp: ConstPtr): CInt =
    if (unixLinuxlikeLinuxGnuB64S390xNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuB64S390xSwapcontext(uocp.rawAddress.toString(), ucp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
