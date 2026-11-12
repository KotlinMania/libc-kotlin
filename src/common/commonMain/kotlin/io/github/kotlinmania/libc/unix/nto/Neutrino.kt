// port-lint: source unix/nto/neutrino.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface SighandlerInfoHandlerCallback {
    public operator fun invoke(value: CInt)
}

public fun interface SignalActionSigstubCallback {
    public operator fun invoke()
}

public fun interface ThreadCreateFuncCallback {
    public operator fun invoke(arg: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun interface InterruptHookTraceHandlerCallback {
    public operator fun invoke(arg1: CInt): ConstPtr<Sigevent>
}

public fun interface InterruptHookIdleHandlerCallback {
    public operator fun invoke(arg1: MutPtr<ULong>, arg2: MutPtr<QtimeEntry>)
}

public fun interface InterruptHookIdle2HandlerCallback {
    public operator fun invoke(arg1: CUint, arg2: MutPtr<SyspageEntry>, arg3: MutPtr<IdleHook>)
}

public fun interface InterruptAttachHandlerCallback {
    public operator fun invoke(area: MutPtr<CVoid>, id: CInt): ConstPtr<Sigevent>
}

public fun interface InterruptAttachArrayHandlerCallback {
    public operator fun invoke(area: MutPtr<CVoid>, id: CInt): ConstPtr<ConstPtr<Sigevent>>
}

public typealias NtoJobT = SyncT

public data class SyspageEntryInfo(
    public var entryOff: UShort = 0u,
    public var entrySize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyspageEntryInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyspageEntryInfo> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SyspageEntryInfo =
                    SyspageEntryInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SyspageEntryInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.entryOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.entrySize)
                }
            }
    }
}

public data class SyspageArrayInfo(
    public var entryOff: UShort = 0u,
    public var entrySize: UShort = 0u,
    public var elementSize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyspageArrayInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyspageArrayInfo> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SyspageArrayInfo =
                    SyspageArrayInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SyspageArrayInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.entryOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.entrySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.elementSize)
                }
            }
    }
}

public data class Intrspin(
    public var value: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Intrspin> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Intrspin> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Intrspin =
                    Intrspin(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Intrspin) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.value)
                }
            }
    }
}

public class IovT internal constructor(
    iovBaseCtorArg: MutPtr<CVoid>,
    // union
    public var iovLen: SizeT,
) {
    public var iovBase: MutPtr<CVoid> = iovBaseCtorArg
        internal set

    public constructor() : this(
        iovBaseCtorArg = MutPtr(0L),
        iovLen = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.iovBase

    public operator fun component2(): SizeT = this.iovLen

    public fun copy(iovBase: MutPtr<CVoid> = this.iovBase, iovLen: SizeT = this.iovLen): IovT = IovT(iovBaseCtorArg = iovBase, iovLen = iovLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IovT) return false
        if (this.iovBase != other.iovBase) return false
        if (this.iovLen != other.iovLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iovBase.hashCode()
        result = 31 * result + this.iovLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IovT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IovT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IovT =
                    IovT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IovT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.iovBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.iovLen)
                }
            }

        public operator fun invoke(
            iovBase: MutPtr<CVoid> = MutPtr(0L),
            iovLen: SizeT = 0uL,
        ): IovT =
            IovT(
                iovBaseCtorArg = iovBase,
                iovLen = iovLen,
            )
    }
}

public data class Itimer(
    public var nsec: ULong = 0uL,
    public var intervalNsec: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itimer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itimer> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Itimer =
                    Itimer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Itimer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.nsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.intervalNsec)
                }
            }
    }
}

public data class MsgInfo64(
    public var nd: UInt = 0u,
    public var srcnd: UInt = 0u,
    public var pid: PidT = 0,
    public var tid: Int = 0,
    public var chid: Int = 0,
    public var scoid: Int = 0,
    public var coid: Int = 0,
    public var priority: Short = 0,
    public var flags: Short = 0,
    public var msglen: Int = 0,
    public var srcmsglen: Int = 0,
    public var dstmsglen: Int = 0,
    public var typeId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class CredInfo(
    public var ruid: UidT = 0u,
    public var euid: UidT = 0u,
    public var suid: UidT = 0u,
    public var rgid: GidT = 0u,
    public var egid: GidT = 0u,
    public var sgid: GidT = 0u,
    public var ngroups: UInt = 0u,
    public var grouplist: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CredInfo) return false
        if (this.ruid != other.ruid) return false
        if (this.euid != other.euid) return false
        if (this.suid != other.suid) return false
        if (this.rgid != other.rgid) return false
        if (this.egid != other.egid) return false
        if (this.sgid != other.sgid) return false
        if (this.ngroups != other.ngroups) return false
        if (!this.grouplist.contentEquals(other.grouplist)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ruid.hashCode()
        result = 31 * result + this.euid.hashCode()
        result = 31 * result + this.suid.hashCode()
        result = 31 * result + this.rgid.hashCode()
        result = 31 * result + this.egid.hashCode()
        result = 31 * result + this.sgid.hashCode()
        result = 31 * result + this.ngroups.hashCode()
        result = 31 * result + this.grouplist.contentHashCode()
        return result
    }
}

public data class ClientInfo(
    public var nd: UInt = 0u,
    public var pid: PidT = 0,
    public var sid: PidT = 0,
    public var flags: UInt = 0u,
    public var cred: CredInfo = CredInfo(),
)

public data class ClientAble(
    public var ability: UInt = 0u,
    public var flags: UInt = 0u,
    public var rangeLo: ULong = 0uL,
    public var rangeHi: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClientAble> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClientAble> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ClientAble =
                    ClientAble(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ClientAble) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rangeLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rangeHi)
                }
            }
    }
}

