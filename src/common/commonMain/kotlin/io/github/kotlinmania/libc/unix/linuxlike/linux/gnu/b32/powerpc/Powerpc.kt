// port-lint: source unix/linux_like/linux/gnu/b32/powerpc.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.powerpc

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
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Blkcnt64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Ino64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FsfilcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FswordT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.NlinkT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.ShmattT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.TimeT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public typealias WcharT = Int

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = SigsetT(),
    public var saFlags: CInt = 0,
    public var saRestorer: SigactionSaRestorerCallback? = null,
)

public data class Statfs(
    public var fType: FswordT = 0,
    public var fBsize: FswordT = 0,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: FswordT = 0,
    public var fFrsize: FswordT = 0,
    public var fFlags: FswordT = 0,
    public var fSpare: IntArray = IntArray(4),
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

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Flock =
                    Flock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Flock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lPid)
                }
            }
    }
}

public data class Flock64(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: Off64T = 0L,
    public var lLen: Off64T = 0L,
    public var lPid: PidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Flock64 =
                    Flock64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Flock64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lPid)
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
    public var mode: ModeT = 0u,
    public var seq: UInt = 0u,
    public var pad1: UInt = 0u,
    public var glibcReserved1: ULong = 0uL,
    public var glibcReserved2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IpcPerm =
                    IpcPerm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IpcPerm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.gid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.cuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.cgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.seq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.glibcReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.glibcReserved2)
                }
            }
    }
}

public class Stat(
    public var stDev: DevT = 0uL,
    public var pad1: CUshort = 0u,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad2: CUshort = 0u,
    public var stSize: OffT = 0L,
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
    public var glibcReserved4: CUlong = 0uL,
    public var glibcReserved5: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 168L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.pad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.pad2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.stBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.atimePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.stAtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.mtimePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.stMtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 136L, value.ctimePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 144L, value.stCtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.glibcReserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.glibcReserved5)
                }
            }
    }
}

public class Stat64(
    public var stDev: DevT = 0uL,
    public var stIno: Ino64T = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad2: CUshort = 0u,
    public var stSize: Off64T = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: Blkcnt64T = 0L,
    public var stAtime: TimeT = 0L,
    public var atimePad: CInt = 0,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var mtimePad: CInt = 0,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var ctimePad: CInt = 0,
    public var stCtimeNsec: CLong = 0L,
    public var glibcReserved4: CUlong = 0uL,
    public var glibcReserved5: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 160L
                override fun readNative(addr: Long): Stat64 =
                    Stat64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                    )
                override fun writeNative(addr: Long, value: Stat64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.pad2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.stBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.atimePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.stAtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.mtimePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.stMtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 128L, value.ctimePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.stCtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.glibcReserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.glibcReserved5)
                }
            }
    }
}

public data class Statfs64(
    public var fType: FswordT = 0,
    public var fBsize: FswordT = 0,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: FswordT = 0,
    public var fFrsize: FswordT = 0,
    public var fFlags: FswordT = 0,
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): Statvfs64 =
                    Statvfs64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                        ).readNative(addr + 96L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Statvfs64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fBsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fFrsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.fBfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.fBavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.fFiles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.fFfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.fFavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.fFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.fUnused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.fFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.fNamemax)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                    ).writeNative(addr + 96L, value.fSpare.toList())
                }
            }
    }
}

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var glibcReserved1: CUint = 0u,
    public var shmAtime: TimeT = 0L,
    public var glibcReserved2: CUint = 0u,
    public var shmDtime: TimeT = 0L,
    public var glibcReserved3: CUint = 0u,
    public var shmCtime: TimeT = 0L,
    public var glibcReserved4: CUint = 0u,
    public var shmCpid: PidT = 0,
    public var shmLpid: PidT = 0,
    public var shmNattch: ShmattT = 0uL,
    public var glibcReserved5: CUlong = 0uL,
    public var glibcReserved6: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShmidDs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShmidDs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): ShmidDs =
                    ShmidDs(
                        (IpcPerm.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: ShmidDs) {
                    (IpcPerm.typeLayout()).writeNative(addr, value.shmPerm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.shmSegsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.glibcReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.shmAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.glibcReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.shmDtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.glibcReserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.shmCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.glibcReserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 100L, value.shmCpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.shmLpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.shmNattch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.glibcReserved5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.glibcReserved6)
                }
            }
    }
}

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var glibcReserved1: CUint = 0u,
    public var msgStime: TimeT = 0L,
    public var glibcReserved2: CUint = 0u,
    public var msgRtime: TimeT = 0L,
    public var glibcReserved3: CUint = 0u,
    public var msgCtime: TimeT = 0L,
    public var msgCbytes: CUlong = 0uL,
    public var msgQnum: MsgqnumT = 0uL,
    public var msgQbytes: MsglenT = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var glibcReserved4: CUlong = 0uL,
    public var glibcReserved5: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsqidDs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsqidDs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): MsqidDs =
                    MsqidDs(
                        (IpcPerm.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: MsqidDs) {
                    (IpcPerm.typeLayout()).writeNative(addr, value.msgPerm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.glibcReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.msgStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.glibcReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.msgRtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.glibcReserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.msgCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.msgCbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.msgQnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.msgQbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.msgLspid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 116L, value.msgLrpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.glibcReserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.glibcReserved5)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                        ).readNative(addr + 12L).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                        ).readNative(addr + 128L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                    ).writeNative(addr + 12L, value.pad.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                    ).writeNative(addr + 128L, value.align.toList())
                }
            }
    }
}

