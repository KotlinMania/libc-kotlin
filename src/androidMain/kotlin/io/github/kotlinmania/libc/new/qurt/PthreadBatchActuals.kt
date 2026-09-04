// port-lint: source Pthread.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin not available on Android host — use androidNative target for FFI")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach not available on Android host — use androidNative target for FFI")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, detachstate: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, kind: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, kind: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGettype not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp not available on Android host — use androidNative target for FFI")

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign not available on Android host — use androidNative target for FFI")

