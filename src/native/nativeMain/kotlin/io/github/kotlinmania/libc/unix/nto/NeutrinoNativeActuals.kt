@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun channelCreate(flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_channelCreate(flags)

public actual fun channelCreateR(flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_channelCreateR(flags)

public actual fun channelCreatePulsePool(flags: CUint, config: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_channelCreatePulsePool(flags, config?.value?.toCPointer<ByteVar>())

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: COpaquePointer?, cred: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_channelCreateExt(flags, mode, bufsize, maxnumbuf, ev?.value?.toCPointer<ByteVar>(), cred?.value?.toCPointer<ByteVar>())

public actual fun channelDestroy(chid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_channelDestroy(chid)

public actual fun channelDestroyR(chid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_channelDestroyR(chid)

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectAttach(nd, pid, chid, index, flags)

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectAttachR(nd, pid, chid, index, flags)

public actual fun connectDetach(coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectDetach(coid)

public actual fun connectDetachR(coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectDetachR(coid)

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectServerInfo(pid, coid, info?.value?.toCPointer<ByteVar>())

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectServerInfoR(pid, coid, info?.value?.toCPointer<ByteVar>())

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectClientInfoExtraArgs(scoid, infoPp?.value?.toCPointer<ByteVar>(), ngroups, abilities?.value?.toCPointer<ByteVar>(), nable, typeId?.value?.toCPointer<ByteVar>())

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectClientInfoExtraArgsR(scoid, infoPp?.value?.toCPointer<ByteVar>(), ngroups, abilities?.value?.toCPointer<ByteVar>(), nable, typeId?.value?.toCPointer<ByteVar>())

public actual fun connectClientInfo(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectClientInfo(scoid, info?.value?.toCPointer<ByteVar>(), ngroups)

public actual fun connectClientInfoR(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectClientInfoR(scoid, info?.value?.toCPointer<ByteVar>(), ngroups)

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectClientInfoExt(scoid, infoPp?.value?.toCPointer<ByteVar>(), flags)

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_clientInfoExtFree(infoPp?.value?.toCPointer<ByteVar>())

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: COpaquePointer?, nable: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectClientInfoAble(scoid, infoPp?.value?.toCPointer<ByteVar>(), flags, abilities?.value?.toCPointer<ByteVar>(), nable)

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectFlags(pid, coid, mask, bits)

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_connectFlagsR(pid, coid, mask, bits)

public actual fun channelConnectAttr(id: CUint, oldAttr: COpaquePointer?, newAttr: COpaquePointer?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_channelConnectAttr(id, oldAttr?.value?.toCPointer<ByteVar>(), newAttr?.value?.toCPointer<ByteVar>(), flags)

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSend(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendR(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendnc(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendncR(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendsv(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendsvR(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendsvnc(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendsvncR(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvs(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendvs(coid, siov?.value?.toCPointer<ByteVar>(), sparts, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendvsR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendvsR(coid, siov?.value?.toCPointer<ByteVar>(), sparts, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendvsnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendvsnc(coid, siov?.value?.toCPointer<ByteVar>(), sparts, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendvsncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendvsncR(coid, siov?.value?.toCPointer<ByteVar>(), sparts, rmsg?.value?.toCPointer<ByteVar>(), rbytes)

public actual fun msgSendv(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendv(coid, siov?.value?.toCPointer<ByteVar>(), sparts, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendvR(coid, siov?.value?.toCPointer<ByteVar>(), sparts, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendvnc(coid, siov?.value?.toCPointer<ByteVar>(), sparts, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgSendvncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendvncR(coid, siov?.value?.toCPointer<ByteVar>(), sparts, riov?.value?.toCPointer<ByteVar>(), rparts)

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceive(chid, msg?.value?.toCPointer<ByteVar>(), bytes, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceiveR(chid, msg?.value?.toCPointer<ByteVar>(), bytes, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceivev(chid, iov?.value?.toCPointer<ByteVar>(), parts, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceivevR(chid, iov?.value?.toCPointer<ByteVar>(), parts, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceivePulse(chid, pulse?.value?.toCPointer<ByteVar>(), bytes, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceivePulseR(chid, pulse?.value?.toCPointer<ByteVar>(), bytes, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivePulsev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceivePulsev(chid, iov?.value?.toCPointer<ByteVar>(), parts, info?.value?.toCPointer<ByteVar>())

public actual fun msgReceivePulsevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceivePulsevR(chid, iov?.value?.toCPointer<ByteVar>(), parts, info?.value?.toCPointer<ByteVar>())

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReply(rcvid, status, msg?.value?.toCPointer<ByteVar>(), bytes)

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReplyR(rcvid, status, msg?.value?.toCPointer<ByteVar>(), bytes)

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReplyv(rcvid, status, iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReplyvR(rcvid, status, iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgReadiov(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReadiov(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset, flags)

public actual fun msgReadiovR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReadiovR(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset, flags)

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgRead(rcvid, msg?.value?.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReadR(rcvid, msg?.value?.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgReadv(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReadv(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset)

public actual fun msgReadvR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReadvR(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset)

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgWrite(rcvid, msg?.value?.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgWriteR(rcvid, msg?.value?.toCPointer<ByteVar>(), bytes, offset)

public actual fun msgWritev(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgWritev(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset)

public actual fun msgWritevR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgWritevR(rcvid, iov?.value?.toCPointer<ByteVar>(), parts, offset)

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendPulse(coid, priority, code, value)

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendPulseR(coid, priority, code, value)

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendPulsePtr(coid, priority, code, value?.value?.toCPointer<ByteVar>())

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendPulsePtrR(coid, priority, code, value?.value?.toCPointer<ByteVar>())

public actual fun msgDeliverEvent(rcvid: CInt, event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgDeliverEvent(rcvid, event?.value?.toCPointer<ByteVar>())

public actual fun msgDeliverEventR(rcvid: CInt, event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgDeliverEventR(rcvid, event?.value?.toCPointer<ByteVar>())

public actual fun msgVerifyEvent(rcvid: CInt, event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgVerifyEvent(rcvid, event?.value?.toCPointer<ByteVar>())

public actual fun msgVerifyEventR(rcvid: CInt, event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgVerifyEventR(rcvid, event?.value?.toCPointer<ByteVar>())

public actual fun msgRegisterEvent(event: COpaquePointer?, coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgRegisterEvent(event?.value?.toCPointer<ByteVar>(), coid)

public actual fun msgRegisterEventR(event: COpaquePointer?, coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgRegisterEventR(event?.value?.toCPointer<ByteVar>(), coid)

public actual fun msgUnregisterEvent(event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgUnregisterEvent(event?.value?.toCPointer<ByteVar>())

public actual fun msgUnregisterEventR(event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgUnregisterEventR(event?.value?.toCPointer<ByteVar>())

public actual fun msgInfo(rcvid: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgInfo(rcvid, info?.value?.toCPointer<ByteVar>())

public actual fun msgInfoR(rcvid: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgInfoR(rcvid, info?.value?.toCPointer<ByteVar>())

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgKeyData(rcvid, oper, key, newkey?.value?.toCPointer<ByteVar>(), iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgKeyDataR(rcvid, oper, key, newkey?.value?.toCPointer<ByteVar>(), iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgError(rcvid, err)

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgErrorR(rcvid, err)

public actual fun msgCurrent(rcvid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgCurrent(rcvid)

public actual fun msgCurrentR(rcvid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgCurrentR(rcvid)

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendAsyncGbl(coid, smsg?.value?.toCPointer<ByteVar>(), sbytes, msgPrio)

public actual fun msgSendAsync(coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgSendAsync(coid)

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: COpaquePointer?, coid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceiveAsyncGbl(chid, rmsg?.value?.toCPointer<ByteVar>(), rbytes, info?.value?.toCPointer<ByteVar>(), coid)

public actual fun msgReceiveAsync(chid: CInt, iov: COpaquePointer?, parts: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgReceiveAsync(chid, iov?.value?.toCPointer<ByteVar>(), parts)

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgPause(rcvid, cookie)

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_msgPauseR(rcvid, cookie)

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalKill(nd, pid, tid, signo, code, value)

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalKillR(nd, pid, tid, signo, code, value)

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalKillSigval(nd, pid, tid, signo, code, value?.value?.toCPointer<ByteVar>())

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalKillSigvalR(nd, pid, tid, signo, code, value?.value?.toCPointer<ByteVar>())

public actual fun signalReturn(info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalReturn(info?.value?.toCPointer<ByteVar>())

public actual fun signalFault(sigcode: CUint, regs: COpaquePointer?, refaddr: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalFault(sigcode, regs?.value?.toCPointer<ByteVar>(), refaddr)

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalAction(pid, 0L.toCPointer<ByteVar>(), signo, act?.value?.toCPointer<ByteVar>(), oact?.value?.toCPointer<ByteVar>())

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalActionR(pid, 0L.toCPointer<ByteVar>(), signo, act?.value?.toCPointer<ByteVar>(), oact?.value?.toCPointer<ByteVar>())

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalProcmask(pid, tid, how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalProcmaskR(pid, tid, how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun signalSuspend(set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalSuspend(set?.value?.toCPointer<ByteVar>())

public actual fun signalSuspendR(set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalSuspendR(set?.value?.toCPointer<ByteVar>())

public actual fun signalWaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalWaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun signalWaitinfoR(set: COpaquePointer?, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalWaitinfoR(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun signalWaitinfoMask(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalWaitinfoMask(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), mask?.value?.toCPointer<ByteVar>())

public actual fun signalWaitinfoMaskR(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_signalWaitinfoMaskR(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), mask?.value?.toCPointer<ByteVar>())

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadCreate(pid, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadCreateR(pid, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadDestroy(tid, priority, status?.value?.toCPointer<ByteVar>())

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadDestroyR(tid, priority, status?.value?.toCPointer<ByteVar>())

public actual fun threadDetach(tid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadDetach(tid)

public actual fun threadDetachR(tid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadDetachR(tid)

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadJoin(tid, status?.value?.toCPointer<ByteVar>())

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadJoinR(tid, status?.value?.toCPointer<ByteVar>())

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadCancel(tid, 0L.toCPointer<ByteVar>())

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadCancelR(tid, 0L.toCPointer<ByteVar>())

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadCtl(cmd, data?.value?.toCPointer<ByteVar>())

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadCtlR(cmd, data?.value?.toCPointer<ByteVar>())

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadCtlExt(pid, tid, cmd, data?.value?.toCPointer<ByteVar>())

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_threadCtlExtR(pid, tid, cmd, data?.value?.toCPointer<ByteVar>())

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptHookTrace(0L.toCPointer<ByteVar>(), flags)

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptHookIdle(0L.toCPointer<ByteVar>(), flags)

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptHookIdle2(0L.toCPointer<ByteVar>(), flags)

public actual fun interruptHookOverdriveEvent(event: COpaquePointer?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptHookOverdriveEvent(event?.value?.toCPointer<ByteVar>(), flags)

public actual fun interruptAttachEvent(intr: CInt, event: COpaquePointer?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptAttachEvent(intr, event?.value?.toCPointer<ByteVar>(), flags)

public actual fun interruptAttachEventR(intr: CInt, event: COpaquePointer?, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptAttachEventR(intr, event?.value?.toCPointer<ByteVar>(), flags)

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptAttach(intr, 0L.toCPointer<ByteVar>(), area?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptAttachR(intr, 0L.toCPointer<ByteVar>(), area?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptAttachArray(intr, 0L.toCPointer<ByteVar>(), area?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptAttachArrayR(intr, 0L.toCPointer<ByteVar>(), area?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun interruptDetach(id: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptDetach(id)

public actual fun interruptDetachR(id: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptDetachR(id)

public actual fun interruptWait(flags: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptWait(flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun interruptWaitR(flags: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptWaitR(flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptCharacteristic(type, id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptCharacteristicR(type, id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun schedGet(pid: PidT, tid: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedGet(pid, tid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetR(pid: PidT, tid: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedGetR(pid, tid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetCpuNum(): CUint =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedGetCpuNum()

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedSet(pid, tid, algorithm, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedSetR(pid, tid, algorithm, param?.value?.toCPointer<ByteVar>())

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedInfo(pid, algorithm, info?.value?.toCPointer<ByteVar>())

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedInfoR(pid, algorithm, info?.value?.toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedYield()

public actual fun schedYieldR(): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedYieldR()

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedCtl(cmd, data?.value?.toCPointer<ByteVar>(), length)

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedCtlR(cmd, data?.value?.toCPointer<ByteVar>(), length)

public actual fun schedJobCreate(job: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedJobCreate(job?.value?.toCPointer<ByteVar>())

public actual fun schedJobCreateR(job: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedJobCreateR(job?.value?.toCPointer<ByteVar>())

public actual fun schedJobDestroy(job: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedJobDestroy(job?.value?.toCPointer<ByteVar>())

public actual fun schedJobDestroyR(job: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedJobDestroyR(job?.value?.toCPointer<ByteVar>())

public actual fun schedWaypoint(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedWaypoint(job?.value?.toCPointer<ByteVar>(), new?.value?.toCPointer<ByteVar>(), max?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun schedWaypointR(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_schedWaypointR(job?.value?.toCPointer<ByteVar>(), new?.value?.toCPointer<ByteVar>(), max?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun timerCreate(id: ClockidT, notify: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerCreate(id, notify?.value?.toCPointer<ByteVar>())

public actual fun timerCreateR(id: ClockidT, notify: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerCreateR(id, notify?.value?.toCPointer<ByteVar>())

public actual fun timerDestroy(id: TimerT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerDestroy(id.toLong().toCPointer<ByteVar>())

public actual fun timerDestroyR(id: TimerT): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerDestroyR(id.toLong().toCPointer<ByteVar>())

public actual fun timerSettime(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerSettime(id.toLong().toCPointer<ByteVar>(), flags, itime?.value?.toCPointer<ByteVar>(), oitime?.value?.toCPointer<ByteVar>())

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerSettimeR(id.toLong().toCPointer<ByteVar>(), flags, itime?.value?.toCPointer<ByteVar>(), oitime?.value?.toCPointer<ByteVar>())

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerInfo(pid, id.toLong().toCPointer<ByteVar>(), flags, info?.value?.toCPointer<ByteVar>())

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerInfoR(pid, id.toLong().toCPointer<ByteVar>(), flags, info?.value?.toCPointer<ByteVar>())

public actual fun timerAlarm(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerAlarm(id, itime?.value?.toCPointer<ByteVar>(), otime?.value?.toCPointer<ByteVar>())

public actual fun timerAlarmR(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerAlarmR(id, itime?.value?.toCPointer<ByteVar>(), otime?.value?.toCPointer<ByteVar>())

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerTimeout(id, flags, notify?.value?.toCPointer<ByteVar>(), ntime?.value?.toCPointer<ByteVar>(), otime?.value?.toCPointer<ByteVar>())

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_timerTimeoutR(id, flags, notify?.value?.toCPointer<ByteVar>(), ntime?.value?.toCPointer<ByteVar>(), otime?.value?.toCPointer<ByteVar>())

public actual fun syncTypeCreate(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncTypeCreate(type, sync?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun syncTypeCreateR(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncTypeCreateR(type, sync?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun syncDestroy(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncDestroy(sync?.value?.toCPointer<ByteVar>())

public actual fun syncDestroyR(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncDestroyR(sync?.value?.toCPointer<ByteVar>())

public actual fun syncCtl(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncCtl(cmd, sync?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun syncCtlR(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncCtlR(cmd, sync?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun syncMutexEvent(sync: COpaquePointer?, event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncMutexEvent(sync?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>())

public actual fun syncMutexEventR(sync: COpaquePointer?, event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncMutexEventR(sync?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>())

public actual fun syncMutexLock(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncMutexLock(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexLockR(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncMutexLockR(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexUnlock(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncMutexUnlock(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexUnlockR(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncMutexUnlockR(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexRevive(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncMutexRevive(sync?.value?.toCPointer<ByteVar>())

public actual fun syncMutexReviveR(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncMutexReviveR(sync?.value?.toCPointer<ByteVar>())

public actual fun syncCondvarWait(sync: COpaquePointer?, mutex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncCondvarWait(sync?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>())

public actual fun syncCondvarWaitR(sync: COpaquePointer?, mutex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncCondvarWaitR(sync?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>())

public actual fun syncCondvarSignal(sync: COpaquePointer?, all: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncCondvarSignal(sync?.value?.toCPointer<ByteVar>(), all)

public actual fun syncCondvarSignalR(sync: COpaquePointer?, all: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncCondvarSignalR(sync?.value?.toCPointer<ByteVar>(), all)

public actual fun syncSemPost(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncSemPost(sync?.value?.toCPointer<ByteVar>())

public actual fun syncSemPostR(sync: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncSemPostR(sync?.value?.toCPointer<ByteVar>())

public actual fun syncSemWait(sync: COpaquePointer?, tryto: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncSemWait(sync?.value?.toCPointer<ByteVar>(), tryto)

public actual fun syncSemWaitR(sync: COpaquePointer?, tryto: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_syncSemWaitR(sync?.value?.toCPointer<ByteVar>(), tryto)

public actual fun clockTime(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_clockTime(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun clockTimeR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_clockTimeR(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun clockAdjust(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_clockAdjust(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun clockAdjustR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_clockAdjustR(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>())

public actual fun clockPeriod(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_clockPeriod(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>(), reserved)

public actual fun clockPeriodR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_clockPeriodR(id, new?.value?.toCPointer<ByteVar>(), old?.value?.toCPointer<ByteVar>(), reserved)

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_clockId(pid, tid)

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_clockIdR(pid, tid)

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptMask(intr, id)

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_neutrino_interruptUnmask(intr, id)
