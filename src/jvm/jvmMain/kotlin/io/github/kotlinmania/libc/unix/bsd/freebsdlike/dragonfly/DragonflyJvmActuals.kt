@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
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

private object UnixBsdFreebsdlikeDragonflyJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_errnoLocation(): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_setgrent()

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_setutxdb(type: Int, file: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_aioWaitcomplete(iocbp: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_devnameR(dev: Int, mode: Short, buf: Long, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_waitid(idtype: Int, id: Long, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_lwpRtprio(function: Int, pid: Int, lwpid: Int, rtp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_statfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_fstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_schedGetaffinity(pid: Int, cpusetsize: Long, mask: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_schedSetaffinity(pid: Int, cpusetsize: Long, mask: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_schedGetcpu(): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_shmget(key: Long, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_shmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_shmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_procctl(idtype: Int, id: Long, cmd: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_updwtmpx(file: String?, ut: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_getlastlogx(fname: String?, uid: Short, ll: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_updlastlogx(fname: String?, uid: Short, ll: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_utmpxname(file: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_sysCheckpoint(tpe: Int, fd: Int, pid: Int, retval: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_umtxSleep(ptr: Long, value: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_umtxWakeup(ptr: Long, count: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_basename(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_getmntinfo(mntbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_getmntvinfo(mntbufp: Long, mntvbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_closefrom(lowfd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_aioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_aioError(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_aioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_aioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_aioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_aioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_reallocf(ptr: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_freezero(ptr: Long, size: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryFirst(kvm: Long, map: Long, entry: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryNext(kvm: Long, map: Long, entry: Long): Long
}

public actual fun errnoLocation(): COpaquePointer? =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_errnoLocation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgrent() {
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun setutxdb(type: CUint, file: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_setutxdb(type.toInt(), (file?.value ?: 0L))

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_aioWaitcomplete((iocbp?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer? =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_devnameR(dev.toInt(), mode.toShort(), (buf?.value ?: 0L), len.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_waitid(idtype.toInt(), id, (infop?.value ?: 0L), options)

public actual fun freelocale(loc: LocaleT) {
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_freelocale(loc.toLong())
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_lwpRtprio(function, pid, lwpid, (rtp?.value ?: 0L))

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_statfs(path, (buf?.value ?: 0L))

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_fstatfs(fd, (buf?.value ?: 0L))

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_uname((buf?.value ?: 0L))

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_pthreadSpinUnlock((lock?.value ?: 0L))

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_schedGetaffinity(pid, cpusetsize.toLong(), (mask?.value ?: 0L))

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_schedSetaffinity(pid, cpusetsize.toLong(), (mask?.value ?: 0L))

public actual fun schedGetcpu(): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_schedGetcpu()

public actual fun setproctitle(fmt: String?) {
}

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_shmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_shmat(shmid, (shmaddr?.value ?: 0L), shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_shmdt((shmaddr?.value ?: 0L))

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_shmctl(shmid, cmd, (buf?.value ?: 0L))

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_procctl(idtype.toInt(), id, cmd, (data?.value ?: 0L))

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_updwtmpx(file, (ut?.value ?: 0L))

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_getlastlogx(fname, uid.toShort(), (ll?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_updlastlogx(fname, uid.toShort(), (ll?.value ?: 0L))

public actual fun getutxuser(name: String?): Utmpx =
    null as Utmpx

public actual fun utmpxname(file: String?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_utmpxname(file)

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_sysCheckpoint(tpe, fd, pid, retval)

public actual fun umtxSleep(ptr: COpaquePointer?, value: CInt, timeout: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_umtxSleep((ptr?.value ?: 0L), value, timeout)

public actual fun umtxWakeup(ptr: COpaquePointer?, count: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_umtxWakeup((ptr?.value ?: 0L), count)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_basename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_getmntinfo((mntbufp?.value ?: 0L), flags)

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_getmntvinfo((mntbufp?.value ?: 0L), (mntvbufp?.value ?: 0L), flags)

public actual fun closefrom(lowfd: CInt): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_closefrom(lowfd)

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_aioCancel(fd, (aiocbp?.value ?: 0L))

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_aioError((aiocbp?.value ?: 0L))

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_aioFsync(op, (aiocbp?.value ?: 0L))

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_aioRead((aiocbp?.value ?: 0L))

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_aioReturn((aiocbp?.value ?: 0L))

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_aioSuspend((aiocbList?.value ?: 0L), nitems, (timeout?.value ?: 0L))

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_aioWrite((aiocbp?.value ?: 0L))

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_lioListio(mode, (aiocbList?.value ?: 0L), nitems, (sevp?.value ?: 0L))

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_reallocf((ptr?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_freezero((ptr?.value ?: 0L), size.toLong())
}

public actual fun kvmVmMapEntryFirst(kvm: COpaquePointer?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryFirst((kvm?.value ?: 0L), map.toLong(), (entry?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmVmMapEntryNext(kvm: COpaquePointer?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    UnixBsdFreebsdlikeDragonflyJniBridge.libc_unix_bsd_freebsdlike_dragonfly_kvmVmMapEntryNext((kvm?.value ?: 0L), (map?.value ?: 0L), (entry?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }
