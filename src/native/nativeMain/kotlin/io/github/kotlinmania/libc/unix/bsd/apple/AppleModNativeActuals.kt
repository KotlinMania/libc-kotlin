@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun setgrent() {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_setgrent()
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_daemon(nochdir, noclose)

public actual fun semDestroy(sem: CInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: CInt?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_aio_read(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_aio_write(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_aio_fsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_aio_error(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_aio_return(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_aio_suspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_aio_cancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun chflags(path: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fchflags(fd, flags)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_lio_listio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_setutxent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_endutxent()
}

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_utmpxname(file)

public actual fun asctime(tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_asctime(tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctime(clock: CLong?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_ctime(clock?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getdate(datestr: String?): io.github.kotlinmania.libc.Tm? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getdate(datestr)?.let { COpaquePointer(it.toLong()) }

public actual fun strptime(buf: String?, format: String?, timeptr: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_strptime(buf, format, timeptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctimeR(tm: io.github.kotlinmania.libc.Tm?, result: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_asctime_r(tm?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(clock: CLong?, result: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_ctime_r(clock?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: SizeT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sysctlnametomib(name, mibp?.value?.toCPointer<ByteVar>(), sizep?.value?.toCPointer<ByteVar>())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_semget(key, nsems, semflg)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_ftok(pathname, projId)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_shmget(key, size, shmflg)

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sysctlbyname(name, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun machAbsoluteTime(): ULong =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mach_absolute_time()

public actual fun machTimebaseInfo(info: io.github.kotlinmania.libc.MachTimebaseInfo?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mach_timebase_info(info?.value?.toCPointer<ByteVar>())

public actual fun machHostSelf(): MachPortT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mach_host_self()

public actual fun machThreadSelf(): MachPortT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mach_thread_self()

public actual fun pthreadCondTimedwaitRelativeNp(cond: PthreadCondT?, lock: PthreadMutexT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_cond_timedwait_relative_np(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetscope(attr: PthreadAttrT?, contentionscope: CInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_attr_getscope(attr?.value?.toCPointer<ByteVar>(), contentionscope?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_attr_getstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_attr_getdetachstate(attr?.value?.toCPointer<ByteVar>(), detachstate?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetscope(attr: PthreadAttrT?, contentionscope: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_attr_setscope(attr?.value?.toCPointer<ByteVar>(), contentionscope)

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_attr_setstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(name: String?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_setname_np(name)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_getname_np(thread.toInt(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadMachThreadNp(thread: PthreadT): io.github.kotlinmania.libc.MachPortT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_mach_thread_np(thread.toInt())

public actual fun pthreadFromMachThreadNp(port: io.github.kotlinmania.libc.MachPortT): PthreadT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_from_mach_thread_np(port)

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_get_stackaddr_np(thread.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_get_stacksize_np(thread.toInt())

public actual fun pthreadMainNp(): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_main_np()

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: ULong?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_threadid_np(thread.toInt(), threadId?.value?.toCPointer<ByteVar>())

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_jit_write_protect_np(enabled)
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_jit_write_protect_supported_np()

public actual fun pthreadJitWriteWithCallbackNp(callback: io.github.kotlinmania.libc.PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_jit_write_with_callback_np(callback.toInt(), ctx?.value?.toCPointer<ByteVar>())

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_jit_write_freeze_callbacks_np()
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: SizeT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pthread_cpu_number_np(cpuNumberOut?.value?.toCPointer<ByteVar>())

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_sync_wait_on_address(addr?.value?.toCPointer<ByteVar>(), value, size, flags)

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_sync_wait_on_address_with_deadline(addr?.value?.toCPointer<ByteVar>(), value, size, flags, clockid, deadline)

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_sync_wait_on_address_with_timeout(addr?.value?.toCPointer<ByteVar>(), value, size, flags, clockid, timeoutNs)

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_sync_wake_by_address_any(addr?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_sync_wake_by_address_all(addr?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_unfair_lock_lock(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_unfair_lock_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_unfair_lock_unlock(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_unfair_lock_assert_owner(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_unfair_lock_assert_not_owner(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osLogCreate(subsystem: String?, category: String?): io.github.kotlinmania.libc.OsLogT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_log_create(subsystem, category)?.let { COpaquePointer(it.toLong()) }

public actual fun osLogTypeEnabled(oslog: io.github.kotlinmania.libc.OsLogT, tpe: io.github.kotlinmania.libc.OsLogTypeT): Boolean =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_log_type_enabled(oslog?.value?.toCPointer<ByteVar>(), tpe)

public actual fun osSignpostIdMakeWithPointer(log: io.github.kotlinmania.libc.OsLogT, ptr: COpaquePointer?): io.github.kotlinmania.libc.OsSignpostIdT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_signpost_id_make_with_pointer(log?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun osSignpostIdGenerate(log: io.github.kotlinmania.libc.OsLogT): io.github.kotlinmania.libc.OsSignpostIdT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_signpost_id_generate(log?.value?.toCPointer<ByteVar>())

public actual fun osSignpostEnabled(log: io.github.kotlinmania.libc.OsLogT): Boolean =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_os_signpost_enabled(log?.value?.toCPointer<ByteVar>())

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_thread_policy_set(thread, flavor, policyInfo?.value?.toCPointer<ByteVar>(), count)

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: UInt?, getDefault: BooleanT?): KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_thread_policy_get(thread, flavor, policyInfo?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>(), getDefault?.value?.toCPointer<ByteVar>())

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: UInt?): KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_thread_info(targetAct, flavor, threadInfoOut?.value?.toCPointer<ByteVar>(), threadInfoOutCnt?.value?.toCPointer<ByteVar>())

public actual fun error(): CInt? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_error()?.let { COpaquePointer(it.toLong()) }

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_backtrace(buf?.value?.toCPointer<ByteVar>(), sz)

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_backtrace_symbols(addrs?.value?.toCPointer<ByteVar>(), sz)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_backtrace_symbols_fd(addrs?.value?.toCPointer<ByteVar>(), sz, fd)
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_backtrace_from_fp(startfp?.value?.toCPointer<ByteVar>(), array?.value?.toCPointer<ByteVar>(), size)

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: CInt) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_backtrace_image_offsets(array?.value?.toCPointer<ByteVar>(), imageOffsets?.value?.toCPointer<ByteVar>(), size)
}

public actual fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: UInt?): SizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_backtrace_async(array?.value?.toCPointer<ByteVar>(), length, taskId?.value?.toCPointer<ByteVar>())

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun kevent64(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent64S?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent64S?, nevents: CInt, flags: CUint, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_kevent64(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mount(src, target, flags, data?.value?.toCPointer<ByteVar>())

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fmount(src, fd, flags, data?.value?.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_ptrace(request, pid, addr?.value?.toCPointer<ByteVar>(), data)

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_quotactl(special, cmd, id, data?.value?.toCPointer<ByteVar>())

public actual fun sethostname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sethostname(name, len)

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: OffT?, hdtr: io.github.kotlinmania.libc.SfHdtr?, flags: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sendfile(fd, s, offset, len?.value?.toCPointer<ByteVar>(), hdtr?.value?.toCPointer<ByteVar>(), flags)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_login_tty(fd)

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_duplocale(base.toInt())

public actual fun freelocale(loc: LocaleT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_freelocale(loc.toInt())

public actual fun localeconvL(loc: LocaleT): Lconv? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_localeconv_l(loc.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_newlocale(mask, locale, base.toInt())

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_uselocale(loc.toInt())

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_querylocale(mask, loc.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_setpriority(which, who, prio)

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_setdomainname(name, len)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_listxattr(path, list?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_removexattr(path, name, flags)

public actual fun renamexNp(from: String?, to: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_renamex_np(from, to, flags)

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_renameatx_np(fromfd, from, tofd, to, flags)

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fremovexattr(filedes, name, flags)

public actual fun getgrouplist(name: String?, basegid: CInt, groups: CInt?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getgrouplist(name, basegid, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_initgroups(user, basegroup)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_brk(addr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sbrk(increment: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun dyldImageCount(): UInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_dyld_image_count()

public actual fun dyldGetImageHeader(imageIndex: UInt): MachHeader? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_dyld_get_image_header(imageIndex)?.let { COpaquePointer(it.toLong()) }

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_dyld_get_image_vmaddr_slide(imageIndex)

public actual fun dyldGetImageName(imageIndex: UInt): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_dyld_get_image_name(imageIndex)?.let { COpaquePointer(it.toLong()) }

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: UInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: UInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: UInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: UInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, subpref: CInt?, ocount: SizeT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_setarchpref_np(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), subpref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, subpref: CInt?, ocount: SizeT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_getarchpref_np(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), subpref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, ocount: SizeT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_getbinpref_np(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, ocount: SizeT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawnattr_setbinpref_np(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawn_file_actions_init(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawn_file_actions_destroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawn_file_actions_addopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawn_file_actions_addclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_posix_spawn_file_actions_adddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun uname(buf: Utsname?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun connectx(socket: CInt, endpoints: SaEndpointsT?, associd: SaeAssocidT, flags: CUint, iov: Iovec?, iovcnt: CUint, len: SizeT?, connid: UInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_connectx(socket, endpoints?.value?.toCPointer<ByteVar>(), associd, flags, iov?.value?.toCPointer<ByteVar>(), iovcnt, len?.value?.toCPointer<ByteVar>(), connid?.value?.toCPointer<ByteVar>())

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_disconnectx(socket, associd, connid)

public actual fun ntpAdjtime(buf: Timex?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_ntp_adjtime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_ntp_gettime(buf?.value?.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun getfsstat(mntbufp: Statfs?, bufsize: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getfsstat(mntbufp?.value?.toCPointer<ByteVar>(), bufsize, flags)

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_clonefile(src, dst, flags)

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_clonefileat(srcDirfd, src, dstDirfd, dst, flags)

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fclonefileat(srcfd, dstDirfd, dst, flags)

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_copyfile(from, to, state?.value?.toCPointer<ByteVar>(), flags)

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fcopyfile(from, to, state?.value?.toCPointer<ByteVar>(), flags)

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_copyfile_state_free(s?.value?.toCPointer<ByteVar>())

public actual fun copyfileStateAlloc(): CopyfileStateT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_copyfile_state_alloc()?.let { COpaquePointer(it.toLong()) }

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_copyfile_state_get(s?.value?.toCPointer<ByteVar>(), flags, dst?.value?.toCPointer<ByteVar>())

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_copyfile_state_set(s?.value?.toCPointer<ByteVar>(), flags, src?.value?.toCPointer<ByteVar>())

public actual fun machErrorString(errorValue: io.github.kotlinmania.libc.MachErrorT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mach_error_string(errorValue)?.let { COpaquePointer(it.toLong()) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_memset_s(s?.value?.toCPointer<ByteVar>(), smax, c, n)

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_memset_pattern4(b?.value?.toCPointer<ByteVar>(), pattern4?.value?.toCPointer<ByteVar>(), len)
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_memset_pattern8(b?.value?.toCPointer<ByteVar>(), pattern8?.value?.toCPointer<ByteVar>(), len)
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_memset_pattern16(b?.value?.toCPointer<ByteVar>(), pattern16?.value?.toCPointer<ByteVar>(), len)
}

public actual fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_strtonum(numstr, minval, maxval, errstrp?.value?.toCPointer<ByteVar>())

public actual fun mstats(): Mstats =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mstats()

public actual fun mallocZoneCheck(zone: MallocZoneT?): BooleanT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_check(zone?.value?.toCPointer<ByteVar>())

public actual fun mallocZonePrint(zone: MallocZoneT?, verbose: BooleanT) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_print(zone?.value?.toCPointer<ByteVar>(), verbose.toInt())
}

public actual fun mallocZoneStatistics(zone: MallocZoneT?, stats: MallocStatisticsT?) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_statistics(zone?.value?.toCPointer<ByteVar>(), stats?.value?.toCPointer<ByteVar>())
}

public actual fun mallocZoneLog(zone: MallocZoneT?, address: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_log(zone?.value?.toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>())
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_print_ptr_info(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun mallocDefaultZone(): MallocZoneT? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_default_zone()?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): MallocZoneT? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_from_ptr(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneMalloc(zone: MallocZoneT?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_malloc(zone?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneValloc(zone: MallocZoneT?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_valloc(zone?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneCalloc(zone: MallocZoneT?, numItems: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_calloc(zone?.value?.toCPointer<ByteVar>(), numItems, size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneRealloc(zone: MallocZoneT?, ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_realloc(zone?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneFree(zone: MallocZoneT?, ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_zone_free(zone?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_listpids(t, typeinfo, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_listallpids(buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_listpgrppids(pgrpid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_listchildpids(ppid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_pidinfo(pid, flavor, arg, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_pidfdinfo(pid, fd, flavor, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_pidfileportinfo(pid, fileport, flavor, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_pidpath(pid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_name(pid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_regionfilename(pid, address, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_kmsgbuf(buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procLibversion(major: CInt?, minor: CInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_libversion(major?.value?.toCPointer<ByteVar>(), minor?.value?.toCPointer<ByteVar>())

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_pid_rusage(pid, flavor, buffer?.value?.toCPointer<ByteVar>())

public actual fun procSetNoSmt(): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_set_no_smt()

public actual fun procSetthreadNoSmt(): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_setthread_no_smt()

public actual fun procSetCsm(flags: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_set_csm(flags)

public actual fun procSetthreadCsm(flags: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_proc_setthread_csm(flags)

public actual fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_gethostuuid(id?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_gethostid()

public actual fun sethostid(hostid: CLong) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sethostid(hostid)
}

public actual fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): io.github.kotlinmania.libc.CCRNGStatus =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_c_crandom_generate_bytes(bytes?.value?.toCPointer<ByteVar>(), size)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: UInt?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_nsget_executable_path(buf?.value?.toCPointer<ByteVar>(), bufsize?.value?.toCPointer<ByteVar>())

public actual fun nsgetArgv(): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_nsget_argv()?.let { COpaquePointer(it.toLong()) }

public actual fun nsgetArgc(): CInt? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_nsget_argc()?.let { COpaquePointer(it.toLong()) }

public actual fun nsgetEnviron(): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_nsget_environ()?.let { COpaquePointer(it.toLong()) }

public actual fun nsgetProgname(): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_nsget_progname()?.let { COpaquePointer(it.toLong()) }

public actual fun machVmMap(targetTask: io.github.kotlinmania.libc.VmMapT, address: ULong?, size: io.github.kotlinmania.libc.MachVmSizeT, mask: io.github.kotlinmania.libc.MachVmOffsetT, flags: CInt, obj: io.github.kotlinmania.libc.MemEntryNamePortT, offset: io.github.kotlinmania.libc.MemoryObjectOffsetT, copy: BooleanT, curProtection: io.github.kotlinmania.libc.VmProtT, maxProtection: io.github.kotlinmania.libc.VmProtT, inheritance: io.github.kotlinmania.libc.VmInheritT): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mach_vm_map(targetTask, address?.value?.toCPointer<ByteVar>(), size, mask, flags, obj, offset, copy.toInt(), curProtection, maxProtection, inheritance)

public actual fun vmAllocate(targetTask: VmMapT, address: UintptrT?, size: VmSizeT, flags: CInt): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_vm_allocate(targetTask, address?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_vm_deallocate(targetTask, address, size)

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_host_statistics64(hostPriv, flavor, hostInfo64Out?.value?.toCPointer<ByteVar>(), hostInfo64OutCnt?.value?.toCPointer<ByteVar>())

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: UInt?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_host_processor_info(host, flavor, outProcessorCount?.value?.toCPointer<ByteVar>(), outProcessorInfo?.value?.toCPointer<ByteVar>(), outProcessorInfoCnt?.value?.toCPointer<ByteVar>())

public actual fun taskForPid(host: io.github.kotlinmania.libc.MachPortT, pid: PidT, task: CUint?): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_task_for_pid(host, pid, task?.value?.toCPointer<ByteVar>())

public actual fun taskInfo(host: io.github.kotlinmania.libc.MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: UInt?): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_task_info(host, flavor, taskInfoOut?.value?.toCPointer<ByteVar>(), taskInfoCount?.value?.toCPointer<ByteVar>())

public actual fun taskCreate(targetTask: io.github.kotlinmania.libc.TaskT, ledgers: io.github.kotlinmania.libc.LedgerArrayT, ledgersCnt: io.github.kotlinmania.libc.MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: CUint?): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_task_create(targetTask, ledgers?.value?.toCPointer<ByteVar>(), ledgersCnt, inheritMemory.toInt(), childTask?.value?.toCPointer<ByteVar>())

public actual fun taskTerminate(targetTask: io.github.kotlinmania.libc.TaskT): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_task_terminate(targetTask)

public actual fun taskThreads(targetTask: io.github.kotlinmania.libc.TaskInspectT, actList: COpaquePointer?, actListCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_task_threads(targetTask, actList?.value?.toCPointer<ByteVar>(), actListCnt?.value?.toCPointer<ByteVar>())

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_host_statistics(hostPriv, flavor, hostInfoOut?.value?.toCPointer<ByteVar>(), hostInfoOutCnt?.value?.toCPointer<ByteVar>())

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): io.github.kotlinmania.libc.SysdirSearchPathEnumerationState =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sysdir_start_search_path_enumeration(dir.toInt(), domainMask.toInt())

public actual fun sysdirGetNextSearchPathEnumeration(state: io.github.kotlinmania.libc.SysdirSearchPathEnumerationState, path: COpaquePointer?): io.github.kotlinmania.libc.SysdirSearchPathEnumerationState =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_sysdir_get_next_search_path_enumeration(state, path?.value?.toCPointer<ByteVar>())

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getattrlist(path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fgetattrlist(fd, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getattrlistat(fd, path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_setattrlist(path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_fsetattrlist(fd, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_setattrlistat(dirFd, path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_getattrlistbulk(dirfd, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun mallocSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_size(ptr?.value?.toCPointer<ByteVar>())

public actual fun mallocGoodSize(size: SizeT): SizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_malloc_good_size(size)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_mknodat(dirfd, pathname, mode, dev)

public actual fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_freadlink(fd, buf?.value?.toCPointer<ByteVar>(), size)

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_execv_p(file, searchPath, argv?.value?.toCPointer<ByteVar>())

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_qsort_r(base?.value?.toCPointer<ByteVar>(), num, size, arg?.value?.toCPointer<ByteVar>(), compar?.value?.toCPointer<ByteVar>())
}

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_clock_settime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun taskSetInfo(targetTask: io.github.kotlinmania.libc.TaskT, flavor: io.github.kotlinmania.libc.TaskFlavorT, taskInfoIn: io.github.kotlinmania.libc.TaskInfoT, taskInfoInCnt: io.github.kotlinmania.libc.MachMsgTypeNumberT): io.github.kotlinmania.libc.KernReturnT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_task_set_info(targetTask, flavor, taskInfoIn?.value?.toCPointer<ByteVar>(), taskInfoInCnt)

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_iconv_open(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_apple_mod_iconv_close(cd?.value?.toCPointer<ByteVar>())
