@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.PthreadCondT
import io.github.kotlinmania.libc.new.qurt.PthreadCondattrT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadMutexT
import io.github.kotlinmania.libc.new.qurt.PthreadMutexattrT
import io.github.kotlinmania.libc.new.qurt.PthreadOnceT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.new.qurt.sys.types.CpuSetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewQurtPthreadNapiAddon(): Boolean

private val newQurtPthreadNapiAvailable: Boolean = initNewQurtPthreadNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcNewQurtPthreadPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadJoin(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadJoin(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadDetach(p0)")
private external fun wasmLibcNewQurtPthreadPthreadDetach(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadExit(p0)")
private external fun wasmLibcNewQurtPthreadPthreadExit(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadSelf()")
private external fun wasmLibcNewQurtPthreadPthreadSelf(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadEqual(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadEqual(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadAttrInit(p0)")
private external fun wasmLibcNewQurtPthreadPthreadAttrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadAttrDestroy(p0)")
private external fun wasmLibcNewQurtPthreadPthreadAttrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadAttrSetstacksize(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadAttrSetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadAttrGetstacksize(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadAttrGetstacksize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadAttrSetdetachstate(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadAttrSetdetachstate(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadAttrGetdetachstate(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadAttrGetdetachstate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadMutexInit(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadMutexInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadMutexDestroy(p0)")
private external fun wasmLibcNewQurtPthreadPthreadMutexDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadMutexLock(p0)")
private external fun wasmLibcNewQurtPthreadPthreadMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadMutexTrylock(p0)")
private external fun wasmLibcNewQurtPthreadPthreadMutexTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadMutexUnlock(p0)")
private external fun wasmLibcNewQurtPthreadPthreadMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadMutexattrInit(p0)")
private external fun wasmLibcNewQurtPthreadPthreadMutexattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadMutexattrDestroy(p0)")
private external fun wasmLibcNewQurtPthreadPthreadMutexattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadMutexattrSettype(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadMutexattrSettype(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadMutexattrGettype(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadMutexattrGettype(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCondInit(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadCondInit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCondDestroy(p0)")
private external fun wasmLibcNewQurtPthreadPthreadCondDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCondWait(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadCondWait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCondTimedwait(p0, p1, p2)")
private external fun wasmLibcNewQurtPthreadPthreadCondTimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCondSignal(p0)")
private external fun wasmLibcNewQurtPthreadPthreadCondSignal(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCondBroadcast(p0)")
private external fun wasmLibcNewQurtPthreadPthreadCondBroadcast(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCondattrInit(p0)")
private external fun wasmLibcNewQurtPthreadPthreadCondattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCondattrDestroy(p0)")
private external fun wasmLibcNewQurtPthreadPthreadCondattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadKeyCreate(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadKeyCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadKeyDelete(p0)")
private external fun wasmLibcNewQurtPthreadPthreadKeyDelete(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadGetspecific(p0)")
private external fun wasmLibcNewQurtPthreadPthreadGetspecific(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadSetspecific(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadSetspecific(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadOnce(p0, p1)")
private external fun wasmLibcNewQurtPthreadPthreadOnce(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcNewQurtPthreadPthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadAttrSetaffinityNp(p0, p1, p2)")
private external fun wasmLibcNewQurtPthreadPthreadAttrSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtPthreadPthreadAttrGetaffinityNp(p0, p1, p2)")
private external fun wasmLibcNewQurtPthreadPthreadAttrGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtPthreadPosixMemalign(p0, p1, p2)")
private external fun wasmLibcNewQurtPthreadPosixMemalign(p0: String, p1: String, p2: String): Int

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCreate(thread.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadJoin(thread.toLong().toString(), retval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadDetach(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(retval: MutPtr<CVoid>): Nothing {
    if (newQurtPthreadNapiAvailable) {
        wasmLibcNewQurtPthreadPthreadExit(retval.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadSelf().toLong().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadEqual(t1.toLong().toString(), t2.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadAttrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadAttrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stacksize: SizeT): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadAttrSetstacksize(attr.rawAddress.toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadAttrGetstacksize(attr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, detachstate: CInt): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadAttrSetdetachstate(attr.rawAddress.toString(), detachstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadAttrGetdetachstate(attr.rawAddress.toString(), detachstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(mutex: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadMutexInit(mutex.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(mutex: MutPtr<PthreadMutexT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadMutexDestroy(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(mutex: MutPtr<PthreadMutexT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadMutexLock(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(mutex: MutPtr<PthreadMutexT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadMutexTrylock(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(mutex: MutPtr<PthreadMutexT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadMutexUnlock(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadMutexattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadMutexattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, kind: CInt): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadMutexattrSettype(attr.rawAddress.toString(), kind) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, kind: MutPtr<CInt>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadMutexattrGettype(attr.rawAddress.toString(), kind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCondDestroy(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCondWait(cond.rawAddress.toString(), mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCondTimedwait(cond.rawAddress.toString(), mutex.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCondSignal(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCondBroadcast(cond.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCondattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCondattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadKeyDelete(key) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    if (newQurtPthreadNapiAvailable) MutPtr(wasmLibcNewQurtPthreadPthreadGetspecific(key).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadSetspecific(key, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadOnce(onceControl.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadGetnameNp(thread.toLong().toString(), name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadAttrSetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPthreadAttrGetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, alignment: SizeT, size: SizeT): CInt =
    if (newQurtPthreadNapiAvailable) wasmLibcNewQurtPthreadPosixMemalign(memptr.rawAddress.toString(), alignment.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
