package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.COpaquePointer

internal object DragonflyModRawLibc {
    external fun errnoLocation(): Long?
    external fun setgrent()
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun setutxdb(type: Int, file: Long): Int
    external fun aioWaitcomplete(iocbp: Long, timeout: Long): Int
    external fun devnameR(dev: Long, mode: Int, buf: Long, len: Long): Long?
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun freelocale(loc: Long)
    external fun lwpRtprio(function: Int, pid: Int, lwpid: Long, rtp: Long): Int
    external fun statfs(path: String?, buf: Long): Int
    external fun fstatfs(fd: Int, buf: Long): Int
    external fun uname(buf: Long): Int
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun schedGetaffinity(pid: Int, cpusetsize: Long, mask: Long): Int
    external fun schedSetaffinity(pid: Int, cpusetsize: Long, mask: Long): Int
    external fun schedGetcpu(): Int
    external fun shmget(key: Long, size: Long, shmflg: Int): Int
    external fun shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long?
    external fun shmdt(shmaddr: Long): Int
    external fun shmctl(shmid: Int, cmd: Int, buf: Long): Int
    external fun procctl(idtype: Long, id: Long, cmd: Int, data: Long): Int
    external fun updwtmpx(file: String?, ut: Long): Int
    external fun getlastlogx(fname: String?, uid: Int, ll: Long): Long?
    external fun updlastlogx(fname: String?, uid: Int, ll: Long): Int
    external fun getutxuser(name: String?): Long
    external fun utmpxname(file: String?): Int
    external fun sysCheckpoint(tpe: Int, fd: Int, pid: Int, retval: Int): Int
    external fun umtxSleep(ptr: Long, value: Int, timeout: Int): Int
    external fun umtxWakeup(ptr: Long, count: Int): Int
    external fun dirname(path: Long): Long?
    external fun basename(path: Long): Long?
    external fun getmntinfo(mntbufp: Long, flags: Int): Int
    external fun getmntvinfo(mntbufp: Long, mntvbufp: Long, flags: Int): Int
    external fun closefrom(lowfd: Int): Int
    external fun aioCancel(fd: Int, aiocbp: Long): Int
    external fun aioError(aiocbp: Long): Int
    external fun aioFsync(op: Int, aiocbp: Long): Int
    external fun aioRead(aiocbp: Long): Int
    external fun aioReturn(aiocbp: Long): Long
    external fun aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int
    external fun aioWrite(aiocbp: Long): Int
    external fun lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int
    external fun reallocf(ptr: Long, size: Long): Long?
    external fun freezero(ptr: Long, size: Long)
    external fun kvmVmMapEntryFirst(kvm: Long, map: Long, entry: Long): Long
    external fun kvmVmMapEntryNext(kvm: Long, map: Long, entry: Long): Long
}

public actual fun errnoLocation(): CInt? =
    DragonflyModRawLibc.errnoLocation()

public actual fun setgrent() {
    DragonflyModRawLibc.setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    DragonflyModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun setutxdb(type: CUint, file: COpaquePointer?): CInt =
    DragonflyModRawLibc.setutxdb(type, file?.value ?: 0L)

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): CInt =
    DragonflyModRawLibc.aioWaitcomplete(iocbp?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun devnameR(dev: io.github.kotlinmania.libc.DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer? =
    DragonflyModRawLibc.devnameR(dev, mode, buf?.value ?: 0L, len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    DragonflyModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun freelocale(loc: LocaleT) {
    DragonflyModRawLibc.freelocale(loc)
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio?): CInt =
    DragonflyModRawLibc.lwpRtprio(function, pid, lwpid, rtp?.toLong() ?: 0L)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    DragonflyModRawLibc.statfs(path, buf?.toLong() ?: 0L)

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    DragonflyModRawLibc.fstatfs(fd, buf?.toLong() ?: 0L)

public actual fun uname(buf: Utsname?): CInt =
    DragonflyModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    DragonflyModRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSpinInit(lock: UintptrT?, pshared: CInt): CInt =
    DragonflyModRawLibc.pthreadSpinInit(lock?.toLong() ?: 0L, pshared)

public actual fun pthreadSpinDestroy(lock: UintptrT?): CInt =
    DragonflyModRawLibc.pthreadSpinDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadSpinLock(lock: UintptrT?): CInt =
    DragonflyModRawLibc.pthreadSpinLock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinTrylock(lock: UintptrT?): CInt =
    DragonflyModRawLibc.pthreadSpinTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinUnlock(lock: UintptrT?): CInt =
    DragonflyModRawLibc.pthreadSpinUnlock(lock?.toLong() ?: 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpumaskT?): CInt =
    DragonflyModRawLibc.schedGetaffinity(pid, cpusetsize, mask?.toLong() ?: 0L)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpumaskT?): CInt =
    DragonflyModRawLibc.schedSetaffinity(pid, cpusetsize, mask?.toLong() ?: 0L)

public actual fun schedGetcpu(): CInt =
    DragonflyModRawLibc.schedGetcpu()

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    DragonflyModRawLibc.shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    DragonflyModRawLibc.shmat(shmid, shmaddr?.value ?: 0L, shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    DragonflyModRawLibc.shmdt(shmaddr?.value ?: 0L)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    DragonflyModRawLibc.shmctl(shmid, cmd, buf?.toLong() ?: 0L)

public actual fun procctl(idtype: io.github.kotlinmania.libc.IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    DragonflyModRawLibc.procctl(idtype, id, cmd, data?.value ?: 0L)

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    DragonflyModRawLibc.updwtmpx(file, ut?.toLong() ?: 0L)

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    DragonflyModRawLibc.getlastlogx(fname, uid, ll?.toLong() ?: 0L)

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    DragonflyModRawLibc.updlastlogx(fname, uid, ll?.toLong() ?: 0L)

public actual fun getutxuser(name: String?): Utmpx =
    DragonflyModRawLibc.getutxuser(name)

public actual fun utmpxname(file: String?): CInt =
    DragonflyModRawLibc.utmpxname(file)

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    DragonflyModRawLibc.sysCheckpoint(tpe, fd, pid, retval)

public actual fun umtxSleep(ptr: CInt?, value: CInt, timeout: CInt): CInt =
    DragonflyModRawLibc.umtxSleep(ptr?.toLong() ?: 0L, value, timeout)

public actual fun umtxWakeup(ptr: CInt?, count: CInt): CInt =
    DragonflyModRawLibc.umtxWakeup(ptr?.toLong() ?: 0L, count)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    DragonflyModRawLibc.dirname(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    DragonflyModRawLibc.basename(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    DragonflyModRawLibc.getmntinfo(mntbufp?.value ?: 0L, flags)

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    DragonflyModRawLibc.getmntvinfo(mntbufp?.value ?: 0L, mntvbufp?.value ?: 0L, flags)

public actual fun closefrom(lowfd: CInt): CInt =
    DragonflyModRawLibc.closefrom(lowfd)

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    DragonflyModRawLibc.aioCancel(fd, aiocbp?.toLong() ?: 0L)

public actual fun aioError(aiocbp: Aiocb?): CInt =
    DragonflyModRawLibc.aioError(aiocbp?.toLong() ?: 0L)

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    DragonflyModRawLibc.aioFsync(op, aiocbp?.toLong() ?: 0L)

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    DragonflyModRawLibc.aioRead(aiocbp?.toLong() ?: 0L)

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    DragonflyModRawLibc.aioReturn(aiocbp?.toLong() ?: 0L)

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    DragonflyModRawLibc.aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    DragonflyModRawLibc.aioWrite(aiocbp?.toLong() ?: 0L)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    DragonflyModRawLibc.lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    DragonflyModRawLibc.reallocf(ptr?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    DragonflyModRawLibc.freezero(ptr?.value ?: 0L, size)
}

public actual fun kvmVmMapEntryFirst(kvm: KvmT?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    DragonflyModRawLibc.kvmVmMapEntryFirst(kvm?.toLong() ?: 0L, map, entry)

public actual fun kvmVmMapEntryNext(kvm: KvmT?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    DragonflyModRawLibc.kvmVmMapEntryNext(kvm?.toLong() ?: 0L, map, entry)
