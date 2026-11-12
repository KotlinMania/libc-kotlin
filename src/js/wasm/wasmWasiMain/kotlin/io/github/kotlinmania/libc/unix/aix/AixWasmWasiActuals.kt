@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Aiocb
import io.github.kotlinmania.libc.unix.aix.powerpc64.MsqidDs
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadBarrierT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadMutexT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadOnceT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadRwlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadSpinlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SiginfoT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SigsetT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Stat
import io.github.kotlinmania.libc.unix.aix.powerpc64.Statfs
import io.github.kotlinmania.libc.unix.aix.powerpc64.UcontextT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Utmpx
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixThrKill")

public actual fun thrSelf(): ThreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixThrSelf")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAtfork")

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrGetdetachstate")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrGetguardsize")

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrGetinheritsched")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrGetschedparam")

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrGetstackaddr")

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrGetschedpolicy")

public actual fun pthreadAttrGetscope(attr: ConstPtr<PthreadAttrT>, contentionscope: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrGetscope")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrGetstack")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrSetguardsize")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrSetinheritsched")

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrSetschedparam")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrSetschedpolicy")

public actual fun pthreadAttrSetscope(attr: MutPtr<PthreadAttrT>, contentionscope: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrSetscope")

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrSetstack")

public actual fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadAttrSetstackaddr")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadBarrierattrDestroy")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, pshared: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadBarrierattrGetpshared")

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadBarrierattrInit")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadBarrierattrSetpshared")

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadBarrierDestroy")

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadBarrierInit")

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadBarrierWait")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadCancel")

public actual fun pthreadCleanupPop(execute: CInt): CVoid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadCleanupPop")

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: MutPtr<CVoid>): CVoid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadCleanupPush")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadCondattrGetclock")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadCondattrGetpshared")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadCondattrSetclock")

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadCondattrSetpshared")

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadCreate")

@kotlin.wasm.WasmImport("libc", "libcUnixAixPthreadGetconcurrency")
private external fun wasiLibcUnixAixPthreadGetconcurrency(): Int

public actual fun pthreadGetconcurrency(): CInt =
    wasiLibcUnixAixPthreadGetconcurrency().toInt()

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: MutPtr<ClockidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadGetcpuclockid")

public actual fun pthreadGetschedparam(thread: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadGetschedparam")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadKill")

public actual fun pthreadMutexattrGetprioceiling(attr: ConstPtr<PthreadMutexattrT>, prioceiling: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexattrGetprioceiling")

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexattrGetprotocol")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexattrGetpshared")

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexattrGetrobust")

public actual fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, type: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexattrGettype")

public actual fun pthreadMutexattrSetprioceiling(attr: MutPtr<PthreadMutexattrT>, prioceiling: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexattrSetprioceiling")

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexattrSetprotocol")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexattrSetpshared")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexattrSetrobust")

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexConsistent")

public actual fun pthreadMutexGetprioceiling(mutex: ConstPtr<PthreadMutexT>, prioceiling: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexGetprioceiling")

public actual fun pthreadMutexSetprioceiling(mutex: MutPtr<PthreadMutexT>, prioceiling: CInt, oldCeiling: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexSetprioceiling")

public actual fun pthreadMutexTimedlock(mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadMutexTimedlock")

public actual fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadOnce")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, pshared: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadRwlockattrGetpshared")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadRwlockattrSetpshared")

public actual fun pthreadRwlockTimedrdlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadRwlockTimedrdlock")

public actual fun pthreadRwlockTimedwrlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadRwlockTimedwrlock")

public actual fun pthreadSetcancelstate(state: CInt, oldstate: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSetcancelstate")

public actual fun pthreadSetcanceltype(type: CInt, oldtype: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSetcanceltype")

@kotlin.wasm.WasmImport("libc", "libcUnixAixPthreadSetconcurrency")
private external fun wasiLibcUnixAixPthreadSetconcurrency(newLevel: Int): Int

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    wasiLibcUnixAixPthreadSetconcurrency(newLevel).toInt()

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSetschedparam")

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSetschedprio")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSigmask")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSpinDestroy")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSpinInit")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSpinLock")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSpinTrylock")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadSpinUnlock")

public actual fun pthreadTestcancel(): CVoid =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPthreadTestcancel")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixIconv")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixIconvClose")

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixIconvOpen")

public actual fun acct(filename: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixAcct")

public actual fun aioCancel(fildes: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixAioCancel")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixAioError")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixAioFsync")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixAioRead")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixAioReturn")

public actual fun aioSuspend(list: ConstPtr<ConstPtr<Aiocb>>, nent: CInt, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixAioSuspend")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixAioWrite")

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixBasename")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixBind")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixBrk")

@kotlin.wasm.WasmImport("libc", "libcUnixAixClearenv")
private external fun wasiLibcUnixAixClearenv(): Int

public actual fun clearenv(): CInt =
    wasiLibcUnixAixClearenv().toInt()

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixClockGetcpuclockid")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixClockGetres")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixClockGettime")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixClockNanosleep")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixClockSettime")

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixCreat64")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixCtermid")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixDirfd")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixDirname")

@kotlin.wasm.WasmImport("libc", "libcUnixAixDrand48")
private external fun wasiLibcUnixAixDrand48(): Double

public actual fun drand48(): CDouble =
    wasiLibcUnixAixDrand48().toDouble()

public actual fun duplocale(arg1: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixDuplocale")

@kotlin.wasm.WasmImport("libc", "libcUnixAixEndgrent")
private external fun wasiLibcUnixAixEndgrent(): Unit

public actual fun endgrent(): Unit =
    wasiLibcUnixAixEndgrent()

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixEndmntent")

@kotlin.wasm.WasmImport("libc", "libcUnixAixEndpwent")
private external fun wasiLibcUnixAixEndpwent(): Unit

public actual fun endpwent(): Unit =
    wasiLibcUnixAixEndpwent()

@kotlin.wasm.WasmImport("libc", "libcUnixAixEndutent")
private external fun wasiLibcUnixAixEndutent(): Unit

public actual fun endutent(): Unit =
    wasiLibcUnixAixEndutent()

@kotlin.wasm.WasmImport("libc", "libcUnixAixEndutxent")
private external fun wasiLibcUnixAixEndutxent(): Unit

public actual fun endutxent(): Unit =
    wasiLibcUnixAixEndutxent()

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixErand48")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFaccessat")

public actual fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFattach")

@kotlin.wasm.WasmImport("libc", "libcUnixAixFdatasync")
private external fun wasiLibcUnixAixFdatasync(fd: Int): Int

public actual fun fdatasync(fd: CInt): CInt =
    wasiLibcUnixAixFdatasync(fd).toInt()

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFexecve")

@kotlin.wasm.WasmImport("libc", "libcUnixAixFfs")
private external fun wasiLibcUnixAixFfs(value: Int): Int

public actual fun ffs(value: CInt): CInt =
    wasiLibcUnixAixFfs(value).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixFfsl")
private external fun wasiLibcUnixAixFfsl(value: Long): Int

public actual fun ffsl(value: CLong): CInt =
    wasiLibcUnixAixFfsl(value).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixFfsll")
private external fun wasiLibcUnixAixFfsll(value: Long): Int

public actual fun ffsll(value: CLonglong): CInt =
    wasiLibcUnixAixFfsll(value).toInt()

public actual fun fgetgrent(file: MutPtr<FILE>): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFgetgrent")

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFgetpos64")

public actual fun fgetpwent(file: MutPtr<FILE>): MutPtr<Passwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFgetpwent")

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFopen64")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFreelocale")

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFreopen64")

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFseeko64")

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFsetpos64")

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFstat64")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFstatfs")

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFstatfs64")

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFstatvfs64")

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFtello64")

public actual fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFtok")

@kotlin.wasm.WasmImport("libc", "libcUnixAixFtruncate64")
private external fun wasiLibcUnixAixFtruncate64(fd: Int, length: Long): Int

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    wasiLibcUnixAixFtruncate64(fd, length).toInt()

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixFutimens")

public actual fun getcontext(ucp: MutPtr<UcontextT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetcontext")

public actual fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetdomainname")

@kotlin.wasm.WasmImport("libc", "libcUnixAixGetdtablesize")
private external fun wasiLibcUnixAixGetdtablesize(): Int

public actual fun getdtablesize(): CInt =
    wasiLibcUnixAixGetdtablesize().toInt()

public actual fun getgrent(): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetgrent")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetgrgid")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetgrgidR")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetgrnam")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetgrnamR")