public class StackT internal constructor(
    ssSpCtorArg: MutPtr,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
) {
    public var ssSp: MutPtr = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssFlags = 0,
        ssSize = 0uL,
    )

    public operator fun component1(): MutPtr = this.ssSp

    public operator fun component2(): CInt = this.ssFlags

    public operator fun component3(): SizeT = this.ssSize

    public fun copy(ssSp: MutPtr = this.ssSp, ssFlags: CInt = this.ssFlags, ssSize: SizeT = this.ssSize): StackT = StackT(ssSpCtorArg = ssSp, ssFlags = ssFlags, ssSize = ssSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackT) return false
        if (this.ssSp != other.ssSp) return false
        if (this.ssFlags != other.ssFlags) return false
        if (this.ssSize != other.ssSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssSp.hashCode()
        result = 31 * result + this.ssFlags.hashCode()
        result = 31 * result + this.ssSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ssFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ssSize)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr = MutPtr(0L),
            ssFlags: CInt = 0,
            ssSize: SizeT = 0uL,
        ): StackT =
            StackT(
                ssSpCtorArg = ssSp,
                ssFlags = ssFlags,
                ssSize = ssSize,
            )
    }
}

public val VEOF: Int = 4

public val RTLD_DEEPBIND: CInt = 0x8

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_NOLOAD: CInt = 0x4

public val O_DIRECT: CInt = 0x20000

public val O_DIRECTORY: CInt = 0x4000

public val O_NOFOLLOW: CInt = 0x8000

public val O_LARGEFILE: CInt = 65536

public val O_APPEND: CInt = 1024

public val O_CREAT: CInt = 64

public val O_EXCL: CInt = 128

public val O_NOCTTY: CInt = 256

public val O_NONBLOCK: CInt = 2048

public val O_SYNC: CInt = 1052672

public val O_RSYNC: CInt = 1052672

public val O_DSYNC: CInt = 4096

public val O_FSYNC: CInt = 0x101000

public val O_ASYNC: CInt = 0x2000

public val O_NDELAY: CInt = 0x800

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val MADV_SOFT_OFFLINE: CInt = 101

public val MAP_LOCKED: CInt = 0x00080

public val MAP_NORESERVE: CInt = 0x00040

public val MAP_ANON: CInt = 0x0020

public val MAP_ANONYMOUS: CInt = 0x0020

public val MAP_DENYWRITE: CInt = 0x0800

public val MAP_EXECUTABLE: CInt = 0x01000

public val MAP_POPULATE: CInt = 0x08000

public val MAP_NONBLOCK: CInt = 0x010000

public val MAP_STACK: CInt = 0x020000

public val MAP_HUGETLB: CInt = 0x040000

public val MAP_GROWSDOWN: CInt = 0x0100

public val MAP_SYNC: CInt = 0x080000

public val EDEADLOCK: CInt = 58

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

public val EDEADLK: CInt = 35

public val ENAMETOOLONG: CInt = 36

public val ENOLCK: CInt = 37

public val ENOSYS: CInt = 38

public val ENOTEMPTY: CInt = 39

public val ELOOP: CInt = 40

public val ENOMSG: CInt = 42

public val EIDRM: CInt = 43

public val ECHRNG: CInt = 44

public val EL2NSYNC: CInt = 45

public val EL3HLT: CInt = 46

public val EL3RST: CInt = 47

public val ELNRNG: CInt = 48

public val EUNATCH: CInt = 49

public val ENOCSI: CInt = 50

public val EL2HLT: CInt = 51

public val EBADE: CInt = 52

public val EBADR: CInt = 53

public val EXFULL: CInt = 54

public val ENOANO: CInt = 55

public val EBADRQC: CInt = 56

public val EBADSLT: CInt = 57

public val EMULTIHOP: CInt = 72

public val EOVERFLOW: CInt = 75

public val ENOTUNIQ: CInt = 76

public val EBADFD: CInt = 77

public val EBADMSG: CInt = 74

public val EREMCHG: CInt = 78

public val ELIBACC: CInt = 79

public val ELIBBAD: CInt = 80

public val ELIBSCN: CInt = 81

public val ELIBMAX: CInt = 82

public val ELIBEXEC: CInt = 83

