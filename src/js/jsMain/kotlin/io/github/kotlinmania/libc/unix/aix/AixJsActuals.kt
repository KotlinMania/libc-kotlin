@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val unixAixNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixThrKill(id.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(): ThreadT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixThrSelf() as String).toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrGetdetachstate(attr.rawAddress.toString(), detachstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrGetinheritsched(attr.rawAddress.toString(), inheritsched.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrGetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrGetschedpolicy(attr.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetscope(attr: ConstPtr<PthreadAttrT>, contentionscope: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrGetscope(attr.rawAddress.toString(), contentionscope.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrSetinheritsched(attr.rawAddress.toString(), inheritsched) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrSetschedpolicy(attr.rawAddress.toString(), policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetscope(attr: MutPtr<PthreadAttrT>, contentionscope: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrSetscope(attr.rawAddress.toString(), contentionscope) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrSetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadAttrSetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadBarrierattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadBarrierattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadBarrierattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, pshared: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadBarrierattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadBarrierDestroy(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadBarrierWait(barrier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadCancel(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCleanupPop(execute: CInt): CVoid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: MutPtr<CVoid>): CVoid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadCondattrSetclock(attr.rawAddress.toString(), clockId.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadCreate(thread.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetconcurrency(): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadGetconcurrency() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: MutPtr<ClockidT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadGetcpuclockid(threadId.toLong().toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(thread: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadGetschedparam(thread.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadKill(thread.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprioceiling(attr: ConstPtr<PthreadMutexattrT>, prioceiling: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexattrGetprioceiling(attr.rawAddress.toString(), prioceiling.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexattrGetprotocol(attr.rawAddress.toString(), protocol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexattrGetrobust(attr.rawAddress.toString(), robust.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, type: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexattrGettype(attr.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprioceiling(attr: MutPtr<PthreadMutexattrT>, prioceiling: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexattrSetprioceiling(attr.rawAddress.toString(), prioceiling) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexattrSetprotocol(attr.rawAddress.toString(), protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexattrSetrobust(attr.rawAddress.toString(), robust) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexConsistent(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexGetprioceiling(mutex: ConstPtr<PthreadMutexT>, prioceiling: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexGetprioceiling(mutex.rawAddress.toString(), prioceiling.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexSetprioceiling(mutex: MutPtr<PthreadMutexT>, prioceiling: CInt, oldCeiling: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexSetprioceiling(mutex.rawAddress.toString(), prioceiling, oldCeiling.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadMutexTimedlock(mutex.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadOnce(onceControl.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadRwlockattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, pshared: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadRwlockattrSetpshared(attr.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedrdlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadRwlockTimedrdlock(rwlock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedwrlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadRwlockTimedwrlock(rwlock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetcancelstate(state: CInt, oldstate: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSetcancelstate(state, oldstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetcanceltype(type: CInt, oldtype: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSetcanceltype(type, oldtype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSetconcurrency(newLevel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSetschedparam(thread.toLong().toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSetschedprio(thread.toLong().toString(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSigmask(how, set.rawAddress.toString(), oset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSpinDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSpinInit(lock.rawAddress.toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSpinLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSpinTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPthreadSpinUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTestcancel(): CVoid =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixIconvClose(cd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: MutPtr<CChar>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixAcct(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fildes: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixAioCancel(fildes, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixAioError(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixAioFsync(op, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixAioRead(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixAioReturn(aiocbp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(list: ConstPtr<ConstPtr<Aiocb>>, nent: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixAioSuspend(list.rawAddress.toString(), nent, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixAioWrite(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixBasename(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixBind(socket, address.rawAddress.toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixBrk(addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixClearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixClockGetcpuclockid(pid, clkId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixClockGetres(clkId.toString(), tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixClockGettime(clkId.toString(), tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixClockNanosleep(clkId.toString(), flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixClockSettime(clockId.toString(), tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixCreat64(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixCtermid(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixDirname(path.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): CDouble =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixDrand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixDuplocale(arg1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endgrent() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixEndmntent(streamp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endpwent() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutent() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixEndutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixErand48(xseed.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFattach(fildes, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffs(value: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFfs(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsl(value: CLong): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFfsl(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsll(value: CLonglong): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFfsll(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrent(file: MutPtr<FILE>): MutPtr<Group> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixFgetgrent(file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFgetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwent(file: MutPtr<FILE>): MutPtr<Passwd> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixFgetpwent(file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixFopen64(filename.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixFreopen64(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFseeko64(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFsetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFstat64(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFstatfs64(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFstatvfs64(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFtello64(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFtok(path.rawAddress.toString(), id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFtruncate64(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcontext(ucp: MutPtr<UcontextT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetcontext(ucp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetdomainname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrent(): MutPtr<Group> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetgrent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrset(user: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetgrset(user.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetmntent(stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SizeT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetnameinfo(sa.rawAddress.toString(), salen.toString(), host.rawAddress.toString(), hostlen.toString(), serv.rawAddress.toString(), servlen.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetpagesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetpeereid(socket, euid.rawAddress.toString(), egid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetrlimit64(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGetitimer(which, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutent(): MutPtr<Utmp> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetutent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetutid(u.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetutline(u.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetutxent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetutxid(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixGetutxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixHasmntopt(mnt.rawAddress.toString(), opt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcreate(nelt: SizeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixHcreate(nelt.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdestroy() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixHdestroy()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixIfNameindex() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixInitgroups(name.rawAddress.toString(), basegid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixIoctl(fildes, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixJrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr<CUshort>) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixLfind(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nent: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixLioListio(mode, aiocbList.rawAddress.toString(), nent, sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadquery(flags: CInt, buf: MutPtr<CVoid>, buflen: CUint, vararg variadicArgs: Long): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixLoadquery(flags, buf.rawAddress.toString(), buflen.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lparGetInfo(command: CInt, buf: MutPtr<CVoid>, bufsize: SizeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixLparGetInfo(command, buf.rawAddress.toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lparSetResources(id: CInt, resource: MutPtr<CVoid>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixLparSetResources(id, resource.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixLrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixLsearch(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixLseek64(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixLstat64(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makecontext(ucp: MutPtr<UcontextT>, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixMakecontext(ucp.rawAddress.toString(), 0L.toString(), argc, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMallopt(param, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMemsetS(s.rawAddress.toString(), smax.toString(), c, n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(device: ConstPtr<CChar>, path: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMount(device.rawAddress.toString(), path.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqClose(mqd.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqNotify(mqd.toLong().toString(), notification.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMqUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMsgctl(msqid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMsgget(key, msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMsgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixNlLanginfoL(item, loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixNrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixOpen64(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPollsetCreate(maxfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: MutPtr<PollCtl>, arrayLength: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPollsetCtl(ps, pollctlArray.rawAddress.toString(), arrayLength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPollsetDestroy(ps) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetPoll(ps: PollsetT, polldataArray: MutPtr<Pollfd>, arrayLength: CInt, timeout: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPollsetPoll(ps, polldataArray.rawAddress.toString(), arrayLength, timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: MutPtr<Pollfd>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPollsetQuery(ps, pollfdQuery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixPopen(command.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixFadvise64(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixFallocate64(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnFileActionsDestroy(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnFileActionsInit(actions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPread64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPtrace64(request, id.toString(), addr.toString(), data, buff.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixPututline(u.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixPututxline(ut.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPwrite64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: MutPtr<CChar>, special: CInt, id: CInt, data: CaddrT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixQuotactl(cmd.rawAddress.toString(), special, id, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(sockfd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixRecvmsg(sockfd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixSbrk(increment.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSchedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSchedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSchedRrGetInterval(pid, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: MutPtr<CVoid>, size: MutPtr<SizeT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSctpOptInfo(sd, id.toInt(), opt, argSize.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpPeeloff(s: CInt, id: MutPtr<CUint>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSctpPeeloff(s, id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixSeed48(xseed.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSemget(key, nsems, semflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSemop(semid, sops.rawAddress.toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendFile(socket: MutPtr<CInt>, iobuf: MutPtr<SfParms>, flags: CUint): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSendFile(socket.rawAddress.toString(), iobuf.rawAddress.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(sockfd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSendmsg(sockfd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setcontext(ucp: ConstPtr<UcontextT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSetcontext(ucp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSetdomainname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSetgroups(ngroups, ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sethostid(hostid: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSethostid(hostid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSethostname(name.rawAddress.toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixSetmntent(filename.rawAddress.toString(), ty.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSetpriority(which, who.toInt(), priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSetrlimit64(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixSetutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setutxent() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixShmat(shmid, shmaddr.rawAddress.toString(), shmflg) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixShmdt(shmaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixShmctl(shmid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixShmget(key, size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSplice(socket1, socket2, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srand48(seed: CLong) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStat64(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat64at(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStat64at(dirfd, path.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStatfs64(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStatvfs64(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statx(path: ConstPtr<CChar>, buf: MutPtr<Stat>, length: CInt, command: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStatx(path.rawAddress.toString(), buf.rawAddress.toString(), length, command) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStrcasecmpL(string1.rawAddress.toString(), string2.rawAddress.toString(), locale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: ConstPtr<Tm>): SizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStrftime(arg1.rawAddress.toString(), arg2.toString(), arg3.rawAddress.toString(), arg4.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixStrncasecmpL(string1.rawAddress.toString(), string2.rawAddress.toString(), length.toString(), locale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixStrsep(string.rawAddress.toString(), delim.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapcontext(uocp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSwapcontext(uocp.rawAddress.toString(), ucp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(path: ConstPtr<CChar>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSwapoff(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: ConstPtr<CChar>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixSwapon(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixTimerCreate(clockid.toString(), sevp.rawAddress.toString(), timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixTimerDelete(timerid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixTimerGetoverrun(timerid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixTimerGettime(timerid.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixTimerSettime(timerid.toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixTruncate64(path.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmp(file: ConstPtr<CChar>, u: ConstPtr<Utmp>) {
    if (unixAixNapiAddon != null) {
        unixAixNapiAddon.libcUnixAixUpdwtmp(file.rawAddress.toString(), u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixUtmpname(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixAixNapiAddon != null) (unixAixNapiAddon.libcUnixAixWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): MutPtr<CInt> =
    if (unixAixNapiAddon != null) MutPtr((unixAixNapiAddon.libcUnixAixErrno() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
