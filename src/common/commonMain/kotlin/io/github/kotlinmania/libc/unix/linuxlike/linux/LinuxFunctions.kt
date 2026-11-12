package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.SockFilter
import io.github.kotlinmania.libc.unix.linuxlike.SockaddrUn
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.strlen
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: MutPtr): CInt
}

public fun issecureMask(x: CInt): CInt = 1 shl x

public fun futexOp(op: CInt, oparg: CInt, cmp: CInt, cmparg: CInt): CInt = ((op and 0xf) shl 28) or ((cmp and 0xf) shl 24) or ((oparg and 0xfff) shl 12) or (cmparg and 0xfff)

// linux/cnProc.h
// These functions are not available on OpenHarmony
// LFS64 extensions
//
// * musl has 64-bit versions only so aliases the LFS64 symbols to the standard ones
public fun sctpPrIndex(policy: CInt): CInt = policy shr (4 - 1).toInt()

public fun sctpPrPolicy(policy: CInt): CInt = policy and SCTP_PR_SCTP_MASK

public fun sctpPrSetPolicy(flags: CInt, policy: CInt) {
    var flags1 = flags
    flags1 = flags1 and SCTP_PR_SCTP_MASK.inv()
    flags1 = flags1 or policy
}

public fun soEeOffender(ee: ConstPtr): MutPtr = MutPtr(ConstPtr((ee).rawAddress + ((1).toLong() * (SockExtendedErr.typeLayout()).strideBytes)).rawAddress, ConstPtr((ee).rawAddress + ((1).toLong() * (SockExtendedErr.typeLayout()).strideBytes)).rawMeta)

public fun tpacketAlign(x: Int): Int = (x + TPACKET_ALIGNMENT - 1) and (TPACKET_ALIGNMENT - 1).inv()

public fun bpfClass(code: U32): U32 = code and 0x07u

public fun bpfSize(code: U32): U32 = code and 0x18u

public fun bpfMode(code: U32): U32 = code and 0xe0u

public fun bpfOp(code: U32): U32 = code and 0xf0u

public fun bpfSrc(code: U32): U32 = code and 0x08u

public fun bpfRval(code: U32): U32 = code and 0x18u

public fun bpfMiscop(code: U32): U32 = code and 0xf8u

public fun bpfStmt(code: U16, k: U32): SockFilter = SockFilter(code = code, jt = 0u, jf = 0u, k = k)

public fun bpfJump(code: U16, k: U32, jt: U8, jf: U8): SockFilter = SockFilter(code = code, jt = jt, jf = jf, k = k)

public fun sunLen(s: SockaddrUn): Int {
    val buf =
        io.github.kotlinmania.rustlang.core.mem
            .AddressableArrayLocal(s.sunPath.toList(), io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8)
    val len = strlen(ConstPtr(buf.rawAddress)).toInt()
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(buf.rawAddress, maxOf(1L, buf.layout.sizeBytes), 1L)
    return 2 + len
}

public fun sctpPrTtlEnabled(policy: CInt): Boolean = policy == SCTP_PR_SCTP_TTL

public fun sctpPrRtxEnabled(policy: CInt): Boolean = policy == SCTP_PR_SCTP_RTX

public fun sctpPrPrioEnabled(policy: CInt): Boolean = policy == SCTP_PR_SCTP_PRIO

// Only `getspnamR` is implemented for musl, out of all of the reenterant
// functions from `shadow.h`.
// https://git.musl-libc.org/cgit/musl/tree/include/shadow.h
public expect fun getspnamR(name: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt

public expect fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: ConstPtr): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt

public expect fun mrand48(): CLong

public expect fun seed48(xseed: MutPtr): MutPtr

public expect fun lcong48(p: MutPtr)

public expect fun lutimes(file: ConstPtr, times: ConstPtr): CInt

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

// System V IPC
public expect fun ftok(pathname: ConstPtr, projId: CInt): KeyT

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT

public expect fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT

public expect fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT

public expect fun removexattr(path: ConstPtr, name: ConstPtr): CInt

public expect fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt

public expect fun fremovexattr(filedes: CInt, name: ConstPtr): CInt

public expect fun signalfd(fd: CInt, mask: ConstPtr, flags: CInt): CInt

public expect fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun quotactl(cmd: CInt, special: ConstPtr, id: CInt, data: MutPtr): CInt

public expect fun epollPwait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt, sigmask: ConstPtr): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt

public expect fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

// Not available now on Android
public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun remapFilePages(addr: MutPtr, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt

public expect fun mkstemps(template: MutPtr, suffixlen: CInt): CInt

public expect fun vhangup(): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun syscall(num: CLong, vararg variadicArgs: Long): CLong

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt

public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt

public expect fun unshare(flags: CInt): CInt

public expect fun umount(target: ConstPtr): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT

public expect fun splice(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: MutPtr): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun setns(fd: CInt, nstype: CInt): CInt

public expect fun swapoff(path: ConstPtr): CInt

public expect fun vmsplice(fd: CInt, iov: ConstPtr, nrSegs: SizeT, flags: CUint): SsizeT

public expect fun personality(persona: CUlong): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun clone(cb: CloneCbCallback, childStack: MutPtr, flags: CInt, arg: MutPtr, vararg variadicArgs: Long): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun umount2(target: ConstPtr, flags: CInt): CInt

public expect fun swapon(path: ConstPtr, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnattrInit(attr: MutPtr): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt

public expect fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun inotifyRmWatch(fd: CInt, wd: CInt): CInt

public expect fun inotifyInit(): CInt

public expect fun inotifyInit1(flags: CInt): CInt

public expect fun inotifyAddWatch(fd: CInt, path: ConstPtr, mask: UInt): CInt

public expect fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt

public expect fun gethostid(): CLong

public expect fun klogctl(syslogType: CInt, bufp: MutPtr, len: CInt): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun fgetpos64(stream: MutPtr, ptr: MutPtr): CInt

public expect fun fopen64(filename: ConstPtr, mode: ConstPtr): MutPtr

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT

public expect fun tmpfile64(): MutPtr
