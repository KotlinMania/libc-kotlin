// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on Android host — use androidNative target for FFI")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on Android host — use androidNative target for FFI")

public actual fun cpuZero(cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Unit = throw UnsupportedOperationException("cPUZERO not available on Android host — use androidNative target for FFI")

public actual fun cpuSet(cpu: ULong, cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Unit = throw UnsupportedOperationException("cPUSET not available on Android host — use androidNative target for FFI")

public actual fun cpuClear(cpu: ULong, cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Unit = throw UnsupportedOperationException("cPUCLR not available on Android host — use androidNative target for FFI")

public actual fun cpuIsSet(cpu: ULong, cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on Android host — use androidNative target for FFI")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation not available on Android host — use androidNative target for FFI")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent not available on Android host — use androidNative target for FFI")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on Android host — use androidNative target for FFI")

public actual fun setutxdb(type: UInt, file: String?): Int =
    throw UnsupportedOperationException("setutxdb not available on Android host — use androidNative target for FFI")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioWaitcomplete not available on Android host — use androidNative target for FFI")

public actual fun devnameR(dev: UInt, mode: UInt, buf: String?, len: ULong): String? =
    throw UnsupportedOperationException("devnameR not available on Android host — use androidNative target for FFI")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid not available on Android host — use androidNative target for FFI")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale not available on Android host — use androidNative target for FFI")

public actual fun lwpRtprio(function: Int, pid: Int, lwpid: Int, rtp: Rtprio?): Int =
    throw UnsupportedOperationException("lwpRtprio not available on Android host — use androidNative target for FFI")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs not available on Android host — use androidNative target for FFI")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs not available on Android host — use androidNative target for FFI")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname not available on Android host — use androidNative target for FFI")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinInit(lock: ULong?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinDestroy(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinLock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinTrylock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinUnlock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on Android host — use androidNative target for FFI")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Int =
    throw UnsupportedOperationException("schedGetaffinity not available on Android host — use androidNative target for FFI")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Int =
    throw UnsupportedOperationException("schedSetaffinity not available on Android host — use androidNative target for FFI")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu not available on Android host — use androidNative target for FFI")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle not available on Android host — use androidNative target for FFI")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget not available on Android host — use androidNative target for FFI")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on Android host — use androidNative target for FFI")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt not available on Android host — use androidNative target for FFI")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl not available on Android host — use androidNative target for FFI")

public actual fun procctl(idtype: UInt, id: UInt, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("procctl not available on Android host — use androidNative target for FFI")

public actual fun updwtmpx(file: String?, ut: Utmpx?): Int =
    throw UnsupportedOperationException("updwtmpx not available on Android host — use androidNative target for FFI")

public actual fun getlastlogx(fname: String?, uid: UInt, ll: Lastlogx?): Lastlogx? =
    throw UnsupportedOperationException("getlastlogx not available on Android host — use androidNative target for FFI")

public actual fun updlastlogx(fname: String?, uid: UInt, ll: Lastlogx?): Int =
    throw UnsupportedOperationException("updlastlogx not available on Android host — use androidNative target for FFI")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname not available on Android host — use androidNative target for FFI")

public actual fun sysCheckpoint(tpe: Int, fd: Int, pid: Int, retval: Int): Int =
    throw UnsupportedOperationException("sysCheckpoint not available on Android host — use androidNative target for FFI")

public actual fun umtxSleep(ptr: Int?, value: Int, timeout: Int): Int =
    throw UnsupportedOperationException("umtxSleep not available on Android host — use androidNative target for FFI")

public actual fun umtxWakeup(ptr: Int?, count: Int): Int =
    throw UnsupportedOperationException("umtxWakeup not available on Android host — use androidNative target for FFI")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on Android host — use androidNative target for FFI")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on Android host — use androidNative target for FFI")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo not available on Android host — use androidNative target for FFI")

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntvinfo not available on Android host — use androidNative target for FFI")

public actual fun closefrom(lowfd: Int): Int =
    throw UnsupportedOperationException("closefrom not available on Android host — use androidNative target for FFI")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel not available on Android host — use androidNative target for FFI")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError not available on Android host — use androidNative target for FFI")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync not available on Android host — use androidNative target for FFI")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead not available on Android host — use androidNative target for FFI")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn not available on Android host — use androidNative target for FFI")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend not available on Android host — use androidNative target for FFI")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite not available on Android host — use androidNative target for FFI")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio not available on Android host — use androidNative target for FFI")

public actual fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocf not available on Android host — use androidNative target for FFI")

public actual fun freezero(ptr: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("freezero not available on Android host — use androidNative target for FFI")
