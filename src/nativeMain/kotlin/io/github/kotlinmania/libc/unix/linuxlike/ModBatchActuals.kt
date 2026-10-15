// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.*
import libc.cinterop.libc_acct
import libc.cinterop.libc_dirfd
import libc.cinterop.libc_fdatasync
import libc.cinterop.libc_futimens
import libc.cinterop.libc_memalign
import libc.cinterop.libc_mkostemp
import libc.cinterop.libc_mkostemps
import libc.cinterop.libc_uname
import libc.cinterop.libc_utimensat
import libc.cinterop.libc_vfork

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires manual FFI bridge — not yet implemented")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun fDCLR(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR requires manual FFI bridge — not yet implemented")

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")

public actual fun sIGRTMAX(): Int =
    throw UnsupportedOperationException("sIGRTMAX requires manual FFI bridge — not yet implemented")

public actual fun sIGRTMIN(): Int =
    throw UnsupportedOperationException("sIGRTMIN requires manual FFI bridge — not yet implemented")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun libcCurrentSigrtmax(): Int =
    throw UnsupportedOperationException("libcCurrentSigrtmax requires manual FFI bridge — not yet implemented")

public actual fun libcCurrentSigrtmin(): Int =
    throw UnsupportedOperationException("libcCurrentSigrtmin requires manual FFI bridge — not yet implemented")

public actual fun semDestroy(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun fdatasync(fd: Int): Int =
    libc.cinterop.libc_fdatasync(fd)

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: COpaquePointer?): Int =
    throw UnsupportedOperationException("mincore requires FFI bridge")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires FFI bridge")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires FFI bridge")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires FFI bridge")

public actual fun clockGetcpuclockid(pid: Int, clkId: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer requires manual FFI bridge — not yet implemented")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): Int =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: ULong, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 requires manual FFI bridge — not yet implemented")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: Int, times: Timespec?): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_futimens(fd, timesPtr)
    return result
}

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_utimensat(dirfd, path, timesPtr, flag)
    return result
}

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun clearenv(): Int =
    libc.cinterop.libc_clearenv()

public actual fun waitid(idtype: Int, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int =
    throw UnsupportedOperationException("getresuid requires manual FFI bridge — not yet implemented")

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int =
    throw UnsupportedOperationException("getresgid requires manual FFI bridge — not yet implemented")

public actual fun acct(filename: String?): Int {
    if (filename == null) return -1
    return libc.cinterop.libc_acct(filename)
}

public actual fun brk(addr: COpaquePointer?): Int =
    throw UnsupportedOperationException("brk requires manual FFI bridge — not yet implemented")

public actual fun sbrk(increment: Long): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires manual FFI bridge — not yet implemented")

public actual fun vfork(): Int =
    libc.cinterop.libc_vfork()

public actual fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int =
    throw UnsupportedOperationException("setresgid requires manual FFI bridge — not yet implemented")

public actual fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int =
    throw UnsupportedOperationException("setresuid requires manual FFI bridge — not yet implemented")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 requires manual FFI bridge — not yet implemented")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty requires manual FFI bridge — not yet implemented")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve requires manual FFI bridge — not yet implemented")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs requires manual FFI bridge — not yet implemented")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires FFI bridge")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires FFI bridge")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    memScoped {
        if (msg == null) return libc.cinterop.libc_sendmsg_simple(fd, null, 0, null, 0uL, null, 0uL, flags)
        val namePtr = msg.msgName?.value?.toCPointer<ByteVar>()
        val iovBase = msg.msgIov?.value?.toCPointer<ByteVar>()
        val iovLen = msg.msgIovlen
        val ctlPtr = msg.msgControl?.value?.toCPointer<ByteVar>()
        libc.cinterop.libc_sendmsg_simple(fd, namePtr, msg.msgNamelen.toInt(), iovBase, iovLen, ctlPtr, msg.msgControllen, flags)
    }

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    memScoped {
        if (msg == null) return libc.cinterop.libc_recvmsg_simple(fd, null, null, null, 0uL, null, null, null, flags)
        val namePtr = msg.msgName?.value?.toCPointer<ByteVar>()
        val nameLenVar = alloc<IntVar>()
        nameLenVar.value = msg.msgNamelen.toInt()
        val iovBase = msg.msgIov?.value?.toCPointer<ByteVar>()
        val iovLen = msg.msgIovlen
        val ctlPtr = msg.msgControl?.value?.toCPointer<ByteVar>()
        val ctlLenVar = alloc<ULongVar>()
        ctlLenVar.value = msg.msgControllen
        val flagsVar = alloc<IntVar>()
        libc.cinterop.libc_recvmsg_simple(fd, namePtr, nameLenVar.ptr, iovBase, iovLen, ctlPtr, ctlLenVar.ptr, flagsVar.ptr, flags)
    }

