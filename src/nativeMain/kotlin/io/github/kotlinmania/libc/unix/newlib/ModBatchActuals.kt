// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toLong
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.ByteVar

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires manual FFI bridge — not yet implemented")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_getrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    libc.cinterop.libc_setrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun semDestroy(sem: SemT?): CInt =
    libc.cinterop.libc_sem_destroy(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    libc.cinterop.libc_sem_init(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared, value)

public actual fun abs(i: CInt): CInt =
    libc.cinterop.libc_abs(i)
public actual fun labs(i: CLong): CLong =
    libc.cinterop.libc_labs(i)
public actual fun rand(): CInt =
    libc.cinterop.libc_rand()
public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_settime(clockId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    libc.cinterop.libc_clock_gettime(clockId, tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: Timespec?): CInt =
    libc.cinterop.libc_clock_getres(clockId, res?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun closesocket(sockfd: CInt): CInt =
    throw UnsupportedOperationException("closesocket requires manual FFI bridge — not yet implemented")

public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: Sockaddr?, addrLen: SocklenT?): Long =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    libc.cinterop.libc_gettimeofday(tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): CInt =
    libc.cinterop.libc_sem_close(sem?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getdtablesize(): CInt =
    libc.cinterop.libc_getdtablesize()
public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    libc.cinterop.libc_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc.cinterop.libc_pthread_kill(thread.toLong().toCPointer<kotlinx.cinterop.ByteVar>(), sig)

public actual fun semUnlink(name: String?): CInt =
    libc.cinterop.libc_sem_unlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc.cinterop.libc_daemon(nochdir, noclose)
public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires manual FFI bridge — not yet implemented")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires manual FFI bridge — not yet implemented")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: GidT): Group? =
    libc.cinterop.libc_getgrgid(gid.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    libc.cinterop.libc_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun uname(buf: Utsname?): CInt =
    libc.cinterop.libc_uname(buf?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")
