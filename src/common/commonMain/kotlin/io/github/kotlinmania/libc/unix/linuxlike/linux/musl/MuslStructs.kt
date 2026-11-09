package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.Elf32Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Xword
import io.github.kotlinmania.libc.unix.linuxlike.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.Sigevent
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SigsetT

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

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    public var td: COpaquePointer?,
    public var lock: List<CInt>,
    public var err: CInt,
    public var ret: SsizeT,
    public var aioOffset: OffT,
    public var next: COpaquePointer?,
    public var prev: COpaquePointer?,
    public var dummy4: List<CChar>,
)

public open class FanotifyEventMetadata(
    public var eventLen: CUint,
    public var vers: CUchar,
    public var reserved: CUchar,
    public var metadataLen: CUshort,
    public var mask: CUlonglong,
    public var fd: CInt,
    public var pid: CInt,
)

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
    public var saRestorer: SigactionSaRestorerCallback?,
)

// `mips *` targets swap the `sErrno` and `sCode` fields otherwise this struct is
// target-agnostic (see https://www.openwall.com/lists/musl/2016/01/27/1/2)
//
// Note(union): C implementation uses unions
public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var pad: List<CInt>,
    public var align: List<Int>,
) {
    public open fun siAddr(): COpaquePointer? {
        open class SiginfoSigfault(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var siAddr: COpaquePointer?,
        )
        return (((this as SiginfoT?) as SiginfoSigfault?)).siAddr
    }

    public open fun siValue(): Sigval {
        open class SiginfoSiValue(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var siTimerid: CInt,
            public var siOverrun: CInt,
            public var siValue: Sigval,
        )
        return (((this as SiginfoT?) as SiginfoSiValue?)).siValue
    }

    public open fun sifields(): Sifields {
        return (((this as SiginfoT?) as SiginfoF?)).sifields
    }

    public open fun siPid(): PidT {
        return this.sifields().sigchld.siPid
    }

    public open fun siUid(): UidT {
        return this.sifields().sigchld.siUid
    }

    public open fun siStatus(): CInt {
        return this.sifields().sigchld.siStatus
    }

    public open fun siUtime(): CLong {
        return this.sifields().sigchld.siUtime
    }

    public open fun siStime(): CLong {
        return this.sifields().sigchld.siStime
    }
}

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFavail: FsfilcntT,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fReserved: List<CInt>,
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
    public var fReserved: List<CInt>,
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

public open class RegexT(
    public var reNsub: SizeT,
    public var opaque: COpaquePointer?,
    public var padding: List<COpaquePointer?>,
    public var nsub2: SizeT,
    public var padding2: CChar,
)

public open class Rtentry(
    public var rtPad1: CUlong,
    public var rtDst: Sockaddr,
    public var rtGateway: Sockaddr,
    public var rtGenmask: Sockaddr,
    public var rtFlags: CUshort,
    public var rtPad2: CShort,
    public var rtPad3: CUlong,
    public var rtTos: CUchar,
    public var rtClass: CUchar,
    public var rtPad4: List<CShort>,
    public var rtMetric: CShort,
    public var rtDev: COpaquePointer?,
    public var rtMtu: CUlong,
    public var rtWindow: CUlong,
    public var rtIrtt: CUshort,
)

public open class ExitStatus(public var eTermination: CShort, public var eExit: CShort)

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
    public var padding: List<CInt>,
)

public open class Ntptimeval(
    public var time: Timeval,
    public var maxerror: CLong,
    public var esterror: CLong,
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
    /**
     * This contains the bitfields `tcpiDeliveryRateAppLimited` (1 bit) and
     * `tcpiFastopenClientFail` (2 bits).
     */
    public var tcpiDeliveryFastopenBitfields: UByte,
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
    public var tcpiPacingRate: ULong,
    public var tcpiMaxPacingRate: ULong,
    public var tcpiBytesAcked: ULong,
    public var tcpiBytesReceived: ULong,
    public var tcpiSegsOut: UInt,
    public var tcpiSegsIn: UInt,
    public var tcpiNotsentBytes: UInt,
    public var tcpiMinRtt: UInt,
    public var tcpiDataSegsIn: UInt,
    public var tcpiDataSegsOut: UInt,
    public var tcpiDeliveryRate: ULong,
    public var tcpiBusyTime: ULong,
    public var tcpiRwndLimited: ULong,
    public var tcpiSndbufLimited: ULong,
    public var tcpiDelivered: UInt,
    public var tcpiDeliveredCe: UInt,
    public var tcpiBytesSent: ULong,
    public var tcpiBytesRetrans: ULong,
    public var tcpiDsackDups: UInt,
    public var tcpiReordSeen: UInt,
    public var tcpiRcvOoopack: UInt,
    public var tcpiSndWnd: UInt,
)

public open class Statfs(
    public var fType: CUlong,
    public var fBsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFsid: FsidT,
    public var fNamelen: CUlong,
    public var fFrsize: CUlong,
    public var fFlags: CUlong,
    public var fSpare: List<CUlong>,
)

public open class Statfs64(
    public var fType: CUlong,
    public var fBsize: CUlong,
    public var fBlocks: Fsblkcnt64T,
    public var fBfree: Fsblkcnt64T,
    public var fBavail: Fsblkcnt64T,
    public var fFiles: Fsfilcnt64T,
    public var fFfree: Fsfilcnt64T,
    public var fFsid: FsidT,
    public var fNamelen: CUlong,
    public var fFrsize: CUlong,
    public var fFlags: CUlong,
    public var fSpare: List<CUlong>,
)

public open class Sysinfo(
    public var uptime: CUlong,
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
    public var reserved: List<CChar>,
)

public open class Utmpx(
    public var utType: CShort,
    public var utPad1: CShort,
    public var utPid: PidT,
    public var utLine: List<CChar>,
    public var utId: List<CChar>,
    public var utUser: List<CChar>,
    public var utHost: List<CChar>,
    public var utExit: ExitStatus,
    public var utSession: CLong,
    public var utPad2: CInt,
    public var utTv: Timeval,
    public var utAddrV6: List<CUint>,
    public var unused: List<CChar>,
)
