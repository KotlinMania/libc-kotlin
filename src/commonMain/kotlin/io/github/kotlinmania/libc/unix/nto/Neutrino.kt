// port-lint: source unix/nto/neutrino.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

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
    val value: UInt,
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
    val pid: Int,
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
    val ruid: UInt,
    val euid: UInt,
    val suid: UInt,
    val rgid: UInt,
    val egid: UInt,
    val sgid: UInt,
    val ngroups: UInt,
    val grouplist: List<UInt>,
)

public data class ClientInfo(
    val nd: UInt,
    val pid: Int,
    val sid: Int,
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
    val numPulses: UInt,
    val rearmThreshold: UInt,
    val options: UInt,
)

public class AsyncmsgPutHeader

public class AsyncmsgConnectionAttr

public class AsyncmsgConnectionDescriptor

public data class CAnonymousStructEv(
    val event: Sigevent,
    val coid: Int,
)

public data class ChannelConnectAttr(
    val ev: CAnonymousStructEv,
)

public data class SighandlerInfo(
    val siginfo: SiginfoT,
    val handler: ((Int) -> Unit)?,
    val context: COpaquePointer?,
)

public data class CAnonymousStructTime(
    val length: UInt,
    val scale: UInt,
)

public data class IdleHook(
    val hookSize: UInt,
    val cmd: UInt,
    val mode: UInt,
    val latency: UInt,
    val nextFire: ULong,
    val currTime: ULong,
    val todAdjust: ULong,
    val resp: UInt,
    val time: CAnonymousStructTime,
    val trigger: Sigevent,
    val intrs: UInt?,
    val blockStackSize: UInt,
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
    val priorityMin: Int,
    val priorityMax: Int,
    val interval: ULong,
    val priorityPriv: Int,
)

