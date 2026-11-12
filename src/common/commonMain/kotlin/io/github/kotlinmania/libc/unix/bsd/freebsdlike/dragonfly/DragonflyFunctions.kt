package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun cmsgAlign(n: Int): Int = (n + (sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>()) - 1)) and (sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>()) - 1).inv()

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>()))).toLong() * (ObjectSlotLayout<CUchar>()).strideBytes))

public fun cmsgLen(length: CUint): CUint = (cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>())) + length.toInt()).toUInt()

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    val next = cmsg.rawAddress.toInt() + cmsgAlign(((ObjectSlotLayout<Cmsghdr>()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>()))
    val max = ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next <= max) {
        MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + cmsgAlign(((ObjectSlotLayout<Cmsghdr>()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    } else {
        MutPtr<Cmsghdr>(0L)
    }
}

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>())) + cmsgAlign(length.toInt())).toUInt()

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

public expect fun errnoLocation(): MutPtr<CInt>

public expect fun setgrent()

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun setutxdb(type: CUint, file: MutPtr<CChar>): CInt

public expect fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): CInt

public expect fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: SizeT): MutPtr<CChar>

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

public expect fun freelocale(loc: LocaleT)

public expect fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt

public expect fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr<CpuSetT>): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: ConstPtr<CpuSetT>): CInt

public expect fun schedGetcpu(): CInt

public expect fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long)

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid>

public expect fun shmdt(shmaddr: ConstPtr<CVoid>): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt

public expect fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt

public expect fun updwtmpx(file: ConstPtr<CChar>, ut: ConstPtr<Utmpx>): CInt

public expect fun getlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): MutPtr<Lastlogx>

public expect fun updlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): CInt

public expect fun getutxuser(name: ConstPtr<CChar>): Utmpx

public expect fun utmpxname(file: ConstPtr<CChar>): CInt

public expect fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt

public expect fun umtxSleep(ptr: ConstPtr<CInt>, value: CInt, timeout: CInt): CInt

public expect fun umtxWakeup(ptr: ConstPtr<CInt>, count: CInt): CInt

public expect fun dirname(path: MutPtr<CChar>): MutPtr<CChar>

public expect fun basename(path: MutPtr<CChar>): MutPtr<CChar>

public expect fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt

public expect fun getmntvinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mntvbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt

public expect fun closefrom(lowfd: CInt): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioError(aiocbp: ConstPtr<Aiocb>): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioRead(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt

public expect fun reallocf(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid>

public expect fun freezero(ptr: MutPtr<CVoid>, size: SizeT)

public expect fun kvmVmMapEntryFirst(kvm: MutPtr<KvmT>, map: VmMapT, entry: VmMapEntryT): VmMapEntryT

public expect fun kvmVmMapEntryNext(kvm: MutPtr<KvmT>, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT
