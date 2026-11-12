package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

// supports multicast
public fun fdClr(fd: CInt, set: MutPtr) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] and (1uL shl (fd1 % bits)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val fd1 = fd
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] and (1uL shl (fd1 % bits))) != 0uL
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] or (1uL shl (fd1 % bits))
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

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt

public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt

public expect fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt

public expect fun clockGetres(clockId: ClockidT, res: MutPtr): CInt

public expect fun closesocket(sockfd: CInt): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun recvfrom(fd: CInt, buf: MutPtr, n: ULong, flags: CInt, addr: MutPtr, addrLen: MutPtr): Long

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun semClose(sem: MutPtr): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun uname(buf: MutPtr): CInt
