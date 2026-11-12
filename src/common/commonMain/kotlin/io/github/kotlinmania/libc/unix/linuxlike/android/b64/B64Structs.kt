@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.FsidT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public data class SigsetT(
    public var value: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

public data class Sigaction(
    public var saFlags: CInt = 0,
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = SigsetT(),
    public var saRestorer: SigactionSaRestorerCallback? = null,
)

public data class Rlimit64(
    public var rlimCur: CUlonglong = 0uL,
    public var rlimMax: CUlonglong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit64> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Rlimit64 =
                    Rlimit64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Rlimit64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rlimCur)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rlimMax)
                }
            }
    }
}

public class PthreadAttrT internal constructor(
    public var flags: UInt,
    stackBaseCtorArg: MutPtr<CVoid>,
    public var stackSize: SizeT,
    public var guardSize: SizeT,
    public var schedPolicy: Int,
    public var schedPriority: Int,
    public var reserved: UByteArray,
) {
    public var stackBase: MutPtr<CVoid> = stackBaseCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        stackBaseCtorArg = MutPtr(0L),
        stackSize = 0uL,
        guardSize = 0uL,
        schedPolicy = 0,
        schedPriority = 0,
        reserved = UByteArray(16),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): MutPtr<CVoid> = this.stackBase

    public operator fun component3(): SizeT = this.stackSize

    public operator fun component4(): SizeT = this.guardSize

    public operator fun component5(): Int = this.schedPolicy

    public operator fun component6(): Int = this.schedPriority

    public operator fun component7(): UByteArray = this.reserved

    public fun copy(flags: UInt = this.flags, stackBase: MutPtr<CVoid> = this.stackBase, stackSize: SizeT = this.stackSize, guardSize: SizeT = this.guardSize, schedPolicy: Int = this.schedPolicy, schedPriority: Int = this.schedPriority, reserved: UByteArray = this.reserved): PthreadAttrT = PthreadAttrT(flags = flags, stackBaseCtorArg = stackBase, stackSize = stackSize, guardSize = guardSize, schedPolicy = schedPolicy, schedPriority = schedPriority, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (this.flags != other.flags) return false
        if (this.stackBase != other.stackBase) return false
        if (this.stackSize != other.stackSize) return false
        if (this.guardSize != other.guardSize) return false
        if (this.schedPolicy != other.schedPolicy) return false
        if (this.schedPriority != other.schedPriority) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.stackBase.hashCode()
        result = 31 * result + this.stackSize.hashCode()
        result = 31 * result + this.guardSize.hashCode()
        result = 31 * result + this.schedPolicy.hashCode()
        result = 31 * result + this.schedPriority.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            stackBase: MutPtr<CVoid> = MutPtr(0L),
            stackSize: SizeT = 0uL,
            guardSize: SizeT = 0uL,
            schedPolicy: Int = 0,
            schedPriority: Int = 0,
            reserved: UByteArray = UByteArray(16),
        ): PthreadAttrT =
            PthreadAttrT(
                flags = flags,
                stackBaseCtorArg = stackBase,
                stackSize = stackSize,
                guardSize = guardSize,
                schedPolicy = schedPolicy,
                schedPriority = schedPriority,
                reserved = reserved,
            )
    }
}

public class Passwd internal constructor(
    pwNameCtorArg: MutPtr<CChar>,
    pwPasswdCtorArg: MutPtr<CChar>,
    public var pwUid: UidT,
    public var pwGid: GidT,
    pwGecosCtorArg: MutPtr<CChar>,
    pwDirCtorArg: MutPtr<CChar>,
    pwShellCtorArg: MutPtr<CChar>,
) {
    public var pwName: MutPtr<CChar> = pwNameCtorArg
        internal set

    public var pwPasswd: MutPtr<CChar> = pwPasswdCtorArg
        internal set

    public var pwGecos: MutPtr<CChar> = pwGecosCtorArg
        internal set

    public var pwDir: MutPtr<CChar> = pwDirCtorArg
        internal set

    public var pwShell: MutPtr<CChar> = pwShellCtorArg
        internal set

    public constructor() : this(
        pwNameCtorArg = MutPtr(0L),
        pwPasswdCtorArg = MutPtr(0L),
        pwUid = 0u,
        pwGid = 0u,
        pwGecosCtorArg = MutPtr(0L),
        pwDirCtorArg = MutPtr(0L),
        pwShellCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.pwName

    public operator fun component2(): MutPtr<CChar> = this.pwPasswd

    public operator fun component3(): UidT = this.pwUid

    public operator fun component4(): GidT = this.pwGid

    public operator fun component5(): MutPtr<CChar> = this.pwGecos

    public operator fun component6(): MutPtr<CChar> = this.pwDir

    public operator fun component7(): MutPtr<CChar> = this.pwShell

    public fun copy(pwName: MutPtr<CChar> = this.pwName, pwPasswd: MutPtr<CChar> = this.pwPasswd, pwUid: UidT = this.pwUid, pwGid: GidT = this.pwGid, pwGecos: MutPtr<CChar> = this.pwGecos, pwDir: MutPtr<CChar> = this.pwDir, pwShell: MutPtr<CChar> = this.pwShell): Passwd = Passwd(pwNameCtorArg = pwName, pwPasswdCtorArg = pwPasswd, pwUid = pwUid, pwGid = pwGid, pwGecosCtorArg = pwGecos, pwDirCtorArg = pwDir, pwShellCtorArg = pwShell)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Passwd) return false
        if (this.pwName != other.pwName) return false
        if (this.pwPasswd != other.pwPasswd) return false
        if (this.pwUid != other.pwUid) return false
        if (this.pwGid != other.pwGid) return false
        if (this.pwGecos != other.pwGecos) return false
        if (this.pwDir != other.pwDir) return false
        if (this.pwShell != other.pwShell) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwName.hashCode()
        result = 31 * result + this.pwPasswd.hashCode()
        result = 31 * result + this.pwUid.hashCode()
        result = 31 * result + this.pwGid.hashCode()
        result = 31 * result + this.pwGecos.hashCode()
        result = 31 * result + this.pwDir.hashCode()
        result = 31 * result + this.pwShell.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwName: MutPtr<CChar> = MutPtr(0L),
            pwPasswd: MutPtr<CChar> = MutPtr(0L),
            pwUid: UidT = 0u,
            pwGid: GidT = 0u,
            pwGecos: MutPtr<CChar> = MutPtr(0L),
            pwDir: MutPtr<CChar> = MutPtr(0L),
            pwShell: MutPtr<CChar> = MutPtr(0L),
        ): Passwd =
            Passwd(
                pwNameCtorArg = pwName,
                pwPasswdCtorArg = pwPasswd,
                pwUid = pwUid,
                pwGid = pwGid,
                pwGecosCtorArg = pwGecos,
                pwDirCtorArg = pwDir,
                pwShellCtorArg = pwShell,
            )
    }
}

public data class Statfs(
    public var fType: ULong = 0uL,
    public var fBsize: ULong = 0uL,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: ULong = 0uL,
    public var fFrsize: ULong = 0uL,
    public var fFlags: ULong = 0uL,
    public var fSpare: ULongArray = ULongArray(4),
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

public data class Sysinfo(
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

public data class Statfs64(
    public var fType: ULong = 0uL,
    public var fBsize: ULong = 0uL,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: ULong = 0uL,
    public var fFrsize: ULong = 0uL,
    public var fFlags: ULong = 0uL,
    public var fSpare: ULongArray = ULongArray(4),
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
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class PthreadBarrierT(
    public var private: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int = this.private.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadBarrierT =
                    PthreadBarrierT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (4).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadBarrierT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (4).toInt())
                    ).writeNative(addr, value.private)
                }
            }
    }
}

public data class PthreadSpinlockT(
    public var private: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadSpinlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadSpinlockT> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadSpinlockT =
                    PthreadSpinlockT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadSpinlockT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.private)
                }
            }
    }
}

public data class PthreadMutexT(
    public var value: CInt = 0,
    public var reserved: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (this.value != other.value) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class PthreadCondT(
    public var value: CInt = 0,
    public var reserved: UByteArray = UByteArray(44),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (this.value != other.value) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class PthreadRwlockT(
    public var numLocks: CInt = 0,
    public var writerThreadId: CInt = 0,
    public var pendingReaders: CInt = 0,
    public var pendingWriters: CInt = 0,
    public var attr: Int = 0,
    public var reserved: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.numLocks != other.numLocks) return false
        if (this.writerThreadId != other.writerThreadId) return false
        if (this.pendingReaders != other.pendingReaders) return false
        if (this.pendingWriters != other.pendingWriters) return false
        if (this.attr != other.attr) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numLocks.hashCode()
        result = 31 * result + this.writerThreadId.hashCode()
        result = 31 * result + this.pendingReaders.hashCode()
        result = 31 * result + this.pendingWriters.hashCode()
        result = 31 * result + this.attr.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Sigset64T(
    public var bits: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigset64T) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()
}
