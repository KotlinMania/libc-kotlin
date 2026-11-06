@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun channelCreate(flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_channel_create(flags)

public actual fun channelCreateR(flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_channel_create_r(flags)

public actual fun channelCreatePulsePool(flags: CUint, config: NtoChannelConfig?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_channel_create_pulse_pool(flags, config?.value?.toCPointer<ByteVar>())

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: Sigevent?, cred: CredInfo?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_channel_create_ext(flags, mode, bufsize, maxnumbuf, ev?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>())

public actual fun channelDestroy(chid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_channel_destroy(chid)

public actual fun channelDestroyR(chid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_channel_destroy_r(chid)

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_attach(nd, pid, chid, index, flags)

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_attach_r(nd, pid, chid, index, flags)

public actual fun connectDetach(coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_detach(coid)

public actual fun connectDetachR(coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_detach_r(coid)

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_server_info(pid, coid, info?.value?.toCPointer<ByteVar>())

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_server_info_r(pid, coid, info?.value?.toCPointer<ByteVar>())

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUint?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_client_info_extra_args(scoid, infoPp?.value?.toCPointer<ByteVar>(), ngroups, abilities?.value?.toCPointer<ByteVar>(), nable, typeId?.value?.toCPointer<ByteVar>())

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: ClientInfo?, ngroups: CInt, abilities: ClientAble?, nable: CInt, typeId: CUint?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_client_info_extra_args_r(scoid, infoPp?.value?.toCPointer<ByteVar>(), ngroups, abilities?.value?.toCPointer<ByteVar>(), nable, typeId?.value?.toCPointer<ByteVar>())

public actual fun connectClientInfo(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_client_info(scoid, info?.value?.toCPointer<ByteVar>(), ngroups)

public actual fun connectClientInfoR(scoid: CInt, info: ClientInfo?, ngroups: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_client_info_r(scoid, info?.value?.toCPointer<ByteVar>(), ngroups)

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_client_info_ext(scoid, infoPp?.value?.toCPointer<ByteVar>(), flags)

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_client_info_ext_free(infoPp?.value?.toCPointer<ByteVar>())

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: ClientAble?, nable: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_client_info_able(scoid, infoPp?.value?.toCPointer<ByteVar>(), flags, abilities?.value?.toCPointer<ByteVar>(), nable)

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_flags(pid, coid, mask, bits)

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_connect_flags_r(pid, coid, mask, bits)

public actual fun channelConnectAttr(id: CUint, oldAttr: ChannelConnectAttr?, newAttr: ChannelConnectAttr?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_channel_connect_attr(id, oldAttr?.value?.toCPointer<ByteVar>(), newAttr?.value?.toCPointer<ByteVar>(), flags)

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_send(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_send_r(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendnc(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendnc_r(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendsv(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendsv_r(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendsvnc(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: Iovec?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendsvnc_r(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvs(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendvs(coid, siov?.value?.toCPointer<ByteVar>(), sparts, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendvsR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendvs_r(coid, siov?.value?.toCPointer<ByteVar>(), sparts, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendvsnc(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendvsnc(coid, siov?.value?.toCPointer<ByteVar>(), sparts, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendvsncR(coid: CInt, siov: Iovec?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendvsnc_r(coid, siov?.value?.toCPointer<ByteVar>(), sparts, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendv(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendv(coid, siov?.value?.toCPointer<ByteVar>(), sparts, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendv_r(coid, siov?.value?.toCPointer<ByteVar>(), sparts, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvnc(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendvnc(coid, siov?.value?.toCPointer<ByteVar>(), sparts, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvncR(coid: CInt, siov: Iovec?, sparts: ULong, riov: Iovec?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_sendvnc_r(coid, siov?.value?.toCPointer<ByteVar>(), sparts, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receive(chid, msg?.value?.toCPointer<ByteVar>(), bytes, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receive_r(chid, msg?.value?.toCPointer<ByteVar>(), bytes, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receivev(chid, iov?.value?.toCPointer<ByteVar>(), parts, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receivev_r(chid, iov?.value?.toCPointer<ByteVar>(), parts, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receive_pulse(chid, pulse?.value?.toCPointer<ByteVar>(), bytes, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receive_pulse_r(chid, pulse?.value?.toCPointer<ByteVar>(), bytes, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivePulsev(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receive_pulsev(chid, iov?.value?.toCPointer<ByteVar>(), parts, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivePulsevR(chid: CInt, iov: Iovec?, parts: ULong, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receive_pulsev_r(chid, iov?.value?.toCPointer<ByteVar>(), parts, info?.value?.toCPointer<ByteVar>())

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_reply(rcvid, status, msg?.value?.toCPointer<ByteVar>(), bytes)

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_reply_r(rcvid, status, msg?.value?.toCPointer<ByteVar>(), bytes)

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_replyv(rcvid, status, iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: Iovec?, parts: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_replyv_r(rcvid, status, iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgReadiov(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_readiov(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset, flags)

public actual fun msgReadiovR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong, flags: CInt): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_readiov_r(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset, flags)

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_read(rcvid, msg?.value?.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_read_r(rcvid, msg?.value?.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgReadv(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_readv(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset)

public actual fun msgReadvR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_readv_r(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset)

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_write(rcvid, msg?.value?.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_write_r(rcvid, msg?.value?.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgWritev(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_writev(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset)

public actual fun msgWritevR(rcvid: CInt, iov: Iovec?, parts: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_writev_r(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset)

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_send_pulse(coid, priority, code, value)

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_send_pulse_r(coid, priority, code, value)

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_send_pulse_ptr(coid, priority, code, value?.value?.toCPointer<ByteVar>())

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_send_pulse_ptr_r(coid, priority, code, value?.value?.toCPointer<ByteVar>())

public actual fun msgDeliverEvent(rcvid: CInt, event: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_deliver_event(rcvid, event?.value?.toCPointer<ByteVar>())

public actual fun msgDeliverEventR(rcvid: CInt, event: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_deliver_event_r(rcvid, event?.value?.toCPointer<ByteVar>())

public actual fun msgVerifyEvent(rcvid: CInt, event: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_verify_event(rcvid, event?.value?.toCPointer<ByteVar>())

public actual fun msgVerifyEventR(rcvid: CInt, event: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_verify_event_r(rcvid, event?.value?.toCPointer<ByteVar>())

public actual fun msgRegisterEvent(event: Sigevent?, coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_register_event(event?.value?.toCPointer<ByteVar>(), coid)

public actual fun msgRegisterEventR(event: Sigevent?, coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_register_event_r(event?.value?.toCPointer<ByteVar>(), coid)

public actual fun msgUnregisterEvent(event: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_unregister_event(event?.value?.toCPointer<ByteVar>())

public actual fun msgUnregisterEventR(event: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_unregister_event_r(event?.value?.toCPointer<ByteVar>())

public actual fun msgInfo(rcvid: CInt, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_info(rcvid, info?.value?.toCPointer<ByteVar>())

public actual fun msgInfoR(rcvid: CInt, info: MsgInfo64?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_info_r(rcvid, info?.value?.toCPointer<ByteVar>())

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_key_data(rcvid, oper, key, newkey?.value?.toCPointer<ByteVar>(), iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: UInt?, iov: Iovec?, parts: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_key_data_r(rcvid, oper, key, newkey?.value?.toCPointer<ByteVar>(), iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_error(rcvid, err)

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_error_r(rcvid, err)

public actual fun msgCurrent(rcvid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_current(rcvid)

public actual fun msgCurrentR(rcvid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_current_r(rcvid)

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_send_async_gbl(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, msgPrio)

public actual fun msgSendAsync(coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_send_async(coid)

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: MsgInfo64?, coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receive_async_gbl(chid, rmsg?.value?.toCPointer<ByteVar>(), rbytes, info?.value?.toCPointer<ByteVar>(), coid)

public actual fun msgReceiveAsync(chid: CInt, iov: Iovec?, parts: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_receive_async(chid, iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_pause(rcvid, cookie)

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_msg_pause_r(rcvid, cookie)

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_kill(nd, pid, tid, signo, code, value)

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_kill_r(nd, pid, tid, signo, code, value)

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_kill_sigval(nd, pid, tid, signo, code, value?.value?.toCPointer<ByteVar>())

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: Sigval?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_kill_sigval_r(nd, pid, tid, signo, code, value?.value?.toCPointer<ByteVar>())

public actual fun signalReturn(info: SighandlerInfo?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_return(info?.value?.toCPointer<ByteVar>())

public actual fun signalFault(sigcode: CUint, regs: COpaquePointer?, refaddr: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_fault(sigcode, regs?.value?.toCPointer<ByteVar>(), refaddr)

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_action(pid, sigstub.toInt(), signo, act?.value?.toCPointer<ByteVar>(), oact?.value?.toCPointer<ByteVar>())

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_action_r(pid, sigstub.toInt(), signo, act?.value?.toCPointer<ByteVar>(), oact?.value?.toCPointer<ByteVar>())

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_procmask(pid, tid, how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_procmask_r(pid, tid, how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun signalSuspend(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_suspend(set?.value?.toCPointer<ByteVar>())

public actual fun signalSuspendR(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_suspend_r(set?.value?.toCPointer<ByteVar>())

public actual fun signalWaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_waitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun signalWaitinfoR(set: SigsetT?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_waitinfo_r(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun signalWaitinfoMask(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_waitinfo_mask(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), mask?.value?.toCPointer<ByteVar>())

public actual fun signalWaitinfoMaskR(set: SigsetT?, info: SiginfoT?, mask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_signal_waitinfo_mask_r(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), mask?.value?.toCPointer<ByteVar>())

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_create(pid, func.toInt(), arg?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: ThreadAttr?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_create_r(pid, func.toInt(), arg?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_destroy(tid, priority, status?.value?.toCPointer<ByteVar>())

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_destroy_r(tid, priority, status?.value?.toCPointer<ByteVar>())

public actual fun threadDetach(tid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_detach(tid)

public actual fun threadDetachR(tid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_detach_r(tid)

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_join(tid, status?.value?.toCPointer<ByteVar>())

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_join_r(tid, status?.value?.toCPointer<ByteVar>())

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_cancel(tid, canstub.toInt())

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_cancel_r(tid, canstub.toInt())

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_ctl(cmd, data?.value?.toCPointer<ByteVar>())

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_ctl_r(cmd, data?.value?.toCPointer<ByteVar>())

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_ctl_ext(pid, tid, cmd, data?.value?.toCPointer<ByteVar>())

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_thread_ctl_ext_r(pid, tid, cmd, data?.value?.toCPointer<ByteVar>())

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_hook_trace(handler?.value?.toCPointer<ByteVar>(), flags)

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_hook_idle(handler?.value?.toCPointer<ByteVar>(), flags)

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_hook_idle2(handler?.value?.toCPointer<ByteVar>(), flags)

public actual fun interruptHookOverdriveEvent(event: Sigevent?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_hook_overdrive_event(event?.value?.toCPointer<ByteVar>(), flags)

public actual fun interruptAttachEvent(intr: CInt, event: Sigevent?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_attach_event(intr, event?.value?.toCPointer<ByteVar>(), flags)

public actual fun interruptAttachEventR(intr: CInt, event: Sigevent?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_attach_event_r(intr, event?.value?.toCPointer<ByteVar>(), flags)

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_attach(intr, handler?.value?.toCPointer<ByteVar>(), area?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_attach_r(intr, handler?.value?.toCPointer<ByteVar>(), area?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_attach_array(intr, handler?.value?.toCPointer<ByteVar>(), area?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_attach_array_r(intr, handler?.value?.toCPointer<ByteVar>(), area?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun interruptDetach(id: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_detach(id)

public actual fun interruptDetachR(id: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_detach_r(id)

public actual fun interruptWait(flags: CInt, timeout: ULong?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_wait(flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun interruptWaitR(flags: CInt, timeout: ULong?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_wait_r(flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: CUint?, old: CUint?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_characteristic(type, id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: CUint?, old: CUint?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_characteristic_r(type, id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun schedGet(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_get(pid, tid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetR(pid: PidT, tid: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_get_r(pid, tid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetCpuNum(): CUint =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_get_cpu_num()

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_set(pid, tid, algorithm, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_set_r(pid, tid, algorithm, param?.value?.toCPointer<ByteVar>())

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: io.github.kotlinmania.libc.SchedInfo?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_info(pid, algorithm, info?.value?.toCPointer<ByteVar>())

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: io.github.kotlinmania.libc.SchedInfo?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_info_r(pid, algorithm, info?.value?.toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_yield()

public actual fun schedYieldR(): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_yield_r()

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_ctl(cmd, data?.value?.toCPointer<ByteVar>(), length)

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_ctl_r(cmd, data?.value?.toCPointer<ByteVar>(), length)

public actual fun schedJobCreate(job: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_job_create(job?.value?.toCPointer<ByteVar>())

public actual fun schedJobCreateR(job: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_job_create_r(job?.value?.toCPointer<ByteVar>())

public actual fun schedJobDestroy(job: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_job_destroy(job?.value?.toCPointer<ByteVar>())

public actual fun schedJobDestroyR(job: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_job_destroy_r(job?.value?.toCPointer<ByteVar>())

public actual fun schedWaypoint(job: SyncT?, new: Long?, max: Long?, old: Long?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_waypoint(job?.value?.toCPointer<ByteVar>(), new?.value?.toCPointer<ByteVar>(), max?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun schedWaypointR(job: SyncT?, new: Long?, max: Long?, old: Long?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sched_waypoint_r(job?.value?.toCPointer<ByteVar>(), new?.value?.toCPointer<ByteVar>(), max?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(id: ClockidT, notify: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_create(id, notify?.value?.toCPointer<ByteVar>())

public actual fun timerCreateR(id: ClockidT, notify: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_create_r(id, notify?.value?.toCPointer<ByteVar>())

public actual fun timerDestroy(id: TimerT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_destroy(id.toInt())

public actual fun timerDestroyR(id: TimerT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_destroy_r(id.toInt())

public actual fun timerSettime(id: TimerT, flags: CInt, itime: io.github.kotlinmania.libc.Itimer?, oitime: io.github.kotlinmania.libc.Itimer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_settime(id.toInt(), flags, itime?.value?.toCPointer<ByteVar>(), oitime?.value?.toCPointer<ByteVar>())

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: io.github.kotlinmania.libc.Itimer?, oitime: io.github.kotlinmania.libc.Itimer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_settime_r(id.toInt(), flags, itime?.value?.toCPointer<ByteVar>(), oitime?.value?.toCPointer<ByteVar>())

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: io.github.kotlinmania.libc.TimerInfo?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_info(pid, id.toInt(), flags, info?.value?.toCPointer<ByteVar>())

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: io.github.kotlinmania.libc.TimerInfo?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_info_r(pid, id.toInt(), flags, info?.value?.toCPointer<ByteVar>())

public actual fun timerAlarm(id: ClockidT, itime: io.github.kotlinmania.libc.Itimer?, otime: io.github.kotlinmania.libc.Itimer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_alarm(id, itime?.value?.toCPointer<ByteVar>(), otime?.value?.toCPointer<ByteVar>())

public actual fun timerAlarmR(id: ClockidT, itime: io.github.kotlinmania.libc.Itimer?, otime: io.github.kotlinmania.libc.Itimer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_alarm_r(id, itime?.value?.toCPointer<ByteVar>(), otime?.value?.toCPointer<ByteVar>())

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_timeout(id, flags, notify?.value?.toCPointer<ByteVar>(), ntime?.value?.toCPointer<ByteVar>(), otime?.value?.toCPointer<ByteVar>())

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: Sigevent?, ntime: ULong?, otime: ULong?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_timer_timeout_r(id, flags, notify?.value?.toCPointer<ByteVar>(), ntime?.value?.toCPointer<ByteVar>(), otime?.value?.toCPointer<ByteVar>())

public actual fun syncTypeCreate(type: CUint, sync: SyncT?, attr: SyncAttr?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_type_create(type, sync?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun syncTypeCreateR(type: CUint, sync: SyncT?, attr: SyncAttr?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_type_create_r(type, sync?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun syncDestroy(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_destroy(sync?.value?.toCPointer<ByteVar>())

public actual fun syncDestroyR(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_destroy_r(sync?.value?.toCPointer<ByteVar>())

public actual fun syncCtl(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_ctl(cmd, sync?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun syncCtlR(cmd: CInt, sync: SyncT?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_ctl_r(cmd, sync?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun syncMutexEvent(sync: SyncT?, event: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_mutex_event(sync?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>())

public actual fun syncMutexEventR(sync: SyncT?, event: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_mutex_event_r(sync?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>())

public actual fun syncMutexLock(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_mutex_lock(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexLockR(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_mutex_lock_r(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexUnlock(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_mutex_unlock(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexUnlockR(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_mutex_unlock_r(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexRevive(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_mutex_revive(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexReviveR(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_mutex_revive_r(sync?.value?.toCPointer<ByteVar>())

public actual fun syncCondvarWait(sync: SyncT?, mutex: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_condvar_wait(sync?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>())

public actual fun syncCondvarWaitR(sync: SyncT?, mutex: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_condvar_wait_r(sync?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>())

public actual fun syncCondvarSignal(sync: SyncT?, all: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_condvar_signal(sync?.value?.toCPointer<ByteVar>(), all)

public actual fun syncCondvarSignalR(sync: SyncT?, all: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_condvar_signal_r(sync?.value?.toCPointer<ByteVar>(), all)

public actual fun syncSemPost(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_sem_post(sync?.value?.toCPointer<ByteVar>())

public actual fun syncSemPostR(sync: SyncT?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_sem_post_r(sync?.value?.toCPointer<ByteVar>())

public actual fun syncSemWait(sync: SyncT?, tryto: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_sem_wait(sync?.value?.toCPointer<ByteVar>(), tryto)

public actual fun syncSemWaitR(sync: SyncT?, tryto: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_sync_sem_wait_r(sync?.value?.toCPointer<ByteVar>(), tryto)

public actual fun clockTime(id: ClockidT, new: ULong?, old: ULong?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_clock_time(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun clockTimeR(id: ClockidT, new: ULong?, old: ULong?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_clock_time_r(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun clockAdjust(id: ClockidT, new: io.github.kotlinmania.libc.Clockadjust?, old: io.github.kotlinmania.libc.Clockadjust?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_clock_adjust(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun clockAdjustR(id: ClockidT, new: io.github.kotlinmania.libc.Clockadjust?, old: io.github.kotlinmania.libc.Clockadjust?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_clock_adjust_r(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun clockPeriod(id: ClockidT, new: io.github.kotlinmania.libc.Clockperiod?, old: io.github.kotlinmania.libc.Clockperiod?, reserved: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_clock_period(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>(), reserved)

public actual fun clockPeriodR(id: ClockidT, new: io.github.kotlinmania.libc.Clockperiod?, old: io.github.kotlinmania.libc.Clockperiod?, reserved: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_clock_period_r(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>(), reserved)

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_clock_id(pid, tid)

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_clock_id_r(pid, tid)

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_mask(intr, id)

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_neutrino_interrupt_unmask(intr, id)
