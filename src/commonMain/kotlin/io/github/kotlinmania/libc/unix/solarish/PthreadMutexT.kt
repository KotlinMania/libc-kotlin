// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class PthreadMutexT(
    val pthreadMutexFlag1: UShort,
    val pthreadMutexFlag2: UByte,
    val pthreadMutexCeiling: UByte,
    val pthreadMutexType: UShort,
    val pthreadMutexMagic: UShort,
    val pthreadMutexLock: ULong,
    val pthreadMutexData: ULong,
)
