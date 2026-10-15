// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import libc.cinterop.libc_basename
import libc.cinterop.libc_dirname
import libc.cinterop.libc_setgrent
import libc.cinterop.libc_shmdt
import libc.cinterop.libc_uname

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun cPUZERO(cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Unit = throw UnsupportedOperationException("cPUZERO requires manual FFI bridge — not yet implemented")

public actual fun cPUSET(cpu: ULong, cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Unit = throw UnsupportedOperationException("cPUSET requires manual FFI bridge — not yet implemented")

public actual fun cPUCLR(cpu: ULong, cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Unit = throw UnsupportedOperationException("cPUCLR requires manual FFI bridge — not yet implemented")

public actual fun cPUISSET(cpu: ULong, cpuset: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires manual FFI bridge — not yet implemented")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun setgrent() {
    val result = libc_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun setutxdb(type: UInt, file: String?): Int =
    throw UnsupportedOperationException("setutxdb requires manual FFI bridge — not yet implemented")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioWaitcomplete requires manual FFI bridge — not yet implemented")

public actual fun devnameR(dev: UInt, mode: UInt, buf: String?, len: ULong): String? =
    throw UnsupportedOperationException("devnameR requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun lwpRtprio(function: Int, pid: Int, lwpid: Int, rtp: Rtprio?): Int =
    throw UnsupportedOperationException("lwpRtprio requires manual FFI bridge — not yet implemented")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): Int {
    if (buf == null) return -1
    val bufPtr: CPointer<ByteVar>? = buf.handle.toCPointer()
    val result = libc_uname(bufPtr)
    return result
}

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires FFI bridge")

public actual fun pthreadSpinInit(lock: ULong?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinDestroy(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinLock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinTrylock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinUnlock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu requires manual FFI bridge — not yet implemented")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle requires manual FFI bridge — not yet implemented")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    libc.cinterop.libc_shmdt(shmaddr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun procctl(idtype: UInt, id: UInt, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("procctl requires manual FFI bridge — not yet implemented")

public actual fun updwtmpx(file: String?, ut: Utmpx?): Int =
    throw UnsupportedOperationException("updwtmpx requires manual FFI bridge — not yet implemented")

public actual fun getlastlogx(fname: String?, uid: UInt, ll: Lastlogx?): Lastlogx? =
    throw UnsupportedOperationException("getlastlogx requires manual FFI bridge — not yet implemented")

public actual fun updlastlogx(fname: String?, uid: UInt, ll: Lastlogx?): Int =
    throw UnsupportedOperationException("updlastlogx requires manual FFI bridge — not yet implemented")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")

public actual fun sysCheckpoint(tpe: Int, fd: Int, pid: Int, retval: Int): Int =
    throw UnsupportedOperationException("sysCheckpoint requires manual FFI bridge — not yet implemented")

public actual fun umtxSleep(ptr: Int?, value: Int, timeout: Int): Int =
    throw UnsupportedOperationException("umtxSleep requires manual FFI bridge — not yet implemented")

public actual fun umtxWakeup(ptr: Int?, count: Int): Int =
    throw UnsupportedOperationException("umtxWakeup requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? {
    val result = libc_dirname(path)
    return result?.toKString()
}

public actual fun basename(path: String?): String? {
    val result = libc_basename(path)
    return result?.toKString()
}

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntvinfo requires manual FFI bridge — not yet implemented")

public actual fun closefrom(lowfd: Int): Int =
    throw UnsupportedOperationException("closefrom requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocf requires manual FFI bridge — not yet implemented")

public actual fun freezero(ptr: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("freezero requires manual FFI bridge — not yet implemented")
