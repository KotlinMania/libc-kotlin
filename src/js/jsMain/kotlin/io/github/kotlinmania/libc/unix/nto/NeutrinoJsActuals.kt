@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT

private val _unixNtoNeutrinoNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun channelCreate(flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_channelCreate(flags.toInt()) as Int) else 0

public actual fun channelCreateR(flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_channelCreateR(flags.toInt()) as Int) else 0

public actual fun channelCreatePulsePool(flags: CUint, config: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_channelCreatePulsePool(flags.toInt(), (config?.value ?: 0L).toString()) as Int) else 0

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: COpaquePointer?, cred: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_channelCreateExt(flags.toInt(), mode.toInt(), bufsize.toString(), maxnumbuf.toInt(), (ev?.value ?: 0L).toString(), (cred?.value ?: 0L).toString()) as Int) else 0

public actual fun channelDestroy(chid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_channelDestroy(chid) as Int) else 0

public actual fun channelDestroyR(chid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_channelDestroyR(chid) as Int) else 0

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectAttach(nd.toInt(), pid, chid, index.toInt(), flags) as Int) else 0

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectAttachR(nd.toInt(), pid, chid, index.toInt(), flags) as Int) else 0

public actual fun connectDetach(coid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectDetach(coid) as Int) else 0

public actual fun connectDetachR(coid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectDetachR(coid) as Int) else 0

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectServerInfo(pid, coid, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectServerInfoR(pid, coid, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectClientInfoExtraArgs(scoid, (infoPp?.value ?: 0L).toString(), ngroups, (abilities?.value ?: 0L).toString(), nable, (typeId?.value ?: 0L).toString()) as Int) else 0

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: COpaquePointer?, ngroups: CInt, abilities: COpaquePointer?, nable: CInt, typeId: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectClientInfoExtraArgsR(scoid, (infoPp?.value ?: 0L).toString(), ngroups, (abilities?.value ?: 0L).toString(), nable, (typeId?.value ?: 0L).toString()) as Int) else 0

public actual fun connectClientInfo(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectClientInfo(scoid, (info?.value ?: 0L).toString(), ngroups) as Int) else 0

public actual fun connectClientInfoR(scoid: CInt, info: COpaquePointer?, ngroups: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectClientInfoR(scoid, (info?.value ?: 0L).toString(), ngroups) as Int) else 0

public actual fun connectClientInfoExt(scoid: CInt, infoPp: COpaquePointer?, flags: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectClientInfoExt(scoid, (infoPp?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun clientInfoExtFree(infoPp: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_clientInfoExtFree((infoPp?.value ?: 0L).toString()) as Int) else 0

public actual fun connectClientInfoAble(scoid: CInt, infoPp: COpaquePointer?, flags: CInt, abilities: COpaquePointer?, nable: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectClientInfoAble(scoid, (infoPp?.value ?: 0L).toString(), flags, (abilities?.value ?: 0L).toString(), nable) as Int) else 0

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectFlags(pid, coid, mask.toInt(), bits.toInt()) as Int) else 0

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_connectFlagsR(pid, coid, mask.toInt(), bits.toInt()) as Int) else 0

public actual fun channelConnectAttr(id: CUint, oldAttr: COpaquePointer?, newAttr: COpaquePointer?, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_channelConnectAttr(id.toInt(), (oldAttr?.value ?: 0L).toString(), (newAttr?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun msgSend(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSend(coid, (smsg?.value ?: 0L).toString(), sbytes.toString(), (rmsg?.value ?: 0L).toString(), rbytes.toString()) as String).toLong() else 0L

public actual fun msgSendR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendR(coid, (smsg?.value ?: 0L).toString(), sbytes.toString(), (rmsg?.value ?: 0L).toString(), rbytes.toString()) as String).toLong() else 0L

public actual fun msgSendnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendnc(coid, (smsg?.value ?: 0L).toString(), sbytes.toString(), (rmsg?.value ?: 0L).toString(), rbytes.toString()) as String).toLong() else 0L

public actual fun msgSendncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendncR(coid, (smsg?.value ?: 0L).toString(), sbytes.toString(), (rmsg?.value ?: 0L).toString(), rbytes.toString()) as String).toLong() else 0L

public actual fun msgSendsv(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendsv(coid, (smsg?.value ?: 0L).toString(), sbytes.toString(), (riov?.value ?: 0L).toString(), rparts.toString()) as String).toLong() else 0L

public actual fun msgSendsvR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendsvR(coid, (smsg?.value ?: 0L).toString(), sbytes.toString(), (riov?.value ?: 0L).toString(), rparts.toString()) as String).toLong() else 0L

