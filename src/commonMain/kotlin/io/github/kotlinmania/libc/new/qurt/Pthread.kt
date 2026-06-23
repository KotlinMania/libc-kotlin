// port-lint: source new/qurt/pthread.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

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
public const val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = 0xFFFFFFFF
public const val PTHREAD_COND_INITIALIZER: PthreadCondT = 0xFFFFFFFF
public const val PTHREAD_ONCE_INIT: PthreadOnceT = 0
public const val PTHREAD_STACK_MIN: ULong = 8192uL
public const val PTHREAD_SCOPE_SYSTEM: CInt = 0
public const val PTHREAD_SCOPE_PROCESS: CInt = 1
public const val PTHREAD_INHERIT_SCHED: CInt = 0
public const val PTHREAD_EXPLICIT_SCHED: CInt = 1

public expect fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): CInt
public expect fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt
public expect fun pthreadDetach(thread: PthreadT): CInt
public expect fun pthreadExit(retval: COpaquePointer?): Nothing
public expect fun pthreadSelf(): PthreadT
public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt
public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt
public expect fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt
public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): CInt
public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt
public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, detachstate: CInt): CInt
public expect fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt
public expect fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt
public expect fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt
public expect fun pthreadMutexLock(mutex: PthreadMutexT?): CInt
public expect fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt
public expect fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt
public expect fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt
public expect fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt
public expect fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, kind: CInt): CInt
public expect fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, kind: CInt?): CInt
public expect fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt
public expect fun pthreadCondDestroy(cond: PthreadCondT?): CInt
public expect fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt
public expect fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt
public expect fun pthreadCondSignal(cond: PthreadCondT?): CInt
public expect fun pthreadCondBroadcast(cond: PthreadCondT?): CInt
public expect fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt
public expect fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt
public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt
public expect fun pthreadKeyCreate(key: PthreadKeyT?, destructor: ((COpaquePointer?) -> Unit)?): CInt
public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt
public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?
public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt
public expect fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: (() -> Unit)?): CInt
public expect fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt
public expect fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt
public expect fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt
public expect fun posixMemalign(memptr: COpaquePointer?, alignment: ULong, size: ULong): CInt