public data class NtoChannelConfig(
    public var event: Sigevent = Sigevent(),
    public var numPulses: CUint = 0u,
    public var rearmThreshold: CUint = 0u,
    public var options: CUint = 0u,
    public var reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtoChannelConfig) return false
        if (this.event != other.event) return false
        if (this.numPulses != other.numPulses) return false
        if (this.rearmThreshold != other.rearmThreshold) return false
        if (this.options != other.options) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.event.hashCode()
        result = 31 * result + this.numPulses.hashCode()
        result = 31 * result + this.rearmThreshold.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

// Note: The following structures are defined in a header file which doesn't
// appear as part of the default headers found in a standard installation
// of Neutrino 7.1 SDP.  Commented out for now.
// pub struct _asyncmsg_put_header {
// pub err: cInt,
// pub iov: *mut iovT,
// pub parts: cInt,
// pub handle: cUint,
// pub cb: Option<
// unchecked extern "C" fn(
// err: cInt,
// buf: *mut cVoid,
// handle: cUint,
// ) -> cInt>,
// pub putHdrFlags: cUint,
// }
// pub struct _asyncmsg_connection_attr {
// pub callBack: Option<
// unchecked extern "C" fn(
// err: cInt,
// buff: *mut cVoid,
// handle: cUint,
// ) -> cInt>,
// pub bufferSize: sizeT,
// pub maxNumBuffer: cUint,
// pub triggerNumMsg: cUint,
// pub triggerTime: itimer,
// reserve: Padding<cUint>,
// }
// pub struct _asyncmsg_connection_descriptor {
// pub flags: cUint,
// pub sendqSize: cUint,
// pub sendqHead: cUint,
// pub sendqTail: cUint,
// pub sendqFree: cUint,
// pub err: cInt,
// pub ev: sigevent,
// pub numCurmsg: cUint,
// pub ttimer: timerT,
// pub blockCon: pthreadCondT,
// pub mu: pthreadMutexT,
// reserved: Padding<cUint>,
// pub attr: asyncmsgConnectionAttr,
// reserves: Padding<[cUint; 3]>,
// pub sendq: [asyncmsgPutHeader; 1], // flexarray
// }
public data class CAnonymousStructEv(
    public var event: Sigevent = Sigevent(),
    public var coid: CInt = 0,
)

public data class ChannelConnectAttr(
    // union
    public var ev: CAnonymousStructEv = CAnonymousStructEv(),
)

public class SighandlerInfo internal constructor(
    public var siginfo: SiginfoT,
    public var handler: SighandlerInfoHandlerCallback?,
    contextCtorArg: MutPtr<CVoid>,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        siginfo = SiginfoT(),
        handler = null,
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SiginfoT = this.siginfo

    public operator fun component2(): SighandlerInfoHandlerCallback? = this.handler

    public operator fun component3(): MutPtr<CVoid> = this.context

    public fun copy(siginfo: SiginfoT = this.siginfo, handler: SighandlerInfoHandlerCallback? = this.handler, context: MutPtr<CVoid> = this.context): SighandlerInfo = SighandlerInfo(siginfo = siginfo, handler = handler, contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SighandlerInfo) return false
        if (this.siginfo != other.siginfo) return false
        if (this.handler != other.handler) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siginfo.hashCode()
        result = 31 * result + this.handler.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            siginfo: SiginfoT = SiginfoT(),
            handler: SighandlerInfoHandlerCallback? = null,
            context: MutPtr<CVoid> = MutPtr(0L),
        ): SighandlerInfo =
            SighandlerInfo(
                siginfo = siginfo,
                handler = handler,
                contextCtorArg = context,
            )
    }
}

public data class CAnonymousStructTime(
    public var length: CUint = 0u,
    public var scale: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousStructTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousStructTime> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CAnonymousStructTime =
                    CAnonymousStructTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousStructTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.scale)
                }
            }
    }
}

