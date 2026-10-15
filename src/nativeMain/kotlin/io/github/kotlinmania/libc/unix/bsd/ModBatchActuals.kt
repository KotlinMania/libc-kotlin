// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.*
import libc.cinterop.libc_cmsg_firsthdr
import libc.cinterop.libc_endgrent
import libc.cinterop.libc_endpwent
import libc.cinterop.libc_faccessat
import libc.cinterop.libc_getdtablesize
import libc.cinterop.libc_getrlimit
import libc.cinterop.libc_issetugid
import libc.cinterop.libc_labs
import libc.cinterop.libc_lrand48
import libc.cinterop.libc_mkstemps
import libc.cinterop.libc_mrand48
import libc.cinterop.libc_popen
import libc.cinterop.libc_rand
import libc.cinterop.libc_sched_get_priority_max
import libc.cinterop.libc_sched_get_priority_min
import libc.cinterop.libc_sem_unlink
import libc.cinterop.libc_setlogin
import libc.cinterop.libc_setpwent
import libc.cinterop.libc_setrlimit
import libc.cinterop.libc_shm_unlink
import libc.cinterop.libc_srand

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? {
    if (mhdr == null) return null
    val mhdrPtr: CPointer<ByteVar>? = mhdr.handle.toCPointer() ?: return null
    val result = libc_cmsg_firsthdr(mhdrPtr) ?: return null
    val resultLong = result.toLong()
    val resultPtr: CPointer<ByteVar> = resultLong.toCPointer<ByteVar>() ?: return null
    val uintPtr: CPointer<UIntVar> = resultPtr.reinterpret()
    val uintVar: UIntVar = uintPtr.pointed
    val cmsgLen: UInt = uintVar.value
    val levelPtr: CPointer<IntVar> = (resultLong + 4).toCPointer<ByteVar>()!!.reinterpret()
    val levelVar: IntVar = levelPtr.pointed
    val cmsgLevel: Int = levelVar.value
    val typePtr: CPointer<IntVar> = (resultLong + 8).toCPointer<ByteVar>()!!.reinterpret()
    val typeVar: IntVar = typePtr.pointed
    val cmsgType: Int = typeVar.value
    return Cmsghdr(cmsgLen, cmsgLevel, cmsgType, resultLong)
}

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

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int {
    if (rlim == null) return -1
    val rlimPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc_getrlimit(resource, rlimPtr)
    return result
}

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int {
    if (rlim == null) return -1
    val rlimPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc_setrlimit(resource, rlimPtr)
    return result
}

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires FFI bridge")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs requires FFI bridge")

public actual fun labs(i: Long): Long =
    libc.cinterop.libc_labs(i)

public actual fun rand(): Int =
    libc.cinterop.libc_rand()

public actual fun srand(seed: UInt) {
    libc_srand(seed)
}

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs requires manual FFI bridge — not yet implemented")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs requires manual FFI bridge — not yet implemented")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun setlogin(name: String?): Int {
    if (name == null) return -1
    return libc.cinterop.libc_setlogin(name)
}

public actual fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int =
    memScoped {
        if (args.isNotEmpty()) {
            val first = args[0]
            if (first is Winsize) {
                val buf = allocArray<UShortVar>(4)
                return libc.cinterop.libc_ioctl_tiocgwinsz(fd, buf, buf + 1, buf + 2, buf + 3)
            }
            if (first is COpaquePointer) {
                return libc.cinterop.libc_ioctl(fd, request, first.value.toCPointer<ByteVar>())
            }
        }
        libc.cinterop.libc_ioctl(fd, request, null)
    }

public actual fun kqueue(): Int =
    throw UnsupportedOperationException("kqueue requires manual FFI bridge — not yet implemented")

public actual fun unmount(target: String?, arg: Int): Int =
    throw UnsupportedOperationException("unmount requires manual FFI bridge — not yet implemented")

public actual fun syscall(num: Int, vararg args: Any?): Int {
    val a1 = if (args.isNotEmpty() && args[0] is Number) (args[0] as Number).toLong() else 0L
    val a2 = if (args.size > 1 && args[1] is Number) (args[1] as Number).toLong() else 0L
    val a3 = if (args.size > 2 && args[2] is Number) (args[2] as Number).toLong() else 0L
    val a4 = if (args.size > 3 && args[3] is Number) (args[3] as Number).toLong() else 0L
    val a5 = if (args.size > 4 && args[4] is Number) (args[4] as Number).toLong() else 0L
    val a6 = if (args.size > 5 && args[5] is Number) (args[5] as Number).toLong() else 0L
    return libc.cinterop.libc_syscall(num.toLong(), a1, a2, a3, a4, a5, a6).toInt()
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires manual FFI bridge — not yet implemented")

public actual fun setpwent() {
    libc_setpwent()
}

public actual fun endpwent() {
    libc_endpwent()
}

public actual fun endgrent() {
    libc_endgrent()
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires manual FFI bridge — not yet implemented")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires manual FFI bridge — not yet implemented")

public actual fun setprogname(name: String?): Unit = throw UnsupportedOperationException("setprogname requires manual FFI bridge — not yet implemented")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg requires manual FFI bridge — not yet implemented")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires manual FFI bridge — not yet implemented")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex requires manual FFI bridge — not yet implemented")

