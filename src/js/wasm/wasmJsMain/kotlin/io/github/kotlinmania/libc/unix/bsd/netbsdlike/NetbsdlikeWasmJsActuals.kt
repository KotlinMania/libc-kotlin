@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.IdtypeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixBsdNetbsdlikeNapiAddon(): Boolean

private val _unixBsdNetbsdlikeNapiAvailable: Boolean = _initUnixBsdNetbsdlikeNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_setgrent()")
private external fun _wasm_libc_unix_bsd_netbsdlike_setgrent()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_semDestroy(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_semDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_semInit(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_daemon(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_mincore(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_mincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_clockGetres(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_clockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_clockSettime(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_clockSettime(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_errno()")
private external fun _wasm_libc_unix_bsd_netbsdlike_errno(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_memrchr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_memrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_mkostemp(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_mkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_mkostemps(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_mkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_futimens(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_fdatasync(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_fdatasync(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_loginTty(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_loginTty(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_getpriority(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_mknodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_mknodat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_semTimedwait(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_semTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_semGetvalue(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_semGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_sethostname(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_sethostname(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pthreadSpinInit(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pthreadSpinDestroy(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pthreadSpinLock(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pthreadSpinTrylock(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pthreadSpinUnlock(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pthreadSetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pthreadGetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_pipe2(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_pipe2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_ppoll(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_ppoll(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_initgroups(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_getdomainname(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_getdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_setdomainname(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_setdomainname(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_uname(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_uname(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_shmget(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_shmget(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_shmat(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_shmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_shmdt(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_shmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_shmctl(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_shmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_execvpe(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_execvpe(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_waitid(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_waitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawn(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnp(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrInit(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrDestroy(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrGetflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrSetflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String?, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_reallocarray(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_reallocarray(p0: String, p1: String, p2: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_gethostid()")
private external fun _wasm_libc_unix_bsd_netbsdlike_gethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_sethostid(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_sethostid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_ftok(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_ftok(p0: String?, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_dirname(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_dirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_basename(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_basename(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_getentropy(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_sendmmsg(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_sendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_recvmmsg(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_recvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_closefrom(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_closefrom(p0: Int): Int

public actual fun setgrent() {
    if (_unixBsdNetbsdlikeNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_accept4(s, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_clockGetres(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_clockGettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_clockSettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_errno().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_memrchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_mkostemp((template?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_fdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_loginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_getpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_setpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_mknodat(dirfd, pathname, mode.toInt(), dev) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_sethostname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pthreadSpinDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pthreadSpinLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pthreadSpinTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pthreadSpinUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_pipe2((fds?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, ts: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_ppoll((fds?.value ?: 0L).toString(), nfds.toInt(), (ts?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_getgrouplist(name, basegid.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_initgroups(name, basegid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_getdomainname((name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_setdomainname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_shmget(key.toString(), size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_shmdt((shmaddr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_waitid(idtype, id.toInt(), (infop?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_gethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_sethostid(hostid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(path: String?, id: CInt): KeyT =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_ftok(path, id).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_dirname((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_basename((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, mmsg: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_sendmmsg(sockfd, (mmsg?.value ?: 0L).toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, mmsg: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_recvmmsg(sockfd, (mmsg?.value ?: 0L).toString(), vlen.toInt(), flags, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt): CInt =
    if (_unixBsdNetbsdlikeNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_closefrom(lowfd) else throw UnsupportedOperationException("Native FFI addon is not available")
