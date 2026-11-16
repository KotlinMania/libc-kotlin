@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxBind
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxClockGettime
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxCmsgData
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxCmsgFirsthdr
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxCmsgNxthdr
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxDirfd
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxEndgrent
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxEndpwent
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxEpollCreate
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxEpollCreate1
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxEpollCtl
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxEpollWait
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxErrnoLocation
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxExplicitBzero
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxFutimens
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetdtablesize
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetgrent
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetgrgid
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetgrgidR
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetgrnam
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetgrnamR
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetgrouplist
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetnameinfo
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetpriority
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetpwent
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetpwnamR
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetpwuidR
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetresgid
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetresuid
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetrlimit
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGetsubopt
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxGettimeofday
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxIoctl
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxLoginTty
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxMadvise
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxMemalign
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxMkostemp
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxMkostemps
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxMprotect
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxMsync
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxOpenpty
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxPipe2
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxPreadv
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxPthreadAtfork
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxPthreadCancel
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxPthreadCreate
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxPthreadKill
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxPthreadSigmask
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxPwritev
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxReadv
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxReallocarray
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxRecvfrom
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxRecvmsg
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxRenameat2
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxSendmsg
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxSetgrent
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxSetpriority
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxSetpwent
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxSetresgid
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxSetresuid
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxSetrlimit
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxShmOpen
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxShmUnlink
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxSigtimedwait
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxSigwait
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxStrerrorR
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxStrftime
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxStrlcat
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxStrlcpy
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxUname
import io.github.kotlinmania.libc.unix.redox.cinterop.libcUnixRedoxWritev
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errnoLocation(): MutPtr =
    MutPtr(libcUnixRedoxErrnoLocation()?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixRedoxStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun dirfd(dirp: MutPtr): CInt =
    libcUnixRedoxDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    libcUnixRedoxPipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getdtablesize(): CInt =
    libcUnixRedoxGetdtablesize()

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    libcUnixRedoxGetresgid(rgid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>(), sgid.rawAddress.toCPointer<ByteVar>())

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    libcUnixRedoxGetresuid(ruid.rawAddress.toCPointer<ByteVar>(), euid.rawAddress.toCPointer<ByteVar>(), suid.rawAddress.toCPointer<ByteVar>())

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    libcUnixRedoxSetresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    libcUnixRedoxSetresuid(ruid, euid, suid)

public actual fun getgrent(): MutPtr =
    MutPtr(libcUnixRedoxGetgrent()?.toLong() ?: 0L)

public actual fun setgrent() {
    libcUnixRedoxSetgrent()
}

public actual fun endgrent() {
    libcUnixRedoxEndgrent()
}

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(libcUnixRedoxGetgrgid(gid)?.toLong() ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixRedoxGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixRedoxGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixRedoxGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    libcUnixRedoxGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), group, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixRedoxMemalign(align, size)?.toLong() ?: 0L)

public actual fun getnameinfo(addr: ConstPtr, addrlen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    libcUnixRedoxGetnameinfo(addr.rawAddress.toCPointer<ByteVar>(), addrlen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    libcUnixRedoxPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadCreate(tid: MutPtr, attr: ConstPtr, start: PthreadCreateStartCallback, arg: MutPtr): CInt =
    libcUnixRedoxPthreadCreate(tid.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    libcUnixRedoxPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    libcUnixRedoxOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun getpwent(): MutPtr =
    MutPtr(libcUnixRedoxGetpwent()?.toLong() ?: 0L)

public actual fun setpwent() {
    libcUnixRedoxSetpwent()
}

public actual fun endpwent() {
    libcUnixRedoxEndpwent()
}

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixRedoxGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixRedoxGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    libcUnixRedoxPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcUnixRedoxPthreadCancel(thread.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcUnixRedoxPthreadKill(thread.rawAddress.toCPointer<ByteVar>(), sig)

public actual fun sigtimedwait(set: ConstPtr, sig: MutPtr, timeout: ConstPtr): CInt =
    libcUnixRedoxSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    libcUnixRedoxSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun getsubopt(optionp: MutPtr, tokens: ConstPtr, valuep: MutPtr): CInt =
    libcUnixRedoxGetsubopt(optionp.rawAddress.toCPointer<ByteVar>(), tokens.rawAddress.toCPointer<ByteVar>(), valuep.rawAddress.toCPointer<ByteVar>())

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    libcUnixRedoxMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    libcUnixRedoxMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixRedoxReallocarray(ptr.rawAddress.toCPointer<ByteVar>(), nmemb, size)?.toLong() ?: 0L)

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt =
    libcUnixRedoxRenameat2(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun explicitBzero(p: MutPtr, len: SizeT) {
    libcUnixRedoxExplicitBzero(p.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun strlcat(dst: MutPtr, src: ConstPtr, siz: SizeT): SizeT =
    libcUnixRedoxStrlcat(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), siz)

public actual fun strlcpy(dst: MutPtr, src: ConstPtr, siz: SizeT): SizeT =
    libcUnixRedoxStrlcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), siz)

public actual fun epollCreate(size: CInt): CInt =
    libcUnixRedoxEpollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    libcUnixRedoxEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt =
    libcUnixRedoxEpollWait(epfd, events.rawAddress.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt =
    libcUnixRedoxEpollCtl(epfd, op, fd, event.rawAddress.toCPointer<ByteVar>())

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    libcUnixRedoxIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixRedoxMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    libcUnixRedoxMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixRedoxMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixRedoxShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr): CInt =
    libcUnixRedoxShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixRedoxGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libcUnixRedoxSetpriority(which, who, prio)

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    libcUnixRedoxGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    libcUnixRedoxSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun cmsgData(cmsg: ConstPtr): MutPtr =
    MutPtr(libcUnixRedoxCmsgData(cmsg.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    MutPtr(libcUnixRedoxCmsgFirsthdr(mhdr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr =
    MutPtr(libcUnixRedoxCmsgNxthdr(mhdr.rawAddress.toCPointer<ByteVar>(), cmsg.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    libcUnixRedoxBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    libcUnixRedoxRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun recvmsg(socket: CInt, msg: MutPtr, flags: CInt): SsizeT =
    libcUnixRedoxRecvmsg(socket, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(socket: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    libcUnixRedoxSendmsg(socket, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    libcUnixRedoxFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixRedoxPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixRedoxPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcUnixRedoxReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcUnixRedoxWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun uname(utsname: MutPtr): CInt =
    libcUnixRedoxUname(utsname.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixRedoxGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    libcUnixRedoxClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT =
    libcUnixRedoxStrftime(s.rawAddress.toCPointer<ByteVar>(), max, format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    libcUnixRedoxLoginTty(fd)
