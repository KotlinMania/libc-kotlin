@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

private var _ffi_static_MACH_TASK_SELF: MachPortT = 0u
public actual var MACH_TASK_SELF: MachPortT
    get() = _ffi_static_MACH_TASK_SELF
    set(value) {
        _ffi_static_MACH_TASK_SELF = value
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = 0uL

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setgrent()
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_daemon(nochdir, noclose)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioWrite(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioFsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioReturn(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioSuspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioCancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun chflags(path: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fchflags(fd, flags)

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_lioListio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getutxent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_endutxent()
}

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_utmpxname(file)

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_asctime(tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctime(clock: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ctime(clock?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getdate(datestr: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getdate(datestr)?.let { COpaquePointer(it.toLong()) }

public actual fun strptime(buf: String?, format: String?, timeptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_strptime(buf, format, timeptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctimeR(tm: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_asctimeR(tm?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(clock: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ctimeR(clock?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sysctlnametomib(name, mibp?.value?.toCPointer<ByteVar>(), sizep?.value?.toCPointer<ByteVar>())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_semget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt): CInt =
    0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun shmOpen(name: String?, oflag: CInt): CInt =
    0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ftok(pathname, projId)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_shmget(key, size, shmflg)

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sysctlbyname(name, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun machAbsoluteTime(): ULong =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machAbsoluteTime()

public actual fun machTimebaseInfo(info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machTimebaseInfo(info?.value?.toCPointer<ByteVar>())

public actual fun machHostSelf(): MachPortT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machHostSelf()

public actual fun machThreadSelf(): MachPortT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machThreadSelf()

public actual fun pthreadCondTimedwaitRelativeNp(cond: COpaquePointer?, lock: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrGetscope(attr?.value?.toCPointer<ByteVar>(), contentionscope?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrGetstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrGetdetachstate(attr?.value?.toCPointer<ByteVar>(), detachstate?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrSetscope(attr?.value?.toCPointer<ByteVar>(), contentionscope)

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrSetstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadSetnameNp(name)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadMachThreadNp(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadFromMachThreadNp(port)?.toLong() ?: 0L

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadGetStackaddrNp(thread.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadGetStacksizeNp(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadMainNp(): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadMainNp()

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadThreadidNp(thread.toLong().toCPointer<ByteVar>(), threadId?.value?.toCPointer<ByteVar>())

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadJitWriteProtectNp(enabled)
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp()

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp(0L.toCPointer<ByteVar>(), ctx?.value?.toCPointer<ByteVar>())

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp()
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadCpuNumberNp(cpuNumberOut?.value?.toCPointer<ByteVar>())

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWaitOnAddress(addr?.value?.toCPointer<ByteVar>(), value, size, flags)

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline(addr?.value?.toCPointer<ByteVar>(), value, size, flags, clockid, deadline)

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout(addr?.value?.toCPointer<ByteVar>(), value, size, flags, clockid, timeoutNs)

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWakeByAddressAny(addr?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWakeByAddressAll(addr?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockLock(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockUnlock(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockAssertOwner(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockAssertNotOwner(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osLogCreate(subsystem: String?, category: String?): OsLogT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osLogCreate(subsystem, category)?.let { COpaquePointer(it.toLong()) }

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osLogTypeEnabled(oslog?.value?.toCPointer<ByteVar>(), tpe)

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: COpaquePointer?): OsSignpostIdT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSignpostIdMakeWithPointer(log?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSignpostIdGenerate(log?.value?.toCPointer<ByteVar>())

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSignpostEnabled(log?.value?.toCPointer<ByteVar>())

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_threadPolicySet(thread.toLong().toCPointer<ByteVar>(), flavor, policyInfo.toLong().toCPointer<ByteVar>(), count)

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: COpaquePointer?, getDefault: COpaquePointer?): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_threadPolicyGet(thread.toLong().toCPointer<ByteVar>(), flavor, policyInfo.toLong().toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>(), getDefault?.value?.toCPointer<ByteVar>())

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: COpaquePointer?): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_threadInfo(targetAct, flavor, threadInfoOut.toLong().toCPointer<ByteVar>(), threadInfoOutCnt?.value?.toCPointer<ByteVar>())

public actual fun error(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_error()?.let { COpaquePointer(it.toLong()) }

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtrace(buf?.value?.toCPointer<ByteVar>(), sz)

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceSymbols(addrs?.value?.toCPointer<ByteVar>(), sz)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceSymbolsFd(addrs?.value?.toCPointer<ByteVar>(), sz, fd)
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceFromFp(startfp?.value?.toCPointer<ByteVar>(), array?.value?.toCPointer<ByteVar>(), size)

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: COpaquePointer?, size: CInt) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceImageOffsets(array?.value?.toCPointer<ByteVar>(), imageOffsets?.value?.toCPointer<ByteVar>(), size)
}

public actual fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceAsync(array?.value?.toCPointer<ByteVar>(), length, taskId?.value?.toCPointer<ByteVar>())

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun kevent64(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, flags: CUint, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_kevent64(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mount(src, target, flags, data?.value?.toCPointer<ByteVar>())

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fmount(src, fd, flags, data?.value?.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ptrace(request, pid, addr?.value?.toCPointer<ByteVar>(), data)

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_quotactl(special, cmd, id, data?.value?.toCPointer<ByteVar>())

public actual fun sethostname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sethostname(name, len)

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: COpaquePointer?, hdtr: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sendfile(fd, s, offset, len?.value?.toCPointer<ByteVar>(), hdtr?.value?.toCPointer<ByteVar>(), flags)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_loginTty(fd)

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_duplocale(base.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun freelocale(loc: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_freelocale(loc.toLong().toCPointer<ByteVar>())

public actual fun localeconvL(loc: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_localeconvL(loc.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_newlocale(mask, locale, base.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_uselocale(loc.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_querylocale(mask, loc.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setpriority(which, who, prio)

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setdomainname(name, len)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_listxattr(path, list?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_removexattr(path, name, flags)

public actual fun renamexNp(from: String?, to: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_renamexNp(from, to, flags)

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_renameatxNp(fromfd, from, tofd, to, flags)

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fremovexattr(filedes, name, flags)

public actual fun getgrouplist(name: String?, basegid: CInt, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getgrouplist(name, basegid, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_initgroups(user, basegroup)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_brk(addr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sbrk(increment: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun dyldImageCount(): UInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dyldImageCount()

public actual fun dyldGetImageHeader(imageIndex: UInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dyldGetImageHeader(imageIndex)?.let { COpaquePointer(it.toLong()) }

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dyldGetImageVmaddrSlide(imageIndex)

public actual fun dyldGetImageName(imageIndex: UInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dyldGetImageName(imageIndex)?.let { COpaquePointer(it.toLong()) }

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetarchprefNp(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), subpref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetarchprefNp(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), subpref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetbinprefNp(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetbinprefNp(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun uname(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun connectx(socket: CInt, endpoints: COpaquePointer?, associd: SaeAssocidT, flags: CUint, iov: COpaquePointer?, iovcnt: CUint, len: COpaquePointer?, connid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_connectx(socket, endpoints?.value?.toCPointer<ByteVar>(), associd, flags, iov?.value?.toCPointer<ByteVar>(), iovcnt, len?.value?.toCPointer<ByteVar>(), connid?.value?.toCPointer<ByteVar>())

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_disconnectx(socket, associd, connid)

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ntpAdjtime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ntpGettime(buf?.value?.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun getfsstat(mntbufp: COpaquePointer?, bufsize: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getfsstat(mntbufp?.value?.toCPointer<ByteVar>(), bufsize, flags)

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clonefile(src, dst, flags)

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clonefileat(srcDirfd, src, dstDirfd, dst, flags)

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fclonefileat(srcfd, dstDirfd, dst, flags)

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfile(from, to, state?.value?.toCPointer<ByteVar>(), flags)

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fcopyfile(from, to, state?.value?.toCPointer<ByteVar>(), flags)

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfileStateFree(s?.value?.toCPointer<ByteVar>())

public actual fun copyfileStateAlloc(): CopyfileStateT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfileStateAlloc()?.let { COpaquePointer(it.toLong()) }

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfileStateGet(s?.value?.toCPointer<ByteVar>(), flags, dst?.value?.toCPointer<ByteVar>())

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfileStateSet(s?.value?.toCPointer<ByteVar>(), flags, src?.value?.toCPointer<ByteVar>())

public actual fun machErrorString(errorValue: MachErrorT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machErrorString(errorValue)?.let { COpaquePointer(it.toLong()) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memsetS(s?.value?.toCPointer<ByteVar>(), smax, c, n)

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memsetPattern4(b?.value?.toCPointer<ByteVar>(), pattern4?.value?.toCPointer<ByteVar>(), len)
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memsetPattern8(b?.value?.toCPointer<ByteVar>(), pattern8?.value?.toCPointer<ByteVar>(), len)
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memsetPattern16(b?.value?.toCPointer<ByteVar>(), pattern16?.value?.toCPointer<ByteVar>(), len)
}

public actual fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_strtonum(numstr, minval, maxval, errstrp?.value?.toCPointer<ByteVar>())

public actual fun mstats(): Mstats =
    null as Mstats

public actual fun mallocPrintf(format: String?) {
}

public actual fun mallocZoneCheck(zone: COpaquePointer?): BooleanT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneCheck(zone?.value?.toCPointer<ByteVar>())

public actual fun mallocZonePrint(zone: COpaquePointer?, verbose: BooleanT) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZonePrint(zone?.value?.toCPointer<ByteVar>(), verbose)
}

public actual fun mallocZoneStatistics(zone: COpaquePointer?, stats: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneStatistics(zone?.value?.toCPointer<ByteVar>(), stats?.value?.toCPointer<ByteVar>())
}

public actual fun mallocZoneLog(zone: COpaquePointer?, address: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneLog(zone?.value?.toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>())
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZonePrintPtrInfo(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun mallocDefaultZone(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocDefaultZone()?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneFromPtr(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneMalloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneMalloc(zone?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneValloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneValloc(zone?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneCalloc(zone: COpaquePointer?, numItems: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneCalloc(zone?.value?.toCPointer<ByteVar>(), numItems, size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneRealloc(zone: COpaquePointer?, ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneRealloc(zone?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneFree(zone: COpaquePointer?, ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneFree(zone?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procListpids(t, typeinfo, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procListallpids(buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procListpgrppids(pgrpid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procListchildpids(ppid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidinfo(pid, flavor, arg, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidfdinfo(pid, fd, flavor, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidfileportinfo(pid, fileport, flavor, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidpath(pid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procName(pid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procRegionfilename(pid, address, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procKmsgbuf(buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procLibversion(major: COpaquePointer?, minor: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procLibversion(major?.value?.toCPointer<ByteVar>(), minor?.value?.toCPointer<ByteVar>())

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidRusage(pid, flavor, buffer?.value?.toCPointer<ByteVar>())

public actual fun procSetNoSmt(): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procSetNoSmt()

public actual fun procSetthreadNoSmt(): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procSetthreadNoSmt()

public actual fun procSetCsm(flags: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procSetCsm(flags)

public actual fun procSetthreadCsm(flags: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procSetthreadCsm(flags)

public actual fun gethostuuid(id: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_gethostuuid(id?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_gethostid()

public actual fun sethostid(hostid: CLong) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sethostid(hostid)
}

public actual fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): CCRNGStatus =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_cCRandomGenerateBytes(bytes?.value?.toCPointer<ByteVar>(), size)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetExecutablePath(buf?.value?.toCPointer<ByteVar>(), bufsize?.value?.toCPointer<ByteVar>())

public actual fun nsgetArgv(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetArgv()?.let { COpaquePointer(it.toLong()) }

public actual fun nsgetArgc(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetArgc()?.let { COpaquePointer(it.toLong()) }

public actual fun nsgetEnviron(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetEnviron()?.let { COpaquePointer(it.toLong()) }

public actual fun nsgetProgname(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetProgname()?.let { COpaquePointer(it.toLong()) }

public actual fun machVmMap(targetTask: VmMapT, address: COpaquePointer?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machVmMap(targetTask.toLong().toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>(), size, mask, flags, obj, offset, copy, curProtection, maxProtection, inheritance)

public actual fun vmAllocate(targetTask: VmMapT, address: COpaquePointer?, size: VmSizeT, flags: CInt): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_vmAllocate(targetTask.toLong().toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_vmDeallocate(targetTask.toLong().toCPointer<ByteVar>(), address, size)

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: COpaquePointer?): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_hostStatistics64(hostPriv, flavor, hostInfo64Out.toLong().toCPointer<ByteVar>(), hostInfo64OutCnt?.value?.toCPointer<ByteVar>())

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: COpaquePointer?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: COpaquePointer?): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_hostProcessorInfo(host, flavor, outProcessorCount?.value?.toCPointer<ByteVar>(), outProcessorInfo?.value?.toCPointer<ByteVar>(), outProcessorInfoCnt?.value?.toCPointer<ByteVar>())

public actual fun taskForPid(host: MachPortT, pid: PidT, task: COpaquePointer?): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskForPid(host, pid, task?.value?.toCPointer<ByteVar>())

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: COpaquePointer?): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskInfo(host, flavor, taskInfoOut.toLong().toCPointer<ByteVar>(), taskInfoCount?.value?.toCPointer<ByteVar>())

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: COpaquePointer?): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskCreate(targetTask, ledgers.toLong().toCPointer<ByteVar>(), ledgersCnt, inheritMemory, childTask?.value?.toCPointer<ByteVar>())

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskTerminate(targetTask)

public actual fun taskThreads(targetTask: TaskInspectT, actList: COpaquePointer?, actListCnt: COpaquePointer?): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskThreads(targetTask, actList?.value?.toCPointer<ByteVar>(), actListCnt?.value?.toCPointer<ByteVar>())

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: COpaquePointer?): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_hostStatistics(hostPriv, flavor, hostInfoOut.toLong().toCPointer<ByteVar>(), hostInfoOutCnt?.value?.toCPointer<ByteVar>())

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    0u

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: COpaquePointer?): SysdirSearchPathEnumerationState =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration(state, path?.value?.toCPointer<ByteVar>())

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getattrlist(path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fgetattrlist(fd, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getattrlistat(fd, path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setattrlist(path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fsetattrlist(fd, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setattrlistat(dirFd, path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getattrlistbulk(dirfd, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun mallocSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun mallocGoodSize(size: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocGoodSize(size)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mknodat(dirfd, pathname, mode, dev)

public actual fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_freadlink(fd, buf?.value?.toCPointer<ByteVar>(), size)

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_execvP(file, searchPath, argv?.value?.toCPointer<ByteVar>())

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, arg?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clockSettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskSetInfo(targetTask, flavor, taskInfoIn.toLong().toCPointer<ByteVar>(), taskInfoInCnt)

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_iconvOpen(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_iconvClose(cd?.value?.toCPointer<ByteVar>())
