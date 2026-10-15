// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_abs
import libc.cinterop.libc_acct
import libc.cinterop.libc_daemon
import libc.cinterop.libc_dirfd
import libc.cinterop.libc_endgrent
import libc.cinterop.libc_endpwent
import libc.cinterop.libc_faccessat
import libc.cinterop.libc_fdatasync
import libc.cinterop.libc_futimens
import libc.cinterop.libc_getdtablesize
import libc.cinterop.libc_getpagesize
import libc.cinterop.libc_getpriority
import libc.cinterop.libc_getrlimit
import libc.cinterop.libc_initgroups
import libc.cinterop.libc_labs
import libc.cinterop.libc_memalign
import libc.cinterop.libc_mkstemps
import libc.cinterop.libc_popen
import libc.cinterop.libc_rand
import libc.cinterop.libc_sched_get_priority_max
import libc.cinterop.libc_sched_get_priority_min
import libc.cinterop.libc_sched_getscheduler
import libc.cinterop.libc_sem_unlink
import libc.cinterop.libc_setgrent
import libc.cinterop.libc_setpriority
import libc.cinterop.libc_setpwent
import libc.cinterop.libc_setrlimit
import libc.cinterop.libc_settimeofday
import libc.cinterop.libc_shm_open
import libc.cinterop.libc_shm_unlink
import libc.cinterop.libc_shmdt
import libc.cinterop.libc_srand
import libc.cinterop.libc_uname
import libc.cinterop.libc_utimensat

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires manual FFI bridge — not yet implemented")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun fDCLR(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR requires manual FFI bridge — not yet implemented")

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")

public actual fun sIGRTMAX(): Int =
    throw UnsupportedOperationException("sIGRTMAX requires manual FFI bridge — not yet implemented")

public actual fun sIGRTMIN(): Int =
    throw UnsupportedOperationException("sIGRTMIN requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int {
    if (rlim == null) return -1
    val rlimPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc.cinterop.libc_getrlimit(resource, rlimPtr)
    return result
}

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int {
    if (rlim == null) return -1
    val rlpPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc.cinterop.libc_setrlimit(resource, rlpPtr)
    return result
}

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires FFI bridge")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun abs(i: Int): Int =
    libc.cinterop.libc_abs(i)

public actual fun acct(filename: String?): Int {
    if (filename == null) return -1
    return libc.cinterop.libc_acct(filename)
}

public actual fun dirfd(dirp: DIR?): Int =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun labs(i: Long): Long =
    libc.cinterop.libc_labs(i)

public actual fun rand(): Int =
    libc.cinterop.libc_rand()

public actual fun srand(seed: UInt) {
    libc.cinterop.libc_srand(seed)
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires manual FFI bridge — not yet implemented")

public actual fun getrandom(bbuf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires FFI bridge")

public actual fun settimeofday(tp: Timeval?, tz: COpaquePointer?): Int {
    if (tp == null) return -1
    val tvPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc.cinterop.libc_settimeofday(tvPtr, tzPtr)
    return result
}

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs requires manual FFI bridge — not yet implemented")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs requires manual FFI bridge — not yet implemented")

public actual fun stackGetbounds(sp: StackT?): Int =
    throw UnsupportedOperationException("stackGetbounds requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(name: String?, basegid: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires manual FFI bridge — not yet implemented")

public actual fun initgroups(name: String?, basegid: UInt): Int {
    val result = libc.cinterop.libc_initgroups(name, basegid.toInt())
    return result
}

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun ioctl(fildes: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno requires manual FFI bridge — not yet implemented")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires FFI bridge")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires FFI bridge")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires FFI bridge")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires FFI bridge")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun setpwent() {
    libc.cinterop.libc_setpwent()
}

public actual fun endpwent() {
    libc.cinterop.libc_endpwent()
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires manual FFI bridge — not yet implemented")

public actual fun fdatasync(fd: Int): Int =
    libc.cinterop.libc_fdatasync(fd)

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires manual FFI bridge — not yet implemented")

public actual fun setprogname(name: String?): Unit = throw UnsupportedOperationException("setprogname requires manual FFI bridge — not yet implemented")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: Int, who: Int): Int {
    val result = libc.cinterop.libc_getpriority(which, who)
    return result
}

public actual fun setpriority(which: Int, who: Int, prio: Int): Int {
    val result = libc.cinterop.libc_setpriority(which, who, prio)
    return result
}

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat requires manual FFI bridge — not yet implemented")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat requires FFI bridge")

public actual fun sethostname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("sethostname requires FFI bridge")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires manual FFI bridge — not yet implemented")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires manual FFI bridge — not yet implemented")

public actual fun semGetvalue(sem: SemT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(tid: UInt, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(tid: UInt, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: UInt, id: Int, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree requires manual FFI bridge — not yet implemented")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires FFI bridge")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise requires FFI bridge")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsInit(fileActions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsDestroy(fileActions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddopen(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclose(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAdddup2(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, newfildes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: io.github.kotlinmania.libc.COpaquePointer?, lowfiledes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddchdir(fileActions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdir requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddfchdir(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdir requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, sigdefault: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, sigdefault: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigignoreNp(attr: io.github.kotlinmania.libc.COpaquePointer?, sigignore: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigignoreNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigignoreNp(attr: io.github.kotlinmania.libc.COpaquePointer?, sigignore: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigignoreNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    libc.cinterop.libc_shmdt(shmaddr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int {
    val result = libc.cinterop.libc_shm_open(name, oflag, mode.toInt())
    return result
}

public actual fun shmUnlink(name: String?): Int {
    val result = libc.cinterop.libc_shm_unlink(name)
    return result
}

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires FFI bridge")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires FFI bridge")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires FFI bridge")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun mkstemps(template: String?, suffixlen: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkstemps(template, suffixlen)
}

public actual fun futimesat(fd: Int, path: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("futimesat requires manual FFI bridge — not yet implemented")

public actual fun futimens(dirfd: Int, times: Timespec?): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc.cinterop.libc_futimens(dirfd, timesPtr)
    return result
}

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc.cinterop.libc_utimensat(dirfd, path, timesPtr, flag)
    return result
}

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires FFI bridge")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires FFI bridge")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge — not yet implemented")

public actual fun accept4(fd: Int, address: Sockaddr?, addressLen: UInt?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("mqOpen requires manual FFI bridge — not yet implemented")

public actual fun mqClose(mqd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("mqClose requires manual FFI bridge — not yet implemented")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink requires manual FFI bridge — not yet implemented")

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive requires manual FFI bridge — not yet implemented")

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive requires manual FFI bridge — not yet implemented")

public actual fun mqSend(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend requires manual FFI bridge — not yet implemented")

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend requires manual FFI bridge — not yet implemented")

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.COpaquePointer?, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr requires manual FFI bridge — not yet implemented")

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.COpaquePointer?, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr requires manual FFI bridge — not yet implemented")

public actual fun portCreate(): Int =
    throw UnsupportedOperationException("portCreate requires manual FFI bridge — not yet implemented")

public actual fun portAssociate(port: Int, source: Int, `object`: ULong, events: Int, user: COpaquePointer?): Int =
    throw UnsupportedOperationException("portAssociate requires manual FFI bridge — not yet implemented")

public actual fun portDissociate(port: Int, source: Int, `object`: ULong): Int =
    throw UnsupportedOperationException("portDissociate requires manual FFI bridge — not yet implemented")

public actual fun portGet(port: Int, pe: PortEvent?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("portGet requires manual FFI bridge — not yet implemented")

public actual fun portGetn(port: Int, peList: PortEvent?, max: UInt, nget: UInt?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("portGetn requires manual FFI bridge — not yet implemented")

public actual fun portSend(port: Int, events: Int, user: COpaquePointer?): Int =
    throw UnsupportedOperationException("portSend requires manual FFI bridge — not yet implemented")

public actual fun portSendn(portList: Int?, errorList: Int?, nent: UInt, events: Int, user: COpaquePointer?): Int =
    throw UnsupportedOperationException("portSendn requires manual FFI bridge — not yet implemented")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: SigsetT?): Int =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun getdtablesize(): Int =
    libc.cinterop.libc_getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires manual FFI bridge — not yet implemented")

public actual fun pthreadKill(thread: UInt, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMin(policy: Int): Int {
    val result = libc.cinterop.libc_sched_get_priority_min(policy)
    return result
}

public actual fun schedGetPriorityMax(policy: Int): Int {
    val result = libc.cinterop.libc_sched_get_priority_max(policy)
    return result
}

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: Int): Int {
    val result = libc.cinterop.libc_sched_getscheduler(pid)
    return result
}

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun semUnlink(name: String?): Int {
    val result = libc.cinterop.libc_sem_unlink(name)
    return result
}

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    libc.cinterop.libc_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR requires manual FFI bridge — not yet implemented")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR requires manual FFI bridge — not yet implemented")

public actual fun sigwait(set: SigsetT?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires manual FFI bridge — not yet implemented")

public actual fun setgrent() {
    libc.cinterop.libc_setgrent()
}

public actual fun endgrent() {
    libc.cinterop.libc_endgrent()
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires manual FFI bridge — not yet implemented")

public actual fun popen(command: String?, mode: String?): FILE? {
    val result = libc.cinterop.libc_popen(command, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): Int {
    if (buf == null) return -1
    val bufPtr: CPointer<ByteVar>? = buf.handle.toCPointer()
    val result = libc.cinterop.libc_uname(bufPtr)
    return result
}

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 requires manual FFI bridge — not yet implemented")

public actual fun makeutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("makeutx requires manual FFI bridge — not yet implemented")

public actual fun modutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("modutx requires manual FFI bridge — not yet implemented")

public actual fun updwtmpx(file: String?, ut: Utmpx?): Unit = throw UnsupportedOperationException("updwtmpx requires manual FFI bridge — not yet implemented")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")

public actual fun endutent(): Unit = throw UnsupportedOperationException("endutent requires manual FFI bridge — not yet implemented")

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent requires manual FFI bridge — not yet implemented")

public actual fun getutid(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutid requires manual FFI bridge — not yet implemented")

public actual fun getutline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutline requires manual FFI bridge — not yet implemented")

public actual fun pututline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("pututline requires manual FFI bridge — not yet implemented")

public actual fun setutent(): Unit = throw UnsupportedOperationException("setutent requires manual FFI bridge — not yet implemented")

public actual fun utmpname(file: String?): Int =
    throw UnsupportedOperationException("utmpname requires manual FFI bridge — not yet implemented")

public actual fun getutmp(ux: Utmpx?, u: Utmp?): Unit = throw UnsupportedOperationException("getutmp requires manual FFI bridge — not yet implemented")

public actual fun getutmpx(u: Utmp?, ux: Utmpx?): Unit = throw UnsupportedOperationException("getutmpx requires manual FFI bridge — not yet implemented")

public actual fun updwtmp(file: String?, u: Utmp?): Unit = throw UnsupportedOperationException("updwtmp requires manual FFI bridge — not yet implemented")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime requires manual FFI bridge — not yet implemented")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime requires manual FFI bridge — not yet implemented")

public actual fun timerCreate(clockId: Int, evp: Sigevent?, timerid: Int?): Int =
    throw UnsupportedOperationException("timerCreate requires manual FFI bridge — not yet implemented")

public actual fun timerDelete(timerid: Int): Int =
    throw UnsupportedOperationException("timerDelete requires manual FFI bridge — not yet implemented")

public actual fun timerGetoverrun(timerid: Int): Int =
    throw UnsupportedOperationException("timerGetoverrun requires manual FFI bridge — not yet implemented")

public actual fun timerGettime(timerid: Int, value: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime requires manual FFI bridge — not yet implemented")

public actual fun timerSettime(timerid: Int, flags: Int, value: Itimerspec?, ovalue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime requires manual FFI bridge — not yet implemented")

public actual fun ucredGet(pid: Int): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("ucredGet requires manual FFI bridge — not yet implemented")

public actual fun getpeerucred(fd: Int, ucred: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpeerucred requires manual FFI bridge — not yet implemented")

public actual fun ucredFree(ucred: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("ucredFree requires manual FFI bridge — not yet implemented")

public actual fun ucredGetgroups(ucred: io.github.kotlinmania.libc.COpaquePointer?, groups: COpaquePointer?): Int =
    throw UnsupportedOperationException("ucredGetgroups requires manual FFI bridge — not yet implemented")

public actual fun ucredGetpid(ucred: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("ucredGetpid requires manual FFI bridge — not yet implemented")

public actual fun ucredSize(): ULong =
    throw UnsupportedOperationException("ucredSize requires manual FFI bridge — not yet implemented")

public actual fun psetCreate(newpset: Int?): Int =
    throw UnsupportedOperationException("psetCreate requires manual FFI bridge — not yet implemented")

public actual fun psetDestroy(pset: Int): Int =
    throw UnsupportedOperationException("psetDestroy requires manual FFI bridge — not yet implemented")

public actual fun psetAssign(pset: Int, cpu: Int, opset: Int?): Int =
    throw UnsupportedOperationException("psetAssign requires manual FFI bridge — not yet implemented")

public actual fun psetInfo(pset: Int, tpe: Int?, numcpus: UInt?, cpulist: Int?): Int =
    throw UnsupportedOperationException("psetInfo requires manual FFI bridge — not yet implemented")

public actual fun psetBind(pset: Int, idtype: UInt, id: Int, opset: Int?): Int =
    throw UnsupportedOperationException("psetBind requires manual FFI bridge — not yet implemented")

public actual fun psetList(pset: Int?, numpsets: UInt?): Int =
    throw UnsupportedOperationException("psetList requires manual FFI bridge — not yet implemented")

public actual fun psetSetattr(pset: Int, attr: UInt): Int =
    throw UnsupportedOperationException("psetSetattr requires manual FFI bridge — not yet implemented")

public actual fun psetGetattr(pset: Int, attr: UInt?): Int =
    throw UnsupportedOperationException("psetGetattr requires manual FFI bridge — not yet implemented")

public actual fun processorBind(idtype: UInt, id: Int, newBinding: Int, oldBinding: Int?): Int =
    throw UnsupportedOperationException("processorBind requires manual FFI bridge — not yet implemented")

public actual fun pOnline(processorid: Int, flag: Int): Int =
    throw UnsupportedOperationException("pOnline requires manual FFI bridge — not yet implemented")

public actual fun processorInfo(processorid: Int, infop: ProcessorInfoT?): Int =
    throw UnsupportedOperationException("processorInfo requires manual FFI bridge — not yet implemented")

public actual fun getexecname(): String? =
    throw UnsupportedOperationException("getexecname requires manual FFI bridge — not yet implemented")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid requires FFI bridge")

public actual fun setpflags(flags: UInt, value: UInt): Int =
    throw UnsupportedOperationException("setpflags requires manual FFI bridge — not yet implemented")

public actual fun sysinfo(command: Int, buf: String?, count: Long): Int =
    throw UnsupportedOperationException("sysinfo requires manual FFI bridge — not yet implemented")

public actual fun faccessat(fd: Int, path: String?, amode: Int, flag: Int): Int {
    if (path == null) return -1
    return libc.cinterop.libc_faccessat(fd, path, amode, flag)
}

public actual fun getpagesize(): Int =
    libc.cinterop.libc_getpagesize()

public actual fun getpagesizes(pagesize: ULong?, nelem: Int): Int =
    throw UnsupportedOperationException("getpagesizes requires manual FFI bridge — not yet implemented")

public actual fun mmapobj(fd: Int, flags: UInt, storage: MmapobjResultT?, elements: UInt?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("mmapobj requires manual FFI bridge — not yet implemented")

public actual fun meminfo(inaddr: ULong?, addrCount: Int, infoReq: UInt?, infoCount: Int, outdata: ULong?, validity: UInt?): Int =
    throw UnsupportedOperationException("meminfo requires manual FFI bridge — not yet implemented")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep requires manual FFI bridge — not yet implemented")

public actual fun backtrace(buffer: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("backtrace requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: Int): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: Int, fd: Int): Unit = throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong requires manual FFI bridge — not yet implemented")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: UInt, nwait: UInt?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioWaitn requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")

public actual fun secureGetenv(name: String?): String? =
    throw UnsupportedOperationException("secureGetenv requires manual FFI bridge — not yet implemented")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun strftimeL(s: String?, maxsize: ULong, format: String?, timeptr: Tm?, loc: io.github.kotlinmania.libc.COpaquePointer?): ULong =
    throw UnsupportedOperationException("strftimeL requires manual FFI bridge — not yet implemented")

public actual fun sendfile(outFd: Int, inFd: Int, off: Long?, len: ULong): Long =
    throw UnsupportedOperationException("sendfile requires manual FFI bridge — not yet implemented")

public actual fun sendfilev(fildes: Int, vec: SendfilevecT?, sfvcnt: Int, xferred: ULong?): Long =
    throw UnsupportedOperationException("sendfilev requires manual FFI bridge — not yet implemented")

public actual fun lgrpFini(cookie: ULong): Int =
    throw UnsupportedOperationException("lgrpFini requires manual FFI bridge — not yet implemented")

public actual fun lgrpAffinitySet(idtype: UInt, id: Int, lgrp: Int, aff: Int): Int =
    throw UnsupportedOperationException("lgrpAffinitySet requires manual FFI bridge — not yet implemented")

public actual fun lgrpCpus(cookie: ULong, lgrp: Int, cpuids: Int?, count: UInt, content: UInt): Int =
    throw UnsupportedOperationException("lgrpCpus requires manual FFI bridge — not yet implemented")

public actual fun lgrpNlgrps(cookie: ULong): Int =
    throw UnsupportedOperationException("lgrpNlgrps requires manual FFI bridge — not yet implemented")

public actual fun lgrpVersion(version: Int): Int =
    throw UnsupportedOperationException("lgrpVersion requires manual FFI bridge — not yet implemented")

public actual fun lgrpResources(cookie: ULong, lgrp: Int, lgrps: Int?, count: UInt, tpe: Int): Int =
    throw UnsupportedOperationException("lgrpResources requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: UInt?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob requires manual FFI bridge — not yet implemented")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")
