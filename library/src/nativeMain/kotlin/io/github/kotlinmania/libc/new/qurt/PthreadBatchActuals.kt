// port-lint: source Pthread.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun pthreadJoin(thread: UInt, retval: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun pthreadDetach(thread: UInt): Int =
    throw UnsupportedOperationException("pthreadDetach requires manual FFI bridge — not yet implemented")

public actual fun pthreadEqual(t1: UInt, t2: UInt): Int =
    throw UnsupportedOperationException("pthreadEqual requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: UInt?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: UInt?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetdetachstate(attr: UInt?, detachstate: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetdetachstate(attr: UInt?, detachstate: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexInit(mutex: UInt?, attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrInit(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(attr: UInt?, kind: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrGettype(attr: UInt?, kind: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: UInt?, attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: UInt?, mutex: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwait(cond: UInt?, mutex: UInt?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrInit(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrDestroy(attr: UInt?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: UInt?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyDelete(key: Int): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetspecific(key: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(thread: UInt, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetaffinityNp(attr: UInt?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetaffinityNp(attr: UInt?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: ULong, size: ULong): Int =
    throw UnsupportedOperationException("posixMemalign requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(thread: UInt?, attr: UInt?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyCreate(key: Int?, destructor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate requires manual FFI bridge — not yet implemented")

public actual fun pthreadOnce(onceControl: Int?, initRoutine: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadOnce requires manual FFI bridge — not yet implemented")
