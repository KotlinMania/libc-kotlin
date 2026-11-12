@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong

private val unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClose(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek(a1, a2.toString(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap(a1, a2.toInt(), a3, a4, a5, a6.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap(a1, a2.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysBrk(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction(a1, a2, a3, a4.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask(a1, a2, a3, a4.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn(a1.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64(a1, a2, a3.toInt(), a4.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64(a1, a2, a3.toInt(), a4.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPipe(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSchedYield(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap(a1, a2.toInt(), a3.toInt(), a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAlarm(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto(a1, a2, a3.toInt(), a4, a5, a6.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom(a1, a2, a3.toInt(), a4, a5, a6) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt(a1, a2, a3, a4, a5.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFork(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExit(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUname(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFsync(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFdatasync(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate(a1, a2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd(a1, a2.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChdir(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchdir(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRmdir(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUnlink(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink(a1, a2, a3.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUmask(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSysinfo(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetuid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetgid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetuid(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetgid(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGeteuid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetegid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetppid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetsid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups(a1.toInt(), a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups(a1.toInt(), a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpgid(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsid(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending(a1, a2.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend(a1, a2.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl(a1, a2.toString(), a3.toString(), a4.toString(), a5.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChroot(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGettid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex(a1, a2, a3, a4, a5, a6) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise(a1, a2.toString(), a3.toString(), a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExitGroup(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat(a1, a2, a3, a4.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6(a1, a2, a3, a4, a5, a6) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll(a1, a2.toInt(), a3, a4, a5.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait(a1, a2, a3, a4, a5, a6.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEventfd(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1(a1) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3(a1, a2, a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2(a1, a2) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom(a1, a2.toInt(), a3) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx(a1, a2, a3, a4, a5) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon != null) (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2(a1, a2, a3, a4) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
