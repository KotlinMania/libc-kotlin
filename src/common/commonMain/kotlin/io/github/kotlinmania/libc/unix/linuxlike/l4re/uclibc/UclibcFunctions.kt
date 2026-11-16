package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.SiginfoT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: ConstPtr, value: MutPtr): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: MutPtr, value: CInt): CInt

public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt

public expect fun getauxval(type: CUlong): CUlong

public fun SiginfoT.siAddr(): MutPtr {
    val sz = maxOf(64L, SiginfoT.typeLayout().sizeBytes)
    val scratch =
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmAlloc(sz, 8L)
    SiginfoT.typeLayout().writeNative(scratch, this)
    val out =
        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
            .mutPtrLayout(64)
            .readNative(scratch + 16L)
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(scratch, sz, 8L)
    return out
}

public fun SiginfoT.siValue(): Sigval {
    val sz = maxOf(64L, SiginfoT.typeLayout().sizeBytes)
    val scratch =
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmAlloc(sz, 8L)
    SiginfoT.typeLayout().writeNative(scratch, this)
    val out = Sigval.typeLayout().readNative(scratch + 24L)
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(scratch, sz, 8L)
    return out
}

public fun SiginfoT.sifields(): Sifields {
    val sz = maxOf(64L, SiginfoT.typeLayout().sizeBytes)
    val scratch =
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmAlloc(sz, 8L)
    SiginfoT.typeLayout().writeNative(scratch, this)
    val out =
        Sifields(
            alignPointerCtorArg =
                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                    .mutPtrLayout(64)
                    .readNative(scratch + 16L),
            sigchld = SifieldsSigchld.typeLayout().readNative(scratch + 16L),
        )
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(scratch, sz, 8L)
    return out
}

public fun SiginfoT.siPid(): PidT = this.sifields().sigchld.siPid

public fun SiginfoT.siUid(): UidT = this.sifields().sigchld.siUid

public fun SiginfoT.siStatus(): CInt = this.sifields().sigchld.siStatus

public fun SiginfoT.siUtime(): CLong = this.sifields().sigchld.siUtime

public fun SiginfoT.siStime(): CLong = this.sifields().sigchld.siStime
