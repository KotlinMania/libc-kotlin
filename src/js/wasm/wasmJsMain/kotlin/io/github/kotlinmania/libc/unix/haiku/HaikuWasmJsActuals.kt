@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixHaikuNapiAddon(): Boolean

private val _unixHaikuNapiAvailable: Boolean = _initUnixHaikuNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_haiku_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_haiku_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_getpriority(p0, p1)")
private external fun _wasm_libc_unix_haiku_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_endusershell()")
private external fun _wasm_libc_unix_haiku_endusershell()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_getpass(p0)")
private external fun _wasm_libc_unix_haiku_getpass(p0: String?): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_getusershell()")
private external fun _wasm_libc_unix_haiku_getusershell(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_issetugid()")
private external fun _wasm_libc_unix_haiku_issetugid(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_setusershell()")
private external fun _wasm_libc_unix_haiku_setusershell()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_futimens(p0, p1)")
private external fun _wasm_libc_unix_haiku_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_errnop()")
private external fun _wasm_libc_unix_haiku_errnop(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_abs(p0)")
private external fun _wasm_libc_unix_haiku_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_labs(p0)")
private external fun _wasm_libc_unix_haiku_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_rand()")
private external fun _wasm_libc_unix_haiku_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_srand(p0)")
private external fun _wasm_libc_unix_haiku_srand(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_getifaddrs(p0)")
private external fun _wasm_libc_unix_haiku_getifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_freeifaddrs(p0)")
private external fun _wasm_libc_unix_haiku_freeifaddrs(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_ppoll(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_ppoll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_getspent()")
private external fun _wasm_libc_unix_haiku_getspent(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_getspentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_getspentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_setspent()")
private external fun _wasm_libc_unix_haiku_setspent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_endspent()")
private external fun _wasm_libc_unix_haiku_endspent()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_getspnam(p0)")
private external fun _wasm_libc_unix_haiku_getspnam(p0: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_getspnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_getspnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_sgetspent(p0)")
private external fun _wasm_libc_unix_haiku_sgetspent(p0: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_sgetspentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_sgetspentR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_fgetspent(p0)")
private external fun _wasm_libc_unix_haiku_fgetspent(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_fgetspentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_fgetspentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_mknodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_mknodat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_semDestroy(p0)")
private external fun _wasm_libc_unix_haiku_semDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_semInit(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_clockGetres(p0, p1)")
private external fun _wasm_libc_unix_haiku_clockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_haiku_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_clockSettime(p0, p1)")
private external fun _wasm_libc_unix_haiku_clockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_clockGetcpuclockid(p0, p1)")
private external fun _wasm_libc_unix_haiku_clockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadAttrGetguardsize(p0, p1)")
private external fun _wasm_libc_unix_haiku_pthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadAttrSetguardsize(p0, p1)")
private external fun _wasm_libc_unix_haiku_pthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_unix_haiku_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_haiku_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_valloc(p0)")
private external fun _wasm_libc_unix_haiku_valloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_mallocUsableSize(p0)")
private external fun _wasm_libc_unix_haiku_mallocUsableSize(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_memalign(p0, p1)")
private external fun _wasm_libc_unix_haiku_memalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_setgroups(p0, p1)")
private external fun _wasm_libc_unix_haiku_setgroups(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_initgroups(p0, p1)")
private external fun _wasm_libc_unix_haiku_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_haiku_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_haiku_ioctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_dirfd(p0)")
private external fun _wasm_libc_unix_haiku_dirfd(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_haiku_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_haiku_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_unix_haiku_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadSpinInit(p0, p1)")
private external fun _wasm_libc_unix_haiku_pthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadSpinDestroy(p0)")
private external fun _wasm_libc_unix_haiku_pthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadSpinLock(p0)")
private external fun _wasm_libc_unix_haiku_pthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadSpinTrylock(p0)")
private external fun _wasm_libc_unix_haiku_pthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadSpinUnlock(p0)")
private external fun _wasm_libc_unix_haiku_pthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_waitid(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_waitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_glob(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_glob(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_globfree(p0)")
private external fun _wasm_libc_unix_haiku_globfree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_haiku_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_posixMadvise(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_posixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_posixFadvise(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_posixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_shmUnlink(p0)")
private external fun _wasm_libc_unix_haiku_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_seekdir(p0, p1)")
private external fun _wasm_libc_unix_haiku_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_telldir(p0)")
private external fun _wasm_libc_unix_haiku_telldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_madvise(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_nlLanginfo(p0)")
private external fun _wasm_libc_unix_haiku_nlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_bind(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_writev(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_readv(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_execvpe(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_execvpe(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_sigaltstack(p0, p1)")
private external fun _wasm_libc_unix_haiku_sigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_sigsuspend(p0)")
private external fun _wasm_libc_unix_haiku_sigsuspend(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_semClose(p0)")
private external fun _wasm_libc_unix_haiku_semClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_getdtablesize()")
private external fun _wasm_libc_unix_haiku_getdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_haiku_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_haiku_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_getgrnam(p0)")
private external fun _wasm_libc_unix_haiku_getgrnam(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadKill(p0, p1)")
private external fun _wasm_libc_unix_haiku_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_semUnlink(p0)")
private external fun _wasm_libc_unix_haiku_semUnlink(p0: String?): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_getpwnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_getpwnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_getpwuidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_getpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_getpwent()")
private external fun _wasm_libc_unix_haiku_getpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_setpwent()")
private external fun _wasm_libc_unix_haiku_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_endpwent()")
private external fun _wasm_libc_unix_haiku_endpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_endgrent()")
private external fun _wasm_libc_unix_haiku_endgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_getgrent()")
private external fun _wasm_libc_unix_haiku_getgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_setgrent()")
private external fun _wasm_libc_unix_haiku_setgrent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_sigwait(p0, p1)")
private external fun _wasm_libc_unix_haiku_sigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_getgrgid(p0)")
private external fun _wasm_libc_unix_haiku_getgrgid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_popen(p0, p1)")
private external fun _wasm_libc_unix_haiku_popen(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_sethostname(p0, p1)")
private external fun _wasm_libc_unix_haiku_sethostname(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_uname(p0)")
private external fun _wasm_libc_unix_haiku_uname(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_getutxent()")
private external fun _wasm_libc_unix_haiku_getutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_getutxid(p0)")
private external fun _wasm_libc_unix_haiku_getutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_getutxline(p0)")
private external fun _wasm_libc_unix_haiku_getutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_pututxline(p0)")
private external fun _wasm_libc_unix_haiku_pututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_setutxent()")
private external fun _wasm_libc_unix_haiku_setutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_endutxent()")
private external fun _wasm_libc_unix_haiku_endutxent()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_sigwaitinfo(p0, p1)")
private external fun _wasm_libc_unix_haiku_sigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_getitimer(p0, p1)")
private external fun _wasm_libc_unix_haiku_getitimer(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_setitimer(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_setitimer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_regcomp(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_regcomp(p0: String, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_regexec(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_regexec(p0: String, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_regerror(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_regerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_regfree(p0)")
private external fun _wasm_libc_unix_haiku_regfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_msgctl(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_msgctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_msgget(p0, p1)")
private external fun _wasm_libc_unix_haiku_msgget(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_msgrcv(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_msgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_msgsnd(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_msgsnd(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_semget(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_semget(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_haiku_semctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_haiku_semctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_semop(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_semop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_ftok(p0, p1)")
private external fun _wasm_libc_unix_haiku_ftok(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_memrchr(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_memrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_lsearch(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_lsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_lfind(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_lfind(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_hcreate(p0)")
private external fun _wasm_libc_unix_haiku_hcreate(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_hdestroy()")
private external fun _wasm_libc_unix_haiku_hdestroy()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_drand48()")
private external fun _wasm_libc_unix_haiku_drand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_erand48(p0)")
private external fun _wasm_libc_unix_haiku_erand48(p0: String): Double

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_lrand48()")
private external fun _wasm_libc_unix_haiku_lrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_nrand48(p0)")
private external fun _wasm_libc_unix_haiku_nrand48(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_mrand48()")
private external fun _wasm_libc_unix_haiku_mrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_jrand48(p0)")
private external fun _wasm_libc_unix_haiku_jrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_srand48(p0)")
private external fun _wasm_libc_unix_haiku_srand48(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_seed48(p0)")
private external fun _wasm_libc_unix_haiku_seed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_lcong48(p0)")
private external fun _wasm_libc_unix_haiku_lcong48(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_clearenv()")
private external fun _wasm_libc_unix_haiku_clearenv(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_ctermid(p0)")
private external fun _wasm_libc_unix_haiku_ctermid(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_sync()")
private external fun _wasm_libc_unix_haiku_sync()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_haiku_getpagesize()")
private external fun _wasm_libc_unix_haiku_getpagesize(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_brk(p0)")
private external fun _wasm_libc_unix_haiku_brk(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_sbrk(p0)")
private external fun _wasm_libc_unix_haiku_sbrk(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_posixSpawn(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_haiku_posixSpawnp(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnFileActionsInit(p0)")
private external fun _wasm_libc_unix_haiku_posixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnFileActionsDestroy(p0)")
private external fun _wasm_libc_unix_haiku_posixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_posixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String?, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnFileActionsAddclose(p0, p1)")
private external fun _wasm_libc_unix_haiku_posixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_posixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrInit(p0)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrDestroy(p0)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrGetflags(p0, p1)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrSetflags(p0, p1)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrGetpgroup(p0, p1)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrSetpgroup(p0, p1)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrGetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrSetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrGetsigmask(p0, p1)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_posixSpawnattrSetsigmask(p0, p1)")
private external fun _wasm_libc_unix_haiku_posixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_haiku_getoptLong(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_haiku_getoptLong(p0: Int, p1: String, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_strcasecmpL(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_strcasecmpL(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_strncasecmpL(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_strncasecmpL(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_getentropy(p0, p1)")
private external fun _wasm_libc_unix_haiku_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_haiku_memmem(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_haiku_memmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadGetattrNp(p0, p1)")
private external fun _wasm_libc_unix_haiku_pthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_haiku_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_haiku_pthreadSetnameNp(p0, p1)")
private external fun _wasm_libc_unix_haiku_pthreadSetnameNp(p0: String, p1: String?): Int

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_setrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getpriority(which, who) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_setpriority(which, who, priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endusershell() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_endusershell()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpass(prompt: String?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getpass(prompt).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getusershell(): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getusershell().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun issetugid(): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_issetugid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setusershell() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_setusershell()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utimensat(fd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_utimensat(fd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnop(): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_errnop().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getifaddrs((ifap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_freeifaddrs((ifa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ppoll(fds: COpaquePointer?, numfds: NfdsT, timeout: COpaquePointer?, sigMask: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_ppoll((fds?.value ?: 0L).toString(), numfds.toString(), (timeout?.value ?: 0L).toString(), (sigMask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspent(): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getspent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getspentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), bufferSize.toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_setspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_endspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspnam(name: String?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getspnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnamR(name: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getspnamR(name, (spwd?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspent(line: String?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sgetspent(line).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(line: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sgetspentR(line, (spwd?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetspent(file: FILE?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_fgetspent((file?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetspentR(file: FILE?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_fgetspentR((file?.handle ?: 0L).toString(), (spwd?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferSize.toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_mknodat(dirfd, pathname, mode.toInt(), dev) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_clockGetres(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_clockGettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_clockSettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadCreate((thread?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun valloc(numBytes: SizeT): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_valloc(numBytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_mallocUsableSize((ptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_setgroups(ngroups, (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_initgroups(name, basegid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_ioctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadSpinDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadSpinLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadSpinTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadSpinUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_waitid(idtype, id, (infop?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixFadvise(fd, offset.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_nlLanginfo(item).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(socket: CInt, address: COpaquePointer?, addressLength: COpaquePointer?, flags: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_accept4(socket, (address?.value ?: 0L).toString(), (addressLength?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_writev(fd, (iov?.value ?: 0L).toString(), count).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_readv(fd, (iov?.value ?: 0L).toString(), count).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sendmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_recvmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_execvpe(file, (argv?.value ?: 0L).toString(), (environment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: COpaquePointer?, groupcount: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getgrouplist(user, basegroup.toInt(), (grouplist?.value ?: 0L).toString(), (groupcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getgrent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sethostname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getutxent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getutxid((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getutxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pututxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_faccessat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getitimer(which, (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_setitimer(which, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_regfree((preg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_msgctl(msqid, cmd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_msgget(key, msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtype.toString(), msgflg).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_msgsnd(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_semget(key, nsems, semflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_ftok(pathname, projId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_memrchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_lsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), (nelp?.value ?: 0L).toString(), width.toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_lfind((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), (nelp?.value ?: 0L).toString(), width.toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcreate(nelt: SizeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_hcreate(nelt.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdestroy() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_hdestroy()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): CDouble =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_drand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_erand48((xseed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_lrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_nrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_mrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_jrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_srand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_seed48((xseed?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_lcong48((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clearenv(): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_clearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_ctermid((s?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixHaikuNapiAvailable) {
        _wasm_libc_unix_haiku_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpagesize(): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getpagesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_brk((addr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_sbrk(increment.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnFileActionsInit((fileActions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnFileActionsDestroy((fileActions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnFileActionsAddopen((fileActions?.value ?: 0L).toString(), fildes, path, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnFileActionsAddclose((fileActions?.value ?: 0L).toString(), fildes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnFileActionsAdddup2((fileActions?.value ?: 0L).toString(), fildes, newfildes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (pgroup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), pgroup) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (sigdefault?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (sigdefault?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_strcasecmpL(string1, string2, (locale?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_strncasecmpL(string1, string2, length.toString(), (locale?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_memmem((source?.value ?: 0L).toString(), sourceLength.toString(), (search?.value ?: 0L).toString(), searchLength.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadGetattrNp(thread.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadGetnameNp(thread.toLong().toString(), (buffer?.value ?: 0L).toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_unixHaikuNapiAvailable) _wasm_libc_unix_haiku_pthreadSetnameNp(thread.toLong().toString(), name) else throw UnsupportedOperationException("Native FFI addon is not available")
