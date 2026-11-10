@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtPthreadNapiAddon(): Boolean

private val _newQurtPthreadNapiAvailable: Boolean = _initNewQurtPthreadNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadJoin(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadDetach(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadDetach(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadExit(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadExit(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadSelf()")
private external fun _wasm_libc_new_qurt_pthread_pthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadEqual(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadEqual(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadAttrInit(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadAttrDestroy(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadAttrSetstacksize(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadAttrGetstacksize(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadAttrSetdetachstate(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadAttrGetdetachstate(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadAttrGetdetachstate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadMutexInit(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadMutexDestroy(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadMutexLock(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadMutexTrylock(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadMutexUnlock(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadMutexattrInit(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadMutexattrDestroy(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadMutexattrSettype(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadMutexattrGettype(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadMutexattrGettype(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCondInit(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCondDestroy(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCondDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCondWait(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCondTimedwait(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCondSignal(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCondBroadcast(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCondattrInit(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCondattrDestroy(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadKeyCreate(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadKeyDelete(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadGetspecific(p0)")
private external fun _wasm_libc_new_qurt_pthread_pthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadSetspecific(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadOnce(p0, p1)")
private external fun _wasm_libc_new_qurt_pthread_pthreadOnce(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_pthread_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadAttrSetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_pthread_pthreadAttrSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_pthread_pthreadAttrGetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_pthread_pthreadAttrGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_pthread_posixMemalign(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_pthread_posixMemalign(p0: String, p1: String, p2: String): Int

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCreate((thread?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (arg?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadJoin(thread.toLong().toString(), (retval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadDetach(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(retval: COpaquePointer?): Nothing {
    if (_newQurtPthreadNapiAvailable) {
        _wasm_libc_new_qurt_pthread_pthreadExit((retval?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadSelf().toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadEqual(t1.toLong().toString(), t2.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadAttrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadAttrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, detachstate: CInt): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), detachstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadAttrGetdetachstate((attr?.value ?: 0L).toString(), (detachstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadMutexInit((mutex?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadMutexDestroy((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadMutexLock((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadMutexTrylock((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadMutexUnlock((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadMutexattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, kind: CInt): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), kind) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, kind: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadMutexattrGettype((attr?.value ?: 0L).toString(), (kind?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCondDestroy((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCondWait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCondSignal((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCondBroadcast((cond?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCondattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadKeyDelete(key) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadGetspecific(key).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadSetspecific(key, (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadOnce((onceControl?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadAttrSetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_pthreadAttrGetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt =
    if (_newQurtPthreadNapiAvailable) _wasm_libc_new_qurt_pthread_posixMemalign((memptr?.value ?: 0L).toString(), alignment.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
