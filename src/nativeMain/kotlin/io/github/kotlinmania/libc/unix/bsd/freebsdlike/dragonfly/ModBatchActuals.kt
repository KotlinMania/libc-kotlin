// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_memmem
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.useContents
import libc.cinterop.libc_cmsg_data
import libc.cinterop.libc_cmsg_firsthdr
import libc.cinterop.libc_cmsg_nxthdr
import kotlinx.cinterop.toKString

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? {
    if (cmsg == null) return null
    return memScoped {
        val cPtr = alloc<platform.posix.cmsghdr>()
        cPtr.cmsg_len = cmsg.cmsgLen.toULong()
        cPtr.cmsg_level = cmsg.cmsgLevel
        cPtr.cmsg_type = cmsg.cmsgType
        val result = libc_cmsg_data(cPtr.ptr)
        if (result == null) null else COpaquePointer(result.toLong())
    }
}

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if (mhdr == null) return null
    return memScoped {
        val mhdrPtr = alloc<platform.posix.msghdr>()
        mhdrPtr.msg_name = mhdr.msgName?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_namelen = mhdr.msgNamelen.toUInt()
        mhdrPtr.msg_iovlen = mhdr.msgIovlen.toULong()
        mhdrPtr.msg_control = mhdr.msgControl?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_controllen = mhdr.msgControllen.toULong()
        mhdrPtr.msg_flags = mhdr.msgFlags
        if (cmsg == null) {
            val result = libc_cmsg_firsthdr(mhdrPtr.ptr)
            if (result == null) null
            else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
        } else {
            val cmsgPtr = alloc<platform.posix.cmsghdr>()
            cmsgPtr.cmsg_len = cmsg.cmsgLen.toULong()
            cmsgPtr.cmsg_level = cmsg.cmsgLevel
            cmsgPtr.cmsg_type = cmsg.cmsgType
            val result = libc_cmsg_nxthdr(mhdrPtr.ptr, cmsgPtr.ptr)
            if (result == null) null
            else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
        }
    }
}

public actual fun cPUZERO(cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUZERO requires manual FFI bridge — not yet implemented")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUSET requires manual FFI bridge — not yet implemented")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?) {
    throw UnsupportedOperationException("cPUCLR requires manual FFI bridge — not yet implemented")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires manual FFI bridge — not yet implemented")

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun setgrent() {
    libc.cinterop.libc_setgrent()
}

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun setutxdb(type: CUInt, file: String?): CInt =
    throw UnsupportedOperationException("setutxdb requires manual FFI bridge — not yet implemented")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioWaitcomplete requires manual FFI bridge — not yet implemented")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: String?, len: ULong): String? =
    throw UnsupportedOperationException("devnameR requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: Rtprio?): CInt =
    throw UnsupportedOperationException("lwpRtprio requires manual FFI bridge — not yet implemented")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): CInt =
    libc.cinterop.libc_uname(buf?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? {
    val hPtr: CPointer<ByteVar>? = haystack?.value?.toCPointer()
    val nPtr: CPointer<ByteVar>? = needle?.value?.toCPointer()
    if (hPtr == null || nPtr == null) return null
    val result = libc.cinterop.libc_memmem(hPtr, haystacklen, nPtr, needlelen)
    if (result == null) return null
    return COpaquePointer(result.toLong())
}

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    libc.cinterop.libc_pthread_spin_init(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_destroy(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_lock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_trylock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_unlock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun schedGetaffinity(pid: PidT, cpusetsize: ULong, mask: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, mask: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu requires manual FFI bridge — not yet implemented")

public actual fun setproctitle(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitle requires manual FFI bridge — not yet implemented")
}

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    libc.cinterop.libc_shmdt(shmaddr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("procctl requires manual FFI bridge — not yet implemented")

public actual fun updwtmpx(file: String?, ut: Utmpx?): CInt =
    throw UnsupportedOperationException("updwtmpx requires manual FFI bridge — not yet implemented")

public actual fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? =
    throw UnsupportedOperationException("getlastlogx requires manual FFI bridge — not yet implemented")

public actual fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt =
    throw UnsupportedOperationException("updlastlogx requires manual FFI bridge — not yet implemented")

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    throw UnsupportedOperationException("sysCheckpoint requires manual FFI bridge — not yet implemented")

public actual fun umtxSleep(ptr: CInt?, value: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("umtxSleep requires manual FFI bridge — not yet implemented")

public actual fun umtxWakeup(ptr: CInt?, count: CInt): CInt =
    throw UnsupportedOperationException("umtxWakeup requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? =
    libc.cinterop.libc_dirname(path)?.toKString()

public actual fun basename(path: String?): String? =
    libc.cinterop.libc_basename(path)?.toKString()

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntvinfo requires manual FFI bridge — not yet implemented")

public actual fun closefrom(lowfd: CInt): CInt =
    throw UnsupportedOperationException("closefrom requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocf requires manual FFI bridge — not yet implemented")

public actual fun freezero(ptr: COpaquePointer?, size: ULong) {
    throw UnsupportedOperationException("freezero requires manual FFI bridge — not yet implemented")
}
