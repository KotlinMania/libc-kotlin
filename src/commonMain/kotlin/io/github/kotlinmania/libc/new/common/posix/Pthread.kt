// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import kotlinx.cinterop.COpaquePointer

/**
 * Header: `pthread.h`.
 *
 * See [pthread.h in the Open Group base specifications](https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/pthread.h.html).
 */

// Platforms: Android, Linux.
public expect fun pthreadAtfork(
    prepare: (() -> Unit)?,
    parent: (() -> Unit)?,
    child: (() -> Unit)?,
): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadAttrGetguardsize(
    attr: PthreadAttrT?,
    guardsize: ULong?,
): CInt

// Platforms: Android, l4re, Linux, Apple.
public expect fun pthreadAttrGetinheritsched(
    attr: PthreadAttrT?,
    inheritsched: CInt?,
): CInt

// Platforms: l4re, Linux, Apple.
public expect fun pthreadAttrGetschedparam(
    attr: PthreadAttrT?,
    param: SchedParam?,
): CInt

// Platforms: l4re, Linux, Apple.
public expect fun pthreadAttrGetschedpolicy(
    attr: PthreadAttrT?,
    policy: CInt?,
): CInt

// Platforms: Android, emscripten, Linux, l4re.
public expect fun pthreadAttrGetstack(
    attr: PthreadAttrT?,
    stackaddr: COpaquePointer?,
    stacksize: ULong?,
): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt

// Platforms: Android, l4re, Linux, Apple.
public expect fun pthreadAttrSetinheritsched(
    attr: PthreadAttrT?,
    inheritsched: CInt,
): CInt

// Platforms: l4re, Linux, Apple.
public expect fun pthreadAttrSetschedparam(
    attr: PthreadAttrT?,
    param: SchedParam?,
): CInt

// Platforms: l4re, Linux, Apple.
public expect fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt

// Platforms: Android, emscripten, Linux, l4re.
public expect fun pthreadAttrSetstack(
    attr: PthreadAttrT?,
    stackaddr: COpaquePointer?,
    stacksize: ULong,
): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadBarrierInit(
    barrier: PthreadBarrierT?,
    attr: PthreadBarrierattrT?,
    count: CUInt,
): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt

// Platforms: Android, Linux.
public expect fun pthreadBarrierattrGetpshared(
    attr: PthreadBarrierattrT?,
    shared: CInt?,
): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadBarrierattrSetpshared(
    attr: PthreadBarrierattrT?,
    shared: CInt,
): CInt

// Platforms: l4re, Linux (not ohos).
public expect fun pthreadCancel(thread: PthreadT): CInt

// Platforms: Android, emscripten, Linux.
public expect fun pthreadCondattrGetclock(
    attr: PthreadCondattrT?,
    clockId: ClockidT?,
): CInt

// Platforms: Android, l4re, Linux, Apple.
public expect fun pthreadCondattrGetpshared(
    attr: PthreadCondattrT?,
    pshared: CInt?,
): CInt

// Platforms: Android, emscripten, Linux.
public expect fun pthreadCondattrSetclock(
    attr: PthreadCondattrT?,
    clockId: ClockidT,
): CInt

// Platforms: Android, emscripten, Linux, l4re, Apple.
public expect fun pthreadCondattrSetpshared(
    attr: PthreadCondattrT?,
    pshared: CInt,
): CInt

// Platforms: Android, emscripten, l4re, Linux.
public expect fun pthreadCreate(
    native: PthreadT?,
    attr: PthreadAttrT?,
    f: (COpaquePointer?) -> COpaquePointer?,
    value: COpaquePointer?,
): CInt

// Platforms: Android, Linux.
public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt

// Platforms: Android, l4re, Linux, Apple.
public expect fun pthreadGetschedparam(
    native: PthreadT,
    policy: CInt?,
    param: SchedParam?,
): CInt

// In recent POSIX versions this is a signal.h function, not required in pthread.
// Platforms: Android, l4re, Linux.
public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

// Platforms: Linux (not ohos).
public expect fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadMutexTimedlock(
    lock: PthreadMutexT?,
    abstime: Timespec?,
): CInt

// Platforms: Linux.
public expect fun pthreadMutexattrGetprotocol(
    attr: PthreadMutexattrT?,
    protocol: CInt?,
): CInt

// Platforms: Android, l4re, Linux, Apple.
public expect fun pthreadMutexattrGetpshared(
    attr: PthreadMutexattrT?,
    pshared: CInt?,
): CInt

// Platforms: Linux (not ohos).
public expect fun pthreadMutexattrGetrobust(
    attr: PthreadMutexattrT?,
    robustness: CInt?,
): CInt

// Platforms: Linux.
public expect fun pthreadMutexattrSetprotocol(
    attr: PthreadMutexattrT?,
    protocol: CInt,
): CInt

// Platforms: Android, emscripten, Linux, l4re, Apple.
public expect fun pthreadMutexattrSetpshared(
    attr: PthreadMutexattrT?,
    pshared: CInt,
): CInt

// Platforms: Linux (not ohos).
public expect fun pthreadMutexattrSetrobust(
    attr: PthreadMutexattrT?,
    robustness: CInt,
): CInt

// Platforms: Android, emscripten, Linux, l4re, Apple.
public expect fun pthreadRwlockattrGetpshared(
    attr: PthreadRwlockattrT?,
    value: CInt?,
): CInt

// Platforms: Android, emscripten, Linux, l4re, Apple.
public expect fun pthreadRwlockattrSetpshared(
    attr: PthreadRwlockattrT?,
    value: CInt,
): CInt

// Platforms: l4re, Linux.
public expect fun pthreadOnce(control: PthreadOnceT?, routine: () -> Unit): CInt

// Platforms: Apple.
public expect fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: (() -> Unit)?): CInt

// Platforms: Android, l4re, Linux, Apple.
public expect fun pthreadSetschedparam(
    native: PthreadT,
    policy: CInt,
    param: SchedParam?,
): CInt

// Platforms: Linux.
public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

// In recent POSIX versions this is a signal.h function, not required in pthread.
// Platforms: Android, l4re, Linux.
public expect fun pthreadSigmask(
    how: CInt,
    set: SigsetT?,
    oldset: SigsetT?,
): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt

// Platforms: Android, l4re, Linux.
public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt
