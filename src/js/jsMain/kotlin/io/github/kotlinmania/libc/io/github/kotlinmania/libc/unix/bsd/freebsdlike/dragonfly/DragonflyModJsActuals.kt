package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.COpaquePointer

public actual fun errnoLocation(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errnoLocation()") as CInt?

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun setutxdb(type: CUint, file: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setutxdb(type, file?.value ?: 0L)") as CInt

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWaitcomplete(iocbp?.value ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun devnameR(dev: io.github.kotlinmania.libc.DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').devnameR(dev, mode, buf?.value ?: 0L, len)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun freelocale(loc: LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lwpRtprio(function, pid, lwpid, rtp?.toLong() ?: 0L)") as CInt

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun uname(buf: Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSpinInit(lock: UintptrT?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinInit(lock?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadSpinDestroy(lock: UintptrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinLock(lock: UintptrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinTrylock(lock: UintptrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinUnlock(lock: UintptrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpumaskT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetaffinity(pid, cpusetsize, mask?.toLong() ?: 0L)") as CInt

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpumaskT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetaffinity(pid, cpusetsize, mask?.toLong() ?: 0L)") as CInt

public actual fun schedGetcpu(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetcpu()") as CInt

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmget(key, size, shmflg)") as CInt

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').shmat(shmid, shmaddr?.value ?: 0L, shmflg)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmdt(shmaddr?.value ?: 0L)") as CInt

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmctl(shmid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun procctl(idtype: io.github.kotlinmania.libc.IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procctl(idtype, id, cmd, data?.value ?: 0L)") as CInt

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    js("require('@kotlinmania/libc-native-bindings').updwtmpx(file, ut?.toLong() ?: 0L)") as CInt

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    js("require('@kotlinmania/libc-native-bindings').getlastlogx(fname, uid, ll?.toLong() ?: 0L)") as Lastlogx?

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    js("require('@kotlinmania/libc-native-bindings').updlastlogx(fname, uid, ll?.toLong() ?: 0L)") as CInt

public actual fun getutxuser(name: String?): Utmpx =
    js("require('@kotlinmania/libc-native-bindings').getutxuser(name)") as Utmpx

public actual fun utmpxname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpxname(file)") as CInt

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysCheckpoint(tpe, fd, pid, retval)") as CInt

public actual fun umtxSleep(ptr: CInt?, value: CInt, timeout: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').umtxSleep(ptr?.toLong() ?: 0L, value, timeout)") as CInt

public actual fun umtxWakeup(ptr: CInt?, count: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').umtxWakeup(ptr?.toLong() ?: 0L, count)") as CInt

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').basename(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getmntinfo(mntbufp?.value ?: 0L, flags)") as CInt

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getmntvinfo(mntbufp?.value ?: 0L, mntvbufp?.value ?: 0L, flags)") as CInt

public actual fun closefrom(lowfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').closefrom(lowfd)") as CInt

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioCancel(fd, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioError(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioError(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioFsync(op, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioRead(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioReturn(aiocbp?.toLong() ?: 0L)") as SsizeT

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWrite(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)") as CInt

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').reallocf(ptr?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').freezero(ptr?.value ?: 0L, size)")
}

public actual fun kvmVmMapEntryFirst(kvm: KvmT?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    js("require('@kotlinmania/libc-native-bindings').kvmVmMapEntryFirst(kvm?.toLong() ?: 0L, map, entry)") as VmMapEntryT

public actual fun kvmVmMapEntryNext(kvm: KvmT?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    js("require('@kotlinmania/libc-native-bindings').kvmVmMapEntryNext(kvm?.toLong() ?: 0L, map, entry)") as VmMapEntryT
