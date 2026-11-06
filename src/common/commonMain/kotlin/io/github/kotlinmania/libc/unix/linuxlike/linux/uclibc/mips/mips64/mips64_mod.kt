// port-lint: source unix/linux_like/linux/uclibc/mips/mips64/mips64_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.Blkcnt64T
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.Ino64T
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.KeyT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.MsglenT
import io.github.kotlinmania.libc.MsgqnumT
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.ShmattT
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.UidT

public typealias BlkcntT = Long

public typealias BlksizeT = Long

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = ULong

public typealias NlinkT = ULong

public typealias OffT = Long

public typealias SusecondsT = Long

public typealias TimeT = Long

public typealias WcharT = Int

public open class Stat(
    public var stDev: CUlong,
    public var stPad1: List<CLong>,
    public var stIno: io.github.kotlinmania.libc.InoT,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlong,
    public var stPad2: List<CUlong>,
    public var stSize: OffT,
    public var stPad3: CLong,
    public var stAtime: io.github.kotlinmania.libc.TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: io.github.kotlinmania.libc.TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: io.github.kotlinmania.libc.TimeT,
    public var stCtimeNsec: CLong,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stPad4: CLong,
    public var stBlocks: io.github.kotlinmania.libc.BlkcntT,
    public var stPad5: List<CLong>,
)

public open class Stat64(
    public var stDev: CUlong,
    public var stPad1: List<CLong>,
    public var stIno: Ino64T,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlong,
    public var stPad2: List<CLong>,
    public var stSize: Off64T,
    public var stAtime: io.github.kotlinmania.libc.TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: io.github.kotlinmania.libc.TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: io.github.kotlinmania.libc.TimeT,
    public var stCtimeNsec: CLong,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stPad3: CLong,
    public var stBlocks: Blkcnt64T,
    public var stPad5: List<CLong>,
)

public open class PthreadAttrT(public var size: List<CUlong>)

public open class Sigaction(
    public var saFlags: CInt,
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var restorer: COpaquePointer?,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class SigsetT(public var size: List<CUlong>)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var pad: CInt,
    public var pad2: List<CLong>,
)

public open class IpcPerm(
    public var key: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: CUint,
    public var seq: CUshort,
    public var pad1: CUshort,
    public var unused1: CUlong,
    public var unused2: CUlong,
)

public open class ShmidDs(
    public var shmPerm: io.github.kotlinmania.libc.IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: io.github.kotlinmania.libc.TimeT,
    public var shmDtime: io.github.kotlinmania.libc.TimeT,
    public var shmCtime: io.github.kotlinmania.libc.TimeT,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: ShmattT,
    public var unused4: CUlong,
    public var unused5: CUlong,
)

public open class MsqidDs(
    public var msgPerm: io.github.kotlinmania.libc.IpcPerm,
    public var msgStime: io.github.kotlinmania.libc.TimeT,
    public var msgRtime: io.github.kotlinmania.libc.TimeT,
    public var msgCtime: io.github.kotlinmania.libc.TimeT,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var glibcReserved4: CUlong,
    public var glibcReserved5: CUlong,
)

public open class Statfs(
    public var fType: CLong,
    public var fBsize: CLong,
    public var fFrsize: CLong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsblkcntT,
    public var fFfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFsid: FsidT,
    public var fNamelen: CLong,
    public var fSpare: List<CLong>,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: SizeT,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SizeT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: SizeT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CcT,
    public var cCc: List<CcT>,
)

public open class Sysinfo(
    public var uptime: CLong,
    public var loads: List<CUlong>,
    public var totalram: CUlong,
    public var freeram: CUlong,
    public var sharedram: CUlong,
    public var bufferram: CUlong,
    public var totalswap: CUlong,
    public var freeswap: CUlong,
    public var procs: CUshort,
    public var pad: CUshort,
    public var totalhigh: CUlong,
    public var freehigh: CUlong,
    public var memUnit: CUint,
    public var f: List<CChar>,
)

public open class SemT(public var size: List<CChar>)

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 56

public val SIZEOF_PTHREAD_BARRIER_T: Int = 32

public val SYS_GETTID: CLong = 5178L
