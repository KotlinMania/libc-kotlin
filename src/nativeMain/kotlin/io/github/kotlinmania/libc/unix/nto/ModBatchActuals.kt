// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_posix_madvise
import libc.cinterop.libc_sysctl
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toLong
import kotlinx.cinterop.useContents
import libc.cinterop.libc_cmsg_data
import libc.cinterop.libc_cmsg_firsthdr
import libc.cinterop.libc_cmsg_nxthdr
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.ptr
import libc.cinterop.libc_accept4
import libc.cinterop.libc_bind
import libc.cinterop.libc_forkpty
import libc.cinterop.libc_getnameinfo
import libc.cinterop.libc_openpty
import libc.cinterop.libc_pthread_condattr_getclock
import libc.cinterop.libc_pthread_condattr_setclock
import libc.cinterop.libc_pthread_setschedparam
import libc.cinterop.libc_pthread_sigmask
import libc.cinterop.libc_recvfrom
import libc.cinterop.libc_recvmsg
import libc.cinterop.libc_sched_getparam
import libc.cinterop.libc_sched_setparam
import libc.cinterop.libc_sched_setscheduler
import libc.cinterop.libc_sendmsg
import libc.cinterop.libc_sigwait
import libc.cinterop.libc_sigsuspend
import libc.cinterop.libc_waitid

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? {
    if (mhdr == null) return null
    return memScoped {
        val mhdrPtr = alloc<platform.posix.msghdr>()
        mhdrPtr.msg_name = mhdr.msgName?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_namelen = mhdr.msgNamelen.toUInt()
        mhdrPtr.msg_iovlen = mhdr.msgIovlen.toULong()
        mhdrPtr.msg_control = mhdr.msgControl?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_controllen = mhdr.msgControllen.toULong()
        mhdrPtr.msg_flags = mhdr.msgFlags
        val result = libc_cmsg_firsthdr(mhdrPtr.ptr)
        if (result == null) null
        else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
    }
}

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if (mhdr == null) return null
    return memScoped {
        val mhdrPtr = alloc<platform.posix.msghdr>()
        mhdrPtr.msg_name = mhdr.msgName?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_namelen = mhdr.msgNamelen.toUInt()
        mhdrPtr.msg_iovlen = mhdr.msgIovlen.toULong()
        mhdrPtr.msg_control = mhdr.msgControl?.value?.toCPointer<ByteVar>()
        mhdrPtr.msg_controllen = mhdr.msgControllen.toULong()
        mhdrPtr.msg_flags = mhdr.msgFlags
        if (cmsg == null) {
            val result = libc_cmsg_firsthdr(mhdrPtr.ptr)
            if (result == null) null
            else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
        } else {
            val cmsgPtr = alloc<platform.posix.cmsghdr>()
            cmsgPtr.cmsg_len = cmsg.cmsgLen.toULong()
            cmsgPtr.cmsg_level = cmsg.cmsgLevel
            cmsgPtr.cmsg_type = cmsg.cmsgType
            val result = libc_cmsg_nxthdr(mhdrPtr.ptr, cmsgPtr.ptr)
            if (result == null) null
            else result.reinterpret<platform.posix.cmsghdr>().useContents { Cmsghdr(cmsg_len.toUInt(), cmsg_level, cmsg_type) }
        }
    }
}

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? {
    if (cmsg == null) return null
    return memScoped {
        val cPtr = alloc<platform.posix.cmsghdr>()
        cPtr.cmsg_len = cmsg.cmsgLen.toULong()
        cPtr.cmsg_level = cmsg.cmsgLevel
        cPtr.cmsg_type = cmsg.cmsgType
        val result = libc_cmsg_data(cPtr.ptr)
        if (result == null) null else COpaquePointer(result.toLong())
    }
}

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires manual FFI bridge — not yet implemented")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")
}

public actual fun dEXTRAFIRST(d: Dirent?): DirentExtra? =
    throw UnsupportedOperationException("dEXTRAFIRST requires manual FFI bridge — not yet implemented")

public actual fun dEXTRAVALID(x: DirentExtra?, d: Dirent?): Boolean =
    throw UnsupportedOperationException("dEXTRAVALID requires manual FFI bridge — not yet implemented")