public class IdleHook internal constructor(
    public var hookSize: CUint,
    public var cmd: CUint,
    public var mode: CUint,
    public var latency: CUint,
    public var nextFire: ULong,
    public var currTime: ULong,
    public var todAdjust: ULong,
    public var resp: CUint,
    public var time: CAnonymousStructTime,
    public var trigger: Sigevent,
    intrsCtorArg: MutPtr<CUint>,
    public var blockStackSize: CUint,
) {
    public var intrs: MutPtr<CUint> = intrsCtorArg
        internal set

    public constructor() : this(
        hookSize = 0u,
        cmd = 0u,
        mode = 0u,
        latency = 0u,
        nextFire = 0uL,
        currTime = 0uL,
        todAdjust = 0uL,
        resp = 0u,
        time = CAnonymousStructTime(),
        trigger = Sigevent(),
        intrsCtorArg = MutPtr(0L),
        blockStackSize = 0u,
    )

    public operator fun component1(): CUint = this.hookSize

    public operator fun component2(): CUint = this.cmd

    public operator fun component3(): CUint = this.mode

    public operator fun component4(): CUint = this.latency

    public operator fun component5(): ULong = this.nextFire

    public operator fun component6(): ULong = this.currTime

    public operator fun component7(): ULong = this.todAdjust

    public operator fun component8(): CUint = this.resp

    public operator fun component9(): CAnonymousStructTime = this.time

    public operator fun component10(): Sigevent = this.trigger

    public operator fun component11(): MutPtr<CUint> = this.intrs

    public operator fun component12(): CUint = this.blockStackSize

    public fun copy(hookSize: CUint = this.hookSize, cmd: CUint = this.cmd, mode: CUint = this.mode, latency: CUint = this.latency, nextFire: ULong = this.nextFire, currTime: ULong = this.currTime, todAdjust: ULong = this.todAdjust, resp: CUint = this.resp, time: CAnonymousStructTime = this.time, trigger: Sigevent = this.trigger, intrs: MutPtr<CUint> = this.intrs, blockStackSize: CUint = this.blockStackSize): IdleHook = IdleHook(hookSize = hookSize, cmd = cmd, mode = mode, latency = latency, nextFire = nextFire, currTime = currTime, todAdjust = todAdjust, resp = resp, time = time, trigger = trigger, intrsCtorArg = intrs, blockStackSize = blockStackSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IdleHook) return false
        if (this.hookSize != other.hookSize) return false
        if (this.cmd != other.cmd) return false
        if (this.mode != other.mode) return false
        if (this.latency != other.latency) return false
        if (this.nextFire != other.nextFire) return false
        if (this.currTime != other.currTime) return false
        if (this.todAdjust != other.todAdjust) return false
        if (this.resp != other.resp) return false
        if (this.time != other.time) return false
        if (this.trigger != other.trigger) return false
        if (this.intrs != other.intrs) return false
        if (this.blockStackSize != other.blockStackSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hookSize.hashCode()
        result = 31 * result + this.cmd.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.latency.hashCode()
        result = 31 * result + this.nextFire.hashCode()
        result = 31 * result + this.currTime.hashCode()
        result = 31 * result + this.todAdjust.hashCode()
        result = 31 * result + this.resp.hashCode()
        result = 31 * result + this.time.hashCode()
        result = 31 * result + this.trigger.hashCode()
        result = 31 * result + this.intrs.hashCode()
        result = 31 * result + this.blockStackSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hookSize: CUint = 0u,
            cmd: CUint = 0u,
            mode: CUint = 0u,
            latency: CUint = 0u,
            nextFire: ULong = 0uL,
            currTime: ULong = 0uL,
            todAdjust: ULong = 0uL,
            resp: CUint = 0u,
            time: CAnonymousStructTime = CAnonymousStructTime(),
            trigger: Sigevent = Sigevent(),
            intrs: MutPtr<CUint> = MutPtr(0L),
            blockStackSize: CUint = 0u,
        ): IdleHook =
            IdleHook(
                hookSize = hookSize,
                cmd = cmd,
                mode = mode,
                latency = latency,
                nextFire = nextFire,
                currTime = currTime,
                todAdjust = todAdjust,
                resp = resp,
                time = time,
                trigger = trigger,
                intrsCtorArg = intrs,
                blockStackSize = blockStackSize,
            )
    }
}

public data class Clockadjust(
    public var tickCount: UInt = 0u,
    public var tickNsecInc: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clockadjust> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clockadjust> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Clockadjust =
                    Clockadjust(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Clockadjust) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tickCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tickNsecInc)
                }
            }
    }
}

public class QtimeEntry(
    public var cyclesPerSec: ULong = 0uL,
    public var nsecTodAdjust: ULong = 0uL,
    // volatile
    public var nsec: ULong = 0uL,
    // volatile
    public var nsecInc: UInt = 0u,
    public var bootTime: UInt = 0u,
    public var adjust: Clockadjust = Clockadjust(),
    public var timerRate: UInt = 0u,
    public var timerScale: Int = 0,
    public var timerLoad: UInt = 0u,
    public var intr: Int = 0,
    public var epoch: UInt = 0u,
    public var flags: UInt = 0u,
    public var rrIntervalMul: UInt = 0u,
    public var timerLoadHi: UInt = 0u,
    public var nsecStable: ULong = 0uL,
    // volatile
    public var timerLoadMax: ULong = 0uL,
    public var timerProgTime: UInt = 0u,
    public var spare: UIntArray = UIntArray(7),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QtimeEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QtimeEntry> {
                override val sizeBytes: Long = 120L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): QtimeEntry =
                    QtimeEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (Clockadjust.typeLayout()).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (7).toInt())
                        ).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: QtimeEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.cyclesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.nsecTodAdjust)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.nsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.nsecInc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.bootTime)
                    (Clockadjust.typeLayout()).writeNative(addr + 32L, value.adjust)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.timerRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.timerScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.timerLoad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.intr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.epoch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.rrIntervalMul)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.timerLoadHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.nsecStable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.timerLoadMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.timerProgTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (7).toInt())
                    ).writeNative(addr + 92L, value.spare)
                }
            }
    }
}

public data class SchedInfo(
    public var priorityMin: CInt = 0,
    public var priorityMax: CInt = 0,
    public var interval: ULong = 0uL,
    public var priorityPriv: CInt = 0,
    public var reserved: IntArray = IntArray(11),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedInfo) return false
        if (this.priorityMin != other.priorityMin) return false
        if (this.priorityMax != other.priorityMax) return false
        if (this.interval != other.interval) return false
        if (this.priorityPriv != other.priorityPriv) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priorityMin.hashCode()
        result = 31 * result + this.priorityMax.hashCode()
        result = 31 * result + this.interval.hashCode()
        result = 31 * result + this.priorityPriv.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class TimerInfo(
    public var itime: Itimer = Itimer(),
    public var otime: Itimer = Itimer(),
    public var flags: UInt = 0u,
    public var tid: Int = 0,
    public var notify: Int = 0,
    public var clockid: ClockidT = 0,
    public var overruns: UInt = 0u,
    public var event: Sigevent = Sigevent(),
)

public data class Clockperiod(
    public var nsec: UInt = 0u,
    public var fract: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clockperiod> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clockperiod> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Clockperiod =
                    Clockperiod(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Clockperiod) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fract)
                }
            }
    }
}

public class SyspageEntry(
    public var size: UShort = 0u,
    public var totalSize: UShort = 0u,
    public var type: UShort = 0u,
    public var numCpu: UShort = 0u,
    public var systemPrivate: SyspageEntryInfo = SyspageEntryInfo(),
    public var oldAsinfo: SyspageEntryInfo = SyspageEntryInfo(),
    public var mangleNameToCauseCompilationErrsMeminfo: SyspageEntryInfo = SyspageEntryInfo(),
    public var hwinfo: SyspageEntryInfo = SyspageEntryInfo(),
    public var oldCpuinfo: SyspageEntryInfo = SyspageEntryInfo(),
    public var oldCacheattr: SyspageEntryInfo = SyspageEntryInfo(),
    public var qtime: SyspageEntryInfo = SyspageEntryInfo(),
    public var callout: SyspageEntryInfo = SyspageEntryInfo(),
    public var callin: SyspageEntryInfo = SyspageEntryInfo(),
    public var typedStrings: SyspageEntryInfo = SyspageEntryInfo(),
    public var strings: SyspageEntryInfo = SyspageEntryInfo(),
    public var oldIntrinfo: SyspageEntryInfo = SyspageEntryInfo(),
    public var smp: SyspageEntryInfo = SyspageEntryInfo(),
    public var pminfo: SyspageEntryInfo = SyspageEntryInfo(),
    public var oldMdriver: SyspageEntryInfo = SyspageEntryInfo(),
    public var spare0: UIntArray = UIntArray(1),
    public var reserved: UByteArray = UByteArray(160),
    // anonymous union with architecture dependent structs
    public var newAsinfo: SyspageArrayInfo = SyspageArrayInfo(),
    public var newCpuinfo: SyspageArrayInfo = SyspageArrayInfo(),
    public var newCacheattr: SyspageArrayInfo = SyspageArrayInfo(),
    public var newIntrinfo: SyspageArrayInfo = SyspageArrayInfo(),
    public var newMdriver: SyspageArrayInfo = SyspageArrayInfo(),
)

public val SYSMGR_PID: UInt = 1u

public val SYSMGR_CHID: UInt = 1u

public val NTO_SIDE_CHANNEL: UInt = 1073741824u

public val SYSMGR_COID: UInt = NTO_SIDE_CHANNEL

public val SYSMGR_HANDLE: UInt = 0u

public val STATE_DEAD: CInt = 0x00

public val STATE_RUNNING: CInt = 0x01

public val STATE_READY: CInt = 0x02

public val STATE_STOPPED: CInt = 0x03

public val STATE_SEND: CInt = 0x04

public val STATE_RECEIVE: CInt = 0x05

public val STATE_REPLY: CInt = 0x06

public val STATE_STACK: CInt = 0x07

public val STATE_WAITTHREAD: CInt = 0x08

public val STATE_WAITPAGE: CInt = 0x09

public val STATE_SIGSUSPEND: CInt = 0x0a

public val STATE_SIGWAITINFO: CInt = 0x0b

public val STATE_NANOSLEEP: CInt = 0x0c

public val STATE_MUTEX: CInt = 0x0d

public val STATE_CONDVAR: CInt = 0x0e

public val STATE_JOIN: CInt = 0x0f

public val STATE_INTR: CInt = 0x10

public val STATE_SEM: CInt = 0x11

public val STATE_WAITCTX: CInt = 0x12

public val STATE_NET_SEND: CInt = 0x13

public val STATE_NET_REPLY: CInt = 0x14

public val STATE_MAX: CInt = 0x18

public val NTO_TIMEOUT_RECEIVE: Int = 1 shl STATE_RECEIVE

public val NTO_TIMEOUT_SEND: Int = 1 shl STATE_SEND

public val NTO_TIMEOUT_REPLY: Int = 1 shl STATE_REPLY

public val NTO_TIMEOUT_SIGSUSPEND: Int = 1 shl STATE_SIGSUSPEND

public val NTO_TIMEOUT_SIGWAITINFO: Int = 1 shl STATE_SIGWAITINFO

public val NTO_TIMEOUT_NANOSLEEP: Int = 1 shl STATE_NANOSLEEP

public val NTO_TIMEOUT_MUTEX: Int = 1 shl STATE_MUTEX

public val NTO_TIMEOUT_CONDVAR: Int = 1 shl STATE_CONDVAR

public val NTO_TIMEOUT_JOIN: Int = 1 shl STATE_JOIN

public val NTO_TIMEOUT_INTR: Int = 1 shl STATE_INTR

public val NTO_TIMEOUT_SEM: Int = 1 shl STATE_SEM

public val NTO_MI_ENDIAN_BIG: UInt = 1u

public val NTO_MI_ENDIAN_DIFF: UInt = 2u

public val NTO_MI_UNBLOCK_REQ: UInt = 256u

public val NTO_MI_NET_CRED_DIRTY: UInt = 512u

public val NTO_MI_CONSTRAINED: UInt = 1024u

public val NTO_MI_CHROOT: UInt = 2048u

public val NTO_MI_BITS_64: UInt = 4096u

public val NTO_MI_BITS_DIFF: UInt = 8192u

public val NTO_MI_SANDBOX: UInt = 16384u

public val NTO_CI_ENDIAN_BIG: UInt = 1u

public val NTO_CI_BKGND_PGRP: UInt = 4u

public val NTO_CI_ORPHAN_PGRP: UInt = 8u

public val NTO_CI_STOPPED: UInt = 128u

public val NTO_CI_UNABLE: UInt = 256u

public val NTO_CI_TYPE_ID: UInt = 512u

public val NTO_CI_CHROOT: UInt = 2048u

public val NTO_CI_BITS_64: UInt = 4096u

public val NTO_CI_SANDBOX: UInt = 16384u

