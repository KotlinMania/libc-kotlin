package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.IpcPerm

public open class SigsetT(public var value: List<ULong>)

public open class Sysinfo(
    public var uptime: Long,
    public var loads: List<ULong>,
    public var totalram: ULong,
    public var freeram: ULong,
    public var sharedram: ULong,
    public var bufferram: ULong,
    public var totalswap: ULong,
    public var freeswap: ULong,
    public var procs: CUshort,
    public var pad: CUshort,
    public var totalhigh: ULong,
    public var freehigh: ULong,
    public var memUnit: CUint,
    public var f: List<CChar>,
)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
    public var msgCbytes: ULong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var glibcReserved4: ULong,
    public var glibcReserved5: ULong,
)

public open class SemidDs(
    public var semPerm: IpcPerm,
    public var semOtime: TimeT,
    public var reserved: SyscallUlongT,
    public var semCtime: TimeT,
    public var reserved2: SyscallUlongT,
    public var semNsems: SyscallUlongT,
    public var glibcReserved3: SyscallUlongT,
    public var glibcReserved4: SyscallUlongT,
)

public open class Timex(
    public var modes: CUint,
    public var offset: CLong,
    public var freq: CLong,
    public var maxerror: CLong,
    public var esterror: CLong,
    public var status: CInt,
    public var constant: CLong,
    public var precision: CLong,
    public var tolerance: CLong,
    public var time: Timeval,
    public var tick: CLong,
    public var ppsfreq: CLong,
    public var jitter: CLong,
    public var shift: CInt,
    public var stabil: CLong,
    public var jitcnt: CLong,
    public var calcnt: CLong,
    public var errcnt: CLong,
    public var stbcnt: CLong,
    public var tai: CInt,
    public var unused1: Int,
    public var unused2: Int,
    public var unused3: Int,
    public var unused4: Int,
    public var unused5: Int,
    public var unused6: Int,
    public var unused7: Int,
    public var unused8: Int,
    public var unused9: Int,
    public var unused10: Int,
    public var unused11: Int,
)