public val EILSEQ: CInt = 84

public val ERESTART: CInt = 85

public val ESTRPIPE: CInt = 86

public val EUSERS: CInt = 87

public val ENOTSOCK: CInt = 88

public val EDESTADDRREQ: CInt = 89

public val EMSGSIZE: CInt = 90

public val EPROTOTYPE: CInt = 91

public val ENOPROTOOPT: CInt = 92

public val EPROTONOSUPPORT: CInt = 93

public val ESOCKTNOSUPPORT: CInt = 94

public val EOPNOTSUPP: CInt = 95

public val EPFNOSUPPORT: CInt = 96

public val EAFNOSUPPORT: CInt = 97

public val EADDRINUSE: CInt = 98

public val EADDRNOTAVAIL: CInt = 99

public val ENETDOWN: CInt = 100

public val ENETUNREACH: CInt = 101

public val ENETRESET: CInt = 102

public val ECONNABORTED: CInt = 103

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EISCONN: CInt = 106

public val ENOTCONN: CInt = 107

public val ESHUTDOWN: CInt = 108

public val ETOOMANYREFS: CInt = 109

public val ETIMEDOUT: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EHOSTDOWN: CInt = 112

public val EHOSTUNREACH: CInt = 113

public val EALREADY: CInt = 114

public val EINPROGRESS: CInt = 115

public val ESTALE: CInt = 116

public val EDQUOT: CInt = 122

public val ENOMEDIUM: CInt = 123

public val EMEDIUMTYPE: CInt = 124

public val ECANCELED: CInt = 125

public val ENOKEY: CInt = 126

public val EKEYEXPIRED: CInt = 127

public val EKEYREVOKED: CInt = 128

public val EKEYREJECTED: CInt = 129

public val EOWNERDEAD: CInt = 130

public val ENOTRECOVERABLE: CInt = 131

public val EHWPOISON: CInt = 133

public val ERFKILL: CInt = 132

public val SA_SIGINFO: CInt = 0x00000004

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val MCL_CURRENT: CInt = 0x2000

public val MCL_FUTURE: CInt = 0x4000

public val MCL_ONFAULT: CInt = 0x8000

public val POLLWRNORM: CShort = 0x100

public val POLLWRBAND: CShort = 0x200

public val F_GETLK: CInt = 12

public val F_GETLK1: CInt = 5

public val F_GETOWN: CInt = 9

public val F_SETOWN: CInt = 8

public val EFD_NONBLOCK: CInt = 0x800

public val SFD_NONBLOCK: CInt = 0x0800

public val SIGCHLD: CInt = 17

public val SIGBUS: CInt = 7

public val SIGUSR1: CInt = 10

public val SIGUSR2: CInt = 12

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGURG: CInt = 23

public val SIGIO: CInt = 29

public val SIGSYS: CInt = 31

public val SIGSTKFLT: CInt = 16

public val SIGUNUSED: CInt = 31

public val SIGPOLL: CInt = 29

public val SIGPWR: CInt = 30

public val SIG_SETMASK: CInt = 2

public val SIG_BLOCK: CInt = 0x000000

public val SIG_UNBLOCK: CInt = 0x01

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGSTKSZ: SizeT = 0x4000uL

public val MINSIGSTKSZ: SizeT = 4096uL

public val CBAUD: TcflagT = 0xffu

public val TAB1: TcflagT = 0x400u

public val TAB2: TcflagT = 0x800u

public val TAB3: TcflagT = 0xc00u

public val CR1: TcflagT = 0x1000u

public val CR2: TcflagT = 0x2000u

public val CR3: TcflagT = 0x3000u

public val FF1: TcflagT = 0x4000u

public val BS1: TcflagT = 0x8000u

public val VT1: TcflagT = 0x10000u

public val VWERASE: Int = 0xa

public val VREPRINT: Int = 0xb

public val VSUSP: Int = 0xc

public val VSTART: Int = 0xd

public val VSTOP: Int = 0xe

public val VDISCARD: Int = 0x10

public val VTIME: Int = 0x7

public val IXON: TcflagT = 0x200u

public val IXOFF: TcflagT = 0x400u

public val ONLCR: TcflagT = 0x2u

public val CSIZE: TcflagT = 0x300u

public val CS6: TcflagT = 0x100u

public val CS7: TcflagT = 0x200u

public val CS8: TcflagT = 0x300u

public val CSTOPB: TcflagT = 0x400u

public val CREAD: TcflagT = 0x800u

public val PARENB: TcflagT = 0x1000u

public val PARODD: TcflagT = 0x2000u

public val HUPCL: TcflagT = 0x4000u

public val CLOCAL: TcflagT = 0x8000u

public val ECHOKE: TcflagT = 0x1u

public val ECHOE: TcflagT = 0x2u

public val ECHOK: TcflagT = 0x4u

public val ECHONL: TcflagT = 0x10u

public val ECHOPRT: TcflagT = 0x20u

