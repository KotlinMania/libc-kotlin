@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_aioCancel
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_aioError
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_aioFsync
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_aioRead
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_aioReturn
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_aioSuspend
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_aioWaitcomplete
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_aioWrite
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_basename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_closefrom
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_devnameR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_dirname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_errnoLocation
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_freelocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_freezero
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_fstatfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_getlastlogx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_getmntinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_getmntvinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryFirst
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryNext
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_lioListio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_lwpRtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_memmem
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_mprotect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_procctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinDestroy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinInit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinLock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinTrylock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinUnlock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_reallocf
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_schedGetaffinity
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_schedGetcpu
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_schedSetaffinity
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_setgrent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_setproctitle
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_setutxdb
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_shmat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_shmctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_shmdt
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_shmget
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_statfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_sysCheckpoint
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_umtxSleep
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_umtxWakeup
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_uname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_updlastlogx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_updwtmpx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_utmpxname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libc_unix_bsd_freebsdlike_dragonfly_waitid
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): COpaquePointer? =
    libc_unix_bsd_freebsdlike_dragonfly_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    libc_unix_bsd_freebsdlike_dragonfly_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun setutxdb(type: CUint, file: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_setutxdb(type, file?.value?.toCPointer<ByteVar>())

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_aioWaitcomplete(iocbp?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer? =
    libc_unix_bsd_freebsdlike_dragonfly_devnameR(dev, mode, buf?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun freelocale(loc: LocaleT) {
    libc_unix_bsd_freebsdlike_dragonfly_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_lwpRtprio(function, pid, lwpid, rtp?.value?.toCPointer<ByteVar>())

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun uname(buf: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    libc_unix_bsd_freebsdlike_dragonfly_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_schedGetaffinity(pid, cpusetsize, mask?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_schedSetaffinity(pid, cpusetsize, mask?.value?.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_schedGetcpu()

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
    libc_unix_bsd_freebsdlike_dragonfly_setproctitle(fmt, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    libc_unix_bsd_freebsdlike_dragonfly_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_procctl(idtype, id, cmd, data?.value?.toCPointer<ByteVar>())

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_updwtmpx(file, ut?.value?.toCPointer<ByteVar>())

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_freebsdlike_dragonfly_getlastlogx(fname, uid, ll?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_updlastlogx(fname, uid, ll?.value?.toCPointer<ByteVar>())

public actual fun getutxuser(name: String?): Utmpx =
    Utmpx()

public actual fun utmpxname(file: String?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_utmpxname(file)

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_sysCheckpoint(tpe, fd, pid, retval)

public actual fun umtxSleep(ptr: COpaquePointer?, value: CInt, timeout: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_umtxSleep(ptr?.value?.toCPointer<ByteVar>(), value, timeout)

public actual fun umtxWakeup(ptr: COpaquePointer?, count: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_umtxWakeup(ptr?.value?.toCPointer<ByteVar>(), count)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_freebsdlike_dragonfly_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_freebsdlike_dragonfly_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_getmntvinfo(mntbufp?.value?.toCPointer<ByteVar>(), mntvbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun closefrom(lowfd: CInt): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_closefrom(lowfd)

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_aioCancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_aioFsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    libc_unix_bsd_freebsdlike_dragonfly_aioReturn(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_aioSuspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_aioWrite(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    libc_unix_bsd_freebsdlike_dragonfly_lioListio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_unix_bsd_freebsdlike_dragonfly_reallocf(ptr?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    libc_unix_bsd_freebsdlike_dragonfly_freezero(ptr?.value?.toCPointer<ByteVar>(), size)
}

public actual fun kvmVmMapEntryFirst(kvm: COpaquePointer?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryFirst(kvm?.value?.toCPointer<ByteVar>(), map?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmVmMapEntryNext(kvm: COpaquePointer?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryNext(kvm?.value?.toCPointer<ByteVar>(), map?.value?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }
