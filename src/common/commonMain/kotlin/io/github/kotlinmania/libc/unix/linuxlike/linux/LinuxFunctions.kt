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
import io.github.kotlinmania.libc.unix.linuxlike.SockFilter
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.SockaddrUn
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.strlen

public fun interface CloneCbCallback {
    public operator fun invoke(arg0: COpaquePointer?): CInt
}

public fun issecureMask(x: CInt): CInt {
    return 1 shl x
}

public fun futexOp(op: CInt, oparg: CInt, cmp: CInt, cmparg: CInt): CInt {
    return ((op and 0xf) shl 28) or ((cmp and 0xf) shl 24) or ((oparg and 0xfff) shl 12) or (cmparg and 0xfff)
}

// linux/cnProc.h
// These functions are not available on OpenHarmony
// LFS64 extensions
//
// * musl has 64-bit versions only so aliases the LFS64 symbols to the standard ones
public fun sctpPrIndex(policy: CInt): CInt {
    return policy shr (4 - 1).toInt()
}

public fun sctpPrPolicy(policy: CInt): CInt {
    return policy and SCTP_PR_SCTP_MASK
}

public fun sctpPrSetPolicy(flags: CInt, policy: CInt) {
    var flags = flags
    flags = flags and SCTP_PR_SCTP_MASK.inv()
    flags = flags or policy
}

public fun soEeOffender(ee: SockExtendedErr?): Sockaddr? {
    return null
}

public fun tpacketAlign(x: Int): Int {
    return (x + TPACKET_ALIGNMENT - 1) and (TPACKET_ALIGNMENT - 1).inv()
}

public fun bpfClass(code: U32): U32 {
    return code and 0x07u
}

public fun bpfSize(code: U32): U32 {
    return code and 0x18u
}

public fun bpfMode(code: U32): U32 {
    return code and 0xe0u
}

public fun bpfOp(code: U32): U32 {
    return code and 0xf0u
}

public fun bpfSrc(code: U32): U32 {
    return code and 0x08u
}

public fun bpfRval(code: U32): U32 {
    return code and 0x18u
}

public fun bpfMiscop(code: U32): U32 {
    return code and 0xf8u
}

public fun bpfStmt(code: U16, k: U32): SockFilter {
    return SockFilter(code = code, jt = 0u, jf = 0u, k = k)
}

public fun bpfJump(code: U16, k: U32, jt: U8, jf: U8): SockFilter {
    return SockFilter(code = code, jt = jt, jf = jf, k = k)
}

public fun sunLen(s: SockaddrUn): Int {
    return 0 + strlen(s.sunPath.asByteArray().decodeToString().substringBefore('\u0000')).toInt()
}

public fun sctpPrTtlEnabled(policy: CInt): Boolean {
    return policy == SCTP_PR_SCTP_TTL
}

public fun sctpPrRtxEnabled(policy: CInt): Boolean {
    return policy == SCTP_PR_SCTP_RTX
}

public fun sctpPrPrioEnabled(policy: CInt): Boolean {
    return policy == SCTP_PR_SCTP_PRIO
}

// Only `getspnamR` is implemented for musl, out of all of the reenterant
// functions from `shadow.h`.
// https://git.musl-libc.org/cgit/musl/tree/include/shadow.h
public expect fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt

public expect fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt

public expect fun mrand48(): CLong

public expect fun seed48(xseed: COpaquePointer?): COpaquePointer?

public expect fun lcong48(p: COpaquePointer?)

public expect fun lutimes(file: String?, times: COpaquePointer?): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

// System V IPC
public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt

public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT

public expect fun removexattr(path: String?, name: String?): CInt

public expect fun lremovexattr(path: String?, name: String?): CInt

public expect fun fremovexattr(filedes: CInt, name: String?): CInt

public expect fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt

public expect fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt

public expect fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun setfsgid(gid: GidT): CInt

public expect fun setfsuid(uid: UidT): CInt

// Not available now on Android
public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun vhangup(): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun syscall(num: CLong, vararg variadicArgs: Long): CLong

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt

public expect fun unshare(flags: CInt): CInt

public expect fun umount(target: String?): CInt

public expect fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT

public expect fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt

public expect fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun setns(fd: CInt, nstype: CInt): CInt

public expect fun swapoff(path: String?): CInt

public expect fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT

public expect fun personality(persona: CUlong): CInt

public expect fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun umount2(target: String?, flags: CInt): CInt

public expect fun swapon(path: String?, swapflags: CInt): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT

public expect fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt

public expect fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt

public expect fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun inotifyRmWatch(fd: CInt, wd: CInt): CInt

public expect fun inotifyInit(): CInt

public expect fun inotifyInit1(flags: CInt): CInt

public expect fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt

public expect fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt

public expect fun gethostid(): CLong

public expect fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt

public expect fun fopen64(filename: String?, mode: String?): FILE?

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT

public expect fun tmpfile64(): FILE?
