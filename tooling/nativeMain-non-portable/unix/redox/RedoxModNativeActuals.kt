@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): CInt? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_errno_location()?.let { COpaquePointer(it.toLong()) }

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getdtablesize()

public actual fun getresgid(rgid: CInt?, egid: CInt?, sgid: CInt?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun getresuid(ruid: CInt?, euid: CInt?, suid: CInt?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_setresuid(ruid, euid, suid)

public actual fun getgrent(): Group? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_endgrent()
}

public actual fun getgrgid(gid: io.github.kotlinmania.libc.GidT): Group? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: CInt?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getnameinfo(addr?.value?.toCPointer<ByteVar>(), addrlen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun pthreadCreate(tid: COpaquePointer?, attr: io.github.kotlinmania.libc.PthreadAttrT?, start: PthreadCreateStartCallback, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_pthread_create(tid?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), start.toInt(), arg?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getpwent(): Passwd? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_endpwent()
}

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: CUlonglong?, oldset: CUlonglong?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_pthread_cancel(thread?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_pthread_kill(thread?.value?.toCPointer<ByteVar>(), sig)

public actual fun sigtimedwait(set: CUlonglong?, sig: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: CUlonglong?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getsubopt(optionp?.value?.toCPointer<ByteVar>(), tokens?.value?.toCPointer<ByteVar>(), valuep?.value?.toCPointer<ByteVar>())

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_renameat2(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun explicitBzero(p: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_explicit_bzero(p?.value?.toCPointer<ByteVar>(), len)
}

public actual fun strlcat(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_strlcat(dst?.value?.toCPointer<ByteVar>(), src, siz)

public actual fun strlcpy(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_strlcpy(dst?.value?.toCPointer<ByteVar>(), src, siz)

public actual fun epollCreate(size: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_epoll_create(size)

public actual fun epollCreate1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_epoll_create1(flags)

public actual fun epollWait(epfd: CInt, events: io.github.kotlinmania.libc.EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_epoll_wait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: io.github.kotlinmania.libc.EpollEvent?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_epoll_ctl(epfd, op, fd, event?.value?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_shm_open(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_shm_unlink(name)

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getpriority(which, who)

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_setpriority(which, who, prio)

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun cmsgData(cmsg: Cmsghdr?): CUchar? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_cmsg_data(cmsg?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_cmsg_firsthdr(mhdr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_cmsg_nxthdr(mhdr?.value?.toCPointer<ByteVar>(), cmsg?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_recvmsg(socket, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_sendmsg(socket, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun uname(utsname: Utsname?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_uname(utsname?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_strftime(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_redox_mod_login_tty(fd)
