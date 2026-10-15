// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Statfs(
    val spare2: Long,
    val fBsize: Long,
    val fIosize: Long,
    val fBlocks: Long,
    val fBfree: Long,
    val fBavail: Long,
    val fFiles: Long,
    val fFfree: Long,
    val fFsid: ULong,
    val fOwner: UInt,
    val fType: Int,
    val fFlags: Int,
    val fSyncwrites: Long,
    val fAsyncwrites: Long,
    val fFstypename: ByteArray,
    val fMntonname: ByteArray,
    val fSyncreads: Long,
    val fAsyncreads: Long,
    val spares1: Short,
    val fMntfromname: ByteArray,
    val spares2: Short,
    val spare: LongArray,
)
