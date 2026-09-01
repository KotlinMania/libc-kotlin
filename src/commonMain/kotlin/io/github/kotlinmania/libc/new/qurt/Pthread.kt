// port-lint: source new/qurt/pthread.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val PTHREAD_CREATE_JOINABLE: CInt = 0
public const val PTHREAD_CREATE_DETACHED: CInt = 1
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 1
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_PRIO_NONE: CInt = 0
public const val PTHREAD_PRIO_INHERIT: CInt = 1
public const val PTHREAD_PRIO_PROTECT: CInt = 2
public const val PTHREAD_MIN_PRIORITY: CInt = 0
public const val PTHREAD_MAX_PRIORITY: CInt = 255
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = 0xFFFFFFFF.toUInt()
public val PTHREAD_COND_INITIALIZER: PthreadCondT = 0xFFFFFFFF.toUInt()
public const val PTHREAD_ONCE_INIT: PthreadOnceT = 0
public const val PTHREAD_STACK_MIN: ULong = 8192uL
public const val PTHREAD_SCOPE_SYSTEM: CInt = 0
public const val PTHREAD_SCOPE_PROCESS: CInt = 1
public const val PTHREAD_INHERIT_SCHED: CInt = 0
public const val PTHREAD_EXPLICIT_SCHED: CInt = 1

public fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): CInt = -1

public fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt = -1

public fun pthreadDetach(thread: PthreadT): CInt = -1

public fun pthreadExit(retval: COpaquePointer?): Nothing = throw UnsupportedOperationException()

public fun pthreadSelf(): PthreadT = throw UnsupportedOperationException("Not implemented on this platform")

public fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt = -1

public fun pthreadAttrInit(attr: PthreadAttrT?): CInt = -1

public fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt = -1

public fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): CInt = -1

public fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt = -1

public fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, detachstate: CInt): CInt = -1

public fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt = -1

public fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt = -1

public fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt = -1

public fun pthreadMutexLock(mutex: PthreadMutexT?): CInt = -1

public fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt = -1

public fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt = -1

public fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt = -1

public fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt = -1

public fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, kind: CInt): CInt = -1

public fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, kind: CInt?): CInt = -1

public fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt = -1

public fun pthreadCondDestroy(cond: PthreadCondT?): CInt = -1

public fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt = -1

public fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt = -1

public fun pthreadCondSignal(cond: PthreadCondT?): CInt = -1

public fun pthreadCondBroadcast(cond: PthreadCondT?): CInt = -1

public fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt = -1

public fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt = -1

public fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt = -1

public fun pthreadKeyCreate(key: PthreadKeyT?, destructor: ((COpaquePointer?) -> Unit)?): CInt = -1

public fun pthreadKeyDelete(key: PthreadKeyT): CInt = -1

public fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? = null

public fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt = -1

public fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: (() -> Unit)?): CInt = -1

public fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt = -1

public fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt = -1

public fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt = -1

public fun posixMemalign(memptr: COpaquePointer?, alignment: ULong, size: ULong): CInt = -1
