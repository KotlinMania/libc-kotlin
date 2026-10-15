// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd14/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fVersion: UInt,
    val fType: UInt,
    val fFlags: ULong,
    val fBsize: ULong,
    val fIosize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: Long,
    val fFiles: ULong,
    val fFfree: Long,
    val fSyncwrites: ULong,
    val fAsyncwrites: ULong,
    val fSyncreads: ULong,
    val fAsyncreads: ULong,
    val fSpare: ULongArray,
    val fNamemax: UInt,
    val fOwner: UInt,
    val fFsid: ULong,
    val fCharspare: ByteArray,
    val fFstypename: ByteArray,
    val fMntfromname: ByteArray,
    val fMntonname: ByteArray,
)
