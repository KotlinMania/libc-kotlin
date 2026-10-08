// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.internal.LibcJni

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on JVM — no C library access")

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    if (set == null || fd < 0) return
    val idx = fd / 64
    val bit = fd % 64
    if (idx < set.fdsBits.size) {
        set.fdsBits[idx] = set.fdsBits[idx] and (1L shl bit).inv()
    }
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean {
    if (set == null || fd < 0) return false
    val idx = fd / 64
    val bit = fd % 64
    return if (idx < set.fdsBits.size) {
        (set.fdsBits[idx] and (1L shl bit)) != 0L
    } else {
        false
    }
}

public actual fun fDSET(fd: CInt, set: FdSet?) {
    if (set == null || fd < 0) return
    val idx = fd / 64
    val bit = fd % 64
    if (idx < set.fdsBits.size) {
        set.fdsBits[idx] = set.fdsBits[idx] or (1L shl bit)
    }
}

public actual fun fDZERO(set: FdSet?) {
    set?.fdsBits?.fill(0L)
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on JVM — no C library access")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on JVM — no C library access")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on JVM — no C library access")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs not available on JVM — no C library access")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs not available on JVM — no C library access")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on JVM — no C library access")

public actual fun srand(seed: CUInt): Unit = throw UnsupportedOperationException("srand not available on JVM — no C library access")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs not available on JVM — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs not available on JVM — no C library access")

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups not available on JVM — no C library access")

public actual fun setlogin(name: String?): CInt =
    throw UnsupportedOperationException("setlogin not available on JVM — no C library access")

public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt {
    if (args.isNotEmpty()) {
        val first = args[0]
        if (first is Winsize) {
            val winsize = ShortArray(4)
            return LibcJni.ioctlTiocgwinsz(fd, winsize)
        }
    }
    return LibcJni.ioctl(fd, request.toLong(), null)
}

public actual fun kqueue(): CInt =
    throw UnsupportedOperationException("kqueue not available on JVM — no C library access")

public actual fun unmount(target: String?, arg: CInt): CInt =
    throw UnsupportedOperationException("unmount not available on JVM — no C library access")

public actual fun syscall(num: CInt, vararg args: Any?): CInt {
    val a1 = if (args.isNotEmpty() && args[0] is Number) (args[0] as Number).toLong() else 0L
    val a2 = if (args.size > 1 && args[1] is Number) (args[1] as Number).toLong() else 0L
    val a3 = if (args.size > 2 && args[2] is Number) (args[2] as Number).toLong() else 0L
    val a4 = if (args.size > 3 && args[3] is Number) (args[3] as Number).toLong() else 0L
    val a5 = if (args.size > 4 && args[4] is Number) (args[4] as Number).toLong() else 0L
    val a6 = if (args.size > 5 && args[5] is Number) (args[5] as Number).toLong() else 0L
    return LibcJni.syscall(num.toLong(), a1, a2, a3, a4, a5, a6).toInt()
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on JVM — no C library access")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent not available on JVM — no C library access")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent not available on JVM — no C library access")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent not available on JVM — no C library access")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on JVM — no C library access")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname not available on JVM — no C library access")

public actual fun setprogname(name: String?): Unit = throw UnsupportedOperationException("setprogname not available on JVM — no C library access")

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg not available on JVM — no C library access")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on JVM — no C library access")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex not available on JVM — no C library access")

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt {
    val creds = IntArray(2)
    return LibcJni.getpeereid(socket, creds)
}

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on JVM — no C library access")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise not available on JVM — no C library access")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink not available on JVM — no C library access")

