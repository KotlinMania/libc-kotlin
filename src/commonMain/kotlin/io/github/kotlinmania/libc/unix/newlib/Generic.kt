// port-lint: source unix/newlib/generic.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public data class SigsetT(
    val `val`: UInt,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stAtime: TimeT,
    val stSpare1: CLong,
    val stMtime: TimeT,
    val stSpare2: CLong,
    val stCtime: TimeT,
    val stSpare3: CLong,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stSpare4: LongArray,
)

public data class Dirent(
    val dIno: InoT,
    val dType: CUChar,
    val dName: ByteArray,
)
