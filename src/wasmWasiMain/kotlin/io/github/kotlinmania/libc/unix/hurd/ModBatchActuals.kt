// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on WASI — no C library access")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on WASI — no C library access")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on WASI — no C library access")

public actual fun cPUALLOCSIZE(count: Int): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE not available on WASI — no C library access")

public actual fun cPUZERO(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO not available on WASI — no C library access")

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET not available on WASI — no C library access")

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR not available on WASI — no C library access")

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on WASI — no C library access")

public actual fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNTS not available on WASI — no C library access")

public actual fun cPUCOUNT(cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT not available on WASI — no C library access")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL not available on WASI — no C library access")

public actual fun fDCLR(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR not available on WASI — no C library access")

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on WASI — no C library access")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET not available on WASI — no C library access")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO not available on WASI — no C library access")

public actual fun sIGRTMAX(): Int =
    throw UnsupportedOperationException("sIGRTMAX not available on WASI — no C library access")

public actual fun sIGRTMIN(): Int =
    throw UnsupportedOperationException("sIGRTMIN not available on WASI — no C library access")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes not available on WASI — no C library access")

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes not available on WASI — no C library access")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on WASI — no C library access")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat not available on WASI — no C library access")

public actual fun mkfifoat(fd: Int, path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat not available on WASI — no C library access")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: UInt): Int =
    throw UnsupportedOperationException("mknodat not available on WASI — no C library access")

public actual fun libcCurrentSigrtmin(): Int =
    throw UnsupportedOperationException("libcCurrentSigrtmin not available on WASI — no C library access")

public actual fun libcCurrentSigrtmax(): Int =
    throw UnsupportedOperationException("libcCurrentSigrtmax not available on WASI — no C library access")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 not available on WASI — no C library access")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid not available on WASI — no C library access")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on WASI — no C library access")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend not available on WASI — no C library access")

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait not available on WASI — no C library access")

public actual fun sigwaitinfo(set: ULong?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo not available on WASI — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack not available on WASI — no C library access")

public actual fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on WASI — no C library access")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 not available on WASI — no C library access")

public actual fun dup3(oldfd: Int, newfd: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 not available on WASI — no C library access")

public actual fun pread64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Int =
    throw UnsupportedOperationException("pread64 not available on WASI — no C library access")

public actual fun pwrite64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Int =
    throw UnsupportedOperationException("pwrite64 not available on WASI — no C library access")

public actual fun readv(fd: Int, iovec: Iovec?, count: Int): Int =
    throw UnsupportedOperationException("readv not available on WASI — no C library access")

public actual fun writev(fd: Int, iovec: Iovec?, count: Int): Int =
    throw UnsupportedOperationException("writev not available on WASI — no C library access")

public actual fun preadv(fd: Int, iovec: Iovec?, count: Int, offset: Long): Int =
    throw UnsupportedOperationException("preadv not available on WASI — no C library access")

public actual fun pwritev(fd: Int, iovec: Iovec?, count: Int, offset: Long): Int =
    throw UnsupportedOperationException("pwritev not available on WASI — no C library access")

public actual fun preadv64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Int =
    throw UnsupportedOperationException("preadv64 not available on WASI — no C library access")

public actual fun pwritev64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Int =
    throw UnsupportedOperationException("pwritev64 not available on WASI — no C library access")

public actual fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("freadUnlocked not available on WASI — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead not available on WASI — no C library access")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite not available on WASI — no C library access")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync not available on WASI — no C library access")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError not available on WASI — no C library access")

public actual fun aioReturn(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioReturn not available on WASI — no C library access")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend not available on WASI — no C library access")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel not available on WASI — no C library access")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio not available on WASI — no C library access")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen not available on WASI — no C library access")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose not available on WASI — no C library access")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink not available on WASI — no C library access")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Int =
    throw UnsupportedOperationException("mqReceive not available on WASI — no C library access")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedreceive not available on WASI — no C library access")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend not available on WASI — no C library access")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend not available on WASI — no C library access")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr not available on WASI — no C library access")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr not available on WASI — no C library access")

public actual fun lseek64(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek64 not available on WASI — no C library access")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek not available on WASI — no C library access")

