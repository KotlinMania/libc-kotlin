// port-lint: source new/musl/sys/socket.rs
package io.github.kotlinmania.libc.new.musl.sys.socket

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.SocklenT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `sys / socket.h`
//
// <https://github.com/kraj/musl/blob/kraj/master/include/sys/socket.h>

public class Msghdr internal constructor(
    msgNameCtorArg: MutPtr,
    public var msgNamelen: SocklenT,
    msgIovCtorArg: MutPtr,
    public var msgIovlen: CInt,
    public var pad1: CInt,
    msgControlCtorArg: MutPtr,
    public var msgControllen: SocklenT,
    public var pad2: CInt,
    public var msgFlags: CInt,
) {
    public var msgName: MutPtr = msgNameCtorArg
        internal set

    public var msgIov: MutPtr = msgIovCtorArg
        internal set

    public var msgControl: MutPtr = msgControlCtorArg
        internal set

    public constructor() : this(
        msgNameCtorArg = MutPtr(0L),
        msgNamelen = 0u,
        msgIovCtorArg = MutPtr(0L),
        msgIovlen = 0,
        pad1 = 0,
        msgControlCtorArg = MutPtr(0L),
        msgControllen = 0u,
        pad2 = 0,
        msgFlags = 0,
    )

    public operator fun component1(): MutPtr = this.msgName

    public operator fun component2(): SocklenT = this.msgNamelen

    public operator fun component3(): MutPtr = this.msgIov

    public operator fun component4(): CInt = this.msgIovlen

    public operator fun component5(): CInt = this.pad1

    public operator fun component6(): MutPtr = this.msgControl

    public operator fun component7(): SocklenT = this.msgControllen

    public operator fun component8(): CInt = this.pad2

    public operator fun component9(): CInt = this.msgFlags

    public fun copy(msgName: MutPtr = this.msgName, msgNamelen: SocklenT = this.msgNamelen, msgIov: MutPtr = this.msgIov, msgIovlen: CInt = this.msgIovlen, pad1: CInt = this.pad1, msgControl: MutPtr = this.msgControl, msgControllen: SocklenT = this.msgControllen, pad2: CInt = this.pad2, msgFlags: CInt = this.msgFlags): Msghdr = Msghdr(msgNameCtorArg = msgName, msgNamelen = msgNamelen, msgIovCtorArg = msgIov, msgIovlen = msgIovlen, pad1 = pad1, msgControlCtorArg = msgControl, msgControllen = msgControllen, pad2 = pad2, msgFlags = msgFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msghdr) return false
        if (this.msgName != other.msgName) return false
        if (this.msgNamelen != other.msgNamelen) return false
        if (this.msgIov != other.msgIov) return false
        if (this.msgIovlen != other.msgIovlen) return false
        if (this.pad1 != other.pad1) return false
        if (this.msgControl != other.msgControl) return false
        if (this.msgControllen != other.msgControllen) return false
        if (this.pad2 != other.pad2) return false
        if (this.msgFlags != other.msgFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgName.hashCode()
        result = 31 * result + this.msgNamelen.hashCode()
        result = 31 * result + this.msgIov.hashCode()
        result = 31 * result + this.msgIovlen.hashCode()
        result = 31 * result + this.pad1.hashCode()
        result = 31 * result + this.msgControl.hashCode()
        result = 31 * result + this.msgControllen.hashCode()
        result = 31 * result + this.pad2.hashCode()
        result = 31 * result + this.msgFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msghdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Msghdr =
                    Msghdr(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Msghdr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.msgName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.msgNamelen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.msgIov)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.msgIovlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.pad1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.msgControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.msgControllen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.pad2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.msgFlags)
                }
            }

        public operator fun invoke(
            msgName: MutPtr = MutPtr(0L),
            msgNamelen: SocklenT = 0u,
            msgIov: MutPtr = MutPtr(0L),
            msgIovlen: CInt = 0,
            pad1: CInt = 0,
            msgControl: MutPtr = MutPtr(0L),
            msgControllen: SocklenT = 0u,
            pad2: CInt = 0,
            msgFlags: CInt = 0,
        ): Msghdr =
            Msghdr(
                msgNameCtorArg = msgName,
                msgNamelen = msgNamelen,
                msgIovCtorArg = msgIov,
                msgIovlen = msgIovlen,
                pad1 = pad1,
                msgControlCtorArg = msgControl,
                msgControllen = msgControllen,
                pad2 = pad2,
                msgFlags = msgFlags,
            )
    }
}

public data class Cmsghdr(
    public var cmsgLen: SocklenT = 0u,
    public var pad1: CInt = 0,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cmsghdr =
                    Cmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Cmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cmsgLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.pad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cmsgLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cmsgType)
                }
            }
    }
}

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint, timeout: MutPtr): CInt

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2
