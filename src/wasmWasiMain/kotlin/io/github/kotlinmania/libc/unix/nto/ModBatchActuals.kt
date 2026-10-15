// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on WASI — no C library access")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on WASI — no C library access")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on WASI — no C library access")

public actual fun fDCLR(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR not available on WASI — no C library access")

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on WASI — no C library access")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET not available on WASI — no C library access")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO not available on WASI — no C library access")

public actual fun dEXTRAFIRST(d: Dirent?): DirentExtra? =
    throw UnsupportedOperationException("dEXTRAFIRST not available on WASI — no C library access")

public actual fun dEXTRAVALID(x: DirentExtra?, d: Dirent?): Boolean =
    throw UnsupportedOperationException("dEXTRAVALID not available on WASI — no C library access")

public actual fun dEXTRANEXT(x: DirentExtra?): DirentExtra? =
    throw UnsupportedOperationException("dEXTRANEXT not available on WASI — no C library access")

public actual fun sOCKCREDSIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE not available on WASI — no C library access")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt): Int =
    throw UnsupportedOperationException("sendmmsg not available on WASI — no C library access")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg not available on WASI — no C library access")

public actual fun semDestroy(sem: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("semDestroy not available on WASI — no C library access")

public actual fun semInit(sem: io.github.kotlinmania.libc.unix.nto.SyncT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit not available on WASI — no C library access")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync not available on WASI — no C library access")

public actual fun getpriority(which: Int, who: Int): Int =
    throw UnsupportedOperationException("getpriority not available on WASI — no C library access")

public actual fun setpriority(which: Int, who: Int, prio: Int): Int =
    throw UnsupportedOperationException("setpriority not available on WASI — no C library access")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat not available on WASI — no C library access")

public actual fun mknodat(fd: Int, pathname: String?, mode: UInt, dev: UInt): Int =
    throw UnsupportedOperationException("mknodat not available on WASI — no C library access")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres not available on WASI — no C library access")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on WASI — no C library access")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime not available on WASI — no C library access")

public actual fun clockGetcpuclockid(pid: Int, clkId: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid not available on WASI — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on WASI — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on WASI — no C library access")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups not available on WASI — no C library access")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise not available on WASI — no C library access")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on WASI — no C library access")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on WASI — no C library access")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat not available on WASI — no C library access")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on WASI — no C library access")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on WASI — no C library access")

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetpshared not available on WASI — no C library access")

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on WASI — no C library access")

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared not available on WASI — no C library access")

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared not available on WASI — no C library access")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): String? =
    throw UnsupportedOperationException("ptsnameR not available on WASI — no C library access")

public actual fun clearenv(): Int =
    throw UnsupportedOperationException("clearenv not available on WASI — no C library access")

public actual fun waitid(idtype: UInt, id: Int, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid not available on WASI — no C library access")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 not available on WASI — no C library access")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe not available on WASI — no C library access")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs not available on WASI — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs not available on WASI — no C library access")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind not available on WASI — no C library access")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on WASI — no C library access")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on WASI — no C library access")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg not available on WASI — no C library access")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg not available on WASI — no C library access")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on WASI — no C library access")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty not available on WASI — no C library access")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty not available on WASI — no C library access")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname not available on WASI — no C library access")

public actual fun getpeereid(socket: Int, euid: UInt?, egid: UInt?): Int =
    throw UnsupportedOperationException("getpeereid not available on WASI — no C library access")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on WASI — no C library access")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on WASI — no C library access")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on WASI — no C library access")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on WASI — no C library access")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on WASI — no C library access")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent not available on WASI — no C library access")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent not available on WASI — no C library access")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on WASI — no C library access")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent not available on WASI — no C library access")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent not available on WASI — no C library access")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on WASI — no C library access")

public actual fun setspent(): Unit = throw UnsupportedOperationException("setspent not available on WASI — no C library access")

public actual fun endspent(): Unit = throw UnsupportedOperationException("endspent not available on WASI — no C library access")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen not available on WASI — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on WASI — no C library access")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate not available on WASI — no C library access")

public actual fun mkostemp(template: String?, flags: Int): Int =
    throw UnsupportedOperationException("mkostemp not available on WASI — no C library access")

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int =
    throw UnsupportedOperationException("mkostemps not available on WASI — no C library access")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait not available on WASI — no C library access")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo not available on WASI — no C library access")

public actual fun pthreadSetschedprio(native: Int, priority: Int): Int =
    throw UnsupportedOperationException("pthreadSetschedprio not available on WASI — no C library access")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on WASI — no C library access")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex not available on WASI — no C library access")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on WASI — no C library access")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise not available on WASI — no C library access")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on WASI — no C library access")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on WASI — no C library access")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on WASI — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on WASI — no C library access")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom not available on WASI — no C library access")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps not available on WASI — no C library access")

