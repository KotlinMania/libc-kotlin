package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.linuxlike.Itimerspec
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.MsqidDs
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sembuf
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SiginfoT
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.SockaddrUn
import io.github.kotlinmania.libc.unix.linuxlike.Spwd
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.StackT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval

import io.github.kotlinmania.libc.*

public actual fun sctpPrIndex(policy: Int): Int =
    throw UnsupportedOperationException("sCTPPRINDEX not available on Android host — use androidNative target for FFI")

public actual fun sctpPrPolicy(policy: Int): Int =
    throw UnsupportedOperationException("sCTPPRPOLICY not available on Android host — use androidNative target for FFI")

public actual fun sctpPrSetPolicy(flags: Int?, policy: Int): Unit = throw UnsupportedOperationException("sCTPPRSETPOLICY not available on Android host — use androidNative target for FFI")

public actual fun soEeOffender(ee: SockExtendedErr?): Sockaddr? =
    throw UnsupportedOperationException("sOEEOFFENDER not available on Android host — use androidNative target for FFI")

public actual fun tpacketAlign(x: ULong): ULong =
    throw UnsupportedOperationException("tPACKETALIGN not available on Android host — use androidNative target for FFI")

public actual fun sunLen(s: SockaddrUn): ULong =
    throw UnsupportedOperationException("sUNLEN not available on Android host — use androidNative target for FFI")

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("getspnamR not available on Android host — use androidNative target for FFI")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen not available on Android host — use androidNative target for FFI")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose not available on Android host — use androidNative target for FFI")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink not available on Android host — use androidNative target for FFI")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive not available on Android host — use androidNative target for FFI")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive not available on Android host — use androidNative target for FFI")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend not available on Android host — use androidNative target for FFI")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend not available on Android host — use androidNative target for FFI")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr not available on Android host — use androidNative target for FFI")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr not available on Android host — use androidNative target for FFI")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 not available on Android host — use androidNative target for FFI")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 not available on Android host — use androidNative target for FFI")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 not available on Android host — use androidNative target for FFI")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes not available on Android host — use androidNative target for FFI")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen not available on Android host — use androidNative target for FFI")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on Android host — use androidNative target for FFI")

public actual fun semget(key: Int, nsems: Int, semflag: Int): Int =
    throw UnsupportedOperationException("semget not available on Android host — use androidNative target for FFI")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop not available on Android host — use androidNative target for FFI")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl not available on Android host — use androidNative target for FFI")

public actual fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int =
    throw UnsupportedOperationException("msgctl not available on Android host — use androidNative target for FFI")

public actual fun msgget(key: Int, msgflg: Int): Int =
    throw UnsupportedOperationException("msgget not available on Android host — use androidNative target for FFI")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Long =
    throw UnsupportedOperationException("msgrcv not available on Android host — use androidNative target for FFI")

public actual fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int =
    throw UnsupportedOperationException("msgsnd not available on Android host — use androidNative target for FFI")

public actual fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate not available on Android host — use androidNative target for FFI")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate not available on Android host — use androidNative target for FFI")

public actual fun readahead(fd: Int, offset: Long, count: ULong): Long =
    throw UnsupportedOperationException("readahead not available on Android host — use androidNative target for FFI")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("getxattr not available on Android host — use androidNative target for FFI")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("lgetxattr not available on Android host — use androidNative target for FFI")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("fgetxattr not available on Android host — use androidNative target for FFI")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("setxattr not available on Android host — use androidNative target for FFI")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("lsetxattr not available on Android host — use androidNative target for FFI")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr not available on Android host — use androidNative target for FFI")

public actual fun listxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("listxattr not available on Android host — use androidNative target for FFI")

public actual fun llistxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("llistxattr not available on Android host — use androidNative target for FFI")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("flistxattr not available on Android host — use androidNative target for FFI")

public actual fun removexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("removexattr not available on Android host — use androidNative target for FFI")

public actual fun lremovexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("lremovexattr not available on Android host — use androidNative target for FFI")

public actual fun fremovexattr(filedes: Int, name: String?): Int =
    throw UnsupportedOperationException("fremovexattr not available on Android host — use androidNative target for FFI")

public actual fun signalfd(fd: Int, mask: ULong?, flags: Int): Int =
    throw UnsupportedOperationException("signalfd not available on Android host — use androidNative target for FFI")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate not available on Android host — use androidNative target for FFI")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime not available on Android host — use androidNative target for FFI")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime not available on Android host — use androidNative target for FFI")

public actual fun quotactl(cmd: Int, special: String?, id: Int, data: String?): Int =
    throw UnsupportedOperationException("quotactl not available on Android host — use androidNative target for FFI")

public actual fun epollPwait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int, sigmask: ULong?): Int =
    throw UnsupportedOperationException("epollPwait not available on Android host — use androidNative target for FFI")

public actual fun dup3(oldfd: Int, newfd: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 not available on Android host — use androidNative target for FFI")

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait not available on Android host — use androidNative target for FFI")

public actual fun sigwaitinfo(set: ULong?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo not available on Android host — use androidNative target for FFI")

public actual fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 not available on Android host — use androidNative target for FFI")

public actual fun reboot(howTo: Int): Int =
    throw UnsupportedOperationException("reboot not available on Android host — use androidNative target for FFI")

public actual fun setfsgid(gid: UInt): Int =
    throw UnsupportedOperationException("setfsgid not available on Android host — use androidNative target for FFI")

public actual fun setfsuid(uid: UInt): Int =
    throw UnsupportedOperationException("setfsuid not available on Android host — use androidNative target for FFI")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat not available on Android host — use androidNative target for FFI")

public actual fun syncFileRange(fd: Int, offset: Long, nbytes: Long, flags: UInt): Int =
    throw UnsupportedOperationException("syncFileRange not available on Android host — use androidNative target for FFI")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise not available on Android host — use androidNative target for FFI")

public actual fun remapFilePages(addr: COpaquePointer?, size: ULong, prot: Int, pgoff: ULong, flags: Int): Int =
    throw UnsupportedOperationException("remapFilePages not available on Android host — use androidNative target for FFI")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps not available on Android host — use androidNative target for FFI")

public actual fun vhangup(): Int =
    throw UnsupportedOperationException("vhangup not available on Android host — use androidNative target for FFI")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on Android host — use androidNative target for FFI")

public actual fun syncfs(fd: Int): Int =
    throw UnsupportedOperationException("syncfs not available on Android host — use androidNative target for FFI")

public actual fun syscall(num: Long, vararg args: Any?): Long =
    throw UnsupportedOperationException("syscall not available on Android host — use androidNative target for FFI")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("schedSetaffinity not available on Android host — use androidNative target for FFI")

public actual fun epollCreate(size: Int): Int =
    throw UnsupportedOperationException("epollCreate not available on Android host — use androidNative target for FFI")

public actual fun epollCreate1(flags: Int): Int =
    throw UnsupportedOperationException("epollCreate1 not available on Android host — use androidNative target for FFI")

public actual fun epollWait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int): Int =
    throw UnsupportedOperationException("epollWait not available on Android host — use androidNative target for FFI")

public actual fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int =
    throw UnsupportedOperationException("epollCtl not available on Android host — use androidNative target for FFI")

public actual fun unshare(flags: Int): Int =
    throw UnsupportedOperationException("unshare not available on Android host — use androidNative target for FFI")

public actual fun umount(target: String?): Int =
    throw UnsupportedOperationException("umount not available on Android host — use androidNative target for FFI")

public actual fun tee(fdIn: Int, fdOut: Int, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("tee not available on Android host — use androidNative target for FFI")

public actual fun splice(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("splice not available on Android host — use androidNative target for FFI")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd not available on Android host — use androidNative target for FFI")

public actual fun eventfdRead(fd: Int, value: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead not available on Android host — use androidNative target for FFI")

public actual fun eventfdWrite(fd: Int, value: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite not available on Android host — use androidNative target for FFI")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval not available on Android host — use androidNative target for FFI")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam not available on Android host — use androidNative target for FFI")

public actual fun setns(fd: Int, nstype: Int): Int =
    throw UnsupportedOperationException("setns not available on Android host — use androidNative target for FFI")

public actual fun swapoff(path: String?): Int =
    throw UnsupportedOperationException("swapoff not available on Android host — use androidNative target for FFI")

public actual fun vmsplice(fd: Int, iov: Iovec?, nrSegs: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("vmsplice not available on Android host — use androidNative target for FFI")

public actual fun personality(persona: ULong): Int =
    throw UnsupportedOperationException("personality not available on Android host — use androidNative target for FFI")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam not available on Android host — use androidNative target for FFI")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler not available on Android host — use androidNative target for FFI")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep not available on Android host — use androidNative target for FFI")

public actual fun umount2(target: String?, flags: Int): Int =
    throw UnsupportedOperationException("umount2 not available on Android host — use androidNative target for FFI")

public actual fun swapon(path: String?, swapflags: Int): Int =
    throw UnsupportedOperationException("swapon not available on Android host — use androidNative target for FFI")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler not available on Android host — use androidNative target for FFI")

public actual fun sendfile(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long =
    throw UnsupportedOperationException("sendfile not available on Android host — use androidNative target for FFI")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack not available on Android host — use androidNative target for FFI")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize not available on Android host — use androidNative target for FFI")

public actual fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist not available on Android host — use androidNative target for FFI")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on Android host — use androidNative target for FFI")

public actual fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("freadUnlocked not available on Android host — use androidNative target for FFI")

public actual fun inotifyRmWatch(fd: Int, wd: Int): Int =
    throw UnsupportedOperationException("inotifyRmWatch not available on Android host — use androidNative target for FFI")

public actual fun inotifyInit(): Int =
    throw UnsupportedOperationException("inotifyInit not available on Android host — use androidNative target for FFI")

public actual fun inotifyInit1(flags: Int): Int =
    throw UnsupportedOperationException("inotifyInit1 not available on Android host — use androidNative target for FFI")

public actual fun inotifyAddWatch(fd: Int, path: String?, mask: UInt): Int =
    throw UnsupportedOperationException("inotifyAddWatch not available on Android host — use androidNative target for FFI")

public actual fun fanotifyInit(flags: UInt, eventFFlags: UInt): Int =
    throw UnsupportedOperationException("fanotifyInit not available on Android host — use androidNative target for FFI")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid not available on Android host — use androidNative target for FFI")

public actual fun klogctl(syslogType: Int, bufp: String?, len: Int): Int =
    throw UnsupportedOperationException("klogctl not available on Android host — use androidNative target for FFI")

public actual fun fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate64 not available on Android host — use androidNative target for FFI")

public actual fun fgetpos64(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos64 not available on Android host — use androidNative target for FFI")

public actual fun posixFallocate64(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate64 not available on Android host — use androidNative target for FFI")

public actual fun sendfile64(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long =
    throw UnsupportedOperationException("sendfile64 not available on Android host — use androidNative target for FFI")

public actual fun tmpfile64(): FILE? =
    throw UnsupportedOperationException("tmpfile64 not available on Android host — use androidNative target for FFI")

public actual fun clone(cb: ((COpaquePointer?) -> Int)?, childStack: COpaquePointer?, flags: Int, arg: COpaquePointer?, vararg args: Any?): Int =
    throw UnsupportedOperationException("clone not available on Android host — use androidNative target for FFI")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen64 not available on Android host — use androidNative target for FFI")
