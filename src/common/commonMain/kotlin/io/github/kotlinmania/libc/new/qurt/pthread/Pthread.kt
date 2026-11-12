// port-lint: source new/qurt/pthread.rs
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

// Header: `pthread.h`
//
// QuRT provides a subset of POSIX pthread functionality optimized for real-time systems.

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun interface PthreadKeyCreateDestructorCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>)
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
public expect fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt

public expect fun pthreadJoin(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun pthreadExit(retval: MutPtr<CVoid>): Nothing

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

// Thread attributes
public expect fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stacksize: SizeT): CInt

public expect fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, detachstate: CInt): CInt

public expect fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt

// Mutex operations
public expect fun pthreadMutexInit(mutex: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexDestroy(mutex: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexLock(mutex: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexTrylock(mutex: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexUnlock(mutex: MutPtr<PthreadMutexT>): CInt

// Mutex attributes
public expect fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, kind: CInt): CInt

public expect fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, kind: MutPtr<CInt>): CInt

// Condition variables
public expect fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt

public expect fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondWait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt

// Condition variable attributes
public expect fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt

public expect fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

// Thread-local storage
public expect fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, destructor: PthreadKeyCreateDestructorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid>

public expect fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt

// One-time initialization
public expect fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadOnceInitRoutineCallback): CInt

// GNU extensions
public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt

public expect fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt

public expect fun pthreadAttrGetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt

// POSIX standard
public expect fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, alignment: SizeT, size: SizeT): CInt
