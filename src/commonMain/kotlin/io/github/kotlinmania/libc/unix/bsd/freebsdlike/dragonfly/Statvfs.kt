// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Statvfs(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
    val fOwner: UInt,
    val fType: UInt,
    val fSyncreads: ULong,
    val fSyncwrites: ULong,
    val fAsyncreads: ULong,
    val fAsyncwrites: ULong,
    val fFsidUuid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.Uuid,
    val fUidUuid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.Uuid,
)
