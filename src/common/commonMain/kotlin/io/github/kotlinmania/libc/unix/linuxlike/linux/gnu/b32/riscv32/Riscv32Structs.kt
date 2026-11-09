package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.riscv32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
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
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.Fsblkcnt64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.Fsfilcnt64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FsfilcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.NlinkT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.ShmattT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.TimeT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct = apply {
        fields.add("$name: $value")
    }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append(name).append(" { ").append(fields.joinToString(", ")).append(" }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var glibcReserved4: CUlong,
    public var glibcReserved5: CUlong,
)

public open class Stat64(
    public var stDev: DevT,
    public var stIno: Ino64T,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad1: DevT,
    public var stSize: Off64T,
    public var stBlksize: BlksizeT,
    public var pad2: CInt,
    public var stBlocks: Blkcnt64T,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var unused: List<CInt>,
)

public open class Statfs(
    public var fType: CLong,
    public var fBsize: CLong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFsid: FsidT,
    public var fNamelen: CLong,
    public var fFrsize: CLong,
    public var fFlags: CLong,
    public var fSpare: List<CLong>,
)

public open class Statfs64(
    public var fType: CLong,
    public var fBsize: CLong,
    public var fBlocks: Fsblkcnt64T,
    public var fBfree: Fsblkcnt64T,
    public var fBavail: Fsblkcnt64T,
    public var fFiles: Fsfilcnt64T,
    public var fFfree: Fsfilcnt64T,
    public var fFsid: FsidT,
    public var fNamelen: CLong,
    public var fFrsize: CLong,
    public var fFlags: CLong,
    public var fSpare: List<CLong>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: Fsblkcnt64T,
    public var fBfree: Fsblkcnt64T,
    public var fBavail: Fsblkcnt64T,
    public var fFiles: Fsfilcnt64T,
    public var fFfree: Fsfilcnt64T,
    public var fFavail: Fsfilcnt64T,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
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

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
    public var saRestorer: SigactionSaRestorerCallback?,
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
    public var unused1: CUlong,
    public var unused2: CUlong,
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
    public var unused5: CUlong,
    public var unused6: CUlong,
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

public open class UserRegsStruct(
    public var pc: CUlong,
    public var ra: CUlong,
    public var sp: CUlong,
    public var gp: CUlong,
    public var tp: CUlong,
    public var t0: CUlong,
    public var t1: CUlong,
    public var t2: CUlong,
    public var s0: CUlong,
    public var s1: CUlong,
    public var a0: CUlong,
    public var a1: CUlong,
    public var a2: CUlong,
    public var a3: CUlong,
    public var a4: CUlong,
    public var a5: CUlong,
    public var a6: CUlong,
    public var a7: CUlong,
    public var s2: CUlong,
    public var s3: CUlong,
    public var s4: CUlong,
    public var s5: CUlong,
    public var s6: CUlong,
    public var s7: CUlong,
    public var s8: CUlong,
    public var s9: CUlong,
    public var s10: CUlong,
    public var s11: CUlong,
    public var t3: CUlong,
    public var t4: CUlong,
    public var t5: CUlong,
    public var t6: CUlong,
)

public open class UcontextT(
    public var ucFlags: CUlong,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var ucSigmask: SigsetT,
    public var ucMcontext: McontextT,
)

public open class McontextT(public var gregs: List<CUlong>, public var fpregs: RiscvMcFpState)

public open class RiscvMcFpState(
    public var f: RiscvMcFExtState? = null,
    public var d: RiscvMcDExtState? = null,
    public var q: RiscvMcQExtState? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__riscv_mc_fp_state").finishNonExhaustive()
    }
}

public open class RiscvMcFExtState(public var f: List<CUint>, public var fcsr: CUint)

public open class RiscvMcDExtState(public var f: List<CUlonglong>, public var fcsr: CUint)

public open class RiscvMcQExtState(
    public var f: List<CUlonglong>,
    public var fcsr: CUint,
    public var glibcReserved: List<CUint>,
)
