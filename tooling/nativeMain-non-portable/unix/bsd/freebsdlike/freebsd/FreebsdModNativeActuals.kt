@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fhlink(fhp: Fhandle?, to: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fhlink(fhp?.value?.toCPointer<ByteVar>(), to)

public actual fun fhlinkat(fhp: Fhandle?, tofd: CInt, to: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fhlinkat(fhp?.value?.toCPointer<ByteVar>(), tofd, to)

public actual fun fhreadlink(fhp: Fhandle?, buf: COpaquePointer?, bufsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fhreadlink(fhp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun getfhat(fd: CInt, path: COpaquePointer?, fhp: Fhandle?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_getfhat(fd, path?.value?.toCPointer<ByteVar>(), fhp?.value?.toCPointer<ByteVar>(), flag)

public actual fun error(): CInt? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_error()?.let { COpaquePointer(it.toLong()) }

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_cancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_error(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_fsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_read(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReadv(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_readv(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_return(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_suspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_write(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWritev(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_writev(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun copyFileRange(infd: CInt, inoffp: OffT?, outfd: CInt, outoffp: OffT?, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_copy_file_range(infd, inoffp?.value?.toCPointer<ByteVar>(), outfd, outoffp?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_devname_r(dev.toInt(), mode, buf?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_delete_fd(fd, attrnamespace, attrname)

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_delete_file(path, attrnamespace, attrname)

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_delete_link(path, attrnamespace, attrname)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_get_fd(fd, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_get_file(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_get_link(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_list_fd(fd, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_list_file(path, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_list_link(path, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_set_fd(fd, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_set_file(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_set_link(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: SpacectlRange?, flags: CInt, rmsr: SpacectlRange?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fspacectl(fd, cmd, rqsr?.value?.toCPointer<ByteVar>(), flags, rmsr?.value?.toCPointer<ByteVar>())

public actual fun jail(jail: io.github.kotlinmania.libc.Jail?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_jail(jail?.value?.toCPointer<ByteVar>())

public actual fun jailAttach(jid: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_jail_attach(jid)

public actual fun jailRemove(jid: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_jail_remove(jid)

public actual fun jailGet(iov: Iovec?, niov: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_jail_get(iov?.value?.toCPointer<ByteVar>(), niov, flags)

public actual fun jailSet(iov: Iovec?, niov: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_jail_set(iov?.value?.toCPointer<ByteVar>(), niov, flags)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_lio_listio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun getutxuser(user: String?): Utmpx? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_getutxuser(user)?.let { COpaquePointer(it.toLong()) }

public actual fun setutxdb(type: CInt, file: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_setutxdb(type, file)

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_aio_waitcomplete(iocbp?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetfdNp(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_mq_getfd_np(mqd?.value?.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_ptsname_r(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_ftok(pathname, projId)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_semget(key, nsems, semflg)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.MsqidDs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_msgget(key, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun cfmakesane(termios: Termios?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cfmakesane(termios?.value?.toCPointer<ByteVar>())
}

public actual fun pdfork(fdp: CInt?, flags: CInt): PidT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pdfork(fdp?.value?.toCPointer<ByteVar>(), flags)

public actual fun pdgetpid(fd: CInt, pidp: PidT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pdgetpid(fd, pidp?.value?.toCPointer<ByteVar>())

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pdkill(fd, signum)

public actual fun rtprioThread(function: CInt, lwpid: io.github.kotlinmania.libc.LwpidT, rtp: Rtprio?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_rtprio_thread(function, lwpid, rtp?.value?.toCPointer<ByteVar>())

public actual fun uuidgen(store: Uuid?, count: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_uuidgen(store?.value?.toCPointer<ByteVar>(), count)

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_thr_kill(id, sig)

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_thr_kill2(pid, id, sig)

public actual fun thrSelf(tid: CLong?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_thr_self(tid?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetthreadidNp(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_getthreadid_np()

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: CpusetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_getaffinity_np(td.toInt(), cpusetsize, cpusetp?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: CpusetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_setaffinity_np(td.toInt(), cpusetsize, cpusetp?.value?.toCPointer<ByteVar>())

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: io.github.kotlinmania.libc.CpusetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sched_getaffinity(pid, cpusetsz, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: io.github.kotlinmania.libc.CpusetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sched_setaffinity(pid, cpusetsz, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sched_getcpu()

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_mutex_consistent(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robust: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_mutexattr_getrobust(attr?.value?.toCPointer<ByteVar>(), robust?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robust: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_mutexattr_setrobust(attr?.value?.toCPointer<ByteVar>(), robust)

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pthread_timedjoin_np(thread.toInt(), retval?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_dup3(src, dst, flags)

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_xuname(nmln, buf?.value?.toCPointer<ByteVar>())

public actual fun sendmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: SizeT, flags: CInt, timeout: Timespec?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun fhopen(fhp: Fhandle?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fhopen(fhp?.value?.toCPointer<ByteVar>(), flags)

public actual fun fhstat(fhp: Fhandle?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fhstat(fhp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun fhstatfs(fhp: Fhandle?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fhstatfs(fhp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun getfh(path: String?, fhp: Fhandle?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_getfh(path, fhp?.value?.toCPointer<ByteVar>())

public actual fun lgetfh(path: String?, fhp: Fhandle?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_lgetfh(path, fhp?.value?.toCPointer<ByteVar>())

public actual fun getfsstat(buf: Statfs?, bufsize: CLong, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_getfsstat(buf?.value?.toCPointer<ByteVar>(), bufsize, mode)

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), mode)

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_mount(type, dir, flags, data?.value?.toCPointer<ByteVar>())

public actual fun nmount(iov: Iovec?, niov: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_nmount(iov?.value?.toCPointer<ByteVar>(), niov, flags)

public actual fun rfork(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_rfork(flags)

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CpusetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cpuset_getaffinity(level, which, id, setsize, mask?.value?.toCPointer<ByteVar>())

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CpusetT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cpuset_setaffinity(level, which, id, setsize, mask?.value?.toCPointer<ByteVar>())

public actual fun cpuset(setid: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cpuset(setid?.value?.toCPointer<ByteVar>())

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cpuset_getid(level, which, id, setid?.value?.toCPointer<ByteVar>())

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: io.github.kotlinmania.libc.CpusetidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cpuset_setid(which, id, setid)

public actual fun capEnter(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_enter()

public actual fun capGetmode(modep: CUint?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_getmode(modep?.value?.toCPointer<ByteVar>())

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: CUint?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_fcntls_get(fd, fcntlrightsp?.value?.toCPointer<ByteVar>())

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_fcntls_limit(fd, fcntlrights)

public actual fun capIoctlsGet(fd: CInt, cmds: CUlong?, maxcmds: ULong): Long =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_ioctls_get(fd, cmds?.value?.toCPointer<ByteVar>(), maxcmds)

public actual fun capIoctlsLimit(fd: CInt, cmds: CUlong?, ncmds: ULong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_ioctls_limit(fd, cmds?.value?.toCPointer<ByteVar>(), ncmds)

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: CapRightsT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_rights_get(version, fd, rightsp?.value?.toCPointer<ByteVar>())

public actual fun capRightsIsValid(rights: CapRightsT?): Boolean =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_rights_is_valid(rights?.value?.toCPointer<ByteVar>())

public actual fun capRightsLimit(fd: CInt, rights: CapRightsT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_rights_limit(fd, rights?.value?.toCPointer<ByteVar>())

public actual fun capRightsMerge(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_rights_merge(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun capRightsRemove(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_rights_remove(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun capRightsContains(big: CapRightsT?, little: CapRightsT?): Boolean =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_rights_contains(big?.value?.toCPointer<ByteVar>(), little?.value?.toCPointer<ByteVar>())

public actual fun capSandboxed(): Boolean =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_cap_sandboxed()

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun ffs(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_ffs(value)

public actual fun ffsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_ffsll(value)

public actual fun fls(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fls(value)

public actual fun flsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_flsl(value)

public actual fun flsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_flsll(value)

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_malloc_stats_print(writeCb.toInt(), cbopaque?.value?.toCPointer<ByteVar>(), opt)
}

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_mallctl(name, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun mallctlnametomib(name: String?, mibp: SizeT?, miplen: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_mallctlnametomib(name, mibp?.value?.toCPointer<ByteVar>(), miplen?.value?.toCPointer<ByteVar>())

public actual fun mallctlbymib(mib: SizeT?, mible: SizeT, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_mallctlbymib(mib?.value?.toCPointer<ByteVar>(), mible, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun mallocx(size: SizeT, flags: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_mallocx(size, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_rallocx(ptr?.value?.toCPointer<ByteVar>(), size, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_xallocx(ptr?.value?.toCPointer<ByteVar>(), size, extra, flags)

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sallocx(ptr?.value?.toCPointer<ByteVar>(), flags)

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_dallocx(ptr?.value?.toCPointer<ByteVar>(), flags)
}

public actual fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sdallocx(ptr?.value?.toCPointer<ByteVar>(), size, flags)
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_nallocx(size, flags)

public actual fun procctl(idtype: io.github.kotlinmania.libc.IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procctl(idtype, id, cmd, data?.value?.toCPointer<ByteVar>())

public actual fun getpagesize(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_getpagesize()

public actual fun getpagesizes(pagesize: SizeT?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_getpagesizes(pagesize?.value?.toCPointer<ByteVar>(), nelem)

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_clock_getcpuclockid2(arg1, arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_strchrnul(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_shm_create_largepage(path, flags, psind, allocPolicy, mode)

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_shm_rename(pathFrom, pathTo, flags)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memfd_create(name, flags)

public actual fun setaudit(auditinfo: AuditinfoT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_setaudit(auditinfo?.value?.toCPointer<ByteVar>())

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: CUlong?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_eventfd_read(fd, value?.value?.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_eventfd_write(fd, value)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_fdatasync(fd)

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_elf_aux_info(aux, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timingsafe_bcmp(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timingsafe_memcmp(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_umtx_op(obj?.value?.toCPointer<ByteVar>(), op, value, uaddr?.value?.toCPointer<ByteVar>(), uaddr2?.value?.toCPointer<ByteVar>())

public actual fun sctpPeeloff(s: CInt, id: io.github.kotlinmania.libc.SctpAssocT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_peeloff(s, id)

public actual fun sctpBindx(s: CInt, addrs: Sockaddr?, num: CInt, tpe: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_bindx(s, addrs?.value?.toCPointer<ByteVar>(), num, tpe)

public actual fun sctpConnectx(s: CInt, addrs: Sockaddr?, addrcnt: CInt, id: CUint?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_connectx(s, addrs?.value?.toCPointer<ByteVar>(), addrcnt, id?.value?.toCPointer<ByteVar>())

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_getaddrlen(family)

public actual fun sctpGetpaddrs(s: CInt, asocid: io.github.kotlinmania.libc.SctpAssocT, addrs: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_getpaddrs(s, asocid, addrs?.value?.toCPointer<ByteVar>())

public actual fun sctpFreepaddrs(addrs: Sockaddr?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_freepaddrs(addrs?.value?.toCPointer<ByteVar>())
}

public actual fun sctpGetladdrs(s: CInt, asocid: io.github.kotlinmania.libc.SctpAssocT, addrs: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_getladdrs(s, asocid, addrs?.value?.toCPointer<ByteVar>())

public actual fun sctpFreeladdrs(addrs: Sockaddr?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_freeladdrs(addrs?.value?.toCPointer<ByteVar>())
}

public actual fun sctpOptInfo(s: CInt, id: io.github.kotlinmania.libc.SctpAssocT, opt: CInt, arg: COpaquePointer?, size: SocklenT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_opt_info(s, id, opt, arg?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sctpSendv(sd: CInt, iov: Iovec?, iovcnt: CInt, addrs: Sockaddr?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_sendv(sd, iov?.value?.toCPointer<ByteVar>(), iovcnt, addrs?.value?.toCPointer<ByteVar>(), addrcnt, info?.value?.toCPointer<ByteVar>(), infolen, infotype, flags)

public actual fun sctpRecvv(sd: CInt, iov: Iovec?, iovcnt: CInt, from: Sockaddr?, fromlen: SocklenT?, info: COpaquePointer?, infolen: SocklenT?, infotype: CUint?, flags: CInt?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_sctp_recvv(sd, iov?.value?.toCPointer<ByteVar>(), iovcnt, from?.value?.toCPointer<ByteVar>(), fromlen?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), infolen?.value?.toCPointer<ByteVar>(), infotype?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timerfd_create(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timerfd_gettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timerfd_settime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun closefrom(lowfd: CInt) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_closefrom(lowfd)
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_close_range(lowfd, highfd, flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kcmp(pid1, pid2, type, idx1, idx2)

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_dlvsym(handle?.value?.toCPointer<ByteVar>(), symbol, version)?.let { COpaquePointer(it.toLong()) }

public actual fun memstatStrerror(error: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memstat_strerror(error)?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlAlloc(): MemoryTypeList? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memstat_mtl_alloc()?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memstat_mtl_first(list?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlNext(mtp: MemoryType?): MemoryType? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memstat_mtl_next(mtp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlFind(list: MemoryTypeList?, allocator: CInt, name: String?): MemoryType? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memstat_mtl_find(list?.value?.toCPointer<ByteVar>(), allocator, name)?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlFree(list: MemoryTypeList?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memstat_mtl_free(list?.value?.toCPointer<ByteVar>())
}

public actual fun memstatMtlGeterror(list: MemoryTypeList?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memstat_mtl_geterror(list?.value?.toCPointer<ByteVar>())

public actual fun memstatGetName(mtp: MemoryType?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_memstat_get_name(mtp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmDpcpuSetcpu(kd: KvmT?, cpu: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_dpcpu_setcpu(kd?.value?.toCPointer<ByteVar>(), cpu)

public actual fun kvmGetargv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_getargv(kd?.value?.toCPointer<ByteVar>(), p?.value?.toCPointer<ByteVar>(), nchr)?.let { COpaquePointer(it.toLong()) }

public actual fun kvmGetcptime(kd: KvmT?, cpTime: CLong?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_getcptime(kd?.value?.toCPointer<ByteVar>(), cpTime?.value?.toCPointer<ByteVar>())

public actual fun kvmGetenvv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_getenvv(kd?.value?.toCPointer<ByteVar>(), p?.value?.toCPointer<ByteVar>(), nchr)?.let { COpaquePointer(it.toLong()) }

public actual fun kvmGeterr(kd: KvmT?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_geterr(kd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmGetmaxcpu(kd: KvmT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_getmaxcpu(kd?.value?.toCPointer<ByteVar>())

public actual fun kvmGetncpus(kd: KvmT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_getncpus(kd?.value?.toCPointer<ByteVar>())

public actual fun kvmGetpcpu(kd: KvmT?, cpu: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_getpcpu(kd?.value?.toCPointer<ByteVar>(), cpu)?.let { COpaquePointer(it.toLong()) }

public actual fun kvmCounterU64Fetch(kd: KvmT?, base: CUlong): ULong =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_counter_u64fetch(kd?.value?.toCPointer<ByteVar>(), base)

public actual fun kvmGetswapinfo(kd: KvmT?, info: KvmSwap?, maxswap: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_getswapinfo(kd?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), maxswap, flags)

public actual fun kvmNative(kd: KvmT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_native(kd?.value?.toCPointer<ByteVar>())

public actual fun kvmNlist(kd: KvmT?, nl: Nlist?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_nlist(kd?.value?.toCPointer<ByteVar>(), nl?.value?.toCPointer<ByteVar>())

public actual fun kvmNlist2(kd: KvmT?, nl: KvmNlist?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_nlist2(kd?.value?.toCPointer<ByteVar>(), nl?.value?.toCPointer<ByteVar>())

public actual fun kvmReadZpcpu(kd: KvmT?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_read_zpcpu(kd?.value?.toCPointer<ByteVar>(), base, buf?.value?.toCPointer<ByteVar>(), size, cpu)

public actual fun kvmRead2(kd: KvmT?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kvm_read2(kd?.value?.toCPointer<ByteVar>(), addr, buf?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_namespace_to_string(attrnamespace, string?.value?.toCPointer<ByteVar>())

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_extattr_string_to_namespace(string, attrnamespace?.value?.toCPointer<ByteVar>())

public actual fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: InAddr?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_realhostname(host?.value?.toCPointer<ByteVar>(), hsize, ip?.value?.toCPointer<ByteVar>())

public actual fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: Sockaddr?, addrlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_realhostname_sa(host?.value?.toCPointer<ByteVar>(), hsize, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun kldIsloaded(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kld_isloaded(name)

public actual fun kldLoad(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kld_load(name)

public actual fun kinfoGetvmmap(pid: PidT, cntp: CInt?): KinfoVmentry? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_kinfo_getvmmap(pid, cntp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_hexdump(ptr?.value?.toCPointer<ByteVar>(), length, hdr, flags)
}

public actual fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_humanize_number(buf?.value?.toCPointer<ByteVar>(), len, number, suffix, scale, flags)

public actual fun getlocalbase(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_getlocalbase()?.let { COpaquePointer(it.toLong()) }

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: PidT?): io.github.kotlinmania.libc.Pidfh? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pidfile_open(path, mode, pidptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pidfileWrite(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pidfile_write(path?.value?.toCPointer<ByteVar>())

public actual fun pidfileClose(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pidfile_close(path?.value?.toCPointer<ByteVar>())

public actual fun pidfileRemove(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pidfile_remove(path?.value?.toCPointer<ByteVar>())

public actual fun pidfileFileno(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_pidfile_fileno(path?.value?.toCPointer<ByteVar>())

public actual fun procstatOpenSysctl(): Procstat? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_open_sysctl()?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: CInt): FilestatList? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getfiles(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), mmapped)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatFreefiles(procstat: Procstat?, head: FilestatList?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_freefiles(procstat?.value?.toCPointer<ByteVar>(), head?.value?.toCPointer<ByteVar>())
}

public actual fun procstatGetprocs(procstat: Procstat?, what: CInt, arg: CInt, count: CUint?): KinfoProc? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getprocs(procstat?.value?.toCPointer<ByteVar>(), what, arg, count?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_freeprocs(procstat?.value?.toCPointer<ByteVar>(), p?.value?.toCPointer<ByteVar>())
}

public actual fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: CUint?): KinfoVmentry? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getvmmap(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_freevmmap(procstat?.value?.toCPointer<ByteVar>(), vmmap?.value?.toCPointer<ByteVar>())
}

public actual fun procstatClose(procstat: Procstat?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_close(procstat?.value?.toCPointer<ByteVar>())
}

public actual fun procstatFreeargv(procstat: Procstat?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_freeargv(procstat?.value?.toCPointer<ByteVar>())
}

public actual fun procstatFreeenvv(procstat: Procstat?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_freeenvv(procstat?.value?.toCPointer<ByteVar>())
}

public actual fun procstatFreegroups(procstat: Procstat?, groups: GidT?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_freegroups(procstat?.value?.toCPointer<ByteVar>(), groups?.value?.toCPointer<ByteVar>())
}

public actual fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_freeptlwpinfo(procstat?.value?.toCPointer<ByteVar>(), pl?.value?.toCPointer<ByteVar>())
}

public actual fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getargv(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), nchr)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getenvv(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), nchr)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: CUint?): GidT? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getgroups(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getosrel(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), osrelp?.value?.toCPointer<ByteVar>())

public actual fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: COpaquePointer?, maxlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getpathname(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), pathname?.value?.toCPointer<ByteVar>(), maxlen)

public actual fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: CInt, rlimit: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getrlimit(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), which, rlimit?.value?.toCPointer<ByteVar>())

public actual fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: CUshort?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_getumask(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), maskp?.value?.toCPointer<ByteVar>())

public actual fun procstatOpenCore(filename: String?): Procstat? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_open_core(filename)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_open_kvm(nlistf, memf)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_get_socket_info(proc?.value?.toCPointer<ByteVar>(), fst?.value?.toCPointer<ByteVar>(), sock?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>())

public actual fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Vnstat?, errbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_get_vnode_info(proc?.value?.toCPointer<ByteVar>(), fst?.value?.toCPointer<ByteVar>(), vn?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>())

public actual fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_get_pts_info(proc?.value?.toCPointer<ByteVar>(), fst?.value?.toCPointer<ByteVar>(), pts?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>())

public actual fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_procstat_get_shm_info(proc?.value?.toCPointer<ByteVar>(), fst?.value?.toCPointer<ByteVar>(), shm?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timer_create(clockId, evp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timer_delete(timerid?.value?.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timer_getoverrun(timerid?.value?.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timer_gettime(timerid?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_timer_settime(timerid?.value?.toCPointer<ByteVar>(), flags, value?.value?.toCPointer<ByteVar>(), ovalue?.value?.toCPointer<ByteVar>())

public actual fun devstatGetnumdevs(kd: KvmT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_devstat_getnumdevs(kd?.value?.toCPointer<ByteVar>())

public actual fun devstatGetgeneration(kd: KvmT?): CLong =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_devstat_getgeneration(kd?.value?.toCPointer<ByteVar>())

public actual fun devstatGetversion(kd: KvmT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_devstat_getversion(kd?.value?.toCPointer<ByteVar>())

public actual fun devstatCheckversion(kd: KvmT?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_devstat_checkversion(kd?.value?.toCPointer<ByteVar>())

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: CInt?, numSelections: CInt?, selectGeneration: CLong?, currentGeneration: CLong, devices: Devstat?, numdevs: CInt, matches: DevstatMatch?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_devstat_selectdevs(devSelect?.value?.toCPointer<ByteVar>(), numSelected?.value?.toCPointer<ByteVar>(), numSelections?.value?.toCPointer<ByteVar>(), selectGeneration?.value?.toCPointer<ByteVar>(), currentGeneration, devices?.value?.toCPointer<ByteVar>(), numdevs, matches?.value?.toCPointer<ByteVar>(), numMatches, devSelections?.value?.toCPointer<ByteVar>(), numDevSelections, selectMode.toInt(), maxshowdevs, perfSelect)

public actual fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: CInt?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_freebsd_mod_devstat_buildmatch(matchStr?.value?.toCPointer<ByteVar>(), matches?.value?.toCPointer<ByteVar>(), numMatches?.value?.toCPointer<ByteVar>())
