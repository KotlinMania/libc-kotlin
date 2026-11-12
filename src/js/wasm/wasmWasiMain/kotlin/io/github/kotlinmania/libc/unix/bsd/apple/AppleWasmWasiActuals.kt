@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleGetMACHTASKSELF")
private external fun wasiLibcUnixBsdAppleGetMACHTASKSELF(): Int

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleSetMACHTASKSELF")
private external fun wasiLibcUnixBsdAppleSetMACHTASKSELF(value: Int): Unit

public actual var MACH_TASK_SELF: MachPortT
    get() = wasiLibcUnixBsdAppleGetMACHTASKSELF().toUInt()
    set(value) {
        wasiLibcUnixBsdAppleSetMACHTASKSELF(value.toInt())
    }

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleGetVMPAGESIZE")
private external fun wasiLibcUnixBsdAppleGetVMPAGESIZE(): Long

public actual val VM_PAGE_SIZE: VmSizeT
    get() = wasiLibcUnixBsdAppleGetVMPAGESIZE().toULong()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleSetgrent")
private external fun wasiLibcUnixBsdAppleSetgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcUnixBsdAppleSetgrent()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleDaemon")
private external fun wasiLibcUnixBsdAppleDaemon(nochdir: Int, noclose: Int): Int

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    wasiLibcUnixBsdAppleDaemon(nochdir, noclose)

public actual fun semDestroy(sem: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSemDestroy")

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSemInit")

public actual fun aioRead(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleAioRead")

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleAioWrite")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleAioFsync")

public actual fun aioError(aiocbp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleAioError")

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleAioReturn")

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleAioSuspend")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleAioCancel")

public actual fun chflags(path: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleChflags")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleFchflags")
private external fun wasiLibcUnixBsdAppleFchflags(fd: Int, flags: Int): Int

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    wasiLibcUnixBsdAppleFchflags(fd, flags.toInt())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleClockGetres")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleClockGettime")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleLioListio")

public actual fun dirfd(dirp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleDirfd")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleLutimes")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGettimeofday")

public actual fun getutxent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetutxent")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetutxid")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetutxline")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePututxline")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleSetutxent")
private external fun wasiLibcUnixBsdAppleSetutxent(): Unit

public actual fun setutxent(): Unit =
    wasiLibcUnixBsdAppleSetutxent()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleEndutxent")
private external fun wasiLibcUnixBsdAppleEndutxent(): Unit

public actual fun endutxent(): Unit =
    wasiLibcUnixBsdAppleEndutxent()

public actual fun utmpxname(file: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleUtmpxname")

public actual fun asctime(tm: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleAsctime")

public actual fun ctime(clock: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleCtime")

public actual fun getdate(datestr: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetdate")

public actual fun strptime(buf: ConstPtr, format: ConstPtr, timeptr: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleStrptime")

public actual fun asctimeR(tm: ConstPtr, result: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleAsctimeR")

public actual fun ctimeR(clock: ConstPtr, result: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleCtimeR")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetnameinfo")

public actual fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMincore")

public actual fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSysctlnametomib")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMprotect")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleSemget")
private external fun wasiLibcUnixBsdAppleSemget(key: Int, nsems: Int, semflg: Int): Int

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    wasiLibcUnixBsdAppleSemget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSemctl")

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSemop")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleShmOpen")

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFtok")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleShmat")

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleShmdt")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleShmctl")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleShmget")
private external fun wasiLibcUnixBsdAppleShmget(key: Int, size: Long, shmflg: Int): Int

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    wasiLibcUnixBsdAppleShmget(key, size.toLong(), shmflg)

public actual fun sysctl(name: MutPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSysctl")

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSysctlbyname")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleMachAbsoluteTime")
private external fun wasiLibcUnixBsdAppleMachAbsoluteTime(): Long

public actual fun machAbsoluteTime(): ULong =
    wasiLibcUnixBsdAppleMachAbsoluteTime().toULong()

public actual fun machTimebaseInfo(info: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMachTimebaseInfo")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleMachHostSelf")
private external fun wasiLibcUnixBsdAppleMachHostSelf(): Int

public actual fun machHostSelf(): MachPortT =
    wasiLibcUnixBsdAppleMachHostSelf().toUInt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleMachThreadSelf")
private external fun wasiLibcUnixBsdAppleMachThreadSelf(): Int

public actual fun machThreadSelf(): MachPortT =
    wasiLibcUnixBsdAppleMachThreadSelf().toUInt()

public actual fun pthreadCondTimedwaitRelativeNp(cond: MutPtr, lock: MutPtr, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadCondTimedwaitRelativeNp")

public actual fun pthreadAttrGetscope(attr: ConstPtr, contentionscope: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadAttrGetscope")

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr, stackaddr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadAttrGetstackaddr")

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr, detachstate: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadAttrGetdetachstate")

public actual fun pthreadAttrSetscope(attr: MutPtr, contentionscope: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadAttrSetscope")

public actual fun pthreadAttrSetstackaddr(attr: MutPtr, stackaddr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadAttrSetstackaddr")

public actual fun pthreadSetnameNp(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadSetnameNp")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadGetnameNp")

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadMachThreadNp")

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadFromMachThreadNp")

public actual fun pthreadGetStackaddrNp(thread: PthreadT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadGetStackaddrNp")

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadGetStacksizeNp")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdApplePthreadMainNp")
private external fun wasiLibcUnixBsdApplePthreadMainNp(): Int

public actual fun pthreadMainNp(): CInt =
    wasiLibcUnixBsdApplePthreadMainNp()

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadThreadidNp")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdApplePthreadJitWriteProtectNp")
private external fun wasiLibcUnixBsdApplePthreadJitWriteProtectNp(enabled: Int): Unit

public actual fun pthreadJitWriteProtectNp(enabled: CInt): Unit =
    wasiLibcUnixBsdApplePthreadJitWriteProtectNp(enabled)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdApplePthreadJitWriteProtectSupportedNp")
private external fun wasiLibcUnixBsdApplePthreadJitWriteProtectSupportedNp(): Int

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    wasiLibcUnixBsdApplePthreadJitWriteProtectSupportedNp()

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadJitWriteWithCallbackNp")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdApplePthreadJitWriteFreezeCallbacksNp")
private external fun wasiLibcUnixBsdApplePthreadJitWriteFreezeCallbacksNp(): Unit

public actual fun pthreadJitWriteFreezeCallbacksNp(): Unit =
    wasiLibcUnixBsdApplePthreadJitWriteFreezeCallbacksNp()

public actual fun pthreadCpuNumberNp(cpuNumberOut: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePthreadCpuNumberNp")

public actual fun osSyncWaitOnAddress(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsSyncWaitOnAddress")

public actual fun osSyncWaitOnAddressWithDeadline(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsSyncWaitOnAddressWithDeadline")

public actual fun osSyncWaitOnAddressWithTimeout(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsSyncWaitOnAddressWithTimeout")

public actual fun osSyncWakeByAddressAny(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsSyncWakeByAddressAny")

public actual fun osSyncWakeByAddressAll(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsSyncWakeByAddressAll")

public actual fun osUnfairLockLock(lock: OsUnfairLockT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsUnfairLockLock")

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsUnfairLockTrylock")

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsUnfairLockUnlock")

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsUnfairLockAssertOwner")

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsUnfairLockAssertNotOwner")

public actual fun osLogCreate(subsystem: ConstPtr, category: ConstPtr): OsLogT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsLogCreate")

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsLogTypeEnabled")

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: ConstPtr): OsSignpostIdT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsSignpostIdMakeWithPointer")

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsSignpostIdGenerate")

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOsSignpostEnabled")

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleThreadPolicySet")

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MutPtr, getDefault: MutPtr): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleThreadPolicyGet")

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MutPtr): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleThreadInfo")

public actual fun error(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleError")

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleBacktrace")

public actual fun backtraceSymbols(addrs: ConstPtr, sz: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleBacktraceSymbols")

public actual fun backtraceSymbolsFd(addrs: ConstPtr, sz: CInt, fd: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleBacktraceSymbolsFd")

public actual fun backtraceFromFp(startfp: MutPtr, array: MutPtr, size: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleBacktraceFromFp")

public actual fun backtraceImageOffsets(array: ConstPtr, imageOffsets: MutPtr, size: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleBacktraceImageOffsets")

public actual fun backtraceAsync(array: MutPtr, length: SizeT, taskId: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleBacktraceAsync")

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleStatfs")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFstatfs")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleKevent")

public actual fun kevent64(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, flags: CUint, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleKevent64")

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CInt, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMount")

public actual fun fmount(src: ConstPtr, fd: CInt, flags: CInt, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFmount")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePtrace")

public actual fun quotactl(special: ConstPtr, cmd: CInt, id: CInt, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleQuotactl")

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSethostname")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: MutPtr, hdtr: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSendfile")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFutimens")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleUtimensat")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleOpenpty")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleForkpty")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleLoginTty")
private external fun wasiLibcUnixBsdAppleLoginTty(fd: Int): Int

public actual fun loginTty(fd: CInt): CInt =
    wasiLibcUnixBsdAppleLoginTty(fd)

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleDuplocale")

public actual fun freelocale(loc: LocaleT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFreelocale")

public actual fun localeconvL(loc: LocaleT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleLocaleconvL")

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleNewlocale")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleUselocale")

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleQuerylocale")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleGetpriority")
private external fun wasiLibcUnixBsdAppleGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: CInt, who: IdT): CInt =
    wasiLibcUnixBsdAppleGetpriority(which, who.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleSetpriority")
private external fun wasiLibcUnixBsdAppleSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    wasiLibcUnixBsdAppleSetpriority(which, who.toInt(), prio)

public actual fun getdomainname(name: MutPtr, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetdomainname")

public actual fun setdomainname(name: ConstPtr, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSetdomainname")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePreadv")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePwritev")

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetxattr")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFgetxattr")

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSetxattr")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFsetxattr")

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleListxattr")

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFlistxattr")

public actual fun removexattr(path: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleRemovexattr")

public actual fun renamexNp(from: ConstPtr, to: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleRenamexNp")

public actual fun renameatxNp(fromfd: CInt, from: ConstPtr, tofd: CInt, to: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleRenameatxNp")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFremovexattr")

public actual fun getgrouplist(name: ConstPtr, basegid: CInt, groups: MutPtr, ngroups: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetgrouplist")

public actual fun initgroups(user: ConstPtr, basegroup: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleInitgroups")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleWaitid")

public actual fun brk(addr: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleBrk")

public actual fun sbrk(increment: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSbrk")

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSettimeofday")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleDyldImageCount")
private external fun wasiLibcUnixBsdAppleDyldImageCount(): Int

public actual fun dyldImageCount(): UInt =
    wasiLibcUnixBsdAppleDyldImageCount().toUInt()

public actual fun dyldGetImageHeader(imageIndex: UInt): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleDyldGetImageHeader")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleDyldGetImageVmaddrSlide")
private external fun wasiLibcUnixBsdAppleDyldGetImageVmaddrSlide(imageIndex: Int): Long

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    wasiLibcUnixBsdAppleDyldGetImageVmaddrSlide(imageIndex.toInt())

public actual fun dyldGetImageName(imageIndex: UInt): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleDyldGetImageName")

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawn")

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnp")

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrInit")

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrDestroy")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrGetsigdefault")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrSetsigdefault")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrGetsigmask")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrSetsigmask")

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrGetflags")

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrSetflags")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrGetpgroup")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrSetpgroup")

public actual fun posixSpawnattrSetarchprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrSetarchprefNp")

public actual fun posixSpawnattrGetarchprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrGetarchprefNp")

public actual fun posixSpawnattrGetbinprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrGetbinprefNp")

public actual fun posixSpawnattrSetbinprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnattrSetbinprefNp")

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnFileActionsInit")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnFileActionsDestroy")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnFileActionsAddopen")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnFileActionsAddclose")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdApplePosixSpawnFileActionsAdddup2")

public actual fun uname(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleUname")

public actual fun connectx(socket: CInt, endpoints: ConstPtr, associd: SaeAssocidT, flags: CUint, iov: ConstPtr, iovcnt: CUint, len: MutPtr, connid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleConnectx")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleDisconnectx")
private external fun wasiLibcUnixBsdAppleDisconnectx(socket: Int, associd: Int, connid: Int): Int

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    wasiLibcUnixBsdAppleDisconnectx(socket, associd.toInt(), connid.toInt())

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleNtpAdjtime")

public actual fun ntpGettime(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleNtpGettime")

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetmntinfo")

public actual fun getfsstat(mntbufp: MutPtr, bufsize: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetfsstat")

public actual fun clonefile(src: ConstPtr, dst: ConstPtr, flags: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleClonefile")

public actual fun clonefileat(srcDirfd: CInt, src: ConstPtr, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleClonefileat")

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFclonefileat")

public actual fun copyfile(from: ConstPtr, to: ConstPtr, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleCopyfile")

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFcopyfile")

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleCopyfileStateFree")

public actual fun copyfileStateAlloc(): CopyfileStateT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleCopyfileStateAlloc")

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleCopyfileStateGet")

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleCopyfileStateSet")

public actual fun machErrorString(errorValue: MachErrorT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMachErrorString")

public actual fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMemsetS")

public actual fun memsetPattern4(b: MutPtr, pattern4: ConstPtr, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMemsetPattern4")

public actual fun memsetPattern8(b: MutPtr, pattern8: ConstPtr, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMemsetPattern8")

public actual fun memsetPattern16(b: MutPtr, pattern16: ConstPtr, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMemsetPattern16")

public actual fun strtonum(numstr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstrp: MutPtr): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleStrtonum")

public actual fun mstats(): Mstats =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMstats")

public actual fun mallocPrintf(format: ConstPtr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocPrintf")

public actual fun mallocZoneCheck(zone: MutPtr): BooleanT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZoneCheck")

public actual fun mallocZonePrint(zone: MutPtr, verbose: BooleanT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZonePrint")

public actual fun mallocZoneStatistics(zone: MutPtr, stats: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZoneStatistics")

public actual fun mallocZoneLog(zone: MutPtr, address: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZoneLog")

public actual fun mallocZonePrintPtrInfo(ptr: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZonePrintPtrInfo")

public actual fun mallocDefaultZone(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocDefaultZone")

public actual fun mallocZoneFromPtr(ptr: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZoneFromPtr")

public actual fun mallocZoneMalloc(zone: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZoneMalloc")

public actual fun mallocZoneValloc(zone: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZoneValloc")

public actual fun mallocZoneCalloc(zone: MutPtr, numItems: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZoneCalloc")

public actual fun mallocZoneRealloc(zone: MutPtr, ptr: MutPtr, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZoneRealloc")

public actual fun mallocZoneFree(zone: MutPtr, ptr: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocZoneFree")

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: MutPtr, buffersize: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcListpids")

public actual fun procListallpids(buffer: MutPtr, buffersize: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcListallpids")

public actual fun procListpgrppids(pgrpid: PidT, buffer: MutPtr, buffersize: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcListpgrppids")

public actual fun procListchildpids(ppid: PidT, buffer: MutPtr, buffersize: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcListchildpids")

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: MutPtr, buffersize: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcPidinfo")

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcPidfdinfo")

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcPidfileportinfo")

public actual fun procPidpath(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcPidpath")

public actual fun procName(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcName")

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: MutPtr, buffersize: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcRegionfilename")

public actual fun procKmsgbuf(buffer: MutPtr, buffersize: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcKmsgbuf")

public actual fun procLibversion(major: MutPtr, minor: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcLibversion")

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleProcPidRusage")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleProcSetNoSmt")
private external fun wasiLibcUnixBsdAppleProcSetNoSmt(): Int

public actual fun procSetNoSmt(): CInt =
    wasiLibcUnixBsdAppleProcSetNoSmt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleProcSetthreadNoSmt")
private external fun wasiLibcUnixBsdAppleProcSetthreadNoSmt(): Int

public actual fun procSetthreadNoSmt(): CInt =
    wasiLibcUnixBsdAppleProcSetthreadNoSmt()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleProcSetCsm")
private external fun wasiLibcUnixBsdAppleProcSetCsm(flags: Int): Int

public actual fun procSetCsm(flags: UInt): CInt =
    wasiLibcUnixBsdAppleProcSetCsm(flags.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleProcSetthreadCsm")
private external fun wasiLibcUnixBsdAppleProcSetthreadCsm(flags: Int): Int

public actual fun procSetthreadCsm(flags: UInt): CInt =
    wasiLibcUnixBsdAppleProcSetthreadCsm(flags.toInt())

public actual fun gethostuuid(id: MutPtr, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGethostuuid")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleGethostid")
private external fun wasiLibcUnixBsdAppleGethostid(): Long

public actual fun gethostid(): CLong =
    wasiLibcUnixBsdAppleGethostid()

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleSethostid")
private external fun wasiLibcUnixBsdAppleSethostid(hostid: Long): Unit

public actual fun sethostid(hostid: CLong): Unit =
    wasiLibcUnixBsdAppleSethostid(hostid)

public actual fun cCRandomGenerateBytes(bytes: MutPtr, size: SizeT): CCRNGStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleCCRandomGenerateBytes")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetentropy")

public actual fun nsgetExecutablePath(buf: MutPtr, bufsize: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleNsgetExecutablePath")

public actual fun nsgetArgv(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleNsgetArgv")

public actual fun nsgetArgc(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleNsgetArgc")

public actual fun nsgetEnviron(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleNsgetEnviron")

public actual fun nsgetProgname(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleNsgetProgname")

public actual fun machVmMap(targetTask: VmMapT, address: MutPtr, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMachVmMap")

public actual fun vmAllocate(targetTask: VmMapT, address: MutPtr, size: VmSizeT, flags: CInt): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleVmAllocate")

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleVmDeallocate")

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MutPtr): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleHostStatistics64")

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: MutPtr, outProcessorInfo: MutPtr, outProcessorInfoCnt: MutPtr): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleHostProcessorInfo")

public actual fun taskForPid(host: MachPortT, pid: PidT, task: MutPtr): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleTaskForPid")

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MutPtr): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleTaskInfo")

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: MutPtr): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleTaskCreate")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleTaskTerminate")
private external fun wasiLibcUnixBsdAppleTaskTerminate(targetTask: Int): Int

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    wasiLibcUnixBsdAppleTaskTerminate(targetTask.toInt())

public actual fun taskThreads(targetTask: TaskInspectT, actList: MutPtr, actListCnt: MutPtr): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleTaskThreads")

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MutPtr): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleHostStatistics")

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSysdirStartSearchPathEnumeration")

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: MutPtr): SysdirSearchPathEnumerationState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSysdirGetNextSearchPathEnumeration")

public actual fun getattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetattrlist")

public actual fun fgetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFgetattrlist")

public actual fun getattrlistat(fd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: CUlong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetattrlistat")

public actual fun setattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSetattrlist")

public actual fun fsetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFsetattrlist")

public actual fun setattrlistat(dirFd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleSetattrlistat")

public actual fun getattrlistbulk(dirfd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleGetattrlistbulk")

public actual fun mallocSize(ptr: ConstPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMallocSize")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdAppleMallocGoodSize")
private external fun wasiLibcUnixBsdAppleMallocGoodSize(size: Long): Long

public actual fun mallocGoodSize(size: SizeT): SizeT =
    wasiLibcUnixBsdAppleMallocGoodSize(size.toLong()).toULong()

public actual fun dirname(path: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleDirname")

public actual fun basename(path: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleBasename")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMkfifoat")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMknodat")

public actual fun freadlink(fd: CInt, buf: MutPtr, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleFreadlink")

public actual fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleExecvP")

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleQsortR")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleClockSettime")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleMemmem")

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleTaskSetInfo")

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleIconvOpen")

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleIconv")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdAppleIconvClose")
