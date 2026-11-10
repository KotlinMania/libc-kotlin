// port-lint: source unix/linux_like/linux_l4re_shared.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
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
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.RLIM_INFINITY
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Ino64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadOnceT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Rlim64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Cmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.RlimT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.RegoffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errnum: CInt): CInt
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: COpaquePointer?, size: SizeT, data: COpaquePointer?): CInt
}

public typealias Elf32Half = UShort

public typealias Elf32Word = UInt

public typealias Elf32Off = UInt

public typealias Elf32Addr = UInt

public typealias Elf32Xword = ULong

public typealias Elf32Sword = Int

public typealias Elf64Half = UShort

public typealias Elf64Word = UInt

public typealias Elf64Off = ULong

public typealias Elf64Addr = ULong

public typealias Elf64Xword = ULong

public typealias Elf64Sxword = Long

public typealias Elf64Sword = Int

public typealias Elf32Section = UShort

public typealias Elf64Section = UShort

public typealias Elf32Relr = Elf32Word

public typealias Elf64Relr = Elf32Xword

public typealias Elf32Rel = CAnonymousElf32Rel

public typealias Elf64Rel = CAnonymousElf64Rel

public typealias Elf32Rela = CAnonymousElf32Rela

public typealias Elf64Rela = CAnonymousElf64Rela

public typealias IconvT = COpaquePointer?

public class Fpos64T(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public data class GlobT(
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

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0u,
    public var pwGid: GidT = 0u,
    public var pwGecos: COpaquePointer? = null,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
)

public data class Spwd(
    public var spNamp: COpaquePointer? = null,
    public var spPwdp: COpaquePointer? = null,
    public var spLstchg: CLong = 0L,
    public var spMin: CLong = 0L,
    public var spMax: CLong = 0L,
    public var spWarn: CLong = 0L,
    public var spInact: CLong = 0L,
    public var spExpire: CLong = 0L,
    public var spFlag: CUlong = 0uL,
)

public data class Itimerspec(public var itInterval: Timespec = Timespec(), public var itValue: Timespec = Timespec())

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

public data class PacketMreq(
    public var mrIfindex: CInt = 0,
    public var mrType: CUshort = 0u,
    public var mrAlen: CUshort = 0u,
    public var mrAddress: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PacketMreq) return false
        if (this.mrIfindex != other.mrIfindex) return false
        if (this.mrType != other.mrType) return false
        if (this.mrAlen != other.mrAlen) return false
        if (!this.mrAddress.contentEquals(other.mrAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mrIfindex.hashCode()
        result = 31 * result + this.mrType.hashCode()
        result = 31 * result + this.mrAlen.hashCode()
        result = 31 * result + this.mrAddress.contentHashCode()
        return result
    }
}

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

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
)

public data class DlPhdrInfo(
    public var dlpiAddr: Elf64Addr = 0uL,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: Elf64Phdr? = null,
    public var dlpiPhnum: Elf64Half = 0u,
    // As of uClibc 1.0.36, the following fields are
    // gated behind a "#if 0" block which always evaluates
    // to false. So I'm just removing these, and if uClibc changes
    // the #if block in the future to include the following fields, these
    // will probably need including here. tsidea, skrap
    // QNX (NTO) platform does not define these fields
    public var dlpiAdds: CUlonglong = 0uL,
    public var dlpiSubs: CUlonglong = 0uL,
    public var dlpiTlsModid: SizeT = 0uL,
    public var dlpiTlsData: COpaquePointer? = null,
)

public data class Elf32Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf32Half = 0u,
    public var eMachine: Elf32Half = 0u,
    public var eVersion: Elf32Word = 0u,
    public var eEntry: Elf32Addr = 0u,
    public var ePhoff: Elf32Off = 0u,
    public var eShoff: Elf32Off = 0u,
    public var eFlags: Elf32Word = 0u,
    public var eEhsize: Elf32Half = 0u,
    public var ePhentsize: Elf32Half = 0u,
    public var ePhnum: Elf32Half = 0u,
    public var eShentsize: Elf32Half = 0u,
    public var eShnum: Elf32Half = 0u,
    public var eShstrndx: Elf32Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf32Ehdr) return false
        if (!this.eIdent.contentEquals(other.eIdent)) return false
        if (this.eType != other.eType) return false
        if (this.eMachine != other.eMachine) return false
        if (this.eVersion != other.eVersion) return false
        if (this.eEntry != other.eEntry) return false
        if (this.ePhoff != other.ePhoff) return false
        if (this.eShoff != other.eShoff) return false
        if (this.eFlags != other.eFlags) return false
        if (this.eEhsize != other.eEhsize) return false
        if (this.ePhentsize != other.ePhentsize) return false
        if (this.ePhnum != other.ePhnum) return false
        if (this.eShentsize != other.eShentsize) return false
        if (this.eShnum != other.eShnum) return false
        if (this.eShstrndx != other.eShstrndx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eIdent.contentHashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eMachine.hashCode()
        result = 31 * result + this.eVersion.hashCode()
        result = 31 * result + this.eEntry.hashCode()
        result = 31 * result + this.ePhoff.hashCode()
        result = 31 * result + this.eShoff.hashCode()
        result = 31 * result + this.eFlags.hashCode()
        result = 31 * result + this.eEhsize.hashCode()
        result = 31 * result + this.ePhentsize.hashCode()
        result = 31 * result + this.ePhnum.hashCode()
        result = 31 * result + this.eShentsize.hashCode()
        result = 31 * result + this.eShnum.hashCode()
        result = 31 * result + this.eShstrndx.hashCode()
        return result
    }
}

public data class Elf64Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf64Half = 0u,
    public var eMachine: Elf64Half = 0u,
    public var eVersion: Elf64Word = 0u,
    public var eEntry: Elf64Addr = 0uL,
    public var ePhoff: Elf64Off = 0uL,
    public var eShoff: Elf64Off = 0uL,
    public var eFlags: Elf64Word = 0u,
    public var eEhsize: Elf64Half = 0u,
    public var ePhentsize: Elf64Half = 0u,
    public var ePhnum: Elf64Half = 0u,
    public var eShentsize: Elf64Half = 0u,
    public var eShnum: Elf64Half = 0u,
    public var eShstrndx: Elf64Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf64Ehdr) return false
        if (!this.eIdent.contentEquals(other.eIdent)) return false
        if (this.eType != other.eType) return false
        if (this.eMachine != other.eMachine) return false
        if (this.eVersion != other.eVersion) return false
        if (this.eEntry != other.eEntry) return false
        if (this.ePhoff != other.ePhoff) return false
        if (this.eShoff != other.eShoff) return false
        if (this.eFlags != other.eFlags) return false
        if (this.eEhsize != other.eEhsize) return false
        if (this.ePhentsize != other.ePhentsize) return false
        if (this.ePhnum != other.ePhnum) return false
        if (this.eShentsize != other.eShentsize) return false
        if (this.eShnum != other.eShnum) return false
        if (this.eShstrndx != other.eShstrndx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eIdent.contentHashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eMachine.hashCode()
        result = 31 * result + this.eVersion.hashCode()
        result = 31 * result + this.eEntry.hashCode()
        result = 31 * result + this.ePhoff.hashCode()
        result = 31 * result + this.eShoff.hashCode()
        result = 31 * result + this.eFlags.hashCode()
        result = 31 * result + this.eEhsize.hashCode()
        result = 31 * result + this.ePhentsize.hashCode()
        result = 31 * result + this.ePhnum.hashCode()
        result = 31 * result + this.eShentsize.hashCode()
        result = 31 * result + this.eShnum.hashCode()
        result = 31 * result + this.eShstrndx.hashCode()
        return result
    }
}

public data class Elf32Sym(
    public var stName: Elf32Word = 0u,
    public var stValue: Elf32Addr = 0u,
    public var stSize: Elf32Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf32Section = 0u,
)

public data class Elf64Sym(
    public var stName: Elf64Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf64Section = 0u,
    public var stValue: Elf64Addr = 0uL,
    public var stSize: Elf64Xword = 0uL,
)

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

public data class Elf32Shdr(
    public var shName: Elf32Word = 0u,
    public var shType: Elf32Word = 0u,
    public var shFlags: Elf32Word = 0u,
    public var shAddr: Elf32Addr = 0u,
    public var shOffset: Elf32Off = 0u,
    public var shSize: Elf32Word = 0u,
    public var shLink: Elf32Word = 0u,
    public var shInfo: Elf32Word = 0u,
    public var shAddralign: Elf32Word = 0u,
    public var shEntsize: Elf32Word = 0u,
)

public data class Elf64Shdr(
    public var shName: Elf64Word = 0u,
    public var shType: Elf64Word = 0u,
    public var shFlags: Elf64Xword = 0uL,
    public var shAddr: Elf64Addr = 0uL,
    public var shOffset: Elf64Off = 0uL,
    public var shSize: Elf64Xword = 0uL,
    public var shLink: Elf64Word = 0u,
    public var shInfo: Elf64Word = 0u,
    public var shAddralign: Elf64Xword = 0uL,
    public var shEntsize: Elf64Xword = 0uL,
)

public data class CAnonymousElf32Rel(public var rOffset: Elf32Addr = 0u, public var rInfo: Elf32Word = 0u)

public data class CAnonymousElf64Rel(public var rOffset: Elf64Addr = 0uL, public var rInfo: Elf64Xword = 0uL)

public data class Ucred(
    public var pid: PidT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
)

public data class Mntent(
    public var mntFsname: COpaquePointer? = null,
    public var mntDir: COpaquePointer? = null,
    public var mntType: COpaquePointer? = null,
    public var mntOpts: COpaquePointer? = null,
    public var mntFreq: CInt = 0,
    public var mntPassno: CInt = 0,
)

public data class In6Pktinfo(public var ipi6Addr: In6Addr = In6Addr(), public var ipi6Ifindex: CUint = 0u)

public data class ArpdRequest(
    public var req: CUshort = 0u,
    public var ip: UInt = 0u,
    public var dev: CUlong = 0uL,
    public var stamp: CUlong = 0uL,
    public var updated: CUlong = 0uL,
    public var ha: UByteArray = UByteArray(MAX_ADDR_LEN),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArpdRequest) return false
        if (this.req != other.req) return false
        if (this.ip != other.ip) return false
        if (this.dev != other.dev) return false
        if (this.stamp != other.stamp) return false
        if (this.updated != other.updated) return false
        if (!this.ha.contentEquals(other.ha)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.req.hashCode()
        result = 31 * result + this.ip.hashCode()
        result = 31 * result + this.dev.hashCode()
        result = 31 * result + this.stamp.hashCode()
        result = 31 * result + this.updated.hashCode()
        result = 31 * result + this.ha.contentHashCode()
        return result
    }
}

public data class RegmatchT(public var rmSo: RegoffT = 0L, public var rmEo: RegoffT = 0L)

public data class Option(
    public var name: COpaquePointer? = null,
    public var hasArg: CInt = 0,
    public var flag: CInt? = null,
    public var value: CInt = 0,
)

public data class Rlimit64(public var rlimCur: Rlim64T = 0uL, public var rlimMax: Rlim64T = 0uL)

public data class CAnonymousIfruMap(
    public var memStart: CUlong = 0uL,
    public var memEnd: CUlong = 0uL,
    public var baseAddr: CUshort = 0u,
    public var irq: CUchar = 0u,
    public var dma: CUchar = 0u,
    public var port: CUchar = 0u,
)

public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dOff: OffT = 0L,
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
    public var dIno: Ino64T = 0uL,
    public var dOff: Off64T = 0L,
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

public data class CAnonymousElf32Rela(
    public var rOffset: Elf32Addr = 0u,
    public var rInfo: Elf32Word = 0u,
    public var rAddend: Elf32Sword = 0,
)

public data class CAnonymousElf64Rela(
    public var rOffset: Elf64Addr = 0uL,
    public var rInfo: Elf64Xword = 0uL,
    public var rAddend: Elf64Sxword = 0L,
)

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
    public var ifruSlave: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifruNewname: UByteArray = UByteArray(IFNAMSIZ.toInt()),
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
}

