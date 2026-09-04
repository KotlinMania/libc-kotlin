// port-lint: source Neutrino.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public actual fun channelCreate(flags: CUInt): CInt =
    throw UnsupportedOperationException("channelCreate requires N-API addon")

public actual fun channelCreateR(flags: CUInt): CInt =
    throw UnsupportedOperationException("channelCreateR requires N-API addon")

public actual fun channelCreatePulsePool(flags: CUInt, config: NtoChannelConfig?): CInt =
    throw UnsupportedOperationException("channelCreatePulsePool requires N-API addon")

public actual fun channelCreateExt(flags: CUInt, mode: ModeT, bufsize: ULong, maxnumbuf: CUInt, ev: Sigevent?, cred: CredInfo?): CInt =
    throw UnsupportedOperationException("channelCreateExt requires N-API addon")

public actual fun channelDestroy(chid: CInt): CInt =
    throw UnsupportedOperationException("channelDestroy requires N-API addon")

public actual fun channelDestroyR(chid: CInt): CInt =
    throw UnsupportedOperationException("channelDestroyR requires N-API addon")

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("connectAttach requires N-API addon")

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("connectAttachR requires N-API addon")

public actual fun connectDetach(coid: CInt): CInt =
    throw UnsupportedOperationException("connectDetach requires N-API addon")

public actual fun connectDetachR(coid: CInt): CInt =
    throw UnsupportedOperationException("connectDetachR requires N-API addon")

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("connectServerInfo requires N-API addon")

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("connectServerInfoR requires N-API addon")

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUInt?): CInt =
    throw UnsupportedOperationException("connectClientInfoExtraArgs requires N-API addon")

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUInt?): CInt =
    throw UnsupportedOperationException("connectClientInfoExtraArgsR requires N-API addon")

public actual fun connectClientInfo(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfo requires N-API addon")

public actual fun connectClientInfoR(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfoR requires N-API addon")

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfoExt requires N-API addon")

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("clientInfoExtFree requires N-API addon")

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: ClientAble?, nable: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfoAble requires N-API addon")

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUInt, bits: CUInt): CInt =
    throw UnsupportedOperationException("connectFlags requires N-API addon")

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUInt, bits: CUInt): CInt =
    throw UnsupportedOperationException("connectFlagsR requires N-API addon")

public actual fun channelConnectAttr(id: CUInt, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: CUInt): CInt =
    throw UnsupportedOperationException("channelConnectAttr requires N-API addon")

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSend requires N-API addon")

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendR requires N-API addon")

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendnc requires N-API addon")

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendncR requires N-API addon")

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsv requires N-API addon")

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsvR requires N-API addon")

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsvnc requires N-API addon")

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsvncR requires N-API addon")

