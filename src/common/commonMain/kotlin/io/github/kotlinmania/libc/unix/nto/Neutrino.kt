// port-lint: source unix/nto/neutrino.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
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
    public operator fun invoke(arg1: CInt): Sigevent?
}

public fun interface InterruptHookIdleHandlerCallback {
    public operator fun invoke(arg1: ULong?, arg2: QtimeEntry?)
}

public fun interface InterruptHookIdle2HandlerCallback {
    public operator fun invoke(arg1: CUint, arg2: SyspageEntry?, arg3: IdleHook?)
}

public fun interface InterruptAttachHandlerCallback {
    public operator fun invoke(area: COpaquePointer?, id: CInt): Sigevent?
}

public fun interface InterruptAttachArrayHandlerCallback {
    public operator fun invoke(area: COpaquePointer?, id: CInt): COpaquePointer?
}

public typealias NtoJobT = SyncT

public open class SyspageEntryInfo(public var entryOff: UShort, public var entrySize: UShort)

public open class SyspageArrayInfo(
    public var entryOff: UShort,
    public var entrySize: UShort,
    public var elementSize: UShort,
)

public open class Intrspin(public var value: CUint)

public open class IovT(
    public var iovBase: COpaquePointer?,
    // union
    public var iovLen: SizeT,
)

public open class Itimer(public var nsec: ULong, public var intervalNsec: ULong)

public open class MsgInfo64(
    public var nd: UInt,
    public var srcnd: UInt,
    public var pid: PidT,
    public var tid: Int,
    public var chid: Int,
    public var scoid: Int,
    public var coid: Int,
    public var priority: Short,
    public var flags: Short,
    public var msglen: Int,
    public var srcmsglen: Int,
    public var dstmsglen: Int,
    public var typeId: UInt,
    public var reserved: UInt,
)

public open class CredInfo(
    public var ruid: UidT,
    public var euid: UidT,
    public var suid: UidT,
    public var rgid: GidT,
    public var egid: GidT,
    public var sgid: GidT,
    public var ngroups: UInt,
    public var grouplist: List<GidT>,
)

public open class ClientInfo(
    public var nd: UInt,
    public var pid: PidT,
    public var sid: PidT,
    public var flags: UInt,
    public var cred: CredInfo,
)

public open class ClientAble(
    public var ability: UInt,
    public var flags: UInt,
    public var rangeLo: ULong,
    public var rangeHi: ULong,
)

public open class NtoChannelConfig(
    public var event: Sigevent,
    public var numPulses: CUint,
    public var rearmThreshold: CUint,
    public var options: CUint,
    public var reserved: List<CUint>,
)

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
public open class CAnonymousStructEv(public var event: Sigevent, public var coid: CInt)

public open class ChannelConnectAttr(
    // union
    public var ev: CAnonymousStructEv,
)

public open class SighandlerInfo(
    public var siginfo: SiginfoT,
    public var handler: SighandlerInfoHandlerCallback?,
    public var context: COpaquePointer?,
)

public open class CAnonymousStructTime(public var length: CUint, public var scale: CUint)

public open class IdleHook(
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
    public var intrs: CUint?,
    public var blockStackSize: CUint,
)

public open class Clockadjust(public var tickCount: UInt, public var tickNsecInc: Int)

public open class QtimeEntry(
    public var cyclesPerSec: ULong,
    public var nsecTodAdjust: ULong,
    // volatile
    public var nsec: ULong,
    // volatile
    public var nsecInc: UInt,
    public var bootTime: UInt,
    public var adjust: Clockadjust,
    public var timerRate: UInt,
    public var timerScale: Int,
    public var timerLoad: UInt,
    public var intr: Int,
    public var epoch: UInt,
    public var flags: UInt,
    public var rrIntervalMul: UInt,
    public var timerLoadHi: UInt,
    public var nsecStable: ULong,
    // volatile
    public var timerLoadMax: ULong,
    public var timerProgTime: UInt,
    public var spare: List<UInt>,
)

public open class SchedInfo(
    public var priorityMin: CInt,
    public var priorityMax: CInt,
    public var interval: ULong,
    public var priorityPriv: CInt,
    public var reserved: List<CInt>,
)

public open class TimerInfo(
    public var itime: Itimer,
    public var otime: Itimer,
    public var flags: UInt,
    public var tid: Int,
    public var notify: Int,
    public var clockid: ClockidT,
    public var overruns: UInt,
    public var event: Sigevent,
)

public open class Clockperiod(public var nsec: UInt, public var fract: Int)

public open class SyspageEntry(
    public var size: UShort,
    public var totalSize: UShort,
    public var type: UShort,
    public var numCpu: UShort,
    public var systemPrivate: SyspageEntryInfo,
    public var oldAsinfo: SyspageEntryInfo,
    public var mangleNameToCauseCompilationErrsMeminfo: SyspageEntryInfo,
    public var hwinfo: SyspageEntryInfo,
    public var oldCpuinfo: SyspageEntryInfo,
    public var oldCacheattr: SyspageEntryInfo,
    public var qtime: SyspageEntryInfo,
    public var callout: SyspageEntryInfo,
    public var callin: SyspageEntryInfo,
    public var typedStrings: SyspageEntryInfo,
    public var strings: SyspageEntryInfo,
    public var oldIntrinfo: SyspageEntryInfo,
    public var smp: SyspageEntryInfo,
    public var pminfo: SyspageEntryInfo,
    public var oldMdriver: SyspageEntryInfo,
    public var spare0: List<UInt>,
    public var reserved: List<UByte>,
    // anonymous union with architecture dependent structs
    public var newAsinfo: SyspageArrayInfo,
    public var newCpuinfo: SyspageArrayInfo,
    public var newCacheattr: SyspageArrayInfo,
    public var newIntrinfo: SyspageArrayInfo,
    public var newMdriver: SyspageArrayInfo,
)

public val SYSMGR_PID: UInt = 1u

public val SYSMGR_CHID: UInt = 1u

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

public val NTO_SIDE_CHANNEL: UInt = 1073741824u

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

public fun channelCreate(flags: CUint): CInt {
    return LibcDynamicFfi.invoke("ChannelCreate", -1, longArrayOf(flags.toLong())).toInt()
}

public fun channelCreateR(flags: CUint): CInt {
    return LibcDynamicFfi.invoke("ChannelCreate_r", -1, longArrayOf(flags.toLong())).toInt()
}

public fun channelCreatePulsePool(flags: CUint, config: NtoChannelConfig?): CInt {
    return LibcDynamicFfi.invoke("ChannelCreatePulsePool", -1, longArrayOf(flags.toLong(), config?.value ?: 0L)).toInt()
}

public fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: Sigevent?, cred: CredInfo?): CInt {
    return LibcDynamicFfi.invoke("ChannelCreateExt", -1, longArrayOf(flags.toLong(), mode.toLong(), bufsize.toLong(), maxnumbuf.toLong(), ev?.value ?: 0L, cred?.value ?: 0L)).toInt()
}

public fun channelDestroy(chid: CInt): CInt {
    return LibcDynamicFfi.invoke("ChannelDestroy", -1, longArrayOf(chid.toLong())).toInt()
}

public fun channelDestroyR(chid: CInt): CInt {
    return LibcDynamicFfi.invoke("ChannelDestroy_r", -1, longArrayOf(chid.toLong())).toInt()
}

public fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("ConnectAttach", -1, longArrayOf(nd.toLong(), pid.toLong(), chid.toLong(), index.toLong(), flags.toLong())).toInt()
}

public fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("ConnectAttach_r", -1, longArrayOf(nd.toLong(), pid.toLong(), chid.toLong(), index.toLong(), flags.toLong())).toInt()
}

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
public fun connectDetach(coid: CInt): CInt {
    return LibcDynamicFfi.invoke("ConnectDetach", -1, longArrayOf(coid.toLong())).toInt()
}

public fun connectDetachR(coid: CInt): CInt {
    return LibcDynamicFfi.invoke("ConnectDetach_r", -1, longArrayOf(coid.toLong())).toInt()
}

public fun connectServerInfo(pid: PidT, coid: CInt, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("ConnectServerInfo", -1, longArrayOf(pid.toLong(), coid.toLong(), info?.value ?: 0L)).toInt()
}

public fun connectServerInfoR(pid: PidT, coid: CInt, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("ConnectServerInfo_r", -1, longArrayOf(pid.toLong(), coid.toLong(), info?.value ?: 0L)).toInt()
}

public fun connectClientInfoExtraArgs(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUint?): CInt {
    val __slot_5 = if (typeId == null) 0L else LibcDynamicFfi.allocScalarSlot(typeId.toLong())
    try {
        return LibcDynamicFfi.invoke("ConnectClientInfoExtraArgs", -1, longArrayOf(scoid.toLong(), infoPp?.value ?: 0L, ngroups.toLong(), abilities?.value ?: 0L, nable.toLong(), __slot_5)).toInt()
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUint?): CInt {
    val __slot_5 = if (typeId == null) 0L else LibcDynamicFfi.allocScalarSlot(typeId.toLong())
    try {
        return LibcDynamicFfi.invoke("ConnectClientInfoExtraArgs_r", -1, longArrayOf(scoid.toLong(), infoPp?.value ?: 0L, ngroups.toLong(), abilities?.value ?: 0L, nable.toLong(), __slot_5)).toInt()
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun connectClientInfo(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt {
    return LibcDynamicFfi.invoke("ConnectClientInfo", -1, longArrayOf(scoid.toLong(), info?.value ?: 0L, ngroups.toLong())).toInt()
}

public fun connectClientInfoR(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt {
    return LibcDynamicFfi.invoke("ConnectClientInfo_r", -1, longArrayOf(scoid.toLong(), info?.value ?: 0L, ngroups.toLong())).toInt()
}

public fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("ConnectClientInfoExt", -1, longArrayOf(scoid.toLong(), infoPp?.value ?: 0L, flags.toLong())).toInt()
}

public fun clientInfoExtFree(infoPp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ClientInfoExtFree", -1, longArrayOf(infoPp?.value ?: 0L)).toInt()
}

public fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: ClientAble?, nable: CInt): CInt {
    return LibcDynamicFfi.invoke("ConnectClientInfoAble", -1, longArrayOf(scoid.toLong(), infoPp?.value ?: 0L, flags.toLong(), abilities?.value ?: 0L, nable.toLong())).toInt()
}

public fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt {
    return LibcDynamicFfi.invoke("ConnectFlags", -1, longArrayOf(pid.toLong(), coid.toLong(), mask.toLong(), bits.toLong())).toInt()
}

public fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt {
    return LibcDynamicFfi.invoke("ConnectFlags_r", -1, longArrayOf(pid.toLong(), coid.toLong(), mask.toLong(), bits.toLong())).toInt()
}

public fun channelConnectAttr(id: CUint, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("ChannelConnectAttr", -1, longArrayOf(id.toLong(), oldAttr?.value ?: 0L, newAttr?.value ?: 0L, flags.toLong())).toInt()
}

public fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSend", -1, longArrayOf(coid.toLong(), smsg?.value ?: 0L, sbytes.toLong(), rmsg?.value ?: 0L, rbytes.toLong()))
}

public fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSend_r", -1, longArrayOf(coid.toLong(), smsg?.value ?: 0L, sbytes.toLong(), rmsg?.value ?: 0L, rbytes.toLong()))
}

public fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendnc", -1, longArrayOf(coid.toLong(), smsg?.value ?: 0L, sbytes.toLong(), rmsg?.value ?: 0L, rbytes.toLong()))
}

public fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendnc_r", -1, longArrayOf(coid.toLong(), smsg?.value ?: 0L, sbytes.toLong(), rmsg?.value ?: 0L, rbytes.toLong()))
}

public fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendsv", -1, longArrayOf(coid.toLong(), smsg?.value ?: 0L, sbytes.toLong(), riov?.value ?: 0L, rparts.toLong()))
}

public fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendsv_r", -1, longArrayOf(coid.toLong(), smsg?.value ?: 0L, sbytes.toLong(), riov?.value ?: 0L, rparts.toLong()))
}

public fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendsvnc", -1, longArrayOf(coid.toLong(), smsg?.value ?: 0L, sbytes.toLong(), riov?.value ?: 0L, rparts.toLong()))
}

public fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendsvnc_r", -1, longArrayOf(coid.toLong(), smsg?.value ?: 0L, sbytes.toLong(), riov?.value ?: 0L, rparts.toLong()))
}

public fun msgSendvs(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendvs", -1, longArrayOf(coid.toLong(), siov?.value ?: 0L, sparts.toLong(), rmsg?.value ?: 0L, rbytes.toLong()))
}

public fun msgSendvsR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendvs_r", -1, longArrayOf(coid.toLong(), siov?.value ?: 0L, sparts.toLong(), rmsg?.value ?: 0L, rbytes.toLong()))
}

public fun msgSendvsnc(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendvsnc", -1, longArrayOf(coid.toLong(), siov?.value ?: 0L, sparts.toLong(), rmsg?.value ?: 0L, rbytes.toLong()))
}

public fun msgSendvsncR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendvsnc_r", -1, longArrayOf(coid.toLong(), siov?.value ?: 0L, sparts.toLong(), rmsg?.value ?: 0L, rbytes.toLong()))
}

public fun msgSendv(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendv", -1, longArrayOf(coid.toLong(), siov?.value ?: 0L, sparts.toLong(), riov?.value ?: 0L, rparts.toLong()))
}

public fun msgSendvR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendv_r", -1, longArrayOf(coid.toLong(), siov?.value ?: 0L, sparts.toLong(), riov?.value ?: 0L, rparts.toLong()))
}

public fun msgSendvnc(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendvnc", -1, longArrayOf(coid.toLong(), siov?.value ?: 0L, sparts.toLong(), riov?.value ?: 0L, rparts.toLong()))
}

public fun msgSendvncR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong {
    return LibcDynamicFfi.invoke("MsgSendvnc_r", -1, longArrayOf(coid.toLong(), siov?.value ?: 0L, sparts.toLong(), riov?.value ?: 0L, rparts.toLong()))
}

public fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgReceive", -1, longArrayOf(chid.toLong(), msg?.value ?: 0L, bytes.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgReceive_r", -1, longArrayOf(chid.toLong(), msg?.value ?: 0L, bytes.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgReceivev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgReceivev", -1, longArrayOf(chid.toLong(), iov?.value ?: 0L, parts.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgReceivevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgReceivev_r", -1, longArrayOf(chid.toLong(), iov?.value ?: 0L, parts.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgReceivePulse", -1, longArrayOf(chid.toLong(), pulse?.value ?: 0L, bytes.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgReceivePulse_r", -1, longArrayOf(chid.toLong(), pulse?.value ?: 0L, bytes.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgReceivePulsev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgReceivePulsev", -1, longArrayOf(chid.toLong(), iov?.value ?: 0L, parts.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgReceivePulsevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgReceivePulsev_r", -1, longArrayOf(chid.toLong(), iov?.value ?: 0L, parts.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt {
    return LibcDynamicFfi.invoke("MsgReply", -1, longArrayOf(rcvid.toLong(), status, msg?.value ?: 0L, bytes.toLong())).toInt()
}

public fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt {
    return LibcDynamicFfi.invoke("MsgReply_r", -1, longArrayOf(rcvid.toLong(), status, msg?.value ?: 0L, bytes.toLong())).toInt()
}

public fun msgReplyv(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt {
    return LibcDynamicFfi.invoke("MsgReplyv", -1, longArrayOf(rcvid.toLong(), status, iov?.value ?: 0L, parts.toLong())).toInt()
}

public fun msgReplyvR(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt {
    return LibcDynamicFfi.invoke("MsgReplyv_r", -1, longArrayOf(rcvid.toLong(), status, iov?.value ?: 0L, parts.toLong())).toInt()
}

public fun msgReadiov(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long {
    return LibcDynamicFfi.invoke("MsgReadiov", -1, longArrayOf(rcvid.toLong(), iov?.value ?: 0L, parts.toLong(), offset.toLong(), flags.toLong()))
}

public fun msgReadiovR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long {
    return LibcDynamicFfi.invoke("MsgReadiov_r", -1, longArrayOf(rcvid.toLong(), iov?.value ?: 0L, parts.toLong(), offset.toLong(), flags.toLong()))
}

public fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long {
    return LibcDynamicFfi.invoke("MsgRead", -1, longArrayOf(rcvid.toLong(), msg?.value ?: 0L, bytes.toLong(), offset.toLong()))
}

public fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long {
    return LibcDynamicFfi.invoke("MsgRead_r", -1, longArrayOf(rcvid.toLong(), msg?.value ?: 0L, bytes.toLong(), offset.toLong()))
}

public fun msgReadv(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long {
    return LibcDynamicFfi.invoke("MsgReadv", -1, longArrayOf(rcvid.toLong(), iov?.value ?: 0L, parts.toLong(), offset.toLong()))
}

public fun msgReadvR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long {
    return LibcDynamicFfi.invoke("MsgReadv_r", -1, longArrayOf(rcvid.toLong(), iov?.value ?: 0L, parts.toLong(), offset.toLong()))
}

public fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long {
    return LibcDynamicFfi.invoke("MsgWrite", -1, longArrayOf(rcvid.toLong(), msg?.value ?: 0L, bytes.toLong(), offset.toLong()))
}

public fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long {
    return LibcDynamicFfi.invoke("MsgWrite_r", -1, longArrayOf(rcvid.toLong(), msg?.value ?: 0L, bytes.toLong(), offset.toLong()))
}

public fun msgWritev(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long {
    return LibcDynamicFfi.invoke("MsgWritev", -1, longArrayOf(rcvid.toLong(), iov?.value ?: 0L, parts.toLong(), offset.toLong()))
}

public fun msgWritevR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long {
    return LibcDynamicFfi.invoke("MsgWritev_r", -1, longArrayOf(rcvid.toLong(), iov?.value ?: 0L, parts.toLong(), offset.toLong()))
}

public fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgSendPulse", -1, longArrayOf(coid.toLong(), priority.toLong(), code.toLong(), value.toLong())).toInt()
}

public fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgSendPulse_r", -1, longArrayOf(coid.toLong(), priority.toLong(), code.toLong(), value.toLong())).toInt()
}

public fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("MsgSendPulsePtr", -1, longArrayOf(coid.toLong(), priority.toLong(), code.toLong(), value?.value ?: 0L)).toInt()
}

public fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("MsgSendPulsePtr_r", -1, longArrayOf(coid.toLong(), priority.toLong(), code.toLong(), value?.value ?: 0L)).toInt()
}

public fun msgDeliverEvent(rcvid: CInt, event: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("MsgDeliverEvent", -1, longArrayOf(rcvid.toLong(), event?.value ?: 0L)).toInt()
}

public fun msgDeliverEventR(rcvid: CInt, event: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("MsgDeliverEvent_r", -1, longArrayOf(rcvid.toLong(), event?.value ?: 0L)).toInt()
}

public fun msgVerifyEvent(rcvid: CInt, event: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("MsgVerifyEvent", -1, longArrayOf(rcvid.toLong(), event?.value ?: 0L)).toInt()
}

public fun msgVerifyEventR(rcvid: CInt, event: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("MsgVerifyEvent_r", -1, longArrayOf(rcvid.toLong(), event?.value ?: 0L)).toInt()
}

public fun msgRegisterEvent(event: Sigevent?, coid: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgRegisterEvent", -1, longArrayOf(event?.value ?: 0L, coid.toLong())).toInt()
}

public fun msgRegisterEventR(event: Sigevent?, coid: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgRegisterEvent_r", -1, longArrayOf(event?.value ?: 0L, coid.toLong())).toInt()
}

public fun msgUnregisterEvent(event: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("MsgUnregisterEvent", -1, longArrayOf(event?.value ?: 0L)).toInt()
}

public fun msgUnregisterEventR(event: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("MsgUnregisterEvent_r", -1, longArrayOf(event?.value ?: 0L)).toInt()
}

public fun msgInfo(rcvid: CInt, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgInfo", -1, longArrayOf(rcvid.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgInfoR(rcvid: CInt, info: MsgInfo64?): CInt {
    return LibcDynamicFfi.invoke("MsgInfo_r", -1, longArrayOf(rcvid.toLong(), info?.value ?: 0L)).toInt()
}

public fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt {
    val __slot_3 = if (newkey == null) 0L else LibcDynamicFfi.allocScalarSlot(newkey.toLong())
    try {
        return LibcDynamicFfi.invoke("MsgKeyData", -1, longArrayOf(rcvid.toLong(), oper.toLong(), key.toLong(), __slot_3, iov?.value ?: 0L, parts.toLong())).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt {
    val __slot_3 = if (newkey == null) 0L else LibcDynamicFfi.allocScalarSlot(newkey.toLong())
    try {
        return LibcDynamicFfi.invoke("MsgKeyData_r", -1, longArrayOf(rcvid.toLong(), oper.toLong(), key.toLong(), __slot_3, iov?.value ?: 0L, parts.toLong())).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun msgError(rcvid: CInt, err: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgError", -1, longArrayOf(rcvid.toLong(), err.toLong())).toInt()
}

public fun msgErrorR(rcvid: CInt, err: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgError_r", -1, longArrayOf(rcvid.toLong(), err.toLong())).toInt()
}

public fun msgCurrent(rcvid: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgCurrent", -1, longArrayOf(rcvid.toLong())).toInt()
}

public fun msgCurrentR(rcvid: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgCurrent_r", -1, longArrayOf(rcvid.toLong())).toInt()
}

public fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUint): CInt {
    return LibcDynamicFfi.invoke("MsgSendAsyncGbl", -1, longArrayOf(coid.toLong(), smsg?.value ?: 0L, sbytes.toLong(), msgPrio.toLong())).toInt()
}

public fun msgSendAsync(coid: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgSendAsync", -1, longArrayOf(coid.toLong())).toInt()
}

public fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: CInt): CInt {
    return LibcDynamicFfi.invoke("MsgReceiveAsyncGbl", -1, longArrayOf(chid.toLong(), rmsg?.value ?: 0L, rbytes.toLong(), info?.value ?: 0L, coid.toLong())).toInt()
}

public fun msgReceiveAsync(chid: CInt, iov: Iovec?, parts: CUint): CInt {
    return LibcDynamicFfi.invoke("MsgReceiveAsync", -1, longArrayOf(chid.toLong(), iov?.value ?: 0L, parts.toLong())).toInt()
}

public fun msgPause(rcvid: CInt, cookie: CUint): CInt {
    return LibcDynamicFfi.invoke("MsgPause", -1, longArrayOf(rcvid.toLong(), cookie.toLong())).toInt()
}

public fun msgPauseR(rcvid: CInt, cookie: CUint): CInt {
    return LibcDynamicFfi.invoke("MsgPause_r", -1, longArrayOf(rcvid.toLong(), cookie.toLong())).toInt()
}

public fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt {
    return LibcDynamicFfi.invoke("SignalKill", -1, longArrayOf(nd.toLong(), pid.toLong(), tid.toLong(), signo.toLong(), code.toLong(), value.toLong())).toInt()
}

public fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt {
    return LibcDynamicFfi.invoke("SignalKill_r", -1, longArrayOf(nd.toLong(), pid.toLong(), tid.toLong(), signo.toLong(), code.toLong(), value.toLong())).toInt()
}

public fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt {
    return LibcDynamicFfi.invoke("SignalKillSigval", -1, longArrayOf(nd.toLong(), pid.toLong(), tid.toLong(), signo.toLong(), code.toLong(), value?.value ?: 0L)).toInt()
}

public fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt {
    return LibcDynamicFfi.invoke("SignalKillSigval_r", -1, longArrayOf(nd.toLong(), pid.toLong(), tid.toLong(), signo.toLong(), code.toLong(), value?.value ?: 0L)).toInt()
}

public fun signalReturn(info: SighandlerInfo?): CInt {
    return LibcDynamicFfi.invoke("SignalReturn", -1, longArrayOf(info?.value ?: 0L)).toInt()
}

public fun signalFault(sigcode: CUint, regs: COpaquePointer?, refaddr: ULong): CInt {
    return LibcDynamicFfi.invoke("SignalFault", -1, longArrayOf(sigcode.toLong(), regs?.value ?: 0L, refaddr.toLong())).toInt()
}

public fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("SignalAction", -1, longArrayOf(pid.toLong(), __scratch_1, signo.toLong(), act?.value ?: 0L, oact?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("SignalAction_r", -1, longArrayOf(pid.toLong(), __scratch_1, signo.toLong(), act?.value ?: 0L, oact?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt {
    val __slot_3 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_4 = if (oldset == null) 0L else LibcDynamicFfi.allocScalarSlot(oldset.toLong())
    try {
        return LibcDynamicFfi.invoke("SignalProcmask", -1, longArrayOf(pid.toLong(), tid.toLong(), how.toLong(), __slot_3, __slot_4)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt {
    val __slot_3 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_4 = if (oldset == null) 0L else LibcDynamicFfi.allocScalarSlot(oldset.toLong())
    try {
        return LibcDynamicFfi.invoke("SignalProcmask_r", -1, longArrayOf(pid.toLong(), tid.toLong(), how.toLong(), __slot_3, __slot_4)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun signalSuspend(set: SigsetT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("SignalSuspend", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun signalSuspendR(set: SigsetT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("SignalSuspend_r", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("SignalWaitinfo", -1, longArrayOf(__slot_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("SignalWaitinfo_r", -1, longArrayOf(__slot_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_2 = if (mask == null) 0L else LibcDynamicFfi.allocScalarSlot(mask.toLong())
    try {
        return LibcDynamicFfi.invoke("SignalWaitinfoMask", -1, longArrayOf(__slot_0, info?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_2 = if (mask == null) 0L else LibcDynamicFfi.allocScalarSlot(mask.toLong())
    try {
        return LibcDynamicFfi.invoke("SignalWaitinfoMask_r", -1, longArrayOf(__slot_0, info?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: ThreadAttr?): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("ThreadCreate", -1, longArrayOf(pid.toLong(), __scratch_1, arg?.value ?: 0L, attr?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: ThreadAttr?): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("ThreadCreate_r", -1, longArrayOf(pid.toLong(), __scratch_1, arg?.value ?: 0L, attr?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ThreadDestroy", -1, longArrayOf(tid.toLong(), priority.toLong(), status?.value ?: 0L)).toInt()
}

public fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ThreadDestroy_r", -1, longArrayOf(tid.toLong(), priority.toLong(), status?.value ?: 0L)).toInt()
}

public fun threadDetach(tid: CInt): CInt {
    return LibcDynamicFfi.invoke("ThreadDetach", -1, longArrayOf(tid.toLong())).toInt()
}

public fun threadDetachR(tid: CInt): CInt {
    return LibcDynamicFfi.invoke("ThreadDetach_r", -1, longArrayOf(tid.toLong())).toInt()
}

public fun threadJoin(tid: CInt, status: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ThreadJoin", -1, longArrayOf(tid.toLong(), status?.value ?: 0L)).toInt()
}

public fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ThreadJoin_r", -1, longArrayOf(tid.toLong(), status?.value ?: 0L)).toInt()
}

public fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("ThreadCancel", -1, longArrayOf(tid.toLong(), __scratch_1)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("ThreadCancel_r", -1, longArrayOf(tid.toLong(), __scratch_1)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ThreadCtl", -1, longArrayOf(cmd.toLong(), data?.value ?: 0L)).toInt()
}

public fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ThreadCtl_r", -1, longArrayOf(cmd.toLong(), data?.value ?: 0L)).toInt()
}

public fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ThreadCtlExt", -1, longArrayOf(pid.toLong(), tid.toLong(), cmd.toLong(), data?.value ?: 0L)).toInt()
}

public fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("ThreadCtlExt_r", -1, longArrayOf(pid.toLong(), tid.toLong(), cmd.toLong(), data?.value ?: 0L)).toInt()
}

public fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptHookTrace", -1, longArrayOf(handler?.value ?: 0L, flags.toLong())).toInt()
}

public fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptHookIdle", -1, longArrayOf(handler?.value ?: 0L, flags.toLong())).toInt()
}

public fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptHookIdle2", -1, longArrayOf(handler?.value ?: 0L, flags.toLong())).toInt()
}

public fun interruptHookOverdriveEvent(event: Sigevent?, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptHookOverdriveEvent", -1, longArrayOf(event?.value ?: 0L, flags.toLong())).toInt()
}

public fun interruptAttachEvent(intr: CInt, event: Sigevent?, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptAttachEvent", -1, longArrayOf(intr.toLong(), event?.value ?: 0L, flags.toLong())).toInt()
}

public fun interruptAttachEventR(intr: CInt, event: Sigevent?, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptAttachEvent_r", -1, longArrayOf(intr.toLong(), event?.value ?: 0L, flags.toLong())).toInt()
}

public fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptAttach", -1, longArrayOf(intr.toLong(), handler?.value ?: 0L, area?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
}

public fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptAttach_r", -1, longArrayOf(intr.toLong(), handler?.value ?: 0L, area?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
}

public fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptAttachArray", -1, longArrayOf(intr.toLong(), handler?.value ?: 0L, area?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
}

public fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("InterruptAttachArray_r", -1, longArrayOf(intr.toLong(), handler?.value ?: 0L, area?.value ?: 0L, size.toLong(), flags.toLong())).toInt()
}

public fun interruptDetach(id: CInt): CInt {
    return LibcDynamicFfi.invoke("InterruptDetach", -1, longArrayOf(id.toLong())).toInt()
}

public fun interruptDetachR(id: CInt): CInt {
    return LibcDynamicFfi.invoke("InterruptDetach_r", -1, longArrayOf(id.toLong())).toInt()
}

public fun interruptWait(flags: CInt, timeout: ULong?): CInt {
    val __slot_1 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("InterruptWait", -1, longArrayOf(flags.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun interruptWaitR(flags: CInt, timeout: ULong?): CInt {
    val __slot_1 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("InterruptWait_r", -1, longArrayOf(flags.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun interruptCharacteristic(type: CInt, id: CInt, new: CUint?, old: CUint?): CInt {
    val __slot_2 = if (new == null) 0L else LibcDynamicFfi.allocScalarSlot(new.toLong())
    val __slot_3 = if (old == null) 0L else LibcDynamicFfi.allocScalarSlot(old.toLong())
    try {
        return LibcDynamicFfi.invoke("InterruptCharacteristic", -1, longArrayOf(type.toLong(), id.toLong(), __slot_2, __slot_3)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun interruptCharacteristicR(type: CInt, id: CInt, new: CUint?, old: CUint?): CInt {
    val __slot_2 = if (new == null) 0L else LibcDynamicFfi.allocScalarSlot(new.toLong())
    val __slot_3 = if (old == null) 0L else LibcDynamicFfi.allocScalarSlot(old.toLong())
    try {
        return LibcDynamicFfi.invoke("InterruptCharacteristic_r", -1, longArrayOf(type.toLong(), id.toLong(), __slot_2, __slot_3)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun schedGet(pid: PidT, tid: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("SchedGet", -1, longArrayOf(pid.toLong(), tid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedGetR(pid: PidT, tid: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("SchedGet_r", -1, longArrayOf(pid.toLong(), tid.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedGetCpuNum(): CUint {
    return LibcDynamicFfi.invoke("SchedGetCpuNum", -1, longArrayOf()).toUInt()
}

public fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("SchedSet", -1, longArrayOf(pid.toLong(), tid.toLong(), algorithm.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("SchedSet_r", -1, longArrayOf(pid.toLong(), tid.toLong(), algorithm.toLong(), param?.value ?: 0L)).toInt()
}

public fun schedInfo(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt {
    return LibcDynamicFfi.invoke("SchedInfo", -1, longArrayOf(pid.toLong(), algorithm.toLong(), info?.value ?: 0L)).toInt()
}

public fun schedInfoR(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt {
    return LibcDynamicFfi.invoke("SchedInfo_r", -1, longArrayOf(pid.toLong(), algorithm.toLong(), info?.value ?: 0L)).toInt()
}

public fun schedYield(): CInt {
    return LibcDynamicFfi.invoke("SchedYield", -1, longArrayOf()).toInt()
}

public fun schedYieldR(): CInt {
    return LibcDynamicFfi.invoke("SchedYield_r", -1, longArrayOf()).toInt()
}

public fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt {
    return LibcDynamicFfi.invoke("SchedCtl", -1, longArrayOf(cmd.toLong(), data?.value ?: 0L, length.toLong())).toInt()
}

public fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt {
    return LibcDynamicFfi.invoke("SchedCtl_r", -1, longArrayOf(cmd.toLong(), data?.value ?: 0L, length.toLong())).toInt()
}

public fun schedJobCreate(job: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SchedJobCreate", -1, longArrayOf(job?.value ?: 0L)).toInt()
}

public fun schedJobCreateR(job: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SchedJobCreate_r", -1, longArrayOf(job?.value ?: 0L)).toInt()
}

public fun schedJobDestroy(job: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SchedJobDestroy", -1, longArrayOf(job?.value ?: 0L)).toInt()
}

public fun schedJobDestroyR(job: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SchedJobDestroy_r", -1, longArrayOf(job?.value ?: 0L)).toInt()
}

public fun schedWaypoint(job: SyncT?, new: Long?, max: Long?, old: Long?): CInt {
    val __slot_1 = if (new == null) 0L else LibcDynamicFfi.allocScalarSlot(new)
    val __slot_2 = if (max == null) 0L else LibcDynamicFfi.allocScalarSlot(max)
    val __slot_3 = if (old == null) 0L else LibcDynamicFfi.allocScalarSlot(old)
    try {
        return LibcDynamicFfi.invoke("SchedWaypoint", -1, longArrayOf(job?.value ?: 0L, __slot_1, __slot_2, __slot_3)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun schedWaypointR(job: SyncT?, new: Long?, max: Long?, old: Long?): CInt {
    val __slot_1 = if (new == null) 0L else LibcDynamicFfi.allocScalarSlot(new)
    val __slot_2 = if (max == null) 0L else LibcDynamicFfi.allocScalarSlot(max)
    val __slot_3 = if (old == null) 0L else LibcDynamicFfi.allocScalarSlot(old)
    try {
        return LibcDynamicFfi.invoke("SchedWaypoint_r", -1, longArrayOf(job?.value ?: 0L, __slot_1, __slot_2, __slot_3)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun timerCreate(id: ClockidT, notify: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("TimerCreate", -1, longArrayOf(id.toLong(), notify?.value ?: 0L)).toInt()
}

public fun timerCreateR(id: ClockidT, notify: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("TimerCreate_r", -1, longArrayOf(id.toLong(), notify?.value ?: 0L)).toInt()
}

public fun timerDestroy(id: TimerT): CInt {
    return LibcDynamicFfi.invoke("TimerDestroy", -1, longArrayOf(id.toLong())).toInt()
}

public fun timerDestroyR(id: TimerT): CInt {
    return LibcDynamicFfi.invoke("TimerDestroy_r", -1, longArrayOf(id.toLong())).toInt()
}

public fun timerSettime(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt {
    return LibcDynamicFfi.invoke("TimerSettime", -1, longArrayOf(id.toLong(), flags.toLong(), itime?.value ?: 0L, oitime?.value ?: 0L)).toInt()
}

public fun timerSettimeR(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt {
    return LibcDynamicFfi.invoke("TimerSettime_r", -1, longArrayOf(id.toLong(), flags.toLong(), itime?.value ?: 0L, oitime?.value ?: 0L)).toInt()
}

public fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt {
    return LibcDynamicFfi.invoke("TimerInfo", -1, longArrayOf(pid.toLong(), id.toLong(), flags.toLong(), info?.value ?: 0L)).toInt()
}

public fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt {
    return LibcDynamicFfi.invoke("TimerInfo_r", -1, longArrayOf(pid.toLong(), id.toLong(), flags.toLong(), info?.value ?: 0L)).toInt()
}

public fun timerAlarm(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt {
    return LibcDynamicFfi.invoke("TimerAlarm", -1, longArrayOf(id.toLong(), itime?.value ?: 0L, otime?.value ?: 0L)).toInt()
}

public fun timerAlarmR(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt {
    return LibcDynamicFfi.invoke("TimerAlarm_r", -1, longArrayOf(id.toLong(), itime?.value ?: 0L, otime?.value ?: 0L)).toInt()
}

public fun timerTimeout(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt {
    val __slot_3 = if (ntime == null) 0L else LibcDynamicFfi.allocScalarSlot(ntime.toLong())
    val __slot_4 = if (otime == null) 0L else LibcDynamicFfi.allocScalarSlot(otime.toLong())
    try {
        return LibcDynamicFfi.invoke("TimerTimeout", -1, longArrayOf(id.toLong(), flags.toLong(), notify?.value ?: 0L, __slot_3, __slot_4)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun timerTimeoutR(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt {
    val __slot_3 = if (ntime == null) 0L else LibcDynamicFfi.allocScalarSlot(ntime.toLong())
    val __slot_4 = if (otime == null) 0L else LibcDynamicFfi.allocScalarSlot(otime.toLong())
    try {
        return LibcDynamicFfi.invoke("TimerTimeout_r", -1, longArrayOf(id.toLong(), flags.toLong(), notify?.value ?: 0L, __slot_3, __slot_4)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun syncTypeCreate(type: CUint, sync: SyncT?, attr: SyncAttr?): CInt {
    return LibcDynamicFfi.invoke("SyncTypeCreate", -1, longArrayOf(type.toLong(), sync?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun syncTypeCreateR(type: CUint, sync: SyncT?, attr: SyncAttr?): CInt {
    return LibcDynamicFfi.invoke("SyncTypeCreate_r", -1, longArrayOf(type.toLong(), sync?.value ?: 0L, attr?.value ?: 0L)).toInt()
}

public fun syncDestroy(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncDestroy", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncDestroyR(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncDestroy_r", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncCtl(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("SyncCtl", -1, longArrayOf(cmd.toLong(), sync?.value ?: 0L, data?.value ?: 0L)).toInt()
}

public fun syncCtlR(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("SyncCtl_r", -1, longArrayOf(cmd.toLong(), sync?.value ?: 0L, data?.value ?: 0L)).toInt()
}

public fun syncMutexEvent(sync: SyncT?, event: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("SyncMutexEvent", -1, longArrayOf(sync?.value ?: 0L, event?.value ?: 0L)).toInt()
}

public fun syncMutexEventR(sync: SyncT?, event: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("SyncMutexEvent_r", -1, longArrayOf(sync?.value ?: 0L, event?.value ?: 0L)).toInt()
}

public fun syncMutexLock(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncMutexLock", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncMutexLockR(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncMutexLock_r", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncMutexUnlock(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncMutexUnlock", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncMutexUnlockR(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncMutexUnlock_r", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncMutexRevive(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncMutexRevive", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncMutexReviveR(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncMutexRevive_r", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncCondvarWait", -1, longArrayOf(sync?.value ?: 0L, mutex?.value ?: 0L)).toInt()
}

public fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncCondvarWait_r", -1, longArrayOf(sync?.value ?: 0L, mutex?.value ?: 0L)).toInt()
}

public fun syncCondvarSignal(sync: SyncT?, all: CInt): CInt {
    return LibcDynamicFfi.invoke("SyncCondvarSignal", -1, longArrayOf(sync?.value ?: 0L, all.toLong())).toInt()
}

public fun syncCondvarSignalR(sync: SyncT?, all: CInt): CInt {
    return LibcDynamicFfi.invoke("SyncCondvarSignal_r", -1, longArrayOf(sync?.value ?: 0L, all.toLong())).toInt()
}

public fun syncSemPost(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncSemPost", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncSemPostR(sync: SyncT?): CInt {
    return LibcDynamicFfi.invoke("SyncSemPost_r", -1, longArrayOf(sync?.value ?: 0L)).toInt()
}

public fun syncSemWait(sync: SyncT?, tryto: CInt): CInt {
    return LibcDynamicFfi.invoke("SyncSemWait", -1, longArrayOf(sync?.value ?: 0L, tryto.toLong())).toInt()
}

public fun syncSemWaitR(sync: SyncT?, tryto: CInt): CInt {
    return LibcDynamicFfi.invoke("SyncSemWait_r", -1, longArrayOf(sync?.value ?: 0L, tryto.toLong())).toInt()
}

public fun clockTime(id: ClockidT, new: ULong?, old: ULong?): CInt {
    val __slot_1 = if (new == null) 0L else LibcDynamicFfi.allocScalarSlot(new.toLong())
    val __slot_2 = if (old == null) 0L else LibcDynamicFfi.allocScalarSlot(old.toLong())
    try {
        return LibcDynamicFfi.invoke("ClockTime", -1, longArrayOf(id.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun clockTimeR(id: ClockidT, new: ULong?, old: ULong?): CInt {
    val __slot_1 = if (new == null) 0L else LibcDynamicFfi.allocScalarSlot(new.toLong())
    val __slot_2 = if (old == null) 0L else LibcDynamicFfi.allocScalarSlot(old.toLong())
    try {
        return LibcDynamicFfi.invoke("ClockTime_r", -1, longArrayOf(id.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun clockAdjust(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt {
    return LibcDynamicFfi.invoke("ClockAdjust", -1, longArrayOf(id.toLong(), new?.value ?: 0L, old?.value ?: 0L)).toInt()
}

public fun clockAdjustR(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt {
    return LibcDynamicFfi.invoke("ClockAdjust_r", -1, longArrayOf(id.toLong(), new?.value ?: 0L, old?.value ?: 0L)).toInt()
}

public fun clockPeriod(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt {
    return LibcDynamicFfi.invoke("ClockPeriod", -1, longArrayOf(id.toLong(), new?.value ?: 0L, old?.value ?: 0L, reserved.toLong())).toInt()
}

public fun clockPeriodR(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt {
    return LibcDynamicFfi.invoke("ClockPeriod_r", -1, longArrayOf(id.toLong(), new?.value ?: 0L, old?.value ?: 0L, reserved.toLong())).toInt()
}

public fun clockId(pid: PidT, tid: CInt): CInt {
    return LibcDynamicFfi.invoke("ClockId", -1, longArrayOf(pid.toLong(), tid.toLong())).toInt()
}

public fun clockIdR(pid: PidT, tid: CInt): CInt {
    return LibcDynamicFfi.invoke("ClockId_r", -1, longArrayOf(pid.toLong(), tid.toLong())).toInt()
}

//
// Note: The following commented out functions are implemented in assembly.
// We can implmement them either via a C Note or rust's inline assembly.
//
// pub fn InterruptEnable();
// pub fn InterruptDisable();
public fun interruptMask(intr: CInt, id: CInt): CInt {
    return LibcDynamicFfi.invoke("InterruptMask", -1, longArrayOf(intr.toLong(), id.toLong())).toInt()
}

public fun interruptUnmask(intr: CInt, id: CInt): CInt {
    return LibcDynamicFfi.invoke("InterruptUnmask", -1, longArrayOf(intr.toLong(), id.toLong())).toInt()
}