public data class Ifreq(
    /**
     * interface name, e.g. "en0"
     */
    public var ifrName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
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

public data class CAnonymousIfcIfcu(public var ifcuBuf: COpaquePointer? = null, public var ifcuReq: Ifreq? = null)

/**
 * Structure used in SIOCGIFCONF request.  Used to retrieve interface configuration for
 * machine (useful for programs which must know all networks accessible).
 */
public data class Ifconf(
    /**
     * Size of buffer
     */
    public var ifcLen: CInt = 0,
    public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu(),
)

public val DATE_BASE: NlItem = 0x20000

public val DATE_BASE1: NlItem = 768

public val ABDAY_1: NlItem = DATE_BASE

public val ABDAY_2: NlItem = DATE_BASE + 0x1

public val ABDAY_3: NlItem = DATE_BASE + 0x2

public val ABDAY_4: NlItem = DATE_BASE + 0x3

public val ABDAY_5: NlItem = DATE_BASE + 0x4

public val ABDAY_6: NlItem = DATE_BASE + 0x5

public val ABDAY_7: NlItem = DATE_BASE + 0x6

public val DAY_1: NlItem = DATE_BASE + 0x7

public val DAY_2: NlItem = DATE_BASE + 0x8

public val DAY_3: NlItem = DATE_BASE + 0x9

public val DAY_4: NlItem = DATE_BASE + 0xA

public val DAY_5: NlItem = DATE_BASE + 0xB

public val DAY_6: NlItem = DATE_BASE + 0xC

public val DAY_7: NlItem = DATE_BASE + 0xD

public val ABMON_1: NlItem = DATE_BASE + 0xE

public val ABMON_2: NlItem = DATE_BASE + 0xF

public val ABMON_3: NlItem = DATE_BASE + 0x10

public val ABMON_4: NlItem = DATE_BASE + 0x11

public val ABMON_5: NlItem = DATE_BASE + 0x12

public val ABMON_6: NlItem = DATE_BASE + 0x13

public val ABMON_7: NlItem = DATE_BASE + 0x14

public val ABMON_8: NlItem = DATE_BASE + 0x15

public val ABMON_9: NlItem = DATE_BASE + 0x16

public val ABMON_10: NlItem = DATE_BASE + 0x17

public val ABMON_11: NlItem = DATE_BASE + 0x18

public val ABMON_12: NlItem = DATE_BASE + 0x19

public val MON_1: NlItem = DATE_BASE + 0x1A

public val MON_2: NlItem = DATE_BASE + 0x1B

public val MON_3: NlItem = DATE_BASE + 0x1C

public val MON_4: NlItem = DATE_BASE + 0x1D

public val MON_5: NlItem = DATE_BASE + 0x1E

public val MON_6: NlItem = DATE_BASE + 0x1F

public val MON_7: NlItem = DATE_BASE + 0x20

public val MON_8: NlItem = DATE_BASE + 0x21

public val MON_9: NlItem = DATE_BASE + 0x22

public val MON_10: NlItem = DATE_BASE + 0x23

public val MON_11: NlItem = DATE_BASE + 0x24

public val MON_12: NlItem = DATE_BASE + 0x25

public val AM_STR: NlItem = DATE_BASE + 0x26

public val PM_STR: NlItem = DATE_BASE + 0x27

public val D_T_FMT: NlItem = DATE_BASE + 0x28

public val D_FMT: NlItem = DATE_BASE + 0x29

public val T_FMT: NlItem = DATE_BASE + 0x2A

public val T_FMT_AMPM: NlItem = DATE_BASE + 0x2B

public val ERA: NlItem = DATE_BASE + 0x2C

public val ERA_D_FMT: NlItem = DATE_BASE + 0x2E

public val ALT_DIGITS: NlItem = DATE_BASE + 0x2F

public val ERA_D_T_FMT: NlItem = DATE_BASE + 0x30

public val ERA_T_FMT: NlItem = DATE_BASE + 0x31

public val CODESET: NlItem = 14

public val CRNCYSTR: NlItem = 0x4000F

public val RADIXCHAR: NlItem = 0x10000

public val THOUSEP: NlItem = 0x10001

public val YESEXPR: NlItem = 0x50000

public val NOEXPR: NlItem = 0x50001

public val YESSTR: NlItem = 0x50002

public val NOSTR: NlItem = 0x50003

public val CODESET1: NlItem = 10

public val CRNCYSTR1: NlItem = 0x215

public val RADIXCHAR1: NlItem = 0x100

public val THOUSEP1: NlItem = 0x101

public val YESEXPR1: NlItem = 0x500

public val NOEXPR1: NlItem = 0x501

public val YESSTR1: NlItem = 0x502

public val NOSTR1: NlItem = 0x503

public val RUSAGE_CHILDREN: CInt = -1

public val L_TMPNAM: CUint = 20u

public val PC_LINK_MAX: CInt = 0

public val PC_MAX_CANON: CInt = 1

public val PC_MAX_INPUT: CInt = 2

public val PC_NAME_MAX: CInt = 3

public val PC_PATH_MAX: CInt = 4

public val PC_PIPE_BUF: CInt = 5

public val PC_CHOWN_RESTRICTED: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_SYNC_IO: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SOCK_MAXBUF: CInt = 12

public val PC_FILESIZEBITS: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_ALLOC_SIZE_MIN: CInt = 18

public val PC_SYMLINK_MAX: CInt = 19

public val PC_2_SYMLINKS: CInt = 20

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

public val SC_JOB_CONTROL: CInt = 7

public val SC_SAVED_IDS: CInt = 8

public val SC_REALTIME_SIGNALS: CInt = 9

public val SC_PRIORITY_SCHEDULING: CInt = 10

public val SC_TIMERS: CInt = 11

public val SC_ASYNCHRONOUS_IO: CInt = 12

public val SC_PRIORITIZED_IO: CInt = 13

public val SC_SYNCHRONIZED_IO: CInt = 14

public val SC_FSYNC: CInt = 15

public val SC_MAPPED_FILES: CInt = 16

public val SC_MEMLOCK: CInt = 17

public val SC_MEMLOCK_RANGE: CInt = 18

public val SC_MEMORY_PROTECTION: CInt = 19

public val SC_MESSAGE_PASSING: CInt = 20

public val SC_SEMAPHORES: CInt = 21

public val SC_SHARED_MEMORY_OBJECTS: CInt = 22

public val SC_AIO_LISTIO_MAX: CInt = 23

public val SC_AIO_MAX: CInt = 24

public val SC_AIO_PRIO_DELTA_MAX: CInt = 25

public val SC_DELAYTIMER_MAX: CInt = 26

public val SC_MQ_OPEN_MAX: CInt = 27

public val SC_MQ_PRIO_MAX: CInt = 28

public val SC_VERSION: CInt = 29

public val SC_PAGESIZE: CInt = 30

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_RTSIG_MAX: CInt = 31

public val SC_SEM_NSEMS_MAX: CInt = 32

public val SC_SEM_VALUE_MAX: CInt = 33

public val SC_SIGQUEUE_MAX: CInt = 34

public val SC_TIMER_MAX: CInt = 35

public val SC_BC_BASE_MAX: CInt = 36

public val SC_BC_DIM_MAX: CInt = 37

public val SC_BC_SCALE_MAX: CInt = 38

public val SC_BC_STRING_MAX: CInt = 39

public val SC_COLL_WEIGHTS_MAX: CInt = 40

public val SC_EXPR_NEST_MAX: CInt = 42

public val SC_LINE_MAX: CInt = 43

public val SC_RE_DUP_MAX: CInt = 44

public val SC_2_VERSION: CInt = 46

public val SC_2_C_BIND: CInt = 47

public val SC_2_C_DEV: CInt = 48

public val SC_2_FORT_DEV: CInt = 49

public val SC_2_FORT_RUN: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_LOCALEDEF: CInt = 52

public val SC_UIO_MAXIOV: CInt = 60

public val SC_IOV_MAX: CInt = 60

public val SC_THREADS: CInt = 67

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 68

public val SC_GETGR_R_SIZE_MAX: CInt = 69

public val SC_GETPW_R_SIZE_MAX: CInt = 70

public val SC_LOGIN_NAME_MAX: CInt = 71

public val SC_TTY_NAME_MAX: CInt = 72

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73

public val SC_THREAD_KEYS_MAX: CInt = 74

public val SC_THREAD_STACK_MIN: CInt = 75

public val SC_THREAD_THREADS_MAX: CInt = 76

public val SC_THREAD_ATTR_STACKADDR: CInt = 77

public val SC_THREAD_ATTR_STACKSIZE: CInt = 78

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 79

public val SC_THREAD_PRIO_INHERIT: CInt = 80

public val SC_THREAD_PRIO_PROTECT: CInt = 81

public val SC_THREAD_PROCESS_SHARED: CInt = 82

public val SC_NPROCESSORS_CONF: CInt = 83

public val SC_NPROCESSORS_ONLN: CInt = 84

public val SC_PHYS_PAGES: CInt = 85

public val SC_AVPHYS_PAGES: CInt = 86

public val SC_ATEXIT_MAX: CInt = 87

public val SC_PASS_MAX: CInt = 88

public val SC_XOPEN_VERSION: CInt = 89

public val SC_XOPEN_XCU_VERSION: CInt = 90

public val SC_XOPEN_UNIX: CInt = 91

public val SC_XOPEN_CRYPT: CInt = 92

public val SC_XOPEN_ENH_I18N: CInt = 93

public val SC_XOPEN_SHM: CInt = 94

public val SC_2_CHAR_TERM: CInt = 95

public val SC_2_UPE: CInt = 97

public val SC_XOPEN_XPG2: CInt = 98

public val SC_XOPEN_XPG3: CInt = 99

public val SC_XOPEN_XPG4: CInt = 100

public val SC_NZERO: CInt = 109

public val SC_XBS5_ILP32_OFF32: CInt = 125

public val SC_XBS5_ILP32_OFFBIG: CInt = 126

public val SC_XBS5_LP64_OFF64: CInt = 127

public val SC_XBS5_LPBIG_OFFBIG: CInt = 128

public val SC_XOPEN_LEGACY: CInt = 129

public val SC_XOPEN_REALTIME: CInt = 130

public val SC_XOPEN_REALTIME_THREADS: CInt = 131

public val SC_ADVISORY_INFO: CInt = 132

public val SC_BARRIERS: CInt = 133

public val SC_CLOCK_SELECTION: CInt = 137

public val SC_CPUTIME: CInt = 138

public val SC_THREAD_CPUTIME: CInt = 139

public val SC_MONOTONIC_CLOCK: CInt = 149

public val SC_READER_WRITER_LOCKS: CInt = 153

public val SC_SPIN_LOCKS: CInt = 154

public val SC_REGEXP: CInt = 155

public val SC_SHELL: CInt = 157

public val SC_SPAWN: CInt = 159

public val SC_SPORADIC_SERVER: CInt = 160

public val SC_THREAD_SPORADIC_SERVER: CInt = 161

public val SC_TIMEOUTS: CInt = 164

public val SC_TYPED_MEMORY_OBJECTS: CInt = 165

public val SC_2_PBS: CInt = 168

public val SC_2_PBS_ACCOUNTING: CInt = 169

public val SC_2_PBS_LOCATE: CInt = 170

public val SC_2_PBS_MESSAGE: CInt = 171

public val SC_2_PBS_TRACK: CInt = 172

public val SC_SYMLOOP_MAX: CInt = 173

public val SC_STREAMS: CInt = 174

public val SC_2_PBS_CHECKPOINT: CInt = 175

public val SC_V6_ILP32_OFF32: CInt = 176

public val SC_V6_ILP32_OFFBIG: CInt = 177

public val SC_V6_LP64_OFF64: CInt = 178

public val SC_V6_LPBIG_OFFBIG: CInt = 179

public val SC_HOST_NAME_MAX: CInt = 180

public val SC_TRACE: CInt = 181

public val SC_TRACE_EVENT_FILTER: CInt = 182

public val SC_TRACE_INHERIT: CInt = 183

public val SC_TRACE_LOG: CInt = 184

public val SC_IPV6: CInt = 235

public val SC_RAW_SOCKETS: CInt = 236

public val SC_V7_ILP32_OFF32: CInt = 237

public val SC_V7_ILP32_OFFBIG: CInt = 238

public val SC_V7_LP64_OFF64: CInt = 239

public val SC_V7_LPBIG_OFFBIG: CInt = 240

public val SC_SS_REPL_MAX: CInt = 241

public val SC_TRACE_EVENT_NAME_MAX: CInt = 242

public val SC_TRACE_NAME_MAX: CInt = 243

public val SC_TRACE_SYS_MAX: CInt = 244

public val SC_TRACE_USER_EVENT_MAX: CInt = 245

public val SC_XOPEN_STREAMS: CInt = 246

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248

public val CS_PATH: CInt = 0

public val CS_POSIX_V6_WIDTH_RESTRICTED_ENVS: CInt = 1

public val CS_POSIX_V5_WIDTH_RESTRICTED_ENVS: CInt = 4

public val CS_POSIX_V7_WIDTH_RESTRICTED_ENVS: CInt = 5

public val CS_POSIX_V6_ILP32_OFF32_CFLAGS: CInt = 1116

public val CS_POSIX_V6_ILP32_OFF32_LDFLAGS: CInt = 1117

public val CS_POSIX_V6_ILP32_OFF32_LIBS: CInt = 1118

public val CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: CInt = 1119

public val CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: CInt = 1120

public val CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: CInt = 1121

public val CS_POSIX_V6_ILP32_OFFBIG_LIBS: CInt = 1122

public val CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: CInt = 1123

public val CS_POSIX_V6_LP64_OFF64_CFLAGS: CInt = 1124

public val CS_POSIX_V6_LP64_OFF64_LDFLAGS: CInt = 1125

public val CS_POSIX_V6_LP64_OFF64_LIBS: CInt = 1126

public val CS_POSIX_V6_LP64_OFF64_LINTFLAGS: CInt = 1127

public val CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: CInt = 1128

public val CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: CInt = 1129

public val CS_POSIX_V6_LPBIG_OFFBIG_LIBS: CInt = 1130

public val CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: CInt = 1131

public val CS_POSIX_V7_ILP32_OFF32_CFLAGS: CInt = 1132

public val CS_POSIX_V7_ILP32_OFF32_LDFLAGS: CInt = 1133

public val CS_POSIX_V7_ILP32_OFF32_LIBS: CInt = 1134

public val CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: CInt = 1135

public val CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: CInt = 1136

public val CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: CInt = 1137

public val CS_POSIX_V7_ILP32_OFFBIG_LIBS: CInt = 1138

public val CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: CInt = 1139

public val CS_POSIX_V7_LP64_OFF64_CFLAGS: CInt = 1140

public val CS_POSIX_V7_LP64_OFF64_LDFLAGS: CInt = 1141

public val CS_POSIX_V7_LP64_OFF64_LIBS: CInt = 1142

public val CS_POSIX_V7_LP64_OFF64_LINTFLAGS: CInt = 1143

public val CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: CInt = 1144

public val CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: CInt = 1145

public val CS_POSIX_V7_LPBIG_OFFBIG_LIBS: CInt = 1146

public val CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: CInt = 1147

public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY

// elf.h - Fields in the eIdent array.
public val EI_NIDENT: Int = 16

public val EI_MAG0: Int = 0

public val ELFMAG0: UByte = 0x7fu

public val EI_MAG1: Int = 1

public val ELFMAG1: UByte = 69u

public val EI_MAG2: Int = 2

public val ELFMAG2: UByte = 76u

public val EI_MAG3: Int = 3

public val ELFMAG3: UByte = 70u

public val SELFMAG: Int = 4

public val EI_CLASS: Int = 4

public val ELFCLASSNONE: UByte = 0u

public val ELFCLASS32: UByte = 1u

public val ELFCLASS64: UByte = 2u

public val ELFCLASSNUM: Int = 3

public val EI_DATA: Int = 5

public val ELFDATANONE: UByte = 0u

public val ELFDATA2LSB: UByte = 1u

public val ELFDATA2MSB: UByte = 2u

public val ELFDATANUM: Int = 3

public val EI_VERSION: Int = 6

public val EI_OSABI: Int = 7

public val ELFOSABI_NONE: UByte = 0u

public val ELFOSABI_SYSV: UByte = 0u

public val ELFOSABI_HPUX: UByte = 1u

public val ELFOSABI_NETBSD: UByte = 2u

public val ELFOSABI_GNU: UByte = 3u

public val ELFOSABI_LINUX: UByte = ELFOSABI_GNU

public val ELFOSABI_SOLARIS: UByte = 6u

public val ELFOSABI_AIX: UByte = 7u

public val ELFOSABI_IRIX: UByte = 8u

public val ELFOSABI_FREEBSD: UByte = 9u

public val ELFOSABI_TRU64: UByte = 10u

public val ELFOSABI_MODESTO: UByte = 11u

public val ELFOSABI_OPENBSD: UByte = 12u

public val ELFOSABI_ARM: UByte = 97u

public val ELFOSABI_STANDALONE: UByte = 255u

public val EI_ABIVERSION: Int = 8

public val EI_PAD: Int = 9

// elf.h - Legal values for eType (object file type).
public val ET_NONE: UShort = 0u

public val ET_REL: UShort = 1u

public val ET_EXEC: UShort = 2u

public val ET_DYN: UShort = 3u

public val ET_CORE: UShort = 4u

public val ET_NUM: UShort = 5u

public val ET_LOOS: UShort = 0xfe00u

public val ET_HIOS: UShort = 0xfeffu

public val ET_LOPROC: UShort = 0xff00u

public val ET_HIPROC: UShort = 0xffffu

// elf.h - Legal values for eMachine (architecture).
public val EM_NONE: UShort = 0u

public val EM_M32: UShort = 1u

public val EM_SPARC: UShort = 2u

public val EM_386: UShort = 3u

public val EM_68K: UShort = 4u

public val EM_88K: UShort = 5u

public val EM_860: UShort = 7u

public val EM_MIPS: UShort = 8u

public val EM_S370: UShort = 9u

public val EM_MIPS_RS3_LE: UShort = 10u

public val EM_PARISC: UShort = 15u

public val EM_VPP500: UShort = 17u

public val EM_SPARC32PLUS: UShort = 18u

public val EM_960: UShort = 19u

public val EM_PPC: UShort = 20u

public val EM_PPC64: UShort = 21u

public val EM_S390: UShort = 22u

public val EM_V800: UShort = 36u

public val EM_FR20: UShort = 37u

public val EM_RH32: UShort = 38u

public val EM_RCE: UShort = 39u

public val EM_ARM: UShort = 40u

public val EM_FAKE_ALPHA: UShort = 41u

public val EM_SH: UShort = 42u

public val EM_SPARCV9: UShort = 43u

public val EM_TRICORE: UShort = 44u

public val EM_ARC: UShort = 45u

public val EM_H8_300: UShort = 46u

public val EM_H8_300H: UShort = 47u

public val EM_H8S: UShort = 48u

public val EM_H8_500: UShort = 49u

public val EM_IA_64: UShort = 50u

public val EM_MIPS_X: UShort = 51u

public val EM_COLDFIRE: UShort = 52u

public val EM_68HC12: UShort = 53u

public val EM_MMA: UShort = 54u

public val EM_PCP: UShort = 55u

public val EM_NCPU: UShort = 56u

public val EM_NDR1: UShort = 57u

public val EM_STARCORE: UShort = 58u

public val EM_ME16: UShort = 59u

public val EM_ST100: UShort = 60u

public val EM_TINYJ: UShort = 61u

public val EM_X86_64: UShort = 62u

public val EM_PDSP: UShort = 63u

public val EM_FX66: UShort = 66u

public val EM_ST9PLUS: UShort = 67u

public val EM_ST7: UShort = 68u

public val EM_68HC16: UShort = 69u

public val EM_68HC11: UShort = 70u

public val EM_68HC08: UShort = 71u

public val EM_68HC05: UShort = 72u

public val EM_SVX: UShort = 73u

public val EM_ST19: UShort = 74u

public val EM_VAX: UShort = 75u

public val EM_CRIS: UShort = 76u

public val EM_JAVELIN: UShort = 77u

public val EM_FIREPATH: UShort = 78u

public val EM_ZSP: UShort = 79u

public val EM_MMIX: UShort = 80u

public val EM_HUANY: UShort = 81u

public val EM_PRISM: UShort = 82u

public val EM_AVR: UShort = 83u

public val EM_FR30: UShort = 84u

public val EM_D10V: UShort = 85u

public val EM_D30V: UShort = 86u

public val EM_V850: UShort = 87u

public val EM_M32R: UShort = 88u

public val EM_MN10300: UShort = 89u

public val EM_MN10200: UShort = 90u

public val EM_PJ: UShort = 91u

public val EM_OPENRISC: UShort = 92u

public val EM_OR1K: UShort = 92u

public val EM_ARC_A5: UShort = 93u

public val EM_XTENSA: UShort = 94u

public val EM_AARCH64: UShort = 183u

public val EM_TILEPRO: UShort = 188u

public val EM_TILEGX: UShort = 191u

public val EM_RISCV: UShort = 243u

public val EM_ALPHA: UShort = 0x9026u

// elf.h - Legal values for eVersion (version).
public val EV_NONE: UInt = 0u

public val EV_CURRENT: UInt = 1u

public val EV_NUM: UInt = 2u

// elf.h - Legal values for pType (segment type).
public val PT_NULL: UInt = 0u

public val PT_LOAD: UInt = 1u

public val PT_DYNAMIC: UInt = 2u

public val PT_INTERP: UInt = 3u

public val PT_NOTE: UInt = 4u

public val PT_SHLIB: UInt = 5u

public val PT_PHDR: UInt = 6u

public val PT_TLS: UInt = 7u

public val PT_NUM: UInt = 8u

public val PT_LOOS: UInt = 0x60000000u

public val PT_GNU_EH_FRAME: UInt = 0x6474e550u

public val PT_GNU_STACK: UInt = 0x6474e551u

public val PT_GNU_RELRO: UInt = 0x6474e552u

public val PT_LOSUNW: UInt = 0x6ffffffau

public val PT_SUNWBSS: UInt = 0x6ffffffau

public val PT_SUNWSTACK: UInt = 0x6ffffffbu

public val PT_HISUNW: UInt = 0x6fffffffu

public val PT_HIOS: UInt = 0x6fffffffu

public val PT_LOPROC: UInt = 0x70000000u

public val PT_HIPROC: UInt = 0x7fffffffu

// Legal values for pFlags (segment flags).
public val PF_X: UInt = 1u shl 0

public val PF_W: UInt = 1u shl 1

public val PF_R: UInt = 1u shl 2

public val PF_MASKOS: UInt = 0x0ff00000u

public val PF_MASKPROC: UInt = 0xf0000000u

// elf.h - Legal values for aType (entry type).
public val AT_NULL: CUlong = 0uL

public val AT_IGNORE: CUlong = 1uL

public val AT_EXECFD: CUlong = 2uL

public val AT_PHDR: CUlong = 3uL

public val AT_PHENT: CUlong = 4uL

public val AT_PHNUM: CUlong = 5uL

public val AT_PAGESZ: CUlong = 6uL

public val AT_BASE: CUlong = 7uL

public val AT_FLAGS: CUlong = 8uL

public val AT_ENTRY: CUlong = 9uL

public val AT_NOTELF: CUlong = 10uL

public val AT_UID: CUlong = 11uL

public val AT_EUID: CUlong = 12uL

public val AT_GID: CUlong = 13uL

public val AT_EGID: CUlong = 14uL

public val AT_PLATFORM: CUlong = 15uL

public val AT_HWCAP: CUlong = 16uL

public val AT_CLKTCK: CUlong = 17uL

public val AT_SECURE: CUlong = 23uL

public val AT_BASE_PLATFORM: CUlong = 24uL

public val AT_RANDOM: CUlong = 25uL

public val AT_HWCAP2: CUlong = 26uL

public val AT_HWCAP3: CUlong = 29uL

public val AT_HWCAP4: CUlong = 30uL

public val AT_EXECFN: CUlong = 31uL

// defined in arch/<arch>/include/uapi/asm/auxvec.h but has the same value
// wherever it is defined.
public val AT_SYSINFO_EHDR: CUlong = 33uL

public val AT_MINSIGSTKSZ: CUlong = 51uL

public val GLOB_ERR: CInt = 1 shl 0

public val GLOB_MARK: CInt = 1 shl 1

public val GLOB_NOSORT: CInt = 1 shl 2

public val GLOB_DOOFFS: CInt = 1 shl 3

public val GLOB_NOCHECK: CInt = 1 shl 4

public val GLOB_APPEND: CInt = 1 shl 5

public val GLOB_NOESCAPE: CInt = 1 shl 6

public val GLOB_NOSPACE: CInt = 1

public val GLOB_ABORTED: CInt = 2

public val GLOB_NOMATCH: CInt = 3

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_RANDOM: CInt = 1

public val POSIX_MADV_SEQUENTIAL: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_DONTNEED: CInt = 4

public val S_IEXEC: ModeT = 64u

public val S_IWRITE: ModeT = 128u

public val S_IREAD: ModeT = 256u

public val F_LOCK: CInt = 1

public val F_TEST: CInt = 3

public val F_TLOCK: CInt = 2

public val F_ULOCK: CInt = 0

public val ST_RDONLY: CUlong = 1uL

public val ST_NOSUID: CUlong = 2uL

public val ST_NODEV: CUlong = 4uL

public val ST_NOEXEC: CUlong = 8uL

public val ST_SYNCHRONOUS: CUlong = 16uL

public val ST_MANDLOCK: CUlong = 64uL

public val ST_WRITE: CUlong = 128uL

public val ST_APPEND: CUlong = 256uL

public val ST_IMMUTABLE: CUlong = 512uL

public val ST_NOATIME: CUlong = 1024uL

public val ST_NODIRATIME: CUlong = 2048uL

public val RTLD_NEXT: COpaquePointer? = COpaquePointer((-1L))

public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_NODELETE: CInt = 0x1000

public val RTLD_NOW: CInt = 0x2

public val AT_EACCESS: CInt = 0x200

public val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1

public val PTHREAD_ONCE_INIT: PthreadOnceT = 0

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_MUTEX_STALLED: CInt = 0

public val PTHREAD_MUTEX_ROBUST: CInt = 1

public val PTHREAD_PRIO_NONE: CInt = 0

public val PTHREAD_PRIO_INHERIT: CInt = 1

public val PTHREAD_PRIO_PROTECT: CInt = 2

public val PTHREAD_PROCESS_PRIVATE: CInt = 0

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val PTHREAD_INHERIT_SCHED: CInt = 0

public val PTHREAD_EXPLICIT_SCHED: CInt = 1

public val SIZEOF_PTHREAD_COND_T: Int = 48

// netinet/in.h
// NOTE: These are in addition to the constants defined in src/unix/mod.rs
public val IPPROTO_MAX: CInt = 256

// System V IPC
public val IPC_PRIVATE: KeyT = 0

public val IPC_CREAT: CInt = 512

public val IPC_EXCL: CInt = 1024

public val IPC_NOWAIT: CInt = 2048

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt = if (false) {
    0x102
} else {
    2
}

public val IPC_INFO: CInt = 3

public val SHM_R: CInt = 256

public val SHM_W: CInt = 128

public val SHM_RDONLY: CInt = 4096

public val SHM_RND: CInt = 8192

public val SHM_REMAP: CInt = 16384

public val SHM_LOCK: CInt = 11

public val SHM_UNLOCK: CInt = 12

public val SHM_HUGETLB: CInt = 2048

public val SHM_NORESERVE: CInt = 4096

public val LOG_NFACILITIES: CInt = 24

public val SEM_FAILED: SemT? = null

public val AI_PASSIVE: CInt = 0x0001

public val AI_CANONNAME: CInt = 0x0002

public val AI_NUMERICHOST: CInt = 0x0004

public val AI_V4MAPPED: CInt = 0x0008

public val AI_ALL: CInt = 0x0010

public val AI_ADDRCONFIG: CInt = 0x0020

public val AI_NUMERICSERV: CInt = 0x0400

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_NODATA: CInt = -5

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_MEMORY: CInt = -10

public val EAI_SYSTEM: CInt = -11

public val EAI_OVERFLOW: CInt = -12

public val NI_NUMERICHOST: CInt = 1

public val NI_NUMERICSERV: CInt = 2

public val NI_NOFQDN: CInt = 4

public val NI_NAMEREQD: CInt = 8

public val NI_DGRAM: CInt = 16

public val NI_IDN: CInt = 32

public val AIO_CANCELED: CInt = 0

public val AIO_NOTCANCELED: CInt = 1

public val AIO_ALLDONE: CInt = 2

public val LIO_READ: CInt = 0

public val LIO_WRITE: CInt = 1

public val LIO_NOP: CInt = 2

public val LIO_WAIT: CInt = 0

public val LIO_NOWAIT: CInt = 1

public val RUSAGE_THREAD: CInt = 1

public val MSG_COPY: CInt = 16384

public val SHM_EXEC: CInt = 32768

public val IPV6_MULTICAST_ALL: CInt = 29

public val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30

public val PACKET_MR_UNICAST: CInt = 3

public val PTRACE_EVENT_STOP: CInt = 128

public val UDP_SEGMENT: CInt = 103

public val UDP_GRO: CInt = 104

public val PR_SET_PDEATHSIG: CInt = 1

public val PR_GET_PDEATHSIG: CInt = 2

public val PR_GET_DUMPABLE: CInt = 3

public val PR_SET_DUMPABLE: CInt = 4

public val PR_GET_UNALIGN: CInt = 5

public val PR_SET_UNALIGN: CInt = 6

public val PR_UNALIGN_NOPRINT: CInt = 1

public val PR_UNALIGN_SIGBUS: CInt = 2

public val PR_GET_KEEPCAPS: CInt = 7

public val PR_SET_KEEPCAPS: CInt = 8

public val PR_GET_FPEMU: CInt = 9

public val PR_SET_FPEMU: CInt = 10

public val PR_FPEMU_NOPRINT: CInt = 1

public val PR_FPEMU_SIGFPE: CInt = 2

public val PR_GET_FPEXC: CInt = 11

public val PR_SET_FPEXC: CInt = 12

public val PR_FP_EXC_SW_ENABLE: CInt = 0x80

public val PR_FP_EXC_DIV: CInt = 0x010000

public val PR_FP_EXC_OVF: CInt = 0x020000

public val PR_FP_EXC_UND: CInt = 0x040000

public val PR_FP_EXC_RES: CInt = 0x080000

public val PR_FP_EXC_INV: CInt = 0x100000

public val PR_FP_EXC_DISABLED: CInt = 0

public val PR_FP_EXC_NONRECOV: CInt = 1

public val PR_FP_EXC_ASYNC: CInt = 2

public val PR_FP_EXC_PRECISE: CInt = 3

public val PR_GET_TIMING: CInt = 13

public val PR_SET_TIMING: CInt = 14

public val PR_TIMING_STATISTICAL: CInt = 0

public val PR_TIMING_TIMESTAMP: CInt = 1

public val PR_SET_NAME: CInt = 15

public val PR_GET_NAME: CInt = 16

public val PR_GET_ENDIAN: CInt = 19

public val PR_SET_ENDIAN: CInt = 20

public val PR_ENDIAN_BIG: CInt = 0

public val PR_ENDIAN_LITTLE: CInt = 1

public val PR_ENDIAN_PPC_LITTLE: CInt = 2

public val PR_GET_SECCOMP: CInt = 21

public val PR_SET_SECCOMP: CInt = 22

public val PR_CAPBSET_READ: CInt = 23

public val PR_CAPBSET_DROP: CInt = 24

public val PR_GET_TSC: CInt = 25

public val PR_SET_TSC: CInt = 26

public val PR_TSC_ENABLE: CInt = 1

public val PR_TSC_SIGSEGV: CInt = 2

public val PR_GET_SECUREBITS: CInt = 27

public val PR_SET_SECUREBITS: CInt = 28

public val PR_SET_TIMERSLACK: CInt = 29

public val PR_GET_TIMERSLACK: CInt = 30

public val PR_TASK_PERF_EVENTS_DISABLE: CInt = 31

public val PR_TASK_PERF_EVENTS_ENABLE: CInt = 32

public val PR_MCE_KILL: CInt = 33

public val PR_MCE_KILL_CLEAR: CInt = 0

public val PR_MCE_KILL_SET: CInt = 1

public val PR_MCE_KILL_LATE: CInt = 0

public val PR_MCE_KILL_EARLY: CInt = 1

public val PR_MCE_KILL_DEFAULT: CInt = 2

public val PR_MCE_KILL_GET: CInt = 34

public val PR_SET_MM: CInt = 35

public val PR_SET_MM_START_CODE: CInt = 1

public val PR_SET_MM_END_CODE: CInt = 2

public val PR_SET_MM_START_DATA: CInt = 3

public val PR_SET_MM_END_DATA: CInt = 4

public val PR_SET_MM_START_STACK: CInt = 5

public val PR_SET_MM_START_BRK: CInt = 6

public val PR_SET_MM_BRK: CInt = 7

public val PR_SET_MM_ARG_START: CInt = 8

public val PR_SET_MM_ARG_END: CInt = 9

public val PR_SET_MM_ENV_START: CInt = 10

public val PR_SET_MM_ENV_END: CInt = 11

public val PR_SET_MM_AUXV: CInt = 12

public val PR_SET_MM_EXE_FILE: CInt = 13

public val PR_SET_MM_MAP: CInt = 14

public val PR_SET_MM_MAP_SIZE: CInt = 15

public val PR_SET_PTRACER: CInt = 0x59616d61

public val PR_SET_PTRACER_ANY: CUlong = 0xffffffffffffffffuL

public val PR_SET_CHILD_SUBREAPER: CInt = 36

public val PR_GET_CHILD_SUBREAPER: CInt = 37

public val PR_SET_NO_NEW_PRIVS: CInt = 38

public val PR_GET_NO_NEW_PRIVS: CInt = 39

public val PR_GET_TID_ADDRESS: CInt = 40

public val PR_SET_THP_DISABLE: CInt = 41

public val PR_GET_THP_DISABLE: CInt = 42

public val PR_MPX_ENABLE_MANAGEMENT: CInt = 43

public val PR_MPX_DISABLE_MANAGEMENT: CInt = 44

public val PR_SET_FP_MODE: CInt = 45

public val PR_GET_FP_MODE: CInt = 46

public val PR_FP_MODE_FR: CInt = 1 shl 0

public val PR_FP_MODE_FRE: CInt = 1 shl 1

public val PR_CAP_AMBIENT: CInt = 47

public val PR_CAP_AMBIENT_IS_SET: CInt = 1

public val PR_CAP_AMBIENT_RAISE: CInt = 2

public val PR_CAP_AMBIENT_LOWER: CInt = 3

public val PR_CAP_AMBIENT_CLEAR_ALL: CInt = 4

public val PR_SET_VMA: CInt = 0x53564d41

public val PR_SET_VMA_ANON_NAME: CInt = 0

public val PR_SCHED_CORE: CInt = 62

public val PR_SCHED_CORE_GET: CInt = 0

public val PR_SCHED_CORE_CREATE: CInt = 1

public val PR_SCHED_CORE_SHARE_TO: CInt = 2

public val PR_SCHED_CORE_SHARE_FROM: CInt = 3

public val PR_SCHED_CORE_MAX: CInt = 4

public val PR_SCHED_CORE_SCOPE_THREAD: CInt = 0

public val PR_SCHED_CORE_SCOPE_THREAD_GROUP: CInt = 1

public val PR_SCHED_CORE_SCOPE_PROCESS_GROUP: CInt = 2

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

public val POSIX_VDISABLE: CcT = 0u

public val IPV6_RTHDR_LOOSE: CInt = 0

public val IPV6_RTHDR_STRICT: CInt = 1

public val IUTF8: TcflagT = 0x00004000u

public val CMSPAR: TcflagT = 1073741824u

public val MFD_CLOEXEC: CUint = 0x0001u

public val MFD_ALLOW_SEALING: CUint = 0x0002u

public val MFD_HUGETLB: CUint = 0x0004u

public val MFD_NOEXEC_SEAL: CUint = 0x0008u

public val MFD_EXEC: CUint = 0x0010u

public val MFD_HUGE_64KB: CUint = 0x40000000u

public val MFD_HUGE_512KB: CUint = 0x4c000000u

public val MFD_HUGE_1MB: CUint = 0x50000000u

public val MFD_HUGE_2MB: CUint = 0x54000000u

public val MFD_HUGE_8MB: CUint = 0x5c000000u

public val MFD_HUGE_16MB: CUint = 0x60000000u

public val MFD_HUGE_32MB: CUint = 0x64000000u

public val MFD_HUGE_256MB: CUint = 0x70000000u

public val MFD_HUGE_512MB: CUint = 0x74000000u

public val MFD_HUGE_1GB: CUint = 0x78000000u

public val MFD_HUGE_2GB: CUint = 0x7c000000u

public val MFD_HUGE_16GB: CUint = 0x88000000u

public val MFD_HUGE_MASK: CUint = 63u

public val MFD_HUGE_SHIFT: CUint = 26u

// linux/ifPacket.h
public val PACKET_HOST: CUchar = 0u

public val PACKET_BROADCAST: CUchar = 1u

public val PACKET_MULTICAST: CUchar = 2u

public val PACKET_OTHERHOST: CUchar = 3u

public val PACKET_OUTGOING: CUchar = 4u

public val PACKET_LOOPBACK: CUchar = 5u

public val PACKET_USER: CUchar = 6u

public val PACKET_KERNEL: CUchar = 7u

public val PACKET_ADD_MEMBERSHIP: CInt = 1

public val PACKET_DROP_MEMBERSHIP: CInt = 2

public val PACKET_RECV_OUTPUT: CInt = 3

public val PACKET_RX_RING: CInt = 5

public val PACKET_STATISTICS: CInt = 6

public val PACKET_COPY_THRESH: CInt = 7

public val PACKET_AUXDATA: CInt = 8

public val PACKET_ORIGDEV: CInt = 9

public val PACKET_VERSION: CInt = 10

public val PACKET_HDRLEN: CInt = 11

public val PACKET_RESERVE: CInt = 12

public val PACKET_TX_RING: CInt = 13

public val PACKET_LOSS: CInt = 14

public val PACKET_VNET_HDR: CInt = 15

public val PACKET_TX_TIMESTAMP: CInt = 16

public val PACKET_TIMESTAMP: CInt = 17

public val PACKET_MR_MULTICAST: CInt = 0

public val PACKET_MR_PROMISC: CInt = 1

public val PACKET_MR_ALLMULTI: CInt = 2

public val SIOCADDRT: CUlong = 0x0000890BuL

public val SIOCDELRT: CUlong = 0x0000890CuL

public val SIOCGIFNAME: CUlong = 0x00008910uL

public val SIOCSIFLINK: CUlong = 0x00008911uL

public val SIOCGIFCONF: CUlong = 0x00008912uL

public val SIOCGIFFLAGS: CUlong = 0x00008913uL

public val SIOCSIFFLAGS: CUlong = 0x00008914uL

public val SIOCGIFADDR: CUlong = 0x00008915uL

public val SIOCSIFADDR: CUlong = 0x00008916uL

public val SIOCGIFDSTADDR: CUlong = 0x00008917uL

public val SIOCSIFDSTADDR: CUlong = 0x00008918uL

public val SIOCGIFBRDADDR: CUlong = 0x00008919uL

public val SIOCSIFBRDADDR: CUlong = 0x0000891AuL

public val SIOCGIFNETMASK: CUlong = 0x0000891BuL

public val SIOCSIFNETMASK: CUlong = 0x0000891CuL

public val SIOCGIFMETRIC: CUlong = 0x0000891DuL

public val SIOCSIFMETRIC: CUlong = 0x0000891EuL

public val SIOCGIFMEM: CUlong = 0x0000891FuL

public val SIOCSIFMEM: CUlong = 0x00008920uL

public val SIOCGIFMTU: CUlong = 0x00008921uL

public val SIOCSIFMTU: CUlong = 0x00008922uL

public val SIOCSIFNAME: CUlong = 0x00008923uL

public val SIOCSIFHWADDR: CUlong = 0x00008924uL

public val SIOCGIFENCAP: CUlong = 0x00008925uL

public val SIOCSIFENCAP: CUlong = 0x00008926uL

public val SIOCGIFHWADDR: CUlong = 0x00008927uL

public val SIOCGIFSLAVE: CUlong = 0x00008929uL

public val SIOCSIFSLAVE: CUlong = 0x00008930uL

public val SIOCADDMULTI: CUlong = 0x00008931uL

public val SIOCDELMULTI: CUlong = 0x00008932uL

public val SIOCGIFINDEX: CUlong = 0x00008933uL

public val SIOGIFINDEX: CUlong = SIOCGIFINDEX

public val SIOCSIFPFLAGS: CUlong = 0x00008934uL

public val SIOCGIFPFLAGS: CUlong = 0x00008935uL

public val SIOCDIFADDR: CUlong = 0x00008936uL

public val SIOCSIFHWBROADCAST: CUlong = 0x00008937uL

public val SIOCGIFCOUNT: CUlong = 0x00008938uL

public val SIOCGIFBR: CUlong = 0x00008940uL

public val SIOCSIFBR: CUlong = 0x00008941uL

public val SIOCGIFTXQLEN: CUlong = 0x00008942uL

public val SIOCSIFTXQLEN: CUlong = 0x00008943uL

public val SIOCETHTOOL: CUlong = 0x00008946uL

public val SIOCGMIIPHY: CUlong = 0x00008947uL

public val SIOCGMIIREG: CUlong = 0x00008948uL

public val SIOCSMIIREG: CUlong = 0x00008949uL

public val SIOCWANDEV: CUlong = 0x0000894AuL

public val SIOCOUTQNSD: CUlong = 0x0000894BuL

public val SIOCGSKNS: CUlong = 0x0000894CuL

public val SIOCDARP: CUlong = 0x00008953uL

public val SIOCGARP: CUlong = 0x00008954uL

public val SIOCSARP: CUlong = 0x00008955uL

public val SIOCDRARP: CUlong = 0x00008960uL

public val SIOCGRARP: CUlong = 0x00008961uL

public val SIOCSRARP: CUlong = 0x00008962uL

public val SIOCGIFMAP: CUlong = 0x00008970uL

public val SIOCSIFMAP: CUlong = 0x00008971uL

public val IPTOS_TOS_MASK: UByte = 0x1Eu

public val IPTOS_PREC_MASK: UByte = 0xE0u

public val IPTOS_ECN_NOT_ECT: UByte = 0x00u

public val RTF_UP: CUshort = 0x0001u

public val RTF_GATEWAY: CUshort = 0x0002u

public val RTF_HOST: CUshort = 0x0004u

public val RTF_REINSTATE: CUshort = 0x0008u

public val RTF_DYNAMIC: CUshort = 0x0010u

public val RTF_MODIFIED: CUshort = 0x0020u

public val RTF_MTU: CUshort = 0x0040u

public val RTF_MSS: CUshort = RTF_MTU

public val RTF_WINDOW: CUshort = 0x0080u

public val RTF_IRTT: CUshort = 0x0100u

public val RTF_REJECT: CUshort = 0x0200u

public val RTF_STATIC: CUshort = 0x0400u

public val RTF_XRESOLVE: CUshort = 0x0800u

public val RTF_NOFORWARD: CUshort = 0x1000u

public val RTF_THROW: CUshort = 0x2000u

public val RTF_NOPMTUDISC: CUshort = 0x4000u

public val RTF_DEFAULT: UInt = 0x00010000u

public val RTF_ALLONLINK: UInt = 0x00020000u

public val RTF_ADDRCONF: UInt = 0x00040000u

public val RTF_LINKRT: UInt = 0x00100000u

public val RTF_NONEXTHOP: UInt = 0x00200000u

public val RTF_CACHE: UInt = 0x01000000u

public val RTF_FLOW: UInt = 0x02000000u

public val RTF_POLICY: UInt = 0x04000000u

public val RTCF_VALVE: UInt = 0x00200000u

public val RTCF_MASQ: UInt = 0x00400000u

public val RTCF_NAT: UInt = 0x00800000u

public val RTCF_DOREDIRECT: UInt = 0x01000000u

public val RTCF_LOG: UInt = 0x02000000u

public val RTCF_DIRECTSRC: UInt = 0x04000000u

public val RTF_LOCAL: UInt = 0x80000000u

public val RTF_INTERFACE: UInt = 0x40000000u

public val RTF_MULTICAST: UInt = 0x20000000u

public val RTF_BROADCAST: UInt = 0x10000000u

public val RTF_NAT: UInt = 0x08000000u

public val RTF_ADDRCLASSMASK: UInt = 0xF8000000u

public val RT_CLASS_UNSPEC: UByte = 0u

public val RT_CLASS_DEFAULT: UByte = 253u

public val RT_CLASS_MAIN: UByte = 254u

public val RT_CLASS_LOCAL: UByte = 255u

public val RT_CLASS_MAX: UByte = 255u

public val MAX_ADDR_LEN: Int = 7

public val ARPD_UPDATE: CUshort = 0x01u

public val ARPD_LOOKUP: CUshort = 0x02u

public val ARPD_FLUSH: CUshort = 0x03u

public val ATF_MAGIC: CInt = 0x80

// include/uapi/linux/udp.h
public val UDP_CORK: CInt = 1

public val UDP_ENCAP: CInt = 100

public val UDP_NO_CHECK6_TX: CInt = 101

public val UDP_NO_CHECK6_RX: CInt = 102

// include/uapi/asm-generic/mman-common.h
public val MAP_FIXED_NOREPLACE: CInt = 0x100000

public val MLOCK_ONFAULT: CUint = 0x01u

public val REG_EXTENDED: CInt = 1

public val REG_ICASE: CInt = 2

public val REG_NEWLINE: CInt = 4

public val REG_NOSUB: CInt = 8

public val REG_NOTBOL: CInt = 1

public val REG_NOTEOL: CInt = 2

public val REG_ENOSYS: CInt = -1

public val REG_NOMATCH: CInt = 1

public val REG_BADPAT: CInt = 2

public val REG_ECOLLATE: CInt = 3

public val REG_ECTYPE: CInt = 4

public val REG_EESCAPE: CInt = 5

public val REG_ESUBREG: CInt = 6

public val REG_EBRACK: CInt = 7

public val REG_EPAREN: CInt = 8

public val REG_EBRACE: CInt = 9

public val REG_BADBR: CInt = 10

public val REG_ERANGE: CInt = 11

public val REG_ESPACE: CInt = 12

public val REG_BADRPT: CInt = 13

// errno.h
public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val ENOTBLK: CInt = 15

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val EWOULDBLOCK: CInt = EAGAIN

public val CSIGNAL: CInt = 0x000000ff

public val SCHED_NORMAL: CInt = 0

public val SCHED_OTHER: CInt = 0

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val SCHED_BATCH: CInt = 3

public val SCHED_IDLE: CInt = 5

public val SCHED_DEADLINE: CInt = 6

public val SCHED_RESET_ON_FORK: CInt = 0x40000000

// elf.h
public val NT_PRSTATUS: CInt = 1

public val NT_PRFPREG: CInt = 2

public val NT_FPREGSET: CInt = 2

public val NT_PRPSINFO: CInt = 3

public val NT_PRXREG: CInt = 4

public val NT_TASKSTRUCT: CInt = 4

public val NT_PLATFORM: CInt = 5

public val NT_AUXV: CInt = 6

public val NT_GWINDOWS: CInt = 7

public val NT_ASRS: CInt = 8

public val NT_PSTATUS: CInt = 10

public val NT_PSINFO: CInt = 13

public val NT_PRCRED: CInt = 14

public val NT_UTSNAME: CInt = 15

public val NT_LWPSTATUS: CInt = 16

public val NT_LWPSINFO: CInt = 17

public val NT_PRFPXREG: CInt = 20

public val MS_NOUSER: CUlong = 0xffffffff80000000uL

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if (((cmsg!!.cmsgLen).toInt()) < 8) {
        return null
    }
    // Note(msrv): `.wrappingByteAdd()` stabilized in 1.75
    val nextCmsg = ((COpaquePointer((COpaquePointer((cmsg).hashCode().toLong())).rawValue + cmsgAlign(cmsg.cmsgLen.toInt()).toLong()) as Any?) as Cmsghdr?)
    // In case the addition wrapped. `nextAddr> maxAddr`
    // would otherwise not work as intended.
    if ((((nextCmsg).hashCode().toLong()).toInt()) < (((cmsg).hashCode().toLong()).toInt())) {
        return null
    }
    var maxAddr = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + mhdr.msgControllen.toInt()
    if (false) {
        // musl and some of its descendants do `>= maxAddr`
        // comparisons in the if statement below.
        // https://www.openwall.com/lists/musl/2025/12/27/1
        maxAddr -= 1
    }
    return if (((nextCmsg).hashCode().toLong()).toInt() + 8 > maxAddr) {
        null
    } else {
        ((nextCmsg as Any?) as Cmsghdr?)
    }
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT? = null
    val sizeInBits = 8 * 8
    return ((count.toULong() + sizeInBits.toULong() - 1uL) / 8uL)
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0uL
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * 8
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0uL != (cpuset.bits[idx] and (1uL shl offset))
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = 8
    for (i in cpuset.bits.slice(0 until (size / sizeOfMask))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt {
    return cpuCountS(8, cpuset)
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean {
    return set1.bits.contentEquals(set2.bits)
}

public fun iptosTos(tos: UByte): UByte {
    return tos and IPTOS_TOS_MASK
}

public fun iptosPrec(tos: UByte): UByte {
    return tos and IPTOS_PREC_MASK
}

public fun rtTos(tos: UByte): UByte {
    return tos and IPTOS_TOS_MASK
}

public fun rtAddrclass(flags: UInt): UInt {
    return flags shr 23
}

public fun rtLocaladdr(flags: UInt): Boolean {
    return (flags and RTF_ADDRCLASSMASK) == (RTF_LOCAL or RTF_INTERFACE)
}

public fun elf32RSym(value: Elf32Word): Elf32Word {
    return value shr 8
}

public fun elf32RType(value: Elf32Word): Elf32Word {
    return value and 0xffu
}

public fun elf32RInfo(sym: Elf32Word, t: Elf32Word): Elf32Word {
    return sym shl (8u + t).toInt() and 0xffu
}

public fun elf64RSym(value: Elf64Xword): Elf64Xword {
    return value shr 32
}

public fun elf64RType(value: Elf64Xword): Elf64Xword {
    return value and 0xffffffffuL
}

public fun elf64RInfo(sym: Elf64Xword, t: Elf64Xword): Elf64Xword {
    return sym shl (32uL + t).toInt()
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0uL
    dev = dev or ((major1 and 0x00000fffuL) shl 8)
    dev = dev or ((major1 and 0xfffff000uL) shl 32)
    dev = dev or ((minor1 and 0x000000ffuL) shl 0)
    dev = dev or ((minor1 and 0xffffff00uL) shl 12)
    return dev
}

public fun major(dev: DevT): CUint {
    var major = 0uL
    major = major or ((dev and 0x00000000000fff00uL) shr 8)
    major = major or ((dev and 0xfffff00000000000uL) shr 32)
    return major.toUInt()
}

public fun minor(dev: DevT): CUint {
    var minor = 0uL
    minor = minor or ((dev and 0x00000000000000ffuL) shr 0)
    minor = minor or ((dev and 0x00000ffffff00000uL) shr 12)
    return minor.toUInt()
}

public expect fun iopl(level: CInt): CInt

public expect fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt

public expect fun aioRead(aiocbp: COpaquePointer?): CInt

public expect fun aioWrite(aiocbp: COpaquePointer?): CInt

public expect fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioError(aiocbp: COpaquePointer?): CInt

public expect fun aioReturn(aiocbp: COpaquePointer?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt

public expect fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt

public expect fun processVmReadv(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long

public expect fun processVmWritev(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long

public expect fun futimes(fd: CInt, times: COpaquePointer?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: COpaquePointer?): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: COpaquePointer?): CLong

public expect fun jrand48(xseed: COpaquePointer?): CLong

public expect fun srand48(seed: CLong)

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): COpaquePointer?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): COpaquePointer?

public expect fun setspent()

public expect fun endspent()

public expect fun getspent(): COpaquePointer?

public expect fun getspnam(name: String?): COpaquePointer?

// System V IPC
public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun errnoLocation(): COpaquePointer?

// Not available now on Android
public expect fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt

public expect fun globfree(pglob: COpaquePointer?)

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer?

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt

public expect fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt

public expect fun prctl(option: CInt, vararg variadicArgs: Long): CInt

public expect fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun sethostname(name: String?, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun sysinfo(info: COpaquePointer?): CInt

public expect fun sigsuspend(mask: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun initgroups(user: String?, group: GidT): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

public expect fun setmntent(filename: String?, ty: String?): FILE?

public expect fun getmntent(stream: FILE?): COpaquePointer?

public expect fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt

public expect fun endmntent(streamp: FILE?): CInt

public expect fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer?

public expect fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt

public expect fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT

public expect fun regfree(preg: COpaquePointer?)

public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun gettid(): PidT

public expect fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

public expect fun schedGetcpu(): CInt

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt

public expect fun copyFileRange(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT

public expect fun freopen64(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt

public expect fun ftello64(stream: FILE?): Off64T
