@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT

private object UnixNewlibJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_newlib_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_newlib_abs(i: Int): Int

    @JvmStatic
    external fun libc_unix_newlib_labs(i: Long): Long

    @JvmStatic
    external fun libc_unix_newlib_rand(): Int

    @JvmStatic
    external fun libc_unix_newlib_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_newlib_bind(fd: Int, addr: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_newlib_clockSettime(clockId: Long, tp: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_clockGettime(clockId: Long, tp: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_clockGetres(clockId: Long, res: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_closesocket(sockfd: Int): Int

    @JvmStatic
    external fun libc_unix_newlib_recvfrom(fd: Int, buf: Long, n: Long, flags: Int, addr: Long, addrLen: Long): Long

    @JvmStatic
    external fun libc_unix_newlib_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_newlib_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_newlib_fexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_newlib_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_pthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_newlib_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_newlib_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_newlib_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_newlib_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_getpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_newlib_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_newlib_uname(buf: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_semDestroy((sem?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun abs(i: CInt): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_abs(i)

public actual fun labs(i: CLong): CLong =
    UnixNewlibJniBridge.libc_unix_newlib_labs(i)

public actual fun rand(): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_rand()

public actual fun srand(seed: CUint) {
    UnixNewlibJniBridge.libc_unix_newlib_srand(seed.toInt())
}

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_bind(fd, (addr?.value ?: 0L), len.toInt())

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_clockSettime(clockId.toLong(), (tp?.value ?: 0L))

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_clockGettime(clockId.toLong(), (tp?.value ?: 0L))

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_clockGetres(clockId.toLong(), (res?.value ?: 0L))

public actual fun closesocket(sockfd: CInt): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_closesocket(sockfd)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    0

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: COpaquePointer?, addrLen: COpaquePointer?): Long =
    UnixNewlibJniBridge.libc_unix_newlib_recvfrom(fd, (buf?.value ?: 0L), n.toLong(), flags, (addr?.value ?: 0L), (addrLen?.value ?: 0L))

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    UnixNewlibJniBridge.libc_unix_newlib_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_fexecve(fd, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun semClose(sem: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_semClose((sem?.value ?: 0L))

public actual fun getdtablesize(): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_pthreadSigmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixNewlibJniBridge.libc_unix_newlib_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_pthreadKill(thread.toLong(), sig)

public actual fun semUnlink(name: String?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_getpwuidR(uid.toShort(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_pthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixNewlibJniBridge.libc_unix_newlib_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun popen(command: String?, mode: String?): FILE? =
    UnixNewlibJniBridge.libc_unix_newlib_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixNewlibJniBridge.libc_unix_newlib_uname((buf?.value ?: 0L))
