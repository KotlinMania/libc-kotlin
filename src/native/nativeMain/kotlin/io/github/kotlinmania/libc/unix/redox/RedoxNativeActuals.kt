@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getdtablesize()

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_setresuid(ruid, euid, suid)

public actual fun getgrent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_setgrent()
}

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_endgrent()
}

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(addr: COpaquePointer?, addrlen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getnameinfo(addr?.value?.toCPointer<ByteVar>(), addrlen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun pthreadAtfork(prepare: FnCallback?, parent: FnCallback?, child: FnCallback?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadCreate(tid: COpaquePointer?, attr: COpaquePointer?, start: FnCallback1, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_pthreadCreate(tid?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getpwent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_setpwent()
}

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_endpwent()
}

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_pthreadCancel(thread?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_pthreadKill(thread?.value?.toCPointer<ByteVar>(), sig)

public actual fun sigtimedwait(set: COpaquePointer?, sig: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_sigtimedwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getsubopt(optionp?.value?.toCPointer<ByteVar>(), tokens?.value?.toCPointer<ByteVar>(), valuep?.value?.toCPointer<ByteVar>())

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_reallocarray(ptr?.value?.toCPointer<ByteVar>(), nmemb, size)?.let { COpaquePointer(it.toLong()) }

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_renameat2(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun explicitBzero(p: COpaquePointer?, len: SizeT) {
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_explicitBzero(p?.value?.toCPointer<ByteVar>(), len)
}

public actual fun strlcat(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_strlcat(dst?.value?.toCPointer<ByteVar>(), src, siz)

public actual fun strlcpy(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_strlcpy(dst?.value?.toCPointer<ByteVar>(), src, siz)

public actual fun epollCreate(size: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_epollWait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_epollCtl(epfd, op, fd, event?.value?.toCPointer<ByteVar>())

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    0

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_shmUnlink(name)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_setpriority(which, who, prio)

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun cmsgData(cmsg: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_cmsgData(cmsg?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cmsgFirsthdr(mhdr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_cmsgFirsthdr(mhdr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun cmsgNxthdr(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_cmsgNxthdr(mhdr?.value?.toCPointer<ByteVar>(), cmsg?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_recvmsg(socket, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_sendmsg(socket, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun uname(utsname: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_uname(utsname?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_strftime(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.redox.cinterop.libc_unix_redox_loginTty(fd)
