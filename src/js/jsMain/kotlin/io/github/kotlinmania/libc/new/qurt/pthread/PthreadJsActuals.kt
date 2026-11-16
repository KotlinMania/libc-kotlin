@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val newQurtPthreadNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun pthreadCreate(thread: MutPtr, attr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCreate(thread.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(thread: PthreadT, retval: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadJoin(thread.toLong().toString(), retval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadDetach(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(retval: MutPtr): Nothing {
    if (newQurtPthreadNapiAddon != null) {
        newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadExit(retval.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadSelf() as String).toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadEqual(t1.toLong().toString(), t2.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadAttrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadAttrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stacksize: SizeT): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadAttrSetstacksize(attr.rawAddress.toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadAttrGetstacksize(attr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, detachstate: CInt): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadAttrSetdetachstate(attr.rawAddress.toString(), detachstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr, detachstate: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadAttrGetdetachstate(attr.rawAddress.toString(), detachstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(mutex: MutPtr, attr: ConstPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadMutexInit(mutex.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(mutex: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadMutexDestroy(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(mutex: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadMutexLock(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(mutex: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadMutexTrylock(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(mutex: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadMutexUnlock(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadMutexattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadMutexattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr, kind: CInt): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadMutexattrSettype(attr.rawAddress.toString(), kind) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGettype(attr: ConstPtr, kind: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadMutexattrGettype(attr.rawAddress.toString(), kind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCondDestroy(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr, mutex: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCondWait(cond.rawAddress.toString(), mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr, mutex: MutPtr, abstime: ConstPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCondTimedwait(cond.rawAddress.toString(), mutex.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCondSignal(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCondBroadcast(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCondattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCondattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadKeyDelete(key) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    if (newQurtPthreadNapiAddon != null) MutPtr((newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadGetspecific(key) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadSetspecific(key, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(onceControl: MutPtr, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadOnce(onceControl.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadGetnameNp(thread.toLong().toString(), name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadAttrSetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetaffinityNp(attr: MutPtr, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPthreadAttrGetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: MutPtr, alignment: SizeT, size: SizeT): CInt =
    if (newQurtPthreadNapiAddon != null) (newQurtPthreadNapiAddon.libcNewQurtPthreadPosixMemalign(memptr.rawAddress.toString(), alignment.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
