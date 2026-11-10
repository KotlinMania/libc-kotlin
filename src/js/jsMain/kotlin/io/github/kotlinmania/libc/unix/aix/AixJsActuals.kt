@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

private val _unixAixNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_thrKill(id.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(): ThreadT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_thrSelf() as String).toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrGetdetachstate((attr?.value ?: 0L).toString(), (detachstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrGetinheritsched((attr?.value ?: 0L).toString(), (inheritsched?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrGetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrGetschedpolicy((attr?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrGetscope((attr?.value ?: 0L).toString(), (contentionscope?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrSetinheritsched((attr?.value ?: 0L).toString(), inheritsched) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrSetschedpolicy((attr?.value ?: 0L).toString(), policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrSetscope((attr?.value ?: 0L).toString(), contentionscope) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrSetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadAttrSetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadBarrierWait((barrier?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadCancel(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCleanupPop(execute: CInt) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_pthreadCleanupPop(execute)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: COpaquePointer?) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_pthreadCleanupPush(0L.toString(), (arg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadCreate((thread?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (arg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetconcurrency(): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadGetconcurrency() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadGetcpuclockid(threadId.toLong().toString(), (clockId?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(thread: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadGetschedparam(thread.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadKill(thread.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprioceiling(attr: COpaquePointer?, prioceiling: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexattrGetprioceiling((attr?.value ?: 0L).toString(), (prioceiling?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexattrGetprotocol((attr?.value ?: 0L).toString(), (protocol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexattrGetrobust((attr?.value ?: 0L).toString(), (robust?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, type: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexattrGettype((attr?.value ?: 0L).toString(), (type?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprioceiling(attr: COpaquePointer?, prioceiling: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexattrSetprioceiling((attr?.value ?: 0L).toString(), prioceiling) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexattrSetprotocol((attr?.value ?: 0L).toString(), protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexattrSetrobust((attr?.value ?: 0L).toString(), robust) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexConsistent((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexGetprioceiling(mutex: COpaquePointer?, prioceiling: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexGetprioceiling((mutex?.value ?: 0L).toString(), (prioceiling?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexSetprioceiling(mutex: COpaquePointer?, prioceiling: CInt, oldCeiling: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexSetprioceiling((mutex?.value ?: 0L).toString(), prioceiling, (oldCeiling?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadMutexTimedlock((mutex?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadOnce((onceControl?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedrdlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadRwlockTimedrdlock((rwlock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedwrlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadRwlockTimedwrlock((rwlock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetcancelstate(state: CInt, oldstate: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSetcancelstate(state, (oldstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetcanceltype(type: CInt, oldtype: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSetcanceltype(type, (oldtype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSetconcurrency(newLevel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSetschedparam(thread.toLong().toString(), policy, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSetschedprio(thread.toLong().toString(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSpinDestroy((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSpinLock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSpinTrylock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pthreadSpinUnlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTestcancel() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_pthreadTestcancel()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_iconvClose((cd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_iconvOpen(tocode, fromcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_acct((filename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fildes: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_aioCancel(fildes, (aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_aioError((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_aioFsync(op, (aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_aioRead((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_aioReturn((aiocbp?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_aioSuspend((list?.value ?: 0L).toString(), nent, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_aioWrite((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_basename((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_brk((addr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_clearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_clockGetres(clkId.toString(), (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_clockGettime(clkId.toString(), (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_clockNanosleep(clkId.toString(), flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_clockSettime(clockId.toString(), (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat64(path: String?, mode: ModeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_creat64(path, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ctermid((s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_dirfd((dirp?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_dirname((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): CDouble =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_drand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_duplocale((arg1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endgrent() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endmntent(streamp: FILE?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_endmntent((streamp?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endpwent() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutent() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_endutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_erand48((xseed?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_faccessat(dirfd, pathname, mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fattach(fildes: CInt, path: String?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fattach(fildes, path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffs(value: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ffs(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsl(value: CLong): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ffsl(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsll(value: CLonglong): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ffsll(value.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrent(file: FILE?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fgetgrent((file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fgetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwent(file: FILE?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fgetpwent((file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fopen64(filename, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_freopen64(filename, mode, (file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fseeko64((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fsetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fstat64(fildes, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fstatfs(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fstatfs64(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_fstatvfs64(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: FILE?): Off64T =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ftello64((stream?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(path: String?, id: CInt): KeyT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ftok(path, id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ftruncate64(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_futimens(fd, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getcontext((ucp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getdomainname((name?.value ?: 0L).toString(), len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrent(): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrset(user: String?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getgrset(user) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_gethostid() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getmntent((stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SizeT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getnameinfo((sa?.value ?: 0L).toString(), salen.toString(), (host?.value ?: 0L).toString(), hostlen.toString(), (serv?.value ?: 0L).toString(), servlen.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getpagesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getpeereid(socket, (euid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getrlimit64(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getitimer(which, (currValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutent(): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getutent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutid(u: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getutid((u?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutline(u: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getutline((u?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_hasmntopt((mnt?.value ?: 0L).toString(), opt) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcreate(nelt: SizeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_hcreate(nelt.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdestroy() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_hdestroy()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_ifFreenameindex((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ifNameindex() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_initgroups(name, basegid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ioctl(fildes, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_jrand48((xseed?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_lcong48((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_lfind((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), (nelp?.value ?: 0L).toString(), width.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nent, (sevp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadquery(flags: CInt, buf: COpaquePointer?, buflen: CUint, vararg variadicArgs: Long): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_loadquery(flags, (buf?.value ?: 0L).toString(), buflen.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: SizeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_lparGetInfo(command, (buf?.value ?: 0L).toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_lparSetResources(id, (resource?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_lrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_lsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), (nelp?.value ?: 0L).toString(), width.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_lseek64(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat64(path: String?, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_lstat64(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makecontext(ucp: COpaquePointer?, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_makecontext((ucp?.value ?: 0L).toString(), 0L.toString(), argc, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mallopt(param, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_memsetS((s?.value ?: 0L).toString(), smax.toString(), c, n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mknodat(dirfd, pathname, mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(device: String?, path: String?, flags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mount(device, path, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqClose(mqd.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqGetattr(mqd.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqNotify(mqd.toLong().toString(), (notification?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqReceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqSend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqSetattr(mqd.toLong().toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqTimedreceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqTimedsend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: String?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mqUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_mrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_msgctl(msqid, cmd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_msgget(key, msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_msgsnd(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_newlocale(mask, locale, (base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_nlLanginfoL(item, (loc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_nrand48((xseed?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_open64(path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pollsetCreate(maxfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: COpaquePointer?, arrayLength: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pollsetCtl(ps, (pollctlArray?.value ?: 0L).toString(), arrayLength) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pollsetDestroy(ps) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetPoll(ps: PollsetT, polldataArray: COpaquePointer?, arrayLength: CInt, timeout: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pollsetPoll(ps, (polldataArray?.value ?: 0L).toString(), arrayLength, timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pollsetQuery(ps, (pollfdQuery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixFadvise64(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixFallocate64(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pread64(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_ptrace64(request, id.toString(), addr.toString(), data, (buff?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututline(u: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pututline((u?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pwrite64(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: COpaquePointer?, special: CInt, id: CInt, data: CaddrT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_quotactl((cmd?.value ?: 0L).toString(), special, id, (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_rand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_recvmsg(sockfd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_regfree((preg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sbrk(increment.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_schedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_schedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_schedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sctpOptInfo(sd, id.toInt(), opt, (argSize?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpPeeloff(s: CInt, id: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sctpPeeloff(s, (id?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_seed48((xseed?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semClose((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semDestroy((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semget(key, nsems, semflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendFile(socket: COpaquePointer?, iobuf: COpaquePointer?, flags: CUint): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sendFile((socket?.value ?: 0L).toString(), (iobuf?.value ?: 0L).toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sendmsg(sockfd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_setcontext((ucp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_setdomainname(name, len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_setgroups(ngroups, (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sethostid(hostid: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sethostid(hostid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sethostname(name, len) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_setmntent(filename, ty) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_setpriority(which, who.toInt(), priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_setrlimit64(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_setitimer(which, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_setutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setutxent() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sigsuspend((mask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_shmdt((shmaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_shmget(key, size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_shmOpen(name, oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_shmUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_splice(socket1, socket2, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srand48(seed: CLong) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_srand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stat64(path: String?, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_stat64(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat64at(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_stat64at(dirfd, path, (buf?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_statfs(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs64(path: String?, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_statfs64(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs64(path: String?, buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_statvfs64(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statx(path: String?, buf: COpaquePointer?, length: CInt, command: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_statx(path, (buf?.value ?: 0L).toString(), length, command) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_strcasecmpL(string1, string2, (locale?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_strftime((arg1?.value ?: 0L).toString(), arg2.toString(), arg3, (arg4?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_strncasecmpL(string1, string2, length.toString(), (locale?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_strptime(s, format, (tm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_strsep((string?.value ?: 0L).toString(), delim) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_swapcontext((uocp?.value ?: 0L).toString(), (ucp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(path: String?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_swapoff(path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: String?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_swapon(path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_timerCreate(clockid.toString(), (sevp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_timerDelete(timerid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_timerGetoverrun(timerid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_timerGettime(timerid.toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_timerSettime(timerid.toString(), flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate64(path: String?, length: Off64T): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_truncate64(path, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_uname((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmp(file: String?, u: COpaquePointer?) {
    if (_unixAixNapiAddon != null) {
        _unixAixNapiAddon.libc_unix_aix_updwtmp(file, (u?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_uselocale((loc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: String?): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_utmpname(file) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L).toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): COpaquePointer? =
    if (_unixAixNapiAddon != null) (_unixAixNapiAddon.libc_unix_aix_errno() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
