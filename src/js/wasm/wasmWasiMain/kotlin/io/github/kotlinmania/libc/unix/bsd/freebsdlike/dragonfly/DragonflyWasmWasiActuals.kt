@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT

public actual fun errnoLocation(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setgrent(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setutxdb(type: CUint, file: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freelocale(loc: LocaleT): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uname(buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getutxuser(name: String?): Utmpx =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun umtxSleep(ptr: COpaquePointer?, value: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun umtxWakeup(ptr: COpaquePointer?, count: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closefrom(lowfd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freezero(ptr: COpaquePointer?, size: SizeT): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmVmMapEntryFirst(kvm: COpaquePointer?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kvmVmMapEntryNext(kvm: COpaquePointer?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
