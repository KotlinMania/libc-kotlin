@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.newlib.BlkcntT
import io.github.kotlinmania.libc.unix.newlib.BlksizeT
import io.github.kotlinmania.libc.unix.newlib.DevT
import io.github.kotlinmania.libc.unix.newlib.InAddr
import io.github.kotlinmania.libc.unix.newlib.InoT
import io.github.kotlinmania.libc.unix.newlib.ModeT
import io.github.kotlinmania.libc.unix.newlib.NlinkT
import io.github.kotlinmania.libc.unix.newlib.OffT
import io.github.kotlinmania.libc.unix.newlib.SaFamilyT
import io.github.kotlinmania.libc.unix.newlib.SocklenT
import io.github.kotlinmania.libc.unix.newlib.TimeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class Msghdr internal constructor(
    msgNameCtorArg: MutPtr<CVoid>,
    public var msgNamelen: SocklenT,
    msgIovCtorArg: MutPtr<Iovec>,
    public var msgIovlen: CInt,
    msgControlCtorArg: MutPtr<CVoid>,
    public var msgControllen: SocklenT,
    public var msgFlags: CInt,
) {
    public var msgName: MutPtr<CVoid> = msgNameCtorArg
        internal set

    public var msgIov: MutPtr<Iovec> = msgIovCtorArg
        internal set

    public var msgControl: MutPtr<CVoid> = msgControlCtorArg
        internal set

    public constructor() : this(
        msgNameCtorArg = MutPtr(0L),
        msgNamelen = 0u,
        msgIovCtorArg = MutPtr(0L),
        msgIovlen = 0,
        msgControlCtorArg = MutPtr(0L),
        msgControllen = 0u,
        msgFlags = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.msgName

    public operator fun component2(): SocklenT = this.msgNamelen

    public operator fun component3(): MutPtr<Iovec> = this.msgIov

    public operator fun component4(): CInt = this.msgIovlen

    public operator fun component5(): MutPtr<CVoid> = this.msgControl

    public operator fun component6(): SocklenT = this.msgControllen

    public operator fun component7(): CInt = this.msgFlags

    public fun copy(msgName: MutPtr<CVoid> = this.msgName, msgNamelen: SocklenT = this.msgNamelen, msgIov: MutPtr<Iovec> = this.msgIov, msgIovlen: CInt = this.msgIovlen, msgControl: MutPtr<CVoid> = this.msgControl, msgControllen: SocklenT = this.msgControllen, msgFlags: CInt = this.msgFlags): Msghdr = Msghdr(msgNameCtorArg = msgName, msgNamelen = msgNamelen, msgIovCtorArg = msgIov, msgIovlen = msgIovlen, msgControlCtorArg = msgControl, msgControllen = msgControllen, msgFlags = msgFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msghdr) return false
        if (this.msgName != other.msgName) return false
        if (this.msgNamelen != other.msgNamelen) return false
        if (this.msgIov != other.msgIov) return false
        if (this.msgIovlen != other.msgIovlen) return false
        if (this.msgControl != other.msgControl) return false
        if (this.msgControllen != other.msgControllen) return false
        if (this.msgFlags != other.msgFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgName.hashCode()
        result = 31 * result + this.msgNamelen.hashCode()
        result = 31 * result + this.msgIov.hashCode()
        result = 31 * result + this.msgIovlen.hashCode()
        result = 31 * result + this.msgControl.hashCode()
        result = 31 * result + this.msgControllen.hashCode()
        result = 31 * result + this.msgFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            msgName: MutPtr<CVoid> = MutPtr(0L),
            msgNamelen: SocklenT = 0u,
            msgIov: MutPtr<Iovec> = MutPtr(0L),
            msgIovlen: CInt = 0,
            msgControl: MutPtr<CVoid> = MutPtr(0L),
            msgControllen: SocklenT = 0u,
            msgFlags: CInt = 0,
        ): Msghdr =
            Msghdr(
                msgNameCtorArg = msgName,
                msgNamelen = msgNamelen,
                msgIovCtorArg = msgIov,
                msgIovlen = msgIovlen,
                msgControlCtorArg = msgControl,
                msgControllen = msgControllen,
                msgFlags = msgFlags,
            )
    }
}

public data class Sockaddr(
    public var saLen: UByte = 0u,
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saLen != other.saLen) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saLen.hashCode()
        result = 31 * result + this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Len: UByte = 0u,
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6Vport: InPortT = 0u,
    public var sin6ScopeId: UInt = 0u,
)

public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinVport: InPortT = 0u,
    public var sinZero: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinLen != other.sinLen) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (this.sinVport != other.sinVport) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinLen.hashCode()
        result = 31 * result + this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinVport.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class SockaddrUn(
    public var ssLen: UByte = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(108),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.ssLen != other.ssLen) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(2),
    public var ssAlign: Long = 0L,
    public var ssPad2: UByteArray = UByteArray(116),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }
}

public data class SchedParam(
    public var schedPriority: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SchedParam =
                    SchedParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SchedParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.schedPriority)
                }
            }
    }
}

public data class Stat(
    public var stDev: DevT = 0,
    public var stIno: InoT = 0u,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0,
    public var stSize: OffT = 0L,
    public var stAtime: TimeT = 0L,
    public var stMtime: TimeT = 0L,
    public var stCtime: TimeT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: BlkcntT = 0,
    public var stSpare4: LongArray = LongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stat) return false
        if (this.stDev != other.stDev) return false
        if (this.stIno != other.stIno) return false
        if (this.stMode != other.stMode) return false
        if (this.stNlink != other.stNlink) return false
        if (this.stUid != other.stUid) return false
        if (this.stGid != other.stGid) return false
        if (this.stRdev != other.stRdev) return false
        if (this.stSize != other.stSize) return false
        if (this.stAtime != other.stAtime) return false
        if (this.stMtime != other.stMtime) return false
        if (this.stCtime != other.stCtime) return false
        if (this.stBlksize != other.stBlksize) return false
        if (this.stBlocks != other.stBlocks) return false
        if (!this.stSpare4.contentEquals(other.stSpare4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stDev.hashCode()
        result = 31 * result + this.stIno.hashCode()
        result = 31 * result + this.stMode.hashCode()
        result = 31 * result + this.stNlink.hashCode()
        result = 31 * result + this.stUid.hashCode()
        result = 31 * result + this.stGid.hashCode()
        result = 31 * result + this.stRdev.hashCode()
        result = 31 * result + this.stSize.hashCode()
        result = 31 * result + this.stAtime.hashCode()
        result = 31 * result + this.stMtime.hashCode()
        result = 31 * result + this.stCtime.hashCode()
        result = 31 * result + this.stBlksize.hashCode()
        result = 31 * result + this.stBlocks.hashCode()
        result = 31 * result + this.stSpare4.contentHashCode()
        return result
    }
}

public data class Dirent(
    public var offset: UByteArray = UByteArray(88),
    public var dName: UByteArray = UByteArray(256),
    public var pad: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (!this.offset.contentEquals(other.offset)) return false
        if (!this.dName.contentEquals(other.dName)) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offset.contentHashCode()
        result = 31 * result + this.dName.contentHashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}
