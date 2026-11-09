package io.github.kotlinmania.libc.unix.linuxlike.android

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
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.SaFamilyT
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.aarch64.U64

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
public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
)

public open class FsidT(public var value: List<CInt>)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CcT,
    public var cCc: List<CcT>,
)

public open class Termios2(
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
    public var lStart: KernelLoffT,
    public var lLen: KernelLoffT,
    public var lPid: KernelPidT,
)

public open class CpuSetT(public var bits: List<CpuBittype>)

public open class SemT(public var count: CUint, public var reserved: List<CInt>)

public open class ExitStatus(public var eTermination: CShort, public var eExit: CShort)

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
    public var fReserved: List<UInt>,
)

public open class SignalfdSiginfo(
    public var ssiSigno: UInt,
    public var ssiErrno: Int,
    public var ssiCode: Int,
    public var ssiPid: UInt,
    public var ssiUid: UInt,
    public var ssiFd: Int,
    public var ssiTid: UInt,
    public var ssiBand: UInt,
    public var ssiOverrun: UInt,
    public var ssiTrapno: UInt,
    public var ssiStatus: Int,
    public var ssiInt: Int,
    public var ssiPtr: CUlonglong,
    public var ssiUtime: CUlonglong,
    public var ssiStime: CUlonglong,
    public var ssiAddr: CUlonglong,
    public var ssiAddrLsb: UShort,
    public var pad2: UShort,
    public var ssiSyscall: Int,
    public var ssiCallAddr: ULong,
    public var ssiArch: UInt,
    public var pad: List<UByte>,
)

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public open class Genlmsghdr(
    public var cmd: UByte,
    public var version: UByte,
    public var reserved: UShort,
)

public open class Nlmsghdr(
    public var nlmsgLen: UInt,
    public var nlmsgType: UShort,
    public var nlmsgFlags: UShort,
    public var nlmsgSeq: UInt,
    public var nlmsgPid: UInt,
)

public open class Nlmsgerr(public var error: CInt, public var msg: Nlmsghdr)

public open class NlPktinfo(public var group: UInt)

public open class NlMmapReq(
    public var nmBlockSize: CUint,
    public var nmBlockNr: CUint,
    public var nmFrameSize: CUint,
    public var nmFrameNr: CUint,
)

public open class NlMmapHdr(
    public var nmStatus: CUint,
    public var nmLen: CUint,
    public var nmGroup: UInt,
    public var nmPid: UInt,
    public var nmUid: UInt,
    public var nmGid: UInt,
)

public open class Nlattr(public var nlaLen: UShort, public var nlaType: UShort)

public open class In6Pktinfo(public var ipi6Addr: In6Addr, public var ipi6Ifindex: CInt)

public open class InotifyEvent(
    public var wd: CInt,
    public var mask: UInt,
    public var cookie: UInt,
    public var len: UInt,
)

public open class SockExtendedErr(
    public var eeErrno: UInt,
    public var eeOrigin: UByte,
    public var eeType: UByte,
    public var eeCode: UByte,
    public var eePad: UByte,
    public var eeInfo: UInt,
    public var eeData: UInt,
)

public open class RegexT(
    public var reMagic: CInt,
    public var reNsub: SizeT,
    public var reEndp: COpaquePointer?,
    public var reGuts: COpaquePointer?,
)

public open class RegmatchT(public var rmSo: SsizeT, public var rmEo: SsizeT)

public open class SockaddrVm(
    public var svmFamily: SaFamilyT,
    public var svmReserved1: CUshort,
    public var svmPort: CUint,
    public var svmCid: CUint,
    public var svmZero: List<UByte>,
)

// linux/elf.h
public open class Elf32Phdr(
    public var pType: Elf32Word,
    public var pOffset: Elf32Off,
    public var pVaddr: Elf32Addr,
    public var pPaddr: Elf32Addr,
    public var pFilesz: Elf32Word,
    public var pMemsz: Elf32Word,
    public var pFlags: Elf32Word,
    public var pAlign: Elf32Word,
)

