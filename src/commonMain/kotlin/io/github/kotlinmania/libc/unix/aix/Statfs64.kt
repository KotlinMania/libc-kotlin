package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Statfs64(
    val fVersion: Int,
    val fType: Int,
    val fBsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: Fsid64T,
    val fVfstype: Int,
    val fFsize: ULong,
    val fVfsnumber: Int,
    val fVfsoff: Int,
    val fVfslen: Int,
    val fVfsvers: Int,
    val fFname: ByteArray,
    val fFpack: ByteArray,
    val fNameMax: Int,
)
