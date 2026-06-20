// port-lint: source unix/bsd/freebsdlike/freebsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public typealias ClockT = CULong

public typealias WcharT = Int

public typealias TimeT = Int

public typealias SusecondsT = Int

public typealias RegisterT = Int

public data class McontextT(
    val mcOnstack: RegisterT,
    val mcGs: RegisterT,
    val mcFs: RegisterT,
    val mcEs: RegisterT,
    val mcDs: RegisterT,
    val mcEdi: RegisterT,
    val mcEsi: RegisterT,
    val mcEbp: RegisterT,
    val mcIsp: RegisterT,
    val mcEbx: RegisterT,
    val mcEdx: RegisterT,
    val mcEcx: RegisterT,
    val mcEax: RegisterT,
    val mcTrapno: RegisterT,
    val mcErr: RegisterT,
    val mcEip: RegisterT,
    val mcCs: RegisterT,
    val mcEflags: RegisterT,
    val mcEsp: RegisterT,
    val mcSs: RegisterT,
    val mcLen: CInt,
    val mcFpformat: CInt,
    val mcOwnedfp: CInt,
    val mcFlags: RegisterT,
    val mcFpstate: IntArray,
    val mcFsbase: RegisterT,
    val mcGsbase: RegisterT,
    val mcXfpustate: RegisterT,
    val mcXfpustateLen: RegisterT,
    val mcSpare2: IntArray,
) {
    init {
        require(mcFpstate.size == 128) { "mc_fpstate must be 128 entries" }
        require(mcSpare2.size == 4) { "mc_spare2 must be 4 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as McontextT
        return mcOnstack == other.mcOnstack && mcGs == other.mcGs && mcFs == other.mcFs &&
            mcEs == other.mcEs && mcDs == other.mcDs && mcEdi == other.mcEdi && mcEsi == other.mcEsi &&
            mcEbp == other.mcEbp && mcIsp == other.mcIsp && mcEbx == other.mcEbx && mcEdx == other.mcEdx &&
            mcEcx == other.mcEcx && mcEax == other.mcEax && mcTrapno == other.mcTrapno && mcErr == other.mcErr &&
            mcEip == other.mcEip && mcCs == other.mcCs && mcEflags == other.mcEflags && mcEsp == other.mcEsp &&
            mcSs == other.mcSs && mcLen == other.mcLen && mcFpformat == other.mcFpformat &&
            mcOwnedfp == other.mcOwnedfp && mcFlags == other.mcFlags && mcFpstate.contentEquals(other.mcFpstate) &&
            mcFsbase == other.mcFsbase && mcGsbase == other.mcGsbase && mcXfpustate == other.mcXfpustate &&
            mcXfpustateLen == other.mcXfpustateLen && mcSpare2.contentEquals(other.mcSpare2)
    }

    override fun hashCode(): Int {
        var result = mcOnstack
        result = 31 * result + mcFlags
        result = 31 * result + mcFpstate.contentHashCode()
        result = 31 * result + mcSpare2.contentHashCode()
        return result
    }
}

// _ALIGNBYTES = size_of::<c_long>() - 1
internal const val ALIGNBYTES: Int = 7

public const val MINSIGSTKSZ: ULong = 2048uL
public const val BIOCSRTIMEOUT: CULong = 0x8008426du
public const val BIOCGRTIMEOUT: CULong = 0x4008426eu
public const val KINFO_FILE_SIZE: CInt = 1392
public const val TIOCTIMESTAMP: CULong = 0x40087459u
