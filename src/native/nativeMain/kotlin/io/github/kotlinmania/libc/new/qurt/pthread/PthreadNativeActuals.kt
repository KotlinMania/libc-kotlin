@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCreate(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadJoin(thread.toLong().toCPointer<ByteVar>(), retval?.value?.toCPointer<ByteVar>())

public actual fun pthreadDetach(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadExit(retval: COpaquePointer?): Nothing {
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadExit(retval?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadSelf()?.toLong() ?: 0L

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadEqual(t1.toLong().toCPointer<ByteVar>(), t2.toLong().toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadAttrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadAttrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadAttrSetstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadAttrGetstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, detachstate: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadAttrSetdetachstate(attr?.value?.toCPointer<ByteVar>(), detachstate)

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadAttrGetdetachstate(attr?.value?.toCPointer<ByteVar>(), detachstate?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadMutexInit(mutex?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadMutexDestroy(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadMutexLock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadMutexTrylock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadMutexUnlock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadMutexattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadMutexattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, kind: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadMutexattrSettype(attr?.value?.toCPointer<ByteVar>(), kind)

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, kind: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadMutexattrGettype(attr?.value?.toCPointer<ByteVar>(), kind?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCondInit(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCondDestroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCondWait(cond?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCondTimedwait(cond?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCondSignal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCondBroadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCondattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCondattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadKeyCreate(key: COpaquePointer?, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadKeyCreate(key?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadGetspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadSetspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadOnce(onceControl?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadAttrSetaffinityNp(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_pthreadAttrGetaffinityNp(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.pthread.cinterop.libc_new_qurt_pthread_posixMemalign(memptr?.value?.toCPointer<ByteVar>(), alignment, size)