public actual fun getpeereid(socket: Int, euid: UInt?, egid: UInt?): Int =
    memScoped {
        val u = alloc<UIntVar>()
        val g = alloc<UIntVar>()
        libc.cinterop.libc_getpeereid(socket, u.ptr, g.ptr)
    }

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree requires manual FFI bridge — not yet implemented")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise requires FFI bridge")

public actual fun shmUnlink(name: String?): Int {
    val result = libc_shm_unlink(name)
    return result
}

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires FFI bridge")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires FFI bridge")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires FFI bridge")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    memScoped {
        val lenVar =
            if (addrlen != null) {
                val v = alloc<IntVar>()
                v.value = addrlen.toInt()
                v
            } else {
                null
            }
        val addrBuf = if (addr != null) allocArray<ByteVar>(addrlen?.toInt()?.coerceAtLeast(16) ?: 128) else null
        val res = libc.cinterop.libc_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addrBuf, lenVar?.ptr)
        if (res >= 0 && addr != null && addrBuf != null) {
            val copyLen = minOf(addr.saData.size, (lenVar?.value ?: 128) - 2)
            for (i in 0 until copyLen) {
                addr.saData[i] = addrBuf[i + 2]
            }
        }
        res.toLong()
    }

public actual fun mkstemps(template: String?, suffixlen: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkstemps(template, suffixlen)
}

public actual fun futimes(fd: Int, times: Timeval?): Int =
    throw UnsupportedOperationException("futimes requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    memScoped {
        if (address == null) {
            libc.cinterop.libc_bind(socket, null, addressLen.toInt())
        } else {
            val buf = allocArray<ByteVar>(addressLen.toInt().coerceAtLeast(16))
            buf[0] = address.saLen.toByte()
            buf[1] = address.saFamily.toByte()
            val copyLen = minOf(address.saData.size, addressLen.toInt() - 2)
            for (i in 0 until copyLen) {
                buf[i + 2] = address.saData[i]
            }
            libc.cinterop.libc_bind(socket, buf, addressLen.toInt())
        }
    }

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires FFI bridge")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires FFI bridge")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    memScoped {
        if (msg == null) return libc.cinterop.libc_sendmsg_simple(fd, null, 0, null, 0uL, null, 0uL, flags)
        val namePtr = msg.msgName?.value?.toCPointer<ByteVar>()
        val iovBase =
            msg.msgIov
                ?.iovBase
                ?.value
                ?.toCPointer<ByteVar>()
        val iovLen = msg.msgIov?.iovLen ?: 0uL
        val ctlPtr = msg.msgControl?.value?.toCPointer<ByteVar>()
        libc.cinterop.libc_sendmsg_simple(fd, namePtr, msg.msgNamelen.toInt(), iovBase, iovLen, ctlPtr, msg.msgControllen.toULong(), flags)
    }

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    memScoped {
        if (msg == null) return libc.cinterop.libc_recvmsg_simple(fd, null, null, null, 0uL, null, null, null, flags)
        val namePtr = msg.msgName?.value?.toCPointer<ByteVar>()
        val nameLenVar = alloc<IntVar>()
        nameLenVar.value = msg.msgNamelen.toInt()
        val iovBase =
            msg.msgIov
                ?.iovBase
                ?.value
                ?.toCPointer<ByteVar>()
        val iovLen = msg.msgIov?.iovLen ?: 0uL
        val ctlPtr = msg.msgControl?.value?.toCPointer<ByteVar>()
        val ctlLenVar = alloc<ULongVar>()
        ctlLenVar.value = msg.msgControllen.toULong()
        val flagsVar = alloc<IntVar>()
        libc.cinterop.libc_recvmsg_simple(fd, namePtr, nameLenVar.ptr, iovBase, iovLen, ctlPtr, ctlLenVar.ptr, flagsVar.ptr, flags)
    }

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun getdtablesize(): Int =
    libc.cinterop.libc_getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires manual FFI bridge — not yet implemented")

