package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

public fun interface PthreadCreateStartCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

// intentionally not public, only used for fdSet
public fun cmsgAlign(len: SizeT): SizeT = (len + 8uL - 1uL) and (8uL - 1uL).inv()

public fun cmsgLen(length: CUint): CUint = (cmsgAlign(8uL) + (length.toInt()).toULong()).toUInt()

public fun cmsgSpace(len: CUint): CUint = (cmsgAlign(len.toULong()) + cmsgAlign(8uL)).toUInt()

public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] or (1uL shl (fd1 % size))
    return
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set.fdsBits)[idx] = 0uL
    }
}

public fun wifstopped(status: CInt): Boolean = (status and 0xff) == 0x7f

public fun wstopsig(status: CInt): CInt = (status shr 8) and 0xff

public fun wifcontinued(status: CInt): Boolean = status == 0xffff

public fun wifsignaled(status: CInt): Boolean = ((status and 0x7f) + 1).toByte() >= 2.toByte()

public fun wtermsig(status: CInt): CInt = status and 0x7f

public fun wifexited(status: CInt): Boolean = (status and 0x7f) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0xff

public fun wcoredump(status: CInt): Boolean = (status and 0x80) != 0

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0uL
    dev = dev or ((major1 and 0x00000fffuL) shl 8)
    dev = dev or ((major1 and 0xfffff000uL) shl 32)
    dev = dev or ((minor1 and 0x000000ffuL) shl 0)
    dev = dev or ((minor1 and 0xffffff00uL) shl 12)
    return dev
}

public fun major(dev: DevT): CUint {
    var major = 0uL
    major = major or ((dev and 0x00000000000fff00uL) shr 8)
    major = major or ((dev and 0xfffff00000000000uL) shr 32)
    return major.toUInt()
}

public fun minor(dev: DevT): CUint {
    var minor = 0uL
    minor = minor or ((dev and 0x00000000000000ffuL) shr 0)
    minor = minor or ((dev and 0x00000ffffff00000uL) shr 12)
    return minor.toUInt()
}

// errno.h
public expect fun errnoLocation(): COpaquePointer?

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

// dirent.h
public expect fun dirfd(dirp: DIR?): CInt

// unistd.h
public expect fun pipe2(fds: COpaquePointer?, flags: CInt): CInt

public expect fun getdtablesize(): CInt

public expect fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt

public expect fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

// grp.h
public expect fun getgrent(): COpaquePointer?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt

// malloc.h
public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

// netdb.h
public expect fun getnameinfo(addr: COpaquePointer?, addrlen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

// pthread.h
public expect fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt

public expect fun pthreadCreate(tid: COpaquePointer?, attr: COpaquePointer?, start: PthreadCreateStartCallback, arg: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

// pty.h
public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

// pwd.h
public expect fun getpwent(): COpaquePointer?

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

// signal.h
public expect fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun sigtimedwait(set: COpaquePointer?, sig: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

// stdlib.h
public expect fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer?

// stdio.h
public expect fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt

// string.h
public expect fun explicitBzero(p: COpaquePointer?, len: SizeT)

public expect fun strlcat(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT

public expect fun strlcpy(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT

// sys/epoll.h
public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt

// sys/ioctl.h
public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

// sys/mman.h
public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

// sys/resource.h
public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt

// sys/socket.h
public expect fun cmsgData(cmsg: COpaquePointer?): COpaquePointer?

public expect fun cmsgFirsthdr(mhdr: COpaquePointer?): COpaquePointer?

public expect fun cmsgNxthdr(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer?

public expect fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun recvmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun sendmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

// sys/stat.h
public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

// sys/uio.h
public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

// sys/utsname.h
public expect fun uname(utsname: COpaquePointer?): CInt

// time.h
public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT

// utmp.h
public expect fun loginTty(fd: CInt): CInt
