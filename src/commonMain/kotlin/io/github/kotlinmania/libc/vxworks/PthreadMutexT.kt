package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class PthreadMutexT(
    val mutexSemId: io.github.kotlinmania.libc.COpaquePointer?,
    val mutexValid: Int,
    val mutexInitted: Int,
    val mutexCondRefCount: Int,
    val mutexSavPriority: Int,
    val mutexAttr: PthreadMutexattrT,
    val mutexSemName: ByteArray,
)
