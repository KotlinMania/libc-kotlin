@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Timespec
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

// Horizon OS works doesn't or can't hold any of this information
public data class Hostent(
    public var hName: COpaquePointer? = null,
    public var hAliases: COpaquePointer? = null,
    public var hAddrtype: UShort = 0u,
    public var hLength: UShort = 0u,
    public var hAddrList: COpaquePointer? = null,
)

public data class Pollfd(
    public var fd: CInt = 0,
    public var events: CInt = 0,
    public var revents: CInt = 0,
)

public data class Sockaddr(
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(26),
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

public data class SockaddrStorage(
    public var ssFamily: SaFamilyT = 0u,
    public var ssPadding: UByteArray = UByteArray(26),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPadding.contentEquals(other.ssPadding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssPadding.contentHashCode()
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

public data class SockaddrUn(
    public var sunLen: CUchar = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(104),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunLen != other.sunLen) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunLen.hashCode()
        result = 31 * result + this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }
}

public data class SchedParam(
    public var schedPriority: CInt = 0,
)

public data class Stat(
    public var stDev: DevT = 0,
    public var stIno: InoT = 0u,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0,
    public var stSize: OffT = 0L,
    public var stAtim: Timespec = Timespec(),
    public var stMtim: Timespec = Timespec(),
    public var stCtim: Timespec = Timespec(),
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
        if (this.stAtim != other.stAtim) return false
        if (this.stMtim != other.stMtim) return false
        if (this.stCtim != other.stCtim) return false
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
        result = 31 * result + this.stAtim.hashCode()
        result = 31 * result + this.stMtim.hashCode()
        result = 31 * result + this.stCtim.hashCode()
        result = 31 * result + this.stBlksize.hashCode()
        result = 31 * result + this.stBlocks.hashCode()
        result = 31 * result + this.stSpare4.contentHashCode()
        return result
    }
}