public val NTO_CI_LOADER: UInt = 32768u

public val NTO_CI_FULL_GROUPS: UInt = 2147483648u

public val NTO_TI_ACTIVE: UInt = 1u

public val NTO_TI_ABSOLUTE: UInt = 2u

public val NTO_TI_EXPIRED: UInt = 4u

public val NTO_TI_TOD_BASED: UInt = 8u

public val NTO_TI_TARGET_PROCESS: UInt = 16u

public val NTO_TI_REPORT_TOLERANCE: UInt = 32u

public val NTO_TI_PRECISE: UInt = 64u

public val NTO_TI_TOLERANT: UInt = 128u

public val NTO_TI_WAKEUP: UInt = 256u

public val NTO_TI_PROCESS_TOLERANT: UInt = 512u

public val NTO_TI_HIGH_RESOLUTION: UInt = 1024u

public val PULSE_TYPE: UInt = 0u

public val PULSE_SUBTYPE: UInt = 0u

public val PULSE_CODE_UNBLOCK: Int = -32

public val PULSE_CODE_DISCONNECT: Int = -33

public val PULSE_CODE_THREADDEATH: Int = -34

public val PULSE_CODE_COIDDEATH: Int = -35

public val PULSE_CODE_NET_ACK: Int = -36

public val PULSE_CODE_NET_UNBLOCK: Int = -37

public val PULSE_CODE_NET_DETACH: Int = -38

public val PULSE_CODE_RESTART: Int = -39

public val PULSE_CODE_NORESTART: Int = -40

public val PULSE_CODE_UNBLOCK_RESTART: Int = -41

public val PULSE_CODE_UNBLOCK_TIMER: Int = -42

public val PULSE_CODE_MINAVAIL: UInt = 0u

public val PULSE_CODE_MAXAVAIL: UInt = 127u

public val NTO_HARD_FLAGS_END: UInt = 1u

public val NTO_PULSE_IF_UNIQUE: UInt = 4096u

public val NTO_PULSE_REPLACE: UInt = 8192u

public val NTO_PF_NOCLDSTOP: UInt = 1u

public val NTO_PF_LOADING: UInt = 2u

public val NTO_PF_TERMING: UInt = 4u

public val NTO_PF_ZOMBIE: UInt = 8u

public val NTO_PF_NOZOMBIE: UInt = 16u

public val NTO_PF_FORKED: UInt = 32u

public val NTO_PF_ORPHAN_PGRP: UInt = 64u

public val NTO_PF_STOPPED: UInt = 128u

public val NTO_PF_DEBUG_STOPPED: UInt = 256u

public val NTO_PF_BKGND_PGRP: UInt = 512u

public val NTO_PF_NOISYNC: UInt = 1024u

public val NTO_PF_CONTINUED: UInt = 2048u

public val NTO_PF_CHECK_INTR: UInt = 4096u

public val NTO_PF_COREDUMP: UInt = 8192u

public val NTO_PF_RING0: UInt = 32768u

public val NTO_PF_SLEADER: UInt = 65536u

public val NTO_PF_WAITINFO: UInt = 131072u

public val NTO_PF_DESTROYALL: UInt = 524288u

public val NTO_PF_NOCOREDUMP: UInt = 1048576u

public val NTO_PF_WAITDONE: UInt = 4194304u

public val NTO_PF_TERM_WAITING: UInt = 8388608u

public val NTO_PF_ASLR: UInt = 16777216u

public val NTO_PF_EXECED: UInt = 33554432u

public val NTO_PF_APP_STOPPED: UInt = 67108864u

public val NTO_PF_64BIT: UInt = 134217728u

public val NTO_PF_NET: UInt = 268435456u

public val NTO_PF_NOLAZYSTACK: UInt = 536870912u

public val NTO_PF_NOEXEC_STACK: UInt = 1073741824u

public val NTO_PF_LOADER_PERMS: UInt = 2147483648u

public val NTO_TF_INTR_PENDING: UInt = 65536u

public val NTO_TF_DETACHED: UInt = 131072u

public val NTO_TF_SHR_MUTEX: UInt = 262144u

public val NTO_TF_SHR_MUTEX_EUID: UInt = 524288u

public val NTO_TF_THREADS_HOLD: UInt = 1048576u

public val NTO_TF_UNBLOCK_REQ: UInt = 4194304u

public val NTO_TF_ALIGN_FAULT: UInt = 16777216u

public val NTO_TF_SSTEP: UInt = 33554432u

public val NTO_TF_ALLOCED_STACK: UInt = 67108864u

public val NTO_TF_NOMULTISIG: UInt = 134217728u

public val NTO_TF_LOW_LATENCY: UInt = 268435456u

public val NTO_TF_IOPRIV: UInt = 2147483648u

public val NTO_TCTL_IO_PRIV: UInt = 1u

public val NTO_TCTL_THREADS_HOLD: UInt = 2u

public val NTO_TCTL_THREADS_CONT: UInt = 3u

public val NTO_TCTL_RUNMASK: UInt = 4u

public val NTO_TCTL_ALIGN_FAULT: UInt = 5u

public val NTO_TCTL_RUNMASK_GET_AND_SET: UInt = 6u

public val NTO_TCTL_PERFCOUNT: UInt = 7u

public val NTO_TCTL_ONE_THREAD_HOLD: UInt = 8u

public val NTO_TCTL_ONE_THREAD_CONT: UInt = 9u

public val NTO_TCTL_RUNMASK_GET_AND_SET_INHERIT: UInt = 10u

public val NTO_TCTL_NAME: UInt = 11u

public val NTO_TCTL_RCM_GET_AND_SET: UInt = 12u

public val NTO_TCTL_SHR_MUTEX: UInt = 13u

