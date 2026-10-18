package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.unix.bsd.apple.GlobT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.bsd.apple.StackT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.bsd.apple.Tm
import io.github.kotlinmania.libc.unix.Winsize

import io.github.kotlinmania.libc.*

public actual fun cmsgFirstHdr(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun fdClear(fd: Int, set: FdSet?) {
    if (set == null || fd < 0) return
    val idx = fd / 64
    val bit = fd % 64
    if (idx < set.fdsBits.size) {
        set.fdsBits[idx] = set.fdsBits[idx] and (1L shl bit).inv()
    }
}

public actual fun fdIsSet(fd: Int, set: FdSet?): Boolean {
    if (set == null || fd < 0) return false
    val idx = fd / 64
    val bit = fd % 64
    return if (idx < set.fdsBits.size) {
        (set.fdsBits[idx] and (1L shl bit)) != 0L
    } else {
        false
    }
}

public actual fun fdSet(fd: Int, set: FdSet?) {
    if (set == null || fd < 0) return
    val idx = fd / 64
    val bit = fd % 64
    if (idx < set.fdsBits.size) {
        set.fdsBits[idx] = set.fdsBits[idx] or (1L shl bit)
    }
}

public actual fun fdZero(set: FdSet?) {
    set?.fdsBits?.fill(0L)
}

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun abs(i: Int): Int =
    LibcNative.abs(i)

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs requires N-API addon")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs requires N-API addon")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun setlogin(name: String?): Int =
    throw UnsupportedOperationException("setlogin requires N-API addon")

public actual fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int {
    if (args.isNotEmpty()) {
        val first = args[0]
        if (first is Winsize) {
            val res = LibcNative.ioctlTiocgwinsz(fd)
            return if (res != null) 0 else -1
        }
    }
    return LibcNative.ioctl(fd, request.toDouble())
}

public actual fun kqueue(): Int =
    throw UnsupportedOperationException("kqueue requires N-API addon")

public actual fun unmount(target: String?, arg: Int): Int =
    throw UnsupportedOperationException("unmount requires N-API addon")

public actual fun syscall(num: Int, vararg args: Any?): Int {
    val a1 = if (args.isNotEmpty() && args[0] is Number) (args[0] as Number).toDouble() else 0.0
    val a2 = if (args.size > 1 && args[1] is Number) (args[1] as Number).toDouble() else 0.0
    val a3 = if (args.size > 2 && args[2] is Number) (args[2] as Number).toDouble() else 0.0
    val a4 = if (args.size > 3 && args[3] is Number) (args[3] as Number).toDouble() else 0.0
    val a5 = if (args.size > 4 && args[4] is Number) (args[4] as Number).toDouble() else 0.0
    val a6 = if (args.size > 5 && args[5] is Number) (args[5] as Number).toDouble() else 0.0
    return LibcNative.syscall(num.toDouble(), a1, a2, a3, a4, a5, a6).toInt()
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent requires N-API addon")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent requires N-API addon")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent requires N-API addon")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires N-API addon")

public actual fun setprogname(name: String?): Unit = throw UnsupportedOperationException("setprogname requires N-API addon")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg requires N-API addon")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex requires N-API addon")

public actual fun getpeereid(socket: Int, euid: UInt?, egid: UInt?): Int {
    val res = LibcNative.getpeereid(socket)
    return if (res != null) 0 else -1
}

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree requires N-API addon")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires N-API addon")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long {
    val res = LibcNative.recv(socket, len.toDouble(), flags)
    return if (res != null && res.length != null) (res.length as Number).toLong() else 0L
}

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes requires N-API addon")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    LibcNative.bind(socket, address)

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long {
    val nameBytes = msg?.msgName?.let { ByteArray(msg.msgNamelen.toInt()) }
    val iovBytes = msg?.msgIov?.let { ByteArray(it.iovLen.toInt()) }
    val ctlBytes = msg?.msgControl?.let { ByteArray(msg.msgControllen.toInt()) }
    return LibcNative.sendmsg(fd, nameBytes, iovBytes, ctlBytes, flags).toLong()
}

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long {
    val nameBytes = msg?.msgName?.let { ByteArray(msg.msgNamelen.toInt()) }
    val iovBytes = msg?.msgIov?.let { ByteArray(it.iovLen.toInt()) }
    val ctlBytes = msg?.msgControl?.let { ByteArray(msg.msgControllen.toInt()) }
    val res = LibcNative.recvmsg(fd, nameBytes, iovBytes, ctlBytes, flags)
    return (res?.bytes as? Number)?.toLong() ?: -1L
}

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires N-API addon")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun semClose(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun pthreadSigmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun pthreadCancel(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadCancel requires N-API addon")

public actual fun pthreadKill(thread: ULong, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    getpwnamRNapi(name, pwd, buflen, result)

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    getpwuidRNapi(uid, pwd, buflen, result)

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    popenNapi(command, mode)

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct requires N-API addon")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 requires N-API addon")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer requires N-API addon")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer requires N-API addon")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp requires N-API addon")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec requires N-API addon")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires N-API addon")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree requires N-API addon")

public actual fun arc4randomBuf(buf: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires N-API addon")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 requires N-API addon")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 requires N-API addon")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 requires N-API addon")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 requires N-API addon")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 requires N-API addon")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 requires N-API addon")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 requires N-API addon")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong requires N-API addon")

public actual fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun strftimeL(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?, locale: io.github.kotlinmania.libc.COpaquePointer?): ULong =
    throw UnsupportedOperationException("strftimeL requires N-API addon")

public actual fun devname(dev: ULong, modeT: UInt): String? =
    throw UnsupportedOperationException("devname requires N-API addon")

public actual fun issetugid(): Int =
    throw UnsupportedOperationException("issetugid requires N-API addon")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob requires N-API addon")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork requires N-API addon")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")
