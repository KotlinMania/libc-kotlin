@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_srand(seed)
}

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_bind(fd, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_clockSettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_clockGettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_clockGetres(clockId, res?.value?.toCPointer<ByteVar>())

public actual fun closesocket(sockfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_closesocket(sockfd)

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    0

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: COpaquePointer?, addrLen: COpaquePointer?): Long =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_recvfrom(fd, buf?.value?.toCPointer<ByteVar>(), n, flags, addr?.value?.toCPointer<ByteVar>(), addrLen?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_pthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun uname(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_unix_newlib_uname(buf?.value?.toCPointer<ByteVar>())