public val ECHOCTL: TcflagT = 0x40u

public val ISIG: TcflagT = 0x80u

public val ICANON: TcflagT = 0x100u

public val PENDIN: TcflagT = 0x20000000u

public val NOFLSH: TcflagT = 0x80000000u

public val VSWTC: Int = 9

public val OLCUC: TcflagT = 4u

public val NLDLY: TcflagT = 768u

public val CRDLY: TcflagT = 12288u

public val TABDLY: TcflagT = 3072u

public val BSDLY: TcflagT = 32768u

public val FFDLY: TcflagT = 16384u

public val VTDLY: TcflagT = 65536u

public val XTABS: TcflagT = 3072u

public val B0: SpeedT = 0u

public val B50: SpeedT = 1u

public val B75: SpeedT = 2u

public val B110: SpeedT = 3u

public val B134: SpeedT = 4u

public val B150: SpeedT = 5u

public val B200: SpeedT = 6u

public val B300: SpeedT = 7u

public val B600: SpeedT = 8u

public val B1200: SpeedT = 9u

public val B1800: SpeedT = 10u

public val B2400: SpeedT = 11u

public val B4800: SpeedT = 12u

public val B9600: SpeedT = 13u

public val B19200: SpeedT = 14u

public val B38400: SpeedT = 15u

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val CBAUDEX: SpeedT = 16u

public val B57600: SpeedT = 16u

public val B115200: SpeedT = 17u

public val B230400: SpeedT = 18u

public val B460800: SpeedT = 19u

public val B500000: SpeedT = 20u

public val B576000: SpeedT = 21u

public val B921600: SpeedT = 22u

public val B1000000: SpeedT = 23u

public val B1152000: SpeedT = 24u

public val B1500000: SpeedT = 25u

public val B2000000: SpeedT = 26u

public val B2500000: SpeedT = 27u

public val B3000000: SpeedT = 28u

public val B3500000: SpeedT = 29u

public val B4000000: SpeedT = 30u

public val VEOL: Int = 6

public val VEOL2: Int = 8

public val VMIN: Int = 5

public val IEXTEN: TcflagT = 0x400u

public val TOSTOP: TcflagT = 0x400000u

public val FLUSHO: TcflagT = 0x800000u

public val EXTPROC: TcflagT = 0x10000000u

public val SYS_RESTART_SYSCALL: CLong = 0L

public val SYS_EXIT: CLong = 1L

public val SYS_FORK: CLong = 2L

public val SYS_READ: CLong = 3L

public val SYS_WRITE: CLong = 4L

public val SYS_OPEN: CLong = 5L

public val SYS_CLOSE: CLong = 6L

public val SYS_WAITPID: CLong = 7L

public val SYS_CREAT: CLong = 8L

public val SYS_LINK: CLong = 9L

public val SYS_UNLINK: CLong = 10L

public val SYS_EXECVE: CLong = 11L

public val SYS_CHDIR: CLong = 12L

public val SYS_TIME: CLong = 13L

public val SYS_MKNOD: CLong = 14L

public val SYS_CHMOD: CLong = 15L

public val SYS_LCHOWN: CLong = 16L

public val SYS_BREAK: CLong = 17L

public val SYS_OLDSTAT: CLong = 18L

public val SYS_LSEEK: CLong = 19L

public val SYS_GETPID: CLong = 20L

public val SYS_MOUNT: CLong = 21L

public val SYS_UMOUNT: CLong = 22L

public val SYS_SETUID: CLong = 23L

public val SYS_GETUID: CLong = 24L

public val SYS_STIME: CLong = 25L

public val SYS_PTRACE: CLong = 26L

public val SYS_ALARM: CLong = 27L

public val SYS_OLDFSTAT: CLong = 28L

public val SYS_PAUSE: CLong = 29L

public val SYS_UTIME: CLong = 30L

public val SYS_STTY: CLong = 31L

public val SYS_GTTY: CLong = 32L

public val SYS_ACCESS: CLong = 33L

public val SYS_NICE: CLong = 34L

public val SYS_FTIME: CLong = 35L

public val SYS_SYNC: CLong = 36L

public val SYS_KILL: CLong = 37L

public val SYS_RENAME: CLong = 38L

public val SYS_MKDIR: CLong = 39L

public val SYS_RMDIR: CLong = 40L

public val SYS_DUP: CLong = 41L

public val SYS_PIPE: CLong = 42L

public val SYS_TIMES: CLong = 43L

public val SYS_PROF: CLong = 44L

public val SYS_BRK: CLong = 45L

public val SYS_SETGID: CLong = 46L

public val SYS_GETGID: CLong = 47L

public val SYS_SIGNAL: CLong = 48L

public val SYS_GETEUID: CLong = 49L

public val SYS_GETEGID: CLong = 50L

public val SYS_ACCT: CLong = 51L

public val SYS_UMOUNT2: CLong = 52L

public val SYS_LOCK: CLong = 53L

public val SYS_IOCTL: CLong = 54L

public val SYS_FCNTL: CLong = 55L

public val SYS_MPX: CLong = 56L

public val SYS_SETPGID: CLong = 57L

public val SYS_ULIMIT: CLong = 58L

public val SYS_OLDOLDUNAME: CLong = 59L

public val SYS_UMASK: CLong = 60L

public val SYS_CHROOT: CLong = 61L

public val SYS_USTAT: CLong = 62L

public val SYS_DUP2: CLong = 63L

public val SYS_GETPPID: CLong = 64L

public val SYS_GETPGRP: CLong = 65L

public val SYS_SETSID: CLong = 66L

public val SYS_SIGACTION: CLong = 67L

public val SYS_SGETMASK: CLong = 68L

public val SYS_SSETMASK: CLong = 69L

public val SYS_SETREUID: CLong = 70L

public val SYS_SETREGID: CLong = 71L

public val SYS_SIGSUSPEND: CLong = 72L

public val SYS_SIGPENDING: CLong = 73L

public val SYS_SETHOSTNAME: CLong = 74L

public val SYS_SETRLIMIT: CLong = 75L

public val SYS_GETRLIMIT: CLong = 76L

public val SYS_GETRUSAGE: CLong = 77L

public val SYS_GETTIMEOFDAY: CLong = 78L

public val SYS_SETTIMEOFDAY: CLong = 79L

public val SYS_GETGROUPS: CLong = 80L

public val SYS_SETGROUPS: CLong = 81L

public val SYS_SELECT: CLong = 82L

public val SYS_SYMLINK: CLong = 83L

public val SYS_OLDLSTAT: CLong = 84L

public val SYS_READLINK: CLong = 85L

public val SYS_USELIB: CLong = 86L

public val SYS_SWAPON: CLong = 87L

public val SYS_REBOOT: CLong = 88L

public val SYS_READDIR: CLong = 89L

public val SYS_MMAP: CLong = 90L

public val SYS_MUNMAP: CLong = 91L

public val SYS_TRUNCATE: CLong = 92L

public val SYS_FTRUNCATE: CLong = 93L

public val SYS_FCHMOD: CLong = 94L

public val SYS_FCHOWN: CLong = 95L

public val SYS_GETPRIORITY: CLong = 96L

public val SYS_SETPRIORITY: CLong = 97L

public val SYS_PROFIL: CLong = 98L

public val SYS_STATFS: CLong = 99L

public val SYS_FSTATFS: CLong = 100L

public val SYS_IOPERM: CLong = 101L

public val SYS_SOCKETCALL: CLong = 102L

public val SYS_SYSLOG: CLong = 103L

public val SYS_SETITIMER: CLong = 104L

public val SYS_GETITIMER: CLong = 105L

public val SYS_STAT: CLong = 106L

public val SYS_LSTAT: CLong = 107L

public val SYS_FSTAT: CLong = 108L

public val SYS_OLDUNAME: CLong = 109L

public val SYS_IOPL: CLong = 110L

public val SYS_VHANGUP: CLong = 111L

public val SYS_IDLE: CLong = 112L

public val SYS_VM86: CLong = 113L

public val SYS_WAIT4: CLong = 114L

public val SYS_SWAPOFF: CLong = 115L

public val SYS_SYSINFO: CLong = 116L

public val SYS_IPC: CLong = 117L

public val SYS_FSYNC: CLong = 118L

public val SYS_SIGRETURN: CLong = 119L

public val SYS_CLONE: CLong = 120L

public val SYS_SETDOMAINNAME: CLong = 121L

public val SYS_UNAME: CLong = 122L

public val SYS_MODIFY_LDT: CLong = 123L

public val SYS_ADJTIMEX: CLong = 124L

public val SYS_MPROTECT: CLong = 125L

public val SYS_SIGPROCMASK: CLong = 126L

public val SYS_CREATE_MODULE: CLong = 127L

public val SYS_INIT_MODULE: CLong = 128L

public val SYS_DELETE_MODULE: CLong = 129L

public val SYS_GET_KERNEL_SYMS: CLong = 130L

public val SYS_QUOTACTL: CLong = 131L

public val SYS_GETPGID: CLong = 132L

public val SYS_FCHDIR: CLong = 133L

public val SYS_BDFLUSH: CLong = 134L

public val SYS_SYSFS: CLong = 135L

public val SYS_PERSONALITY: CLong = 136L

public val SYS_AFS_SYSCALL: CLong = 137L

// Syscall for Andrew File System
public val SYS_SETFSUID: CLong = 138L

public val SYS_SETFSGID: CLong = 139L

public val SYS_LLSEEK: CLong = 140L

public val SYS_GETDENTS: CLong = 141L

public val SYS_NEWSELECT: CLong = 142L

public val SYS_FLOCK: CLong = 143L

public val SYS_MSYNC: CLong = 144L

