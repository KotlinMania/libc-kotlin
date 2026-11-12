// port-lint: source unix/linux_like/linux/musl/b64/mips64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.mips64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.Fsblkcnt64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.Fsfilcnt64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.FsfilcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.TimeT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias WcharT = Int

public typealias U64 = CUlong

public typealias S64 = CLong

public typealias NlinkT = CUint

public typealias BlksizeT = Long

public typealias Stat64 = Stat

public class Stat(
    public var stDev: DevT = 0uL,
    public var pad1: IntArray = IntArray(3),
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad2: UIntArray = UIntArray(2),
    public var stSize: OffT = 0L,
    public var pad3: CInt = 0,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var pad4: CUint = 0u,
    public var stBlocks: BlkcntT = 0L,
    public var pad5: IntArray = IntArray(14),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 208L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (3).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 56L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 144L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (14).toInt())
                        ).readNative(addr + 152L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stDev)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (3).toInt())
                    ).writeNative(addr + 8L, value.pad1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.stRdev)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 56L, value.pad2.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.pad3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.stAtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.stMtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.stCtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.pad4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 144L, value.stBlocks)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (14).toInt())
                    ).writeNative(addr + 152L, value.pad5.toList())
                }
            }
    }
}

public class StackT internal constructor(
    ssSpCtorArg: MutPtr,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
) {
    public var ssSp: MutPtr = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssSize = 0uL,
        ssFlags = 0,
    )

    public operator fun component1(): MutPtr = this.ssSp

    public operator fun component2(): SizeT = this.ssSize

    public operator fun component3(): CInt = this.ssFlags

    public fun copy(ssSp: MutPtr = this.ssSp, ssSize: SizeT = this.ssSize, ssFlags: CInt = this.ssFlags): StackT = StackT(ssSpCtorArg = ssSp, ssSize = ssSize, ssFlags = ssFlags)

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
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ssSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ssFlags)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr = MutPtr(0L),
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

public data class IpcPerm(
    public var key: KeyT = 0,
    public var ipcPermKey: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CInt = 0,
    public var pad1: CInt = 0,
    public var unused1: CUlong = 0uL,
    public var unused2: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): IpcPerm =
                    IpcPerm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: IpcPerm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ipcPermKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.gid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.cuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.cgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.seq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.pad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.unused2)
                }
            }
    }
}

public data class Statfs(
    public var fType: CUlong = 0uL,
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: CUlong = 0uL,
    public var fFlags: CUlong = 0uL,
    public var fSpare: ULongArray = ULongArray(5),
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
    public var fType: CUlong = 0uL,
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: Fsblkcnt64T = 0uL,
    public var fBfree: Fsblkcnt64T = 0uL,
    public var fFiles: Fsfilcnt64T = 0uL,
    public var fFfree: Fsfilcnt64T = 0uL,
    public var fBavail: Fsblkcnt64T = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: CUlong = 0uL,
    public var fFlags: CUlong = 0uL,
    public var fSpare: ULongArray = ULongArray(5),
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

public val SIGSTKSZ: SizeT = 8192uL

public val MINSIGSTKSZ: SizeT = 2048uL

public val SYS_READ: CLong = 5000L + 0L

public val SYS_WRITE: CLong = 5000L + 1L

public val SYS_OPEN: CLong = 5000L + 2L

public val SYS_CLOSE: CLong = 5000L + 3L

public val SYS_STAT: CLong = 5000L + 4L

public val SYS_FSTAT: CLong = 5000L + 5L

public val SYS_LSTAT: CLong = 5000L + 6L

public val SYS_POLL: CLong = 5000L + 7L

public val SYS_LSEEK: CLong = 5000L + 8L

public val SYS_MMAP: CLong = 5000L + 9L

public val SYS_MPROTECT: CLong = 5000L + 10L

public val SYS_MUNMAP: CLong = 5000L + 11L

public val SYS_BRK: CLong = 5000L + 12L

public val SYS_RT_SIGACTION: CLong = 5000L + 13L

public val SYS_RT_SIGPROCMASK: CLong = 5000L + 14L

public val SYS_IOCTL: CLong = 5000L + 15L

public val SYS_PREAD64: CLong = 5000L + 16L

public val SYS_PWRITE64: CLong = 5000L + 17L

public val SYS_READV: CLong = 5000L + 18L

public val SYS_WRITEV: CLong = 5000L + 19L

public val SYS_ACCESS: CLong = 5000L + 20L

public val SYS_PIPE: CLong = 5000L + 21L

public val SYS_NEWSELECT: CLong = 5000L + 22L

public val SYS_SCHED_YIELD: CLong = 5000L + 23L

public val SYS_MREMAP: CLong = 5000L + 24L

public val SYS_MSYNC: CLong = 5000L + 25L

public val SYS_MINCORE: CLong = 5000L + 26L

public val SYS_MADVISE: CLong = 5000L + 27L

public val SYS_SHMGET: CLong = 5000L + 28L

public val SYS_SHMAT: CLong = 5000L + 29L

public val SYS_SHMCTL: CLong = 5000L + 30L

public val SYS_DUP: CLong = 5000L + 31L

public val SYS_DUP2: CLong = 5000L + 32L

public val SYS_PAUSE: CLong = 5000L + 33L

public val SYS_NANOSLEEP: CLong = 5000L + 34L

public val SYS_GETITIMER: CLong = 5000L + 35L

public val SYS_SETITIMER: CLong = 5000L + 36L

public val SYS_ALARM: CLong = 5000L + 37L

public val SYS_GETPID: CLong = 5000L + 38L

public val SYS_SENDFILE: CLong = 5000L + 39L

public val SYS_SOCKET: CLong = 5000L + 40L

public val SYS_CONNECT: CLong = 5000L + 41L

public val SYS_ACCEPT: CLong = 5000L + 42L

public val SYS_SENDTO: CLong = 5000L + 43L

public val SYS_RECVFROM: CLong = 5000L + 44L

public val SYS_SENDMSG: CLong = 5000L + 45L

public val SYS_RECVMSG: CLong = 5000L + 46L

public val SYS_SHUTDOWN: CLong = 5000L + 47L

public val SYS_BIND: CLong = 5000L + 48L

public val SYS_LISTEN: CLong = 5000L + 49L

public val SYS_GETSOCKNAME: CLong = 5000L + 50L

public val SYS_GETPEERNAME: CLong = 5000L + 51L

public val SYS_SOCKETPAIR: CLong = 5000L + 52L

public val SYS_SETSOCKOPT: CLong = 5000L + 53L

public val SYS_GETSOCKOPT: CLong = 5000L + 54L

public val SYS_CLONE: CLong = 5000L + 55L

public val SYS_FORK: CLong = 5000L + 56L

public val SYS_EXECVE: CLong = 5000L + 57L

public val SYS_EXIT: CLong = 5000L + 58L

public val SYS_WAIT4: CLong = 5000L + 59L

public val SYS_KILL: CLong = 5000L + 60L

public val SYS_UNAME: CLong = 5000L + 61L

public val SYS_SEMGET: CLong = 5000L + 62L

public val SYS_SEMOP: CLong = 5000L + 63L

public val SYS_SEMCTL: CLong = 5000L + 64L

public val SYS_SHMDT: CLong = 5000L + 65L

public val SYS_MSGGET: CLong = 5000L + 66L

public val SYS_MSGSND: CLong = 5000L + 67L

public val SYS_MSGRCV: CLong = 5000L + 68L

public val SYS_MSGCTL: CLong = 5000L + 69L

public val SYS_FCNTL: CLong = 5000L + 70L

public val SYS_FLOCK: CLong = 5000L + 71L

public val SYS_FSYNC: CLong = 5000L + 72L

public val SYS_FDATASYNC: CLong = 5000L + 73L

public val SYS_TRUNCATE: CLong = 5000L + 74L

public val SYS_FTRUNCATE: CLong = 5000L + 75L

public val SYS_GETDENTS: CLong = 5000L + 76L

public val SYS_GETCWD: CLong = 5000L + 77L

public val SYS_CHDIR: CLong = 5000L + 78L

public val SYS_FCHDIR: CLong = 5000L + 79L

public val SYS_RENAME: CLong = 5000L + 80L

public val SYS_MKDIR: CLong = 5000L + 81L

public val SYS_RMDIR: CLong = 5000L + 82L

public val SYS_CREAT: CLong = 5000L + 83L

public val SYS_LINK: CLong = 5000L + 84L

public val SYS_UNLINK: CLong = 5000L + 85L

public val SYS_SYMLINK: CLong = 5000L + 86L

public val SYS_READLINK: CLong = 5000L + 87L

public val SYS_CHMOD: CLong = 5000L + 88L

public val SYS_FCHMOD: CLong = 5000L + 89L

public val SYS_CHOWN: CLong = 5000L + 90L

public val SYS_FCHOWN: CLong = 5000L + 91L

public val SYS_LCHOWN: CLong = 5000L + 92L

public val SYS_UMASK: CLong = 5000L + 93L

public val SYS_GETTIMEOFDAY: CLong = 5000L + 94L

public val SYS_GETRLIMIT: CLong = 5000L + 95L

public val SYS_GETRUSAGE: CLong = 5000L + 96L

public val SYS_SYSINFO: CLong = 5000L + 97L

public val SYS_TIMES: CLong = 5000L + 98L

public val SYS_PTRACE: CLong = 5000L + 99L

public val SYS_GETUID: CLong = 5000L + 100L

public val SYS_SYSLOG: CLong = 5000L + 101L

public val SYS_GETGID: CLong = 5000L + 102L

public val SYS_SETUID: CLong = 5000L + 103L

public val SYS_SETGID: CLong = 5000L + 104L

public val SYS_GETEUID: CLong = 5000L + 105L

public val SYS_GETEGID: CLong = 5000L + 106L

public val SYS_SETPGID: CLong = 5000L + 107L

public val SYS_GETPPID: CLong = 5000L + 108L

public val SYS_GETPGRP: CLong = 5000L + 109L

public val SYS_SETSID: CLong = 5000L + 110L

public val SYS_SETREUID: CLong = 5000L + 111L

public val SYS_SETREGID: CLong = 5000L + 112L

public val SYS_GETGROUPS: CLong = 5000L + 113L

public val SYS_SETGROUPS: CLong = 5000L + 114L

public val SYS_SETRESUID: CLong = 5000L + 115L

public val SYS_GETRESUID: CLong = 5000L + 116L

public val SYS_SETRESGID: CLong = 5000L + 117L

public val SYS_GETRESGID: CLong = 5000L + 118L

public val SYS_GETPGID: CLong = 5000L + 119L

public val SYS_SETFSUID: CLong = 5000L + 120L

public val SYS_SETFSGID: CLong = 5000L + 121L

public val SYS_GETSID: CLong = 5000L + 122L

public val SYS_CAPGET: CLong = 5000L + 123L

public val SYS_CAPSET: CLong = 5000L + 124L

public val SYS_RT_SIGPENDING: CLong = 5000L + 125L

public val SYS_RT_SIGTIMEDWAIT: CLong = 5000L + 126L

public val SYS_RT_SIGQUEUEINFO: CLong = 5000L + 127L

public val SYS_RT_SIGSUSPEND: CLong = 5000L + 128L

public val SYS_SIGALTSTACK: CLong = 5000L + 129L

public val SYS_UTIME: CLong = 5000L + 130L

public val SYS_MKNOD: CLong = 5000L + 131L

public val SYS_PERSONALITY: CLong = 5000L + 132L

public val SYS_USTAT: CLong = 5000L + 133L

public val SYS_STATFS: CLong = 5000L + 134L

public val SYS_FSTATFS: CLong = 5000L + 135L

public val SYS_SYSFS: CLong = 5000L + 136L

public val SYS_GETPRIORITY: CLong = 5000L + 137L

public val SYS_SETPRIORITY: CLong = 5000L + 138L

public val SYS_SCHED_SETPARAM: CLong = 5000L + 139L

public val SYS_SCHED_GETPARAM: CLong = 5000L + 140L

public val SYS_SCHED_SETSCHEDULER: CLong = 5000L + 141L

public val SYS_SCHED_GETSCHEDULER: CLong = 5000L + 142L

public val SYS_SCHED_GET_PRIORITY_MAX: CLong = 5000L + 143L

public val SYS_SCHED_GET_PRIORITY_MIN: CLong = 5000L + 144L

public val SYS_SCHED_RR_GET_INTERVAL: CLong = 5000L + 145L

public val SYS_MLOCK: CLong = 5000L + 146L

public val SYS_MUNLOCK: CLong = 5000L + 147L

public val SYS_MLOCKALL: CLong = 5000L + 148L

public val SYS_MUNLOCKALL: CLong = 5000L + 149L

public val SYS_VHANGUP: CLong = 5000L + 150L

public val SYS_PIVOT_ROOT: CLong = 5000L + 151L

public val SYS_SYSCTL: CLong = 5000L + 152L

public val SYS_PRCTL: CLong = 5000L + 153L

public val SYS_ADJTIMEX: CLong = 5000L + 154L

public val SYS_SETRLIMIT: CLong = 5000L + 155L

public val SYS_CHROOT: CLong = 5000L + 156L

public val SYS_SYNC: CLong = 5000L + 157L

public val SYS_ACCT: CLong = 5000L + 158L

public val SYS_SETTIMEOFDAY: CLong = 5000L + 159L

public val SYS_MOUNT: CLong = 5000L + 160L

public val SYS_UMOUNT2: CLong = 5000L + 161L

public val SYS_SWAPON: CLong = 5000L + 162L

public val SYS_SWAPOFF: CLong = 5000L + 163L

public val SYS_REBOOT: CLong = 5000L + 164L

public val SYS_SETHOSTNAME: CLong = 5000L + 165L

public val SYS_SETDOMAINNAME: CLong = 5000L + 166L

public val SYS_CREATE_MODULE: CLong = 5000L + 167L

public val SYS_INIT_MODULE: CLong = 5000L + 168L

public val SYS_DELETE_MODULE: CLong = 5000L + 169L

public val SYS_GET_KERNEL_SYMS: CLong = 5000L + 170L

public val SYS_QUERY_MODULE: CLong = 5000L + 171L

public val SYS_QUOTACTL: CLong = 5000L + 172L

public val SYS_NFSSERVCTL: CLong = 5000L + 173L

public val SYS_GETPMSG: CLong = 5000L + 174L

public val SYS_PUTPMSG: CLong = 5000L + 175L

public val SYS_AFS_SYSCALL: CLong = 5000L + 176L

public val SYS_GETTID: CLong = 5000L + 178L

public val SYS_READAHEAD: CLong = 5000L + 179L

public val SYS_SETXATTR: CLong = 5000L + 180L

public val SYS_LSETXATTR: CLong = 5000L + 181L

public val SYS_FSETXATTR: CLong = 5000L + 182L

public val SYS_GETXATTR: CLong = 5000L + 183L

public val SYS_LGETXATTR: CLong = 5000L + 184L

public val SYS_FGETXATTR: CLong = 5000L + 185L

public val SYS_LISTXATTR: CLong = 5000L + 186L

public val SYS_LLISTXATTR: CLong = 5000L + 187L

public val SYS_FLISTXATTR: CLong = 5000L + 188L

public val SYS_REMOVEXATTR: CLong = 5000L + 189L

public val SYS_LREMOVEXATTR: CLong = 5000L + 190L

public val SYS_FREMOVEXATTR: CLong = 5000L + 191L

public val SYS_TKILL: CLong = 5000L + 192L

public val SYS_FUTEX: CLong = 5000L + 194L

public val SYS_SCHED_SETAFFINITY: CLong = 5000L + 195L

public val SYS_SCHED_GETAFFINITY: CLong = 5000L + 196L

public val SYS_CACHEFLUSH: CLong = 5000L + 197L

public val SYS_CACHECTL: CLong = 5000L + 198L

public val SYS_SYSMIPS: CLong = 5000L + 199L

public val SYS_IO_SETUP: CLong = 5000L + 200L

public val SYS_IO_DESTROY: CLong = 5000L + 201L

public val SYS_IO_GETEVENTS: CLong = 5000L + 202L

public val SYS_IO_SUBMIT: CLong = 5000L + 203L

public val SYS_IO_CANCEL: CLong = 5000L + 204L

public val SYS_EXIT_GROUP: CLong = 5000L + 205L

public val SYS_LOOKUP_DCOOKIE: CLong = 5000L + 206L

public val SYS_EPOLL_CREATE: CLong = 5000L + 207L

public val SYS_EPOLL_CTL: CLong = 5000L + 208L

public val SYS_EPOLL_WAIT: CLong = 5000L + 209L

public val SYS_REMAP_FILE_PAGES: CLong = 5000L + 210L

public val SYS_RT_SIGRETURN: CLong = 5000L + 211L

public val SYS_SET_TID_ADDRESS: CLong = 5000L + 212L

public val SYS_RESTART_SYSCALL: CLong = 5000L + 213L

public val SYS_SEMTIMEDOP: CLong = 5000L + 214L

public val SYS_FADVISE64: CLong = 5000L + 215L

public val SYS_TIMER_CREATE: CLong = 5000L + 216L

public val SYS_TIMER_SETTIME: CLong = 5000L + 217L

public val SYS_TIMER_GETTIME: CLong = 5000L + 218L

public val SYS_TIMER_GETOVERRUN: CLong = 5000L + 219L

public val SYS_TIMER_DELETE: CLong = 5000L + 220L

public val SYS_CLOCK_SETTIME: CLong = 5000L + 221L

public val SYS_CLOCK_GETTIME: CLong = 5000L + 222L

public val SYS_CLOCK_GETRES: CLong = 5000L + 223L

public val SYS_CLOCK_NANOSLEEP: CLong = 5000L + 224L

public val SYS_TGKILL: CLong = 5000L + 225L

public val SYS_UTIMES: CLong = 5000L + 226L

public val SYS_MBIND: CLong = 5000L + 227L

public val SYS_GET_MEMPOLICY: CLong = 5000L + 228L

public val SYS_SET_MEMPOLICY: CLong = 5000L + 229L

public val SYS_MQ_OPEN: CLong = 5000L + 230L

public val SYS_MQ_UNLINK: CLong = 5000L + 231L

public val SYS_MQ_TIMEDSEND: CLong = 5000L + 232L

public val SYS_MQ_TIMEDRECEIVE: CLong = 5000L + 233L

public val SYS_MQ_NOTIFY: CLong = 5000L + 234L

public val SYS_MQ_GETSETATTR: CLong = 5000L + 235L

public val SYS_VSERVER: CLong = 5000L + 236L

public val SYS_WAITID: CLong = 5000L + 237L

// pub const SysSysSetaltroot: cLong = 5000 + 238;
public val SYS_ADD_KEY: CLong = 5000L + 239L

public val SYS_REQUEST_KEY: CLong = 5000L + 240L

public val SYS_KEYCTL: CLong = 5000L + 241L

public val SYS_SET_THREAD_AREA: CLong = 5000L + 242L

public val SYS_INOTIFY_INIT: CLong = 5000L + 243L

public val SYS_INOTIFY_ADD_WATCH: CLong = 5000L + 244L

public val SYS_INOTIFY_RM_WATCH: CLong = 5000L + 245L

public val SYS_MIGRATE_PAGES: CLong = 5000L + 246L

public val SYS_OPENAT: CLong = 5000L + 247L

public val SYS_MKDIRAT: CLong = 5000L + 248L

public val SYS_MKNODAT: CLong = 5000L + 249L

public val SYS_FCHOWNAT: CLong = 5000L + 250L

public val SYS_FUTIMESAT: CLong = 5000L + 251L

public val SYS_NEWFSTATAT: CLong = 5000L + 252L

public val SYS_UNLINKAT: CLong = 5000L + 253L

public val SYS_RENAMEAT: CLong = 5000L + 254L

public val SYS_LINKAT: CLong = 5000L + 255L

public val SYS_SYMLINKAT: CLong = 5000L + 256L

public val SYS_READLINKAT: CLong = 5000L + 257L

public val SYS_FCHMODAT: CLong = 5000L + 258L

public val SYS_FACCESSAT: CLong = 5000L + 259L

public val SYS_PSELECT6: CLong = 5000L + 260L

public val SYS_PPOLL: CLong = 5000L + 261L

public val SYS_UNSHARE: CLong = 5000L + 262L

public val SYS_SPLICE: CLong = 5000L + 263L

public val SYS_SYNC_FILE_RANGE: CLong = 5000L + 264L

public val SYS_TEE: CLong = 5000L + 265L

public val SYS_VMSPLICE: CLong = 5000L + 266L

public val SYS_MOVE_PAGES: CLong = 5000L + 267L

public val SYS_SET_ROBUST_LIST: CLong = 5000L + 268L

public val SYS_GET_ROBUST_LIST: CLong = 5000L + 269L

public val SYS_KEXEC_LOAD: CLong = 5000L + 270L

public val SYS_GETCPU: CLong = 5000L + 271L

public val SYS_EPOLL_PWAIT: CLong = 5000L + 272L

public val SYS_IOPRIO_SET: CLong = 5000L + 273L

public val SYS_IOPRIO_GET: CLong = 5000L + 274L

public val SYS_UTIMENSAT: CLong = 5000L + 275L

public val SYS_SIGNALFD: CLong = 5000L + 276L

public val SYS_TIMERFD: CLong = 5000L + 277L

public val SYS_EVENTFD: CLong = 5000L + 278L

public val SYS_FALLOCATE: CLong = 5000L + 279L

public val SYS_TIMERFD_CREATE: CLong = 5000L + 280L

public val SYS_TIMERFD_GETTIME: CLong = 5000L + 281L

public val SYS_TIMERFD_SETTIME: CLong = 5000L + 282L

public val SYS_SIGNALFD4: CLong = 5000L + 283L

public val SYS_EVENTFD2: CLong = 5000L + 284L

public val SYS_EPOLL_CREATE1: CLong = 5000L + 285L

public val SYS_DUP3: CLong = 5000L + 286L

public val SYS_PIPE2: CLong = 5000L + 287L

public val SYS_INOTIFY_INIT1: CLong = 5000L + 288L

public val SYS_PREADV: CLong = 5000L + 289L

public val SYS_PWRITEV: CLong = 5000L + 290L

public val SYS_RT_TGSIGQUEUEINFO: CLong = 5000L + 291L

public val SYS_PERF_EVENT_OPEN: CLong = 5000L + 292L

public val SYS_ACCEPT4: CLong = 5000L + 293L

public val SYS_RECVMMSG: CLong = 5000L + 294L

public val SYS_FANOTIFY_INIT: CLong = 5000L + 295L

public val SYS_FANOTIFY_MARK: CLong = 5000L + 296L

public val SYS_PRLIMIT64: CLong = 5000L + 297L

public val SYS_NAME_TO_HANDLE_AT: CLong = 5000L + 298L

public val SYS_OPEN_BY_HANDLE_AT: CLong = 5000L + 299L

public val SYS_CLOCK_ADJTIME: CLong = 5000L + 300L

public val SYS_SYNCFS: CLong = 5000L + 301L

public val SYS_SENDMMSG: CLong = 5000L + 302L

public val SYS_SETNS: CLong = 5000L + 303L

public val SYS_PROCESS_VM_READV: CLong = 5000L + 304L

public val SYS_PROCESS_VM_WRITEV: CLong = 5000L + 305L

public val SYS_KCMP: CLong = 5000L + 306L

public val SYS_FINIT_MODULE: CLong = 5000L + 307L

public val SYS_GETDENTS64: CLong = 5000L + 308L

public val SYS_SCHED_SETATTR: CLong = 5000L + 309L

public val SYS_SCHED_GETATTR: CLong = 5000L + 310L

public val SYS_RENAMEAT2: CLong = 5000L + 311L

public val SYS_SECCOMP: CLong = 5000L + 312L

public val SYS_GETRANDOM: CLong = 5000L + 313L

public val SYS_MEMFD_CREATE: CLong = 5000L + 314L

public val SYS_BPF: CLong = 5000L + 315L

public val SYS_EXECVEAT: CLong = 5000L + 316L

public val SYS_USERFAULTFD: CLong = 5000L + 317L

public val SYS_MEMBARRIER: CLong = 5000L + 318L

public val SYS_MLOCK2: CLong = 5000L + 319L

public val SYS_COPY_FILE_RANGE: CLong = 5000L + 320L

public val SYS_PREADV2: CLong = 5000L + 321L

public val SYS_PWRITEV2: CLong = 5000L + 322L

public val SYS_PKEY_MPROTECT: CLong = 5000L + 323L

public val SYS_PKEY_ALLOC: CLong = 5000L + 324L

public val SYS_PKEY_FREE: CLong = 5000L + 325L

public val SYS_STATX: CLong = 5000L + 326L

public val SYS_PIDFD_SEND_SIGNAL: CLong = 5000L + 424L

public val SYS_IO_URING_SETUP: CLong = 5000L + 425L

public val SYS_IO_URING_ENTER: CLong = 5000L + 426L

public val SYS_IO_URING_REGISTER: CLong = 5000L + 427L

public val SYS_OPEN_TREE: CLong = 5000L + 428L

public val SYS_MOVE_MOUNT: CLong = 5000L + 429L

public val SYS_FSOPEN: CLong = 5000L + 430L

public val SYS_FSCONFIG: CLong = 5000L + 431L

public val SYS_FSMOUNT: CLong = 5000L + 432L

public val SYS_FSPICK: CLong = 5000L + 433L

public val SYS_PIDFD_OPEN: CLong = 5000L + 434L

public val SYS_CLONE3: CLong = 5000L + 435L

public val SYS_CLOSE_RANGE: CLong = 5000L + 436L

public val SYS_OPENAT2: CLong = 5000L + 437L

public val SYS_PIDFD_GETFD: CLong = 5000L + 438L

public val SYS_FACCESSAT2: CLong = 5000L + 439L

public val SYS_PROCESS_MADVISE: CLong = 5000L + 440L

public val SYS_EPOLL_PWAIT2: CLong = 5000L + 441L

public val SYS_MOUNT_SETATTR: CLong = 5000L + 442L

public val SYS_QUOTACTL_FD: CLong = 5000L + 443L

public val SYS_LANDLOCK_CREATE_RULESET: CLong = 5000L + 444L

public val SYS_LANDLOCK_ADD_RULE: CLong = 5000L + 445L

public val SYS_LANDLOCK_RESTRICT_SELF: CLong = 5000L + 446L

public val SYS_MEMFD_SECRET: CLong = 5000L + 447L

public val SYS_PROCESS_MRELEASE: CLong = 5000L + 448L

public val SYS_FUTEX_WAITV: CLong = 5000L + 449L

public val SYS_SET_MEMPOLICY_HOME_NODE: CLong = 5000L + 450L

public val O_DIRECT: CInt = 0x8000

public val O_DIRECTORY: CInt = 0x10000

public val O_NOFOLLOW: CInt = 0x20000

public val O_APPEND: CInt = 8

public val O_CREAT: CInt = 256

public val O_EXCL: CInt = 1024

public val O_NOCTTY: CInt = 2048

public val O_NONBLOCK: CInt = 128

public val O_SYNC: CInt = 0x4010

public val O_RSYNC: CInt = 0x4010

public val O_DSYNC: CInt = 0x10

public val O_ASYNC: CInt = 0x1000

public val O_LARGEFILE: CInt = 0x2000

public val EDEADLK: CInt = 45

public val ENAMETOOLONG: CInt = 78

public val ENOLCK: CInt = 46

public val ENOSYS: CInt = 89

public val ENOTEMPTY: CInt = 93

public val ELOOP: CInt = 90

public val ENOMSG: CInt = 35

public val EIDRM: CInt = 36

public val ECHRNG: CInt = 37

public val EL2NSYNC: CInt = 38

public val EL3HLT: CInt = 39

public val EL3RST: CInt = 40

public val ELNRNG: CInt = 41

public val EUNATCH: CInt = 42

public val ENOCSI: CInt = 43

public val EL2HLT: CInt = 44

public val EBADE: CInt = 50

public val EBADR: CInt = 51

public val EXFULL: CInt = 52

public val ENOANO: CInt = 53

public val EBADRQC: CInt = 54

public val EBADSLT: CInt = 55

public val EDEADLOCK: CInt = 56

public val EMULTIHOP: CInt = 74

public val EOVERFLOW: CInt = 79

public val ENOTUNIQ: CInt = 80

public val EBADFD: CInt = 81

public val EBADMSG: CInt = 77

public val EREMCHG: CInt = 82

public val ELIBACC: CInt = 83

public val ELIBBAD: CInt = 84

public val ELIBSCN: CInt = 85

public val ELIBMAX: CInt = 86

public val ELIBEXEC: CInt = 87

public val EILSEQ: CInt = 88

public val ERESTART: CInt = 91

public val ESTRPIPE: CInt = 92

public val EUSERS: CInt = 94

public val ENOTSOCK: CInt = 95

public val EDESTADDRREQ: CInt = 96

public val EMSGSIZE: CInt = 97

public val EPROTOTYPE: CInt = 98

public val ENOPROTOOPT: CInt = 99

public val EPROTONOSUPPORT: CInt = 120

public val ESOCKTNOSUPPORT: CInt = 121

public val EOPNOTSUPP: CInt = 122

public val ENOTSUP: CInt = EOPNOTSUPP

public val EPFNOSUPPORT: CInt = 123

public val EAFNOSUPPORT: CInt = 124

public val EADDRINUSE: CInt = 125

public val EADDRNOTAVAIL: CInt = 126

public val ENETDOWN: CInt = 127

public val ENETUNREACH: CInt = 128

public val ENETRESET: CInt = 129

public val ECONNABORTED: CInt = 130

public val ECONNRESET: CInt = 131

public val ENOBUFS: CInt = 132

public val EISCONN: CInt = 133

public val ENOTCONN: CInt = 134

public val ESHUTDOWN: CInt = 143

public val ETOOMANYREFS: CInt = 144

public val ETIMEDOUT: CInt = 145

public val ECONNREFUSED: CInt = 146

public val EHOSTDOWN: CInt = 147

public val EHOSTUNREACH: CInt = 148

public val EALREADY: CInt = 149

public val EINPROGRESS: CInt = 150

public val ESTALE: CInt = 151

public val EUCLEAN: CInt = 135

public val ENOTNAM: CInt = 137

public val ENAVAIL: CInt = 138

public val EISNAM: CInt = 139

public val EREMOTEIO: CInt = 140

public val EDQUOT: CInt = 1133

public val ENOMEDIUM: CInt = 159

public val EMEDIUMTYPE: CInt = 160

public val ECANCELED: CInt = 158

public val ENOKEY: CInt = 161

public val EKEYEXPIRED: CInt = 162

public val EKEYREVOKED: CInt = 163

public val EKEYREJECTED: CInt = 164

public val EOWNERDEAD: CInt = 165

public val ENOTRECOVERABLE: CInt = 166

public val ERFKILL: CInt = 167

public val MAP_ANON: CInt = 0x800

public val MAP_GROWSDOWN: CInt = 0x1000

public val MAP_DENYWRITE: CInt = 0x2000

public val MAP_EXECUTABLE: CInt = 0x4000

public val MAP_LOCKED: CInt = 0x8000

public val MAP_NORESERVE: CInt = 0x400

public val MAP_POPULATE: CInt = 0x10000

public val MAP_NONBLOCK: CInt = 0x20000

public val MAP_STACK: CInt = 0x40000

public val MAP_HUGETLB: CInt = 0x080000

public val SA_ONSTACK: CInt = 0x08000000

public val SA_SIGINFO: CInt = 0x00000008

public val SA_NOCLDWAIT: CInt = 0x00010000

public val SIGEMT: CInt = 7

public val SIGCHLD: CInt = 18

public val SIGBUS: CInt = 10

public val SIGTTIN: CInt = 26

public val SIGTTOU: CInt = 27

public val SIGXCPU: CInt = 30

public val SIGXFSZ: CInt = 31

public val SIGVTALRM: CInt = 28

public val SIGPROF: CInt = 29

public val SIGWINCH: CInt = 20

public val SIGUSR1: CInt = 16

public val SIGUSR2: CInt = 17

public val SIGCONT: CInt = 25

public val SIGSTOP: CInt = 23

public val SIGTSTP: CInt = 24

public val SIGURG: CInt = 21

public val SIGIO: CInt = 22

public val SIGSYS: CInt = 12

public val SIGPOLL: CInt = 22

public val SIGPWR: CInt = 19

public val SIG_SETMASK: CInt = 3

public val SIG_BLOCK: CInt = 0x1

public val SIG_UNBLOCK: CInt = 0x2

public val POLLWRNORM: CShort = 0x004

public val POLLWRBAND: CShort = 0x100

public val VEOF: Int = 16

public val VEOL: Int = 17

public val VEOL2: Int = 6

public val VMIN: Int = 4

public val IEXTEN: TcflagT = 0x00000100u

public val TOSTOP: TcflagT = 0x00008000u

public val FLUSHO: TcflagT = 0x00002000u

public val EXTPROC: TcflagT = 65536u

public val F_GETLK: CInt = 14

public val F_GETOWN: CInt = 23

public val F_SETOWN: CInt = 24

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val MCL_CURRENT: CInt = 0x0001

public val MCL_FUTURE: CInt = 0x0002

public val MCL_ONFAULT: CInt = 0x0004

public val CBAUD: TcflagT = 4111u

public val TAB1: TcflagT = 0x00000800u

public val TAB2: TcflagT = 0x00001000u

public val TAB3: TcflagT = 0x00001800u

public val CR1: TcflagT = 0x00000200u

public val CR2: TcflagT = 0x00000400u

public val CR3: TcflagT = 0x00000600u

public val FF1: TcflagT = 0x00008000u

public val BS1: TcflagT = 0x00002000u

public val VT1: TcflagT = 0x00004000u

public val VWERASE: Int = 14

public val VREPRINT: Int = 12

public val VSUSP: Int = 10

public val VSTART: Int = 8

public val VSTOP: Int = 9

public val VDISCARD: Int = 13

public val VTIME: Int = 5

public val IXON: TcflagT = 0x00000400u

public val IXOFF: TcflagT = 0x00001000u

public val ONLCR: TcflagT = 0x4u

public val CSIZE: TcflagT = 0x00000030u

public val CS6: TcflagT = 0x00000010u

public val CS7: TcflagT = 0x00000020u

public val CS8: TcflagT = 0x00000030u

public val CSTOPB: TcflagT = 0x00000040u

public val CREAD: TcflagT = 0x00000080u

public val PARENB: TcflagT = 0x00000100u

public val PARODD: TcflagT = 0x00000200u

public val HUPCL: TcflagT = 0x00000400u

public val CLOCAL: TcflagT = 0x00000800u

public val ECHOKE: TcflagT = 0x00000800u

public val ECHOE: TcflagT = 0x00000010u

public val ECHOK: TcflagT = 0x00000020u

public val ECHONL: TcflagT = 0x00000040u

public val ECHOPRT: TcflagT = 0x00000400u

public val ECHOCTL: TcflagT = 0x00000200u

public val ISIG: TcflagT = 0x00000001u

public val ICANON: TcflagT = 0x00000002u

public val PENDIN: TcflagT = 0x00004000u

public val NOFLSH: TcflagT = 0x00000080u

public val CIBAUD: TcflagT = 269418496u

public val CBAUDEX: TcflagT = 4096u

public val VSWTC: Int = 7

public val OLCUC: TcflagT = 2u

public val NLDLY: TcflagT = 256u

public val CRDLY: TcflagT = 1536u

public val TABDLY: TcflagT = 6144u

public val BSDLY: TcflagT = 8192u

public val FFDLY: TcflagT = 32768u

public val VTDLY: TcflagT = 16384u

public val XTABS: TcflagT = 6144u

public val B57600: SpeedT = 4097u

public val B115200: SpeedT = 4098u

public val B230400: SpeedT = 4099u

public val B460800: SpeedT = 4100u

public val B500000: SpeedT = 4101u

public val B576000: SpeedT = 4102u

public val B921600: SpeedT = 4103u

public val B1000000: SpeedT = 4104u

public val B1152000: SpeedT = 4105u

public val B1500000: SpeedT = 4106u

public val B2000000: SpeedT = 4107u

public val B2500000: SpeedT = 4108u

public val B3000000: SpeedT = 4109u

public val B3500000: SpeedT = 4110u

public val B4000000: SpeedT = 4111u

public val EHWPOISON: CInt = 168
