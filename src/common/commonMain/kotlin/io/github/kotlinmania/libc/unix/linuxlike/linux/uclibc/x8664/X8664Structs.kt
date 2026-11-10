@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.InAddr
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.SaFamilyT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Ino64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.ShmattT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public data class IpcPerm(
    public var key: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: CUshort = 0u,
    // read / write
    public var pad1: CUshort = 0u,
    public var seq: CUshort = 0u,
    public var pad2: CUshort = 0u,
    public var unused1: CUlong = 0uL,
    public var unused2: CUlong = 0uL,
)

public data class PthreadAttrT(
    public var detachstate: CInt = 0,
    public var schedpolicy: CInt = 0,
    public var schedparam: SchedParam = SchedParam(),
    public var inheritsched: CInt = 0,
    public var scope: CInt = 0,
    public var guardsize: SizeT = 0uL,
    public var stackaddrSet: CInt = 0,
    public var stackaddr: COpaquePointer? = null,
    // better don't use it
    public var stacksize: SizeT = 0uL,
)

public data class SchedParam(
    public var schedPriority: CInt = 0,
)

public data class SiginfoT(
    public var siSigno: CInt = 0,
    // signal number
    public var siErrno: CInt = 0,
    // if not zero: error value of signal, see errno.h
    public var siCode: CInt = 0,
    // signal code
    public var pad: IntArray = IntArray(28),
    // unported union
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
}

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    // segment size in bytes
    public var shmAtime: TimeT = 0,
    // time of last shmat()
    public var shmDtime: TimeT = 0,
    public var shmCtime: TimeT = 0,
    public var shmCpid: PidT = 0,
    public var shmLpid: PidT = 0,
    public var shmNattch: ShmattT = 0uL,
    public var unused1: CUlong = 0uL,
    public var unused2: CUlong = 0uL,
)

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgStime: TimeT = 0,
    public var msgRtime: TimeT = 0,
    public var msgCtime: TimeT = 0,
    public var msgCbytes: CUlong = 0uL,
    public var msgQnum: MsgqnumT = 0uL,
    public var msgQbytes: MsglenT = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var ignored1: CUlong = 0uL,
    public var ignored2: CUlong = 0uL,
)

public data class Sockaddr(
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}

public data class SockaddrIn(
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

// ------------------------------------------------------------
// definitions below are *unverified* and might **break** the software
//
// pub struct inAddr {
// pub sAddr: inAddrT,
// }
//
// pub struct in6Addr {
// pub s6Addr: [u8; 16],
// }
public class Stat(
    public var stDev: CUlong = 0uL,
    public var stIno: InoT = 0uL,
    // According to uclibc/libc/sysdeps/linux/x8664/bits/stat.h, order of
    // nlink and mode are swapped on 64 bit systems.
    public var stNlink: NlinkT = 0u,
    public var stMode: ModeT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: CUlong = 0uL,
    // devT
    public var stSize: OffT = 0L,
    // file size
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0,
    public var stAtimeNsec: CUlong = 0uL,
    public var stMtime: TimeT = 0,
    public var stMtimeNsec: CUlong = 0uL,
    public var stCtime: TimeT = 0,
    public var stCtimeNsec: CUlong = 0uL,
    public var stPad4: LongArray = LongArray(3),
)

public data class Sigaction(
    public var saHandler: SighandlerT = 0uL,
    public var saFlags: CUlong = 0uL,
    public var saRestorer: SigactionSaRestorerCallback? = null,
    public var saMask: SigsetT = SigsetT(),
)

public data class StackT(
    // Note(ulibc)
    public var ssSp: COpaquePointer? = null,
    public var ssFlags: CInt = 0,
    public var ssSize: SizeT = 0uL,
)

public data class Statfs(
    // Note(ulibc)
    public var fType: FswordT = 0L,
    public var fBsize: FswordT = 0L,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: FswordT = 0L,
    public var fFrsize: FswordT = 0L,
    public var fSpare: LongArray = LongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFrsize != other.fFrsize) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Statfs64(
    public var fType: CInt = 0,
    public var fBsize: CInt = 0,
    public var fBlocks: Fsblkcnt64T = 0uL,
    public var fBfree: Fsblkcnt64T = 0uL,
    public var fBavail: Fsblkcnt64T = 0uL,
    public var fFiles: Fsfilcnt64T = 0uL,
    public var fFfree: Fsfilcnt64T = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: CInt = 0,
    public var fFrsize: CInt = 0,
    public var fFlags: CInt = 0,
    public var fSpare: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs64) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlags != other.fFlags) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Statvfs64(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFavail: ULong = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fUnused: CInt = 0,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fSpare: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs64) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fUnused != other.fUnused) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
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
        result = 31 * result + this.fUnused.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Msghdr(
    // Note(ulibc)
    public var msgName: COpaquePointer? = null,
    public var msgNamelen: SocklenT = 0u,
    public var msgIov: Iovec? = null,
    public var msgIovlen: SizeT = 0uL,
    public var msgControl: COpaquePointer? = null,
    public var msgControllen: SizeT = 0uL,
    public var msgFlags: CInt = 0,
)

