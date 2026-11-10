package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT

public fun cmsgAlign(n: Int): Int {
    return (n + (8 - 1)) and (8 - 1).inv()
}

public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? {
    return ((COpaquePointer((cmsg).hashCode().toLong())))?.let { COpaquePointer(it.rawValue + (cmsgAlign(8)).toLong()) }
}

public fun cmsgLen(length: CUint): CUint {
    return (cmsgAlign(8) + length.toInt()).toUInt()
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    val next = ((cmsg).hashCode().toLong()).toInt() + cmsgAlign((cmsg!!.cmsgLen).toInt()) + cmsgAlign(8)
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + mhdr.msgControllen.toInt()
    return if (next <= max) {
        null
    } else {
        null
    }
}

public fun cmsgSpace(length: CUint): CUint {
    return (cmsgAlign(8) + cmsgAlign(length.toInt())).toUInt()
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.ary.indices) {
        cpuset.ary[idx] = 0uL
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val (idx, offset) = Pair((cpu shr 6) and 3, cpu and 63)
    cpuset.ary[idx] = cpuset.ary[idx] or (1uL shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val (idx, offset) = Pair((cpu shr 6) and 3, cpu and 63)
    cpuset.ary[idx] = cpuset.ary[idx] and (1uL shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val (idx, offset) = Pair((cpu shr 6) and 3, cpu and 63)
    return 0uL != cpuset.ary[idx] and (1uL shl offset)
}

public fun wifsignaled(status: CInt): Boolean {
    return (status and 127) != 127 && (status and 127) != 0
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major
    val minor1 = minor
    var dev = 0u
    dev = dev or (major1 shl 8)
    dev = dev or minor1
    return dev
}

public fun major(dev: DevT): CInt {
    return ((dev shr 8) and 0xffu).toInt()
}

public fun minor(dev: DevT): CInt {
    return (dev and 0xffff00ffu).toInt()
}

public expect fun errnoLocation(): COpaquePointer?

public expect fun setgrent()

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun setutxdb(type: CUint, file: COpaquePointer?): CInt

public expect fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer?

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt

public expect fun freelocale(loc: LocaleT)

public expect fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: COpaquePointer?): CInt

public expect fun statfs(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

public expect fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadSpinLock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinUnlock(lock: COpaquePointer?): CInt

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt

public expect fun schedGetcpu(): CInt

public expect fun setproctitle(fmt: String?, vararg variadicArgs: Long)

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt

public expect fun updwtmpx(file: String?, ut: COpaquePointer?): CInt

public expect fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer?

public expect fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt

public expect fun getutxuser(name: String?): Utmpx

public expect fun utmpxname(file: String?): CInt

public expect fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt

public expect fun umtxSleep(ptr: COpaquePointer?, value: CInt, timeout: CInt): CInt

public expect fun umtxWakeup(ptr: COpaquePointer?, count: CInt): CInt

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

public expect fun basename(path: COpaquePointer?): COpaquePointer?

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt

public expect fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt

public expect fun closefrom(lowfd: CInt): CInt

public expect fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioError(aiocbp: COpaquePointer?): CInt

public expect fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioRead(aiocbp: COpaquePointer?): CInt

public expect fun aioReturn(aiocbp: COpaquePointer?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt

public expect fun aioWrite(aiocbp: COpaquePointer?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt

public expect fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun freezero(ptr: COpaquePointer?, size: SizeT)

public expect fun kvmVmMapEntryFirst(kvm: COpaquePointer?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT

public expect fun kvmVmMapEntryNext(kvm: COpaquePointer?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT
