// port-lint: source new/qurt/pthread.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val PTHREAD_CREATE_JOINABLE: Int = 0
public const val PTHREAD_CREATE_DETACHED: Int = 1
public const val PTHREAD_MUTEX_NORMAL: Int = 0
public const val PTHREAD_MUTEX_RECURSIVE: Int = 1
public const val PTHREAD_MUTEX_ERRORCHECK: Int = 2
public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_PRIO_NONE: Int = 0
public const val PTHREAD_PRIO_INHERIT: Int = 1
public const val PTHREAD_PRIO_PROTECT: Int = 2
public const val PTHREAD_MIN_PRIORITY: Int = 0
public const val PTHREAD_MAX_PRIORITY: Int = 255
public val PTHREAD_MUTEX_INITIALIZER: UInt = 0xFFFFFFFF.toUInt()
public val PTHREAD_COND_INITIALIZER: UInt = 0xFFFFFFFF.toUInt()
public const val PTHREAD_ONCE_INIT: Int = 0
public const val PTHREAD_STACK_MIN: ULong = 8192uL
public const val PTHREAD_SCOPE_SYSTEM: Int = 0
public const val PTHREAD_SCOPE_PROCESS: Int = 1
public const val PTHREAD_INHERIT_SCHED: Int = 0
public const val PTHREAD_EXPLICIT_SCHED: Int = 1

public expect fun pthreadCreate(thread: UInt?, attr: UInt?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int

public expect fun pthreadJoin(thread: UInt, retval: COpaquePointer?): Int

public expect fun pthreadDetach(thread: UInt): Int

public fun pthreadExit(retval: COpaquePointer?): Nothing = throw UnsupportedOperationException()

public fun pthreadSelf(): UInt = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun pthreadEqual(t1: UInt, t2: UInt): Int

public expect fun pthreadAttrInit(attr: UInt?): Int

public expect fun pthreadAttrDestroy(attr: UInt?): Int

public expect fun pthreadAttrSetstacksize(attr: UInt?, stacksize: ULong): Int

public expect fun pthreadAttrGetstacksize(attr: UInt?, stacksize: ULong?): Int

public expect fun pthreadAttrSetdetachstate(attr: UInt?, detachstate: Int): Int

public expect fun pthreadAttrGetdetachstate(attr: UInt?, detachstate: Int?): Int

public expect fun pthreadMutexInit(mutex: UInt?, attr: UInt?): Int

public expect fun pthreadMutexDestroy(mutex: UInt?): Int

public expect fun pthreadMutexLock(mutex: UInt?): Int

public expect fun pthreadMutexTrylock(mutex: UInt?): Int

public expect fun pthreadMutexUnlock(mutex: UInt?): Int

public expect fun pthreadMutexattrInit(attr: UInt?): Int

public expect fun pthreadMutexattrDestroy(attr: UInt?): Int

public expect fun pthreadMutexattrSettype(attr: UInt?, kind: Int): Int

public expect fun pthreadMutexattrGettype(attr: UInt?, kind: Int?): Int

public expect fun pthreadCondInit(cond: UInt?, attr: UInt?): Int

public expect fun pthreadCondDestroy(cond: UInt?): Int

public expect fun pthreadCondWait(cond: UInt?, mutex: UInt?): Int

public expect fun pthreadCondTimedwait(cond: UInt?, mutex: UInt?, abstime: Timespec?): Int

public expect fun pthreadCondSignal(cond: UInt?): Int

public expect fun pthreadCondBroadcast(cond: UInt?): Int

public expect fun pthreadCondattrInit(attr: UInt?): Int

public expect fun pthreadCondattrDestroy(attr: UInt?): Int

public expect fun pthreadCondattrSetclock(attr: UInt?, clockId: Int): Int

public expect fun pthreadKeyCreate(key: Int?, destructor: ((COpaquePointer?) -> Unit)?): Int

public expect fun pthreadKeyDelete(key: Int): Int

public expect fun pthreadGetspecific(key: Int): COpaquePointer?

public expect fun pthreadSetspecific(key: Int, value: COpaquePointer?): Int

public expect fun pthreadOnce(onceControl: Int?, initRoutine: (() -> Unit)?): Int

public expect fun pthreadGetnameNp(thread: UInt, name: String?, len: ULong): Int

public expect fun pthreadAttrSetaffinityNp(attr: UInt?, cpusetsize: ULong, cpuset: ULong?): Int

public expect fun pthreadAttrGetaffinityNp(attr: UInt?, cpusetsize: ULong, cpuset: ULong?): Int

public expect fun posixMemalign(memptr: COpaquePointer?, alignment: ULong, size: ULong): Int
