@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.android.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.android.InoT
import io.github.kotlinmania.libc.unix.linuxlike.android.NlinkT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = 0uL,
    public var saFlags: CInt = 0,
    public var saRestorer: SigactionSaRestorerCallback? = null,
)

public data class Rlimit64(public var rlimCur: ULong = 0uL, public var rlimMax: ULong = 0uL)

public class Stat(
    public var stDev: CUlonglong = 0uL,
    public var pad0: UByteArray = UByteArray(4),
    public var stIno: InoT = 0uL,
    public var stMode: CUint = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: CUlonglong = 0uL,
    public var pad3: UByteArray = UByteArray(4),
    public var stSize: CLonglong = 0L,
    public var stBlksize: BlksizeT = 0uL,
    public var stBlocks: CUlonglong = 0uL,
    public var stAtime: CLong = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: CLong = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: CLong = 0L,
    public var stCtimeNsec: CLong = 0L,
)

public class Stat64(
    public var stDev: CUlonglong = 0uL,
    public var pad0: UByteArray = UByteArray(4),
    public var stIno: InoT = 0uL,
    public var stMode: CUint = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: CUlonglong = 0uL,
    public var pad3: UByteArray = UByteArray(4),
    public var stSize: CLonglong = 0L,
    public var stBlksize: BlksizeT = 0uL,
    public var stBlocks: CUlonglong = 0uL,
    public var stAtime: CLong = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: CLong = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: CLong = 0L,
    public var stCtimeNsec: CLong = 0L,
)

public data class Statfs64(
    public var fType: UInt = 0u,
    public var fBsize: UInt = 0u,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: UInt = 0u,
    public var fFrsize: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var fSpare: UIntArray = UIntArray(4),
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
    public var fBlocks: CUlong = 0uL,
    public var fBfree: CUlong = 0uL,
    public var fBavail: CUlong = 0uL,
    public var fFiles: CUlong = 0uL,
    public var fFfree: CUlong = 0uL,
    public var fFavail: CUlong = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

public data class PthreadAttrT(
    public var flags: UInt = 0u,
    public var stackBase: COpaquePointer? = null,
    public var stackSize: SizeT = 0uL,
    public var guardSize: SizeT = 0uL,
    public var schedPolicy: Int = 0,
    public var schedPriority: Int = 0,
)

public data class PthreadMutexT(public var value: CInt = 0)

public data class PthreadCondT(public var value: CInt = 0)

public data class PthreadRwlockT(
    public var lock: PthreadMutexT = PthreadMutexT(),
    public var cond: PthreadCondT = PthreadCondT(),
    public var numLocks: CInt = 0,
    public var writerThreadId: CInt = 0,
    public var pendingReaders: CInt = 0,
    public var pendingWriters: CInt = 0,
    public var attr: Int = 0,
    public var reserved: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.lock != other.lock) return false
        if (this.cond != other.cond) return false
        if (this.numLocks != other.numLocks) return false
        if (this.writerThreadId != other.writerThreadId) return false
        if (this.pendingReaders != other.pendingReaders) return false
        if (this.pendingWriters != other.pendingWriters) return false
        if (this.attr != other.attr) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lock.hashCode()
        result = 31 * result + this.cond.hashCode()
        result = 31 * result + this.numLocks.hashCode()
        result = 31 * result + this.writerThreadId.hashCode()
        result = 31 * result + this.pendingReaders.hashCode()
        result = 31 * result + this.pendingWriters.hashCode()
        result = 31 * result + this.attr.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class PthreadBarrierT(public var private: IntArray = IntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.private.contentHashCode()
    }
}

public data class PthreadSpinlockT(public var private: IntArray = IntArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadSpinlockT) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.private.contentHashCode()
    }
}

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0u,
    public var pwGid: GidT = 0u,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
)

public data class Statfs(
    public var fType: UInt = 0u,
    public var fBsize: UInt = 0u,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: UInt = 0u,
    public var fFrsize: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var fSpare: UIntArray = UIntArray(4),
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
    public var f: UByteArray = UByteArray(8),
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

public data class Sigset64T(public var bits: ULongArray = ULongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigset64T) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bits.contentHashCode()
    }
}
