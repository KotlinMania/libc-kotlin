@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val unixNtoNeutrinoNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun channelCreate(flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoChannelCreate(flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelCreateR(flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoChannelCreateR(flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelCreatePulsePool(flags: CUint, config: ConstPtr<NtoChannelConfig>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoChannelCreatePulsePool(flags.toInt(), config.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: ConstPtr<Sigevent>, cred: MutPtr<CredInfo>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoChannelCreateExt(flags.toInt(), mode.toInt(), bufsize.toString(), maxnumbuf.toInt(), ev.rawAddress.toString(), cred.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelDestroy(chid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoChannelDestroy(chid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelDestroyR(chid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoChannelDestroyR(chid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectAttach(nd.toInt(), pid, chid, index.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectAttachR(nd.toInt(), pid, chid, index.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectDetach(coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectDetach(coid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectDetachR(coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectDetachR(coid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectServerInfo(pid, coid, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectServerInfoR(pid, coid, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectClientInfoExtraArgs(scoid, infoPp.rawAddress.toString(), ngroups, abilities.rawAddress.toString(), nable, typeId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectClientInfoExtraArgsR(scoid, infoPp.rawAddress.toString(), ngroups, abilities.rawAddress.toString(), nable, typeId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfo(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectClientInfo(scoid, info.rawAddress.toString(), ngroups) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoR(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectClientInfoR(scoid, info.rawAddress.toString(), ngroups) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoExt(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectClientInfoExt(scoid, infoPp.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clientInfoExtFree(infoPp: MutPtr<MutPtr<ClientInfo>>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoClientInfoExtFree(infoPp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoAble(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt, abilities: MutPtr<ClientAble>, nable: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectClientInfoAble(scoid, infoPp.rawAddress.toString(), flags, abilities.rawAddress.toString(), nable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectFlags(pid, coid, mask.toInt(), bits.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoConnectFlagsR(pid, coid, mask.toInt(), bits.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelConnectAttr(id: CUint, oldAttr: MutPtr<ChannelConnectAttr>, newAttr: MutPtr<ChannelConnectAttr>, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoChannelConnectAttr(id.toInt(), oldAttr.rawAddress.toString(), newAttr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSend(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSend(coid, smsg.rawAddress.toString(), sbytes.toString(), rmsg.rawAddress.toString(), rbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendR(coid, smsg.rawAddress.toString(), sbytes.toString(), rmsg.rawAddress.toString(), rbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendnc(coid, smsg.rawAddress.toString(), sbytes.toString(), rmsg.rawAddress.toString(), rbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendncR(coid, smsg.rawAddress.toString(), sbytes.toString(), rmsg.rawAddress.toString(), rbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendsv(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendsv(coid, smsg.rawAddress.toString(), sbytes.toString(), riov.rawAddress.toString(), rparts.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendsvR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendsvR(coid, smsg.rawAddress.toString(), sbytes.toString(), riov.rawAddress.toString(), rparts.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendsvnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendsvnc(coid, smsg.rawAddress.toString(), sbytes.toString(), riov.rawAddress.toString(), rparts.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendsvncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendsvncR(coid, smsg.rawAddress.toString(), sbytes.toString(), riov.rawAddress.toString(), rparts.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvs(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendvs(coid, siov.rawAddress.toString(), sparts.toString(), rmsg.rawAddress.toString(), rbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvsR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendvsR(coid, siov.rawAddress.toString(), sparts.toString(), rmsg.rawAddress.toString(), rbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvsnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendvsnc(coid, siov.rawAddress.toString(), sparts.toString(), rmsg.rawAddress.toString(), rbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvsncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendvsncR(coid, siov.rawAddress.toString(), sparts.toString(), rmsg.rawAddress.toString(), rbytes.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendv(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendv(coid, siov.rawAddress.toString(), sparts.toString(), riov.rawAddress.toString(), rparts.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendvR(coid, siov.rawAddress.toString(), sparts.toString(), riov.rawAddress.toString(), rparts.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendvnc(coid, siov.rawAddress.toString(), sparts.toString(), riov.rawAddress.toString(), rparts.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendvncR(coid, siov.rawAddress.toString(), sparts.toString(), riov.rawAddress.toString(), rparts.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceive(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceive(chid, msg.rawAddress.toString(), bytes.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceiveR(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceiveR(chid, msg.rawAddress.toString(), bytes.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceivev(chid, iov.rawAddress.toString(), parts.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceivevR(chid, iov.rawAddress.toString(), parts.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivePulse(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceivePulse(chid, pulse.rawAddress.toString(), bytes.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivePulseR(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceivePulseR(chid, pulse.rawAddress.toString(), bytes.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivePulsev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceivePulsev(chid, iov.rawAddress.toString(), parts.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivePulsevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceivePulsevR(chid, iov.rawAddress.toString(), parts.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReply(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReply(rcvid, status.toString(), msg.rawAddress.toString(), bytes.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReplyR(rcvid, status.toString(), msg.rawAddress.toString(), bytes.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReplyv(rcvid, status.toString(), iov.rawAddress.toString(), parts.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReplyvR(rcvid, status.toString(), iov.rawAddress.toString(), parts.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadiov(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReadiov(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadiovR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReadiovR(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgRead(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgRead(rcvid, msg.rawAddress.toString(), bytes.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadR(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReadR(rcvid, msg.rawAddress.toString(), bytes.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadv(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReadv(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadvR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReadvR(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWrite(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgWrite(rcvid, msg.rawAddress.toString(), bytes.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWriteR(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgWriteR(rcvid, msg.rawAddress.toString(), bytes.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWritev(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgWritev(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWritevR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgWritevR(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendPulse(coid, priority, code, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendPulseR(coid, priority, code, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendPulsePtr(coid, priority, code, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendPulsePtrR(coid, priority, code, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgDeliverEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgDeliverEvent(rcvid, event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgDeliverEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgDeliverEventR(rcvid, event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgVerifyEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgVerifyEvent(rcvid, event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgVerifyEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgVerifyEventR(rcvid, event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgRegisterEvent(event: MutPtr<Sigevent>, coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgRegisterEvent(event.rawAddress.toString(), coid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgRegisterEventR(event: MutPtr<Sigevent>, coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgRegisterEventR(event.rawAddress.toString(), coid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgUnregisterEvent(event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgUnregisterEvent(event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgUnregisterEventR(event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgUnregisterEventR(event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgInfo(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgInfo(rcvid, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgInfoR(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgInfoR(rcvid, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgKeyData(rcvid, oper, key.toInt(), newkey.rawAddress.toString(), iov.rawAddress.toString(), parts) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgKeyDataR(rcvid, oper, key.toInt(), newkey.rawAddress.toString(), iov.rawAddress.toString(), parts) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgError(rcvid, err) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgErrorR(rcvid, err) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgCurrent(rcvid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgCurrent(rcvid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgCurrentR(rcvid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgCurrentR(rcvid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendAsyncGbl(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, msgPrio: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendAsyncGbl(coid, smsg.rawAddress.toString(), sbytes.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendAsync(coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgSendAsync(coid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: MutPtr<CVoid>, rbytes: ULong, info: MutPtr<MsgInfo64>, coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceiveAsyncGbl(chid, rmsg.rawAddress.toString(), rbytes.toString(), info.rawAddress.toString(), coid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceiveAsync(chid: CInt, iov: ConstPtr<Iovec>, parts: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgReceiveAsync(chid, iov.rawAddress.toString(), parts.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgPause(rcvid, cookie.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoMsgPauseR(rcvid, cookie.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalKill(nd.toInt(), pid, tid, signo, code, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalKillR(nd.toInt(), pid, tid, signo, code, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalKillSigval(nd.toInt(), pid, tid, signo, code, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalKillSigvalR(nd.toInt(), pid, tid, signo, code, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalReturn(info: MutPtr<SighandlerInfo>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalReturn(info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalFault(sigcode: CUint, regs: MutPtr<CVoid>, refaddr: ULong): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalFault(sigcode.toInt(), regs.rawAddress.toString(), refaddr.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalAction(pid, 0L.toString(), signo, act.rawAddress.toString(), oact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalActionR(pid, 0L.toString(), signo, act.rawAddress.toString(), oact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalProcmask(pid, tid, how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalProcmaskR(pid, tid, how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalSuspend(set: ConstPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalSuspend(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalSuspendR(set: ConstPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalSuspendR(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalWaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalWaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalWaitinfoR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalWaitinfoR(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalWaitinfoMask(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalWaitinfoMask(set.rawAddress.toString(), info.rawAddress.toString(), mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalWaitinfoMaskR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSignalWaitinfoMaskR(set.rawAddress.toString(), info.rawAddress.toString(), mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadCreate(pid, 0L.toString(), arg.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadCreateR(pid, 0L.toString(), arg.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadDestroy(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadDestroy(tid, priority, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadDestroyR(tid, priority, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadDetach(tid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadDetach(tid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadDetachR(tid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadDetachR(tid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadJoin(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadJoin(tid, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadJoinR(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadJoinR(tid, status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadCancel(tid, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadCancelR(tid, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCtl(cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadCtl(cmd, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCtlR(cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadCtlR(cmd, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadCtlExt(pid, tid, cmd, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoThreadCtlExtR(pid, tid, cmd, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptHookTrace(0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptHookIdle(0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptHookIdle2(0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptHookOverdriveEvent(event: ConstPtr<Sigevent>, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptHookOverdriveEvent(event.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachEvent(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptAttachEvent(intr, event.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachEventR(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptAttachEventR(intr, event.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptAttach(intr, 0L.toString(), area.rawAddress.toString(), size, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptAttachR(intr, 0L.toString(), area.rawAddress.toString(), size, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptAttachArray(intr, 0L.toString(), area.rawAddress.toString(), size, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptAttachArrayR(intr, 0L.toString(), area.rawAddress.toString(), size, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptDetach(id: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptDetach(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptDetachR(id: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptDetachR(id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptWait(flags: CInt, timeout: ConstPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptWait(flags, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptWaitR(flags: CInt, timeout: ConstPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptWaitR(flags, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptCharacteristic(type, id, new.rawAddress.toString(), old.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptCharacteristicR(type, id, new.rawAddress.toString(), old.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGet(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedGet(pid, tid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetR(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedGetR(pid, tid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetCpuNum(): CUint =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedGetCpuNum() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedSet(pid, tid, algorithm, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedSetR(pid, tid, algorithm, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedInfo(pid, algorithm, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedInfoR(pid, algorithm, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYieldR(): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedYieldR() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCtl(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedCtl(cmd, data.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCtlR(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedCtlR(cmd, data.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedJobCreate(job: MutPtr<NtoJobT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedJobCreate(job.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedJobCreateR(job: MutPtr<NtoJobT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedJobCreateR(job.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedJobDestroy(job: MutPtr<NtoJobT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedJobDestroy(job.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedJobDestroyR(job: MutPtr<NtoJobT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedJobDestroyR(job.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedWaypoint(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedWaypoint(job.rawAddress.toString(), new.rawAddress.toString(), max.rawAddress.toString(), old.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedWaypointR(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSchedWaypointR(job.rawAddress.toString(), new.rawAddress.toString(), max.rawAddress.toString(), old.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(id: ClockidT, notify: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerCreate(id, notify.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreateR(id: ClockidT, notify: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerCreateR(id, notify.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDestroy(id: TimerT): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerDestroy(id.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDestroyR(id: TimerT): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerDestroyR(id.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerSettime(id.toLong().toString(), flags, itime.rawAddress.toString(), oitime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerSettimeR(id.toLong().toString(), flags, itime.rawAddress.toString(), oitime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerInfo(pid, id.toLong().toString(), flags, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerInfoR(pid, id.toLong().toString(), flags, info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerAlarm(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerAlarm(id, itime.rawAddress.toString(), otime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerAlarmR(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerAlarmR(id, itime.rawAddress.toString(), otime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerTimeout(id, flags, notify.rawAddress.toString(), ntime.rawAddress.toString(), otime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoTimerTimeoutR(id, flags, notify.rawAddress.toString(), ntime.rawAddress.toString(), otime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncTypeCreate(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncTypeCreate(type.toInt(), sync.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncTypeCreateR(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncTypeCreateR(type.toInt(), sync.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncDestroy(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncDestroy(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncDestroyR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncDestroyR(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCtl(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncCtl(cmd, sync.rawAddress.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCtlR(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncCtlR(cmd, sync.rawAddress.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexEvent(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncMutexEvent(sync.rawAddress.toString(), event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexEventR(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncMutexEventR(sync.rawAddress.toString(), event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexLock(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncMutexLock(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexLockR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncMutexLockR(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexUnlock(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncMutexUnlock(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexUnlockR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncMutexUnlockR(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexRevive(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncMutexRevive(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexReviveR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncMutexReviveR(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCondvarWait(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncCondvarWait(sync.rawAddress.toString(), mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCondvarWaitR(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncCondvarWaitR(sync.rawAddress.toString(), mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCondvarSignal(sync: MutPtr<SyncT>, all: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncCondvarSignal(sync.rawAddress.toString(), all) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCondvarSignalR(sync: MutPtr<SyncT>, all: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncCondvarSignalR(sync.rawAddress.toString(), all) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncSemPost(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncSemPost(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncSemPostR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncSemPostR(sync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncSemWait(sync: MutPtr<SyncT>, tryto: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncSemWait(sync.rawAddress.toString(), tryto) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncSemWaitR(sync: MutPtr<SyncT>, tryto: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoSyncSemWaitR(sync.rawAddress.toString(), tryto) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockTime(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoClockTime(id, new.rawAddress.toString(), old.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockTimeR(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoClockTimeR(id, new.rawAddress.toString(), old.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjust(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoClockAdjust(id, new.rawAddress.toString(), old.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjustR(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoClockAdjustR(id, new.rawAddress.toString(), old.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockPeriod(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoClockPeriod(id, new.rawAddress.toString(), old.rawAddress.toString(), reserved) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockPeriodR(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoClockPeriodR(id, new.rawAddress.toString(), old.rawAddress.toString(), reserved) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoClockId(pid, tid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoClockIdR(pid, tid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptMask(intr, id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    if (unixNtoNeutrinoNapiAddon != null) (unixNtoNeutrinoNapiAddon.libcUnixNtoNeutrinoInterruptUnmask(intr, id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
