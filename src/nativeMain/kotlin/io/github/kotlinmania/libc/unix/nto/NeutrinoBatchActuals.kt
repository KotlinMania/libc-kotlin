// port-lint: source Neutrino.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun channelCreate(flags: CUInt): CInt =
    throw UnsupportedOperationException("channelCreate requires manual FFI bridge — not yet implemented")

public actual fun channelCreateR(flags: CUInt): CInt =
    throw UnsupportedOperationException("channelCreateR requires manual FFI bridge — not yet implemented")

public actual fun channelCreatePulsePool(flags: CUInt, config: NtoChannelConfig?): CInt =
    throw UnsupportedOperationException("channelCreatePulsePool requires manual FFI bridge — not yet implemented")

public actual fun channelCreateExt(flags: CUInt, mode: ModeT, bufsize: ULong, maxnumbuf: CUInt, ev: Sigevent?, cred: CredInfo?): CInt =
    throw UnsupportedOperationException("channelCreateExt requires manual FFI bridge — not yet implemented")

public actual fun channelDestroy(chid: CInt): CInt =
    throw UnsupportedOperationException("channelDestroy requires manual FFI bridge — not yet implemented")

public actual fun channelDestroyR(chid: CInt): CInt =
    throw UnsupportedOperationException("channelDestroyR requires manual FFI bridge — not yet implemented")

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("connectAttach requires manual FFI bridge — not yet implemented")

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("connectAttachR requires manual FFI bridge — not yet implemented")

public actual fun connectDetach(coid: CInt): CInt =
    throw UnsupportedOperationException("connectDetach requires manual FFI bridge — not yet implemented")

public actual fun connectDetachR(coid: CInt): CInt =
    throw UnsupportedOperationException("connectDetachR requires manual FFI bridge — not yet implemented")

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("connectServerInfo requires manual FFI bridge — not yet implemented")

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("connectServerInfoR requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUInt?): CInt =
    throw UnsupportedOperationException("connectClientInfoExtraArgs requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUInt?): CInt =
    throw UnsupportedOperationException("connectClientInfoExtraArgsR requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfo(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfo requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoR(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfoR requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfoExt requires manual FFI bridge — not yet implemented")

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("clientInfoExtFree requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: ClientAble?, nable: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfoAble requires manual FFI bridge — not yet implemented")

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUInt, bits: CUInt): CInt =
    throw UnsupportedOperationException("connectFlags requires manual FFI bridge — not yet implemented")

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUInt, bits: CUInt): CInt =
    throw UnsupportedOperationException("connectFlagsR requires manual FFI bridge — not yet implemented")

public actual fun channelConnectAttr(id: CUInt, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: CUInt): CInt =
    throw UnsupportedOperationException("channelConnectAttr requires manual FFI bridge — not yet implemented")

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSend requires manual FFI bridge — not yet implemented")

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendR requires manual FFI bridge — not yet implemented")

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendnc requires manual FFI bridge — not yet implemented")

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendncR requires manual FFI bridge — not yet implemented")

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsv requires manual FFI bridge — not yet implemented")

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsvR requires manual FFI bridge — not yet implemented")

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsvnc requires manual FFI bridge — not yet implemented")

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsvncR requires manual FFI bridge — not yet implemented")

