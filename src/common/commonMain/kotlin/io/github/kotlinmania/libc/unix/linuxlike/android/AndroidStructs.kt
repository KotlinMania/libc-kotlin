@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
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
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.IFNAMSIZ
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
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.UT_HOSTSIZE
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.UT_LINESIZE
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.UT_NAMESIZE
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
public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssFlags: CInt = 0,
    public var ssSize: SizeT = 0uL,
)

public data class FsidT(public var value: IntArray = IntArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsidT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray((NCCS).toInt()),
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
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        return result
    }
}

public data class Termios2(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray(19),
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios2) return false
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

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
)

public data class Flock64(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: KernelLoffT = 0L,
    public var lLen: KernelLoffT = 0L,
    public var lPid: KernelPidT = 0,
)

public data class CpuSetT(public var bits: ULongArray = ULongArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuSetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bits.contentHashCode()
    }
}

public data class SemT(public var count: CUint = 0u, public var reserved: IntArray = IntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (this.count != other.count) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class ExitStatus(public var eTermination: CShort = 0, public var eExit: CShort = 0)

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fReserved.contentEquals(other.fReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fReserved.contentHashCode()
        return result
    }
}

public class SignalfdSiginfo(
    public var ssiSigno: UInt = 0u,
    public var ssiErrno: Int = 0,
    public var ssiCode: Int = 0,
    public var ssiPid: UInt = 0u,
    public var ssiUid: UInt = 0u,
    public var ssiFd: Int = 0,
    public var ssiTid: UInt = 0u,
    public var ssiBand: UInt = 0u,
    public var ssiOverrun: UInt = 0u,
    public var ssiTrapno: UInt = 0u,
    public var ssiStatus: Int = 0,
    public var ssiInt: Int = 0,
    public var ssiPtr: CUlonglong = 0uL,
    public var ssiUtime: CUlonglong = 0uL,
    public var ssiStime: CUlonglong = 0uL,
    public var ssiAddr: CUlonglong = 0uL,
    public var ssiAddrLsb: UShort = 0u,
    public var pad2: UShort = 0u,
    public var ssiSyscall: Int = 0,
    public var ssiCallAddr: ULong = 0uL,
    public var ssiArch: UInt = 0u,
    public var pad: UByteArray = UByteArray(28),
)

public data class Itimerspec(public var itInterval: Timespec = Timespec(), public var itValue: Timespec = Timespec())

public data class Genlmsghdr(
    public var cmd: UByte = 0u,
    public var version: UByte = 0u,
    public var reserved: UShort = 0u,
)

public data class Nlmsghdr(
    public var nlmsgLen: UInt = 0u,
    public var nlmsgType: UShort = 0u,
    public var nlmsgFlags: UShort = 0u,
    public var nlmsgSeq: UInt = 0u,
    public var nlmsgPid: UInt = 0u,
)

public data class Nlmsgerr(public var error: CInt = 0, public var msg: Nlmsghdr = Nlmsghdr())

public data class NlPktinfo(public var group: UInt = 0u)

public data class NlMmapReq(
    public var nmBlockSize: CUint = 0u,
    public var nmBlockNr: CUint = 0u,
    public var nmFrameSize: CUint = 0u,
    public var nmFrameNr: CUint = 0u,
)

public data class NlMmapHdr(
    public var nmStatus: CUint = 0u,
    public var nmLen: CUint = 0u,
    public var nmGroup: UInt = 0u,
    public var nmPid: UInt = 0u,
    public var nmUid: UInt = 0u,
    public var nmGid: UInt = 0u,
)

public data class Nlattr(public var nlaLen: UShort = 0u, public var nlaType: UShort = 0u)

public data class In6Pktinfo(public var ipi6Addr: In6Addr = In6Addr(), public var ipi6Ifindex: CInt = 0)

public data class InotifyEvent(
    public var wd: CInt = 0,
    public var mask: UInt = 0u,
    public var cookie: UInt = 0u,
    public var len: UInt = 0u,
)

public data class SockExtendedErr(
    public var eeErrno: UInt = 0u,
    public var eeOrigin: UByte = 0u,
    public var eeType: UByte = 0u,
    public var eeCode: UByte = 0u,
    public var eePad: UByte = 0u,
    public var eeInfo: UInt = 0u,
    public var eeData: UInt = 0u,
)

public data class RegexT(
    public var reMagic: CInt = 0,
    public var reNsub: SizeT = 0uL,
    public var reEndp: COpaquePointer? = null,
    public var reGuts: COpaquePointer? = null,
)

public data class RegmatchT(public var rmSo: SsizeT = 0L, public var rmEo: SsizeT = 0L)

public data class SockaddrVm(
    public var svmFamily: SaFamilyT = 0u,
    public var svmReserved1: CUshort = 0u,
    public var svmPort: CUint = 0u,
    public var svmCid: CUint = 0u,
    public var svmZero: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrVm) return false
        if (this.svmFamily != other.svmFamily) return false
        if (this.svmReserved1 != other.svmReserved1) return false
        if (this.svmPort != other.svmPort) return false
        if (this.svmCid != other.svmCid) return false
        if (!this.svmZero.contentEquals(other.svmZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svmFamily.hashCode()
        result = 31 * result + this.svmReserved1.hashCode()
        result = 31 * result + this.svmPort.hashCode()
        result = 31 * result + this.svmCid.hashCode()
        result = 31 * result + this.svmZero.contentHashCode()
        return result
    }
}

// linux/elf.h
public data class Elf32Phdr(
    public var pType: Elf32Word = 0u,
    public var pOffset: Elf32Off = 0u,
    public var pVaddr: Elf32Addr = 0u,
    public var pPaddr: Elf32Addr = 0u,
    public var pFilesz: Elf32Word = 0u,
    public var pMemsz: Elf32Word = 0u,
    public var pFlags: Elf32Word = 0u,
    public var pAlign: Elf32Word = 0u,
)

public data class Elf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
)

// link.h
public data class DlPhdrInfo(
    public var dlpiAddr: Elf64Addr = 0uL,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: Elf64Phdr? = null,
    public var dlpiPhnum: Elf64Half = 0u,
    // These fields were added in Android R
    public var dlpiAdds: CUlonglong = 0uL,
    public var dlpiSubs: CUlonglong = 0uL,
    public var dlpiTlsModid: SizeT = 0uL,
    public var dlpiTlsData: COpaquePointer? = null,
)

// linux/seccomp.h
public data class SeccompData(
    public var nr: CInt = 0,
    public var arch: U32 = 0u,
    public var instructionPointer: U64 = 0uL,
    public var args: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeccompData) return false
        if (this.nr != other.nr) return false
        if (this.arch != other.arch) return false
        if (this.instructionPointer != other.instructionPointer) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nr.hashCode()
        result = 31 * result + this.arch.hashCode()
        result = 31 * result + this.instructionPointer.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }
}

public data class SeccompMetadata(public var filterOff: U64 = 0uL, public var flags: U64 = 0uL)

public data class PtracePeeksiginfoArgs(
    public var off: U64 = 0uL,
    public var flags: U32 = 0u,
    public var nr: S32 = 0,
)

// linux/input.h
public data class InputEvent(
    public var time: Timeval = Timeval(),
    public var type: U16 = 0u,
    public var code: U16 = 0u,
    public var value: S32 = 0,
)

public data class InputId(
    public var bustype: U16 = 0u,
    public var vendor: U16 = 0u,
    public var product: U16 = 0u,
    public var version: U16 = 0u,
)

public data class InputAbsinfo(
    public var value: S32 = 0,
    public var minimum: S32 = 0,
    public var maximum: S32 = 0,
    public var fuzz: S32 = 0,
    public var flat: S32 = 0,
    public var resolution: S32 = 0,
)

public data class InputKeymapEntry(
    public var flags: U8 = 0u,
    public var len: U8 = 0u,
    public var index: U16 = 0u,
    public var keycode: U32 = 0u,
    public var scancode: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InputKeymapEntry) return false
        if (this.flags != other.flags) return false
        if (this.len != other.len) return false
        if (this.index != other.index) return false
        if (this.keycode != other.keycode) return false
        if (!this.scancode.contentEquals(other.scancode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.keycode.hashCode()
        result = 31 * result + this.scancode.contentHashCode()
        return result
    }
}

