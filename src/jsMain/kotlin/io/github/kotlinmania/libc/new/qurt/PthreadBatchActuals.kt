// port-lint: source Pthread.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun pthreadJoin(thread: UInt, retval: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun pthreadDetach(thread: UInt): Int =
    throw UnsupportedOperationException("pthreadDetach requires N-API addon")

public actual fun pthreadEqual(t1: UInt, t2: UInt): Int =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun pthreadAttrInit(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadAttrDestroy(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: UInt?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: UInt?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrSetdetachstate(attr: UInt?, detachstate: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires N-API addon")

public actual fun pthreadAttrGetdetachstate(attr: UInt?, detachstate: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate requires N-API addon")

public actual fun pthreadMutexInit(mutex: UInt?, attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexDestroy(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexLock(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexUnlock(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadMutexattrInit(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrSettype(attr: UInt?, kind: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadMutexattrGettype(attr: UInt?, kind: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGettype requires N-API addon")

public actual fun pthreadCondInit(cond: UInt?, attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondDestroy(cond: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondWait(cond: UInt?, mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadCondTimedwait(cond: UInt?, mutex: UInt?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadCondSignal(cond: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondBroadcast(cond: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondattrInit(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit requires N-API addon")

public actual fun pthreadCondattrDestroy(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: UInt?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadKeyDelete(key: Int): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadGetspecific(key: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun pthreadSetspecific(key: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadGetnameNp(thread: UInt, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadAttrSetaffinityNp(attr: UInt?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp requires N-API addon")

public actual fun pthreadAttrGetaffinityNp(attr: UInt?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp requires N-API addon")

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign requires N-API addon")

public actual fun pthreadCreate(thread: UInt?, attr: UInt?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")

public actual fun pthreadKeyCreate(key: Int?, destructor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate requires N-API addon")

public actual fun pthreadOnce(onceControl: Int?, initRoutine: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadOnce requires N-API addon")
