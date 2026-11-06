@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_create(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), startRoutine.toInt(), arg?.value?.toCPointer<ByteVar>())

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_join(thread.toInt(), retval?.value?.toCPointer<ByteVar>())

public actual fun pthreadDetach(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_detach(thread.toInt())

public actual fun pthreadExit(retval: COpaquePointer?): Nothing {
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_exit(retval?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_self()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_equal(t1.toInt(), t2.toInt())

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_attr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_attr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_attr_setstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_attr_getstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, detachstate: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_attr_setdetachstate(attr?.value?.toCPointer<ByteVar>(), detachstate)

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_attr_getdetachstate(attr?.value?.toCPointer<ByteVar>(), detachstate?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_mutex_init(mutex?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_mutex_destroy(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_mutex_lock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_mutex_trylock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_mutex_unlock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_mutexattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_mutexattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, kind: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_mutexattr_settype(attr?.value?.toCPointer<ByteVar>(), kind)

public actual fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, kind: CInt?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_mutexattr_gettype(attr?.value?.toCPointer<ByteVar>(), kind?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_cond_init(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_cond_destroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_cond_wait(cond?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_cond_timedwait(cond?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_cond_signal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_cond_broadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_condattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_condattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadKeyCreate(key: PthreadKeyT?, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_key_create(key?.value?.toCPointer<ByteVar>(), destructor?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_key_delete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_getspecific(key.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_setspecific(key.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_once(onceControl?.value?.toCPointer<ByteVar>(), initRoutine.toInt())

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_getname_np(thread.toInt(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_attr_setaffinity_np(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_pthread_attr_getaffinity_np(attr?.value?.toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_pthread_posix_memalign(memptr?.value?.toCPointer<ByteVar>(), alignment, size)
