// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun cPUZERO(cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUZERO not available on JVM — no C library access")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUSET not available on JVM — no C library access")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUCLR not available on JVM — no C library access")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on JVM — no C library access")

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation not available on JVM — no C library access")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent not available on JVM — no C library access")
}

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun setutxdb(type: CUInt, file: String?): CInt =
    throw UnsupportedOperationException("setutxdb not available on JVM — no C library access")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioWaitcomplete not available on JVM — no C library access")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: String?, len: ULong): String? =
    throw UnsupportedOperationException("devnameR not available on JVM — no C library access")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid not available on JVM — no C library access")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on JVM — no C library access")
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: Rtprio?): CInt =
    throw UnsupportedOperationException("lwpRtprio not available on JVM — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs not available on JVM — no C library access")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on JVM — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit not available on JVM — no C library access")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on JVM — no C library access")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock not available on JVM — no C library access")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on JVM — no C library access")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on JVM — no C library access")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, mask: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity not available on JVM — no C library access")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, mask: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity not available on JVM — no C library access")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu not available on JVM — no C library access")

public actual fun setproctitle(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitle not available on JVM — no C library access")
}

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget not available on JVM — no C library access")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on JVM — no C library access")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt not available on JVM — no C library access")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl not available on JVM — no C library access")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("procctl not available on JVM — no C library access")

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    throw UnsupportedOperationException("updwtmpx not available on JVM — no C library access")

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    throw UnsupportedOperationException("getlastlogx not available on JVM — no C library access")

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    throw UnsupportedOperationException("updlastlogx not available on JVM — no C library access")

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname not available on JVM — no C library access")

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    throw UnsupportedOperationException("sysCheckpoint not available on JVM — no C library access")

public actual fun umtxSleep(ptr: CInt?, value: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("umtxSleep not available on JVM — no C library access")

public actual fun umtxWakeup(ptr: CInt?, count: CInt): CInt =
    throw UnsupportedOperationException("umtxWakeup not available on JVM — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on JVM — no C library access")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on JVM — no C library access")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo not available on JVM — no C library access")

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntvinfo not available on JVM — no C library access")

public actual fun closefrom(lowfd: CInt): CInt =
    throw UnsupportedOperationException("closefrom not available on JVM — no C library access")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel not available on JVM — no C library access")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError not available on JVM — no C library access")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync not available on JVM — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead not available on JVM — no C library access")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn not available on JVM — no C library access")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend not available on JVM — no C library access")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite not available on JVM — no C library access")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio not available on JVM — no C library access")

public actual fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocf not available on JVM — no C library access")

public actual fun freezero(ptr: COpaquePointer?, size: ULong) {
    throw UnsupportedOperationException("freezero not available on JVM — no C library access")
}

