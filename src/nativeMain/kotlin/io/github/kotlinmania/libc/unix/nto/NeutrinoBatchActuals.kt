// port-lint: source Neutrino.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Sigval
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun channelCreate(flags: UInt): Int =
    throw UnsupportedOperationException("channelCreate requires manual FFI bridge — not yet implemented")

public actual fun channelCreateR(flags: UInt): Int =
    throw UnsupportedOperationException("channelCreateR requires manual FFI bridge — not yet implemented")

public actual fun channelCreatePulsePool(flags: UInt, config: NtoChannelConfig?): Int =
    throw UnsupportedOperationException("channelCreatePulsePool requires manual FFI bridge — not yet implemented")

public actual fun channelCreateExt(flags: UInt, mode: UInt, bufsize: ULong, maxnumbuf: UInt, ev: Sigevent?, cred: CredInfo?): Int =
    throw UnsupportedOperationException("channelCreateExt requires manual FFI bridge — not yet implemented")

public actual fun channelDestroy(chid: Int): Int =
    throw UnsupportedOperationException("channelDestroy requires manual FFI bridge — not yet implemented")

public actual fun channelDestroyR(chid: Int): Int =
    throw UnsupportedOperationException("channelDestroyR requires manual FFI bridge — not yet implemented")

public actual fun connectAttach(nd: UInt, pid: Int, chid: Int, index: UInt, flags: Int): Int =
    throw UnsupportedOperationException("connectAttach requires manual FFI bridge — not yet implemented")

public actual fun connectAttachR(nd: UInt, pid: Int, chid: Int, index: UInt, flags: Int): Int =
    throw UnsupportedOperationException("connectAttachR requires manual FFI bridge — not yet implemented")

public actual fun connectDetach(coid: Int): Int =
    throw UnsupportedOperationException("connectDetach requires manual FFI bridge — not yet implemented")

public actual fun connectDetachR(coid: Int): Int =
    throw UnsupportedOperationException("connectDetachR requires manual FFI bridge — not yet implemented")

