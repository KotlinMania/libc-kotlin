@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyAioCancel
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyAioError
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyAioFsync
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyAioRead
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyAioReturn
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyAioSuspend
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyAioWaitcomplete
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyAioWrite
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyBasename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyClosefrom
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyDevnameR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyDirname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyErrnoLocation
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyFreelocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyFreezero
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyFstatfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyGetlastlogx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyGetmntinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyGetmntvinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyLioListio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyLwpRtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyMemmem
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyMprotect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyProcctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyPthreadSpinInit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyPthreadSpinLock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyReallocf
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflySchedGetaffinity
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflySchedGetcpu
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflySchedSetaffinity
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflySetgrent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflySetproctitle
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflySetutxdb
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyShmat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyShmctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyShmdt
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyShmget
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyStatfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflySysCheckpoint
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyUmtxSleep
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyUmtxWakeup
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyUname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyUpdlastlogx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyUpdwtmpx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyUtmpxname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.cinterop.libcUnixBsdFreebsdlikeDragonflyWaitid
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyErrnoLocation()?.toLong() ?: 0L)

public actual fun setgrent() {
    libcUnixBsdFreebsdlikeDragonflySetgrent()
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun setutxdb(type: CUint, file: MutPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeDragonflySetutxdb(type, file.rawAddress.toCPointer<ByteVar>())

public actual fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioWaitcomplete(iocbp.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyDevnameR(dev, mode, buf.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun freelocale(loc: LocaleT) {
    libcUnixBsdFreebsdlikeDragonflyFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt =
    libcUnixBsdFreebsdlikeDragonflyLwpRtprio(function, pid, lwpid, rtp.rawAddress.toCPointer<ByteVar>())

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    libcUnixBsdFreebsdlikeDragonflyStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    libcUnixBsdFreebsdlikeDragonflyFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcUnixBsdFreebsdlikeDragonflyUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr<CpuSetT>): CInt =
    libcUnixBsdFreebsdlikeDragonflySchedGetaffinity(pid, cpusetsize, mask.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: ConstPtr<CpuSetT>): CInt =
    libcUnixBsdFreebsdlikeDragonflySchedSetaffinity(pid, cpusetsize, mask.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    libcUnixBsdFreebsdlikeDragonflySchedGetcpu()

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    libcUnixBsdFreebsdlikeDragonflySetproctitle(fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyShmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyShmat(shmid, shmaddr.rawAddress.toCPointer<ByteVar>(), shmflg)?.toLong() ?: 0L)

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    libcUnixBsdFreebsdlikeDragonflyShmdt(shmaddr.rawAddress.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    libcUnixBsdFreebsdlikeDragonflyShmctl(shmid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt =
    libcUnixBsdFreebsdlikeDragonflyProcctl(idtype, id, cmd, data.rawAddress.toCPointer<ByteVar>())

public actual fun updwtmpx(file: ConstPtr<CChar>, ut: ConstPtr<Utmpx>): CInt =
    libcUnixBsdFreebsdlikeDragonflyUpdwtmpx(file.rawAddress.toCPointer<ByteVar>(), ut.rawAddress.toCPointer<ByteVar>())

public actual fun getlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): MutPtr<Lastlogx> =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyGetlastlogx(fname.rawAddress.toCPointer<ByteVar>(), uid, ll.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun updlastlogx(fname: ConstPtr<CChar>, uid: UidT, ll: MutPtr<Lastlogx>): CInt =
    libcUnixBsdFreebsdlikeDragonflyUpdlastlogx(fname.rawAddress.toCPointer<ByteVar>(), uid, ll.rawAddress.toCPointer<ByteVar>())

public actual fun getutxuser(name: ConstPtr<CChar>): Utmpx =
    Utmpx()

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeDragonflyUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflySysCheckpoint(tpe, fd, pid, retval)

public actual fun umtxSleep(ptr: ConstPtr<CInt>, value: CInt, timeout: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyUmtxSleep(ptr.rawAddress.toCPointer<ByteVar>(), value, timeout)

public actual fun umtxWakeup(ptr: ConstPtr<CInt>, count: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyUmtxWakeup(ptr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyGetmntinfo(mntbufp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getmntvinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mntvbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyGetmntvinfo(mntbufp.rawAddress.toCPointer<ByteVar>(), mntvbufp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun closefrom(lowfd: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyClosefrom(lowfd)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    libcUnixBsdFreebsdlikeDragonflyAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    libcUnixBsdFreebsdlikeDragonflyLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun reallocf(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyReallocf(ptr.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun freezero(ptr: MutPtr<CVoid>, size: SizeT) {
    libcUnixBsdFreebsdlikeDragonflyFreezero(ptr.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun kvmVmMapEntryFirst(kvm: MutPtr<KvmT>, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst(kvm.rawAddress.toCPointer<ByteVar>(), map.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun kvmVmMapEntryNext(kvm: MutPtr<KvmT>, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext(kvm.rawAddress.toCPointer<ByteVar>(), map.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)
