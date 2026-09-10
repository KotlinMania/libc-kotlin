// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer

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

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt {
    val result = libc_strerror_r(errnum, buf, buflen)
    return result
}

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

public actual fun getgrent(): Group? {
    val result = libc_getgrent()
    return result
}

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires manual FFI bridge — not yet implemented")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent requires manual FFI bridge — not yet implemented")
}

public actual fun getgrgid(gid: GidT): Group? {
    val result = libc_getgrgid(gid.toInt())
    return result
}

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? {
    val result = libc_getgrnam(name)
    return result
}

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt {
    val result = libc_getgrouplist(user, group.toInt(), groups.toInt(), ngroups)
    return result
}

public actual fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer? {
    val result = libc_memalign(blockSize, sizeArg)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun getnameinfo(addr: Sockaddr?, addrlen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun getpwent(): Passwd? {
    val result = libc_getpwent()
    return result
}

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent requires manual FFI bridge — not yet implemented")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent requires manual FFI bridge — not yet implemented")
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
    throw UnsupportedOperationException("pthreadKill requires manual FFI bridge — not yet implemented")

public actual fun sigtimedwait(set: SigsetT?, sig: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")

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
public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt {
    val result = libc_shm_open(name, oflag, mode.toInt())
    return result
}

public actual fun shmUnlink(name: String?): CInt {
    val result = libc_shm_unlink(name)
    return result
}

public actual fun getpriority(which: CInt, who: IdT): CInt {
    val result = libc_getpriority(which, who.toInt())
    return result
}

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt {
    val result = libc_setpriority(which, who.toInt(), prio)
    return result
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    if (rlim == null) return -1
    val rlimPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc_getrlimit(resource, rlimPtr)
    return result
}

public actual fun setrlimit(resource: CInt, rlp: Rlimit?): CInt {
    if (rlp == null) return -1
    val rlpPtr: CPointer<ByteVar>? = rlp.handle.toCPointer()
    val result = libc_setrlimit(resource, rlpPtr)
    return result
}

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires manual FFI bridge — not yet implemented")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun recvmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge — not yet implemented")

public actual fun sendmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: CInt, times: Timespec?): CInt {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_futimens(fd, timesPtr)
    return result
}

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_preadv(fd, iovPtr, iovcnt, offset)
    return result
}

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_pwritev(fd, iovPtr, iovcnt, offset)
    return result
}

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_readv(fd, iovPtr, iovcnt)
    return result
}

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_writev(fd, iovPtr, iovcnt)
    return result
}

public actual fun uname(buf: Utsname?): CInt {
    if (buf == null) return -1
    val bufPtr: CPointer<ByteVar>? = buf.handle.toCPointer()
    val result = libc_uname(bufPtr)
    return result
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    val result = libc_clock_gettime(clockId, tpPtr)
    return result
}

public actual fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires manual FFI bridge — not yet implemented")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(tid: PthreadT, attr: PthreadAttrT?, start: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")
