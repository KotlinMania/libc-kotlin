// port-lint: source unix/nto/neutrino.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT

public fun interface SighandlerInfoHandlerCallback {
    public operator fun invoke(value: CInt)
}

public fun interface SignalActionSigstubCallback {
    public operator fun invoke()
}

public fun interface ThreadCreateFuncCallback {
    public operator fun invoke(arg: COpaquePointer?): COpaquePointer?
}

public fun interface InterruptHookTraceHandlerCallback {
    public operator fun invoke(arg1: CInt): COpaquePointer?
}

public fun interface InterruptHookIdleHandlerCallback {
    public operator fun invoke(arg1: COpaquePointer?, arg2: COpaquePointer?)
}

public fun interface InterruptHookIdle2HandlerCallback {
    public operator fun invoke(arg1: CUint, arg2: COpaquePointer?, arg3: COpaquePointer?)
}

public fun interface InterruptAttachHandlerCallback {
    public operator fun invoke(area: COpaquePointer?, id: CInt): COpaquePointer?
}

public typealias NtoJobT = SyncT

public data class SyspageEntryInfo(public var entryOff: UShort = 0u, public var entrySize: UShort = 0u)

public data class SyspageArrayInfo(
    public var entryOff: UShort = 0u,
    public var entrySize: UShort = 0u,
    public var elementSize: UShort = 0u,
)

public data class Intrspin(public var value: CUint = 0u)

public data class IovT(
    public var iovBase: COpaquePointer? = null,
    // union
    public var iovLen: SizeT = 0uL,
)

public data class Itimer(public var nsec: ULong = 0uL, public var intervalNsec: ULong = 0uL)

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
)

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
// pub iov: *mut crate::iovT,
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
// pub triggerTime: crate::_itimer,
// reserve: Padding<cUint>,
// }
// pub struct _asyncmsg_connection_descriptor {
// pub flags: cUint,
// pub sendqSize: cUint,
// pub sendqHead: cUint,
// pub sendqTail: cUint,
// pub sendqFree: cUint,
// pub err: cInt,
// pub ev: crate::sigevent,
// pub numCurmsg: cUint,
// pub ttimer: crate::timerT,
// pub blockCon: crate::pthreadCondT,
// pub mu: crate::pthreadMutexT,
// reserved: Padding<cUint>,
// pub attr: crate::_asyncmsg_connection_attr,
// reserves: Padding<[cUint; 3]>,
// pub sendq: [crate::_asyncmsg_put_header; 1], // flexarray
// }
public data class CAnonymousStructEv(public var event: Sigevent = Sigevent(), public var coid: CInt = 0)

public data class ChannelConnectAttr(
    // union
    public var ev: CAnonymousStructEv = CAnonymousStructEv(),
)

public data class SighandlerInfo(
    public var siginfo: SiginfoT = SiginfoT(),
    public var handler: SighandlerInfoHandlerCallback? = null,
    public var context: COpaquePointer? = null,
)

public data class CAnonymousStructTime(public var length: CUint = 0u, public var scale: CUint = 0u)

public data class IdleHook(
    public var hookSize: CUint = 0u,
    public var cmd: CUint = 0u,
    public var mode: CUint = 0u,
    public var latency: CUint = 0u,
    public var nextFire: ULong = 0uL,
    public var currTime: ULong = 0uL,
    public var todAdjust: ULong = 0uL,
    public var resp: CUint = 0u,
    public var time: CAnonymousStructTime = CAnonymousStructTime(),
    public var trigger: Sigevent = Sigevent(),
    public var intrs: CUint? = null,
    public var blockStackSize: CUint = 0u,
)

public data class Clockadjust(public var tickCount: UInt = 0u, public var tickNsecInc: Int = 0)

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
)

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

public data class Clockperiod(public var nsec: UInt = 0u, public var fract: Int = 0)

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

public expect fun channelCreatePulsePool(flags: CUint, config: COpaquePointer?): CInt

public expect fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: COpaquePointer?, cred: COpaquePointer?): CInt

public expect fun channelDestroy(chid: CInt): CInt

public expect fun channelDestroyR(chid: CInt): CInt

public expect fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt

public expect fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt

// Note: The following function uses a structure defined in a header file
// which doesn't appear as part of the default headers found in a
// standard installation of Neutrino 7.1 SDP.  Commented out for now.
// pub fn ConnectAttachExt(
// __nd: u32,
// __pid: crate::pidT,
// __chid: cInt,
// __index: cUint,
// __flags: cInt,
// __cd: *mut _asyncmsg_connection_descriptor,
// ) -> cInt;
public expect fun connectDetach(coid: CInt): CInt

public expect fun connectDetachR(coid: CInt): CInt

public expect fun connectServerInfo(pid: PidT, coid: CInt, info: COpaquePointer?): CInt

public expect fun connectServerInfoR(pid: PidT, coid: CInt, info: COpaquePointer?): CInt

public expect fun connectClientInfoExtraArgs(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt

public expect fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt

public expect fun connectClientInfo(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt

public expect fun connectClientInfoR(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt

public expect fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt

public expect fun clientInfoExtFree(infoPp: COpaquePointer?): CInt

public expect fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: COpaquePointer?, nable: CInt): CInt

public expect fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt

public expect fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt

public expect fun channelConnectAttr(id: CUint, oldAttr: COpaquePointer?, newAttr: COpaquePointer?, flags: CUint): CInt

public expect fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong

public expect fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong

public expect fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong

public expect fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong

public expect fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong

public expect fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong

public expect fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong

public expect fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong

public expect fun msgSendvs(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong

public expect fun msgSendvsR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong

public expect fun msgSendvsnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong

public expect fun msgSendvsncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong

public expect fun msgSendv(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong

public expect fun msgSendvR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong

public expect fun msgSendvnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong

public expect fun msgSendvncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong

public expect fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt

public expect fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt

public expect fun msgReceivev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt

public expect fun msgReceivevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt

public expect fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt

public expect fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt

public expect fun msgReceivePulsev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt

public expect fun msgReceivePulsevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt

public expect fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt

public expect fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt

public expect fun msgReplyv(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt

public expect fun msgReplyvR(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt

public expect fun msgReadiov(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long

public expect fun msgReadiovR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long

public expect fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long

public expect fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long

public expect fun msgReadv(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long

public expect fun msgReadvR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long

public expect fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long

public expect fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long

public expect fun msgWritev(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long

public expect fun msgWritevR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long

public expect fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt

public expect fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt

public expect fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt

public expect fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt

public expect fun msgDeliverEvent(rcvid: CInt, event: COpaquePointer?): CInt

public expect fun msgDeliverEventR(rcvid: CInt, event: COpaquePointer?): CInt

public expect fun msgVerifyEvent(rcvid: CInt, event: COpaquePointer?): CInt

public expect fun msgVerifyEventR(rcvid: CInt, event: COpaquePointer?): CInt

public expect fun msgRegisterEvent(event: COpaquePointer?, coid: CInt): CInt

public expect fun msgRegisterEventR(event: COpaquePointer?, coid: CInt): CInt

public expect fun msgUnregisterEvent(event: COpaquePointer?): CInt

public expect fun msgUnregisterEventR(event: COpaquePointer?): CInt

public expect fun msgInfo(rcvid: CInt, info: COpaquePointer?): CInt

public expect fun msgInfoR(rcvid: CInt, info: COpaquePointer?): CInt

public expect fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt

public expect fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt

public expect fun msgError(rcvid: CInt, err: CInt): CInt

public expect fun msgErrorR(rcvid: CInt, err: CInt): CInt

public expect fun msgCurrent(rcvid: CInt): CInt

public expect fun msgCurrentR(rcvid: CInt): CInt

public expect fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUint): CInt

public expect fun msgSendAsync(coid: CInt): CInt

public expect fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: COpaquePointer?, coid: CInt): CInt

public expect fun msgReceiveAsync(chid: CInt, iov: COpaquePointer?, parts: CUint): CInt

public expect fun msgPause(rcvid: CInt, cookie: CUint): CInt

public expect fun msgPauseR(rcvid: CInt, cookie: CUint): CInt

public expect fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt

public expect fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt

public expect fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt

public expect fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt

public expect fun signalReturn(info: COpaquePointer?): CInt

public expect fun signalFault(sigcode: CUint, regs: COpaquePointer?, refaddr: ULong): CInt

public expect fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt

public expect fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt

public expect fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun signalSuspend(set: COpaquePointer?): CInt

public expect fun signalSuspendR(set: COpaquePointer?): CInt

public expect fun signalWaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun signalWaitinfoR(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun signalWaitinfoMask(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt

public expect fun signalWaitinfoMaskR(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt

public expect fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt

public expect fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt

public expect fun threadDetach(tid: CInt): CInt

public expect fun threadDetachR(tid: CInt): CInt

public expect fun threadJoin(tid: CInt, status: COpaquePointer?): CInt

public expect fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt

public expect fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt

public expect fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt

public expect fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt

public expect fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt

public expect fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt

public expect fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt

public expect fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt

public expect fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt

public expect fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt

public expect fun interruptHookOverdriveEvent(event: COpaquePointer?, flags: CUint): CInt

public expect fun interruptAttachEvent(intr: CInt, event: COpaquePointer?, flags: CUint): CInt

public expect fun interruptAttachEventR(intr: CInt, event: COpaquePointer?, flags: CUint): CInt

public expect fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt

public expect fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt

public expect fun interruptAttachArray(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt

public expect fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt

public expect fun interruptDetach(id: CInt): CInt

public expect fun interruptDetachR(id: CInt): CInt

public expect fun interruptWait(flags: CInt, timeout: COpaquePointer?): CInt

public expect fun interruptWaitR(flags: CInt, timeout: COpaquePointer?): CInt

public expect fun interruptCharacteristic(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt

public expect fun interruptCharacteristicR(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt

public expect fun schedGet(pid: PidT, tid: CInt, param: COpaquePointer?): CInt

public expect fun schedGetR(pid: PidT, tid: CInt, param: COpaquePointer?): CInt

public expect fun schedGetCpuNum(): CUint

public expect fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt

public expect fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt

public expect fun schedInfo(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt

public expect fun schedInfoR(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt

public expect fun schedYield(): CInt

public expect fun schedYieldR(): CInt

public expect fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt

public expect fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt

public expect fun schedJobCreate(job: COpaquePointer?): CInt

public expect fun schedJobCreateR(job: COpaquePointer?): CInt

public expect fun schedJobDestroy(job: COpaquePointer?): CInt

public expect fun schedJobDestroyR(job: COpaquePointer?): CInt

public expect fun schedWaypoint(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt

public expect fun schedWaypointR(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt

public expect fun timerCreate(id: ClockidT, notify: COpaquePointer?): CInt

public expect fun timerCreateR(id: ClockidT, notify: COpaquePointer?): CInt

public expect fun timerDestroy(id: TimerT): CInt

public expect fun timerDestroyR(id: TimerT): CInt

public expect fun timerSettime(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt

public expect fun timerSettimeR(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt

public expect fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt

public expect fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt

public expect fun timerAlarm(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt

public expect fun timerAlarmR(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt

public expect fun timerTimeout(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt

public expect fun timerTimeoutR(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt

public expect fun syncTypeCreate(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun syncTypeCreateR(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun syncDestroy(sync: COpaquePointer?): CInt

public expect fun syncDestroyR(sync: COpaquePointer?): CInt

public expect fun syncCtl(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt

public expect fun syncCtlR(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt

public expect fun syncMutexEvent(sync: COpaquePointer?, event: COpaquePointer?): CInt

public expect fun syncMutexEventR(sync: COpaquePointer?, event: COpaquePointer?): CInt

public expect fun syncMutexLock(sync: COpaquePointer?): CInt

public expect fun syncMutexLockR(sync: COpaquePointer?): CInt

public expect fun syncMutexUnlock(sync: COpaquePointer?): CInt

public expect fun syncMutexUnlockR(sync: COpaquePointer?): CInt

public expect fun syncMutexRevive(sync: COpaquePointer?): CInt

public expect fun syncMutexReviveR(sync: COpaquePointer?): CInt

public expect fun syncCondvarWait(sync: COpaquePointer?, mutex: COpaquePointer?): CInt

public expect fun syncCondvarWaitR(sync: COpaquePointer?, mutex: COpaquePointer?): CInt

public expect fun syncCondvarSignal(sync: COpaquePointer?, all: CInt): CInt

public expect fun syncCondvarSignalR(sync: COpaquePointer?, all: CInt): CInt

public expect fun syncSemPost(sync: COpaquePointer?): CInt

public expect fun syncSemPostR(sync: COpaquePointer?): CInt

public expect fun syncSemWait(sync: COpaquePointer?, tryto: CInt): CInt

public expect fun syncSemWaitR(sync: COpaquePointer?, tryto: CInt): CInt

public expect fun clockTime(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt

public expect fun clockTimeR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt

public expect fun clockAdjust(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt

public expect fun clockAdjustR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt

public expect fun clockPeriod(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt

public expect fun clockPeriodR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt

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
