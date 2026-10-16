package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class XktlsSessionOnedir(
    val gennum: ULong,
    val rsrv1: ULongArray,
    val rsrv2: UIntArray,
    val iv: UByteArray,
    val cipherAlgorithm: Int,
    val authAlgorithm: Int,
    val cipherKeyLen: UShort,
    val ivLen: UShort,
    val authKeyLen: UShort,
    val maxFrameLen: UShort,
    val tlsVmajor: UByte,
    val tlsVminor: UByte,
    val tlsHlen: UByte,
    val tlsTlen: UByte,
    val tlsBs: UByte,
    val flags: UByte,
    val drvStLen: UShort,
    val ifnet: ByteArray,
)
