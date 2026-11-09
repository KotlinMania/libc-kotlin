package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.SiginfoT

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt

public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt

public expect fun getauxval(type: CUlong): CUlong

public fun SiginfoT.siAddr(): COpaquePointer? {
    data class SiginfoSigfault(
        public var siSigno: CInt = 0,
        public var siErrno: CInt = 0,
        public var siCode: CInt = 0,
        public var siAddr: COpaquePointer? = null,
    )
    return ((this as Any?) as SiginfoSigfault?)!!.siAddr
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
    return ((this as Any?) as SiginfoSiValue?)!!.siValue
}

public fun SiginfoT.sifields(): Sifields {
    return ((this as Any?) as SiginfoF?)!!.sifields
}

public fun SiginfoT.siPid(): PidT {
    return this.sifields().sigchld.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.sifields().sigchld.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.sifields().sigchld.siStatus
}

public fun SiginfoT.siUtime(): CLong {
    return this.sifields().sigchld.siUtime
}

public fun SiginfoT.siStime(): CLong {
    return this.sifields().sigchld.siStime
}
