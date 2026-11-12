@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.illumos.Aiocb
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT
import io.github.kotlinmania.libc.unix.solarish.illumos.ShmidDs
import io.github.kotlinmania.libc.unix.solarish.illumos.Utmpx
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixSolarishJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixSolarishGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixSolarishStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixSolarishAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixSolarishAcct(filename: Long): Int

    @JvmStatic
    external fun libcUnixSolarishDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixSolarishRand(): Int

    @JvmStatic
    external fun libcUnixSolarishSrand(seed: Int)

    @JvmStatic
    external fun libcUnixSolarishGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetrandom(bbuf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixSolarishGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libcUnixSolarishFreeifaddrs(ifa: Long)

    @JvmStatic
    external fun libcUnixSolarishStackGetbounds(sp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetgrouplist(name: Long, basegid: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixSolarishInitgroups(name: Long, basegid: Short): Int

    @JvmStatic
    external fun libcUnixSolarishSetgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishIoctl(fildes: Int, request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixSolarishErrno(): Long

    @JvmStatic
    external fun libcUnixSolarishClockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishClockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishClockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSetpwent()

    @JvmStatic
    external fun libcUnixSolarishEndpwent()

    @JvmStatic
    external fun libcUnixSolarishGetpwent(): Long

    @JvmStatic
    external fun libcUnixSolarishFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixSolarishNlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libcUnixSolarishDuplocale(base: Long): Long

    @JvmStatic
    external fun libcUnixSolarishFreelocale(loc: Long)

    @JvmStatic
    external fun libcUnixSolarishNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixSolarishUselocale(loc: Long): Long

    @JvmStatic
    external fun libcUnixSolarishGetprogname(): Long

    @JvmStatic
    external fun libcUnixSolarishSetprogname(name: Long)

    @JvmStatic
    external fun libcUnixSolarishGetloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixSolarishGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixSolarishMknodat(dirfd: Int, pathname: Long, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSethostname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixSolarishIfNameindex(): Long

    @JvmStatic
    external fun libcUnixSolarishIfFreenameindex(ptr: Long)

    @JvmStatic
    external fun libcUnixSolarishPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPthreadGetnameNp(tid: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPthreadSetnameNp(tid: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixSolarishWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixSolarishGlob(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGlobfree(pglob: Long)

    @JvmStatic
    external fun libcUnixSolarishPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnFileActionsInit(fileActions: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnFileActionsDestroy(fileActions: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnFileActionsAddopen(fileActions: Long, fildes: Int, path: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnFileActionsAddclose(fileActions: Long, fildes: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnFileActionsAdddup2(fileActions: Long, fildes: Int, newfildes: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnFileActionsAddclosefromNp(fileActions: Long, lowfiledes: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnFileActionsAddchdir(fileActions: Long, path: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnFileActionsAddchdirNp(fileActions: Long, path: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnFileActionsAddfchdir(fileActions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrSetpgroup(attr: Long, pgroup: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrGetpgroup(attr: Long, pgroup: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrSetschedpolicy(attr: Long, policy: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrGetschedpolicy(attr: Long, policy: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrSetsigdefault(attr: Long, sigdefault: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrGetsigdefault(attr: Long, sigdefault: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrSetsigignoreNp(attr: Long, sigignore: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrGetsigignoreNp(attr: Long, sigignore: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrSetsigmask(attr: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPosixSpawnattrGetsigmask(attr: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixSolarishShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcUnixSolarishShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixSolarishShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishShmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcUnixSolarishShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixSolarishShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixSolarishTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixSolarishMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixSolarishMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixSolarishRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixSolarishMkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libcUnixSolarishFutimesat(fd: Int, path: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixSolarishFutimens(dirfd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixSolarishUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixSolarishNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcUnixSolarishBind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libcUnixSolarishWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixSolarishReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixSolarishSendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixSolarishRecvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixSolarishAccept4(fd: Int, address: Long, addressLen: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishMqOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixSolarishMqClose(mqd: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMqUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libcUnixSolarishMqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libcUnixSolarishMqSend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcUnixSolarishMqTimedsend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPortCreate(): Int

    @JvmStatic
    external fun libcUnixSolarishPortAssociate(port: Int, source: Int, obj: Long, events: Int, user: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPortDissociate(port: Int, source: Int, obj: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPortGet(port: Int, pe: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPortGetn(port: Int, peList: Long, max: Int, nget: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPortSend(port: Int, events: Int, user: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPortSendn(portList: Long, errorList: Long, nent: Int, events: Int, user: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixSolarishGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixSolarishThrSelf(): Long

    @JvmStatic
    external fun libcUnixSolarishPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixSolarishGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixSolarishPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSchedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixSolarishDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixSolarishGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixSolarishNativeGetpwentR(pwd: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun libcUnixSolarishNativeGetgrentR(grp: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun libcUnixSolarishSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixSolarishSetgrent()

    @JvmStatic
    external fun libcUnixSolarishEndgrent()

    @JvmStatic
    external fun libcUnixSolarishGetgrent(): Long

    @JvmStatic
    external fun libcUnixSolarishPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixSolarishDup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishMakeutx(ux: Long): Long

    @JvmStatic
    external fun libcUnixSolarishModutx(ux: Long): Long

    @JvmStatic
    external fun libcUnixSolarishUpdwtmpx(file: Long, ut: Long)

    @JvmStatic
    external fun libcUnixSolarishUtmpxname(file: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetutxent(): Long

    @JvmStatic
    external fun libcUnixSolarishGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcUnixSolarishGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixSolarishPututxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixSolarishSetutxent()

    @JvmStatic
    external fun libcUnixSolarishEndutxent()

    @JvmStatic
    external fun libcUnixSolarishEndutent()

    @JvmStatic
    external fun libcUnixSolarishGetutent(): Long

    @JvmStatic
    external fun libcUnixSolarishGetutid(u: Long): Long

    @JvmStatic
    external fun libcUnixSolarishGetutline(u: Long): Long

    @JvmStatic
    external fun libcUnixSolarishPututline(u: Long): Long

    @JvmStatic
    external fun libcUnixSolarishSetutent()

    @JvmStatic
    external fun libcUnixSolarishUtmpname(file: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetutmp(ux: Long, u: Long)

    @JvmStatic
    external fun libcUnixSolarishGetutmpx(u: Long, ux: Long)

    @JvmStatic
    external fun libcUnixSolarishUpdwtmp(file: Long, u: Long)

    @JvmStatic
    external fun libcUnixSolarishNtpAdjtime(buf: Long): Int

    @JvmStatic
    external fun libcUnixSolarishNtpGettime(buf: Long): Int

    @JvmStatic
    external fun libcUnixSolarishTimerCreate(clockId: Int, evp: Long, timerid: Long): Int

    @JvmStatic
    external fun libcUnixSolarishTimerDelete(timerid: Long): Int

    @JvmStatic
    external fun libcUnixSolarishTimerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libcUnixSolarishTimerGettime(timerid: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixSolarishTimerSettime(timerid: Long, flags: Int, value: Long, ovalue: Long): Int

    @JvmStatic
    external fun libcUnixSolarishUcredGet(pid: Int): Long

    @JvmStatic
    external fun libcUnixSolarishGetpeerucred(fd: Int, ucred: Long): Int

    @JvmStatic
    external fun libcUnixSolarishUcredFree(ucred: Long)

    @JvmStatic
    external fun libcUnixSolarishUcredGeteuid(ucred: Long): Short

    @JvmStatic
    external fun libcUnixSolarishUcredGetruid(ucred: Long): Short

    @JvmStatic
    external fun libcUnixSolarishUcredGetsuid(ucred: Long): Short

    @JvmStatic
    external fun libcUnixSolarishUcredGetegid(ucred: Long): Short

    @JvmStatic
    external fun libcUnixSolarishUcredGetrgid(ucred: Long): Short

    @JvmStatic
    external fun libcUnixSolarishUcredGetsgid(ucred: Long): Short

    @JvmStatic
    external fun libcUnixSolarishUcredGetgroups(ucred: Long, groups: Long): Int

    @JvmStatic
    external fun libcUnixSolarishUcredGetpid(ucred: Long): Int

    @JvmStatic
    external fun libcUnixSolarishUcredGetprojid(ucred: Long): Int

    @JvmStatic
    external fun libcUnixSolarishUcredGetzoneid(ucred: Long): Int

    @JvmStatic
    external fun libcUnixSolarishUcredGetpflags(ucred: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishUcredSize(): Long

    @JvmStatic
    external fun libcUnixSolarishPsetCreate(newpset: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPsetDestroy(pset: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPsetAssign(pset: Int, cpu: Int, opset: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPsetInfo(pset: Int, tpe: Long, numcpus: Long, cpulist: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPsetBind(pset: Int, idtype: Int, id: Int, opset: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPsetList(pset: Long, numpsets: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPsetSetattr(pset: Int, attr: Int): Int

    @JvmStatic
    external fun libcUnixSolarishPsetGetattr(pset: Int, attr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishProcessorBind(idtype: Int, id: Int, newBinding: Int, oldBinding: Long): Int

    @JvmStatic
    external fun libcUnixSolarishPOnline(processorid: Int, flag: Int): Int

    @JvmStatic
    external fun libcUnixSolarishProcessorInfo(processorid: Int, infop: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetexecname(): Long

    @JvmStatic
    external fun libcUnixSolarishGethostid(): Long

    @JvmStatic
    external fun libcUnixSolarishGetpflags(flags: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSetpflags(flags: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSysinfo(command: Int, buf: Long, count: Long): Int

    @JvmStatic
    external fun libcUnixSolarishFaccessat(fd: Int, path: Long, amode: Int, flag: Int): Int

    @JvmStatic
    external fun libcUnixSolarishDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixSolarishGetpagesize(): Int

    @JvmStatic
    external fun libcUnixSolarishGetpagesizes(pagesize: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixSolarishMmapobj(fd: Int, flags: Int, storage: Long, elements: Long, arg: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMeminfo(inaddr: Long, addrCount: Int, infoReq: Long, infoCount: Int, outdata: Long, validity: Long): Int

    @JvmStatic
    external fun libcUnixSolarishStrsep(string: Long, delim: Long): Long

    @JvmStatic
    external fun libcUnixSolarishGetisax(array: Long, n: Int): Int

    @JvmStatic
    external fun libcUnixSolarishBacktrace(buffer: Long, size: Int): Int

    @JvmStatic
    external fun libcUnixSolarishBacktraceSymbols(buffer: Long, size: Int): Long

    @JvmStatic
    external fun libcUnixSolarishBacktraceSymbolsFd(buffer: Long, size: Int, fd: Int)

    @JvmStatic
    external fun libcUnixSolarishGetoptLong(argc: Int, argv: Long, optstring: Long, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSync()

    @JvmStatic
    external fun libcUnixSolarishAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixSolarishAioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixSolarishAioWaitn(aiocbList: Long, nent: Int, nwait: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixSolarishAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishLioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMajor(version: Int, devnum: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMinor(version: Int, devnum: Long): Int

    @JvmStatic
    external fun libcUnixSolarishMakedev(version: Int, majdev: Int, mindev: Int): Long

    @JvmStatic
    external fun libcUnixSolarishArc4random(): Int

    @JvmStatic
    external fun libcUnixSolarishArc4randomBuf(buf: Long, nbytes: Long)

    @JvmStatic
    external fun libcUnixSolarishArc4randomUniform(upperBound: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSecureGetenv(name: Long): Long

    @JvmStatic
    external fun libcUnixSolarishStrftime(s: Long, maxsize: Long, format: Long, timeptr: Long): Long

    @JvmStatic
    external fun libcUnixSolarishStrftimeL(s: Long, maxsize: Long, format: Long, timeptr: Long, loc: Long): Long

    @JvmStatic
    external fun libcUnixSolarishSendfile(outFd: Int, inFd: Int, off: Long, len: Long): Long

    @JvmStatic
    external fun libcUnixSolarishSendfilev(fildes: Int, vec: Long, sfvcnt: Int, xferred: Long): Long

    @JvmStatic
    external fun libcUnixSolarishLgrpInit(view: Int): Long

    @JvmStatic
    external fun libcUnixSolarishLgrpFini(cookie: Long): Int

    @JvmStatic
    external fun libcUnixSolarishLgrpAffinityGet(idtype: Int, id: Int, lgrp: Int): Int

    @JvmStatic
    external fun libcUnixSolarishLgrpAffinitySet(idtype: Int, id: Int, lgrp: Int, aff: Int): Int

    @JvmStatic
    external fun libcUnixSolarishLgrpCpus(cookie: Long, lgrp: Int, cpuids: Long, count: Int, content: Int): Int

    @JvmStatic
    external fun libcUnixSolarishLgrpMemSize(cookie: Long, lgrp: Int, tpe: Int, content: Int): Long

    @JvmStatic
    external fun libcUnixSolarishLgrpNlgrps(cookie: Long): Int

    @JvmStatic
    external fun libcUnixSolarishLgrpView(cookie: Long): Int

    @JvmStatic
    external fun libcUnixSolarishLgrpHome(idtype: Int, id: Int): Int

    @JvmStatic
    external fun libcUnixSolarishLgrpVersion(version: Int): Int

    @JvmStatic
    external fun libcUnixSolarishLgrpResources(cookie: Long, lgrp: Int, lgrps: Long, count: Int, tpe: Int): Int

    @JvmStatic
    external fun libcUnixSolarishLgrpRoot(cookie: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSetrlimit(resource, rlim.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun abs(i: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAbs(i)

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAcct(filename.rawAddress)

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishDirfd(dirp.rawAddress)

public actual fun labs(i: CLong): CLong =
    UnixSolarishJniBridge.libcUnixSolarishLabs(i)

public actual fun rand(): CInt =
    UnixSolarishJniBridge.libcUnixSolarishRand()

public actual fun srand(seed: CUint) {
    UnixSolarishJniBridge.libcUnixSolarishSrand(seed.toInt())
}

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetentropy(buf.rawAddress, buflen.toLong())

public actual fun getrandom(bbuf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishGetrandom(bbuf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun settimeofday(tp: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetifaddrs(ifap.rawAddress)

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    UnixSolarishJniBridge.libcUnixSolarishFreeifaddrs(ifa.rawAddress)
}

public actual fun stackGetbounds(sp: MutPtr<StackT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishStackGetbounds(sp.rawAddress)

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetgrouplist(name.rawAddress, basegid.toShort(), groups.rawAddress, ngroups.rawAddress)

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishInitgroups(name.rawAddress, basegid.toShort())

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSetgroups(ngroups, ptr.rawAddress)

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    UnixSolarishJniBridge.libcUnixSolarishIoctl(fildes, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun errno(): MutPtr<CInt> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishErrno())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishClockGetres(clkId, tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishClockGettime(clkId, tp.rawAddress)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishClockSettime(clkId, tp.rawAddress)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun setpwent() {
    UnixSolarishJniBridge.libcUnixSolarishSetpwent()
}

public actual fun endpwent() {
    UnixSolarishJniBridge.libcUnixSolarishEndpwent()
}

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetpwent())

public actual fun fdatasync(fd: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishFdatasync(fd)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishNlLanginfoL(item, locale.rawAddress))

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishDuplocale(base.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    UnixSolarishJniBridge.libcUnixSolarishFreelocale(loc.rawAddress)
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishUselocale(loc.rawAddress))

public actual fun getprogname(): ConstPtr<CChar> =
    ConstPtr(UnixSolarishJniBridge.libcUnixSolarishGetprogname())

public actual fun setprogname(name: ConstPtr<CChar>) {
    UnixSolarishJniBridge.libcUnixSolarishSetprogname(name.rawAddress)
}

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetloadavg(loadavg.rawAddress, nelem)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetpriority(which, who)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSetpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMknodat(dirfd, pathname.rawAddress, mode.toInt(), dev.toLong())

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSethostname(name.rawAddress, len)

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishIfNameindex())

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    UnixSolarishJniBridge.libcUnixSolarishIfFreenameindex(ptr.rawAddress)
}

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadGetnameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadGetnameNp(tid.toLong(), name.rawAddress, len.toLong())

public actual fun pthreadSetnameNp(tid: PthreadT, name: ConstPtr<CChar>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadSetnameNp(tid.toLong(), name.rawAddress)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishWaitid(idtype.toInt(), id, infop.rawAddress, options)

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGlob(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree(pglob: MutPtr<GlobT>) {
    UnixSolarishJniBridge.libcUnixSolarishGlobfree(pglob.rawAddress)
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixFallocate(fd, offset, len)

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnFileActionsInit(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnFileActionsInit(fileActions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnFileActionsDestroy(fileActions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnFileActionsAddopen(fileActions.rawAddress, fildes, path.rawAddress, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnFileActionsAddclose(fileActions.rawAddress, fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, newfildes: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnFileActionsAdddup2(fileActions.rawAddress, fildes, newfildes)

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: MutPtr<PosixSpawnFileActionsT>, lowfiledes: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnFileActionsAddclosefromNp(fileActions.rawAddress, lowfiledes)

public actual fun posixSpawnFileActionsAddchdir(fileActions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnFileActionsAddchdir(fileActions.rawAddress, path.rawAddress)

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnFileActionsAddchdirNp(fileActions.rawAddress, path.rawAddress)

public actual fun posixSpawnFileActionsAddfchdir(fileActions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnFileActionsAddfchdir(fileActions.rawAddress, fd)

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, pgroup: PidT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrSetpgroup(attr.rawAddress, pgroup)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, pgroup: MutPtr<PidT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrGetpgroup(attr.rawAddress, pgroup.rawAddress)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, policy: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrSetschedpolicy(attr.rawAddress, policy)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, policy: MutPtr<CInt>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrGetschedpolicy(attr.rawAddress, policy.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, sigdefault: ConstPtr<SigsetT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrSetsigdefault(attr.rawAddress, sigdefault.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, sigdefault: MutPtr<SigsetT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrGetsigdefault(attr.rawAddress, sigdefault.rawAddress)

public actual fun posixSpawnattrSetsigignoreNp(attr: MutPtr<PosixSpawnattrT>, sigignore: ConstPtr<SigsetT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrSetsigignoreNp(attr.rawAddress, sigignore.rawAddress)

public actual fun posixSpawnattrGetsigignoreNp(attr: ConstPtr<PosixSpawnattrT>, sigignore: MutPtr<SigsetT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrGetsigignoreNp(attr.rawAddress, sigignore.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, sigmask: ConstPtr<SigsetT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrSetsigmask(attr.rawAddress, sigmask.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, sigmask: MutPtr<SigsetT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPosixSpawnattrGetsigmask(attr.rawAddress, sigmask.rawAddress)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishShmctl(shmid, cmd, buf.rawAddress)

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishShmdt(shmaddr.rawAddress)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishShmget(key, size.toLong(), shmflg)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishShmUnlink(name.rawAddress)

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    UnixSolarishJniBridge.libcUnixSolarishSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    UnixSolarishJniBridge.libcUnixSolarishTelldir(dirp.rawAddress)

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMsync(addr.rawAddress, len.toLong(), flags)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishMemalign(align.toLong(), size.toLong()))

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMkstemps(template.rawAddress, suffixlen)

public actual fun futimesat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishFutimesat(fd, path.rawAddress, times.rawAddress)

public actual fun futimens(dirfd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishFutimens(dirfd, times.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishNlLanginfo(item))

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishBind(socket, address.rawAddress, addressLen.toInt())

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishReadv(fd, iov.rawAddress, iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishSendmsg(fd, msg.rawAddress, flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishRecvmsg(fd, msg.rawAddress, flags)

public actual fun accept4(fd: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>, flags: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAccept4(fd, address.rawAddress, addressLen.rawAddress, flags)

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishMqOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun mqClose(mqd: MqdT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMqClose(mqd.rawAddress)

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMqUnlink(name.rawAddress)

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishMqReceive(mqd.rawAddress, msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishMqTimedreceive(mqd.rawAddress, msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress, absTimeout.rawAddress)

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMqSend(mqd.rawAddress, msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMqTimedsend(mqd.rawAddress, msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt(), absTimeout.rawAddress)

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMqGetattr(mqd.rawAddress, attr.rawAddress)

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMqSetattr(mqd.rawAddress, newattr.rawAddress, oldattr.rawAddress)

public actual fun portCreate(): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPortCreate()

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: MutPtr<CVoid>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPortAssociate(port, source, obj.toLong(), events, user.rawAddress)

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPortDissociate(port, source, obj.toLong())

public actual fun portGet(port: CInt, pe: MutPtr<PortEvent>, timeout: MutPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPortGet(port, pe.rawAddress, timeout.rawAddress)

public actual fun portGetn(port: CInt, peList: MutPtr<PortEvent>, max: CUint, nget: MutPtr<CUint>, timeout: MutPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPortGetn(port, peList.rawAddress, max.toInt(), nget.rawAddress, timeout.rawAddress)

public actual fun portSend(port: CInt, events: CInt, user: MutPtr<CVoid>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPortSend(port, events, user.rawAddress)

public actual fun portSendn(portList: MutPtr<CInt>, errorList: MutPtr<CInt>, nent: CUint, events: CInt, user: MutPtr<CVoid>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPortSendn(portList.rawAddress, errorList.rawAddress, nent.toInt(), events, user.rawAddress)

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSigsuspend(mask.rawAddress)

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSemClose(sem.rawAddress)

public actual fun getdtablesize(): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun thrSelf(): ThreadT =
    UnixSolarishJniBridge.libcUnixSolarishThrSelf().toUInt()

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetgrnam(name.rawAddress))

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadKill(thread.toLong(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSchedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSchedGetPriorityMax(policy)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSchedGetparam(pid, param.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSchedSetparam(pid, param.rawAddress)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSemUnlink(name.rawAddress)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetpwuidR(uid.toShort(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun nativeGetpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Passwd> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishNativeGetpwentR(pwd.rawAddress, buf.rawAddress, buflen))

public actual fun nativeGetgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Group> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishNativeGetgrentR(grp.rawAddress, buf.rawAddress, buflen))

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSigwait(set.rawAddress, sig.rawAddress)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetgrgid(gid.toShort()))

public actual fun setgrent() {
    UnixSolarishJniBridge.libcUnixSolarishSetgrent()
}

public actual fun endgrent() {
    UnixSolarishJniBridge.libcUnixSolarishEndgrent()
}

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetgrent())

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishPopen(command.rawAddress, mode.rawAddress))

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishDup3(src, dst, flags)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishUname(buf.rawAddress)

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPipe2(fds.rawAddress, flags)

public actual fun makeutx(ux: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishMakeutx(ux.rawAddress))

public actual fun modutx(ux: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishModutx(ux.rawAddress))

public actual fun updwtmpx(file: ConstPtr<CChar>, ut: MutPtr<Utmpx>) {
    UnixSolarishJniBridge.libcUnixSolarishUpdwtmpx(file.rawAddress, ut.rawAddress)
}

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishUtmpxname(file.rawAddress)

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetutxent())

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetutxline(ut.rawAddress))

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishPututxline(ut.rawAddress))

public actual fun setutxent() {
    UnixSolarishJniBridge.libcUnixSolarishSetutxent()
}

public actual fun endutxent() {
    UnixSolarishJniBridge.libcUnixSolarishEndutxent()
}

public actual fun endutent() {
    UnixSolarishJniBridge.libcUnixSolarishEndutent()
}

public actual fun getutent(): MutPtr<Utmp> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetutent())

public actual fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetutid(u.rawAddress))

public actual fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishGetutline(u.rawAddress))

public actual fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishPututline(u.rawAddress))

public actual fun setutent() {
    UnixSolarishJniBridge.libcUnixSolarishSetutent()
}

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishUtmpname(file.rawAddress)

public actual fun getutmp(ux: ConstPtr<Utmpx>, u: MutPtr<Utmp>) {
    UnixSolarishJniBridge.libcUnixSolarishGetutmp(ux.rawAddress, u.rawAddress)
}

public actual fun getutmpx(u: ConstPtr<Utmp>, ux: MutPtr<Utmpx>) {
    UnixSolarishJniBridge.libcUnixSolarishGetutmpx(u.rawAddress, ux.rawAddress)
}

public actual fun updwtmp(file: ConstPtr<CChar>, u: MutPtr<Utmp>) {
    UnixSolarishJniBridge.libcUnixSolarishUpdwtmp(file.rawAddress, u.rawAddress)
}

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishNtpAdjtime(buf.rawAddress)

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishNtpGettime(buf.rawAddress)

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishTimerCreate(clockId, evp.rawAddress, timerid.rawAddress)

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishTimerDelete(timerid.toLong())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishTimerGetoverrun(timerid.toLong())

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishTimerGettime(timerid.toLong(), value.rawAddress)

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr<Itimerspec>, ovalue: MutPtr<Itimerspec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishTimerSettime(timerid.toLong(), flags, value.rawAddress, ovalue.rawAddress)

public actual fun ucredGet(pid: PidT): MutPtr<UcredT> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishUcredGet(pid))

public actual fun getpeerucred(fd: CInt, ucred: MutPtr<MutPtr<UcredT>>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetpeerucred(fd, ucred.rawAddress)

public actual fun ucredFree(ucred: MutPtr<UcredT>) {
    UnixSolarishJniBridge.libcUnixSolarishUcredFree(ucred.rawAddress)
}

public actual fun ucredGeteuid(ucred: ConstPtr<UcredT>): UidT =
    UnixSolarishJniBridge.libcUnixSolarishUcredGeteuid(ucred.rawAddress).toUShort()

public actual fun ucredGetruid(ucred: ConstPtr<UcredT>): UidT =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetruid(ucred.rawAddress).toUShort()

public actual fun ucredGetsuid(ucred: ConstPtr<UcredT>): UidT =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetsuid(ucred.rawAddress).toUShort()

public actual fun ucredGetegid(ucred: ConstPtr<UcredT>): GidT =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetegid(ucred.rawAddress).toUShort()

public actual fun ucredGetrgid(ucred: ConstPtr<UcredT>): GidT =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetrgid(ucred.rawAddress).toUShort()

public actual fun ucredGetsgid(ucred: ConstPtr<UcredT>): GidT =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetsgid(ucred.rawAddress).toUShort()

public actual fun ucredGetgroups(ucred: ConstPtr<UcredT>, groups: MutPtr<ConstPtr<GidT>>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetgroups(ucred.rawAddress, groups.rawAddress)

public actual fun ucredGetpid(ucred: ConstPtr<UcredT>): PidT =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetpid(ucred.rawAddress)

public actual fun ucredGetprojid(ucred: ConstPtr<UcredT>): ProjidT =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetprojid(ucred.rawAddress)

public actual fun ucredGetzoneid(ucred: ConstPtr<UcredT>): ZoneidT =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetzoneid(ucred.rawAddress)

public actual fun ucredGetpflags(ucred: ConstPtr<UcredT>, flags: CUint): CUint =
    UnixSolarishJniBridge.libcUnixSolarishUcredGetpflags(ucred.rawAddress, flags.toInt()).toUInt()

public actual fun ucredSize(): SizeT =
    UnixSolarishJniBridge.libcUnixSolarishUcredSize().toULong()

public actual fun psetCreate(newpset: MutPtr<PsetidT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPsetCreate(newpset.rawAddress)

public actual fun psetDestroy(pset: PsetidT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPsetDestroy(pset)

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: MutPtr<PsetidT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPsetAssign(pset, cpu, opset.rawAddress)

public actual fun psetInfo(pset: PsetidT, tpe: MutPtr<CInt>, numcpus: MutPtr<CUint>, cpulist: MutPtr<ProcessoridT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPsetInfo(pset, tpe.rawAddress, numcpus.rawAddress, cpulist.rawAddress)

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: MutPtr<PsetidT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPsetBind(pset, idtype.toInt(), id, opset.rawAddress)

public actual fun psetList(pset: MutPtr<PsetidT>, numpsets: MutPtr<CUint>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPsetList(pset.rawAddress, numpsets.rawAddress)

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPsetSetattr(pset, attr.toInt())

public actual fun psetGetattr(pset: PsetidT, attr: MutPtr<CUint>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPsetGetattr(pset, attr.rawAddress)

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: MutPtr<ProcessoridT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishProcessorBind(idtype.toInt(), id, newBinding, oldBinding.rawAddress)

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishPOnline(processorid, flag)

public actual fun processorInfo(processorid: ProcessoridT, infop: MutPtr<ProcessorInfoT>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishProcessorInfo(processorid, infop.rawAddress)

public actual fun getexecname(): ConstPtr<CChar> =
    ConstPtr(UnixSolarishJniBridge.libcUnixSolarishGetexecname())

public actual fun gethostid(): CLong =
    UnixSolarishJniBridge.libcUnixSolarishGethostid()

public actual fun getpflags(flags: CUint): CUint =
    UnixSolarishJniBridge.libcUnixSolarishGetpflags(flags.toInt()).toUInt()

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSetpflags(flags.toInt(), value.toInt())

public actual fun sysinfo(command: CInt, buf: MutPtr<CChar>, count: CLong): CInt =
    UnixSolarishJniBridge.libcUnixSolarishSysinfo(command, buf.rawAddress, count)

public actual fun faccessat(fd: CInt, path: ConstPtr<CChar>, amode: CInt, flag: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishFaccessat(fd, path.rawAddress, amode, flag)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishDlIteratePhdr(0L, data.rawAddress)

public actual fun getpagesize(): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetpagesize()

public actual fun getpagesizes(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetpagesizes(pagesize.rawAddress, nelem)

public actual fun mmapobj(fd: CInt, flags: CUint, storage: MutPtr<MmapobjResultT>, elements: MutPtr<CUint>, arg: MutPtr<CVoid>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMmapobj(fd, flags.toInt(), storage.rawAddress, elements.rawAddress, arg.rawAddress)

public actual fun meminfo(inaddr: ConstPtr<ULong>, addrCount: CInt, infoReq: ConstPtr<CUint>, infoCount: CInt, outdata: MutPtr<ULong>, validity: MutPtr<CUint>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishMeminfo(inaddr.rawAddress, addrCount, infoReq.rawAddress, infoCount, outdata.rawAddress, validity.rawAddress)

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishStrsep(string.rawAddress, delim.rawAddress))

public actual fun getisax(array: MutPtr<UInt>, n: CUint): CUint =
    UnixSolarishJniBridge.libcUnixSolarishGetisax(array.rawAddress, n.toInt()).toUInt()

public actual fun backtrace(buffer: MutPtr<MutPtr<CVoid>>, size: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishBacktrace(buffer.rawAddress, size)

public actual fun backtraceSymbols(buffer: ConstPtr<MutPtr<CVoid>>, size: CInt): MutPtr<MutPtr<CChar>> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishBacktraceSymbols(buffer.rawAddress, size))

public actual fun backtraceSymbolsFd(buffer: ConstPtr<MutPtr<CVoid>>, size: CInt, fd: CInt) {
    UnixSolarishJniBridge.libcUnixSolarishBacktraceSymbolsFd(buffer.rawAddress, size, fd)
}

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishGetoptLong(argc, argv.rawAddress, optstring.rawAddress, longopts.rawAddress, longindex.rawAddress)

public actual fun sync() {
    UnixSolarishJniBridge.libcUnixSolarishSync()
}

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAioCancel(fd, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAioError(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAioFsync(op, aiocbp.rawAddress)

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAioRead(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAioSuspend(aiocbList.rawAddress, nitems, timeout.rawAddress)

public actual fun aioWaitn(aiocbList: MutPtr<MutPtr<Aiocb>>, nent: CUint, nwait: MutPtr<CUint>, timeout: ConstPtr<Timespec>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAioWaitn(aiocbList.rawAddress, nent.toInt(), nwait.rawAddress, timeout.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishAioWrite(aiocbp.rawAddress)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    UnixSolarishJniBridge.libcUnixSolarishLioListio(mode, aiocbList.rawAddress, nitems, sevp.rawAddress)

public actual fun major(version: CInt, devnum: DevT): MajorT =
    UnixSolarishJniBridge.libcUnixSolarishMajor(version, devnum.toLong()).toUInt()

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    UnixSolarishJniBridge.libcUnixSolarishMinor(version, devnum.toLong()).toUInt()

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    UnixSolarishJniBridge.libcUnixSolarishMakedev(version, majdev.toInt(), mindev.toInt()).toULong()

public actual fun arc4random(): UInt =
    UnixSolarishJniBridge.libcUnixSolarishArc4random().toUInt()

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, nbytes: SizeT) {
    UnixSolarishJniBridge.libcUnixSolarishArc4randomBuf(buf.rawAddress, nbytes.toLong())
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    UnixSolarishJniBridge.libcUnixSolarishArc4randomUniform(upperBound.toInt()).toUInt()

public actual fun secureGetenv(name: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixSolarishJniBridge.libcUnixSolarishSecureGetenv(name.rawAddress))

public actual fun strftime(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    UnixSolarishJniBridge.libcUnixSolarishStrftime(s.rawAddress, maxsize.toLong(), format.rawAddress, timeptr.rawAddress).toULong()

public actual fun strftimeL(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>, loc: LocaleT): SizeT =
    UnixSolarishJniBridge.libcUnixSolarishStrftimeL(s.rawAddress, maxsize.toLong(), format.rawAddress, timeptr.rawAddress, loc.rawAddress).toULong()

public actual fun sendfile(outFd: CInt, inFd: CInt, off: MutPtr<OffT>, len: SizeT): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishSendfile(outFd, inFd, off.rawAddress, len.toLong())

public actual fun sendfilev(fildes: CInt, vec: ConstPtr<SendfilevecT>, sfvcnt: CInt, xferred: MutPtr<SizeT>): SsizeT =
    UnixSolarishJniBridge.libcUnixSolarishSendfilev(fildes, vec.rawAddress, sfvcnt, xferred.rawAddress)

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    UnixSolarishJniBridge.libcUnixSolarishLgrpInit(view.toInt()).toULong()

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishLgrpFini(cookie.toLong())

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    UnixSolarishJniBridge.libcUnixSolarishLgrpAffinityGet(idtype.toInt(), id, lgrp)

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishLgrpAffinitySet(idtype.toInt(), id, lgrp, aff)

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: MutPtr<ProcessoridT>, count: CUint, content: LgrpContentT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishLgrpCpus(cookie.toLong(), lgrp, cpuids.rawAddress, count.toInt(), content.toInt())

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    UnixSolarishJniBridge.libcUnixSolarishLgrpMemSize(cookie.toLong(), lgrp, tpe.toInt(), content.toInt())

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishLgrpNlgrps(cookie.toLong())

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    UnixSolarishJniBridge.libcUnixSolarishLgrpView(cookie.toLong()).toUInt()

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    UnixSolarishJniBridge.libcUnixSolarishLgrpHome(idtype.toInt(), id)

public actual fun lgrpVersion(version: CInt): CInt =
    UnixSolarishJniBridge.libcUnixSolarishLgrpVersion(version)

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: MutPtr<LgrpIdT>, count: CUint, tpe: LgrpRsrcT): CInt =
    UnixSolarishJniBridge.libcUnixSolarishLgrpResources(cookie.toLong(), lgrp, lgrps.rawAddress, count.toInt(), tpe)

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    UnixSolarishJniBridge.libcUnixSolarishLgrpRoot(cookie.toLong())
