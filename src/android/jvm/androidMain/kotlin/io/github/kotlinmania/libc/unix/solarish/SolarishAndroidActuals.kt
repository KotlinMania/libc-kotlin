@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.major
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.makedev
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.minor
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT

private object UnixSolarishJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_solarish_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_abs(i: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_acct(filename: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_labs(i: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_rand(): Int

    @JvmStatic
    external fun libc_unix_solarish_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_solarish_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getrandom(bbuf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_settimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_freeifaddrs(ifa: Long)

    @JvmStatic
    external fun libc_unix_solarish_stackGetbounds(sp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getgrouplist(name: String?, basegid: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_initgroups(name: String?, basegid: Short): Int

    @JvmStatic
    external fun libc_unix_solarish_setgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_errno(): Long

    @JvmStatic
    external fun libc_unix_solarish_clockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_clockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_setpwent()

    @JvmStatic
    external fun libc_unix_solarish_endpwent()

    @JvmStatic
    external fun libc_unix_solarish_getpwent(): Long

    @JvmStatic
    external fun libc_unix_solarish_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_nlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_solarish_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_getprogname(): Long

    @JvmStatic
    external fun libc_unix_solarish_setprogname(name: String?)

    @JvmStatic
    external fun libc_unix_solarish_getloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_sethostname(name: String?, len: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_ifNameindex(): Long

    @JvmStatic
    external fun libc_unix_solarish_ifFreenameindex(ptr: Long)

    @JvmStatic
    external fun libc_unix_solarish_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_pthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_pthreadGetnameNp(tid: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_pthreadSetnameNp(tid: Long, name: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_waitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_globfree(pglob: Long)

    @JvmStatic
    external fun libc_unix_solarish_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnFileActionsInit(fileActions: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnFileActionsDestroy(fileActions: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnFileActionsAddopen(fileActions: Long, fildes: Int, path: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnFileActionsAddclose(fileActions: Long, fildes: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnFileActionsAdddup2(fileActions: Long, fildes: Int, newfildes: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnFileActionsAddclosefromNp(fileActions: Long, lowfiledes: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnFileActionsAddchdir(fileActions: Long, path: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnFileActionsAddchdirNp(fileActions: Long, path: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnFileActionsAddfchdir(fileActions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrSetpgroup(attr: Long, pgroup: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrGetpgroup(attr: Long, pgroup: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrSetschedpolicy(attr: Long, policy: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrGetschedpolicy(attr: Long, policy: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrSetsigdefault(attr: Long, sigdefault: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrGetsigdefault(attr: Long, sigdefault: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrSetsigignoreNp(attr: Long, sigignore: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrGetsigignoreNp(attr: Long, sigignore: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrSetsigmask(attr: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_posixSpawnattrGetsigmask(attr: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_shmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_shmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_shmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_solarish_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_mkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_futimesat(fd: Int, path: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_futimens(dirfd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_bind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_sendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_recvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_accept4(fd: Int, address: Long, addressLen: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_mqClose(mqd: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_mqUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_mqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_portCreate(): Int

    @JvmStatic
    external fun libc_unix_solarish_portAssociate(port: Int, source: Int, obj: Long, events: Int, user: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_portDissociate(port: Int, source: Int, obj: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_portGet(port: Int, pe: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_portGetn(port: Int, peList: Long, max: Int, nget: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_portSend(port: Int, events: Int, user: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_portSendn(portList: Long, errorList: Long, nent: Int, events: Int, user: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_solarish_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_thrSelf(): Long

    @JvmStatic
    external fun libc_unix_solarish_pthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_solarish_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_schedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_nativeGetpwentR(pwd: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_nativeGetgrentR(grp: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_solarish_setgrent()

    @JvmStatic
    external fun libc_unix_solarish_endgrent()

    @JvmStatic
    external fun libc_unix_solarish_getgrent(): Long

    @JvmStatic
    external fun libc_unix_solarish_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_solarish_dup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_pipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_makeutx(ux: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_modutx(ux: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_updwtmpx(file: String?, ut: Long)

    @JvmStatic
    external fun libc_unix_solarish_utmpxname(file: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_getutxent(): Long

    @JvmStatic
    external fun libc_unix_solarish_getutxid(ut: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_getutxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_pututxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_setutxent()

    @JvmStatic
    external fun libc_unix_solarish_endutxent()

    @JvmStatic
    external fun libc_unix_solarish_endutent()

    @JvmStatic
    external fun libc_unix_solarish_getutent(): Long

    @JvmStatic
    external fun libc_unix_solarish_getutid(u: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_getutline(u: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_pututline(u: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_setutent()

    @JvmStatic
    external fun libc_unix_solarish_utmpname(file: String?): Int

    @JvmStatic
    external fun libc_unix_solarish_getutmp(ux: Long, u: Long)

    @JvmStatic
    external fun libc_unix_solarish_getutmpx(u: Long, ux: Long)

    @JvmStatic
    external fun libc_unix_solarish_updwtmp(file: String?, u: Long)

    @JvmStatic
    external fun libc_unix_solarish_ntpAdjtime(buf: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_ntpGettime(buf: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_timerCreate(clockId: Int, evp: Long, timerid: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_timerDelete(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_timerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_timerGettime(timerid: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_timerSettime(timerid: Long, flags: Int, value: Long, ovalue: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_ucredGet(pid: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_getpeerucred(fd: Int, ucred: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_ucredFree(ucred: Long)

    @JvmStatic
    external fun libc_unix_solarish_ucredGeteuid(ucred: Long): Short

    @JvmStatic
    external fun libc_unix_solarish_ucredGetruid(ucred: Long): Short

    @JvmStatic
    external fun libc_unix_solarish_ucredGetsuid(ucred: Long): Short

    @JvmStatic
    external fun libc_unix_solarish_ucredGetegid(ucred: Long): Short

    @JvmStatic
    external fun libc_unix_solarish_ucredGetrgid(ucred: Long): Short

    @JvmStatic
    external fun libc_unix_solarish_ucredGetsgid(ucred: Long): Short

    @JvmStatic
    external fun libc_unix_solarish_ucredGetgroups(ucred: Long, groups: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_ucredGetpid(ucred: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_ucredGetprojid(ucred: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_ucredGetzoneid(ucred: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_ucredGetpflags(ucred: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_ucredSize(): Long

    @JvmStatic
    external fun libc_unix_solarish_psetCreate(newpset: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_psetDestroy(pset: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_psetAssign(pset: Int, cpu: Int, opset: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_psetInfo(pset: Int, tpe: Long, numcpus: Long, cpulist: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_psetBind(pset: Int, idtype: Int, id: Int, opset: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_psetList(pset: Long, numpsets: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_psetSetattr(pset: Int, attr: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_psetGetattr(pset: Int, attr: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_processorBind(idtype: Int, id: Int, newBinding: Int, oldBinding: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_pOnline(processorid: Int, flag: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_processorInfo(processorid: Int, infop: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getexecname(): Long

    @JvmStatic
    external fun libc_unix_solarish_gethostid(): Long

    @JvmStatic
    external fun libc_unix_solarish_getpflags(flags: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_setpflags(flags: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_sysinfo(command: Int, buf: Long, count: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_faccessat(fd: Int, path: String?, amode: Int, flag: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_dlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_getpagesize(): Int

    @JvmStatic
    external fun libc_unix_solarish_getpagesizes(pagesize: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_mmapobj(fd: Int, flags: Int, storage: Long, elements: Long, arg: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_meminfo(inaddr: Long, addrCount: Int, infoReq: Long, infoCount: Int, outdata: Long, validity: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_strsep(string: Long, delim: String?): Long

    @JvmStatic
    external fun libc_unix_solarish_getisax(array: Long, n: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_backtrace(buffer: Long, size: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_backtraceSymbols(buffer: Long, size: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_backtraceSymbolsFd(buffer: Long, size: Int, fd: Int)

    @JvmStatic
    external fun libc_unix_solarish_getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_sync()

    @JvmStatic
    external fun libc_unix_solarish_aioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_aioError(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_aioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_aioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_aioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_aioWaitn(aiocbList: Long, nent: Int, nwait: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_aioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_major(version: Int, devnum: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_minor(version: Int, devnum: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_makedev(version: Int, majdev: Int, mindev: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_arc4random(): Int

    @JvmStatic
    external fun libc_unix_solarish_arc4randomBuf(buf: Long, nbytes: Long)

    @JvmStatic
    external fun libc_unix_solarish_arc4randomUniform(upperBound: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_secureGetenv(name: String?): Long

    @JvmStatic
    external fun libc_unix_solarish_strftime(s: Long, maxsize: Long, format: String?, timeptr: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_strftimeL(s: Long, maxsize: Long, format: String?, timeptr: Long, loc: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_sendfile(outFd: Int, inFd: Int, off: Long, len: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_sendfilev(fildes: Int, vec: Long, sfvcnt: Int, xferred: Long): Long

    @JvmStatic
    external fun libc_unix_solarish_lgrpInit(view: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_lgrpFini(cookie: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_lgrpAffinityGet(idtype: Int, id: Int, lgrp: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_lgrpAffinitySet(idtype: Int, id: Int, lgrp: Int, aff: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_lgrpCpus(cookie: Long, lgrp: Int, cpuids: Long, count: Int, content: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_lgrpMemSize(cookie: Long, lgrp: Int, tpe: Int, content: Int): Long

    @JvmStatic
    external fun libc_unix_solarish_lgrpNlgrps(cookie: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_lgrpView(cookie: Long): Int

    @JvmStatic
    external fun libc_unix_solarish_lgrpHome(idtype: Int, id: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_lgrpVersion(version: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_lgrpResources(cookie: Long, lgrp: Int, lgrps: Long, count: Int, tpe: Int): Int

    @JvmStatic
    external fun libc_unix_solarish_lgrpRoot(cookie: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_semDestroy((sem?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun abs(i: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_abs(i)

public actual fun acct(filename: String?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_acct(filename)

public actual fun dirfd(dirp: DIR?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_dirfd((dirp?.handle ?: 0L))

public actual fun labs(i: CLong): CLong =
    UnixSolarishJniBridge.libc_unix_solarish_labs(i)

public actual fun rand(): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_rand()

public actual fun srand(seed: CUint) {
    UnixSolarishJniBridge.libc_unix_solarish_srand(seed.toInt())
}

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_getrandom((bbuf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_settimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getifaddrs((ifap?.value ?: 0L))

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    UnixSolarishJniBridge.libc_unix_solarish_freeifaddrs((ifa?.value ?: 0L))
}

public actual fun stackGetbounds(sp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_stackGetbounds((sp?.value ?: 0L))

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getgrouplist(name, basegid.toShort(), (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_initgroups(name, basegid.toShort())

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_setgroups(ngroups, (ptr?.value ?: 0L))

public actual fun ioctl(fildes: CInt, request: CInt): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun errno(): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_errno().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_clockGetres(clkId, (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_clockSettime(clkId, (tp?.value ?: 0L))

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun setpwent() {
    UnixSolarishJniBridge.libc_unix_solarish_setpwent()
}

public actual fun endpwent() {
    UnixSolarishJniBridge.libc_unix_solarish_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fdatasync(fd: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_fdatasync(fd)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_nlLanginfoL(item, locale.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun duplocale(base: LocaleT): LocaleT =
    UnixSolarishJniBridge.libc_unix_solarish_duplocale(base.toLong()).toULong()()

public actual fun freelocale(loc: LocaleT) {
    UnixSolarishJniBridge.libc_unix_solarish_freelocale(loc.toLong())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    UnixSolarishJniBridge.libc_unix_solarish_newlocale(mask, locale, base.toLong()).toULong()()

public actual fun uselocale(loc: LocaleT): LocaleT =
    UnixSolarishJniBridge.libc_unix_solarish_uselocale(loc.toLong()).toULong()()

public actual fun getprogname(): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getprogname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(name: String?) {
    UnixSolarishJniBridge.libc_unix_solarish_setprogname(name)
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getloadavg((loadavg?.value ?: 0L), nelem)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getpriority(which, who)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_setpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mknodat(dirfd, pathname, mode.toInt(), dev.toLong())

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mkfifoat(dirfd, pathname, mode.toInt())

public actual fun sethostname(name: String?, len: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_sethostname(name, len)

public actual fun ifNameindex(): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_ifNameindex().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    UnixSolarishJniBridge.libc_unix_solarish_ifFreenameindex((ptr?.value ?: 0L))
}

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadMutexTimedlock((lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadGetnameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadGetnameNp(tid.toLong(), (name?.value ?: 0L), len.toLong())

public actual fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadSetnameNp(tid.toLong(), name)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_waitid(idtype.toInt(), id, (infop?.value ?: 0L), options)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_glob(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree(pglob: COpaquePointer?) {
    UnixSolarishJniBridge.libc_unix_solarish_globfree((pglob?.value ?: 0L))
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixFallocate(fd, offset, len)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnFileActionsInit((fileActions?.value ?: 0L))

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnFileActionsDestroy((fileActions?.value ?: 0L))

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnFileActionsAddopen((fileActions?.value ?: 0L), fildes, path, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnFileActionsAddclose((fileActions?.value ?: 0L), fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnFileActionsAdddup2((fileActions?.value ?: 0L), fildes, newfildes)

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnFileActionsAddclosefromNp((fileActions?.value ?: 0L), lowfiledes)

public actual fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnFileActionsAddchdir((fileActions?.value ?: 0L), path)

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnFileActionsAddchdirNp((fileActions?.value ?: 0L), path)

public actual fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnFileActionsAddfchdir((fileActions?.value ?: 0L), fd)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrSetpgroup((attr?.value ?: 0L), pgroup)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrGetpgroup((attr?.value ?: 0L), (pgroup?.value ?: 0L))

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrSetschedpolicy((attr?.value ?: 0L), policy)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrGetschedpolicy((attr?.value ?: 0L), (policy?.value ?: 0L))

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (sigdefault?.value ?: 0L))

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (sigdefault?.value ?: 0L))

public actual fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrSetsigignoreNp((attr?.value ?: 0L), (sigignore?.value ?: 0L))

public actual fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrGetsigignoreNp((attr?.value ?: 0L), (sigignore?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrSetsigmask((attr?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_posixSpawnattrGetsigmask((attr?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_shmat(shmid, (shmaddr?.value ?: 0L), shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_shmctl(shmid, cmd, (buf?.value ?: 0L))

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_shmdt((shmaddr?.value ?: 0L))

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_shmget(key, size.toLong(), shmflg)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_shmOpen(name, oflag, mode.toInt())

public actual fun shmUnlink(name: String?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixSolarishJniBridge.libc_unix_solarish_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixSolarishJniBridge.libc_unix_solarish_telldir((dirp?.handle ?: 0L))

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mkstemps((template?.value ?: 0L), suffixlen)

public actual fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_futimesat(fd, path, (times?.value ?: 0L))

public actual fun futimens(dirfd: CInt, times: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_futimens(dirfd, (times?.value ?: 0L))

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_bind(socket, (address?.value ?: 0L), addressLen.toInt())

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_sendmsg(fd, (msg?.value ?: 0L), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_recvmsg(fd, (msg?.value ?: 0L), flags)

public actual fun accept4(fd: CInt, address: COpaquePointer?, addressLen: COpaquePointer?, flags: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_accept4(fd, (address?.value ?: 0L), (addressLen?.value ?: 0L), flags)

public actual fun mqOpen(name: String?, oflag: CInt): MqdT =
    null

public actual fun mqClose(mqd: MqdT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mqClose(mqd.toLong())

public actual fun mqUnlink(name: String?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_mqReceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L))

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_mqTimedreceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L), (absTimeout?.value ?: 0L))

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mqSend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mqTimedsend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt(), (absTimeout?.value ?: 0L))

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mqGetattr(mqd.toLong(), (attr?.value ?: 0L))

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mqSetattr(mqd.toLong(), (newattr?.value ?: 0L), (oldattr?.value ?: 0L))

public actual fun portCreate(): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_portCreate()

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_portAssociate(port, source, obj.toLong(), events, (user?.value ?: 0L))

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_portDissociate(port, source, obj.toLong())

public actual fun portGet(port: CInt, pe: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_portGet(port, (pe?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun portGetn(port: CInt, peList: COpaquePointer?, max: CUint, nget: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_portGetn(port, (peList?.value ?: 0L), max.toInt(), (nget?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_portSend(port, events, (user?.value ?: 0L))

public actual fun portSendn(portList: COpaquePointer?, errorList: COpaquePointer?, nent: CUint, events: CInt, user: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_portSendn((portList?.value ?: 0L), (errorList?.value ?: 0L), nent.toInt(), events, (user?.value ?: 0L))

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_sigsuspend((mask?.value ?: 0L))

public actual fun semClose(sem: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_semClose((sem?.value ?: 0L))

public actual fun getdtablesize(): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun thrSelf(): ThreadT =
    UnixSolarishJniBridge.libc_unix_solarish_thrSelf().toUInt()()

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadSigmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun semOpen(name: String?, oflag: CInt): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadKill(thread.toLong(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_schedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_schedGetPriorityMax(policy)

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_schedGetparam(pid, (param?.value ?: 0L))

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_schedSetparam(pid, (param?.value ?: 0L))

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun semUnlink(name: String?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getpwuidR(uid.toShort(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun nativeGetpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_nativeGetpwentR((pwd?.value ?: 0L), (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nativeGetgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_nativeGetgrentR((grp?.value ?: 0L), (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgrent() {
    UnixSolarishJniBridge.libc_unix_solarish_setgrent()
}

public actual fun endgrent() {
    UnixSolarishJniBridge.libc_unix_solarish_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun popen(command: String?, mode: String?): FILE? =
    UnixSolarishJniBridge.libc_unix_solarish_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_dup3(src, dst, flags)

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_uname((buf?.value ?: 0L))

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pipe2((fds?.value ?: 0L), flags)

public actual fun makeutx(ux: COpaquePointer?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_makeutx((ux?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun modutx(ux: COpaquePointer?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_modutx((ux?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun updwtmpx(file: String?, ut: COpaquePointer?) {
    UnixSolarishJniBridge.libc_unix_solarish_updwtmpx(file, (ut?.value ?: 0L))
}

public actual fun utmpxname(file: String?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_utmpxname(file)

public actual fun getutxent(): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getutxid((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getutxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_pututxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setutxent() {
    UnixSolarishJniBridge.libc_unix_solarish_setutxent()
}

public actual fun endutxent() {
    UnixSolarishJniBridge.libc_unix_solarish_endutxent()
}

public actual fun endutent() {
    UnixSolarishJniBridge.libc_unix_solarish_endutent()
}

public actual fun getutent(): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getutent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutid(u: COpaquePointer?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getutid((u?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutline(u: COpaquePointer?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getutline((u?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututline(u: COpaquePointer?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_pututline((u?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setutent() {
    UnixSolarishJniBridge.libc_unix_solarish_setutent()
}

public actual fun utmpname(file: String?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_utmpname(file)

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
    UnixSolarishJniBridge.libc_unix_solarish_getutmp((ux?.value ?: 0L), (u?.value ?: 0L))
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
    UnixSolarishJniBridge.libc_unix_solarish_getutmpx((u?.value ?: 0L), (ux?.value ?: 0L))
}

public actual fun updwtmp(file: String?, u: COpaquePointer?) {
    UnixSolarishJniBridge.libc_unix_solarish_updwtmp(file, (u?.value ?: 0L))
}

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_ntpAdjtime((buf?.value ?: 0L))

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_ntpGettime((buf?.value ?: 0L))

public actual fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_timerCreate(clockId, (evp?.value ?: 0L), (timerid?.value ?: 0L))

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_timerDelete(timerid.toLong())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_timerGetoverrun(timerid.toLong())

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_timerGettime(timerid.toLong(), (value?.value ?: 0L))

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_timerSettime(timerid.toLong(), flags, (value?.value ?: 0L), (ovalue?.value ?: 0L))

public actual fun ucredGet(pid: PidT): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGet(pid).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getpeerucred(fd, (ucred?.value ?: 0L))

public actual fun ucredFree(ucred: COpaquePointer?) {
    UnixSolarishJniBridge.libc_unix_solarish_ucredFree((ucred?.value ?: 0L))
}

public actual fun ucredGeteuid(ucred: COpaquePointer?): UidT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGeteuid((ucred?.value ?: 0L)).toUShort()

public actual fun ucredGetruid(ucred: COpaquePointer?): UidT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetruid((ucred?.value ?: 0L)).toUShort()

public actual fun ucredGetsuid(ucred: COpaquePointer?): UidT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetsuid((ucred?.value ?: 0L)).toUShort()

public actual fun ucredGetegid(ucred: COpaquePointer?): GidT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetegid((ucred?.value ?: 0L)).toUShort()

public actual fun ucredGetrgid(ucred: COpaquePointer?): GidT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetrgid((ucred?.value ?: 0L)).toUShort()

public actual fun ucredGetsgid(ucred: COpaquePointer?): GidT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetsgid((ucred?.value ?: 0L)).toUShort()

public actual fun ucredGetgroups(ucred: COpaquePointer?, groups: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetgroups((ucred?.value ?: 0L), (groups?.value ?: 0L))

public actual fun ucredGetpid(ucred: COpaquePointer?): PidT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetpid((ucred?.value ?: 0L))

public actual fun ucredGetprojid(ucred: COpaquePointer?): ProjidT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetprojid((ucred?.value ?: 0L))

public actual fun ucredGetzoneid(ucred: COpaquePointer?): ZoneidT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetzoneid((ucred?.value ?: 0L))

public actual fun ucredGetpflags(ucred: COpaquePointer?, flags: CUint): CUint =
    UnixSolarishJniBridge.libc_unix_solarish_ucredGetpflags((ucred?.value ?: 0L), flags.toInt()).toUInt()

public actual fun ucredSize(): SizeT =
    UnixSolarishJniBridge.libc_unix_solarish_ucredSize().toULong()

public actual fun psetCreate(newpset: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_psetCreate((newpset?.value ?: 0L))

public actual fun psetDestroy(pset: PsetidT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_psetDestroy(pset)

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_psetAssign(pset, cpu, (opset?.value ?: 0L))

public actual fun psetInfo(pset: PsetidT, tpe: COpaquePointer?, numcpus: COpaquePointer?, cpulist: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_psetInfo(pset, (tpe?.value ?: 0L), (numcpus?.value ?: 0L), (cpulist?.value ?: 0L))

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_psetBind(pset, idtype.toInt(), id, (opset?.value ?: 0L))

public actual fun psetList(pset: COpaquePointer?, numpsets: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_psetList((pset?.value ?: 0L), (numpsets?.value ?: 0L))

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_psetSetattr(pset, attr.toInt())

public actual fun psetGetattr(pset: PsetidT, attr: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_psetGetattr(pset, (attr?.value ?: 0L))

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_processorBind(idtype.toInt(), id, newBinding, (oldBinding?.value ?: 0L))

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_pOnline(processorid, flag)

public actual fun processorInfo(processorid: ProcessoridT, infop: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_processorInfo(processorid, (infop?.value ?: 0L))

public actual fun getexecname(): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_getexecname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostid(): CLong =
    UnixSolarishJniBridge.libc_unix_solarish_gethostid()

public actual fun getpflags(flags: CUint): CUint =
    UnixSolarishJniBridge.libc_unix_solarish_getpflags(flags.toInt()).toUInt()

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_setpflags(flags.toInt(), value.toInt())

public actual fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_sysinfo(command, (buf?.value ?: 0L), count)

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_faccessat(fd, path, amode, flag)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_dlIteratePhdr(0L, (data?.value ?: 0L))

public actual fun getpagesize(): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getpagesize()

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getpagesizes((pagesize?.value ?: 0L), nelem)

public actual fun mmapobj(fd: CInt, flags: CUint, storage: COpaquePointer?, elements: COpaquePointer?, arg: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_mmapobj(fd, flags.toInt(), (storage?.value ?: 0L), (elements?.value ?: 0L), (arg?.value ?: 0L))

public actual fun meminfo(inaddr: COpaquePointer?, addrCount: CInt, infoReq: COpaquePointer?, infoCount: CInt, outdata: COpaquePointer?, validity: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_meminfo((inaddr?.value ?: 0L), addrCount, (infoReq?.value ?: 0L), infoCount, (outdata?.value ?: 0L), (validity?.value ?: 0L))

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_strsep((string?.value ?: 0L), delim).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getisax(array: COpaquePointer?, n: CUint): CUint =
    UnixSolarishJniBridge.libc_unix_solarish_getisax((array?.value ?: 0L), n.toInt()).toUInt()

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_backtrace((buffer?.value ?: 0L), size)

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_backtraceSymbols((buffer?.value ?: 0L), size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    UnixSolarishJniBridge.libc_unix_solarish_backtraceSymbolsFd((buffer?.value ?: 0L), size, fd)
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_getoptLong(argc, (argv?.value ?: 0L), optstring, (longopts?.value ?: 0L), (longindex?.value ?: 0L))

public actual fun sync() {
    UnixSolarishJniBridge.libc_unix_solarish_sync()
}

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_aioCancel(fd, (aiocbp?.value ?: 0L))

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_aioError((aiocbp?.value ?: 0L))

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_aioFsync(op, (aiocbp?.value ?: 0L))

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_aioRead((aiocbp?.value ?: 0L))

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_aioReturn((aiocbp?.value ?: 0L))

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_aioSuspend((aiocbList?.value ?: 0L), nitems, (timeout?.value ?: 0L))

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_aioWaitn((aiocbList?.value ?: 0L), nent.toInt(), (nwait?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_aioWrite((aiocbp?.value ?: 0L))

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_lioListio(mode, (aiocbList?.value ?: 0L), nitems, (sevp?.value ?: 0L))

public actual fun major(version: CInt, devnum: DevT): MajorT =
    UnixSolarishJniBridge.libc_unix_solarish_major(version, devnum.toLong()).toUInt()

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    UnixSolarishJniBridge.libc_unix_solarish_minor(version, devnum.toLong()).toUInt()

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    UnixSolarishJniBridge.libc_unix_solarish_makedev(version, majdev.toInt(), mindev.toInt()).toULong()

public actual fun arc4random(): UInt =
    UnixSolarishJniBridge.libc_unix_solarish_arc4random().toUInt()

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    UnixSolarishJniBridge.libc_unix_solarish_arc4randomBuf((buf?.value ?: 0L), nbytes.toLong())
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    UnixSolarishJniBridge.libc_unix_solarish_arc4randomUniform(upperBound.toInt()).toUInt()

public actual fun secureGetenv(name: String?): COpaquePointer? =
    UnixSolarishJniBridge.libc_unix_solarish_secureGetenv(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    UnixSolarishJniBridge.libc_unix_solarish_strftime((s?.value ?: 0L), maxsize.toLong(), format, (timeptr?.value ?: 0L)).toULong()

public actual fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, loc: LocaleT): SizeT =
    UnixSolarishJniBridge.libc_unix_solarish_strftimeL((s?.value ?: 0L), maxsize.toLong(), format, (timeptr?.value ?: 0L), loc.toLong()).toULong()

public actual fun sendfile(outFd: CInt, inFd: CInt, off: COpaquePointer?, len: SizeT): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_sendfile(outFd, inFd, (off?.value ?: 0L), len.toLong())

public actual fun sendfilev(fildes: CInt, vec: COpaquePointer?, sfvcnt: CInt, xferred: COpaquePointer?): SsizeT =
    UnixSolarishJniBridge.libc_unix_solarish_sendfilev(fildes, (vec?.value ?: 0L), sfvcnt, (xferred?.value ?: 0L))

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpInit(view.toInt()).toULong()

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpFini(cookie.toLong())

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpAffinityGet(idtype.toInt(), id, lgrp)

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpAffinitySet(idtype.toInt(), id, lgrp, aff)

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: COpaquePointer?, count: CUint, content: LgrpContentT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpCpus(cookie.toLong(), lgrp, (cpuids?.value ?: 0L), count.toInt(), content.toInt())

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpMemSize(cookie.toLong(), lgrp, tpe.toInt(), content.toInt())

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpNlgrps(cookie.toLong())

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpView(cookie.toLong()).toUInt()

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpHome(idtype.toInt(), id)

public actual fun lgrpVersion(version: CInt): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpVersion(version)

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: COpaquePointer?, count: CUint, tpe: LgrpRsrcT): CInt =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpResources(cookie.toLong(), lgrp, (lgrps?.value ?: 0L), count.toInt(), tpe)

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    UnixSolarishJniBridge.libc_unix_solarish_lgrpRoot(cookie.toLong())
