package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.mips

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Ino64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.NlinkT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.ShmattT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.TimeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public class Stat(
    public var stDev: CUlong = 0uL,
    public var stPad1: LongArray = LongArray(3),
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: CUlong = 0uL,
    public var stPad2: LongArray = LongArray(2),
    public var stSize: OffT = 0L,
    public var stPad3: CLong = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0L,
    public var atimePad: CInt = 0,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var mtimePad: CInt = 0,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var ctimePad: CInt = 0,
    public var stCtimeNsec: CLong = 0L,
    public var stPad4: CLong = 0L,
    public var stPad5: LongArray = LongArray(14),
)

public class Stat64(
    public var stDev: CUlong = 0uL,
    public var stPad1: LongArray = LongArray(3),
    public var stIno: Ino64T = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: CUlong = 0uL,
    public var stPad2: LongArray = LongArray(3),
    public var stSize: Off64T = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0L,
    public var atimePad: CInt = 0,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var mtimePad: CInt = 0,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var ctimePad: CInt = 0,
    public var stCtimeNsec: CLong = 0L,
    public var stPad3: CLong = 0L,
    public var stPad5: LongArray = LongArray(14),
)

public data class Statfs(
    public var fType: CLong = 0L,
    public var fBsize: CLong = 0L,
    public var fFrsize: CLong = 0L,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fFiles: FsblkcntT = 0uL,
    public var fFfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: CLong = 0L,
    public var fFlags: CLong = 0L,
    public var fSpare: LongArray = LongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFlags != other.fFlags) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Statfs64(
    public var fType: CLong = 0L,
    public var fBsize: CLong = 0L,
    public var fFrsize: CLong = 0L,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: CLong = 0L,
    public var fFlags: CLong = 0L,
    public var fSpare: LongArray = LongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs64) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFlags != other.fFlags) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
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

public data class Sigaction(
    public var saFlags: CInt = 0,
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = SigsetT(),
    public var saRestorer: SigactionSaRestorerCallback? = null,
    public var resv: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigaction) return false
        if (this.saFlags != other.saFlags) return false
        if (this.saSigaction != other.saSigaction) return false
        if (this.saMask != other.saMask) return false
        if (this.saRestorer != other.saRestorer) return false
        if (!this.resv.contentEquals(other.resv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFlags.hashCode()
        result = 31 * result + this.saSigaction.hashCode()
        result = 31 * result + this.saMask.hashCode()
        result = 31 * result + this.saRestorer.hashCode()
        result = 31 * result + this.resv.contentHashCode()
        return result
    }
}

public class StackT internal constructor(
    ssSpCtorArg: MutPtr<CVoid>,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
) {
    public var ssSp: MutPtr<CVoid> = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssSize = 0uL,
        ssFlags = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ssSp

    public operator fun component2(): SizeT = this.ssSize

    public operator fun component3(): CInt = this.ssFlags

    public fun copy(ssSp: MutPtr<CVoid> = this.ssSp, ssSize: SizeT = this.ssSize, ssFlags: CInt = this.ssFlags): StackT = StackT(ssSpCtorArg = ssSp, ssSize = ssSize, ssFlags = ssFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackT) return false
        if (this.ssSp != other.ssSp) return false
        if (this.ssSize != other.ssSize) return false
        if (this.ssFlags != other.ssFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssSp.hashCode()
        result = 31 * result + this.ssSize.hashCode()
        result = 31 * result + this.ssFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.ssSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ssFlags)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr<CVoid> = MutPtr(0L),
            ssSize: SizeT = 0uL,
            ssFlags: CInt = 0,
        ): StackT =
            StackT(
                ssSpCtorArg = ssSp,
                ssSize = ssSize,
                ssFlags = ssFlags,
            )
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siErrno: CInt = 0,
    public var pad: IntArray = IntArray(29),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siErrno)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                    ).writeNative(addr + 12L, value.pad)
                }
            }
    }
}

public data class IpcPerm(
    public var key: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: CUint = 0u,
    public var seq: CUshort = 0u,
    public var pad1: CUshort = 0u,
    public var unused1: CUlong = 0uL,
    public var unused2: CUlong = 0uL,
)

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmAtime: TimeT = 0L,
    public var shmDtime: TimeT = 0L,
    public var shmCtime: TimeT = 0L,
    public var shmCpid: PidT = 0,
    public var shmLpid: PidT = 0,
    public var shmNattch: ShmattT = 0uL,
    public var unused4: CUlong = 0uL,
    public var unused5: CUlong = 0uL,
)

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgStime: TimeT = 0L,
    public var glibcReserved1: CUlong = 0uL,
    public var msgRtime: TimeT = 0L,
    public var glibcReserved2: CUlong = 0uL,
    public var msgCtime: TimeT = 0L,
    public var glibcReserved3: CUlong = 0uL,
    public var msgCbytes: CUlong = 0uL,
    public var msgQnum: MsgqnumT = 0uL,
    public var msgQbytes: MsglenT = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var glibcReserved4: CUlong = 0uL,
    public var glibcReserved5: CUlong = 0uL,
)

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lSysid: CLong = 0L,
    public var lPid: PidT = 0,
    public var glibcReserved0: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flock) return false
        if (this.lType != other.lType) return false
        if (this.lWhence != other.lWhence) return false
        if (this.lStart != other.lStart) return false
        if (this.lLen != other.lLen) return false
        if (this.lSysid != other.lSysid) return false
        if (this.lPid != other.lPid) return false
        if (!this.glibcReserved0.contentEquals(other.glibcReserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lType.hashCode()
        result = 31 * result + this.lWhence.hashCode()
        result = 31 * result + this.lStart.hashCode()
        result = 31 * result + this.lLen.hashCode()
        result = 31 * result + this.lSysid.hashCode()
        result = 31 * result + this.lPid.hashCode()
        result = 31 * result + this.glibcReserved0.contentHashCode()
        return result
    }
}

public data class MaxAlignT(
    public var priv: FloatArray = FloatArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (4).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (4).toInt())
                    ).writeNative(addr, value.priv)
                }
            }
    }
}
