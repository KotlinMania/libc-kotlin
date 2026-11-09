@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: FnCallback, arg: COpaquePointer?): CInt =
    0

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    0

public actual fun pthreadDetach(thread: PthreadT): CInt =
    0

public actual fun pthreadExit(retval: COpaquePointer?): Nothing =
    error("Unreachable noreturn C function pthreadExit")

public actual fun pthreadSelf(): PthreadT =
    0u

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    0

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    0

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, detachstate: CInt): CInt =
    0

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, kind: CInt): CInt =
    0

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, kind: COpaquePointer?): CInt =
    0

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    0

public actual fun pthreadKeyCreate(key: COpaquePointer?, destructor: FnCallback1?): CInt =
    0

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    0

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    null

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    0

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: FnCallback2): CInt =
    0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt =
    0
