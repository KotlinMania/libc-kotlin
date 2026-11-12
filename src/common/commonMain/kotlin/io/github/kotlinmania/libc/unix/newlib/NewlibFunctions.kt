package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.libc.unix.newlib.generic.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

// supports multicast
public fun fdClr(fd: CInt, set: MutPtr<FdSet>) {
    val bits = sizeOfVal((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[0]) * 8
    val fd1 = fd
    (ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / bits] = (ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / bits] and (1uL shl (fd1 % bits)).inv()
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val bits = sizeOfVal((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[0]) * 8
    val fd1 = fd
    return ((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / bits] and (1uL shl (fd1 % bits))) != 0uL
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val bits = sizeOfVal((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[0]) * 8
    val fd1 = fd
    (ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / bits] = (ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits[fd1 / bits] or (1uL shl (fd1 % bits))
    return
}

public fun fdZero(set: MutPtr<FdSet>) {
    for (idx in ((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits).indices) {
        ((ObjectSlotLayout<FdSet>()).readNative((set).rawAddress).fdsBits)[idx] = 0uL
    }
}

public expect fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt

public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt

public expect fun closesocket(sockfd: CInt): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun recvfrom(fd: CInt, buf: MutPtr<CVoid>, n: ULong, flags: CInt, addr: MutPtr<Sockaddr>, addrLen: MutPtr<SocklenT>): Long

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid>

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun uname(buf: MutPtr<Utsname>): CInt