public data class Termios(
    // Note(ulibc)
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
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

public data class SigsetT(
    // Note(ulibc)
    public var value: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

public data class Sysinfo(
    // Note(ulibc)
    public var uptime: CLong = 0L,
    public var loads: ULongArray = ULongArray(3),
    public var totalram: CUlong = 0uL,
    public var freeram: CUlong = 0uL,
    public var sharedram: CUlong = 0uL,
    public var bufferram: CUlong = 0uL,
    public var totalswap: CUlong = 0uL,
    public var freeswap: CUlong = 0uL,
    public var procs: CUshort = 0u,
    public var pad: CUshort = 0u,
    public var totalhigh: CUlong = 0uL,
    public var freehigh: CUlong = 0uL,
    public var memUnit: CUint = 0u,
    public var f: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sysinfo) return false
        if (this.uptime != other.uptime) return false
        if (!this.loads.contentEquals(other.loads)) return false
        if (this.totalram != other.totalram) return false
        if (this.freeram != other.freeram) return false
        if (this.sharedram != other.sharedram) return false
        if (this.bufferram != other.bufferram) return false
        if (this.totalswap != other.totalswap) return false
        if (this.freeswap != other.freeswap) return false
        if (this.procs != other.procs) return false
        if (this.pad != other.pad) return false
        if (this.totalhigh != other.totalhigh) return false
        if (this.freehigh != other.freehigh) return false
        if (this.memUnit != other.memUnit) return false
        if (!this.f.contentEquals(other.f)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uptime.hashCode()
        result = 31 * result + this.loads.contentHashCode()
        result = 31 * result + this.totalram.hashCode()
        result = 31 * result + this.freeram.hashCode()
        result = 31 * result + this.sharedram.hashCode()
        result = 31 * result + this.bufferram.hashCode()
        result = 31 * result + this.totalswap.hashCode()
        result = 31 * result + this.freeswap.hashCode()
        result = 31 * result + this.procs.hashCode()
        result = 31 * result + this.pad.hashCode()
        result = 31 * result + this.totalhigh.hashCode()
        result = 31 * result + this.freehigh.hashCode()
        result = 31 * result + this.memUnit.hashCode()
        result = 31 * result + this.f.contentHashCode()
        return result
    }
}

public data class GlobT(
    // Note(ulibc)
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

public data class CpuSetT(
    public var bits: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuSetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()
}

public data class FsidT(
    // Note(ulibc)
    public var value: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsidT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

// Note(1.0): this is actually a union
public data class SemT(
    public var size: UByteArray = UByteArray(32),
    public var align: LongArray = LongArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (!this.size.contentEquals(other.size)) return false
        if (!this.align.contentEquals(other.align)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.contentHashCode()
        result = 31 * result + this.align.contentHashCode()
        return result
    }
}

public data class Cmsghdr(
    public var cmsgLen: SizeT = 0uL,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public data class Dirent(
    public var dIno: Ino64T = 0uL,
    public var dOff: Off64T = 0L,
    public var dReclen: UShort = 0u,
    public var dType: UByte = 0u,
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
