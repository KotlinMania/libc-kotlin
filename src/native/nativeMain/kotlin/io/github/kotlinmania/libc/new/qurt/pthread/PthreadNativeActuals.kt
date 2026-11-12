@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPosixMemalign
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadAttrDestroy
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadAttrGetaffinityNp
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadAttrGetdetachstate
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadAttrGetstacksize
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadAttrInit
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadAttrSetaffinityNp
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadAttrSetdetachstate
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadAttrSetstacksize
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCondBroadcast
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCondDestroy
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCondInit
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCondSignal
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCondTimedwait
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCondWait
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCondattrDestroy
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCondattrInit
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCondattrSetclock
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadCreate
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadDetach
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadEqual
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadExit
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadGetnameNp
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadGetspecific
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadJoin
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadKeyCreate
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadKeyDelete
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadMutexDestroy
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadMutexInit
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadMutexLock
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadMutexTrylock
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadMutexUnlock
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadMutexattrDestroy
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadMutexattrGettype
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadMutexattrInit
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadMutexattrSettype
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadOnce
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadSelf
import io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libcNewQurtPthreadPthreadSetspecific
import io.github.kotlinmania.libc.new.qurt.sys.types.CpuSetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt =
    libcNewQurtPthreadPthreadCreate(thread.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadJoin(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    libcNewQurtPthreadPthreadJoin(thread.toLong().toCPointer<ByteVar>(), retval.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libcNewQurtPthreadPthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadExit(retval: MutPtr<CVoid>): Nothing {
    libcNewQurtPthreadPthreadExit(retval.rawAddress.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    (libcNewQurtPthreadPthreadSelf()?.toLong() ?: 0L).toUInt()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libcNewQurtPthreadPthreadEqual(t1.toLong().toCPointer<ByteVar>(), t2.toLong().toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    libcNewQurtPthreadPthreadAttrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    libcNewQurtPthreadPthreadAttrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stacksize: SizeT): CInt =
    libcNewQurtPthreadPthreadAttrSetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    libcNewQurtPthreadPthreadAttrGetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, detachstate: CInt): CInt =
    libcNewQurtPthreadPthreadAttrSetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), detachstate)

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    libcNewQurtPthreadPthreadAttrGetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), detachstate.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(mutex: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    libcNewQurtPthreadPthreadMutexInit(mutex.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(mutex: MutPtr<PthreadMutexT>): CInt =
    libcNewQurtPthreadPthreadMutexDestroy(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(mutex: MutPtr<PthreadMutexT>): CInt =
    libcNewQurtPthreadPthreadMutexLock(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(mutex: MutPtr<PthreadMutexT>): CInt =
    libcNewQurtPthreadPthreadMutexTrylock(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(mutex: MutPtr<PthreadMutexT>): CInt =
    libcNewQurtPthreadPthreadMutexUnlock(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcNewQurtPthreadPthreadMutexattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcNewQurtPthreadPthreadMutexattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, kind: CInt): CInt =
    libcNewQurtPthreadPthreadMutexattrSettype(attr.rawAddress.toCPointer<ByteVar>(), kind)

public actual fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, kind: MutPtr<CInt>): CInt =
    libcNewQurtPthreadPthreadMutexattrGettype(attr.rawAddress.toCPointer<ByteVar>(), kind.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    libcNewQurtPthreadPthreadCondInit(cond.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    libcNewQurtPthreadPthreadCondDestroy(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>): CInt =
    libcNewQurtPthreadPthreadCondWait(cond.rawAddress.toCPointer<ByteVar>(), mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcNewQurtPthreadPthreadCondTimedwait(cond.rawAddress.toCPointer<ByteVar>(), mutex.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    libcNewQurtPthreadPthreadCondSignal(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    libcNewQurtPthreadPthreadCondBroadcast(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    libcNewQurtPthreadPthreadCondattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    libcNewQurtPthreadPthreadCondattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcNewQurtPthreadPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    libcNewQurtPthreadPthreadKeyCreate(key.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libcNewQurtPthreadPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(libcNewQurtPthreadPthreadGetspecific(key)?.toLong() ?: 0L)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    libcNewQurtPthreadPthreadSetspecific(key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    libcNewQurtPthreadPthreadOnce(onceControl.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    libcNewQurtPthreadPthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    libcNewQurtPthreadPthreadAttrSetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    libcNewQurtPthreadPthreadAttrGetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, alignment: SizeT, size: SizeT): CInt =
    libcNewQurtPthreadPosixMemalign(memptr.rawAddress.toCPointer<ByteVar>(), alignment, size)
