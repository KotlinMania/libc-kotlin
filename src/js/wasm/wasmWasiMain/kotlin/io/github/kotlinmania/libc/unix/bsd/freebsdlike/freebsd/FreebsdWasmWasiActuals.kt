@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun fhlink(fhp: MutPtr, to: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFhlink")

public actual fun fhlinkat(fhp: MutPtr, tofd: CInt, to: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFhlinkat")

public actual fun fhreadlink(fhp: MutPtr, buf: MutPtr, bufsize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFhreadlink")

public actual fun getfhat(fd: CInt, path: MutPtr, fhp: MutPtr, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdGetfhat")

public actual fun error(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdError")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioCancel")

public actual fun aioError(aiocbp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioError")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioFsync")

public actual fun aioRead(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioRead")

public actual fun aioReadv(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioReadv")

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioReturn")

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioSuspend")

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioWrite")

public actual fun aioWritev(aiocbp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioWritev")

public actual fun copyFileRange(infd: CInt, inoffp: MutPtr, outfd: CInt, outoffp: MutPtr, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCopyFileRange")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr, len: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdDevnameR")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd")

public actual fun extattrDeleteFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile")

public actual fun extattrDeleteLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrGetFd")

public actual fun extattrGetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrGetFile")

public actual fun extattrGetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrGetLink")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrListFd")

public actual fun extattrListFile(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrListFile")

public actual fun extattrListLink(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrListLink")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrSetFd")

public actual fun extattrSetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrSetFile")

public actual fun extattrSetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrSetLink")

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: ConstPtr, flags: CInt, rmsr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFspacectl")

public actual fun jail(jail: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdJail")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdJailAttach")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdJailAttach(jid: Int): Int

public actual fun jailAttach(jid: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdJailAttach(jid)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdJailRemove")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdJailRemove(jid: Int): Int

public actual fun jailRemove(jid: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdJailRemove(jid)

public actual fun jailGet(iov: MutPtr, niov: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdJailGet")

public actual fun jailSet(iov: MutPtr, niov: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdJailSet")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdLioListio")

public actual fun getutxuser(user: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdGetutxuser")

public actual fun setutxdb(type: CInt, file: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSetutxdb")

public actual fun aioWaitcomplete(iocbp: MutPtr, timeout: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete")

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMqGetfdNp")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdWaitid")

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPtsnameR")

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFtok")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdShmget")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdShmget(key: Long, size: Long, shmflg: Int): Int

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdShmget(key, size.toLong(), shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdShmat")

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdShmdt")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdShmctl")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdSemget")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdSemget(key: Long, nsems: Int, semflg: Int): Int

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdSemget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSemctl")

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSemop")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMsgctl")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdMsgget")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdMsgget(key: Long, msgflg: Int): Int

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdMsgget(key, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMsgsnd")

public actual fun cfmakesane(termios: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCfmakesane")

public actual fun pdfork(fdp: MutPtr, flags: CInt): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPdfork")

public actual fun pdgetpid(fd: CInt, pidp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPdgetpid")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdPdkill")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdPdkill(fd: Int, signum: Int): Int

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdPdkill(fd, signum)

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdRtprioThread")

public actual fun uuidgen(store: MutPtr, count: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdUuidgen")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdThrKill")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdThrKill(id: Long, sig: Int): Int

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdThrKill(id, sig)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdThrKill2")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdThrKill2(pid: Int, id: Long, sig: Int): Int

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdThrKill2(pid, id, sig)

public actual fun thrSelf(tid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdThrSelf")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp(): Int

public actual fun pthreadGetthreadidNp(): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp()

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp")

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp")

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity")

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdSchedGetcpu")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdSchedGetcpu(): Int

public actual fun schedGetcpu(): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdSchedGetcpu()

public actual fun pthreadMutexConsistent(mutex: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent")

public actual fun pthreadMutexattrGetrobust(attr: MutPtr, robust: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robust: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust")

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit")

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy")

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock")

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock")

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp")

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdStatfs")

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFstatfs")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdDup3")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdDup3(src: Int, dst: Int, flags: Int): Int

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdDup3(src, dst, flags)

public actual fun xuname(nmln: CInt, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdXuname")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSendmmsg")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: SizeT, flags: CInt, timeout: ConstPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdRecvmmsg")

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemmem")

public actual fun fhopen(fhp: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFhopen")

public actual fun fhstat(fhp: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFhstat")

public actual fun fhstatfs(fhp: ConstPtr, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFhstatfs")

public actual fun getfh(path: ConstPtr, fhp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdGetfh")

public actual fun lgetfh(path: ConstPtr, fhp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdLgetfh")

public actual fun getfsstat(buf: MutPtr, bufsize: CLong, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdGetfsstat")

public actual fun getmntinfo(mntbufp: MutPtr, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdGetmntinfo")

public actual fun mount(type: ConstPtr, dir: ConstPtr, flags: CInt, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMount")

public actual fun nmount(iov: MutPtr, niov: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdNmount")

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSetproctitle")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdRfork")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdRfork(flags: Int): Int

public actual fun rfork(flags: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdRfork(flags)

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity")

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity")

public actual fun cpuset(setid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCpuset")

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCpusetGetid")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdCpusetSetid")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdCpusetSetid(which: Int, id: Long, setid: Int): Int

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdCpusetSetid(which, id, setid)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdCapEnter")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdCapEnter(): Int

public actual fun capEnter(): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdCapEnter()

public actual fun capGetmode(modep: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapGetmode")

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd: Int, fcntlrights: Int): Int

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd, fcntlrights.toInt())

public actual fun capIoctlsGet(fd: CInt, cmds: MutPtr, maxcmds: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet")

public actual fun capIoctlsLimit(fd: CInt, cmds: ConstPtr, ncmds: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit")

public actual fun capRightsInit(version: CInt, rights: MutPtr, vararg variadicArgs: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsInit")

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsGet")

public actual fun capRightsSet(rights: MutPtr, vararg variadicArgs: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsSet")

public actual fun capRightsClear(rights: MutPtr, vararg variadicArgs: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsClear")

public actual fun capRightsIsSet(rights: ConstPtr, vararg variadicArgs: Long): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet")

public actual fun capRightsIsValid(rights: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid")

public actual fun capRightsLimit(fd: CInt, rights: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsLimit")

public actual fun capRightsMerge(dst: MutPtr, src: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsMerge")

public actual fun capRightsRemove(dst: MutPtr, src: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsRemove")

public actual fun capRightsContains(big: ConstPtr, little: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdCapRightsContains")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdCapSandboxed")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdCapSandboxed(): Int

public actual fun capSandboxed(): Boolean =
    (wasiLibcUnixBsdFreebsdlikeFreebsdCapSandboxed() != 0)

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdReallocarray")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdFfs")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdFfs(value: Int): Int

public actual fun ffs(value: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdFfs(value)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdFfsl")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdFfsl(value: Long): Int

public actual fun ffsl(value: CLong): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdFfsl(value)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdFfsll")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdFfsll(value: Long): Int

public actual fun ffsll(value: CLonglong): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdFfsll(value)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdFls")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdFls(value: Int): Int

public actual fun fls(value: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdFls(value)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdFlsl")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdFlsl(value: Long): Int

public actual fun flsl(value: CLong): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdFlsl(value)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdFlsll")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdFlsll(value: Long): Int

public actual fun flsll(value: CLonglong): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdFlsll(value)

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: MutPtr, opt: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint")

public actual fun mallctl(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMallctl")

public actual fun mallctlnametomib(name: ConstPtr, mibp: MutPtr, miplen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMallctlnametomib")

public actual fun mallctlbymib(mib: ConstPtr, mible: SizeT, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMallctlbymib")

public actual fun mallocx(size: SizeT, flags: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMallocx")

public actual fun rallocx(ptr: MutPtr, size: SizeT, flags: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdRallocx")

public actual fun xallocx(ptr: MutPtr, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdXallocx")

public actual fun sallocx(ptr: ConstPtr, flags: CInt): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSallocx")

public actual fun dallocx(ptr: MutPtr, flags: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdDallocx")

public actual fun sdallocx(ptr: MutPtr, size: SizeT, flags: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSdallocx")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdNallocx")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdNallocx(size: Long, flags: Int): Long

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    wasiLibcUnixBsdFreebsdlikeFreebsdNallocx(size.toLong(), flags).toULong()

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcctl")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdGetpagesize")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdGetpagesize(): Int

public actual fun getpagesize(): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdGetpagesize()

public actual fun getpagesizes(pagesize: MutPtr, nelem: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdGetpagesizes")

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2")

public actual fun strchrnul(s: ConstPtr, c: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdStrchrnul")

public actual fun shmCreateLargepage(path: ConstPtr, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage")

public actual fun shmRename(pathFrom: ConstPtr, pathTo: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdShmRename")

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemfdCreate")

public actual fun setaudit(auditinfo: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSetaudit")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdEventfd")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdEventfd(initval: Int, flags: Int): Int

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdEventfd(initval.toInt(), flags)

public actual fun eventfdRead(fd: CInt, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdEventfdRead")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdEventfdWrite")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd: Int, value: Long): Int

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd, value.toLong())

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdFdatasync")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdFdatasync(fd: Int): Int

public actual fun fdatasync(fd: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdFdatasync(fd)

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr, buflen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdElfAuxInfo")

public actual fun setproctitleFast(fmt: ConstPtr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSetproctitleFast")

public actual fun timingsafeBcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp")

public actual fun timingsafeMemcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp")

public actual fun umtxOp(obj: MutPtr, op: CInt, value: CUlong, uaddr: MutPtr, uaddr2: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdUmtxOp")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdSctpPeeloff")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s: Int, id: Int): Int

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s, id.toInt())

public actual fun sctpBindx(s: CInt, addrs: MutPtr, num: CInt, tpe: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSctpBindx")

public actual fun sctpConnectx(s: CInt, addrs: ConstPtr, addrcnt: CInt, id: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSctpConnectx")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family: Int): Int

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family.toInt())

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs")

public actual fun sctpFreepaddrs(addrs: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs")

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs")

public actual fun sctpFreeladdrs(addrs: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs")

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: MutPtr, size: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSctpOptInfo")

public actual fun sctpSendv(sd: CInt, iov: ConstPtr, iovcnt: CInt, addrs: MutPtr, addrcnt: CInt, info: MutPtr, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSctpSendv")

public actual fun sctpRecvv(sd: CInt, iov: ConstPtr, iovcnt: CInt, from: MutPtr, fromlen: MutPtr, info: MutPtr, infolen: MutPtr, infotype: MutPtr, flags: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdSctpRecvv")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdTimerfdCreate")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid: Int, flags: Int): Int

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdTimerfdGettime")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdTimerfdSettime")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdClosefrom")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdClosefrom(lowfd: Int): Unit

public actual fun closefrom(lowfd: CInt): Unit =
    wasiLibcUnixBsdFreebsdlikeFreebsdClosefrom(lowfd)

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdCloseRange")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdCloseRange(lowfd: Int, highfd: Int, flags: Int): Int

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdCloseRange(lowfd.toInt(), highfd.toInt(), flags)

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExecvpe")

@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdKcmp")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdKcmp(pid1: Int, pid2: Int, type: Int, idx1: Long, idx2: Long): Int

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    wasiLibcUnixBsdFreebsdlikeFreebsdKcmp(pid1, pid2, type, idx1.toLong(), idx2.toLong())

public actual fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdDlvsym")

public actual fun memstatStrerror(error: CInt): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemstatStrerror")

public actual fun memstatMtlAlloc(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc")

public actual fun memstatMtlFirst(list: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst")

public actual fun memstatMtlNext(mtp: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext")

public actual fun memstatMtlFind(list: MutPtr, allocator: CInt, name: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind")

public actual fun memstatMtlFree(list: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree")

public actual fun memstatMtlGeterror(list: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror")

public actual fun memstatGetName(mtp: ConstPtr): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdMemstatGetName")

public actual fun kvmDpcpuSetcpu(kd: MutPtr, cpu: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu")

public actual fun kvmGetargv(kd: MutPtr, p: ConstPtr, nchr: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmGetargv")

public actual fun kvmGetcptime(kd: MutPtr, cpTime: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmGetcptime")

public actual fun kvmGetenvv(kd: MutPtr, p: ConstPtr, nchr: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmGetenvv")

public actual fun kvmGeterr(kd: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmGeterr")

public actual fun kvmGetmaxcpu(kd: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu")

public actual fun kvmGetncpus(kd: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmGetncpus")

public actual fun kvmGetpcpu(kd: MutPtr, cpu: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu")

public actual fun kvmCounterU64Fetch(kd: MutPtr, base: CUlong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch")

public actual fun kvmGetswapinfo(kd: MutPtr, info: MutPtr, maxswap: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo")

public actual fun kvmNative(kd: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmNative")

public actual fun kvmNlist(kd: MutPtr, nl: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmNlist")

public actual fun kvmNlist2(kd: MutPtr, nl: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmNlist2")

public actual fun kvmReadZpcpu(kd: MutPtr, base: CUlong, buf: MutPtr, size: SizeT, cpu: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu")

public actual fun kvmRead2(kd: MutPtr, addr: KvaddrT, buf: MutPtr, nbytes: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKvmRead2")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString")

public actual fun extattrStringToNamespace(string: ConstPtr, attrnamespace: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace")

public actual fun realhostname(host: MutPtr, hsize: SizeT, ip: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdRealhostname")

public actual fun realhostnameSa(host: MutPtr, hsize: SizeT, addr: MutPtr, addrlen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdRealhostnameSa")

public actual fun kldIsloaded(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKldIsloaded")

public actual fun kldLoad(name: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKldLoad")

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap")

public actual fun hexdump(ptr: ConstPtr, length: CInt, hdr: ConstPtr, flags: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdHexdump")

public actual fun humanizeNumber(buf: MutPtr, len: SizeT, number: Long, suffix: ConstPtr, scale: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdHumanizeNumber")

public actual fun flopen(path: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFlopen")

public actual fun flopenat(fd: CInt, path: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFlopenat")

public actual fun getlocalbase(): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdGetlocalbase")

public actual fun pidfileOpen(path: ConstPtr, mode: ModeT, pidptr: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPidfileOpen")

public actual fun pidfileWrite(path: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPidfileWrite")

public actual fun pidfileClose(path: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPidfileClose")

public actual fun pidfileRemove(path: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPidfileRemove")

public actual fun pidfileFileno(path: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdPidfileFileno")

public actual fun procstatOpenSysctl(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl")

public actual fun procstatGetfiles(procstat: MutPtr, kp: MutPtr, mmapped: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles")

public actual fun procstatFreefiles(procstat: MutPtr, head: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles")

public actual fun procstatGetprocs(procstat: MutPtr, what: CInt, arg: CInt, count: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs")

public actual fun procstatFreeprocs(procstat: MutPtr, p: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs")

public actual fun procstatGetvmmap(procstat: MutPtr, kp: MutPtr, count: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap")

public actual fun procstatFreevmmap(procstat: MutPtr, vmmap: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap")

public actual fun procstatClose(procstat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatClose")

public actual fun procstatFreeargv(procstat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv")

public actual fun procstatFreeenvv(procstat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv")

public actual fun procstatFreegroups(procstat: MutPtr, groups: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups")

public actual fun procstatFreeptlwpinfo(procstat: MutPtr, pl: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo")

public actual fun procstatGetargv(procstat: MutPtr, kp: MutPtr, nchr: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetargv")

public actual fun procstatGetenvv(procstat: MutPtr, kp: MutPtr, nchr: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv")

public actual fun procstatGetgroups(procstat: MutPtr, kp: MutPtr, count: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups")

public actual fun procstatGetosrel(procstat: MutPtr, kp: MutPtr, osrelp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel")

public actual fun procstatGetpathname(procstat: MutPtr, kp: MutPtr, pathname: MutPtr, maxlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname")

public actual fun procstatGetrlimit(procstat: MutPtr, kp: MutPtr, which: CInt, rlimit: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit")

public actual fun procstatGetumask(procstat: MutPtr, kp: MutPtr, maskp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetumask")

public actual fun procstatOpenCore(filename: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore")

public actual fun procstatOpenKvm(nlistf: ConstPtr, memf: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm")

public actual fun procstatGetSocketInfo(proc: MutPtr, fst: MutPtr, sock: MutPtr, errbuf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo")

public actual fun procstatGetVnodeInfo(proc: MutPtr, fst: MutPtr, vn: MutPtr, errbuf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo")

public actual fun procstatGetPtsInfo(proc: MutPtr, fst: MutPtr, pts: MutPtr, errbuf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo")

public actual fun procstatGetShmInfo(proc: MutPtr, fst: MutPtr, shm: MutPtr, errbuf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo")

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr, timerid: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdTimerCreate")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdTimerDelete")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun")

public actual fun timerGettime(timerid: TimerT, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdTimerGettime")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr, ovalue: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdTimerSettime")

public actual fun devstatGetnumdevs(kd: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs")

public actual fun devstatGetgeneration(kd: MutPtr): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration")

public actual fun devstatGetversion(kd: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdDevstatGetversion")

public actual fun devstatCheckversion(kd: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion")

public actual fun devstatSelectdevs(devSelect: MutPtr, numSelected: MutPtr, numSelections: MutPtr, selectGeneration: MutPtr, currentGeneration: CLong, devices: MutPtr, numdevs: CInt, matches: MutPtr, numMatches: CInt, devSelections: MutPtr, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdDevstatSelectdevs")

public actual fun devstatBuildmatch(matchStr: MutPtr, matches: MutPtr, numMatches: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch")