public data class InputMask(
    public var type: U32 = 0u,
    public var codesSize: U32 = 0u,
    public var codesPtr: U64 = 0uL,
)

public data class FfReplay(public var length: U16 = 0u, public var delay: U16 = 0u)

public data class FfTrigger(public var button: U16 = 0u, public var interval: U16 = 0u)

public data class FfEnvelope(
    public var attackLength: U16 = 0u,
    public var attackLevel: U16 = 0u,
    public var fadeLength: U16 = 0u,
    public var fadeLevel: U16 = 0u,
)

public data class FfConstantEffect(public var level: S16 = 0, public var envelope: FfEnvelope = FfEnvelope())

public data class FfRampEffect(
    public var startLevel: S16 = 0,
    public var endLevel: S16 = 0,
    public var envelope: FfEnvelope = FfEnvelope(),
)

public data class FfConditionEffect(
    public var rightSaturation: U16 = 0u,
    public var leftSaturation: U16 = 0u,
    public var rightCoeff: S16 = 0,
    public var leftCoeff: S16 = 0,
    public var deadband: U16 = 0u,
    public var center: S16 = 0,
)

public data class FfPeriodicEffect(
    public var waveform: U16 = 0u,
    public var period: U16 = 0u,
    public var magnitude: S16 = 0,
    public var offset: S16 = 0,
    public var phase: U16 = 0u,
    public var envelope: FfEnvelope = FfEnvelope(),
    public var customLen: U32 = 0u,
    public var customData: CShort? = null,
)

public data class FfRumbleEffect(public var strongMagnitude: U16 = 0u, public var weakMagnitude: U16 = 0u)

public data class FfEffect(
    public var type: U16 = 0u,
    public var id: S16 = 0,
    public var direction: U16 = 0u,
    public var trigger: FfTrigger = FfTrigger(),
    public var replay: FfReplay = FfReplay(),
    // Note(1.0): this is actually a union
    public var u: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FfEffect) return false
        if (this.type != other.type) return false
        if (this.id != other.id) return false
        if (this.direction != other.direction) return false
        if (this.trigger != other.trigger) return false
        if (this.replay != other.replay) return false
        if (!this.u.contentEquals(other.u)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.direction.hashCode()
        result = 31 * result + this.trigger.hashCode()
        result = 31 * result + this.replay.hashCode()
        result = 31 * result + this.u.contentHashCode()
        return result
    }
}

// linux/uinput.h
public data class UinputFfUpload(
    public var requestId: U32 = 0u,
    public var retval: S32 = 0,
    public var effect: FfEffect = FfEffect(),
    public var old: FfEffect = FfEffect(),
)

public data class UinputFfErase(
    public var requestId: U32 = 0u,
    public var retval: S32 = 0,
    public var effectId: U32 = 0u,
)

public data class UinputAbsSetup(public var code: U16 = 0u, public var absinfo: InputAbsinfo = InputAbsinfo())

public data class Option(
    public var name: COpaquePointer? = null,
    public var hasArg: CInt = 0,
    public var flag: CInt? = null,
    public var value: CInt = 0,
)

public data class CAnonymousIfruMap(
    public var memStart: CUlong = 0uL,
    public var memEnd: CUlong = 0uL,
    public var baseAddr: CUshort = 0u,
    public var irq: CUchar = 0u,
    public var dma: CUchar = 0u,
    public var port: CUchar = 0u,
)

public data class In6Ifreq(
    public var ifr6Addr: In6Addr = In6Addr(),
    public var ifr6Prefixlen: UInt = 0u,
    public var ifr6Ifindex: CInt = 0,
)

public data class SockaddrNl(
    public var nlFamily: SaFamilyT = 0u,
    public var nlPad: CUshort = 0u,
    public var nlPid: UInt = 0u,
    public var nlGroups: UInt = 0u,
)

public data class Dirent(
    public var dIno: ULong = 0uL,
    public var dOff: Long = 0L,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class Dirent64(
    public var dIno: ULong = 0uL,
    public var dOff: Long = 0L,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent64) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var pad: IntArray = IntArray(29),
    public var align: IntArray = IntArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siCode != other.siCode) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (!this.align.contentEquals(other.align)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.align.contentHashCode()
        return result
    }

    public fun siAddr(): COpaquePointer? {
        data class SiginfoSigfault(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var siAddr: COpaquePointer? = null,
        )
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoSigfault?))!!.siAddr
    }

    public fun siValue(): Sigval {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var siTid: CInt = 0,
            public var siOverrun: CInt = 0,
            public var siSigval: Sigval = Sigval(),
        )
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoTimer?))!!.siSigval
    }

    public fun sifields(): Sifields {
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoF?))!!.sifields
    }

    public fun siPid(): PidT {
        return this.sifields().sigchld.siPid
    }

    public fun siUid(): UidT {
        return this.sifields().sigchld.siUid
    }

    public fun siStatus(): CInt {
        return this.sifields().sigchld.siStatus
    }

    public fun siUtime(): CLong {
        return this.sifields().sigchld.siUtime
    }

    public fun siStime(): CLong {
        return this.sifields().sigchld.siStime
    }
}

public data class Lastlog(
    public var llTime: TimeT = 0L,
    public var llLine: UByteArray = UByteArray((UT_LINESIZE).toInt()),
    public var llHost: UByteArray = UByteArray((UT_HOSTSIZE).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lastlog) return false
        if (this.llTime != other.llTime) return false
        if (!this.llLine.contentEquals(other.llLine)) return false
        if (!this.llHost.contentEquals(other.llHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.llTime.hashCode()
        result = 31 * result + this.llLine.contentHashCode()
        result = 31 * result + this.llHost.contentHashCode()
        return result
    }
}

public data class Utmp(
    public var utType: CShort = 0,
    public var utPid: PidT = 0,
    public var utLine: UByteArray = UByteArray((UT_LINESIZE).toInt()),
    public var utId: UByteArray = UByteArray(4),
    public var utUser: UByteArray = UByteArray((UT_NAMESIZE).toInt()),
    public var utHost: UByteArray = UByteArray((UT_HOSTSIZE).toInt()),
    public var utExit: ExitStatus = ExitStatus(),
    public var utSession: CLong = 0L,
    public var utTv: Timeval = Timeval(),
    public var utAddrV6: IntArray = IntArray(4),
    public var unused: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmp) return false
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
        if (!this.unused.contentEquals(other.unused)) return false
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
        result = 31 * result + this.unused.contentHashCode()
        return result
    }
}

public data class SockaddrAlg(
    public var salgFamily: SaFamilyT = 0u,
    public var salgType: UByteArray = UByteArray(14),
    public var salgFeat: UInt = 0u,
    public var salgMask: UInt = 0u,
    public var salgName: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrAlg) return false
        if (this.salgFamily != other.salgFamily) return false
        if (!this.salgType.contentEquals(other.salgType)) return false
        if (this.salgFeat != other.salgFeat) return false
        if (this.salgMask != other.salgMask) return false
        if (!this.salgName.contentEquals(other.salgName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.salgFamily.hashCode()
        result = 31 * result + this.salgType.contentHashCode()
        result = 31 * result + this.salgFeat.hashCode()
        result = 31 * result + this.salgMask.hashCode()
        result = 31 * result + this.salgName.contentHashCode()
        return result
    }
}

public data class UinputSetup(
    public var id: InputId = InputId(),
    public var name: UByteArray = UByteArray((UINPUT_MAX_NAME_SIZE).toInt()),
    public var ffEffectsMax: U32 = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UinputSetup) return false
        if (this.id != other.id) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.ffEffectsMax != other.ffEffectsMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.ffEffectsMax.hashCode()
        return result
    }
}

public data class UinputUserDev(
    public var name: UByteArray = UByteArray((UINPUT_MAX_NAME_SIZE).toInt()),
    public var id: InputId = InputId(),
    public var ffEffectsMax: U32 = 0u,
    public var absmax: IntArray = IntArray((ABS_CNT).toInt()),
    public var absmin: IntArray = IntArray((ABS_CNT).toInt()),
    public var absfuzz: IntArray = IntArray((ABS_CNT).toInt()),
    public var absflat: IntArray = IntArray((ABS_CNT).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UinputUserDev) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.id != other.id) return false
        if (this.ffEffectsMax != other.ffEffectsMax) return false
        if (!this.absmax.contentEquals(other.absmax)) return false
        if (!this.absmin.contentEquals(other.absmin)) return false
        if (!this.absfuzz.contentEquals(other.absfuzz)) return false
        if (!this.absflat.contentEquals(other.absflat)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.ffEffectsMax.hashCode()
        result = 31 * result + this.absmax.contentHashCode()
        result = 31 * result + this.absmin.contentHashCode()
        result = 31 * result + this.absfuzz.contentHashCode()
        result = 31 * result + this.absflat.contentHashCode()
        return result
    }
}

