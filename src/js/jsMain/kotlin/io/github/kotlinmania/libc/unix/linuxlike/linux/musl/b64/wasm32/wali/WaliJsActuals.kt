@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong

private val _unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRead(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWrite(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpen(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClose(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClose(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStat(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstat(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLstat(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPoll(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLseek(a1, a2.toString(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMmap(a1, a2.toInt(), a3, a4, a5, a6.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMprotect(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMunmap(a1, a2.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysBrk(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBrk(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigaction(a1, a2, a3, a4.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigprocmask(a1, a2, a3, a4.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigreturn(a1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysIoctl(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPread64(a1, a2, a3.toInt(), a4.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPwrite64(a1, a2, a3.toInt(), a4.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadv(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWritev(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccess(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPipe(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSelect(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSchedYield(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedYield() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMremap(a1, a2.toInt(), a3.toInt(), a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMsync(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMadvise(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup2(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysNanosleep(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAlarm(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAlarm(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetitimer(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocket(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysConnect(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendto(a1, a2, a3.toInt(), a4, a5, a6.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvfrom(a1, a2, a3.toInt(), a4, a5, a6) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendmsg(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvmsg(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysShutdown(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBind(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysListen(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockname(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpeername(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocketpair(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsockopt(a1, a2, a3, a4, a5.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockopt(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFork(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFork() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExecve(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExit(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExit(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWait4(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysKill(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUname(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUname(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFcntl(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFlock(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFsync(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFsync(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFdatasync(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFdatasync(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFtruncate(a1, a2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetcwd(a1, a2.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChdir(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChdir(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchdir(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchdir(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRename(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdir(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRmdir(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRmdir(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLink(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUnlink(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlink(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlink(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlink(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChmod(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmod(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChown(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchown(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUmask(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUmask(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrlimit(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrusage(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSysinfo(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSysinfo(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetuid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetuid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetgid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetuid(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetuid(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetgid(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgid(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGeteuid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGeteuid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetegid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetegid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetpgid(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetppid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetppid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetsid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetreuid(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetregid(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgroups(a1.toInt(), a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgroups(a1.toInt(), a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresuid(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresgid(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpgid(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpgid(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsid(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsid(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigpending(a1, a2.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigsuspend(a1, a2.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSigaltstack(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtime(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatfs(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatfs(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrctl(a1, a2.toString(), a3.toString(), a4.toString(), a5.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetrlimit(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChroot(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChroot(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGettid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGettid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysTkill(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFutex(a1, a2, a3, a4, a5, a6) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedGetaffinity(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents64(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetTidAddress(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFadvise(a1, a2.toString(), a3.toString(), a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGettime(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGetres(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockNanosleep(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExitGroup(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExitGroup(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCtl(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpenat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdirat(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchownat(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlinkat(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLinkat(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlinkat(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlinkat(a1, a2, a3, a4.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmodat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPselect6(a1, a2, a3, a4, a5, a6) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPpoll(a1, a2.toInt(), a3, a4, a5.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtimensat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollPwait(a1, a2, a3, a4, a5, a6.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEventfd(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept4(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd2(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCreate1(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup3(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe2(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrlimit64(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRenameat2(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrandom(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatx(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat2(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