public actual fun getdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("getdomainname not available on WASI — no C library access")

public actual fun setdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("setdomainname not available on WASI — no C library access")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on WASI — no C library access")

public actual fun pthreadGetschedparam(native: Int, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam not available on WASI — no C library access")

public actual fun umount(target: String?, flags: Int): Int =
    throw UnsupportedOperationException("umount not available on WASI — no C library access")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax not available on WASI — no C library access")

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("settimeofday not available on WASI — no C library access")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval not available on WASI — no C library access")

public actual fun semTimedwait(sem: io.github.kotlinmania.libc.unix.nto.SyncT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait not available on WASI — no C library access")

public actual fun semGetvalue(sem: io.github.kotlinmania.libc.unix.nto.SyncT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue not available on WASI — no C library access")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam not available on WASI — no C library access")

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: Int, mountType: String?, mountData: COpaquePointer?, mountDatalen: Int): Int =
    throw UnsupportedOperationException("mount not available on WASI — no C library access")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam not available on WASI — no C library access")

public actual fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("pthreadMutexConsistent not available on WASI — no C library access")

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.unix.nto.SyncT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on WASI — no C library access")

public actual fun pthreadSpinInit(lock: io.github.kotlinmania.libc.unix.nto.SyncT?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit not available on WASI — no C library access")

public actual fun pthreadSpinDestroy(lock: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on WASI — no C library access")

public actual fun pthreadSpinLock(lock: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("pthreadSpinLock not available on WASI — no C library access")

public actual fun pthreadSpinTrylock(lock: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on WASI — no C library access")

public actual fun pthreadSpinUnlock(lock: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on WASI — no C library access")

public actual fun pthreadBarrierattrInit(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrInit not available on WASI — no C library access")

public actual fun pthreadBarrierattrDestroy(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy not available on WASI — no C library access")

public actual fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared not available on WASI — no C library access")

public actual fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared not available on WASI — no C library access")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, count: UInt): Int =
    throw UnsupportedOperationException("pthreadBarrierInit not available on WASI — no C library access")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): Int =
    throw UnsupportedOperationException("pthreadBarrierDestroy not available on WASI — no C library access")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): Int =
    throw UnsupportedOperationException("pthreadBarrierWait not available on WASI — no C library access")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler not available on WASI — no C library access")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep not available on WASI — no C library access")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on WASI — no C library access")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on WASI — no C library access")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname not available on WASI — no C library access")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin not available on WASI — no C library access")

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetpshared not available on WASI — no C library access")

public actual fun pthreadSetschedparam(native: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam not available on WASI — no C library access")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler not available on WASI — no C library access")

public actual fun sigsuspend(mask: SigsetT?): Int =
    throw UnsupportedOperationException("sigsuspend not available on WASI — no C library access")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on WASI — no C library access")

public actual fun semClose(sem: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("semClose not available on WASI — no C library access")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize not available on WASI — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on WASI — no C library access")

public actual fun initgroups(user: String?, group: UInt): Int =
    throw UnsupportedOperationException("initgroups not available on WASI — no C library access")

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on WASI — no C library access")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.unix.nto.SyncT? =
    throw UnsupportedOperationException("semOpen not available on WASI — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on WASI — no C library access")

public actual fun pthreadCancel(thread: Int): Int =
    throw UnsupportedOperationException("pthreadCancel not available on WASI — no C library access")

public actual fun pthreadKill(thread: Int, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill not available on WASI — no C library access")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink not available on WASI — no C library access")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon not available on WASI — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR not available on WASI — no C library access")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR not available on WASI — no C library access")

public actual fun sigwait(set: SigsetT?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on WASI — no C library access")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on WASI — no C library access")

public actual fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist not available on WASI — no C library access")

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared not available on WASI — no C library access")

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, robustness: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust not available on WASI — no C library access")

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, robustness: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on WASI — no C library access")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer not available on WASI — no C library access")

public actual fun setitimer(which: Int, value: Itimerval?, ovalue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer not available on WASI — no C library access")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: ULong?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn not available on WASI — no C library access")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: ULong?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp not available on WASI — no C library access")

public actual fun posixSpawnattrInit(attr: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit not available on WASI — no C library access")

public actual fun posixSpawnattrDestroy(attr: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on WASI — no C library access")

public actual fun posixSpawnattrGetsigdefault(attr: ULong?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on WASI — no C library access")

public actual fun posixSpawnattrSetsigdefault(attr: ULong?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on WASI — no C library access")

public actual fun posixSpawnattrGetsigmask(attr: ULong?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on WASI — no C library access")

public actual fun posixSpawnattrSetsigmask(attr: ULong?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on WASI — no C library access")

public actual fun posixSpawnattrGetflags(attr: ULong?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on WASI — no C library access")

public actual fun posixSpawnattrSetflags(attr: ULong?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on WASI — no C library access")

public actual fun posixSpawnattrGetpgroup(attr: ULong?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on WASI — no C library access")

public actual fun posixSpawnattrSetpgroup(attr: ULong?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on WASI — no C library access")

public actual fun posixSpawnattrGetschedpolicy(attr: ULong?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy not available on WASI — no C library access")

public actual fun posixSpawnattrSetschedpolicy(attr: ULong?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy not available on WASI — no C library access")

public actual fun posixSpawnattrGetschedparam(attr: ULong?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam not available on WASI — no C library access")

public actual fun posixSpawnattrSetschedparam(attr: ULong?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam not available on WASI — no C library access")

public actual fun posixSpawnFileActionsInit(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on WASI — no C library access")

public actual fun posixSpawnFileActionsDestroy(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddopen(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddclose(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAdddup2(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on WASI — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on WASI — no C library access")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat not available on WASI — no C library access")

public actual fun inotifyRmWatch(fd: Int, wd: Int): Int =
    throw UnsupportedOperationException("inotifyRmWatch not available on WASI — no C library access")

public actual fun inotifyInit(): Int =
    throw UnsupportedOperationException("inotifyInit not available on WASI — no C library access")

public actual fun inotifyAddWatch(fd: Int, path: String?, mask: UInt): Int =
    throw UnsupportedOperationException("inotifyAddWatch not available on WASI — no C library access")

public actual fun gettid(): Int =
    throw UnsupportedOperationException("gettid not available on WASI — no C library access")

public actual fun pthreadGetcpuclockid(thread: Int, clkId: Int?): Int =
    throw UnsupportedOperationException("pthreadGetcpuclockid not available on WASI — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on WASI — no C library access")

public actual fun mallopt(param: Int, value: Long): Int =
    throw UnsupportedOperationException("mallopt not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid not available on WASI — no C library access")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on WASI — no C library access")

public actual fun getpwentR(pwd: Passwd?, buf: String?, bufsize: Int, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwentR not available on WASI — no C library access")

public actual fun pthreadGetnameNp(thread: Int, name: String?, len: Int): Int =
    throw UnsupportedOperationException("pthreadGetnameNp not available on WASI — no C library access")

public actual fun pthreadSetnameNp(thread: Int, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp not available on WASI — no C library access")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl not available on WASI — no C library access")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on WASI — no C library access")

public actual fun setrlimit(resource: Int, rlp: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on WASI — no C library access")

public actual fun lioListio(mode: Int, list: COpaquePointer?, nent: Int, sig: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio not available on WASI — no C library access")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int =
    throw UnsupportedOperationException("memsetS not available on WASI — no C library access")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp not available on WASI — no C library access")

public actual fun regexec(preg: RegexT?, str: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec not available on WASI — no C library access")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on WASI — no C library access")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree not available on WASI — no C library access")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on WASI — no C library access")

public actual fun dircntl(dir: DIR?, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("dircntl not available on WASI — no C library access")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel not available on WASI — no C library access")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError not available on WASI — no C library access")

public actual fun aioFsync(operation: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync not available on WASI — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead not available on WASI — no C library access")

public actual fun aioReturn(aiocpb: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn not available on WASI — no C library access")

public actual fun aioSuspend(list: COpaquePointer?, nent: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend not available on WASI — no C library access")

public actual fun aioWrite(aiocpb: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite not available on WASI — no C library access")

public actual fun mqClose(mqdes: Int): Int =
    throw UnsupportedOperationException("mqClose not available on WASI — no C library access")

public actual fun mqGetattr(mqdes: Int, mqstat: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr not available on WASI — no C library access")

public actual fun mqNotify(mqdes: Int, notification: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify not available on WASI — no C library access")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen not available on WASI — no C library access")

public actual fun mqReceive(mqdes: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive not available on WASI — no C library access")

public actual fun mqSend(mqdes: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend not available on WASI — no C library access")

public actual fun mqSetattr(mqdes: Int, mqstat: MqAttr?, omqstat: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr not available on WASI — no C library access")

public actual fun mqTimedreceive(mqdes: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive not available on WASI — no C library access")

public actual fun mqTimedsend(mqdes: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend not available on WASI — no C library access")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink not available on WASI — no C library access")

public actual fun getErrnoPtr(): Int? =
    throw UnsupportedOperationException("getErrnoPtr not available on WASI — no C library access")

public actual fun myThreadExit(valuePtr: COpaquePointer?): Unit = throw UnsupportedOperationException("myThreadExit not available on WASI — no C library access")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on WASI — no C library access")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on WASI — no C library access")

public actual fun pthreadCreate(native: Int?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on WASI — no C library access")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr not available on WASI — no C library access")

public actual fun cxaAtexit(cb: (() -> Unit)?, arg: COpaquePointer?, dso: COpaquePointer?): Int =
    throw UnsupportedOperationException("cxaAtexit not available on WASI — no C library access")
