// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.internal.LibcJni

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on Android host — use androidNative target for FFI")

public actual fun fDCLR(fd: Int, set: FdSet?) {
    if (set == null || fd < 0) return
    val idx = fd / 64
    val bit = fd % 64
    if (idx < set.fdsBits.size) {
        set.fdsBits[idx] = set.fdsBits[idx] and (1L shl bit).inv()
    }
}

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean {
    if (set == null || fd < 0) return false
    val idx = fd / 64
    val bit = fd % 64
    return if (idx < set.fdsBits.size) {
        (set.fdsBits[idx] and (1L shl bit)) != 0L
    } else {
        false
    }
}

public actual fun fDSET(fd: Int, set: FdSet?) {
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

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on Android host — use androidNative target for FFI")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on Android host — use androidNative target for FFI")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on Android host — use androidNative target for FFI")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs not available on Android host — use androidNative target for FFI")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs not available on Android host — use androidNative target for FFI")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups not available on Android host — use androidNative target for FFI")

public actual fun setlogin(name: String?): Int =
    throw UnsupportedOperationException("setlogin not available on Android host — use androidNative target for FFI")

public actual fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int {
    if (args.isNotEmpty()) {
        val first = args[0]
        if (first is Winsize) {
            val winsize = ShortArray(4)
            return LibcJni.ioctlTiocgwinsz(fd, winsize)
        }
    }
    return LibcJni.ioctl(fd, request.toLong(), null)
}

public actual fun kqueue(): Int =
    throw UnsupportedOperationException("kqueue not available on Android host — use androidNative target for FFI")

public actual fun unmount(target: String?, arg: Int): Int =
    throw UnsupportedOperationException("unmount not available on Android host — use androidNative target for FFI")

public actual fun syscall(num: Int, vararg args: Any?): Int {
    val a1 = if (args.isNotEmpty() && args[0] is Number) (args[0] as Number).toLong() else 0L
    val a2 = if (args.size > 1 && args[1] is Number) (args[1] as Number).toLong() else 0L
    val a3 = if (args.size > 2 && args[2] is Number) (args[2] as Number).toLong() else 0L
    val a4 = if (args.size > 3 && args[3] is Number) (args[3] as Number).toLong() else 0L
    val a5 = if (args.size > 4 && args[4] is Number) (args[4] as Number).toLong() else 0L
    val a6 = if (args.size > 5 && args[5] is Number) (args[5] as Number).toLong() else 0L
    return LibcJni.syscall(num.toLong(), a1, a2, a3, a4, a5, a6).toInt()
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on Android host — use androidNative target for FFI")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent not available on Android host — use androidNative target for FFI")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent not available on Android host — use androidNative target for FFI")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent not available on Android host — use androidNative target for FFI")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on Android host — use androidNative target for FFI")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname not available on Android host — use androidNative target for FFI")

public actual fun setprogname(name: String?): Unit = throw UnsupportedOperationException("setprogname not available on Android host — use androidNative target for FFI")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg not available on Android host — use androidNative target for FFI")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on Android host — use androidNative target for FFI")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex not available on Android host — use androidNative target for FFI")

