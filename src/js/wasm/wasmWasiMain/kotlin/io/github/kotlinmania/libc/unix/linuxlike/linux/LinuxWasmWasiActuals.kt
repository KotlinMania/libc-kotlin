@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.Fpos64T
import io.github.kotlinmania.libc.unix.linuxlike.Itimerspec
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sembuf
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Spwd
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.MsqidDs
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SiginfoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.StackT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun getspnamR(name: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGetspnamR")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMqOpen")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMqClose")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMqUnlink")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMqReceive")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMqTimedreceive")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMqSend")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMqTimedsend")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMqGetattr")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMqSetattr")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMrand48")
private external fun wasiLibcUnixLinuxlikeLinuxMrand48(): Long

public actual fun mrand48(): CLong =
    wasiLibcUnixLinuxlikeLinuxMrand48().toLong()

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSeed48")

public actual fun lcong48(p: MutPtr<CUshort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxLcong48")

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxLutimes")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxShmOpen")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxShmUnlink")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxFtok")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxSemget")
private external fun wasiLibcUnixLinuxlikeLinuxSemget(key: Int, nsems: Int, semflag: Int): Int

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxSemget(key, nsems, semflag).toInt()

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSemop")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSemctl")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMsgctl")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxMsgget")
private external fun wasiLibcUnixLinuxlikeLinuxMsgget(key: Int, msgflg: Int): Int

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxMsgget(key, msgflg).toInt()

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMsgrcv")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMsgsnd")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxFallocate")
private external fun wasiLibcUnixLinuxlikeLinuxFallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcUnixLinuxlikeLinuxFallocate(fd, mode, offset, len).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxPosixFallocate")
private external fun wasiLibcUnixLinuxlikeLinuxPosixFallocate(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcUnixLinuxlikeLinuxPosixFallocate(fd, offset, len).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxReadahead")
private external fun wasiLibcUnixLinuxlikeLinuxReadahead(fd: Int, offset: Long, count: Long): Long

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    wasiLibcUnixLinuxlikeLinuxReadahead(fd, offset, count.toLong()).toLong()

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGetxattr")

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxLgetxattr")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxFgetxattr")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSetxattr")

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxLsetxattr")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxFsetxattr")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxListxattr")

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxLlistxattr")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxFlistxattr")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxRemovexattr")

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxLremovexattr")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxFremovexattr")

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSignalfd")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxTimerfdCreate")
private external fun wasiLibcUnixLinuxlikeLinuxTimerfdCreate(clockid: Int, flags: Int): Int

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxTimerfdCreate(clockid, flags).toInt()

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxTimerfdGettime")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxTimerfdSettime")

public actual fun quotactl(cmd: CInt, special: ConstPtr<CChar>, id: CInt, data: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxQuotactl")

public actual fun epollPwait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt, sigmask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxEpollPwait")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxDup3")
private external fun wasiLibcUnixLinuxlikeLinuxDup3(oldfd: Int, newfd: Int, flags: Int): Int

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxDup3(oldfd, newfd, flags).toInt()

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSigtimedwait")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSigwaitinfo")

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxAccept4")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxReboot")
private external fun wasiLibcUnixLinuxlikeLinuxReboot(howTo: Int): Int

