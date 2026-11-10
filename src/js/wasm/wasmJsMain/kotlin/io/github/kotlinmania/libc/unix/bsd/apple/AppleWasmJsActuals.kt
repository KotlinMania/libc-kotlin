@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixBsdAppleNapiAddon(): Boolean

private val _unixBsdAppleNapiAvailable: Boolean = _initUnixBsdAppleNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_get_MACH_TASK_SELF()")
private external fun _wasm_libc_unix_bsd_apple_get_MACH_TASK_SELF(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_set_MACH_TASK_SELF(p0)")
private external fun _wasm_libc_unix_bsd_apple_set_MACH_TASK_SELF(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_get_VM_PAGE_SIZE()")
private external fun _wasm_libc_unix_bsd_apple_get_VM_PAGE_SIZE(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_setgrent()")
private external fun _wasm_libc_unix_bsd_apple_setgrent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_daemon(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_daemon(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_semDestroy(p0)")
private external fun _wasm_libc_unix_bsd_apple_semDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_semInit(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_aioRead(p0)")
private external fun _wasm_libc_unix_bsd_apple_aioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_aioWrite(p0)")
private external fun _wasm_libc_unix_bsd_apple_aioWrite(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_aioFsync(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_aioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_aioError(p0)")
private external fun _wasm_libc_unix_bsd_apple_aioError(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_aioReturn(p0)")
private external fun _wasm_libc_unix_bsd_apple_aioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_aioSuspend(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_aioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_aioCancel(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_aioCancel(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_chflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_chflags(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fchflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_fchflags(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_clockGetres(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_clockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_lioListio(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_lioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_dirfd(p0)")
private external fun _wasm_libc_unix_bsd_apple_dirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_lutimes(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_lutimes(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_gettimeofday(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_getutxent()")
private external fun _wasm_libc_unix_bsd_apple_getutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getutxid(p0)")
private external fun _wasm_libc_unix_bsd_apple_getutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getutxline(p0)")
private external fun _wasm_libc_unix_bsd_apple_getutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pututxline(p0)")
private external fun _wasm_libc_unix_bsd_apple_pututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_setutxent()")
private external fun _wasm_libc_unix_bsd_apple_setutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_endutxent()")
private external fun _wasm_libc_unix_bsd_apple_endutxent()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_utmpxname(p0)")
private external fun _wasm_libc_unix_bsd_apple_utmpxname(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_asctime(p0)")
private external fun _wasm_libc_unix_bsd_apple_asctime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_ctime(p0)")
private external fun _wasm_libc_unix_bsd_apple_ctime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getdate(p0)")
private external fun _wasm_libc_unix_bsd_apple_getdate(p0: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_strptime(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_strptime(p0: String?, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_asctimeR(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_asctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_ctimeR(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_ctimeR(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_apple_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mincore(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_mincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_sysctlnametomib(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_sysctlnametomib(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_semget(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_semget(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_bsd_apple_semctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_bsd_apple_semctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_semop(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_semop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_apple_shmOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_apple_shmOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_ftok(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_ftok(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_shmat(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_shmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_shmdt(p0)")
private external fun _wasm_libc_unix_bsd_apple_shmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_shmctl(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_shmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_shmget(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_shmget(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_sysctl(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_sysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_sysctlbyname(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_sysctlbyname(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_machAbsoluteTime()")
private external fun _wasm_libc_unix_bsd_apple_machAbsoluteTime(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_machTimebaseInfo(p0)")
private external fun _wasm_libc_unix_bsd_apple_machTimebaseInfo(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_machHostSelf()")
private external fun _wasm_libc_unix_bsd_apple_machHostSelf(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_machThreadSelf()")
private external fun _wasm_libc_unix_bsd_apple_machThreadSelf(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadAttrGetscope(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_pthreadAttrGetscope(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadAttrGetstackaddr(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_pthreadAttrGetstackaddr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadAttrGetdetachstate(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_pthreadAttrGetdetachstate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadAttrSetscope(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_pthreadAttrSetscope(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadAttrSetstackaddr(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_pthreadAttrSetstackaddr(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadSetnameNp(p0)")
private external fun _wasm_libc_unix_bsd_apple_pthreadSetnameNp(p0: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadMachThreadNp(p0)")
private external fun _wasm_libc_unix_bsd_apple_pthreadMachThreadNp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadFromMachThreadNp(p0)")
private external fun _wasm_libc_unix_bsd_apple_pthreadFromMachThreadNp(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadGetStackaddrNp(p0)")
private external fun _wasm_libc_unix_bsd_apple_pthreadGetStackaddrNp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadGetStacksizeNp(p0)")
private external fun _wasm_libc_unix_bsd_apple_pthreadGetStacksizeNp(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadMainNp()")
private external fun _wasm_libc_unix_bsd_apple_pthreadMainNp(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadThreadidNp(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_pthreadThreadidNp(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadJitWriteProtectNp(p0)")
private external fun _wasm_libc_unix_bsd_apple_pthreadJitWriteProtectNp(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp()")
private external fun _wasm_libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp()")
private external fun _wasm_libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pthreadCpuNumberNp(p0)")
private external fun _wasm_libc_unix_bsd_apple_pthreadCpuNumberNp(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osSyncWaitOnAddress(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_osSyncWaitOnAddress(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osSyncWakeByAddressAny(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_osSyncWakeByAddressAny(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osSyncWakeByAddressAll(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_osSyncWakeByAddressAll(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osUnfairLockLock(p0)")
private external fun _wasm_libc_unix_bsd_apple_osUnfairLockLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osUnfairLockTrylock(p0)")
private external fun _wasm_libc_unix_bsd_apple_osUnfairLockTrylock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osUnfairLockUnlock(p0)")
private external fun _wasm_libc_unix_bsd_apple_osUnfairLockUnlock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osUnfairLockAssertOwner(p0)")
private external fun _wasm_libc_unix_bsd_apple_osUnfairLockAssertOwner(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osUnfairLockAssertNotOwner(p0)")
private external fun _wasm_libc_unix_bsd_apple_osUnfairLockAssertNotOwner(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osLogCreate(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_osLogCreate(p0: String?, p1: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osLogTypeEnabled(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_osLogTypeEnabled(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osSignpostIdMakeWithPointer(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_osSignpostIdMakeWithPointer(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osSignpostIdGenerate(p0)")
private external fun _wasm_libc_unix_bsd_apple_osSignpostIdGenerate(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_osSignpostEnabled(p0)")
private external fun _wasm_libc_unix_bsd_apple_osSignpostEnabled(p0: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_threadPolicySet(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_threadPolicySet(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_threadPolicyGet(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_threadPolicyGet(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_threadInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_threadInfo(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_error()")
private external fun _wasm_libc_unix_bsd_apple_error(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_backtrace(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_backtrace(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_backtraceSymbols(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_backtraceSymbols(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_backtraceSymbolsFd(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_backtraceSymbolsFd(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_backtraceFromFp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_backtraceFromFp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_backtraceImageOffsets(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_backtraceImageOffsets(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_backtraceAsync(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_backtraceAsync(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_statfs(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_statfs(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fstatfs(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_fstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_kevent(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_kevent(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_apple_kevent64(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_apple_kevent64(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mount(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_mount(p0: String?, p1: String?, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fmount(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_fmount(p0: String?, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_ptrace(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_ptrace(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_quotactl(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_quotactl(p0: String?, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_sethostname(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_sethostname(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_sendfile(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_sendfile(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_futimens(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_forkpty(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_forkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_loginTty(p0)")
private external fun _wasm_libc_unix_bsd_apple_loginTty(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_duplocale(p0)")
private external fun _wasm_libc_unix_bsd_apple_duplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_freelocale(p0)")
private external fun _wasm_libc_unix_bsd_apple_freelocale(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_localeconvL(p0)")
private external fun _wasm_libc_unix_bsd_apple_localeconvL(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_newlocale(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_newlocale(p0: Int, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_uselocale(p0)")
private external fun _wasm_libc_unix_bsd_apple_uselocale(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_querylocale(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_querylocale(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getpriority(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getdomainname(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_getdomainname(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_setdomainname(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_setdomainname(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getxattr(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_getxattr(p0: String?, p1: String?, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fgetxattr(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_fgetxattr(p0: Int, p1: String?, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_setxattr(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_setxattr(p0: String?, p1: String?, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fsetxattr(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_fsetxattr(p0: Int, p1: String?, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_listxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_listxattr(p0: String?, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_flistxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_flistxattr(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_removexattr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_removexattr(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_renamexNp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_renamexNp(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_renameatxNp(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_renameatxNp(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fremovexattr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_fremovexattr(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_initgroups(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_waitid(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_waitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_brk(p0)")
private external fun _wasm_libc_unix_bsd_apple_brk(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_sbrk(p0)")
private external fun _wasm_libc_unix_bsd_apple_sbrk(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_settimeofday(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_settimeofday(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_dyldImageCount()")
private external fun _wasm_libc_unix_bsd_apple_dyldImageCount(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_dyldGetImageHeader(p0)")
private external fun _wasm_libc_unix_bsd_apple_dyldGetImageHeader(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_dyldGetImageVmaddrSlide(p0)")
private external fun _wasm_libc_unix_bsd_apple_dyldGetImageVmaddrSlide(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_dyldGetImageName(p0)")
private external fun _wasm_libc_unix_bsd_apple_dyldGetImageName(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawn(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnp(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrInit(p0)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrDestroy(p0)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrGetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrSetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrGetsigmask(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrSetsigmask(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrGetflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrSetflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrGetpgroup(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrSetpgroup(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrSetarchprefNp(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrSetarchprefNp(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrGetarchprefNp(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrGetarchprefNp(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrGetbinprefNp(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrGetbinprefNp(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnattrSetbinprefNp(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnattrSetbinprefNp(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnFileActionsInit(p0)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnFileActionsDestroy(p0)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String?, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnFileActionsAddclose(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_posixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_posixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_uname(p0)")
private external fun _wasm_libc_unix_bsd_apple_uname(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_bsd_apple_connectx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_bsd_apple_connectx(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_disconnectx(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_disconnectx(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_ntpAdjtime(p0)")
private external fun _wasm_libc_unix_bsd_apple_ntpAdjtime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_ntpGettime(p0)")
private external fun _wasm_libc_unix_bsd_apple_ntpGettime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getmntinfo(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_getmntinfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getfsstat(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_getfsstat(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_clonefile(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_clonefile(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_clonefileat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_clonefileat(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fclonefileat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_fclonefileat(p0: Int, p1: Int, p2: String?, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_copyfile(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_copyfile(p0: String?, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fcopyfile(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_fcopyfile(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_copyfileStateFree(p0)")
private external fun _wasm_libc_unix_bsd_apple_copyfileStateFree(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_copyfileStateAlloc()")
private external fun _wasm_libc_unix_bsd_apple_copyfileStateAlloc(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_copyfileStateGet(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_copyfileStateGet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_copyfileStateSet(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_copyfileStateSet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_machErrorString(p0)")
private external fun _wasm_libc_unix_bsd_apple_machErrorString(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_memsetS(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_memsetS(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_memsetPattern4(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_memsetPattern4(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_memsetPattern8(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_memsetPattern8(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_memsetPattern16(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_memsetPattern16(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_strtonum(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_strtonum(p0: String?, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocPrintf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_mallocPrintf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZoneCheck(p0)")
private external fun _wasm_libc_unix_bsd_apple_mallocZoneCheck(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZonePrint(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_mallocZonePrint(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZoneStatistics(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_mallocZoneStatistics(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZoneLog(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_mallocZoneLog(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZonePrintPtrInfo(p0)")
private external fun _wasm_libc_unix_bsd_apple_mallocZonePrintPtrInfo(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocDefaultZone()")
private external fun _wasm_libc_unix_bsd_apple_mallocDefaultZone(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZoneFromPtr(p0)")
private external fun _wasm_libc_unix_bsd_apple_mallocZoneFromPtr(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZoneMalloc(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_mallocZoneMalloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZoneValloc(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_mallocZoneValloc(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZoneCalloc(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_mallocZoneCalloc(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZoneRealloc(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_mallocZoneRealloc(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocZoneFree(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_mallocZoneFree(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procListpids(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_procListpids(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procListallpids(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_procListallpids(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procListpgrppids(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_procListpgrppids(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procListchildpids(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_procListchildpids(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procPidinfo(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_procPidinfo(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procPidfdinfo(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_procPidfdinfo(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procPidfileportinfo(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_procPidfileportinfo(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procPidpath(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_procPidpath(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procName(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_procName(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procRegionfilename(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_procRegionfilename(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procKmsgbuf(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_procKmsgbuf(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procLibversion(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_procLibversion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procPidRusage(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_procPidRusage(p0: Int, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_procSetNoSmt()")
private external fun _wasm_libc_unix_bsd_apple_procSetNoSmt(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_procSetthreadNoSmt()")
private external fun _wasm_libc_unix_bsd_apple_procSetthreadNoSmt(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procSetCsm(p0)")
private external fun _wasm_libc_unix_bsd_apple_procSetCsm(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_procSetthreadCsm(p0)")
private external fun _wasm_libc_unix_bsd_apple_procSetthreadCsm(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_gethostuuid(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_gethostuuid(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_gethostid()")
private external fun _wasm_libc_unix_bsd_apple_gethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_sethostid(p0)")
private external fun _wasm_libc_unix_bsd_apple_sethostid(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_cCRandomGenerateBytes(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_cCRandomGenerateBytes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getentropy(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_nsgetExecutablePath(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_nsgetExecutablePath(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_nsgetArgv()")
private external fun _wasm_libc_unix_bsd_apple_nsgetArgv(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_nsgetArgc()")
private external fun _wasm_libc_unix_bsd_apple_nsgetArgc(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_nsgetEnviron()")
private external fun _wasm_libc_unix_bsd_apple_nsgetEnviron(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_apple_nsgetProgname()")
private external fun _wasm_libc_unix_bsd_apple_nsgetProgname(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_libc.libc_unix_bsd_apple_machVmMap(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_libc_unix_bsd_apple_machVmMap(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: Int, p8: Int, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_vmAllocate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_vmAllocate(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_vmDeallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_vmDeallocate(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_hostStatistics64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_hostStatistics64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_hostProcessorInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_hostProcessorInfo(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_taskForPid(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_taskForPid(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_taskInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_taskInfo(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_taskCreate(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_taskCreate(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_taskTerminate(p0)")
private external fun _wasm_libc_unix_bsd_apple_taskTerminate(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_taskThreads(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_taskThreads(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_hostStatistics(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_hostStatistics(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getattrlist(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_getattrlist(p0: String?, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fgetattrlist(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_fgetattrlist(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getattrlistat(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_getattrlistat(p0: Int, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_setattrlist(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_setattrlist(p0: String?, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_fsetattrlist(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_fsetattrlist(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_apple_setattrlistat(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_apple_setattrlistat(p0: Int, p1: String?, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_getattrlistbulk(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_getattrlistbulk(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocSize(p0)")
private external fun _wasm_libc_unix_bsd_apple_mallocSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mallocGoodSize(p0)")
private external fun _wasm_libc_unix_bsd_apple_mallocGoodSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_dirname(p0)")
private external fun _wasm_libc_unix_bsd_apple_dirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_basename(p0)")
private external fun _wasm_libc_unix_bsd_apple_basename(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_mknodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_mknodat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_freadlink(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_freadlink(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_apple_execvP(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_apple_execvP(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_qsortR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_qsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_clockSettime(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_clockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_memmem(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_memmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_apple_taskSetInfo(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_apple_taskSetInfo(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_apple_iconvOpen(p0, p1)")
private external fun _wasm_libc_unix_bsd_apple_iconvOpen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_apple_iconv(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_apple_iconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_apple_iconvClose(p0)")
private external fun _wasm_libc_unix_bsd_apple_iconvClose(p0: String): Int

public actual var MACH_TASK_SELF: MachPortT
    get() = if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_get_MACH_TASK_SELF().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (_unixBsdAppleNapiAvailable) {
            _wasm_libc_unix_bsd_apple_set_MACH_TASK_SELF(value.toInt())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_get_VM_PAGE_SIZE().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_aioRead((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_aioWrite((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_aioFsync(op, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_aioError((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_aioReturn((aiocbp?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: String?, flags: CUint): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_chflags(path, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fchflags(fd, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_clockGetres(clkId.toInt(), (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_clockGettime(clkId.toInt(), (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_lutimes(file, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getutxent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getutxid((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getutxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pututxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_utmpxname(file) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_asctime((tm?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(clock: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_ctime((clock?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdate(datestr: String?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getdate(datestr).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(buf: String?, format: String?, timeptr: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_strptime(buf, format, (timeptr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_asctimeR((tm?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(clock: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_ctimeR((clock?.value ?: 0L).toString(), (result?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_sysctlnametomib(name, (mibp?.value ?: 0L).toString(), (sizep?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_semget(key, nsems, semflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_shmOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_ftok(pathname, projId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_shmdt((shmaddr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_shmget(key, size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_sysctl((name?.value ?: 0L).toString(), namelen.toInt(), (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_sysctlbyname(name, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machAbsoluteTime(): ULong =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_machAbsoluteTime().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machTimebaseInfo(info: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_machTimebaseInfo((info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machHostSelf(): MachPortT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_machHostSelf().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machThreadSelf(): MachPortT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_machThreadSelf().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwaitRelativeNp(cond: COpaquePointer?, lock: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadAttrGetscope((attr?.value ?: 0L).toString(), (contentionscope?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadAttrGetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadAttrGetdetachstate((attr?.value ?: 0L).toString(), (detachstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadAttrSetscope((attr?.value ?: 0L).toString(), contentionscope) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadAttrSetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(name: String?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadSetnameNp(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadMachThreadNp(thread.toLong().toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadFromMachThreadNp(port.toInt()).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadGetStackaddrNp(thread.toLong().toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadGetStacksizeNp(thread.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMainNp(): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadMainNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadThreadidNp(thread.toLong().toString(), (threadId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_pthreadJitWriteProtectNp(enabled)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp(0L.toString(), (ctx?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pthreadCpuNumberNp((cpuNumberOut?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osSyncWaitOnAddress((addr?.value ?: 0L).toString(), value.toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline((addr?.value ?: 0L).toString(), value.toString(), size.toString(), flags.toInt(), clockid.toInt(), deadline.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout((addr?.value ?: 0L).toString(), value.toString(), size.toString(), flags.toInt(), clockid.toInt(), timeoutNs.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osSyncWakeByAddressAny((addr?.value ?: 0L).toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osSyncWakeByAddressAll((addr?.value ?: 0L).toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_osUnfairLockLock((lock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osUnfairLockTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_osUnfairLockUnlock((lock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_osUnfairLockAssertOwner((lock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_osUnfairLockAssertNotOwner((lock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osLogCreate(subsystem: String?, category: String?): OsLogT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osLogCreate(subsystem, category).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osLogTypeEnabled((oslog?.value ?: 0L).toString(), tpe.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: COpaquePointer?): OsSignpostIdT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osSignpostIdMakeWithPointer((log?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osSignpostIdGenerate((log?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_osSignpostEnabled((log?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_threadPolicySet(thread.toLong().toString(), flavor.toInt(), (policyInfo?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: COpaquePointer?, getDefault: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_threadPolicyGet(thread.toLong().toString(), flavor.toInt(), (policyInfo?.value ?: 0L).toString(), (count?.value ?: 0L).toString(), (getDefault?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_threadInfo(targetAct.toInt(), flavor.toInt(), (threadInfoOut?.value ?: 0L).toString(), (threadInfoOutCnt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun error(): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_error().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_backtrace((buf?.value ?: 0L).toString(), sz) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_backtraceSymbols((addrs?.value ?: 0L).toString(), sz).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_backtraceSymbolsFd((addrs?.value ?: 0L).toString(), sz, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_backtraceFromFp((startfp?.value ?: 0L).toString(), (array?.value ?: 0L).toString(), size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: COpaquePointer?, size: CInt) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_backtraceImageOffsets((array?.value ?: 0L).toString(), (imageOffsets?.value ?: 0L).toString(), size)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: COpaquePointer?): SizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_backtraceAsync((array?.value ?: 0L).toString(), length.toString(), (taskId?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_statfs(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fstatfs(fd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_kevent(kq, (changelist?.value ?: 0L).toString(), nchanges, (eventlist?.value ?: 0L).toString(), nevents, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent64(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, flags: CUint, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_kevent64(kq, (changelist?.value ?: 0L).toString(), nchanges, (eventlist?.value ?: 0L).toString(), nevents, flags.toInt(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mount(src, target, flags, (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fmount(src, fd, flags, (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_ptrace(request, pid, (addr?.value ?: 0L).toString(), data) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_quotactl(special, cmd, id, (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_sethostname(name, len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: COpaquePointer?, hdtr: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_sendfile(fd, s, offset.toString(), (len?.value ?: 0L).toString(), (hdtr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_loginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_duplocale((base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_freelocale((loc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconvL(loc: LocaleT): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_localeconvL((loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_newlocale(mask, locale, (base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_uselocale((loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_querylocale(mask, (loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_setpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getdomainname((name?.value ?: 0L).toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_setdomainname(name, len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), position.toInt(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fgetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), position.toInt(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_setxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), position.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fsetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), position.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_listxattr(path, (list?.value ?: 0L).toString(), size.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_flistxattr(filedes, (list?.value ?: 0L).toString(), size.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_removexattr(path, name, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renamexNp(from: String?, to: String?, flags: CUint): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_renamexNp(from, to, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_renameatxNp(fromfd, from, tofd, to, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fremovexattr(filedes, name, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: String?, basegid: CInt, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getgrouplist(name, basegid, (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_initgroups(user, basegroup) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_brk((addr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: CInt): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_sbrk(increment).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldImageCount(): UInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_dyldImageCount().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldGetImageHeader(imageIndex: UInt): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_dyldGetImageHeader(imageIndex.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_dyldGetImageVmaddrSlide(imageIndex.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldGetImageName(imageIndex: UInt): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_dyldGetImageName(imageIndex.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrSetarchprefNp((attr?.value ?: 0L).toString(), count.toString(), (pref?.value ?: 0L).toString(), (subpref?.value ?: 0L).toString(), (ocount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrGetarchprefNp((attr?.value ?: 0L).toString(), count.toString(), (pref?.value ?: 0L).toString(), (subpref?.value ?: 0L).toString(), (ocount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrGetbinprefNp((attr?.value ?: 0L).toString(), count.toString(), (pref?.value ?: 0L).toString(), (ocount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnattrSetbinprefNp((attr?.value ?: 0L).toString(), count.toString(), (pref?.value ?: 0L).toString(), (ocount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectx(socket: CInt, endpoints: COpaquePointer?, associd: SaeAssocidT, flags: CUint, iov: COpaquePointer?, iovcnt: CUint, len: COpaquePointer?, connid: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_connectx(socket, (endpoints?.value ?: 0L).toString(), associd.toInt(), flags.toInt(), (iov?.value ?: 0L).toString(), iovcnt.toInt(), (len?.value ?: 0L).toString(), (connid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_disconnectx(socket, associd.toInt(), connid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_ntpAdjtime((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_ntpGettime((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getmntinfo((mntbufp?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsstat(mntbufp: COpaquePointer?, bufsize: CInt, flags: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getfsstat((mntbufp?.value ?: 0L).toString(), bufsize, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_clonefile(src, dst, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_clonefileat(srcDirfd, src, dstDirfd, dst, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fclonefileat(srcfd, dstDirfd, dst, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_copyfile(from, to, (state?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fcopyfile(from, to, (state?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_copyfileStateFree((s?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateAlloc(): CopyfileStateT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_copyfileStateAlloc().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_copyfileStateGet((s?.value ?: 0L).toString(), flags.toInt(), (dst?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_copyfileStateSet((s?.value ?: 0L).toString(), flags.toInt(), (src?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machErrorString(errorValue: MachErrorT): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_machErrorString(errorValue).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_memsetS((s?.value ?: 0L).toString(), smax.toString(), c, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_memsetPattern4((b?.value ?: 0L).toString(), (pattern4?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_memsetPattern8((b?.value ?: 0L).toString(), (pattern8?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_memsetPattern16((b?.value ?: 0L).toString(), (pattern16?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_strtonum(numstr, minval.toString(), maxval.toString(), (errstrp?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mstats(): Mstats =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocPrintf(format: String?, vararg variadicArgs: Long) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_mallocPrintf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZoneCheck(zone: COpaquePointer?): BooleanT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mallocZoneCheck((zone?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZonePrint(zone: COpaquePointer?, verbose: BooleanT) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_mallocZonePrint((zone?.value ?: 0L).toString(), verbose)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZoneStatistics(zone: COpaquePointer?, stats: COpaquePointer?) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_mallocZoneStatistics((zone?.value ?: 0L).toString(), (stats?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZoneLog(zone: COpaquePointer?, address: COpaquePointer?) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_mallocZoneLog((zone?.value ?: 0L).toString(), (address?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_mallocZonePrintPtrInfo((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocDefaultZone(): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mallocDefaultZone().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mallocZoneFromPtr((ptr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneMalloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mallocZoneMalloc((zone?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneValloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mallocZoneValloc((zone?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneCalloc(zone: COpaquePointer?, numItems: SizeT, size: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mallocZoneCalloc((zone?.value ?: 0L).toString(), numItems.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneRealloc(zone: COpaquePointer?, ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mallocZoneRealloc((zone?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneFree(zone: COpaquePointer?, ptr: COpaquePointer?) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_mallocZoneFree((zone?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procListpids(t.toInt(), typeinfo.toInt(), (buffer?.value ?: 0L).toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procListallpids((buffer?.value ?: 0L).toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procListpgrppids(pgrpid, (buffer?.value ?: 0L).toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procListchildpids(ppid, (buffer?.value ?: 0L).toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procPidinfo(pid, flavor, arg.toString(), (buffer?.value ?: 0L).toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procPidfdinfo(pid, fd, flavor, (buffer?.value ?: 0L).toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procPidfileportinfo(pid, fileport.toInt(), flavor, (buffer?.value ?: 0L).toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procPidpath(pid, (buffer?.value ?: 0L).toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procName(pid, (buffer?.value ?: 0L).toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procRegionfilename(pid, address.toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procKmsgbuf((buffer?.value ?: 0L).toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procLibversion(major: COpaquePointer?, minor: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procLibversion((major?.value ?: 0L).toString(), (minor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procPidRusage(pid, flavor, (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetNoSmt(): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procSetNoSmt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetthreadNoSmt(): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procSetthreadNoSmt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetCsm(flags: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procSetCsm(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetthreadCsm(flags: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_procSetthreadCsm(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostuuid(id: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_gethostuuid((id?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_gethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_sethostid(hostid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): CCRNGStatus =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_cCRandomGenerateBytes((bytes?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_nsgetExecutablePath((buf?.value ?: 0L).toString(), (bufsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetArgv(): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_nsgetArgv().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetArgc(): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_nsgetArgc().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetEnviron(): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_nsgetEnviron().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetProgname(): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_nsgetProgname().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machVmMap(targetTask: VmMapT, address: COpaquePointer?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_machVmMap(targetTask.toLong().toString(), (address?.value ?: 0L).toString(), size.toString(), mask.toString(), flags, obj.toInt(), offset.toString(), copy, curProtection, maxProtection, inheritance.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmAllocate(targetTask: VmMapT, address: COpaquePointer?, size: VmSizeT, flags: CInt): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_vmAllocate(targetTask.toLong().toString(), (address?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_vmDeallocate(targetTask.toLong().toString(), address.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_hostStatistics64(hostPriv.toInt(), flavor, (hostInfo64Out?.value ?: 0L).toString(), (hostInfo64OutCnt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: COpaquePointer?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_hostProcessorInfo(host.toInt(), flavor, (outProcessorCount?.value ?: 0L).toString(), (outProcessorInfo?.value ?: 0L).toString(), (outProcessorInfoCnt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskForPid(host: MachPortT, pid: PidT, task: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_taskForPid(host.toInt(), pid, (task?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_taskInfo(host.toInt(), flavor.toInt(), (taskInfoOut?.value ?: 0L).toString(), (taskInfoCount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_taskCreate(targetTask.toInt(), (ledgers?.value ?: 0L).toString(), ledgersCnt.toInt(), inheritMemory, (childTask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_taskTerminate(targetTask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskThreads(targetTask: TaskInspectT, actList: COpaquePointer?, actListCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_taskThreads(targetTask.toInt(), (actList?.value ?: 0L).toString(), (actListCnt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: COpaquePointer?): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_hostStatistics(hostPriv.toInt(), flavor, (hostInfoOut?.value ?: 0L).toString(), (hostInfoOutCnt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: COpaquePointer?): SysdirSearchPathEnumerationState =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration(state.toInt(), (path?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getattrlist(path, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fgetattrlist(fd, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getattrlistat(fd, path, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_setattrlist(path, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_fsetattrlist(fd, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_setattrlistat(dirFd, path, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_getattrlistbulk(dirfd, (attrList?.value ?: 0L).toString(), (attrBuf?.value ?: 0L).toString(), attrBufSize.toString(), options.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocSize(ptr: COpaquePointer?): SizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mallocSize((ptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocGoodSize(size: SizeT): SizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mallocGoodSize(size.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_dirname((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_basename((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mkfifoat(dirfd, pathname, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_mknodat(dirfd, pathname, mode.toInt(), dev) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_freadlink(fd, (buf?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_execvP(file, searchPath, (argv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    if (_unixBsdAppleNapiAvailable) {
        _wasm_libc_unix_bsd_apple_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), (arg?.value ?: 0L).toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_clockSettime(clockId.toInt(), (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_taskSetInfo(targetTask.toInt(), flavor.toInt(), (taskInfoIn?.value ?: 0L).toString(), taskInfoInCnt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_iconvOpen(tocode, fromcode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixBsdAppleNapiAvailable) _wasm_libc_unix_bsd_apple_iconvClose((cd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