public actual fun msgSendvs(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvs requires manual FFI bridge — not yet implemented")

public actual fun msgSendvsR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvsR requires manual FFI bridge — not yet implemented")

public actual fun msgSendvsnc(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvsnc requires manual FFI bridge — not yet implemented")

public actual fun msgSendvsncR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvsncR requires manual FFI bridge — not yet implemented")

public actual fun msgSendv(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendv requires manual FFI bridge — not yet implemented")

public actual fun msgSendvR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendvR requires manual FFI bridge — not yet implemented")

public actual fun msgSendvnc(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendvnc requires manual FFI bridge — not yet implemented")

public actual fun msgSendvncR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendvncR requires manual FFI bridge — not yet implemented")

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceive requires manual FFI bridge — not yet implemented")

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceiveR requires manual FFI bridge — not yet implemented")

public actual fun msgReceivev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivev requires manual FFI bridge — not yet implemented")

public actual fun msgReceivevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivevR requires manual FFI bridge — not yet implemented")

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulse requires manual FFI bridge — not yet implemented")

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulseR requires manual FFI bridge — not yet implemented")

public actual fun msgReceivePulsev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulsev requires manual FFI bridge — not yet implemented")

public actual fun msgReceivePulsevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulsevR requires manual FFI bridge — not yet implemented")

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    throw UnsupportedOperationException("msgReply requires manual FFI bridge — not yet implemented")

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    throw UnsupportedOperationException("msgReplyR requires manual FFI bridge — not yet implemented")

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    throw UnsupportedOperationException("msgReplyv requires manual FFI bridge — not yet implemented")

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    throw UnsupportedOperationException("msgReplyvR requires manual FFI bridge — not yet implemented")

public actual fun msgReadiov(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    throw UnsupportedOperationException("msgReadiov requires manual FFI bridge — not yet implemented")

public actual fun msgReadiovR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    throw UnsupportedOperationException("msgReadiovR requires manual FFI bridge — not yet implemented")

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgRead requires manual FFI bridge — not yet implemented")

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadR requires manual FFI bridge — not yet implemented")

public actual fun msgReadv(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadv requires manual FFI bridge — not yet implemented")

public actual fun msgReadvR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadvR requires manual FFI bridge — not yet implemented")

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWrite requires manual FFI bridge — not yet implemented")

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWriteR requires manual FFI bridge — not yet implemented")

public actual fun msgWritev(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritev requires manual FFI bridge — not yet implemented")

public actual fun msgWritevR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritevR requires manual FFI bridge — not yet implemented")

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("msgSendPulse requires manual FFI bridge — not yet implemented")

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("msgSendPulseR requires manual FFI bridge — not yet implemented")

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("msgSendPulsePtr requires manual FFI bridge — not yet implemented")

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("msgSendPulsePtrR requires manual FFI bridge — not yet implemented")

public actual fun msgDeliverEvent(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgDeliverEvent requires manual FFI bridge — not yet implemented")

public actual fun msgDeliverEventR(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgDeliverEventR requires manual FFI bridge — not yet implemented")

public actual fun msgVerifyEvent(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgVerifyEvent requires manual FFI bridge — not yet implemented")

public actual fun msgVerifyEventR(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgVerifyEventR requires manual FFI bridge — not yet implemented")

public actual fun msgRegisterEvent(event: Sigevent?, coid: CInt): CInt =
    throw UnsupportedOperationException("msgRegisterEvent requires manual FFI bridge — not yet implemented")

public actual fun msgRegisterEventR(event: Sigevent?, coid: CInt): CInt =
    throw UnsupportedOperationException("msgRegisterEventR requires manual FFI bridge — not yet implemented")

public actual fun msgUnregisterEvent(event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgUnregisterEvent requires manual FFI bridge — not yet implemented")

public actual fun msgUnregisterEventR(event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgUnregisterEventR requires manual FFI bridge — not yet implemented")

public actual fun msgInfo(rcvid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgInfo requires manual FFI bridge — not yet implemented")

public actual fun msgInfoR(rcvid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgInfoR requires manual FFI bridge — not yet implemented")

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    throw UnsupportedOperationException("msgKeyData requires manual FFI bridge — not yet implemented")

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    throw UnsupportedOperationException("msgKeyDataR requires manual FFI bridge — not yet implemented")

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    throw UnsupportedOperationException("msgError requires manual FFI bridge — not yet implemented")

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    throw UnsupportedOperationException("msgErrorR requires manual FFI bridge — not yet implemented")

public actual fun msgCurrent(rcvid: CInt): CInt =
    throw UnsupportedOperationException("msgCurrent requires manual FFI bridge — not yet implemented")

public actual fun msgCurrentR(rcvid: CInt): CInt =
    throw UnsupportedOperationException("msgCurrentR requires manual FFI bridge — not yet implemented")

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("msgSendAsyncGbl requires manual FFI bridge — not yet implemented")

public actual fun msgSendAsync(coid: CInt): CInt =
    throw UnsupportedOperationException("msgSendAsync requires manual FFI bridge — not yet implemented")

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: CInt): CInt =
    throw UnsupportedOperationException("msgReceiveAsyncGbl requires manual FFI bridge — not yet implemented")

public actual fun msgReceiveAsync(chid: CInt, iov: Iovec?, parts: CUInt): CInt =
    throw UnsupportedOperationException("msgReceiveAsync requires manual FFI bridge — not yet implemented")

public actual fun msgPause(rcvid: CInt, cookie: CUInt): CInt =
    throw UnsupportedOperationException("msgPause requires manual FFI bridge — not yet implemented")

public actual fun msgPauseR(rcvid: CInt, cookie: CUInt): CInt =
    throw UnsupportedOperationException("msgPauseR requires manual FFI bridge — not yet implemented")

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("signalKill requires manual FFI bridge — not yet implemented")

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("signalKillR requires manual FFI bridge — not yet implemented")

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    throw UnsupportedOperationException("signalKillSigval requires manual FFI bridge — not yet implemented")

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    throw UnsupportedOperationException("signalKillSigvalR requires manual FFI bridge — not yet implemented")

public actual fun signalReturn(info: SighandlerInfo?): CInt =
    throw UnsupportedOperationException("signalReturn requires manual FFI bridge — not yet implemented")

public actual fun signalFault(sigcode: CUInt, regs: COpaquePointer?, refaddr: ULong): CInt =
    throw UnsupportedOperationException("signalFault requires manual FFI bridge — not yet implemented")

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("signalProcmask requires manual FFI bridge — not yet implemented")

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("signalProcmaskR requires manual FFI bridge — not yet implemented")

public actual fun signalSuspend(set: SigsetT?): CInt =
    throw UnsupportedOperationException("signalSuspend requires manual FFI bridge — not yet implemented")

public actual fun signalSuspendR(set: SigsetT?): CInt =
    throw UnsupportedOperationException("signalSuspendR requires manual FFI bridge — not yet implemented")

public actual fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("signalWaitinfo requires manual FFI bridge — not yet implemented")

public actual fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("signalWaitinfoR requires manual FFI bridge — not yet implemented")

public actual fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    throw UnsupportedOperationException("signalWaitinfoMask requires manual FFI bridge — not yet implemented")

public actual fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    throw UnsupportedOperationException("signalWaitinfoMaskR requires manual FFI bridge — not yet implemented")

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadDestroy requires manual FFI bridge — not yet implemented")

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadDestroyR requires manual FFI bridge — not yet implemented")

public actual fun threadDetach(tid: CInt): CInt =
    throw UnsupportedOperationException("threadDetach requires manual FFI bridge — not yet implemented")

public actual fun threadDetachR(tid: CInt): CInt =
    throw UnsupportedOperationException("threadDetachR requires manual FFI bridge — not yet implemented")

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadJoin requires manual FFI bridge — not yet implemented")

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadJoinR requires manual FFI bridge — not yet implemented")

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtl requires manual FFI bridge — not yet implemented")

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtlR requires manual FFI bridge — not yet implemented")

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtlExt requires manual FFI bridge — not yet implemented")

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtlExtR requires manual FFI bridge — not yet implemented")

public actual fun interruptHookOverdriveEvent(event: Sigevent?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptHookOverdriveEvent requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachEvent(intr: CInt, event: Sigevent?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachEvent requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachEventR(intr: CInt, event: Sigevent?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachEventR requires manual FFI bridge — not yet implemented")

public actual fun interruptDetach(id: CInt): CInt =
    throw UnsupportedOperationException("interruptDetach requires manual FFI bridge — not yet implemented")

public actual fun interruptDetachR(id: CInt): CInt =
    throw UnsupportedOperationException("interruptDetachR requires manual FFI bridge — not yet implemented")

public actual fun interruptWait(flags: CInt, timeout: ULong?): CInt =
    throw UnsupportedOperationException("interruptWait requires manual FFI bridge — not yet implemented")

public actual fun interruptWaitR(flags: CInt, timeout: ULong?): CInt =
    throw UnsupportedOperationException("interruptWaitR requires manual FFI bridge — not yet implemented")

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: CUInt?, old: CUInt?): CInt =
    throw UnsupportedOperationException("interruptCharacteristic requires manual FFI bridge — not yet implemented")

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: CUInt?, old: CUInt?): CInt =
    throw UnsupportedOperationException("interruptCharacteristicR requires manual FFI bridge — not yet implemented")

public actual fun schedGet(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGet requires manual FFI bridge — not yet implemented")

public actual fun schedGetR(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetR requires manual FFI bridge — not yet implemented")

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSet requires manual FFI bridge — not yet implemented")

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetR requires manual FFI bridge — not yet implemented")

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt =
    throw UnsupportedOperationException("schedInfo requires manual FFI bridge — not yet implemented")

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt =
    throw UnsupportedOperationException("schedInfoR requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun schedYieldR(): CInt =
    throw UnsupportedOperationException("schedYieldR requires manual FFI bridge — not yet implemented")

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    throw UnsupportedOperationException("schedCtl requires manual FFI bridge — not yet implemented")

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    throw UnsupportedOperationException("schedCtlR requires manual FFI bridge — not yet implemented")

public actual fun schedJobCreate(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobCreate requires manual FFI bridge — not yet implemented")

public actual fun schedJobCreateR(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobCreateR requires manual FFI bridge — not yet implemented")

public actual fun schedJobDestroy(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobDestroy requires manual FFI bridge — not yet implemented")

public actual fun schedJobDestroyR(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobDestroyR requires manual FFI bridge — not yet implemented")

public actual fun schedWaypoint(job: NtoJobT?, new: Long?, max: Long?, old: Long?): CInt =
    throw UnsupportedOperationException("schedWaypoint requires manual FFI bridge — not yet implemented")

public actual fun schedWaypointR(job: NtoJobT?, new: Long?, max: Long?, old: Long?): CInt =
    throw UnsupportedOperationException("schedWaypointR requires manual FFI bridge — not yet implemented")

public actual fun timerCreate(id: ClockidT, notify: Sigevent?): CInt =
    throw UnsupportedOperationException("timerCreate requires manual FFI bridge — not yet implemented")

public actual fun timerCreateR(id: ClockidT, notify: Sigevent?): CInt =
    throw UnsupportedOperationException("timerCreateR requires manual FFI bridge — not yet implemented")

public actual fun timerDestroy(id: TimerT): CInt =
    throw UnsupportedOperationException("timerDestroy requires manual FFI bridge — not yet implemented")

public actual fun timerDestroyR(id: TimerT): CInt =
    throw UnsupportedOperationException("timerDestroyR requires manual FFI bridge — not yet implemented")

public actual fun timerSettime(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt =
    throw UnsupportedOperationException("timerSettime requires manual FFI bridge — not yet implemented")

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt =
    throw UnsupportedOperationException("timerSettimeR requires manual FFI bridge — not yet implemented")

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt =
    throw UnsupportedOperationException("timerInfo requires manual FFI bridge — not yet implemented")

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt =
    throw UnsupportedOperationException("timerInfoR requires manual FFI bridge — not yet implemented")

public actual fun timerAlarm(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt =
    throw UnsupportedOperationException("timerAlarm requires manual FFI bridge — not yet implemented")

public actual fun timerAlarmR(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt =
    throw UnsupportedOperationException("timerAlarmR requires manual FFI bridge — not yet implemented")

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    throw UnsupportedOperationException("timerTimeout requires manual FFI bridge — not yet implemented")

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    throw UnsupportedOperationException("timerTimeoutR requires manual FFI bridge — not yet implemented")

public actual fun syncTypeCreate(type: CUInt, sync: SyncT?, attr: SyncAttr?): CInt =
    throw UnsupportedOperationException("syncTypeCreate requires manual FFI bridge — not yet implemented")

public actual fun syncTypeCreateR(type: CUInt, sync: SyncT?, attr: SyncAttr?): CInt =
    throw UnsupportedOperationException("syncTypeCreateR requires manual FFI bridge — not yet implemented")

public actual fun syncDestroy(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncDestroy requires manual FFI bridge — not yet implemented")

public actual fun syncDestroyR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncDestroyR requires manual FFI bridge — not yet implemented")

public actual fun syncCtl(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("syncCtl requires manual FFI bridge — not yet implemented")

public actual fun syncCtlR(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("syncCtlR requires manual FFI bridge — not yet implemented")

public actual fun syncMutexEvent(sync: SyncT?, event: Sigevent?): CInt =
    throw UnsupportedOperationException("syncMutexEvent requires manual FFI bridge — not yet implemented")

public actual fun syncMutexEventR(sync: SyncT?, event: Sigevent?): CInt =
    throw UnsupportedOperationException("syncMutexEventR requires manual FFI bridge — not yet implemented")

public actual fun syncMutexLock(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexLock requires manual FFI bridge — not yet implemented")

public actual fun syncMutexLockR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexLockR requires manual FFI bridge — not yet implemented")

public actual fun syncMutexUnlock(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun syncMutexUnlockR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexUnlockR requires manual FFI bridge — not yet implemented")

public actual fun syncMutexRevive(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexRevive requires manual FFI bridge — not yet implemented")

public actual fun syncMutexReviveR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexReviveR requires manual FFI bridge — not yet implemented")

public actual fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): CInt =
    throw UnsupportedOperationException("syncCondvarWait requires manual FFI bridge — not yet implemented")

public actual fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): CInt =
    throw UnsupportedOperationException("syncCondvarWaitR requires manual FFI bridge — not yet implemented")

public actual fun syncCondvarSignal(sync: SyncT?, all: CInt): CInt =
    throw UnsupportedOperationException("syncCondvarSignal requires manual FFI bridge — not yet implemented")

public actual fun syncCondvarSignalR(sync: SyncT?, all: CInt): CInt =
    throw UnsupportedOperationException("syncCondvarSignalR requires manual FFI bridge — not yet implemented")

public actual fun syncSemPost(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncSemPost requires manual FFI bridge — not yet implemented")

public actual fun syncSemPostR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncSemPostR requires manual FFI bridge — not yet implemented")

public actual fun syncSemWait(sync: SyncT?, tryto: CInt): CInt =
    throw UnsupportedOperationException("syncSemWait requires manual FFI bridge — not yet implemented")

public actual fun syncSemWaitR(sync: SyncT?, tryto: CInt): CInt =
    throw UnsupportedOperationException("syncSemWaitR requires manual FFI bridge — not yet implemented")

public actual fun clockTime(id: ClockidT, new: ULong?, old: ULong?): CInt =
    throw UnsupportedOperationException("clockTime requires manual FFI bridge — not yet implemented")

public actual fun clockTimeR(id: ClockidT, new: ULong?, old: ULong?): CInt =
    throw UnsupportedOperationException("clockTimeR requires manual FFI bridge — not yet implemented")

public actual fun clockAdjust(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt =
    throw UnsupportedOperationException("clockAdjust requires manual FFI bridge — not yet implemented")

public actual fun clockAdjustR(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt =
    throw UnsupportedOperationException("clockAdjustR requires manual FFI bridge — not yet implemented")

public actual fun clockPeriod(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt =
    throw UnsupportedOperationException("clockPeriod requires manual FFI bridge — not yet implemented")

public actual fun clockPeriodR(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt =
    throw UnsupportedOperationException("clockPeriodR requires manual FFI bridge — not yet implemented")

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    throw UnsupportedOperationException("clockId requires manual FFI bridge — not yet implemented")

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    throw UnsupportedOperationException("clockIdR requires manual FFI bridge — not yet implemented")

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    throw UnsupportedOperationException("interruptMask requires manual FFI bridge — not yet implemented")

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    throw UnsupportedOperationException("interruptUnmask requires manual FFI bridge — not yet implemented")

public actual fun signalAction(pid: PidT, sigstub: (() -> Unit)?, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    throw UnsupportedOperationException("signalAction requires manual FFI bridge — not yet implemented")

public actual fun signalActionR(pid: PidT, sigstub: (() -> Unit)?, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    throw UnsupportedOperationException("signalActionR requires manual FFI bridge — not yet implemented")

public actual fun threadCreate(pid: PidT, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    throw UnsupportedOperationException("threadCreate requires manual FFI bridge — not yet implemented")

public actual fun threadCreateR(pid: PidT, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    throw UnsupportedOperationException("threadCreateR requires manual FFI bridge — not yet implemented")

public actual fun threadCancel(tid: CInt, canstub: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("threadCancel requires manual FFI bridge — not yet implemented")

public actual fun threadCancelR(tid: CInt, canstub: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("threadCancelR requires manual FFI bridge — not yet implemented")

public actual fun interruptHookTrace(handler: ((CInt) -> Sigevent?)?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptHookTrace requires manual FFI bridge — not yet implemented")

public actual fun interruptHookIdle(handler: ((ULong?, QtimeEntry?) -> Unit)?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptHookIdle requires manual FFI bridge — not yet implemented")

public actual fun interruptHookIdle2(handler: (() -> Unit)?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptHookIdle2 requires manual FFI bridge — not yet implemented")

public actual fun interruptAttach(intr: CInt, handler: ((COpaquePointer?, CInt) -> Sigevent?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttach requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachR(intr: CInt, handler: ((COpaquePointer?, CInt) -> Sigevent?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachR requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachArray(intr: CInt, handler: ((COpaquePointer?, CInt) -> COpaquePointer?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachArray requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachArrayR(intr: CInt, handler: ((COpaquePointer?, CInt) -> COpaquePointer?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachArrayR requires manual FFI bridge — not yet implemented")
