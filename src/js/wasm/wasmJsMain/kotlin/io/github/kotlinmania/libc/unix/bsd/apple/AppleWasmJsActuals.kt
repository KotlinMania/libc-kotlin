@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadCondT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexT
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.MallocZoneT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdAppleNapiAddon(): Boolean

private val unixBsdAppleNapiAvailable: Boolean = initUnixBsdAppleNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleGetMACHTASKSELF()")
private external fun wasmLibcUnixBsdAppleGetMACHTASKSELF(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleSetMACHTASKSELF(p0)")
private external fun wasmLibcUnixBsdAppleSetMACHTASKSELF(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleGetVMPAGESIZE()")
private external fun wasmLibcUnixBsdAppleGetVMPAGESIZE(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleSetgrent()")
private external fun wasmLibcUnixBsdAppleSetgrent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleDaemon(p0, p1)")
private external fun wasmLibcUnixBsdAppleDaemon(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleSemDestroy(p0)")
private external fun wasmLibcUnixBsdAppleSemDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleSemInit(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleAioRead(p0)")
private external fun wasmLibcUnixBsdAppleAioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleAioWrite(p0)")
private external fun wasmLibcUnixBsdAppleAioWrite(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleAioFsync(p0, p1)")
private external fun wasmLibcUnixBsdAppleAioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleAioError(p0)")
private external fun wasmLibcUnixBsdAppleAioError(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleAioReturn(p0)")
private external fun wasmLibcUnixBsdAppleAioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleAioSuspend(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleAioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleAioCancel(p0, p1)")
private external fun wasmLibcUnixBsdAppleAioCancel(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleChflags(p0, p1)")
private external fun wasmLibcUnixBsdAppleChflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleFchflags(p0, p1)")
private external fun wasmLibcUnixBsdAppleFchflags(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleClockGetres(p0, p1)")
private external fun wasmLibcUnixBsdAppleClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleClockGettime(p0, p1)")
private external fun wasmLibcUnixBsdAppleClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleLioListio(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleLioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleDirfd(p0)")
private external fun wasmLibcUnixBsdAppleDirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleLutimes(p0, p1)")
private external fun wasmLibcUnixBsdAppleLutimes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleGettimeofday(p0, p1)")
private external fun wasmLibcUnixBsdAppleGettimeofday(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleGetutxent()")
private external fun wasmLibcUnixBsdAppleGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleGetutxid(p0)")
private external fun wasmLibcUnixBsdAppleGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleGetutxline(p0)")
private external fun wasmLibcUnixBsdAppleGetutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePututxline(p0)")
private external fun wasmLibcUnixBsdApplePututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleSetutxent()")
private external fun wasmLibcUnixBsdAppleSetutxent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleEndutxent()")
private external fun wasmLibcUnixBsdAppleEndutxent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleUtmpxname(p0)")
private external fun wasmLibcUnixBsdAppleUtmpxname(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleAsctime(p0)")
private external fun wasmLibcUnixBsdAppleAsctime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleCtime(p0)")
private external fun wasmLibcUnixBsdAppleCtime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleGetdate(p0)")
private external fun wasmLibcUnixBsdAppleGetdate(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleStrptime(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleStrptime(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleAsctimeR(p0, p1)")
private external fun wasmLibcUnixBsdAppleAsctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleCtimeR(p0, p1)")
private external fun wasmLibcUnixBsdAppleCtimeR(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdAppleGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdAppleGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleMincore(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleMincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleSysctlnametomib(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleSysctlnametomib(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleMprotect(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleSemget(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleSemget(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixBsdAppleSemctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixBsdAppleSemctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleSemop(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleSemop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdAppleShmOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdAppleShmOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleFtok(p0, p1)")
private external fun wasmLibcUnixBsdAppleFtok(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleShmat(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleShmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleShmdt(p0)")
private external fun wasmLibcUnixBsdAppleShmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleShmctl(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleShmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleShmget(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleShmget(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleSysctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleSysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleSysctlbyname(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleSysctlbyname(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleMachAbsoluteTime()")
private external fun wasmLibcUnixBsdAppleMachAbsoluteTime(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleMachTimebaseInfo(p0)")
private external fun wasmLibcUnixBsdAppleMachTimebaseInfo(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleMachHostSelf()")
private external fun wasmLibcUnixBsdAppleMachHostSelf(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleMachThreadSelf()")
private external fun wasmLibcUnixBsdAppleMachThreadSelf(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadCondTimedwaitRelativeNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdApplePthreadCondTimedwaitRelativeNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadAttrGetscope(p0, p1)")
private external fun wasmLibcUnixBsdApplePthreadAttrGetscope(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadAttrGetstackaddr(p0, p1)")
private external fun wasmLibcUnixBsdApplePthreadAttrGetstackaddr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadAttrGetdetachstate(p0, p1)")
private external fun wasmLibcUnixBsdApplePthreadAttrGetdetachstate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadAttrSetscope(p0, p1)")
private external fun wasmLibcUnixBsdApplePthreadAttrSetscope(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadAttrSetstackaddr(p0, p1)")
private external fun wasmLibcUnixBsdApplePthreadAttrSetstackaddr(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadSetnameNp(p0)")
private external fun wasmLibcUnixBsdApplePthreadSetnameNp(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdApplePthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadMachThreadNp(p0)")
private external fun wasmLibcUnixBsdApplePthreadMachThreadNp(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadFromMachThreadNp(p0)")
private external fun wasmLibcUnixBsdApplePthreadFromMachThreadNp(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadGetStackaddrNp(p0)")
private external fun wasmLibcUnixBsdApplePthreadGetStackaddrNp(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadGetStacksizeNp(p0)")
private external fun wasmLibcUnixBsdApplePthreadGetStacksizeNp(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdApplePthreadMainNp()")
private external fun wasmLibcUnixBsdApplePthreadMainNp(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadThreadidNp(p0, p1)")
private external fun wasmLibcUnixBsdApplePthreadThreadidNp(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadJitWriteProtectNp(p0)")
private external fun wasmLibcUnixBsdApplePthreadJitWriteProtectNp(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdApplePthreadJitWriteProtectSupportedNp()")
private external fun wasmLibcUnixBsdApplePthreadJitWriteProtectSupportedNp(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadJitWriteWithCallbackNp(p0, p1)")
private external fun wasmLibcUnixBsdApplePthreadJitWriteWithCallbackNp(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdApplePthreadJitWriteFreezeCallbacksNp()")
private external fun wasmLibcUnixBsdApplePthreadJitWriteFreezeCallbacksNp()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePthreadCpuNumberNp(p0)")
private external fun wasmLibcUnixBsdApplePthreadCpuNumberNp(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleOsSyncWaitOnAddress(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleOsSyncWaitOnAddress(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleOsSyncWaitOnAddressWithDeadline(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleOsSyncWaitOnAddressWithDeadline(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleOsSyncWaitOnAddressWithTimeout(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleOsSyncWaitOnAddressWithTimeout(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleOsSyncWakeByAddressAny(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleOsSyncWakeByAddressAny(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleOsSyncWakeByAddressAll(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleOsSyncWakeByAddressAll(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleOsUnfairLockLock(p0)")
private external fun wasmLibcUnixBsdAppleOsUnfairLockLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleOsUnfairLockTrylock(p0)")
private external fun wasmLibcUnixBsdAppleOsUnfairLockTrylock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleOsUnfairLockUnlock(p0)")
private external fun wasmLibcUnixBsdAppleOsUnfairLockUnlock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleOsUnfairLockAssertOwner(p0)")
private external fun wasmLibcUnixBsdAppleOsUnfairLockAssertOwner(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleOsUnfairLockAssertNotOwner(p0)")
private external fun wasmLibcUnixBsdAppleOsUnfairLockAssertNotOwner(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleOsLogCreate(p0, p1)")
private external fun wasmLibcUnixBsdAppleOsLogCreate(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleOsLogTypeEnabled(p0, p1)")
private external fun wasmLibcUnixBsdAppleOsLogTypeEnabled(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleOsSignpostIdMakeWithPointer(p0, p1)")
private external fun wasmLibcUnixBsdAppleOsSignpostIdMakeWithPointer(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleOsSignpostIdGenerate(p0)")
private external fun wasmLibcUnixBsdAppleOsSignpostIdGenerate(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleOsSignpostEnabled(p0)")
private external fun wasmLibcUnixBsdAppleOsSignpostEnabled(p0: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleThreadPolicySet(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleThreadPolicySet(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleThreadPolicyGet(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleThreadPolicyGet(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleThreadInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleThreadInfo(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleError()")
private external fun wasmLibcUnixBsdAppleError(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleBacktrace(p0, p1)")
private external fun wasmLibcUnixBsdAppleBacktrace(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleBacktraceSymbols(p0, p1)")
private external fun wasmLibcUnixBsdAppleBacktraceSymbols(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleBacktraceSymbolsFd(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleBacktraceSymbolsFd(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleBacktraceFromFp(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleBacktraceFromFp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleBacktraceImageOffsets(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleBacktraceImageOffsets(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleBacktraceAsync(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleBacktraceAsync(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleStatfs(p0, p1)")
private external fun wasmLibcUnixBsdAppleStatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleFstatfs(p0, p1)")
private external fun wasmLibcUnixBsdAppleFstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleKevent(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleKevent(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdAppleKevent64(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdAppleKevent64(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleMount(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleMount(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleFmount(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleFmount(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdApplePtrace(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdApplePtrace(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleQuotactl(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleQuotactl(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleSethostname(p0, p1)")
private external fun wasmLibcUnixBsdAppleSethostname(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleSendfile(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleSendfile(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleFutimens(p0, p1)")
private external fun wasmLibcUnixBsdAppleFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleLoginTty(p0)")
private external fun wasmLibcUnixBsdAppleLoginTty(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleDuplocale(p0)")
private external fun wasmLibcUnixBsdAppleDuplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleFreelocale(p0)")
private external fun wasmLibcUnixBsdAppleFreelocale(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleLocaleconvL(p0)")
private external fun wasmLibcUnixBsdAppleLocaleconvL(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleNewlocale(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleUselocale(p0)")
private external fun wasmLibcUnixBsdAppleUselocale(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleQuerylocale(p0, p1)")
private external fun wasmLibcUnixBsdAppleQuerylocale(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleGetpriority(p0, p1)")
private external fun wasmLibcUnixBsdAppleGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleGetdomainname(p0, p1)")
private external fun wasmLibcUnixBsdAppleGetdomainname(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleSetdomainname(p0, p1)")
private external fun wasmLibcUnixBsdAppleSetdomainname(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdApplePreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdApplePreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdApplePwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdApplePwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleGetxattr(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleGetxattr(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleFgetxattr(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleFgetxattr(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleSetxattr(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleSetxattr(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleFsetxattr(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleFsetxattr(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleListxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleListxattr(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleFlistxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleFlistxattr(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleRemovexattr(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleRemovexattr(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleRenamexNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleRenamexNp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleRenameatxNp(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleRenameatxNp(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleFremovexattr(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleFremovexattr(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleInitgroups(p0, p1)")
private external fun wasmLibcUnixBsdAppleInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleWaitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleBrk(p0)")
private external fun wasmLibcUnixBsdAppleBrk(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleSbrk(p0)")
private external fun wasmLibcUnixBsdAppleSbrk(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleSettimeofday(p0, p1)")
private external fun wasmLibcUnixBsdAppleSettimeofday(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleDyldImageCount()")
private external fun wasmLibcUnixBsdAppleDyldImageCount(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleDyldGetImageHeader(p0)")
private external fun wasmLibcUnixBsdAppleDyldGetImageHeader(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleDyldGetImageVmaddrSlide(p0)")
private external fun wasmLibcUnixBsdAppleDyldGetImageVmaddrSlide(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleDyldGetImageName(p0)")
private external fun wasmLibcUnixBsdAppleDyldGetImageName(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdApplePosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdApplePosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrInit(p0)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrSetarchprefNp(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrSetarchprefNp(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrGetarchprefNp(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrGetarchprefNp(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrGetbinprefNp(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrGetbinprefNp(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnattrSetbinprefNp(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdApplePosixSpawnattrSetbinprefNp(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixBsdApplePosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixBsdApplePosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdApplePosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixBsdApplePosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdApplePosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixBsdApplePosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleUname(p0)")
private external fun wasmLibcUnixBsdAppleUname(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixBsdAppleConnectx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixBsdAppleConnectx(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleDisconnectx(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleDisconnectx(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleNtpAdjtime(p0)")
private external fun wasmLibcUnixBsdAppleNtpAdjtime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleNtpGettime(p0)")
private external fun wasmLibcUnixBsdAppleNtpGettime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleGetmntinfo(p0, p1)")
private external fun wasmLibcUnixBsdAppleGetmntinfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleGetfsstat(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleGetfsstat(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleClonefile(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleClonefile(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleClonefileat(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleClonefileat(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleFclonefileat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleFclonefileat(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleCopyfile(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleCopyfile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleFcopyfile(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleFcopyfile(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleCopyfileStateFree(p0)")
private external fun wasmLibcUnixBsdAppleCopyfileStateFree(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleCopyfileStateAlloc()")
private external fun wasmLibcUnixBsdAppleCopyfileStateAlloc(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleCopyfileStateGet(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleCopyfileStateGet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleCopyfileStateSet(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleCopyfileStateSet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleMachErrorString(p0)")
private external fun wasmLibcUnixBsdAppleMachErrorString(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleMemsetS(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleMemsetS(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleMemsetPattern4(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleMemsetPattern4(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleMemsetPattern8(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleMemsetPattern8(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleMemsetPattern16(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleMemsetPattern16(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleStrtonum(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleStrtonum(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocPrintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleMallocPrintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZoneCheck(p0)")
private external fun wasmLibcUnixBsdAppleMallocZoneCheck(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZonePrint(p0, p1)")
private external fun wasmLibcUnixBsdAppleMallocZonePrint(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZoneStatistics(p0, p1)")
private external fun wasmLibcUnixBsdAppleMallocZoneStatistics(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZoneLog(p0, p1)")
private external fun wasmLibcUnixBsdAppleMallocZoneLog(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZonePrintPtrInfo(p0)")
private external fun wasmLibcUnixBsdAppleMallocZonePrintPtrInfo(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleMallocDefaultZone()")
private external fun wasmLibcUnixBsdAppleMallocDefaultZone(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZoneFromPtr(p0)")
private external fun wasmLibcUnixBsdAppleMallocZoneFromPtr(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZoneMalloc(p0, p1)")
private external fun wasmLibcUnixBsdAppleMallocZoneMalloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZoneValloc(p0, p1)")
private external fun wasmLibcUnixBsdAppleMallocZoneValloc(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZoneCalloc(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleMallocZoneCalloc(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZoneRealloc(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleMallocZoneRealloc(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocZoneFree(p0, p1)")
private external fun wasmLibcUnixBsdAppleMallocZoneFree(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleProcListpids(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleProcListpids(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleProcListallpids(p0, p1)")
private external fun wasmLibcUnixBsdAppleProcListallpids(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleProcListpgrppids(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleProcListpgrppids(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleProcListchildpids(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleProcListchildpids(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleProcPidinfo(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleProcPidinfo(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleProcPidfdinfo(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleProcPidfdinfo(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleProcPidfileportinfo(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleProcPidfileportinfo(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleProcPidpath(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleProcPidpath(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleProcName(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleProcName(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleProcRegionfilename(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleProcRegionfilename(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleProcKmsgbuf(p0, p1)")
private external fun wasmLibcUnixBsdAppleProcKmsgbuf(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleProcLibversion(p0, p1)")
private external fun wasmLibcUnixBsdAppleProcLibversion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleProcPidRusage(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleProcPidRusage(p0: Int, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleProcSetNoSmt()")
private external fun wasmLibcUnixBsdAppleProcSetNoSmt(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleProcSetthreadNoSmt()")
private external fun wasmLibcUnixBsdAppleProcSetthreadNoSmt(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleProcSetCsm(p0)")
private external fun wasmLibcUnixBsdAppleProcSetCsm(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleProcSetthreadCsm(p0)")
private external fun wasmLibcUnixBsdAppleProcSetthreadCsm(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleGethostuuid(p0, p1)")
private external fun wasmLibcUnixBsdAppleGethostuuid(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleGethostid()")
private external fun wasmLibcUnixBsdAppleGethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleSethostid(p0)")
private external fun wasmLibcUnixBsdAppleSethostid(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleCCRandomGenerateBytes(p0, p1)")
private external fun wasmLibcUnixBsdAppleCCRandomGenerateBytes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleGetentropy(p0, p1)")
private external fun wasmLibcUnixBsdAppleGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleNsgetExecutablePath(p0, p1)")
private external fun wasmLibcUnixBsdAppleNsgetExecutablePath(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleNsgetArgv()")
private external fun wasmLibcUnixBsdAppleNsgetArgv(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleNsgetArgc()")
private external fun wasmLibcUnixBsdAppleNsgetArgc(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleNsgetEnviron()")
private external fun wasmLibcUnixBsdAppleNsgetEnviron(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdAppleNsgetProgname()")
private external fun wasmLibcUnixBsdAppleNsgetProgname(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_libc.libcUnixBsdAppleMachVmMap(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmLibcUnixBsdAppleMachVmMap(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: Int, p8: Int, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleVmAllocate(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleVmAllocate(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleVmDeallocate(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleVmDeallocate(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleHostStatistics64(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleHostStatistics64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleHostProcessorInfo(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleHostProcessorInfo(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleTaskForPid(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleTaskForPid(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleTaskInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleTaskInfo(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleTaskCreate(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleTaskCreate(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleTaskTerminate(p0)")
private external fun wasmLibcUnixBsdAppleTaskTerminate(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleTaskThreads(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleTaskThreads(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleHostStatistics(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleHostStatistics(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleSysdirGetNextSearchPathEnumeration(p0, p1)")
private external fun wasmLibcUnixBsdAppleSysdirGetNextSearchPathEnumeration(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleGetattrlist(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleGetattrlist(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleFgetattrlist(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleFgetattrlist(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleGetattrlistat(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleGetattrlistat(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleSetattrlist(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleSetattrlist(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleFsetattrlist(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleFsetattrlist(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdAppleSetattrlistat(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdAppleSetattrlistat(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleGetattrlistbulk(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleGetattrlistbulk(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocSize(p0)")
private external fun wasmLibcUnixBsdAppleMallocSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleMallocGoodSize(p0)")
private external fun wasmLibcUnixBsdAppleMallocGoodSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleDirname(p0)")
private external fun wasmLibcUnixBsdAppleDirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleBasename(p0)")
private external fun wasmLibcUnixBsdAppleBasename(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleMknodat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleFreadlink(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleFreadlink(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdAppleExecvP(p0, p1, p2)")
private external fun wasmLibcUnixBsdAppleExecvP(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleQsortR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleQsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleClockSettime(p0, p1)")
private external fun wasmLibcUnixBsdAppleClockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdAppleTaskSetInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdAppleTaskSetInfo(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdAppleIconvOpen(p0, p1)")
private external fun wasmLibcUnixBsdAppleIconvOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdAppleIconv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdAppleIconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdAppleIconvClose(p0)")
private external fun wasmLibcUnixBsdAppleIconvClose(p0: String): Int

public actual var MACH_TASK_SELF: MachPortT
    get() = if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetMACHTASKSELF().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (unixBsdAppleNapiAvailable) {
            wasmLibcUnixBsdAppleSetMACHTASKSELF(value.toInt())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetVMPAGESIZE().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleAioRead(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleAioWrite(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleAioFsync(op, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleAioError(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleAioReturn(aiocbp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleAioCancel(fd, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleChflags(path.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFchflags(fd, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleClockGetres(clkId.toInt(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleClockGettime(clkId.toInt(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleLutimes(file.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleGetutxid(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleGetutxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdApplePututxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleUtmpxname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctime(tm: ConstPtr<Tm>): MutPtr<CChar> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleAsctime(tm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(clock: ConstPtr<TimeT>): MutPtr<CChar> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleCtime(clock.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdate(datestr: ConstPtr<CChar>): MutPtr<Tm> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleGetdate(datestr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(buf: ConstPtr<CChar>, format: ConstPtr<CChar>, timeptr: MutPtr<Tm>): MutPtr<CChar> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleStrptime(buf.rawAddress.toString(), format.rawAddress.toString(), timeptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr<Tm>, result: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleAsctimeR(tm.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(clock: ConstPtr<TimeT>, result: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleCtimeR(clock.rawAddress.toString(), result.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: ConstPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<CInt>, sizep: MutPtr<SizeT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSysctlnametomib(name.rawAddress.toString(), mibp.rawAddress.toString(), sizep.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSemget(key, nsems, semflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSemop(semid, sops.rawAddress.toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleShmOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFtok(pathname.rawAddress.toString(), projId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleShmat(shmid, shmaddr.rawAddress.toString(), shmflg).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleShmdt(shmaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleShmctl(shmid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleShmget(key, size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: MutPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSysctl(name.rawAddress.toString(), namelen.toInt(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSysctlbyname(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machAbsoluteTime(): ULong =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMachAbsoluteTime().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machTimebaseInfo(info: MutPtr<MachTimebaseInfo>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMachTimebaseInfo(info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machHostSelf(): MachPortT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMachHostSelf().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machThreadSelf(): MachPortT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMachThreadSelf().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwaitRelativeNp(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadCondTimedwaitRelativeNp(cond.rawAddress.toString(), lock.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetscope(attr: ConstPtr<PthreadAttrT>, contentionscope: MutPtr<CInt>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadAttrGetscope(attr.rawAddress.toString(), contentionscope.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadAttrGetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadAttrGetdetachstate(attr.rawAddress.toString(), detachstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetscope(attr: MutPtr<PthreadAttrT>, contentionscope: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadAttrSetscope(attr.rawAddress.toString(), contentionscope) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadAttrSetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(name: ConstPtr<CChar>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadSetnameNp(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadGetnameNp(thread.toLong().toString(), name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadMachThreadNp(thread.toLong().toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadFromMachThreadNp(port.toInt()).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetStackaddrNp(thread: PthreadT): MutPtr<CVoid> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdApplePthreadGetStackaddrNp(thread.toLong().toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadGetStacksizeNp(thread.toLong().toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMainNp(): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadMainNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: MutPtr<ULong>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadThreadidNp(thread.toLong().toString(), threadId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdApplePthreadJitWriteProtectNp(enabled)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadJitWriteProtectSupportedNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: MutPtr<CVoid>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadJitWriteWithCallbackNp(0L.toString(), ctx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdApplePthreadJitWriteFreezeCallbacksNp()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: MutPtr<SizeT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePthreadCpuNumberNp(cpuNumberOut.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWaitOnAddress(addr: MutPtr<CVoid>, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsSyncWaitOnAddress(addr.rawAddress.toString(), value.toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWaitOnAddressWithDeadline(addr: MutPtr<CVoid>, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsSyncWaitOnAddressWithDeadline(addr.rawAddress.toString(), value.toString(), size.toString(), flags.toInt(), clockid.toInt(), deadline.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWaitOnAddressWithTimeout(addr: MutPtr<CVoid>, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsSyncWaitOnAddressWithTimeout(addr.rawAddress.toString(), value.toString(), size.toString(), flags.toInt(), clockid.toInt(), timeoutNs.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWakeByAddressAny(addr: MutPtr<CVoid>, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsSyncWakeByAddressAny(addr.rawAddress.toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSyncWakeByAddressAll(addr: MutPtr<CVoid>, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsSyncWakeByAddressAll(addr.rawAddress.toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleOsUnfairLockLock(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsUnfairLockTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleOsUnfairLockUnlock(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleOsUnfairLockAssertOwner(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleOsUnfairLockAssertNotOwner(lock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun osLogCreate(subsystem: ConstPtr<CChar>, category: ConstPtr<CChar>): OsLogT =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleOsLogCreate(subsystem.rawAddress.toString(), category.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsLogTypeEnabled(oslog.rawAddress.toString(), tpe.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: ConstPtr<CVoid>): OsSignpostIdT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsSignpostIdMakeWithPointer(log.rawAddress.toString(), ptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsSignpostIdGenerate(log.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOsSignpostEnabled(log.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleThreadPolicySet(thread.toLong().toString(), flavor.toInt(), policyInfo.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MutPtr<MachMsgTypeNumberT>, getDefault: MutPtr<BooleanT>): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleThreadPolicyGet(thread.toLong().toString(), flavor.toInt(), policyInfo.rawAddress.toString(), count.rawAddress.toString(), getDefault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleThreadInfo(targetAct.toInt(), flavor.toInt(), threadInfoOut.rawAddress.toString(), threadInfoOutCnt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun error(): MutPtr<CInt> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleError().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleBacktrace(buf.rawAddress.toString(), sz) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrs: ConstPtr<MutPtr<CVoid>>, sz: CInt): MutPtr<MutPtr<CChar>> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleBacktraceSymbols(addrs.rawAddress.toString(), sz).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrs: ConstPtr<MutPtr<CVoid>>, sz: CInt, fd: CInt) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleBacktraceSymbolsFd(addrs.rawAddress.toString(), sz, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun backtraceFromFp(startfp: MutPtr<CVoid>, array: MutPtr<MutPtr<CVoid>>, size: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleBacktraceFromFp(startfp.rawAddress.toString(), array.rawAddress.toString(), size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceImageOffsets(array: ConstPtr<MutPtr<CVoid>>, imageOffsets: MutPtr<ImageOffset>, size: CInt) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleBacktraceImageOffsets(array.rawAddress.toString(), imageOffsets.rawAddress.toString(), size)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun backtraceAsync(array: MutPtr<MutPtr<CVoid>>, length: SizeT, taskId: MutPtr<UInt>): SizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleBacktraceAsync(array.rawAddress.toString(), length.toString(), taskId.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFstatfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleKevent(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent64(kq: CInt, changelist: ConstPtr<Kevent64S>, nchanges: CInt, eventlist: MutPtr<Kevent64S>, nevents: CInt, flags: CUint, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleKevent64(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, flags.toInt(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMount(src.rawAddress.toString(), target.rawAddress.toString(), flags, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmount(src: ConstPtr<CChar>, fd: CInt, flags: CInt, data: MutPtr<CVoid>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFmount(src.rawAddress.toString(), fd, flags, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CChar>, data: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePtrace(request, pid, addr.rawAddress.toString(), data) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(special: ConstPtr<CChar>, cmd: CInt, id: CInt, data: MutPtr<CChar>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleQuotactl(special.rawAddress.toString(), cmd, id, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSethostname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: MutPtr<OffT>, hdtr: MutPtr<SfHdtr>, flags: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSendfile(fd, s, offset.toString(), len.rawAddress.toString(), hdtr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleLoginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFreelocale(loc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconvL(loc: LocaleT): MutPtr<Lconv> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleLocaleconvL(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr<CChar> =
    if (unixBsdAppleNapiAvailable) ConstPtr(wasmLibcUnixBsdAppleQuerylocale(mask, loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSetpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetdomainname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSetdomainname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT, position: UInt, flags: CInt): SsizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), position.toInt(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT, position: UInt, flags: CInt): SsizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), position.toInt(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, position: UInt, flags: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), position.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, position: UInt, flags: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), position.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT, flags: CInt): SsizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT, flags: CInt): SsizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFlistxattr(filedes, list.rawAddress.toString(), size.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleRemovexattr(path.rawAddress.toString(), name.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renamexNp(from: ConstPtr<CChar>, to: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleRenamexNp(from.rawAddress.toString(), to.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameatxNp(fromfd: CInt, from: ConstPtr<CChar>, tofd: CInt, to: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleRenameatxNp(fromfd, from.rawAddress.toString(), tofd, to.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFremovexattr(filedes, name.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: CInt, groups: MutPtr<CInt>, ngroups: MutPtr<CInt>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetgrouplist(name.rawAddress.toString(), basegid, groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr<CChar>, basegroup: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleInitgroups(user.rawAddress.toString(), basegroup) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleBrk(addr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: CInt): MutPtr<CVoid> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleSbrk(increment).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldImageCount(): UInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleDyldImageCount().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldGetImageHeader(imageIndex: UInt): ConstPtr<MachHeader> =
    if (unixBsdAppleNapiAvailable) ConstPtr(wasmLibcUnixBsdAppleDyldGetImageHeader(imageIndex.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleDyldGetImageVmaddrSlide(imageIndex.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dyldGetImageName(imageIndex: UInt): ConstPtr<CChar> =
    if (unixBsdAppleNapiAvailable) ConstPtr(wasmLibcUnixBsdAppleDyldGetImageName(imageIndex.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetarchprefNp(attr: MutPtr<PosixSpawnattrT>, count: SizeT, pref: MutPtr<CpuTypeT>, subpref: MutPtr<CpuSubtypeT>, ocount: MutPtr<SizeT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrSetarchprefNp(attr.rawAddress.toString(), count.toString(), pref.rawAddress.toString(), subpref.rawAddress.toString(), ocount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetarchprefNp(attr: ConstPtr<PosixSpawnattrT>, count: SizeT, pref: MutPtr<CpuTypeT>, subpref: MutPtr<CpuSubtypeT>, ocount: MutPtr<SizeT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrGetarchprefNp(attr.rawAddress.toString(), count.toString(), pref.rawAddress.toString(), subpref.rawAddress.toString(), ocount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetbinprefNp(attr: ConstPtr<PosixSpawnattrT>, count: SizeT, pref: MutPtr<CpuTypeT>, ocount: MutPtr<SizeT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrGetbinprefNp(attr.rawAddress.toString(), count.toString(), pref.rawAddress.toString(), ocount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetbinprefNp(attr: MutPtr<PosixSpawnattrT>, count: SizeT, pref: MutPtr<CpuTypeT>, ocount: MutPtr<SizeT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnattrSetbinprefNp(attr.rawAddress.toString(), count.toString(), pref.rawAddress.toString(), ocount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnFileActionsInit(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnFileActionsDestroy(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdApplePosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectx(socket: CInt, endpoints: ConstPtr<SaEndpointsT>, associd: SaeAssocidT, flags: CUint, iov: ConstPtr<Iovec>, iovcnt: CUint, len: MutPtr<SizeT>, connid: MutPtr<SaeConnidT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleConnectx(socket, endpoints.rawAddress.toString(), associd.toInt(), flags.toInt(), iov.rawAddress.toString(), iovcnt.toInt(), len.rawAddress.toString(), connid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleDisconnectx(socket, associd.toInt(), connid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleNtpAdjtime(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleNtpGettime(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetmntinfo(mntbufp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsstat(mntbufp: MutPtr<Statfs>, bufsize: CInt, flags: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetfsstat(mntbufp.rawAddress.toString(), bufsize, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clonefile(src: ConstPtr<CChar>, dst: ConstPtr<CChar>, flags: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleClonefile(src.rawAddress.toString(), dst.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clonefileat(srcDirfd: CInt, src: ConstPtr<CChar>, dstDirfd: CInt, dst: ConstPtr<CChar>, flags: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleClonefileat(srcDirfd, src.rawAddress.toString(), dstDirfd, dst.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: ConstPtr<CChar>, flags: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFclonefileat(srcfd, dstDirfd, dst.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfile(from: ConstPtr<CChar>, to: ConstPtr<CChar>, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleCopyfile(from.rawAddress.toString(), to.rawAddress.toString(), state.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFcopyfile(from, to, state.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleCopyfileStateFree(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateAlloc(): CopyfileStateT =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleCopyfileStateAlloc().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: MutPtr<CVoid>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleCopyfileStateGet(s.rawAddress.toString(), flags.toInt(), dst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: ConstPtr<CVoid>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleCopyfileStateSet(s.rawAddress.toString(), flags.toInt(), src.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machErrorString(errorValue: MachErrorT): MutPtr<CChar> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleMachErrorString(errorValue).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMemsetS(s.rawAddress.toString(), smax.toString(), c, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetPattern4(b: MutPtr<CVoid>, pattern4: ConstPtr<CVoid>, len: SizeT) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleMemsetPattern4(b.rawAddress.toString(), pattern4.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetPattern8(b: MutPtr<CVoid>, pattern8: ConstPtr<CVoid>, len: SizeT) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleMemsetPattern8(b.rawAddress.toString(), pattern8.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memsetPattern16(b: MutPtr<CVoid>, pattern16: ConstPtr<CVoid>, len: SizeT) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleMemsetPattern16(b.rawAddress.toString(), pattern16.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strtonum(numstr: ConstPtr<CChar>, minval: CLonglong, maxval: CLonglong, errstrp: MutPtr<ConstPtr<CChar>>): CLonglong =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleStrtonum(numstr.rawAddress.toString(), minval.toString(), maxval.toString(), errstrp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mstats(): Mstats =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocPrintf(format: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleMallocPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZoneCheck(zone: MutPtr<MallocZoneT>): BooleanT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMallocZoneCheck(zone.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZonePrint(zone: MutPtr<MallocZoneT>, verbose: BooleanT) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleMallocZonePrint(zone.rawAddress.toString(), verbose)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZoneStatistics(zone: MutPtr<MallocZoneT>, stats: MutPtr<MallocStatisticsT>) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleMallocZoneStatistics(zone.rawAddress.toString(), stats.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZoneLog(zone: MutPtr<MallocZoneT>, address: MutPtr<CVoid>) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleMallocZoneLog(zone.rawAddress.toString(), address.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocZonePrintPtrInfo(ptr: MutPtr<CVoid>) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleMallocZonePrintPtrInfo(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocDefaultZone(): MutPtr<MallocZoneT> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleMallocDefaultZone().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneFromPtr(ptr: ConstPtr<CVoid>): MutPtr<MallocZoneT> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleMallocZoneFromPtr(ptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneMalloc(zone: MutPtr<MallocZoneT>, size: SizeT): MutPtr<CVoid> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleMallocZoneMalloc(zone.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneValloc(zone: MutPtr<MallocZoneT>, size: SizeT): MutPtr<CVoid> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleMallocZoneValloc(zone.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneCalloc(zone: MutPtr<MallocZoneT>, numItems: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleMallocZoneCalloc(zone.rawAddress.toString(), numItems.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneRealloc(zone: MutPtr<MallocZoneT>, ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleMallocZoneRealloc(zone.rawAddress.toString(), ptr.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocZoneFree(zone: MutPtr<MallocZoneT>, ptr: MutPtr<CVoid>) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleMallocZoneFree(zone.rawAddress.toString(), ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: MutPtr<CVoid>, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcListpids(t.toInt(), typeinfo.toInt(), buffer.rawAddress.toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procListallpids(buffer: MutPtr<CVoid>, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcListallpids(buffer.rawAddress.toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procListpgrppids(pgrpid: PidT, buffer: MutPtr<CVoid>, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcListpgrppids(pgrpid, buffer.rawAddress.toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procListchildpids(ppid: PidT, buffer: MutPtr<CVoid>, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcListchildpids(ppid, buffer.rawAddress.toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: MutPtr<CVoid>, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcPidinfo(pid, flavor, arg.toString(), buffer.rawAddress.toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: MutPtr<CVoid>, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcPidfdinfo(pid, fd, flavor, buffer.rawAddress.toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: MutPtr<CVoid>, buffersize: CInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcPidfileportinfo(pid, fileport.toInt(), flavor, buffer.rawAddress.toString(), buffersize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidpath(pid: CInt, buffer: MutPtr<CVoid>, buffersize: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcPidpath(pid, buffer.rawAddress.toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procName(pid: CInt, buffer: MutPtr<CVoid>, buffersize: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcName(pid, buffer.rawAddress.toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: MutPtr<CVoid>, buffersize: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcRegionfilename(pid, address.toString(), buffer.rawAddress.toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procKmsgbuf(buffer: MutPtr<CVoid>, buffersize: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcKmsgbuf(buffer.rawAddress.toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procLibversion(major: MutPtr<CInt>, minor: MutPtr<CInt>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcLibversion(major.rawAddress.toString(), minor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: MutPtr<RusageInfoT>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcPidRusage(pid, flavor, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetNoSmt(): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcSetNoSmt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetthreadNoSmt(): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcSetthreadNoSmt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetCsm(flags: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcSetCsm(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procSetthreadCsm(flags: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleProcSetthreadCsm(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostuuid(id: MutPtr<UByte>, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGethostuuid(id.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleSethostid(hostid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cCRandomGenerateBytes(bytes: MutPtr<CVoid>, size: SizeT): CCRNGStatus =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleCCRandomGenerateBytes(bytes.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetExecutablePath(buf: MutPtr<CChar>, bufsize: MutPtr<UInt>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleNsgetExecutablePath(buf.rawAddress.toString(), bufsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetArgv(): MutPtr<MutPtr<MutPtr<CChar>>> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleNsgetArgv().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetArgc(): MutPtr<CInt> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleNsgetArgc().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetEnviron(): MutPtr<MutPtr<MutPtr<CChar>>> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleNsgetEnviron().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nsgetProgname(): MutPtr<MutPtr<CChar>> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleNsgetProgname().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun machVmMap(targetTask: VmMapT, address: MutPtr<MachVmAddressT>, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMachVmMap(targetTask.toLong().toString(), address.rawAddress.toString(), size.toString(), mask.toString(), flags, obj.toInt(), offset.toString(), copy, curProtection, maxProtection, inheritance.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmAllocate(targetTask: VmMapT, address: MutPtr<VmAddressT>, size: VmSizeT, flags: CInt): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleVmAllocate(targetTask.toLong().toString(), address.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleVmDeallocate(targetTask.toLong().toString(), address.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleHostStatistics64(hostPriv.toInt(), flavor, hostInfo64Out.rawAddress.toString(), hostInfo64OutCnt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: MutPtr<NaturalT>, outProcessorInfo: MutPtr<ProcessorInfoArrayT>, outProcessorInfoCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleHostProcessorInfo(host.toInt(), flavor, outProcessorCount.rawAddress.toString(), outProcessorInfo.rawAddress.toString(), outProcessorInfoCnt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskForPid(host: MachPortT, pid: PidT, task: MutPtr<MachPortT>): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleTaskForPid(host.toInt(), pid, task.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MutPtr<MachMsgTypeNumberT>): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleTaskInfo(host.toInt(), flavor.toInt(), taskInfoOut.rawAddress.toString(), taskInfoCount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: MutPtr<TaskT>): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleTaskCreate(targetTask.toInt(), ledgers.rawAddress.toString(), ledgersCnt.toInt(), inheritMemory, childTask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleTaskTerminate(targetTask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskThreads(targetTask: TaskInspectT, actList: MutPtr<ThreadActArrayT>, actListCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleTaskThreads(targetTask.toInt(), actList.rawAddress.toString(), actListCnt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleHostStatistics(hostPriv.toInt(), flavor, hostInfoOut.rawAddress.toString(), hostInfoOutCnt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: MutPtr<CChar>): SysdirSearchPathEnumerationState =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSysdirGetNextSearchPathEnumeration(state.toInt(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getattrlist(path: ConstPtr<CChar>, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetattrlist(path.rawAddress.toString(), attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetattrlist(fd: CInt, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFgetattrlist(fd, attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getattrlistat(fd: CInt, path: ConstPtr<CChar>, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: CUlong): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetattrlistat(fd, path.rawAddress.toString(), attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setattrlist(path: ConstPtr<CChar>, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSetattrlist(path.rawAddress.toString(), attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetattrlist(fd: CInt, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFsetattrlist(fd, attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setattrlistat(dirFd: CInt, path: ConstPtr<CChar>, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleSetattrlistat(dirFd, path.rawAddress.toString(), attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getattrlistbulk(dirfd: CInt, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: ULong): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleGetattrlistbulk(dirfd, attrList.rawAddress.toString(), attrBuf.rawAddress.toString(), attrBufSize.toString(), options.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocSize(ptr: ConstPtr<CVoid>): SizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMallocSize(ptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocGoodSize(size: SizeT): SizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMallocGoodSize(size.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleDirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadlink(fd: CInt, buf: MutPtr<CChar>, size: SizeT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleFreadlink(fd, buf.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvP(file: ConstPtr<CChar>, searchPath: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleExecvP(file.rawAddress.toString(), searchPath.rawAddress.toString(), argv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, arg: MutPtr<CVoid>, compar: QsortRComparCallback?) {
    if (unixBsdAppleNapiAvailable) {
        wasmLibcUnixBsdAppleQsortR(base.rawAddress.toString(), num.toString(), size.toString(), arg.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleClockSettime(clockId.toInt(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleTaskSetInfo(targetTask.toInt(), flavor.toInt(), taskInfoIn.rawAddress.toString(), taskInfoInCnt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    if (unixBsdAppleNapiAvailable) MutPtr(wasmLibcUnixBsdAppleIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixBsdAppleNapiAvailable) wasmLibcUnixBsdAppleIconvClose(cd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
