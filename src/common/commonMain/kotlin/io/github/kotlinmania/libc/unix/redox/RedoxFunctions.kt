package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateStartCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

// intentionally not public, only used for fdSet
public fun cmsgAlign(len: SizeT): SizeT = (len + sizeOf<SizeT>(typeLayoutT = PrimitiveLayouts.U64).toULong() - 1uL) and (sizeOf<SizeT>(typeLayoutT = PrimitiveLayouts.U64).toULong() - 1uL).inv()

public fun cmsgLen(length: CUint): CUint = (cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toULong()) + (length.toInt()).toULong()).toUInt()

public fun cmsgSpace(len: CUint): CUint = (cmsgAlign(len.toULong()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toULong())).toUInt()

public fun fdClr(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] and (1uL shl (fd1 % size)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1uL shl (fd1 % size))) != 0uL
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] or (1uL shl (fd1 % size))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0uL
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
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
public expect fun errnoLocation(): MutPtr

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

// dirent.h
public expect fun dirfd(dirp: MutPtr): CInt

// unistd.h
public expect fun pipe2(fds: MutPtr, flags: CInt): CInt

public expect fun getdtablesize(): CInt

public expect fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt

public expect fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

// grp.h
public expect fun getgrent(): MutPtr

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt

// malloc.h
public expect fun memalign(align: SizeT, size: SizeT): MutPtr

// netdb.h
public expect fun getnameinfo(addr: ConstPtr, addrlen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

// pthread.h
public expect fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt

public expect fun pthreadCreate(tid: MutPtr, attr: ConstPtr, start: PthreadCreateStartCallback, arg: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

// pty.h
public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt

// pwd.h
public expect fun getpwent(): MutPtr

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

// signal.h
public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr, sig: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

// stdlib.h
public expect fun getsubopt(optionp: MutPtr, tokens: ConstPtr, valuep: MutPtr): CInt

public expect fun mkostemp(template: MutPtr, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt

public expect fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr

// stdio.h
public expect fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt

// string.h
public expect fun explicitBzero(p: MutPtr, len: SizeT)

public expect fun strlcat(dst: MutPtr, src: ConstPtr, siz: SizeT): SizeT

public expect fun strlcpy(dst: MutPtr, src: ConstPtr, siz: SizeT): SizeT

// sys/epoll.h
public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt

// sys/ioctl.h
public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

// sys/mman.h
public expect fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

// sys/resource.h
public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

// sys/socket.h
public expect fun cmsgData(cmsg: ConstPtr): MutPtr

public expect fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr

public expect fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr

public expect fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun recvmsg(socket: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun sendmsg(socket: CInt, msg: ConstPtr, flags: CInt): SsizeT

// sys/stat.h
public expect fun futimens(fd: CInt, times: ConstPtr): CInt

// sys/uio.h
public expect fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

// sys/utsname.h
public expect fun uname(utsname: MutPtr): CInt

// time.h
public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT

// utmp.h
public expect fun loginTty(fd: CInt): CInt
