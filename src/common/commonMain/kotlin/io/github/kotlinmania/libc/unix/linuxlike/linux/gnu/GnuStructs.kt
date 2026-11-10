@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.Elf32Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Xword
import io.github.kotlinmania.libc.unix.linuxlike.Sigevent
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.FanotifyEventInfoHeader
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.S16
import io.github.kotlinmania.libc.unix.linuxlike.linux.S32
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.U16
import io.github.kotlinmania.libc.unix.linuxlike.linux.U32
import io.github.kotlinmania.libc.unix.linuxlike.linux.U8
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.NCCS
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.S64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.U64

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct =
        apply {
            fields.add("$name: $value")
        }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append("$name { ${fields.joinToString(", ")} }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public data class Aiocb(
    public var aioFildes: CInt = 0,
    public var aioLioOpcode: CInt = 0,
    public var aioReqprio: CInt = 0,
    public var aioBuf: COpaquePointer? = null,
    public var aioNbytes: SizeT = 0uL,
    public var aioSigevent: Sigevent = Sigevent(),
    public var nextPrio: Aiocb? = null,
    public var absPrio: CInt = 0,
    public var policy: CInt = 0,
    public var errorCode: CInt = 0,
    public var returnValue: SsizeT = 0L,
    public var aioOffset: OffT = 0L,
    public var glibcReserved: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.nextPrio != other.nextPrio) return false
        if (this.absPrio != other.absPrio) return false
        if (this.policy != other.policy) return false
        if (this.errorCode != other.errorCode) return false
        if (this.returnValue != other.returnValue) return false
        if (this.aioOffset != other.aioOffset) return false
        if (!this.glibcReserved.contentEquals(other.glibcReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.nextPrio.hashCode()
        result = 31 * result + this.absPrio.hashCode()
        result = 31 * result + this.policy.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.returnValue.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.glibcReserved.contentHashCode()
        return result
    }
}

public data class ExitStatus(
    public var eTermination: CShort = 0,
    public var eExit: CShort = 0,
)

public data class Timeval(
    public var tvSec: Int = 0,
    public var tvUsec: Int = 0,
)

public data class Glob64T(
    public var glPathc: SizeT = 0uL,
    public var glPathv: COpaquePointer? = null,
    public var glOffs: SizeT = 0uL,
    public var glFlags: CInt = 0,
    public var unused1: COpaquePointer? = null,
    public var unused2: COpaquePointer? = null,
    public var unused3: COpaquePointer? = null,
    public var unused4: COpaquePointer? = null,
    public var unused5: COpaquePointer? = null,
)

public data class Msghdr(
    public var msgName: COpaquePointer? = null,
    public var msgNamelen: SocklenT = 0u,
    public var msgIov: Iovec? = null,
    public var msgIovlen: SizeT = 0uL,
    public var msgControl: COpaquePointer? = null,
    public var msgControllen: SizeT = 0uL,
    public var msgFlags: CInt = 0,
)

public data class Cmsghdr(
    public var cmsgLen: SizeT = 0uL,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (this.cLine != other.cLine) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }
}

public data class Mallinfo(
    public var arena: CInt = 0,
    public var ordblks: CInt = 0,
    public var smblks: CInt = 0,
    public var hblks: CInt = 0,
    public var hblkhd: CInt = 0,
    public var usmblks: CInt = 0,
    public var fsmblks: CInt = 0,
    public var uordblks: CInt = 0,
    public var fordblks: CInt = 0,
    public var keepcost: CInt = 0,
)

public data class Mallinfo2(
    public var arena: SizeT = 0uL,
    public var ordblks: SizeT = 0uL,
    public var smblks: SizeT = 0uL,
    public var hblks: SizeT = 0uL,
    public var hblkhd: SizeT = 0uL,
    public var usmblks: SizeT = 0uL,
    public var fsmblks: SizeT = 0uL,
    public var uordblks: SizeT = 0uL,
    public var fordblks: SizeT = 0uL,
    public var keepcost: SizeT = 0uL,
)

public data class Ntptimeval(
    public var time: Timeval = Timeval(),
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var tai: CLong = 0L,
    public var glibcReserved1: CLong = 0L,
    public var glibcReserved2: CLong = 0L,
    public var glibcReserved3: CLong = 0L,
    public var glibcReserved4: CLong = 0L,
)

public data class RegexT(
    public var buffer: COpaquePointer? = null,
    public var allocated: SizeT = 0uL,
    public var used: SizeT = 0uL,
    public var syntax: CUlong = 0uL,
    public var fastmap: COpaquePointer? = null,
    public var translate: COpaquePointer? = null,
    public var reNsub: SizeT = 0uL,
    public var bitfield: UByte = 0u,
)

public data class Elf64Chdr(
    public var chType: Elf64Word = 0u,
    public var chReserved: Elf64Word = 0u,
    public var chSize: Elf64Xword = 0uL,
    public var chAddralign: Elf64Xword = 0uL,
)

public data class Elf32Chdr(
    public var chType: Elf32Word = 0u,
    public var chSize: Elf32Word = 0u,
    public var chAddralign: Elf32Word = 0u,
)

public data class Seminfo(
    public var semmap: CInt = 0,
    public var semmni: CInt = 0,
    public var semmns: CInt = 0,
    public var semmnu: CInt = 0,
    public var semmsl: CInt = 0,
    public var semopm: CInt = 0,
    public var semume: CInt = 0,
    public var semusz: CInt = 0,
    public var semvmx: CInt = 0,
    public var semaem: CInt = 0,
)

public data class PtracePeeksiginfoArgs(
    public var off: U64 = 0uL,
    public var flags: U32 = 0u,
    public var nr: S32 = 0,
)

public data class CAnonymousPtraceSyscallInfoEntry(
    public var nr: U64 = 0uL,
    public var args: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousPtraceSyscallInfoEntry) return false
        if (this.nr != other.nr) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nr.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }
}

public data class CAnonymousPtraceSyscallInfoExit(
    public var sval: S64 = 0L,
    public var isError: U8 = 0u,
)

public data class CAnonymousPtraceSyscallInfoSeccomp(
    public var nr: U64 = 0uL,
    public var args: ULongArray = ULongArray(6),
    public var retData: U32 = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousPtraceSyscallInfoSeccomp) return false
        if (this.nr != other.nr) return false
        if (!this.args.contentEquals(other.args)) return false
        if (this.retData != other.retData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nr.hashCode()
        result = 31 * result + this.args.contentHashCode()
        result = 31 * result + this.retData.hashCode()
        return result
    }
}

public data class PtraceSyscallInfo(
    public var op: U8 = 0u,
    public var pad: UByteArray = UByteArray(3),
    public var arch: U32 = 0u,
    public var instructionPointer: U64 = 0uL,
    public var stackPointer: U64 = 0uL,
    public var u: CAnonymousPtraceSyscallInfoData = CAnonymousPtraceSyscallInfoData(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceSyscallInfo) return false
        if (this.op != other.op) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.arch != other.arch) return false
        if (this.instructionPointer != other.instructionPointer) return false
        if (this.stackPointer != other.stackPointer) return false
        if (this.u != other.u) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.op.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.arch.hashCode()
        result = 31 * result + this.instructionPointer.hashCode()
        result = 31 * result + this.stackPointer.hashCode()
        result = 31 * result + this.u.hashCode()
        return result
    }
}

public data class PtraceSudConfig(
    public var mode: U64 = 0uL,
    public var selector: U64 = 0uL,
    public var offset: U64 = 0uL,
    public var len: U64 = 0uL,
)

public data class Iocb(
    public var aioData: U64 = 0uL,
    public var aioKey: U32 = 0u,
    public var aioRwFlags: KernelRwfT = 0,
    public var aioLioOpcode: U16 = 0u,
    public var aioReqprio: S16 = 0,
    public var aioFildes: U32 = 0u,
    public var aioBuf: U64 = 0uL,
    public var aioNbytes: U64 = 0uL,
    public var aioOffset: S64 = 0L,
    public var aioReserved2: U64 = 0uL,
    public var aioFlags: U32 = 0u,
    public var aioResfd: U32 = 0u,
)

// netinet/tcp.h
public class TcpInfo(
    public var tcpiState: UByte = 0u,
    public var tcpiCaState: UByte = 0u,
    public var tcpiRetransmits: UByte = 0u,
    public var tcpiProbes: UByte = 0u,
    public var tcpiBackoff: UByte = 0u,
    public var tcpiOptions: UByte = 0u,
    /**
     * This contains the bitfields `tcpiSndWscale` and `tcpiRcvWscale`.
     * Each is 4 bits.
     */
    public var tcpiSndRcvWscale: UByte = 0u,
    public var tcpiRto: UInt = 0u,
    public var tcpiAto: UInt = 0u,
    public var tcpiSndMss: UInt = 0u,
    public var tcpiRcvMss: UInt = 0u,
    public var tcpiUnacked: UInt = 0u,
    public var tcpiSacked: UInt = 0u,
    public var tcpiLost: UInt = 0u,
    public var tcpiRetrans: UInt = 0u,
    public var tcpiFackets: UInt = 0u,
    public var tcpiLastDataSent: UInt = 0u,
    public var tcpiLastAckSent: UInt = 0u,
    public var tcpiLastDataRecv: UInt = 0u,
    public var tcpiLastAckRecv: UInt = 0u,
    public var tcpiPmtu: UInt = 0u,
    public var tcpiRcvSsthresh: UInt = 0u,
    public var tcpiRtt: UInt = 0u,
    public var tcpiRttvar: UInt = 0u,
    public var tcpiSndSsthresh: UInt = 0u,
    public var tcpiSndCwnd: UInt = 0u,
    public var tcpiAdvmss: UInt = 0u,
    public var tcpiReordering: UInt = 0u,
    public var tcpiRcvRtt: UInt = 0u,
    public var tcpiRcvSpace: UInt = 0u,
    public var tcpiTotalRetrans: UInt = 0u,
)

