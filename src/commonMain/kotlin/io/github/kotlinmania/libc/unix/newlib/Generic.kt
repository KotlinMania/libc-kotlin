// port-lint: source unix/newlib/generic.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

/**
 * Common types used by most newlib platforms.
 */

// Not used on vita / horizon.
public data class SigsetT(
    val value: UInt,
)

// Not used on vita / horizon.
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
) {
    init {
        require(stSpare4.size == 2) { "st_spare4 must be 2 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Stat
        return stDev == other.stDev && stIno == other.stIno && stMode == other.stMode &&
            stNlink == other.stNlink && stUid == other.stUid && stGid == other.stGid &&
            stRdev == other.stRdev && stSize == other.stSize && stAtime == other.stAtime &&
            stSpare1 == other.stSpare1 && stMtime == other.stMtime && stSpare2 == other.stSpare2 &&
            stCtime == other.stCtime && stSpare3 == other.stSpare3 && stBlksize == other.stBlksize &&
            stBlocks == other.stBlocks && stSpare4.contentEquals(other.stSpare4)
    }

    override fun hashCode(): Int {
        var result = stDev.hashCode()
        result = 31 * result + stIno.hashCode()
        result = 31 * result + stSpare4.contentHashCode()
        return result
    }
}

// Not used on vita.
public data class Dirent(
    val dIno: InoT,
    val dType: CUChar,
    val dName: ByteArray,
) {
    init {
        require(dName.size == 256) { "d_name must be 256 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Dirent
        if (dIno != other.dIno) return false
        if (dType != other.dType) return false
        if (!dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = dIno.hashCode()
        result = 31 * result + dType.hashCode()
        result = 31 * result + dName.contentHashCode()
        return result
    }
}
