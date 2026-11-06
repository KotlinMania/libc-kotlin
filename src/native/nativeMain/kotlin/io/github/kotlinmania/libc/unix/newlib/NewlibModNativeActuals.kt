@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun semDestroy(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_srand(seed)
}

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_bind(fd, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_clock_settime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_clock_gettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: io.github.kotlinmania.libc.ClockidT, res: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_clock_getres(clockId, res?.value?.toCPointer<ByteVar>())

public actual fun closesocket(sockfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_closesocket(sockfd)

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: Sockaddr?, addrLen: UInt?): Long =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_recvfrom(fd, buf?.value?.toCPointer<ByteVar>(), n, flags, addr?.value?.toCPointer<ByteVar>(), addrLen?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: SemT?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_pthread_kill(thread, sig)

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): Group? =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    io.github.kotlinmania.libc.unix.newlib.cinterop.libc_newlib_mod_uname(buf?.value?.toCPointer<ByteVar>())
