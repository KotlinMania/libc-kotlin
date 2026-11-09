// port-lint: source new/qurt/pthread.rs
package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadCondT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadMutexT
import io.github.kotlinmania.libc.new.qurt.PthreadOnceT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

// Header: `pthread.h`
//
// QuRT provides a subset of POSIX pthread functionality optimized for real-time systems.

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface FnCallback1 {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface FnCallback2 {
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
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = 0xFFFFFFFFu

public val PTHREAD_COND_INITIALIZER: PthreadCondT = 0xFFFFFFFFu

public val PTHREAD_ONCE_INIT: PthreadOnceT = 0

// Stack size
public val PTHREAD_STACK_MIN: SizeT = 8192uL

// Additional pthread types and attributes
public val PTHREAD_SCOPE_SYSTEM: CInt = 0

public val PTHREAD_SCOPE_PROCESS: CInt = 1

public val PTHREAD_INHERIT_SCHED: CInt = 0

public val PTHREAD_EXPLICIT_SCHED: CInt = 1

// Thread management
public expect fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: FnCallback, arg: COpaquePointer?): CInt

public expect fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun pthreadExit(retval: COpaquePointer?): Nothing

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

// Thread attributes
public expect fun pthreadAttrInit(attr: COpaquePointer?): CInt

public expect fun pthreadAttrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt

public expect fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadAttrSetdetachstate(attr: COpaquePointer?, detachstate: CInt): CInt

public expect fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt

// Mutex operations
public expect fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt

public expect fun pthreadMutexLock(mutex: COpaquePointer?): CInt

public expect fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt

public expect fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt

// Mutex attributes
public expect fun pthreadMutexattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadMutexattrSettype(attr: COpaquePointer?, kind: CInt): CInt

public expect fun pthreadMutexattrGettype(attr: COpaquePointer?, kind: COpaquePointer?): CInt

// Condition variables
public expect fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadCondDestroy(cond: COpaquePointer?): CInt

public expect fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt

public expect fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadCondSignal(cond: COpaquePointer?): CInt

public expect fun pthreadCondBroadcast(cond: COpaquePointer?): CInt

// Condition variable attributes
public expect fun pthreadCondattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

// Thread-local storage
public expect fun pthreadKeyCreate(key: COpaquePointer?, destructor: FnCallback1?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

// One-time initialization
public expect fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: FnCallback2): CInt

// GNU extensions
public expect fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

// POSIX standard
public expect fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt
