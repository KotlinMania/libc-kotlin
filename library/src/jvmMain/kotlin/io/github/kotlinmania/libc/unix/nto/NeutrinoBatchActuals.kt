// port-lint: source Neutrino.rs
package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Sigval

public actual fun channelCreate(flags: UInt): Int =
    throw UnsupportedOperationException("channelCreate not available on JVM — no C library access")

public actual fun channelCreateR(flags: UInt): Int =
    throw UnsupportedOperationException("channelCreateR not available on JVM — no C library access")

public actual fun channelCreatePulsePool(flags: UInt, config: NtoChannelConfig?): Int =
    throw UnsupportedOperationException("channelCreatePulsePool not available on JVM — no C library access")

public actual fun channelCreateExt(flags: UInt, mode: UInt, bufsize: ULong, maxnumbuf: UInt, ev: Sigevent?, cred: CredInfo?): Int =
    throw UnsupportedOperationException("channelCreateExt not available on JVM — no C library access")

public actual fun channelDestroy(chid: Int): Int =
    throw UnsupportedOperationException("channelDestroy not available on JVM — no C library access")

public actual fun channelDestroyR(chid: Int): Int =
    throw UnsupportedOperationException("channelDestroyR not available on JVM — no C library access")

public actual fun connectAttach(nd: UInt, pid: Int, chid: Int, index: UInt, flags: Int): Int =
    throw UnsupportedOperationException("connectAttach not available on JVM — no C library access")

public actual fun connectAttachR(nd: UInt, pid: Int, chid: Int, index: UInt, flags: Int): Int =
    throw UnsupportedOperationException("connectAttachR not available on JVM — no C library access")

public actual fun connectDetach(coid: Int): Int =
    throw UnsupportedOperationException("connectDetach not available on JVM — no C library access")

public actual fun connectDetachR(coid: Int): Int =
    throw UnsupportedOperationException("connectDetachR not available on JVM — no C library access")

