@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT

public actual fun channelCreate(flags: CUint): CInt =
    0

public actual fun channelCreateR(flags: CUint): CInt =
    0

public actual fun channelCreatePulsePool(flags: CUint, config: COpaquePointer?): CInt =
    0

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: COpaquePointer?, cred: COpaquePointer?): CInt =
    0

public actual fun channelDestroy(chid: CInt): CInt =
    0

public actual fun channelDestroyR(chid: CInt): CInt =
    0

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    0

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    0

public actual fun connectDetach(coid: CInt): CInt =
    0

public actual fun connectDetachR(coid: CInt): CInt =
    0

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: COpaquePointer?): CInt =
    0

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: COpaquePointer?): CInt =
    0

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt =
    0

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt =
    0

public actual fun connectClientInfo(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt =
    0

public actual fun connectClientInfoR(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt =
    0

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    0

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: COpaquePointer?, nable: CInt): CInt =
    0

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    0

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    0

public actual fun channelConnectAttr(id: CUint, oldAttr: COpaquePointer?, newAttr: COpaquePointer?, flags: CUint): CInt =
    0

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    0L

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    0L

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    0L

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    0L

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    0L

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    0L

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    0L

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    0L

public actual fun msgSendvs(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    0L

public actual fun msgSendvsR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    0L

public actual fun msgSendvsnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    0L

public actual fun msgSendvsncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    0L

public actual fun msgSendv(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    0L

public actual fun msgSendvR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    0L

public actual fun msgSendvnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    0L

public actual fun msgSendvncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    0L

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    0

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    0

public actual fun msgReceivev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    0

public actual fun msgReceivevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    0

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    0

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    0

public actual fun msgReceivePulsev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    0

public actual fun msgReceivePulsevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    0

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    0

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    0

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt =
    0

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt =
    0

public actual fun msgReadiov(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long =
    0L

public actual fun msgReadiovR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long =
    0L

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    0L

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    0L

public actual fun msgReadv(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    0L

public actual fun msgReadvR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    0L

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    0L

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    0L

public actual fun msgWritev(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    0L

public actual fun msgWritevR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    0L

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    0

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    0

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    0

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    0

public actual fun msgDeliverEvent(rcvid: CInt, event: COpaquePointer?): CInt =
    0

public actual fun msgDeliverEventR(rcvid: CInt, event: COpaquePointer?): CInt =
    0

public actual fun msgVerifyEvent(rcvid: CInt, event: COpaquePointer?): CInt =
    0

public actual fun msgVerifyEventR(rcvid: CInt, event: COpaquePointer?): CInt =
    0

public actual fun msgRegisterEvent(event: COpaquePointer?, coid: CInt): CInt =
    0

public actual fun msgRegisterEventR(event: COpaquePointer?, coid: CInt): CInt =
    0

public actual fun msgUnregisterEvent(event: COpaquePointer?): CInt =
    0

public actual fun msgUnregisterEventR(event: COpaquePointer?): CInt =
    0

public actual fun msgInfo(rcvid: CInt, info: COpaquePointer?): CInt =
    0

public actual fun msgInfoR(rcvid: CInt, info: COpaquePointer?): CInt =
    0

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt =
    0

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt =
    0

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    0

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    0

public actual fun msgCurrent(rcvid: CInt): CInt =
    0

public actual fun msgCurrentR(rcvid: CInt): CInt =
    0

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUint): CInt =
    0

public actual fun msgSendAsync(coid: CInt): CInt =
    0

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: COpaquePointer?, coid: CInt): CInt =
    0

public actual fun msgReceiveAsync(chid: CInt, iov: COpaquePointer?, parts: CUint): CInt =
    0

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    0

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    0

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    0

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    0

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt =
    0

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt =
    0

public actual fun signalReturn(info: COpaquePointer?): CInt =
    0

public actual fun signalFault(sigcode: CUint, regs: COpaquePointer?, refaddr: ULong): CInt =
    0

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    0

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    0

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun signalSuspend(set: COpaquePointer?): CInt =
    0

public actual fun signalSuspendR(set: COpaquePointer?): CInt =
    0

public actual fun signalWaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    0

public actual fun signalWaitinfoR(set: COpaquePointer?, info: COpaquePointer?): CInt =
    0

public actual fun signalWaitinfoMask(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt =
    0

public actual fun signalWaitinfoMaskR(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt =
    0

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    0

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    0

public actual fun threadDetach(tid: CInt): CInt =
    0

public actual fun threadDetachR(tid: CInt): CInt =
    0

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    0

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    0

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    0

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    0

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    0

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    0

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    0

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    0

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    0

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    0

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    0

public actual fun interruptHookOverdriveEvent(event: COpaquePointer?, flags: CUint): CInt =
    0

public actual fun interruptAttachEvent(intr: CInt, event: COpaquePointer?, flags: CUint): CInt =
    0

public actual fun interruptAttachEventR(intr: CInt, event: COpaquePointer?, flags: CUint): CInt =
    0

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    0

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    0

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    0

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    0

public actual fun interruptDetach(id: CInt): CInt =
    0

public actual fun interruptDetachR(id: CInt): CInt =
    0

public actual fun interruptWait(flags: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun interruptWaitR(flags: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt =
    0

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt =
    0

public actual fun schedGet(pid: PidT, tid: CInt, param: COpaquePointer?): CInt =
    0

public actual fun schedGetR(pid: PidT, tid: CInt, param: COpaquePointer?): CInt =
    0

public actual fun schedGetCpuNum(): CUint =
    0u

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt =
    0

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt =
    0

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt =
    0

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt =
    0

public actual fun schedYield(): CInt =
    0

public actual fun schedYieldR(): CInt =
    0

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    0

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    0

public actual fun schedJobCreate(job: COpaquePointer?): CInt =
    0

public actual fun schedJobCreateR(job: COpaquePointer?): CInt =
    0

public actual fun schedJobDestroy(job: COpaquePointer?): CInt =
    0

public actual fun schedJobDestroyR(job: COpaquePointer?): CInt =
    0

public actual fun schedWaypoint(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt =
    0

public actual fun schedWaypointR(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt =
    0

public actual fun timerCreate(id: ClockidT, notify: COpaquePointer?): CInt =
    0

public actual fun timerCreateR(id: ClockidT, notify: COpaquePointer?): CInt =
    0

public actual fun timerDestroy(id: TimerT): CInt =
    0

public actual fun timerDestroyR(id: TimerT): CInt =
    0

public actual fun timerSettime(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt =
    0

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt =
    0

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt =
    0

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt =
    0

public actual fun timerAlarm(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt =
    0

public actual fun timerAlarmR(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt =
    0

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt =
    0

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt =
    0

public actual fun syncTypeCreate(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun syncTypeCreateR(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun syncDestroy(sync: COpaquePointer?): CInt =
    0

public actual fun syncDestroyR(sync: COpaquePointer?): CInt =
    0

public actual fun syncCtl(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt =
    0

public actual fun syncCtlR(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt =
    0

public actual fun syncMutexEvent(sync: COpaquePointer?, event: COpaquePointer?): CInt =
    0

public actual fun syncMutexEventR(sync: COpaquePointer?, event: COpaquePointer?): CInt =
    0

public actual fun syncMutexLock(sync: COpaquePointer?): CInt =
    0

public actual fun syncMutexLockR(sync: COpaquePointer?): CInt =
    0

public actual fun syncMutexUnlock(sync: COpaquePointer?): CInt =
    0

public actual fun syncMutexUnlockR(sync: COpaquePointer?): CInt =
    0

public actual fun syncMutexRevive(sync: COpaquePointer?): CInt =
    0

public actual fun syncMutexReviveR(sync: COpaquePointer?): CInt =
    0

public actual fun syncCondvarWait(sync: COpaquePointer?, mutex: COpaquePointer?): CInt =
    0

public actual fun syncCondvarWaitR(sync: COpaquePointer?, mutex: COpaquePointer?): CInt =
    0

public actual fun syncCondvarSignal(sync: COpaquePointer?, all: CInt): CInt =
    0

public actual fun syncCondvarSignalR(sync: COpaquePointer?, all: CInt): CInt =
    0

public actual fun syncSemPost(sync: COpaquePointer?): CInt =
    0

public actual fun syncSemPostR(sync: COpaquePointer?): CInt =
    0

public actual fun syncSemWait(sync: COpaquePointer?, tryto: CInt): CInt =
    0

public actual fun syncSemWaitR(sync: COpaquePointer?, tryto: CInt): CInt =
    0

public actual fun clockTime(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    0

public actual fun clockTimeR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    0

public actual fun clockAdjust(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    0

public actual fun clockAdjustR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    0

public actual fun clockPeriod(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt =
    0

public actual fun clockPeriodR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt =
    0

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    0

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    0

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    0

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    0
