package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
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
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.S64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.U64

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

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public open class Aiocb(
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    public var nextPrio: Aiocb?,
    public var absPrio: CInt,
    public var policy: CInt,
    public var errorCode: CInt,
    public var returnValue: SsizeT,
    public var aioOffset: OffT,
    public var glibcReserved: List<CChar>,
)

public open class ExitStatus(public var eTermination: CShort, public var eExit: CShort)

public open class Timeval(public var tvSec: Int, public var tvUsec: Int)

public open class Glob64T(
    public var glPathc: SizeT,
    public var glPathv: COpaquePointer?,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var unused1: COpaquePointer?,
    public var unused2: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
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
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

public open class Mallinfo(
    public var arena: CInt,
    public var ordblks: CInt,
    public var smblks: CInt,
    public var hblks: CInt,
    public var hblkhd: CInt,
    public var usmblks: CInt,
    public var fsmblks: CInt,
    public var uordblks: CInt,
    public var fordblks: CInt,
    public var keepcost: CInt,
)

public open class Mallinfo2(
    public var arena: SizeT,
    public var ordblks: SizeT,
    public var smblks: SizeT,
    public var hblks: SizeT,
    public var hblkhd: SizeT,
    public var usmblks: SizeT,
    public var fsmblks: SizeT,
    public var uordblks: SizeT,
    public var fordblks: SizeT,
    public var keepcost: SizeT,
)

public open class Ntptimeval(
    public var time: Timeval,
    public var maxerror: CLong,
    public var esterror: CLong,
    public var tai: CLong,
    public var glibcReserved1: CLong,
    public var glibcReserved2: CLong,
    public var glibcReserved3: CLong,
    public var glibcReserved4: CLong,
)

public open class RegexT(
    public var buffer: COpaquePointer?,
    public var allocated: SizeT,
    public var used: SizeT,
    public var syntax: CUlong,
    public var fastmap: COpaquePointer?,
    public var translate: COpaquePointer?,
    public var reNsub: SizeT,
    public var bitfield: UByte,
)

public open class Elf64Chdr(
    public var chType: Elf64Word,
    public var chReserved: Elf64Word,
    public var chSize: Elf64Xword,
    public var chAddralign: Elf64Xword,
)

public open class Elf32Chdr(
    public var chType: Elf32Word,
    public var chSize: Elf32Word,
    public var chAddralign: Elf32Word,
)

public open class Seminfo(
    public var semmap: CInt,
    public var semmni: CInt,
    public var semmns: CInt,
    public var semmnu: CInt,
    public var semmsl: CInt,
    public var semopm: CInt,
    public var semume: CInt,
    public var semusz: CInt,
    public var semvmx: CInt,
    public var semaem: CInt,
)

public open class PtracePeeksiginfoArgs(
    public var off: U64,
    public var flags: U32,
    public var nr: S32,
)

public open class CAnonymousPtraceSyscallInfoEntry(public var nr: U64, public var args: List<U64>)

public open class CAnonymousPtraceSyscallInfoExit(public var sval: S64, public var isError: U8)

public open class CAnonymousPtraceSyscallInfoSeccomp(
    public var nr: U64,
    public var args: List<U64>,
    public var retData: U32,
)

public open class PtraceSyscallInfo(
    public var op: U8,
    public var pad: List<U8>,
    public var arch: U32,
    public var instructionPointer: U64,
    public var stackPointer: U64,
    public var u: CAnonymousPtraceSyscallInfoData,
)

public open class PtraceSudConfig(
    public var mode: U64,
    public var selector: U64,
    public var offset: U64,
    public var len: U64,
)

public open class Iocb(
    public var aioData: U64,
    public var aioKey: U32,
    public var aioRwFlags: KernelRwfT,
    public var aioLioOpcode: U16,
    public var aioReqprio: S16,
    public var aioFildes: U32,
    public var aioBuf: U64,
    public var aioNbytes: U64,
    public var aioOffset: S64,
    public var aioReserved2: U64,
    public var aioFlags: U32,
    public var aioResfd: U32,
)

// netinet/tcp.h
public open class TcpInfo(
    public var tcpiState: UByte,
    public var tcpiCaState: UByte,
    public var tcpiRetransmits: UByte,
    public var tcpiProbes: UByte,
    public var tcpiBackoff: UByte,
    public var tcpiOptions: UByte,
    /**
     * This contains the bitfields `tcpiSndWscale` and `tcpiRcvWscale`.
     * Each is 4 bits.
     */
    public var tcpiSndRcvWscale: UByte,
    public var tcpiRto: UInt,
    public var tcpiAto: UInt,
    public var tcpiSndMss: UInt,
    public var tcpiRcvMss: UInt,
    public var tcpiUnacked: UInt,
    public var tcpiSacked: UInt,
    public var tcpiLost: UInt,
    public var tcpiRetrans: UInt,
    public var tcpiFackets: UInt,
    public var tcpiLastDataSent: UInt,
    public var tcpiLastAckSent: UInt,
    public var tcpiLastDataRecv: UInt,
    public var tcpiLastAckRecv: UInt,
    public var tcpiPmtu: UInt,
    public var tcpiRcvSsthresh: UInt,
    public var tcpiRtt: UInt,
    public var tcpiRttvar: UInt,
    public var tcpiSndSsthresh: UInt,
    public var tcpiSndCwnd: UInt,
    public var tcpiAdvmss: UInt,
    public var tcpiReordering: UInt,
    public var tcpiRcvRtt: UInt,
    public var tcpiRcvSpace: UInt,
    public var tcpiTotalRetrans: UInt,
)

public open class FanotifyEventInfoPidfd(public var hdr: FanotifyEventInfoHeader, public var pidfd: S32)

public open class FanotifyEventInfoError(
    public var hdr: FanotifyEventInfoHeader,
    public var error: S32,
    public var errorCount: U32,
)

public open class SemT(public var size: List<CChar>)

public open class MbstateT(public var count: CInt, public var wchb: List<CChar>)

public open class Fpos64T(public var pos: Off64T, public var state: MbstateT)

public open class FposT(public var pos: OffT, public var state: MbstateT)

// linux x32 compatibility
// See https://sourceware.org/bugzilla/showBug.cgi?id=16437
public open class Timespec(
    public var tvSec: TimeT,
    public var tvNsec: CLong,
    public var pad: Int,
)

public open class Utmpx(
    public var utType: CShort,
    public var utPid: PidT,
    public var utLine: List<CChar>,
    public var utId: List<CChar>,
    public var utUser: List<CChar>,
    public var utHost: List<CChar>,
    public var utExit: ExitStatus,
    public var utSession: CLong,
    public var utTv: Timeval,
    public var utAddrV6: List<Int>,
    public var glibcReserved: List<CChar>,
)

public open class SifieldsSigchld(
    public var siPid: PidT,
    public var siUid: UidT,
    public var siStatus: CInt,
    public var siUtime: CLong,
    public var siStime: CLong,
)

public open class Sifields(public var alignPointer: COpaquePointer?? = null, public var sigchld: SifieldsSigchld? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "sifields").finishNonExhaustive()
    }
}

public open class SiginfoF(public var siginfoBase: List<CInt>, public var sifields: Sifields)

public open class CAnonymousPtraceSyscallInfoData(
    public var entry: CAnonymousPtraceSyscallInfoEntry? = null,
    public var exit: CAnonymousPtraceSyscallInfoExit? = null,
    public var seccomp: CAnonymousPtraceSyscallInfoSeccomp? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ptrace_syscall_info_data").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousPtraceSyscallInfoData): Boolean {
        return this.entry == other.entry || this.exit == other.exit || this.seccomp == other.seccomp
    }

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
