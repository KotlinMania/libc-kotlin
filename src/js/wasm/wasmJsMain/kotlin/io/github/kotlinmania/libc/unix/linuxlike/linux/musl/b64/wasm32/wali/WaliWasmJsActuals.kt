@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon(): Boolean

private val _unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable: Boolean = _initUnixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRead(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRead(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWrite(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWrite(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpen(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClose(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClose(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStat(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStat(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstat(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstat(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLstat(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLstat(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPoll(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPoll(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLseek(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMmap(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMmap(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMprotect(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMunmap(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMunmap(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBrk(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBrk(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigaction(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigaction(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigprocmask(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigprocmask(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigreturn(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigreturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysIoctl(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysIoctl(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPread64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPread64(p0: Int, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPwrite64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPwrite64(p0: Int, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadv(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadv(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWritev(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWritev(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccess(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccess(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSelect(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSelect(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedYield()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedYield(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMremap(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMremap(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMsync(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMsync(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMadvise(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMadvise(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup2(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup2(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysNanosleep(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysNanosleep(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAlarm(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAlarm(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetitimer(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetitimer(p0: Int, p1: Int, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpid()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpid(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocket(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocket(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysConnect(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysConnect(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendto(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendto(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvfrom(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendmsg(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvmsg(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysShutdown(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysShutdown(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBind(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBind(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysListen(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysListen(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockname(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockname(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpeername(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpeername(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocketpair(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocketpair(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsockopt(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockopt(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFork()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFork(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExecve(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExecve(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExit(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExit(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWait4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWait4(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysKill(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysKill(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUname(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUname(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFcntl(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFcntl(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFlock(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFlock(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFsync(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFsync(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFdatasync(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFdatasync(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFtruncate(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFtruncate(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetcwd(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetcwd(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChdir(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChdir(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchdir(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchdir(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRename(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRename(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdir(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdir(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRmdir(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRmdir(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLink(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLink(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlink(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlink(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlink(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlink(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlink(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlink(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChmod(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChmod(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmod(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmod(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChown(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChown(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchown(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchown(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUmask(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUmask(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrlimit(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrusage(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrusage(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSysinfo(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSysinfo(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetuid()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetuid(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgid()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetuid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetuid(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgid(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGeteuid()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGeteuid(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetegid()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetegid(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetpgid(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetpgid(p0: Int, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetppid()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetppid(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsid()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsid(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetreuid(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetreuid(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetregid(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetregid(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgroups(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgroups(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgroups(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgroups(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresuid(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresuid(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresgid(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresgid(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpgid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpgid(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsid(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigpending(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigpending(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigsuspend(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigsuspend(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSigaltstack(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSigaltstack(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtime(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtime(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatfs(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatfs(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatfs(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatfs(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrctl(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrctl(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetrlimit(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChroot(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChroot(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGettid()")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGettid(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysTkill(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysTkill(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFutex(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFutex(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedGetaffinity(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedGetaffinity(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents64(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents64(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetTidAddress(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetTidAddress(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFadvise(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFadvise(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGettime(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGettime(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGetres(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGetres(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockNanosleep(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExitGroup(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExitGroup(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCtl(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCtl(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpenat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpenat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdirat(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdirat(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchownat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchownat(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlinkat(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlinkat(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLinkat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLinkat(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlinkat(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlinkat(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlinkat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlinkat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmodat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPselect6(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPselect6(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPpoll(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPpoll(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtimensat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollPwait(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollPwait(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept4(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd2(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd2(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCreate1(p0)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCreate1(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup3(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup3(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe2(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe2(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrlimit64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrlimit64(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRenameat2(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRenameat2(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrandom(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatx(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatx(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat2(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat2(p0: Int, p1: Int, p2: Int, p3: Int): String

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRead(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWrite(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpen(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClose(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClose(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStat(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstat(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLstat(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPoll(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLseek(a1, a2.toString(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMmap(a1, a2.toInt(), a3, a4, a5, a6.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMprotect(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMunmap(a1, a2.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysBrk(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBrk(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigaction(a1, a2, a3, a4.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigprocmask(a1, a2, a3, a4.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigreturn(a1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysIoctl(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPread64(a1, a2, a3.toInt(), a4.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPwrite64(a1, a2, a3.toInt(), a4.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadv(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWritev(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccess(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPipe(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSelect(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSchedYield(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedYield().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMremap(a1, a2.toInt(), a3.toInt(), a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMsync(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMadvise(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup2(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysNanosleep(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAlarm(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAlarm(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetitimer(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocket(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysConnect(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendto(a1, a2, a3.toInt(), a4, a5, a6.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvfrom(a1, a2, a3.toInt(), a4, a5, a6).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSendmsg(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRecvmsg(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysShutdown(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysBind(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysListen(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockname(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpeername(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSocketpair(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsockopt(a1, a2, a3, a4, a5.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsockopt(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFork(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFork().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExecve(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExit(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExit(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysWait4(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysKill(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUname(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUname(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFcntl(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFlock(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFsync(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFsync(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFdatasync(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFdatasync(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFtruncate(a1, a2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetcwd(a1, a2.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChdir(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChdir(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchdir(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchdir(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRename(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdir(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRmdir(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRmdir(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLink(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUnlink(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlink(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlink(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlink(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChmod(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmod(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChown(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchown(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUmask(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUmask(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrlimit(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrusage(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSysinfo(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSysinfo(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetuid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetuid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetgid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetuid(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetuid(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetgid(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgid(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGeteuid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGeteuid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetegid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetegid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetpgid(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetppid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetppid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetsid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetsid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetreuid(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetregid(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetgroups(a1.toInt(), a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetgroups(a1.toInt(), a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresuid(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetresgid(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpgid(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetpgid(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsid(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetsid(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigpending(a1, a2.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRtSigsuspend(a1, a2.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSigaltstack(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtime(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatfs(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatfs(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrctl(a1, a2.toString(), a3.toString(), a4.toString(), a5.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetrlimit(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChroot(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysChroot(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGettid(): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGettid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysTkill(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFutex(a1, a2, a3, a4, a5, a6).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSchedGetaffinity(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetdents64(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSetTidAddress(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFadvise(a1, a2.toString(), a3.toString(), a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGettime(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockGetres(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysClockNanosleep(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExitGroup(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysExitGroup(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCtl(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysOpenat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysMkdirat(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchownat(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFstatat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUnlinkat(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysLinkat(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysSymlinkat(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysReadlinkat(a1, a2, a3, a4.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFchmodat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPselect6(a1, a2, a3, a4, a5, a6).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPpoll(a1, a2.toInt(), a3, a4, a5.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysUtimensat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollPwait(a1, a2, a3, a4, a5, a6.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEventfd(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysAccept4(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEventfd2(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysEpollCreate1(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysDup3(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPipe2(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysPrlimit64(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysRenameat2(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysGetrandom(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysStatx(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (_unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) _wasm_libc_unix_linuxlike_linux_musl_b64_wasm32_wali_syscallSysFaccessat2(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