public actual fun getgrset(user: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetgrset")

@kotlin.wasm.WasmImport("libc", "libcUnixAixGethostid")
private external fun wasiLibcUnixAixGethostid(): Long

public actual fun gethostid(): CLong =
    wasiLibcUnixAixGethostid().toLong()

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetmntent")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SizeT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetnameinfo")

@kotlin.wasm.WasmImport("libc", "libcUnixAixGetpagesize")
private external fun wasiLibcUnixAixGetpagesize(): Int

public actual fun getpagesize(): CInt =
    wasiLibcUnixAixGetpagesize().toInt()

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetpeereid")

@kotlin.wasm.WasmImport("libc", "libcUnixAixGetpriority")
private external fun wasiLibcUnixAixGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: CInt, who: IdT): CInt =
    wasiLibcUnixAixGetpriority(which, who.toInt()).toInt()

public actual fun getpwent(): MutPtr<Passwd> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetpwent")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetpwnamR")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetpwuidR")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetrlimit")

public actual fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetrlimit64")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGettimeofday")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetitimer")

public actual fun getutent(): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetutent")

public actual fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetutid")

public actual fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetutline")

public actual fun getutxent(): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetutxent")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetutxid")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGetutxline")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGlob")

public actual fun globfree(pglob: MutPtr<GlobT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixGlobfree")

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixHasmntopt")

@kotlin.wasm.WasmImport("libc", "libcUnixAixHcreate")
private external fun wasiLibcUnixAixHcreate(nelt: Long): Int

public actual fun hcreate(nelt: SizeT): CInt =
    wasiLibcUnixAixHcreate(nelt.toLong()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixHdestroy")
private external fun wasiLibcUnixAixHdestroy(): Unit

public actual fun hdestroy(): Unit =
    wasiLibcUnixAixHdestroy()

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixHsearch")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixIfFreenameindex")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixIfNameindex")

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixInitgroups")

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixIoctl")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixJrand48")

public actual fun lcong48(p: MutPtr<CUshort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixLcong48")

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixLfind")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nent: CInt, sevp: MutPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixLioListio")

public actual fun loadquery(flags: CInt, buf: MutPtr<CVoid>, buflen: CUint, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixLoadquery")

public actual fun lparGetInfo(command: CInt, buf: MutPtr<CVoid>, bufsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixLparGetInfo")

public actual fun lparSetResources(id: CInt, resource: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixLparSetResources")

@kotlin.wasm.WasmImport("libc", "libcUnixAixLrand48")
private external fun wasiLibcUnixAixLrand48(): Long

public actual fun lrand48(): CLong =
    wasiLibcUnixAixLrand48().toLong()

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixLsearch")

@kotlin.wasm.WasmImport("libc", "libcUnixAixLseek64")
private external fun wasiLibcUnixAixLseek64(fd: Int, offset: Long, whence: Int): Long

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    wasiLibcUnixAixLseek64(fd, offset, whence).toLong()

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixLstat64")

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMadvise")

public actual fun makecontext(ucp: MutPtr<UcontextT>, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMakecontext")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMallinfo")

@kotlin.wasm.WasmImport("libc", "libcUnixAixMallopt")
private external fun wasiLibcUnixAixMallopt(param: Int, value: Int): Int

public actual fun mallopt(param: CInt, value: CInt): CInt =
    wasiLibcUnixAixMallopt(param, value).toInt()

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMemmem")

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMemsetS")

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMincore")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMkfifoat")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMknodat")

public actual fun mount(device: ConstPtr<CChar>, path: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMount")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMprotect")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqClose")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqGetattr")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqNotify")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqOpen")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqReceive")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqSend")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqSetattr")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqTimedreceive")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqTimedsend")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMqUnlink")

@kotlin.wasm.WasmImport("libc", "libcUnixAixMrand48")
private external fun wasiLibcUnixAixMrand48(): Long

public actual fun mrand48(): CLong =
    wasiLibcUnixAixMrand48().toLong()

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMsgctl")

@kotlin.wasm.WasmImport("libc", "libcUnixAixMsgget")
private external fun wasiLibcUnixAixMsgget(key: Int, msgflg: Int): Int

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    wasiLibcUnixAixMsgget(key, msgflg).toInt()

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMsgrcv")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMsgsnd")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixMsync")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixNewlocale")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixNlLanginfo")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixNlLanginfoL")

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixNrand48")

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixOpen64")

