// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public actual fun fdClear(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR requires N-API addon")

public actual fun fdIsSet(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fdSet(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires N-API addon")

public actual fun fdZero(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires N-API addon")

public actual fun cpuAllocSize(count: Int): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE requires N-API addon")

public actual fun cpuCountS(size: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNTS requires N-API addon")

public actual fun cpuZero(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO requires N-API addon")

public actual fun cpuSet(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET requires N-API addon")

public actual fun cpuClear(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR requires N-API addon")

public actual fun cpuIsSet(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires N-API addon")

public actual fun cpuCount(cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT requires N-API addon")

public actual fun cpuEqual(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires N-API addon")

public actual fun cmsgFirstHdr(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun sigwaitinfo(set: ULong?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo requires N-API addon")

public actual fun pthreadSigmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.COpaquePointer?, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctimeR(timep: Long?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires N-API addon")

public actual fun clockSettime(clkId: ULong, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun clockGettime(clkId: ULong, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockGetres(clkId: ULong, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun timerCreate(clockid: ULong, sevp: Sigevent?, timerid: ULong?): Int =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: ULong): Int =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerSettime(timerid: ULong, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun timerGettime(timerid: ULong, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerGetoverrun(timerid: ULong): Int =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun clockNanosleep(clkId: ULong, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun clockGetcpuclockid(pid: Int, clkId: ULong?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid requires N-API addon")

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes requires N-API addon")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer requires N-API addon")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun futimesat(fd: Int, path: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("futimesat requires N-API addon")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent requires N-API addon")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent requires N-API addon")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex requires N-API addon")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: UInt): Int =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun dlfork(`val`: Int): Unit = throw UnsupportedOperationException("dlfork requires N-API addon")

public actual fun accept4(s: Int, addr: Sockaddr?, addrlen: Int?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: Int): Int =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: Int?): Long =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: Int, host: String?, hostlen: Int, serv: String?, sevlen: Int, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("ppoll requires N-API addon")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun semInit(sem: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun semDestroy(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun semClose(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun semTimedwait(sem: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: io.github.kotlinmania.libc.COpaquePointer?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun clearenv(): Int =
    throw UnsupportedOperationException("clearenv requires N-API addon")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR requires N-API addon")

public actual fun getpt(): Int =
    throw UnsupportedOperationException("getpt requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg requires N-API addon")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun arc4randomBuf(buf: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires N-API addon")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun mkostemp(template: String?, flags: Int): Int =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocf requires N-API addon")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 requires N-API addon")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 requires N-API addon")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 requires N-API addon")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 requires N-API addon")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 requires N-API addon")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 requires N-API addon")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires N-API addon")

public actual fun ffs(value: Int): Int =
    throw UnsupportedOperationException("ffs requires N-API addon")

public actual fun ffsl(value: Long): Int =
    throw UnsupportedOperationException("ffsl requires N-API addon")

public actual fun ffsll(value: Long): Int =
    throw UnsupportedOperationException("ffsll requires N-API addon")

public actual fun fls(value: Int): Int =
    throw UnsupportedOperationException("fls requires N-API addon")

public actual fun flsl(value: Long): Int =
    throw UnsupportedOperationException("flsl requires N-API addon")

public actual fun flsll(value: Long): Int =
    throw UnsupportedOperationException("flsll requires N-API addon")

public actual fun strcasecmpL(s1: String?, s2: String?, loc: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strcasecmpL requires N-API addon")

public actual fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strncasecmpL requires N-API addon")

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("timingsafeBcmp requires N-API addon")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("timingsafeMemcmp requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun eaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("eaccess requires N-API addon")

public actual fun euidaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("euidaccess requires N-API addon")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve requires N-API addon")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun getdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun getpagesize(): Int =
    throw UnsupportedOperationException("getpagesize requires N-API addon")

public actual fun getpeereid(socket: Int, euid: UInt?, egid: UInt?): Int =
    throw UnsupportedOperationException("getpeereid requires N-API addon")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun sbrk(increment: Long): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires N-API addon")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun vhangup(): Int =
    throw UnsupportedOperationException("vhangup requires N-API addon")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires N-API addon")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno requires N-API addon")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun schedRrGetInterval(pid: Int, t: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu requires N-API addon")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, mask: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires N-API addon")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires N-API addon")

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires N-API addon")

public actual fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedparam requires N-API addon")

public actual fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedparam requires N-API addon")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCancel requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: ULong?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: ULong): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires N-API addon")

public actual fun pthreadBarrierattrInit(attr: ULong?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires N-API addon")

public actual fun pthreadBarrierattrSetpshared(attr: ULong?, shared: Int): Int =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires N-API addon")

public actual fun pthreadBarrierattrGetpshared(attr: ULong?, shared: Int?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires N-API addon")

public actual fun pthreadBarrierattrDestroy(attr: ULong?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires N-API addon")

public actual fun pthreadBarrierInit(barrier: ULong?, attr: ULong?, count: UInt): Int =
    throw UnsupportedOperationException("pthreadBarrierInit requires N-API addon")

public actual fun pthreadBarrierDestroy(barrier: ULong?): Int =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires N-API addon")

public actual fun pthreadBarrierWait(barrier: ULong?): Int =
    throw UnsupportedOperationException("pthreadBarrierWait requires N-API addon")

public actual fun pthreadGetcpuclockid(thread: io.github.kotlinmania.libc.COpaquePointer?, clkId: ULong?): Int =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires N-API addon")

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadMutexattrGetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol requires N-API addon")

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires N-API addon")

public actual fun pthreadMutexattrSetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol requires N-API addon")

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires N-API addon")

public actual fun pthreadSpinDestroy(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinInit(lock: ULong?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinLock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: ULong?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires N-API addon")

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires N-API addon")

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.COpaquePointer?, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun pthreadSetschedprio(native: io.github.kotlinmania.libc.COpaquePointer?, priority: Int): Int =
    throw UnsupportedOperationException("pthreadSetschedprio requires N-API addon")

public actual fun pthreadGetaffinityNp(thread: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires N-API addon")

public actual fun pthreadGetattrNp(native: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp requires N-API addon")

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.COpaquePointer?, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadSetaffinityNp(thread: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires N-API addon")

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.COpaquePointer?, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires N-API addon")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun mount(src: String?, target: String?, flags: UInt): Int =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun umount(target: String?): Int =
    throw UnsupportedOperationException("umount requires N-API addon")

public actual fun cygwinUmount(target: String?, flags: UInt): Int =
    throw UnsupportedOperationException("cygwinUmount requires N-API addon")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires N-API addon")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires N-API addon")

public actual fun posixSpawnattrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires N-API addon")

public actual fun posixSpawnattrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires N-API addon")

public actual fun posixSpawnattrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires N-API addon")

public actual fun posixSpawnFileActionsInit(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun posixSpawnFileActionsAddchdir(actions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdir requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdir(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdir requires N-API addon")

public actual fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires N-API addon")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun initgroups(user: String?, group: UInt): Int =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate requires N-API addon")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(id: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(line: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(utmpx: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires N-API addon")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun updwtmpx(file: String?, utmpx: Utmpx?): Unit = throw UnsupportedOperationException("updwtmpx requires N-API addon")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortR requires N-API addon")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork requires N-API addon")

public actual fun pthreadCreate(native: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")

public actual fun pthreadSigqueue(thread: io.github.kotlinmania.libc.COpaquePointer?, sig: Int, value: Sigval): Int =
    throw UnsupportedOperationException("pthreadSigqueue requires N-API addon")
