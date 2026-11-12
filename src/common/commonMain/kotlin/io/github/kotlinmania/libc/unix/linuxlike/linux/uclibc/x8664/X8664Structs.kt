@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public class PthreadAttrT internal constructor(
    public var detachstate: CInt,
    public var schedpolicy: CInt,
    public var schedparam: SchedParam,
    public var inheritsched: CInt,
    public var scope: CInt,
    public var guardsize: SizeT,
    public var stackaddrSet: CInt,
    stackaddrCtorArg: MutPtr<CVoid>,
    // better don't use it
    public var stacksize: SizeT,
) {
    public var stackaddr: MutPtr<CVoid> = stackaddrCtorArg
        internal set

    public constructor() : this(
        detachstate = 0,
        schedpolicy = 0,
        schedparam = SchedParam(),
        inheritsched = 0,
        scope = 0,
        guardsize = 0uL,
        stackaddrSet = 0,
        stackaddrCtorArg = MutPtr(0L),
        stacksize = 0uL,
    )

    public operator fun component1(): CInt = this.detachstate

    public operator fun component2(): CInt = this.schedpolicy

    public operator fun component3(): SchedParam = this.schedparam

    public operator fun component4(): CInt = this.inheritsched

    public operator fun component5(): CInt = this.scope

    public operator fun component6(): SizeT = this.guardsize

    public operator fun component7(): CInt = this.stackaddrSet

    public operator fun component8(): MutPtr<CVoid> = this.stackaddr

    public operator fun component9(): SizeT = this.stacksize

    public fun copy(detachstate: CInt = this.detachstate, schedpolicy: CInt = this.schedpolicy, schedparam: SchedParam = this.schedparam, inheritsched: CInt = this.inheritsched, scope: CInt = this.scope, guardsize: SizeT = this.guardsize, stackaddrSet: CInt = this.stackaddrSet, stackaddr: MutPtr<CVoid> = this.stackaddr, stacksize: SizeT = this.stacksize): PthreadAttrT = PthreadAttrT(detachstate = detachstate, schedpolicy = schedpolicy, schedparam = schedparam, inheritsched = inheritsched, scope = scope, guardsize = guardsize, stackaddrSet = stackaddrSet, stackaddrCtorArg = stackaddr, stacksize = stacksize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (this.detachstate != other.detachstate) return false
        if (this.schedpolicy != other.schedpolicy) return false
        if (this.schedparam != other.schedparam) return false
        if (this.inheritsched != other.inheritsched) return false
        if (this.scope != other.scope) return false
        if (this.guardsize != other.guardsize) return false
        if (this.stackaddrSet != other.stackaddrSet) return false
        if (this.stackaddr != other.stackaddr) return false
        if (this.stacksize != other.stacksize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.detachstate.hashCode()
        result = 31 * result + this.schedpolicy.hashCode()
        result = 31 * result + this.schedparam.hashCode()
        result = 31 * result + this.inheritsched.hashCode()
        result = 31 * result + this.scope.hashCode()
        result = 31 * result + this.guardsize.hashCode()
        result = 31 * result + this.stackaddrSet.hashCode()
        result = 31 * result + this.stackaddr.hashCode()
        result = 31 * result + this.stacksize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadAttrT =
                    PthreadAttrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (SchedParam.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: PthreadAttrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.detachstate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.schedpolicy)
                    (SchedParam.typeLayout()).writeNative(addr + 8L, value.schedparam)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.inheritsched)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.scope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.guardsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.stackaddrSet)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.stackaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.stacksize)
                }
            }

        public operator fun invoke(
            detachstate: CInt = 0,
            schedpolicy: CInt = 0,
            schedparam: SchedParam = SchedParam(),
            inheritsched: CInt = 0,
            scope: CInt = 0,
            guardsize: SizeT = 0uL,
            stackaddrSet: CInt = 0,
            stackaddr: MutPtr<CVoid> = MutPtr(0L),
            stacksize: SizeT = 0uL,
        ): PthreadAttrT =
            PthreadAttrT(
                detachstate = detachstate,
                schedpolicy = schedpolicy,
                schedparam = schedparam,
                inheritsched = inheritsched,
                scope = scope,
                guardsize = guardsize,
                stackaddrSet = stackaddrSet,
                stackaddrCtorArg = stackaddr,
                stacksize = stacksize,
            )
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (28).toInt())
                        ).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                        ).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (28).toInt())
                    ).writeNative(addr + 12L, value.pad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                    ).writeNative(addr + 128L, value.align)
                }
            }
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

public class StackT internal constructor(
    ssSpCtorArg: MutPtr<CVoid>,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
) {
    // Note(ulibc)
    public var ssSp: MutPtr<CVoid> = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssFlags = 0,
        ssSize = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ssSp

    public operator fun component2(): CInt = this.ssFlags

    public operator fun component3(): SizeT = this.ssSize

    public fun copy(ssSp: MutPtr<CVoid> = this.ssSp, ssFlags: CInt = this.ssFlags, ssSize: SizeT = this.ssSize): StackT = StackT(ssSpCtorArg = ssSp, ssFlags = ssFlags, ssSize = ssSize)

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
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ssFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.ssSize)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr<CVoid> = MutPtr(0L),
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statfs64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statfs64> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Statfs64 =
                    Statfs64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (FsidT.typeLayout()).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                        ).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: Statfs64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fBsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fBfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.fBavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.fFiles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.fFfree)
                    (FsidT.typeLayout()).writeNative(addr + 48L, value.fFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.fNamelen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.fFrsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.fFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                    ).writeNative(addr + 68L, value.fSpare)
                }
            }
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

public class Msghdr internal constructor(
    msgNameCtorArg: MutPtr<CVoid>,
    public var msgNamelen: SocklenT,
    msgIovCtorArg: MutPtr<Iovec>,
    public var msgIovlen: SizeT,
    msgControlCtorArg: MutPtr<CVoid>,
    public var msgControllen: SizeT,
    public var msgFlags: CInt,
) {
    // Note(ulibc)
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
        msgIovlen = 0uL,
        msgControlCtorArg = MutPtr(0L),
        msgControllen = 0uL,
        msgFlags = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.msgName

    public operator fun component2(): SocklenT = this.msgNamelen

    public operator fun component3(): MutPtr<Iovec> = this.msgIov

    public operator fun component4(): SizeT = this.msgIovlen

    public operator fun component5(): MutPtr<CVoid> = this.msgControl

    public operator fun component6(): SizeT = this.msgControllen

    public operator fun component7(): CInt = this.msgFlags

    public fun copy(msgName: MutPtr<CVoid> = this.msgName, msgNamelen: SocklenT = this.msgNamelen, msgIov: MutPtr<Iovec> = this.msgIov, msgIovlen: SizeT = this.msgIovlen, msgControl: MutPtr<CVoid> = this.msgControl, msgControllen: SizeT = this.msgControllen, msgFlags: CInt = this.msgFlags): Msghdr = Msghdr(msgNameCtorArg = msgName, msgNamelen = msgNamelen, msgIovCtorArg = msgIov, msgIovlen = msgIovlen, msgControlCtorArg = msgControl, msgControllen = msgControllen, msgFlags = msgFlags)

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
            msgIovlen: SizeT = 0uL,
            msgControl: MutPtr<CVoid> = MutPtr(0L),
            msgControllen: SizeT = 0uL,
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

public class GlobT internal constructor(
    // Note(ulibc)
    public var glPathc: SizeT,
    glPathvCtorArg: MutPtr<MutPtr<CChar>>,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    unused1CtorArg: MutPtr<CVoid>,
    unused2CtorArg: MutPtr<CVoid>,
    unused3CtorArg: MutPtr<CVoid>,
    unused4CtorArg: MutPtr<CVoid>,
    unused5CtorArg: MutPtr<CVoid>,
) {
    public var glPathv: MutPtr<MutPtr<CChar>> = glPathvCtorArg
        internal set

    public var unused1: MutPtr<CVoid> = unused1CtorArg
        internal set

    public var unused2: MutPtr<CVoid> = unused2CtorArg
        internal set

    public var unused3: MutPtr<CVoid> = unused3CtorArg
        internal set

    public var unused4: MutPtr<CVoid> = unused4CtorArg
        internal set

    public var unused5: MutPtr<CVoid> = unused5CtorArg
        internal set

    public constructor() : this(
        glPathc = 0uL,
        glPathvCtorArg = MutPtr(0L),
        glOffs = 0uL,
        glFlags = 0,
        unused1CtorArg = MutPtr(0L),
        unused2CtorArg = MutPtr(0L),
        unused3CtorArg = MutPtr(0L),
        unused4CtorArg = MutPtr(0L),
        unused5CtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.glPathc

    public operator fun component2(): MutPtr<MutPtr<CChar>> = this.glPathv

    public operator fun component3(): SizeT = this.glOffs

    public operator fun component4(): CInt = this.glFlags

    public operator fun component5(): MutPtr<CVoid> = this.unused1

    public operator fun component6(): MutPtr<CVoid> = this.unused2

    public operator fun component7(): MutPtr<CVoid> = this.unused3

    public operator fun component8(): MutPtr<CVoid> = this.unused4

    public operator fun component9(): MutPtr<CVoid> = this.unused5

    public fun copy(glPathc: SizeT = this.glPathc, glPathv: MutPtr<MutPtr<CChar>> = this.glPathv, glOffs: SizeT = this.glOffs, glFlags: CInt = this.glFlags, unused1: MutPtr<CVoid> = this.unused1, unused2: MutPtr<CVoid> = this.unused2, unused3: MutPtr<CVoid> = this.unused3, unused4: MutPtr<CVoid> = this.unused4, unused5: MutPtr<CVoid> = this.unused5): GlobT = GlobT(glPathc = glPathc, glPathvCtorArg = glPathv, glOffs = glOffs, glFlags = glFlags, unused1CtorArg = unused1, unused2CtorArg = unused2, unused3CtorArg = unused3, unused4CtorArg = unused4, unused5CtorArg = unused5)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GlobT) return false
        if (this.glPathc != other.glPathc) return false
        if (this.glPathv != other.glPathv) return false
        if (this.glOffs != other.glOffs) return false
        if (this.glFlags != other.glFlags) return false
        if (this.unused1 != other.unused1) return false
        if (this.unused2 != other.unused2) return false
        if (this.unused3 != other.unused3) return false
        if (this.unused4 != other.unused4) return false
        if (this.unused5 != other.unused5) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.glPathc.hashCode()
        result = 31 * result + this.glPathv.hashCode()
        result = 31 * result + this.glOffs.hashCode()
        result = 31 * result + this.glFlags.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.unused3.hashCode()
        result = 31 * result + this.unused4.hashCode()
        result = 31 * result + this.unused5.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            glPathc: SizeT = 0uL,
            glPathv: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            glOffs: SizeT = 0uL,
            glFlags: CInt = 0,
            unused1: MutPtr<CVoid> = MutPtr(0L),
            unused2: MutPtr<CVoid> = MutPtr(0L),
            unused3: MutPtr<CVoid> = MutPtr(0L),
            unused4: MutPtr<CVoid> = MutPtr(0L),
            unused5: MutPtr<CVoid> = MutPtr(0L),
        ): GlobT =
            GlobT(
                glPathc = glPathc,
                glPathvCtorArg = glPathv,
                glOffs = glOffs,
                glFlags = glFlags,
                unused1CtorArg = unused1,
                unused2CtorArg = unused2,
                unused3CtorArg = unused3,
                unused4CtorArg = unused4,
                unused5CtorArg = unused5,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuSetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuSetT> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CpuSetT =
                    CpuSetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CpuSetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr, value.bits)
                }
            }
    }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsidT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsidT> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FsidT =
                    FsidT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FsidT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr, value.value)
                }
            }
    }
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Cmsghdr =
                    Cmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Cmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.cmsgLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cmsgLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cmsgType)
                }
            }
    }
}

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
