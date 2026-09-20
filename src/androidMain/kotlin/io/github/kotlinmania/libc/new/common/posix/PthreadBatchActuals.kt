// port-lint: source Pthread.rs
package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.*

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetinheritsched(attr: PthreadAttrT, inheritsched: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetinheritsched not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetschedpolicy(attr: PthreadAttrT, policy: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT, policy: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT, attr: PthreadBarrierattrT, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT, shared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT, shared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexConsistent not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT, protocol: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT, robustness: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT, protocol: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT, robustness: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetschedprio not available on Android host — use androidNative target for FFI")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on Android host — use androidNative target for FFI")


public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")

public actual fun pthreadOnce(control: PthreadOnceT?, routine: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadOnce not available on Android host — use androidNative target for FFI")