public actual fun dEXTRANEXT(x: DirentExtra?): DirentExtra? =
    throw UnsupportedOperationException("dEXTRANEXT requires manual FFI bridge — not yet implemented")

public actual fun sOCKCREDSIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE requires manual FFI bridge — not yet implemented")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun fdatasync(fd: CInt): CInt =
    libc.cinterop.libc_fdatasync(fd)
public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc.cinterop.libc_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc.cinterop.libc_setpriority(which, who, prio)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc.cinterop.libc_mkfifoat_int(dirfd, pathname, mode.toInt())
public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc.cinterop.libc_mknodat(fd, pathname, mode.toInt(), dev.toULong())

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_getres(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_gettime(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_settime(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    libc.cinterop.libc_futimens(fd, times?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun nlLanginfo(item: NlItem): String? =
    libc.cinterop.libc_nl_langinfo(item)?.toKString()

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    libc.cinterop.libc_utimensat(dirfd, path, times?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), flag)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    memScoped {
        val cAttr = if (attr != null) {
            alloc<platform.posix.pthread_condattr_t>().ptr
        } else null
        val clkIdPtr = alloc<IntVar>()
        libc_pthread_condattr_getclock(cAttr, clkIdPtr.ptr)
    }

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    memScoped {
        val cAttr = if (attr != null) {
            alloc<platform.posix.pthread_condattr_t>().ptr
        } else null
        libc_pthread_condattr_setclock(cAttr, clockId)
    }

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): String? =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    memScoped {
        val cInfop = if (infop != null) {
            val ptr = alloc<platform.posix.siginfo_t>()
            ptr.si_signo = infop.siSigno
            ptr.si_code = infop.siCode
            ptr.si_errno = infop.siErrno
            ptr.ptr
        } else null
        libc_waitid(idtype.toInt(), id.toInt(), cInfop, options)
    }

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 requires manual FFI bridge — not yet implemented")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs requires manual FFI bridge — not yet implemented")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs requires manual FFI bridge — not yet implemented")
}

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    memScoped {
        val cAddr = if (address != null) {
            val ptr = alloc<platform.posix.sockaddr>()
            ptr.sa_family = address.saFamily.toUShort()
            for (i in address.saData.indices) {
                ptr.sa_data[i] = address.saData[i]
            }
            ptr.ptr
        } else null
        libc_bind(socket, cAddr, addressLen.toInt())
    }

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_writev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_readv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    memScoped {
        val cMsg = if (msg != null) {
            val ptr = alloc<platform.posix.msghdr>()
            ptr.msg_name = msg.msgName?.value?.toCPointer<ByteVar>()
            ptr.msg_namelen = msg.msgNamelen.toUInt()
            ptr.msg_iovlen = msg.msgIovlen.toULong()
            ptr.msg_control = msg.msgControl?.value?.toCPointer<ByteVar>()
            ptr.msg_controllen = msg.msgControllen.toULong()
            ptr.msg_flags = msg.msgFlags
            ptr.ptr
        } else null
        libc_sendmsg(fd, cMsg, flags)
    }

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    memScoped {
        val cMsg = if (msg != null) {
            val ptr = alloc<platform.posix.msghdr>()
            ptr.msg_name = msg.msgName?.value?.toCPointer<ByteVar>()
            ptr.msg_namelen = msg.msgNamelen.toUInt()
            ptr.msg_iovlen = msg.msgIovlen.toULong()
            ptr.msg_control = msg.msgControl?.value?.toCPointer<ByteVar>()
            ptr.msg_controllen = msg.msgControllen.toULong()
            ptr.msg_flags = msg.msgFlags
            ptr.ptr
        } else null
        libc_recvmsg(fd, cMsg, flags)
    }

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    memScoped {
        val cAmaster = alloc<IntVar>()
        val cAslave = alloc<IntVar>()
        val cName = if (name != null) allocArray<ByteVar>(name.length + 1) else null
        val cTermp = if (termp != null) alloc<platform.posix.termios>().ptr else null
        val cWinp = if (winp != null) {
            val ptr = alloc<platform.posix.winsize>()
            ptr.ws_row = winp.wsRow
            ptr.ws_col = winp.wsCol
            ptr.ws_xpixel = winp.wsXpixel
            ptr.ws_ypixel = winp.wsYpixel
            ptr.ptr
        } else null
        libc_openpty(cAmaster.ptr, cAslave.ptr, cName, cTermp, cWinp)
    }

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    memScoped {
        val cAmaster = alloc<IntVar>()
        val cName = if (name != null) allocArray<ByteVar>(name.length + 1) else null
        val cTermp = if (termp != null) alloc<platform.posix.termios>().ptr else null
        val cWinp = if (winp != null) {
            val ptr = alloc<platform.posix.winsize>()
            ptr.ws_row = winp.wsRow
            ptr.ws_col = winp.wsCol
            ptr.ws_xpixel = winp.wsXpixel
            ptr.ws_ypixel = winp.wsYpixel
            ptr.ptr
        } else null
        libc_forkpty(cAmaster.ptr, cName, cTermp, cWinp)
    }

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): CInt =
    libc.cinterop.libc_uname(buf?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    throw UnsupportedOperationException("getpeereid requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun abs(i: CInt): CInt =
    libc.cinterop.libc_abs(i)
public actual fun labs(i: CLong): CLong =
    libc.cinterop.libc_labs(i)
public actual fun rand(): CInt =
    libc.cinterop.libc_rand()
public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun setpwent() {
    libc.cinterop.libc_setpwent()
}

public actual fun endpwent() {
    libc.cinterop.libc_endpwent()
}

public actual fun getpwent(): Passwd? =
    libc.cinterop.libc_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    libc.cinterop.libc_setgrent()
}

public actual fun endgrent() {
    libc.cinterop.libc_endgrent()
}

public actual fun getgrent(): Group? =
    libc.cinterop.libc_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setspent() {
    throw UnsupportedOperationException("setspent requires manual FFI bridge — not yet implemented")
}

public actual fun endspent() {
    throw UnsupportedOperationException("endspent requires manual FFI bridge — not yet implemented")
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc.cinterop.libc_shm_open(name, oflag, mode.toInt())

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc.cinterop.libc_posix_fallocate(fd, offset, len)

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    libc.cinterop.libc_mkostemp(template, flags)
public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    libc.cinterop.libc_mkostemps(template, suffixlen, flags)
public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    libc.cinterop.libc_sigtimedwait(set?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), info?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), timeout?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetschedprio requires manual FFI bridge — not yet implemented")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires manual FFI bridge — not yet implemented")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex requires manual FFI bridge — not yet implemented")
}

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires manual FFI bridge — not yet implemented")
}

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt {
    val cPtr: CPointer<ByteVar>? = addr?.value?.toCPointer()
    return libc.cinterop.libc_posix_madvise(cPtr, len, advice)
}

public actual fun shmUnlink(name: String?): CInt =
    libc.cinterop.libc_shm_unlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")
}

public actual fun telldir(dirp: DIR?): CLong =
    libc.cinterop.libc_telldir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, flags)
public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    memScoped {
        val cBuf = buf?.value?.toCPointer<ByteVar>()
        val cAddr = if (addr != null) {
            val ptr = alloc<platform.posix.sockaddr>()
            ptr.sa_family = addr.saFamily.toUShort()
            for (i in addr.saData.indices) {
                ptr.sa_data[i] = addr.saData[i]
            }
            ptr.ptr
        } else null
        val cAddrLen = if (addrlen != null) alloc<UIntVar>().also { it.value = addrlen.toUInt() }.ptr else null
        libc_recvfrom(socket, cBuf, len, flags, cAddr, cAddrLen)
    }

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    libc.cinterop.libc_mkstemps(template, suffixlen)
public actual fun getdomainname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_getdomainname(name, len)
public actual fun setdomainname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_setdomainname(name, len)
public actual fun sync() {
    throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun umount(target: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("umount requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_max(policy)

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    libc.cinterop.libc_settimeofday(tv?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    libc.cinterop.libc_sem_timedwait(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), abstime?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    memScoped {
        val cParam = if (param != null) {
            val ptr = alloc<platform.posix.sched_param>()
            ptr.sched_priority = param.schedPriority
            ptr.ptr
        } else null
        libc_sched_setparam(pid, cParam)
    }

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    memScoped {
        val cParam = if (param != null) {
            val ptr = alloc<platform.posix.sched_param>()
            ptr.sched_priority = param.schedPriority
            ptr.ptr
        } else null
        libc_sched_getparam(pid, cParam)
    }

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexConsistent requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    libc.cinterop.libc_pthread_mutex_timedlock(lock?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), abstime?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    libc.cinterop.libc_pthread_spin_init(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_destroy(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_lock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_trylock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_unlock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: PidT): CInt =
    libc.cinterop.libc_sched_getscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    libc.cinterop.libc_clock_nanosleep(clkId, flags, rqtp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), rmtp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun sethostname(name: String?, len: ULong): CInt =
    libc.cinterop.libc_sethostname(name, len)
public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc.cinterop.libc_sched_get_priority_min(policy)

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    memScoped {
        val cParam = if (param != null) {
            val ptr = alloc<platform.posix.sched_param>()
            ptr.sched_priority = param.schedPriority
            ptr.ptr
        } else null
        libc_pthread_setschedparam(native.toLong(), policy, cParam)
    }

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    memScoped {
        val cParam = if (param != null) {
            val ptr = alloc<platform.posix.sched_param>()
            ptr.sched_priority = param.schedPriority
            ptr.ptr
        } else null
        libc_sched_setscheduler(pid, policy, cParam)
    }

public actual fun sigsuspend(mask: SigsetT?): CInt =
    memScoped {
        val cMask = if (mask != null) {
            val ptr = alloc<platform.posix.sigset_t>()
            val bytePtr = ptr.reinterpret<ByteVar>()
            val maskBytes = mask.value.flatMap { it.toUByteArray().asIterable() }.toByteArray()
            for (i in maskBytes.indices) {
                bytePtr[i] = maskBytes[i]
            }
            ptr.ptr
        } else null
        libc_sigsuspend(cMask)
    }

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun getdtablesize(): CInt =
    libc.cinterop.libc_getdtablesize()
public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun initgroups(user: String?, group: GidT): CInt =
    libc.cinterop.libc_initgroups(user, group.toInt())
public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    memScoped {
        val cSet = if (set != null) {
            val ptr = alloc<platform.posix.sigset_t>()
            val bytePtr = ptr.reinterpret<ByteVar>()
            val setBytes = set.value.flatMap { it.toUByteArray().asIterable() }.toByteArray()
            for (i in setBytes.indices) {
                bytePtr[i] = setBytes[i]
            }
            ptr.ptr
        } else null
        val cOldset = if (oldset != null) alloc<platform.posix.sigset_t>().ptr else null
        libc_pthread_sigmask(how, cSet, cOldset)
    }

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    libc.cinterop.libc_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires manual FFI bridge — not yet implemented")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc.cinterop.libc_pthread_kill(thread.toLong().toCPointer<kotlinx.cinterop.ByteVar>(), sig)

public actual fun semUnlink(name: String?): CInt =
    libc.cinterop.libc_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc.cinterop.libc_daemon(nochdir, noclose)
public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires manual FFI bridge — not yet implemented")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires manual FFI bridge — not yet implemented")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    memScoped {
        val cSet = if (set != null) {
            val ptr = alloc<platform.posix.sigset_t>()
            val bytePtr = ptr.reinterpret<ByteVar>()
            val setBytes = set.value.flatMap { it.toUByteArray().asIterable() }.toByteArray()
            for (i in setBytes.indices) {
                bytePtr[i] = setBytes[i]
            }
            ptr.ptr
        } else null
        val sigPtr = alloc<IntVar>()
        libc_sigwait(cSet, sigPtr.ptr)
    }

public actual fun getgrgid(gid: GidT): Group? =
    libc.cinterop.libc_getgrgid(gid.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires GidT? pointer bridge — not yet implemented"), groups?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), ngroups?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robustness: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires manual FFI bridge — not yet implemented")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer requires manual FFI bridge — not yet implemented")

public actual fun setitimer(which: CInt, value: Itimerval?, ovalue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer requires manual FFI bridge — not yet implemented")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires manual FFI bridge — not yet implemented")

public actual fun popen(command: String?, mode: String?): FILE? =
    libc.cinterop.libc_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    throw UnsupportedOperationException("inotifyRmWatch requires manual FFI bridge — not yet implemented")

public actual fun inotifyInit(): CInt =
    throw UnsupportedOperationException("inotifyInit requires manual FFI bridge — not yet implemented")

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    throw UnsupportedOperationException("inotifyAddWatch requires manual FFI bridge — not yet implemented")

public actual fun gettid(): PidT =
    throw UnsupportedOperationException("gettid requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    memScoped {
        val cSa = if (sa != null) {
            val ptr = alloc<platform.posix.sockaddr>()
            ptr.sa_family = sa.saFamily.toUShort()
            for (i in sa.saData.indices) {
                ptr.sa_data[i] = sa.saData[i]
            }
            ptr.ptr
        } else null
        val cHost = if (hostlen > 0U) allocArray<ByteVar>(hostlen.toInt()) else null
        val cServ = if (servlen > 0U) allocArray<ByteVar>(servlen.toInt()) else null
        libc_getnameinfo(cSa, salen.toUInt(), cHost, hostlen.toUInt(), cServ, servlen.toUInt(), flags)
    }

public actual fun mallopt(param: CInt, value: Long): CInt =
    throw UnsupportedOperationException("mallopt requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    libc.cinterop.libc_gettimeofday(tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires manual FFI bridge — not yet implemented")

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun getpwentR(pwd: Passwd?, buf: String?, bufsize: CInt, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires PthreadT bridge — not yet implemented"), name)

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt {
    val oldPtr: CPointer<ByteVar>? = oldp?.value?.toCPointer()
    val newPtr: CPointer<ByteVar>? = newp?.value?.toCPointer()
    return libc.cinterop.libc_sysctl(name, namelen, oldPtr, oldlenp, newPtr, newlen)
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_getrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun setrlimit(resource: CInt, rlp: Rlimit?): CInt =
    libc.cinterop.libc_setrlimit(resource, rlp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt =
    throw UnsupportedOperationException("memsetS requires manual FFI bridge — not yet implemented")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp requires manual FFI bridge — not yet implemented")

public actual fun regexec(preg: RegexT?, str: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec requires manual FFI bridge — not yet implemented")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires manual FFI bridge — not yet implemented")

public actual fun regfree(preg: RegexT?) {
    throw UnsupportedOperationException("regfree requires manual FFI bridge — not yet implemented")
}

public actual fun dirfd(dirp: DIR?): CInt =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun dircntl(dir: DIR?, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("dircntl requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(operation: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocpb: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocpb: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun mqClose(mqdes: MqdT): CInt =
    throw UnsupportedOperationException("mqClose requires manual FFI bridge — not yet implemented")

public actual fun mqGetattr(mqdes: MqdT, mqstat: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr requires manual FFI bridge — not yet implemented")

public actual fun mqNotify(mqdes: MqdT, notification: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify requires manual FFI bridge — not yet implemented")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen requires manual FFI bridge — not yet implemented")

public actual fun mqReceive(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive requires manual FFI bridge — not yet implemented")

public actual fun mqSend(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend requires manual FFI bridge — not yet implemented")

public actual fun mqSetattr(mqdes: MqdT, mqstat: MqAttr?, omqstat: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr requires manual FFI bridge — not yet implemented")

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive requires manual FFI bridge — not yet implemented")

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend requires manual FFI bridge — not yet implemented")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink requires manual FFI bridge — not yet implemented")

public actual fun getErrnoPtr(): CInt? =
    throw UnsupportedOperationException("getErrnoPtr requires manual FFI bridge — not yet implemented")

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
    throw UnsupportedOperationException("myThreadExit requires manual FFI bridge — not yet implemented")
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt =
    throw UnsupportedOperationException("glob requires manual FFI bridge — not yet implemented")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")

public actual fun cxaAtexit(cb: (() -> Unit)?, arg: COpaquePointer?, dso: COpaquePointer?): CInt =
    throw UnsupportedOperationException("cxaAtexit requires manual FFI bridge — not yet implemented")
