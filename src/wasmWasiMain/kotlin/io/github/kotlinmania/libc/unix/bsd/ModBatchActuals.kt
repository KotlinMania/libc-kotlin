// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.internal.WasiLibcEnv

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on WASI — no C library access")

public actual fun fDCLR(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR not available on WASI — no C library access")

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on WASI — no C library access")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET not available on WASI — no C library access")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO not available on WASI — no C library access")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on WASI — no C library access")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on WASI — no C library access")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on WASI — no C library access")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on WASI — no C library access")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on WASI — no C library access")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on WASI — no C library access")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on WASI — no C library access")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs not available on WASI — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs not available on WASI — no C library access")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups not available on WASI — no C library access")

public actual fun setlogin(name: String?): Int =
    throw UnsupportedOperationException("setlogin not available on WASI — no C library access")

public actual fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on WASI — no C library access")

public actual fun kqueue(): Int =
    throw UnsupportedOperationException("kqueue not available on WASI — no C library access")

public actual fun unmount(target: String?, arg: Int): Int =
    throw UnsupportedOperationException("unmount not available on WASI — no C library access")

public actual fun syscall(num: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("syscall not available on WASI — no C library access")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on WASI — no C library access")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent not available on WASI — no C library access")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent not available on WASI — no C library access")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent not available on WASI — no C library access")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on WASI — no C library access")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname not available on WASI — no C library access")

public actual fun setprogname(name: String?): Unit = throw UnsupportedOperationException("setprogname not available on WASI — no C library access")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg not available on WASI — no C library access")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on WASI — no C library access")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex not available on WASI — no C library access")

public actual fun getpeereid(socket: Int, euid: UInt?, egid: UInt?): Int =
    throw UnsupportedOperationException("getpeereid not available on WASI — no C library access")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on WASI — no C library access")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise not available on WASI — no C library access")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on WASI — no C library access")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on WASI — no C library access")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on WASI — no C library access")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise not available on WASI — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on WASI — no C library access")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom not available on WASI — no C library access")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps not available on WASI — no C library access")

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes not available on WASI — no C library access")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on WASI — no C library access")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind not available on WASI — no C library access")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on WASI — no C library access")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on WASI — no C library access")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg not available on WASI — no C library access")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg not available on WASI — no C library access")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on WASI — no C library access")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on WASI — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack not available on WASI — no C library access")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend not available on WASI — no C library access")

public actual fun semClose(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semClose not available on WASI — no C library access")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize not available on WASI — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on WASI — no C library access")

public actual fun pthreadSigmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on WASI — no C library access")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("semOpen not available on WASI — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on WASI — no C library access")

public actual fun pthreadCancel(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadCancel not available on WASI — no C library access")

public actual fun pthreadKill(thread: ULong, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill not available on WASI — no C library access")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin not available on WASI — no C library access")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax not available on WASI — no C library access")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink not available on WASI — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    WasiLibcEnv.getpwnamR(name, pwd, buflen, result)

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    WasiLibcEnv.getpwuidR(uid, pwd, buflen, result)

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on WASI — no C library access")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on WASI — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    WasiLibcEnv.popen(command, mode)

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat not available on WASI — no C library access")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct not available on WASI — no C library access")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 not available on WASI — no C library access")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer not available on WASI — no C library access")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer not available on WASI — no C library access")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp not available on WASI — no C library access")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec not available on WASI — no C library access")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on WASI — no C library access")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree not available on WASI — no C library access")

public actual fun arc4randomBuf(buf: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf not available on WASI — no C library access")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 not available on WASI — no C library access")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 not available on WASI — no C library access")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 not available on WASI — no C library access")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 not available on WASI — no C library access")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 not available on WASI — no C library access")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 not available on WASI — no C library access")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 not available on WASI — no C library access")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong not available on WASI — no C library access")

public actual fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on WASI — no C library access")

public actual fun strftimeL(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?, locale: io.github.kotlinmania.libc.COpaquePointer?): ULong =
    throw UnsupportedOperationException("strftimeL not available on WASI — no C library access")

public actual fun devname(dev: ULong, modeT: UInt): String? =
    throw UnsupportedOperationException("devname not available on WASI — no C library access")

public actual fun issetugid(): Int =
    throw UnsupportedOperationException("issetugid not available on WASI — no C library access")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on WASI — no C library access")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on WASI — no C library access")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on WASI — no C library access")