public data class PropInfo(
    public var name: UByteArray = UByteArray(32),
    public var serial: CUint = 0u,
    public var value: UByteArray = UByteArray(92),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropInfo) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.serial != other.serial) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.serial.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

/**
 * WARNING: The `PartialEq`, `Eq` and `Hash` implementations of this
 * type are unsound and will be removed in the future.
 */
public data class AfAlgIv(public var ivlen: UInt = 0u, public var iv: UByteArray = UByteArray(0)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AfAlgIv) return false
        if (this.ivlen != other.ivlen) return false
        if (!this.iv.contentEquals(other.iv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ivlen.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        return result
    }

    public fun asSlice(): List<UByte> {
        return emptyList()
    }

    public fun eq(other: AfAlgIv): Boolean {
        return this.asSlice() == other.asSlice()
    }
}

public data class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr = Sockaddr(),
    public var ifruDstaddr: Sockaddr = Sockaddr(),
    public var ifruBroadaddr: Sockaddr = Sockaddr(),
    public var ifruNetmask: Sockaddr = Sockaddr(),
    public var ifruHwaddr: Sockaddr = Sockaddr(),
    public var ifruFlags: CShort = 0,
    public var ifruIfindex: CInt = 0,
    public var ifruMetric: CInt = 0,
    public var ifruMtu: CInt = 0,
    public var ifruMap: CAnonymousIfruMap = CAnonymousIfruMap(),
    public var ifruSlave: UByteArray = UByteArray((IFNAMSIZ).toInt()),
    public var ifruNewname: UByteArray = UByteArray((IFNAMSIZ).toInt()),
    public var ifruData: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruNetmask != other.ifruNetmask) return false
        if (this.ifruHwaddr != other.ifruHwaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruIfindex != other.ifruIfindex) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruMap != other.ifruMap) return false
        if (!this.ifruSlave.contentEquals(other.ifruSlave)) return false
        if (!this.ifruNewname.contentEquals(other.ifruNewname)) return false
        if (this.ifruData != other.ifruData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruNetmask.hashCode()
        result = 31 * result + this.ifruHwaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruIfindex.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruMap.hashCode()
        result = 31 * result + this.ifruSlave.contentHashCode()
        result = 31 * result + this.ifruNewname.contentHashCode()
        result = 31 * result + this.ifruData.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }
}

public data class Ifreq(
    /**
     * interface name, e.g. "en0"
     */
    public var ifrName: UByteArray = UByteArray((IFNAMSIZ).toInt()),
    public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifreq) return false
        if (!this.ifrName.contentEquals(other.ifrName)) return false
        if (this.ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrName.contentHashCode()
        result = 31 * result + this.ifrIfru.hashCode()
        return result
    }
}

public data class CAnonymousIfcIfcu(public var ifcuBuf: COpaquePointer? = null, public var ifcuReq: Ifreq? = null) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }
}

// Structure used in SIOCGIFCONF request.  Used to retrieve interface
// configuration for machine (useful for programs which must know all
// networks accessible).
public data class Ifconf(
    public var ifcLen: CInt = 0,
    // Size of buffer.
    public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu(),
)

public data class SifieldsSigchld(
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siStatus: CInt = 0,
    public var siUtime: CLong = 0L,
    public var siStime: CLong = 0L,
)

public data class Sifields(public var alignPointer: COpaquePointer? = null, public var sigchld: SifieldsSigchld = SifieldsSigchld()) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "sifields").finishNonExhaustive()
    }
}

public data class SiginfoF(public var siginfoBase: IntArray = IntArray(3), public var sifields: Sifields = Sifields()) {
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
