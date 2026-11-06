package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.COpaquePointer

internal object NewlibModRawLibc {
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun semDestroy(sem: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun bind(fd: Int, addr: Long, len: Int): Int
    external fun clockSettime(clockId: Long, tp: Long): Int
    external fun clockGettime(clockId: Long, tp: Long): Int
    external fun clockGetres(clockId: Long, res: Long): Int
    external fun closesocket(sockfd: Int): Int
    external fun recvfrom(fd: Int, buf: Long, n: Long, flags: Int, addr: Long, addrLen: Long): Long
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int
    external fun memalign(align: Long, size: Long): Long?
    external fun fexecve(fd: Int, argv: Long, envp: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun semClose(sem: Long): Int
    external fun getdtablesize(): Int
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun pthreadSigmask(how: Int, set: Long, oldset: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun semUnlink(name: String?): Int
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun getgrgid(gid: Int): Long?
    external fun popen(command: String?, mode: String?): Long?
    external fun uname(buf: Long): Int
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    NewlibModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    NewlibModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    NewlibModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun semDestroy(sem: SemT?): CInt =
    NewlibModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    NewlibModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun abs(i: CInt): CInt =
    NewlibModRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    NewlibModRawLibc.labs(i)

public actual fun rand(): CInt =
    NewlibModRawLibc.rand()

public actual fun srand(seed: CUint) {
    NewlibModRawLibc.srand(seed)
}

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    NewlibModRawLibc.bind(fd, addr?.toLong() ?: 0L, len)

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    NewlibModRawLibc.clockSettime(clockId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    NewlibModRawLibc.clockGettime(clockId, tp?.toLong() ?: 0L)

public actual fun clockGetres(clockId: io.github.kotlinmania.libc.ClockidT, res: Timespec?): CInt =
    NewlibModRawLibc.clockGetres(clockId, res?.toLong() ?: 0L)

public actual fun closesocket(sockfd: CInt): CInt =
    NewlibModRawLibc.closesocket(sockfd)

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: Sockaddr?, addrLen: UInt?): Long =
    NewlibModRawLibc.recvfrom(fd, buf?.value ?: 0L, n, flags, addr?.toLong() ?: 0L, addrLen?.toLong() ?: 0L)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    NewlibModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    NewlibModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    NewlibModRawLibc.fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    NewlibModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NewlibModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    NewlibModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun semClose(sem: SemT?): CInt =
    NewlibModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun getdtablesize(): CInt =
    NewlibModRawLibc.getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NewlibModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    NewlibModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    NewlibModRawLibc.getgrnam(name)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    NewlibModRawLibc.pthreadKill(thread, sig)

public actual fun semUnlink(name: String?): CInt =
    NewlibModRawLibc.semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    NewlibModRawLibc.daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NewlibModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NewlibModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    NewlibModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    NewlibModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun getgrgid(gid: GidT): Group? =
    NewlibModRawLibc.getgrgid(gid)

public actual fun popen(command: String?, mode: String?): FILE? =
    NewlibModRawLibc.popen(command, mode)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    NewlibModRawLibc.uname(buf?.toLong() ?: 0L)
