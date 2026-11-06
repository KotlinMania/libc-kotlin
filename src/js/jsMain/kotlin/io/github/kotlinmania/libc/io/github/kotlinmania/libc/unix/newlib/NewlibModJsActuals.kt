package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.COpaquePointer

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun semDestroy(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun abs(i: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(i)") as CInt

public actual fun labs(i: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(i)") as CLong

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(fd, addr?.toLong() ?: 0L, len)") as CInt

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clockId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clockId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGetres(clockId: io.github.kotlinmania.libc.ClockidT, res: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clockId, res?.toLong() ?: 0L)") as CInt

public actual fun closesocket(sockfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').closesocket(sockfd)") as CInt

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: Sockaddr?, addrLen: UInt?): Long =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(fd, buf?.value ?: 0L, n, flags, addr?.toLong() ?: 0L, addrLen?.toLong() ?: 0L)") as Long

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)") as CInt

public actual fun semClose(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(thread, sig)") as CInt

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun getgrgid(gid: GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt
