// port-lint: source Neutrino.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public actual fun channelCreate(flags: CUInt): CInt =
    throw UnsupportedOperationException("channelCreate not available on WASI — no C library access")

public actual fun channelCreateR(flags: CUInt): CInt =
    throw UnsupportedOperationException("channelCreateR not available on WASI — no C library access")

public actual fun channelCreatePulsePool(flags: CUInt, config: NtoChannelConfig?): CInt =
    throw UnsupportedOperationException("channelCreatePulsePool not available on WASI — no C library access")

public actual fun channelCreateExt(flags: CUInt, mode: ModeT, bufsize: ULong, maxnumbuf: CUInt, ev: Sigevent?, cred: CredInfo?): CInt =
    throw UnsupportedOperationException("channelCreateExt not available on WASI — no C library access")

public actual fun channelDestroy(chid: CInt): CInt =
    throw UnsupportedOperationException("channelDestroy not available on WASI — no C library access")

public actual fun channelDestroyR(chid: CInt): CInt =
    throw UnsupportedOperationException("channelDestroyR not available on WASI — no C library access")

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("connectAttach not available on WASI — no C library access")

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("connectAttachR not available on WASI — no C library access")

public actual fun connectDetach(coid: CInt): CInt =
    throw UnsupportedOperationException("connectDetach not available on WASI — no C library access")

public actual fun connectDetachR(coid: CInt): CInt =
    throw UnsupportedOperationException("connectDetachR not available on WASI — no C library access")

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("connectServerInfo not available on WASI — no C library access")

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("connectServerInfoR not available on WASI — no C library access")

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUInt?): CInt =
    throw UnsupportedOperationException("connectClientInfoExtraArgs not available on WASI — no C library access")

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUInt?): CInt =
    throw UnsupportedOperationException("connectClientInfoExtraArgsR not available on WASI — no C library access")

public actual fun connectClientInfo(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfo not available on WASI — no C library access")

public actual fun connectClientInfoR(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfoR not available on WASI — no C library access")

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfoExt not available on WASI — no C library access")

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("clientInfoExtFree not available on WASI — no C library access")

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: ClientAble?, nable: CInt): CInt =
    throw UnsupportedOperationException("connectClientInfoAble not available on WASI — no C library access")

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUInt, bits: CUInt): CInt =
    throw UnsupportedOperationException("connectFlags not available on WASI — no C library access")

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUInt, bits: CUInt): CInt =
    throw UnsupportedOperationException("connectFlagsR not available on WASI — no C library access")

public actual fun channelConnectAttr(id: CUInt, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: CUInt): CInt =
    throw UnsupportedOperationException("channelConnectAttr not available on WASI — no C library access")

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSend not available on WASI — no C library access")

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendR not available on WASI — no C library access")

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendnc not available on WASI — no C library access")

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendncR not available on WASI — no C library access")

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsv not available on WASI — no C library access")

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsvR not available on WASI — no C library access")

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsvnc not available on WASI — no C library access")

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendsvncR not available on WASI — no C library access")