public actual fun pthreadCancel(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadCancel requires manual FFI bridge — not yet implemented")

public actual fun pthreadKill(thread: ULong, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMin(policy: Int): Int {
    val result = libc_sched_get_priority_min(policy)
    return result
}

public actual fun schedGetPriorityMax(policy: Int): Int {
    val result = libc_sched_get_priority_max(policy)
    return result
}

public actual fun semUnlink(name: String?): Int {
    val result = libc_sem_unlink(name)
    return result
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    memScoped {
        val nameBuf = allocArray<ByteVar>(1024)
        val passwdBuf = allocArray<ByteVar>(1024)
        val uidVar = alloc<UIntVar>()
        val gidVar = alloc<UIntVar>()
        val changeVar = alloc<LongVar>()
        val classBuf = allocArray<ByteVar>(1024)
        val gecosBuf = allocArray<ByteVar>(1024)
        val dirBuf = allocArray<ByteVar>(1024)
        val shellBuf = allocArray<ByteVar>(1024)
        val expireVar = alloc<LongVar>()
        val foundVar = alloc<IntVar>()
        val rc =
            libc.cinterop.libc_getpwnam_r_fields(
                name,
                buflen,
                nameBuf,
                1024uL,
                passwdBuf,
                1024uL,
                uidVar.ptr,
                gidVar.ptr,
                changeVar.ptr,
                classBuf,
                1024uL,
                gecosBuf,
                1024uL,
                dirBuf,
                1024uL,
                shellBuf,
                1024uL,
                expireVar.ptr,
                foundVar.ptr,
            )
        if (foundVar.value != 0 && pwd != null) {
            pwd.pwName = nameBuf.toKString()
            pwd.pwPasswd = passwdBuf.toKString()
            pwd.pwUid = uidVar.value
            pwd.pwGid = gidVar.value
            pwd.pwChange = changeVar.value
            pwd.pwClass = classBuf.toKString()
            pwd.pwGecos = gecosBuf.toKString()
            pwd.pwDir = dirBuf.toKString()
            pwd.pwShell = shellBuf.toKString()
            pwd.pwExpire = expireVar.value
        }
        if (result != null) {
            val orig = result.value
            if (orig >= 4096L) {
                orig.toCPointer<LongVar>()?.pointed?.value = if (foundVar.value != 0) 1L else 0L
            }
            result.value = if (foundVar.value != 0) (if (orig >= 4096L) orig else 1L) else 0L
        }
        rc
    }

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    memScoped {
        val nameBuf = allocArray<ByteVar>(1024)
        val passwdBuf = allocArray<ByteVar>(1024)
        val uidVar = alloc<UIntVar>()
        val gidVar = alloc<UIntVar>()
        val changeVar = alloc<LongVar>()
        val classBuf = allocArray<ByteVar>(1024)
        val gecosBuf = allocArray<ByteVar>(1024)
        val dirBuf = allocArray<ByteVar>(1024)
        val shellBuf = allocArray<ByteVar>(1024)
        val expireVar = alloc<LongVar>()
        val foundVar = alloc<IntVar>()
        val rc =
            libc.cinterop.libc_getpwuid_r_fields(
                uid,
                buflen,
                nameBuf,
                1024uL,
                passwdBuf,
                1024uL,
                uidVar.ptr,
                gidVar.ptr,
                changeVar.ptr,
                classBuf,
                1024uL,
                gecosBuf,
                1024uL,
                dirBuf,
                1024uL,
                shellBuf,
                1024uL,
                expireVar.ptr,
                foundVar.ptr,
            )
        if (foundVar.value != 0 && pwd != null) {
            pwd.pwName = nameBuf.toKString()
            pwd.pwPasswd = passwdBuf.toKString()
            pwd.pwUid = uidVar.value
            pwd.pwGid = gidVar.value
            pwd.pwChange = changeVar.value
            pwd.pwClass = classBuf.toKString()
            pwd.pwGecos = gecosBuf.toKString()
            pwd.pwDir = dirBuf.toKString()
            pwd.pwShell = shellBuf.toKString()
            pwd.pwExpire = expireVar.value
        }
        if (result != null) {
            val orig = result.value
            if (orig >= 4096L) {
                orig.toCPointer<LongVar>()?.pointed?.value = if (foundVar.value != 0) 1L else 0L
            }
            result.value = if (foundVar.value != 0) (if (orig >= 4096L) orig else 1L) else 0L
        }
        rc
    }

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires manual FFI bridge — not yet implemented")

public actual fun popen(command: String?, mode: String?): FILE? {
    val result = libc_popen(command, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
}

public actual fun acct(filename: String?): Int {
    if (filename == null) return -1
    return libc.cinterop.libc_acct(filename)
}

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 requires manual FFI bridge — not yet implemented")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer requires manual FFI bridge — not yet implemented")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer requires manual FFI bridge — not yet implemented")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp requires manual FFI bridge — not yet implemented")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec requires manual FFI bridge — not yet implemented")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires manual FFI bridge — not yet implemented")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree requires manual FFI bridge — not yet implemented")

public actual fun arc4randomBuf(buf: COpaquePointer?, size: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")

public actual fun lrand48(): Long =
    libc.cinterop.libc_lrand48()

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 requires manual FFI bridge — not yet implemented")

public actual fun mrand48(): Long =
    libc.cinterop.libc_mrand48()

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 requires manual FFI bridge — not yet implemented")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 requires manual FFI bridge — not yet implemented")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 requires manual FFI bridge — not yet implemented")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 requires manual FFI bridge — not yet implemented")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong requires manual FFI bridge — not yet implemented")

public actual fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun strftimeL(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?, locale: io.github.kotlinmania.libc.COpaquePointer?): ULong =
    throw UnsupportedOperationException("strftimeL requires manual FFI bridge — not yet implemented")

public actual fun devname(dev: ULong, modeT: UInt): String? =
    throw UnsupportedOperationException("devname requires manual FFI bridge — not yet implemented")

public actual fun issetugid(): Int =
    libc.cinterop.libc_issetugid()

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob requires manual FFI bridge — not yet implemented")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")
