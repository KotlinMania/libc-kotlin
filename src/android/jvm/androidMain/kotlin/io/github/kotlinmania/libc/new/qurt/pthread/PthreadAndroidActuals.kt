@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

private object NewQurtPthreadJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCreate(thread: Long, attr: Long, startRoutine: Long, arg: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadJoin(thread: Long, retval: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadDetach(thread: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadExit(retval: Long)

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadSelf(): Long

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadAttrInit(attr: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadAttrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadAttrSetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadAttrGetstacksize(attr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadAttrSetdetachstate(attr: Long, detachstate: Int): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadAttrGetdetachstate(attr: Long, detachstate: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadMutexInit(mutex: Long, attr: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadMutexDestroy(mutex: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadMutexLock(mutex: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadMutexTrylock(mutex: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadMutexUnlock(mutex: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadMutexattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadMutexattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadMutexattrSettype(attr: Long, kind: Int): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadMutexattrGettype(attr: Long, kind: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCondInit(cond: Long, attr: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCondDestroy(cond: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCondWait(cond: Long, mutex: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCondTimedwait(cond: Long, mutex: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCondSignal(cond: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCondBroadcast(cond: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCondattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCondattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadKeyCreate(key: Long, destructor: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadKeyDelete(key: Int): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadGetspecific(key: Int): Long

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadSetspecific(key: Int, value: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadOnce(onceControl: Long, initRoutine: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadAttrSetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_pthreadAttrGetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_new_qurt_pthread_posixMemalign(memptr: Long, alignment: Long, size: Long): Int
}

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCreate((thread?.value ?: 0L), (attr?.value ?: 0L), 0L, (arg?.value ?: 0L))

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadJoin(thread.toLong(), (retval?.value ?: 0L))

public actual fun pthreadDetach(thread: PthreadT): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadDetach(thread.toLong())

public actual fun pthreadExit(retval: COpaquePointer?): Nothing {
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadExit((retval?.value ?: 0L))
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadSelf().toUInt()()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadEqual(t1.toLong(), t2.toLong())

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadAttrInit((attr?.value ?: 0L))

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadAttrDestroy((attr?.value ?: 0L))

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadAttrSetstacksize((attr?.value ?: 0L), stacksize.toLong())

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadAttrGetstacksize((attr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, detachstate: CInt): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadAttrSetdetachstate((attr?.value ?: 0L), detachstate)

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadAttrGetdetachstate((attr?.value ?: 0L), (detachstate?.value ?: 0L))

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadMutexInit((mutex?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadMutexDestroy((mutex?.value ?: 0L))

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadMutexLock((mutex?.value ?: 0L))

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadMutexTrylock((mutex?.value ?: 0L))

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadMutexUnlock((mutex?.value ?: 0L))

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadMutexattrInit((attr?.value ?: 0L))

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadMutexattrDestroy((attr?.value ?: 0L))

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, kind: CInt): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadMutexattrSettype((attr?.value ?: 0L), kind)

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, kind: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadMutexattrGettype((attr?.value ?: 0L), (kind?.value ?: 0L))

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCondInit((cond?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCondDestroy((cond?.value ?: 0L))

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCondWait((cond?.value ?: 0L), (mutex?.value ?: 0L))

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCondTimedwait((cond?.value ?: 0L), (mutex?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCondSignal((cond?.value ?: 0L))

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCondBroadcast((cond?.value ?: 0L))

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCondattrInit((attr?.value ?: 0L))

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCondattrDestroy((attr?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun pthreadKeyCreate(key: COpaquePointer?, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadKeyCreate((key?.value ?: 0L), 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadGetspecific(key).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadSetspecific(key, (value?.value ?: 0L))

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadOnce((onceControl?.value ?: 0L), 0L)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadGetnameNp(thread.toLong(), (name?.value ?: 0L), len.toLong())

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadAttrSetaffinityNp((attr?.value ?: 0L), cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_pthreadAttrGetaffinityNp((attr?.value ?: 0L), cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt =
    NewQurtPthreadJniBridge.libc_new_qurt_pthread_posixMemalign((memptr?.value ?: 0L), alignment.toLong(), size.toLong())