public actual fun msgSendsvnc(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendsvnc(coid, (smsg?.value ?: 0L).toString(), sbytes.toString(), (riov?.value ?: 0L).toString(), rparts.toString()) as String).toLong() else 0L

public actual fun msgSendsvncR(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendsvncR(coid, (smsg?.value ?: 0L).toString(), sbytes.toString(), (riov?.value ?: 0L).toString(), rparts.toString()) as String).toLong() else 0L

public actual fun msgSendvs(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendvs(coid, (siov?.value ?: 0L).toString(), sparts.toString(), (rmsg?.value ?: 0L).toString(), rbytes.toString()) as String).toLong() else 0L

public actual fun msgSendvsR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendvsR(coid, (siov?.value ?: 0L).toString(), sparts.toString(), (rmsg?.value ?: 0L).toString(), rbytes.toString()) as String).toLong() else 0L

public actual fun msgSendvsnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendvsnc(coid, (siov?.value ?: 0L).toString(), sparts.toString(), (rmsg?.value ?: 0L).toString(), rbytes.toString()) as String).toLong() else 0L

public actual fun msgSendvsncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, rmsg: COpaquePointer?, rbytes: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendvsncR(coid, (siov?.value ?: 0L).toString(), sparts.toString(), (rmsg?.value ?: 0L).toString(), rbytes.toString()) as String).toLong() else 0L

public actual fun msgSendv(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendv(coid, (siov?.value ?: 0L).toString(), sparts.toString(), (riov?.value ?: 0L).toString(), rparts.toString()) as String).toLong() else 0L

public actual fun msgSendvR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendvR(coid, (siov?.value ?: 0L).toString(), sparts.toString(), (riov?.value ?: 0L).toString(), rparts.toString()) as String).toLong() else 0L

public actual fun msgSendvnc(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendvnc(coid, (siov?.value ?: 0L).toString(), sparts.toString(), (riov?.value ?: 0L).toString(), rparts.toString()) as String).toLong() else 0L

public actual fun msgSendvncR(coid: CInt, siov: COpaquePointer?, sparts: ULong, riov: COpaquePointer?, rparts: ULong): CLong =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendvncR(coid, (siov?.value ?: 0L).toString(), sparts.toString(), (riov?.value ?: 0L).toString(), rparts.toString()) as String).toLong() else 0L