public val NTO_TCTL_IO: UInt = 14u

public val NTO_TCTL_NET_KIF_GET_AND_SET: UInt = 15u

public val NTO_TCTL_LOW_LATENCY: UInt = 16u

public val NTO_TCTL_ADD_EXIT_EVENT: UInt = 17u

public val NTO_TCTL_DEL_EXIT_EVENT: UInt = 18u

public val NTO_TCTL_IO_LEVEL: UInt = 19u

public val NTO_TCTL_RESERVED: UInt = 2147483648u

public val NTO_TCTL_IO_LEVEL_INHERIT: UInt = 1073741824u

public val NTO_IO_LEVEL_NONE: UInt = 1u

public val NTO_IO_LEVEL_1: UInt = 2u

public val NTO_IO_LEVEL_2: UInt = 3u

public val NTO_THREAD_NAME_MAX: UInt = 100u

public val NTO_CHF_FIXED_PRIORITY: UInt = 1u

public val NTO_CHF_UNBLOCK: UInt = 2u

public val NTO_CHF_THREAD_DEATH: UInt = 4u

public val NTO_CHF_DISCONNECT: UInt = 8u

public val NTO_CHF_NET_MSG: UInt = 16u

public val NTO_CHF_SENDER_LEN: UInt = 32u

public val NTO_CHF_COID_DISCONNECT: UInt = 64u

public val NTO_CHF_REPLY_LEN: UInt = 128u

public val NTO_CHF_PULSE_POOL: UInt = 256u

public val NTO_CHF_ASYNC_NONBLOCK: UInt = 512u

public val NTO_CHF_ASYNC: UInt = 1024u

public val NTO_CHF_GLOBAL: UInt = 2048u

public val NTO_CHF_PRIVATE: UInt = 4096u

public val NTO_CHF_MSG_PAUSING: UInt = 8192u

public val NTO_CHF_INHERIT_RUNMASK: UInt = 16384u

public val NTO_CHF_UNBLOCK_TIMER: UInt = 32768u

public val NTO_CHO_CUSTOM_EVENT: UInt = 1u

public val NTO_COF_CLOEXEC: UInt = 1u

public val NTO_COF_DEAD: UInt = 2u

public val NTO_COF_NOSHARE: UInt = 64u

public val NTO_COF_NETCON: UInt = 128u

public val NTO_COF_NONBLOCK: UInt = 256u

public val NTO_COF_ASYNC: UInt = 512u

public val NTO_COF_GLOBAL: UInt = 1024u

public val NTO_COF_NOEVENT: UInt = 2048u

public val NTO_COF_INSECURE: UInt = 4096u

public val NTO_COF_REG_EVENTS: UInt = 8192u

public val NTO_COF_UNREG_EVENTS: UInt = 16384u

public val NTO_COF_MASK: UInt = 65535u

public val NTO_CONNECTION_SCOID: UInt = 65536u

public val NTO_GLOBAL_CHANNEL: UInt = 1073741824u

public val NTO_TIMEOUT_MASK: UInt = (1u shl STATE_MAX) - 1u

public val NTO_TIMEOUT_ACTIVE: UInt = 1u shl STATE_MAX

public val NTO_TIMEOUT_IMMEDIATE: UInt = 1u shl (STATE_MAX + 1)

public val NTO_IC_LATENCY: UInt = 0u

public val NTO_INTR_FLAGS_END: UInt = 1u

public val NTO_INTR_FLAGS_NO_UNMASK: UInt = 2u

public val NTO_INTR_FLAGS_PROCESS: UInt = 4u

public val NTO_INTR_FLAGS_TRK_MSK: UInt = 8u

public val NTO_INTR_FLAGS_ARRAY: UInt = 16u

public val NTO_INTR_FLAGS_EXCLUSIVE: UInt = 32u

public val NTO_INTR_FLAGS_FPU: UInt = 64u

public val NTO_INTR_CLASS_EXTERNAL: UInt = 0u

public val NTO_INTR_CLASS_SYNTHETIC: UInt = 2147418112u

public val NTO_INTR_SPARE: UInt = 2147483647u

public val NTO_HOOK_IDLE: UInt = 2147418113u

public val NTO_HOOK_OVERDRIVE: UInt = 2147418114u

public val NTO_HOOK_LAST: UInt = 2147418114u

public val NTO_HOOK_IDLE2_FLAG: UInt = 32768u

public val NTO_IH_CMD_SLEEP_SETUP: UInt = 1u

public val NTO_IH_CMD_SLEEP_BLOCK: UInt = 2u

public val NTO_IH_CMD_SLEEP_WAKEUP: UInt = 4u

public val NTO_IH_CMD_SLEEP_ONLINE: UInt = 8u

public val NTO_IH_RESP_NEEDS_BLOCK: UInt = 1u

public val NTO_IH_RESP_NEEDS_WAKEUP: UInt = 2u

public val NTO_IH_RESP_NEEDS_ONLINE: UInt = 4u

public val NTO_IH_RESP_SYNC_TIME: UInt = 16u

public val NTO_IH_RESP_SYNC_TLB: UInt = 32u

public val NTO_IH_RESP_SUGGEST_OFFLINE: UInt = 256u

public val NTO_IH_RESP_SLEEP_MODE_REACHED: UInt = 512u

public val NTO_IH_RESP_DELIVER_INTRS: UInt = 1024u

public val NTO_READIOV_SEND: UInt = 0u

public val NTO_READIOV_REPLY: UInt = 1u

public val NTO_KEYDATA_VTID: UInt = 2147483648u

public val NTO_KEYDATA_PATHSIGN: UInt = 32768u

public val NTO_KEYDATA_OP_MASK: UInt = 255u