public actual fun fgetpos64(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos64 not available on WASI — no C library access")

public actual fun fseeko64(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko64 not available on WASI — no C library access")

public actual fun fsetpos64(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos64 not available on WASI — no C library access")

public actual fun ftello64(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello64 not available on WASI — no C library access")

public actual fun bind(fd: Int, addr: Sockaddr?, len: UInt): Int =
    throw UnsupportedOperationException("bind not available on WASI — no C library access")

public actual fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 not available on WASI — no C library access")

public actual fun ppoll(fds: Pollfd?, nfds: ULong, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("ppoll not available on WASI — no C library access")

public actual fun recvmsg(fd: Int, message: Msghdr?, flags: Int): Int =
    throw UnsupportedOperationException("recvmsg not available on WASI — no C library access")

public actual fun sendmsg(fd: Int, message: Msghdr?, flags: Int): Int =
    throw UnsupportedOperationException("sendmsg not available on WASI — no C library access")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("recvfrom not available on WASI — no C library access")

public actual fun sendfile(outFd: Int, inFd: Int, offset: Long?, count: ULong): Int =
    throw UnsupportedOperationException("sendfile not available on WASI — no C library access")

public actual fun sendfile64(outFd: Int, inFd: Int, offset: Long?, count: ULong): Int =
    throw UnsupportedOperationException("sendfile64 not available on WASI — no C library access")

public actual fun shutdown(fd: Int, how: Int): Int =
    throw UnsupportedOperationException("shutdown not available on WASI — no C library access")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname not available on WASI — no C library access")

public actual fun getdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("getdomainname not available on WASI — no C library access")

public actual fun setdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("setdomainname not available on WASI — no C library access")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on WASI — no C library access")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex not available on WASI — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on WASI — no C library access")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs not available on WASI — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs not available on WASI — no C library access")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname not available on WASI — no C library access")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid not available on WASI — no C library access")

public actual fun sethostid(hostid: Long): Int =
    throw UnsupportedOperationException("sethostid not available on WASI — no C library access")

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

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent not available on WASI — no C library access")

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam not available on WASI — no C library access")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwentR not available on WASI — no C library access")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrentR not available on WASI — no C library access")

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetpwentR not available on WASI — no C library access")

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetgrentR not available on WASI — no C library access")

public actual fun putpwent(p: Passwd?, stream: FILE?): Int =
    throw UnsupportedOperationException("putpwent not available on WASI — no C library access")

public actual fun putgrent(grp: Group?, stream: FILE?): Int =
    throw UnsupportedOperationException("putgrent not available on WASI — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR not available on WASI — no C library access")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR not available on WASI — no C library access")

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetspentR not available on WASI — no C library access")

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("sgetspentR not available on WASI — no C library access")

public actual fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("getspentR not available on WASI — no C library access")

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("getspnamR not available on WASI — no C library access")

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: Int): Mntent? =
    throw UnsupportedOperationException("getmntentR not available on WASI — no C library access")

public actual fun utmpname(file: String?): Int =
    throw UnsupportedOperationException("utmpname not available on WASI — no C library access")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname not available on WASI — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on WASI — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on WASI — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on WASI — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on WASI — no C library access")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent not available on WASI — no C library access")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent not available on WASI — no C library access")

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int =
    throw UnsupportedOperationException("getresuid not available on WASI — no C library access")

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int =
    throw UnsupportedOperationException("getresgid not available on WASI — no C library access")

public actual fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int =
    throw UnsupportedOperationException("setresuid not available on WASI — no C library access")

public actual fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int =
    throw UnsupportedOperationException("setresgid not available on WASI — no C library access")

public actual fun initgroups(user: String?, group: UInt): Int =
    throw UnsupportedOperationException("initgroups not available on WASI — no C library access")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on WASI — no C library access")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on WASI — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on WASI — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on WASI — no C library access")

public actual fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist not available on WASI — no C library access")

public actual fun setgroups(ngroups: ULong, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups not available on WASI — no C library access")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct not available on WASI — no C library access")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent not available on WASI — no C library access")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent not available on WASI — no C library access")

public actual fun addmntent(stream: FILE?, mnt: Mntent?): Int =
    throw UnsupportedOperationException("addmntent not available on WASI — no C library access")

public actual fun endmntent(streamp: FILE?): Int =
    throw UnsupportedOperationException("endmntent not available on WASI — no C library access")

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt not available on WASI — no C library access")

public actual fun pthreadKill(threadid: Long, signo: Int): Int =
    throw UnsupportedOperationException("pthreadKill not available on WASI — no C library access")

public actual fun pthreadCancel(thread: Long): Int =
    throw UnsupportedOperationException("pthreadCancel not available on WASI — no C library access")

public actual fun pthreadEqual(t1: Long, t2: Long): Int =
    throw UnsupportedOperationException("pthreadEqual not available on WASI — no C library access")

public actual fun pthreadGetattrNp(thr: Long, attr: io.github.kotlinmania.libc.unix.hurd.PthreadAttr?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp not available on WASI — no C library access")

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.unix.hurd.PthreadAttr?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on WASI — no C library access")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.unix.hurd.PthreadAttr?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on WASI — no C library access")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.unix.hurd.PthreadAttr?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on WASI — no C library access")

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadMutexattr?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared not available on WASI — no C library access")

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadMutexattr?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on WASI — no C library access")

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.unix.hurd.PthreadMutex?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on WASI — no C library access")

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadRwlockattr?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared not available on WASI — no C library access")

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadRwlockattr?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared not available on WASI — no C library access")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.unix.hurd.PthreadCondattr?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on WASI — no C library access")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.unix.hurd.PthreadCondattr?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on WASI — no C library access")

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadCondattr?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetpshared not available on WASI — no C library access")

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadCondattr?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetpshared not available on WASI — no C library access")

public actual fun pthreadBarrierattrInit(attr: io.github.kotlinmania.libc.unix.hurd.PthreadBarrierattr?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrInit not available on WASI — no C library access")

public actual fun pthreadBarrierattrDestroy(attr: io.github.kotlinmania.libc.unix.hurd.PthreadBarrierattr?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy not available on WASI — no C library access")

public actual fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadBarrierattr?, shared: Int?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared not available on WASI — no C library access")

public actual fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadBarrierattr?, shared: Int): Int =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared not available on WASI — no C library access")

public actual fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.unix.hurd.PthreadBarrier?, attr: io.github.kotlinmania.libc.unix.hurd.PthreadBarrierattr?, count: UInt): Int =
    throw UnsupportedOperationException("pthreadBarrierInit not available on WASI — no C library access")

public actual fun pthreadBarrierDestroy(barrier: io.github.kotlinmania.libc.unix.hurd.PthreadBarrier?): Int =
    throw UnsupportedOperationException("pthreadBarrierDestroy not available on WASI — no C library access")

public actual fun pthreadBarrierWait(barrier: io.github.kotlinmania.libc.unix.hurd.PthreadBarrier?): Int =
    throw UnsupportedOperationException("pthreadBarrierWait not available on WASI — no C library access")

public actual fun pthreadSpinInit(lock: Int?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit not available on WASI — no C library access")

public actual fun pthreadSpinDestroy(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on WASI — no C library access")

public actual fun pthreadSpinLock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinLock not available on WASI — no C library access")

public actual fun pthreadSpinTrylock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on WASI — no C library access")

public actual fun pthreadSpinUnlock(lock: Int?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on WASI — no C library access")

public actual fun pthreadSigmask(how: Int, newmask: ULong?, oldmask: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on WASI — no C library access")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam not available on WASI — no C library access")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam not available on WASI — no C library access")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler not available on WASI — no C library access")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler not available on WASI — no C library access")

public actual fun pthreadGetschedparam(native: Long, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam not available on WASI — no C library access")

public actual fun pthreadSetschedparam(native: Long, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam not available on WASI — no C library access")

public actual fun pthreadGetcpuclockid(thread: Long, clkId: Int?): Int =
    throw UnsupportedOperationException("pthreadGetcpuclockid not available on WASI — no C library access")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit not available on WASI — no C library access")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy not available on WASI — no C library access")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait not available on WASI — no C library access")

public actual fun semGetvalue(sem: SemT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue not available on WASI — no C library access")

public actual fun clockGetres(clockId: Int, res: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres not available on WASI — no C library access")

public actual fun clockGettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on WASI — no C library access")

public actual fun clockSettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime not available on WASI — no C library access")

public actual fun clockGetcpuclockid(pid: Int, clkId: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid not available on WASI — no C library access")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday not available on WASI — no C library access")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on WASI — no C library access")

public actual fun ctimeR(timep: Long?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on WASI — no C library access")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on WASI — no C library access")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime not available on WASI — no C library access")

public actual fun timerCreate(clockid: Int, sevp: Sigevent?, timerid: UInt?): Int =
    throw UnsupportedOperationException("timerCreate not available on WASI — no C library access")

public actual fun timerDelete(timerid: UInt): Int =
    throw UnsupportedOperationException("timerDelete not available on WASI — no C library access")

public actual fun timerGetoverrun(timerid: UInt): Int =
    throw UnsupportedOperationException("timerGetoverrun not available on WASI — no C library access")

public actual fun timerGettime(timerid: UInt, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime not available on WASI — no C library access")

public actual fun timerSettime(timerid: UInt, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime not available on WASI — no C library access")

public actual fun fstat(fd: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat not available on WASI — no C library access")

public actual fun fstatat(fd: Int, file: String?, buf: Stat?, flag: Int): Int =
    throw UnsupportedOperationException("fstatat not available on WASI — no C library access")

public actual fun fstatat64(fd: Int, file: String?, buf: Stat64?, flag: Int): Int =
    throw UnsupportedOperationException("fstatat64 not available on WASI — no C library access")

public actual fun statx(dirfd: Int, pathname: String?, flags: Int, mask: UInt, statxbuf: Statx?): Int =
    throw UnsupportedOperationException("statx not available on WASI — no C library access")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate not available on WASI — no C library access")

public actual fun ftruncate64(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate64 not available on WASI — no C library access")

public actual fun truncate64(file: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate64 not available on WASI — no C library access")

public actual fun lstat(file: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat not available on WASI — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs not available on WASI — no C library access")

public actual fun statfs64(file: String?, buf: Statfs64?): Int =
    throw UnsupportedOperationException("statfs64 not available on WASI — no C library access")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs not available on WASI — no C library access")

public actual fun fstatfs64(fildes: Int, buf: Statfs64?): Int =
    throw UnsupportedOperationException("fstatfs64 not available on WASI — no C library access")

public actual fun statvfs(file: String?, buf: Statvfs?): Int =
    throw UnsupportedOperationException("statvfs not available on WASI — no C library access")

public actual fun statvfs64(file: String?, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("statvfs64 not available on WASI — no C library access")

public actual fun fstatvfs(fildes: Int, buf: Statvfs?): Int =
    throw UnsupportedOperationException("fstatvfs not available on WASI — no C library access")

public actual fun fstatvfs64(fildes: Int, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("fstatvfs64 not available on WASI — no C library access")

public actual fun open(file: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open not available on WASI — no C library access")

public actual fun openat(fd: Int, file: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat not available on WASI — no C library access")

public actual fun openat64(fd: Int, file: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat64 not available on WASI — no C library access")

public actual fun creat64(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat64 not available on WASI — no C library access")

public actual fun mkostemp(template: String?, flags: Int): Int =
    throw UnsupportedOperationException("mkostemp not available on WASI — no C library access")

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int =
    throw UnsupportedOperationException("mkostemps not available on WASI — no C library access")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps not available on WASI — no C library access")

public actual fun tmpfile64(): FILE? =
    throw UnsupportedOperationException("tmpfile64 not available on WASI — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on WASI — no C library access")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize not available on WASI — no C library access")

public actual fun closeRange(first: UInt, last: UInt, flags: Int): Int =
    throw UnsupportedOperationException("closeRange not available on WASI — no C library access")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on WASI — no C library access")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty not available on WASI — no C library access")

public actual fun getpt(): Int =
    throw UnsupportedOperationException("getpt not available on WASI — no C library access")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR not available on WASI — no C library access")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty not available on WASI — no C library access")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid not available on WASI — no C library access")

public actual fun clearenv(): Int =
    throw UnsupportedOperationException("clearenv not available on WASI — no C library access")

public actual fun execveat(dirfd: Int, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("execveat not available on WASI — no C library access")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe not available on WASI — no C library access")

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve not available on WASI — no C library access")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon not available on WASI — no C library access")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn not available on WASI — no C library access")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp not available on WASI — no C library access")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit not available on WASI — no C library access")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on WASI — no C library access")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on WASI — no C library access")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on WASI — no C library access")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on WASI — no C library access")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on WASI — no C library access")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on WASI — no C library access")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on WASI — no C library access")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on WASI — no C library access")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on WASI — no C library access")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy not available on WASI — no C library access")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy not available on WASI — no C library access")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam not available on WASI — no C library access")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam not available on WASI — no C library access")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on WASI — no C library access")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT?, from: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT?, tcfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddtcsetpgrpNp not available on WASI — no C library access")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen not available on WASI — no C library access")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on WASI — no C library access")

public actual fun euidaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("euidaccess not available on WASI — no C library access")

public actual fun eaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("eaccess not available on WASI — no C library access")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat not available on WASI — no C library access")

public actual fun stat(file: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat not available on WASI — no C library access")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on WASI — no C library access")

public actual fun readdir64(dirp: DIR?): Dirent64? =
    throw UnsupportedOperationException("readdir64 not available on WASI — no C library access")

public actual fun readdirR(dirp: DIR?, entry: Dirent?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdirR not available on WASI — no C library access")

public actual fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdir64R not available on WASI — no C library access")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on WASI — no C library access")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on WASI — no C library access")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on WASI — no C library access")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on WASI — no C library access")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation not available on WASI — no C library access")

public actual fun mmap64(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap64 not available on WASI — no C library access")

public actual fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: Int, vararg args: Any?): COpaquePointer? =
    throw UnsupportedOperationException("mremap not available on WASI — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on WASI — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on WASI — no C library access")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on WASI — no C library access")

public actual fun syncfs(fd: Int): Int =
    throw UnsupportedOperationException("syncfs not available on WASI — no C library access")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync not available on WASI — no C library access")

public actual fun fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate64 not available on WASI — no C library access")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate not available on WASI — no C library access")

public actual fun posixFallocate64(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate64 not available on WASI — no C library access")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise not available on WASI — no C library access")

public actual fun posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise64 not available on WASI — no C library access")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise not available on WASI — no C library access")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise not available on WASI — no C library access")

public actual fun getrlimit(resource: UInt, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on WASI — no C library access")

public actual fun getrlimit64(resource: UInt, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 not available on WASI — no C library access")

public actual fun setrlimit(resource: UInt, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on WASI — no C library access")

public actual fun setrlimit64(resource: UInt, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 not available on WASI — no C library access")

public actual fun getpriority(which: UInt, who: UInt): Int =
    throw UnsupportedOperationException("getpriority not available on WASI — no C library access")

public actual fun setpriority(which: UInt, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority not available on WASI — no C library access")

public actual fun getrandom(buffer: COpaquePointer?, length: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("getrandom not available on WASI — no C library access")

public actual fun getentropy(buffer: COpaquePointer?, length: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on WASI — no C library access")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on WASI — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on WASI — no C library access")

public actual fun strchrnul(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strchrnul not available on WASI — no C library access")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on WASI — no C library access")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on WASI — no C library access")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on WASI — no C library access")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on WASI — no C library access")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 not available on WASI — no C library access")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 not available on WASI — no C library access")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 not available on WASI — no C library access")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 not available on WASI — no C library access")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 not available on WASI — no C library access")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 not available on WASI — no C library access")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 not available on WASI — no C library access")

public actual fun brk(addr: COpaquePointer?): Int =
    throw UnsupportedOperationException("brk not available on WASI — no C library access")

public actual fun sbrk(increment: Int): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on WASI — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on WASI — no C library access")

public actual fun mallopt(param: Int, value: Int): Int =
    throw UnsupportedOperationException("mallopt not available on WASI — no C library access")

public actual fun mallocInfo(options: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("mallocInfo not available on WASI — no C library access")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on WASI — no C library access")

public actual fun mallocTrim(pad: ULong): Int =
    throw UnsupportedOperationException("mallocTrim not available on WASI — no C library access")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on WASI — no C library access")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose not available on WASI — no C library access")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong not available on WASI — no C library access")

public actual fun backtrace(buf: COpaquePointer?, sz: Int): Int =
    throw UnsupportedOperationException("backtrace not available on WASI — no C library access")

public actual fun reboot(howTo: Int): Int =
    throw UnsupportedOperationException("reboot not available on WASI — no C library access")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg not available on WASI — no C library access")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec not available on WASI — no C library access")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on WASI — no C library access")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree not available on WASI — no C library access")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on WASI — no C library access")

public actual fun globfree64(pglob: Glob64T?): Unit = throw UnsupportedOperationException("globfree64 not available on WASI — no C library access")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("getxattr not available on WASI — no C library access")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("lgetxattr not available on WASI — no C library access")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("fgetxattr not available on WASI — no C library access")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("setxattr not available on WASI — no C library access")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("lsetxattr not available on WASI — no C library access")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr not available on WASI — no C library access")

public actual fun listxattr(path: String?, list: String?, size: ULong): Int =
    throw UnsupportedOperationException("listxattr not available on WASI — no C library access")

public actual fun llistxattr(path: String?, list: String?, size: ULong): Int =
    throw UnsupportedOperationException("llistxattr not available on WASI — no C library access")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong): Int =
    throw UnsupportedOperationException("flistxattr not available on WASI — no C library access")

public actual fun removexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("removexattr not available on WASI — no C library access")

public actual fun lremovexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("lremovexattr not available on WASI — no C library access")

public actual fun fremovexattr(filedes: Int, name: String?): Int =
    throw UnsupportedOperationException("fremovexattr not available on WASI — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on WASI — no C library access")

public actual fun posixBasename(path: String?): String? =
    throw UnsupportedOperationException("posixBasename not available on WASI — no C library access")

public actual fun gnuBasename(path: String?): String? =
    throw UnsupportedOperationException("gnuBasename not available on WASI — no C library access")

public actual fun dlmopen(lmid: Long, filename: String?, flag: Int): COpaquePointer? =
    throw UnsupportedOperationException("dlmopen not available on WASI — no C library access")

public actual fun dlinfo(handle: COpaquePointer?, request: Int, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlinfo not available on WASI — no C library access")

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("dladdr1 not available on WASI — no C library access")

public actual fun duplocale(base: io.github.kotlinmania.libc.unix.hurd.LocaleStruct?): io.github.kotlinmania.libc.unix.hurd.LocaleStruct? =
    throw UnsupportedOperationException("duplocale not available on WASI — no C library access")

public actual fun freelocale(loc: io.github.kotlinmania.libc.unix.hurd.LocaleStruct?): Unit = throw UnsupportedOperationException("freelocale not available on WASI — no C library access")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.unix.hurd.LocaleStruct?): io.github.kotlinmania.libc.unix.hurd.LocaleStruct? =
    throw UnsupportedOperationException("newlocale not available on WASI — no C library access")

public actual fun uselocale(loc: io.github.kotlinmania.libc.unix.hurd.LocaleStruct?): io.github.kotlinmania.libc.unix.hurd.LocaleStruct? =
    throw UnsupportedOperationException("uselocale not available on WASI — no C library access")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on WASI — no C library access")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.unix.hurd.LocaleStruct?): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on WASI — no C library access")

public actual fun gnuGetLibcRelease(): String? =
    throw UnsupportedOperationException("gnuGetLibcRelease not available on WASI — no C library access")

public actual fun gnuGetLibcVersion(): String? =
    throw UnsupportedOperationException("gnuGetLibcVersion not available on WASI — no C library access")

public actual fun pthreadCreate(native: Long?, attr: io.github.kotlinmania.libc.unix.hurd.PthreadAttr?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on WASI — no C library access")

public actual fun pthreadOnce(control: io.github.kotlinmania.libc.unix.hurd.PthreadOnce?, routine: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadOnce not available on WASI — no C library access")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on WASI — no C library access")

public actual fun fstat64(fd: Int, buf: Stat64?): Int =
    throw UnsupportedOperationException("fstat64 not available on WASI — no C library access")

public actual fun lstat64(file: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("lstat64 not available on WASI — no C library access")

public actual fun open64(file: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open64 not available on WASI — no C library access")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen64 not available on WASI — no C library access")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen64 not available on WASI — no C library access")

public actual fun stat64(file: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("stat64 not available on WASI — no C library access")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortR not available on WASI — no C library access")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on WASI — no C library access")

public actual fun glob64(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: Glob64T?): Int =
    throw UnsupportedOperationException("glob64 not available on WASI — no C library access")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr not available on WASI — no C library access")
