// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toLong
import kotlinx.cinterop.useContents
import libc.cinterop.libc_cmsg_data
import libc.cinterop.libc_cmsg_firsthdr
import libc.cinterop.libc_cmsg_nxthdr

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

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): CInt =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires manual FFI bridge — not yet implemented")

public actual fun getdtablesize(): CInt =
    libc.cinterop.libc_getdtablesize()
public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid requires manual FFI bridge — not yet implemented")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid requires manual FFI bridge — not yet implemented")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid requires manual FFI bridge — not yet implemented")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid requires manual FFI bridge — not yet implemented")

public actual fun getgrent(): Group? =
    libc.cinterop.libc_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    libc.cinterop.libc_setgrent()
}

public actual fun endgrent() {
    libc.cinterop.libc_endgrent()
}

public actual fun getgrgid(gid: GidT): Group? =
    libc.cinterop.libc_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    libc.cinterop.libc_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires GidT? pointer bridge — not yet implemented"), groups?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), ngroups?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(addr: Sockaddr?, addrlen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun getpwent(): Passwd? =
    libc.cinterop.libc_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    libc.cinterop.libc_setpwent()
}

public actual fun endpwent() {
    libc.cinterop.libc_endpwent()
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires manual FFI bridge — not yet implemented")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires manual FFI bridge — not yet implemented")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc.cinterop.libc_pthread_kill(thread?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), sig)

public actual fun sigtimedwait(set: SigsetT?, sig: SiginfoT?, timeout: Timespec?): CInt =
    libc.cinterop.libc_sigtimedwait(set?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), sig?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), timeout?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    libc.cinterop.libc_getsubopt(optionp?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), tokens?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), valuep?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun mkostemp(template: String?, flags: CInt): CInt =
    libc.cinterop.libc_mkostemp(template, flags)
public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    libc.cinterop.libc_mkostemps(template, suffixlen, flags)
public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires manual FFI bridge — not yet implemented")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameat2 requires manual FFI bridge — not yet implemented")

public actual fun explicitBzero(p: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires manual FFI bridge — not yet implemented")
}

public actual fun strlcat(dst: String?, src: String?, siz: ULong): ULong =
    libc.cinterop.libc_strlcat(dst, src, siz)
public actual fun strlcpy(dst: String?, src: String?, siz: ULong): ULong =
    libc.cinterop.libc_strlcpy(dst, src, siz)
public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("epollCreate requires manual FFI bridge — not yet implemented")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("epollCreate1 requires manual FFI bridge — not yet implemented")

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("epollWait requires manual FFI bridge — not yet implemented")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    throw UnsupportedOperationException("epollCtl requires manual FFI bridge — not yet implemented")

public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    libc.cinterop.libc_madvise(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, advice)
public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    libc.cinterop.libc_msync(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, flags)
public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    libc.cinterop.libc_mprotect(addr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), len, prot)
public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc.cinterop.libc_shm_open(name, oflag, mode.toInt())

public actual fun shmUnlink(name: String?): CInt =
    libc.cinterop.libc_shm_unlink(name)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc.cinterop.libc_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc.cinterop.libc_setpriority(which, who.toInt(), prio)

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_getrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_setrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

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

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun recvmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge — not yet implemented")

public actual fun sendmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    libc.cinterop.libc_futimens(fd, times?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    libc.cinterop.libc_preadv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    libc.cinterop.libc_pwritev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt, offset)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_readv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    libc.cinterop.libc_writev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt)

public actual fun uname(utsname: Utsname?): CInt =
    libc.cinterop.libc_uname(utsname?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    libc.cinterop.libc_gettimeofday(tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_gettime(clkId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires manual FFI bridge — not yet implemented")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(tid: PthreadT, attr: PthreadAttrT?, start: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")
