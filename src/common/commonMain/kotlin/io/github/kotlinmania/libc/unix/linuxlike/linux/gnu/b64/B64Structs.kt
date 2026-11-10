@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.IpcPerm

public data class SigsetT(
    public var value: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

public data class Sysinfo(
    public var uptime: Long = 0L,
    public var loads: ULongArray = ULongArray(3),
    public var totalram: ULong = 0uL,
    public var freeram: ULong = 0uL,
    public var sharedram: ULong = 0uL,
    public var bufferram: ULong = 0uL,
    public var totalswap: ULong = 0uL,
    public var freeswap: ULong = 0uL,
    public var procs: CUshort = 0u,
    public var pad: CUshort = 0u,
    public var totalhigh: ULong = 0uL,
    public var freehigh: ULong = 0uL,
    public var memUnit: CUint = 0u,
    public var f: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sysinfo) return false
        if (this.uptime != other.uptime) return false
        if (!this.loads.contentEquals(other.loads)) return false
        if (this.totalram != other.totalram) return false
        if (this.freeram != other.freeram) return false
        if (this.sharedram != other.sharedram) return false
        if (this.bufferram != other.bufferram) return false
        if (this.totalswap != other.totalswap) return false
        if (this.freeswap != other.freeswap) return false
        if (this.procs != other.procs) return false
        if (this.pad != other.pad) return false
        if (this.totalhigh != other.totalhigh) return false
        if (this.freehigh != other.freehigh) return false
        if (this.memUnit != other.memUnit) return false
        if (!this.f.contentEquals(other.f)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uptime.hashCode()
        result = 31 * result + this.loads.contentHashCode()
        result = 31 * result + this.totalram.hashCode()
        result = 31 * result + this.freeram.hashCode()
        result = 31 * result + this.sharedram.hashCode()
        result = 31 * result + this.bufferram.hashCode()
        result = 31 * result + this.totalswap.hashCode()
        result = 31 * result + this.freeswap.hashCode()
        result = 31 * result + this.procs.hashCode()
        result = 31 * result + this.pad.hashCode()
        result = 31 * result + this.totalhigh.hashCode()
        result = 31 * result + this.freehigh.hashCode()
        result = 31 * result + this.memUnit.hashCode()
        result = 31 * result + this.f.contentHashCode()
        return result
    }
}

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgStime: TimeT = 0L,
    public var msgRtime: TimeT = 0L,
    public var msgCtime: TimeT = 0L,
    public var msgCbytes: ULong = 0uL,
    public var msgQnum: MsgqnumT = 0uL,
    public var msgQbytes: MsglenT = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var glibcReserved4: ULong = 0uL,
    public var glibcReserved5: ULong = 0uL,
)

public data class SemidDs(
    public var semPerm: IpcPerm = IpcPerm(),
    public var semOtime: TimeT = 0L,
    public var reserved: SyscallUlongT = 0uL,
    public var semCtime: TimeT = 0L,
    public var reserved2: SyscallUlongT = 0uL,
    public var semNsems: SyscallUlongT = 0uL,
    public var glibcReserved3: SyscallUlongT = 0uL,
    public var glibcReserved4: SyscallUlongT = 0uL,
)

public class Timex(
    public var modes: CUint = 0u,
    public var offset: CLong = 0L,
    public var freq: CLong = 0L,
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var status: CInt = 0,
    public var constant: CLong = 0L,
    public var precision: CLong = 0L,
    public var tolerance: CLong = 0L,
    public var time: Timeval = Timeval(),
    public var tick: CLong = 0L,
    public var ppsfreq: CLong = 0L,
    public var jitter: CLong = 0L,
    public var shift: CInt = 0,
    public var stabil: CLong = 0L,
    public var jitcnt: CLong = 0L,
    public var calcnt: CLong = 0L,
    public var errcnt: CLong = 0L,
    public var stbcnt: CLong = 0L,
    public var tai: CInt = 0,
    public var unused1: Int = 0,
    public var unused2: Int = 0,
    public var unused3: Int = 0,
    public var unused4: Int = 0,
    public var unused5: Int = 0,
    public var unused6: Int = 0,
    public var unused7: Int = 0,
    public var unused8: Int = 0,
    public var unused9: Int = 0,
    public var unused10: Int = 0,
    public var unused11: Int = 0,
)
