@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lcong48(p: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reboot(howTo: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setfsgid(gid: GidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setfsuid(uid: UidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vhangup(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sync(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syncfs(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unshare(flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun umount(target: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun swapoff(path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun personality(persona: CUlong): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun umount2(target: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun inotifyInit(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun inotifyInit1(flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmpfile64(): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
