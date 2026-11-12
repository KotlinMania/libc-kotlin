@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib

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
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibAbs
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibBind
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibClockGetres
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibClockGettime
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibClockSettime
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibClosesocket
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibDaemon
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibFexecve
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGetdtablesize
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGetgrgid
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGetgrgidR
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGetgrnam
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGetgrnamR
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGetnameinfo
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGetpwnamR
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGetpwuidR
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGetrlimit
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibGettimeofday
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibIoctl
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibLabs
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibMemalign
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibPopen
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibPthreadAtfork
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibPthreadKill
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibPthreadSigmask
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibRand
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibRecvfrom
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibSemClose
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibSemDestroy
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibSemInit
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibSemOpen
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibSemUnlink
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibSetrlimit
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibSigaltstack
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibSigwait
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibSrand
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibStrerrorR
import io.github.kotlinmania.libc.unix.newlib.cinterop.libcUnixNewlibUname
import io.github.kotlinmania.libc.unix.newlib.generic.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    libcUnixNewlibGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    libcUnixNewlibSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixNewlibStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcUnixNewlibSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcUnixNewlibSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun abs(i: CInt): CInt =
    libcUnixNewlibAbs(i)

public actual fun labs(i: CLong): CLong =
    libcUnixNewlibLabs(i)

public actual fun rand(): CInt =
    libcUnixNewlibRand()

public actual fun srand(seed: CUint) {
    libcUnixNewlibSrand(seed)
}

public actual fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    libcUnixNewlibBind(fd, addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcUnixNewlibClockSettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixNewlibClockGettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt =
    libcUnixNewlibClockGetres(clockId, res.rawAddress.toCPointer<ByteVar>())

public actual fun closesocket(sockfd: CInt): CInt =
    libcUnixNewlibClosesocket(sockfd)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    libcUnixNewlibIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun recvfrom(fd: CInt, buf: MutPtr<CVoid>, n: ULong, flags: CInt, addr: MutPtr<Sockaddr>, addrLen: MutPtr<SocklenT>): Long =
    libcUnixNewlibRecvfrom(fd, buf.rawAddress.toCPointer<ByteVar>(), n, flags, addr.rawAddress.toCPointer<ByteVar>(), addrLen.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    libcUnixNewlibGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixNewlibMemalign(align, size)?.toLong() ?: 0L)

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixNewlibFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcUnixNewlibGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixNewlibGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    libcUnixNewlibSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    libcUnixNewlibSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libcUnixNewlibGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixNewlibGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcUnixNewlibPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(libcUnixNewlibSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(libcUnixNewlibGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcUnixNewlibPthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixNewlibSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixNewlibDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixNewlibGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixNewlibGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    libcUnixNewlibSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libcUnixNewlibPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(libcUnixNewlibGetgrgid(gid)?.toLong() ?: 0L)

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixNewlibPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcUnixNewlibUname(buf.rawAddress.toCPointer<ByteVar>())