public open class Elf64Phdr(
    public var pType: Elf64Word,
    public var pFlags: Elf64Word,
    public var pOffset: Elf64Off,
    public var pVaddr: Elf64Addr,
    public var pPaddr: Elf64Addr,
    public var pFilesz: Elf64Xword,
    public var pMemsz: Elf64Xword,
    public var pAlign: Elf64Xword,
)

// link.h
public open class DlPhdrInfo(
    public var dlpiAddr: Elf64Addr,
    public var dlpiName: COpaquePointer?,
    public var dlpiPhdr: Elf64Phdr?,
    public var dlpiPhnum: Elf64Half,
    // These fields were added in Android R
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: SizeT,
    public var dlpiTlsData: COpaquePointer?,
)

// linux/seccomp.h
public open class SeccompData(
    public var nr: CInt,
    public var arch: U32,
    public var instructionPointer: U64,
    public var args: List<U64>,
)

public open class SeccompMetadata(public var filterOff: U64, public var flags: U64)

public open class PtracePeeksiginfoArgs(
    public var off: U64,
    public var flags: U32,
    public var nr: S32,
)

// linux/input.h
public open class InputEvent(
    public var time: Timeval,
    public var type: U16,
    public var code: U16,
    public var value: S32,
)

public open class InputId(
    public var bustype: U16,
    public var vendor: U16,
    public var product: U16,
    public var version: U16,
)

public open class InputAbsinfo(
    public var value: S32,
    public var minimum: S32,
    public var maximum: S32,
    public var fuzz: S32,
    public var flat: S32,
    public var resolution: S32,
)

public open class InputKeymapEntry(
    public var flags: U8,
    public var len: U8,
    public var index: U16,
    public var keycode: U32,
    public var scancode: List<U8>,
)

public open class InputMask(
    public var type: U32,
    public var codesSize: U32,
    public var codesPtr: U64,
)

public open class FfReplay(public var length: U16, public var delay: U16)

public open class FfTrigger(public var button: U16, public var interval: U16)

public open class FfEnvelope(
    public var attackLength: U16,
    public var attackLevel: U16,
    public var fadeLength: U16,
    public var fadeLevel: U16,
)

public open class FfConstantEffect(public var level: S16, public var envelope: FfEnvelope)

public open class FfRampEffect(
    public var startLevel: S16,
    public var endLevel: S16,
    public var envelope: FfEnvelope,
)

public open class FfConditionEffect(
    public var rightSaturation: U16,
    public var leftSaturation: U16,
    public var rightCoeff: S16,
    public var leftCoeff: S16,
    public var deadband: U16,
    public var center: S16,
)

public open class FfPeriodicEffect(
    public var waveform: U16,
    public var period: U16,
    public var magnitude: S16,
    public var offset: S16,
    public var phase: U16,
    public var envelope: FfEnvelope,
    public var customLen: U32,
    public var customData: CShort?,
)

public open class FfRumbleEffect(public var strongMagnitude: U16, public var weakMagnitude: U16)

public open class FfEffect(
    public var type: U16,
    public var id: S16,
    public var direction: U16,
    public var trigger: FfTrigger,
    public var replay: FfReplay,
    // Note(1.0): this is actually a union
    public var u: List<ULong>,
)

// linux/uinput.h
public open class UinputFfUpload(
    public var requestId: U32,
    public var retval: S32,
    public var effect: FfEffect,
    public var old: FfEffect,
)

public open class UinputFfErase(
    public var requestId: U32,
    public var retval: S32,
    public var effectId: U32,
)

public open class UinputAbsSetup(public var code: U16, public var absinfo: InputAbsinfo)

public open class Option(
    public var name: COpaquePointer?,
    public var hasArg: CInt,
    public var flag: CInt?,
    public var value: CInt,
)

