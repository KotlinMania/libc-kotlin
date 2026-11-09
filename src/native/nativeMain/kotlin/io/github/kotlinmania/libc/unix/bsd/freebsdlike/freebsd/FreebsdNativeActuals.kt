@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fhlink(fhp: COpaquePointer?, to: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fhlink(fhp?.value?.toCPointer<ByteVar>(), to)

public actual fun fhlinkat(fhp: COpaquePointer?, tofd: CInt, to: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fhlinkat(fhp?.value?.toCPointer<ByteVar>(), tofd, to)

public actual fun fhreadlink(fhp: COpaquePointer?, buf: COpaquePointer?, bufsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fhreadlink(fhp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun getfhat(fd: CInt, path: COpaquePointer?, fhp: COpaquePointer?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_getfhat(fd, path?.value?.toCPointer<ByteVar>(), fhp?.value?.toCPointer<ByteVar>(), flag)

public actual fun error(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_error()?.let { COpaquePointer(it.toLong()) }

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioCancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioFsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReadv(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioReadv(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioReturn(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioSuspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioWrite(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWritev(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioWritev(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun copyFileRange(infd: CInt, inoffp: COpaquePointer?, outfd: CInt, outoffp: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_copyFileRange(infd, inoffp?.value?.toCPointer<ByteVar>(), outfd, outoffp?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_devnameR(dev, mode, buf?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrDeleteFd(fd, attrnamespace, attrname)

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrDeleteFile(path, attrnamespace, attrname)

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrDeleteLink(path, attrnamespace, attrname)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrGetFd(fd, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrGetFile(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrGetLink(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrListFd(fd, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrListFile(path, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrListLink(path, attrnamespace, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrSetFd(fd, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrSetFile(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrSetLink(path, attrnamespace, attrname, data?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: COpaquePointer?, flags: CInt, rmsr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fspacectl(fd, cmd, rqsr?.value?.toCPointer<ByteVar>(), flags, rmsr?.value?.toCPointer<ByteVar>())

public actual fun jail(jail: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_jail(jail?.value?.toCPointer<ByteVar>())

public actual fun jailAttach(jid: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_jailAttach(jid)

public actual fun jailRemove(jid: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_jailRemove(jid)

public actual fun jailGet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_jailGet(iov?.value?.toCPointer<ByteVar>(), niov, flags)

public actual fun jailSet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_jailSet(iov?.value?.toCPointer<ByteVar>(), niov, flags)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_lioListio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun getutxuser(user: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_getutxuser(user)?.let { COpaquePointer(it.toLong()) }

public actual fun setutxdb(type: CInt, file: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_setutxdb(type, file)

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_aioWaitcomplete(iocbp?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_mqGetfdNp(mqd.toLong().toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_ptsnameR(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_ftok(pathname, projId)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_semget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt): CInt =
    0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_msgget(key, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun cfmakesane(termios: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_cfmakesane(termios?.value?.toCPointer<ByteVar>())
}

public actual fun pdfork(fdp: COpaquePointer?, flags: CInt): PidT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pdfork(fdp?.value?.toCPointer<ByteVar>(), flags)

public actual fun pdgetpid(fd: CInt, pidp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pdgetpid(fd, pidp?.value?.toCPointer<ByteVar>())

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pdkill(fd, signum)

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_rtprioThread(function, lwpid, rtp?.value?.toCPointer<ByteVar>())

public actual fun uuidgen(store: COpaquePointer?, count: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_uuidgen(store?.value?.toCPointer<ByteVar>(), count)

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_thrKill(id, sig)

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_thrKill2(pid, id, sig)

public actual fun thrSelf(tid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_thrSelf(tid?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetthreadidNp(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadGetthreadidNp()

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadGetaffinityNp(td.toLong().toCPointer<ByteVar>(), cpusetsize, cpusetp?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadSetaffinityNp(td.toLong().toCPointer<ByteVar>(), cpusetsize, cpusetp?.value?.toCPointer<ByteVar>())

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_schedGetaffinity(pid, cpusetsz, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_schedSetaffinity(pid, cpusetsz, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_schedGetcpu()

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadMutexConsistent(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadMutexattrGetrobust(attr?.value?.toCPointer<ByteVar>(), robust?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadMutexattrSetrobust(attr?.value?.toCPointer<ByteVar>(), robust)

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pthreadTimedjoinNp(thread.toLong().toCPointer<ByteVar>(), retval?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_dup3(src, dst, flags)

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_xuname(nmln, buf?.value?.toCPointer<ByteVar>())

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt, timeout: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun fhopen(fhp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fhopen(fhp?.value?.toCPointer<ByteVar>(), flags)

public actual fun fhstat(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fhstat(fhp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun fhstatfs(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fhstatfs(fhp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun getfh(path: String?, fhp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_getfh(path, fhp?.value?.toCPointer<ByteVar>())

public actual fun lgetfh(path: String?, fhp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_lgetfh(path, fhp?.value?.toCPointer<ByteVar>())

public actual fun getfsstat(buf: COpaquePointer?, bufsize: CLong, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_getfsstat(buf?.value?.toCPointer<ByteVar>(), bufsize, mode)

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), mode)

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_mount(type, dir, flags, data?.value?.toCPointer<ByteVar>())

public actual fun nmount(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_nmount(iov?.value?.toCPointer<ByteVar>(), niov, flags)

public actual fun setproctitle(fmt: String?) {
}

public actual fun rfork(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_rfork(flags)

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_cpusetGetaffinity(level, which, id, setsize, mask?.value?.toCPointer<ByteVar>())

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_cpusetSetaffinity(level, which, id, setsize, mask?.value?.toCPointer<ByteVar>())

public actual fun cpuset(setid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_cpuset(setid?.value?.toCPointer<ByteVar>())

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_cpusetGetid(level, which, id, setid?.value?.toCPointer<ByteVar>())

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_cpusetSetid(which, id, setid)

public actual fun capEnter(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capEnter()

public actual fun capGetmode(modep: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capGetmode(modep?.value?.toCPointer<ByteVar>())

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capFcntlsGet(fd, fcntlrightsp?.value?.toCPointer<ByteVar>())

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capFcntlsLimit(fd, fcntlrights)

public actual fun capIoctlsGet(fd: CInt, cmds: COpaquePointer?, maxcmds: ULong): Long =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capIoctlsGet(fd, cmds?.value?.toCPointer<ByteVar>(), maxcmds)

public actual fun capIoctlsLimit(fd: CInt, cmds: COpaquePointer?, ncmds: ULong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capIoctlsLimit(fd, cmds?.value?.toCPointer<ByteVar>(), ncmds)

public actual fun capRightsInit(version: CInt, rights: COpaquePointer?): COpaquePointer? =
    null

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capRightsGet(version, fd, rightsp?.value?.toCPointer<ByteVar>())

public actual fun capRightsSet(rights: COpaquePointer?): COpaquePointer? =
    null

public actual fun capRightsClear(rights: COpaquePointer?): COpaquePointer? =
    null

public actual fun capRightsIsSet(rights: COpaquePointer?): Boolean =
    false

public actual fun capRightsIsValid(rights: COpaquePointer?): Boolean =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capRightsIsValid(rights?.value?.toCPointer<ByteVar>())

public actual fun capRightsLimit(fd: CInt, rights: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capRightsLimit(fd, rights?.value?.toCPointer<ByteVar>())

public actual fun capRightsMerge(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capRightsMerge(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun capRightsRemove(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capRightsRemove(dst?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun capRightsContains(big: COpaquePointer?, little: COpaquePointer?): Boolean =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capRightsContains(big?.value?.toCPointer<ByteVar>(), little?.value?.toCPointer<ByteVar>())

public actual fun capSandboxed(): Boolean =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_capSandboxed()

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun ffs(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_ffs(value)

public actual fun ffsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_ffsll(value)

public actual fun fls(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fls(value)

public actual fun flsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_flsl(value)

public actual fun flsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_flsll(value)

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_mallocStatsPrint(0L.toCPointer<ByteVar>(), cbopaque?.value?.toCPointer<ByteVar>(), opt)
}

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_mallctl(name, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun mallctlnametomib(name: String?, mibp: COpaquePointer?, miplen: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_mallctlnametomib(name, mibp?.value?.toCPointer<ByteVar>(), miplen?.value?.toCPointer<ByteVar>())

public actual fun mallctlbymib(mib: COpaquePointer?, mible: SizeT, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_mallctlbymib(mib?.value?.toCPointer<ByteVar>(), mible, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun mallocx(size: SizeT, flags: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_mallocx(size, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_rallocx(ptr?.value?.toCPointer<ByteVar>(), size, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_xallocx(ptr?.value?.toCPointer<ByteVar>(), size, extra, flags)

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sallocx(ptr?.value?.toCPointer<ByteVar>(), flags)

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_dallocx(ptr?.value?.toCPointer<ByteVar>(), flags)
}

public actual fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sdallocx(ptr?.value?.toCPointer<ByteVar>(), size, flags)
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_nallocx(size, flags)

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procctl(idtype, id, cmd, data?.value?.toCPointer<ByteVar>())

public actual fun getpagesize(): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_getpagesize()

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_getpagesizes(pagesize?.value?.toCPointer<ByteVar>(), nelem)

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_clockGetcpuclockid2(arg1, arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_strchrnul(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_shmCreateLargepage(path, flags, psind, allocPolicy, mode)

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_shmRename(pathFrom, pathTo, flags)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memfdCreate(name, flags)

public actual fun setaudit(auditinfo: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_setaudit(auditinfo?.value?.toCPointer<ByteVar>())

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_eventfdRead(fd, value?.value?.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_eventfdWrite(fd, value)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_fdatasync(fd)

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_elfAuxInfo(aux, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun setproctitleFast(fmt: String?) {
}

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timingsafeBcmp(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timingsafeMemcmp(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>(), len)

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_umtxOp(obj?.value?.toCPointer<ByteVar>(), op, value, uaddr?.value?.toCPointer<ByteVar>(), uaddr2?.value?.toCPointer<ByteVar>())

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpPeeloff(s, id)

public actual fun sctpBindx(s: CInt, addrs: COpaquePointer?, num: CInt, tpe: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpBindx(s, addrs?.value?.toCPointer<ByteVar>(), num, tpe)

public actual fun sctpConnectx(s: CInt, addrs: COpaquePointer?, addrcnt: CInt, id: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpConnectx(s, addrs?.value?.toCPointer<ByteVar>(), addrcnt, id?.value?.toCPointer<ByteVar>())

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpGetaddrlen(family)

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpGetpaddrs(s, asocid, addrs?.value?.toCPointer<ByteVar>())

public actual fun sctpFreepaddrs(addrs: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpFreepaddrs(addrs?.value?.toCPointer<ByteVar>())
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpGetladdrs(s, asocid, addrs?.value?.toCPointer<ByteVar>())

public actual fun sctpFreeladdrs(addrs: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpFreeladdrs(addrs?.value?.toCPointer<ByteVar>())
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpOptInfo(s, id, opt, arg?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sctpSendv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, addrs: COpaquePointer?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpSendv(sd, iov?.value?.toCPointer<ByteVar>(), iovcnt, addrs?.value?.toCPointer<ByteVar>(), addrcnt, info?.value?.toCPointer<ByteVar>(), infolen, infotype, flags)

public actual fun sctpRecvv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, from: COpaquePointer?, fromlen: COpaquePointer?, info: COpaquePointer?, infolen: COpaquePointer?, infotype: COpaquePointer?, flags: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_sctpRecvv(sd, iov?.value?.toCPointer<ByteVar>(), iovcnt, from?.value?.toCPointer<ByteVar>(), fromlen?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), infolen?.value?.toCPointer<ByteVar>(), infotype?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timerfdGettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timerfdSettime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun closefrom(lowfd: CInt) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_closefrom(lowfd)
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_closeRange(lowfd, highfd, flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kcmp(pid1, pid2, type, idx1, idx2)

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_dlvsym(handle?.value?.toCPointer<ByteVar>(), symbol, version)?.let { COpaquePointer(it.toLong()) }

public actual fun memstatStrerror(error: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memstatStrerror(error)?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlAlloc(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memstatMtlAlloc()?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlFirst(list: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memstatMtlFirst(list?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlNext(mtp: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memstatMtlNext(mtp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlFind(list: COpaquePointer?, allocator: CInt, name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memstatMtlFind(list?.value?.toCPointer<ByteVar>(), allocator, name)?.let { COpaquePointer(it.toLong()) }

public actual fun memstatMtlFree(list: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memstatMtlFree(list?.value?.toCPointer<ByteVar>())
}

public actual fun memstatMtlGeterror(list: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memstatMtlGeterror(list?.value?.toCPointer<ByteVar>())

public actual fun memstatGetName(mtp: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_memstatGetName(mtp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmDpcpuSetcpu(kd: COpaquePointer?, cpu: CUint): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmDpcpuSetcpu(kd?.value?.toCPointer<ByteVar>(), cpu)

public actual fun kvmGetargv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmGetargv(kd?.value?.toCPointer<ByteVar>(), p?.value?.toCPointer<ByteVar>(), nchr)?.let { COpaquePointer(it.toLong()) }

public actual fun kvmGetcptime(kd: COpaquePointer?, cpTime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmGetcptime(kd?.value?.toCPointer<ByteVar>(), cpTime?.value?.toCPointer<ByteVar>())

public actual fun kvmGetenvv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmGetenvv(kd?.value?.toCPointer<ByteVar>(), p?.value?.toCPointer<ByteVar>(), nchr)?.let { COpaquePointer(it.toLong()) }

public actual fun kvmGeterr(kd: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmGeterr(kd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun kvmGetmaxcpu(kd: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmGetmaxcpu(kd?.value?.toCPointer<ByteVar>())

public actual fun kvmGetncpus(kd: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmGetncpus(kd?.value?.toCPointer<ByteVar>())

public actual fun kvmGetpcpu(kd: COpaquePointer?, cpu: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmGetpcpu(kd?.value?.toCPointer<ByteVar>(), cpu)?.let { COpaquePointer(it.toLong()) }

public actual fun kvmCounterU64Fetch(kd: COpaquePointer?, base: CUlong): ULong =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmCounterU64Fetch(kd?.value?.toCPointer<ByteVar>(), base)

public actual fun kvmGetswapinfo(kd: COpaquePointer?, info: COpaquePointer?, maxswap: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmGetswapinfo(kd?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), maxswap, flags)

public actual fun kvmNative(kd: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmNative(kd?.value?.toCPointer<ByteVar>())

public actual fun kvmNlist(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmNlist(kd?.value?.toCPointer<ByteVar>(), nl?.value?.toCPointer<ByteVar>())

public actual fun kvmNlist2(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmNlist2(kd?.value?.toCPointer<ByteVar>(), nl?.value?.toCPointer<ByteVar>())

public actual fun kvmReadZpcpu(kd: COpaquePointer?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmReadZpcpu(kd?.value?.toCPointer<ByteVar>(), base, buf?.value?.toCPointer<ByteVar>(), size, cpu)

public actual fun kvmRead2(kd: COpaquePointer?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kvmRead2(kd?.value?.toCPointer<ByteVar>(), addr, buf?.value?.toCPointer<ByteVar>(), nbytes)

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrNamespaceToString(attrnamespace, string?.value?.toCPointer<ByteVar>())

public actual fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_extattrStringToNamespace(string, attrnamespace?.value?.toCPointer<ByteVar>())

public actual fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_realhostname(host?.value?.toCPointer<ByteVar>(), hsize, ip?.value?.toCPointer<ByteVar>())

public actual fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: COpaquePointer?, addrlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_realhostnameSa(host?.value?.toCPointer<ByteVar>(), hsize, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun kldIsloaded(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kldIsloaded(name)

public actual fun kldLoad(name: String?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kldLoad(name)

public actual fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_kinfoGetvmmap(pid, cntp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_hexdump(ptr?.value?.toCPointer<ByteVar>(), length, hdr, flags)
}

public actual fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_humanizeNumber(buf?.value?.toCPointer<ByteVar>(), len, number, suffix, scale, flags)

public actual fun flopen(path: String?, flags: CInt): CInt =
    0

public actual fun flopenat(fd: CInt, path: String?, flags: CInt): CInt =
    0

public actual fun getlocalbase(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_getlocalbase()?.let { COpaquePointer(it.toLong()) }

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pidfileOpen(path, mode, pidptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pidfileWrite(path: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pidfileWrite(path?.value?.toCPointer<ByteVar>())

public actual fun pidfileClose(path: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pidfileClose(path?.value?.toCPointer<ByteVar>())

public actual fun pidfileRemove(path: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pidfileRemove(path?.value?.toCPointer<ByteVar>())

public actual fun pidfileFileno(path: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_pidfileFileno(path?.value?.toCPointer<ByteVar>())

public actual fun procstatOpenSysctl(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatOpenSysctl()?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetfiles(procstat: COpaquePointer?, kp: COpaquePointer?, mmapped: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetfiles(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), mmapped)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatFreefiles(procstat: COpaquePointer?, head: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatFreefiles(procstat?.value?.toCPointer<ByteVar>(), head?.value?.toCPointer<ByteVar>())
}

public actual fun procstatGetprocs(procstat: COpaquePointer?, what: CInt, arg: CInt, count: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetprocs(procstat?.value?.toCPointer<ByteVar>(), what, arg, count?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun procstatFreeprocs(procstat: COpaquePointer?, p: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatFreeprocs(procstat?.value?.toCPointer<ByteVar>(), p?.value?.toCPointer<ByteVar>())
}

public actual fun procstatGetvmmap(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetvmmap(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun procstatFreevmmap(procstat: COpaquePointer?, vmmap: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatFreevmmap(procstat?.value?.toCPointer<ByteVar>(), vmmap?.value?.toCPointer<ByteVar>())
}

public actual fun procstatClose(procstat: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatClose(procstat?.value?.toCPointer<ByteVar>())
}

public actual fun procstatFreeargv(procstat: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatFreeargv(procstat?.value?.toCPointer<ByteVar>())
}

public actual fun procstatFreeenvv(procstat: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatFreeenvv(procstat?.value?.toCPointer<ByteVar>())
}

public actual fun procstatFreegroups(procstat: COpaquePointer?, groups: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatFreegroups(procstat?.value?.toCPointer<ByteVar>(), groups?.value?.toCPointer<ByteVar>())
}

public actual fun procstatFreeptlwpinfo(procstat: COpaquePointer?, pl: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatFreeptlwpinfo(procstat?.value?.toCPointer<ByteVar>(), pl?.value?.toCPointer<ByteVar>())
}

public actual fun procstatGetargv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetargv(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), nchr)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetenvv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetenvv(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), nchr)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetgroups(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetgroups(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetosrel(procstat: COpaquePointer?, kp: COpaquePointer?, osrelp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetosrel(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), osrelp?.value?.toCPointer<ByteVar>())

public actual fun procstatGetpathname(procstat: COpaquePointer?, kp: COpaquePointer?, pathname: COpaquePointer?, maxlen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetpathname(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), pathname?.value?.toCPointer<ByteVar>(), maxlen)

public actual fun procstatGetrlimit(procstat: COpaquePointer?, kp: COpaquePointer?, which: CInt, rlimit: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetrlimit(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), which, rlimit?.value?.toCPointer<ByteVar>())

public actual fun procstatGetumask(procstat: COpaquePointer?, kp: COpaquePointer?, maskp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetumask(procstat?.value?.toCPointer<ByteVar>(), kp?.value?.toCPointer<ByteVar>(), maskp?.value?.toCPointer<ByteVar>())

public actual fun procstatOpenCore(filename: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatOpenCore(filename)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatOpenKvm(nlistf, memf)?.let { COpaquePointer(it.toLong()) }

public actual fun procstatGetSocketInfo(proc: COpaquePointer?, fst: COpaquePointer?, sock: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetSocketInfo(proc?.value?.toCPointer<ByteVar>(), fst?.value?.toCPointer<ByteVar>(), sock?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>())

public actual fun procstatGetVnodeInfo(proc: COpaquePointer?, fst: COpaquePointer?, vn: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetVnodeInfo(proc?.value?.toCPointer<ByteVar>(), fst?.value?.toCPointer<ByteVar>(), vn?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>())

public actual fun procstatGetPtsInfo(proc: COpaquePointer?, fst: COpaquePointer?, pts: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetPtsInfo(proc?.value?.toCPointer<ByteVar>(), fst?.value?.toCPointer<ByteVar>(), pts?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>())

public actual fun procstatGetShmInfo(proc: COpaquePointer?, fst: COpaquePointer?, shm: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_procstatGetShmInfo(proc?.value?.toCPointer<ByteVar>(), fst?.value?.toCPointer<ByteVar>(), shm?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timerCreate(clockId, evp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timerGettime(timerid.toLong().toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_timerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, value?.value?.toCPointer<ByteVar>(), ovalue?.value?.toCPointer<ByteVar>())

public actual fun devstatGetnumdevs(kd: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_devstatGetnumdevs(kd?.value?.toCPointer<ByteVar>())

public actual fun devstatGetgeneration(kd: COpaquePointer?): CLong =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_devstatGetgeneration(kd?.value?.toCPointer<ByteVar>())

public actual fun devstatGetversion(kd: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_devstatGetversion(kd?.value?.toCPointer<ByteVar>())

public actual fun devstatCheckversion(kd: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_devstatCheckversion(kd?.value?.toCPointer<ByteVar>())

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: COpaquePointer?, numSelections: COpaquePointer?, selectGeneration: COpaquePointer?, currentGeneration: CLong, devices: COpaquePointer?, numdevs: CInt, matches: COpaquePointer?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    0

public actual fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libc_unix_bsd_freebsdlike_freebsd_devstatBuildmatch(matchStr?.value?.toCPointer<ByteVar>(), matches?.value?.toCPointer<ByteVar>(), numMatches?.value?.toCPointer<ByteVar>())
