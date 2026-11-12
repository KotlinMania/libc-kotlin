@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixLinuxlikeLinuxGnuB64X8664NapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun getcontext(ucp: MutPtr): CInt =
    if (unixLinuxlikeLinuxGnuB64X8664NapiAddon != null) (unixLinuxlikeLinuxGnuB64X8664NapiAddon.libcUnixLinuxlikeLinuxGnuB64X8664Getcontext(ucp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setcontext(ucp: ConstPtr): CInt =
    if (unixLinuxlikeLinuxGnuB64X8664NapiAddon != null) (unixLinuxlikeLinuxGnuB64X8664NapiAddon.libcUnixLinuxlikeLinuxGnuB64X8664Setcontext(ucp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makecontext(ucp: MutPtr, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    if (unixLinuxlikeLinuxGnuB64X8664NapiAddon != null) {
        unixLinuxlikeLinuxGnuB64X8664NapiAddon.libcUnixLinuxlikeLinuxGnuB64X8664Makecontext(ucp.rawAddress.toString(), 0L.toString(), argc, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun swapcontext(uocp: MutPtr, ucp: ConstPtr): CInt =
    if (unixLinuxlikeLinuxGnuB64X8664NapiAddon != null) (unixLinuxlikeLinuxGnuB64X8664NapiAddon.libcUnixLinuxlikeLinuxGnuB64X8664Swapcontext(uocp.rawAddress.toString(), ucp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
