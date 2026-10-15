// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on Android host — use androidNative target for FFI")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on Android host — use androidNative target for FFI")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on Android host — use androidNative target for FFI")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO not available on Android host — use androidNative target for FFI")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET not available on Android host — use androidNative target for FFI")

public actual fun fDCLR(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR not available on Android host — use androidNative target for FFI")

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on Android host — use androidNative target for FFI")

public actual fun thrKill(id: UInt, sig: Int): Int =
    throw UnsupportedOperationException("thrKill not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, detachstate: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetinheritsched not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetscope not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetscope not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): Int =
    throw UnsupportedOperationException("pthreadBarrierDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: io.github.kotlinmania.libc.COpaquePointer?, count: UInt): Int =
    throw UnsupportedOperationException("pthreadBarrierInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): Int =
    throw UnsupportedOperationException("pthreadBarrierWait not available on Android host — use androidNative target for FFI")

public actual fun pthreadCancel(thread: UInt): Int =
    throw UnsupportedOperationException("pthreadCancel not available on Android host — use androidNative target for FFI")

public actual fun pthreadCleanupPop(execute: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadCleanupPop not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Long?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Long): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetconcurrency(): Int =
    throw UnsupportedOperationException("pthreadGetconcurrency not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetcpuclockid(threadId: UInt, clockId: Long?): Int =
    throw UnsupportedOperationException("pthreadGetcpuclockid not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetschedparam(thread: UInt, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadKill(thread: UInt, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetprioceiling(attr: io.github.kotlinmania.libc.COpaquePointer?, prioceiling: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetprioceiling not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGettype(attr: io.github.kotlinmania.libc.COpaquePointer?, type: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGettype not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetprioceiling(attr: io.github.kotlinmania.libc.COpaquePointer?, prioceiling: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprioceiling not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexConsistent not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexGetprioceiling(mutex: PthreadMutexT?, prioceiling: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexGetprioceiling not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexSetprioceiling(mutex: PthreadMutexT?, prioceiling: Int, oldCeiling: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexSetprioceiling not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexTimedlock(mutex: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockTimedrdlock(rwlock: PthreadRwlockT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockTimedwrlock(rwlock: PthreadRwlockT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetcancelstate(state: Int, oldstate: Int?): Int =
    throw UnsupportedOperationException("pthreadSetcancelstate not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetcanceltype(type: Int, oldtype: Int?): Int =
    throw UnsupportedOperationException("pthreadSetcanceltype not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetconcurrency(newLevel: Int): Int =
    throw UnsupportedOperationException("pthreadSetconcurrency not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetschedparam(thread: UInt, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetschedprio(thread: UInt, prio: Int): Int =
    throw UnsupportedOperationException("pthreadSetschedprio not available on Android host — use androidNative target for FFI")

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadTestcancel(): COpaquePointer? =
    throw UnsupportedOperationException("pthreadTestcancel not available on Android host — use androidNative target for FFI")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on Android host — use androidNative target for FFI")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose not available on Android host — use androidNative target for FFI")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct not available on Android host — use androidNative target for FFI")

public actual fun aioCancel(fildes: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel not available on Android host — use androidNative target for FFI")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError not available on Android host — use androidNative target for FFI")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync not available on Android host — use androidNative target for FFI")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead not available on Android host — use androidNative target for FFI")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn not available on Android host — use androidNative target for FFI")

public actual fun aioSuspend(list: COpaquePointer?, nent: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend not available on Android host — use androidNative target for FFI")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite not available on Android host — use androidNative target for FFI")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on Android host — use androidNative target for FFI")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind not available on Android host — use androidNative target for FFI")

public actual fun brk(addr: COpaquePointer?): Int =
    throw UnsupportedOperationException("brk not available on Android host — use androidNative target for FFI")

public actual fun clearenv(): Int =
    throw UnsupportedOperationException("clearenv not available on Android host — use androidNative target for FFI")

public actual fun clockGetcpuclockid(pid: Int, clkId: Long?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid not available on Android host — use androidNative target for FFI")

public actual fun clockGetres(clkId: Long, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres not available on Android host — use androidNative target for FFI")

public actual fun clockGettime(clkId: Long, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on Android host — use androidNative target for FFI")

public actual fun clockNanosleep(clkId: Long, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep not available on Android host — use androidNative target for FFI")

public actual fun clockSettime(clockId: Long, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime not available on Android host — use androidNative target for FFI")

public actual fun creat64(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat64 not available on Android host — use androidNative target for FFI")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid not available on Android host — use androidNative target for FFI")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on Android host — use androidNative target for FFI")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on Android host — use androidNative target for FFI")

public actual fun duplocale(arg1: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale not available on Android host — use androidNative target for FFI")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent not available on Android host — use androidNative target for FFI")

public actual fun endmntent(streamp: FILE?): Int =
    throw UnsupportedOperationException("endmntent not available on Android host — use androidNative target for FFI")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent not available on Android host — use androidNative target for FFI")

public actual fun endutent(): Unit = throw UnsupportedOperationException("endutent not available on Android host — use androidNative target for FFI")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent not available on Android host — use androidNative target for FFI")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat not available on Android host — use androidNative target for FFI")

public actual fun fattach(fildes: Int, path: String?): Int =
    throw UnsupportedOperationException("fattach not available on Android host — use androidNative target for FFI")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync not available on Android host — use androidNative target for FFI")

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve not available on Android host — use androidNative target for FFI")

public actual fun ffs(value: Int): Int =
    throw UnsupportedOperationException("ffs not available on Android host — use androidNative target for FFI")

public actual fun ffsl(value: Long): Int =
    throw UnsupportedOperationException("ffsl not available on Android host — use androidNative target for FFI")

public actual fun ffsll(value: Long): Int =
    throw UnsupportedOperationException("ffsll not available on Android host — use androidNative target for FFI")

public actual fun fgetgrent(file: FILE?): Group? =
    throw UnsupportedOperationException("fgetgrent not available on Android host — use androidNative target for FFI")

public actual fun fgetpos64(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos64 not available on Android host — use androidNative target for FFI")

public actual fun fgetpwent(file: FILE?): Passwd? =
    throw UnsupportedOperationException("fgetpwent not available on Android host — use androidNative target for FFI")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale not available on Android host — use androidNative target for FFI")

public actual fun fseeko64(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko64 not available on Android host — use androidNative target for FFI")

public actual fun fsetpos64(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos64 not available on Android host — use androidNative target for FFI")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs not available on Android host — use androidNative target for FFI")

public actual fun fstatfs64(fd: Int, buf: Statfs64?): Int =
    throw UnsupportedOperationException("fstatfs64 not available on Android host — use androidNative target for FFI")

public actual fun fstatvfs64(fd: Int, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("fstatvfs64 not available on Android host — use androidNative target for FFI")

public actual fun ftello64(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello64 not available on Android host — use androidNative target for FFI")

public actual fun ftruncate64(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate64 not available on Android host — use androidNative target for FFI")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on Android host — use androidNative target for FFI")

public actual fun getcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("getcontext not available on Android host — use androidNative target for FFI")

public actual fun getdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("getdomainname not available on Android host — use androidNative target for FFI")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize not available on Android host — use androidNative target for FFI")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on Android host — use androidNative target for FFI")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on Android host — use androidNative target for FFI")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on Android host — use androidNative target for FFI")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on Android host — use androidNative target for FFI")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on Android host — use androidNative target for FFI")

public actual fun getgrset(user: String?): String? =
    throw UnsupportedOperationException("getgrset not available on Android host — use androidNative target for FFI")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid not available on Android host — use androidNative target for FFI")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent not available on Android host — use androidNative target for FFI")

public actual fun getnameinfo(sa: Sockaddr?, salen: ULong, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on Android host — use androidNative target for FFI")

public actual fun getpagesize(): Int =
    throw UnsupportedOperationException("getpagesize not available on Android host — use androidNative target for FFI")

public actual fun getpeereid(socket: Int, euid: UInt?, egid: UInt?): Int =
    throw UnsupportedOperationException("getpeereid not available on Android host — use androidNative target for FFI")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority not available on Android host — use androidNative target for FFI")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on Android host — use androidNative target for FFI")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR not available on Android host — use androidNative target for FFI")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR not available on Android host — use androidNative target for FFI")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on Android host — use androidNative target for FFI")

public actual fun getrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 not available on Android host — use androidNative target for FFI")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on Android host — use androidNative target for FFI")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer not available on Android host — use androidNative target for FFI")

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent not available on Android host — use androidNative target for FFI")

public actual fun getutid(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutid not available on Android host — use androidNative target for FFI")

public actual fun getutline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutline not available on Android host — use androidNative target for FFI")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on Android host — use androidNative target for FFI")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on Android host — use androidNative target for FFI")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on Android host — use androidNative target for FFI")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on Android host — use androidNative target for FFI")

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt not available on Android host — use androidNative target for FFI")

public actual fun hcreate(nelt: ULong): Int =
    throw UnsupportedOperationException("hcreate not available on Android host — use androidNative target for FFI")

public actual fun hdestroy(): Unit = throw UnsupportedOperationException("hdestroy not available on Android host — use androidNative target for FFI")

public actual fun hsearch(entry: Entry, action: ACTION): Entry? =
    throw UnsupportedOperationException("hsearch not available on Android host — use androidNative target for FFI")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex not available on Android host — use androidNative target for FFI")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on Android host — use androidNative target for FFI")

public actual fun initgroups(name: String?, basegid: UInt): Int =
    throw UnsupportedOperationException("initgroups not available on Android host — use androidNative target for FFI")

public actual fun ioctl(fildes: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on Android host — use androidNative target for FFI")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 not available on Android host — use androidNative target for FFI")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 not available on Android host — use androidNative target for FFI")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nent: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio not available on Android host — use androidNative target for FFI")

public actual fun loadquery(flags: Int, buf: COpaquePointer?, buflen: UInt, vararg args: Any?): Int =
    throw UnsupportedOperationException("loadquery not available on Android host — use androidNative target for FFI")

public actual fun lparGetInfo(command: Int, buf: COpaquePointer?, bufsize: ULong): Int =
    throw UnsupportedOperationException("lparGetInfo not available on Android host — use androidNative target for FFI")

public actual fun lparSetResources(id: Int, resource: COpaquePointer?): Int =
    throw UnsupportedOperationException("lparSetResources not available on Android host — use androidNative target for FFI")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 not available on Android host — use androidNative target for FFI")

public actual fun lseek64(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek64 not available on Android host — use androidNative target for FFI")

public actual fun madvise(addr: String?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise not available on Android host — use androidNative target for FFI")

public actual fun mallopt(param: Int, value: Int): Int =
    throw UnsupportedOperationException("mallopt not available on Android host — use androidNative target for FFI")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on Android host — use androidNative target for FFI")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int =
    throw UnsupportedOperationException("memsetS not available on Android host — use androidNative target for FFI")

public actual fun mincore(addr: String?, len: ULong, vec: String?): Int =
    throw UnsupportedOperationException("mincore not available on Android host — use androidNative target for FFI")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat not available on Android host — use androidNative target for FFI")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat not available on Android host — use androidNative target for FFI")

public actual fun mount(device: String?, path: String?, flags: Int): Int =
    throw UnsupportedOperationException("mount not available on Android host — use androidNative target for FFI")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on Android host — use androidNative target for FFI")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose not available on Android host — use androidNative target for FFI")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr not available on Android host — use androidNative target for FFI")

public actual fun mqNotify(mqd: Int, notification: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify not available on Android host — use androidNative target for FFI")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen not available on Android host — use androidNative target for FFI")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive not available on Android host — use androidNative target for FFI")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend not available on Android host — use androidNative target for FFI")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr not available on Android host — use androidNative target for FFI")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive not available on Android host — use androidNative target for FFI")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend not available on Android host — use androidNative target for FFI")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink not available on Android host — use androidNative target for FFI")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 not available on Android host — use androidNative target for FFI")

public actual fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int =
    throw UnsupportedOperationException("msgctl not available on Android host — use androidNative target for FFI")

public actual fun msgget(key: Int, msgflg: Int): Int =
    throw UnsupportedOperationException("msgget not available on Android host — use androidNative target for FFI")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Long =
    throw UnsupportedOperationException("msgrcv not available on Android host — use androidNative target for FFI")

public actual fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int =
    throw UnsupportedOperationException("msgsnd not available on Android host — use androidNative target for FFI")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on Android host — use androidNative target for FFI")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfoL(item: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on Android host — use androidNative target for FFI")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 not available on Android host — use androidNative target for FFI")

public actual fun pollsetCtl(ps: Int, pollctlArray: PollCtl?, arrayLength: Int): Int =
    throw UnsupportedOperationException("pollsetCtl not available on Android host — use androidNative target for FFI")

public actual fun pollsetDestroy(ps: Int): Int =
    throw UnsupportedOperationException("pollsetDestroy not available on Android host — use androidNative target for FFI")

public actual fun pollsetPoll(ps: Int, polldataArray: Pollfd?, arrayLength: Int, timeout: Int): Int =
    throw UnsupportedOperationException("pollsetPoll not available on Android host — use androidNative target for FFI")

public actual fun pollsetQuery(ps: Int, pollfdQuery: Pollfd?): Int =
    throw UnsupportedOperationException("pollsetQuery not available on Android host — use androidNative target for FFI")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on Android host — use androidNative target for FFI")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise not available on Android host — use androidNative target for FFI")

public actual fun posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise64 not available on Android host — use androidNative target for FFI")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate not available on Android host — use androidNative target for FFI")

public actual fun posixFallocate64(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate64 not available on Android host — use androidNative target for FFI")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise not available on Android host — use androidNative target for FFI")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: String?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddclose(actions: String?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAdddup2(actions: String?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddopen(actions: String?, fd: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsDestroy(actions: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsInit(actions: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: String?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp not available on Android host — use androidNative target for FFI")

public actual fun pread64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread64 not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun ptrace64(request: Int, id: Long, addr: Long, data: Int, buff: Int?): Int =
    throw UnsupportedOperationException("ptrace64 not available on Android host — use androidNative target for FFI")

public actual fun pututline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("pututline not available on Android host — use androidNative target for FFI")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on Android host — use androidNative target for FFI")

public actual fun pwrite64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite64 not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun quotactl(cmd: String?, special: Int, id: Int, data: String?): Int =
    throw UnsupportedOperationException("quotactl not available on Android host — use androidNative target for FFI")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on Android host — use androidNative target for FFI")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom not available on Android host — use androidNative target for FFI")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg not available on Android host — use androidNative target for FFI")

public actual fun recvmsg(sockfd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg not available on Android host — use androidNative target for FFI")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp not available on Android host — use androidNative target for FFI")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on Android host — use androidNative target for FFI")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec not available on Android host — use androidNative target for FFI")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree not available on Android host — use androidNative target for FFI")

public actual fun sbrk(increment: Long): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on Android host — use androidNative target for FFI")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam not available on Android host — use androidNative target for FFI")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin not available on Android host — use androidNative target for FFI")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval not available on Android host — use androidNative target for FFI")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam not available on Android host — use androidNative target for FFI")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler not available on Android host — use androidNative target for FFI")

public actual fun sctpOptInfo(sd: Int, id: UInt, opt: Int, argSize: COpaquePointer?, size: ULong?): Int =
    throw UnsupportedOperationException("sctpOptInfo not available on Android host — use androidNative target for FFI")

public actual fun sctpPeeloff(s: Int, id: UInt?): Int =
    throw UnsupportedOperationException("sctpPeeloff not available on Android host — use androidNative target for FFI")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 not available on Android host — use androidNative target for FFI")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on Android host — use androidNative target for FFI")

public actual fun semClose(sem: Int?): Int =
    throw UnsupportedOperationException("semClose not available on Android host — use androidNative target for FFI")

public actual fun semDestroy(sem: Int?): Int =
    throw UnsupportedOperationException("semDestroy not available on Android host — use androidNative target for FFI")

public actual fun semGetvalue(sem: Int?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue not available on Android host — use androidNative target for FFI")

public actual fun semInit(sem: Int?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit not available on Android host — use androidNative target for FFI")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): Int? =
    throw UnsupportedOperationException("semOpen not available on Android host — use androidNative target for FFI")

public actual fun semTimedwait(sem: Int?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait not available on Android host — use androidNative target for FFI")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink not available on Android host — use androidNative target for FFI")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl not available on Android host — use androidNative target for FFI")

public actual fun semget(key: Int, nsems: Int, semflag: Int): Int =
    throw UnsupportedOperationException("semget not available on Android host — use androidNative target for FFI")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop not available on Android host — use androidNative target for FFI")

public actual fun sendFile(socket: Int?, iobuf: SfParms?, flags: UInt): Long =
    throw UnsupportedOperationException("sendFile not available on Android host — use androidNative target for FFI")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg not available on Android host — use androidNative target for FFI")

public actual fun sendmsg(sockfd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg not available on Android host — use androidNative target for FFI")

public actual fun setcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("setcontext not available on Android host — use androidNative target for FFI")

public actual fun setdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("setdomainname not available on Android host — use androidNative target for FFI")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups not available on Android host — use androidNative target for FFI")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent not available on Android host — use androidNative target for FFI")

public actual fun sethostid(hostid: Int): Int =
    throw UnsupportedOperationException("sethostid not available on Android host — use androidNative target for FFI")

public actual fun sethostname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("sethostname not available on Android host — use androidNative target for FFI")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent not available on Android host — use androidNative target for FFI")

public actual fun setpriority(which: Int, who: UInt, priority: Int): Int =
    throw UnsupportedOperationException("setpriority not available on Android host — use androidNative target for FFI")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent not available on Android host — use androidNative target for FFI")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on Android host — use androidNative target for FFI")

public actual fun setrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 not available on Android host — use androidNative target for FFI")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday not available on Android host — use androidNative target for FFI")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer not available on Android host — use androidNative target for FFI")

public actual fun setutent(): Unit = throw UnsupportedOperationException("setutent not available on Android host — use androidNative target for FFI")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent not available on Android host — use androidNative target for FFI")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack not available on Android host — use androidNative target for FFI")

public actual fun sigsuspend(mask: SigsetT?): Int =
    throw UnsupportedOperationException("sigsuspend not available on Android host — use androidNative target for FFI")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait not available on Android host — use androidNative target for FFI")

public actual fun sigwait(set: SigsetT?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on Android host — use androidNative target for FFI")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo not available on Android host — use androidNative target for FFI")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on Android host — use androidNative target for FFI")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt not available on Android host — use androidNative target for FFI")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl not available on Android host — use androidNative target for FFI")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget not available on Android host — use androidNative target for FFI")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen not available on Android host — use androidNative target for FFI")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on Android host — use androidNative target for FFI")

public actual fun splice(socket1: Int, socket2: Int, flags: Int): Int =
    throw UnsupportedOperationException("splice not available on Android host — use androidNative target for FFI")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 not available on Android host — use androidNative target for FFI")

public actual fun stat64at(dirfd: Int, path: String?, buf: Stat64?, flags: Int): Int =
    throw UnsupportedOperationException("stat64at not available on Android host — use androidNative target for FFI")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs not available on Android host — use androidNative target for FFI")

public actual fun statfs64(path: String?, buf: Statfs64?): Int =
    throw UnsupportedOperationException("statfs64 not available on Android host — use androidNative target for FFI")

public actual fun statvfs64(path: String?, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("statvfs64 not available on Android host — use androidNative target for FFI")

public actual fun statx(path: String?, buf: Stat?, length: Int, command: Int): Int =
    throw UnsupportedOperationException("statx not available on Android host — use androidNative target for FFI")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strcasecmpL not available on Android host — use androidNative target for FFI")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on Android host — use androidNative target for FFI")

public actual fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on Android host — use androidNative target for FFI")

public actual fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strncasecmpL not available on Android host — use androidNative target for FFI")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime not available on Android host — use androidNative target for FFI")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep not available on Android host — use androidNative target for FFI")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): Int =
    throw UnsupportedOperationException("swapcontext not available on Android host — use androidNative target for FFI")

public actual fun swapoff(path: String?): Int =
    throw UnsupportedOperationException("swapoff not available on Android host — use androidNative target for FFI")

public actual fun swapon(path: String?): Int =
    throw UnsupportedOperationException("swapon not available on Android host — use androidNative target for FFI")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on Android host — use androidNative target for FFI")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on Android host — use androidNative target for FFI")

public actual fun timerCreate(clockid: Long, sevp: Sigevent?, timerid: Long?): Int =
    throw UnsupportedOperationException("timerCreate not available on Android host — use androidNative target for FFI")

public actual fun timerDelete(timerid: Long): Int =
    throw UnsupportedOperationException("timerDelete not available on Android host — use androidNative target for FFI")

public actual fun timerGetoverrun(timerid: Long): Int =
    throw UnsupportedOperationException("timerGetoverrun not available on Android host — use androidNative target for FFI")

public actual fun timerGettime(timerid: Long, value: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime not available on Android host — use androidNative target for FFI")

public actual fun timerSettime(timerid: Long, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime not available on Android host — use androidNative target for FFI")

public actual fun truncate64(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate64 not available on Android host — use androidNative target for FFI")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname not available on Android host — use androidNative target for FFI")

public actual fun updwtmp(file: String?, u: Utmp?): Unit = throw UnsupportedOperationException("updwtmp not available on Android host — use androidNative target for FFI")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale not available on Android host — use androidNative target for FFI")

public actual fun utmpname(file: String?): Int =
    throw UnsupportedOperationException("utmpname not available on Android host — use androidNative target for FFI")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat not available on Android host — use androidNative target for FFI")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 not available on Android host — use androidNative target for FFI")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid not available on Android host — use androidNative target for FFI")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on Android host — use androidNative target for FFI")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno not available on Android host — use androidNative target for FFI")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on Android host — use androidNative target for FFI")

public actual fun pthreadCleanupPush(routine: ((COpaquePointer?) -> Unit)?, arg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("pthreadCleanupPush not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(thread: UInt?, attr: io.github.kotlinmania.libc.COpaquePointer?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadOnce not available on Android host — use androidNative target for FFI")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen64 not available on Android host — use androidNative target for FFI")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen64 not available on Android host — use androidNative target for FFI")

public actual fun fstat64(fildes: Int, buf: Stat64?): Int =
    throw UnsupportedOperationException("fstat64 not available on Android host — use androidNative target for FFI")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on Android host — use androidNative target for FFI")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind not available on Android host — use androidNative target for FFI")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch not available on Android host — use androidNative target for FFI")

public actual fun lstat64(path: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("lstat64 not available on Android host — use androidNative target for FFI")

public actual fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: Int, vararg args: Any?): Unit = throw UnsupportedOperationException("makecontext not available on Android host — use androidNative target for FFI")

public actual fun open64(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open64 not available on Android host — use androidNative target for FFI")

public actual fun stat64(path: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("stat64 not available on Android host — use androidNative target for FFI")