public data class FanotifyEventInfoPidfd(
    public var hdr: FanotifyEventInfoHeader = FanotifyEventInfoHeader(),
    public var pidfd: S32 = 0,
)

public data class FanotifyEventInfoError(
    public var hdr: FanotifyEventInfoHeader = FanotifyEventInfoHeader(),
    public var error: S32 = 0,
    public var errorCount: U32 = 0u,
)

public data class SemT(
    public var size: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()
}

public data class MbstateT(
    public var count: CInt = 0,
    public var wchb: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MbstateT) return false
        if (this.count != other.count) return false
        if (!this.wchb.contentEquals(other.wchb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.wchb.contentHashCode()
        return result
    }
}

public data class Fpos64T(
    public var pos: Off64T = 0L,
    public var state: MbstateT = MbstateT(),
)

public data class FposT(
    public var pos: OffT = 0L,
    public var state: MbstateT = MbstateT(),
)

// linux x32 compatibility
// See https://sourceware.org/bugzilla/showBug.cgi?id=16437
public data class Timespec(
    public var tvSec: TimeT = 0L,
    public var tvNsec: CLong = 0L,
    public var pad: Int = 0,
)

public data class Utmpx(
    public var utType: CShort = 0,
    public var utPid: PidT = 0,
    public var utLine: UByteArray = UByteArray(UT_LINESIZE),
    public var utId: UByteArray = UByteArray(4),
    public var utUser: UByteArray = UByteArray(UT_NAMESIZE),
    public var utHost: UByteArray = UByteArray(UT_HOSTSIZE),
    public var utExit: ExitStatus = ExitStatus(),
    public var utSession: CLong = 0L,
    public var utTv: Timeval = Timeval(),
    public var utAddrV6: IntArray = IntArray(4),
    public var glibcReserved: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utPid != other.utPid) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utExit != other.utExit) return false
        if (this.utSession != other.utSession) return false
        if (this.utTv != other.utTv) return false
        if (!this.utAddrV6.contentEquals(other.utAddrV6)) return false
        if (!this.glibcReserved.contentEquals(other.glibcReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utSession.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utAddrV6.contentHashCode()
        result = 31 * result + this.glibcReserved.contentHashCode()
        return result
    }
}

public data class SifieldsSigchld(
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siStatus: CInt = 0,
    public var siUtime: CLong = 0L,
    public var siStime: CLong = 0L,
)

public data class Sifields(
    public var alignPointer: COpaquePointer? = null,
    public var sigchld: SifieldsSigchld = SifieldsSigchld(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "sifields").finishNonExhaustive()
    }
}

public data class SiginfoF(
    public var siginfoBase: IntArray = IntArray(3),
    public var sifields: Sifields = Sifields(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoF) return false
        if (!this.siginfoBase.contentEquals(other.siginfoBase)) return false
        if (this.sifields != other.sifields) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siginfoBase.contentHashCode()
        result = 31 * result + this.sifields.hashCode()
        return result
    }
}

public data class CAnonymousPtraceSyscallInfoData(
    public var entry: CAnonymousPtraceSyscallInfoEntry = CAnonymousPtraceSyscallInfoEntry(),
    public var exit: CAnonymousPtraceSyscallInfoExit = CAnonymousPtraceSyscallInfoExit(),
    public var seccomp: CAnonymousPtraceSyscallInfoSeccomp = CAnonymousPtraceSyscallInfoSeccomp(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ptrace_syscall_info_data").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousPtraceSyscallInfoData): Boolean = this.entry == other.entry || this.exit == other.exit || this.seccomp == other.seccomp

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.entry).hashCode()
            state = 31 * state + (this.exit).hashCode()
            state = 31 * state + (this.seccomp).hashCode()
        }
        return state
    }
}
