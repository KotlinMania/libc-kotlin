// port-lint: source Pthread.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun pthreadJoin(thread: UInt, retval: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin not available on JVM — no C library access")

public actual fun pthreadDetach(thread: UInt): Int =
    throw UnsupportedOperationException("pthreadDetach not available on JVM — no C library access")

public actual fun pthreadEqual(t1: UInt, t2: UInt): Int =
    throw UnsupportedOperationException("pthreadEqual not available on JVM — no C library access")

public actual fun pthreadAttrInit(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadAttrInit not available on JVM — no C library access")

public actual fun pthreadAttrDestroy(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on JVM — no C library access")

public actual fun pthreadAttrSetstacksize(attr: UInt?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrGetstacksize(attr: UInt?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrSetdetachstate(attr: UInt?, detachstate: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate not available on JVM — no C library access")

public actual fun pthreadAttrGetdetachstate(attr: UInt?, detachstate: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate not available on JVM — no C library access")

public actual fun pthreadMutexInit(mutex: UInt?, attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexInit not available on JVM — no C library access")

public actual fun pthreadMutexDestroy(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on JVM — no C library access")

public actual fun pthreadMutexLock(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexLock not available on JVM — no C library access")

public actual fun pthreadMutexTrylock(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on JVM — no C library access")

public actual fun pthreadMutexUnlock(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on JVM — no C library access")

public actual fun pthreadMutexattrInit(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on JVM — no C library access")

public actual fun pthreadMutexattrDestroy(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on JVM — no C library access")

public actual fun pthreadMutexattrSettype(attr: UInt?, kind: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on JVM — no C library access")

public actual fun pthreadMutexattrGettype(attr: UInt?, kind: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGettype not available on JVM — no C library access")

public actual fun pthreadCondInit(cond: UInt?, attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondInit not available on JVM — no C library access")

public actual fun pthreadCondDestroy(cond: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy not available on JVM — no C library access")

public actual fun pthreadCondWait(cond: UInt?, mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondWait not available on JVM — no C library access")

public actual fun pthreadCondTimedwait(cond: UInt?, mutex: UInt?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on JVM — no C library access")

public actual fun pthreadCondSignal(cond: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondSignal not available on JVM — no C library access")

public actual fun pthreadCondBroadcast(cond: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on JVM — no C library access")

public actual fun pthreadCondattrInit(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit not available on JVM — no C library access")

public actual fun pthreadCondattrDestroy(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy not available on JVM — no C library access")

public actual fun pthreadCondattrSetclock(attr: UInt?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on JVM — no C library access")

public actual fun pthreadKeyDelete(key: Int): Int =
    throw UnsupportedOperationException("pthreadKeyDelete not available on JVM — no C library access")

public actual fun pthreadGetspecific(key: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on JVM — no C library access")

public actual fun pthreadSetspecific(key: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific not available on JVM — no C library access")

public actual fun pthreadGetnameNp(thread: UInt, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadAttrSetaffinityNp(attr: UInt?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp not available on JVM — no C library access")

public actual fun pthreadAttrGetaffinityNp(attr: UInt?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp not available on JVM — no C library access")

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign not available on JVM — no C library access")

public actual fun pthreadCreate(thread: UInt?, attr: UInt?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on JVM — no C library access")

public actual fun pthreadKeyCreate(key: Int?, destructor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate not available on JVM — no C library access")

public actual fun pthreadOnce(onceControl: Int?, initRoutine: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadOnce not available on JVM — no C library access")
