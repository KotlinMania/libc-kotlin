@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixRedoxJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixRedoxErrnoLocation(): Long

    @JvmStatic
    external fun libcUnixRedoxStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixRedoxDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixRedoxPipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixRedoxGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixRedoxGetresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libcUnixRedoxGetresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libcUnixRedoxSetresgid(rgid: Int, egid: Int, sgid: Int): Int

    @JvmStatic
    external fun libcUnixRedoxSetresuid(ruid: Int, euid: Int, suid: Int): Int

    @JvmStatic
    external fun libcUnixRedoxGetgrent(): Long

    @JvmStatic
    external fun libcUnixRedoxSetgrent()

    @JvmStatic
    external fun libcUnixRedoxEndgrent()

    @JvmStatic
    external fun libcUnixRedoxGetgrgid(gid: Int): Long

    @JvmStatic
    external fun libcUnixRedoxGetgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixRedoxGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixRedoxGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixRedoxGetgrouplist(user: Long, group: Int, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixRedoxMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixRedoxGetnameinfo(addr: Long, addrlen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixRedoxPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixRedoxPthreadCreate(tid: Long, attr: Long, start: Long, arg: Long): Int

    @JvmStatic
    external fun libcUnixRedoxPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcUnixRedoxOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixRedoxGetpwent(): Long

    @JvmStatic
    external fun libcUnixRedoxSetpwent()

    @JvmStatic
    external fun libcUnixRedoxEndpwent()

    @JvmStatic
    external fun libcUnixRedoxGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixRedoxGetpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixRedoxPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixRedoxPthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libcUnixRedoxPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixRedoxSigtimedwait(set: Long, sig: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixRedoxSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixRedoxGetsubopt(optionp: Long, tokens: Long, valuep: Long): Int

    @JvmStatic
    external fun libcUnixRedoxMkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixRedoxMkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixRedoxReallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixRedoxRenameat2(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixRedoxExplicitBzero(p: Long, len: Long)

    @JvmStatic
    external fun libcUnixRedoxStrlcat(dst: Long, src: Long, siz: Long): Long

    @JvmStatic
    external fun libcUnixRedoxStrlcpy(dst: Long, src: Long, siz: Long): Long

    @JvmStatic
    external fun libcUnixRedoxEpollCreate(size: Int): Int

    @JvmStatic
    external fun libcUnixRedoxEpollCreate1(flags: Int): Int

    @JvmStatic
    external fun libcUnixRedoxEpollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int

    @JvmStatic
    external fun libcUnixRedoxEpollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int

    @JvmStatic
    external fun libcUnixRedoxIoctl(fd: Int, request: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixRedoxMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixRedoxMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixRedoxMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixRedoxShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixRedoxShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixRedoxGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixRedoxSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixRedoxGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixRedoxSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixRedoxCmsgData(cmsg: Long): Long

    @JvmStatic
    external fun libcUnixRedoxCmsgFirsthdr(mhdr: Long): Long

    @JvmStatic
    external fun libcUnixRedoxCmsgNxthdr(mhdr: Long, cmsg: Long): Long

    @JvmStatic
    external fun libcUnixRedoxBind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libcUnixRedoxRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixRedoxRecvmsg(socket: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixRedoxSendmsg(socket: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixRedoxFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixRedoxPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixRedoxPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixRedoxReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixRedoxWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixRedoxUname(utsname: Long): Int

    @JvmStatic
    external fun libcUnixRedoxGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixRedoxClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixRedoxStrftime(s: Long, max: Long, format: Long, tm: Long): Long

    @JvmStatic
    external fun libcUnixRedoxLoginTty(fd: Int): Int
}

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxErrnoLocation())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixRedoxJniBridge.libcUnixRedoxStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxDirfd(dirp.rawAddress)

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxPipe2(fds.rawAddress, flags)

public actual fun getdtablesize(): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetdtablesize()

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetresgid(rgid.rawAddress, egid.rawAddress, sgid.rawAddress)

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetresuid(ruid.rawAddress, euid.rawAddress, suid.rawAddress)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixRedoxJniBridge.libcUnixRedoxSetresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixRedoxJniBridge.libcUnixRedoxSetresuid(ruid, euid, suid)

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxGetgrent())

public actual fun setgrent() {
    UnixRedoxJniBridge.libcUnixRedoxSetgrent()
}

public actual fun endgrent() {
    UnixRedoxJniBridge.libcUnixRedoxEndgrent()
}

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxGetgrgid(gid))

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetgrgidR(gid, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxGetgrnam(name.rawAddress))

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetgrouplist(user.rawAddress, group, groups.rawAddress, ngroups.rawAddress)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxMemalign(align.toLong(), size.toLong()))

public actual fun getnameinfo(addr: ConstPtr<Sockaddr>, addrlen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetnameinfo(addr.rawAddress, addrlen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    UnixRedoxJniBridge.libcUnixRedoxPthreadAtfork(0L, 0L, 0L)

public actual fun pthreadCreate(tid: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, start: PthreadCreateStartCallback, arg: MutPtr<CVoid>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxPthreadCreate(tid.rawAddress, attr.rawAddress, 0L, arg.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixRedoxJniBridge.libcUnixRedoxPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxGetpwent())

public actual fun setpwent() {
    UnixRedoxJniBridge.libcUnixRedoxSetpwent()
}

public actual fun endpwent() {
    UnixRedoxJniBridge.libcUnixRedoxEndpwent()
}

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetpwuidR(uid, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixRedoxJniBridge.libcUnixRedoxPthreadCancel(thread.rawAddress)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxPthreadKill(thread.rawAddress, sig)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, sig: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxSigtimedwait(set.rawAddress, sig.rawAddress, timeout.rawAddress)

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxSigwait(set.rawAddress, sig.rawAddress)

public actual fun getsubopt(optionp: MutPtr<MutPtr<CChar>>, tokens: ConstPtr<MutPtr<CChar>>, valuep: MutPtr<MutPtr<CChar>>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetsubopt(optionp.rawAddress, tokens.rawAddress, valuep.rawAddress)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxMkostemp(template.rawAddress, flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxMkostemps(template.rawAddress, suffixlen, flags)

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxReallocarray(ptr.rawAddress, nmemb.toLong(), size.toLong()))

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    UnixRedoxJniBridge.libcUnixRedoxRenameat2(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress, flags.toInt())

public actual fun explicitBzero(p: MutPtr<CVoid>, len: SizeT) {
    UnixRedoxJniBridge.libcUnixRedoxExplicitBzero(p.rawAddress, len.toLong())
}

public actual fun strlcat(dst: MutPtr<CChar>, src: ConstPtr<CChar>, siz: SizeT): SizeT =
    UnixRedoxJniBridge.libcUnixRedoxStrlcat(dst.rawAddress, src.rawAddress, siz.toLong()).toULong()

public actual fun strlcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, siz: SizeT): SizeT =
    UnixRedoxJniBridge.libcUnixRedoxStrlcpy(dst.rawAddress, src.rawAddress, siz.toLong()).toULong()

public actual fun epollCreate(size: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxEpollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxEpollWait(epfd, events.rawAddress, maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxEpollCtl(epfd, op, fd, event.rawAddress)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    UnixRedoxJniBridge.libcUnixRedoxIoctl(fd, request.toLong(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxMsync(addr.rawAddress, len.toLong(), flags)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixRedoxJniBridge.libcUnixRedoxShmOpen(name.rawAddress, oflag, mode)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxShmUnlink(name.rawAddress)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxSetpriority(which, who.toInt(), prio)

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxSetrlimit(resource, rlim.rawAddress)

public actual fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxCmsgData(cmsg.rawAddress))

public actual fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxCmsgFirsthdr(mhdr.rawAddress))

public actual fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> =
    MutPtr(UnixRedoxJniBridge.libcUnixRedoxCmsgNxthdr(mhdr.rawAddress, cmsg.rawAddress))

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    UnixRedoxJniBridge.libcUnixRedoxBind(socket, address.rawAddress, addressLen.toInt())

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    UnixRedoxJniBridge.libcUnixRedoxRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun recvmsg(socket: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    UnixRedoxJniBridge.libcUnixRedoxRecvmsg(socket, msg.rawAddress, flags)

public actual fun sendmsg(socket: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    UnixRedoxJniBridge.libcUnixRedoxSendmsg(socket, msg.rawAddress, flags)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxFutimens(fd, times.rawAddress)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    UnixRedoxJniBridge.libcUnixRedoxPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    UnixRedoxJniBridge.libcUnixRedoxPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixRedoxJniBridge.libcUnixRedoxReadv(fd, iov.rawAddress, iovcnt)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixRedoxJniBridge.libcUnixRedoxWritev(fd, iov.rawAddress, iovcnt)

public actual fun uname(utsname: MutPtr<Utsname>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxUname(utsname.rawAddress)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixRedoxJniBridge.libcUnixRedoxClockGettime(clkId, tp.rawAddress)

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    UnixRedoxJniBridge.libcUnixRedoxStrftime(s.rawAddress, max.toLong(), format.rawAddress, tm.rawAddress).toULong()

public actual fun loginTty(fd: CInt): CInt =
    UnixRedoxJniBridge.libcUnixRedoxLoginTty(fd)