public open class CAnonymousIfruMap(
    public var memStart: CUlong,
    public var memEnd: CUlong,
    public var baseAddr: CUshort,
    public var irq: CUchar,
    public var dma: CUchar,
    public var port: CUchar,
)

public open class In6Ifreq(
    public var ifr6Addr: In6Addr,
    public var ifr6Prefixlen: UInt,
    public var ifr6Ifindex: CInt,
)

public open class SockaddrNl(
    public var nlFamily: SaFamilyT,
    public var nlPad: CUshort,
    public var nlPid: UInt,
    public var nlGroups: UInt,
)

public open class Dirent(
    public var dIno: ULong,
    public var dOff: Long,
    public var dReclen: CUshort,
    public var dType: CUchar,
    public var dName: List<CChar>,
)

public open class Dirent64(
    public var dIno: ULong,
    public var dOff: Long,
    public var dReclen: CUshort,
    public var dType: CUchar,
    public var dName: List<CChar>,
)

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
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var siTid: CInt,
            public var siOverrun: CInt,
            public var siSigval: Sigval,
        )
        return (((this as SiginfoT?) as SiginfoTimer?)).siSigval
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

public open class Lastlog(
    public var llTime: TimeT,
    public var llLine: List<CChar>,
    public var llHost: List<CChar>,
)

public open class Utmp(
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
    public var unused: List<CChar>,
)

public open class SockaddrAlg(
    public var salgFamily: SaFamilyT,
    public var salgType: List<CUchar>,
    public var salgFeat: UInt,
    public var salgMask: UInt,
    public var salgName: List<CUchar>,
)

public open class UinputSetup(
    public var id: InputId,
    public var name: List<CChar>,
    public var ffEffectsMax: U32,
)

public open class UinputUserDev(
    public var name: List<CChar>,
    public var id: InputId,
    public var ffEffectsMax: U32,
    public var absmax: List<S32>,
    public var absmin: List<S32>,
    public var absfuzz: List<S32>,
    public var absflat: List<S32>,
)

public open class PropInfo(
    public var name: List<CChar>,
    public var serial: CUint,
    public var value: List<CChar>,
)

/**
 * WARNING: The `PartialEq`, `Eq` and `Hash` implementations of this
 * type are unsound and will be removed in the future.
 */
public open class AfAlgIv(public var ivlen: UInt, public var iv: List<CUchar>) {
    public open fun asSlice(): List<UByte> {
        return fromRawParts(this.iv, this.ivlen.toInt())
    }

    public open fun eq(other: AfAlgIv): Boolean {
        return this.asSlice() == other.asSlice()
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.asSlice()).hashCode()
        return state
    }
}

public open class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr? = null,
    public var ifruDstaddr: Sockaddr? = null,
    public var ifruBroadaddr: Sockaddr? = null,
    public var ifruNetmask: Sockaddr? = null,
    public var ifruHwaddr: Sockaddr? = null,
    public var ifruFlags: CShort? = null,
    public var ifruIfindex: CInt? = null,
    public var ifruMetric: CInt? = null,
    public var ifruMtu: CInt? = null,
    public var ifruMap: CAnonymousIfruMap? = null,
    public var ifruSlave: List<CChar>? = null,
    public var ifruNewname: List<CChar>? = null,
    public var ifruData: COpaquePointer?? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }
}

public open class Ifreq(
    /**
     * interface name, e.g. "en0"
     */
    public var ifrName: List<CChar>,
    public var ifrIfru: CAnonymousIfrIfru,
)

public open class CAnonymousIfcIfcu(public var ifcuBuf: COpaquePointer?? = null, public var ifcuReq: Ifreq?? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }
}

// Structure used in SIOCGIFCONF request.  Used to retrieve interface
// configuration for machine (useful for programs which must know all
// networks accessible).
public open class Ifconf(
    public var ifcLen: CInt,
    // Size of buffer.
    public var ifcIfcu: CAnonymousIfcIfcu,
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
