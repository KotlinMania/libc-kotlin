@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoChannelConnectAttr
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoChannelCreate
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoChannelCreateExt
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoChannelCreatePulsePool
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoChannelCreateR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoChannelDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoChannelDestroyR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoClientInfoExtFree
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoClockAdjust
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoClockAdjustR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoClockId
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoClockIdR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoClockPeriod
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoClockPeriodR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoClockTime
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoClockTimeR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectAttach
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectAttachR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectClientInfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectClientInfoAble
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectClientInfoExt
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectClientInfoExtraArgs
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectClientInfoExtraArgsR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectClientInfoR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectDetach
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectDetachR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectFlags
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectFlagsR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectServerInfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoConnectServerInfoR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptAttach
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptAttachArray
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptAttachArrayR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptAttachEvent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptAttachEventR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptAttachR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptCharacteristic
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptCharacteristicR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptDetach
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptDetachR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptHookIdle
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptHookIdle2
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptHookOverdriveEvent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptHookTrace
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptMask
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptUnmask
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptWait
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoInterruptWaitR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgCurrent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgCurrentR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgDeliverEvent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgDeliverEventR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgError
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgErrorR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgInfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgInfoR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgKeyData
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgKeyDataR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgPause
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgPauseR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgRead
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReadR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReadiov
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReadiovR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReadv
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReadvR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceive
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceiveAsync
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceiveAsyncGbl
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceivePulse
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceivePulseR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceivePulsev
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceivePulsevR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceiveR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceivev
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReceivevR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgRegisterEvent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgRegisterEventR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReply
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReplyR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReplyv
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgReplyvR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSend
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendAsync
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendAsyncGbl
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendPulse
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendPulsePtr
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendPulsePtrR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendPulseR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendnc
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendncR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendsv
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendsvR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendsvnc
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendsvncR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendv
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendvR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendvnc
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendvncR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendvs
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendvsR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendvsnc
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgSendvsncR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgUnregisterEvent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgUnregisterEventR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgVerifyEvent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgVerifyEventR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgWrite
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgWriteR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgWritev
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoMsgWritevR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedCtl
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedCtlR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedGet
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedGetCpuNum
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedGetR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedInfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedInfoR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedJobCreate
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedJobCreateR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedJobDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedJobDestroyR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedSet
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedSetR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedWaypoint
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedWaypointR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedYield
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSchedYieldR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalAction
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalActionR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalFault
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalKill
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalKillR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalKillSigval
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalKillSigvalR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalProcmask
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalProcmaskR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalReturn
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalSuspend
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalSuspendR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalWaitinfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalWaitinfoMask
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalWaitinfoMaskR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSignalWaitinfoR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncCondvarSignal
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncCondvarSignalR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncCondvarWait
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncCondvarWaitR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncCtl
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncCtlR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncDestroyR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncMutexEvent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncMutexEventR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncMutexLock
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncMutexLockR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncMutexRevive
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncMutexReviveR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncMutexUnlock
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncMutexUnlockR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncSemPost
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncSemPostR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncSemWait
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncSemWaitR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncTypeCreate
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoSyncTypeCreateR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadCancel
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadCancelR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadCreate
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadCreateR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadCtl
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadCtlExt
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadCtlExtR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadCtlR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadDestroyR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadDetach
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadDetachR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadJoin
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoThreadJoinR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerAlarm
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerAlarmR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerCreate
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerCreateR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerDestroyR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerInfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerInfoR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerSettime
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerSettimeR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerTimeout
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNeutrinoTimerTimeoutR
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun channelCreate(flags: CUint): CInt =
    libcUnixNtoNeutrinoChannelCreate(flags)

public actual fun channelCreateR(flags: CUint): CInt =
    libcUnixNtoNeutrinoChannelCreateR(flags)

public actual fun channelCreatePulsePool(flags: CUint, config: ConstPtr<NtoChannelConfig>): CInt =
    libcUnixNtoNeutrinoChannelCreatePulsePool(flags, config.rawAddress.toCPointer<ByteVar>())

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: ConstPtr<Sigevent>, cred: MutPtr<CredInfo>): CInt =
    libcUnixNtoNeutrinoChannelCreateExt(flags, mode, bufsize, maxnumbuf, ev.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>())

public actual fun channelDestroy(chid: CInt): CInt =
    libcUnixNtoNeutrinoChannelDestroy(chid)

public actual fun channelDestroyR(chid: CInt): CInt =
    libcUnixNtoNeutrinoChannelDestroyR(chid)

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    libcUnixNtoNeutrinoConnectAttach(nd, pid, chid, index, flags)

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    libcUnixNtoNeutrinoConnectAttachR(nd, pid, chid, index, flags)

public actual fun connectDetach(coid: CInt): CInt =
    libcUnixNtoNeutrinoConnectDetach(coid)

public actual fun connectDetachR(coid: CInt): CInt =
    libcUnixNtoNeutrinoConnectDetachR(coid)

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoConnectServerInfo(pid, coid, info.rawAddress.toCPointer<ByteVar>())

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoConnectServerInfoR(pid, coid, info.rawAddress.toCPointer<ByteVar>())

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt =
    libcUnixNtoNeutrinoConnectClientInfoExtraArgs(scoid, infoPp.rawAddress.toCPointer<ByteVar>(), ngroups, abilities.rawAddress.toCPointer<ByteVar>(), nable, typeId.rawAddress.toCPointer<ByteVar>())

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt =
    libcUnixNtoNeutrinoConnectClientInfoExtraArgsR(scoid, infoPp.rawAddress.toCPointer<ByteVar>(), ngroups, abilities.rawAddress.toCPointer<ByteVar>(), nable, typeId.rawAddress.toCPointer<ByteVar>())

public actual fun connectClientInfo(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt =
    libcUnixNtoNeutrinoConnectClientInfo(scoid, info.rawAddress.toCPointer<ByteVar>(), ngroups)

public actual fun connectClientInfoR(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt =
    libcUnixNtoNeutrinoConnectClientInfoR(scoid, info.rawAddress.toCPointer<ByteVar>(), ngroups)

public actual fun connectClientInfoExt(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt): CInt =
    libcUnixNtoNeutrinoConnectClientInfoExt(scoid, infoPp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun clientInfoExtFree(infoPp: MutPtr<MutPtr<ClientInfo>>): CInt =
    libcUnixNtoNeutrinoClientInfoExtFree(infoPp.rawAddress.toCPointer<ByteVar>())

public actual fun connectClientInfoAble(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt, abilities: MutPtr<ClientAble>, nable: CInt): CInt =
    libcUnixNtoNeutrinoConnectClientInfoAble(scoid, infoPp.rawAddress.toCPointer<ByteVar>(), flags, abilities.rawAddress.toCPointer<ByteVar>(), nable)

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    libcUnixNtoNeutrinoConnectFlags(pid, coid, mask, bits)

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    libcUnixNtoNeutrinoConnectFlagsR(pid, coid, mask, bits)

public actual fun channelConnectAttr(id: CUint, oldAttr: MutPtr<ChannelConnectAttr>, newAttr: MutPtr<ChannelConnectAttr>, flags: CUint): CInt =
    libcUnixNtoNeutrinoChannelConnectAttr(id, oldAttr.rawAddress.toCPointer<ByteVar>(), newAttr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun msgSend(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    libcUnixNtoNeutrinoMsgSend(coid, smsg.rawAddress.toCPointer<ByteVar>(), sbytes, rmsg.rawAddress.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendR(coid, smsg.rawAddress.toCPointer<ByteVar>(), sbytes, rmsg.rawAddress.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendnc(coid, smsg.rawAddress.toCPointer<ByteVar>(), sbytes, rmsg.rawAddress.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendncR(coid, smsg.rawAddress.toCPointer<ByteVar>(), sbytes, rmsg.rawAddress.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendsv(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendsv(coid, smsg.rawAddress.toCPointer<ByteVar>(), sbytes, riov.rawAddress.toCPointer<ByteVar>(), rparts)

public actual fun msgSendsvR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendsvR(coid, smsg.rawAddress.toCPointer<ByteVar>(), sbytes, riov.rawAddress.toCPointer<ByteVar>(), rparts)

public actual fun msgSendsvnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendsvnc(coid, smsg.rawAddress.toCPointer<ByteVar>(), sbytes, riov.rawAddress.toCPointer<ByteVar>(), rparts)

public actual fun msgSendsvncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendsvncR(coid, smsg.rawAddress.toCPointer<ByteVar>(), sbytes, riov.rawAddress.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvs(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendvs(coid, siov.rawAddress.toCPointer<ByteVar>(), sparts, rmsg.rawAddress.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendvsR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendvsR(coid, siov.rawAddress.toCPointer<ByteVar>(), sparts, rmsg.rawAddress.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendvsnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendvsnc(coid, siov.rawAddress.toCPointer<ByteVar>(), sparts, rmsg.rawAddress.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendvsncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendvsncR(coid, siov.rawAddress.toCPointer<ByteVar>(), sparts, rmsg.rawAddress.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendv(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendv(coid, siov.rawAddress.toCPointer<ByteVar>(), sparts, riov.rawAddress.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendvR(coid, siov.rawAddress.toCPointer<ByteVar>(), sparts, riov.rawAddress.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendvnc(coid, siov.rawAddress.toCPointer<ByteVar>(), sparts, riov.rawAddress.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    libcUnixNtoNeutrinoMsgSendvncR(coid, siov.rawAddress.toCPointer<ByteVar>(), sparts, riov.rawAddress.toCPointer<ByteVar>(), rparts)

public actual fun msgReceive(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgReceive(chid, msg.rawAddress.toCPointer<ByteVar>(), bytes, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgReceiveR(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgReceiveR(chid, msg.rawAddress.toCPointer<ByteVar>(), bytes, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgReceivev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgReceivev(chid, iov.rawAddress.toCPointer<ByteVar>(), parts, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgReceivevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgReceivevR(chid, iov.rawAddress.toCPointer<ByteVar>(), parts, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgReceivePulse(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgReceivePulse(chid, pulse.rawAddress.toCPointer<ByteVar>(), bytes, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgReceivePulseR(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgReceivePulseR(chid, pulse.rawAddress.toCPointer<ByteVar>(), bytes, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgReceivePulsev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgReceivePulsev(chid, iov.rawAddress.toCPointer<ByteVar>(), parts, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgReceivePulsevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgReceivePulsevR(chid, iov.rawAddress.toCPointer<ByteVar>(), parts, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgReply(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt =
    libcUnixNtoNeutrinoMsgReply(rcvid, status, msg.rawAddress.toCPointer<ByteVar>(), bytes)

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt =
    libcUnixNtoNeutrinoMsgReplyR(rcvid, status, msg.rawAddress.toCPointer<ByteVar>(), bytes)

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt =
    libcUnixNtoNeutrinoMsgReplyv(rcvid, status, iov.rawAddress.toCPointer<ByteVar>(), parts)

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt =
    libcUnixNtoNeutrinoMsgReplyvR(rcvid, status, iov.rawAddress.toCPointer<ByteVar>(), parts)

public actual fun msgReadiov(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long =
    libcUnixNtoNeutrinoMsgReadiov(rcvid, iov.rawAddress.toCPointer<ByteVar>(), parts, offset, flags)

public actual fun msgReadiovR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long =
    libcUnixNtoNeutrinoMsgReadiovR(rcvid, iov.rawAddress.toCPointer<ByteVar>(), parts, offset, flags)

public actual fun msgRead(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    libcUnixNtoNeutrinoMsgRead(rcvid, msg.rawAddress.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgReadR(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    libcUnixNtoNeutrinoMsgReadR(rcvid, msg.rawAddress.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgReadv(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    libcUnixNtoNeutrinoMsgReadv(rcvid, iov.rawAddress.toCPointer<ByteVar>(), parts, offset)

public actual fun msgReadvR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    libcUnixNtoNeutrinoMsgReadvR(rcvid, iov.rawAddress.toCPointer<ByteVar>(), parts, offset)

public actual fun msgWrite(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    libcUnixNtoNeutrinoMsgWrite(rcvid, msg.rawAddress.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgWriteR(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    libcUnixNtoNeutrinoMsgWriteR(rcvid, msg.rawAddress.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgWritev(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    libcUnixNtoNeutrinoMsgWritev(rcvid, iov.rawAddress.toCPointer<ByteVar>(), parts, offset)

public actual fun msgWritevR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    libcUnixNtoNeutrinoMsgWritevR(rcvid, iov.rawAddress.toCPointer<ByteVar>(), parts, offset)

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    libcUnixNtoNeutrinoMsgSendPulse(coid, priority, code, value)

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    libcUnixNtoNeutrinoMsgSendPulseR(coid, priority, code, value)

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoMsgSendPulsePtr(coid, priority, code, value.rawAddress.toCPointer<ByteVar>())

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoMsgSendPulsePtrR(coid, priority, code, value.rawAddress.toCPointer<ByteVar>())

public actual fun msgDeliverEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoMsgDeliverEvent(rcvid, event.rawAddress.toCPointer<ByteVar>())

public actual fun msgDeliverEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoMsgDeliverEventR(rcvid, event.rawAddress.toCPointer<ByteVar>())

public actual fun msgVerifyEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoMsgVerifyEvent(rcvid, event.rawAddress.toCPointer<ByteVar>())

public actual fun msgVerifyEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoMsgVerifyEventR(rcvid, event.rawAddress.toCPointer<ByteVar>())

public actual fun msgRegisterEvent(event: MutPtr<Sigevent>, coid: CInt): CInt =
    libcUnixNtoNeutrinoMsgRegisterEvent(event.rawAddress.toCPointer<ByteVar>(), coid)

public actual fun msgRegisterEventR(event: MutPtr<Sigevent>, coid: CInt): CInt =
    libcUnixNtoNeutrinoMsgRegisterEventR(event.rawAddress.toCPointer<ByteVar>(), coid)

public actual fun msgUnregisterEvent(event: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoMsgUnregisterEvent(event.rawAddress.toCPointer<ByteVar>())

public actual fun msgUnregisterEventR(event: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoMsgUnregisterEventR(event.rawAddress.toCPointer<ByteVar>())

public actual fun msgInfo(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgInfo(rcvid, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgInfoR(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt =
    libcUnixNtoNeutrinoMsgInfoR(rcvid, info.rawAddress.toCPointer<ByteVar>())

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt =
    libcUnixNtoNeutrinoMsgKeyData(rcvid, oper, key, newkey.rawAddress.toCPointer<ByteVar>(), iov.rawAddress.toCPointer<ByteVar>(), parts)

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt =
    libcUnixNtoNeutrinoMsgKeyDataR(rcvid, oper, key, newkey.rawAddress.toCPointer<ByteVar>(), iov.rawAddress.toCPointer<ByteVar>(), parts)

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    libcUnixNtoNeutrinoMsgError(rcvid, err)

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    libcUnixNtoNeutrinoMsgErrorR(rcvid, err)

public actual fun msgCurrent(rcvid: CInt): CInt =
    libcUnixNtoNeutrinoMsgCurrent(rcvid)

public actual fun msgCurrentR(rcvid: CInt): CInt =
    libcUnixNtoNeutrinoMsgCurrentR(rcvid)

public actual fun msgSendAsyncGbl(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, msgPrio: CUint): CInt =
    libcUnixNtoNeutrinoMsgSendAsyncGbl(coid, smsg.rawAddress.toCPointer<ByteVar>(), sbytes, msgPrio)

public actual fun msgSendAsync(coid: CInt): CInt =
    libcUnixNtoNeutrinoMsgSendAsync(coid)

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: MutPtr<CVoid>, rbytes: ULong, info: MutPtr<MsgInfo64>, coid: CInt): CInt =
    libcUnixNtoNeutrinoMsgReceiveAsyncGbl(chid, rmsg.rawAddress.toCPointer<ByteVar>(), rbytes, info.rawAddress.toCPointer<ByteVar>(), coid)

public actual fun msgReceiveAsync(chid: CInt, iov: ConstPtr<Iovec>, parts: CUint): CInt =
    libcUnixNtoNeutrinoMsgReceiveAsync(chid, iov.rawAddress.toCPointer<ByteVar>(), parts)

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    libcUnixNtoNeutrinoMsgPause(rcvid, cookie)

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    libcUnixNtoNeutrinoMsgPauseR(rcvid, cookie)

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    libcUnixNtoNeutrinoSignalKill(nd, pid, tid, signo, code, value)

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    libcUnixNtoNeutrinoSignalKillR(nd, pid, tid, signo, code, value)

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt =
    libcUnixNtoNeutrinoSignalKillSigval(nd, pid, tid, signo, code, value.rawAddress.toCPointer<ByteVar>())

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt =
    libcUnixNtoNeutrinoSignalKillSigvalR(nd, pid, tid, signo, code, value.rawAddress.toCPointer<ByteVar>())

public actual fun signalReturn(info: MutPtr<SighandlerInfo>): CInt =
    libcUnixNtoNeutrinoSignalReturn(info.rawAddress.toCPointer<ByteVar>())

public actual fun signalFault(sigcode: CUint, regs: MutPtr<CVoid>, refaddr: ULong): CInt =
    libcUnixNtoNeutrinoSignalFault(sigcode, regs.rawAddress.toCPointer<ByteVar>(), refaddr)

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    libcUnixNtoNeutrinoSignalAction(pid, 0L.toCPointer<ByteVar>(), signo, act.rawAddress.toCPointer<ByteVar>(), oact.rawAddress.toCPointer<ByteVar>())

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    libcUnixNtoNeutrinoSignalActionR(pid, 0L.toCPointer<ByteVar>(), signo, act.rawAddress.toCPointer<ByteVar>(), oact.rawAddress.toCPointer<ByteVar>())

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcUnixNtoNeutrinoSignalProcmask(pid, tid, how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcUnixNtoNeutrinoSignalProcmaskR(pid, tid, how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun signalSuspend(set: ConstPtr<SigsetT>): CInt =
    libcUnixNtoNeutrinoSignalSuspend(set.rawAddress.toCPointer<ByteVar>())

public actual fun signalSuspendR(set: ConstPtr<SigsetT>): CInt =
    libcUnixNtoNeutrinoSignalSuspendR(set.rawAddress.toCPointer<ByteVar>())

public actual fun signalWaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    libcUnixNtoNeutrinoSignalWaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun signalWaitinfoR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    libcUnixNtoNeutrinoSignalWaitinfoR(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun signalWaitinfoMask(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt =
    libcUnixNtoNeutrinoSignalWaitinfoMask(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), mask.rawAddress.toCPointer<ByteVar>())

public actual fun signalWaitinfoMaskR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt =
    libcUnixNtoNeutrinoSignalWaitinfoMaskR(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), mask.rawAddress.toCPointer<ByteVar>())

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt =
    libcUnixNtoNeutrinoThreadCreate(pid, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt =
    libcUnixNtoNeutrinoThreadCreateR(pid, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun threadDestroy(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoThreadDestroy(tid, priority, status.rawAddress.toCPointer<ByteVar>())

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoThreadDestroyR(tid, priority, status.rawAddress.toCPointer<ByteVar>())

public actual fun threadDetach(tid: CInt): CInt =
    libcUnixNtoNeutrinoThreadDetach(tid)

public actual fun threadDetachR(tid: CInt): CInt =
    libcUnixNtoNeutrinoThreadDetachR(tid)

public actual fun threadJoin(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt =
    libcUnixNtoNeutrinoThreadJoin(tid, status.rawAddress.toCPointer<ByteVar>())

public actual fun threadJoinR(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt =
    libcUnixNtoNeutrinoThreadJoinR(tid, status.rawAddress.toCPointer<ByteVar>())

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    libcUnixNtoNeutrinoThreadCancel(tid, 0L.toCPointer<ByteVar>())

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    libcUnixNtoNeutrinoThreadCancelR(tid, 0L.toCPointer<ByteVar>())

public actual fun threadCtl(cmd: CInt, data: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoThreadCtl(cmd, data.rawAddress.toCPointer<ByteVar>())

public actual fun threadCtlR(cmd: CInt, data: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoThreadCtlR(cmd, data.rawAddress.toCPointer<ByteVar>())

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoThreadCtlExt(pid, tid, cmd, data.rawAddress.toCPointer<ByteVar>())

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoThreadCtlExtR(pid, tid, cmd, data.rawAddress.toCPointer<ByteVar>())

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptHookTrace(0L.toCPointer<ByteVar>(), flags)

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptHookIdle(0L.toCPointer<ByteVar>(), flags)

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptHookIdle2(0L.toCPointer<ByteVar>(), flags)

public actual fun interruptHookOverdriveEvent(event: ConstPtr<Sigevent>, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptHookOverdriveEvent(event.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun interruptAttachEvent(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptAttachEvent(intr, event.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun interruptAttachEventR(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptAttachEventR(intr, event.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptAttach(intr, 0L.toCPointer<ByteVar>(), area.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptAttachR(intr, 0L.toCPointer<ByteVar>(), area.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptAttachArray(intr, 0L.toCPointer<ByteVar>(), area.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    libcUnixNtoNeutrinoInterruptAttachArrayR(intr, 0L.toCPointer<ByteVar>(), area.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun interruptDetach(id: CInt): CInt =
    libcUnixNtoNeutrinoInterruptDetach(id)

public actual fun interruptDetachR(id: CInt): CInt =
    libcUnixNtoNeutrinoInterruptDetachR(id)

public actual fun interruptWait(flags: CInt, timeout: ConstPtr<ULong>): CInt =
    libcUnixNtoNeutrinoInterruptWait(flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun interruptWaitR(flags: CInt, timeout: ConstPtr<ULong>): CInt =
    libcUnixNtoNeutrinoInterruptWaitR(flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt =
    libcUnixNtoNeutrinoInterruptCharacteristic(type, id, new.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>())

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt =
    libcUnixNtoNeutrinoInterruptCharacteristicR(type, id, new.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>())

public actual fun schedGet(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt =
    libcUnixNtoNeutrinoSchedGet(pid, tid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetR(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt =
    libcUnixNtoNeutrinoSchedGetR(pid, tid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetCpuNum(): CUint =
    libcUnixNtoNeutrinoSchedGetCpuNum()

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixNtoNeutrinoSchedSet(pid, tid, algorithm, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixNtoNeutrinoSchedSetR(pid, tid, algorithm, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt =
    libcUnixNtoNeutrinoSchedInfo(pid, algorithm, info.rawAddress.toCPointer<ByteVar>())

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt =
    libcUnixNtoNeutrinoSchedInfoR(pid, algorithm, info.rawAddress.toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    libcUnixNtoNeutrinoSchedYield()

public actual fun schedYieldR(): CInt =
    libcUnixNtoNeutrinoSchedYieldR()

public actual fun schedCtl(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt =
    libcUnixNtoNeutrinoSchedCtl(cmd, data.rawAddress.toCPointer<ByteVar>(), length)

public actual fun schedCtlR(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt =
    libcUnixNtoNeutrinoSchedCtlR(cmd, data.rawAddress.toCPointer<ByteVar>(), length)

public actual fun schedJobCreate(job: MutPtr<NtoJobT>): CInt =
    libcUnixNtoNeutrinoSchedJobCreate(job.rawAddress.toCPointer<ByteVar>())

public actual fun schedJobCreateR(job: MutPtr<NtoJobT>): CInt =
    libcUnixNtoNeutrinoSchedJobCreateR(job.rawAddress.toCPointer<ByteVar>())

public actual fun schedJobDestroy(job: MutPtr<NtoJobT>): CInt =
    libcUnixNtoNeutrinoSchedJobDestroy(job.rawAddress.toCPointer<ByteVar>())

public actual fun schedJobDestroyR(job: MutPtr<NtoJobT>): CInt =
    libcUnixNtoNeutrinoSchedJobDestroyR(job.rawAddress.toCPointer<ByteVar>())

public actual fun schedWaypoint(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt =
    libcUnixNtoNeutrinoSchedWaypoint(job.rawAddress.toCPointer<ByteVar>(), new.rawAddress.toCPointer<ByteVar>(), max.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>())

public actual fun schedWaypointR(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt =
    libcUnixNtoNeutrinoSchedWaypointR(job.rawAddress.toCPointer<ByteVar>(), new.rawAddress.toCPointer<ByteVar>(), max.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>())

public actual fun timerCreate(id: ClockidT, notify: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoTimerCreate(id, notify.rawAddress.toCPointer<ByteVar>())

public actual fun timerCreateR(id: ClockidT, notify: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoTimerCreateR(id, notify.rawAddress.toCPointer<ByteVar>())

public actual fun timerDestroy(id: TimerT): CInt =
    libcUnixNtoNeutrinoTimerDestroy(id.toLong().toCPointer<ByteVar>())

public actual fun timerDestroyR(id: TimerT): CInt =
    libcUnixNtoNeutrinoTimerDestroyR(id.toLong().toCPointer<ByteVar>())

public actual fun timerSettime(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt =
    libcUnixNtoNeutrinoTimerSettime(id.toLong().toCPointer<ByteVar>(), flags, itime.rawAddress.toCPointer<ByteVar>(), oitime.rawAddress.toCPointer<ByteVar>())

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt =
    libcUnixNtoNeutrinoTimerSettimeR(id.toLong().toCPointer<ByteVar>(), flags, itime.rawAddress.toCPointer<ByteVar>(), oitime.rawAddress.toCPointer<ByteVar>())

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt =
    libcUnixNtoNeutrinoTimerInfo(pid, id.toLong().toCPointer<ByteVar>(), flags, info.rawAddress.toCPointer<ByteVar>())

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt =
    libcUnixNtoNeutrinoTimerInfoR(pid, id.toLong().toCPointer<ByteVar>(), flags, info.rawAddress.toCPointer<ByteVar>())

public actual fun timerAlarm(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt =
    libcUnixNtoNeutrinoTimerAlarm(id, itime.rawAddress.toCPointer<ByteVar>(), otime.rawAddress.toCPointer<ByteVar>())

public actual fun timerAlarmR(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt =
    libcUnixNtoNeutrinoTimerAlarmR(id, itime.rawAddress.toCPointer<ByteVar>(), otime.rawAddress.toCPointer<ByteVar>())

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt =
    libcUnixNtoNeutrinoTimerTimeout(id, flags, notify.rawAddress.toCPointer<ByteVar>(), ntime.rawAddress.toCPointer<ByteVar>(), otime.rawAddress.toCPointer<ByteVar>())

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt =
    libcUnixNtoNeutrinoTimerTimeoutR(id, flags, notify.rawAddress.toCPointer<ByteVar>(), ntime.rawAddress.toCPointer<ByteVar>(), otime.rawAddress.toCPointer<ByteVar>())

public actual fun syncTypeCreate(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt =
    libcUnixNtoNeutrinoSyncTypeCreate(type, sync.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun syncTypeCreateR(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt =
    libcUnixNtoNeutrinoSyncTypeCreateR(type, sync.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun syncDestroy(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncDestroy(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncDestroyR(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncDestroyR(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncCtl(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoSyncCtl(cmd, sync.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun syncCtlR(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt =
    libcUnixNtoNeutrinoSyncCtlR(cmd, sync.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun syncMutexEvent(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoSyncMutexEvent(sync.rawAddress.toCPointer<ByteVar>(), event.rawAddress.toCPointer<ByteVar>())

public actual fun syncMutexEventR(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt =
    libcUnixNtoNeutrinoSyncMutexEventR(sync.rawAddress.toCPointer<ByteVar>(), event.rawAddress.toCPointer<ByteVar>())

public actual fun syncMutexLock(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncMutexLock(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncMutexLockR(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncMutexLockR(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncMutexUnlock(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncMutexUnlock(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncMutexUnlockR(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncMutexUnlockR(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncMutexRevive(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncMutexRevive(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncMutexReviveR(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncMutexReviveR(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncCondvarWait(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncCondvarWait(sync.rawAddress.toCPointer<ByteVar>(), mutex.rawAddress.toCPointer<ByteVar>())

public actual fun syncCondvarWaitR(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncCondvarWaitR(sync.rawAddress.toCPointer<ByteVar>(), mutex.rawAddress.toCPointer<ByteVar>())

public actual fun syncCondvarSignal(sync: MutPtr<SyncT>, all: CInt): CInt =
    libcUnixNtoNeutrinoSyncCondvarSignal(sync.rawAddress.toCPointer<ByteVar>(), all)

public actual fun syncCondvarSignalR(sync: MutPtr<SyncT>, all: CInt): CInt =
    libcUnixNtoNeutrinoSyncCondvarSignalR(sync.rawAddress.toCPointer<ByteVar>(), all)

public actual fun syncSemPost(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncSemPost(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncSemPostR(sync: MutPtr<SyncT>): CInt =
    libcUnixNtoNeutrinoSyncSemPostR(sync.rawAddress.toCPointer<ByteVar>())

public actual fun syncSemWait(sync: MutPtr<SyncT>, tryto: CInt): CInt =
    libcUnixNtoNeutrinoSyncSemWait(sync.rawAddress.toCPointer<ByteVar>(), tryto)

public actual fun syncSemWaitR(sync: MutPtr<SyncT>, tryto: CInt): CInt =
    libcUnixNtoNeutrinoSyncSemWaitR(sync.rawAddress.toCPointer<ByteVar>(), tryto)

public actual fun clockTime(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt =
    libcUnixNtoNeutrinoClockTime(id, new.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>())

public actual fun clockTimeR(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt =
    libcUnixNtoNeutrinoClockTimeR(id, new.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>())

public actual fun clockAdjust(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt =
    libcUnixNtoNeutrinoClockAdjust(id, new.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>())

public actual fun clockAdjustR(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt =
    libcUnixNtoNeutrinoClockAdjustR(id, new.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>())

public actual fun clockPeriod(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt =
    libcUnixNtoNeutrinoClockPeriod(id, new.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>(), reserved)

public actual fun clockPeriodR(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt =
    libcUnixNtoNeutrinoClockPeriodR(id, new.rawAddress.toCPointer<ByteVar>(), old.rawAddress.toCPointer<ByteVar>(), reserved)

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    libcUnixNtoNeutrinoClockId(pid, tid)

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    libcUnixNtoNeutrinoClockIdR(pid, tid)

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    libcUnixNtoNeutrinoInterruptMask(intr, id)

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    libcUnixNtoNeutrinoInterruptUnmask(intr, id)
