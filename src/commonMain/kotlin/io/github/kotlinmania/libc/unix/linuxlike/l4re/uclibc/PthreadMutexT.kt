package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public data class PthreadMutexT(
    val mReserved: Int,
    val mCount: Int,
    val mOwner: io.github.kotlinmania.libc.COpaquePointer?,
    val mKind: Int,
    val mLock: PthreadFastlock,
)
