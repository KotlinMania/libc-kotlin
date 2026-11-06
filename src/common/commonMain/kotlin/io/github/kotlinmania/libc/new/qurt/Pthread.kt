// port-lint: source new/qurt/pthread.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.new.qurt.sys.CpuSetT

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
public fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt {
    val __slot_0 = if (thread == null) 0L else LibcDynamicFfi.allocScalarSlot(thread.toLong())
    val __slot_1 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(__slot_0, __slot_1, __scratch_2, arg?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_join", -1, longArrayOf(thread.toLong(), retval?.value ?: 0L)).toInt()
}

public fun pthreadDetach(thread: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_detach", -1, longArrayOf(thread.toLong())).toInt()
}

public fun pthreadExit(retval: COpaquePointer?): Nothing {
    LibcDynamicFfi.invoke("pthread_exit", -1, longArrayOf(retval?.value ?: 0L))
    error("unreachable")
}

public fun pthreadSelf(): PthreadT {
    return LibcDynamicFfi.invoke("pthread_self", -1, longArrayOf()).toUInt()
}

public fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_equal", -1, longArrayOf(t1.toLong(), t2.toLong())).toInt()
}

// Thread attributes
public fun pthreadAttrInit(attr: PthreadAttrT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_init", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: SizeT): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_setstacksize", -1, longArrayOf(__slot_0, stacksize.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: SizeT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __slot_1 = if (stacksize == null) 0L else LibcDynamicFfi.allocScalarSlot(stacksize.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getstacksize", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, detachstate: CInt): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_setdetachstate", -1, longArrayOf(__slot_0, detachstate.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __slot_1 = if (detachstate == null) 0L else LibcDynamicFfi.allocScalarSlot(detachstate.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getdetachstate", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// Mutex operations
public fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt {
    val __slot_0 = if (mutex == null) 0L else LibcDynamicFfi.allocScalarSlot(mutex.toLong())
    val __slot_1 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutex_init", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt {
    val __slot_0 = if (mutex == null) 0L else LibcDynamicFfi.allocScalarSlot(mutex.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutex_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadMutexLock(mutex: PthreadMutexT?): CInt {
    val __slot_0 = if (mutex == null) 0L else LibcDynamicFfi.allocScalarSlot(mutex.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutex_lock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt {
    val __slot_0 = if (mutex == null) 0L else LibcDynamicFfi.allocScalarSlot(mutex.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutex_trylock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt {
    val __slot_0 = if (mutex == null) 0L else LibcDynamicFfi.allocScalarSlot(mutex.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutex_unlock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// Mutex attributes
public fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutexattr_init", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutexattr_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, kind: CInt): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutexattr_settype", -1, longArrayOf(__slot_0, kind.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, kind: CInt?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __slot_1 = if (kind == null) 0L else LibcDynamicFfi.allocScalarSlot(kind.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutexattr_gettype", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// Condition variables
public fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt {
    val __slot_0 = if (cond == null) 0L else LibcDynamicFfi.allocScalarSlot(cond.toLong())
    val __slot_1 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_cond_init", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondDestroy(cond: PthreadCondT?): CInt {
    val __slot_0 = if (cond == null) 0L else LibcDynamicFfi.allocScalarSlot(cond.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_cond_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt {
    val __slot_0 = if (cond == null) 0L else LibcDynamicFfi.allocScalarSlot(cond.toLong())
    val __slot_1 = if (mutex == null) 0L else LibcDynamicFfi.allocScalarSlot(mutex.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_cond_wait", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt {
    val __slot_0 = if (cond == null) 0L else LibcDynamicFfi.allocScalarSlot(cond.toLong())
    val __slot_1 = if (mutex == null) 0L else LibcDynamicFfi.allocScalarSlot(mutex.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_cond_timedwait", -1, longArrayOf(__slot_0, __slot_1, abstime?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondSignal(cond: PthreadCondT?): CInt {
    val __slot_0 = if (cond == null) 0L else LibcDynamicFfi.allocScalarSlot(cond.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_cond_signal", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadCondBroadcast(cond: PthreadCondT?): CInt {
    val __slot_0 = if (cond == null) 0L else LibcDynamicFfi.allocScalarSlot(cond.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_cond_broadcast", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// Condition variable attributes
public fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_init", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(__slot_0, clockId.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// Thread-local storage
public fun pthreadKeyCreate(key: PthreadKeyT?, destructor: PthreadKeyCreateDestructorCallback?): CInt {
    val __slot_0 = if (key == null) 0L else LibcDynamicFfi.allocScalarSlot(key.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_key_create", -1, longArrayOf(__slot_0, destructor?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadKeyDelete(key: PthreadKeyT): CInt {
    return LibcDynamicFfi.invoke("pthread_key_delete", -1, longArrayOf(key.toLong())).toInt()
}

public fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("pthread_getspecific", -1, longArrayOf(key.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_setspecific", -1, longArrayOf(key.toLong(), value?.value ?: 0L)).toInt()
}

// One-time initialization
public fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: PthreadOnceInitRoutineCallback): CInt {
    val __slot_0 = if (onceControl == null) 0L else LibcDynamicFfi.allocScalarSlot(onceControl.toLong())
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_once", -1, longArrayOf(__slot_0, __scratch_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

// GNU extensions
public fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("pthread_getname_np", -1, longArrayOf(thread.toLong(), name?.value ?: 0L, len.toLong())).toInt()
}

public fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __slot_2 = if (cpuset == null) 0L else LibcDynamicFfi.allocScalarSlot(cpuset.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_setaffinity_np", -1, longArrayOf(__slot_0, cpusetsize.toLong(), __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __slot_2 = if (cpuset == null) 0L else LibcDynamicFfi.allocScalarSlot(cpuset.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getaffinity_np", -1, longArrayOf(__slot_0, cpusetsize.toLong(), __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

// POSIX standard
public fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt {
    return LibcDynamicFfi.invoke("posix_memalign", -1, longArrayOf(memptr?.value ?: 0L, alignment.toLong(), size.toLong())).toInt()
}
