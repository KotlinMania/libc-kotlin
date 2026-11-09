package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Blkcnt64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Ino64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.U32
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.FsfilcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.FswordT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.ShmattT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.TimeT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var reserved0: CInt,
    public var saFlags: CInt,
    public var saRestorer: SigactionSaRestorerCallback?,
)

public open class Statfs(
    public var fType: FswordT,
    public var fBsize: FswordT,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFsid: FsidT,
    public var fNamelen: FswordT,
    public var fFrsize: FswordT,
    public var fSpare: List<FswordT>,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

public open class Flock64(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: Off64T,
    public var lLen: Off64T,
    public var lPid: PidT,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var pad: List<CInt>,
    public var align: List<ULong>,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stNlink: NlinkT,
    public var stMode: ModeT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var pad0: CInt,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var stAtimeNsec: Long,
    public var stMtime: TimeT,
    public var stMtimeNsec: Long,
    public var stCtime: TimeT,
    public var stCtimeNsec: Long,
    public var unused: List<Long>,
)

public open class Stat64(
    public var stDev: DevT,
    public var stIno: Ino64T,
    public var stNlink: NlinkT,
    public var stMode: ModeT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var pad0: CInt,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
    public var stBlocks: Blkcnt64T,
    public var stAtime: TimeT,
    public var stAtimeNsec: Long,
    public var stMtime: TimeT,
    public var stMtimeNsec: Long,
    public var stCtime: TimeT,
    public var stCtimeNsec: Long,
    public var reserved: List<Long>,
)

public open class Statfs64(
    public var fType: FswordT,
    public var fBsize: FswordT,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: FswordT,
    public var fFrsize: FswordT,
    public var fFlags: FswordT,
    public var fSpare: List<FswordT>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFavail: ULong,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class PthreadAttrT(public var size: List<ULong>)

public open class LibcFpxreg(
    public var significand: List<UShort>,
    public var exponent: UShort,
    public var private: List<UShort>,
)

public open class LibcXmmreg(public var element: List<UInt>)

public open class LibcFpstate(
    public var cwd: UShort,
    public var swd: UShort,
    public var ftw: UShort,
    public var fop: UShort,
    public var rip: ULong,
    public var rdp: ULong,
    public var mxcsr: UInt,
    public var mxcrMask: UInt,
    public var st: List<LibcFpxreg>,
    public var xmm: List<LibcXmmreg>,
    public var private: List<ULong>,
)

public open class UserRegsStruct(
    public var r15: CUlonglong,
    public var r14: CUlonglong,
    public var r13: CUlonglong,
    public var r12: CUlonglong,
    public var rbp: CUlonglong,
    public var rbx: CUlonglong,
    public var r11: CUlonglong,
    public var r10: CUlonglong,
    public var r9: CUlonglong,
    public var r8: CUlonglong,
    public var rax: CUlonglong,
    public var rcx: CUlonglong,
    public var rdx: CUlonglong,
    public var rsi: CUlonglong,
    public var rdi: CUlonglong,
    public var origRax: CUlonglong,
    public var rip: CUlonglong,
    public var cs: CUlonglong,
    public var eflags: CUlonglong,
    public var rsp: CUlonglong,
    public var ss: CUlonglong,
    public var fsBase: CUlonglong,
    public var gsBase: CUlonglong,
    public var ds: CUlonglong,
    public var es: CUlonglong,
    public var fs: CUlonglong,
    public var gs: CUlonglong,
)

public open class User(
    public var regs: UserRegsStruct,
    public var uFpvalid: CInt,
    public var i387: UserFpregsStruct,
    public var uTsize: CUlonglong,
    public var uDsize: CUlonglong,
    public var uSsize: CUlonglong,
    public var startCode: CUlonglong,
    public var startStack: CUlonglong,
    public var signal: CLonglong,
    public var reserved: CInt,
    public var uAr0: UserRegsStruct?,
    public var uFpstate: UserFpregsStruct?,
    public var magic: CUlonglong,
    public var uComm: List<CChar>,
    public var uDebugreg: List<CUlonglong>,
)

public open class McontextT(
    public var gregs: List<GregT>,
    public var fpregs: LibcFpstate?,
    public var private: List<ULong>,
)

public open class IpcPerm(
    public var key: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: CUshort,
    public var pad1: CUshort,
    public var seq: CUshort,
    public var pad2: CUshort,
    public var unused1: ULong,
    public var unused2: ULong,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: ShmattT,
    public var unused4: ULong,
    public var unused5: ULong,
)

public open class PtraceRseqConfiguration(
    public var rseqAbiPointer: U64,
    public var rseqAbiSize: U32,
    public var signature: U32,
    public var flags: U32,
    public var pad: U32,
)

public open class CloneArgs(
    public var flags: CUlonglong,
    public var pidfd: CUlonglong,
    public var childTid: CUlonglong,
    public var parentTid: CUlonglong,
    public var exitSignal: CUlonglong,
    public var stack: CUlonglong,
    public var stackSize: CUlonglong,
    public var tls: CUlonglong,
    public var setTid: CUlonglong,
    public var setTidSize: CUlonglong,
    public var cgroup: CUlonglong,
)

public open class UserFpregsStruct(
    public var cwd: CUshort,
    public var swd: CUshort,
    public var ftw: CUshort,
    public var fop: CUshort,
    public var rip: CUlonglong,
    public var rdp: CUlonglong,
    public var mxcsr: CUint,
    public var mxcrMask: CUint,
    public var stSpace: List<CUint>,
    public var xmmSpace: List<CUint>,
    public var padding: List<CUint>,
)

public open class UcontextT(
    public var ucFlags: CUlong,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var ucMcontext: McontextT,
    public var ucSigmask: SigsetT,
    public var private: List<UByte>,
    public var ssp: List<CUlonglong>,
)

public open class MaxAlignT(public var priv: List<Double>)
