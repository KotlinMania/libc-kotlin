package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class SfParms(
    val headerData: COpaquePointer?,
    val headerLength: UInt,
    val fileDescriptor: Int,
    val fileSize: ULong,
    val fileOffset: ULong,
    val fileBytes: Long,
    val trailerData: COpaquePointer?,
    val trailerLength: UInt,
    val bytesSent: ULong,
)
