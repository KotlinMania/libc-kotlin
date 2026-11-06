// port-lint: source new/qurt/pthread.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.*

// Header: `pthread.h`
//
// QuRT provides a subset of POSIX pthread functionality optimized for real-time systems.

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface PthreadKeyCreateDestructorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface PthreadOnceInitRoutineCallback {
    public operator fun invoke()
}

// Thread creation attributes
public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_CREATE_DETACHED: CInt = 1

// Mutex types
public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

// Mutex protocol
public val PTHREAD_PRIO_NONE: CInt = 0

public val PTHREAD_PRIO_INHERIT: CInt = 1

public val PTHREAD_PRIO_PROTECT: CInt = 2

// Thread priority constants
public val PTHREAD_MIN_PRIORITY: CInt = 0

public val PTHREAD_MAX_PRIORITY: CInt = 255

// Initializer constants
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = 0xFFFFFFFF

public val PTHREAD_COND_INITIALIZER: PthreadCondT = 0xFFFFFFFF

public val PTHREAD_ONCE_INIT: PthreadOnceT = 0

// Stack size
public val PTHREAD_STACK_MIN: SizeT = 8192uL

// Additional pthread types and attributes
public val PTHREAD_SCOPE_SYSTEM: CInt = 0

public val PTHREAD_SCOPE_PROCESS: CInt = 1

public val PTHREAD_INHERIT_SCHED: CInt = 0

public val PTHREAD_EXPLICIT_SCHED: CInt = 1

// Thread management
public expect fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt

public expect fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun pthreadExit(retval: COpaquePointer?): Nothing

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

// Thread attributes
public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: SizeT): CInt

public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: SizeT?): CInt

public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, detachstate: CInt): CInt

public expect fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt

// Mutex operations
public expect fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexLock(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt

// Mutex attributes
public expect fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, kind: CInt): CInt

public expect fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, kind: CInt?): CInt

// Condition variables
public expect fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt

public expect fun pthreadCondDestroy(cond: PthreadCondT?): CInt

public expect fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt

public expect fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadCondSignal(cond: PthreadCondT?): CInt

public expect fun pthreadCondBroadcast(cond: PthreadCondT?): CInt

// Condition variable attributes
public expect fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt

public expect fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt

// Thread-local storage
public expect fun pthreadKeyCreate(key: PthreadKeyT?, destructor: PthreadKeyCreateDestructorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

// One-time initialization
public expect fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: PthreadOnceInitRoutineCallback): CInt

// GNU extensions
public expect fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

// POSIX standard
public expect fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt
