// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cpuZero(cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Unit = throw UnsupportedOperationException("cPUZERO requires N-API addon")

public actual fun cpuSet(cpu: ULong, cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Unit = throw UnsupportedOperationException("cPUSET requires N-API addon")

public actual fun cpuClear(cpu: ULong, cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Unit = throw UnsupportedOperationException("cPUCLR requires N-API addon")

public actual fun cpuIsSet(cpu: ULong, cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires N-API addon")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun setutxdb(type: UInt, file: String?): Int =
    throw UnsupportedOperationException("setutxdb requires N-API addon")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioWaitcomplete requires N-API addon")

public actual fun devnameR(dev: UInt, mode: UInt, buf: String?, len: ULong): String? =
    throw UnsupportedOperationException("devnameR requires N-API addon")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun lwpRtprio(function: Int, pid: Int, lwpid: Int, rtp: Rtprio?): Int =
    throw UnsupportedOperationException("lwpRtprio requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun pthreadSpinInit(lock: ULong?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinDestroy(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinLock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires N-API addon")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires N-API addon")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu requires N-API addon")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle requires N-API addon")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun procctl(idtype: UInt, id: UInt, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("procctl requires N-API addon")

public actual fun updwtmpx(file: String?, ut: Utmpx?): Int =
    throw UnsupportedOperationException("updwtmpx requires N-API addon")

public actual fun getlastlogx(fname: String?, uid: UInt, ll: Lastlogx?): Lastlogx? =
    throw UnsupportedOperationException("getlastlogx requires N-API addon")

public actual fun updlastlogx(fname: String?, uid: UInt, ll: Lastlogx?): Int =
    throw UnsupportedOperationException("updlastlogx requires N-API addon")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun sysCheckpoint(tpe: Int, fd: Int, pid: Int, retval: Int): Int =
    throw UnsupportedOperationException("sysCheckpoint requires N-API addon")

public actual fun umtxSleep(ptr: Int?, value: Int, timeout: Int): Int =
    throw UnsupportedOperationException("umtxSleep requires N-API addon")

public actual fun umtxWakeup(ptr: Int?, count: Int): Int =
    throw UnsupportedOperationException("umtxWakeup requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires N-API addon")

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntvinfo requires N-API addon")

public actual fun closefrom(lowfd: Int): Int =
    throw UnsupportedOperationException("closefrom requires N-API addon")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocf requires N-API addon")

public actual fun freezero(ptr: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("freezero requires N-API addon")
