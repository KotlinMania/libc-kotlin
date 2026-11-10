@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

private val _newQurtPthreadNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCreate((thread?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (arg?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadJoin(thread.toLong().toString(), (retval?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadDetach(thread.toLong().toString()) as Int) else 0

public actual fun pthreadExit(retval: COpaquePointer?): Nothing {
    if (_newQurtPthreadNapiAddon != null) {
        _newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadExit((retval?.value ?: 0L).toString())
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadSelf(): PthreadT =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadSelf() as String).toLong().toUInt() else 0u

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadEqual(t1.toLong().toString(), t2.toLong().toString()) as Int) else 0

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stacksize.toString()) as Int) else 0

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, detachstate: CInt): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), detachstate) as Int) else 0

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrGetdetachstate((attr?.value ?: 0L).toString(), (detachstate?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexInit((mutex?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexDestroy((mutex?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexLock((mutex?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexTrylock((mutex?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexUnlock((mutex?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, kind: CInt): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), kind) as Int) else 0

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, kind: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadMutexattrGettype((attr?.value ?: 0L).toString(), (kind?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondDestroy((cond?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondWait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondSignal((cond?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondBroadcast((cond?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else 0

public actual fun pthreadKeyCreate(key: COpaquePointer?, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) as Int) else 0

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadKeyDelete(key) as Int) else 0

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadGetspecific(key) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadSetspecific(key, (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadOnce((onceControl?.value ?: 0L).toString(), 0L.toString()) as Int) else 0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrSetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_pthreadAttrGetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt =
    if (_newQurtPthreadNapiAddon != null) (_newQurtPthreadNapiAddon.libc_new_qurt_pthread_posixMemalign((memptr?.value ?: 0L).toString(), alignment.toString(), size.toString()) as Int) else 0
