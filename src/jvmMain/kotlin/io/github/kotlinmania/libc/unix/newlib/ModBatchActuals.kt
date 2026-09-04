// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR not available on JVM — no C library access")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on JVM — no C library access")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET not available on JVM — no C library access")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO not available on JVM — no C library access")
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on JVM — no C library access")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on JVM — no C library access")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on JVM — no C library access")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy not available on JVM — no C library access")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on JVM — no C library access")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs not available on JVM — no C library access")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs not available on JVM — no C library access")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on JVM — no C library access")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand not available on JVM — no C library access")
}

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("bind not available on JVM — no C library access")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime not available on JVM — no C library access")

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun clockGetres(clockId: ClockidT, res: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on JVM — no C library access")

public actual fun closesocket(sockfd: CInt): CInt =
    throw UnsupportedOperationException("closesocket not available on JVM — no C library access")

public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on JVM — no C library access")

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: Sockaddr?, addrLen: SocklenT?): Long =
    throw UnsupportedOperationException("recvfrom not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on JVM — no C library access")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR not available on JVM — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack not available on JVM — no C library access")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose not available on JVM — no C library access")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize not available on JVM — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR not available on JVM — no C library access")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask not available on JVM — no C library access")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on JVM — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on JVM — no C library access")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill not available on JVM — no C library access")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink not available on JVM — no C library access")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon not available on JVM — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR not available on JVM — no C library access")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR not available on JVM — no C library access")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait not available on JVM — no C library access")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid not available on JVM — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on JVM — no C library access")

