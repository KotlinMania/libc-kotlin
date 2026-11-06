@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): CInt? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_errno_location()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun setutxdb(type: CUint, file: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_setutxdb(type, file?.value?.toCPointer<ByteVar>())

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_aio_waitcomplete(iocbp?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun devnameR(dev: io.github.kotlinmania.libc.DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_devname_r(dev, mode, buf?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_freelocale(loc.toInt())
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_lwp_rtprio(function, pid, lwpid, rtp?.value?.toCPointer<ByteVar>())

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun uname(buf: Utsname?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSpinInit(lock: UintptrT?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: UintptrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: UintptrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: UintptrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: UintptrT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpumaskT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_sched_getaffinity(pid, cpusetsize, mask?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpumaskT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_sched_setaffinity(pid, cpusetsize, mask?.value?.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_sched_getcpu()

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun procctl(idtype: io.github.kotlinmania.libc.IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_procctl(idtype, id, cmd, data?.value?.toCPointer<ByteVar>())

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_updwtmpx(file, ut?.value?.toCPointer<ByteVar>())

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_getlastlogx(fname, uid, ll?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_updlastlogx(fname, uid, ll?.value?.toCPointer<ByteVar>())

public actual fun getutxuser(name: String?): Utmpx =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_getutxuser(name)

public actual fun utmpxname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_utmpxname(file)

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_sys_checkpoint(tpe, fd, pid, retval)

public actual fun umtxSleep(ptr: CInt?, value: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_umtx_sleep(ptr?.value?.toCPointer<ByteVar>(), value, timeout)

public actual fun umtxWakeup(ptr: CInt?, count: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_umtx_wakeup(ptr?.value?.toCPointer<ByteVar>(), count)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_getmntvinfo(mntbufp?.value?.toCPointer<ByteVar>(), mntvbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun closefrom(lowfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_closefrom(lowfd)

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_aio_cancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_aio_error(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_aio_fsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_aio_read(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_aio_return(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_aio_suspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_aio_write(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_lio_listio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_reallocf(ptr?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_freezero(ptr?.value?.toCPointer<ByteVar>(), size)
}

public actual fun kvmVmMapEntryFirst(kvm: KvmT?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_kvm_vm_map_entry_first(kvm?.value?.toCPointer<ByteVar>(), map?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmVmMapEntryNext(kvm: KvmT?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_dragonfly_mod_kvm_vm_map_entry_next(kvm?.value?.toCPointer<ByteVar>(), map?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }
