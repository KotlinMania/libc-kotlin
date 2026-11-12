@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyErrnoLocation()?.toLong() ?: 0L)

public actual fun setgrent() {
    libcUnixBsdFreebsdlikeDragonflySetgrent()
}

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun setutxdb(type: CUint, file: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflySetutxdb(type, file.rawAddress.toCPointer<ByteVar>())

public actual fun aioWaitcomplete(iocbp: MutPtr, timeout: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioWaitcomplete(iocbp.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr, len: SizeT): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyDevnameR(dev, mode, buf.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun freelocale(loc: LocaleT) {
    libcUnixBsdFreebsdlikeDragonflyFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyLwpRtprio(function, pid, lwpid, rtp.rawAddress.toCPointer<ByteVar>())

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun uname(buf: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflySchedGetaffinity(pid, cpusetsize, mask.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflySchedSetaffinity(pid, cpusetsize, mask.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    libcUnixBsdFreebsdlikeDragonflySchedGetcpu()

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long) {
    libcUnixBsdFreebsdlikeDragonflySetproctitle(fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyShmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyShmat(shmid, shmaddr.rawAddress.toCPointer<ByteVar>(), shmflg)?.toLong() ?: 0L)

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyShmdt(shmaddr.rawAddress.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyShmctl(shmid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyProcctl(idtype, id, cmd, data.rawAddress.toCPointer<ByteVar>())

public actual fun updwtmpx(file: ConstPtr, ut: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyUpdwtmpx(file.rawAddress.toCPointer<ByteVar>(), ut.rawAddress.toCPointer<ByteVar>())

public actual fun getlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyGetlastlogx(fname.rawAddress.toCPointer<ByteVar>(), uid, ll.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun updlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyUpdlastlogx(fname.rawAddress.toCPointer<ByteVar>(), uid, ll.rawAddress.toCPointer<ByteVar>())

public actual fun getutxuser(name: ConstPtr): Utmpx =
    Utmpx()

public actual fun utmpxname(file: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflySysCheckpoint(tpe, fd, pid, retval)

public actual fun umtxSleep(ptr: ConstPtr, value: CInt, timeout: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyUmtxSleep(ptr.rawAddress.toCPointer<ByteVar>(), value, timeout)

public actual fun umtxWakeup(ptr: ConstPtr, count: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyUmtxWakeup(ptr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: MutPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyGetmntinfo(mntbufp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getmntvinfo(mntbufp: MutPtr, mntvbufp: MutPtr, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyGetmntvinfo(mntbufp.rawAddress.toCPointer<ByteVar>(), mntvbufp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun closefrom(lowfd: CInt): CInt =
    libcUnixBsdFreebsdlikeDragonflyClosefrom(lowfd)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    libcUnixBsdFreebsdlikeDragonflyAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDragonflyLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun reallocf(ptr: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyReallocf(ptr.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun freezero(ptr: MutPtr, size: SizeT) {
    libcUnixBsdFreebsdlikeDragonflyFreezero(ptr.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun kvmVmMapEntryFirst(kvm: MutPtr, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryFirst(kvm.rawAddress.toCPointer<ByteVar>(), map.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun kvmVmMapEntryNext(kvm: MutPtr, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    MutPtr(libcUnixBsdFreebsdlikeDragonflyKvmVmMapEntryNext(kvm.rawAddress.toCPointer<ByteVar>(), map.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)
