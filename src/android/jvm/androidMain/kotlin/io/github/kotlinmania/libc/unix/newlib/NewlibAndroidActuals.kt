@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNewlibJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixNewlibGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixNewlibStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixNewlibAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixNewlibLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixNewlibRand(): Int

    @JvmStatic
    external fun libcUnixNewlibSrand(seed: Int)

    @JvmStatic
    external fun libcUnixNewlibBind(fd: Int, addr: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixNewlibClockSettime(clockId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixNewlibClockGettime(clockId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixNewlibClockGetres(clockId: Long, res: Long): Int

    @JvmStatic
    external fun libcUnixNewlibClosesocket(sockfd: Int): Int

    @JvmStatic
    external fun libcUnixNewlibIoctl(fd: Int, request: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixNewlibRecvfrom(fd: Int, buf: Long, n: Long, flags: Int, addr: Long, addrLen: Long): Long

    @JvmStatic
    external fun libcUnixNewlibGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNewlibMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixNewlibFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixNewlibGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNewlibPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixNewlibGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixNewlibPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixNewlibSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixNewlibDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixNewlibGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGetpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNewlibSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixNewlibPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixNewlibGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixNewlibPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixNewlibUname(buf: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSetrlimit(resource, rlim.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixNewlibJniBridge.libcUnixNewlibStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun abs(i: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibAbs(i)

public actual fun labs(i: CLong): CLong =
    UnixNewlibJniBridge.libcUnixNewlibLabs(i)

public actual fun rand(): CInt =
    UnixNewlibJniBridge.libcUnixNewlibRand()

public actual fun srand(seed: CUint) {
    UnixNewlibJniBridge.libcUnixNewlibSrand(seed.toInt())
}

public actual fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    UnixNewlibJniBridge.libcUnixNewlibBind(fd, addr.rawAddress, len.toInt())

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibClockSettime(clockId.toLong(), tp.rawAddress)

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibClockGettime(clockId.toLong(), tp.rawAddress)

public actual fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibClockGetres(clockId.toLong(), res.rawAddress)

public actual fun closesocket(sockfd: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibClosesocket(sockfd)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    UnixNewlibJniBridge.libcUnixNewlibIoctl(fd, request.toLong(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun recvfrom(fd: CInt, buf: MutPtr<CVoid>, n: ULong, flags: CInt, addr: MutPtr<Sockaddr>, addrLen: MutPtr<SocklenT>): Long =
    UnixNewlibJniBridge.libcUnixNewlibRecvfrom(fd, buf.rawAddress, n.toLong(), flags, addr.rawAddress, addrLen.rawAddress)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibMemalign(align.toLong(), size.toLong()))

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSemClose(sem.rawAddress)

public actual fun getdtablesize(): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibGetgrnam(name.rawAddress))

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibPthreadKill(thread.toLong(), sig)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSemUnlink(name.rawAddress)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixNewlibJniBridge.libcUnixNewlibDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibGetpwuidR(uid.toShort(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibSigwait(set.rawAddress, sig.rawAddress)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixNewlibJniBridge.libcUnixNewlibPthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibGetgrgid(gid.toShort()))

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixNewlibJniBridge.libcUnixNewlibPopen(command.rawAddress, mode.rawAddress))

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    UnixNewlibJniBridge.libcUnixNewlibUname(buf.rawAddress)
