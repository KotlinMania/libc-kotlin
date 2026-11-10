@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun abs(i: CInt): CInt =
    0

public actual fun labs(i: CLong): CLong =
    0L

public actual fun rand(): CInt =
    0

public actual fun srand(seed: CUint) {
}

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    0

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    0

public actual fun closesocket(sockfd: CInt): CInt =
    0

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    0

public actual fun recvfrom(fd: CInt, buf: COpaquePointer?, n: ULong, flags: CInt, addr: COpaquePointer?, addrLen: COpaquePointer?): Long =
    0L

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    0

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    0

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun getdtablesize(): CInt =
    0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    null

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    0

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    null

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun uname(buf: COpaquePointer?): CInt =
    0
