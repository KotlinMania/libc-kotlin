// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cPUALLOCSIZE(count: CInt): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE requires N-API addon")

public actual fun cPUZERO(cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUZERO requires N-API addon")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUSET requires N-API addon")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUCLR requires N-API addon")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires N-API addon")

public actual fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNTS requires N-API addon")

public actual fun cPUCOUNT(cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNT requires N-API addon")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires N-API addon")

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires N-API addon")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires N-API addon")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires N-API addon")
}

public actual fun sIGRTMAX(): CInt =
    throw UnsupportedOperationException("sIGRTMAX requires N-API addon")

public actual fun sIGRTMIN(): CInt =
    throw UnsupportedOperationException("sIGRTMIN requires N-API addon")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimes requires N-API addon")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun libcCurrentSigrtmin(): CInt =
    throw UnsupportedOperationException("libcCurrentSigrtmin requires N-API addon")

public actual fun libcCurrentSigrtmax(): CInt =
    throw UnsupportedOperationException("libcCurrentSigrtmax requires N-API addon")

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 requires N-API addon")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires N-API addon")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pread64 requires N-API addon")

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwrite64 requires N-API addon")

public actual fun readv(fd: CInt, iovec: Iovec?, count: CInt): SsizeT =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun writev(fd: CInt, iovec: Iovec?, count: CInt): SsizeT =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun preadv(fd: CInt, iovec: Iovec?, count: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pwritev(fd: CInt, iovec: Iovec?, count: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun preadv64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("preadv64 requires N-API addon")

public actual fun pwritev64(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwritev64 requires N-API addon")

public actual fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("freadUnlocked requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen requires N-API addon")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    throw UnsupportedOperationException("lseek64 requires N-API addon")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek requires N-API addon")

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fgetpos64 requires N-API addon")

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko64 requires N-API addon")

public actual fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fsetpos64 requires N-API addon")

public actual fun ftello64(stream: FILE?): Off64T =
    throw UnsupportedOperationException("ftello64 requires N-API addon")

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll requires N-API addon")

public actual fun recvmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun sendmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile requires N-API addon")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile64 requires N-API addon")

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown requires N-API addon")

public actual fun sethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun getdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun setdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex requires N-API addon")
}

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs requires N-API addon")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs requires N-API addon")
}

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun sethostid(hostid: CLong): CInt =
    throw UnsupportedOperationException("sethostid requires N-API addon")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent requires N-API addon")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent requires N-API addon")
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires N-API addon")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent requires N-API addon")
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun setspent() {
    throw UnsupportedOperationException("setspent requires N-API addon")
}

public actual fun endspent() {
    throw UnsupportedOperationException("endspent requires N-API addon")
}

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent requires N-API addon")

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam requires N-API addon")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR requires N-API addon")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrentR requires N-API addon")

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetpwentR requires N-API addon")

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetgrentR requires N-API addon")

public actual fun putpwent(p: Passwd?, stream: FILE?): CInt =
    throw UnsupportedOperationException("putpwent requires N-API addon")

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    throw UnsupportedOperationException("putgrent requires N-API addon")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetspentR requires N-API addon")

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sgetspentR requires N-API addon")

public actual fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspentR requires N-API addon")

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspnamR requires N-API addon")

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: CInt): Mntent? =
    throw UnsupportedOperationException("getmntentR requires N-API addon")

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname requires N-API addon")

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires N-API addon")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires N-API addon")
}

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid requires N-API addon")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid requires N-API addon")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid requires N-API addon")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid requires N-API addon")

public actual fun initgroups(user: String?, group: GidT): CInt =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun setgroups(ngroups: ULong, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct requires N-API addon")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent requires N-API addon")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent requires N-API addon")

public actual fun addmntent(stream: FILE?, mnt: Mntent?): CInt =
    throw UnsupportedOperationException("addmntent requires N-API addon")

public actual fun endmntent(streamp: FILE?): CInt =
    throw UnsupportedOperationException("endmntent requires N-API addon")

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt requires N-API addon")

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires N-API addon")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun pthreadGetattrNp(thr: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp requires N-API addon")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires N-API addon")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires N-API addon")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires N-API addon")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires N-API addon")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires N-API addon")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires N-API addon")

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires N-API addon")

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires N-API addon")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires N-API addon")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires N-API addon")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires N-API addon")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit requires N-API addon")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires N-API addon")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait requires N-API addon")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun pthreadSigmask(how: CInt, newmask: SigsetT?, oldmask: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires N-API addon")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun clockGetres(clockId: ClockidT, res: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires N-API addon")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctimeR(timep: TimeT?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires N-API addon")

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun fstat(fd: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires N-API addon")


public actual fun fstatat(fd: CInt, file: String?, buf: Stat?, flag: CInt): CInt =
    throw UnsupportedOperationException("fstatat requires N-API addon")

public actual fun fstatat64(fd: CInt, file: String?, buf: Stat64?, flag: CInt): CInt =
    throw UnsupportedOperationException("fstatat64 requires N-API addon")

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUInt, statxbuf: Statx?): CInt =
    throw UnsupportedOperationException("statx requires N-API addon")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    throw UnsupportedOperationException("ftruncate64 requires N-API addon")

public actual fun truncate64(file: String?, length: Off64T): CInt =
    throw UnsupportedOperationException("truncate64 requires N-API addon")

public actual fun lstat(file: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat requires N-API addon")


public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun statfs64(file: String?, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("statfs64 requires N-API addon")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun fstatfs64(fildes: CInt, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("fstatfs64 requires N-API addon")

public actual fun statvfs(file: String?, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("statvfs requires N-API addon")

public actual fun statvfs64(file: String?, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("statvfs64 requires N-API addon")

public actual fun fstatvfs(fildes: CInt, buf: Statvfs?): CInt =
    throw UnsupportedOperationException("fstatvfs requires N-API addon")

public actual fun fstatvfs64(fildes: CInt, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("fstatvfs64 requires N-API addon")

public actual fun open(file: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires N-API addon")


public actual fun openat(fd: CInt, file: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat requires N-API addon")

public actual fun openat64(fd: CInt, file: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat64 requires N-API addon")



public actual fun creat64(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat64 requires N-API addon")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun tmpfile64(): FILE? =
    throw UnsupportedOperationException("tmpfile64 requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun closeRange(first: CUInt, last: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("closeRange requires N-API addon")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun getpt(): CInt =
    throw UnsupportedOperationException("getpt requires N-API addon")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR requires N-API addon")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires N-API addon")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires N-API addon")

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("execveat requires N-API addon")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve requires N-API addon")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires N-API addon")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires N-API addon")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires N-API addon")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires N-API addon")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT?, from: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp requires N-API addon")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT?, tcfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddtcsetpgrpNp requires N-API addon")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess requires N-API addon")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess requires N-API addon")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun stat(file: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires N-API addon")


public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun readdir64(dirp: DIR?): Dirent64? =
    throw UnsupportedOperationException("readdir64 requires N-API addon")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdirR requires N-API addon")

public actual fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdir64R requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires N-API addon")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun mmap64(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    throw UnsupportedOperationException("mmap64 requires N-API addon")

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: CInt, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun sync() {
    throw UnsupportedOperationException("sync requires N-API addon")
}

public actual fun syncfs(fd: CInt): CInt =
    throw UnsupportedOperationException("syncfs requires N-API addon")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("fallocate64 requires N-API addon")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("posixFallocate64 requires N-API addon")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise64 requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 requires N-API addon")

public actual fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 requires N-API addon")

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun getrandom(buffer: COpaquePointer?, length: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun getentropy(buffer: COpaquePointer?, length: ULong): CInt =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun strchrnul(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchrnul requires N-API addon")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires N-API addon")
}

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("lrand48 requires N-API addon")

public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 requires N-API addon")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("mrand48 requires N-API addon")

public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 requires N-API addon")

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 requires N-API addon")
}

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 requires N-API addon")

public actual fun lcong48(p: CUShort?) {
    throw UnsupportedOperationException("lcong48 requires N-API addon")
}

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("brk requires N-API addon")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("mallopt requires N-API addon")

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("mallocInfo requires N-API addon")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires N-API addon")

public actual fun mallocTrim(pad: ULong): CInt =
    throw UnsupportedOperationException("mallocTrim requires N-API addon")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires N-API addon")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose requires N-API addon")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong requires N-API addon")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun reboot(howTo: CInt): CInt =
    throw UnsupportedOperationException("reboot requires N-API addon")

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg requires N-API addon")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec requires N-API addon")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires N-API addon")

public actual fun regfree(preg: RegexT?) {
    throw UnsupportedOperationException("regfree requires N-API addon")
}

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires N-API addon")
}

public actual fun globfree64(pglob: Glob64T?) {
    throw UnsupportedOperationException("globfree64 requires N-API addon")
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("getxattr requires N-API addon")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("lgetxattr requires N-API addon")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("fgetxattr requires N-API addon")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("setxattr requires N-API addon")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("lsetxattr requires N-API addon")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("fsetxattr requires N-API addon")

public actual fun listxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("listxattr requires N-API addon")

public actual fun llistxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("llistxattr requires N-API addon")

public actual fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("flistxattr requires N-API addon")

public actual fun removexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("removexattr requires N-API addon")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("lremovexattr requires N-API addon")

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    throw UnsupportedOperationException("fremovexattr requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun posixBasename(path: String?): String? =
    throw UnsupportedOperationException("posixBasename requires N-API addon")

public actual fun gnuBasename(path: String?): String? =
    throw UnsupportedOperationException("gnuBasename requires N-API addon")

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlmopen requires N-API addon")

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlinfo requires N-API addon")

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("dladdr1 requires N-API addon")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires N-API addon")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun gnuGetLibcRelease(): String? =
    throw UnsupportedOperationException("gnuGetLibcRelease requires N-API addon")

public actual fun gnuGetLibcVersion(): String? =
    throw UnsupportedOperationException("gnuGetLibcVersion requires N-API addon")

