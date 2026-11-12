@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module libc.
public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCreate")

public actual fun pthreadJoin(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadJoin")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadDetach")

public actual fun pthreadExit(retval: MutPtr<CVoid>): Nothing =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadExit")

public actual fun pthreadSelf(): PthreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadSelf")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadEqual")

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadAttrInit")

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadAttrDestroy")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stacksize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadAttrSetstacksize")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadAttrGetstacksize")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, detachstate: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadAttrSetdetachstate")

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadAttrGetdetachstate")

public actual fun pthreadMutexInit(mutex: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadMutexInit")

public actual fun pthreadMutexDestroy(mutex: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadMutexDestroy")

public actual fun pthreadMutexLock(mutex: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadMutexLock")

public actual fun pthreadMutexTrylock(mutex: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadMutexTrylock")

public actual fun pthreadMutexUnlock(mutex: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadMutexUnlock")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadMutexattrInit")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadMutexattrDestroy")

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, kind: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadMutexattrSettype")

public actual fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, kind: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadMutexattrGettype")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCondInit")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCondDestroy")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCondWait")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCondTimedwait")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCondSignal")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCondBroadcast")

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCondattrInit")

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCondattrDestroy")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadCondattrSetclock")

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadKeyCreate")

@kotlin.wasm.WasmImport("libc", "libcNewQurtPthreadPthreadKeyDelete")
private external fun wasiLibcNewQurtPthreadPthreadKeyDelete(key: Int): Int

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    wasiLibcNewQurtPthreadPthreadKeyDelete(key).toInt()

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadGetspecific")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadSetspecific")

public actual fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadOnce")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadGetnameNp")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadAttrSetaffinityNp")

public actual fun pthreadAttrGetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPthreadAttrGetaffinityNp")

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, alignment: SizeT, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtPthreadPosixMemalign")
