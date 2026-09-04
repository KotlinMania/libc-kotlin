// port-lint: source Pthread.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach requires N-API addon")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, detachstate: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires N-API addon")

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate requires N-API addon")

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, kind: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, kind: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGettype requires N-API addon")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit requires N-API addon")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp requires N-API addon")

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp requires N-API addon")

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign requires N-API addon")