public val NTO_KEYDATA_VERIFY: UInt = 0u

public val NTO_KEYDATA_CALCULATE: UInt = 1u

public val NTO_KEYDATA_CALCULATE_REUSE: UInt = 2u

public val NTO_KEYDATA_PATHSIGN_VERIFY: UInt = 32768u

public val NTO_KEYDATA_PATHSIGN_CALCULATE: UInt = 32769u

public val NTO_KEYDATA_PATHSIGN_CALCULATE_REUSE: UInt = 32770u

public val NTO_SCTL_SETPRIOCEILING: UInt = 1u

public val NTO_SCTL_GETPRIOCEILING: UInt = 2u

public val NTO_SCTL_SETEVENT: UInt = 3u

public val NTO_SCTL_MUTEX_WAKEUP: UInt = 4u

public val NTO_SCTL_MUTEX_CONSISTENT: UInt = 5u

public val NTO_SCTL_SEM_VALUE: UInt = 6u

public val NTO_CLIENTINFO_GETGROUPS: UInt = 1u

public val NTO_CLIENTINFO_GETTYPEID: UInt = 2u

public expect fun channelCreate(flags: CUint): CInt

public expect fun channelCreateR(flags: CUint): CInt

public expect fun channelCreatePulsePool(flags: CUint, config: ConstPtr<NtoChannelConfig>): CInt

public expect fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: ConstPtr<Sigevent>, cred: MutPtr<CredInfo>): CInt

public expect fun channelDestroy(chid: CInt): CInt

public expect fun channelDestroyR(chid: CInt): CInt

public expect fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt

public expect fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt

// Note: The following function uses a structure defined in a header file
// which doesn't appear as part of the default headers found in a
// standard installation of Neutrino 7.1 SDP.  Commented out for now.
// pub fn ConnectAttachExt(
// __nd: u32,
// __pid: pidT,
// __chid: cInt,
// __index: cUint,
// __flags: cInt,
// __cd: *mut _asyncmsg_connection_descriptor,
// ) -> cInt;
public expect fun connectDetach(coid: CInt): CInt

public expect fun connectDetachR(coid: CInt): CInt