public actual fun uname(buf: Utsname?): Int {
    if (buf == null) return -1
    if (buf.handle != 0L) {
        val bufPtr: CPointer<ByteVar>? = buf.handle.toCPointer()
        libc_uname(bufPtr)
    }
    return memScoped {
        val sys = allocArray<ByteVar>(256)
        val node = allocArray<ByteVar>(256)
        val rel = allocArray<ByteVar>(256)
        val ver = allocArray<ByteVar>(256)
        val mach = allocArray<ByteVar>(256)
        val dom = allocArray<ByteVar>(256)
        val rc =
            libc.cinterop.libc_uname_fields(
                sys,
                256uL,
                node,
                256uL,
                rel,
                256uL,
                ver,
                256uL,
                mach,
                256uL,
                dom,
                256uL,
            )
        if (rc >= 0) {
            for (i in 0 until minOf(256, buf.sysname.size)) buf.sysname[i] = sys[i]
            for (i in 0 until minOf(256, buf.nodename.size)) buf.nodename[i] = node[i]
            for (i in 0 until minOf(256, buf.release.size)) buf.release[i] = rel[i]
            for (i in 0 until minOf(256, buf.version.size)) buf.version[i] = ver[i]
            for (i in 0 until minOf(256, buf.machine.size)) buf.machine[i] = mach[i]
            for (i in 0 until minOf(256, buf.domainname.size)) buf.domainname[i] = dom[i]
        }
        rc
    }
}

public actual fun strchrnul(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strchrnul requires manual FFI bridge — not yet implemented")

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun strftimeL(s: String?, max: ULong, format: String?, tm: Tm?, locale: io.github.kotlinmania.libc.COpaquePointer?): ULong =
    throw UnsupportedOperationException("strftimeL requires manual FFI bridge — not yet implemented")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires manual FFI bridge — not yet implemented")

public actual fun mkostemp(template: String?, flags: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkostemp(template, flags)
}

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkostemps(template, suffixlen, flags)
}

public actual fun getdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("getdomainname requires FFI bridge")

public actual fun setdomainname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("setdomainname requires FFI bridge")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires manual FFI bridge — not yet implemented")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex requires manual FFI bridge — not yet implemented")

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
            pwd.pwGecos = gecosBuf.toKString()
            pwd.pwDir = dirBuf.toKString()
            pwd.pwShell = shellBuf.toKString()
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
            pwd.pwGecos = gecosBuf.toKString()
            pwd.pwDir = dirBuf.toKString()
            pwd.pwShell = shellBuf.toKString()
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

public actual fun fstatfs64(fd: Int, buf: Statfs64?): Int =
    throw UnsupportedOperationException("fstatfs64 requires manual FFI bridge — not yet implemented")

public actual fun statvfs64(path: String?, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("statvfs64 requires manual FFI bridge — not yet implemented")

public actual fun fstatvfs64(fd: Int, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("fstatvfs64 requires manual FFI bridge — not yet implemented")

public actual fun statfs64(path: String?, buf: Statfs64?): Int =
    throw UnsupportedOperationException("statfs64 requires manual FFI bridge — not yet implemented")

public actual fun creat64(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat64 requires manual FFI bridge — not yet implemented")

public actual fun fstatat64(dirfd: Int, pathname: String?, buf: Stat64?, flags: Int): Int =
    throw UnsupportedOperationException("fstatat64 requires manual FFI bridge — not yet implemented")

public actual fun ftruncate64(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate64 requires manual FFI bridge — not yet implemented")

public actual fun lseek64(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek64 requires manual FFI bridge — not yet implemented")

public actual fun mmap64(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap64 requires manual FFI bridge — not yet implemented")

public actual fun openat64(fd: Int, path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat64 requires manual FFI bridge — not yet implemented")

public actual fun posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise64 requires manual FFI bridge — not yet implemented")

public actual fun pread64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread64 requires manual FFI bridge — not yet implemented")

public actual fun pwrite64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite64 requires manual FFI bridge — not yet implemented")

public actual fun readdir64(dirp: DIR?): Dirent64? =
    throw UnsupportedOperationException("readdir64 requires manual FFI bridge — not yet implemented")

public actual fun readdir64R(dirp: DIR?, entry: Dirent64?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdir64R requires manual FFI bridge — not yet implemented")

public actual fun truncate64(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate64 requires manual FFI bridge — not yet implemented")

public actual fun preadv64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv64 requires manual FFI bridge — not yet implemented")

public actual fun pwritev64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev64 requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun statx(dirfd: Int, pathname: String?, flags: Int, mask: UInt, statxbuf: Statx?): Int =
    throw UnsupportedOperationException("statx requires manual FFI bridge — not yet implemented")

public actual fun fstat64(fildes: Int, buf: Stat64?): Int =
    throw UnsupportedOperationException("fstat64 requires manual FFI bridge — not yet implemented")

public actual fun lstat64(path: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("lstat64 requires manual FFI bridge — not yet implemented")

public actual fun open64(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open64 requires manual FFI bridge — not yet implemented")

public actual fun stat64(path: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("stat64 requires manual FFI bridge — not yet implemented")