public actual fun seekdir(dirp: DIR?, loc: CLong): Unit = throw UnsupportedOperationException("seekdir not available on JVM — no C library access")

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir not available on JVM — no C library access")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise not available on JVM — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync not available on JVM — no C library access")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT {
    val lenVal = addrlen?.toInt() ?: 128
    val addrBytes = if (addr != null) ByteArray(lenVal) else null
    val lenArr = if (addrlen != null) intArrayOf(lenVal) else null
    val bufBytes = ByteArray(len.toInt())
    val res = LibcJni.recvfrom(socket, bufBytes, 0, len.toInt(), flags, addrBytes, lenArr)
    if (res >= 0 && addr != null && addrBytes != null) {
        val copyLen = minOf(addr.saData.size, (lenArr?.get(0) ?: lenVal) - 2)
        for (i in 0 until copyLen) {
            addr.saData[i] = addrBytes[i + 2]
        }
    }
    return res
}

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps not available on JVM — no C library access")

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimes not available on JVM — no C library access")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo not available on JVM — no C library access")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt {
    val bytes = ByteArray(addressLen.toInt().coerceAtLeast(16))
    if (address != null) {
        bytes[0] = address.saLen.toByte()
        bytes[1] = address.saFamily.toByte()
        val copyLen = minOf(address.saData.size, addressLen.toInt() - 2)
        for (i in 0 until copyLen) {
            bytes[i + 2] = address.saData[i]
        }
    }
    return LibcJni.bind(socket, bytes, addressLen.toInt())
}

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on JVM — no C library access")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on JVM — no C library access")

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    val nameBytes = msg?.msgName?.let { ByteArray(msg.msgNamelen.toInt()) }
    val iovBytes = msg?.msgIov?.let { ByteArray(it.iovLen.toInt()) }
    val ctlBytes = msg?.msgControl?.let { ByteArray(msg.msgControllen.toInt()) }
    return LibcJni.sendmsg(fd, nameBytes, iovBytes, ctlBytes, flags)
}

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    val nameBytes = msg?.msgName?.let { ByteArray(msg.msgNamelen.toInt()) }
    val nameLenOut = msg?.msgName?.let { intArrayOf(msg.msgNamelen.toInt()) }
    val iovBytes = msg?.msgIov?.let { ByteArray(it.iovLen.toInt()) }
    val ctlBytes = msg?.msgControl?.let { ByteArray(msg.msgControllen.toInt()) }
    val ctlLenOut = msg?.msgControl?.let { intArrayOf(msg.msgControllen.toInt()) }
    val flagsOut = intArrayOf(0)
    return LibcJni.recvmsg(fd, nameBytes, nameLenOut, iovBytes, ctlBytes, ctlLenOut, flagsOut, flags)
}

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on JVM — no C library access")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR not available on JVM — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack not available on JVM — no C library access")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend not available on JVM — no C library access")

public actual fun semClose(sem: SemT): CInt =
    throw UnsupportedOperationException("semClose not available on JVM — no C library access")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize not available on JVM — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR not available on JVM — no C library access")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask not available on JVM — no C library access")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT =
    throw UnsupportedOperationException("semOpen not available on JVM — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on JVM — no C library access")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel not available on JVM — no C library access")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill not available on JVM — no C library access")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin not available on JVM — no C library access")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax not available on JVM — no C library access")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink not available on JVM — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR not available on JVM — no C library access")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR not available on JVM — no C library access")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait not available on JVM — no C library access")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid not available on JVM — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on JVM — no C library access")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat not available on JVM — no C library access")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct not available on JVM — no C library access")

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 not available on JVM — no C library access")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer not available on JVM — no C library access")

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer not available on JVM — no C library access")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp not available on JVM — no C library access")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec not available on JVM — no C library access")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on JVM — no C library access")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree not available on JVM — no C library access")

public actual fun arc4randomBuf(buf: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf not available on JVM — no C library access")

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("lrand48 not available on JVM — no C library access")

public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 not available on JVM — no C library access")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("mrand48 not available on JVM — no C library access")

public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 not available on JVM — no C library access")

public actual fun srand48(seed: CLong): Unit = throw UnsupportedOperationException("srand48 not available on JVM — no C library access")

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 not available on JVM — no C library access")

public actual fun lcong48(p: CUShort?): Unit = throw UnsupportedOperationException("lcong48 not available on JVM — no C library access")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong not available on JVM — no C library access")

public actual fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on JVM — no C library access")

public actual fun strftimeL(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?, locale: LocaleT): ULong =
    throw UnsupportedOperationException("strftimeL not available on JVM — no C library access")

public actual fun devname(dev: DevT, modeT: ModeT): String? =
    throw UnsupportedOperationException("devname not available on JVM — no C library access")

public actual fun issetugid(): CInt =
    throw UnsupportedOperationException("issetugid not available on JVM — no C library access")

public actual fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt =
    throw UnsupportedOperationException("glob not available on JVM — no C library access")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork not available on JVM — no C library access")

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate not available on JVM — no C library access")