public val SYS_READV: CLong = 145L

public val SYS_WRITEV: CLong = 146L

public val SYS_GETSID: CLong = 147L

public val SYS_FDATASYNC: CLong = 148L

public val SYS_SYSCTL: CLong = 149L

public val SYS_MLOCK: CLong = 150L

public val SYS_MUNLOCK: CLong = 151L

public val SYS_MLOCKALL: CLong = 152L

public val SYS_MUNLOCKALL: CLong = 153L

public val SYS_SCHED_SETPARAM: CLong = 154L

public val SYS_SCHED_GETPARAM: CLong = 155L

public val SYS_SCHED_SETSCHEDULER: CLong = 156L

public val SYS_SCHED_GETSCHEDULER: CLong = 157L

public val SYS_SCHED_YIELD: CLong = 158L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 159L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 160L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 161L

public val SYS_NANOSLEEP: CLong = 162L

public val SYS_MREMAP: CLong = 163L

public val SYS_SETRESUID: CLong = 164L

public val SYS_GETRESUID: CLong = 165L

public val SYS_QUERY_MODULE: CLong = 166L

public val SYS_POLL: CLong = 167L

public val SYS_NFSSERVCTL: CLong = 168L

public val SYS_SETRESGID: CLong = 169L

public val SYS_GETRESGID: CLong = 170L

public val SYS_PRCTL: CLong = 171L

public val SYS_RT_SIGRETURN: CLong = 172L

public val SYS_RT_SIGACTION: CLong = 173L

public val SYS_RT_SIGPROCMASK: CLong = 174L

public val SYS_RT_SIGPENDING: CLong = 175L

public val SYS_RT_SIGTIMEDWAIT: CLong = 176L

public val SYS_RT_SIGQUEUEINFO: CLong = 177L

public val SYS_RT_SIGSUSPEND: CLong = 178L

public val SYS_PREAD64: CLong = 179L

public val SYS_PWRITE64: CLong = 180L

public val SYS_CHOWN: CLong = 181L

public val SYS_GETCWD: CLong = 182L

public val SYS_CAPGET: CLong = 183L

public val SYS_CAPSET: CLong = 184L

public val SYS_SIGALTSTACK: CLong = 185L

public val SYS_SENDFILE: CLong = 186L

public val SYS_GETPMSG: CLong = 187L

// some people actually want streams
public val SYS_PUTPMSG: CLong = 188L

// some people actually want streams
public val SYS_VFORK: CLong = 189L

public val SYS_UGETRLIMIT: CLong = 190L

// SuS compliant getrlimit
public val SYS_READAHEAD: CLong = 191L

public val SYS_MMAP2: CLong = 192L

public val SYS_TRUNCATE64: CLong = 193L

public val SYS_FTRUNCATE64: CLong = 194L

public val SYS_STAT64: CLong = 195L

public val SYS_LSTAT64: CLong = 196L

public val SYS_FSTAT64: CLong = 197L

public val SYS_PCICONFIG_READ: CLong = 198L

public val SYS_PCICONFIG_WRITE: CLong = 199L

public val SYS_PCICONFIG_IOBASE: CLong = 200L

public val SYS_MULTIPLEXER: CLong = 201L

public val SYS_GETDENTS64: CLong = 202L

public val SYS_PIVOT_ROOT: CLong = 203L

public val SYS_FCNTL64: CLong = 204L

public val SYS_MADVISE: CLong = 205L

public val SYS_MINCORE: CLong = 206L

public val SYS_GETTID: CLong = 207L

public val SYS_TKILL: CLong = 208L

public val SYS_SETXATTR: CLong = 209L

public val SYS_LSETXATTR: CLong = 210L

public val SYS_FSETXATTR: CLong = 211L

public val SYS_GETXATTR: CLong = 212L

public val SYS_LGETXATTR: CLong = 213L

public val SYS_FGETXATTR: CLong = 214L

public val SYS_LISTXATTR: CLong = 215L

public val SYS_LLISTXATTR: CLong = 216L

public val SYS_FLISTXATTR: CLong = 217L

public val SYS_REMOVEXATTR: CLong = 218L

public val SYS_LREMOVEXATTR: CLong = 219L

public val SYS_FREMOVEXATTR: CLong = 220L

public val SYS_FUTEX: CLong = 221L

public val SYS_SCHED_SETAFFINITY: CLong = 222L

public val SYS_SCHED_GETAFFINITY: CLong = 223L

public val SYS_TUXCALL: CLong = 225L

public val SYS_SENDFILE64: CLong = 226L

public val SYS_IO_SETUP: CLong = 227L

public val SYS_IO_DESTROY: CLong = 228L

public val SYS_IO_GETEVENTS: CLong = 229L

public val SYS_IO_SUBMIT: CLong = 230L

public val SYS_IO_CANCEL: CLong = 231L

public val SYS_SET_TID_ADDRESS: CLong = 232L