public actual fun connectServerInfo(pid: Int, coid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("connectServerInfo not available on JVM — no C library access")

public actual fun connectServerInfoR(pid: Int, coid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("connectServerInfoR not available on JVM — no C library access")

public actual fun connectClientInfoExtraArgs(scoid: Int, infoPp: ClientInfo?, ngroups: Int, abilities: ClientAble?, nable: Int, typeId: UInt?): Int =
    throw UnsupportedOperationException("connectClientInfoExtraArgs not available on JVM — no C library access")

public actual fun connectClientInfoExtraArgsR(scoid: Int, infoPp: ClientInfo?, ngroups: Int, abilities: ClientAble?, nable: Int, typeId: UInt?): Int =
    throw UnsupportedOperationException("connectClientInfoExtraArgsR not available on JVM — no C library access")

public actual fun connectClientInfo(scoid: Int, info: ClientInfo?, ngroups: Int): Int =
    throw UnsupportedOperationException("connectClientInfo not available on JVM — no C library access")

public actual fun connectClientInfoR(scoid: Int, info: ClientInfo?, ngroups: Int): Int =
    throw UnsupportedOperationException("connectClientInfoR not available on JVM — no C library access")

public actual fun connectClientInfoExt(scoid: Int, infoPp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("connectClientInfoExt not available on JVM — no C library access")

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): Int =
    throw UnsupportedOperationException("clientInfoExtFree not available on JVM — no C library access")

public actual fun connectClientInfoAble(scoid: Int, infoPp: COpaquePointer?, flags: Int, abilities: ClientAble?, nable: Int): Int =
    throw UnsupportedOperationException("connectClientInfoAble not available on JVM — no C library access")

public actual fun connectFlags(pid: Int, coid: Int, mask: UInt, bits: UInt): Int =
    throw UnsupportedOperationException("connectFlags not available on JVM — no C library access")

public actual fun connectFlagsR(pid: Int, coid: Int, mask: UInt, bits: UInt): Int =
    throw UnsupportedOperationException("connectFlagsR not available on JVM — no C library access")

public actual fun channelConnectAttr(id: UInt, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: UInt): Int =
    throw UnsupportedOperationException("channelConnectAttr not available on JVM — no C library access")

public actual fun msgSend(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSend not available on JVM — no C library access")

public actual fun msgSendR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendR not available on JVM — no C library access")

public actual fun msgSendnc(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendnc not available on JVM — no C library access")

public actual fun msgSendncR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendncR not available on JVM — no C library access")

public actual fun msgSendsv(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsv not available on JVM — no C library access")

public actual fun msgSendsvR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsvR not available on JVM — no C library access")

public actual fun msgSendsvnc(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsvnc not available on JVM — no C library access")

public actual fun msgSendsvncR(coid: Int, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendsvncR not available on JVM — no C library access")

public actual fun msgSendvs(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvs not available on JVM — no C library access")

public actual fun msgSendvsR(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvsR not available on JVM — no C library access")

public actual fun msgSendvsnc(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvsnc not available on JVM — no C library access")

public actual fun msgSendvsncR(coid: Int, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): Long =
    throw UnsupportedOperationException("msgSendvsncR not available on JVM — no C library access")

public actual fun msgSendv(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendv not available on JVM — no C library access")

public actual fun msgSendvR(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendvR not available on JVM — no C library access")

public actual fun msgSendvnc(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendvnc not available on JVM — no C library access")

public actual fun msgSendvncR(coid: Int, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): Long =
    throw UnsupportedOperationException("msgSendvncR not available on JVM — no C library access")

public actual fun msgReceive(chid: Int, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceive not available on JVM — no C library access")

public actual fun msgReceiveR(chid: Int, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceiveR not available on JVM — no C library access")

public actual fun msgReceivev(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivev not available on JVM — no C library access")

public actual fun msgReceivevR(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivevR not available on JVM — no C library access")

public actual fun msgReceivePulse(chid: Int, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulse not available on JVM — no C library access")

public actual fun msgReceivePulseR(chid: Int, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulseR not available on JVM — no C library access")

public actual fun msgReceivePulsev(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulsev not available on JVM — no C library access")

public actual fun msgReceivePulsevR(chid: Int, iov: Iovec?, parts: ULong, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgReceivePulsevR not available on JVM — no C library access")

public actual fun msgReply(rcvid: Int, status: Long, msg: COpaquePointer?, bytes: ULong): Int =
    throw UnsupportedOperationException("msgReply not available on JVM — no C library access")

public actual fun msgReplyR(rcvid: Int, status: Long, msg: COpaquePointer?, bytes: ULong): Int =
    throw UnsupportedOperationException("msgReplyR not available on JVM — no C library access")

public actual fun msgReplyv(rcvid: Int, status: Long, iov: Iovec?, parts: ULong): Int =
    throw UnsupportedOperationException("msgReplyv not available on JVM — no C library access")

public actual fun msgReplyvR(rcvid: Int, status: Long, iov: Iovec?, parts: ULong): Int =
    throw UnsupportedOperationException("msgReplyvR not available on JVM — no C library access")

public actual fun msgReadiov(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong, flags: Int): Long =
    throw UnsupportedOperationException("msgReadiov not available on JVM — no C library access")

public actual fun msgReadiovR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong, flags: Int): Long =
    throw UnsupportedOperationException("msgReadiovR not available on JVM — no C library access")

public actual fun msgRead(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgRead not available on JVM — no C library access")

public actual fun msgReadR(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadR not available on JVM — no C library access")

public actual fun msgReadv(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadv not available on JVM — no C library access")

public actual fun msgReadvR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadvR not available on JVM — no C library access")

public actual fun msgWrite(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWrite not available on JVM — no C library access")

public actual fun msgWriteR(rcvid: Int, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWriteR not available on JVM — no C library access")

public actual fun msgWritev(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritev not available on JVM — no C library access")

public actual fun msgWritevR(rcvid: Int, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritevR not available on JVM — no C library access")

public actual fun msgSendPulse(coid: Int, priority: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("msgSendPulse not available on JVM — no C library access")

public actual fun msgSendPulseR(coid: Int, priority: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("msgSendPulseR not available on JVM — no C library access")

public actual fun msgSendPulsePtr(coid: Int, priority: Int, code: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("msgSendPulsePtr not available on JVM — no C library access")

public actual fun msgSendPulsePtrR(coid: Int, priority: Int, code: Int, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("msgSendPulsePtrR not available on JVM — no C library access")

public actual fun msgDeliverEvent(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgDeliverEvent not available on JVM — no C library access")

public actual fun msgDeliverEventR(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgDeliverEventR not available on JVM — no C library access")

public actual fun msgVerifyEvent(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgVerifyEvent not available on JVM — no C library access")

public actual fun msgVerifyEventR(rcvid: Int, event: Sigevent?): Int =
    throw UnsupportedOperationException("msgVerifyEventR not available on JVM — no C library access")

public actual fun msgRegisterEvent(event: Sigevent?, coid: Int): Int =
    throw UnsupportedOperationException("msgRegisterEvent not available on JVM — no C library access")

public actual fun msgRegisterEventR(event: Sigevent?, coid: Int): Int =
    throw UnsupportedOperationException("msgRegisterEventR not available on JVM — no C library access")

public actual fun msgUnregisterEvent(event: Sigevent?): Int =
    throw UnsupportedOperationException("msgUnregisterEvent not available on JVM — no C library access")

public actual fun msgUnregisterEventR(event: Sigevent?): Int =
    throw UnsupportedOperationException("msgUnregisterEventR not available on JVM — no C library access")

public actual fun msgInfo(rcvid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgInfo not available on JVM — no C library access")

public actual fun msgInfoR(rcvid: Int, info: MsgInfo64?): Int =
    throw UnsupportedOperationException("msgInfoR not available on JVM — no C library access")

public actual fun msgKeyData(rcvid: Int, oper: Int, key: UInt, newkey: UInt?, iov: Iovec?, parts: Int): Int =
    throw UnsupportedOperationException("msgKeyData not available on JVM — no C library access")

public actual fun msgKeyDataR(rcvid: Int, oper: Int, key: UInt, newkey: UInt?, iov: Iovec?, parts: Int): Int =
    throw UnsupportedOperationException("msgKeyDataR not available on JVM — no C library access")

public actual fun msgError(rcvid: Int, err: Int): Int =
    throw UnsupportedOperationException("msgError not available on JVM — no C library access")

public actual fun msgErrorR(rcvid: Int, err: Int): Int =
    throw UnsupportedOperationException("msgErrorR not available on JVM — no C library access")

public actual fun msgCurrent(rcvid: Int): Int =
    throw UnsupportedOperationException("msgCurrent not available on JVM — no C library access")

public actual fun msgCurrentR(rcvid: Int): Int =
    throw UnsupportedOperationException("msgCurrentR not available on JVM — no C library access")

public actual fun msgSendAsyncGbl(coid: Int, smsg: COpaquePointer?, sbytes: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("msgSendAsyncGbl not available on JVM — no C library access")

public actual fun msgSendAsync(coid: Int): Int =
    throw UnsupportedOperationException("msgSendAsync not available on JVM — no C library access")

public actual fun msgReceiveAsyncGbl(chid: Int, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: Int): Int =
    throw UnsupportedOperationException("msgReceiveAsyncGbl not available on JVM — no C library access")

public actual fun msgReceiveAsync(chid: Int, iov: Iovec?, parts: UInt): Int =
    throw UnsupportedOperationException("msgReceiveAsync not available on JVM — no C library access")

public actual fun msgPause(rcvid: Int, cookie: UInt): Int =
    throw UnsupportedOperationException("msgPause not available on JVM — no C library access")

public actual fun msgPauseR(rcvid: Int, cookie: UInt): Int =
    throw UnsupportedOperationException("msgPauseR not available on JVM — no C library access")

public actual fun signalKill(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("signalKill not available on JVM — no C library access")

public actual fun signalKillR(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int =
    throw UnsupportedOperationException("signalKillR not available on JVM — no C library access")

public actual fun signalKillSigval(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Sigval?): Int =
    throw UnsupportedOperationException("signalKillSigval not available on JVM — no C library access")

public actual fun signalKillSigvalR(nd: UInt, pid: Int, tid: Int, signo: Int, code: Int, value: Sigval?): Int =
    throw UnsupportedOperationException("signalKillSigvalR not available on JVM — no C library access")

public actual fun signalReturn(info: SighandlerInfo?): Int =
    throw UnsupportedOperationException("signalReturn not available on JVM — no C library access")

public actual fun signalFault(sigcode: UInt, regs: COpaquePointer?, refaddr: ULong): Int =
    throw UnsupportedOperationException("signalFault not available on JVM — no C library access")

public actual fun signalProcmask(pid: Int, tid: Int, how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("signalProcmask not available on JVM — no C library access")

public actual fun signalProcmaskR(pid: Int, tid: Int, how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("signalProcmaskR not available on JVM — no C library access")

public actual fun signalSuspend(set: SigsetT?): Int =
    throw UnsupportedOperationException("signalSuspend not available on JVM — no C library access")

public actual fun signalSuspendR(set: SigsetT?): Int =
    throw UnsupportedOperationException("signalSuspendR not available on JVM — no C library access")

public actual fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("signalWaitinfo not available on JVM — no C library access")

public actual fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("signalWaitinfoR not available on JVM — no C library access")

public actual fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): Int =
    throw UnsupportedOperationException("signalWaitinfoMask not available on JVM — no C library access")

public actual fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): Int =
    throw UnsupportedOperationException("signalWaitinfoMaskR not available on JVM — no C library access")

public actual fun threadDestroy(tid: Int, priority: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadDestroy not available on JVM — no C library access")

public actual fun threadDestroyR(tid: Int, priority: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadDestroyR not available on JVM — no C library access")

public actual fun threadDetach(tid: Int): Int =
    throw UnsupportedOperationException("threadDetach not available on JVM — no C library access")

public actual fun threadDetachR(tid: Int): Int =
    throw UnsupportedOperationException("threadDetachR not available on JVM — no C library access")

public actual fun threadJoin(tid: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadJoin not available on JVM — no C library access")

public actual fun threadJoinR(tid: Int, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadJoinR not available on JVM — no C library access")

public actual fun threadCtl(cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtl not available on JVM — no C library access")

public actual fun threadCtlR(cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtlR not available on JVM — no C library access")

public actual fun threadCtlExt(pid: Int, tid: Int, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtlExt not available on JVM — no C library access")

public actual fun threadCtlExtR(pid: Int, tid: Int, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("threadCtlExtR not available on JVM — no C library access")

public actual fun interruptHookOverdriveEvent(event: Sigevent?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookOverdriveEvent not available on JVM — no C library access")

public actual fun interruptAttachEvent(intr: Int, event: Sigevent?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachEvent not available on JVM — no C library access")

public actual fun interruptAttachEventR(intr: Int, event: Sigevent?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachEventR not available on JVM — no C library access")

public actual fun interruptDetach(id: Int): Int =
    throw UnsupportedOperationException("interruptDetach not available on JVM — no C library access")

public actual fun interruptDetachR(id: Int): Int =
    throw UnsupportedOperationException("interruptDetachR not available on JVM — no C library access")

public actual fun interruptWait(flags: Int, timeout: ULong?): Int =
    throw UnsupportedOperationException("interruptWait not available on JVM — no C library access")

public actual fun interruptWaitR(flags: Int, timeout: ULong?): Int =
    throw UnsupportedOperationException("interruptWaitR not available on JVM — no C library access")

public actual fun interruptCharacteristic(type: Int, id: Int, new: UInt?, old: UInt?): Int =
    throw UnsupportedOperationException("interruptCharacteristic not available on JVM — no C library access")

public actual fun interruptCharacteristicR(type: Int, id: Int, new: UInt?, old: UInt?): Int =
    throw UnsupportedOperationException("interruptCharacteristicR not available on JVM — no C library access")

public actual fun schedGet(pid: Int, tid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGet not available on JVM — no C library access")

public actual fun schedGetR(pid: Int, tid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetR not available on JVM — no C library access")

public actual fun schedSet(pid: Int, tid: Int, algorithm: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSet not available on JVM — no C library access")

public actual fun schedSetR(pid: Int, tid: Int, algorithm: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetR not available on JVM — no C library access")

public actual fun schedInfo(pid: Int, algorithm: Int, info: SchedInfo?): Int =
    throw UnsupportedOperationException("schedInfo not available on JVM — no C library access")

public actual fun schedInfoR(pid: Int, algorithm: Int, info: SchedInfo?): Int =
    throw UnsupportedOperationException("schedInfoR not available on JVM — no C library access")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield not available on JVM — no C library access")

public actual fun schedYieldR(): Int =
    throw UnsupportedOperationException("schedYieldR not available on JVM — no C library access")

public actual fun schedCtl(cmd: Int, data: COpaquePointer?, length: ULong): Int =
    throw UnsupportedOperationException("schedCtl not available on JVM — no C library access")

public actual fun schedCtlR(cmd: Int, data: COpaquePointer?, length: ULong): Int =
    throw UnsupportedOperationException("schedCtlR not available on JVM — no C library access")

public actual fun schedJobCreate(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobCreate not available on JVM — no C library access")

public actual fun schedJobCreateR(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobCreateR not available on JVM — no C library access")

public actual fun schedJobDestroy(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobDestroy not available on JVM — no C library access")

public actual fun schedJobDestroyR(job: io.github.kotlinmania.libc.unix.nto.SyncT?): Int =
    throw UnsupportedOperationException("schedJobDestroyR not available on JVM — no C library access")

public actual fun schedWaypoint(job: io.github.kotlinmania.libc.unix.nto.SyncT?, new: Long?, max: Long?, old: Long?): Int =
    throw UnsupportedOperationException("schedWaypoint not available on JVM — no C library access")

public actual fun schedWaypointR(job: io.github.kotlinmania.libc.unix.nto.SyncT?, new: Long?, max: Long?, old: Long?): Int =
    throw UnsupportedOperationException("schedWaypointR not available on JVM — no C library access")

public actual fun timerCreate(id: Int, notify: Sigevent?): Int =
    throw UnsupportedOperationException("timerCreate not available on JVM — no C library access")

public actual fun timerCreateR(id: Int, notify: Sigevent?): Int =
    throw UnsupportedOperationException("timerCreateR not available on JVM — no C library access")

public actual fun timerDestroy(id: Int): Int =
    throw UnsupportedOperationException("timerDestroy not available on JVM — no C library access")

public actual fun timerDestroyR(id: Int): Int =
    throw UnsupportedOperationException("timerDestroyR not available on JVM — no C library access")

public actual fun timerSettime(id: Int, flags: Int, itime: Itimer?, oitime: Itimer?): Int =
    throw UnsupportedOperationException("timerSettime not available on JVM — no C library access")

public actual fun timerSettimeR(id: Int, flags: Int, itime: Itimer?, oitime: Itimer?): Int =
    throw UnsupportedOperationException("timerSettimeR not available on JVM — no C library access")

public actual fun timerInfo(pid: Int, id: Int, flags: Int, info: TimerInfo?): Int =
    throw UnsupportedOperationException("timerInfo not available on JVM — no C library access")

public actual fun timerInfoR(pid: Int, id: Int, flags: Int, info: TimerInfo?): Int =
    throw UnsupportedOperationException("timerInfoR not available on JVM — no C library access")

public actual fun timerAlarm(id: Int, itime: Itimer?, otime: Itimer?): Int =
    throw UnsupportedOperationException("timerAlarm not available on JVM — no C library access")

public actual fun timerAlarmR(id: Int, itime: Itimer?, otime: Itimer?): Int =
    throw UnsupportedOperationException("timerAlarmR not available on JVM — no C library access")

public actual fun timerTimeout(id: Int, flags: Int, notify: Sigevent?, ntime: ULong?, otime: ULong?): Int =
    throw UnsupportedOperationException("timerTimeout not available on JVM — no C library access")

public actual fun timerTimeoutR(id: Int, flags: Int, notify: Sigevent?, ntime: ULong?, otime: ULong?): Int =
    throw UnsupportedOperationException("timerTimeoutR not available on JVM — no C library access")

public actual fun syncTypeCreate(type: UInt, sync: SyncT?, attr: SyncAttr?): Int =
    throw UnsupportedOperationException("syncTypeCreate not available on JVM — no C library access")

public actual fun syncTypeCreateR(type: UInt, sync: SyncT?, attr: SyncAttr?): Int =
    throw UnsupportedOperationException("syncTypeCreateR not available on JVM — no C library access")

public actual fun syncDestroy(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncDestroy not available on JVM — no C library access")

public actual fun syncDestroyR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncDestroyR not available on JVM — no C library access")

public actual fun syncCtl(cmd: Int, sync: SyncT?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("syncCtl not available on JVM — no C library access")

public actual fun syncCtlR(cmd: Int, sync: SyncT?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("syncCtlR not available on JVM — no C library access")

public actual fun syncMutexEvent(sync: SyncT?, event: Sigevent?): Int =
    throw UnsupportedOperationException("syncMutexEvent not available on JVM — no C library access")

public actual fun syncMutexEventR(sync: SyncT?, event: Sigevent?): Int =
    throw UnsupportedOperationException("syncMutexEventR not available on JVM — no C library access")

public actual fun syncMutexLock(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexLock not available on JVM — no C library access")

public actual fun syncMutexLockR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexLockR not available on JVM — no C library access")

public actual fun syncMutexUnlock(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexUnlock not available on JVM — no C library access")

public actual fun syncMutexUnlockR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexUnlockR not available on JVM — no C library access")

public actual fun syncMutexRevive(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexRevive not available on JVM — no C library access")

public actual fun syncMutexReviveR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncMutexReviveR not available on JVM — no C library access")

public actual fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): Int =
    throw UnsupportedOperationException("syncCondvarWait not available on JVM — no C library access")

public actual fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): Int =
    throw UnsupportedOperationException("syncCondvarWaitR not available on JVM — no C library access")

public actual fun syncCondvarSignal(sync: SyncT?, all: Int): Int =
    throw UnsupportedOperationException("syncCondvarSignal not available on JVM — no C library access")

public actual fun syncCondvarSignalR(sync: SyncT?, all: Int): Int =
    throw UnsupportedOperationException("syncCondvarSignalR not available on JVM — no C library access")

public actual fun syncSemPost(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncSemPost not available on JVM — no C library access")

public actual fun syncSemPostR(sync: SyncT?): Int =
    throw UnsupportedOperationException("syncSemPostR not available on JVM — no C library access")

public actual fun syncSemWait(sync: SyncT?, tryto: Int): Int =
    throw UnsupportedOperationException("syncSemWait not available on JVM — no C library access")

public actual fun syncSemWaitR(sync: SyncT?, tryto: Int): Int =
    throw UnsupportedOperationException("syncSemWaitR not available on JVM — no C library access")

public actual fun clockTime(id: Int, new: ULong?, old: ULong?): Int =
    throw UnsupportedOperationException("clockTime not available on JVM — no C library access")

public actual fun clockTimeR(id: Int, new: ULong?, old: ULong?): Int =
    throw UnsupportedOperationException("clockTimeR not available on JVM — no C library access")

public actual fun clockAdjust(id: Int, new: Clockadjust?, old: Clockadjust?): Int =
    throw UnsupportedOperationException("clockAdjust not available on JVM — no C library access")

public actual fun clockAdjustR(id: Int, new: Clockadjust?, old: Clockadjust?): Int =
    throw UnsupportedOperationException("clockAdjustR not available on JVM — no C library access")

public actual fun clockPeriod(id: Int, new: Clockperiod?, old: Clockperiod?, reserved: Int): Int =
    throw UnsupportedOperationException("clockPeriod not available on JVM — no C library access")

public actual fun clockPeriodR(id: Int, new: Clockperiod?, old: Clockperiod?, reserved: Int): Int =
    throw UnsupportedOperationException("clockPeriodR not available on JVM — no C library access")

public actual fun clockId(pid: Int, tid: Int): Int =
    throw UnsupportedOperationException("clockId not available on JVM — no C library access")

public actual fun clockIdR(pid: Int, tid: Int): Int =
    throw UnsupportedOperationException("clockIdR not available on JVM — no C library access")

public actual fun interruptMask(intr: Int, id: Int): Int =
    throw UnsupportedOperationException("interruptMask not available on JVM — no C library access")

public actual fun interruptUnmask(intr: Int, id: Int): Int =
    throw UnsupportedOperationException("interruptUnmask not available on JVM — no C library access")

public actual fun signalAction(pid: Int, sigstub: (() -> Unit)?, signo: Int, act: Sigaction?, oact: Sigaction?): Int =
    throw UnsupportedOperationException("signalAction not available on JVM — no C library access")

public actual fun signalActionR(pid: Int, sigstub: (() -> Unit)?, signo: Int, act: Sigaction?, oact: Sigaction?): Int =
    throw UnsupportedOperationException("signalActionR not available on JVM — no C library access")

public actual fun threadCreate(pid: Int, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): Int =
    throw UnsupportedOperationException("threadCreate not available on JVM — no C library access")

public actual fun threadCreateR(pid: Int, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): Int =
    throw UnsupportedOperationException("threadCreateR not available on JVM — no C library access")

public actual fun threadCancel(tid: Int, canstub: (() -> Unit)?): Int =
    throw UnsupportedOperationException("threadCancel not available on JVM — no C library access")

public actual fun threadCancelR(tid: Int, canstub: (() -> Unit)?): Int =
    throw UnsupportedOperationException("threadCancelR not available on JVM — no C library access")

public actual fun interruptHookTrace(handler: ((Int) -> Sigevent?)?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookTrace not available on JVM — no C library access")

public actual fun interruptHookIdle(handler: ((ULong?, QtimeEntry?) -> Unit)?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookIdle not available on JVM — no C library access")

public actual fun interruptHookIdle2(handler: (() -> Unit)?, flags: UInt): Int =
    throw UnsupportedOperationException("interruptHookIdle2 not available on JVM — no C library access")

public actual fun interruptAttach(intr: Int, handler: ((COpaquePointer?, Int) -> Sigevent?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttach not available on JVM — no C library access")

public actual fun interruptAttachR(intr: Int, handler: ((COpaquePointer?, Int) -> Sigevent?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachR not available on JVM — no C library access")

public actual fun interruptAttachArray(intr: Int, handler: ((COpaquePointer?, Int) -> COpaquePointer?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachArray not available on JVM — no C library access")

public actual fun interruptAttachArrayR(intr: Int, handler: ((COpaquePointer?, Int) -> COpaquePointer?)?, area: COpaquePointer?, size: Int, flags: UInt): Int =
    throw UnsupportedOperationException("interruptAttachArrayR not available on JVM — no C library access")