public actual fun getpeereid(socket: Int, euid: UInt?, egid: UInt?): Int {
    val creds = IntArray(2)
    return LibcJni.getpeereid(socket, creds)
}

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on Android host — use androidNative target for FFI")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise not available on Android host — use androidNative target for FFI")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on Android host — use androidNative target for FFI")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on Android host — use androidNative target for FFI")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on Android host — use androidNative target for FFI")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise not available on Android host — use androidNative target for FFI")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on Android host — use androidNative target for FFI")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long {
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

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps not available on Android host — use androidNative target for FFI")

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on Android host — use androidNative target for FFI")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int {
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

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on Android host — use androidNative target for FFI")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on Android host — use androidNative target for FFI")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long {
    val nameBytes = msg?.msgName?.let { ByteArray(msg.msgNamelen.toInt()) }
    val iovBytes = msg?.msgIov?.let { ByteArray(it.iovLen.toInt()) }
    val ctlBytes = msg?.msgControl?.let { ByteArray(msg.msgControllen.toInt()) }
    return LibcJni.sendmsg(fd, nameBytes, iovBytes, ctlBytes, flags)
}

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long {
    val nameBytes = msg?.msgName?.let { ByteArray(msg.msgNamelen.toInt()) }
    val nameLenOut = msg?.msgName?.let { intArrayOf(msg.msgNamelen.toInt()) }
    val iovBytes = msg?.msgIov?.let { ByteArray(it.iovLen.toInt()) }
    val ctlBytes = msg?.msgControl?.let { ByteArray(msg.msgControllen.toInt()) }
    val ctlLenOut = msg?.msgControl?.let { intArrayOf(msg.msgControllen.toInt()) }
    val flagsOut = intArrayOf(0)
    return LibcJni.recvmsg(fd, nameBytes, nameLenOut, iovBytes, ctlBytes, ctlLenOut, flagsOut, flags)
}

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on Android host — use androidNative target for FFI")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on Android host — use androidNative target for FFI")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack not available on Android host — use androidNative target for FFI")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend not available on Android host — use androidNative target for FFI")

public actual fun semClose(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semClose not available on Android host — use androidNative target for FFI")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize not available on Android host — use androidNative target for FFI")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on Android host — use androidNative target for FFI")

public actual fun pthreadSigmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on Android host — use androidNative target for FFI")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("semOpen not available on Android host — use androidNative target for FFI")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on Android host — use androidNative target for FFI")

public actual fun pthreadCancel(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadCancel not available on Android host — use androidNative target for FFI")

public actual fun pthreadKill(thread: ULong, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax not available on Android host — use androidNative target for FFI")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink not available on Android host — use androidNative target for FFI")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    io.github.kotlinmania.libc.internal.LibcJni
        .getpwnamR(name, pwd, buflen, result)

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    io.github.kotlinmania.libc.internal.LibcJni
        .getpwuidR(uid, pwd, buflen, result)

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on Android host — use androidNative target for FFI")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on Android host — use androidNative target for FFI")

public actual fun popen(command: String?, mode: String?): FILE? {
    if (command == null || mode == null) return null
    val ptr =
        io.github.kotlinmania.libc.internal.LibcJni
            .popen(command, mode)
    return if (ptr == 0L) null else FILE(ptr)
}

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat not available on Android host — use androidNative target for FFI")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct not available on Android host — use androidNative target for FFI")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 not available on Android host — use androidNative target for FFI")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer not available on Android host — use androidNative target for FFI")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer not available on Android host — use androidNative target for FFI")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp not available on Android host — use androidNative target for FFI")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec not available on Android host — use androidNative target for FFI")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on Android host — use androidNative target for FFI")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree not available on Android host — use androidNative target for FFI")

public actual fun arc4randomBuf(buf: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf not available on Android host — use androidNative target for FFI")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 not available on Android host — use androidNative target for FFI")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 not available on Android host — use androidNative target for FFI")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 not available on Android host — use androidNative target for FFI")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 not available on Android host — use androidNative target for FFI")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 not available on Android host — use androidNative target for FFI")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 not available on Android host — use androidNative target for FFI")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 not available on Android host — use androidNative target for FFI")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong not available on Android host — use androidNative target for FFI")

public actual fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on Android host — use androidNative target for FFI")

public actual fun strftimeL(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?, locale: io.github.kotlinmania.libc.COpaquePointer?): ULong =
    throw UnsupportedOperationException("strftimeL not available on Android host — use androidNative target for FFI")

public actual fun devname(dev: ULong, modeT: UInt): String? =
    throw UnsupportedOperationException("devname not available on Android host — use androidNative target for FFI")

public actual fun issetugid(): Int =
    throw UnsupportedOperationException("issetugid not available on Android host — use androidNative target for FFI")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on Android host — use androidNative target for FFI")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")