public actual fun msgSendvs(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvs requires N-API addon")

public actual fun msgSendvsR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvsR requires N-API addon")

public actual fun msgSendvsnc(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvsnc requires N-API addon")

public actual fun msgSendvsncR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvsncR requires N-API addon")

public actual fun msgSendv(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendv requires N-API addon")

public actual fun msgSendvR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendvR requires N-API addon")

public actual fun msgSendvnc(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendvnc requires N-API addon")

public actual fun msgSendvncR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendvncR requires N-API addon")

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceive requires N-API addon")

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceiveR requires N-API addon")

public actual fun msgReceivev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivev requires N-API addon")

public actual fun msgReceivevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivevR requires N-API addon")

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulse requires N-API addon")

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulseR requires N-API addon")

public actual fun msgReceivePulsev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulsev requires N-API addon")

public actual fun msgReceivePulsevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulsevR requires N-API addon")

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    throw UnsupportedOperationException("msgReply requires N-API addon")

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    throw UnsupportedOperationException("msgReplyR requires N-API addon")

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    throw UnsupportedOperationException("msgReplyv requires N-API addon")

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    throw UnsupportedOperationException("msgReplyvR requires N-API addon")

public actual fun msgReadiov(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    throw UnsupportedOperationException("msgReadiov requires N-API addon")

public actual fun msgReadiovR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    throw UnsupportedOperationException("msgReadiovR requires N-API addon")

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgRead requires N-API addon")

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadR requires N-API addon")

public actual fun msgReadv(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadv requires N-API addon")

public actual fun msgReadvR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadvR requires N-API addon")

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWrite requires N-API addon")

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWriteR requires N-API addon")

public actual fun msgWritev(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritev requires N-API addon")

public actual fun msgWritevR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritevR requires N-API addon")

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("msgSendPulse requires N-API addon")

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("msgSendPulseR requires N-API addon")

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("msgSendPulsePtr requires N-API addon")

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("msgSendPulsePtrR requires N-API addon")

public actual fun msgDeliverEvent(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgDeliverEvent requires N-API addon")

public actual fun msgDeliverEventR(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgDeliverEventR requires N-API addon")

public actual fun msgVerifyEvent(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgVerifyEvent requires N-API addon")

public actual fun msgVerifyEventR(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgVerifyEventR requires N-API addon")

public actual fun msgRegisterEvent(event: Sigevent?, coid: CInt): CInt =
    throw UnsupportedOperationException("msgRegisterEvent requires N-API addon")

public actual fun msgRegisterEventR(event: Sigevent?, coid: CInt): CInt =
    throw UnsupportedOperationException("msgRegisterEventR requires N-API addon")

public actual fun msgUnregisterEvent(event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgUnregisterEvent requires N-API addon")

public actual fun msgUnregisterEventR(event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgUnregisterEventR requires N-API addon")

public actual fun msgInfo(rcvid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgInfo requires N-API addon")

public actual fun msgInfoR(rcvid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgInfoR requires N-API addon")

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    throw UnsupportedOperationException("msgKeyData requires N-API addon")

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    throw UnsupportedOperationException("msgKeyDataR requires N-API addon")

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    throw UnsupportedOperationException("msgError requires N-API addon")

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    throw UnsupportedOperationException("msgErrorR requires N-API addon")

public actual fun msgCurrent(rcvid: CInt): CInt =
    throw UnsupportedOperationException("msgCurrent requires N-API addon")

public actual fun msgCurrentR(rcvid: CInt): CInt =
    throw UnsupportedOperationException("msgCurrentR requires N-API addon")

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("msgSendAsyncGbl requires N-API addon")

public actual fun msgSendAsync(coid: CInt): CInt =
    throw UnsupportedOperationException("msgSendAsync requires N-API addon")

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: CInt): CInt =
    throw UnsupportedOperationException("msgReceiveAsyncGbl requires N-API addon")

public actual fun msgReceiveAsync(chid: CInt, iov: Iovec?, parts: CUInt): CInt =
    throw UnsupportedOperationException("msgReceiveAsync requires N-API addon")

public actual fun msgPause(rcvid: CInt, cookie: CUInt): CInt =
    throw UnsupportedOperationException("msgPause requires N-API addon")

public actual fun msgPauseR(rcvid: CInt, cookie: CUInt): CInt =
    throw UnsupportedOperationException("msgPauseR requires N-API addon")

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("signalKill requires N-API addon")

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("signalKillR requires N-API addon")

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    throw UnsupportedOperationException("signalKillSigval requires N-API addon")

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    throw UnsupportedOperationException("signalKillSigvalR requires N-API addon")

public actual fun signalReturn(info: SighandlerInfo?): CInt =
    throw UnsupportedOperationException("signalReturn requires N-API addon")

public actual fun signalFault(sigcode: CUInt, regs: COpaquePointer?, refaddr: ULong): CInt =
    throw UnsupportedOperationException("signalFault requires N-API addon")

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("signalProcmask requires N-API addon")

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("signalProcmaskR requires N-API addon")

public actual fun signalSuspend(set: SigsetT?): CInt =
    throw UnsupportedOperationException("signalSuspend requires N-API addon")

public actual fun signalSuspendR(set: SigsetT?): CInt =
    throw UnsupportedOperationException("signalSuspendR requires N-API addon")

public actual fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("signalWaitinfo requires N-API addon")

public actual fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("signalWaitinfoR requires N-API addon")

public actual fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    throw UnsupportedOperationException("signalWaitinfoMask requires N-API addon")

public actual fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    throw UnsupportedOperationException("signalWaitinfoMaskR requires N-API addon")

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadDestroy requires N-API addon")

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadDestroyR requires N-API addon")

public actual fun threadDetach(tid: CInt): CInt =
    throw UnsupportedOperationException("threadDetach requires N-API addon")

public actual fun threadDetachR(tid: CInt): CInt =
    throw UnsupportedOperationException("threadDetachR requires N-API addon")

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadJoin requires N-API addon")

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadJoinR requires N-API addon")

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtl requires N-API addon")

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtlR requires N-API addon")

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtlExt requires N-API addon")

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtlExtR requires N-API addon")

public actual fun interruptHookOverdriveEvent(event: Sigevent?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptHookOverdriveEvent requires N-API addon")

public actual fun interruptAttachEvent(intr: CInt, event: Sigevent?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachEvent requires N-API addon")

public actual fun interruptAttachEventR(intr: CInt, event: Sigevent?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachEventR requires N-API addon")

public actual fun interruptDetach(id: CInt): CInt =
    throw UnsupportedOperationException("interruptDetach requires N-API addon")

public actual fun interruptDetachR(id: CInt): CInt =
    throw UnsupportedOperationException("interruptDetachR requires N-API addon")

public actual fun interruptWait(flags: CInt, timeout: ULong?): CInt =
    throw UnsupportedOperationException("interruptWait requires N-API addon")

public actual fun interruptWaitR(flags: CInt, timeout: ULong?): CInt =
    throw UnsupportedOperationException("interruptWaitR requires N-API addon")

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: CUInt?, old: CUInt?): CInt =
    throw UnsupportedOperationException("interruptCharacteristic requires N-API addon")

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: CUInt?, old: CUInt?): CInt =
    throw UnsupportedOperationException("interruptCharacteristicR requires N-API addon")

public actual fun schedGet(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGet requires N-API addon")

public actual fun schedGetR(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetR requires N-API addon")

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSet requires N-API addon")

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetR requires N-API addon")

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt =
    throw UnsupportedOperationException("schedInfo requires N-API addon")

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt =
    throw UnsupportedOperationException("schedInfoR requires N-API addon")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun schedYieldR(): CInt =
    throw UnsupportedOperationException("schedYieldR requires N-API addon")

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    throw UnsupportedOperationException("schedCtl requires N-API addon")

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    throw UnsupportedOperationException("schedCtlR requires N-API addon")

public actual fun schedJobCreate(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobCreate requires N-API addon")

public actual fun schedJobCreateR(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobCreateR requires N-API addon")

public actual fun schedJobDestroy(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobDestroy requires N-API addon")

public actual fun schedJobDestroyR(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobDestroyR requires N-API addon")

public actual fun schedWaypoint(job: NtoJobT?, new: Long?, max: Long?, old: Long?): CInt =
    throw UnsupportedOperationException("schedWaypoint requires N-API addon")

public actual fun schedWaypointR(job: NtoJobT?, new: Long?, max: Long?, old: Long?): CInt =
    throw UnsupportedOperationException("schedWaypointR requires N-API addon")

public actual fun timerCreate(id: ClockidT, notify: Sigevent?): CInt =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerCreateR(id: ClockidT, notify: Sigevent?): CInt =
    throw UnsupportedOperationException("timerCreateR requires N-API addon")

public actual fun timerDestroy(id: TimerT): CInt =
    throw UnsupportedOperationException("timerDestroy requires N-API addon")

public actual fun timerDestroyR(id: TimerT): CInt =
    throw UnsupportedOperationException("timerDestroyR requires N-API addon")

public actual fun timerSettime(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt =
    throw UnsupportedOperationException("timerSettimeR requires N-API addon")

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt =
    throw UnsupportedOperationException("timerInfo requires N-API addon")

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt =
    throw UnsupportedOperationException("timerInfoR requires N-API addon")

public actual fun timerAlarm(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt =
    throw UnsupportedOperationException("timerAlarm requires N-API addon")

public actual fun timerAlarmR(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt =
    throw UnsupportedOperationException("timerAlarmR requires N-API addon")

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    throw UnsupportedOperationException("timerTimeout requires N-API addon")

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    throw UnsupportedOperationException("timerTimeoutR requires N-API addon")

public actual fun syncTypeCreate(type: CUInt, sync: SyncT?, attr: SyncAttr?): CInt =
    throw UnsupportedOperationException("syncTypeCreate requires N-API addon")

public actual fun syncTypeCreateR(type: CUInt, sync: SyncT?, attr: SyncAttr?): CInt =
    throw UnsupportedOperationException("syncTypeCreateR requires N-API addon")

public actual fun syncDestroy(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncDestroy requires N-API addon")

public actual fun syncDestroyR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncDestroyR requires N-API addon")

public actual fun syncCtl(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("syncCtl requires N-API addon")

public actual fun syncCtlR(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("syncCtlR requires N-API addon")

public actual fun syncMutexEvent(sync: SyncT?, event: Sigevent?): CInt =
    throw UnsupportedOperationException("syncMutexEvent requires N-API addon")

public actual fun syncMutexEventR(sync: SyncT?, event: Sigevent?): CInt =
    throw UnsupportedOperationException("syncMutexEventR requires N-API addon")

public actual fun syncMutexLock(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexLock requires N-API addon")

public actual fun syncMutexLockR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexLockR requires N-API addon")

public actual fun syncMutexUnlock(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexUnlock requires N-API addon")

public actual fun syncMutexUnlockR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexUnlockR requires N-API addon")

public actual fun syncMutexRevive(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexRevive requires N-API addon")

public actual fun syncMutexReviveR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexReviveR requires N-API addon")

public actual fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): CInt =
    throw UnsupportedOperationException("syncCondvarWait requires N-API addon")

public actual fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): CInt =
    throw UnsupportedOperationException("syncCondvarWaitR requires N-API addon")

public actual fun syncCondvarSignal(sync: SyncT?, all: CInt): CInt =
    throw UnsupportedOperationException("syncCondvarSignal requires N-API addon")

public actual fun syncCondvarSignalR(sync: SyncT?, all: CInt): CInt =
    throw UnsupportedOperationException("syncCondvarSignalR requires N-API addon")

public actual fun syncSemPost(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncSemPost requires N-API addon")

public actual fun syncSemPostR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncSemPostR requires N-API addon")

public actual fun syncSemWait(sync: SyncT?, tryto: CInt): CInt =
    throw UnsupportedOperationException("syncSemWait requires N-API addon")

public actual fun syncSemWaitR(sync: SyncT?, tryto: CInt): CInt =
    throw UnsupportedOperationException("syncSemWaitR requires N-API addon")

public actual fun clockTime(id: ClockidT, new: ULong?, old: ULong?): CInt =
    throw UnsupportedOperationException("clockTime requires N-API addon")

public actual fun clockTimeR(id: ClockidT, new: ULong?, old: ULong?): CInt =
    throw UnsupportedOperationException("clockTimeR requires N-API addon")

public actual fun clockAdjust(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt =
    throw UnsupportedOperationException("clockAdjust requires N-API addon")

public actual fun clockAdjustR(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt =
    throw UnsupportedOperationException("clockAdjustR requires N-API addon")

public actual fun clockPeriod(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt =
    throw UnsupportedOperationException("clockPeriod requires N-API addon")

public actual fun clockPeriodR(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt =
    throw UnsupportedOperationException("clockPeriodR requires N-API addon")

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    throw UnsupportedOperationException("clockId requires N-API addon")

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    throw UnsupportedOperationException("clockIdR requires N-API addon")

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    throw UnsupportedOperationException("interruptMask requires N-API addon")

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    throw UnsupportedOperationException("interruptUnmask requires N-API addon")

