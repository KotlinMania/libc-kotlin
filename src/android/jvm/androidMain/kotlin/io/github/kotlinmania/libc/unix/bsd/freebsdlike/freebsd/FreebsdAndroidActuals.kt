@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdFreebsdlikeFreebsdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhlink(fhp: Long, to: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhlinkat(fhp: Long, tofd: Int, to: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhreadlink(fhp: Long, buf: Long, bufsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetfhat(fd: Int, path: Long, fhp: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdError(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioReadv(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioWritev(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCopyFileRange(infd: Int, inoffp: Long, outfd: Int, outoffp: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevnameR(dev: Int, mode: Short, buf: Long, len: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(fd: Int, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(path: Long, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(path: Long, attrnamespace: Int, attrname: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrGetFd(fd: Int, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrGetFile(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrGetLink(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrListFd(fd: Int, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrListFile(path: Long, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrListLink(path: Long, attrnamespace: Int, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrSetFd(fd: Int, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrSetFile(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrSetLink(path: Long, attrnamespace: Int, attrname: Long, data: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFspacectl(fd: Int, cmd: Int, rqsr: Long, flags: Int, rmsr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJail(jail: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJailAttach(jid: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJailRemove(jid: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJailGet(iov: Long, niov: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdJailSet(iov: Long, niov: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdLioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetutxuser(user: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSetutxdb(type: Int, file: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(iocbp: Long, timeout: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMqGetfdNp(mqd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdWaitid(idtype: Int, id: Long, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPtsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFtok(pathname: Long, projId: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmget(key: Long, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSemget(key: Long, nsems: Int, semflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSemctl(semid: Int, semnum: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSemop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMsgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMsgget(key: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMsgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCfmakesane(termios: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPdfork(fdp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPdgetpid(fd: Int, pidp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPdkill(fd: Int, signum: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRtprioThread(function: Int, lwpid: Int, rtp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdUuidgen(store: Long, count: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdThrKill(id: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdThrKill2(pid: Int, id: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdThrSelf(tid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(td: Long, cpusetsize: Long, cpusetp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(td: Long, cpusetsize: Long, cpusetp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(pid: Int, cpusetsz: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(pid: Int, cpusetsz: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSchedGetcpu(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(attr: Long, robust: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(attr: Long, robust: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdXuname(nmln: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSendmmsg(sockfd: Int, msgvec: Long, vlen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRecvmmsg(sockfd: Int, msgvec: Long, vlen: Long, flags: Int, timeout: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhopen(fhp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhstat(fhp: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFhstatfs(fhp: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetfh(path: Long, fhp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdLgetfh(path: Long, fhp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetfsstat(buf: Long, bufsize: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetmntinfo(mntbufp: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMount(type: Long, dir: Long, flags: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdNmount(iov: Long, niov: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSetproctitle(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRfork(flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(level: Int, which: Int, id: Long, setsize: Long, mask: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(level: Int, which: Int, id: Long, setsize: Long, mask: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpuset(setid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpusetGetid(level: Int, which: Int, id: Long, setid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCpusetSetid(which: Int, id: Long, setid: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapEnter(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapGetmode(modep: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(fd: Int, fcntlrightsp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd: Int, fcntlrights: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(fd: Int, cmds: Long, maxcmds: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(fd: Int, cmds: Long, ncmds: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsInit(version: Int, rights: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsGet(version: Int, fd: Int, rightsp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsSet(rights: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsClear(rights: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(rights: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Boolean

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(rights: Long): Boolean

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsLimit(fd: Int, rights: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsMerge(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsRemove(dst: Long, src: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapRightsContains(big: Long, little: Long): Boolean

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCapSandboxed(): Boolean

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdReallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFfs(value: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFfsl(value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFfsll(value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFls(value: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFlsl(value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFlsll(value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(writeCb: Long, cbopaque: Long, opt: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallctl(name: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallctlnametomib(name: Long, mibp: Long, miplen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallctlbymib(mib: Long, mible: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMallocx(size: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRallocx(ptr: Long, size: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdXallocx(ptr: Long, size: Long, extra: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSallocx(ptr: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDallocx(ptr: Long, flags: Int)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSdallocx(ptr: Long, size: Long, flags: Int)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdNallocx(size: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcctl(idtype: Int, id: Long, cmd: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetpagesize(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetpagesizes(pagesize: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(arg1: Long, arg2: Int, arg3: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdStrchrnul(s: Long, c: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(path: Long, flags: Int, psind: Int, allocPolicy: Int, mode: Short): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdShmRename(pathFrom: Long, pathTo: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemfdCreate(name: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSetaudit(auditinfo: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdEventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdEventfdRead(fd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdElfAuxInfo(aux: Int, buf: Long, buflen: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSetproctitleFast(fmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdUmtxOp(obj: Long, op: Int, value: Long, uaddr: Long, uaddr2: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s: Int, id: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpBindx(s: Int, addrs: Long, num: Int, tpe: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpConnectx(s: Int, addrs: Long, addrcnt: Int, id: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family: Byte): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(s: Int, asocid: Int, addrs: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(addrs: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(s: Int, asocid: Int, addrs: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(addrs: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpOptInfo(s: Int, id: Int, opt: Int, arg: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpSendv(sd: Int, iov: Long, iovcnt: Int, addrs: Long, addrcnt: Int, info: Long, infolen: Int, infotype: Int, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdSctpRecvv(sd: Int, iov: Long, iovcnt: Int, from: Long, fromlen: Long, info: Long, infolen: Long, infotype: Long, flags: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdClosefrom(lowfd: Int)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdCloseRange(lowfd: Int, highfd: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExecvpe(file: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKcmp(pid1: Int, pid2: Int, type: Int, idx1: Long, idx2: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDlvsym(handle: Long, symbol: Long, version: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatStrerror(error: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(list: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(mtp: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(list: Long, allocator: Int, name: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(list: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(list: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdMemstatGetName(mtp: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(kd: Long, cpu: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetargv(kd: Long, p: Long, nchr: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetcptime(kd: Long, cpTime: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetenvv(kd: Long, p: Long, nchr: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGeterr(kd: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetncpus(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(kd: Long, cpu: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(kd: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(kd: Long, info: Long, maxswap: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmNative(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmNlist(kd: Long, nl: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmNlist2(kd: Long, nl: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(kd: Long, base: Long, buf: Long, size: Long, cpu: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKvmRead2(kd: Long, addr: Long, buf: Long, nbytes: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(attrnamespace: Int, string: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(string: Long, attrnamespace: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRealhostname(host: Long, hsize: Long, ip: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdRealhostnameSa(host: Long, hsize: Long, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKldIsloaded(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKldLoad(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(pid: Int, cntp: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdHexdump(ptr: Long, length: Int, hdr: Long, flags: Int)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdHumanizeNumber(buf: Long, len: Long, number: Long, suffix: Long, scale: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFlopen(path: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFlopenat(fd: Int, path: Long, flags: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdGetlocalbase(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileOpen(path: Long, mode: Short, pidptr: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileWrite(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileClose(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileRemove(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdPidfileFileno(path: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl(): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(procstat: Long, kp: Long, mmapped: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(procstat: Long, head: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(procstat: Long, what: Int, arg: Int, count: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(procstat: Long, p: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(procstat: Long, kp: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(procstat: Long, vmmap: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatClose(procstat: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(procstat: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(procstat: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(procstat: Long, groups: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(procstat: Long, pl: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetargv(procstat: Long, kp: Long, nchr: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(procstat: Long, kp: Long, nchr: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(procstat: Long, kp: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(procstat: Long, kp: Long, osrelp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(procstat: Long, kp: Long, pathname: Long, maxlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(procstat: Long, kp: Long, which: Int, rlimit: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetumask(procstat: Long, kp: Long, maskp: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(filename: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(nlistf: Long, memf: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(proc: Long, fst: Long, sock: Long, errbuf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(proc: Long, fst: Long, vn: Long, errbuf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(proc: Long, fst: Long, pts: Long, errbuf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(proc: Long, fst: Long, shm: Long, errbuf: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerCreate(clockId: Int, evp: Long, timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerDelete(timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerGettime(timerid: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdTimerSettime(timerid: Long, flags: Int, value: Long, ovalue: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(kd: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatGetversion(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(kd: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(matchStr: Long, matches: Long, numMatches: Long): Int
}

public actual fun fhlink(fhp: MutPtr, to: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhlink(fhp.rawAddress, to.rawAddress)

public actual fun fhlinkat(fhp: MutPtr, tofd: CInt, to: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhlinkat(fhp.rawAddress, tofd, to.rawAddress)

public actual fun fhreadlink(fhp: MutPtr, buf: MutPtr, bufsize: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhreadlink(fhp.rawAddress, buf.rawAddress, bufsize.toLong())

public actual fun getfhat(fd: CInt, path: MutPtr, fhp: MutPtr, flag: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetfhat(fd, path.rawAddress, fhp.rawAddress, flag)

public actual fun error(): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdError())

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioCancel(fd, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioError(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioFsync(op, aiocbp.rawAddress)

public actual fun aioRead(aiocbp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioRead(aiocbp.rawAddress)

public actual fun aioReadv(aiocbp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioReadv(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioSuspend(aiocbList.rawAddress, nitems, timeout.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioWrite(aiocbp.rawAddress)

public actual fun aioWritev(aiocbp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioWritev(aiocbp.rawAddress)

public actual fun copyFileRange(infd: CInt, inoffp: MutPtr, outfd: CInt, outoffp: MutPtr, len: SizeT, flags: CUint): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCopyFileRange(infd, inoffp.rawAddress, outfd, outoffp.rawAddress, len.toLong(), flags.toInt())

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr, len: CInt): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevnameR(dev.toInt(), mode.toShort(), buf.rawAddress, len))

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress)

public actual fun extattrDeleteFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(path.rawAddress, attrnamespace, attrname.rawAddress)

public actual fun extattrDeleteLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(path.rawAddress, attrnamespace, attrname.rawAddress)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrGetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrGetFile(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrGetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrGetLink(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrListFd(fd, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrListFile(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrListFile(path.rawAddress, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrListLink(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrListLink(path.rawAddress, attrnamespace, data.rawAddress, nbytes.toLong())

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrSetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrSetFile(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun extattrSetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrSetLink(path.rawAddress, attrnamespace, attrname.rawAddress, data.rawAddress, nbytes.toLong())

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: ConstPtr, flags: CInt, rmsr: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFspacectl(fd, cmd, rqsr.rawAddress, flags, rmsr.rawAddress)

public actual fun jail(jail: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJail(jail.rawAddress)

public actual fun jailAttach(jid: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJailAttach(jid)

public actual fun jailRemove(jid: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJailRemove(jid)

public actual fun jailGet(iov: MutPtr, niov: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJailGet(iov.rawAddress, niov.toInt(), flags)

public actual fun jailSet(iov: MutPtr, niov: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdJailSet(iov.rawAddress, niov.toInt(), flags)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdLioListio(mode, aiocbList.rawAddress, nitems, sevp.rawAddress)

public actual fun getutxuser(user: ConstPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetutxuser(user.rawAddress))

public actual fun setutxdb(type: CInt, file: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSetutxdb(type, file.rawAddress)

public actual fun aioWaitcomplete(iocbp: MutPtr, timeout: MutPtr): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(iocbp.rawAddress, timeout.rawAddress)

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMqGetfdNp(mqd.rawAddress)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdWaitid(idtype.toInt(), id, infop.rawAddress, options)

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPtsnameR(fd, buf.rawAddress, buflen.toLong())

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFtok(pathname.rawAddress, projId)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmdt(shmaddr.rawAddress)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmctl(shmid, cmd, buf.rawAddress)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSemget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSemop(semid, sops.rawAddress, nsops.toLong())

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMsgctl(msqid, cmd, buf.rawAddress)

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMsgget(key, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMsgsnd(msqid, msgp.rawAddress, msgsz.toLong(), msgflg)

public actual fun cfmakesane(termios: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCfmakesane(termios.rawAddress)
}

public actual fun pdfork(fdp: MutPtr, flags: CInt): PidT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPdfork(fdp.rawAddress, flags)

public actual fun pdgetpid(fd: CInt, pidp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPdgetpid(fd, pidp.rawAddress)

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPdkill(fd, signum)

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRtprioThread(function, lwpid, rtp.rawAddress)

public actual fun uuidgen(store: MutPtr, count: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdUuidgen(store.rawAddress, count)

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdThrKill(id, sig)

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdThrKill2(pid, id, sig)

public actual fun thrSelf(tid: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdThrSelf(tid.rawAddress)

public actual fun pthreadGetthreadidNp(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp()

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(td.toLong(), cpusetsize.toLong(), cpusetp.rawAddress)

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(td.toLong(), cpusetsize.toLong(), cpusetp.rawAddress)

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(pid, cpusetsz.toLong(), cpuset.rawAddress)

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(pid, cpusetsz.toLong(), cpuset.rawAddress)

public actual fun schedGetcpu(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSchedGetcpu()

public actual fun pthreadMutexConsistent(mutex: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(mutex.rawAddress)

public actual fun pthreadMutexattrGetrobust(attr: MutPtr, robust: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(attr.rawAddress, robust.rawAddress)

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robust: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(attr.rawAddress, robust)

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(lock.rawAddress)

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(thread.toLong(), retval.rawAddress, abstime.rawAddress)

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdStatfs(path.rawAddress, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFstatfs(fd, buf.rawAddress)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDup3(src, dst, flags)

public actual fun xuname(nmln: CInt, buf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdXuname(nmln, buf.rawAddress)

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: SizeT, flags: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSendmmsg(sockfd, msgvec.rawAddress, vlen.toLong(), flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: SizeT, flags: CInt, timeout: ConstPtr): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRecvmmsg(sockfd, msgvec.rawAddress, vlen.toLong(), flags, timeout.rawAddress)

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun fhopen(fhp: ConstPtr, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhopen(fhp.rawAddress, flags)

public actual fun fhstat(fhp: ConstPtr, buf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhstat(fhp.rawAddress, buf.rawAddress)

public actual fun fhstatfs(fhp: ConstPtr, buf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFhstatfs(fhp.rawAddress, buf.rawAddress)

public actual fun getfh(path: ConstPtr, fhp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetfh(path.rawAddress, fhp.rawAddress)

public actual fun lgetfh(path: ConstPtr, fhp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdLgetfh(path.rawAddress, fhp.rawAddress)

public actual fun getfsstat(buf: MutPtr, bufsize: CLong, mode: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetfsstat(buf.rawAddress, bufsize, mode)

public actual fun getmntinfo(mntbufp: MutPtr, mode: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetmntinfo(mntbufp.rawAddress, mode)

public actual fun mount(type: ConstPtr, dir: ConstPtr, flags: CInt, data: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMount(type.rawAddress, dir.rawAddress, flags, data.rawAddress)

public actual fun nmount(iov: MutPtr, niov: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdNmount(iov.rawAddress, niov.toInt(), flags)

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSetproctitle(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun rfork(flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRfork(flags)

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(level, which, id, setsize.toLong(), mask.rawAddress)

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(level, which, id, setsize.toLong(), mask.rawAddress)

public actual fun cpuset(setid: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpuset(setid.rawAddress)

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpusetGetid(level, which, id, setid.rawAddress)

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCpusetSetid(which, id, setid)

public actual fun capEnter(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapEnter()

public actual fun capGetmode(modep: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapGetmode(modep.rawAddress)

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(fd, fcntlrightsp.rawAddress)

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd, fcntlrights.toInt())

public actual fun capIoctlsGet(fd: CInt, cmds: MutPtr, maxcmds: ULong): Long =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(fd, cmds.rawAddress, maxcmds.toLong())

public actual fun capIoctlsLimit(fd: CInt, cmds: ConstPtr, ncmds: ULong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(fd, cmds.rawAddress, ncmds.toLong())

public actual fun capRightsInit(version: CInt, rights: MutPtr, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsInit(version, rights.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsGet(version, fd, rightsp.rawAddress)

public actual fun capRightsSet(rights: MutPtr, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsSet(rights.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun capRightsClear(rights: MutPtr, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsClear(rights.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun capRightsIsSet(rights: ConstPtr, vararg variadicArgs: Long): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(rights.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun capRightsIsValid(rights: ConstPtr): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(rights.rawAddress)

public actual fun capRightsLimit(fd: CInt, rights: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsLimit(fd, rights.rawAddress)

public actual fun capRightsMerge(dst: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsMerge(dst.rawAddress, src.rawAddress))

public actual fun capRightsRemove(dst: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsRemove(dst.rawAddress, src.rawAddress))

public actual fun capRightsContains(big: ConstPtr, little: ConstPtr): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapRightsContains(big.rawAddress, little.rawAddress)

public actual fun capSandboxed(): Boolean =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCapSandboxed()

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdReallocarray(ptr.rawAddress, nmemb.toLong(), size.toLong()))

public actual fun ffs(value: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFfs(value)

public actual fun ffsl(value: CLong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFfsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFfsll(value)

public actual fun fls(value: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFls(value)

public actual fun flsl(value: CLong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFlsl(value)

public actual fun flsll(value: CLonglong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFlsll(value)

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: MutPtr, opt: ConstPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(0L, cbopaque.rawAddress, opt.rawAddress)
}

public actual fun mallctl(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallctl(name.rawAddress, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun mallctlnametomib(name: ConstPtr, mibp: MutPtr, miplen: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallctlnametomib(name.rawAddress, mibp.rawAddress, miplen.rawAddress)

public actual fun mallctlbymib(mib: ConstPtr, mible: SizeT, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallctlbymib(mib.rawAddress, mible.toLong(), oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun mallocx(size: SizeT, flags: CInt): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMallocx(size.toLong(), flags))

public actual fun rallocx(ptr: MutPtr, size: SizeT, flags: CInt): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRallocx(ptr.rawAddress, size.toLong(), flags))

public actual fun xallocx(ptr: MutPtr, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdXallocx(ptr.rawAddress, size.toLong(), extra.toLong(), flags).toULong()

public actual fun sallocx(ptr: ConstPtr, flags: CInt): SizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSallocx(ptr.rawAddress, flags).toULong()

public actual fun dallocx(ptr: MutPtr, flags: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDallocx(ptr.rawAddress, flags)
}

public actual fun sdallocx(ptr: MutPtr, size: SizeT, flags: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSdallocx(ptr.rawAddress, size.toLong(), flags)
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdNallocx(size.toLong(), flags).toULong()

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcctl(idtype.toInt(), id, cmd, data.rawAddress)

public actual fun getpagesize(): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetpagesize()

public actual fun getpagesizes(pagesize: MutPtr, nelem: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetpagesizes(pagesize.rawAddress, nelem)

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(arg1, arg2, arg3.rawAddress)

public actual fun strchrnul(s: ConstPtr, c: CInt): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdStrchrnul(s.rawAddress, c))

public actual fun shmCreateLargepage(path: ConstPtr, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(path.rawAddress, flags, psind, allocPolicy, mode.toShort())

public actual fun shmRename(pathFrom: ConstPtr, pathTo: ConstPtr, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdShmRename(pathFrom.rawAddress, pathTo.rawAddress, flags)

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemfdCreate(name.rawAddress, flags.toInt())

public actual fun setaudit(auditinfo: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSetaudit(auditinfo.rawAddress)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdEventfd(initval.toInt(), flags)

public actual fun eventfdRead(fd: CInt, value: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdEventfdRead(fd, value.rawAddress)

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd, value.toLong())

public actual fun fdatasync(fd: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFdatasync(fd)

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr, buflen: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdElfAuxInfo(aux, buf.rawAddress, buflen)

public actual fun setproctitleFast(fmt: ConstPtr, vararg variadicArgs: Long) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSetproctitleFast(fmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun timingsafeBcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(a.rawAddress, b.rawAddress, len.toLong())

public actual fun timingsafeMemcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(a.rawAddress, b.rawAddress, len.toLong())

public actual fun umtxOp(obj: MutPtr, op: CInt, value: CUlong, uaddr: MutPtr, uaddr2: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdUmtxOp(obj.rawAddress, op, value.toLong(), uaddr.rawAddress, uaddr2.rawAddress)

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s, id.toInt())

public actual fun sctpBindx(s: CInt, addrs: MutPtr, num: CInt, tpe: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpBindx(s, addrs.rawAddress, num, tpe)

public actual fun sctpConnectx(s: CInt, addrs: ConstPtr, addrcnt: CInt, id: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpConnectx(s, addrs.rawAddress, addrcnt, id.rawAddress)

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family.toByte())

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(s, asocid.toInt(), addrs.rawAddress)

public actual fun sctpFreepaddrs(addrs: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(addrs.rawAddress)
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(s, asocid.toInt(), addrs.rawAddress)

public actual fun sctpFreeladdrs(addrs: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(addrs.rawAddress)
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: MutPtr, size: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpOptInfo(s, id.toInt(), opt, arg.rawAddress, size.rawAddress)

public actual fun sctpSendv(sd: CInt, iov: ConstPtr, iovcnt: CInt, addrs: MutPtr, addrcnt: CInt, info: MutPtr, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpSendv(sd, iov.rawAddress, iovcnt, addrs.rawAddress, addrcnt, info.rawAddress, infolen.toInt(), infotype.toInt(), flags)

public actual fun sctpRecvv(sd: CInt, iov: ConstPtr, iovcnt: CInt, from: MutPtr, fromlen: MutPtr, info: MutPtr, infolen: MutPtr, infotype: MutPtr, flags: MutPtr): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdSctpRecvv(sd, iov.rawAddress, iovcnt, from.rawAddress, fromlen.rawAddress, info.rawAddress, infolen.rawAddress, infotype.rawAddress, flags.rawAddress)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerfdGettime(fd, currValue.rawAddress)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerfdSettime(fd, flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun closefrom(lowfd: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdClosefrom(lowfd)
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdCloseRange(lowfd.toInt(), highfd.toInt(), flags)

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExecvpe(file.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKcmp(pid1, pid2, type, idx1.toLong(), idx2.toLong())

public actual fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDlvsym(handle.rawAddress, symbol.rawAddress, version.rawAddress))

public actual fun memstatStrerror(error: CInt): ConstPtr =
    ConstPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatStrerror(error))

public actual fun memstatMtlAlloc(): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc())

public actual fun memstatMtlFirst(list: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(list.rawAddress))

public actual fun memstatMtlNext(mtp: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(mtp.rawAddress))

public actual fun memstatMtlFind(list: MutPtr, allocator: CInt, name: ConstPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(list.rawAddress, allocator, name.rawAddress))

public actual fun memstatMtlFree(list: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(list.rawAddress)
}

public actual fun memstatMtlGeterror(list: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(list.rawAddress)

public actual fun memstatGetName(mtp: ConstPtr): ConstPtr =
    ConstPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdMemstatGetName(mtp.rawAddress))

public actual fun kvmDpcpuSetcpu(kd: MutPtr, cpu: CUint): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(kd.rawAddress, cpu.toInt())

public actual fun kvmGetargv(kd: MutPtr, p: ConstPtr, nchr: CInt): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetargv(kd.rawAddress, p.rawAddress, nchr))

public actual fun kvmGetcptime(kd: MutPtr, cpTime: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetcptime(kd.rawAddress, cpTime.rawAddress)

public actual fun kvmGetenvv(kd: MutPtr, p: ConstPtr, nchr: CInt): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetenvv(kd.rawAddress, p.rawAddress, nchr))

public actual fun kvmGeterr(kd: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGeterr(kd.rawAddress))

public actual fun kvmGetmaxcpu(kd: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(kd.rawAddress)

public actual fun kvmGetncpus(kd: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetncpus(kd.rawAddress)

public actual fun kvmGetpcpu(kd: MutPtr, cpu: CInt): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(kd.rawAddress, cpu))

public actual fun kvmCounterU64Fetch(kd: MutPtr, base: CUlong): ULong =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(kd.rawAddress, base.toLong()).toULong()

public actual fun kvmGetswapinfo(kd: MutPtr, info: MutPtr, maxswap: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(kd.rawAddress, info.rawAddress, maxswap, flags)

public actual fun kvmNative(kd: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmNative(kd.rawAddress)

public actual fun kvmNlist(kd: MutPtr, nl: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmNlist(kd.rawAddress, nl.rawAddress)

public actual fun kvmNlist2(kd: MutPtr, nl: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmNlist2(kd.rawAddress, nl.rawAddress)

public actual fun kvmReadZpcpu(kd: MutPtr, base: CUlong, buf: MutPtr, size: SizeT, cpu: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(kd.rawAddress, base.toLong(), buf.rawAddress, size.toLong(), cpu)

public actual fun kvmRead2(kd: MutPtr, addr: KvaddrT, buf: MutPtr, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKvmRead2(kd.rawAddress, addr.toLong(), buf.rawAddress, nbytes.toLong())

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(attrnamespace, string.rawAddress)

public actual fun extattrStringToNamespace(string: ConstPtr, attrnamespace: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(string.rawAddress, attrnamespace.rawAddress)

public actual fun realhostname(host: MutPtr, hsize: SizeT, ip: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRealhostname(host.rawAddress, hsize.toLong(), ip.rawAddress)

public actual fun realhostnameSa(host: MutPtr, hsize: SizeT, addr: MutPtr, addrlen: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdRealhostnameSa(host.rawAddress, hsize.toLong(), addr.rawAddress, addrlen)

public actual fun kldIsloaded(name: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKldIsloaded(name.rawAddress)

public actual fun kldLoad(name: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKldLoad(name.rawAddress)

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(pid, cntp.rawAddress))

public actual fun hexdump(ptr: ConstPtr, length: CInt, hdr: ConstPtr, flags: CInt) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdHexdump(ptr.rawAddress, length, hdr.rawAddress, flags)
}

public actual fun humanizeNumber(buf: MutPtr, len: SizeT, number: Long, suffix: ConstPtr, scale: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdHumanizeNumber(buf.rawAddress, len.toLong(), number, suffix.rawAddress, scale, flags)

public actual fun flopen(path: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFlopen(path.rawAddress, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun flopenat(fd: CInt, path: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdFlopenat(fd, path.rawAddress, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getlocalbase(): ConstPtr =
    ConstPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdGetlocalbase())

public actual fun pidfileOpen(path: ConstPtr, mode: ModeT, pidptr: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileOpen(path.rawAddress, mode.toShort(), pidptr.rawAddress))

public actual fun pidfileWrite(path: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileWrite(path.rawAddress)

public actual fun pidfileClose(path: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileClose(path.rawAddress)

public actual fun pidfileRemove(path: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileRemove(path.rawAddress)

public actual fun pidfileFileno(path: ConstPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdPidfileFileno(path.rawAddress)

public actual fun procstatOpenSysctl(): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl())

public actual fun procstatGetfiles(procstat: MutPtr, kp: MutPtr, mmapped: CInt): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(procstat.rawAddress, kp.rawAddress, mmapped))

public actual fun procstatFreefiles(procstat: MutPtr, head: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(procstat.rawAddress, head.rawAddress)
}

public actual fun procstatGetprocs(procstat: MutPtr, what: CInt, arg: CInt, count: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(procstat.rawAddress, what, arg, count.rawAddress))

public actual fun procstatFreeprocs(procstat: MutPtr, p: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(procstat.rawAddress, p.rawAddress)
}

public actual fun procstatGetvmmap(procstat: MutPtr, kp: MutPtr, count: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(procstat.rawAddress, kp.rawAddress, count.rawAddress))

public actual fun procstatFreevmmap(procstat: MutPtr, vmmap: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(procstat.rawAddress, vmmap.rawAddress)
}

public actual fun procstatClose(procstat: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatClose(procstat.rawAddress)
}

public actual fun procstatFreeargv(procstat: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(procstat.rawAddress)
}

public actual fun procstatFreeenvv(procstat: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(procstat.rawAddress)
}

public actual fun procstatFreegroups(procstat: MutPtr, groups: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(procstat.rawAddress, groups.rawAddress)
}

public actual fun procstatFreeptlwpinfo(procstat: MutPtr, pl: MutPtr) {
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(procstat.rawAddress, pl.rawAddress)
}

public actual fun procstatGetargv(procstat: MutPtr, kp: MutPtr, nchr: SizeT): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetargv(procstat.rawAddress, kp.rawAddress, nchr.toLong()))

public actual fun procstatGetenvv(procstat: MutPtr, kp: MutPtr, nchr: SizeT): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(procstat.rawAddress, kp.rawAddress, nchr.toLong()))

public actual fun procstatGetgroups(procstat: MutPtr, kp: MutPtr, count: MutPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(procstat.rawAddress, kp.rawAddress, count.rawAddress))

public actual fun procstatGetosrel(procstat: MutPtr, kp: MutPtr, osrelp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(procstat.rawAddress, kp.rawAddress, osrelp.rawAddress)

public actual fun procstatGetpathname(procstat: MutPtr, kp: MutPtr, pathname: MutPtr, maxlen: SizeT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(procstat.rawAddress, kp.rawAddress, pathname.rawAddress, maxlen.toLong())

public actual fun procstatGetrlimit(procstat: MutPtr, kp: MutPtr, which: CInt, rlimit: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(procstat.rawAddress, kp.rawAddress, which, rlimit.rawAddress)

public actual fun procstatGetumask(procstat: MutPtr, kp: MutPtr, maskp: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetumask(procstat.rawAddress, kp.rawAddress, maskp.rawAddress)

public actual fun procstatOpenCore(filename: ConstPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(filename.rawAddress))

public actual fun procstatOpenKvm(nlistf: ConstPtr, memf: ConstPtr): MutPtr =
    MutPtr(UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(nlistf.rawAddress, memf.rawAddress))

public actual fun procstatGetSocketInfo(proc: MutPtr, fst: MutPtr, sock: MutPtr, errbuf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(proc.rawAddress, fst.rawAddress, sock.rawAddress, errbuf.rawAddress)

public actual fun procstatGetVnodeInfo(proc: MutPtr, fst: MutPtr, vn: MutPtr, errbuf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(proc.rawAddress, fst.rawAddress, vn.rawAddress, errbuf.rawAddress)

public actual fun procstatGetPtsInfo(proc: MutPtr, fst: MutPtr, pts: MutPtr, errbuf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(proc.rawAddress, fst.rawAddress, pts.rawAddress, errbuf.rawAddress)

public actual fun procstatGetShmInfo(proc: MutPtr, fst: MutPtr, shm: MutPtr, errbuf: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(proc.rawAddress, fst.rawAddress, shm.rawAddress, errbuf.rawAddress)

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr, timerid: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerCreate(clockId, evp.rawAddress, timerid.rawAddress)

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerDelete(timerid.rawAddress)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(timerid.rawAddress)

public actual fun timerGettime(timerid: TimerT, value: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerGettime(timerid.rawAddress, value.rawAddress)

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr, ovalue: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdTimerSettime(timerid.rawAddress, flags, value.rawAddress, ovalue.rawAddress)

public actual fun devstatGetnumdevs(kd: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(kd.rawAddress)

public actual fun devstatGetgeneration(kd: MutPtr): CLong =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(kd.rawAddress)

public actual fun devstatGetversion(kd: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatGetversion(kd.rawAddress)

public actual fun devstatCheckversion(kd: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(kd.rawAddress)

public actual fun devstatSelectdevs(devSelect: MutPtr, numSelected: MutPtr, numSelections: MutPtr, selectGeneration: MutPtr, currentGeneration: CLong, devices: MutPtr, numdevs: CInt, matches: MutPtr, numMatches: CInt, devSelections: MutPtr, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    0

public actual fun devstatBuildmatch(matchStr: MutPtr, matches: MutPtr, numMatches: MutPtr): CInt =
    UnixBsdFreebsdlikeFreebsdJniBridge.libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(matchStr.rawAddress, matches.rawAddress, numMatches.rawAddress)