public expect fun connectServerInfo(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt

public expect fun connectServerInfoR(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt

public expect fun connectClientInfoExtraArgs(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt

public expect fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt

public expect fun connectClientInfo(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt

public expect fun connectClientInfoR(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt

public expect fun connectClientInfoExt(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt): CInt

public expect fun clientInfoExtFree(infoPp: MutPtr<MutPtr<ClientInfo>>): CInt

public expect fun connectClientInfoAble(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt, abilities: MutPtr<ClientAble>, nable: CInt): CInt

public expect fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt

public expect fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt

public expect fun channelConnectAttr(id: CUint, oldAttr: MutPtr<ChannelConnectAttr>, newAttr: MutPtr<ChannelConnectAttr>, flags: CUint): CInt

public expect fun msgSend(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong

public expect fun msgSendR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong

public expect fun msgSendnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong

public expect fun msgSendncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong

public expect fun msgSendsv(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong

public expect fun msgSendsvR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong

public expect fun msgSendsvnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong

public expect fun msgSendsvncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong

public expect fun msgSendvs(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong

public expect fun msgSendvsR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong

public expect fun msgSendvsnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong

public expect fun msgSendvsncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong

public expect fun msgSendv(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong

public expect fun msgSendvR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong

public expect fun msgSendvnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong

public expect fun msgSendvncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong

public expect fun msgReceive(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt

public expect fun msgReceiveR(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt

public expect fun msgReceivev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt

public expect fun msgReceivevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt

public expect fun msgReceivePulse(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt

public expect fun msgReceivePulseR(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt

public expect fun msgReceivePulsev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt

public expect fun msgReceivePulsevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt

public expect fun msgReply(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt

public expect fun msgReplyR(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt

public expect fun msgReplyv(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt

public expect fun msgReplyvR(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt

public expect fun msgReadiov(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long

public expect fun msgReadiovR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long

public expect fun msgRead(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long

public expect fun msgReadR(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long

public expect fun msgReadv(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long

public expect fun msgReadvR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long

public expect fun msgWrite(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long

public expect fun msgWriteR(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long

public expect fun msgWritev(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long

public expect fun msgWritevR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long

public expect fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt

public expect fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt

public expect fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt

public expect fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt

public expect fun msgDeliverEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt

public expect fun msgDeliverEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt

public expect fun msgVerifyEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt

public expect fun msgVerifyEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt

public expect fun msgRegisterEvent(event: MutPtr<Sigevent>, coid: CInt): CInt

public expect fun msgRegisterEventR(event: MutPtr<Sigevent>, coid: CInt): CInt

public expect fun msgUnregisterEvent(event: ConstPtr<Sigevent>): CInt

public expect fun msgUnregisterEventR(event: ConstPtr<Sigevent>): CInt

public expect fun msgInfo(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt

public expect fun msgInfoR(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt

public expect fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt

public expect fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt

public expect fun msgError(rcvid: CInt, err: CInt): CInt

public expect fun msgErrorR(rcvid: CInt, err: CInt): CInt

public expect fun msgCurrent(rcvid: CInt): CInt

public expect fun msgCurrentR(rcvid: CInt): CInt

public expect fun msgSendAsyncGbl(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, msgPrio: CUint): CInt

public expect fun msgSendAsync(coid: CInt): CInt

public expect fun msgReceiveAsyncGbl(chid: CInt, rmsg: MutPtr<CVoid>, rbytes: ULong, info: MutPtr<MsgInfo64>, coid: CInt): CInt

public expect fun msgReceiveAsync(chid: CInt, iov: ConstPtr<Iovec>, parts: CUint): CInt

public expect fun msgPause(rcvid: CInt, cookie: CUint): CInt

public expect fun msgPauseR(rcvid: CInt, cookie: CUint): CInt

public expect fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt

public expect fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt

public expect fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt

public expect fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt

public expect fun signalReturn(info: MutPtr<SighandlerInfo>): CInt

public expect fun signalFault(sigcode: CUint, regs: MutPtr<CVoid>, refaddr: ULong): CInt

public expect fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt

public expect fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt

public expect fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun signalSuspend(set: ConstPtr<SigsetT>): CInt

public expect fun signalSuspendR(set: ConstPtr<SigsetT>): CInt

public expect fun signalWaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun signalWaitinfoR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun signalWaitinfoMask(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt

public expect fun signalWaitinfoMaskR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt

public expect fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt

public expect fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt

public expect fun threadDestroy(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt

public expect fun threadDestroyR(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt

public expect fun threadDetach(tid: CInt): CInt

public expect fun threadDetachR(tid: CInt): CInt

public expect fun threadJoin(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt

public expect fun threadJoinR(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt

public expect fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt

public expect fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt

public expect fun threadCtl(cmd: CInt, data: MutPtr<CVoid>): CInt

public expect fun threadCtlR(cmd: CInt, data: MutPtr<CVoid>): CInt

public expect fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt

public expect fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt

public expect fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt

public expect fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt

public expect fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt

public expect fun interruptHookOverdriveEvent(event: ConstPtr<Sigevent>, flags: CUint): CInt

public expect fun interruptAttachEvent(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt

public expect fun interruptAttachEventR(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt

public expect fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt

public expect fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt

public expect fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt

public expect fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt

public expect fun interruptDetach(id: CInt): CInt

public expect fun interruptDetachR(id: CInt): CInt

public expect fun interruptWait(flags: CInt, timeout: ConstPtr<ULong>): CInt

public expect fun interruptWaitR(flags: CInt, timeout: ConstPtr<ULong>): CInt

public expect fun interruptCharacteristic(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt

public expect fun interruptCharacteristicR(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt

public expect fun schedGet(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt

public expect fun schedGetR(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt

public expect fun schedGetCpuNum(): CUint

public expect fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun schedInfo(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt

public expect fun schedInfoR(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt

public expect fun schedYield(): CInt

public expect fun schedYieldR(): CInt

public expect fun schedCtl(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt

public expect fun schedCtlR(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt

public expect fun schedJobCreate(job: MutPtr<NtoJobT>): CInt

public expect fun schedJobCreateR(job: MutPtr<NtoJobT>): CInt

public expect fun schedJobDestroy(job: MutPtr<NtoJobT>): CInt

public expect fun schedJobDestroyR(job: MutPtr<NtoJobT>): CInt

public expect fun schedWaypoint(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt

public expect fun schedWaypointR(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt

public expect fun timerCreate(id: ClockidT, notify: ConstPtr<Sigevent>): CInt

public expect fun timerCreateR(id: ClockidT, notify: ConstPtr<Sigevent>): CInt

public expect fun timerDestroy(id: TimerT): CInt

public expect fun timerDestroyR(id: TimerT): CInt

public expect fun timerSettime(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt

public expect fun timerSettimeR(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt

public expect fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt

public expect fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt

public expect fun timerAlarm(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt

public expect fun timerAlarmR(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt

public expect fun timerTimeout(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt

public expect fun timerTimeoutR(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt

public expect fun syncTypeCreate(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt

public expect fun syncTypeCreateR(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt

public expect fun syncDestroy(sync: MutPtr<SyncT>): CInt

public expect fun syncDestroyR(sync: MutPtr<SyncT>): CInt

public expect fun syncCtl(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt

public expect fun syncCtlR(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt

public expect fun syncMutexEvent(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt

public expect fun syncMutexEventR(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt

public expect fun syncMutexLock(sync: MutPtr<SyncT>): CInt

public expect fun syncMutexLockR(sync: MutPtr<SyncT>): CInt

public expect fun syncMutexUnlock(sync: MutPtr<SyncT>): CInt

public expect fun syncMutexUnlockR(sync: MutPtr<SyncT>): CInt

public expect fun syncMutexRevive(sync: MutPtr<SyncT>): CInt

public expect fun syncMutexReviveR(sync: MutPtr<SyncT>): CInt

public expect fun syncCondvarWait(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt

public expect fun syncCondvarWaitR(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt

public expect fun syncCondvarSignal(sync: MutPtr<SyncT>, all: CInt): CInt

public expect fun syncCondvarSignalR(sync: MutPtr<SyncT>, all: CInt): CInt

public expect fun syncSemPost(sync: MutPtr<SyncT>): CInt

public expect fun syncSemPostR(sync: MutPtr<SyncT>): CInt

public expect fun syncSemWait(sync: MutPtr<SyncT>, tryto: CInt): CInt

public expect fun syncSemWaitR(sync: MutPtr<SyncT>, tryto: CInt): CInt

public expect fun clockTime(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt

public expect fun clockTimeR(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt

public expect fun clockAdjust(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt

public expect fun clockAdjustR(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt

public expect fun clockPeriod(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt

public expect fun clockPeriodR(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt

public expect fun clockId(pid: PidT, tid: CInt): CInt

public expect fun clockIdR(pid: PidT, tid: CInt): CInt

//
// Note: The following commented out functions are implemented in assembly.
// We can implmement them either via a C Note or rust's inline assembly.
//
// pub fn InterruptEnable();
// pub fn InterruptDisable();
public expect fun interruptMask(intr: CInt, id: CInt): CInt

public expect fun interruptUnmask(intr: CInt, id: CInt): CInt
