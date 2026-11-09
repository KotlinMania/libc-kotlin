@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun errnoLocation(): COpaquePointer? =
    null

public actual fun setgrent() {
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun setutxdb(type: CUint, file: COpaquePointer?): CInt =
    0

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer? =
    null

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    0

public actual fun freelocale(loc: LocaleT) {
}

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    0

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun uname(buf: COpaquePointer?): CInt =
    0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    null

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    0

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    0

public actual fun schedGetcpu(): CInt =
    0

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
}

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    0

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    null

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    0

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    0

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    0

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    null

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    0

public actual fun getutxuser(name: String?): Utmpx =
    Utmpx()

public actual fun utmpxname(file: String?): CInt =
    0

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    0

public actual fun umtxSleep(ptr: COpaquePointer?, value: CInt, timeout: CInt): CInt =
    0

public actual fun umtxWakeup(ptr: COpaquePointer?, count: CInt): CInt =
    0

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun closefrom(lowfd: CInt): CInt =
    0

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    0L

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    0

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    0

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun freezero(ptr: COpaquePointer?, size: SizeT) {
}

public actual fun kvmVmMapEntryFirst(kvm: COpaquePointer?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    null

public actual fun kvmVmMapEntryNext(kvm: COpaquePointer?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    null
