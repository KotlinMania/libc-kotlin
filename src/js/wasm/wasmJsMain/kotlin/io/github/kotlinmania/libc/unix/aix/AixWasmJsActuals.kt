@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Aiocb
import io.github.kotlinmania.libc.unix.aix.powerpc64.MsqidDs
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadBarrierT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadMutexT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadOnceT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadRwlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadSpinlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SiginfoT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SigsetT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Stat
import io.github.kotlinmania.libc.unix.aix.powerpc64.Statfs
import io.github.kotlinmania.libc.unix.aix.powerpc64.UcontextT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Utmpx
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixAixNapiAddon(): Boolean

private val unixAixNapiAvailable: Boolean = initUnixAixNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixThrKill(p0, p1)")
private external fun wasmLibcUnixAixThrKill(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixThrSelf()")
private external fun wasmLibcUnixAixThrSelf(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcUnixAixPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrGetdetachstate(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrGetdetachstate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrGetinheritsched(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrGetinheritsched(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrGetschedparam(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrGetstackaddr(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrGetstackaddr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrGetschedpolicy(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrGetscope(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrGetscope(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcUnixAixPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrSetguardsize(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrSetinheritsched(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrSetinheritsched(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrSetschedparam(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrSetschedpolicy(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrSetscope(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrSetscope(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrSetstack(p0, p1, p2)")
private external fun wasmLibcUnixAixPthreadAttrSetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadAttrSetstackaddr(p0, p1)")
private external fun wasmLibcUnixAixPthreadAttrSetstackaddr(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadBarrierattrDestroy(p0)")
private external fun wasmLibcUnixAixPthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadBarrierattrGetpshared(p0, p1)")
private external fun wasmLibcUnixAixPthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadBarrierattrInit(p0)")
private external fun wasmLibcUnixAixPthreadBarrierattrInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadBarrierattrSetpshared(p0, p1)")
private external fun wasmLibcUnixAixPthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadBarrierDestroy(p0)")
private external fun wasmLibcUnixAixPthreadBarrierDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPthreadBarrierInit(p0, p1, p2)")
private external fun wasmLibcUnixAixPthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadBarrierWait(p0)")
private external fun wasmLibcUnixAixPthreadBarrierWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadCancel(p0)")
private external fun wasmLibcUnixAixPthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcUnixAixPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadCondattrGetpshared(p0, p1)")
private external fun wasmLibcUnixAixPthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixAixPthreadCondattrSetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadCondattrSetpshared(p0, p1)")
private external fun wasmLibcUnixAixPthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixPthreadGetconcurrency()")
private external fun wasmLibcUnixAixPthreadGetconcurrency(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixAixPthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixAixPthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadKill(p0, p1)")
private external fun wasmLibcUnixAixPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexattrGetprioceiling(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexattrGetprioceiling(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexattrGetprotocol(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexattrGetprotocol(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexattrGetpshared(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexattrGetrobust(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexattrGetrobust(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexattrGettype(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexattrGettype(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexattrSetprioceiling(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexattrSetprioceiling(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexattrSetprotocol(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexattrSetprotocol(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexattrSetpshared(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexattrSetrobust(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexattrSetrobust(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexConsistent(p0)")
private external fun wasmLibcUnixAixPthreadMutexConsistent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexGetprioceiling(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexGetprioceiling(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexSetprioceiling(p0, p1, p2)")
private external fun wasmLibcUnixAixPthreadMutexSetprioceiling(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcUnixAixPthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadOnce(p0, p1)")
private external fun wasmLibcUnixAixPthreadOnce(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadRwlockattrGetpshared(p0, p1)")
private external fun wasmLibcUnixAixPthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadRwlockattrSetpshared(p0, p1)")
private external fun wasmLibcUnixAixPthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadRwlockTimedrdlock(p0, p1)")
private external fun wasmLibcUnixAixPthreadRwlockTimedrdlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadRwlockTimedwrlock(p0, p1)")
private external fun wasmLibcUnixAixPthreadRwlockTimedwrlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadSetcancelstate(p0, p1)")
private external fun wasmLibcUnixAixPthreadSetcancelstate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadSetcanceltype(p0, p1)")
private external fun wasmLibcUnixAixPthreadSetcanceltype(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadSetconcurrency(p0)")
private external fun wasmLibcUnixAixPthreadSetconcurrency(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixAixPthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadSetschedprio(p0, p1)")
private external fun wasmLibcUnixAixPthreadSetschedprio(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcUnixAixPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadSpinDestroy(p0)")
private external fun wasmLibcUnixAixPthreadSpinDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPthreadSpinInit(p0, p1)")
private external fun wasmLibcUnixAixPthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadSpinLock(p0)")
private external fun wasmLibcUnixAixPthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadSpinTrylock(p0)")
private external fun wasmLibcUnixAixPthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPthreadSpinUnlock(p0)")
private external fun wasmLibcUnixAixPthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixIconv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixIconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixIconvClose(p0)")
private external fun wasmLibcUnixAixIconvClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixIconvOpen(p0, p1)")
private external fun wasmLibcUnixAixIconvOpen(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixAcct(p0)")
private external fun wasmLibcUnixAixAcct(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixAioCancel(p0, p1)")
private external fun wasmLibcUnixAixAioCancel(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixAioError(p0)")
private external fun wasmLibcUnixAixAioError(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixAioFsync(p0, p1)")
private external fun wasmLibcUnixAixAioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixAioRead(p0)")
private external fun wasmLibcUnixAixAioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixAioReturn(p0)")
private external fun wasmLibcUnixAixAioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixAioSuspend(p0, p1, p2)")
private external fun wasmLibcUnixAixAioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixAioWrite(p0)")
private external fun wasmLibcUnixAixAioWrite(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixBasename(p0)")
private external fun wasmLibcUnixAixBasename(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixBind(p0, p1, p2)")
private external fun wasmLibcUnixAixBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixBrk(p0)")
private external fun wasmLibcUnixAixBrk(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixClearenv()")
private external fun wasmLibcUnixAixClearenv(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixClockGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixAixClockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixClockGetres(p0, p1)")
private external fun wasmLibcUnixAixClockGetres(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixClockGettime(p0, p1)")
private external fun wasmLibcUnixAixClockGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixClockNanosleep(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixClockSettime(p0, p1)")
private external fun wasmLibcUnixAixClockSettime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixCreat64(p0, p1)")
private external fun wasmLibcUnixAixCreat64(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixCtermid(p0)")
private external fun wasmLibcUnixAixCtermid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixDirfd(p0)")
private external fun wasmLibcUnixAixDirfd(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixDirname(p0)")
private external fun wasmLibcUnixAixDirname(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixDrand48()")
private external fun wasmLibcUnixAixDrand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixDuplocale(p0)")
private external fun wasmLibcUnixAixDuplocale(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixEndgrent()")
private external fun wasmLibcUnixAixEndgrent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixEndmntent(p0)")
private external fun wasmLibcUnixAixEndmntent(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixEndpwent()")
private external fun wasmLibcUnixAixEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixEndutent()")
private external fun wasmLibcUnixAixEndutent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixEndutxent()")
private external fun wasmLibcUnixAixEndutxent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixErand48(p0)")
private external fun wasmLibcUnixAixErand48(p0: String): Double

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFattach(p0, p1)")
private external fun wasmLibcUnixAixFattach(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixFdatasync(p0)")
private external fun wasmLibcUnixAixFdatasync(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixFexecve(p0, p1, p2)")
private external fun wasmLibcUnixAixFexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixFfs(p0)")
private external fun wasmLibcUnixAixFfs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixFfsl(p0)")
private external fun wasmLibcUnixAixFfsl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixFfsll(p0)")
private external fun wasmLibcUnixAixFfsll(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixFgetgrent(p0)")
private external fun wasmLibcUnixAixFgetgrent(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFgetpos64(p0, p1)")
private external fun wasmLibcUnixAixFgetpos64(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixFgetpwent(p0)")
private external fun wasmLibcUnixAixFgetpwent(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFopen64(p0, p1)")
private external fun wasmLibcUnixAixFopen64(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixFreelocale(p0)")
private external fun wasmLibcUnixAixFreelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixFreopen64(p0, p1, p2)")
private external fun wasmLibcUnixAixFreopen64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixFseeko64(p0, p1, p2)")
private external fun wasmLibcUnixAixFseeko64(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFsetpos64(p0, p1)")
private external fun wasmLibcUnixAixFsetpos64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFstat64(p0, p1)")
private external fun wasmLibcUnixAixFstat64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFstatfs(p0, p1)")
private external fun wasmLibcUnixAixFstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFstatfs64(p0, p1)")
private external fun wasmLibcUnixAixFstatfs64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFstatvfs64(p0, p1)")
private external fun wasmLibcUnixAixFstatvfs64(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixFtello64(p0)")
private external fun wasmLibcUnixAixFtello64(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFtok(p0, p1)")
private external fun wasmLibcUnixAixFtok(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFtruncate64(p0, p1)")
private external fun wasmLibcUnixAixFtruncate64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixFutimens(p0, p1)")
private external fun wasmLibcUnixAixFutimens(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGetcontext(p0)")
private external fun wasmLibcUnixAixGetcontext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixGetdomainname(p0, p1)")
private external fun wasmLibcUnixAixGetdomainname(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixGetdtablesize()")
private external fun wasmLibcUnixAixGetdtablesize(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixGetgrent()")
private external fun wasmLibcUnixAixGetgrent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGetgrgid(p0)")
private external fun wasmLibcUnixAixGetgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGetgrnam(p0)")
private external fun wasmLibcUnixAixGetgrnam(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGetgrset(p0)")
private external fun wasmLibcUnixAixGetgrset(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixGethostid()")
private external fun wasmLibcUnixAixGethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGetmntent(p0)")
private external fun wasmLibcUnixAixGetmntent(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixAixGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixAixGetnameinfo(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixGetpagesize()")
private external fun wasmLibcUnixAixGetpagesize(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixGetpeereid(p0, p1, p2)")
private external fun wasmLibcUnixAixGetpeereid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixGetpriority(p0, p1)")
private external fun wasmLibcUnixAixGetpriority(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixGetpwent()")
private external fun wasmLibcUnixAixGetpwent(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixGetrlimit(p0, p1)")
private external fun wasmLibcUnixAixGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixGetrlimit64(p0, p1)")
private external fun wasmLibcUnixAixGetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixGettimeofday(p0, p1)")
private external fun wasmLibcUnixAixGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixGetitimer(p0, p1)")
private external fun wasmLibcUnixAixGetitimer(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixGetutent()")
private external fun wasmLibcUnixAixGetutent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGetutid(p0)")
private external fun wasmLibcUnixAixGetutid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGetutline(p0)")
private external fun wasmLibcUnixAixGetutline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixGetutxent()")
private external fun wasmLibcUnixAixGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGetutxid(p0)")
private external fun wasmLibcUnixAixGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGetutxline(p0)")
private external fun wasmLibcUnixAixGetutxline(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixGlob(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixGlob(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixGlobfree(p0)")
private external fun wasmLibcUnixAixGlobfree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixHasmntopt(p0, p1)")
private external fun wasmLibcUnixAixHasmntopt(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixHcreate(p0)")
private external fun wasmLibcUnixAixHcreate(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixHdestroy()")
private external fun wasmLibcUnixAixHdestroy()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixIfFreenameindex(p0)")
private external fun wasmLibcUnixAixIfFreenameindex(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixIfNameindex()")
private external fun wasmLibcUnixAixIfNameindex(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixInitgroups(p0, p1)")
private external fun wasmLibcUnixAixInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixAixIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixAixIoctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixJrand48(p0)")
private external fun wasmLibcUnixAixJrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixLcong48(p0)")
private external fun wasmLibcUnixAixLcong48(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixLfind(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixLfind(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixLioListio(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixLioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixAixLoadquery(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixAixLoadquery(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixLparGetInfo(p0, p1, p2)")
private external fun wasmLibcUnixAixLparGetInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixLparSetResources(p0, p1)")
private external fun wasmLibcUnixAixLparSetResources(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixLrand48()")
private external fun wasmLibcUnixAixLrand48(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixLsearch(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixLsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixLseek64(p0, p1, p2)")
private external fun wasmLibcUnixAixLseek64(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixLstat64(p0, p1)")
private external fun wasmLibcUnixAixLstat64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixAixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixAixMakecontext(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixAixMakecontext(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixMallopt(p0, p1)")
private external fun wasmLibcUnixAixMallopt(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixMemsetS(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixMemsetS(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixMincore(p0, p1, p2)")
private external fun wasmLibcUnixAixMincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixAixMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixMknodat(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixMount(p0, p1, p2)")
private external fun wasmLibcUnixAixMount(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixMprotect(p0, p1, p2)")
private external fun wasmLibcUnixAixMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixMqClose(p0)")
private external fun wasmLibcUnixAixMqClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixMqGetattr(p0, p1)")
private external fun wasmLibcUnixAixMqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixMqNotify(p0, p1)")
private external fun wasmLibcUnixAixMqNotify(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixAixMqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixAixMqOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixMqReceive(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixMqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixMqSend(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixMqSend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixMqSetattr(p0, p1, p2)")
private external fun wasmLibcUnixAixMqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixMqTimedreceive(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixMqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixMqTimedsend(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixMqTimedsend(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixMqUnlink(p0)")
private external fun wasmLibcUnixAixMqUnlink(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixMrand48()")
private external fun wasmLibcUnixAixMrand48(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixMsgctl(p0, p1, p2)")
private external fun wasmLibcUnixAixMsgctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixMsgget(p0, p1)")
private external fun wasmLibcUnixAixMsgget(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixMsgrcv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixMsgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixMsgsnd(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixMsgsnd(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixMsync(p0, p1, p2)")
private external fun wasmLibcUnixAixMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixNewlocale(p0, p1, p2)")
private external fun wasmLibcUnixAixNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixNlLanginfo(p0)")
private external fun wasmLibcUnixAixNlLanginfo(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixNlLanginfoL(p0, p1)")
private external fun wasmLibcUnixAixNlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixNrand48(p0)")
private external fun wasmLibcUnixAixNrand48(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixAixOpen64(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixAixOpen64(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPollsetCreate(p0)")
private external fun wasmLibcUnixAixPollsetCreate(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPollsetCtl(p0, p1, p2)")
private external fun wasmLibcUnixAixPollsetCtl(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPollsetDestroy(p0)")
private external fun wasmLibcUnixAixPollsetDestroy(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixPollsetPoll(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixPollsetPoll(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPollsetQuery(p0, p1)")
private external fun wasmLibcUnixAixPollsetQuery(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPopen(p0, p1)")
private external fun wasmLibcUnixAixPopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixPosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixPosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixPosixFadvise64(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixPosixFadvise64(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixAixPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPosixFallocate64(p0, p1, p2)")
private external fun wasmLibcUnixAixPosixFallocate64(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPosixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixAixPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixAixPosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixAixPosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixAixPosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixPosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixAixPosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixAixPosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixAixPosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrGetschedparam(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrGetschedpolicy(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrInit(p0)")
private external fun wasmLibcUnixAixPosixSpawnattrInit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrSetschedparam(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrSetschedpolicy(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixAixPosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixAixPosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixAixPosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixPread64(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixPread64(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixPtrace64(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixPtrace64(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPututline(p0)")
private external fun wasmLibcUnixAixPututline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixPututxline(p0)")
private external fun wasmLibcUnixAixPututxline(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixPwrite64(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixPwrite64(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixQuotactl(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixQuotactl(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixRand()")
private external fun wasmLibcUnixAixRand(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixReadv(p0, p1, p2)")
private external fun wasmLibcUnixAixReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixAixRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixAixRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixRecvmmsg(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixRecvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixAixRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixRegcomp(p0, p1, p2)")
private external fun wasmLibcUnixAixRegcomp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixRegerror(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixRegerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixRegexec(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixRegexec(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixRegfree(p0)")
private external fun wasmLibcUnixAixRegfree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSbrk(p0)")
private external fun wasmLibcUnixAixSbrk(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSchedGetparam(p0, p1)")
private external fun wasmLibcUnixAixSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSchedGetscheduler(p0)")
private external fun wasmLibcUnixAixSchedGetscheduler(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSchedGetPriorityMax(p0)")
private external fun wasmLibcUnixAixSchedGetPriorityMax(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSchedGetPriorityMin(p0)")
private external fun wasmLibcUnixAixSchedGetPriorityMin(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSchedRrGetInterval(p0, p1)")
private external fun wasmLibcUnixAixSchedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSchedSetparam(p0, p1)")
private external fun wasmLibcUnixAixSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcUnixAixSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixAixSctpOptInfo(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixAixSctpOptInfo(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSctpPeeloff(p0, p1)")
private external fun wasmLibcUnixAixSctpPeeloff(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSeed48(p0)")
private external fun wasmLibcUnixAixSeed48(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSeekdir(p0, p1)")
private external fun wasmLibcUnixAixSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSemClose(p0)")
private external fun wasmLibcUnixAixSemClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSemDestroy(p0)")
private external fun wasmLibcUnixAixSemDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSemGetvalue(p0, p1)")
private external fun wasmLibcUnixAixSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSemInit(p0, p1, p2)")
private external fun wasmLibcUnixAixSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixAixSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixAixSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSemTimedwait(p0, p1)")
private external fun wasmLibcUnixAixSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSemUnlink(p0)")
private external fun wasmLibcUnixAixSemUnlink(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixAixSemctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixAixSemctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSemget(p0, p1, p2)")
private external fun wasmLibcUnixAixSemget(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSemop(p0, p1, p2)")
private external fun wasmLibcUnixAixSemop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSendFile(p0, p1, p2)")
private external fun wasmLibcUnixAixSendFile(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixSendmmsg(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixSendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixAixSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSetcontext(p0)")
private external fun wasmLibcUnixAixSetcontext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSetdomainname(p0, p1)")
private external fun wasmLibcUnixAixSetdomainname(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSetgroups(p0, p1)")
private external fun wasmLibcUnixAixSetgroups(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixSetgrent()")
private external fun wasmLibcUnixAixSetgrent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSethostid(p0)")
private external fun wasmLibcUnixAixSethostid(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSethostname(p0, p1)")
private external fun wasmLibcUnixAixSethostname(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSetmntent(p0, p1)")
private external fun wasmLibcUnixAixSetmntent(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixAixSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixSetpwent()")
private external fun wasmLibcUnixAixSetpwent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSetrlimit(p0, p1)")
private external fun wasmLibcUnixAixSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSetrlimit64(p0, p1)")
private external fun wasmLibcUnixAixSetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSettimeofday(p0, p1)")
private external fun wasmLibcUnixAixSettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSetitimer(p0, p1, p2)")
private external fun wasmLibcUnixAixSetitimer(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixSetutent()")
private external fun wasmLibcUnixAixSetutent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixSetutxent()")
private external fun wasmLibcUnixAixSetutxent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSigaltstack(p0, p1)")
private external fun wasmLibcUnixAixSigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSigsuspend(p0)")
private external fun wasmLibcUnixAixSigsuspend(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixAixSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSigwait(p0, p1)")
private external fun wasmLibcUnixAixSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSigwaitinfo(p0, p1)")
private external fun wasmLibcUnixAixSigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixShmat(p0, p1, p2)")
private external fun wasmLibcUnixAixShmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixShmdt(p0)")
private external fun wasmLibcUnixAixShmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixShmctl(p0, p1, p2)")
private external fun wasmLibcUnixAixShmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixShmget(p0, p1, p2)")
private external fun wasmLibcUnixAixShmget(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixAixShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixShmUnlink(p0)")
private external fun wasmLibcUnixAixShmUnlink(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixSplice(p0, p1, p2)")
private external fun wasmLibcUnixAixSplice(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSrand(p0)")
private external fun wasmLibcUnixAixSrand(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSrand48(p0)")
private external fun wasmLibcUnixAixSrand48(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixStat64(p0, p1)")
private external fun wasmLibcUnixAixStat64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixStat64at(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixStat64at(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixStatfs(p0, p1)")
private external fun wasmLibcUnixAixStatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixStatfs64(p0, p1)")
private external fun wasmLibcUnixAixStatfs64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixStatvfs64(p0, p1)")
private external fun wasmLibcUnixAixStatvfs64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixStatx(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixStatx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixStrcasecmpL(p0, p1, p2)")
private external fun wasmLibcUnixAixStrcasecmpL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixAixStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixStrftime(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixStrncasecmpL(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixStrncasecmpL(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixStrptime(p0, p1, p2)")
private external fun wasmLibcUnixAixStrptime(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixStrsep(p0, p1)")
private external fun wasmLibcUnixAixStrsep(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixSwapcontext(p0, p1)")
private external fun wasmLibcUnixAixSwapcontext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSwapoff(p0)")
private external fun wasmLibcUnixAixSwapoff(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixSwapon(p0)")
private external fun wasmLibcUnixAixSwapon(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixSync()")
private external fun wasmLibcUnixAixSync()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixTelldir(p0)")
private external fun wasmLibcUnixAixTelldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixTimerCreate(p0, p1, p2)")
private external fun wasmLibcUnixAixTimerCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixTimerDelete(p0)")
private external fun wasmLibcUnixAixTimerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixTimerGetoverrun(p0)")
private external fun wasmLibcUnixAixTimerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixTimerGettime(p0, p1)")
private external fun wasmLibcUnixAixTimerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixTimerSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixTimerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixTruncate64(p0, p1)")
private external fun wasmLibcUnixAixTruncate64(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixUname(p0)")
private external fun wasmLibcUnixAixUname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixAixUpdwtmp(p0, p1)")
private external fun wasmLibcUnixAixUpdwtmp(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixUselocale(p0)")
private external fun wasmLibcUnixAixUselocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixAixUtmpname(p0)")
private external fun wasmLibcUnixAixUtmpname(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixWait4(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixWait4(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixAixWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixAixWaitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixAixWritev(p0, p1, p2)")
private external fun wasmLibcUnixAixWritev(p0: Int, p1: String, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixAixErrno()")
private external fun wasmLibcUnixAixErrno(): String

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixThrKill(id.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(): ThreadT =
    if (unixAixNapiAvailable) wasmLibcUnixAixThrSelf().toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrGetdetachstate(attr.rawAddress.toString(), detachstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrGetinheritsched(attr.rawAddress.toString(), inheritsched.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrGetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrGetschedpolicy(attr.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetscope(attr: ConstPtr<PthreadAttrT>, contentionscope: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrGetscope(attr.rawAddress.toString(), contentionscope.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrSetinheritsched(attr.rawAddress.toString(), inheritsched) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrSetschedpolicy(attr.rawAddress.toString(), policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetscope(attr: MutPtr<PthreadAttrT>, contentionscope: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrSetscope(attr.rawAddress.toString(), contentionscope) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrSetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadAttrSetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadBarrierattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadBarrierattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadBarrierattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, pshared: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadBarrierattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadBarrierDestroy(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadBarrierWait(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadCancel(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCleanupPop(execute: CInt): Unit =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: MutPtr<CVoid>): Unit =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadCondattrSetclock(attr.rawAddress.toString(), clockId.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadCreate(thread.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetconcurrency(): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadGetconcurrency() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: MutPtr<ClockidT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadGetcpuclockid(threadId.toLong().toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(thread: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadGetschedparam(thread.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprioceiling(attr: ConstPtr<PthreadMutexattrT>, prioceiling: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexattrGetprioceiling(attr.rawAddress.toString(), prioceiling.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexattrGetprotocol(attr.rawAddress.toString(), protocol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexattrGetrobust(attr.rawAddress.toString(), robust.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, type: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexattrGettype(attr.rawAddress.toString(), type.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprioceiling(attr: MutPtr<PthreadMutexattrT>, prioceiling: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexattrSetprioceiling(attr.rawAddress.toString(), prioceiling) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexattrSetprotocol(attr.rawAddress.toString(), protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexattrSetrobust(attr.rawAddress.toString(), robust) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexConsistent(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexGetprioceiling(mutex: ConstPtr<PthreadMutexT>, prioceiling: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexGetprioceiling(mutex.rawAddress.toString(), prioceiling.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexSetprioceiling(mutex: MutPtr<PthreadMutexT>, prioceiling: CInt, oldCeiling: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexSetprioceiling(mutex.rawAddress.toString(), prioceiling, oldCeiling.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadMutexTimedlock(mutex.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadOnce(onceControl.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadRwlockattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, pshared: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadRwlockattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedrdlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadRwlockTimedrdlock(rwlock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedwrlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadRwlockTimedwrlock(rwlock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetcancelstate(state: CInt, oldstate: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSetcancelstate(state, oldstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetcanceltype(type: CInt, oldtype: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSetcanceltype(type, oldtype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSetconcurrency(newLevel) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSetschedparam(thread.toLong().toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSetschedprio(thread.toLong().toString(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSigmask(how, set.rawAddress.toString(), oset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTestcancel(): Unit =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixIconvClose(cd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: MutPtr<CChar>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixAcct(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fildes: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixAioCancel(fildes, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixAioError(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixAioFsync(op, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixAioRead(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixAioReturn(aiocbp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(list: ConstPtr<ConstPtr<Aiocb>>, nent: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixAioSuspend(list.rawAddress.toString(), nent, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixAioWrite(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixBind(socket, address.rawAddress.toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixBrk(addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixClearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixClockGetcpuclockid(pid, clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixClockGetres(clkId.toString(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixClockGettime(clkId.toString(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixClockNanosleep(clkId.toString(), flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixClockSettime(clockId.toString(), tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixCreat64(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixCtermid(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixDirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): CDouble =
    if (unixAixNapiAvailable) wasmLibcUnixAixDrand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixDuplocale(arg1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endgrent() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixEndmntent(streamp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endpwent() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutent() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixEndutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    if (unixAixNapiAvailable) wasmLibcUnixAixErand48(xseed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFattach(fildes, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffs(value: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFfs(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsl(value: CLong): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFfsl(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsll(value: CLonglong): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFfsll(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrent(file: MutPtr<FILE>): MutPtr<Group> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixFgetgrent(file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFgetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwent(file: MutPtr<FILE>): MutPtr<Passwd> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixFgetpwent(file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixFopen64(filename.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixFreopen64(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFseeko64(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFsetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFstat64(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFstatfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFstatfs64(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFstatvfs64(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    if (unixAixNapiAvailable) wasmLibcUnixAixFtello64(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT =
    if (unixAixNapiAvailable) wasmLibcUnixAixFtok(path.rawAddress.toString(), id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFtruncate64(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcontext(ucp: MutPtr<UcontextT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetcontext(ucp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetdomainname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrent(): MutPtr<Group> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrset(user: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetgrset(user.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixAixNapiAvailable) wasmLibcUnixAixGethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetmntent(stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SizeT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetnameinfo(sa.rawAddress.toString(), salen.toString(), host.rawAddress.toString(), hostlen.toString(), serv.rawAddress.toString(), servlen.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetpagesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetpeereid(socket, euid.rawAddress.toString(), egid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetrlimit64(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGetitimer(which, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutent(): MutPtr<Utmp> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetutent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetutid(u.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetutline(u.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetutxid(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixGetutxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixHasmntopt(mnt.rawAddress.toString(), opt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcreate(nelt: SizeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixHcreate(nelt.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdestroy() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixHdestroy()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixIfNameindex().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixInitgroups(name.rawAddress.toString(), basegid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixIoctl(fildes, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixAixNapiAvailable) wasmLibcUnixAixJrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr<CUshort>) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixLfind(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nent: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixLioListio(mode, aiocbList.rawAddress.toString(), nent, sevp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadquery(flags: CInt, buf: MutPtr<CVoid>, buflen: CUint, vararg variadicArgs: Long): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixLoadquery(flags, buf.rawAddress.toString(), buflen.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lparGetInfo(command: CInt, buf: MutPtr<CVoid>, bufsize: SizeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixLparGetInfo(command, buf.rawAddress.toString(), bufsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lparSetResources(id: CInt, resource: MutPtr<CVoid>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixLparSetResources(id, resource.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixAixNapiAvailable) wasmLibcUnixAixLrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixLsearch(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (unixAixNapiAvailable) wasmLibcUnixAixLseek64(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixLstat64(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makecontext(ucp: MutPtr<UcontextT>, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixMakecontext(ucp.rawAddress.toString(), 0L.toString(), argc, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMallopt(param, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMemsetS(s.rawAddress.toString(), smax.toString(), c, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(device: ConstPtr<CChar>, path: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMount(device.rawAddress.toString(), path.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqClose(mqd.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqNotify(mqd.toLong().toString(), notification.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMqUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixAixNapiAvailable) wasmLibcUnixAixMrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMsgctl(msqid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMsgget(key, msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixMsgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixNlLanginfoL(item, loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixAixNapiAvailable) wasmLibcUnixAixNrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixOpen64(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    if (unixAixNapiAvailable) wasmLibcUnixAixPollsetCreate(maxfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: MutPtr<PollCtl>, arrayLength: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPollsetCtl(ps, pollctlArray.rawAddress.toString(), arrayLength) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPollsetDestroy(ps) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetPoll(ps: PollsetT, polldataArray: MutPtr<Pollfd>, arrayLength: CInt, timeout: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPollsetPoll(ps, polldataArray.rawAddress.toString(), arrayLength, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: MutPtr<Pollfd>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPollsetQuery(ps, pollfdQuery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixFadvise64(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixFallocate64(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnFileActionsDestroy(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnFileActionsInit(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixPread64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixPtrace64(request, id.toString(), addr.toString(), data, buff.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixPututline(u.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixPututxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixPwrite64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: MutPtr<CChar>, special: CInt, id: CInt, data: CaddrT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixQuotactl(cmd.rawAddress.toString(), special, id, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(sockfd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixRecvmsg(sockfd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixSbrk(increment.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSchedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSchedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSchedRrGetInterval(pid, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: MutPtr<CVoid>, size: MutPtr<SizeT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSctpOptInfo(sd, id.toInt(), opt, argSize.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpPeeloff(s: CInt, id: MutPtr<CUint>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSctpPeeloff(s, id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixSeed48(xseed.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSemget(key, nsems, semflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSemop(semid, sops.rawAddress.toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendFile(socket: MutPtr<CInt>, iobuf: MutPtr<SfParms>, flags: CUint): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixSendFile(socket.rawAddress.toString(), iobuf.rawAddress.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(sockfd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixSendmsg(sockfd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setcontext(ucp: ConstPtr<UcontextT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSetcontext(ucp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSetdomainname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSetgroups(ngroups, ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sethostid(hostid: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSethostid(hostid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSethostname(name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixSetmntent(filename.rawAddress.toString(), ty.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSetpriority(which, who.toInt(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSetrlimit64(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixSetutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setutxent() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixShmat(shmid, shmaddr.rawAddress.toString(), shmflg).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixShmdt(shmaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixShmctl(shmid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixShmget(key, size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSplice(socket1, socket2, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srand48(seed: CLong) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixStat64(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat64at(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixStat64at(dirfd, path.rawAddress.toString(), buf.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixStatfs64(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixStatvfs64(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statx(path: ConstPtr<CChar>, buf: MutPtr<Stat>, length: CInt, command: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixStatx(path.rawAddress.toString(), buf.rawAddress.toString(), length, command) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixStrcasecmpL(string1.rawAddress.toString(), string2.rawAddress.toString(), locale.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: ConstPtr<Tm>): SizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixStrftime(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixStrncasecmpL(string1.rawAddress.toString(), string2.rawAddress.toString(), length.toString(), locale.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixStrsep(string.rawAddress.toString(), delim.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapcontext(uocp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSwapcontext(uocp.rawAddress.toString(), ucp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(path: ConstPtr<CChar>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSwapoff(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: ConstPtr<CChar>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixSwapon(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixAixNapiAvailable) wasmLibcUnixAixTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixTimerCreate(clockid.toString(), sevp.rawAddress.toString(), timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixTimerDelete(timerid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixTimerGetoverrun(timerid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixTimerGettime(timerid.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixTimerSettime(timerid.toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixTruncate64(path.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmp(file: ConstPtr<CChar>, u: ConstPtr<Utmp>) {
    if (unixAixNapiAvailable) {
        wasmLibcUnixAixUpdwtmp(file.rawAddress.toString(), u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixUtmpname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    if (unixAixNapiAvailable) wasmLibcUnixAixWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixAixNapiAvailable) wasmLibcUnixAixWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixAixNapiAvailable) wasmLibcUnixAixWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): MutPtr<CInt> =
    if (unixAixNapiAvailable) MutPtr(wasmLibcUnixAixErrno().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
