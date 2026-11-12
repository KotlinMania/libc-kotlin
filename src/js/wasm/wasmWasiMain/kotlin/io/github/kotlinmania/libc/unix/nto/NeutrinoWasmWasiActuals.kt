@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoChannelCreate")
private external fun wasiLibcUnixNtoNeutrinoChannelCreate(flags: Int): Int

public actual fun channelCreate(flags: CUint): CInt =
    wasiLibcUnixNtoNeutrinoChannelCreate(flags.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoChannelCreateR")
private external fun wasiLibcUnixNtoNeutrinoChannelCreateR(flags: Int): Int

public actual fun channelCreateR(flags: CUint): CInt =
    wasiLibcUnixNtoNeutrinoChannelCreateR(flags.toInt())

public actual fun channelCreatePulsePool(flags: CUint, config: ConstPtr<NtoChannelConfig>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoChannelCreatePulsePool")

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: ConstPtr<Sigevent>, cred: MutPtr<CredInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoChannelCreateExt")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoChannelDestroy")
private external fun wasiLibcUnixNtoNeutrinoChannelDestroy(chid: Int): Int

public actual fun channelDestroy(chid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoChannelDestroy(chid)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoChannelDestroyR")
private external fun wasiLibcUnixNtoNeutrinoChannelDestroyR(chid: Int): Int

public actual fun channelDestroyR(chid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoChannelDestroyR(chid)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoConnectAttach")
private external fun wasiLibcUnixNtoNeutrinoConnectAttach(nd: Int, pid: Int, chid: Int, index: Int, flags: Int): Int

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    wasiLibcUnixNtoNeutrinoConnectAttach(nd.toInt(), pid, chid, index.toInt(), flags)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoConnectAttachR")
private external fun wasiLibcUnixNtoNeutrinoConnectAttachR(nd: Int, pid: Int, chid: Int, index: Int, flags: Int): Int

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    wasiLibcUnixNtoNeutrinoConnectAttachR(nd.toInt(), pid, chid, index.toInt(), flags)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoConnectDetach")
private external fun wasiLibcUnixNtoNeutrinoConnectDetach(coid: Int): Int

public actual fun connectDetach(coid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoConnectDetach(coid)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoConnectDetachR")
private external fun wasiLibcUnixNtoNeutrinoConnectDetachR(coid: Int): Int

public actual fun connectDetachR(coid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoConnectDetachR(coid)

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoConnectServerInfo")

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoConnectServerInfoR")

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoConnectClientInfoExtraArgs")

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoConnectClientInfoExtraArgsR")

public actual fun connectClientInfo(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoConnectClientInfo")

public actual fun connectClientInfoR(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoConnectClientInfoR")

public actual fun connectClientInfoExt(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoConnectClientInfoExt")

public actual fun clientInfoExtFree(infoPp: MutPtr<MutPtr<ClientInfo>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoClientInfoExtFree")

public actual fun connectClientInfoAble(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt, abilities: MutPtr<ClientAble>, nable: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoConnectClientInfoAble")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoConnectFlags")
private external fun wasiLibcUnixNtoNeutrinoConnectFlags(pid: Int, coid: Int, mask: Int, bits: Int): Int

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    wasiLibcUnixNtoNeutrinoConnectFlags(pid, coid, mask.toInt(), bits.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoConnectFlagsR")
private external fun wasiLibcUnixNtoNeutrinoConnectFlagsR(pid: Int, coid: Int, mask: Int, bits: Int): Int

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    wasiLibcUnixNtoNeutrinoConnectFlagsR(pid, coid, mask.toInt(), bits.toInt())

public actual fun channelConnectAttr(id: CUint, oldAttr: MutPtr<ChannelConnectAttr>, newAttr: MutPtr<ChannelConnectAttr>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoChannelConnectAttr")

public actual fun msgSend(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSend")

public actual fun msgSendR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendR")

public actual fun msgSendnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendnc")

public actual fun msgSendncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendncR")

public actual fun msgSendsv(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendsv")

public actual fun msgSendsvR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendsvR")

public actual fun msgSendsvnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendsvnc")

public actual fun msgSendsvncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendsvncR")

public actual fun msgSendvs(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendvs")

public actual fun msgSendvsR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendvsR")

public actual fun msgSendvsnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendvsnc")

public actual fun msgSendvsncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendvsncR")

public actual fun msgSendv(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendv")

public actual fun msgSendvR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendvR")

public actual fun msgSendvnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendvnc")

public actual fun msgSendvncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendvncR")

public actual fun msgReceive(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceive")

public actual fun msgReceiveR(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceiveR")

public actual fun msgReceivev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceivev")

public actual fun msgReceivevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceivevR")

public actual fun msgReceivePulse(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceivePulse")

public actual fun msgReceivePulseR(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceivePulseR")

public actual fun msgReceivePulsev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceivePulsev")

public actual fun msgReceivePulsevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceivePulsevR")

public actual fun msgReply(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReply")

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReplyR")

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReplyv")

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReplyvR")

public actual fun msgReadiov(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReadiov")

public actual fun msgReadiovR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReadiovR")

public actual fun msgRead(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgRead")

public actual fun msgReadR(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReadR")

public actual fun msgReadv(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReadv")

public actual fun msgReadvR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReadvR")

public actual fun msgWrite(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgWrite")

public actual fun msgWriteR(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgWriteR")

public actual fun msgWritev(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgWritev")

public actual fun msgWritevR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgWritevR")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoMsgSendPulse")
private external fun wasiLibcUnixNtoNeutrinoMsgSendPulse(coid: Int, priority: Int, code: Int, value: Int): Int

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    wasiLibcUnixNtoNeutrinoMsgSendPulse(coid, priority, code, value)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoMsgSendPulseR")
private external fun wasiLibcUnixNtoNeutrinoMsgSendPulseR(coid: Int, priority: Int, code: Int, value: Int): Int

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    wasiLibcUnixNtoNeutrinoMsgSendPulseR(coid, priority, code, value)

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendPulsePtr")

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendPulsePtrR")

public actual fun msgDeliverEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgDeliverEvent")

public actual fun msgDeliverEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgDeliverEventR")

public actual fun msgVerifyEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgVerifyEvent")

public actual fun msgVerifyEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgVerifyEventR")

public actual fun msgRegisterEvent(event: MutPtr<Sigevent>, coid: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgRegisterEvent")

public actual fun msgRegisterEventR(event: MutPtr<Sigevent>, coid: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgRegisterEventR")

public actual fun msgUnregisterEvent(event: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgUnregisterEvent")

public actual fun msgUnregisterEventR(event: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgUnregisterEventR")

public actual fun msgInfo(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgInfo")

public actual fun msgInfoR(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgInfoR")

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgKeyData")

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgKeyDataR")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoMsgError")
private external fun wasiLibcUnixNtoNeutrinoMsgError(rcvid: Int, err: Int): Int

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    wasiLibcUnixNtoNeutrinoMsgError(rcvid, err)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoMsgErrorR")
private external fun wasiLibcUnixNtoNeutrinoMsgErrorR(rcvid: Int, err: Int): Int

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    wasiLibcUnixNtoNeutrinoMsgErrorR(rcvid, err)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoMsgCurrent")
private external fun wasiLibcUnixNtoNeutrinoMsgCurrent(rcvid: Int): Int

public actual fun msgCurrent(rcvid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoMsgCurrent(rcvid)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoMsgCurrentR")
private external fun wasiLibcUnixNtoNeutrinoMsgCurrentR(rcvid: Int): Int

public actual fun msgCurrentR(rcvid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoMsgCurrentR(rcvid)

public actual fun msgSendAsyncGbl(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, msgPrio: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgSendAsyncGbl")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoMsgSendAsync")
private external fun wasiLibcUnixNtoNeutrinoMsgSendAsync(coid: Int): Int

public actual fun msgSendAsync(coid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoMsgSendAsync(coid)

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: MutPtr<CVoid>, rbytes: ULong, info: MutPtr<MsgInfo64>, coid: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceiveAsyncGbl")

public actual fun msgReceiveAsync(chid: CInt, iov: ConstPtr<Iovec>, parts: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoMsgReceiveAsync")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoMsgPause")
private external fun wasiLibcUnixNtoNeutrinoMsgPause(rcvid: Int, cookie: Int): Int

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    wasiLibcUnixNtoNeutrinoMsgPause(rcvid, cookie.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoMsgPauseR")
private external fun wasiLibcUnixNtoNeutrinoMsgPauseR(rcvid: Int, cookie: Int): Int

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    wasiLibcUnixNtoNeutrinoMsgPauseR(rcvid, cookie.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoSignalKill")
private external fun wasiLibcUnixNtoNeutrinoSignalKill(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    wasiLibcUnixNtoNeutrinoSignalKill(nd.toInt(), pid, tid, signo, code, value)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoSignalKillR")
private external fun wasiLibcUnixNtoNeutrinoSignalKillR(nd: Int, pid: Int, tid: Int, signo: Int, code: Int, value: Int): Int

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    wasiLibcUnixNtoNeutrinoSignalKillR(nd.toInt(), pid, tid, signo, code, value)

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalKillSigval")

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalKillSigvalR")

public actual fun signalReturn(info: MutPtr<SighandlerInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalReturn")

public actual fun signalFault(sigcode: CUint, regs: MutPtr<CVoid>, refaddr: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalFault")

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalAction")

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalActionR")

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalProcmask")

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalProcmaskR")

public actual fun signalSuspend(set: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalSuspend")

public actual fun signalSuspendR(set: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalSuspendR")

public actual fun signalWaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalWaitinfo")

public actual fun signalWaitinfoR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalWaitinfoR")

public actual fun signalWaitinfoMask(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalWaitinfoMask")

public actual fun signalWaitinfoMaskR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSignalWaitinfoMaskR")

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadCreate")

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadCreateR")

public actual fun threadDestroy(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadDestroy")

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadDestroyR")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoThreadDetach")
private external fun wasiLibcUnixNtoNeutrinoThreadDetach(tid: Int): Int

public actual fun threadDetach(tid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoThreadDetach(tid)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoThreadDetachR")
private external fun wasiLibcUnixNtoNeutrinoThreadDetachR(tid: Int): Int

public actual fun threadDetachR(tid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoThreadDetachR(tid)

public actual fun threadJoin(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadJoin")

public actual fun threadJoinR(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadJoinR")

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadCancel")

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadCancelR")

public actual fun threadCtl(cmd: CInt, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadCtl")

public actual fun threadCtlR(cmd: CInt, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadCtlR")

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadCtlExt")

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoThreadCtlExtR")

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptHookTrace")

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptHookIdle")

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptHookIdle2")

public actual fun interruptHookOverdriveEvent(event: ConstPtr<Sigevent>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptHookOverdriveEvent")

public actual fun interruptAttachEvent(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptAttachEvent")

public actual fun interruptAttachEventR(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptAttachEventR")

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptAttach")

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptAttachR")

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptAttachArray")

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptAttachArrayR")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoInterruptDetach")
private external fun wasiLibcUnixNtoNeutrinoInterruptDetach(id: Int): Int

public actual fun interruptDetach(id: CInt): CInt =
    wasiLibcUnixNtoNeutrinoInterruptDetach(id)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoInterruptDetachR")
private external fun wasiLibcUnixNtoNeutrinoInterruptDetachR(id: Int): Int

public actual fun interruptDetachR(id: CInt): CInt =
    wasiLibcUnixNtoNeutrinoInterruptDetachR(id)

public actual fun interruptWait(flags: CInt, timeout: ConstPtr<ULong>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptWait")

public actual fun interruptWaitR(flags: CInt, timeout: ConstPtr<ULong>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptWaitR")

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptCharacteristic")

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoInterruptCharacteristicR")

public actual fun schedGet(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedGet")

public actual fun schedGetR(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedGetR")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoSchedGetCpuNum")
private external fun wasiLibcUnixNtoNeutrinoSchedGetCpuNum(): Int

public actual fun schedGetCpuNum(): CUint =
    wasiLibcUnixNtoNeutrinoSchedGetCpuNum().toUInt()

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedSet")

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedSetR")

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedInfo")

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedInfoR")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoSchedYield")
private external fun wasiLibcUnixNtoNeutrinoSchedYield(): Int

public actual fun schedYield(): CInt =
    wasiLibcUnixNtoNeutrinoSchedYield()

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoSchedYieldR")
private external fun wasiLibcUnixNtoNeutrinoSchedYieldR(): Int

public actual fun schedYieldR(): CInt =
    wasiLibcUnixNtoNeutrinoSchedYieldR()

public actual fun schedCtl(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedCtl")

public actual fun schedCtlR(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedCtlR")

public actual fun schedJobCreate(job: MutPtr<NtoJobT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedJobCreate")

public actual fun schedJobCreateR(job: MutPtr<NtoJobT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedJobCreateR")

public actual fun schedJobDestroy(job: MutPtr<NtoJobT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedJobDestroy")

public actual fun schedJobDestroyR(job: MutPtr<NtoJobT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedJobDestroyR")

public actual fun schedWaypoint(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedWaypoint")

public actual fun schedWaypointR(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSchedWaypointR")

public actual fun timerCreate(id: ClockidT, notify: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerCreate")

public actual fun timerCreateR(id: ClockidT, notify: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerCreateR")

public actual fun timerDestroy(id: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerDestroy")

public actual fun timerDestroyR(id: TimerT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerDestroyR")

public actual fun timerSettime(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerSettime")

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerSettimeR")

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerInfo")

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerInfoR")

public actual fun timerAlarm(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerAlarm")

public actual fun timerAlarmR(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerAlarmR")

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerTimeout")

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoTimerTimeoutR")

public actual fun syncTypeCreate(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncTypeCreate")

public actual fun syncTypeCreateR(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncTypeCreateR")

public actual fun syncDestroy(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncDestroy")

public actual fun syncDestroyR(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncDestroyR")

public actual fun syncCtl(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncCtl")

public actual fun syncCtlR(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncCtlR")

public actual fun syncMutexEvent(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncMutexEvent")

public actual fun syncMutexEventR(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncMutexEventR")

public actual fun syncMutexLock(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncMutexLock")

public actual fun syncMutexLockR(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncMutexLockR")

public actual fun syncMutexUnlock(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncMutexUnlock")

public actual fun syncMutexUnlockR(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncMutexUnlockR")

public actual fun syncMutexRevive(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncMutexRevive")

public actual fun syncMutexReviveR(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncMutexReviveR")

public actual fun syncCondvarWait(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncCondvarWait")

public actual fun syncCondvarWaitR(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncCondvarWaitR")

public actual fun syncCondvarSignal(sync: MutPtr<SyncT>, all: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncCondvarSignal")

public actual fun syncCondvarSignalR(sync: MutPtr<SyncT>, all: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncCondvarSignalR")

public actual fun syncSemPost(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncSemPost")

public actual fun syncSemPostR(sync: MutPtr<SyncT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncSemPostR")

public actual fun syncSemWait(sync: MutPtr<SyncT>, tryto: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncSemWait")

public actual fun syncSemWaitR(sync: MutPtr<SyncT>, tryto: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoSyncSemWaitR")

public actual fun clockTime(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoClockTime")

public actual fun clockTimeR(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoClockTimeR")

public actual fun clockAdjust(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoClockAdjust")

public actual fun clockAdjustR(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoClockAdjustR")

public actual fun clockPeriod(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoClockPeriod")

public actual fun clockPeriodR(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNtoNeutrinoClockPeriodR")

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoClockId")
private external fun wasiLibcUnixNtoNeutrinoClockId(pid: Int, tid: Int): Int

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoClockId(pid, tid)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoClockIdR")
private external fun wasiLibcUnixNtoNeutrinoClockIdR(pid: Int, tid: Int): Int

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    wasiLibcUnixNtoNeutrinoClockIdR(pid, tid)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoInterruptMask")
private external fun wasiLibcUnixNtoNeutrinoInterruptMask(intr: Int, id: Int): Int

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    wasiLibcUnixNtoNeutrinoInterruptMask(intr, id)

@kotlin.wasm.WasmImport("libc", "libcUnixNtoNeutrinoInterruptUnmask")
private external fun wasiLibcUnixNtoNeutrinoInterruptUnmask(intr: Int, id: Int): Int

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    wasiLibcUnixNtoNeutrinoInterruptUnmask(intr, id)