@kotlin.wasm.WasmImport("libc", "libcUnixAixPollsetCreate")
private external fun wasiLibcUnixAixPollsetCreate(maxfd: Int): Int

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    wasiLibcUnixAixPollsetCreate(maxfd).toInt()

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: MutPtr<PollCtl>, arrayLength: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPollsetCtl")

@kotlin.wasm.WasmImport("libc", "libcUnixAixPollsetDestroy")
private external fun wasiLibcUnixAixPollsetDestroy(ps: Int): Int

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    wasiLibcUnixAixPollsetDestroy(ps).toInt()

public actual fun pollsetPoll(ps: PollsetT, polldataArray: MutPtr<Pollfd>, arrayLength: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPollsetPoll")

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: MutPtr<Pollfd>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPollsetQuery")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPopen")

@kotlin.wasm.WasmImport("libc", "libcUnixAixPosixFadvise")
private external fun wasiLibcUnixAixPosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    wasiLibcUnixAixPosixFadvise(fd, offset, len, advise).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixPosixFadvise64")
private external fun wasiLibcUnixAixPosixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    wasiLibcUnixAixPosixFadvise64(fd, offset, len, advise).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixPosixFallocate")
private external fun wasiLibcUnixAixPosixFallocate(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcUnixAixPosixFallocate(fd, offset, len).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixPosixFallocate64")
private external fun wasiLibcUnixAixPosixFallocate64(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    wasiLibcUnixAixPosixFallocate64(fd, offset, len).toInt()

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixMadvise")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawn")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnFileActionsAddclose")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnFileActionsAdddup2")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnFileActionsAddopen")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnFileActionsDestroy")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnFileActionsInit")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrDestroy")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrGetflags")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrGetpgroup")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrGetschedparam")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrGetschedpolicy")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrGetsigdefault")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrGetsigmask")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrInit")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrSetflags")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrSetpgroup")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrSetschedparam")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrSetschedpolicy")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrSetsigdefault")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnattrSetsigmask")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPosixSpawnp")

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPread64")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPreadv")

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPtrace64")

public actual fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPututline")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPututxline")

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPwrite64")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixPwritev")

public actual fun quotactl(cmd: MutPtr<CChar>, special: CInt, id: CInt, data: CaddrT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixQuotactl")

@kotlin.wasm.WasmImport("libc", "libcUnixAixRand")
private external fun wasiLibcUnixAixRand(): Int

public actual fun rand(): CInt =
    wasiLibcUnixAixRand().toInt()

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixReadv")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixRecvfrom")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixRecvmmsg")

public actual fun recvmsg(sockfd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixRecvmsg")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixRegcomp")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixRegerror")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixRegexec")

public actual fun regfree(preg: MutPtr<RegexT>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixRegfree")

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSbrk")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSchedGetparam")

@kotlin.wasm.WasmImport("libc", "libcUnixAixSchedGetscheduler")
private external fun wasiLibcUnixAixSchedGetscheduler(pid: Int): Int

public actual fun schedGetscheduler(pid: PidT): CInt =
    wasiLibcUnixAixSchedGetscheduler(pid).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixSchedGetPriorityMax")
private external fun wasiLibcUnixAixSchedGetPriorityMax(policy: Int): Int

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    wasiLibcUnixAixSchedGetPriorityMax(policy).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixSchedGetPriorityMin")
private external fun wasiLibcUnixAixSchedGetPriorityMin(policy: Int): Int

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    wasiLibcUnixAixSchedGetPriorityMin(policy).toInt()

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSchedRrGetInterval")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSchedSetparam")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSchedSetscheduler")

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: MutPtr<CVoid>, size: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSctpOptInfo")

public actual fun sctpPeeloff(s: CInt, id: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSctpPeeloff")

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSeed48")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSeekdir")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSemClose")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSemDestroy")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSemGetvalue")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSemInit")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSemOpen")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSemTimedwait")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSemUnlink")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSemctl")

@kotlin.wasm.WasmImport("libc", "libcUnixAixSemget")
private external fun wasiLibcUnixAixSemget(key: Int, nsems: Int, semflag: Int): Int

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    wasiLibcUnixAixSemget(key, nsems, semflag).toInt()

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSemop")