public data class TimerInfo(
    val itime: Itimer,
    val otime: Itimer,
    val flags: UInt,
    val tid: Int,
    val notify: Int,
    val clockid: Int,
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
public val SYSMGR_COID: UInt = _NTO_SIDE_CHANNEL
public const val SYSMGR_HANDLE: UInt = 0u
public const val STATE_DEAD: Int = 0x00
public const val STATE_RUNNING: Int = 0x01
public const val STATE_READY: Int = 0x02
public const val STATE_STOPPED: Int = 0x03
public const val STATE_SEND: Int = 0x04
public const val STATE_RECEIVE: Int = 0x05
public const val STATE_REPLY: Int = 0x06
public const val STATE_STACK: Int = 0x07
public const val STATE_WAITTHREAD: Int = 0x08
public const val STATE_WAITPAGE: Int = 0x09
public const val STATE_SIGSUSPEND: Int = 0x0a
public const val STATE_SIGWAITINFO: Int = 0x0b
public const val STATE_NANOSLEEP: Int = 0x0c
public const val STATE_MUTEX: Int = 0x0d
public const val STATE_CONDVAR: Int = 0x0e
public const val STATE_JOIN: Int = 0x0f
public const val STATE_INTR: Int = 0x10
public const val STATE_SEM: Int = 0x11
public const val STATE_WAITCTX: Int = 0x12
public const val STATE_NET_SEND: Int = 0x13
public const val STATE_NET_REPLY: Int = 0x14
public const val STATE_MAX: Int = 0x18
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
public val _NTO_TIMEOUT_MASK: UInt = (1u shl STATE_MAX) - 1u
public val _NTO_TIMEOUT_ACTIVE: UInt = 1u shl STATE_MAX
public val _NTO_TIMEOUT_IMMEDIATE: UInt = 1u shl (STATE_MAX + 1)
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

public expect fun channelCreate(flags: UInt): Int

public expect fun channelCreateR(flags: UInt): Int

public expect fun channelCreatePulsePool(flags: UInt, config: NtoChannelConfig?): Int

public expect fun channelCreateExt(flags: UInt, mode: UInt, bufsize: ULong, maxnumbuf: UInt, ev: Sigevent?, cred: CredInfo?): Int

public expect fun channelDestroy(chid: Int): Int

public expect fun channelDestroyR(chid: Int): Int

public expect fun connectAttach(nd: UInt, pid: Int, chid: Int, index: UInt, flags: Int): Int

public expect fun connectAttachR(nd: UInt, pid: Int, chid: Int, index: UInt, flags: Int): Int

public expect fun connectDetach(coid: Int): Int

public expect fun connectDetachR(coid: Int): Int

public expect fun connectServerInfo(pid: Int, coid: Int, info: MsgInfo64?): Int

public expect fun connectServerInfoR(pid: Int, coid: Int, info: MsgInfo64?): Int

public expect fun connectClientInfoExtraArgs(scoid: Int, infoPp: ClientInfo?, ngroups: Int, abilities: ClientAble?, nable: Int, typeId: UInt?): Int

public expect fun connectClientInfoExtraArgsR(scoid: Int, infoPp: ClientInfo?, ngroups: Int, abilities: ClientAble?, nable: Int, typeId: UInt?): Int

public expect fun connectClientInfo(scoid: Int, info: ClientInfo?, ngroups: Int): Int

public expect fun connectClientInfoR(scoid: Int, info: ClientInfo?, ngroups: Int): Int

public expect fun connectClientInfoExt(scoid: Int, infoPp: COpaquePointer?, flags: Int): Int

public expect fun clientInfoExtFree(infoPp: COpaquePointer?): Int

public expect fun connectClientInfoAble(scoid: Int, infoPp: COpaquePointer?, flags: Int, abilities: ClientAble?, nable: Int): Int

public expect fun connectFlags(pid: Int, coid: Int, mask: UInt, bits: UInt): Int

public expect fun connectFlagsR(pid: Int, coid: Int, mask: UInt, bits: UInt): Int

public expect fun channelConnectAttr(id: UInt, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: UInt): Int

public expect fun msgSend(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long

public expect fun msgSendR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long

public expect fun msgSendnc(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long

public expect fun msgSendncR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long

public expect fun msgSendsv(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long

public expect fun msgSendsvR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long

public expect fun msgSendsvnc(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long

public expect fun msgSendsvncR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long

public expect fun msgSendvs(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long

public expect fun msgSendvsR(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long

public expect fun msgSendvsnc(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long

public expect fun msgSendvsncR(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long

public expect fun msgSendv(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long

public expect fun msgSendvR(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long

public expect fun msgSendvnc(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long

public expect fun msgSendvncR(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long

public expect fun msgReceive(chid: Int, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int

public expect fun msgReceiveR(chid: Int, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int

public expect fun msgReceivev(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int

public expect fun msgReceivevR(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int

public expect fun msgReceivePulse(chid: Int, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int

public expect fun msgReceivePulseR(chid: Int, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int

public expect fun msgReceivePulsev(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int

public expect fun msgReceivePulsevR(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int

public expect fun msgReply(rcvid: Int, status: Long, msg: COpaquePointer?, bytes: ULong): Int

public expect fun msgReplyR(rcvid: Int, status: Long, msg: COpaquePointer?, bytes: ULong): Int

public expect fun msgReplyv(rcvid: Int, status: Long, iov: Iovec?, parts: ULong): Int

public expect fun msgReplyvR(rcvid: Int, status: Long, iov: Iovec?, parts: ULong): Int

public expect fun msgReadiov(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong, flags: Int): Long

public expect fun msgReadiovR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong, flags: Int): Long

public expect fun msgRead(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long

public expect fun msgReadR(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long

public expect fun msgReadv(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long

public expect fun msgReadvR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long

public expect fun msgWrite(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long

public expect fun msgWriteR(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long

public expect fun msgWritev(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long

public expect fun msgWritevR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long

public expect fun msgSendPulse(coid: Int, priority: Int, code: Int, value: Int): Int

public expect fun msgSendPulseR(coid: Int, priority: Int, code: Int, value: Int): Int

public expect fun msgSendPulsePtr(coid: Int, priority: Int, code: Int, value: COpaquePointer?): Int

public expect fun msgSendPulsePtrR(coid: Int, priority: Int, code: Int, value: COpaquePointer?): Int

public expect fun msgDeliverEvent(rcvid: Int, event: Sigevent?): Int

public expect fun msgDeliverEventR(rcvid: Int, event: Sigevent?): Int

public expect fun msgVerifyEvent(rcvid: Int, event: Sigevent?): Int

public expect fun msgVerifyEventR(rcvid: Int, event: Sigevent?): Int

public expect fun msgRegisterEvent(event: Sigevent?, coid: Int): Int

public expect fun msgRegisterEventR(event: Sigevent?, coid: Int): Int

public expect fun msgUnregisterEvent(event: Sigevent?): Int

public expect fun msgUnregisterEventR(event: Sigevent?): Int

public expect fun msgInfo(rcvid: Int, info: MsgInfo64?): Int

public expect fun msgInfoR(rcvid: Int, info: MsgInfo64?): Int

public expect fun msgKeyData(rcvid: Int, oper: Int, key: UInt, newkey: UInt?, iov: Iovec?, parts: Int): Int

public expect fun msgKeyDataR(rcvid: Int, oper: Int, key: UInt, newkey: UInt?, iov: Iovec?, parts: Int): Int

public expect fun msgError(rcvid: Int, err: Int): Int

public expect fun msgErrorR(rcvid: Int, err: Int): Int

public expect fun msgCurrent(rcvid: Int): Int

public expect fun msgCurrentR(rcvid: Int): Int

public expect fun msgSendAsyncGbl(coid: Int, smsg: COpaquePointer?, sbytes: ULong, msgPrio: UInt): Int

public expect fun msgSendAsync(coid: Int): Int

public expect fun msgReceiveAsyncGbl(chid: Int, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: Int): Int

public expect fun msgReceiveAsync(chid: Int, iov: Iovec?, parts: UInt): Int

public expect fun msgPause(rcvid: Int, cookie: UInt): Int

public expect fun msgPauseR(rcvid: Int, cookie: UInt): Int

public expect fun signalKill(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int

public expect fun signalKillR(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int

public expect fun signalKillSigval(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Sigval?): Int

public expect fun signalKillSigvalR(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Sigval?): Int

public expect fun signalReturn(info: SighandlerInfo?): Int

public expect fun signalFault(sigcode: UInt, regs: COpaquePointer?, refaddr: ULong): Int

public expect fun signalAction(pid: Int, sigstub: (() -> Unit)?, signo: Int, act: Sigaction?, oact: Sigaction?): Int

public expect fun signalActionR(pid: Int, sigstub: (() -> Unit)?, signo: Int, act: Sigaction?, oact: Sigaction?): Int

public expect fun signalProcmask(pid: Int, tid: Int, how: Int, set: SigsetT?, oldset: SigsetT?): Int

public expect fun signalProcmaskR(pid: Int, tid: Int, how: Int, set: SigsetT?, oldset: SigsetT?): Int

public expect fun signalSuspend(set: SigsetT?): Int

public expect fun signalSuspendR(set: SigsetT?): Int

public expect fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): Int

public expect fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): Int

public expect fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): Int

public expect fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): Int

public expect fun threadCreate(pid: Int, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): Int

public expect fun threadCreateR(pid: Int, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): Int

public expect fun threadDestroy(tid: Int, priority: Int, status: COpaquePointer?): Int

public expect fun threadDestroyR(tid: Int, priority: Int, status: COpaquePointer?): Int

public expect fun threadDetach(tid: Int): Int

public expect fun threadDetachR(tid: Int): Int

public expect fun threadJoin(tid: Int, status: COpaquePointer?): Int

public expect fun threadJoinR(tid: Int, status: COpaquePointer?): Int

public expect fun threadCancel(tid: Int, canstub: (() -> Unit)?): Int

public expect fun threadCancelR(tid: Int, canstub: (() -> Unit)?): Int

public expect fun threadCtl(cmd: Int, data: COpaquePointer?): Int

public expect fun threadCtlR(cmd: Int, data: COpaquePointer?): Int

public expect fun threadCtlExt(pid: Int, tid: Int, cmd: Int, data: COpaquePointer?): Int

public expect fun threadCtlExtR(pid: Int, tid: Int, cmd: Int, data: COpaquePointer?): Int

public expect fun interruptHookTrace(handler: ((Int) -> Sigevent?)?, flags: UInt): Int

public expect fun interruptHookIdle(handler: ((ULong?, QtimeEntry?) -> Unit)?, flags: UInt): Int

public expect fun interruptHookIdle2(handler: (() -> Unit)?, flags: UInt): Int

public expect fun interruptHookOverdriveEvent(event: Sigevent?, flags: UInt): Int

public expect fun interruptAttachEvent(intr: Int, event: Sigevent?, flags: UInt): Int

public expect fun interruptAttachEventR(intr: Int, event: Sigevent?, flags: UInt): Int

public expect fun interruptAttach(intr: Int, handler: ((COpaquePointer?, Int) -> Sigevent?)?, area: COpaquePointer?, size: Int, flags: UInt): Int

public expect fun interruptAttachR(intr: Int, handler: ((COpaquePointer?, Int) -> Sigevent?)?, area: COpaquePointer?, size: Int, flags: UInt): Int

public expect fun interruptAttachArray(intr: Int, handler: ((COpaquePointer?, Int) -> COpaquePointer?)?, area: COpaquePointer?, size: Int, flags: UInt): Int

public expect fun interruptAttachArrayR(intr: Int, handler: ((COpaquePointer?, Int) -> COpaquePointer?)?, area: COpaquePointer?, size: Int, flags: UInt): Int

public expect fun interruptDetach(id: Int): Int

public expect fun interruptDetachR(id: Int): Int

public expect fun interruptWait(flags: Int, timeout: ULong?): Int

public expect fun interruptWaitR(flags: Int, timeout: ULong?): Int

public expect fun interruptCharacteristic(type: Int, id: Int, new: UInt?, old: UInt?): Int

public expect fun interruptCharacteristicR(type: Int, id: Int, new: UInt?, old: UInt?): Int

public expect fun schedGet(pid: Int, tid: Int, param: SchedParam?): Int

public expect fun schedGetR(pid: Int, tid: Int, param: SchedParam?): Int

public fun schedGetCpuNum(): UInt = 0u

public expect fun schedSet(pid: Int, tid: Int, algorithm: Int, param: SchedParam?): Int

public expect fun schedSetR(pid: Int, tid: Int, algorithm: Int, param: SchedParam?): Int

public expect fun schedInfo(pid: Int, algorithm: Int, info: SchedInfo?): Int

public expect fun schedInfoR(pid: Int, algorithm: Int, info: SchedInfo?): Int

public expect fun schedYield(): Int

public expect fun schedYieldR(): Int

public expect fun schedCtl(cmd: Int, data: COpaquePointer?, length: ULong): Int

public expect fun schedCtlR(cmd: Int, data: COpaquePointer?, length: ULong): Int

public expect fun schedJobCreate(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int

public expect fun schedJobCreateR(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int

public expect fun schedJobDestroy(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int

public expect fun schedJobDestroyR(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int

public expect fun schedWaypoint(job: io.github.kotlinmania.libc.unix.nto.SyncT?, new: Long?, max: Long?, old: Long?): Int

public expect fun schedWaypointR(job: io.github.kotlinmania.libc.unix.nto.SyncT?, new: Long?, max: Long?, old: Long?): Int

public expect fun timerCreate(id: Int, notify: Sigevent?): Int

public expect fun timerCreateR(id: Int, notify: Sigevent?): Int

public expect fun timerDestroy(id: Int): Int

public expect fun timerDestroyR(id: Int): Int

public expect fun timerSettime(id: Int, flags: Int, itime: Itimer?, oitime: Itimer?): Int

public expect fun timerSettimeR(id: Int, flags: Int, itime: Itimer?, oitime: Itimer?): Int

public expect fun timerInfo(pid: Int, id: Int, flags: Int, info: TimerInfo?): Int

public expect fun timerInfoR(pid: Int, id: Int, flags: Int, info: TimerInfo?): Int

public expect fun timerAlarm(id: Int, itime: Itimer?, otime: Itimer?): Int

public expect fun timerAlarmR(id: Int, itime: Itimer?, otime: Itimer?): Int

public expect fun timerTimeout(id: Int, flags: Int, notify: Sigevent?, ntime: ULong?, otime: ULong?): Int

public expect fun timerTimeoutR(id: Int, flags: Int, notify: Sigevent?, ntime: ULong?, otime: ULong?): Int

public expect fun syncTypeCreate(type: UInt, sync: SyncT?, attr: SyncAttr?): Int

public expect fun syncTypeCreateR(type: UInt, sync: SyncT?, attr: SyncAttr?): Int

public expect fun syncDestroy(sync: SyncT?): Int

public expect fun syncDestroyR(sync: SyncT?): Int

public expect fun syncCtl(cmd: Int, sync: SyncT?, data: COpaquePointer?): Int

public expect fun syncCtlR(cmd: Int, sync: SyncT?, data: COpaquePointer?): Int

public expect fun syncMutexEvent(sync: SyncT?, event: Sigevent?): Int

public expect fun syncMutexEventR(sync: SyncT?, event: Sigevent?): Int

public expect fun syncMutexLock(sync: SyncT?): Int

public expect fun syncMutexLockR(sync: SyncT?): Int

public expect fun syncMutexUnlock(sync: SyncT?): Int

public expect fun syncMutexUnlockR(sync: SyncT?): Int

public expect fun syncMutexRevive(sync: SyncT?): Int

public expect fun syncMutexReviveR(sync: SyncT?): Int

public expect fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): Int

public expect fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): Int

public expect fun syncCondvarSignal(sync: SyncT?, all: Int): Int

public expect fun syncCondvarSignalR(sync: SyncT?, all: Int): Int

public expect fun syncSemPost(sync: SyncT?): Int

public expect fun syncSemPostR(sync: SyncT?): Int

public expect fun syncSemWait(sync: SyncT?, tryto: Int): Int

public expect fun syncSemWaitR(sync: SyncT?, tryto: Int): Int

public expect fun clockTime(id: Int, new: ULong?, old: ULong?): Int

public expect fun clockTimeR(id: Int, new: ULong?, old: ULong?): Int

public expect fun clockAdjust(id: Int, new: Clockadjust?, old: Clockadjust?): Int

public expect fun clockAdjustR(id: Int, new: Clockadjust?, old: Clockadjust?): Int

public expect fun clockPeriod(id: Int, new: Clockperiod?, old: Clockperiod?, reserved: Int): Int

public expect fun clockPeriodR(id: Int, new: Clockperiod?, old: Clockperiod?, reserved: Int): Int

public expect fun clockId(pid: Int, tid: Int): Int

public expect fun clockIdR(pid: Int, tid: Int): Int

public expect fun interruptMask(intr: Int, id: Int): Int

public expect fun interruptUnmask(intr: Int, id: Int): Int
