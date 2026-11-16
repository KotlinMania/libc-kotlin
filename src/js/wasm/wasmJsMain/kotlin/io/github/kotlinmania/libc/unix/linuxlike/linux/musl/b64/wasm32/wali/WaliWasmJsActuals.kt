@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.wasm32.wali

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon(): Boolean

private val unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable: Boolean = initUnixLinuxlikeLinuxMuslB64Wasm32WaliNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64(p0: Int, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64(p0: Int, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer(p0: Int, p1: Int, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid(p0: Int, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid()")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2(p0: Int, p1: Int, p2: Int, p3: Int): String

public actual fun syscallSysRead(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRead(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWrite(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWrite(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysOpen(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpen(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClose(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClose(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStat(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStat(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstat(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstat(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLstat(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLstat(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPoll(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPoll(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLseek(a1: Int, a2: Long, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLseek(a1, a2.toString(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMmap(a1: Int, a2: UInt, a3: Int, a4: Int, a5: Int, a6: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMmap(a1, a2.toInt(), a3, a4, a5, a6.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMprotect(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMprotect(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMunmap(a1: Int, a2: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMunmap(a1, a2.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysBrk(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBrk(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigaction(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigaction(a1, a2, a3, a4.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigprocmask(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigprocmask(a1, a2, a3, a4.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigreturn(a1: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigreturn(a1.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysIoctl(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysIoctl(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPread64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPread64(a1, a2, a3.toInt(), a4.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPwrite64(a1: Int, a2: Int, a3: UInt, a4: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPwrite64(a1, a2, a3.toInt(), a4.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadv(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadv(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWritev(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWritev(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccess(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccess(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPipe(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSelect(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSelect(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSchedYield(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedYield().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMremap(a1: Int, a2: UInt, a3: UInt, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMremap(a1, a2.toInt(), a3.toInt(), a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMsync(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMsync(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMadvise(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMadvise(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup2(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup2(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysNanosleep(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysNanosleep(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAlarm(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAlarm(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetitimer(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetitimer(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSocket(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocket(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysConnect(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysConnect(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccept(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSendto(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendto(a1, a2, a3.toInt(), a4, a5, a6.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRecvfrom(a1: Int, a2: Int, a3: UInt, a4: Int, a5: Int, a6: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvfrom(a1, a2, a3.toInt(), a4, a5, a6).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSendmsg(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSendmsg(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRecvmsg(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRecvmsg(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysShutdown(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysShutdown(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysBind(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysBind(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysListen(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysListen(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsockname(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockname(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpeername(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpeername(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSocketpair(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSocketpair(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsockopt(a1, a2, a3, a4, a5.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsockopt(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsockopt(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFork(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFork().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExecve(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExecve(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExit(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExit(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysWait4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysWait4(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysKill(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysKill(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUname(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUname(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFcntl(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFcntl(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFlock(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFlock(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFsync(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFsync(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFdatasync(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFdatasync(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFtruncate(a1: Int, a2: Long): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFtruncate(a1, a2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetdents(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetcwd(a1: Int, a2: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetcwd(a1, a2.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChdir(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChdir(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchdir(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchdir(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRename(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRename(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMkdir(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdir(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRmdir(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRmdir(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLink(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLink(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUnlink(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlink(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSymlink(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlink(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadlink(a1: Int, a2: Int, a3: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlink(a1, a2, a3.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChmod(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChmod(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchmod(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmod(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChown(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChown(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchown(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchown(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUmask(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUmask(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrlimit(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrlimit(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrusage(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrusage(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSysinfo(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSysinfo(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetuid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetuid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetgid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetuid(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetuid(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetgid(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgid(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGeteuid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGeteuid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetegid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetegid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetpgid(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetpgid(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetppid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetppid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetsid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetsid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetreuid(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetreuid(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetregid(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetregid(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetgroups(a1: UInt, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetgroups(a1.toInt(), a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetgroups(a1: UInt, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetgroups(a1.toInt(), a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetresuid(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresuid(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetresgid(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetresgid(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetpgid(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetpgid(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetsid(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetsid(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigpending(a1: Int, a2: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigpending(a1, a2.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRtSigsuspend(a1: Int, a2: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRtSigsuspend(a1, a2.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSigaltstack(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSigaltstack(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUtime(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtime(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStatfs(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatfs(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstatfs(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatfs(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPrctl(a1: Int, a2: ULong, a3: ULong, a4: ULong, a5: ULong): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrctl(a1, a2.toString(), a3.toString(), a4.toString(), a5.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetrlimit(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetrlimit(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysChroot(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysChroot(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGettid(): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGettid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysTkill(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysTkill(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFutex(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFutex(a1, a2, a3, a4, a5, a6).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSchedGetaffinity(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSchedGetaffinity(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetdents64(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetdents64(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSetTidAddress(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSetTidAddress(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFadvise(a1: Int, a2: Long, a3: Long, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFadvise(a1, a2.toString(), a3.toString(), a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockGettime(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGettime(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockGetres(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockGetres(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysClockNanosleep(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysClockNanosleep(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysExitGroup(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysExitGroup(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollCtl(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCtl(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysOpenat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysOpenat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysMkdirat(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysMkdirat(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchownat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchownat(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFstatat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFstatat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUnlinkat(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUnlinkat(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysLinkat(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysLinkat(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysSymlinkat(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysSymlinkat(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysReadlinkat(a1: Int, a2: Int, a3: Int, a4: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysReadlinkat(a1, a2, a3, a4.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFchmodat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFchmodat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFaccessat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPselect6(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPselect6(a1, a2, a3, a4, a5, a6).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPpoll(a1: Int, a2: UInt, a3: Int, a4: Int, a5: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPpoll(a1, a2.toInt(), a3, a4, a5.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysUtimensat(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysUtimensat(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollPwait(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: UInt): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollPwait(a1, a2, a3, a4, a5, a6.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEventfd(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysAccept4(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysAccept4(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEventfd2(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEventfd2(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysEpollCreate1(a1: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysEpollCreate1(a1).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysDup3(a1: Int, a2: Int, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysDup3(a1, a2, a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPipe2(a1: Int, a2: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPipe2(a1, a2).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysPrlimit64(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysPrlimit64(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysRenameat2(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysRenameat2(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysGetrandom(a1: Int, a2: UInt, a3: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysGetrandom(a1, a2.toInt(), a3).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysStatx(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysStatx(a1, a2, a3, a4, a5).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscallSysFaccessat2(a1: Int, a2: Int, a3: Int, a4: Int): CLong =
    if (unixLinuxlikeLinuxMuslB64Wasm32WaliNapiAvailable) wasmLibcUnixLinuxlikeLinuxMuslB64Wasm32WaliSyscallSysFaccessat2(a1, a2, a3, a4).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