public actual fun sendFile(socket: MutPtr<CInt>, iobuf: MutPtr<SfParms>, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSendFile")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSendmmsg")

public actual fun sendmsg(sockfd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSendmsg")

public actual fun setcontext(ucp: ConstPtr<UcontextT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSetcontext")

public actual fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSetdomainname")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSetgroups")

@kotlin.wasm.WasmImport("libc", "libcUnixAixSetgrent")
private external fun wasiLibcUnixAixSetgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcUnixAixSetgrent()

@kotlin.wasm.WasmImport("libc", "libcUnixAixSethostid")
private external fun wasiLibcUnixAixSethostid(hostid: Int): Int

public actual fun sethostid(hostid: CInt): CInt =
    wasiLibcUnixAixSethostid(hostid).toInt()

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSethostname")

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSetmntent")

@kotlin.wasm.WasmImport("libc", "libcUnixAixSetpriority")
private external fun wasiLibcUnixAixSetpriority(which: Int, who: Int, priority: Int): Int

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    wasiLibcUnixAixSetpriority(which, who.toInt(), priority).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixSetpwent")
private external fun wasiLibcUnixAixSetpwent(): Unit

public actual fun setpwent(): Unit =
    wasiLibcUnixAixSetpwent()

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSetrlimit")

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSetrlimit64")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSettimeofday")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSetitimer")

@kotlin.wasm.WasmImport("libc", "libcUnixAixSetutent")
private external fun wasiLibcUnixAixSetutent(): Unit

public actual fun setutent(): Unit =
    wasiLibcUnixAixSetutent()

@kotlin.wasm.WasmImport("libc", "libcUnixAixSetutxent")
private external fun wasiLibcUnixAixSetutxent(): Unit

public actual fun setutxent(): Unit =
    wasiLibcUnixAixSetutxent()

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSigaltstack")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSigsuspend")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSigtimedwait")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSigwait")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSigwaitinfo")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixShmat")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixShmdt")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixShmctl")

@kotlin.wasm.WasmImport("libc", "libcUnixAixShmget")
private external fun wasiLibcUnixAixShmget(key: Int, size: Long, shmflg: Int): Int

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    wasiLibcUnixAixShmget(key, size.toLong(), shmflg).toInt()

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixShmOpen")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixShmUnlink")

@kotlin.wasm.WasmImport("libc", "libcUnixAixSplice")
private external fun wasiLibcUnixAixSplice(socket1: Int, socket2: Int, flags: Int): Int

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    wasiLibcUnixAixSplice(socket1, socket2, flags).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixAixSrand")
private external fun wasiLibcUnixAixSrand(seed: Int): Unit

public actual fun srand(seed: CUint): Unit =
    wasiLibcUnixAixSrand(seed.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixAixSrand48")
private external fun wasiLibcUnixAixSrand48(seed: Long): Unit

public actual fun srand48(seed: CLong): Unit =
    wasiLibcUnixAixSrand48(seed)

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStat64")

public actual fun stat64at(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStat64at")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStatfs")

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStatfs64")

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStatvfs64")

public actual fun statx(path: ConstPtr<CChar>, buf: MutPtr<Stat>, length: CInt, command: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStatx")

public actual fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStrcasecmpL")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStrerrorR")

public actual fun strftime(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: ConstPtr<Tm>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStrftime")

public actual fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStrncasecmpL")

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStrptime")

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixStrsep")

public actual fun swapcontext(uocp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSwapcontext")

public actual fun swapoff(path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSwapoff")

public actual fun swapon(path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixSwapon")

@kotlin.wasm.WasmImport("libc", "libcUnixAixSync")
private external fun wasiLibcUnixAixSync(): Unit

public actual fun sync(): Unit =
    wasiLibcUnixAixSync()

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixTelldir")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixTimerCreate")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixTimerDelete")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixTimerGetoverrun")

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixTimerGettime")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixTimerSettime")

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixTruncate64")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixUname")

public actual fun updwtmp(file: ConstPtr<CChar>, u: ConstPtr<Utmp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixUpdwtmp")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixUselocale")

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixUtmpname")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixUtimensat")

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixWait4")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixWaitid")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixWritev")

public actual fun errno(): MutPtr<CInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixAixErrno")
