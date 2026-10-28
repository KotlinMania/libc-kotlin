package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class PthreadRwlockT(
    val pthreadRwlockReaders: Int,
    val pthreadRwlockType: UShort,
    val pthreadRwlockMagic: UShort,
    val pthreadRwlockMutex: PthreadMutexT,
    val pthreadRwlockReadercv: PthreadCondT,
    val pthreadRwlockWritercv: PthreadCondT,
)
