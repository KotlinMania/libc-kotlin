// port-lint: source Neutrino.rs
package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Sigval

import io.github.kotlinmania.libc.*

public actual fun channelCreate(flags: UInt): Int =
    throw UnsupportedOperationException("channelCreate requires N-API addon")

public actual fun channelCreateR(flags: UInt): Int =
    throw UnsupportedOperationException("channelCreateR requires N-API addon")

public actual fun channelCreatePulsePool(flags: UInt, config: NtoChannelConfig?): Int =
    throw UnsupportedOperationException("channelCreatePulsePool requires N-API addon")

public actual fun channelCreateExt(flags: UInt, mode: UInt, bufsize: ULong, maxnumbuf: UInt, ev: Sigevent?, cred: CredInfo?): Int =
    throw UnsupportedOperationException("channelCreateExt requires N-API addon")

public actual fun channelDestroy(chid: Int): Int =
    throw UnsupportedOperationException("channelDestroy requires N-API addon")

public actual fun channelDestroyR(chid: Int): Int =
    throw UnsupportedOperationException("channelDestroyR requires N-API addon")

public actual fun connectAttach(nd: UInt, pid: Int, chid: Int, index: UInt, flags: Int): Int =
    throw UnsupportedOperationException("connectAttach requires N-API addon")

public actual fun connectAttachR(nd: UInt, pid: Int, chid: Int, index: UInt, flags: Int): Int =
    throw UnsupportedOperationException("connectAttachR requires N-API addon")

public actual fun connectDetach(coid: Int): Int =
    throw UnsupportedOperationException("connectDetach requires N-API addon")

public actual fun connectDetachR(coid: Int): Int =
    throw UnsupportedOperationException("connectDetachR requires N-API addon")

public actual fun connectServerInfo(pid: Int, coid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("connectServerInfo requires N-API addon")

public actual fun connectServerInfoR(pid: Int, coid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("connectServerInfoR requires N-API addon")

public actual fun connectClientInfoExtraArgs(scoid: Int, infoPp: ClientInfo?, ngroups: Int, abilities: ClientAble?, nable: Int, typeId: UInt?): Int =
    throw UnsupportedOperationException("connectClientInfoExtraArgs requires N-API addon")

public actual fun connectClientInfoExtraArgsR(scoid: Int, infoPp: ClientInfo?, ngroups: Int, abilities: ClientAble?, nable: Int, typeId: UInt?): Int =
    throw UnsupportedOperationException("connectClientInfoExtraArgsR requires N-API addon")

public actual fun connectClientInfo(scoid: Int, info: ClientInfo?, ngroups: Int): Int =
    throw UnsupportedOperationException("connectClientInfo requires N-API addon")

public actual fun connectClientInfoR(scoid: Int, info: ClientInfo?, ngroups: Int): Int =
    throw UnsupportedOperationException("connectClientInfoR requires N-API addon")

public actual fun connectClientInfoExt(scoid: Int, infoPp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("connectClientInfoExt requires N-API addon")

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): Int =
    throw UnsupportedOperationException("clientInfoExtFree requires N-API addon")

public actual fun connectClientInfoAble(scoid: Int, infoPp: COpaquePointer?, flags: Int, abilities: ClientAble?, nable: Int): Int =
    throw UnsupportedOperationException("connectClientInfoAble requires N-API addon")

public actual fun connectFlags(pid: Int, coid: Int, mask: UInt, bits: UInt): Int =
    throw UnsupportedOperationException("connectFlags requires N-API addon")

public actual fun connectFlagsR(pid: Int, coid: Int, mask: UInt, bits: UInt): Int =
    throw UnsupportedOperationException("connectFlagsR requires N-API addon")

public actual fun channelConnectAttr(id: UInt, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: UInt): Int =
    throw UnsupportedOperationException("channelConnectAttr requires N-API addon")

public actual fun msgSend(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSend requires N-API addon")

public actual fun msgSendR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendR requires N-API addon")

public actual fun msgSendnc(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendnc requires N-API addon")

public actual fun msgSendncR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendncR requires N-API addon")

public actual fun msgSendsv(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsv requires N-API addon")

public actual fun msgSendsvR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsvR requires N-API addon")

public actual fun msgSendsvnc(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsvnc requires N-API addon")

public actual fun msgSendsvncR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsvncR requires N-API addon")

public actual fun msgSendvs(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvs requires N-API addon")

public actual fun msgSendvsR(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvsR requires N-API addon")

public actual fun msgSendvsnc(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvsnc requires N-API addon")

public actual fun msgSendvsncR(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvsncR requires N-API addon")

public actual fun msgSendv(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendv requires N-API addon")

public actual fun msgSendvR(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendvR requires N-API addon")

public actual fun msgSendvnc(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendvnc requires N-API addon")

public actual fun msgSendvncR(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendvncR requires N-API addon")

public actual fun msgReceive(chid: Int, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceive requires N-API addon")

public actual fun msgReceiveR(chid: Int, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceiveR requires N-API addon")

public actual fun msgReceivev(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivev requires N-API addon")

public actual fun msgReceivevR(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivevR requires N-API addon")

public actual fun msgReceivePulse(chid: Int, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulse requires N-API addon")

public actual fun msgReceivePulseR(chid: Int, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulseR requires N-API addon")

public actual fun msgReceivePulsev(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulsev requires N-API addon")

public actual fun msgReceivePulsevR(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulsevR requires N-API addon")

public actual fun msgReply(rcvid: Int, status: Long, msg: COpaquePointer?, bytes: ULong): Int =
    throw UnsupportedOperationException("msgReply requires N-API addon")

public actual fun msgReplyR(rcvid: Int, status: Long, msg: COpaquePointer?, bytes: ULong): Int =
    throw UnsupportedOperationException("msgReplyR requires N-API addon")

public actual fun msgReplyv(rcvid: Int, status: Long, iov: Iovec?, parts: ULong): Int =
    throw UnsupportedOperationException("msgReplyv requires N-API addon")

public actual fun msgReplyvR(rcvid: Int, status: Long, iov: Iovec?, parts: ULong): Int =
    throw UnsupportedOperationException("msgReplyvR requires N-API addon")

public actual fun msgReadiov(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong, flags: Int): Long =
    throw UnsupportedOperationException("msgReadiov requires N-API addon")

public actual fun msgReadiovR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong, flags: Int): Long =
    throw UnsupportedOperationException("msgReadiovR requires N-API addon")

public actual fun msgRead(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgRead requires N-API addon")

public actual fun msgReadR(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadR requires N-API addon")

public actual fun msgReadv(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadv requires N-API addon")

public actual fun msgReadvR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadvR requires N-API addon")

public actual fun msgWrite(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWrite requires N-API addon")

public actual fun msgWriteR(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWriteR requires N-API addon")

public actual fun msgWritev(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritev requires N-API addon")

public actual fun msgWritevR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritevR requires N-API addon")

public actual fun msgSendPulse(coid: Int, priority: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("msgSendPulse requires N-API addon")

public actual fun msgSendPulseR(coid: Int, priority: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("msgSendPulseR requires N-API addon")

public actual fun msgSendPulsePtr(coid: Int, priority: Int, code: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("msgSendPulsePtr requires N-API addon")

public actual fun msgSendPulsePtrR(coid: Int, priority: Int, code: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("msgSendPulsePtrR requires N-API addon")

public actual fun msgDeliverEvent(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgDeliverEvent requires N-API addon")

public actual fun msgDeliverEventR(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgDeliverEventR requires N-API addon")

public actual fun msgVerifyEvent(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgVerifyEvent requires N-API addon")

public actual fun msgVerifyEventR(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgVerifyEventR requires N-API addon")

public actual fun msgRegisterEvent(event: Sigevent?, coid: Int): Int =
    throw UnsupportedOperationException("msgRegisterEvent requires N-API addon")

public actual fun msgRegisterEventR(event: Sigevent?, coid: Int): Int =
    throw UnsupportedOperationException("msgRegisterEventR requires N-API addon")

public actual fun msgUnregisterEvent(event: Sigevent?): Int =
    throw UnsupportedOperationException("msgUnregisterEvent requires N-API addon")

public actual fun msgUnregisterEventR(event: Sigevent?): Int =
    throw UnsupportedOperationException("msgUnregisterEventR requires N-API addon")

public actual fun msgInfo(rcvid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgInfo requires N-API addon")

public actual fun msgInfoR(rcvid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgInfoR requires N-API addon")

public actual fun msgKeyData(rcvid: Int, oper: Int, key: UInt, newkey: UInt?, iov: Iovec?, parts: Int): Int =
    throw UnsupportedOperationException("msgKeyData requires N-API addon")

public actual fun msgKeyDataR(rcvid: Int, oper: Int, key: UInt, newkey: UInt?, iov: Iovec?, parts: Int): Int =
    throw UnsupportedOperationException("msgKeyDataR requires N-API addon")

public actual fun msgError(rcvid: Int, err: Int): Int =
    throw UnsupportedOperationException("msgError requires N-API addon")

public actual fun msgErrorR(rcvid: Int, err: Int): Int =
    throw UnsupportedOperationException("msgErrorR requires N-API addon")

public actual fun msgCurrent(rcvid: Int): Int =
    throw UnsupportedOperationException("msgCurrent requires N-API addon")

public actual fun msgCurrentR(rcvid: Int): Int =
    throw UnsupportedOperationException("msgCurrentR requires N-API addon")

public actual fun msgSendAsyncGbl(coid: Int, smsg: COpaquePointer?, sbytes: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("msgSendAsyncGbl requires N-API addon")

public actual fun msgSendAsync(coid: Int): Int =
    throw UnsupportedOperationException("msgSendAsync requires N-API addon")

public actual fun msgReceiveAsyncGbl(chid: Int, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: Int): Int =
    throw UnsupportedOperationException("msgReceiveAsyncGbl requires N-API addon")

public actual fun msgReceiveAsync(chid: Int, iov: Iovec?, parts: UInt): Int =
    throw UnsupportedOperationException("msgReceiveAsync requires N-API addon")

public actual fun msgPause(rcvid: Int, cookie: UInt): Int =
    throw UnsupportedOperationException("msgPause requires N-API addon")

public actual fun msgPauseR(rcvid: Int, cookie: UInt): Int =
    throw UnsupportedOperationException("msgPauseR requires N-API addon")

public actual fun signalKill(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("signalKill requires N-API addon")

public actual fun signalKillR(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("signalKillR requires N-API addon")

public actual fun signalKillSigval(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Sigval?): Int =
    throw UnsupportedOperationException("signalKillSigval requires N-API addon")

public actual fun signalKillSigvalR(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Sigval?): Int =
    throw UnsupportedOperationException("signalKillSigvalR requires N-API addon")

public actual fun signalReturn(info: SighandlerInfo?): Int =
    throw UnsupportedOperationException("signalReturn requires N-API addon")

public actual fun signalFault(sigcode: UInt, regs: COpaquePointer?, refaddr: ULong): Int =
    throw UnsupportedOperationException("signalFault requires N-API addon")

public actual fun signalProcmask(pid: Int, tid: Int, how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("signalProcmask requires N-API addon")

public actual fun signalProcmaskR(pid: Int, tid: Int, how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("signalProcmaskR requires N-API addon")

public actual fun signalSuspend(set: SigsetT?): Int =
    throw UnsupportedOperationException("signalSuspend requires N-API addon")

public actual fun signalSuspendR(set: SigsetT?): Int =
    throw UnsupportedOperationException("signalSuspendR requires N-API addon")

public actual fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("signalWaitinfo requires N-API addon")

public actual fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("signalWaitinfoR requires N-API addon")

public actual fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): Int =
    throw UnsupportedOperationException("signalWaitinfoMask requires N-API addon")

public actual fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): Int =
    throw UnsupportedOperationException("signalWaitinfoMaskR requires N-API addon")

public actual fun threadDestroy(tid: Int, priority: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadDestroy requires N-API addon")

public actual fun threadDestroyR(tid: Int, priority: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadDestroyR requires N-API addon")

public actual fun threadDetach(tid: Int): Int =
    throw UnsupportedOperationException("threadDetach requires N-API addon")

public actual fun threadDetachR(tid: Int): Int =
    throw UnsupportedOperationException("threadDetachR requires N-API addon")

public actual fun threadJoin(tid: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadJoin requires N-API addon")

public actual fun threadJoinR(tid: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadJoinR requires N-API addon")

public actual fun threadCtl(cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtl requires N-API addon")

public actual fun threadCtlR(cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtlR requires N-API addon")

public actual fun threadCtlExt(pid: Int, tid: Int, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtlExt requires N-API addon")

public actual fun threadCtlExtR(pid: Int, tid: Int, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtlExtR requires N-API addon")

public actual fun interruptHookOverdriveEvent(event: Sigevent?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookOverdriveEvent requires N-API addon")

public actual fun interruptAttachEvent(intr: Int, event: Sigevent?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachEvent requires N-API addon")

public actual fun interruptAttachEventR(intr: Int, event: Sigevent?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachEventR requires N-API addon")

public actual fun interruptDetach(id: Int): Int =
    throw UnsupportedOperationException("interruptDetach requires N-API addon")

public actual fun interruptDetachR(id: Int): Int =
    throw UnsupportedOperationException("interruptDetachR requires N-API addon")

public actual fun interruptWait(flags: Int, timeout: ULong?): Int =
    throw UnsupportedOperationException("interruptWait requires N-API addon")

public actual fun interruptWaitR(flags: Int, timeout: ULong?): Int =
    throw UnsupportedOperationException("interruptWaitR requires N-API addon")

public actual fun interruptCharacteristic(type: Int, id: Int, new: UInt?, old: UInt?): Int =
    throw UnsupportedOperationException("interruptCharacteristic requires N-API addon")

public actual fun interruptCharacteristicR(type: Int, id: Int, new: UInt?, old: UInt?): Int =
    throw UnsupportedOperationException("interruptCharacteristicR requires N-API addon")

public actual fun schedGet(pid: Int, tid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGet requires N-API addon")

public actual fun schedGetR(pid: Int, tid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetR requires N-API addon")

public actual fun schedSet(pid: Int, tid: Int, algorithm: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSet requires N-API addon")

public actual fun schedSetR(pid: Int, tid: Int, algorithm: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetR requires N-API addon")

public actual fun schedInfo(pid: Int, algorithm: Int, info: SchedInfo?): Int =
    throw UnsupportedOperationException("schedInfo requires N-API addon")

public actual fun schedInfoR(pid: Int, algorithm: Int, info: SchedInfo?): Int =
    throw UnsupportedOperationException("schedInfoR requires N-API addon")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun schedYieldR(): Int =
    throw UnsupportedOperationException("schedYieldR requires N-API addon")

public actual fun schedCtl(cmd: Int, data: COpaquePointer?, length: ULong): Int =
    throw UnsupportedOperationException("schedCtl requires N-API addon")

public actual fun schedCtlR(cmd: Int, data: COpaquePointer?, length: ULong): Int =
    throw UnsupportedOperationException("schedCtlR requires N-API addon")

public actual fun schedJobCreate(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobCreate requires N-API addon")

public actual fun schedJobCreateR(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobCreateR requires N-API addon")

public actual fun schedJobDestroy(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobDestroy requires N-API addon")

public actual fun schedJobDestroyR(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobDestroyR requires N-API addon")

public actual fun schedWaypoint(job: io.github.kotlinmania.libc.unix.nto.SyncT?, new: Long?, max: Long?, old: Long?): Int =
    throw UnsupportedOperationException("schedWaypoint requires N-API addon")

public actual fun schedWaypointR(job: io.github.kotlinmania.libc.unix.nto.SyncT?, new: Long?, max: Long?, old: Long?): Int =
    throw UnsupportedOperationException("schedWaypointR requires N-API addon")

public actual fun timerCreate(id: Int, notify: Sigevent?): Int =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerCreateR(id: Int, notify: Sigevent?): Int =
    throw UnsupportedOperationException("timerCreateR requires N-API addon")

public actual fun timerDestroy(id: Int): Int =
    throw UnsupportedOperationException("timerDestroy requires N-API addon")

public actual fun timerDestroyR(id: Int): Int =
    throw UnsupportedOperationException("timerDestroyR requires N-API addon")

public actual fun timerSettime(id: Int, flags: Int, itime: Itimer?, oitime: Itimer?): Int =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun timerSettimeR(id: Int, flags: Int, itime: Itimer?, oitime: Itimer?): Int =
    throw UnsupportedOperationException("timerSettimeR requires N-API addon")

public actual fun timerInfo(pid: Int, id: Int, flags: Int, info: TimerInfo?): Int =
    throw UnsupportedOperationException("timerInfo requires N-API addon")

public actual fun timerInfoR(pid: Int, id: Int, flags: Int, info: TimerInfo?): Int =
    throw UnsupportedOperationException("timerInfoR requires N-API addon")

public actual fun timerAlarm(id: Int, itime: Itimer?, otime: Itimer?): Int =
    throw UnsupportedOperationException("timerAlarm requires N-API addon")

public actual fun timerAlarmR(id: Int, itime: Itimer?, otime: Itimer?): Int =
    throw UnsupportedOperationException("timerAlarmR requires N-API addon")

public actual fun timerTimeout(id: Int, flags: Int, notify: Sigevent?, ntime: ULong?, otime: ULong?): Int =
    throw UnsupportedOperationException("timerTimeout requires N-API addon")

public actual fun timerTimeoutR(id: Int, flags: Int, notify: Sigevent?, ntime: ULong?, otime: ULong?): Int =
    throw UnsupportedOperationException("timerTimeoutR requires N-API addon")

public actual fun syncTypeCreate(type: UInt, sync: SyncT?, attr: SyncAttr?): Int =
    throw UnsupportedOperationException("syncTypeCreate requires N-API addon")

public actual fun syncTypeCreateR(type: UInt, sync: SyncT?, attr: SyncAttr?): Int =
    throw UnsupportedOperationException("syncTypeCreateR requires N-API addon")

public actual fun syncDestroy(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncDestroy requires N-API addon")

public actual fun syncDestroyR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncDestroyR requires N-API addon")

public actual fun syncCtl(cmd: Int, sync: SyncT?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("syncCtl requires N-API addon")

public actual fun syncCtlR(cmd: Int, sync: SyncT?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("syncCtlR requires N-API addon")

public actual fun syncMutexEvent(sync: SyncT?, event: Sigevent?): Int =
    throw UnsupportedOperationException("syncMutexEvent requires N-API addon")

public actual fun syncMutexEventR(sync: SyncT?, event: Sigevent?): Int =
    throw UnsupportedOperationException("syncMutexEventR requires N-API addon")

public actual fun syncMutexLock(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexLock requires N-API addon")

public actual fun syncMutexLockR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexLockR requires N-API addon")

public actual fun syncMutexUnlock(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexUnlock requires N-API addon")

public actual fun syncMutexUnlockR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexUnlockR requires N-API addon")

public actual fun syncMutexRevive(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexRevive requires N-API addon")

public actual fun syncMutexReviveR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexReviveR requires N-API addon")

public actual fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): Int =
    throw UnsupportedOperationException("syncCondvarWait requires N-API addon")

public actual fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): Int =
    throw UnsupportedOperationException("syncCondvarWaitR requires N-API addon")

public actual fun syncCondvarSignal(sync: SyncT?, all: Int): Int =
    throw UnsupportedOperationException("syncCondvarSignal requires N-API addon")

public actual fun syncCondvarSignalR(sync: SyncT?, all: Int): Int =
    throw UnsupportedOperationException("syncCondvarSignalR requires N-API addon")

public actual fun syncSemPost(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncSemPost requires N-API addon")

public actual fun syncSemPostR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncSemPostR requires N-API addon")

public actual fun syncSemWait(sync: SyncT?, tryto: Int): Int =
    throw UnsupportedOperationException("syncSemWait requires N-API addon")

public actual fun syncSemWaitR(sync: SyncT?, tryto: Int): Int =
    throw UnsupportedOperationException("syncSemWaitR requires N-API addon")

public actual fun clockTime(id: Int, new: ULong?, old: ULong?): Int =
    throw UnsupportedOperationException("clockTime requires N-API addon")

public actual fun clockTimeR(id: Int, new: ULong?, old: ULong?): Int =
    throw UnsupportedOperationException("clockTimeR requires N-API addon")

public actual fun clockAdjust(id: Int, new: Clockadjust?, old: Clockadjust?): Int =
    throw UnsupportedOperationException("clockAdjust requires N-API addon")

public actual fun clockAdjustR(id: Int, new: Clockadjust?, old: Clockadjust?): Int =
    throw UnsupportedOperationException("clockAdjustR requires N-API addon")

public actual fun clockPeriod(id: Int, new: Clockperiod?, old: Clockperiod?, reserved: Int): Int =
    throw UnsupportedOperationException("clockPeriod requires N-API addon")

public actual fun clockPeriodR(id: Int, new: Clockperiod?, old: Clockperiod?, reserved: Int): Int =
    throw UnsupportedOperationException("clockPeriodR requires N-API addon")

public actual fun clockId(pid: Int, tid: Int): Int =
    throw UnsupportedOperationException("clockId requires N-API addon")

public actual fun clockIdR(pid: Int, tid: Int): Int =
    throw UnsupportedOperationException("clockIdR requires N-API addon")

public actual fun interruptMask(intr: Int, id: Int): Int =
    throw UnsupportedOperationException("interruptMask requires N-API addon")

public actual fun interruptUnmask(intr: Int, id: Int): Int =
    throw UnsupportedOperationException("interruptUnmask requires N-API addon")

public actual fun signalAction(pid: Int, sigstub: (() -> Unit)?, signo: Int, act: Sigaction?, oact: Sigaction?): Int =
    throw UnsupportedOperationException("signalAction requires N-API addon")

public actual fun signalActionR(pid: Int, sigstub: (() -> Unit)?, signo: Int, act: Sigaction?, oact: Sigaction?): Int =
    throw UnsupportedOperationException("signalActionR requires N-API addon")

public actual fun threadCreate(pid: Int, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): Int =
    throw UnsupportedOperationException("threadCreate requires N-API addon")

public actual fun threadCreateR(pid: Int, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): Int =
    throw UnsupportedOperationException("threadCreateR requires N-API addon")

public actual fun threadCancel(tid: Int, canstub: (() -> Unit)?): Int =
    throw UnsupportedOperationException("threadCancel requires N-API addon")

public actual fun threadCancelR(tid: Int, canstub: (() -> Unit)?): Int =
    throw UnsupportedOperationException("threadCancelR requires N-API addon")

public actual fun interruptHookTrace(handler: ((Int) -> Sigevent?)?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookTrace requires N-API addon")

public actual fun interruptHookIdle(handler: ((ULong?, QtimeEntry?) -> Unit)?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookIdle requires N-API addon")

public actual fun interruptHookIdle2(handler: (() -> Unit)?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookIdle2 requires N-API addon")

public actual fun interruptAttach(intr: Int, handler: ((COpaquePointer?, Int) -> Sigevent?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttach requires N-API addon")

public actual fun interruptAttachR(intr: Int, handler: ((COpaquePointer?, Int) -> Sigevent?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachR requires N-API addon")

public actual fun interruptAttachArray(intr: Int, handler: ((COpaquePointer?, Int) -> COpaquePointer?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachArray requires N-API addon")

public actual fun interruptAttachArrayR(intr: Int, handler: ((COpaquePointer?, Int) -> COpaquePointer?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachArrayR requires N-API addon")