public actual fun msgSendvs(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvs not available on WASI — no C library access")

public actual fun msgSendvsR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvsR not available on WASI — no C library access")

public actual fun msgSendvsnc(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvsnc not available on WASI — no C library access")

public actual fun msgSendvsncR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    throw UnsupportedOperationException("msgSendvsncR not available on WASI — no C library access")

public actual fun msgSendv(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendv not available on WASI — no C library access")

public actual fun msgSendvR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendvR not available on WASI — no C library access")

public actual fun msgSendvnc(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendvnc not available on WASI — no C library access")

public actual fun msgSendvncR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    throw UnsupportedOperationException("msgSendvncR not available on WASI — no C library access")

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceive not available on WASI — no C library access")

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceiveR not available on WASI — no C library access")

public actual fun msgReceivev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivev not available on WASI — no C library access")

public actual fun msgReceivevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivevR not available on WASI — no C library access")

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulse not available on WASI — no C library access")

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulseR not available on WASI — no C library access")

public actual fun msgReceivePulsev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulsev not available on WASI — no C library access")

public actual fun msgReceivePulsevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgReceivePulsevR not available on WASI — no C library access")

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    throw UnsupportedOperationException("msgReply not available on WASI — no C library access")

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    throw UnsupportedOperationException("msgReplyR not available on WASI — no C library access")

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    throw UnsupportedOperationException("msgReplyv not available on WASI — no C library access")

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    throw UnsupportedOperationException("msgReplyvR not available on WASI — no C library access")

public actual fun msgReadiov(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    throw UnsupportedOperationException("msgReadiov not available on WASI — no C library access")

public actual fun msgReadiovR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    throw UnsupportedOperationException("msgReadiovR not available on WASI — no C library access")

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgRead not available on WASI — no C library access")

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadR not available on WASI — no C library access")

public actual fun msgReadv(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadv not available on WASI — no C library access")

public actual fun msgReadvR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgReadvR not available on WASI — no C library access")

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWrite not available on WASI — no C library access")

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWriteR not available on WASI — no C library access")

public actual fun msgWritev(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritev not available on WASI — no C library access")

public actual fun msgWritevR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("msgWritevR not available on WASI — no C library access")

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("msgSendPulse not available on WASI — no C library access")

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("msgSendPulseR not available on WASI — no C library access")

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("msgSendPulsePtr not available on WASI — no C library access")

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("msgSendPulsePtrR not available on WASI — no C library access")

public actual fun msgDeliverEvent(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgDeliverEvent not available on WASI — no C library access")

public actual fun msgDeliverEventR(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgDeliverEventR not available on WASI — no C library access")

public actual fun msgVerifyEvent(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgVerifyEvent not available on WASI — no C library access")

public actual fun msgVerifyEventR(rcvid: CInt, event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgVerifyEventR not available on WASI — no C library access")

public actual fun msgRegisterEvent(event: Sigevent?, coid: CInt): CInt =
    throw UnsupportedOperationException("msgRegisterEvent not available on WASI — no C library access")

public actual fun msgRegisterEventR(event: Sigevent?, coid: CInt): CInt =
    throw UnsupportedOperationException("msgRegisterEventR not available on WASI — no C library access")

public actual fun msgUnregisterEvent(event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgUnregisterEvent not available on WASI — no C library access")

public actual fun msgUnregisterEventR(event: Sigevent?): CInt =
    throw UnsupportedOperationException("msgUnregisterEventR not available on WASI — no C library access")

public actual fun msgInfo(rcvid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgInfo not available on WASI — no C library access")

public actual fun msgInfoR(rcvid: CInt, info: MsgInfo64?): CInt =
    throw UnsupportedOperationException("msgInfoR not available on WASI — no C library access")

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    throw UnsupportedOperationException("msgKeyData not available on WASI — no C library access")

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    throw UnsupportedOperationException("msgKeyDataR not available on WASI — no C library access")

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    throw UnsupportedOperationException("msgError not available on WASI — no C library access")

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    throw UnsupportedOperationException("msgErrorR not available on WASI — no C library access")

public actual fun msgCurrent(rcvid: CInt): CInt =
    throw UnsupportedOperationException("msgCurrent not available on WASI — no C library access")

public actual fun msgCurrentR(rcvid: CInt): CInt =
    throw UnsupportedOperationException("msgCurrentR not available on WASI — no C library access")

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("msgSendAsyncGbl not available on WASI — no C library access")

public actual fun msgSendAsync(coid: CInt): CInt =
    throw UnsupportedOperationException("msgSendAsync not available on WASI — no C library access")

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: CInt): CInt =
    throw UnsupportedOperationException("msgReceiveAsyncGbl not available on WASI — no C library access")

public actual fun msgReceiveAsync(chid: CInt, iov: Iovec?, parts: CUInt): CInt =
    throw UnsupportedOperationException("msgReceiveAsync not available on WASI — no C library access")

public actual fun msgPause(rcvid: CInt, cookie: CUInt): CInt =
    throw UnsupportedOperationException("msgPause not available on WASI — no C library access")

public actual fun msgPauseR(rcvid: CInt, cookie: CUInt): CInt =
    throw UnsupportedOperationException("msgPauseR not available on WASI — no C library access")

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("signalKill not available on WASI — no C library access")

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("signalKillR not available on WASI — no C library access")

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    throw UnsupportedOperationException("signalKillSigval not available on WASI — no C library access")

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    throw UnsupportedOperationException("signalKillSigvalR not available on WASI — no C library access")

public actual fun signalReturn(info: SighandlerInfo?): CInt =
    throw UnsupportedOperationException("signalReturn not available on WASI — no C library access")

public actual fun signalFault(sigcode: CUInt, regs: COpaquePointer?, refaddr: ULong): CInt =
    throw UnsupportedOperationException("signalFault not available on WASI — no C library access")

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("signalProcmask not available on WASI — no C library access")

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("signalProcmaskR not available on WASI — no C library access")

public actual fun signalSuspend(set: SigsetT?): CInt =
    throw UnsupportedOperationException("signalSuspend not available on WASI — no C library access")

public actual fun signalSuspendR(set: SigsetT?): CInt =
    throw UnsupportedOperationException("signalSuspendR not available on WASI — no C library access")

public actual fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("signalWaitinfo not available on WASI — no C library access")

public actual fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("signalWaitinfoR not available on WASI — no C library access")

public actual fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    throw UnsupportedOperationException("signalWaitinfoMask not available on WASI — no C library access")

public actual fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    throw UnsupportedOperationException("signalWaitinfoMaskR not available on WASI — no C library access")

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadDestroy not available on WASI — no C library access")

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadDestroyR not available on WASI — no C library access")

public actual fun threadDetach(tid: CInt): CInt =
    throw UnsupportedOperationException("threadDetach not available on WASI — no C library access")

public actual fun threadDetachR(tid: CInt): CInt =
    throw UnsupportedOperationException("threadDetachR not available on WASI — no C library access")

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadJoin not available on WASI — no C library access")

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadJoinR not available on WASI — no C library access")

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtl not available on WASI — no C library access")

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtlR not available on WASI — no C library access")

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtlExt not available on WASI — no C library access")

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("threadCtlExtR not available on WASI — no C library access")

public actual fun interruptHookOverdriveEvent(event: Sigevent?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptHookOverdriveEvent not available on WASI — no C library access")

public actual fun interruptAttachEvent(intr: CInt, event: Sigevent?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachEvent not available on WASI — no C library access")

public actual fun interruptAttachEventR(intr: CInt, event: Sigevent?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachEventR not available on WASI — no C library access")

public actual fun interruptDetach(id: CInt): CInt =
    throw UnsupportedOperationException("interruptDetach not available on WASI — no C library access")

public actual fun interruptDetachR(id: CInt): CInt =
    throw UnsupportedOperationException("interruptDetachR not available on WASI — no C library access")

public actual fun interruptWait(flags: CInt, timeout: ULong?): CInt =
    throw UnsupportedOperationException("interruptWait not available on WASI — no C library access")

public actual fun interruptWaitR(flags: CInt, timeout: ULong?): CInt =
    throw UnsupportedOperationException("interruptWaitR not available on WASI — no C library access")

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: CUInt?, old: CUInt?): CInt =
    throw UnsupportedOperationException("interruptCharacteristic not available on WASI — no C library access")

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: CUInt?, old: CUInt?): CInt =
    throw UnsupportedOperationException("interruptCharacteristicR not available on WASI — no C library access")

public actual fun schedGet(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGet not available on WASI — no C library access")

public actual fun schedGetR(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetR not available on WASI — no C library access")

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSet not available on WASI — no C library access")

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetR not available on WASI — no C library access")

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt =
    throw UnsupportedOperationException("schedInfo not available on WASI — no C library access")

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: SchedInfo?): CInt =
    throw UnsupportedOperationException("schedInfoR not available on WASI — no C library access")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield not available on WASI — no C library access")

public actual fun schedYieldR(): CInt =
    throw UnsupportedOperationException("schedYieldR not available on WASI — no C library access")

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    throw UnsupportedOperationException("schedCtl not available on WASI — no C library access")

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    throw UnsupportedOperationException("schedCtlR not available on WASI — no C library access")

public actual fun schedJobCreate(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobCreate not available on WASI — no C library access")

public actual fun schedJobCreateR(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobCreateR not available on WASI — no C library access")

public actual fun schedJobDestroy(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobDestroy not available on WASI — no C library access")

public actual fun schedJobDestroyR(job: NtoJobT?): CInt =
    throw UnsupportedOperationException("schedJobDestroyR not available on WASI — no C library access")

public actual fun schedWaypoint(job: NtoJobT?, new: Long?, max: Long?, old: Long?): CInt =
    throw UnsupportedOperationException("schedWaypoint not available on WASI — no C library access")

public actual fun schedWaypointR(job: NtoJobT?, new: Long?, max: Long?, old: Long?): CInt =
    throw UnsupportedOperationException("schedWaypointR not available on WASI — no C library access")

public actual fun timerCreate(id: ClockidT, notify: Sigevent?): CInt =
    throw UnsupportedOperationException("timerCreate not available on WASI — no C library access")

public actual fun timerCreateR(id: ClockidT, notify: Sigevent?): CInt =
    throw UnsupportedOperationException("timerCreateR not available on WASI — no C library access")

public actual fun timerDestroy(id: TimerT): CInt =
    throw UnsupportedOperationException("timerDestroy not available on WASI — no C library access")

public actual fun timerDestroyR(id: TimerT): CInt =
    throw UnsupportedOperationException("timerDestroyR not available on WASI — no C library access")

public actual fun timerSettime(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt =
    throw UnsupportedOperationException("timerSettime not available on WASI — no C library access")

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: Itimer?, oitime: Itimer?): CInt =
    throw UnsupportedOperationException("timerSettimeR not available on WASI — no C library access")

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt =
    throw UnsupportedOperationException("timerInfo not available on WASI — no C library access")

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: TimerInfo?): CInt =
    throw UnsupportedOperationException("timerInfoR not available on WASI — no C library access")

public actual fun timerAlarm(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt =
    throw UnsupportedOperationException("timerAlarm not available on WASI — no C library access")

public actual fun timerAlarmR(id: ClockidT, itime: Itimer?, otime: Itimer?): CInt =
    throw UnsupportedOperationException("timerAlarmR not available on WASI — no C library access")

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    throw UnsupportedOperationException("timerTimeout not available on WASI — no C library access")

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    throw UnsupportedOperationException("timerTimeoutR not available on WASI — no C library access")

public actual fun syncTypeCreate(type: CUInt, sync: SyncT?, attr: SyncAttr?): CInt =
    throw UnsupportedOperationException("syncTypeCreate not available on WASI — no C library access")

public actual fun syncTypeCreateR(type: CUInt, sync: SyncT?, attr: SyncAttr?): CInt =
    throw UnsupportedOperationException("syncTypeCreateR not available on WASI — no C library access")

public actual fun syncDestroy(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncDestroy not available on WASI — no C library access")

public actual fun syncDestroyR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncDestroyR not available on WASI — no C library access")

public actual fun syncCtl(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("syncCtl not available on WASI — no C library access")

public actual fun syncCtlR(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("syncCtlR not available on WASI — no C library access")

public actual fun syncMutexEvent(sync: SyncT?, event: Sigevent?): CInt =
    throw UnsupportedOperationException("syncMutexEvent not available on WASI — no C library access")

public actual fun syncMutexEventR(sync: SyncT?, event: Sigevent?): CInt =
    throw UnsupportedOperationException("syncMutexEventR not available on WASI — no C library access")

public actual fun syncMutexLock(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexLock not available on WASI — no C library access")

public actual fun syncMutexLockR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexLockR not available on WASI — no C library access")

public actual fun syncMutexUnlock(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexUnlock not available on WASI — no C library access")

public actual fun syncMutexUnlockR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexUnlockR not available on WASI — no C library access")

public actual fun syncMutexRevive(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexRevive not available on WASI — no C library access")

public actual fun syncMutexReviveR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncMutexReviveR not available on WASI — no C library access")

public actual fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): CInt =
    throw UnsupportedOperationException("syncCondvarWait not available on WASI — no C library access")

public actual fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): CInt =
    throw UnsupportedOperationException("syncCondvarWaitR not available on WASI — no C library access")

public actual fun syncCondvarSignal(sync: SyncT?, all: CInt): CInt =
    throw UnsupportedOperationException("syncCondvarSignal not available on WASI — no C library access")

public actual fun syncCondvarSignalR(sync: SyncT?, all: CInt): CInt =
    throw UnsupportedOperationException("syncCondvarSignalR not available on WASI — no C library access")

public actual fun syncSemPost(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncSemPost not available on WASI — no C library access")

public actual fun syncSemPostR(sync: SyncT?): CInt =
    throw UnsupportedOperationException("syncSemPostR not available on WASI — no C library access")

public actual fun syncSemWait(sync: SyncT?, tryto: CInt): CInt =
    throw UnsupportedOperationException("syncSemWait not available on WASI — no C library access")

public actual fun syncSemWaitR(sync: SyncT?, tryto: CInt): CInt =
    throw UnsupportedOperationException("syncSemWaitR not available on WASI — no C library access")

public actual fun clockTime(id: ClockidT, new: ULong?, old: ULong?): CInt =
    throw UnsupportedOperationException("clockTime not available on WASI — no C library access")

public actual fun clockTimeR(id: ClockidT, new: ULong?, old: ULong?): CInt =
    throw UnsupportedOperationException("clockTimeR not available on WASI — no C library access")

public actual fun clockAdjust(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt =
    throw UnsupportedOperationException("clockAdjust not available on WASI — no C library access")

public actual fun clockAdjustR(id: ClockidT, new: Clockadjust?, old: Clockadjust?): CInt =
    throw UnsupportedOperationException("clockAdjustR not available on WASI — no C library access")

public actual fun clockPeriod(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt =
    throw UnsupportedOperationException("clockPeriod not available on WASI — no C library access")

public actual fun clockPeriodR(id: ClockidT, new: Clockperiod?, old: Clockperiod?, reserved: CInt): CInt =
    throw UnsupportedOperationException("clockPeriodR not available on WASI — no C library access")

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    throw UnsupportedOperationException("clockId not available on WASI — no C library access")

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    throw UnsupportedOperationException("clockIdR not available on WASI — no C library access")

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    throw UnsupportedOperationException("interruptMask not available on WASI — no C library access")

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    throw UnsupportedOperationException("interruptUnmask not available on WASI — no C library access")


public actual fun signalAction(pid: PidT, sigstub: (() -> Unit)?, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    throw UnsupportedOperationException("signalAction not available on WASI — no C library access")

public actual fun signalActionR(pid: PidT, sigstub: (() -> Unit)?, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    throw UnsupportedOperationException("signalActionR not available on WASI — no C library access")

public actual fun threadCreate(pid: PidT, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    throw UnsupportedOperationException("threadCreate not available on WASI — no C library access")

public actual fun threadCreateR(pid: PidT, func: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    throw UnsupportedOperationException("threadCreateR not available on WASI — no C library access")

public actual fun threadCancel(tid: CInt, canstub: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("threadCancel not available on WASI — no C library access")

public actual fun threadCancelR(tid: CInt, canstub: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("threadCancelR not available on WASI — no C library access")

public actual fun interruptHookTrace(handler: ((CInt) -> Sigevent?)?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptHookTrace not available on WASI — no C library access")

public actual fun interruptHookIdle(handler: ((ULong?, QtimeEntry?) -> Unit)?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptHookIdle not available on WASI — no C library access")

public actual fun interruptHookIdle2(handler: (() -> Unit)?, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptHookIdle2 not available on WASI — no C library access")

public actual fun interruptAttach(intr: CInt, handler: ((COpaquePointer?, CInt) -> Sigevent?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttach not available on WASI — no C library access")

public actual fun interruptAttachR(intr: CInt, handler: ((COpaquePointer?, CInt) -> Sigevent?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachR not available on WASI — no C library access")

public actual fun interruptAttachArray(intr: CInt, handler: ((COpaquePointer?, CInt) -> COpaquePointer?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachArray not available on WASI — no C library access")

public actual fun interruptAttachArrayR(intr: CInt, handler: ((COpaquePointer?, CInt) -> COpaquePointer?)?, area: COpaquePointer?, size: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("interruptAttachArrayR not available on WASI — no C library access")
