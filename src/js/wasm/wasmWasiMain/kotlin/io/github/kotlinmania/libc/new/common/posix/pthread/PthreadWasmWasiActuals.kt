@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.sched.SchedParam
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadCondattrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexattrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadOnceT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadRwlockattrT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadBarrierT
import io.github.kotlinmania.libc.new.qurt.PthreadBarrierattrT
import io.github.kotlinmania.libc.new.qurt.PthreadSpinlockT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAtfork")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrGetguardsize")

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrGetinheritsched")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrGetschedparam")

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrGetschedpolicy")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrGetstack")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrSetguardsize")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrSetinheritsched")

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrSetschedparam")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrSetschedpolicy")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadAttrSetstack")

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadBarrierDestroy")

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadBarrierInit")

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadBarrierWait")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadBarrierattrDestroy")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadBarrierattrGetpshared")

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadBarrierattrInit")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadBarrierattrSetpshared")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadCancel")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadCondattrGetclock")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadCondattrGetpshared")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadCondattrSetclock")

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadCondattrSetpshared")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadCreate")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadGetcpuclockid")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadGetschedparam")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadKill")

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadMutexConsistent")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadMutexTimedlock")

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadMutexattrGetprotocol")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadMutexattrGetpshared")

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robustness: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadMutexattrGetrobust")

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadMutexattrSetprotocol")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadMutexattrSetpshared")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadMutexattrSetrobust")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadRwlockattrGetpshared")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadRwlockattrSetpshared")

public actual fun pthreadOnce(control: MutPtr<PthreadOnceT>, routine: PthreadAtforkPrepareCallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadOnce")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadSetschedparam")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadSetschedprio")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadSigmask")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadSpinDestroy")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadSpinInit")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadSpinLock")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadSpinTrylock")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewCommonPosixPthreadPthreadSpinUnlock")
