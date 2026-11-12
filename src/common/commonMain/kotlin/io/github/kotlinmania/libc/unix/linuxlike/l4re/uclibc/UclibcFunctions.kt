package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.l4re.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.SiginfoT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt

public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt

public expect fun getauxval(type: CUlong): CUlong

public fun SiginfoT.siAddr(): MutPtr<CVoid> {
    data class SiginfoSigfault(
        public var siSigno: CInt = 0,
        public var siErrno: CInt = 0,
        public var siCode: CInt = 0,
        public var siAddr: MutPtr<CVoid> = MutPtr(0L),
    )
    return this.cast<SiginfoSigfault>().siAddr
}

public fun SiginfoT.siValue(): Sigval {
    data class SiginfoSiValue(
        public var siSigno: CInt = 0,
        public var siErrno: CInt = 0,
        public var siCode: CInt = 0,
        public var siTimerid: CInt = 0,
        public var siOverrun: CInt = 0,
        public var siValue: Sigval = Sigval(),
    )
    return this.cast<SiginfoSiValue>().siValue
}

public fun SiginfoT.sifields(): Sifields = this.cast<SiginfoF>().sifields

public fun SiginfoT.siPid(): PidT = this.sifields().sigchld.siPid

public fun SiginfoT.siUid(): UidT = this.sifields().sigchld.siUid

public fun SiginfoT.siStatus(): CInt = this.sifields().sigchld.siStatus

public fun SiginfoT.siUtime(): CLong = this.sifields().sigchld.siUtime

public fun SiginfoT.siStime(): CLong = this.sifields().sigchld.siStime
