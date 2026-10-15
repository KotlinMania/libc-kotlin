// port-lint: source Pthread.rs
package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.*

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetinheritsched not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierDestroy(barrier: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?, count: UInt): Int =
    throw UnsupportedOperationException("pthreadBarrierInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierWait(barrier: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierWait not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int): Int =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadCancel(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadCancel not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetcpuclockid(thread: ULong, clkId: Int?): Int =
    throw UnsupportedOperationException("pthreadGetcpuclockid not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadKill(thread: ULong, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexConsistent not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robustness: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robustness: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetschedprio(native: ULong, priority: Int): Int =
    throw UnsupportedOperationException("pthreadSetschedprio not available on Android host — use androidNative target for FFI")

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinDestroy(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinInit(lock: Int?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinLock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinTrylock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinUnlock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")

public actual fun pthreadOnce(control: Int?, routine: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadOnce not available on Android host — use androidNative target for FFI")