public val SYS_FADVISE64: CLong = 233L

public val SYS_EXIT_GROUP: CLong = 234L

public val SYS_LOOKUP_DCOOKIE: CLong = 235L

public val SYS_EPOLL_CREATE: CLong = 236L

public val SYS_EPOLL_CTL: CLong = 237L

public val SYS_EPOLL_WAIT: CLong = 238L

public val SYS_REMAP_FILE_PAGES: CLong = 239L

public val SYS_TIMER_CREATE: CLong = 240L

public val SYS_TIMER_SETTIME: CLong = 241L

public val SYS_TIMER_GETTIME: CLong = 242L

public val SYS_TIMER_GETOVERRUN: CLong = 243L

public val SYS_TIMER_DELETE: CLong = 244L

public val SYS_CLOCK_SETTIME: CLong = 245L

public val SYS_CLOCK_GETTIME: CLong = 246L

public val SYS_CLOCK_GETRES: CLong = 247L

public val SYS_CLOCK_NANOSLEEP: CLong = 248L

public val SYS_SWAPCONTEXT: CLong = 249L

public val SYS_TGKILL: CLong = 250L

public val SYS_UTIMES: CLong = 251L

public val SYS_STATFS64: CLong = 252L

public val SYS_FSTATFS64: CLong = 253L

public val SYS_FADVISE64_64: CLong = 254L

public val SYS_RTAS: CLong = 255L

public val SYS_SYS_DEBUG_SETCONTEXT: CLong = 256L

public val SYS_MIGRATE_PAGES: CLong = 258L

public val SYS_MBIND: CLong = 259L

public val SYS_GET_MEMPOLICY: CLong = 260L

public val SYS_SET_MEMPOLICY: CLong = 261L

public val SYS_MQ_OPEN: CLong = 262L

public val SYS_MQ_UNLINK: CLong = 263L

public val SYS_MQ_TIMEDSEND: CLong = 264L

public val SYS_MQ_TIMEDRECEIVE: CLong = 265L

public val SYS_MQ_NOTIFY: CLong = 266L

public val SYS_MQ_GETSETATTR: CLong = 267L

public val SYS_KEXEC_LOAD: CLong = 268L

public val SYS_ADD_KEY: CLong = 269L

public val SYS_REQUEST_KEY: CLong = 270L

public val SYS_KEYCTL: CLong = 271L

public val SYS_WAITID: CLong = 272L

public val SYS_IOPRIO_SET: CLong = 273L

public val SYS_IOPRIO_GET: CLong = 274L

public val SYS_INOTIFY_INIT: CLong = 275L

public val SYS_INOTIFY_ADD_WATCH: CLong = 276L

public val SYS_INOTIFY_RM_WATCH: CLong = 277L

public val SYS_SPU_RUN: CLong = 278L

public val SYS_SPU_CREATE: CLong = 279L

public val SYS_PSELECT6: CLong = 280L

public val SYS_PPOLL: CLong = 281L

public val SYS_UNSHARE: CLong = 282L

public val SYS_SPLICE: CLong = 283L

public val SYS_TEE: CLong = 284L

public val SYS_VMSPLICE: CLong = 285L

public val SYS_OPENAT: CLong = 286L

public val SYS_MKDIRAT: CLong = 287L

public val SYS_MKNODAT: CLong = 288L

public val SYS_FCHOWNAT: CLong = 289L

public val SYS_FUTIMESAT: CLong = 290L

public val SYS_FSTATAT64: CLong = 291L

public val SYS_UNLINKAT: CLong = 292L

public val SYS_RENAMEAT: CLong = 293L

public val SYS_LINKAT: CLong = 294L

public val SYS_SYMLINKAT: CLong = 295L

public val SYS_READLINKAT: CLong = 296L

public val SYS_FCHMODAT: CLong = 297L

public val SYS_FACCESSAT: CLong = 298L

public val SYS_GET_ROBUST_LIST: CLong = 299L

public val SYS_SET_ROBUST_LIST: CLong = 300L

public val SYS_MOVE_PAGES: CLong = 301L

public val SYS_GETCPU: CLong = 302L

public val SYS_EPOLL_PWAIT: CLong = 303L

public val SYS_UTIMENSAT: CLong = 304L

public val SYS_SIGNALFD: CLong = 305L

public val SYS_TIMERFD_CREATE: CLong = 306L

public val SYS_EVENTFD: CLong = 307L

public val SYS_SYNC_FILE_RANGE2: CLong = 308L

public val SYS_FALLOCATE: CLong = 309L

public val SYS_SUBPAGE_PROT: CLong = 310L

public val SYS_TIMERFD_SETTIME: CLong = 311L

public val SYS_TIMERFD_GETTIME: CLong = 312L

public val SYS_SIGNALFD4: CLong = 313L

public val SYS_EVENTFD2: CLong = 314L

public val SYS_EPOLL_CREATE1: CLong = 315L

