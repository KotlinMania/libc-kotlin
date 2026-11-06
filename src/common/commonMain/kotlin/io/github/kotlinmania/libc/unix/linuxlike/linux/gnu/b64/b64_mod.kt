// port-lint: source unix/linux_like/linux/gnu/b64/b64_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.IpcPerm
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Timeval

// 64-bit specific definitions for linux-like values

public typealias InoT = ULong

public typealias OffT = Long

public typealias BlkcntT = Long

public typealias ShmattT = ULong

public typealias MsgqnumT = ULong

public typealias MsglenT = ULong

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias RlimT = ULong

public typealias SyscallUlongT = CUlong

public typealias FswordT = Long

public typealias ClockT = Long

public typealias TimeT = Long

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
    public var msgStime: io.github.kotlinmania.libc.TimeT,
    public var msgRtime: io.github.kotlinmania.libc.TimeT,
    public var msgCtime: io.github.kotlinmania.libc.TimeT,
    public var msgCbytes: ULong,
    public var msgQnum: io.github.kotlinmania.libc.MsgqnumT,
    public var msgQbytes: io.github.kotlinmania.libc.MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var glibcReserved4: ULong,
    public var glibcReserved5: ULong,
)

public open class SemidDs(
    public var semPerm: IpcPerm,
    public var semOtime: io.github.kotlinmania.libc.TimeT,
    public var reserved: io.github.kotlinmania.libc.SyscallUlongT,
    public var semCtime: io.github.kotlinmania.libc.TimeT,
    public var reserved2: io.github.kotlinmania.libc.SyscallUlongT,
    public var semNsems: io.github.kotlinmania.libc.SyscallUlongT,
    public var glibcReserved3: io.github.kotlinmania.libc.SyscallUlongT,
    public var glibcReserved4: io.github.kotlinmania.libc.SyscallUlongT,
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

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val O_LARGEFILE: CInt = 0
