// port-lint: source unix/nto/neutrino.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias NtoJobT = SyncT

public data class SyspageEntryInfo(
    val entryOff: UShort,
    val entrySize: UShort,
)

public data class SyspageArrayInfo(
    val entryOff: UShort,
    val entrySize: UShort,
    val elementSize: UShort,
)

public data class Intrspin(
    val value: CUInt,
)

public data class IovT(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Itimer(
    val nsec: ULong,
    val intervalNsec: ULong,
)

public data class MsgInfo64(
    val nd: UInt,
    val srcnd: UInt,
    val pid: PidT,
    val tid: Int,
    val chid: Int,
    val scoid: Int,
    val coid: Int,
    val priority: Short,
    val flags: Short,
    val msglen: Long,
    val srcmsglen: Long,
    val dstmsglen: Long,
    val typeId: UInt,
)

public data class CredInfo(
    val ruid: UidT,
    val euid: UidT,
    val suid: UidT,
    val rgid: GidT,
    val egid: GidT,
    val sgid: GidT,
    val ngroups: UInt,
    val grouplist: List<GidT>,
)

public data class ClientInfo(
    val nd: UInt,
    val pid: PidT,
    val sid: PidT,
    val flags: UInt,
    val cred: CredInfo,
)

public data class ClientAble(
    val ability: UInt,
    val flags: UInt,
    val rangeLo: ULong,
    val rangeHi: ULong,
)

public data class NtoChannelConfig(
    val event: Sigevent,
    val numPulses: CUInt,
    val rearmThreshold: CUInt,
    val options: CUInt,
)

public class AsyncmsgPutHeader

public class AsyncmsgConnectionAttr

public class AsyncmsgConnectionDescriptor

public data class CAnonymousStructEv(
    val event: Sigevent,
    val coid: CInt,
)

public data class ChannelConnectAttr(
    val ev: CAnonymousStructEv,
)

public data class SighandlerInfo(
    val siginfo: SiginfoT,
    val handler: ((CInt) -> Unit)?,
    val context: COpaquePointer?,
)

public data class CAnonymousStructTime(
    val length: CUInt,
    val scale: CUInt,
)

public data class IdleHook(
    val hookSize: CUInt,
    val cmd: CUInt,
    val mode: CUInt,
    val latency: CUInt,
    val nextFire: ULong,
    val currTime: ULong,
    val todAdjust: ULong,
    val resp: CUInt,
    val time: CAnonymousStructTime,
    val trigger: Sigevent,
    val intrs: CUInt?,
    val blockStackSize: CUInt,
)

public data class Clockadjust(
    val tickCount: UInt,
    val tickNsecInc: Int,
)

public data class QtimeEntry(
    val cyclesPerSec: ULong,
    val nsecTodAdjust: ULong,
    val nsec: ULong,
    val nsecInc: UInt,
    val bootTime: UInt,
    val adjust: Clockadjust,
    val timerRate: UInt,
    val timerScale: Int,
    val timerLoad: UInt,
    val intr: Int,
    val epoch: UInt,
    val flags: UInt,
    val rrIntervalMul: UInt,
    val timerLoadHi: UInt,
    val nsecStable: ULong,
    val timerLoadMax: ULong,
    val timerProgTime: UInt,
    val spare: UIntArray,
)

public data class SchedInfo(
    val priorityMin: CInt,
    val priorityMax: CInt,
    val interval: ULong,
    val priorityPriv: CInt,
)

public data class TimerInfo(
    val itime: Itimer,
    val otime: Itimer,
    val flags: UInt,
    val tid: Int,
    val notify: Int,
    val clockid: ClockidT,
    val overruns: UInt,
    val event: Sigevent,
)

public data class Clockperiod(
    val nsec: UInt,
    val fract: Int,
)

public data class SyspageEntry(
    val size: UShort,
    val totalSize: UShort,
    val type: UShort,
    val numCpu: UShort,
    val systemPrivate: SyspageEntryInfo,
    val oldAsinfo: SyspageEntryInfo,
    val mangleNameToCauseCompilationErrsMeminfo: SyspageEntryInfo,
    val hwinfo: SyspageEntryInfo,
    val oldCpuinfo: SyspageEntryInfo,
    val oldCacheattr: SyspageEntryInfo,
    val qtime: SyspageEntryInfo,
    val callout: SyspageEntryInfo,
    val callin: SyspageEntryInfo,
    val typedStrings: SyspageEntryInfo,
    val strings: SyspageEntryInfo,
    val oldIntrinfo: SyspageEntryInfo,
    val smp: SyspageEntryInfo,
    val pminfo: SyspageEntryInfo,
    val oldMdriver: SyspageEntryInfo,
    val spare0: UIntArray,
    val newAsinfo: SyspageArrayInfo,
    val newCpuinfo: SyspageArrayInfo,
    val newCacheattr: SyspageArrayInfo,
    val newIntrinfo: SyspageArrayInfo,
    val newMdriver: SyspageArrayInfo,
)

public const val SYSMGR_PID: UInt = 1u
public const val SYSMGR_CHID: UInt = 1u
public const val SYSMGR_COID: UInt = _NTO_SIDE_CHANNEL
public const val SYSMGR_HANDLE: UInt = 0u
public const val STATE_DEAD: CInt = 0x00
public const val STATE_RUNNING: CInt = 0x01
public const val STATE_READY: CInt = 0x02
public const val STATE_STOPPED: CInt = 0x03
public const val STATE_SEND: CInt = 0x04
public const val STATE_RECEIVE: CInt = 0x05
public const val STATE_REPLY: CInt = 0x06
public const val STATE_STACK: CInt = 0x07
public const val STATE_WAITTHREAD: CInt = 0x08
public const val STATE_WAITPAGE: CInt = 0x09
public const val STATE_SIGSUSPEND: CInt = 0x0a
public const val STATE_SIGWAITINFO: CInt = 0x0b
public const val STATE_NANOSLEEP: CInt = 0x0c
public const val STATE_MUTEX: CInt = 0x0d
public const val STATE_CONDVAR: CInt = 0x0e
public const val STATE_JOIN: CInt = 0x0f
public const val STATE_INTR: CInt = 0x10
public const val STATE_SEM: CInt = 0x11
public const val STATE_WAITCTX: CInt = 0x12
public const val STATE_NET_SEND: CInt = 0x13
public const val STATE_NET_REPLY: CInt = 0x14
public const val STATE_MAX: CInt = 0x18
public val _NTO_TIMEOUT_RECEIVE: Int = 1 shl STATE_RECEIVE
public val _NTO_TIMEOUT_SEND: Int = 1 shl STATE_SEND
public val _NTO_TIMEOUT_REPLY: Int = 1 shl STATE_REPLY
public val _NTO_TIMEOUT_SIGSUSPEND: Int = 1 shl STATE_SIGSUSPEND
public val _NTO_TIMEOUT_SIGWAITINFO: Int = 1 shl STATE_SIGWAITINFO
public val _NTO_TIMEOUT_NANOSLEEP: Int = 1 shl STATE_NANOSLEEP
public val _NTO_TIMEOUT_MUTEX: Int = 1 shl STATE_MUTEX
public val _NTO_TIMEOUT_CONDVAR: Int = 1 shl STATE_CONDVAR
public val _NTO_TIMEOUT_JOIN: Int = 1 shl STATE_JOIN
public val _NTO_TIMEOUT_INTR: Int = 1 shl STATE_INTR
public val _NTO_TIMEOUT_SEM: Int = 1 shl STATE_SEM
public const val _NTO_MI_ENDIAN_BIG: UInt = 1u
public const val _NTO_MI_ENDIAN_DIFF: UInt = 2u
public const val _NTO_MI_UNBLOCK_REQ: UInt = 256u
public const val _NTO_MI_NET_CRED_DIRTY: UInt = 512u
public const val _NTO_MI_CONSTRAINED: UInt = 1024u
public const val _NTO_MI_CHROOT: UInt = 2048u
public const val _NTO_MI_BITS_64: UInt = 4096u
public const val _NTO_MI_BITS_DIFF: UInt = 8192u
public const val _NTO_MI_SANDBOX: UInt = 16384u
public const val _NTO_CI_ENDIAN_BIG: UInt = 1u
public const val _NTO_CI_BKGND_PGRP: UInt = 4u
public const val _NTO_CI_ORPHAN_PGRP: UInt = 8u
public const val _NTO_CI_STOPPED: UInt = 128u
public const val _NTO_CI_UNABLE: UInt = 256u
public const val _NTO_CI_TYPE_ID: UInt = 512u
public const val _NTO_CI_CHROOT: UInt = 2048u
public const val _NTO_CI_BITS_64: UInt = 4096u
public const val _NTO_CI_SANDBOX: UInt = 16384u
public const val _NTO_CI_LOADER: UInt = 32768u
public const val _NTO_CI_FULL_GROUPS: UInt = 2147483648u
public const val _NTO_TI_ACTIVE: UInt = 1u
public const val _NTO_TI_ABSOLUTE: UInt = 2u
public const val _NTO_TI_EXPIRED: UInt = 4u
public const val _NTO_TI_TOD_BASED: UInt = 8u
public const val _NTO_TI_TARGET_PROCESS: UInt = 16u
public const val _NTO_TI_REPORT_TOLERANCE: UInt = 32u
public const val _NTO_TI_PRECISE: UInt = 64u
public const val _NTO_TI_TOLERANT: UInt = 128u
public const val _NTO_TI_WAKEUP: UInt = 256u
public const val _NTO_TI_PROCESS_TOLERANT: UInt = 512u
public const val _NTO_TI_HIGH_RESOLUTION: UInt = 1024u
public const val _PULSE_TYPE: UInt = 0u
public const val _PULSE_SUBTYPE: UInt = 0u
public const val _PULSE_CODE_UNBLOCK: Int = -32
public const val _PULSE_CODE_DISCONNECT: Int = -33
public const val _PULSE_CODE_THREADDEATH: Int = -34
public const val _PULSE_CODE_COIDDEATH: Int = -35
public const val _PULSE_CODE_NET_ACK: Int = -36
public const val _PULSE_CODE_NET_UNBLOCK: Int = -37
public const val _PULSE_CODE_NET_DETACH: Int = -38
public const val _PULSE_CODE_RESTART: Int = -39
public const val _PULSE_CODE_NORESTART: Int = -40
public const val _PULSE_CODE_UNBLOCK_RESTART: Int = -41
public const val _PULSE_CODE_UNBLOCK_TIMER: Int = -42
public const val _PULSE_CODE_MINAVAIL: UInt = 0u
public const val _PULSE_CODE_MAXAVAIL: UInt = 127u
public const val _NTO_HARD_FLAGS_END: UInt = 1u
public const val _NTO_PULSE_IF_UNIQUE: UInt = 4096u
public const val _NTO_PULSE_REPLACE: UInt = 8192u
public const val _NTO_PF_NOCLDSTOP: UInt = 1u
public const val _NTO_PF_LOADING: UInt = 2u
public const val _NTO_PF_TERMING: UInt = 4u
public const val _NTO_PF_ZOMBIE: UInt = 8u
public const val _NTO_PF_NOZOMBIE: UInt = 16u
public const val _NTO_PF_FORKED: UInt = 32u
public const val _NTO_PF_ORPHAN_PGRP: UInt = 64u
public const val _NTO_PF_STOPPED: UInt = 128u
public const val _NTO_PF_DEBUG_STOPPED: UInt = 256u
public const val _NTO_PF_BKGND_PGRP: UInt = 512u
public const val _NTO_PF_NOISYNC: UInt = 1024u
public const val _NTO_PF_CONTINUED: UInt = 2048u
public const val _NTO_PF_CHECK_INTR: UInt = 4096u
public const val _NTO_PF_COREDUMP: UInt = 8192u
public const val _NTO_PF_RING0: UInt = 32768u
public const val _NTO_PF_SLEADER: UInt = 65536u
public const val _NTO_PF_WAITINFO: UInt = 131072u
public const val _NTO_PF_DESTROYALL: UInt = 524288u
public const val _NTO_PF_NOCOREDUMP: UInt = 1048576u
public const val _NTO_PF_WAITDONE: UInt = 4194304u
public const val _NTO_PF_TERM_WAITING: UInt = 8388608u
public const val _NTO_PF_ASLR: UInt = 16777216u
public const val _NTO_PF_EXECED: UInt = 33554432u
public const val _NTO_PF_APP_STOPPED: UInt = 67108864u
public const val _NTO_PF_64BIT: UInt = 134217728u
public const val _NTO_PF_NET: UInt = 268435456u
public const val _NTO_PF_NOLAZYSTACK: UInt = 536870912u
public const val _NTO_PF_NOEXEC_STACK: UInt = 1073741824u
public const val _NTO_PF_LOADER_PERMS: UInt = 2147483648u
public const val _NTO_TF_INTR_PENDING: UInt = 65536u
public const val _NTO_TF_DETACHED: UInt = 131072u
public const val _NTO_TF_SHR_MUTEX: UInt = 262144u
public const val _NTO_TF_SHR_MUTEX_EUID: UInt = 524288u
public const val _NTO_TF_THREADS_HOLD: UInt = 1048576u
public const val _NTO_TF_UNBLOCK_REQ: UInt = 4194304u
public const val _NTO_TF_ALIGN_FAULT: UInt = 16777216u
public const val _NTO_TF_SSTEP: UInt = 33554432u
public const val _NTO_TF_ALLOCED_STACK: UInt = 67108864u
public const val _NTO_TF_NOMULTISIG: UInt = 134217728u
public const val _NTO_TF_LOW_LATENCY: UInt = 268435456u
public const val _NTO_TF_IOPRIV: UInt = 2147483648u
public const val _NTO_TCTL_IO_PRIV: UInt = 1u
public const val _NTO_TCTL_THREADS_HOLD: UInt = 2u
public const val _NTO_TCTL_THREADS_CONT: UInt = 3u
public const val _NTO_TCTL_RUNMASK: UInt = 4u
public const val _NTO_TCTL_ALIGN_FAULT: UInt = 5u
public const val _NTO_TCTL_RUNMASK_GET_AND_SET: UInt = 6u
public const val _NTO_TCTL_PERFCOUNT: UInt = 7u
public const val _NTO_TCTL_ONE_THREAD_HOLD: UInt = 8u
public const val _NTO_TCTL_ONE_THREAD_CONT: UInt = 9u
public const val _NTO_TCTL_RUNMASK_GET_AND_SET_INHERIT: UInt = 10u
public const val _NTO_TCTL_NAME: UInt = 11u
public const val _NTO_TCTL_RCM_GET_AND_SET: UInt = 12u
public const val _NTO_TCTL_SHR_MUTEX: UInt = 13u
public const val _NTO_TCTL_IO: UInt = 14u
public const val _NTO_TCTL_NET_KIF_GET_AND_SET: UInt = 15u
public const val _NTO_TCTL_LOW_LATENCY: UInt = 16u
public const val _NTO_TCTL_ADD_EXIT_EVENT: UInt = 17u
public const val _NTO_TCTL_DEL_EXIT_EVENT: UInt = 18u
public const val _NTO_TCTL_IO_LEVEL: UInt = 19u
public const val _NTO_TCTL_RESERVED: UInt = 2147483648u
public const val _NTO_TCTL_IO_LEVEL_INHERIT: UInt = 1073741824u
public const val _NTO_IO_LEVEL_NONE: UInt = 1u
public const val _NTO_IO_LEVEL_1: UInt = 2u
public const val _NTO_IO_LEVEL_2: UInt = 3u
public const val _NTO_THREAD_NAME_MAX: UInt = 100u
public const val _NTO_CHF_FIXED_PRIORITY: UInt = 1u
public const val _NTO_CHF_UNBLOCK: UInt = 2u
public const val _NTO_CHF_THREAD_DEATH: UInt = 4u
public const val _NTO_CHF_DISCONNECT: UInt = 8u
public const val _NTO_CHF_NET_MSG: UInt = 16u
public const val _NTO_CHF_SENDER_LEN: UInt = 32u
public const val _NTO_CHF_COID_DISCONNECT: UInt = 64u
public const val _NTO_CHF_REPLY_LEN: UInt = 128u
public const val _NTO_CHF_PULSE_POOL: UInt = 256u
public const val _NTO_CHF_ASYNC_NONBLOCK: UInt = 512u
public const val _NTO_CHF_ASYNC: UInt = 1024u
public const val _NTO_CHF_GLOBAL: UInt = 2048u
public const val _NTO_CHF_PRIVATE: UInt = 4096u
public const val _NTO_CHF_MSG_PAUSING: UInt = 8192u
public const val _NTO_CHF_INHERIT_RUNMASK: UInt = 16384u
public const val _NTO_CHF_UNBLOCK_TIMER: UInt = 32768u
public const val _NTO_CHO_CUSTOM_EVENT: UInt = 1u
public const val _NTO_COF_CLOEXEC: UInt = 1u
public const val _NTO_COF_DEAD: UInt = 2u
public const val _NTO_COF_NOSHARE: UInt = 64u
public const val _NTO_COF_NETCON: UInt = 128u
public const val _NTO_COF_NONBLOCK: UInt = 256u
public const val _NTO_COF_ASYNC: UInt = 512u
public const val _NTO_COF_GLOBAL: UInt = 1024u
public const val _NTO_COF_NOEVENT: UInt = 2048u
public const val _NTO_COF_INSECURE: UInt = 4096u
public const val _NTO_COF_REG_EVENTS: UInt = 8192u
public const val _NTO_COF_UNREG_EVENTS: UInt = 16384u
public const val _NTO_COF_MASK: UInt = 65535u
public const val _NTO_SIDE_CHANNEL: UInt = 1073741824u
public const val _NTO_CONNECTION_SCOID: UInt = 65536u
public const val _NTO_GLOBAL_CHANNEL: UInt = 1073741824u
public val _NTO_TIMEOUT_MASK: UInt = (1 shl STATE_MAX) - 1
public val _NTO_TIMEOUT_ACTIVE: UInt = 1 shl STATE_MAX
public val _NTO_TIMEOUT_IMMEDIATE: UInt = 1 shl (STATE_MAX + 1)
public const val _NTO_IC_LATENCY: UInt = 0u
public const val _NTO_INTR_FLAGS_END: UInt = 1u
public const val _NTO_INTR_FLAGS_NO_UNMASK: UInt = 2u
public const val _NTO_INTR_FLAGS_PROCESS: UInt = 4u
public const val _NTO_INTR_FLAGS_TRK_MSK: UInt = 8u
public const val _NTO_INTR_FLAGS_ARRAY: UInt = 16u
public const val _NTO_INTR_FLAGS_EXCLUSIVE: UInt = 32u
public const val _NTO_INTR_FLAGS_FPU: UInt = 64u
public const val _NTO_INTR_CLASS_EXTERNAL: UInt = 0u
public const val _NTO_INTR_CLASS_SYNTHETIC: UInt = 2147418112u
public const val _NTO_INTR_SPARE: UInt = 2147483647u
public const val _NTO_HOOK_IDLE: UInt = 2147418113u
public const val _NTO_HOOK_OVERDRIVE: UInt = 2147418114u
public const val _NTO_HOOK_LAST: UInt = 2147418114u
public const val _NTO_HOOK_IDLE2_FLAG: UInt = 32768u
public const val _NTO_IH_CMD_SLEEP_SETUP: UInt = 1u
public const val _NTO_IH_CMD_SLEEP_BLOCK: UInt = 2u
public const val _NTO_IH_CMD_SLEEP_WAKEUP: UInt = 4u
public const val _NTO_IH_CMD_SLEEP_ONLINE: UInt = 8u
public const val _NTO_IH_RESP_NEEDS_BLOCK: UInt = 1u
public const val _NTO_IH_RESP_NEEDS_WAKEUP: UInt = 2u
public const val _NTO_IH_RESP_NEEDS_ONLINE: UInt = 4u
public const val _NTO_IH_RESP_SYNC_TIME: UInt = 16u
public const val _NTO_IH_RESP_SYNC_TLB: UInt = 32u
public const val _NTO_IH_RESP_SUGGEST_OFFLINE: UInt = 256u
public const val _NTO_IH_RESP_SLEEP_MODE_REACHED: UInt = 512u
public const val _NTO_IH_RESP_DELIVER_INTRS: UInt = 1024u
public const val _NTO_READIOV_SEND: UInt = 0u
public const val _NTO_READIOV_REPLY: UInt = 1u
public const val _NTO_KEYDATA_VTID: UInt = 2147483648u
public const val _NTO_KEYDATA_PATHSIGN: UInt = 32768u
public const val _NTO_KEYDATA_OP_MASK: UInt = 255u
public const val _NTO_KEYDATA_VERIFY: UInt = 0u
public const val _NTO_KEYDATA_CALCULATE: UInt = 1u
public const val _NTO_KEYDATA_CALCULATE_REUSE: UInt = 2u
public const val _NTO_KEYDATA_PATHSIGN_VERIFY: UInt = 32768u
public const val _NTO_KEYDATA_PATHSIGN_CALCULATE: UInt = 32769u
public const val _NTO_KEYDATA_PATHSIGN_CALCULATE_REUSE: UInt = 32770u
public const val _NTO_SCTL_SETPRIOCEILING: UInt = 1u
public const val _NTO_SCTL_GETPRIOCEILING: UInt = 2u
public const val _NTO_SCTL_SETEVENT: UInt = 3u
public const val _NTO_SCTL_MUTEX_WAKEUP: UInt = 4u
public const val _NTO_SCTL_MUTEX_CONSISTENT: UInt = 5u
public const val _NTO_SCTL_SEM_VALUE: UInt = 6u
public const val _NTO_CLIENTINFO_GETGROUPS: UInt = 1u
public const val _NTO_CLIENTINFO_GETTYPEID: UInt = 2u

public expect fun channelCreate(flags: CUInt): CInt
public expect fun channelCreateR(flags: CUInt): CInt
public expect fun channelCreatePulsePool(flags: CUInt, config: NtoChannelConfig?): CInt
public expect fun channelCreateExt(flags: CUInt, mode: ModeT, bufsize: ULong, maxnumbuf: CUInt, ev: Sigevent?, cred: CredInfo?): CInt
public expect fun channelDestroy(chid: CInt): CInt
public expect fun channelDestroyR(chid: CInt): CInt
public expect fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUInt, flags: CInt): CInt
public expect fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUInt, flags: CInt): CInt
public expect fun connectDetach(coid: CInt): CInt
public expect fun connectDetachR(coid: CInt): CInt
public expect fun connectServerInfo(pid: PidT, coid: CInt, info: MsgInfo64?): CInt
public expect fun connectServerInfoR(pid: PidT, coid: CInt, info: MsgInfo64?): CInt
public expect fun connectClientInfoExtraArgs(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUInt?): CInt
public expect fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUInt?): CInt
public expect fun connectClientInfo(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt
public expect fun connectClientInfoR(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt
public expect fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt
public expect fun clientInfoExtFree(infoPp: COpaquePointer?): CInt
public expect fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: ClientAble?, nable: CInt): CInt
public expect fun connectFlags(pid: PidT, coid: CInt, mask: CUInt, bits: CUInt): CInt
public expect fun connectFlagsR(pid: PidT, coid: CInt, mask: CUInt, bits: CUInt): CInt
public expect fun channelConnectAttr(id: CUInt, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: CUInt): CInt
public expect fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong
public expect fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong
public expect fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong
public expect fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong
public expect fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong
public expect fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong
public expect fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong
public expect fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong
public expect fun msgSendvs(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong
public expect fun msgSendvsR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong
public expect fun msgSendvsnc(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong
public expect fun msgSendvsncR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong
public expect fun msgSendv(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong
public expect fun msgSendvR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong
public expect fun msgSendvnc(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong
public expect fun msgSendvncR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong
public expect fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt
public expect fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt
public expect fun msgReceivev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt
public expect fun msgReceivevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt
public expect fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt
public expect fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt
public expect fun msgReceivePulsev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt
public expect fun msgReceivePulsevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt
public expect fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt
public expect fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt
public expect fun msgReplyv(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt
public expect fun msgReplyvR(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt
public expect fun msgReadiov(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long
public expect fun msgReadiovR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long
public expect fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long
public expect fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long
public expect fun msgReadv(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long
public expect fun msgReadvR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long
public expect fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long
public expect fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long
public expect fun msgWritev(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long
public expect fun msgWritevR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long
public expect fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt
public expect fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt
public expect fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt
public expect fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt
public expect fun msgDeliverEvent(rcvid: CInt, event: Sigevent?): CInt
public expect fun msgDeliverEventR(rcvid: CInt, event: Sigevent?): CInt
public expect fun msgVerifyEvent(rcvid: CInt, event: Sigevent?): CInt
public expect fun msgVerifyEventR(rcvid: CInt, event: Sigevent?): CInt
public expect fun msgRegisterEvent(event: Sigevent?, coid: CInt): CInt
public expect fun msgRegisterEventR(event: Sigevent?, coid: CInt): CInt
public expect fun msgUnregisterEvent(event: Sigevent?): CInt
public expect fun msgUnregisterEventR(event: Sigevent?): CInt
public expect fun msgInfo(rcvid: CInt, info: MsgInfo64?): CInt
public expect fun msgInfoR(rcvid: CInt, info: MsgInfo64?): CInt
public expect fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt
public expect fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt
public expect fun msgError(rcvid: CInt, err: CInt): CInt
public expect fun msgErrorR(rcvid: CInt, err: CInt): CInt
public expect fun msgCurrent(rcvid: CInt): CInt
public expect fun msgCurrentR(rcvid: CInt): CInt
public expect fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUInt): CInt
public expect fun msgSendAsync(coid: CInt): CInt
public expect fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: CInt): CInt
public expect fun msgReceiveAsync(chid: CInt, iov: Iovec?, parts: CUInt): CInt
public expect fun msgPause(rcvid: CInt, cookie: CUInt): CInt
public expect fun msgPauseR(rcvid: CInt, cookie: CUInt): CInt
public expect fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt
public expect fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt
public expect fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt
public expect fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt
public expect fun signalReturn(info: SighandlerInfo?): CInt
public expect fun signalFault(sigcode: CUInt, regs: COpaquePointer?, refaddr: ULong): CInt
public expect fun signalAction(pid: PidT, sigstub: (() -> Unit)?, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt
public expect fun signalActionR(pid: PidT, sigstub: (() -> Unit)?, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt
public expect fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt
public expect fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt
public expect fun signalSuspend(set: SigsetT?): CInt
public expect fun signalSuspendR(set: SigsetT?): CInt
public expect fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): CInt
public expect fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): CInt
public expect fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt
public expect fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt
public expect fun threadCreate(pid: PidT, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): CInt
public expect fun threadCreateR(pid: PidT, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): CInt
public expect fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt
public expect fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt
public expect fun threadDetach(tid: CInt): CInt
public expect fun threadDetachR(tid: CInt): CInt
public expect fun threadJoin(tid: CInt, status: COpaquePointer?): CInt
public expect fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt
public expect fun threadCancel(tid: CInt, canstub: (() -> Unit)?): CInt
public expect fun threadCancelR(tid: CInt, canstub: (() -> Unit)?): CInt
public expect fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt
public expect fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt
public expect fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt
public expect fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt
public expect fun interruptHookTrace(handler: ((CInt) -> Sigevent?)?, flags: CUInt): CInt
public expect fun interruptHookIdle(handler: ((ULong?, QtimeEntry?) -> Unit)?, flags: CUInt): CInt
public expect fun interruptHookIdle2(handler: (() -> Unit)?, flags: CUInt): CInt
public expect fun interruptHookOverdriveEvent(event: Sigevent?, flags: CUInt): CInt
public expect fun interruptAttachEvent(intr: CInt, event: Sigevent?, flags: CUInt): CInt
public expect fun interruptAttachEventR(intr: CInt, event: Sigevent?, flags: CUInt): CInt
public expect fun interruptAttach(intr: CInt, handler: ((COpaquePointer?, CInt) -> Sigevent?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt
public expect fun interruptAttachR(intr: CInt, handler: ((COpaquePointer?, CInt) -> Sigevent?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt
public expect fun interruptAttachArray(intr: CInt, handler: ((COpaquePointer?, CInt) -> COpaquePointer?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt
public expect fun interruptAttachArrayR(intr: CInt, handler: ((COpaquePointer?, CInt) -> COpaquePointer?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt
public expect fun interruptDetach(id: CInt): CInt
public expect fun interruptDetachR(id: CInt): CInt
public expect fun interruptWait(flags: CInt, timeout: ULong?): CInt
public expect fun interruptWaitR(flags: CInt, timeout: ULong?): CInt
public expect fun interruptCharacteristic(type: CInt, id: CInt, new: CUInt?, old: CUInt?): CInt
public expect fun interruptCharacteristicR(type: CInt, id: CInt, new: CUInt?, old: CUInt?): CInt
public expect fun schedGet(pid: PidT, tid: CInt, param: SchedParam?): CInt
public expect fun schedGetR(pid: PidT, tid: CInt, param: SchedParam?): CInt
public expect fun schedGetCpuNum(): CUInt
public expect fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt
public expect fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt
public expect fun schedInfo(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt
public expect fun schedInfoR(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt
public expect fun schedYield(): CInt
public expect fun schedYieldR(): CInt
public expect fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt
public expect fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt
public expect fun schedJobCreate(job: NtoJobT?): CInt
public expect fun schedJobCreateR(job: NtoJobT?): CInt
public expect fun schedJobDestroy(job: NtoJobT?): CInt
public expect fun schedJobDestroyR(job: NtoJobT?): CInt
public expect fun schedWaypoint(job: NtoJobT?, new: Long?, max: Long?, old: Long?): CInt
public expect fun schedWaypointR(job: NtoJobT?, new: Long?, max: Long?, old: Long?): CInt
public expect fun timerCreate(id: ClockidT, notify: Sigevent?): CInt
public expect fun timerCreateR(id: ClockidT, notify: Sigevent?): CInt
public expect fun timerDestroy(id: TimerT): CInt
public expect fun timerDestroyR(id: TimerT): CInt
public expect fun timerSettime(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt
public expect fun timerSettimeR(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt
public expect fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt
public expect fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt
public expect fun timerAlarm(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt
public expect fun timerAlarmR(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt
public expect fun timerTimeout(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt
public expect fun timerTimeoutR(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt
public expect fun syncTypeCreate(type: CUInt, sync: SyncT?, attr: SyncAttr?): CInt
public expect fun syncTypeCreateR(type: CUInt, sync: SyncT?, attr: SyncAttr?): CInt
public expect fun syncDestroy(sync: SyncT?): CInt
public expect fun syncDestroyR(sync: SyncT?): CInt
public expect fun syncCtl(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt
public expect fun syncCtlR(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt
public expect fun syncMutexEvent(sync: SyncT?, event: Sigevent?): CInt
public expect fun syncMutexEventR(sync: SyncT?, event: Sigevent?): CInt
public expect fun syncMutexLock(sync: SyncT?): CInt
public expect fun syncMutexLockR(sync: SyncT?): CInt
public expect fun syncMutexUnlock(sync: SyncT?): CInt
public expect fun syncMutexUnlockR(sync: SyncT?): CInt
public expect fun syncMutexRevive(sync: SyncT?): CInt
public expect fun syncMutexReviveR(sync: SyncT?): CInt
public expect fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): CInt
public expect fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): CInt
public expect fun syncCondvarSignal(sync: SyncT?, all: CInt): CInt
public expect fun syncCondvarSignalR(sync: SyncT?, all: CInt): CInt
public expect fun syncSemPost(sync: SyncT?): CInt
public expect fun syncSemPostR(sync: SyncT?): CInt
public expect fun syncSemWait(sync: SyncT?, tryto: CInt): CInt
public expect fun syncSemWaitR(sync: SyncT?, tryto: CInt): CInt
public expect fun clockTime(id: ClockidT, new: ULong?, old: ULong?): CInt
public expect fun clockTimeR(id: ClockidT, new: ULong?, old: ULong?): CInt
public expect fun clockAdjust(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt
public expect fun clockAdjustR(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt
public expect fun clockPeriod(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt
public expect fun clockPeriodR(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt
public expect fun clockId(pid: PidT, tid: CInt): CInt
public expect fun clockIdR(pid: PidT, tid: CInt): CInt
public expect fun interruptMask(intr: CInt, id: CInt): CInt
public expect fun interruptUnmask(intr: CInt, id: CInt): CInt
