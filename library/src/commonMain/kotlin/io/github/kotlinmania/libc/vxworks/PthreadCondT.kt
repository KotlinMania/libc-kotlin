package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class PthreadCondT(
    val condSemId: io.github.kotlinmania.libc.COpaquePointer?,
    val condValid: Int,
    val condInitted: Int,
    val condRefCount: Int,
    val condMutex: PthreadMutexT?,
    val condAttr: PthreadCondattrT,
    val condSemName: ByteArray,
)