public actual fun connectServerInfo(pid: Int, coid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("connectServerInfo requires manual FFI bridge — not yet implemented")

public actual fun connectServerInfoR(pid: Int, coid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("connectServerInfoR requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoExtraArgs(scoid: Int, infoPp: ClientInfo?, ngroups: Int, abilities: ClientAble?, nable: Int, typeId: UInt?): Int =
    throw UnsupportedOperationException("connectClientInfoExtraArgs requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoExtraArgsR(scoid: Int, infoPp: ClientInfo?, ngroups: Int, abilities: ClientAble?, nable: Int, typeId: UInt?): Int =
    throw UnsupportedOperationException("connectClientInfoExtraArgsR requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfo(scoid: Int, info: ClientInfo?, ngroups: Int): Int =
    throw UnsupportedOperationException("connectClientInfo requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoR(scoid: Int, info: ClientInfo?, ngroups: Int): Int =
    throw UnsupportedOperationException("connectClientInfoR requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoExt(scoid: Int, infoPp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("connectClientInfoExt requires manual FFI bridge — not yet implemented")

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): Int =
    throw UnsupportedOperationException("clientInfoExtFree requires manual FFI bridge — not yet implemented")

public actual fun connectClientInfoAble(scoid: Int, infoPp: COpaquePointer?, flags: Int, abilities: ClientAble?, nable: Int): Int =
    throw UnsupportedOperationException("connectClientInfoAble requires manual FFI bridge — not yet implemented")

public actual fun connectFlags(pid: Int, coid: Int, mask: UInt, bits: UInt): Int =
    throw UnsupportedOperationException("connectFlags requires manual FFI bridge — not yet implemented")

public actual fun connectFlagsR(pid: Int, coid: Int, mask: UInt, bits: UInt): Int =
    throw UnsupportedOperationException("connectFlagsR requires manual FFI bridge — not yet implemented")

public actual fun channelConnectAttr(id: UInt, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: UInt): Int =
    throw UnsupportedOperationException("channelConnectAttr requires manual FFI bridge — not yet implemented")

public actual fun msgSend(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSend requires manual FFI bridge — not yet implemented")

public actual fun msgSendR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendR requires manual FFI bridge — not yet implemented")

public actual fun msgSendnc(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendnc requires manual FFI bridge — not yet implemented")

public actual fun msgSendncR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendncR requires manual FFI bridge — not yet implemented")

public actual fun msgSendsv(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsv requires manual FFI bridge — not yet implemented")

public actual fun msgSendsvR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsvR requires manual FFI bridge — not yet implemented")

public actual fun msgSendsvnc(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsvnc requires manual FFI bridge — not yet implemented")

public actual fun msgSendsvncR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsvncR requires manual FFI bridge — not yet implemented")

public actual fun msgSendvs(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvs requires manual FFI bridge — not yet implemented")

public actual fun msgSendvsR(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvsR requires manual FFI bridge — not yet implemented")

public actual fun msgSendvsnc(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvsnc requires manual FFI bridge — not yet implemented")

public actual fun msgSendvsncR(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvsncR requires manual FFI bridge — not yet implemented")

public actual fun msgSendv(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendv requires manual FFI bridge — not yet implemented")

public actual fun msgSendvR(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendvR requires manual FFI bridge — not yet implemented")

public actual fun msgSendvnc(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendvnc requires manual FFI bridge — not yet implemented")

public actual fun msgSendvncR(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendvncR requires manual FFI bridge — not yet implemented")

public actual fun msgReceive(chid: Int, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceive requires manual FFI bridge — not yet implemented")

public actual fun msgReceiveR(chid: Int, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceiveR requires manual FFI bridge — not yet implemented")

public actual fun msgReceivev(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivev requires manual FFI bridge — not yet implemented")

public actual fun msgReceivevR(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivevR requires manual FFI bridge — not yet implemented")

public actual fun msgReceivePulse(chid: Int, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulse requires manual FFI bridge — not yet implemented")

public actual fun msgReceivePulseR(chid: Int, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulseR requires manual FFI bridge — not yet implemented")

public actual fun msgReceivePulsev(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulsev requires manual FFI bridge — not yet implemented")

public actual fun msgReceivePulsevR(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulsevR requires manual FFI bridge — not yet implemented")

public actual fun msgReply(rcvid: Int, status: Long, msg: COpaquePointer?, bytes: ULong): Int =
    throw UnsupportedOperationException("msgReply requires manual FFI bridge — not yet implemented")

public actual fun msgReplyR(rcvid: Int, status: Long, msg: COpaquePointer?, bytes: ULong): Int =
    throw UnsupportedOperationException("msgReplyR requires manual FFI bridge — not yet implemented")

public actual fun msgReplyv(rcvid: Int, status: Long, iov: Iovec?, parts: ULong): Int =
    throw UnsupportedOperationException("msgReplyv requires manual FFI bridge — not yet implemented")

public actual fun msgReplyvR(rcvid: Int, status: Long, iov: Iovec?, parts: ULong): Int =
    throw UnsupportedOperationException("msgReplyvR requires manual FFI bridge — not yet implemented")

public actual fun msgReadiov(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong, flags: Int): Long =
    throw UnsupportedOperationException("msgReadiov requires manual FFI bridge — not yet implemented")

public actual fun msgReadiovR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong, flags: Int): Long =
    throw UnsupportedOperationException("msgReadiovR requires manual FFI bridge — not yet implemented")

public actual fun msgRead(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgRead requires manual FFI bridge — not yet implemented")

public actual fun msgReadR(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadR requires manual FFI bridge — not yet implemented")

public actual fun msgReadv(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadv requires manual FFI bridge — not yet implemented")

public actual fun msgReadvR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadvR requires manual FFI bridge — not yet implemented")

public actual fun msgWrite(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWrite requires manual FFI bridge — not yet implemented")

public actual fun msgWriteR(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWriteR requires manual FFI bridge — not yet implemented")

public actual fun msgWritev(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritev requires manual FFI bridge — not yet implemented")

public actual fun msgWritevR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritevR requires manual FFI bridge — not yet implemented")

public actual fun msgSendPulse(coid: Int, priority: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("msgSendPulse requires manual FFI bridge — not yet implemented")

public actual fun msgSendPulseR(coid: Int, priority: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("msgSendPulseR requires manual FFI bridge — not yet implemented")

public actual fun msgSendPulsePtr(coid: Int, priority: Int, code: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("msgSendPulsePtr requires manual FFI bridge — not yet implemented")

public actual fun msgSendPulsePtrR(coid: Int, priority: Int, code: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("msgSendPulsePtrR requires manual FFI bridge — not yet implemented")

public actual fun msgDeliverEvent(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgDeliverEvent requires manual FFI bridge — not yet implemented")

public actual fun msgDeliverEventR(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgDeliverEventR requires manual FFI bridge — not yet implemented")

public actual fun msgVerifyEvent(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgVerifyEvent requires manual FFI bridge — not yet implemented")

public actual fun msgVerifyEventR(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgVerifyEventR requires manual FFI bridge — not yet implemented")

public actual fun msgRegisterEvent(event: Sigevent?, coid: Int): Int =
    throw UnsupportedOperationException("msgRegisterEvent requires manual FFI bridge — not yet implemented")

public actual fun msgRegisterEventR(event: Sigevent?, coid: Int): Int =
    throw UnsupportedOperationException("msgRegisterEventR requires manual FFI bridge — not yet implemented")

public actual fun msgUnregisterEvent(event: Sigevent?): Int =
    throw UnsupportedOperationException("msgUnregisterEvent requires manual FFI bridge — not yet implemented")

public actual fun msgUnregisterEventR(event: Sigevent?): Int =
    throw UnsupportedOperationException("msgUnregisterEventR requires manual FFI bridge — not yet implemented")

public actual fun msgInfo(rcvid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgInfo requires manual FFI bridge — not yet implemented")

public actual fun msgInfoR(rcvid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgInfoR requires manual FFI bridge — not yet implemented")

public actual fun msgKeyData(rcvid: Int, oper: Int, key: UInt, newkey: UInt?, iov: Iovec?, parts: Int): Int =
    throw UnsupportedOperationException("msgKeyData requires manual FFI bridge — not yet implemented")

public actual fun msgKeyDataR(rcvid: Int, oper: Int, key: UInt, newkey: UInt?, iov: Iovec?, parts: Int): Int =
    throw UnsupportedOperationException("msgKeyDataR requires manual FFI bridge — not yet implemented")

public actual fun msgError(rcvid: Int, err: Int): Int =
    throw UnsupportedOperationException("msgError requires manual FFI bridge — not yet implemented")

public actual fun msgErrorR(rcvid: Int, err: Int): Int =
    throw UnsupportedOperationException("msgErrorR requires manual FFI bridge — not yet implemented")

public actual fun msgCurrent(rcvid: Int): Int =
    throw UnsupportedOperationException("msgCurrent requires manual FFI bridge — not yet implemented")

public actual fun msgCurrentR(rcvid: Int): Int =
    throw UnsupportedOperationException("msgCurrentR requires manual FFI bridge — not yet implemented")

public actual fun msgSendAsyncGbl(coid: Int, smsg: COpaquePointer?, sbytes: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("msgSendAsyncGbl requires manual FFI bridge — not yet implemented")

public actual fun msgSendAsync(coid: Int): Int =
    throw UnsupportedOperationException("msgSendAsync requires manual FFI bridge — not yet implemented")

public actual fun msgReceiveAsyncGbl(chid: Int, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: Int): Int =
    throw UnsupportedOperationException("msgReceiveAsyncGbl requires manual FFI bridge — not yet implemented")

public actual fun msgReceiveAsync(chid: Int, iov: Iovec?, parts: UInt): Int =
    throw UnsupportedOperationException("msgReceiveAsync requires manual FFI bridge — not yet implemented")

public actual fun msgPause(rcvid: Int, cookie: UInt): Int =
    throw UnsupportedOperationException("msgPause requires manual FFI bridge — not yet implemented")

public actual fun msgPauseR(rcvid: Int, cookie: UInt): Int =
    throw UnsupportedOperationException("msgPauseR requires manual FFI bridge — not yet implemented")

public actual fun signalKill(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("signalKill requires manual FFI bridge — not yet implemented")

public actual fun signalKillR(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("signalKillR requires manual FFI bridge — not yet implemented")

public actual fun signalKillSigval(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Sigval?): Int =
    throw UnsupportedOperationException("signalKillSigval requires manual FFI bridge — not yet implemented")

public actual fun signalKillSigvalR(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Sigval?): Int =
    throw UnsupportedOperationException("signalKillSigvalR requires manual FFI bridge — not yet implemented")

public actual fun signalReturn(info: SighandlerInfo?): Int =
    throw UnsupportedOperationException("signalReturn requires manual FFI bridge — not yet implemented")

public actual fun signalFault(sigcode: UInt, regs: COpaquePointer?, refaddr: ULong): Int =
    throw UnsupportedOperationException("signalFault requires manual FFI bridge — not yet implemented")

public actual fun signalProcmask(pid: Int, tid: Int, how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("signalProcmask requires manual FFI bridge — not yet implemented")

public actual fun signalProcmaskR(pid: Int, tid: Int, how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("signalProcmaskR requires manual FFI bridge — not yet implemented")

public actual fun signalSuspend(set: SigsetT?): Int =
    throw UnsupportedOperationException("signalSuspend requires manual FFI bridge — not yet implemented")

public actual fun signalSuspendR(set: SigsetT?): Int =
    throw UnsupportedOperationException("signalSuspendR requires manual FFI bridge — not yet implemented")

public actual fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("signalWaitinfo requires manual FFI bridge — not yet implemented")

public actual fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("signalWaitinfoR requires manual FFI bridge — not yet implemented")

public actual fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): Int =
    throw UnsupportedOperationException("signalWaitinfoMask requires manual FFI bridge — not yet implemented")

public actual fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): Int =
    throw UnsupportedOperationException("signalWaitinfoMaskR requires manual FFI bridge — not yet implemented")

public actual fun threadDestroy(tid: Int, priority: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadDestroy requires manual FFI bridge — not yet implemented")

public actual fun threadDestroyR(tid: Int, priority: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadDestroyR requires manual FFI bridge — not yet implemented")

public actual fun threadDetach(tid: Int): Int =
    throw UnsupportedOperationException("threadDetach requires manual FFI bridge — not yet implemented")

public actual fun threadDetachR(tid: Int): Int =
    throw UnsupportedOperationException("threadDetachR requires manual FFI bridge — not yet implemented")

public actual fun threadJoin(tid: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadJoin requires manual FFI bridge — not yet implemented")

public actual fun threadJoinR(tid: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadJoinR requires manual FFI bridge — not yet implemented")

public actual fun threadCtl(cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtl requires manual FFI bridge — not yet implemented")

public actual fun threadCtlR(cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtlR requires manual FFI bridge — not yet implemented")

public actual fun threadCtlExt(pid: Int, tid: Int, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtlExt requires manual FFI bridge — not yet implemented")

public actual fun threadCtlExtR(pid: Int, tid: Int, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtlExtR requires manual FFI bridge — not yet implemented")

public actual fun interruptHookOverdriveEvent(event: Sigevent?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookOverdriveEvent requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachEvent(intr: Int, event: Sigevent?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachEvent requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachEventR(intr: Int, event: Sigevent?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachEventR requires manual FFI bridge — not yet implemented")

public actual fun interruptDetach(id: Int): Int =
    throw UnsupportedOperationException("interruptDetach requires manual FFI bridge — not yet implemented")

public actual fun interruptDetachR(id: Int): Int =
    throw UnsupportedOperationException("interruptDetachR requires manual FFI bridge — not yet implemented")

public actual fun interruptWait(flags: Int, timeout: ULong?): Int =
    throw UnsupportedOperationException("interruptWait requires manual FFI bridge — not yet implemented")

public actual fun interruptWaitR(flags: Int, timeout: ULong?): Int =
    throw UnsupportedOperationException("interruptWaitR requires manual FFI bridge — not yet implemented")

public actual fun interruptCharacteristic(type: Int, id: Int, new: UInt?, old: UInt?): Int =
    throw UnsupportedOperationException("interruptCharacteristic requires manual FFI bridge — not yet implemented")

public actual fun interruptCharacteristicR(type: Int, id: Int, new: UInt?, old: UInt?): Int =
    throw UnsupportedOperationException("interruptCharacteristicR requires manual FFI bridge — not yet implemented")

public actual fun schedGet(pid: Int, tid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGet requires manual FFI bridge — not yet implemented")

public actual fun schedGetR(pid: Int, tid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetR requires manual FFI bridge — not yet implemented")

public actual fun schedSet(pid: Int, tid: Int, algorithm: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSet requires manual FFI bridge — not yet implemented")

public actual fun schedSetR(pid: Int, tid: Int, algorithm: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetR requires manual FFI bridge — not yet implemented")

public actual fun schedInfo(pid: Int, algorithm: Int, info: SchedInfo?): Int =
    throw UnsupportedOperationException("schedInfo requires manual FFI bridge — not yet implemented")

public actual fun schedInfoR(pid: Int, algorithm: Int, info: SchedInfo?): Int =
    throw UnsupportedOperationException("schedInfoR requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun schedYieldR(): Int =
    throw UnsupportedOperationException("schedYieldR requires manual FFI bridge — not yet implemented")

public actual fun schedCtl(cmd: Int, data: COpaquePointer?, length: ULong): Int =
    throw UnsupportedOperationException("schedCtl requires manual FFI bridge — not yet implemented")

public actual fun schedCtlR(cmd: Int, data: COpaquePointer?, length: ULong): Int =
    throw UnsupportedOperationException("schedCtlR requires manual FFI bridge — not yet implemented")

public actual fun schedJobCreate(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobCreate requires manual FFI bridge — not yet implemented")

public actual fun schedJobCreateR(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobCreateR requires manual FFI bridge — not yet implemented")

public actual fun schedJobDestroy(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobDestroy requires manual FFI bridge — not yet implemented")

public actual fun schedJobDestroyR(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobDestroyR requires manual FFI bridge — not yet implemented")

public actual fun schedWaypoint(job: io.github.kotlinmania.libc.unix.nto.SyncT?, new: Long?, max: Long?, old: Long?): Int =
    throw UnsupportedOperationException("schedWaypoint requires manual FFI bridge — not yet implemented")

public actual fun schedWaypointR(job: io.github.kotlinmania.libc.unix.nto.SyncT?, new: Long?, max: Long?, old: Long?): Int =
    throw UnsupportedOperationException("schedWaypointR requires manual FFI bridge — not yet implemented")

public actual fun timerCreate(id: Int, notify: Sigevent?): Int =
    throw UnsupportedOperationException("timerCreate requires manual FFI bridge — not yet implemented")

public actual fun timerCreateR(id: Int, notify: Sigevent?): Int =
    throw UnsupportedOperationException("timerCreateR requires manual FFI bridge — not yet implemented")

public actual fun timerDestroy(id: Int): Int =
    throw UnsupportedOperationException("timerDestroy requires manual FFI bridge — not yet implemented")

public actual fun timerDestroyR(id: Int): Int =
    throw UnsupportedOperationException("timerDestroyR requires manual FFI bridge — not yet implemented")

public actual fun timerSettime(id: Int, flags: Int, itime: Itimer?, oitime: Itimer?): Int =
    throw UnsupportedOperationException("timerSettime requires manual FFI bridge — not yet implemented")

public actual fun timerSettimeR(id: Int, flags: Int, itime: Itimer?, oitime: Itimer?): Int =
    throw UnsupportedOperationException("timerSettimeR requires manual FFI bridge — not yet implemented")

public actual fun timerInfo(pid: Int, id: Int, flags: Int, info: TimerInfo?): Int =
    throw UnsupportedOperationException("timerInfo requires manual FFI bridge — not yet implemented")

public actual fun timerInfoR(pid: Int, id: Int, flags: Int, info: TimerInfo?): Int =
    throw UnsupportedOperationException("timerInfoR requires manual FFI bridge — not yet implemented")

public actual fun timerAlarm(id: Int, itime: Itimer?, otime: Itimer?): Int =
    throw UnsupportedOperationException("timerAlarm requires manual FFI bridge — not yet implemented")

public actual fun timerAlarmR(id: Int, itime: Itimer?, otime: Itimer?): Int =
    throw UnsupportedOperationException("timerAlarmR requires manual FFI bridge — not yet implemented")

public actual fun timerTimeout(id: Int, flags: Int, notify: Sigevent?, ntime: ULong?, otime: ULong?): Int =
    throw UnsupportedOperationException("timerTimeout requires manual FFI bridge — not yet implemented")

public actual fun timerTimeoutR(id: Int, flags: Int, notify: Sigevent?, ntime: ULong?, otime: ULong?): Int =
    throw UnsupportedOperationException("timerTimeoutR requires manual FFI bridge — not yet implemented")

public actual fun syncTypeCreate(type: UInt, sync: SyncT?, attr: SyncAttr?): Int =
    throw UnsupportedOperationException("syncTypeCreate requires manual FFI bridge — not yet implemented")

public actual fun syncTypeCreateR(type: UInt, sync: SyncT?, attr: SyncAttr?): Int =
    throw UnsupportedOperationException("syncTypeCreateR requires manual FFI bridge — not yet implemented")

public actual fun syncDestroy(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncDestroy requires manual FFI bridge — not yet implemented")

public actual fun syncDestroyR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncDestroyR requires manual FFI bridge — not yet implemented")

public actual fun syncCtl(cmd: Int, sync: SyncT?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("syncCtl requires manual FFI bridge — not yet implemented")

public actual fun syncCtlR(cmd: Int, sync: SyncT?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("syncCtlR requires manual FFI bridge — not yet implemented")

public actual fun syncMutexEvent(sync: SyncT?, event: Sigevent?): Int =
    throw UnsupportedOperationException("syncMutexEvent requires manual FFI bridge — not yet implemented")

public actual fun syncMutexEventR(sync: SyncT?, event: Sigevent?): Int =
    throw UnsupportedOperationException("syncMutexEventR requires manual FFI bridge — not yet implemented")

public actual fun syncMutexLock(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexLock requires manual FFI bridge — not yet implemented")

public actual fun syncMutexLockR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexLockR requires manual FFI bridge — not yet implemented")

public actual fun syncMutexUnlock(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun syncMutexUnlockR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexUnlockR requires manual FFI bridge — not yet implemented")

public actual fun syncMutexRevive(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexRevive requires manual FFI bridge — not yet implemented")

public actual fun syncMutexReviveR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexReviveR requires manual FFI bridge — not yet implemented")

public actual fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): Int =
    throw UnsupportedOperationException("syncCondvarWait requires manual FFI bridge — not yet implemented")

public actual fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): Int =
    throw UnsupportedOperationException("syncCondvarWaitR requires manual FFI bridge — not yet implemented")

public actual fun syncCondvarSignal(sync: SyncT?, all: Int): Int =
    throw UnsupportedOperationException("syncCondvarSignal requires manual FFI bridge — not yet implemented")

public actual fun syncCondvarSignalR(sync: SyncT?, all: Int): Int =
    throw UnsupportedOperationException("syncCondvarSignalR requires manual FFI bridge — not yet implemented")

public actual fun syncSemPost(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncSemPost requires manual FFI bridge — not yet implemented")

public actual fun syncSemPostR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncSemPostR requires manual FFI bridge — not yet implemented")

public actual fun syncSemWait(sync: SyncT?, tryto: Int): Int =
    throw UnsupportedOperationException("syncSemWait requires manual FFI bridge — not yet implemented")

public actual fun syncSemWaitR(sync: SyncT?, tryto: Int): Int =
    throw UnsupportedOperationException("syncSemWaitR requires manual FFI bridge — not yet implemented")

public actual fun clockTime(id: Int, new: ULong?, old: ULong?): Int =
    throw UnsupportedOperationException("clockTime requires manual FFI bridge — not yet implemented")

public actual fun clockTimeR(id: Int, new: ULong?, old: ULong?): Int =
    throw UnsupportedOperationException("clockTimeR requires manual FFI bridge — not yet implemented")

public actual fun clockAdjust(id: Int, new: Clockadjust?, old: Clockadjust?): Int =
    throw UnsupportedOperationException("clockAdjust requires manual FFI bridge — not yet implemented")

public actual fun clockAdjustR(id: Int, new: Clockadjust?, old: Clockadjust?): Int =
    throw UnsupportedOperationException("clockAdjustR requires manual FFI bridge — not yet implemented")

public actual fun clockPeriod(id: Int, new: Clockperiod?, old: Clockperiod?, reserved: Int): Int =
    throw UnsupportedOperationException("clockPeriod requires manual FFI bridge — not yet implemented")

public actual fun clockPeriodR(id: Int, new: Clockperiod?, old: Clockperiod?, reserved: Int): Int =
    throw UnsupportedOperationException("clockPeriodR requires manual FFI bridge — not yet implemented")

public actual fun clockId(pid: Int, tid: Int): Int =
    throw UnsupportedOperationException("clockId requires manual FFI bridge — not yet implemented")

public actual fun clockIdR(pid: Int, tid: Int): Int =
    throw UnsupportedOperationException("clockIdR requires manual FFI bridge — not yet implemented")

public actual fun interruptMask(intr: Int, id: Int): Int =
    throw UnsupportedOperationException("interruptMask requires manual FFI bridge — not yet implemented")

public actual fun interruptUnmask(intr: Int, id: Int): Int =
    throw UnsupportedOperationException("interruptUnmask requires manual FFI bridge — not yet implemented")

public actual fun signalAction(pid: Int, sigstub: (() -> Unit)?, signo: Int, act: Sigaction?, oact: Sigaction?): Int =
    throw UnsupportedOperationException("signalAction requires manual FFI bridge — not yet implemented")

public actual fun signalActionR(pid: Int, sigstub: (() -> Unit)?, signo: Int, act: Sigaction?, oact: Sigaction?): Int =
    throw UnsupportedOperationException("signalActionR requires manual FFI bridge — not yet implemented")

public actual fun threadCreate(pid: Int, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): Int =
    throw UnsupportedOperationException("threadCreate requires manual FFI bridge — not yet implemented")

public actual fun threadCreateR(pid: Int, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): Int =
    throw UnsupportedOperationException("threadCreateR requires manual FFI bridge — not yet implemented")

public actual fun threadCancel(tid: Int, canstub: (() -> Unit)?): Int =
    throw UnsupportedOperationException("threadCancel requires manual FFI bridge — not yet implemented")

public actual fun threadCancelR(tid: Int, canstub: (() -> Unit)?): Int =
    throw UnsupportedOperationException("threadCancelR requires manual FFI bridge — not yet implemented")

public actual fun interruptHookTrace(handler: ((Int) -> Sigevent?)?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookTrace requires manual FFI bridge — not yet implemented")

public actual fun interruptHookIdle(handler: ((ULong?, QtimeEntry?) -> Unit)?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookIdle requires manual FFI bridge — not yet implemented")

public actual fun interruptHookIdle2(handler: (() -> Unit)?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookIdle2 requires manual FFI bridge — not yet implemented")

public actual fun interruptAttach(intr: Int, handler: ((COpaquePointer?, Int) -> Sigevent?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttach requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachR(intr: Int, handler: ((COpaquePointer?, Int) -> Sigevent?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachR requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachArray(intr: Int, handler: ((COpaquePointer?, Int) -> COpaquePointer?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachArray requires manual FFI bridge — not yet implemented")

public actual fun interruptAttachArrayR(intr: Int, handler: ((COpaquePointer?, Int) -> COpaquePointer?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachArrayR requires manual FFI bridge — not yet implemented")
