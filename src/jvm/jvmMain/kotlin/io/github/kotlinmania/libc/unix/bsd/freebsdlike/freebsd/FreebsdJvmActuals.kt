@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object UnixBsdFreebsdlikeFreebsdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fhlink(fhp: Long, to: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fhlinkat(fhp: Long, tofd: Int, to: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fhreadlink(fhp: Long, buf: Long, bufsize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_getfhat(fd: Int, path: Long, fhp: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_error(): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioError(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioReadv(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioWritev(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_copyFileRange(infd: Int, inoffp: Long, outfd: Int, outoffp: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_devnameR(dev: Int, mode: Short, buf: Long, len: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrListFd(fd: Int, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrListFile(path: String?, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrListLink(path: String?, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fspacectl(fd: Int, cmd: Int, rqsr: Long, flags: Int, rmsr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_jail(jail: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_jailAttach(jid: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_jailRemove(jid: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_jailGet(iov: Long, niov: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_jailSet(iov: Long, niov: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_getutxuser(user: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_setutxdb(type: Int, file: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_aioWaitcomplete(iocbp: Long, timeout: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_mqGetfdNp(mqd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_waitid(idtype: Int, id: Long, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_ptsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_ftok(pathname: String?, projId: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_shmget(key: Long, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_shmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_shmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_semget(key: Long, nsems: Int, semflg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_semctl(semid: Int, semnum: Int, cmd: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_semop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_msgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_msgget(key: Long, msgflg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_cfmakesane(termios: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pdfork(fdp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pdgetpid(fd: Int, pidp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pdkill(fd: Int, signum: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_rtprioThread(function: Int, lwpid: Int, rtp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_uuidgen(store: Long, count: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_thrKill(id: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_thrKill2(pid: Int, id: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_thrSelf(tid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadGetthreadidNp(): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadGetaffinityNp(td: Long, cpusetsize: Long, cpusetp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadSetaffinityNp(td: Long, cpusetsize: Long, cpusetp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_schedGetaffinity(pid: Int, cpusetsz: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_schedSetaffinity(pid: Int, cpusetsz: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_schedGetcpu(): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadMutexattrGetrobust(attr: Long, robust: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadMutexattrSetrobust(attr: Long, robust: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_statfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_dup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_xuname(nmln: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sendmmsg(sockfd: Int, msgvec: Long, vlen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_recvmmsg(sockfd: Int, msgvec: Long, vlen: Long, flags: Int, timeout: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fhopen(fhp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fhstat(fhp: Long, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fhstatfs(fhp: Long, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_getfh(path: String?, fhp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_lgetfh(path: String?, fhp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_getfsstat(buf: Long, bufsize: Long, mode: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_getmntinfo(mntbufp: Long, mode: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_mount(type: String?, dir: String?, flags: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_nmount(iov: Long, niov: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_setproctitle(fmt: String?, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_rfork(flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_cpusetGetaffinity(level: Int, which: Int, id: Long, setsize: Long, mask: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_cpusetSetaffinity(level: Int, which: Int, id: Long, setsize: Long, mask: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_cpuset(setid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_cpusetGetid(level: Int, which: Int, id: Long, setid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_cpusetSetid(which: Int, id: Long, setid: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capEnter(): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capGetmode(modep: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capFcntlsGet(fd: Int, fcntlrightsp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capFcntlsLimit(fd: Int, fcntlrights: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capIoctlsGet(fd: Int, cmds: Long, maxcmds: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capIoctlsLimit(fd: Int, cmds: Long, ncmds: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsInit(version: Int, rights: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsGet(version: Int, fd: Int, rightsp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsSet(rights: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsClear(rights: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsIsSet(rights: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Boolean

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsIsValid(rights: Long): Boolean

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsLimit(fd: Int, rights: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsMerge(dst: Long, src: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsRemove(dst: Long, src: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capRightsContains(big: Long, little: Long): Boolean

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_capSandboxed(): Boolean

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_reallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_ffs(value: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_ffsl(value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_ffsll(value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fls(value: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_flsl(value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_flsll(value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_mallocStatsPrint(writeCb: Long, cbopaque: Long, opt: String?)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_mallctl(name: String?, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_mallctlnametomib(name: String?, mibp: Long, miplen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_mallctlbymib(mib: Long, mible: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_mallocx(size: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_rallocx(ptr: Long, size: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_xallocx(ptr: Long, size: Long, extra: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sallocx(ptr: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_dallocx(ptr: Long, flags: Int)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sdallocx(ptr: Long, size: Long, flags: Int)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_nallocx(size: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procctl(idtype: Int, id: Long, cmd: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_getpagesize(): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_getpagesizes(pagesize: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_clockGetcpuclockid2(arg1: Long, arg2: Int, arg3: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_strchrnul(s: String?, c: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_shmCreateLargepage(path: String?, flags: Int, psind: Int, allocPolicy: Int, mode: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_shmRename(pathFrom: String?, pathTo: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memfdCreate(name: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_setaudit(auditinfo: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_eventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_eventfdRead(fd: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_eventfdWrite(fd: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_elfAuxInfo(aux: Int, buf: Long, buflen: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_setproctitleFast(fmt: String?, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timingsafeBcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timingsafeMemcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_umtxOp(obj: Long, op: Int, value: Long, uaddr: Long, uaddr2: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpPeeloff(s: Int, id: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpBindx(s: Int, addrs: Long, num: Int, tpe: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpConnectx(s: Int, addrs: Long, addrcnt: Int, id: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpGetaddrlen(family: Byte): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpGetpaddrs(s: Int, asocid: Int, addrs: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpFreepaddrs(addrs: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpGetladdrs(s: Int, asocid: Int, addrs: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpFreeladdrs(addrs: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpOptInfo(s: Int, id: Int, opt: Int, arg: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpSendv(sd: Int, iov: Long, iovcnt: Int, addrs: Long, addrcnt: Int, info: Long, infolen: Int, infotype: Int, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_sctpRecvv(sd: Int, iov: Long, iovcnt: Int, from: Long, fromlen: Long, info: Long, infolen: Long, infotype: Long, flags: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_closefrom(lowfd: Int)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_closeRange(lowfd: Int, highfd: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_execvpe(file: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kcmp(pid1: Int, pid2: Int, type: Int, idx1: Long, idx2: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_dlvsym(handle: Long, symbol: String?, version: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memstatStrerror(error: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memstatMtlAlloc(): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memstatMtlFirst(list: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memstatMtlNext(mtp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memstatMtlFind(list: Long, allocator: Int, name: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memstatMtlFree(list: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memstatMtlGeterror(list: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_memstatGetName(mtp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmDpcpuSetcpu(kd: Long, cpu: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmGetargv(kd: Long, p: Long, nchr: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmGetcptime(kd: Long, cpTime: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmGetenvv(kd: Long, p: Long, nchr: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmGeterr(kd: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmGetmaxcpu(kd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmGetncpus(kd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmGetpcpu(kd: Long, cpu: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmCounterU64Fetch(kd: Long, base: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmGetswapinfo(kd: Long, info: Long, maxswap: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmNative(kd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmNlist(kd: Long, nl: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmNlist2(kd: Long, nl: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmReadZpcpu(kd: Long, base: Long, buf: Long, size: Long, cpu: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kvmRead2(kd: Long, addr: Long, buf: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrNamespaceToString(attrnamespace: Int, string: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_extattrStringToNamespace(string: String?, attrnamespace: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_realhostname(host: Long, hsize: Long, ip: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_realhostnameSa(host: Long, hsize: Long, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kldIsloaded(name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kldLoad(name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_kinfoGetvmmap(pid: Int, cntp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_hexdump(ptr: Long, length: Int, hdr: String?, flags: Int)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_humanizeNumber(buf: Long, len: Long, number: Long, suffix: String?, scale: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_flopen(path: String?, flags: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_flopenat(fd: Int, path: String?, flags: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_getlocalbase(): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pidfileOpen(path: String?, mode: Short, pidptr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pidfileWrite(path: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pidfileClose(path: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pidfileRemove(path: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_pidfileFileno(path: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatOpenSysctl(): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetfiles(procstat: Long, kp: Long, mmapped: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatFreefiles(procstat: Long, head: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetprocs(procstat: Long, what: Int, arg: Int, count: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatFreeprocs(procstat: Long, p: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetvmmap(procstat: Long, kp: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatFreevmmap(procstat: Long, vmmap: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatClose(procstat: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatFreeargv(procstat: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatFreeenvv(procstat: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatFreegroups(procstat: Long, groups: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatFreeptlwpinfo(procstat: Long, pl: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetargv(procstat: Long, kp: Long, nchr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetenvv(procstat: Long, kp: Long, nchr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetgroups(procstat: Long, kp: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetosrel(procstat: Long, kp: Long, osrelp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetpathname(procstat: Long, kp: Long, pathname: Long, maxlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetrlimit(procstat: Long, kp: Long, which: Int, rlimit: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetumask(procstat: Long, kp: Long, maskp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatOpenCore(filename: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatOpenKvm(nlistf: String?, memf: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetSocketInfo(proc: Long, fst: Long, sock: Long, errbuf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetVnodeInfo(proc: Long, fst: Long, vn: Long, errbuf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetPtsInfo(proc: Long, fst: Long, pts: Long, errbuf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_procstatGetShmInfo(proc: Long, fst: Long, shm: Long, errbuf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timerCreate(clockId: Int, evp: Long, timerid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timerDelete(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timerGettime(timerid: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_timerSettime(timerid: Long, flags: Int, value: Long, ovalue: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_devstatGetnumdevs(kd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_devstatGetgeneration(kd: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_devstatGetversion(kd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_devstatCheckversion(kd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_freebsd_devstatBuildmatch(matchStr: Long, matches: Long, numMatches: Long): Int
}

public actual fun fhlink(fhp: COpaquePointer?, to: String?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fhlink((fhp?.value ?: 0L), to)

public actual fun fhlinkat(fhp: COpaquePointer?, tofd: CInt, to: String?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fhlinkat((fhp?.value ?: 0L), tofd, to)

public actual fun fhreadlink(fhp: COpaquePointer?, buf: COpaquePointer?, bufsize: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fhreadlink((fhp?.value ?: 0L), (buf?.value ?: 0L), bufsize.toLong())

public actual fun getfhat(fd: CInt, path: COpaquePointer?, fhp: COpaquePointer?, flag: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_getfhat(fd, (path?.value ?: 0L), (fhp?.value ?: 0L), flag)

public actual fun error(): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_error().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioCancel(fd, (aiocbp?.value ?: 0L))

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioError((aiocbp?.value ?: 0L))

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioFsync(op, (aiocbp?.value ?: 0L))

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioRead((aiocbp?.value ?: 0L))

public actual fun aioReadv(aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioReadv((aiocbp?.value ?: 0L))

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioReturn((aiocbp?.value ?: 0L))

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioSuspend((aiocbList?.value ?: 0L), nitems, (timeout?.value ?: 0L))

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioWrite((aiocbp?.value ?: 0L))

public actual fun aioWritev(aiocbp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioWritev((aiocbp?.value ?: 0L))

public actual fun copyFileRange(infd: CInt, inoffp: COpaquePointer?, outfd: CInt, outoffp: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_copyFileRange(infd, (inoffp?.value ?: 0L), outfd, (outoffp?.value ?: 0L), len.toLong(), flags.toInt())

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_devnameR(dev.toInt(), mode.toShort(), (buf?.value ?: 0L), len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrDeleteFd(fd, attrnamespace, attrname)

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrDeleteFile(path, attrnamespace, attrname)

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrDeleteLink(path, attrnamespace, attrname)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrGetFd(fd, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrGetFile(path, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrGetLink(path, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrListFd(fd, attrnamespace, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrListFile(path, attrnamespace, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrListLink(path, attrnamespace, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrSetFd(fd, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrSetFile(path, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrSetLink(path, attrnamespace, attrname, (data?.value ?: 0L), nbytes.toLong())

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: COpaquePointer?, flags: CInt, rmsr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fspacectl(fd, cmd, (rqsr?.value ?: 0L), flags, (rmsr?.value ?: 0L))

public actual fun jail(jail: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_jail((jail?.value ?: 0L))

public actual fun jailAttach(jid: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_jailAttach(jid)

public actual fun jailRemove(jid: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_jailRemove(jid)

public actual fun jailGet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_jailGet((iov?.value ?: 0L), niov.toInt(), flags)

public actual fun jailSet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_jailSet((iov?.value ?: 0L), niov.toInt(), flags)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_lioListio(mode, (aiocbList?.value ?: 0L), nitems, (sevp?.value ?: 0L))

public actual fun getutxuser(user: String?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_getutxuser(user).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setutxdb(type: CInt, file: String?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_setutxdb(type, file)

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_aioWaitcomplete((iocbp?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_mqGetfdNp((mqd?.value ?: 0L))

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_waitid(idtype.toInt(), id, (infop?.value ?: 0L), options)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_ptsnameR(fd, (buf?.value ?: 0L), buflen.toLong())

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_ftok(pathname, projId)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_shmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_shmat(shmid, (shmaddr?.value ?: 0L), shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_shmdt((shmaddr?.value ?: 0L))

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_shmctl(shmid, cmd, (buf?.value ?: 0L))

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_semget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_semop(semid, (sops?.value ?: 0L), nsops.toLong())

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_msgctl(msqid, cmd, (buf?.value ?: 0L))

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_msgget(key, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_msgsnd(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgflg)

public actual fun cfmakesane(termios: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_cfmakesane((termios?.value ?: 0L))
}

public actual fun pdfork(fdp: COpaquePointer?, flags: CInt): PidT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pdfork((fdp?.value ?: 0L), flags)

public actual fun pdgetpid(fd: CInt, pidp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pdgetpid(fd, (pidp?.value ?: 0L))

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pdkill(fd, signum)

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_rtprioThread(function, lwpid, (rtp?.value ?: 0L))

public actual fun uuidgen(store: COpaquePointer?, count: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_uuidgen((store?.value ?: 0L), count)

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_thrKill(id, sig)

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_thrKill2(pid, id, sig)

public actual fun thrSelf(tid: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_thrSelf((tid?.value ?: 0L))

public actual fun pthreadGetthreadidNp(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadGetthreadidNp()

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadGetaffinityNp(td.toLong(), cpusetsize.toLong(), (cpusetp?.value ?: 0L))

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadSetaffinityNp(td.toLong(), cpusetsize.toLong(), (cpusetp?.value ?: 0L))

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_schedGetaffinity(pid, cpusetsz.toLong(), (cpuset?.value ?: 0L))

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_schedSetaffinity(pid, cpusetsz.toLong(), (cpuset?.value ?: 0L))

public actual fun schedGetcpu(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_schedGetcpu()

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadMutexConsistent((mutex?.value ?: 0L))

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadMutexattrGetrobust((attr?.value ?: 0L), (robust?.value ?: 0L))

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadMutexattrSetrobust((attr?.value ?: 0L), robust)

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadSpinUnlock((lock?.value ?: 0L))

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pthreadTimedjoinNp(thread.toLong(), (retval?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_statfs(path, (buf?.value ?: 0L))

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fstatfs(fd, (buf?.value ?: 0L))

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_dup3(src, dst, flags)

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_xuname(nmln, (buf?.value ?: 0L))

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sendmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toLong(), flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt, timeout: COpaquePointer?): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_recvmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toLong(), flags, (timeout?.value ?: 0L))

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fhopen(fhp: COpaquePointer?, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fhopen((fhp?.value ?: 0L), flags)

public actual fun fhstat(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fhstat((fhp?.value ?: 0L), (buf?.value ?: 0L))

public actual fun fhstatfs(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fhstatfs((fhp?.value ?: 0L), (buf?.value ?: 0L))

public actual fun getfh(path: String?, fhp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_getfh(path, (fhp?.value ?: 0L))

public actual fun lgetfh(path: String?, fhp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_lgetfh(path, (fhp?.value ?: 0L))

public actual fun getfsstat(buf: COpaquePointer?, bufsize: CLong, mode: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_getfsstat((buf?.value ?: 0L), bufsize, mode)

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_getmntinfo((mntbufp?.value ?: 0L), mode)

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_mount(type, dir, flags, (data?.value ?: 0L))

public actual fun nmount(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_nmount((iov?.value ?: 0L), niov.toInt(), flags)

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_setproctitle(fmt, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun rfork(flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_rfork(flags)

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_cpusetGetaffinity(level, which, id, setsize.toLong(), (mask?.value ?: 0L))

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_cpusetSetaffinity(level, which, id, setsize.toLong(), (mask?.value ?: 0L))

public actual fun cpuset(setid: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_cpuset((setid?.value ?: 0L))

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_cpusetGetid(level, which, id, (setid?.value ?: 0L))

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_cpusetSetid(which, id, setid)

public actual fun capEnter(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capEnter()

public actual fun capGetmode(modep: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capGetmode((modep?.value ?: 0L))

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capFcntlsGet(fd, (fcntlrightsp?.value ?: 0L))

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capFcntlsLimit(fd, fcntlrights.toInt())

public actual fun capIoctlsGet(fd: CInt, cmds: COpaquePointer?, maxcmds: ULong): Long =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capIoctlsGet(fd, (cmds?.value ?: 0L), maxcmds.toLong())

public actual fun capIoctlsLimit(fd: CInt, cmds: COpaquePointer?, ncmds: ULong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capIoctlsLimit(fd, (cmds?.value ?: 0L), ncmds.toLong())

public actual fun capRightsInit(version: CInt, rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsInit(version, (rights?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsGet(version, fd, (rightsp?.value ?: 0L))

public actual fun capRightsSet(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsSet((rights?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun capRightsClear(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsClear((rights?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun capRightsIsSet(rights: COpaquePointer?, vararg variadicArgs: Long): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsIsSet((rights?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun capRightsIsValid(rights: COpaquePointer?): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsIsValid((rights?.value ?: 0L))

public actual fun capRightsLimit(fd: CInt, rights: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsLimit(fd, (rights?.value ?: 0L))

public actual fun capRightsMerge(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsMerge((dst?.value ?: 0L), (src?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun capRightsRemove(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsRemove((dst?.value ?: 0L), (src?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun capRightsContains(big: COpaquePointer?, little: COpaquePointer?): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capRightsContains((big?.value ?: 0L), (little?.value ?: 0L))

public actual fun capSandboxed(): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_capSandboxed()

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_reallocarray((ptr?.value ?: 0L), nmemb.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ffs(value: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_ffs(value)

public actual fun ffsl(value: CLong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_ffsll(value)

public actual fun fls(value: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fls(value)

public actual fun flsl(value: CLong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_flsl(value)

public actual fun flsll(value: CLonglong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_flsll(value)

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_mallocStatsPrint(0L, (cbopaque?.value ?: 0L), opt)
}

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_mallctl(name, (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun mallctlnametomib(name: String?, mibp: COpaquePointer?, miplen: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_mallctlnametomib(name, (mibp?.value ?: 0L), (miplen?.value ?: 0L))

public actual fun mallctlbymib(mib: COpaquePointer?, mible: SizeT, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_mallctlbymib((mib?.value ?: 0L), mible.toLong(), (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun mallocx(size: SizeT, flags: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_mallocx(size.toLong(), flags).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_rallocx((ptr?.value ?: 0L), size.toLong(), flags).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_xallocx((ptr?.value ?: 0L), size.toLong(), extra.toLong(), flags).toULong()

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sallocx((ptr?.value ?: 0L), flags).toULong()

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_dallocx((ptr?.value ?: 0L), flags)
}

public actual fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sdallocx((ptr?.value ?: 0L), size.toLong(), flags)
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_nallocx(size.toLong(), flags).toULong()

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procctl(idtype.toInt(), id, cmd, (data?.value ?: 0L))

public actual fun getpagesize(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_getpagesize()

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_getpagesizes((pagesize?.value ?: 0L), nelem)

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_clockGetcpuclockid2(arg1, arg2, (arg3?.value ?: 0L))

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_strchrnul(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_shmCreateLargepage(path, flags, psind, allocPolicy, mode.toShort())

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_shmRename(pathFrom, pathTo, flags)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memfdCreate(name, flags.toInt())

public actual fun setaudit(auditinfo: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_setaudit((auditinfo?.value ?: 0L))

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_eventfd(initval.toInt(), flags)

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_eventfdRead(fd, (value?.value ?: 0L))

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_eventfdWrite(fd, value.toLong())

public actual fun fdatasync(fd: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_fdatasync(fd)

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_elfAuxInfo(aux, (buf?.value ?: 0L), buflen)

public actual fun setproctitleFast(fmt: String?, vararg variadicArgs: Long) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_setproctitleFast(fmt, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timingsafeBcmp((a?.value ?: 0L), (b?.value ?: 0L), len.toLong())

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timingsafeMemcmp((a?.value ?: 0L), (b?.value ?: 0L), len.toLong())

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_umtxOp((obj?.value ?: 0L), op, value.toLong(), (uaddr?.value ?: 0L), (uaddr2?.value ?: 0L))

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpPeeloff(s, id.toInt())

public actual fun sctpBindx(s: CInt, addrs: COpaquePointer?, num: CInt, tpe: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpBindx(s, (addrs?.value ?: 0L), num, tpe)

public actual fun sctpConnectx(s: CInt, addrs: COpaquePointer?, addrcnt: CInt, id: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpConnectx(s, (addrs?.value ?: 0L), addrcnt, (id?.value ?: 0L))

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpGetaddrlen(family.toByte())

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpGetpaddrs(s, asocid.toInt(), (addrs?.value ?: 0L))

public actual fun sctpFreepaddrs(addrs: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpFreepaddrs((addrs?.value ?: 0L))
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpGetladdrs(s, asocid.toInt(), (addrs?.value ?: 0L))

public actual fun sctpFreeladdrs(addrs: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpFreeladdrs((addrs?.value ?: 0L))
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpOptInfo(s, id.toInt(), opt, (arg?.value ?: 0L), (size?.value ?: 0L))

public actual fun sctpSendv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, addrs: COpaquePointer?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpSendv(sd, (iov?.value ?: 0L), iovcnt, (addrs?.value ?: 0L), addrcnt, (info?.value ?: 0L), infolen.toInt(), infotype.toInt(), flags)

public actual fun sctpRecvv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, from: COpaquePointer?, fromlen: COpaquePointer?, info: COpaquePointer?, infolen: COpaquePointer?, infotype: COpaquePointer?, flags: COpaquePointer?): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_sctpRecvv(sd, (iov?.value ?: 0L), iovcnt, (from?.value ?: 0L), (fromlen?.value ?: 0L), (info?.value ?: 0L), (infolen?.value ?: 0L), (infotype?.value ?: 0L), (flags?.value ?: 0L))

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timerfdGettime(fd, (currValue?.value ?: 0L))

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timerfdSettime(fd, flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun closefrom(lowfd: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_closefrom(lowfd)
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_closeRange(lowfd.toInt(), highfd.toInt(), flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_execvpe(file, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kcmp(pid1, pid2, type, idx1.toLong(), idx2.toLong())

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_dlvsym((handle?.value ?: 0L), symbol, version).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatStrerror(error: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memstatStrerror(error).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatMtlAlloc(): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memstatMtlAlloc().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatMtlFirst(list: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memstatMtlFirst((list?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatMtlNext(mtp: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memstatMtlNext((mtp?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatMtlFind(list: COpaquePointer?, allocator: CInt, name: String?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memstatMtlFind((list?.value ?: 0L), allocator, name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatMtlFree(list: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memstatMtlFree((list?.value ?: 0L))
}

public actual fun memstatMtlGeterror(list: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memstatMtlGeterror((list?.value ?: 0L))

public actual fun memstatGetName(mtp: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_memstatGetName((mtp?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmDpcpuSetcpu(kd: COpaquePointer?, cpu: CUint): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmDpcpuSetcpu((kd?.value ?: 0L), cpu.toInt())

public actual fun kvmGetargv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmGetargv((kd?.value ?: 0L), (p?.value ?: 0L), nchr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGetcptime(kd: COpaquePointer?, cpTime: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmGetcptime((kd?.value ?: 0L), (cpTime?.value ?: 0L))

public actual fun kvmGetenvv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmGetenvv((kd?.value ?: 0L), (p?.value ?: 0L), nchr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGeterr(kd: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmGeterr((kd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGetmaxcpu(kd: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmGetmaxcpu((kd?.value ?: 0L))

public actual fun kvmGetncpus(kd: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmGetncpus((kd?.value ?: 0L))

public actual fun kvmGetpcpu(kd: COpaquePointer?, cpu: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmGetpcpu((kd?.value ?: 0L), cpu).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmCounterU64Fetch(kd: COpaquePointer?, base: CUlong): ULong =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmCounterU64Fetch((kd?.value ?: 0L), base.toLong()).toULong()

public actual fun kvmGetswapinfo(kd: COpaquePointer?, info: COpaquePointer?, maxswap: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmGetswapinfo((kd?.value ?: 0L), (info?.value ?: 0L), maxswap, flags)

public actual fun kvmNative(kd: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmNative((kd?.value ?: 0L))

public actual fun kvmNlist(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmNlist((kd?.value ?: 0L), (nl?.value ?: 0L))

public actual fun kvmNlist2(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmNlist2((kd?.value ?: 0L), (nl?.value ?: 0L))

public actual fun kvmReadZpcpu(kd: COpaquePointer?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmReadZpcpu((kd?.value ?: 0L), base.toLong(), (buf?.value ?: 0L), size.toLong(), cpu)

public actual fun kvmRead2(kd: COpaquePointer?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kvmRead2((kd?.value ?: 0L), addr.toLong(), (buf?.value ?: 0L), nbytes.toLong())

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrNamespaceToString(attrnamespace, (string?.value ?: 0L))

public actual fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_extattrStringToNamespace(string, (attrnamespace?.value ?: 0L))

public actual fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_realhostname((host?.value ?: 0L), hsize.toLong(), (ip?.value ?: 0L))

public actual fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: COpaquePointer?, addrlen: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_realhostnameSa((host?.value ?: 0L), hsize.toLong(), (addr?.value ?: 0L), addrlen)

public actual fun kldIsloaded(name: String?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kldIsloaded(name)

public actual fun kldLoad(name: String?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kldLoad(name)

public actual fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_kinfoGetvmmap(pid, (cntp?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_hexdump((ptr?.value ?: 0L), length, hdr, flags)
}

public actual fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_humanizeNumber((buf?.value ?: 0L), len.toLong(), number, suffix, scale, flags)

public actual fun flopen(path: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_flopen(path, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun flopenat(fd: CInt, path: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_flopenat(fd, path, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getlocalbase(): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_getlocalbase().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pidfileOpen(path, mode.toShort(), (pidptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pidfileWrite(path: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pidfileWrite((path?.value ?: 0L))

public actual fun pidfileClose(path: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pidfileClose((path?.value ?: 0L))

public actual fun pidfileRemove(path: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pidfileRemove((path?.value ?: 0L))

public actual fun pidfileFileno(path: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_pidfileFileno((path?.value ?: 0L))

public actual fun procstatOpenSysctl(): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatOpenSysctl().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatGetfiles(procstat: COpaquePointer?, kp: COpaquePointer?, mmapped: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetfiles((procstat?.value ?: 0L), (kp?.value ?: 0L), mmapped).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatFreefiles(procstat: COpaquePointer?, head: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatFreefiles((procstat?.value ?: 0L), (head?.value ?: 0L))
}

public actual fun procstatGetprocs(procstat: COpaquePointer?, what: CInt, arg: CInt, count: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetprocs((procstat?.value ?: 0L), what, arg, (count?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatFreeprocs(procstat: COpaquePointer?, p: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatFreeprocs((procstat?.value ?: 0L), (p?.value ?: 0L))
}

public actual fun procstatGetvmmap(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetvmmap((procstat?.value ?: 0L), (kp?.value ?: 0L), (count?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatFreevmmap(procstat: COpaquePointer?, vmmap: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatFreevmmap((procstat?.value ?: 0L), (vmmap?.value ?: 0L))
}

public actual fun procstatClose(procstat: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatClose((procstat?.value ?: 0L))
}

public actual fun procstatFreeargv(procstat: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatFreeargv((procstat?.value ?: 0L))
}

public actual fun procstatFreeenvv(procstat: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatFreeenvv((procstat?.value ?: 0L))
}

public actual fun procstatFreegroups(procstat: COpaquePointer?, groups: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatFreegroups((procstat?.value ?: 0L), (groups?.value ?: 0L))
}

public actual fun procstatFreeptlwpinfo(procstat: COpaquePointer?, pl: COpaquePointer?) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatFreeptlwpinfo((procstat?.value ?: 0L), (pl?.value ?: 0L))
}

public actual fun procstatGetargv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetargv((procstat?.value ?: 0L), (kp?.value ?: 0L), nchr.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatGetenvv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetenvv((procstat?.value ?: 0L), (kp?.value ?: 0L), nchr.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatGetgroups(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetgroups((procstat?.value ?: 0L), (kp?.value ?: 0L), (count?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatGetosrel(procstat: COpaquePointer?, kp: COpaquePointer?, osrelp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetosrel((procstat?.value ?: 0L), (kp?.value ?: 0L), (osrelp?.value ?: 0L))

public actual fun procstatGetpathname(procstat: COpaquePointer?, kp: COpaquePointer?, pathname: COpaquePointer?, maxlen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetpathname((procstat?.value ?: 0L), (kp?.value ?: 0L), (pathname?.value ?: 0L), maxlen.toLong())

public actual fun procstatGetrlimit(procstat: COpaquePointer?, kp: COpaquePointer?, which: CInt, rlimit: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetrlimit((procstat?.value ?: 0L), (kp?.value ?: 0L), which, (rlimit?.value ?: 0L))

public actual fun procstatGetumask(procstat: COpaquePointer?, kp: COpaquePointer?, maskp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetumask((procstat?.value ?: 0L), (kp?.value ?: 0L), (maskp?.value ?: 0L))

public actual fun procstatOpenCore(filename: String?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatOpenCore(filename).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): COpaquePointer? =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatOpenKvm(nlistf, memf).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatGetSocketInfo(proc: COpaquePointer?, fst: COpaquePointer?, sock: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetSocketInfo((proc?.value ?: 0L), (fst?.value ?: 0L), (sock?.value ?: 0L), (errbuf?.value ?: 0L))

public actual fun procstatGetVnodeInfo(proc: COpaquePointer?, fst: COpaquePointer?, vn: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetVnodeInfo((proc?.value ?: 0L), (fst?.value ?: 0L), (vn?.value ?: 0L), (errbuf?.value ?: 0L))

public actual fun procstatGetPtsInfo(proc: COpaquePointer?, fst: COpaquePointer?, pts: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetPtsInfo((proc?.value ?: 0L), (fst?.value ?: 0L), (pts?.value ?: 0L), (errbuf?.value ?: 0L))

public actual fun procstatGetShmInfo(proc: COpaquePointer?, fst: COpaquePointer?, shm: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_procstatGetShmInfo((proc?.value ?: 0L), (fst?.value ?: 0L), (shm?.value ?: 0L), (errbuf?.value ?: 0L))

public actual fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timerCreate(clockId, (evp?.value ?: 0L), (timerid?.value ?: 0L))

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timerDelete((timerid?.value ?: 0L))

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timerGetoverrun((timerid?.value ?: 0L))

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timerGettime((timerid?.value ?: 0L), (value?.value ?: 0L))

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_timerSettime((timerid?.value ?: 0L), flags, (value?.value ?: 0L), (ovalue?.value ?: 0L))

public actual fun devstatGetnumdevs(kd: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_devstatGetnumdevs((kd?.value ?: 0L))

public actual fun devstatGetgeneration(kd: COpaquePointer?): CLong =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_devstatGetgeneration((kd?.value ?: 0L))

public actual fun devstatGetversion(kd: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_devstatGetversion((kd?.value ?: 0L))

public actual fun devstatCheckversion(kd: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_devstatCheckversion((kd?.value ?: 0L))

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: COpaquePointer?, numSelections: COpaquePointer?, selectGeneration: COpaquePointer?, currentGeneration: CLong, devices: COpaquePointer?, numdevs: CInt, matches: COpaquePointer?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    0

public actual fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libc_unix_bsd_freebsdlike_freebsd_devstatBuildmatch((matchStr?.value ?: 0L), (matches?.value ?: 0L), (numMatches?.value ?: 0L))