public actual fun msgReceive(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceive(chid, (msg?.value ?: 0L).toString(), bytes.toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgReceiveR(chid: CInt, msg: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceiveR(chid, (msg?.value ?: 0L).toString(), bytes.toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgReceivev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceivev(chid, (iov?.value ?: 0L).toString(), parts.toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgReceivevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceivevR(chid, (iov?.value ?: 0L).toString(), parts.toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgReceivePulse(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceivePulse(chid, (pulse?.value ?: 0L).toString(), bytes.toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgReceivePulseR(chid: CInt, pulse: COpaquePointer?, bytes: ULong, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceivePulseR(chid, (pulse?.value ?: 0L).toString(), bytes.toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgReceivePulsev(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceivePulsev(chid, (iov?.value ?: 0L).toString(), parts.toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgReceivePulsevR(chid: CInt, iov: COpaquePointer?, parts: ULong, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceivePulsevR(chid, (iov?.value ?: 0L).toString(), parts.toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgReply(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReply(rcvid, status.toString(), (msg?.value ?: 0L).toString(), bytes.toString()) as Int) else 0

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: COpaquePointer?, bytes: ULong): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReplyR(rcvid, status.toString(), (msg?.value ?: 0L).toString(), bytes.toString()) as Int) else 0

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReplyv(rcvid, status.toString(), (iov?.value ?: 0L).toString(), parts.toString()) as Int) else 0

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: COpaquePointer?, parts: ULong): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReplyvR(rcvid, status.toString(), (iov?.value ?: 0L).toString(), parts.toString()) as Int) else 0

public actual fun msgReadiov(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReadiov(rcvid, (iov?.value ?: 0L).toString(), parts.toString(), offset.toString(), flags) as String).toLong() else 0L

public actual fun msgReadiovR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong, flags: CInt): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReadiovR(rcvid, (iov?.value ?: 0L).toString(), parts.toString(), offset.toString(), flags) as String).toLong() else 0L

public actual fun msgRead(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgRead(rcvid, (msg?.value ?: 0L).toString(), bytes.toString(), offset.toString()) as String).toLong() else 0L

public actual fun msgReadR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReadR(rcvid, (msg?.value ?: 0L).toString(), bytes.toString(), offset.toString()) as String).toLong() else 0L

public actual fun msgReadv(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReadv(rcvid, (iov?.value ?: 0L).toString(), parts.toString(), offset.toString()) as String).toLong() else 0L

public actual fun msgReadvR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReadvR(rcvid, (iov?.value ?: 0L).toString(), parts.toString(), offset.toString()) as String).toLong() else 0L

public actual fun msgWrite(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgWrite(rcvid, (msg?.value ?: 0L).toString(), bytes.toString(), offset.toString()) as String).toLong() else 0L

public actual fun msgWriteR(rcvid: CInt, msg: COpaquePointer?, bytes: ULong, offset: ULong): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgWriteR(rcvid, (msg?.value ?: 0L).toString(), bytes.toString(), offset.toString()) as String).toLong() else 0L

public actual fun msgWritev(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgWritev(rcvid, (iov?.value ?: 0L).toString(), parts.toString(), offset.toString()) as String).toLong() else 0L

public actual fun msgWritevR(rcvid: CInt, iov: COpaquePointer?, parts: ULong, offset: ULong): Long =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgWritevR(rcvid, (iov?.value ?: 0L).toString(), parts.toString(), offset.toString()) as String).toLong() else 0L

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendPulse(coid, priority, code, value) as Int) else 0

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendPulseR(coid, priority, code, value) as Int) else 0

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendPulsePtr(coid, priority, code, (value?.value ?: 0L).toString()) as Int) else 0

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendPulsePtrR(coid, priority, code, (value?.value ?: 0L).toString()) as Int) else 0

public actual fun msgDeliverEvent(rcvid: CInt, event: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgDeliverEvent(rcvid, (event?.value ?: 0L).toString()) as Int) else 0

public actual fun msgDeliverEventR(rcvid: CInt, event: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgDeliverEventR(rcvid, (event?.value ?: 0L).toString()) as Int) else 0

public actual fun msgVerifyEvent(rcvid: CInt, event: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgVerifyEvent(rcvid, (event?.value ?: 0L).toString()) as Int) else 0

public actual fun msgVerifyEventR(rcvid: CInt, event: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgVerifyEventR(rcvid, (event?.value ?: 0L).toString()) as Int) else 0

public actual fun msgRegisterEvent(event: COpaquePointer?, coid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgRegisterEvent((event?.value ?: 0L).toString(), coid) as Int) else 0

public actual fun msgRegisterEventR(event: COpaquePointer?, coid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgRegisterEventR((event?.value ?: 0L).toString(), coid) as Int) else 0

public actual fun msgUnregisterEvent(event: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgUnregisterEvent((event?.value ?: 0L).toString()) as Int) else 0

public actual fun msgUnregisterEventR(event: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgUnregisterEventR((event?.value ?: 0L).toString()) as Int) else 0

public actual fun msgInfo(rcvid: CInt, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgInfo(rcvid, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgInfoR(rcvid: CInt, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgInfoR(rcvid, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgKeyData(rcvid, oper, key.toInt(), (newkey?.value ?: 0L).toString(), (iov?.value ?: 0L).toString(), parts) as Int) else 0

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: COpaquePointer?, iov: COpaquePointer?, parts: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgKeyDataR(rcvid, oper, key.toInt(), (newkey?.value ?: 0L).toString(), (iov?.value ?: 0L).toString(), parts) as Int) else 0

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgError(rcvid, err) as Int) else 0

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgErrorR(rcvid, err) as Int) else 0

public actual fun msgCurrent(rcvid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgCurrent(rcvid) as Int) else 0

public actual fun msgCurrentR(rcvid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgCurrentR(rcvid) as Int) else 0

public actual fun msgSendAsyncGbl(coid: CInt, smsg: COpaquePointer?, sbytes: ULong, msgPrio: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendAsyncGbl(coid, (smsg?.value ?: 0L).toString(), sbytes.toString(), msgPrio.toInt()) as Int) else 0

