@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

private val _newQurtPthreadNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCreate((thread?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (arg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadJoin(thread.toLong().toString(), (retval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadDetach(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(retval: COpaquePointer?): Nothing {
    if (_newQurtPthreadNapiAddon != null) {
        _newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadExit((retval?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadSelf() as String).toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadEqual(t1.toLong().toString(), t2.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, detachstate: CInt): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), detachstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrGetdetachstate((attr?.value ?: 0L).toString(), (detachstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexInit((mutex?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexDestroy((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexLock((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexTrylock((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexUnlock((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, kind: CInt): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), kind) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, kind: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexattrGettype((attr?.value ?: 0L).toString(), (kind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondDestroy((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondWait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondSignal((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondBroadcast((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadKeyDelete(key) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadGetspecific(key) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadSetspecific(key, (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadOnce((onceControl?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrSetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrGetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_posixMemalign((memptr?.value ?: 0L).toString(), alignment.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