public val SYS_DUP3: CLong = 316L

public val SYS_PIPE2: CLong = 317L

public val SYS_INOTIFY_INIT1: CLong = 318L

public val SYS_PERF_EVENT_OPEN: CLong = 319L

public val SYS_PREADV: CLong = 320L

public val SYS_PWRITEV: CLong = 321L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 322L

public val SYS_FANOTIFY_INIT: CLong = 323L

public val SYS_FANOTIFY_MARK: CLong = 324L

public val SYS_PRLIMIT64: CLong = 325L

public val SYS_SOCKET: CLong = 326L

public val SYS_BIND: CLong = 327L

public val SYS_CONNECT: CLong = 328L

public val SYS_LISTEN: CLong = 329L

public val SYS_ACCEPT: CLong = 330L

public val SYS_GETSOCKNAME: CLong = 331L

public val SYS_GETPEERNAME: CLong = 332L

public val SYS_SOCKETPAIR: CLong = 333L

public val SYS_SEND: CLong = 334L

public val SYS_SENDTO: CLong = 335L

public val SYS_RECV: CLong = 336L

public val SYS_RECVFROM: CLong = 337L

public val SYS_SHUTDOWN: CLong = 338L

public val SYS_SETSOCKOPT: CLong = 339L

public val SYS_GETSOCKOPT: CLong = 340L

public val SYS_SENDMSG: CLong = 341L

public val SYS_RECVMSG: CLong = 342L

public val SYS_RECVMMSG: CLong = 343L

public val SYS_ACCEPT4: CLong = 344L

public val SYS_NAME_TO_HANDLE_AT: CLong = 345L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 346L

public val SYS_CLOCK_ADJTIME: CLong = 347L

public val SYS_SYNCFS: CLong = 348L

public val SYS_SENDMMSG: CLong = 349L

public val SYS_SETNS: CLong = 350L

public val SYS_PROCESS_VM_READV: CLong = 351L

public val SYS_PROCESS_VM_WRITEV: CLong = 352L

public val SYS_FINIT_MODULE: CLong = 353L

public val SYS_KCMP: CLong = 354L

public val SYS_SCHED_SETATTR: CLong = 355L

public val SYS_SCHED_GETATTR: CLong = 356L

public val SYS_RENAMEAT2: CLong = 357L

public val SYS_SECCOMP: CLong = 358L

public val SYS_GETRANDOM: CLong = 359L

public val SYS_MEMFD_CREATE: CLong = 360L

public val SYS_BPF: CLong = 361L

public val SYS_EXECVEAT: CLong = 362L

public val SYS_SWITCH_ENDIAN: CLong = 363L

public val SYS_USERFAULTFD: CLong = 364L

public val SYS_MEMBARRIER: CLong = 365L

public val SYS_MLOCK2: CLong = 378L

public val SYS_COPY_FILE_RANGE: CLong = 379L

public val SYS_PREADV2: CLong = 380L

public val SYS_PWRITEV2: CLong = 381L

public val SYS_KEXEC_FILE_LOAD: CLong = 382L

public val SYS_STATX: CLong = 383L

public val SYS_RSEQ: CLong = 387L

public val SYS_PIDFD_SEND_SIGNAL: CLong = 424L

public val SYS_IO_URING_SETUP: CLong = 425L

public val SYS_IO_URING_ENTER: CLong = 426L

public val SYS_IO_URING_REGISTER: CLong = 427L

public val SYS_OPEN_TREE: CLong = 428L

public val SYS_MOVE_MOUNT: CLong = 429L

public val SYS_FSOPEN: CLong = 430L

public val SYS_FSCONFIG: CLong = 431L

public val SYS_FSMOUNT: CLong = 432L

public val SYS_FSPICK: CLong = 433L

public val SYS_PIDFD_OPEN: CLong = 434L

public val SYS_CLONE3: CLong = 435L

public val SYS_CLOSE_RANGE: CLong = 436L

public val SYS_OPENAT2: CLong = 437L

public val SYS_PIDFD_GETFD: CLong = 438L

public val SYS_FACCESSAT2: CLong = 439L

public val SYS_PROCESS_MADVISE: CLong = 440L

public val SYS_EPOLL_PWAIT2: CLong = 441L

public val SYS_MOUNT_SETATTR: CLong = 442L

public val SYS_QUOTACTL_FD: CLong = 443L

public val SYS_LANDLOCK_CREATE_RULESET: CLong = 444L

public val SYS_LANDLOCK_ADD_RULE: CLong = 445L

public val SYS_LANDLOCK_RESTRICT_SELF: CLong = 446L

public val SYS_MEMFD_SECRET: CLong = 447L

public val SYS_PROCESS_MRELEASE: CLong = 448L

public val SYS_FUTEX_WAITV: CLong = 449L

public val SYS_SET_MEMPOLICY_HOME_NODE: CLong = 450L

public val SYS_MSEAL: CLong = 462L
