package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
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
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun cmsgAlign(n: Int): Int = (n + (sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64) - 1)) and (sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64) - 1).inv()

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgLen(length: CUint): CUint = (cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) + length.toInt()).toUInt()

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    val next = cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next <= max) {
        MutPtr((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    } else {
        MutPtr(0L)
    }
}

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) + cmsgAlign(length.toInt())).toUInt()

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

public fun wifsignaled(status: CInt): Boolean = (status and 127) != 127 && (status and 127) != 0

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major
    val minor1 = minor
    var dev = 0u
    dev = dev or (major1 shl 8)
    dev = dev or minor1
    return dev
}

public fun major(dev: DevT): CInt = ((dev shr 8) and 0xffu).toInt()

public fun minor(dev: DevT): CInt = (dev and 0xffff00ffu).toInt()

public expect fun errnoLocation(): MutPtr

public expect fun setgrent()

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun setutxdb(type: CUint, file: MutPtr): CInt

public expect fun aioWaitcomplete(iocbp: MutPtr, timeout: MutPtr): CInt

public expect fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr, len: SizeT): MutPtr

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun freelocale(loc: LocaleT)

public expect fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: MutPtr): CInt

public expect fun statfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr): CInt

public expect fun uname(buf: MutPtr): CInt

public expect fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: ConstPtr): CInt

public expect fun schedGetcpu(): CInt

public expect fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long)

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr

public expect fun shmdt(shmaddr: ConstPtr): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr): CInt

public expect fun updwtmpx(file: ConstPtr, ut: ConstPtr): CInt

public expect fun getlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): MutPtr

public expect fun updlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): CInt

public expect fun getutxuser(name: ConstPtr): Utmpx

public expect fun utmpxname(file: ConstPtr): CInt

public expect fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt

public expect fun umtxSleep(ptr: ConstPtr, value: CInt, timeout: CInt): CInt

public expect fun umtxWakeup(ptr: ConstPtr, count: CInt): CInt

public expect fun dirname(path: MutPtr): MutPtr

public expect fun basename(path: MutPtr): MutPtr

public expect fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt

public expect fun getmntvinfo(mntbufp: MutPtr, mntvbufp: MutPtr, flags: CInt): CInt

public expect fun closefrom(lowfd: CInt): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt

public expect fun aioError(aiocbp: ConstPtr): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr): CInt

public expect fun aioRead(aiocbp: MutPtr): CInt

public expect fun aioReturn(aiocbp: MutPtr): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt

public expect fun aioWrite(aiocbp: MutPtr): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt

public expect fun reallocf(ptr: MutPtr, size: SizeT): MutPtr

public expect fun freezero(ptr: MutPtr, size: SizeT)

public expect fun kvmVmMapEntryFirst(kvm: MutPtr, map: VmMapT, entry: VmMapEntryT): VmMapEntryT

public expect fun kvmVmMapEntryNext(kvm: MutPtr, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT
