package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.COpaquePointer

internal object NeutrinoRawLibc {
    external fun channelCreate(flags: Int): Int
    external fun channelCreateR(flags: Int): Int
    external fun channelCreatePulsePool(flags: Int, config: Long): Int
    external fun channelCreateExt(flags: Int, mode: Int, bufsize: Long, maxnumbuf: Int, ev: Long, cred: Long): Int
    external fun channelDestroy(chid: Int): Int
    external fun channelDestroyR(chid: Int): Int
    external fun connectAttach(nd: Int, pid: Int, chid: Int, index: Int, flags: Int): Int
    external fun connectAttachR(nd: Int, pid: Int, chid: Int, index: Int, flags: Int): Int
    external fun connectDetach(coid: Int): Int
    external fun connectDetachR(coid: Int): Int
    external fun connectServerInfo(pid: Int, coid: Int, info: Long): Int
    external fun connectServerInfoR(pid: Int, coid: Int, info: Long): Int
    external fun connectClientInfoExtraArgs(scoid: Int, infoPp: Long, ngroups: Int, abilities: Long, nable: Int, typeId: Long): Int
    external fun connectClientInfoExtraArgsR(scoid: Int, infoPp: Long, ngroups: Int, abilities: Long, nable: Int, typeId: Long): Int
    external fun connectClientInfo(scoid: Int, info: Long, ngroups: Int): Int
    external fun connectClientInfoR(scoid: Int, info: Long, ngroups: Int): Int
    external fun connectClientInfoExt(scoid: Int, infoPp: Long, flags: Int): Int
    external fun clientInfoExtFree(infoPp: Long): Int
    external fun connectClientInfoAble(scoid: Int, infoPp: Long, flags: Int, abilities: Long, nable: Int): Int
    external fun connectFlags(pid: Int, coid: Int, mask: Int, bits: Int): Int
    external fun connectFlagsR(pid: Int, coid: Int, mask: Int, bits: Int): Int
    external fun channelConnectAttr(id: Int, oldAttr: Long, newAttr: Long, flags: Int): Int
    external fun msgSend(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long
    external fun msgSendR(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long
    external fun msgSendnc(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long
    external fun msgSendncR(coid: Int, smsg: Long, sbytes: Long, rmsg: Long, rbytes: Long): Long
    external fun msgSendsv(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long
    external fun msgSendsvR(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long
    external fun msgSendsvnc(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long
    external fun msgSendsvncR(coid: Int, smsg: Long, sbytes: Long, riov: Long, rparts: Long): Long
    external fun msgSendvs(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long
    external fun msgSendvsR(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long
    external fun msgSendvsnc(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long
    external fun msgSendvsncR(coid: Int, siov: Long, sparts: Long, rmsg: Long, rbytes: Long): Long
    external fun msgSendv(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long
    external fun msgSendvR(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long
    external fun msgSendvnc(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long
    external fun msgSendvncR(coid: Int, siov: Long, sparts: Long, riov: Long, rparts: Long): Long
    external fun msgReceive(chid: Int, msg: Long, bytes: Long, info: Long): Int
    external fun msgReceiveR(chid: Int, msg: Long, bytes: Long, info: Long): Int
    external fun msgReceivev(chid: Int, iov: Long, parts: Long, info: Long): Int
    external fun msgReceivevR(chid: Int, iov: Long, parts: Long, info: Long): Int
    external fun msgReceivePulse(chid: Int, pulse: Long, bytes: Long, info: Long): Int
    external fun msgReceivePulseR(chid: Int, pulse: Long, bytes: Long, info: Long): Int
    external fun msgReceivePulsev(chid: Int, iov: Long, parts: Long, info: Long): Int
    external fun msgReceivePulsevR(chid: Int, iov: Long, parts: Long, info: Long): Int
    external fun msgReply(rcvid: Int, status: Long, msg: Long, bytes: Long): Int
    external fun msgReplyR(rcvid: Int, status: Long, msg: Long, bytes: Long): Int
    external fun msgReplyv(rcvid: Int, status: Long, iov: Long, parts: Long): Int
    external fun msgReplyvR(rcvid: Int, status: Long, iov: Long, parts: Long): Int
    external fun msgReadiov(rcvid: Int, iov: Long, parts: Long, offset: Long, flags: Int): Long
    external fun msgReadiovR(rcvid: Int, iov: Long, parts: Long, offset: Long, flags: Int): Long
    external fun msgRead(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long
    external fun msgReadR(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long
    external fun msgReadv(rcvid: Int, iov: Long, parts: Long, offset: Long): Long
    external fun msgReadvR(rcvid: Int, iov: Long, parts: Long, offset: Long): Long
    external fun msgWrite(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long
    external fun msgWriteR(rcvid: Int, msg: Long, bytes: Long, offset: Long): Long
    external fun msgWritev(rcvid: Int, iov: Long, parts: Long, offset: Long): Long
    external fun msgWritevR(rcvid: Int, iov: Long, parts: Long, offset: Long): Long
    external fun msgSendPulse(coid: Int, priority: Int, code: Int, value: Int): Int
    external fun msgSendPulseR(coid: Int, priority: Int, code: Int, value: Int): Int
    external fun msgSendPulsePtr(coid: Int, priority: Int, code: Int, value: Long): Int
    external fun msgSendPulsePtrR(coid: Int, priority: Int, code: Int, value: Long): Int
    external fun msgDeliverEvent(rcvid: Int, event: Long): Int
    external fun msgDeliverEventR(rcvid: Int, event: Long): Int
    external fun msgVerifyEvent(rcvid: Int, event: Long): Int
    external fun msgVerifyEventR(rcvid: Int, event: Long): Int
    external fun msgRegisterEvent(event: Long, coid: Int): Int
    external fun msgRegisterEventR(event: Long, coid: Int): Int
    external fun msgUnregisterEvent(event: Long): Int
    external fun msgUnregisterEventR(event: Long): Int
    external fun msgInfo(rcvid: Int, info: Long): Int
    external fun msgInfoR(rcvid: Int, info: Long): Int
    external fun msgKeyData(rcvid: Int, oper: Int, key: Int, newkey: Long, iov: Long, parts: Int): Int
    external fun msgKeyDataR(rcvid: Int, oper: Int, key: Int, newkey: Long, iov: Long, parts: Int): Int
    external fun msgError(rcvid: Int, err: Int): Int
    external fun msgErrorR(rcvid: Int, err: Int): Int
    external fun msgCurrent(rcvid: Int): Int
    external fun msgCurrentR(rcvid: Int): Int
    external fun msgSendAsyncGbl(coid: Int, smsg: Long, sbytes: Long, msgPrio: Int): Int
    external fun msgSendAsync(coid: Int): Int
    external fun msgReceiveAsyncGbl(chid: Int, rmsg: Long, rbytes: Long, info: Long, coid: Int): Int
    external fun msgReceiveAsync(chid: Int, iov: Long, parts: Int): Int
    external fun msgPause(rcvid: Int, cookie: Int): Int
    external fun msgPauseR(rcvid: Int, cookie: Int): Int
    external fun signalKill(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int
    external fun signalKillR(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int
    external fun signalKillSigval(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Long): Int
    external fun signalKillSigvalR(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Long): Int
    external fun signalReturn(info: Long): Int
    external fun signalFault(sigcode: Int, regs: Long, refaddr: Long): Int
    external fun signalAction(pid: Int, sigstub: Long, signo: Int, act: Long, oact: Long): Int
    external fun signalActionR(pid: Int, sigstub: Long, signo: Int, act: Long, oact: Long): Int
    external fun signalProcmask(pid: Int, tid: Int, how: Int, set: Long, oldset: Long): Int
    external fun signalProcmaskR(pid: Int, tid: Int, how: Int, set: Long, oldset: Long): Int
    external fun signalSuspend(set: Long): Int
    external fun signalSuspendR(set: Long): Int
    external fun signalWaitinfo(set: Long, info: Long): Int
    external fun signalWaitinfoR(set: Long, info: Long): Int
    external fun signalWaitinfoMask(set: Long, info: Long, mask: Long): Int
    external fun signalWaitinfoMaskR(set: Long, info: Long, mask: Long): Int
    external fun threadCreate(pid: Int, func: Long, arg: Long, attr: Long): Int
    external fun threadCreateR(pid: Int, func: Long, arg: Long, attr: Long): Int
    external fun threadDestroy(tid: Int, priority: Int, status: Long): Int
    external fun threadDestroyR(tid: Int, priority: Int, status: Long): Int
    external fun threadDetach(tid: Int): Int
    external fun threadDetachR(tid: Int): Int
    external fun threadJoin(tid: Int, status: Long): Int
    external fun threadJoinR(tid: Int, status: Long): Int
    external fun threadCancel(tid: Int, canstub: Long): Int
    external fun threadCancelR(tid: Int, canstub: Long): Int
    external fun threadCtl(cmd: Int, data: Long): Int
    external fun threadCtlR(cmd: Int, data: Long): Int
    external fun threadCtlExt(pid: Int, tid: Int, cmd: Int, data: Long): Int
    external fun threadCtlExtR(pid: Int, tid: Int, cmd: Int, data: Long): Int
    external fun interruptHookTrace(handler: Long, flags: Int): Int
    external fun interruptHookIdle(handler: Long, flags: Int): Int
    external fun interruptHookIdle2(handler: Long, flags: Int): Int
    external fun interruptHookOverdriveEvent(event: Long, flags: Int): Int
    external fun interruptAttachEvent(intr: Int, event: Long, flags: Int): Int
    external fun interruptAttachEventR(intr: Int, event: Long, flags: Int): Int
    external fun interruptAttach(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int
    external fun interruptAttachR(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int
    external fun interruptAttachArray(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int
    external fun interruptAttachArrayR(intr: Int, handler: Long, area: Long, size: Int, flags: Int): Int
    external fun interruptDetach(id: Int): Int
    external fun interruptDetachR(id: Int): Int
    external fun interruptWait(flags: Int, timeout: Long): Int
    external fun interruptWaitR(flags: Int, timeout: Long): Int
    external fun interruptCharacteristic(type: Int, id: Int, new: Long, old: Long): Int
    external fun interruptCharacteristicR(type: Int, id: Int, new: Long, old: Long): Int
    external fun schedGet(pid: Int, tid: Int, param: Long): Int
    external fun schedGetR(pid: Int, tid: Int, param: Long): Int
    external fun schedGetCpuNum(): Int
    external fun schedSet(pid: Int, tid: Int, algorithm: Int, param: Long): Int
    external fun schedSetR(pid: Int, tid: Int, algorithm: Int, param: Long): Int
    external fun schedInfo(pid: Int, algorithm: Int, info: Long): Int
    external fun schedInfoR(pid: Int, algorithm: Int, info: Long): Int
    external fun schedYield(): Int
    external fun schedYieldR(): Int
    external fun schedCtl(cmd: Int, data: Long, length: Long): Int
    external fun schedCtlR(cmd: Int, data: Long, length: Long): Int
    external fun schedJobCreate(job: Long): Int
    external fun schedJobCreateR(job: Long): Int
    external fun schedJobDestroy(job: Long): Int
    external fun schedJobDestroyR(job: Long): Int
    external fun schedWaypoint(job: Long, new: Long, max: Long, old: Long): Int
    external fun schedWaypointR(job: Long, new: Long, max: Long, old: Long): Int
    external fun timerCreate(id: Int, notify: Long): Int
    external fun timerCreateR(id: Int, notify: Long): Int
    external fun timerDestroy(id: Long): Int
    external fun timerDestroyR(id: Long): Int
    external fun timerSettime(id: Long, flags: Int, itime: Long, oitime: Long): Int
    external fun timerSettimeR(id: Long, flags: Int, itime: Long, oitime: Long): Int
    external fun timerInfo(pid: Int, id: Long, flags: Int, info: Long): Int
    external fun timerInfoR(pid: Int, id: Long, flags: Int, info: Long): Int
    external fun timerAlarm(id: Int, itime: Long, otime: Long): Int
    external fun timerAlarmR(id: Int, itime: Long, otime: Long): Int
    external fun timerTimeout(id: Int, flags: Int, notify: Long, ntime: Long, otime: Long): Int
    external fun timerTimeoutR(id: Int, flags: Int, notify: Long, ntime: Long, otime: Long): Int
    external fun syncTypeCreate(type: Int, sync: Long, attr: Long): Int
    external fun syncTypeCreateR(type: Int, sync: Long, attr: Long): Int
    external fun syncDestroy(sync: Long): Int
    external fun syncDestroyR(sync: Long): Int
    external fun syncCtl(cmd: Int, sync: Long, data: Long): Int
    external fun syncCtlR(cmd: Int, sync: Long, data: Long): Int
    external fun syncMutexEvent(sync: Long, event: Long): Int
    external fun syncMutexEventR(sync: Long, event: Long): Int
    external fun syncMutexLock(sync: Long): Int
    external fun syncMutexLockR(sync: Long): Int
    external fun syncMutexUnlock(sync: Long): Int
    external fun syncMutexUnlockR(sync: Long): Int
    external fun syncMutexRevive(sync: Long): Int
    external fun syncMutexReviveR(sync: Long): Int
    external fun syncCondvarWait(sync: Long, mutex: Long): Int
    external fun syncCondvarWaitR(sync: Long, mutex: Long): Int
    external fun syncCondvarSignal(sync: Long, all: Int): Int
    external fun syncCondvarSignalR(sync: Long, all: Int): Int
    external fun syncSemPost(sync: Long): Int
    external fun syncSemPostR(sync: Long): Int
    external fun syncSemWait(sync: Long, tryto: Int): Int
    external fun syncSemWaitR(sync: Long, tryto: Int): Int
    external fun clockTime(id: Int, new: Long, old: Long): Int
    external fun clockTimeR(id: Int, new: Long, old: Long): Int
    external fun clockAdjust(id: Int, new: Long, old: Long): Int
    external fun clockAdjustR(id: Int, new: Long, old: Long): Int
    external fun clockPeriod(id: Int, new: Long, old: Long, reserved: Int): Int
    external fun clockPeriodR(id: Int, new: Long, old: Long, reserved: Int): Int
    external fun clockId(pid: Int, tid: Int): Int
    external fun clockIdR(pid: Int, tid: Int): Int
    external fun interruptMask(intr: Int, id: Int): Int
    external fun interruptUnmask(intr: Int, id: Int): Int
}

public actual fun channelCreate(flags: CUint): CInt =
    NeutrinoRawLibc.channelCreate(flags)

public actual fun channelCreateR(flags: CUint): CInt =
    NeutrinoRawLibc.channelCreateR(flags)

public actual fun channelCreatePulsePool(flags: CUint, config: NtoChannelConfig?): CInt =
    NeutrinoRawLibc.channelCreatePulsePool(flags, config?.toLong() ?: 0L)

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: Sigevent?, cred: CredInfo?): CInt =
    NeutrinoRawLibc.channelCreateExt(flags, mode, bufsize, maxnumbuf, ev?.toLong() ?: 0L, cred?.toLong() ?: 0L)

public actual fun channelDestroy(chid: CInt): CInt =
    NeutrinoRawLibc.channelDestroy(chid)

public actual fun channelDestroyR(chid: CInt): CInt =
    NeutrinoRawLibc.channelDestroyR(chid)

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    NeutrinoRawLibc.connectAttach(nd, pid, chid, index, flags)

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    NeutrinoRawLibc.connectAttachR(nd, pid, chid, index, flags)

public actual fun connectDetach(coid: CInt): CInt =
    NeutrinoRawLibc.connectDetach(coid)

public actual fun connectDetachR(coid: CInt): CInt =
    NeutrinoRawLibc.connectDetachR(coid)

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.connectServerInfo(pid, coid, info?.toLong() ?: 0L)

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.connectServerInfoR(pid, coid, info?.toLong() ?: 0L)

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUint?): CInt =
    NeutrinoRawLibc.connectClientInfoExtraArgs(scoid, infoPp?.toLong() ?: 0L, ngroups, abilities?.toLong() ?: 0L, nable, typeId?.toLong() ?: 0L)

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUint?): CInt =
    NeutrinoRawLibc.connectClientInfoExtraArgsR(scoid, infoPp?.toLong() ?: 0L, ngroups, abilities?.toLong() ?: 0L, nable, typeId?.toLong() ?: 0L)

public actual fun connectClientInfo(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    NeutrinoRawLibc.connectClientInfo(scoid, info?.toLong() ?: 0L, ngroups)

public actual fun connectClientInfoR(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    NeutrinoRawLibc.connectClientInfoR(scoid, info?.toLong() ?: 0L, ngroups)

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    NeutrinoRawLibc.connectClientInfoExt(scoid, infoPp?.value ?: 0L, flags)

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    NeutrinoRawLibc.clientInfoExtFree(infoPp?.value ?: 0L)

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: ClientAble?, nable: CInt): CInt =
    NeutrinoRawLibc.connectClientInfoAble(scoid, infoPp?.value ?: 0L, flags, abilities?.toLong() ?: 0L, nable)

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    NeutrinoRawLibc.connectFlags(pid, coid, mask, bits)

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    NeutrinoRawLibc.connectFlagsR(pid, coid, mask, bits)

public actual fun channelConnectAttr(id: CUint, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: CUint): CInt =
    NeutrinoRawLibc.channelConnectAttr(id, oldAttr?.toLong() ?: 0L, newAttr?.toLong() ?: 0L, flags)

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    NeutrinoRawLibc.msgSend(coid, smsg?.value ?: 0L, sbytes, rmsg?.value ?: 0L, rbytes)

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    NeutrinoRawLibc.msgSendR(coid, smsg?.value ?: 0L, sbytes, rmsg?.value ?: 0L, rbytes)

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    NeutrinoRawLibc.msgSendnc(coid, smsg?.value ?: 0L, sbytes, rmsg?.value ?: 0L, rbytes)

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    NeutrinoRawLibc.msgSendncR(coid, smsg?.value ?: 0L, sbytes, rmsg?.value ?: 0L, rbytes)

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    NeutrinoRawLibc.msgSendsv(coid, smsg?.value ?: 0L, sbytes, riov?.toLong() ?: 0L, rparts)

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    NeutrinoRawLibc.msgSendsvR(coid, smsg?.value ?: 0L, sbytes, riov?.toLong() ?: 0L, rparts)

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    NeutrinoRawLibc.msgSendsvnc(coid, smsg?.value ?: 0L, sbytes, riov?.toLong() ?: 0L, rparts)

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    NeutrinoRawLibc.msgSendsvncR(coid, smsg?.value ?: 0L, sbytes, riov?.toLong() ?: 0L, rparts)

public actual fun msgSendvs(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    NeutrinoRawLibc.msgSendvs(coid, siov?.toLong() ?: 0L, sparts, rmsg?.value ?: 0L, rbytes)

public actual fun msgSendvsR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    NeutrinoRawLibc.msgSendvsR(coid, siov?.toLong() ?: 0L, sparts, rmsg?.value ?: 0L, rbytes)

public actual fun msgSendvsnc(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    NeutrinoRawLibc.msgSendvsnc(coid, siov?.toLong() ?: 0L, sparts, rmsg?.value ?: 0L, rbytes)

public actual fun msgSendvsncR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    NeutrinoRawLibc.msgSendvsncR(coid, siov?.toLong() ?: 0L, sparts, rmsg?.value ?: 0L, rbytes)

public actual fun msgSendv(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    NeutrinoRawLibc.msgSendv(coid, siov?.toLong() ?: 0L, sparts, riov?.toLong() ?: 0L, rparts)

public actual fun msgSendvR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    NeutrinoRawLibc.msgSendvR(coid, siov?.toLong() ?: 0L, sparts, riov?.toLong() ?: 0L, rparts)

public actual fun msgSendvnc(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    NeutrinoRawLibc.msgSendvnc(coid, siov?.toLong() ?: 0L, sparts, riov?.toLong() ?: 0L, rparts)

public actual fun msgSendvncR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    NeutrinoRawLibc.msgSendvncR(coid, siov?.toLong() ?: 0L, sparts, riov?.toLong() ?: 0L, rparts)

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgReceive(chid, msg?.value ?: 0L, bytes, info?.toLong() ?: 0L)

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgReceiveR(chid, msg?.value ?: 0L, bytes, info?.toLong() ?: 0L)

public actual fun msgReceivev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgReceivev(chid, iov?.toLong() ?: 0L, parts, info?.toLong() ?: 0L)

public actual fun msgReceivevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgReceivevR(chid, iov?.toLong() ?: 0L, parts, info?.toLong() ?: 0L)

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgReceivePulse(chid, pulse?.value ?: 0L, bytes, info?.toLong() ?: 0L)

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgReceivePulseR(chid, pulse?.value ?: 0L, bytes, info?.toLong() ?: 0L)

public actual fun msgReceivePulsev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgReceivePulsev(chid, iov?.toLong() ?: 0L, parts, info?.toLong() ?: 0L)

public actual fun msgReceivePulsevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgReceivePulsevR(chid, iov?.toLong() ?: 0L, parts, info?.toLong() ?: 0L)

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    NeutrinoRawLibc.msgReply(rcvid, status, msg?.value ?: 0L, bytes)

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    NeutrinoRawLibc.msgReplyR(rcvid, status, msg?.value ?: 0L, bytes)

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    NeutrinoRawLibc.msgReplyv(rcvid, status, iov?.toLong() ?: 0L, parts)

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    NeutrinoRawLibc.msgReplyvR(rcvid, status, iov?.toLong() ?: 0L, parts)

public actual fun msgReadiov(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    NeutrinoRawLibc.msgReadiov(rcvid, iov?.toLong() ?: 0L, parts, offset, flags)

public actual fun msgReadiovR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    NeutrinoRawLibc.msgReadiovR(rcvid, iov?.toLong() ?: 0L, parts, offset, flags)

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    NeutrinoRawLibc.msgRead(rcvid, msg?.value ?: 0L, bytes, offset)

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    NeutrinoRawLibc.msgReadR(rcvid, msg?.value ?: 0L, bytes, offset)

public actual fun msgReadv(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    NeutrinoRawLibc.msgReadv(rcvid, iov?.toLong() ?: 0L, parts, offset)

public actual fun msgReadvR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    NeutrinoRawLibc.msgReadvR(rcvid, iov?.toLong() ?: 0L, parts, offset)

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    NeutrinoRawLibc.msgWrite(rcvid, msg?.value ?: 0L, bytes, offset)

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    NeutrinoRawLibc.msgWriteR(rcvid, msg?.value ?: 0L, bytes, offset)

public actual fun msgWritev(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    NeutrinoRawLibc.msgWritev(rcvid, iov?.toLong() ?: 0L, parts, offset)

public actual fun msgWritevR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    NeutrinoRawLibc.msgWritevR(rcvid, iov?.toLong() ?: 0L, parts, offset)

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    NeutrinoRawLibc.msgSendPulse(coid, priority, code, value)

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    NeutrinoRawLibc.msgSendPulseR(coid, priority, code, value)

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    NeutrinoRawLibc.msgSendPulsePtr(coid, priority, code, value?.value ?: 0L)

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    NeutrinoRawLibc.msgSendPulsePtrR(coid, priority, code, value?.value ?: 0L)

public actual fun msgDeliverEvent(rcvid: CInt, event: Sigevent?): CInt =
    NeutrinoRawLibc.msgDeliverEvent(rcvid, event?.toLong() ?: 0L)

public actual fun msgDeliverEventR(rcvid: CInt, event: Sigevent?): CInt =
    NeutrinoRawLibc.msgDeliverEventR(rcvid, event?.toLong() ?: 0L)

public actual fun msgVerifyEvent(rcvid: CInt, event: Sigevent?): CInt =
    NeutrinoRawLibc.msgVerifyEvent(rcvid, event?.toLong() ?: 0L)

public actual fun msgVerifyEventR(rcvid: CInt, event: Sigevent?): CInt =
    NeutrinoRawLibc.msgVerifyEventR(rcvid, event?.toLong() ?: 0L)

public actual fun msgRegisterEvent(event: Sigevent?, coid: CInt): CInt =
    NeutrinoRawLibc.msgRegisterEvent(event?.toLong() ?: 0L, coid)

public actual fun msgRegisterEventR(event: Sigevent?, coid: CInt): CInt =
    NeutrinoRawLibc.msgRegisterEventR(event?.toLong() ?: 0L, coid)

public actual fun msgUnregisterEvent(event: Sigevent?): CInt =
    NeutrinoRawLibc.msgUnregisterEvent(event?.toLong() ?: 0L)

public actual fun msgUnregisterEventR(event: Sigevent?): CInt =
    NeutrinoRawLibc.msgUnregisterEventR(event?.toLong() ?: 0L)

public actual fun msgInfo(rcvid: CInt, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgInfo(rcvid, info?.toLong() ?: 0L)

public actual fun msgInfoR(rcvid: CInt, info: MsgInfo64?): CInt =
    NeutrinoRawLibc.msgInfoR(rcvid, info?.toLong() ?: 0L)

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    NeutrinoRawLibc.msgKeyData(rcvid, oper, key, newkey?.toLong() ?: 0L, iov?.toLong() ?: 0L, parts)

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    NeutrinoRawLibc.msgKeyDataR(rcvid, oper, key, newkey?.toLong() ?: 0L, iov?.toLong() ?: 0L, parts)

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    NeutrinoRawLibc.msgError(rcvid, err)

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    NeutrinoRawLibc.msgErrorR(rcvid, err)

public actual fun msgCurrent(rcvid: CInt): CInt =
    NeutrinoRawLibc.msgCurrent(rcvid)

public actual fun msgCurrentR(rcvid: CInt): CInt =
    NeutrinoRawLibc.msgCurrentR(rcvid)

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUint): CInt =
    NeutrinoRawLibc.msgSendAsyncGbl(coid, smsg?.value ?: 0L, sbytes, msgPrio)

public actual fun msgSendAsync(coid: CInt): CInt =
    NeutrinoRawLibc.msgSendAsync(coid)

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: CInt): CInt =
    NeutrinoRawLibc.msgReceiveAsyncGbl(chid, rmsg?.value ?: 0L, rbytes, info?.toLong() ?: 0L, coid)

public actual fun msgReceiveAsync(chid: CInt, iov: Iovec?, parts: CUint): CInt =
    NeutrinoRawLibc.msgReceiveAsync(chid, iov?.toLong() ?: 0L, parts)

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    NeutrinoRawLibc.msgPause(rcvid, cookie)

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    NeutrinoRawLibc.msgPauseR(rcvid, cookie)

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    NeutrinoRawLibc.signalKill(nd, pid, tid, signo, code, value)

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    NeutrinoRawLibc.signalKillR(nd, pid, tid, signo, code, value)

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    NeutrinoRawLibc.signalKillSigval(nd, pid, tid, signo, code, value?.toLong() ?: 0L)

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    NeutrinoRawLibc.signalKillSigvalR(nd, pid, tid, signo, code, value?.toLong() ?: 0L)

public actual fun signalReturn(info: SighandlerInfo?): CInt =
    NeutrinoRawLibc.signalReturn(info?.toLong() ?: 0L)

public actual fun signalFault(sigcode: CUint, regs: COpaquePointer?, refaddr: ULong): CInt =
    NeutrinoRawLibc.signalFault(sigcode, regs?.value ?: 0L, refaddr)

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    NeutrinoRawLibc.signalAction(pid, sigstub, signo, act?.toLong() ?: 0L, oact?.toLong() ?: 0L)

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    NeutrinoRawLibc.signalActionR(pid, sigstub, signo, act?.toLong() ?: 0L, oact?.toLong() ?: 0L)

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    NeutrinoRawLibc.signalProcmask(pid, tid, how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    NeutrinoRawLibc.signalProcmaskR(pid, tid, how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun signalSuspend(set: SigsetT?): CInt =
    NeutrinoRawLibc.signalSuspend(set?.toLong() ?: 0L)

public actual fun signalSuspendR(set: SigsetT?): CInt =
    NeutrinoRawLibc.signalSuspendR(set?.toLong() ?: 0L)

public actual fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    NeutrinoRawLibc.signalWaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): CInt =
    NeutrinoRawLibc.signalWaitinfoR(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    NeutrinoRawLibc.signalWaitinfoMask(set?.toLong() ?: 0L, info?.toLong() ?: 0L, mask?.toLong() ?: 0L)

public actual fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    NeutrinoRawLibc.signalWaitinfoMaskR(set?.toLong() ?: 0L, info?.toLong() ?: 0L, mask?.toLong() ?: 0L)

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    NeutrinoRawLibc.threadCreate(pid, func, arg?.value ?: 0L, attr?.toLong() ?: 0L)

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    NeutrinoRawLibc.threadCreateR(pid, func, arg?.value ?: 0L, attr?.toLong() ?: 0L)

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    NeutrinoRawLibc.threadDestroy(tid, priority, status?.value ?: 0L)

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    NeutrinoRawLibc.threadDestroyR(tid, priority, status?.value ?: 0L)

public actual fun threadDetach(tid: CInt): CInt =
    NeutrinoRawLibc.threadDetach(tid)

public actual fun threadDetachR(tid: CInt): CInt =
    NeutrinoRawLibc.threadDetachR(tid)

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    NeutrinoRawLibc.threadJoin(tid, status?.value ?: 0L)

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    NeutrinoRawLibc.threadJoinR(tid, status?.value ?: 0L)

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    NeutrinoRawLibc.threadCancel(tid, canstub)

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    NeutrinoRawLibc.threadCancelR(tid, canstub)

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    NeutrinoRawLibc.threadCtl(cmd, data?.value ?: 0L)

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    NeutrinoRawLibc.threadCtlR(cmd, data?.value ?: 0L)

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    NeutrinoRawLibc.threadCtlExt(pid, tid, cmd, data?.value ?: 0L)

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    NeutrinoRawLibc.threadCtlExtR(pid, tid, cmd, data?.value ?: 0L)

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    NeutrinoRawLibc.interruptHookTrace(handler?.toLong() ?: 0L, flags)

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    NeutrinoRawLibc.interruptHookIdle(handler?.toLong() ?: 0L, flags)

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    NeutrinoRawLibc.interruptHookIdle2(handler?.toLong() ?: 0L, flags)

public actual fun interruptHookOverdriveEvent(event: Sigevent?, flags: CUint): CInt =
    NeutrinoRawLibc.interruptHookOverdriveEvent(event?.toLong() ?: 0L, flags)

public actual fun interruptAttachEvent(intr: CInt, event: Sigevent?, flags: CUint): CInt =
    NeutrinoRawLibc.interruptAttachEvent(intr, event?.toLong() ?: 0L, flags)

public actual fun interruptAttachEventR(intr: CInt, event: Sigevent?, flags: CUint): CInt =
    NeutrinoRawLibc.interruptAttachEventR(intr, event?.toLong() ?: 0L, flags)

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    NeutrinoRawLibc.interruptAttach(intr, handler?.toLong() ?: 0L, area?.value ?: 0L, size, flags)

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    NeutrinoRawLibc.interruptAttachR(intr, handler?.toLong() ?: 0L, area?.value ?: 0L, size, flags)

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    NeutrinoRawLibc.interruptAttachArray(intr, handler?.toLong() ?: 0L, area?.value ?: 0L, size, flags)

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    NeutrinoRawLibc.interruptAttachArrayR(intr, handler?.toLong() ?: 0L, area?.value ?: 0L, size, flags)

public actual fun interruptDetach(id: CInt): CInt =
    NeutrinoRawLibc.interruptDetach(id)

public actual fun interruptDetachR(id: CInt): CInt =
    NeutrinoRawLibc.interruptDetachR(id)

public actual fun interruptWait(flags: CInt, timeout: ULong?): CInt =
    NeutrinoRawLibc.interruptWait(flags, timeout?.toLong() ?: 0L)

public actual fun interruptWaitR(flags: CInt, timeout: ULong?): CInt =
    NeutrinoRawLibc.interruptWaitR(flags, timeout?.toLong() ?: 0L)

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: CUint?, old: CUint?): CInt =
    NeutrinoRawLibc.interruptCharacteristic(type, id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: CUint?, old: CUint?): CInt =
    NeutrinoRawLibc.interruptCharacteristicR(type, id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)

public actual fun schedGet(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    NeutrinoRawLibc.schedGet(pid, tid, param?.toLong() ?: 0L)

public actual fun schedGetR(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    NeutrinoRawLibc.schedGetR(pid, tid, param?.toLong() ?: 0L)

public actual fun schedGetCpuNum(): CUint =
    NeutrinoRawLibc.schedGetCpuNum()

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    NeutrinoRawLibc.schedSet(pid, tid, algorithm, param?.toLong() ?: 0L)

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    NeutrinoRawLibc.schedSetR(pid, tid, algorithm, param?.toLong() ?: 0L)

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: io.github.kotlinmania.libc.SchedInfo?): CInt =
    NeutrinoRawLibc.schedInfo(pid, algorithm, info?.toLong() ?: 0L)

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: io.github.kotlinmania.libc.SchedInfo?): CInt =
    NeutrinoRawLibc.schedInfoR(pid, algorithm, info?.toLong() ?: 0L)

public actual fun schedYield(): CInt =
    NeutrinoRawLibc.schedYield()

public actual fun schedYieldR(): CInt =
    NeutrinoRawLibc.schedYieldR()

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    NeutrinoRawLibc.schedCtl(cmd, data?.value ?: 0L, length)

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    NeutrinoRawLibc.schedCtlR(cmd, data?.value ?: 0L, length)

public actual fun schedJobCreate(job: SyncT?): CInt =
    NeutrinoRawLibc.schedJobCreate(job?.toLong() ?: 0L)

public actual fun schedJobCreateR(job: SyncT?): CInt =
    NeutrinoRawLibc.schedJobCreateR(job?.toLong() ?: 0L)

public actual fun schedJobDestroy(job: SyncT?): CInt =
    NeutrinoRawLibc.schedJobDestroy(job?.toLong() ?: 0L)

public actual fun schedJobDestroyR(job: SyncT?): CInt =
    NeutrinoRawLibc.schedJobDestroyR(job?.toLong() ?: 0L)

public actual fun schedWaypoint(job: SyncT?, new: Long?, max: Long?, old: Long?): CInt =
    NeutrinoRawLibc.schedWaypoint(job?.toLong() ?: 0L, new?.toLong() ?: 0L, max?.toLong() ?: 0L, old?.toLong() ?: 0L)

public actual fun schedWaypointR(job: SyncT?, new: Long?, max: Long?, old: Long?): CInt =
    NeutrinoRawLibc.schedWaypointR(job?.toLong() ?: 0L, new?.toLong() ?: 0L, max?.toLong() ?: 0L, old?.toLong() ?: 0L)

public actual fun timerCreate(id: ClockidT, notify: Sigevent?): CInt =
    NeutrinoRawLibc.timerCreate(id, notify?.toLong() ?: 0L)

public actual fun timerCreateR(id: ClockidT, notify: Sigevent?): CInt =
    NeutrinoRawLibc.timerCreateR(id, notify?.toLong() ?: 0L)

public actual fun timerDestroy(id: TimerT): CInt =
    NeutrinoRawLibc.timerDestroy(id)

public actual fun timerDestroyR(id: TimerT): CInt =
    NeutrinoRawLibc.timerDestroyR(id)

public actual fun timerSettime(id: TimerT, flags: CInt, itime: io.github.kotlinmania.libc.Itimer?, oitime: io.github.kotlinmania.libc.Itimer?): CInt =
    NeutrinoRawLibc.timerSettime(id, flags, itime?.toLong() ?: 0L, oitime?.toLong() ?: 0L)

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: io.github.kotlinmania.libc.Itimer?, oitime: io.github.kotlinmania.libc.Itimer?): CInt =
    NeutrinoRawLibc.timerSettimeR(id, flags, itime?.toLong() ?: 0L, oitime?.toLong() ?: 0L)

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: io.github.kotlinmania.libc.TimerInfo?): CInt =
    NeutrinoRawLibc.timerInfo(pid, id, flags, info?.toLong() ?: 0L)

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: io.github.kotlinmania.libc.TimerInfo?): CInt =
    NeutrinoRawLibc.timerInfoR(pid, id, flags, info?.toLong() ?: 0L)

public actual fun timerAlarm(id: ClockidT, itime: io.github.kotlinmania.libc.Itimer?, otime: io.github.kotlinmania.libc.Itimer?): CInt =
    NeutrinoRawLibc.timerAlarm(id, itime?.toLong() ?: 0L, otime?.toLong() ?: 0L)

public actual fun timerAlarmR(id: ClockidT, itime: io.github.kotlinmania.libc.Itimer?, otime: io.github.kotlinmania.libc.Itimer?): CInt =
    NeutrinoRawLibc.timerAlarmR(id, itime?.toLong() ?: 0L, otime?.toLong() ?: 0L)

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    NeutrinoRawLibc.timerTimeout(id, flags, notify?.toLong() ?: 0L, ntime?.toLong() ?: 0L, otime?.toLong() ?: 0L)

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    NeutrinoRawLibc.timerTimeoutR(id, flags, notify?.toLong() ?: 0L, ntime?.toLong() ?: 0L, otime?.toLong() ?: 0L)

public actual fun syncTypeCreate(type: CUint, sync: SyncT?, attr: SyncAttr?): CInt =
    NeutrinoRawLibc.syncTypeCreate(type, sync?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun syncTypeCreateR(type: CUint, sync: SyncT?, attr: SyncAttr?): CInt =
    NeutrinoRawLibc.syncTypeCreateR(type, sync?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun syncDestroy(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncDestroy(sync?.toLong() ?: 0L)

public actual fun syncDestroyR(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncDestroyR(sync?.toLong() ?: 0L)

public actual fun syncCtl(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    NeutrinoRawLibc.syncCtl(cmd, sync?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun syncCtlR(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    NeutrinoRawLibc.syncCtlR(cmd, sync?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun syncMutexEvent(sync: SyncT?, event: Sigevent?): CInt =
    NeutrinoRawLibc.syncMutexEvent(sync?.toLong() ?: 0L, event?.toLong() ?: 0L)

public actual fun syncMutexEventR(sync: SyncT?, event: Sigevent?): CInt =
    NeutrinoRawLibc.syncMutexEventR(sync?.toLong() ?: 0L, event?.toLong() ?: 0L)

public actual fun syncMutexLock(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncMutexLock(sync?.toLong() ?: 0L)

public actual fun syncMutexLockR(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncMutexLockR(sync?.toLong() ?: 0L)

public actual fun syncMutexUnlock(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncMutexUnlock(sync?.toLong() ?: 0L)

public actual fun syncMutexUnlockR(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncMutexUnlockR(sync?.toLong() ?: 0L)

public actual fun syncMutexRevive(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncMutexRevive(sync?.toLong() ?: 0L)

public actual fun syncMutexReviveR(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncMutexReviveR(sync?.toLong() ?: 0L)

public actual fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): CInt =
    NeutrinoRawLibc.syncCondvarWait(sync?.toLong() ?: 0L, mutex?.toLong() ?: 0L)

public actual fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): CInt =
    NeutrinoRawLibc.syncCondvarWaitR(sync?.toLong() ?: 0L, mutex?.toLong() ?: 0L)

public actual fun syncCondvarSignal(sync: SyncT?, all: CInt): CInt =
    NeutrinoRawLibc.syncCondvarSignal(sync?.toLong() ?: 0L, all)

public actual fun syncCondvarSignalR(sync: SyncT?, all: CInt): CInt =
    NeutrinoRawLibc.syncCondvarSignalR(sync?.toLong() ?: 0L, all)

public actual fun syncSemPost(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncSemPost(sync?.toLong() ?: 0L)

public actual fun syncSemPostR(sync: SyncT?): CInt =
    NeutrinoRawLibc.syncSemPostR(sync?.toLong() ?: 0L)

public actual fun syncSemWait(sync: SyncT?, tryto: CInt): CInt =
    NeutrinoRawLibc.syncSemWait(sync?.toLong() ?: 0L, tryto)

public actual fun syncSemWaitR(sync: SyncT?, tryto: CInt): CInt =
    NeutrinoRawLibc.syncSemWaitR(sync?.toLong() ?: 0L, tryto)

public actual fun clockTime(id: ClockidT, new: ULong?, old: ULong?): CInt =
    NeutrinoRawLibc.clockTime(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)

public actual fun clockTimeR(id: ClockidT, new: ULong?, old: ULong?): CInt =
    NeutrinoRawLibc.clockTimeR(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)

public actual fun clockAdjust(id: ClockidT, new: io.github.kotlinmania.libc.Clockadjust?, old: io.github.kotlinmania.libc.Clockadjust?): CInt =
    NeutrinoRawLibc.clockAdjust(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)

public actual fun clockAdjustR(id: ClockidT, new: io.github.kotlinmania.libc.Clockadjust?, old: io.github.kotlinmania.libc.Clockadjust?): CInt =
    NeutrinoRawLibc.clockAdjustR(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)

public actual fun clockPeriod(id: ClockidT, new: io.github.kotlinmania.libc.Clockperiod?, old: io.github.kotlinmania.libc.Clockperiod?, reserved: CInt): CInt =
    NeutrinoRawLibc.clockPeriod(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L, reserved)

public actual fun clockPeriodR(id: ClockidT, new: io.github.kotlinmania.libc.Clockperiod?, old: io.github.kotlinmania.libc.Clockperiod?, reserved: CInt): CInt =
    NeutrinoRawLibc.clockPeriodR(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L, reserved)

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    NeutrinoRawLibc.clockId(pid, tid)

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    NeutrinoRawLibc.clockIdR(pid, tid)

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    NeutrinoRawLibc.interruptMask(intr, id)

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    NeutrinoRawLibc.interruptUnmask(intr, id)