public actual fun msgSendAsync(coid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgSendAsync(coid) as Int) else 0

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: COpaquePointer?, rbytes: ULong, info: COpaquePointer?, coid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceiveAsyncGbl(chid, (rmsg?.value ?: 0L).toString(), rbytes.toString(), (info?.value ?: 0L).toString(), coid) as Int) else 0

public actual fun msgReceiveAsync(chid: CInt, iov: COpaquePointer?, parts: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgReceiveAsync(chid, (iov?.value ?: 0L).toString(), parts.toInt()) as Int) else 0

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgPause(rcvid, cookie.toInt()) as Int) else 0

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_msgPauseR(rcvid, cookie.toInt()) as Int) else 0

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalKill(nd.toInt(), pid, tid, signo, code, value) as Int) else 0

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalKillR(nd.toInt(), pid, tid, signo, code, value) as Int) else 0

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalKillSigval(nd.toInt(), pid, tid, signo, code, (value?.value ?: 0L).toString()) as Int) else 0

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalKillSigvalR(nd.toInt(), pid, tid, signo, code, (value?.value ?: 0L).toString()) as Int) else 0

public actual fun signalReturn(info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalReturn((info?.value ?: 0L).toString()) as Int) else 0

public actual fun signalFault(sigcode: CUint, regs: COpaquePointer?, refaddr: ULong): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalFault(sigcode.toInt(), (regs?.value ?: 0L).toString(), refaddr.toString()) as Int) else 0

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalAction(pid, 0L.toString(), signo, (act?.value ?: 0L).toString(), (oact?.value ?: 0L).toString()) as Int) else 0

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalActionR(pid, 0L.toString(), signo, (act?.value ?: 0L).toString(), (oact?.value ?: 0L).toString()) as Int) else 0

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalProcmask(pid, tid, how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalProcmaskR(pid, tid, how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun signalSuspend(set: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalSuspend((set?.value ?: 0L).toString()) as Int) else 0

public actual fun signalSuspendR(set: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalSuspendR((set?.value ?: 0L).toString()) as Int) else 0

public actual fun signalWaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalWaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun signalWaitinfoR(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalWaitinfoR((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun signalWaitinfoMask(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalWaitinfoMask((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (mask?.value ?: 0L).toString()) as Int) else 0

public actual fun signalWaitinfoMaskR(set: COpaquePointer?, info: COpaquePointer?, mask: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_signalWaitinfoMaskR((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (mask?.value ?: 0L).toString()) as Int) else 0

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadCreate(pid, 0L.toString(), (arg?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadCreateR(pid, 0L.toString(), (arg?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun threadDestroy(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadDestroy(tid, priority, (status?.value ?: 0L).toString()) as Int) else 0

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadDestroyR(tid, priority, (status?.value ?: 0L).toString()) as Int) else 0

public actual fun threadDetach(tid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadDetach(tid) as Int) else 0

public actual fun threadDetachR(tid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadDetachR(tid) as Int) else 0

public actual fun threadJoin(tid: CInt, status: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadJoin(tid, (status?.value ?: 0L).toString()) as Int) else 0

public actual fun threadJoinR(tid: CInt, status: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadJoinR(tid, (status?.value ?: 0L).toString()) as Int) else 0

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadCancel(tid, 0L.toString()) as Int) else 0

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadCancelR(tid, 0L.toString()) as Int) else 0

public actual fun threadCtl(cmd: CInt, data: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadCtl(cmd, (data?.value ?: 0L).toString()) as Int) else 0

public actual fun threadCtlR(cmd: CInt, data: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadCtlR(cmd, (data?.value ?: 0L).toString()) as Int) else 0

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadCtlExt(pid, tid, cmd, (data?.value ?: 0L).toString()) as Int) else 0

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_threadCtlExtR(pid, tid, cmd, (data?.value ?: 0L).toString()) as Int) else 0

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptHookTrace(0L.toString(), flags.toInt()) as Int) else 0

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptHookIdle(0L.toString(), flags.toInt()) as Int) else 0

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptHookIdle2(0L.toString(), flags.toInt()) as Int) else 0

public actual fun interruptHookOverdriveEvent(event: COpaquePointer?, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptHookOverdriveEvent((event?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun interruptAttachEvent(intr: CInt, event: COpaquePointer?, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptAttachEvent(intr, (event?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun interruptAttachEventR(intr: CInt, event: COpaquePointer?, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptAttachEventR(intr, (event?.value ?: 0L).toString(), flags.toInt()) as Int) else 0

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptAttach(intr, 0L.toString(), (area?.value ?: 0L).toString(), size, flags.toInt()) as Int) else 0

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptAttachR(intr, 0L.toString(), (area?.value ?: 0L).toString(), size, flags.toInt()) as Int) else 0

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptAttachArray(intr, 0L.toString(), (area?.value ?: 0L).toString(), size, flags.toInt()) as Int) else 0

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: COpaquePointer?, size: CInt, flags: CUint): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptAttachArrayR(intr, 0L.toString(), (area?.value ?: 0L).toString(), size, flags.toInt()) as Int) else 0

public actual fun interruptDetach(id: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptDetach(id) as Int) else 0

public actual fun interruptDetachR(id: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptDetachR(id) as Int) else 0

public actual fun interruptWait(flags: CInt, timeout: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptWait(flags, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun interruptWaitR(flags: CInt, timeout: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptWaitR(flags, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptCharacteristic(type, id, (new?.value ?: 0L).toString(), (old?.value ?: 0L).toString()) as Int) else 0

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: COpaquePointer?, old: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptCharacteristicR(type, id, (new?.value ?: 0L).toString(), (old?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGet(pid: PidT, tid: CInt, param: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedGet(pid, tid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetR(pid: PidT, tid: CInt, param: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedGetR(pid, tid, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedGetCpuNum(): CUint =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedGetCpuNum() as Int).toUInt() else 0u

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedSet(pid, tid, algorithm, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedSetR(pid, tid, algorithm, (param?.value ?: 0L).toString()) as Int) else 0

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedInfo(pid, algorithm, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedInfoR(pid, algorithm, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun schedYield(): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedYield() as Int) else 0

public actual fun schedYieldR(): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedYieldR() as Int) else 0

public actual fun schedCtl(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedCtl(cmd, (data?.value ?: 0L).toString(), length.toString()) as Int) else 0

public actual fun schedCtlR(cmd: CInt, data: COpaquePointer?, length: ULong): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedCtlR(cmd, (data?.value ?: 0L).toString(), length.toString()) as Int) else 0

public actual fun schedJobCreate(job: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedJobCreate((job?.value ?: 0L).toString()) as Int) else 0

public actual fun schedJobCreateR(job: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedJobCreateR((job?.value ?: 0L).toString()) as Int) else 0

public actual fun schedJobDestroy(job: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedJobDestroy((job?.value ?: 0L).toString()) as Int) else 0

public actual fun schedJobDestroyR(job: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedJobDestroyR((job?.value ?: 0L).toString()) as Int) else 0

public actual fun schedWaypoint(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedWaypoint((job?.value ?: 0L).toString(), (new?.value ?: 0L).toString(), (max?.value ?: 0L).toString(), (old?.value ?: 0L).toString()) as Int) else 0

public actual fun schedWaypointR(job: COpaquePointer?, new: COpaquePointer?, max: COpaquePointer?, old: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_schedWaypointR((job?.value ?: 0L).toString(), (new?.value ?: 0L).toString(), (max?.value ?: 0L).toString(), (old?.value ?: 0L).toString()) as Int) else 0

public actual fun timerCreate(id: ClockidT, notify: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerCreate(id, (notify?.value ?: 0L).toString()) as Int) else 0

public actual fun timerCreateR(id: ClockidT, notify: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerCreateR(id, (notify?.value ?: 0L).toString()) as Int) else 0

public actual fun timerDestroy(id: TimerT): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerDestroy(id.toLong().toString()) as Int) else 0

public actual fun timerDestroyR(id: TimerT): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerDestroyR(id.toLong().toString()) as Int) else 0

public actual fun timerSettime(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerSettime(id.toLong().toString(), flags, (itime?.value ?: 0L).toString(), (oitime?.value ?: 0L).toString()) as Int) else 0

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: COpaquePointer?, oitime: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerSettimeR(id.toLong().toString(), flags, (itime?.value ?: 0L).toString(), (oitime?.value ?: 0L).toString()) as Int) else 0

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerInfo(pid, id.toLong().toString(), flags, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerInfoR(pid, id.toLong().toString(), flags, (info?.value ?: 0L).toString()) as Int) else 0

public actual fun timerAlarm(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerAlarm(id, (itime?.value ?: 0L).toString(), (otime?.value ?: 0L).toString()) as Int) else 0

public actual fun timerAlarmR(id: ClockidT, itime: COpaquePointer?, otime: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerAlarmR(id, (itime?.value ?: 0L).toString(), (otime?.value ?: 0L).toString()) as Int) else 0

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerTimeout(id, flags, (notify?.value ?: 0L).toString(), (ntime?.value ?: 0L).toString(), (otime?.value ?: 0L).toString()) as Int) else 0

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: COpaquePointer?, ntime: COpaquePointer?, otime: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_timerTimeoutR(id, flags, (notify?.value ?: 0L).toString(), (ntime?.value ?: 0L).toString(), (otime?.value ?: 0L).toString()) as Int) else 0

public actual fun syncTypeCreate(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncTypeCreate(type.toInt(), (sync?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun syncTypeCreateR(type: CUint, sync: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncTypeCreateR(type.toInt(), (sync?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun syncDestroy(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncDestroy((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncDestroyR(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncDestroyR((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncCtl(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncCtl(cmd, (sync?.value ?: 0L).toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun syncCtlR(cmd: CInt, sync: COpaquePointer?, data: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncCtlR(cmd, (sync?.value ?: 0L).toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun syncMutexEvent(sync: COpaquePointer?, event: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncMutexEvent((sync?.value ?: 0L).toString(), (event?.value ?: 0L).toString()) as Int) else 0

public actual fun syncMutexEventR(sync: COpaquePointer?, event: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncMutexEventR((sync?.value ?: 0L).toString(), (event?.value ?: 0L).toString()) as Int) else 0

public actual fun syncMutexLock(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncMutexLock((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncMutexLockR(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncMutexLockR((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncMutexUnlock(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncMutexUnlock((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncMutexUnlockR(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncMutexUnlockR((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncMutexRevive(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncMutexRevive((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncMutexReviveR(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncMutexReviveR((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncCondvarWait(sync: COpaquePointer?, mutex: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncCondvarWait((sync?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString()) as Int) else 0

public actual fun syncCondvarWaitR(sync: COpaquePointer?, mutex: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncCondvarWaitR((sync?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString()) as Int) else 0

public actual fun syncCondvarSignal(sync: COpaquePointer?, all: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncCondvarSignal((sync?.value ?: 0L).toString(), all) as Int) else 0

public actual fun syncCondvarSignalR(sync: COpaquePointer?, all: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncCondvarSignalR((sync?.value ?: 0L).toString(), all) as Int) else 0

public actual fun syncSemPost(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncSemPost((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncSemPostR(sync: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncSemPostR((sync?.value ?: 0L).toString()) as Int) else 0

public actual fun syncSemWait(sync: COpaquePointer?, tryto: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncSemWait((sync?.value ?: 0L).toString(), tryto) as Int) else 0

public actual fun syncSemWaitR(sync: COpaquePointer?, tryto: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_syncSemWaitR((sync?.value ?: 0L).toString(), tryto) as Int) else 0

public actual fun clockTime(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_clockTime(id, (new?.value ?: 0L).toString(), (old?.value ?: 0L).toString()) as Int) else 0

public actual fun clockTimeR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_clockTimeR(id, (new?.value ?: 0L).toString(), (old?.value ?: 0L).toString()) as Int) else 0

public actual fun clockAdjust(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_clockAdjust(id, (new?.value ?: 0L).toString(), (old?.value ?: 0L).toString()) as Int) else 0

public actual fun clockAdjustR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_clockAdjustR(id, (new?.value ?: 0L).toString(), (old?.value ?: 0L).toString()) as Int) else 0

public actual fun clockPeriod(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_clockPeriod(id, (new?.value ?: 0L).toString(), (old?.value ?: 0L).toString(), reserved) as Int) else 0

public actual fun clockPeriodR(id: ClockidT, new: COpaquePointer?, old: COpaquePointer?, reserved: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_clockPeriodR(id, (new?.value ?: 0L).toString(), (old?.value ?: 0L).toString(), reserved) as Int) else 0

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_clockId(pid, tid) as Int) else 0

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_clockIdR(pid, tid) as Int) else 0

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptMask(intr, id) as Int) else 0

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    if (_unixNtoNeutrinoNapiAddon != null) (_unixNtoNeutrinoNapiAddon.libc_unix_nto_neutrino_interruptUnmask(intr, id) as Int) else 0
