package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.COpaquePointer

public actual fun channelCreate(flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').channelCreate(flags)") as CInt

public actual fun channelCreateR(flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').channelCreateR(flags)") as CInt

public actual fun channelCreatePulsePool(flags: CUint, config: NtoChannelConfig?): CInt =
    js("require('@kotlinmania/libc-native-bindings').channelCreatePulsePool(flags, config?.toLong() ?: 0L)") as CInt

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: Sigevent?, cred: CredInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').channelCreateExt(flags, mode, bufsize, maxnumbuf, ev?.toLong() ?: 0L, cred?.toLong() ?: 0L)") as CInt

public actual fun channelDestroy(chid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').channelDestroy(chid)") as CInt

public actual fun channelDestroyR(chid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').channelDestroyR(chid)") as CInt

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectAttach(nd, pid, chid, index, flags)") as CInt

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectAttachR(nd, pid, chid, index, flags)") as CInt

public actual fun connectDetach(coid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectDetach(coid)") as CInt

public actual fun connectDetachR(coid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectDetachR(coid)") as CInt

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectServerInfo(pid, coid, info?.toLong() ?: 0L)") as CInt

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectServerInfoR(pid, coid, info?.toLong() ?: 0L)") as CInt

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectClientInfoExtraArgs(scoid, infoPp?.toLong() ?: 0L, ngroups, abilities?.toLong() ?: 0L, nable, typeId?.toLong() ?: 0L)") as CInt

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectClientInfoExtraArgsR(scoid, infoPp?.toLong() ?: 0L, ngroups, abilities?.toLong() ?: 0L, nable, typeId?.toLong() ?: 0L)") as CInt

public actual fun connectClientInfo(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectClientInfo(scoid, info?.toLong() ?: 0L, ngroups)") as CInt

public actual fun connectClientInfoR(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectClientInfoR(scoid, info?.toLong() ?: 0L, ngroups)") as CInt

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectClientInfoExt(scoid, infoPp?.value ?: 0L, flags)") as CInt

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clientInfoExtFree(infoPp?.value ?: 0L)") as CInt

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: ClientAble?, nable: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectClientInfoAble(scoid, infoPp?.value ?: 0L, flags, abilities?.toLong() ?: 0L, nable)") as CInt

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectFlags(pid, coid, mask, bits)") as CInt

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectFlagsR(pid, coid, mask, bits)") as CInt

public actual fun channelConnectAttr(id: CUint, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').channelConnectAttr(id, oldAttr?.toLong() ?: 0L, newAttr?.toLong() ?: 0L, flags)") as CInt

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSend(coid, smsg?.value ?: 0L, sbytes, rmsg?.value ?: 0L, rbytes)") as CLong

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendR(coid, smsg?.value ?: 0L, sbytes, rmsg?.value ?: 0L, rbytes)") as CLong

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendnc(coid, smsg?.value ?: 0L, sbytes, rmsg?.value ?: 0L, rbytes)") as CLong

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendncR(coid, smsg?.value ?: 0L, sbytes, rmsg?.value ?: 0L, rbytes)") as CLong

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendsv(coid, smsg?.value ?: 0L, sbytes, riov?.toLong() ?: 0L, rparts)") as CLong

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendsvR(coid, smsg?.value ?: 0L, sbytes, riov?.toLong() ?: 0L, rparts)") as CLong

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendsvnc(coid, smsg?.value ?: 0L, sbytes, riov?.toLong() ?: 0L, rparts)") as CLong

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendsvncR(coid, smsg?.value ?: 0L, sbytes, riov?.toLong() ?: 0L, rparts)") as CLong

public actual fun msgSendvs(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendvs(coid, siov?.toLong() ?: 0L, sparts, rmsg?.value ?: 0L, rbytes)") as CLong

public actual fun msgSendvsR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendvsR(coid, siov?.toLong() ?: 0L, sparts, rmsg?.value ?: 0L, rbytes)") as CLong

public actual fun msgSendvsnc(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendvsnc(coid, siov?.toLong() ?: 0L, sparts, rmsg?.value ?: 0L, rbytes)") as CLong

public actual fun msgSendvsncR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendvsncR(coid, siov?.toLong() ?: 0L, sparts, rmsg?.value ?: 0L, rbytes)") as CLong

public actual fun msgSendv(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendv(coid, siov?.toLong() ?: 0L, sparts, riov?.toLong() ?: 0L, rparts)") as CLong

public actual fun msgSendvR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendvR(coid, siov?.toLong() ?: 0L, sparts, riov?.toLong() ?: 0L, rparts)") as CLong

public actual fun msgSendvnc(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendvnc(coid, siov?.toLong() ?: 0L, sparts, riov?.toLong() ?: 0L, rparts)") as CLong

public actual fun msgSendvncR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    js("require('@kotlinmania/libc-native-bindings').msgSendvncR(coid, siov?.toLong() ?: 0L, sparts, riov?.toLong() ?: 0L, rparts)") as CLong

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceive(chid, msg?.value ?: 0L, bytes, info?.toLong() ?: 0L)") as CInt

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceiveR(chid, msg?.value ?: 0L, bytes, info?.toLong() ?: 0L)") as CInt

public actual fun msgReceivev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceivev(chid, iov?.toLong() ?: 0L, parts, info?.toLong() ?: 0L)") as CInt

public actual fun msgReceivevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceivevR(chid, iov?.toLong() ?: 0L, parts, info?.toLong() ?: 0L)") as CInt

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceivePulse(chid, pulse?.value ?: 0L, bytes, info?.toLong() ?: 0L)") as CInt

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceivePulseR(chid, pulse?.value ?: 0L, bytes, info?.toLong() ?: 0L)") as CInt

public actual fun msgReceivePulsev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceivePulsev(chid, iov?.toLong() ?: 0L, parts, info?.toLong() ?: 0L)") as CInt

public actual fun msgReceivePulsevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceivePulsevR(chid, iov?.toLong() ?: 0L, parts, info?.toLong() ?: 0L)") as CInt

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReply(rcvid, status, msg?.value ?: 0L, bytes)") as CInt

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReplyR(rcvid, status, msg?.value ?: 0L, bytes)") as CInt

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReplyv(rcvid, status, iov?.toLong() ?: 0L, parts)") as CInt

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReplyvR(rcvid, status, iov?.toLong() ?: 0L, parts)") as CInt

public actual fun msgReadiov(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    js("require('@kotlinmania/libc-native-bindings').msgReadiov(rcvid, iov?.toLong() ?: 0L, parts, offset, flags)") as Long

public actual fun msgReadiovR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    js("require('@kotlinmania/libc-native-bindings').msgReadiovR(rcvid, iov?.toLong() ?: 0L, parts, offset, flags)") as Long

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').msgRead(rcvid, msg?.value ?: 0L, bytes, offset)") as Long

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').msgReadR(rcvid, msg?.value ?: 0L, bytes, offset)") as Long

public actual fun msgReadv(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').msgReadv(rcvid, iov?.toLong() ?: 0L, parts, offset)") as Long

public actual fun msgReadvR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').msgReadvR(rcvid, iov?.toLong() ?: 0L, parts, offset)") as Long

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').msgWrite(rcvid, msg?.value ?: 0L, bytes, offset)") as Long

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').msgWriteR(rcvid, msg?.value ?: 0L, bytes, offset)") as Long

public actual fun msgWritev(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').msgWritev(rcvid, iov?.toLong() ?: 0L, parts, offset)") as Long

public actual fun msgWritevR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').msgWritevR(rcvid, iov?.toLong() ?: 0L, parts, offset)") as Long

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgSendPulse(coid, priority, code, value)") as CInt

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgSendPulseR(coid, priority, code, value)") as CInt

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgSendPulsePtr(coid, priority, code, value?.value ?: 0L)") as CInt

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgSendPulsePtrR(coid, priority, code, value?.value ?: 0L)") as CInt

public actual fun msgDeliverEvent(rcvid: CInt, event: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgDeliverEvent(rcvid, event?.toLong() ?: 0L)") as CInt

public actual fun msgDeliverEventR(rcvid: CInt, event: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgDeliverEventR(rcvid, event?.toLong() ?: 0L)") as CInt

public actual fun msgVerifyEvent(rcvid: CInt, event: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgVerifyEvent(rcvid, event?.toLong() ?: 0L)") as CInt

public actual fun msgVerifyEventR(rcvid: CInt, event: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgVerifyEventR(rcvid, event?.toLong() ?: 0L)") as CInt

public actual fun msgRegisterEvent(event: Sigevent?, coid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgRegisterEvent(event?.toLong() ?: 0L, coid)") as CInt

public actual fun msgRegisterEventR(event: Sigevent?, coid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgRegisterEventR(event?.toLong() ?: 0L, coid)") as CInt

public actual fun msgUnregisterEvent(event: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgUnregisterEvent(event?.toLong() ?: 0L)") as CInt

public actual fun msgUnregisterEventR(event: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgUnregisterEventR(event?.toLong() ?: 0L)") as CInt

public actual fun msgInfo(rcvid: CInt, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgInfo(rcvid, info?.toLong() ?: 0L)") as CInt

public actual fun msgInfoR(rcvid: CInt, info: MsgInfo64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgInfoR(rcvid, info?.toLong() ?: 0L)") as CInt

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgKeyData(rcvid, oper, key, newkey?.toLong() ?: 0L, iov?.toLong() ?: 0L, parts)") as CInt

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgKeyDataR(rcvid, oper, key, newkey?.toLong() ?: 0L, iov?.toLong() ?: 0L, parts)") as CInt

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgError(rcvid, err)") as CInt

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgErrorR(rcvid, err)") as CInt

public actual fun msgCurrent(rcvid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgCurrent(rcvid)") as CInt

public actual fun msgCurrentR(rcvid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgCurrentR(rcvid)") as CInt

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgSendAsyncGbl(coid, smsg?.value ?: 0L, sbytes, msgPrio)") as CInt

public actual fun msgSendAsync(coid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgSendAsync(coid)") as CInt

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceiveAsyncGbl(chid, rmsg?.value ?: 0L, rbytes, info?.toLong() ?: 0L, coid)") as CInt

public actual fun msgReceiveAsync(chid: CInt, iov: Iovec?, parts: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgReceiveAsync(chid, iov?.toLong() ?: 0L, parts)") as CInt

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgPause(rcvid, cookie)") as CInt

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgPauseR(rcvid, cookie)") as CInt

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalKill(nd, pid, tid, signo, code, value)") as CInt

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalKillR(nd, pid, tid, signo, code, value)") as CInt

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalKillSigval(nd, pid, tid, signo, code, value?.toLong() ?: 0L)") as CInt

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalKillSigvalR(nd, pid, tid, signo, code, value?.toLong() ?: 0L)") as CInt

public actual fun signalReturn(info: SighandlerInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalReturn(info?.toLong() ?: 0L)") as CInt

public actual fun signalFault(sigcode: CUint, regs: COpaquePointer?, refaddr: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalFault(sigcode, regs?.value ?: 0L, refaddr)") as CInt

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalAction(pid, sigstub, signo, act?.toLong() ?: 0L, oact?.toLong() ?: 0L)") as CInt

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalActionR(pid, sigstub, signo, act?.toLong() ?: 0L, oact?.toLong() ?: 0L)") as CInt

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalProcmask(pid, tid, how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalProcmaskR(pid, tid, how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun signalSuspend(set: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalSuspend(set?.toLong() ?: 0L)") as CInt

public actual fun signalSuspendR(set: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalSuspendR(set?.toLong() ?: 0L)") as CInt

public actual fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalWaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalWaitinfoR(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalWaitinfoMask(set?.toLong() ?: 0L, info?.toLong() ?: 0L, mask?.toLong() ?: 0L)") as CInt

public actual fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalWaitinfoMaskR(set?.toLong() ?: 0L, info?.toLong() ?: 0L, mask?.toLong() ?: 0L)") as CInt

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadCreate(pid, func, arg?.value ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadCreateR(pid, func, arg?.value ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadDestroy(tid, priority, status?.value ?: 0L)") as CInt

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadDestroyR(tid, priority, status?.value ?: 0L)") as CInt

public actual fun threadDetach(tid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadDetach(tid)") as CInt

public actual fun threadDetachR(tid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadDetachR(tid)") as CInt

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadJoin(tid, status?.value ?: 0L)") as CInt

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadJoinR(tid, status?.value ?: 0L)") as CInt

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadCancel(tid, canstub)") as CInt

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadCancelR(tid, canstub)") as CInt

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadCtl(cmd, data?.value ?: 0L)") as CInt

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadCtlR(cmd, data?.value ?: 0L)") as CInt

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadCtlExt(pid, tid, cmd, data?.value ?: 0L)") as CInt

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').threadCtlExtR(pid, tid, cmd, data?.value ?: 0L)") as CInt

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptHookTrace(handler?.toLong() ?: 0L, flags)") as CInt

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptHookIdle(handler?.toLong() ?: 0L, flags)") as CInt

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptHookIdle2(handler?.toLong() ?: 0L, flags)") as CInt

public actual fun interruptHookOverdriveEvent(event: Sigevent?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptHookOverdriveEvent(event?.toLong() ?: 0L, flags)") as CInt

public actual fun interruptAttachEvent(intr: CInt, event: Sigevent?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptAttachEvent(intr, event?.toLong() ?: 0L, flags)") as CInt

public actual fun interruptAttachEventR(intr: CInt, event: Sigevent?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptAttachEventR(intr, event?.toLong() ?: 0L, flags)") as CInt

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptAttach(intr, handler?.toLong() ?: 0L, area?.value ?: 0L, size, flags)") as CInt

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptAttachR(intr, handler?.toLong() ?: 0L, area?.value ?: 0L, size, flags)") as CInt

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptAttachArray(intr, handler?.toLong() ?: 0L, area?.value ?: 0L, size, flags)") as CInt

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptAttachArrayR(intr, handler?.toLong() ?: 0L, area?.value ?: 0L, size, flags)") as CInt

public actual fun interruptDetach(id: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptDetach(id)") as CInt

public actual fun interruptDetachR(id: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptDetachR(id)") as CInt

public actual fun interruptWait(flags: CInt, timeout: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptWait(flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun interruptWaitR(flags: CInt, timeout: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptWaitR(flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: CUint?, old: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptCharacteristic(type, id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)") as CInt

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: CUint?, old: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptCharacteristicR(type, id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)") as CInt

public actual fun schedGet(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGet(pid, tid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetR(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetR(pid, tid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetCpuNum(): CUint =
    js("require('@kotlinmania/libc-native-bindings').schedGetCpuNum()") as CUint

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSet(pid, tid, algorithm, param?.toLong() ?: 0L)") as CInt

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetR(pid, tid, algorithm, param?.toLong() ?: 0L)") as CInt

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: io.github.kotlinmania.libc.SchedInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedInfo(pid, algorithm, info?.toLong() ?: 0L)") as CInt

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: io.github.kotlinmania.libc.SchedInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedInfoR(pid, algorithm, info?.toLong() ?: 0L)") as CInt

public actual fun schedYield(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedYield()") as CInt

public actual fun schedYieldR(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedYieldR()") as CInt

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedCtl(cmd, data?.value ?: 0L, length)") as CInt

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedCtlR(cmd, data?.value ?: 0L, length)") as CInt

public actual fun schedJobCreate(job: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedJobCreate(job?.toLong() ?: 0L)") as CInt

public actual fun schedJobCreateR(job: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedJobCreateR(job?.toLong() ?: 0L)") as CInt

public actual fun schedJobDestroy(job: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedJobDestroy(job?.toLong() ?: 0L)") as CInt

public actual fun schedJobDestroyR(job: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedJobDestroyR(job?.toLong() ?: 0L)") as CInt

public actual fun schedWaypoint(job: SyncT?, new: Long?, max: Long?, old: Long?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedWaypoint(job?.toLong() ?: 0L, new?.toLong() ?: 0L, max?.toLong() ?: 0L, old?.toLong() ?: 0L)") as CInt

public actual fun schedWaypointR(job: SyncT?, new: Long?, max: Long?, old: Long?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedWaypointR(job?.toLong() ?: 0L, new?.toLong() ?: 0L, max?.toLong() ?: 0L, old?.toLong() ?: 0L)") as CInt

public actual fun timerCreate(id: ClockidT, notify: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerCreate(id, notify?.toLong() ?: 0L)") as CInt

public actual fun timerCreateR(id: ClockidT, notify: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerCreateR(id, notify?.toLong() ?: 0L)") as CInt

public actual fun timerDestroy(id: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerDestroy(id)") as CInt

public actual fun timerDestroyR(id: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerDestroyR(id)") as CInt

public actual fun timerSettime(id: TimerT, flags: CInt, itime: io.github.kotlinmania.libc.Itimer?, oitime: io.github.kotlinmania.libc.Itimer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerSettime(id, flags, itime?.toLong() ?: 0L, oitime?.toLong() ?: 0L)") as CInt

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: io.github.kotlinmania.libc.Itimer?, oitime: io.github.kotlinmania.libc.Itimer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerSettimeR(id, flags, itime?.toLong() ?: 0L, oitime?.toLong() ?: 0L)") as CInt

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: io.github.kotlinmania.libc.TimerInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerInfo(pid, id, flags, info?.toLong() ?: 0L)") as CInt

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: io.github.kotlinmania.libc.TimerInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerInfoR(pid, id, flags, info?.toLong() ?: 0L)") as CInt

public actual fun timerAlarm(id: ClockidT, itime: io.github.kotlinmania.libc.Itimer?, otime: io.github.kotlinmania.libc.Itimer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerAlarm(id, itime?.toLong() ?: 0L, otime?.toLong() ?: 0L)") as CInt

public actual fun timerAlarmR(id: ClockidT, itime: io.github.kotlinmania.libc.Itimer?, otime: io.github.kotlinmania.libc.Itimer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerAlarmR(id, itime?.toLong() ?: 0L, otime?.toLong() ?: 0L)") as CInt

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerTimeout(id, flags, notify?.toLong() ?: 0L, ntime?.toLong() ?: 0L, otime?.toLong() ?: 0L)") as CInt

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerTimeoutR(id, flags, notify?.toLong() ?: 0L, ntime?.toLong() ?: 0L, otime?.toLong() ?: 0L)") as CInt

public actual fun syncTypeCreate(type: CUint, sync: SyncT?, attr: SyncAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncTypeCreate(type, sync?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun syncTypeCreateR(type: CUint, sync: SyncT?, attr: SyncAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncTypeCreateR(type, sync?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun syncDestroy(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncDestroy(sync?.toLong() ?: 0L)") as CInt

public actual fun syncDestroyR(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncDestroyR(sync?.toLong() ?: 0L)") as CInt

public actual fun syncCtl(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncCtl(cmd, sync?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun syncCtlR(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncCtlR(cmd, sync?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun syncMutexEvent(sync: SyncT?, event: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncMutexEvent(sync?.toLong() ?: 0L, event?.toLong() ?: 0L)") as CInt

public actual fun syncMutexEventR(sync: SyncT?, event: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncMutexEventR(sync?.toLong() ?: 0L, event?.toLong() ?: 0L)") as CInt

public actual fun syncMutexLock(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncMutexLock(sync?.toLong() ?: 0L)") as CInt

public actual fun syncMutexLockR(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncMutexLockR(sync?.toLong() ?: 0L)") as CInt

public actual fun syncMutexUnlock(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncMutexUnlock(sync?.toLong() ?: 0L)") as CInt

public actual fun syncMutexUnlockR(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncMutexUnlockR(sync?.toLong() ?: 0L)") as CInt

public actual fun syncMutexRevive(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncMutexRevive(sync?.toLong() ?: 0L)") as CInt

public actual fun syncMutexReviveR(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncMutexReviveR(sync?.toLong() ?: 0L)") as CInt

public actual fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncCondvarWait(sync?.toLong() ?: 0L, mutex?.toLong() ?: 0L)") as CInt

public actual fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncCondvarWaitR(sync?.toLong() ?: 0L, mutex?.toLong() ?: 0L)") as CInt

public actual fun syncCondvarSignal(sync: SyncT?, all: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncCondvarSignal(sync?.toLong() ?: 0L, all)") as CInt

public actual fun syncCondvarSignalR(sync: SyncT?, all: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncCondvarSignalR(sync?.toLong() ?: 0L, all)") as CInt

public actual fun syncSemPost(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncSemPost(sync?.toLong() ?: 0L)") as CInt

public actual fun syncSemPostR(sync: SyncT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncSemPostR(sync?.toLong() ?: 0L)") as CInt

public actual fun syncSemWait(sync: SyncT?, tryto: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncSemWait(sync?.toLong() ?: 0L, tryto)") as CInt

public actual fun syncSemWaitR(sync: SyncT?, tryto: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncSemWaitR(sync?.toLong() ?: 0L, tryto)") as CInt

public actual fun clockTime(id: ClockidT, new: ULong?, old: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockTime(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)") as CInt

public actual fun clockTimeR(id: ClockidT, new: ULong?, old: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockTimeR(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)") as CInt

public actual fun clockAdjust(id: ClockidT, new: io.github.kotlinmania.libc.Clockadjust?, old: io.github.kotlinmania.libc.Clockadjust?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockAdjust(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)") as CInt

public actual fun clockAdjustR(id: ClockidT, new: io.github.kotlinmania.libc.Clockadjust?, old: io.github.kotlinmania.libc.Clockadjust?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockAdjustR(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L)") as CInt

public actual fun clockPeriod(id: ClockidT, new: io.github.kotlinmania.libc.Clockperiod?, old: io.github.kotlinmania.libc.Clockperiod?, reserved: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockPeriod(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L, reserved)") as CInt

public actual fun clockPeriodR(id: ClockidT, new: io.github.kotlinmania.libc.Clockperiod?, old: io.github.kotlinmania.libc.Clockperiod?, reserved: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockPeriodR(id, new?.toLong() ?: 0L, old?.toLong() ?: 0L, reserved)") as CInt

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockId(pid, tid)") as CInt

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockIdR(pid, tid)") as CInt

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptMask(intr, id)") as CInt

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').interruptUnmask(intr, id)") as CInt
