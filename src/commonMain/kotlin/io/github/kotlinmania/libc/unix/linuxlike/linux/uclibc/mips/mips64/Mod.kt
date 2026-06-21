// port-lint: source unix/linux_like/linux/uclibc/mips/mips64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips64

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias BlkcntT = Long
public typealias BlksizeT = Long
public typealias FsblkcntT = CULong
public typealias FsfilcntT = CULong
public typealias InoT = ULong
public typealias NlinkT = ULong
public typealias OffT = Long
public typealias SusecondsT = Long
public typealias TimeT = Long
public typealias WcharT = Int

public data class Stat(
    val stDev: CULong,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULong,
    val stSize: OffT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
)

public data class Stat64(
    val stDev: CULong,
    val stIno: Ino64T,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: CULong,
    val stSize: Off64T,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stBlksize: BlksizeT,
    val stBlocks: Blkcnt64T,
)

public data class PthreadAttrT(
    val size: ULongArray,
)

public data class Sigaction(
    val saFlags: CInt,
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val restorer: COpaquePointer?,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class SigsetT(
    val size: ULongArray,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siErrno: CInt,
)

public data class IpcPerm(
    val key: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: CUInt,
    val seq: CUShort,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmCpid: PidT,
    val shmLpid: PidT,
    val shmNattch: ShmattT,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
    val msgCbytes: CULong,
    val msgQnum: MsgqnumT,
    val msgQbytes: MsglenT,
    val msgLspid: PidT,
    val msgLrpid: PidT,
)

public data class Statfs(
    val fType: CLong,
    val fBsize: CLong,
    val fFrsize: CLong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fFiles: FsblkcntT,
    val fFfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFsid: FsidT,
    val fNamelen: CLong,
    val fSpare: LongArray,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: CInt,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
)

public data class Sysinfo(
    val uptime: CLong,
    val loads: ULongArray,
    val totalram: CULong,
    val freeram: CULong,
    val sharedram: CULong,
    val bufferram: CULong,
    val totalswap: CULong,
    val freeswap: CULong,
    val procs: CUShort,
    val pad: CUShort,
    val totalhigh: CULong,
    val freehigh: CULong,
    val memUnit: CUInt,
    val f: ByteArray,
)

public data class SemT(
    val size: ByteArray,
)

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public const val SYS_gettid: CLong = 5178