public actual fun reboot(howTo: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxReboot(howTo).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxSetfsgid")
private external fun wasiLibcUnixLinuxlikeLinuxSetfsgid(gid: Int): Int

public actual fun setfsgid(gid: GidT): CInt =
    wasiLibcUnixLinuxlikeLinuxSetfsgid(gid.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxSetfsuid")
private external fun wasiLibcUnixLinuxlikeLinuxSetfsuid(uid: Int): Int

public actual fun setfsuid(uid: UidT): CInt =
    wasiLibcUnixLinuxlikeLinuxSetfsuid(uid.toInt()).toInt()

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMkfifoat")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxSyncFileRange")
private external fun wasiLibcUnixLinuxlikeLinuxSyncFileRange(fd: Int, offset: Long, nbytes: Long, flags: Int): Int

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    wasiLibcUnixLinuxlikeLinuxSyncFileRange(fd, offset, nbytes, flags.toInt()).toInt()

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixMadvise")

public actual fun remapFilePages(addr: MutPtr<CVoid>, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxRemapFilePages")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxMkstemps")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxVhangup")
private external fun wasiLibcUnixLinuxlikeLinuxVhangup(): Int

public actual fun vhangup(): CInt =
    wasiLibcUnixLinuxlikeLinuxVhangup().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxSync")
private external fun wasiLibcUnixLinuxlikeLinuxSync(): Unit

public actual fun sync(): Unit =
    wasiLibcUnixLinuxlikeLinuxSync()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxSyncfs")
private external fun wasiLibcUnixLinuxlikeLinuxSyncfs(fd: Int): Int

public actual fun syncfs(fd: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxSyncfs(fd).toInt()

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSyscall")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSchedSetaffinity")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxEpollCreate")
private external fun wasiLibcUnixLinuxlikeLinuxEpollCreate(size: Int): Int

public actual fun epollCreate(size: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxEpollCreate(size).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxEpollCreate1")
private external fun wasiLibcUnixLinuxlikeLinuxEpollCreate1(flags: Int): Int

public actual fun epollCreate1(flags: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxEpollCreate1(flags).toInt()

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxEpollWait")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxEpollCtl")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxUnshare")
private external fun wasiLibcUnixLinuxlikeLinuxUnshare(flags: Int): Int

public actual fun unshare(flags: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxUnshare(flags).toInt()

public actual fun umount(target: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUmount")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxTee")
private external fun wasiLibcUnixLinuxlikeLinuxTee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    wasiLibcUnixLinuxlikeLinuxTee(fdIn, fdOut, len.toLong(), flags.toInt()).toLong()

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSplice")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxEventfd")
private external fun wasiLibcUnixLinuxlikeLinuxEventfd(initval: Int, flags: Int): Int

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxEventfd(initval.toInt(), flags).toInt()

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxEventfdRead")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxEventfdWrite")
private external fun wasiLibcUnixLinuxlikeLinuxEventfdWrite(fd: Int, value: Long): Int

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    wasiLibcUnixLinuxlikeLinuxEventfdWrite(fd, value.toLong()).toInt()

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSchedRrGetInterval")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSchedSetparam")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxSetns")
private external fun wasiLibcUnixLinuxlikeLinuxSetns(fd: Int, nstype: Int): Int

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxSetns(fd, nstype).toInt()

public actual fun swapoff(path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSwapoff")

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxVmsplice")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxPersonality")
private external fun wasiLibcUnixLinuxlikeLinuxPersonality(persona: Long): Int

public actual fun personality(persona: CUlong): CInt =
    wasiLibcUnixLinuxlikeLinuxPersonality(persona.toLong()).toInt()

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSchedGetparam")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxClone")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxSchedGetscheduler")
private external fun wasiLibcUnixLinuxlikeLinuxSchedGetscheduler(pid: Int): Int

public actual fun schedGetscheduler(pid: PidT): CInt =
    wasiLibcUnixLinuxlikeLinuxSchedGetscheduler(pid).toInt()

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxClockNanosleep")

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUmount2")

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSwapon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSchedSetscheduler")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSendfile")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSigaltstack")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGetdtablesize")
private external fun wasiLibcUnixLinuxlikeLinuxGetdtablesize(): Int

public actual fun getdtablesize(): CInt =
    wasiLibcUnixLinuxlikeLinuxGetdtablesize().toInt()

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGetgrouplist")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawn")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnp")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrInit")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrDestroy")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrGetflags")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrSetflags")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnFileActionsInit")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2")

public actual fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxFreadUnlocked")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxInotifyRmWatch")
private external fun wasiLibcUnixLinuxlikeLinuxInotifyRmWatch(fd: Int, wd: Int): Int

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxInotifyRmWatch(fd, wd).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxInotifyInit")
private external fun wasiLibcUnixLinuxlikeLinuxInotifyInit(): Int

public actual fun inotifyInit(): CInt =
    wasiLibcUnixLinuxlikeLinuxInotifyInit().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxInotifyInit1")
private external fun wasiLibcUnixLinuxlikeLinuxInotifyInit1(flags: Int): Int

public actual fun inotifyInit1(flags: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxInotifyInit1(flags).toInt()

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxInotifyAddWatch")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxFanotifyInit")
private external fun wasiLibcUnixLinuxlikeLinuxFanotifyInit(flags: Int, eventFFlags: Int): Int

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    wasiLibcUnixLinuxlikeLinuxFanotifyInit(flags.toInt(), eventFFlags.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGethostid")
private external fun wasiLibcUnixLinuxlikeLinuxGethostid(): Long

public actual fun gethostid(): CLong =
    wasiLibcUnixLinuxlikeLinuxGethostid().toLong()

public actual fun klogctl(syslogType: CInt, bufp: MutPtr<CChar>, len: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxKlogctl")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxFallocate64")
private external fun wasiLibcUnixLinuxlikeLinuxFallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    wasiLibcUnixLinuxlikeLinuxFallocate64(fd, mode, offset, len).toInt()

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxFgetpos64")

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxFopen64")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxPosixFallocate64")
private external fun wasiLibcUnixLinuxlikeLinuxPosixFallocate64(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    wasiLibcUnixLinuxlikeLinuxPosixFallocate64(fd, offset, len).toInt()

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxSendfile64")

public actual fun tmpfile64(): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxTmpfile64")
