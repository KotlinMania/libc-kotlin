@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixNtoNapiAddon(): Boolean

private val _unixNtoNapiAvailable: Boolean = _initUnixNtoNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_get_SYSPAGE_PTR()")
private external fun _wasm_libc_unix_nto_get_SYSPAGE_PTR(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_set_SYSPAGE_PTR(p0)")
private external fun _wasm_libc_unix_nto_set_SYSPAGE_PTR(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_sendmmsg(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_sendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_recvmmsg(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_recvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_semDestroy(p0)")
private external fun _wasm_libc_unix_nto_semDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_semInit(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_fdatasync(p0)")
private external fun _wasm_libc_unix_nto_fdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_getpriority(p0, p1)")
private external fun _wasm_libc_unix_nto_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_mknodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_mknodat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_clockGetres(p0, p1)")
private external fun _wasm_libc_unix_nto_clockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_nto_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_clockSettime(p0, p1)")
private external fun _wasm_libc_unix_nto_clockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_clockGetcpuclockid(p0, p1)")
private external fun _wasm_libc_unix_nto_clockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_memalign(p0, p1)")
private external fun _wasm_libc_unix_nto_memalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_setgroups(p0, p1)")
private external fun _wasm_libc_unix_nto_setgroups(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_posixFadvise(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_posixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_futimens(p0, p1)")
private external fun _wasm_libc_unix_nto_futimens(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_nlLanginfo(p0)")
private external fun _wasm_libc_unix_nto_nlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadCondattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadMutexattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadRwlockattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadRwlockattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_ptsnameR(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_ptsnameR(p0: Int, p1: String, p2: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_clearenv()")
private external fun _wasm_libc_unix_nto_clearenv(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_waitid(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_waitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_wait4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_wait4(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_execvpe(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_execvpe(p0: String?, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_getifaddrs(p0)")
private external fun _wasm_libc_unix_nto_getifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_freeifaddrs(p0)")
private external fun _wasm_libc_unix_nto_freeifaddrs(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_bind(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_writev(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_readv(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_forkpty(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_forkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_loginTty(p0)")
private external fun _wasm_libc_unix_nto_loginTty(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_uname(p0)")
private external fun _wasm_libc_unix_nto_uname(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_getpeereid(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_getpeereid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_abs(p0)")
private external fun _wasm_libc_unix_nto_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_labs(p0)")
private external fun _wasm_libc_unix_nto_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_rand()")
private external fun _wasm_libc_unix_nto_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_srand(p0)")
private external fun _wasm_libc_unix_nto_srand(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_setpwent()")
private external fun _wasm_libc_unix_nto_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_endpwent()")
private external fun _wasm_libc_unix_nto_endpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_getpwent()")
private external fun _wasm_libc_unix_nto_getpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_setgrent()")
private external fun _wasm_libc_unix_nto_setgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_endgrent()")
private external fun _wasm_libc_unix_nto_endgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_getgrent()")
private external fun _wasm_libc_unix_nto_getgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_setspent()")
private external fun _wasm_libc_unix_nto_setspent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_endspent()")
private external fun _wasm_libc_unix_nto_endspent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_ftok(p0, p1)")
private external fun _wasm_libc_unix_nto_ftok(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_mkostemp(p0, p1)")
private external fun _wasm_libc_unix_nto_mkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_mkostemps(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_mkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_sigwaitinfo(p0, p1)")
private external fun _wasm_libc_unix_nto_sigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadSetschedprio(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadSetschedprio(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_ifNameindex()")
private external fun _wasm_libc_unix_nto_ifNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_ifFreenameindex(p0)")
private external fun _wasm_libc_unix_nto_ifFreenameindex(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_glob(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_glob(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_globfree(p0)")
private external fun _wasm_libc_unix_nto_globfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_posixMadvise(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_posixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_shmUnlink(p0)")
private external fun _wasm_libc_unix_nto_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_seekdir(p0, p1)")
private external fun _wasm_libc_unix_nto_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_telldir(p0)")
private external fun _wasm_libc_unix_nto_telldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_nto_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_nto_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_mkstemps(p0, p1)")
private external fun _wasm_libc_unix_nto_mkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_getdomainname(p0, p1)")
private external fun _wasm_libc_unix_nto_getdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_setdomainname(p0, p1)")
private external fun _wasm_libc_unix_nto_setdomainname(p0: String?, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_sync()")
private external fun _wasm_libc_unix_nto_sync()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_pthreadGetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_pthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_umount(p0, p1)")
private external fun _wasm_libc_unix_nto_umount(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_schedGetPriorityMax(p0)")
private external fun _wasm_libc_unix_nto_schedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_settimeofday(p0, p1)")
private external fun _wasm_libc_unix_nto_settimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_schedRrGetInterval(p0, p1)")
private external fun _wasm_libc_unix_nto_schedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_semTimedwait(p0, p1)")
private external fun _wasm_libc_unix_nto_semTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_semGetvalue(p0, p1)")
private external fun _wasm_libc_unix_nto_semGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_schedSetparam(p0, p1)")
private external fun _wasm_libc_unix_nto_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_nto_mount(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_nto_mount(p0: String?, p1: String?, p2: Int, p3: String?, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_schedGetparam(p0, p1)")
private external fun _wasm_libc_unix_nto_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadMutexConsistent(p0)")
private external fun _wasm_libc_unix_nto_pthreadMutexConsistent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadSpinInit(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadSpinDestroy(p0)")
private external fun _wasm_libc_unix_nto_pthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadSpinLock(p0)")
private external fun _wasm_libc_unix_nto_pthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadSpinTrylock(p0)")
private external fun _wasm_libc_unix_nto_pthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadSpinUnlock(p0)")
private external fun _wasm_libc_unix_nto_pthreadSpinUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadBarrierattrInit(p0)")
private external fun _wasm_libc_unix_nto_pthreadBarrierattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadBarrierattrDestroy(p0)")
private external fun _wasm_libc_unix_nto_pthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadBarrierattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadBarrierattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_pthreadBarrierInit(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_pthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadBarrierDestroy(p0)")
private external fun _wasm_libc_unix_nto_pthreadBarrierDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadBarrierWait(p0)")
private external fun _wasm_libc_unix_nto_pthreadBarrierWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_schedGetscheduler(p0)")
private external fun _wasm_libc_unix_nto_schedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_clockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadAttrGetguardsize(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadAttrSetguardsize(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_sethostname(p0, p1)")
private external fun _wasm_libc_unix_nto_sethostname(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_schedGetPriorityMin(p0)")
private external fun _wasm_libc_unix_nto_schedGetPriorityMin(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadCondattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_pthreadSetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_pthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_sigsuspend(p0)")
private external fun _wasm_libc_unix_nto_sigsuspend(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_semClose(p0)")
private external fun _wasm_libc_unix_nto_semClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_getdtablesize()")
private external fun _wasm_libc_unix_nto_getdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_initgroups(p0, p1)")
private external fun _wasm_libc_unix_nto_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_nto_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_nto_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_getgrnam(p0)")
private external fun _wasm_libc_unix_nto_getgrnam(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_pthreadCancel(p0)")
private external fun _wasm_libc_unix_nto_pthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadKill(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_semUnlink(p0)")
private external fun _wasm_libc_unix_nto_semUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_daemon(p0, p1)")
private external fun _wasm_libc_unix_nto_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_getpwnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_getpwnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_getpwuidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_getpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_sigwait(p0, p1)")
private external fun _wasm_libc_unix_nto_sigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_getgrgid(p0)")
private external fun _wasm_libc_unix_nto_getgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadMutexattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadMutexattrGetrobust(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadMutexattrGetrobust(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadMutexattrSetrobust(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadMutexattrSetrobust(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_getitimer(p0, p1)")
private external fun _wasm_libc_unix_nto_getitimer(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_setitimer(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_setitimer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_nto_posixSpawn(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_nto_posixSpawnp(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrInit(p0)")
private external fun _wasm_libc_unix_nto_posixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrDestroy(p0)")
private external fun _wasm_libc_unix_nto_posixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrGetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrSetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrGetsigmask(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrSetsigmask(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrGetflags(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrSetflags(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrGetpgroup(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrSetpgroup(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrGetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrSetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrGetschedparam(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnattrSetschedparam(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnFileActionsInit(p0)")
private external fun _wasm_libc_unix_nto_posixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnFileActionsDestroy(p0)")
private external fun _wasm_libc_unix_nto_posixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_posixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String?, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnFileActionsAddclose(p0, p1)")
private external fun _wasm_libc_unix_nto_posixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_posixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_posixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_popen(p0, p1)")
private external fun _wasm_libc_unix_nto_popen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_inotifyRmWatch(p0, p1)")
private external fun _wasm_libc_unix_nto_inotifyRmWatch(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_inotifyInit()")
private external fun _wasm_libc_unix_nto_inotifyInit(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_inotifyAddWatch(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_inotifyAddWatch(p0: Int, p1: String?, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_gettid()")
private external fun _wasm_libc_unix_nto_gettid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadGetcpuclockid(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_nto_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_nto_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_mallopt(p0, p1)")
private external fun _wasm_libc_unix_nto_mallopt(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_nto_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_ctermid(p0)")
private external fun _wasm_libc_unix_nto_ctermid(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_nto_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_nto_ioctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_getpwentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_getpwentR(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_pthreadGetnameNp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_pthreadSetnameNp(p0, p1)")
private external fun _wasm_libc_unix_nto_pthreadSetnameNp(p0: String, p1: String?): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_nto_sysctl(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_nto_sysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_nto_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_nto_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_lioListio(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_lioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_dlIteratePhdr(p0, p1)")
private external fun _wasm_libc_unix_nto_dlIteratePhdr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_memsetS(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_memsetS(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_regcomp(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_regcomp(p0: String, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_regexec(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_regexec(p0: String, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_regerror(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_regerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_regfree(p0)")
private external fun _wasm_libc_unix_nto_regfree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_dirfd(p0)")
private external fun _wasm_libc_unix_nto_dirfd(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_nto_dircntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_nto_dircntl(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_aioCancel(p0, p1)")
private external fun _wasm_libc_unix_nto_aioCancel(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_aioError(p0)")
private external fun _wasm_libc_unix_nto_aioError(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_aioFsync(p0, p1)")
private external fun _wasm_libc_unix_nto_aioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_aioRead(p0)")
private external fun _wasm_libc_unix_nto_aioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_aioReturn(p0)")
private external fun _wasm_libc_unix_nto_aioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_aioSuspend(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_aioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_aioWrite(p0)")
private external fun _wasm_libc_unix_nto_aioWrite(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_mqClose(p0)")
private external fun _wasm_libc_unix_nto_mqClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_mqGetattr(p0, p1)")
private external fun _wasm_libc_unix_nto_mqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nto_mqNotify(p0, p1)")
private external fun _wasm_libc_unix_nto_mqNotify(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_nto_mqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_nto_mqOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_mqReceive(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_mqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nto_mqSend(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nto_mqSend(p0: String, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nto_mqSetattr(p0, p1, p2)")
private external fun _wasm_libc_unix_nto_mqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_mqTimedreceive(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_mqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_nto_mqTimedsend(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_nto_mqTimedsend(p0: String, p1: String?, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_mqUnlink(p0)")
private external fun _wasm_libc_unix_nto_mqUnlink(p0: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nto_getErrnoPtr()")
private external fun _wasm_libc_unix_nto_getErrnoPtr(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nto_myThreadExit(p0)")
private external fun _wasm_libc_unix_nto_myThreadExit(p0: String)

public actual var SYSPAGE_PTR: COpaquePointer?
    get() = if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_get_SYSPAGE_PTR().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_unixNtoNapiAvailable) {
            _wasm_libc_unix_nto_set_SYSPAGE_PTR((value?.value ?: 0L).toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags.toInt(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_fdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getpriority(which, who) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_setpriority(which, who, prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mknodat(fd, pathname, mode.toInt(), dev.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_clockGetres(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_clockGettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_clockSettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_setgroups(ngroups, (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_nlLanginfo(item).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_clearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_waitid(idtype.toInt(), id, (infop?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getifaddrs((ifap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_freeifaddrs((ifa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_sendmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_recvmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_loginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getpeereid(socket, (euid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setpwent() {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getgrent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_setspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_endspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_ftok(pathname, projId).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mkostemp((template?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadSetschedprio(native.toLong().toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_ifNameindex().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_ifFreenameindex((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mkstemps((template?.value ?: 0L).toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getdomainname((name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_setdomainname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: String?, flags: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_umount(target, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_schedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mount(specialDevice, mountDirectory, flags, mountType, (mountData?.value ?: 0L).toString(), mountDatalen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadMutexConsistent((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadSpinDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadSpinLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadSpinTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadSpinUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadBarrierWait((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_sethostname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_schedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_initgroups(user, group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadCancel(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robustness: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadMutexattrGetrobust((attr?.value ?: 0L).toString(), (robustness?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadMutexattrSetrobust((attr?.value ?: 0L).toString(), robustness) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getitimer(which, (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_setitimer(which, (value?.value ?: 0L).toString(), (ovalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_faccessat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_inotifyRmWatch(fd, wd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit(): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_inotifyInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_inotifyAddWatch(fd, path, mask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettid(): PidT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_gettid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadGetcpuclockid(thread.toLong().toString(), (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: Long): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mallopt(param, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_ctermid((s?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufsize: CInt, result: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), bufsize, (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_pthreadSetnameNp(thread.toLong().toString(), name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(arg0: COpaquePointer?, arg1: CUint, arg2: COpaquePointer?, arg3: COpaquePointer?, arg4: COpaquePointer?, arg5: SizeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_sysctl((arg0?.value ?: 0L).toString(), arg1.toInt(), (arg2?.value ?: 0L).toString(), (arg3?.value ?: 0L).toString(), (arg4?.value ?: 0L).toString(), arg5.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_setrlimit(resource, (rlp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_lioListio(mode, (list?.value ?: 0L).toString(), nent, (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_memsetS((s?.value ?: 0L).toString(), smax.toString(), c, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: COpaquePointer?, str: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_regexec((preg?.value ?: 0L).toString(), str, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_regfree((preg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dircntl(dir: DIR?, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_dircntl((dir?.handle ?: 0L).toString(), cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_aioError((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(operation: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_aioFsync(operation, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_aioRead((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocpb: COpaquePointer?): SsizeT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_aioReturn((aiocpb?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_aioSuspend((list?.value ?: 0L).toString(), nent, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocpb: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_aioWrite((aiocpb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqdes: MqdT): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqClose(mqdes.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqdes: MqdT, mqstat: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqGetattr(mqdes.toLong().toString(), (mqstat?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqdes: MqdT, notification: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqNotify(mqdes.toLong().toString(), (notification?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqReceive(mqdes.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqSend(mqdes.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqdes: MqdT, mqstat: COpaquePointer?, omqstat: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqSetattr(mqdes.toLong().toString(), (mqstat?.value ?: 0L).toString(), (omqstat?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqTimedreceive(mqdes.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqTimedsend(mqdes.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: String?): CInt =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_mqUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getErrnoPtr(): COpaquePointer? =
    if (_unixNtoNapiAvailable) _wasm_libc_unix_nto_getErrnoPtr().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
    if (_unixNtoNapiAvailable) {
        _wasm_libc_unix_nto_myThreadExit((valuePtr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
