// port-lint: source unix/linux_like/linux/gnu/b64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias InoT = ULong
public typealias OffT = Long
public typealias BlkcntT = Long
public typealias ShmattT = ULong
public typealias MsgqnumT = ULong
public typealias MsglenT = ULong
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias RlimT = ULong
public typealias SyscallUlongT = CULongLong
public typealias SyscallUlongT = CULong
public typealias ClockT = Int
public typealias TimeT = Int
public typealias FswordT = Int
public typealias FswordT = Long
public typealias ClockT = Long
public typealias TimeT = Long

public data class SigsetT(
    val val: UIntArray,
    val val: ULongArray,
)

public data class Sysinfo(
    val uptime: Long,
    val loads: ULongArray,
    val totalram: ULong,
    val freeram: ULong,
    val sharedram: ULong,
    val bufferram: ULong,
    val totalswap: ULong,
    val freeswap: ULong,
    val procs: CUShort,
    val pad: CUShort,
    val totalhigh: ULong,
    val freehigh: ULong,
    val memUnit: CUInt,
    val f: ByteArray,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
    val msgCbytes: ULong,
    val msgQnum: MsgqnumT,
    val msgQbytes: MsglenT,
    val msgLspid: PidT,
    val msgLrpid: PidT,
)

public data class SemidDs(
    val semPerm: IpcPerm,
    val semOtime: TimeT,
    val semCtime: TimeT,
    val semNsems: SyscallUlongT,
)

public data class Timex(
    val modes: CUInt,
    val offset: Long,
    val offset: CLong,
    val freq: Long,
    val freq: CLong,
    val maxerror: Long,
    val maxerror: CLong,
    val esterror: Long,
    val esterror: CLong,
    val status: CInt,
    val constant: Long,
    val constant: CLong,
    val precision: Long,
    val precision: CLong,
    val tolerance: Long,
    val tolerance: CLong,
    val time: Timeval,
    val tick: Long,
    val tick: CLong,
    val ppsfreq: Long,
    val ppsfreq: CLong,
    val jitter: Long,
    val jitter: CLong,
    val shift: CInt,
    val stabil: Long,
    val stabil: CLong,
    val jitcnt: Long,
    val jitcnt: CLong,
    val calcnt: Long,
    val calcnt: CLong,
    val errcnt: Long,
    val errcnt: CLong,
    val stbcnt: Long,
    val stbcnt: CLong,
    val tai: CInt,
    val unused1: Int,
    val unused2: Int,
    val unused3: Int,
    val unused4: Int,
    val unused5: Int,
    val unused6: Int,
    val unused7: Int,
    val unused8: Int,
    val unused9: Int,
    val unused10: Int,
    val unused11: Int,
)

public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val O_LARGEFILE: CInt = 0
