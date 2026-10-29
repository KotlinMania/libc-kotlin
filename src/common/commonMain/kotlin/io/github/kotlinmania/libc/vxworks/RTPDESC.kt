package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class RTPDESC(
    val status: Int,
    val options: UInt,
    val entrAddr: COpaquePointer?,
    val initTaskId: Int,
    val parentId: Int,
    val pathName: ByteArray,
    val taskCnt: Int,
    val textStart: COpaquePointer?,
    val textEnd: COpaquePointer?,
)
