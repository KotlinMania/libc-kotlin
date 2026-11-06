package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.COpaquePointer

public actual fun fhlink(fhp: Fhandle?, to: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fhlink(fhp?.toLong() ?: 0L, to)") as CInt

public actual fun fhlinkat(fhp: Fhandle?, tofd: CInt, to: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fhlinkat(fhp?.toLong() ?: 0L, tofd, to)") as CInt

public actual fun fhreadlink(fhp: Fhandle?, buf: COpaquePointer?, bufsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fhreadlink(fhp?.toLong() ?: 0L, buf?.value ?: 0L, bufsize)") as CInt

public actual fun getfhat(fd: CInt, path: COpaquePointer?, fhp: Fhandle?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getfhat(fd, path?.value ?: 0L, fhp?.toLong() ?: 0L, flag)") as CInt

public actual fun error(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').error()") as CInt?

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioCancel(fd, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioError(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioError(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioFsync(op, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioRead(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReadv(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioReadv(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioReturn(aiocbp?.toLong() ?: 0L)") as SsizeT

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWrite(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioWritev(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWritev(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun copyFileRange(infd: CInt, inoffp: OffT?, outfd: CInt, outoffp: OffT?, len: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').copyFileRange(infd, inoffp?.toLong() ?: 0L, outfd, outoffp?.toLong() ?: 0L, len, flags)") as SsizeT

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').devnameR(dev, mode, buf?.value ?: 0L, len)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrDeleteFd(fd, attrnamespace, attrname)") as CInt

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrDeleteFile(path, attrnamespace, attrname)") as CInt

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrDeleteLink(path, attrnamespace, attrname)") as CInt

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrGetFd(fd, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrGetFile(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrGetLink(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrListFd(fd, attrnamespace, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrListFile(path, attrnamespace, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrListLink(path, attrnamespace, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrSetFd(fd, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrSetFile(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrSetLink(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: SpacectlRange?, flags: CInt, rmsr: SpacectlRange?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fspacectl(fd, cmd, rqsr?.toLong() ?: 0L, flags, rmsr?.toLong() ?: 0L)") as CInt

public actual fun jail(jail: io.github.kotlinmania.libc.Jail?): CInt =
    js("require('@kotlinmania/libc-native-bindings').jail(jail?.toLong() ?: 0L)") as CInt

public actual fun jailAttach(jid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').jailAttach(jid)") as CInt

public actual fun jailRemove(jid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').jailRemove(jid)") as CInt

public actual fun jailGet(iov: Iovec?, niov: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').jailGet(iov?.toLong() ?: 0L, niov, flags)") as CInt

public actual fun jailSet(iov: Iovec?, niov: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').jailSet(iov?.toLong() ?: 0L, niov, flags)") as CInt

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)") as CInt

public actual fun getutxuser(user: String?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxuser(user)") as Utmpx?

public actual fun setutxdb(type: CInt, file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setutxdb(type, file)") as CInt

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioWaitcomplete(iocbp?.value ?: 0L, timeout?.toLong() ?: 0L)") as SsizeT

public actual fun mqGetfdNp(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqGetfdNp(mqd)") as CInt

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptsnameR(fd, buf?.value ?: 0L, buflen)") as CInt

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    js("require('@kotlinmania/libc-native-bindings').ftok(pathname, projId)") as KeyT

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmget(key, size, shmflg)") as CInt

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').shmat(shmid, shmaddr?.value ?: 0L, shmflg)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmdt(shmaddr?.value ?: 0L)") as CInt

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmctl(shmid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').semget(key, nsems, semflg)") as CInt

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').semop(semid, sops?.toLong() ?: 0L, nsops)") as CInt

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.MsqidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgctl(msqid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgget(key, msgflg)") as CInt

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)") as CInt

public actual fun cfmakesane(termios: Termios?) {
    js("require('@kotlinmania/libc-native-bindings').cfmakesane(termios?.toLong() ?: 0L)")
}

public actual fun pdfork(fdp: CInt?, flags: CInt): PidT =
    js("require('@kotlinmania/libc-native-bindings').pdfork(fdp?.toLong() ?: 0L, flags)") as PidT

public actual fun pdgetpid(fd: CInt, pidp: PidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pdgetpid(fd, pidp?.toLong() ?: 0L)") as CInt

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pdkill(fd, signum)") as CInt

public actual fun rtprioThread(function: CInt, lwpid: io.github.kotlinmania.libc.LwpidT, rtp: Rtprio?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rtprioThread(function, lwpid, rtp?.toLong() ?: 0L)") as CInt

public actual fun uuidgen(store: Uuid?, count: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').uuidgen(store?.toLong() ?: 0L, count)") as CInt

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').thrKill(id, sig)") as CInt

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').thrKill2(pid, id, sig)") as CInt

public actual fun thrSelf(tid: CLong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').thrSelf(tid?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetthreadidNp(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetthreadidNp()") as CInt

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: CpusetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetaffinityNp(td, cpusetsize, cpusetp?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: CpusetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetaffinityNp(td, cpusetsize, cpusetp?.toLong() ?: 0L)") as CInt

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: io.github.kotlinmania.libc.CpusetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetaffinity(pid, cpusetsz, cpuset?.toLong() ?: 0L)") as CInt

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: io.github.kotlinmania.libc.CpusetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetaffinity(pid, cpusetsz, cpuset?.toLong() ?: 0L)") as CInt

public actual fun schedGetcpu(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetcpu()") as CInt

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexConsistent(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robust: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetrobust(attr?.toLong() ?: 0L, robust?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robust: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetrobust(attr?.toLong() ?: 0L, robust)") as CInt

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinInit(lock?.value ?: 0L, pshared)") as CInt

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinDestroy(lock?.value ?: 0L)") as CInt

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinLock(lock?.value ?: 0L)") as CInt

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinTrylock(lock?.value ?: 0L)") as CInt

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinUnlock(lock?.value ?: 0L)") as CInt

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadTimedjoinNp(thread, retval?.value ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup3(src, dst, flags)") as CInt

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').xuname(nmln, buf?.value ?: 0L)") as CInt

public actual fun sendmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: SizeT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)") as SsizeT

public actual fun recvmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: SizeT, flags: CInt, timeout: Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)") as SsizeT

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fhopen(fhp: Fhandle?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fhopen(fhp?.toLong() ?: 0L, flags)") as CInt

public actual fun fhstat(fhp: Fhandle?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fhstat(fhp?.toLong() ?: 0L, buf?.toLong() ?: 0L)") as CInt

public actual fun fhstatfs(fhp: Fhandle?, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fhstatfs(fhp?.toLong() ?: 0L, buf?.toLong() ?: 0L)") as CInt

public actual fun getfh(path: String?, fhp: Fhandle?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getfh(path, fhp?.toLong() ?: 0L)") as CInt

public actual fun lgetfh(path: String?, fhp: Fhandle?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lgetfh(path, fhp?.toLong() ?: 0L)") as CInt

public actual fun getfsstat(buf: Statfs?, bufsize: CLong, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getfsstat(buf?.toLong() ?: 0L, bufsize, mode)") as CInt

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getmntinfo(mntbufp?.value ?: 0L, mode)") as CInt

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mount(type, dir, flags, data?.value ?: 0L)") as CInt

public actual fun nmount(iov: Iovec?, niov: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').nmount(iov?.toLong() ?: 0L, niov, flags)") as CInt

public actual fun rfork(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').rfork(flags)") as CInt

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CpusetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpusetGetaffinity(level, which, id, setsize, mask?.toLong() ?: 0L)") as CInt

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CpusetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpusetSetaffinity(level, which, id, setsize, mask?.toLong() ?: 0L)") as CInt

public actual fun cpuset(setid: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpuset(setid?.toLong() ?: 0L)") as CInt

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpusetGetid(level, which, id, setid?.toLong() ?: 0L)") as CInt

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: io.github.kotlinmania.libc.CpusetidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpusetSetid(which, id, setid)") as CInt

public actual fun capEnter(): CInt =
    js("require('@kotlinmania/libc-native-bindings').capEnter()") as CInt

public actual fun capGetmode(modep: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').capGetmode(modep?.toLong() ?: 0L)") as CInt

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').capFcntlsGet(fd, fcntlrightsp?.toLong() ?: 0L)") as CInt

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').capFcntlsLimit(fd, fcntlrights)") as CInt

public actual fun capIoctlsGet(fd: CInt, cmds: CUlong?, maxcmds: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').capIoctlsGet(fd, cmds?.toLong() ?: 0L, maxcmds)") as Long

public actual fun capIoctlsLimit(fd: CInt, cmds: CUlong?, ncmds: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').capIoctlsLimit(fd, cmds?.toLong() ?: 0L, ncmds)") as CInt

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: CapRightsT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').capRightsGet(version, fd, rightsp?.toLong() ?: 0L)") as CInt

public actual fun capRightsIsValid(rights: CapRightsT?): Boolean =
    js("require('@kotlinmania/libc-native-bindings').capRightsIsValid(rights?.toLong() ?: 0L)") as Boolean

public actual fun capRightsLimit(fd: CInt, rights: CapRightsT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').capRightsLimit(fd, rights?.toLong() ?: 0L)") as CInt

public actual fun capRightsMerge(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    js("require('@kotlinmania/libc-native-bindings').capRightsMerge(dst?.toLong() ?: 0L, src?.toLong() ?: 0L)") as CapRightsT?

public actual fun capRightsRemove(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    js("require('@kotlinmania/libc-native-bindings').capRightsRemove(dst?.toLong() ?: 0L, src?.toLong() ?: 0L)") as CapRightsT?

public actual fun capRightsContains(big: CapRightsT?, little: CapRightsT?): Boolean =
    js("require('@kotlinmania/libc-native-bindings').capRightsContains(big?.toLong() ?: 0L, little?.toLong() ?: 0L)") as Boolean

public actual fun capSandboxed(): Boolean =
    js("require('@kotlinmania/libc-native-bindings').capSandboxed()") as Boolean

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').reallocarray(ptr?.value ?: 0L, nmemb, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ffs(value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ffs(value)") as CInt

public actual fun ffsl(value: CLong): CInt =
    js("require('@kotlinmania/libc-native-bindings').ffsl(value)") as CInt

public actual fun ffsll(value: CLonglong): CInt =
    js("require('@kotlinmania/libc-native-bindings').ffsll(value)") as CInt

public actual fun fls(value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fls(value)") as CInt

public actual fun flsl(value: CLong): CInt =
    js("require('@kotlinmania/libc-native-bindings').flsl(value)") as CInt

public actual fun flsll(value: CLonglong): CInt =
    js("require('@kotlinmania/libc-native-bindings').flsll(value)") as CInt

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?) {
    js("require('@kotlinmania/libc-native-bindings').mallocStatsPrint(writeCb, cbopaque?.value ?: 0L, opt)")
}

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallctl(name, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun mallctlnametomib(name: String?, mibp: SizeT?, miplen: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallctlnametomib(name, mibp?.toLong() ?: 0L, miplen?.toLong() ?: 0L)") as CInt

public actual fun mallctlbymib(mib: SizeT?, mible: SizeT, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallctlbymib(mib?.toLong() ?: 0L, mible, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun mallocx(size: SizeT, flags: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mallocx(size, flags)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').rallocx(ptr?.value ?: 0L, size, flags)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    js("require('@kotlinmania/libc-native-bindings').xallocx(ptr?.value ?: 0L, size, extra, flags)") as SizeT

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT =
    js("require('@kotlinmania/libc-native-bindings').sallocx(ptr?.value ?: 0L, flags)") as SizeT

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    js("require('@kotlinmania/libc-native-bindings').dallocx(ptr?.value ?: 0L, flags)")
}

public actual fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt) {
    js("require('@kotlinmania/libc-native-bindings').sdallocx(ptr?.value ?: 0L, size, flags)")
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    js("require('@kotlinmania/libc-native-bindings').nallocx(size, flags)") as SizeT

public actual fun procctl(idtype: io.github.kotlinmania.libc.IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procctl(idtype, id, cmd, data?.value ?: 0L)") as CInt

public actual fun getpagesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpagesize()") as CInt

public actual fun getpagesizes(pagesize: SizeT?, nelem: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpagesizes(pagesize?.toLong() ?: 0L, nelem)") as CInt

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetcpuclockid2(arg1, arg2, arg3?.toLong() ?: 0L)") as CInt

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strchrnul(s, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmCreateLargepage(path, flags, psind, allocPolicy, mode)") as CInt

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmRename(pathFrom, pathTo, flags)") as CInt

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').memfdCreate(name, flags)") as CInt

public actual fun setaudit(auditinfo: AuditinfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setaudit(auditinfo?.toLong() ?: 0L)") as CInt

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfd(initval, flags)") as CInt

public actual fun eventfdRead(fd: CInt, value: CUlong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfdRead(fd, value?.toLong() ?: 0L)") as CInt

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfdWrite(fd, value)") as CInt

public actual fun fdatasync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fdatasync(fd)") as CInt

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').elfAuxInfo(aux, buf?.value ?: 0L, buflen)") as CInt

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timingsafeBcmp(a?.value ?: 0L, b?.value ?: 0L, len)") as CInt

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timingsafeMemcmp(a?.value ?: 0L, b?.value ?: 0L, len)") as CInt

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').umtxOp(obj?.value ?: 0L, op, value, uaddr?.value ?: 0L, uaddr2?.value ?: 0L)") as CInt

public actual fun sctpPeeloff(s: CInt, id: io.github.kotlinmania.libc.SctpAssocT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sctpPeeloff(s, id)") as CInt

public actual fun sctpBindx(s: CInt, addrs: Sockaddr?, num: CInt, tpe: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sctpBindx(s, addrs?.toLong() ?: 0L, num, tpe)") as CInt

public actual fun sctpConnectx(s: CInt, addrs: Sockaddr?, addrcnt: CInt, id: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sctpConnectx(s, addrs?.toLong() ?: 0L, addrcnt, id?.toLong() ?: 0L)") as CInt

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sctpGetaddrlen(family)") as CInt

public actual fun sctpGetpaddrs(s: CInt, asocid: io.github.kotlinmania.libc.SctpAssocT, addrs: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sctpGetpaddrs(s, asocid, addrs?.value ?: 0L)") as CInt

public actual fun sctpFreepaddrs(addrs: Sockaddr?) {
    js("require('@kotlinmania/libc-native-bindings').sctpFreepaddrs(addrs?.toLong() ?: 0L)")
}

public actual fun sctpGetladdrs(s: CInt, asocid: io.github.kotlinmania.libc.SctpAssocT, addrs: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sctpGetladdrs(s, asocid, addrs?.value ?: 0L)") as CInt

public actual fun sctpFreeladdrs(addrs: Sockaddr?) {
    js("require('@kotlinmania/libc-native-bindings').sctpFreeladdrs(addrs?.toLong() ?: 0L)")
}

public actual fun sctpOptInfo(s: CInt, id: io.github.kotlinmania.libc.SctpAssocT, opt: CInt, arg: COpaquePointer?, size: SocklenT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sctpOptInfo(s, id, opt, arg?.value ?: 0L, size?.toLong() ?: 0L)") as CInt

public actual fun sctpSendv(sd: CInt, iov: Iovec?, iovcnt: CInt, addrs: Sockaddr?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sctpSendv(sd, iov?.toLong() ?: 0L, iovcnt, addrs?.toLong() ?: 0L, addrcnt, info?.value ?: 0L, infolen, infotype, flags)") as SsizeT

public actual fun sctpRecvv(sd: CInt, iov: Iovec?, iovcnt: CInt, from: Sockaddr?, fromlen: SocklenT?, info: COpaquePointer?, infolen: SocklenT?, infotype: CUint?, flags: CInt?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sctpRecvv(sd, iov?.toLong() ?: 0L, iovcnt, from?.toLong() ?: 0L, fromlen?.toLong() ?: 0L, info?.value ?: 0L, infolen?.toLong() ?: 0L, infotype?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as SsizeT

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdCreate(clockid, flags)") as CInt

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdGettime(fd, currValue?.toLong() ?: 0L)") as CInt

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun closefrom(lowfd: CInt) {
    js("require('@kotlinmania/libc-native-bindings').closefrom(lowfd)")
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').closeRange(lowfd, highfd, flags)") as CInt

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').kcmp(pid1, pid2, type, idx1, idx2)") as CInt

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlvsym(handle?.value ?: 0L, symbol, version)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatStrerror(error: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memstatStrerror(error)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatMtlAlloc(): MemoryTypeList? =
    js("require('@kotlinmania/libc-native-bindings').memstatMtlAlloc()") as MemoryTypeList?

public actual fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? =
    js("require('@kotlinmania/libc-native-bindings').memstatMtlFirst(list?.toLong() ?: 0L)") as MemoryType?

public actual fun memstatMtlNext(mtp: MemoryType?): MemoryType? =
    js("require('@kotlinmania/libc-native-bindings').memstatMtlNext(mtp?.toLong() ?: 0L)") as MemoryType?

public actual fun memstatMtlFind(list: MemoryTypeList?, allocator: CInt, name: String?): MemoryType? =
    js("require('@kotlinmania/libc-native-bindings').memstatMtlFind(list?.toLong() ?: 0L, allocator, name)") as MemoryType?

public actual fun memstatMtlFree(list: MemoryTypeList?) {
    js("require('@kotlinmania/libc-native-bindings').memstatMtlFree(list?.toLong() ?: 0L)")
}

public actual fun memstatMtlGeterror(list: MemoryTypeList?): CInt =
    js("require('@kotlinmania/libc-native-bindings').memstatMtlGeterror(list?.toLong() ?: 0L)") as CInt

public actual fun memstatGetName(mtp: MemoryType?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memstatGetName(mtp?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmDpcpuSetcpu(kd: KvmT?, cpu: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmDpcpuSetcpu(kd?.toLong() ?: 0L, cpu)") as CInt

public actual fun kvmGetargv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').kvmGetargv(kd?.toLong() ?: 0L, p?.toLong() ?: 0L, nchr)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGetcptime(kd: KvmT?, cpTime: CLong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmGetcptime(kd?.toLong() ?: 0L, cpTime?.toLong() ?: 0L)") as CInt

public actual fun kvmGetenvv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').kvmGetenvv(kd?.toLong() ?: 0L, p?.toLong() ?: 0L, nchr)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGeterr(kd: KvmT?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').kvmGeterr(kd?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGetmaxcpu(kd: KvmT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmGetmaxcpu(kd?.toLong() ?: 0L)") as CInt

public actual fun kvmGetncpus(kd: KvmT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmGetncpus(kd?.toLong() ?: 0L)") as CInt

public actual fun kvmGetpcpu(kd: KvmT?, cpu: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').kvmGetpcpu(kd?.toLong() ?: 0L, cpu)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmCounterU64Fetch(kd: KvmT?, base: CUlong): ULong =
    js("require('@kotlinmania/libc-native-bindings').kvmCounterU64Fetch(kd?.toLong() ?: 0L, base)") as ULong

public actual fun kvmGetswapinfo(kd: KvmT?, info: KvmSwap?, maxswap: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmGetswapinfo(kd?.toLong() ?: 0L, info?.toLong() ?: 0L, maxswap, flags)") as CInt

public actual fun kvmNative(kd: KvmT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmNative(kd?.toLong() ?: 0L)") as CInt

public actual fun kvmNlist(kd: KvmT?, nl: Nlist?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmNlist(kd?.toLong() ?: 0L, nl?.toLong() ?: 0L)") as CInt

public actual fun kvmNlist2(kd: KvmT?, nl: KvmNlist?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmNlist2(kd?.toLong() ?: 0L, nl?.toLong() ?: 0L)") as CInt

public actual fun kvmReadZpcpu(kd: KvmT?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').kvmReadZpcpu(kd?.toLong() ?: 0L, base, buf?.value ?: 0L, size, cpu)") as SsizeT

public actual fun kvmRead2(kd: KvmT?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').kvmRead2(kd?.toLong() ?: 0L, addr, buf?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrNamespaceToString(attrnamespace, string?.value ?: 0L)") as CInt

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrStringToNamespace(string, attrnamespace?.toLong() ?: 0L)") as CInt

public actual fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: InAddr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').realhostname(host?.value ?: 0L, hsize, ip?.toLong() ?: 0L)") as CInt

public actual fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: Sockaddr?, addrlen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').realhostnameSa(host?.value ?: 0L, hsize, addr?.toLong() ?: 0L, addrlen)") as CInt

public actual fun kldIsloaded(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kldIsloaded(name)") as CInt

public actual fun kldLoad(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kldLoad(name)") as CInt

public actual fun kinfoGetvmmap(pid: PidT, cntp: CInt?): KinfoVmentry? =
    js("require('@kotlinmania/libc-native-bindings').kinfoGetvmmap(pid, cntp?.toLong() ?: 0L)") as KinfoVmentry?

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    js("require('@kotlinmania/libc-native-bindings').hexdump(ptr?.value ?: 0L, length, hdr, flags)")
}

public actual fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').humanizeNumber(buf?.value ?: 0L, len, number, suffix, scale, flags)") as CInt

public actual fun getlocalbase(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getlocalbase()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: PidT?): io.github.kotlinmania.libc.Pidfh? =
    js("require('@kotlinmania/libc-native-bindings').pidfileOpen(path, mode, pidptr?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Pidfh?

public actual fun pidfileWrite(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pidfileWrite(path?.toLong() ?: 0L)") as CInt

public actual fun pidfileClose(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pidfileClose(path?.toLong() ?: 0L)") as CInt

public actual fun pidfileRemove(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pidfileRemove(path?.toLong() ?: 0L)") as CInt

public actual fun pidfileFileno(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pidfileFileno(path?.toLong() ?: 0L)") as CInt

public actual fun procstatOpenSysctl(): Procstat? =
    js("require('@kotlinmania/libc-native-bindings').procstatOpenSysctl()") as Procstat?

public actual fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: CInt): FilestatList? =
    js("require('@kotlinmania/libc-native-bindings').procstatGetfiles(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, mmapped)") as FilestatList?

public actual fun procstatFreefiles(procstat: Procstat?, head: FilestatList?) {
    js("require('@kotlinmania/libc-native-bindings').procstatFreefiles(procstat?.toLong() ?: 0L, head?.toLong() ?: 0L)")
}

public actual fun procstatGetprocs(procstat: Procstat?, what: CInt, arg: CInt, count: CUint?): KinfoProc? =
    js("require('@kotlinmania/libc-native-bindings').procstatGetprocs(procstat?.toLong() ?: 0L, what, arg, count?.toLong() ?: 0L)") as KinfoProc?

public actual fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?) {
    js("require('@kotlinmania/libc-native-bindings').procstatFreeprocs(procstat?.toLong() ?: 0L, p?.toLong() ?: 0L)")
}

public actual fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: CUint?): KinfoVmentry? =
    js("require('@kotlinmania/libc-native-bindings').procstatGetvmmap(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, count?.toLong() ?: 0L)") as KinfoVmentry?

public actual fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?) {
    js("require('@kotlinmania/libc-native-bindings').procstatFreevmmap(procstat?.toLong() ?: 0L, vmmap?.toLong() ?: 0L)")
}

public actual fun procstatClose(procstat: Procstat?) {
    js("require('@kotlinmania/libc-native-bindings').procstatClose(procstat?.toLong() ?: 0L)")
}

public actual fun procstatFreeargv(procstat: Procstat?) {
    js("require('@kotlinmania/libc-native-bindings').procstatFreeargv(procstat?.toLong() ?: 0L)")
}

public actual fun procstatFreeenvv(procstat: Procstat?) {
    js("require('@kotlinmania/libc-native-bindings').procstatFreeenvv(procstat?.toLong() ?: 0L)")
}

public actual fun procstatFreegroups(procstat: Procstat?, groups: GidT?) {
    js("require('@kotlinmania/libc-native-bindings').procstatFreegroups(procstat?.toLong() ?: 0L, groups?.toLong() ?: 0L)")
}

public actual fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?) {
    js("require('@kotlinmania/libc-native-bindings').procstatFreeptlwpinfo(procstat?.toLong() ?: 0L, pl?.toLong() ?: 0L)")
}

public actual fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').procstatGetargv(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, nchr)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').procstatGetenvv(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, nchr)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: CUint?): GidT? =
    js("require('@kotlinmania/libc-native-bindings').procstatGetgroups(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, count?.toLong() ?: 0L)") as GidT?

public actual fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procstatGetosrel(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, osrelp?.toLong() ?: 0L)") as CInt

public actual fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: COpaquePointer?, maxlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').procstatGetpathname(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, pathname?.value ?: 0L, maxlen)") as CInt

public actual fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: CInt, rlimit: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procstatGetrlimit(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, which, rlimit?.toLong() ?: 0L)") as CInt

public actual fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: CUshort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procstatGetumask(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, maskp?.toLong() ?: 0L)") as CInt

public actual fun procstatOpenCore(filename: String?): Procstat? =
    js("require('@kotlinmania/libc-native-bindings').procstatOpenCore(filename)") as Procstat?

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? =
    js("require('@kotlinmania/libc-native-bindings').procstatOpenKvm(nlistf, memf)") as Procstat?

public actual fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procstatGetSocketInfo(proc?.toLong() ?: 0L, fst?.toLong() ?: 0L, sock?.toLong() ?: 0L, errbuf?.value ?: 0L)") as CInt

public actual fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Vnstat?, errbuf: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procstatGetVnodeInfo(proc?.toLong() ?: 0L, fst?.toLong() ?: 0L, vn?.toLong() ?: 0L, errbuf?.value ?: 0L)") as CInt

public actual fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procstatGetPtsInfo(proc?.toLong() ?: 0L, fst?.toLong() ?: 0L, pts?.toLong() ?: 0L, errbuf?.value ?: 0L)") as CInt

public actual fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procstatGetShmInfo(proc?.toLong() ?: 0L, fst?.toLong() ?: 0L, shm?.toLong() ?: 0L, errbuf?.value ?: 0L)") as CInt

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerCreate(clockId, evp?.toLong() ?: 0L, timerid?.value ?: 0L)") as CInt

public actual fun timerDelete(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerDelete(timerid)") as CInt

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGetoverrun(timerid)") as CInt

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGettime(timerid, value?.toLong() ?: 0L)") as CInt

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerSettime(timerid, flags, value?.toLong() ?: 0L, ovalue?.toLong() ?: 0L)") as CInt

public actual fun devstatGetnumdevs(kd: KvmT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').devstatGetnumdevs(kd?.toLong() ?: 0L)") as CInt

public actual fun devstatGetgeneration(kd: KvmT?): CLong =
    js("require('@kotlinmania/libc-native-bindings').devstatGetgeneration(kd?.toLong() ?: 0L)") as CLong

public actual fun devstatGetversion(kd: KvmT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').devstatGetversion(kd?.toLong() ?: 0L)") as CInt

public actual fun devstatCheckversion(kd: KvmT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').devstatCheckversion(kd?.toLong() ?: 0L)") as CInt

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: CInt?, numSelections: CInt?, selectGeneration: CLong?, currentGeneration: CLong, devices: Devstat?, numdevs: CInt, matches: DevstatMatch?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').devstatSelectdevs(devSelect?.value ?: 0L, numSelected?.toLong() ?: 0L, numSelections?.toLong() ?: 0L, selectGeneration?.toLong() ?: 0L, currentGeneration, devices?.toLong() ?: 0L, numdevs, matches?.toLong() ?: 0L, numMatches, devSelections?.value ?: 0L, numDevSelections, selectMode, maxshowdevs, perfSelect)") as CInt

public actual fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').devstatBuildmatch(matchStr?.value ?: 0L, matches?.value ?: 0L, numMatches?.toLong() ?: 0L)") as CInt
