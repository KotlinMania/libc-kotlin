@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixNtoNeutrinoNapiAddon(): Boolean

private val unixNtoNeutrinoNapiAvailable: Boolean = initUnixNtoNeutrinoNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoChannelCreate(p0)")
private external fun wasmLibcUnixNtoNeutrinoChannelCreate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoChannelCreateR(p0)")
private external fun wasmLibcUnixNtoNeutrinoChannelCreateR(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoChannelCreatePulsePool(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoChannelCreatePulsePool(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoChannelCreateExt(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoNeutrinoChannelCreateExt(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoChannelDestroy(p0)")
private external fun wasmLibcUnixNtoNeutrinoChannelDestroy(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoChannelDestroyR(p0)")
private external fun wasmLibcUnixNtoNeutrinoChannelDestroyR(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectAttach(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoConnectAttach(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectAttachR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoConnectAttachR(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectDetach(p0)")
private external fun wasmLibcUnixNtoNeutrinoConnectDetach(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectDetachR(p0)")
private external fun wasmLibcUnixNtoNeutrinoConnectDetachR(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectServerInfo(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoConnectServerInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectServerInfoR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoConnectServerInfoR(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectClientInfoExtraArgs(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoNeutrinoConnectClientInfoExtraArgs(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectClientInfoExtraArgsR(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoNeutrinoConnectClientInfoExtraArgsR(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectClientInfo(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoConnectClientInfo(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectClientInfoR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoConnectClientInfoR(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectClientInfoExt(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoConnectClientInfoExt(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoClientInfoExtFree(p0)")
private external fun wasmLibcUnixNtoNeutrinoClientInfoExtFree(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectClientInfoAble(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoConnectClientInfoAble(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectFlags(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoConnectFlags(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoConnectFlagsR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoConnectFlagsR(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoChannelConnectAttr(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoChannelConnectAttr(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSend(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSend(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendR(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendnc(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendnc(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendncR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendncR(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendsv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendsv(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendsvR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendsvR(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendsvnc(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendsvnc(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendsvncR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendsvncR(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendvs(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendvs(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendvsR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendvsR(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendvsnc(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendvsnc(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendvsncR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendvsncR(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendv(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendvR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendvR(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendvnc(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendvnc(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendvncR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendvncR(p0: Int, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceive(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceive(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceiveR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceiveR(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceivev(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceivev(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceivevR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceivevR(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceivePulse(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceivePulse(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceivePulseR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceivePulseR(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceivePulsev(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceivePulsev(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceivePulsevR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceivePulsevR(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReply(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReply(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReplyR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReplyR(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReplyv(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReplyv(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReplyvR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReplyvR(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReadiov(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgReadiov(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReadiovR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgReadiovR(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgRead(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgRead(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReadR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReadR(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReadv(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReadvR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgReadvR(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgWrite(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgWrite(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgWriteR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgWriteR(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgWritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgWritev(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgWritevR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgWritevR(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendPulse(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendPulse(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendPulseR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendPulseR(p0: Int, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendPulsePtr(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendPulsePtr(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendPulsePtrR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendPulsePtrR(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgDeliverEvent(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgDeliverEvent(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgDeliverEventR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgDeliverEventR(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgVerifyEvent(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgVerifyEvent(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgVerifyEventR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgVerifyEventR(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgRegisterEvent(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgRegisterEvent(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgRegisterEventR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgRegisterEventR(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgUnregisterEvent(p0)")
private external fun wasmLibcUnixNtoNeutrinoMsgUnregisterEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgUnregisterEventR(p0)")
private external fun wasmLibcUnixNtoNeutrinoMsgUnregisterEventR(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgInfo(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgInfoR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgInfoR(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgKeyData(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoNeutrinoMsgKeyData(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgKeyDataR(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoNeutrinoMsgKeyDataR(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgError(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgError(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgErrorR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgErrorR(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgCurrent(p0)")
private external fun wasmLibcUnixNtoNeutrinoMsgCurrent(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgCurrentR(p0)")
private external fun wasmLibcUnixNtoNeutrinoMsgCurrentR(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendAsyncGbl(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendAsyncGbl(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgSendAsync(p0)")
private external fun wasmLibcUnixNtoNeutrinoMsgSendAsync(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceiveAsyncGbl(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceiveAsyncGbl(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgReceiveAsync(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoMsgReceiveAsync(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgPause(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgPause(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoMsgPauseR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoMsgPauseR(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalKill(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoNeutrinoSignalKill(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalKillR(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoNeutrinoSignalKillR(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalKillSigval(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoNeutrinoSignalKillSigval(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalKillSigvalR(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoNeutrinoSignalKillSigvalR(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalReturn(p0)")
private external fun wasmLibcUnixNtoNeutrinoSignalReturn(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalFault(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSignalFault(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalAction(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoSignalAction(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalActionR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoSignalActionR(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalProcmask(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoSignalProcmask(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalProcmaskR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoSignalProcmaskR(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalSuspend(p0)")
private external fun wasmLibcUnixNtoNeutrinoSignalSuspend(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalSuspendR(p0)")
private external fun wasmLibcUnixNtoNeutrinoSignalSuspendR(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalWaitinfo(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSignalWaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalWaitinfoR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSignalWaitinfoR(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalWaitinfoMask(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSignalWaitinfoMask(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSignalWaitinfoMaskR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSignalWaitinfoMaskR(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoThreadCreate(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadCreateR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoThreadCreateR(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadDestroy(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoThreadDestroy(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadDestroyR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoThreadDestroyR(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadDetach(p0)")
private external fun wasmLibcUnixNtoNeutrinoThreadDetach(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadDetachR(p0)")
private external fun wasmLibcUnixNtoNeutrinoThreadDetachR(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadJoin(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoThreadJoin(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadJoinR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoThreadJoinR(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadCancel(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoThreadCancel(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadCancelR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoThreadCancelR(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadCtl(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoThreadCtl(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadCtlR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoThreadCtlR(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadCtlExt(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoThreadCtlExt(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoThreadCtlExtR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoThreadCtlExtR(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptHookTrace(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoInterruptHookTrace(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptHookIdle(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoInterruptHookIdle(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptHookIdle2(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoInterruptHookIdle2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptHookOverdriveEvent(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoInterruptHookOverdriveEvent(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptAttachEvent(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoInterruptAttachEvent(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptAttachEventR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoInterruptAttachEventR(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptAttach(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoInterruptAttach(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptAttachR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoInterruptAttachR(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptAttachArray(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoInterruptAttachArray(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptAttachArrayR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoInterruptAttachArrayR(p0: Int, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptDetach(p0)")
private external fun wasmLibcUnixNtoNeutrinoInterruptDetach(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptDetachR(p0)")
private external fun wasmLibcUnixNtoNeutrinoInterruptDetachR(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptWait(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoInterruptWait(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptWaitR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoInterruptWaitR(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptCharacteristic(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoInterruptCharacteristic(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptCharacteristicR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoInterruptCharacteristicR(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedGet(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSchedGet(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedGetR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSchedGetR(p0: Int, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedGetCpuNum()")
private external fun wasmLibcUnixNtoNeutrinoSchedGetCpuNum(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedSet(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoSchedSet(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedSetR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoSchedSetR(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedInfo(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSchedInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedInfoR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSchedInfoR(p0: Int, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedYield()")
private external fun wasmLibcUnixNtoNeutrinoSchedYield(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedYieldR()")
private external fun wasmLibcUnixNtoNeutrinoSchedYieldR(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedCtl(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSchedCtl(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedCtlR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSchedCtlR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedJobCreate(p0)")
private external fun wasmLibcUnixNtoNeutrinoSchedJobCreate(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedJobCreateR(p0)")
private external fun wasmLibcUnixNtoNeutrinoSchedJobCreateR(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedJobDestroy(p0)")
private external fun wasmLibcUnixNtoNeutrinoSchedJobDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedJobDestroyR(p0)")
private external fun wasmLibcUnixNtoNeutrinoSchedJobDestroyR(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedWaypoint(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoSchedWaypoint(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSchedWaypointR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoSchedWaypointR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerCreate(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoTimerCreate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerCreateR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoTimerCreateR(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerDestroy(p0)")
private external fun wasmLibcUnixNtoNeutrinoTimerDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerDestroyR(p0)")
private external fun wasmLibcUnixNtoNeutrinoTimerDestroyR(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoTimerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerSettimeR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoTimerSettimeR(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoTimerInfo(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerInfoR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoTimerInfoR(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerAlarm(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoTimerAlarm(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerAlarmR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoTimerAlarmR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerTimeout(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoTimerTimeout(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoTimerTimeoutR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoNeutrinoTimerTimeoutR(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncTypeCreate(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSyncTypeCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncTypeCreateR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSyncTypeCreateR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncDestroy(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncDestroyR(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncDestroyR(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncCtl(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSyncCtl(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncCtlR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoSyncCtlR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncMutexEvent(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSyncMutexEvent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncMutexEventR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSyncMutexEventR(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncMutexLock(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncMutexLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncMutexLockR(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncMutexLockR(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncMutexUnlock(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncMutexUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncMutexUnlockR(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncMutexUnlockR(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncMutexRevive(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncMutexRevive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncMutexReviveR(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncMutexReviveR(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncCondvarWait(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSyncCondvarWait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncCondvarWaitR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSyncCondvarWaitR(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncCondvarSignal(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSyncCondvarSignal(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncCondvarSignalR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSyncCondvarSignalR(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncSemPost(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncSemPost(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncSemPostR(p0)")
private external fun wasmLibcUnixNtoNeutrinoSyncSemPostR(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncSemWait(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSyncSemWait(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoSyncSemWaitR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoSyncSemWaitR(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoClockTime(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoClockTime(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoClockTimeR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoClockTimeR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoClockAdjust(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoClockAdjust(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoClockAdjustR(p0, p1, p2)")
private external fun wasmLibcUnixNtoNeutrinoClockAdjustR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoClockPeriod(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoClockPeriod(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoClockPeriodR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoNeutrinoClockPeriodR(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoClockId(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoClockId(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoClockIdR(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoClockIdR(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptMask(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoInterruptMask(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoNeutrinoInterruptUnmask(p0, p1)")
private external fun wasmLibcUnixNtoNeutrinoInterruptUnmask(p0: Int, p1: Int): Int

public actual fun channelCreate(flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoChannelCreate(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelCreateR(flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoChannelCreateR(flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelCreatePulsePool(flags: CUint, config: ConstPtr<NtoChannelConfig>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoChannelCreatePulsePool(flags.toInt(), config.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelCreateExt(flags: CUint, mode: ModeT, bufsize: ULong, maxnumbuf: CUint, ev: ConstPtr<Sigevent>, cred: MutPtr<CredInfo>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoChannelCreateExt(flags.toInt(), mode.toInt(), bufsize.toString(), maxnumbuf.toInt(), ev.rawAddress.toString(), cred.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelDestroy(chid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoChannelDestroy(chid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelDestroyR(chid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoChannelDestroyR(chid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectAttach(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectAttach(nd.toInt(), pid, chid, index.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectAttachR(nd: UInt, pid: PidT, chid: CInt, index: CUint, flags: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectAttachR(nd.toInt(), pid, chid, index.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectDetach(coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectDetach(coid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectDetachR(coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectDetachR(coid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectServerInfo(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectServerInfo(pid, coid, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectServerInfoR(pid: PidT, coid: CInt, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectServerInfoR(pid, coid, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoExtraArgs(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectClientInfoExtraArgs(scoid, infoPp.rawAddress.toString(), ngroups, abilities.rawAddress.toString(), nable, typeId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoExtraArgsR(scoid: CInt, infoPp: MutPtr<ClientInfo>, ngroups: CInt, abilities: MutPtr<ClientAble>, nable: CInt, typeId: MutPtr<CUint>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectClientInfoExtraArgsR(scoid, infoPp.rawAddress.toString(), ngroups, abilities.rawAddress.toString(), nable, typeId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfo(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectClientInfo(scoid, info.rawAddress.toString(), ngroups) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoR(scoid: CInt, info: MutPtr<ClientInfo>, ngroups: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectClientInfoR(scoid, info.rawAddress.toString(), ngroups) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoExt(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectClientInfoExt(scoid, infoPp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clientInfoExtFree(infoPp: MutPtr<MutPtr<ClientInfo>>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoClientInfoExtFree(infoPp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectClientInfoAble(scoid: CInt, infoPp: MutPtr<MutPtr<ClientInfo>>, flags: CInt, abilities: MutPtr<ClientAble>, nable: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectClientInfoAble(scoid, infoPp.rawAddress.toString(), flags, abilities.rawAddress.toString(), nable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectFlags(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectFlags(pid, coid, mask.toInt(), bits.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectFlagsR(pid: PidT, coid: CInt, mask: CUint, bits: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoConnectFlagsR(pid, coid, mask.toInt(), bits.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun channelConnectAttr(id: CUint, oldAttr: MutPtr<ChannelConnectAttr>, newAttr: MutPtr<ChannelConnectAttr>, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoChannelConnectAttr(id.toInt(), oldAttr.rawAddress.toString(), newAttr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSend(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSend(coid, smsg.rawAddress.toString(), sbytes.toString(), rmsg.rawAddress.toString(), rbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendR(coid, smsg.rawAddress.toString(), sbytes.toString(), rmsg.rawAddress.toString(), rbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendnc(coid, smsg.rawAddress.toString(), sbytes.toString(), rmsg.rawAddress.toString(), rbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendncR(coid, smsg.rawAddress.toString(), sbytes.toString(), rmsg.rawAddress.toString(), rbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendsv(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendsv(coid, smsg.rawAddress.toString(), sbytes.toString(), riov.rawAddress.toString(), rparts.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendsvR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendsvR(coid, smsg.rawAddress.toString(), sbytes.toString(), riov.rawAddress.toString(), rparts.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendsvnc(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendsvnc(coid, smsg.rawAddress.toString(), sbytes.toString(), riov.rawAddress.toString(), rparts.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendsvncR(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendsvncR(coid, smsg.rawAddress.toString(), sbytes.toString(), riov.rawAddress.toString(), rparts.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvs(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendvs(coid, siov.rawAddress.toString(), sparts.toString(), rmsg.rawAddress.toString(), rbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvsR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendvsR(coid, siov.rawAddress.toString(), sparts.toString(), rmsg.rawAddress.toString(), rbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvsnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendvsnc(coid, siov.rawAddress.toString(), sparts.toString(), rmsg.rawAddress.toString(), rbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvsncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, rmsg: MutPtr<CVoid>, rbytes: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendvsncR(coid, siov.rawAddress.toString(), sparts.toString(), rmsg.rawAddress.toString(), rbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendv(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendv(coid, siov.rawAddress.toString(), sparts.toString(), riov.rawAddress.toString(), rparts.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendvR(coid, siov.rawAddress.toString(), sparts.toString(), riov.rawAddress.toString(), rparts.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvnc(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendvnc(coid, siov.rawAddress.toString(), sparts.toString(), riov.rawAddress.toString(), rparts.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendvncR(coid: CInt, siov: ConstPtr<Iovec>, sparts: ULong, riov: ConstPtr<Iovec>, rparts: ULong): CLong =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendvncR(coid, siov.rawAddress.toString(), sparts.toString(), riov.rawAddress.toString(), rparts.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceive(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceive(chid, msg.rawAddress.toString(), bytes.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceiveR(chid: CInt, msg: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceiveR(chid, msg.rawAddress.toString(), bytes.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceivev(chid, iov.rawAddress.toString(), parts.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceivevR(chid, iov.rawAddress.toString(), parts.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivePulse(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceivePulse(chid, pulse.rawAddress.toString(), bytes.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivePulseR(chid: CInt, pulse: MutPtr<CVoid>, bytes: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceivePulseR(chid, pulse.rawAddress.toString(), bytes.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivePulsev(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceivePulsev(chid, iov.rawAddress.toString(), parts.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceivePulsevR(chid: CInt, iov: ConstPtr<Iovec>, parts: ULong, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceivePulsevR(chid, iov.rawAddress.toString(), parts.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReply(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReply(rcvid, status.toString(), msg.rawAddress.toString(), bytes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReplyR(rcvid: CInt, status: CLong, msg: ConstPtr<CVoid>, bytes: ULong): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReplyR(rcvid, status.toString(), msg.rawAddress.toString(), bytes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReplyv(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReplyv(rcvid, status.toString(), iov.rawAddress.toString(), parts.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReplyvR(rcvid: CInt, status: CLong, iov: ConstPtr<Iovec>, parts: ULong): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReplyvR(rcvid, status.toString(), iov.rawAddress.toString(), parts.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadiov(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReadiov(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadiovR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong, flags: CInt): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReadiovR(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgRead(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgRead(rcvid, msg.rawAddress.toString(), bytes.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadR(rcvid: CInt, msg: MutPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReadR(rcvid, msg.rawAddress.toString(), bytes.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadv(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReadv(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReadvR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReadvR(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWrite(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgWrite(rcvid, msg.rawAddress.toString(), bytes.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWriteR(rcvid: CInt, msg: ConstPtr<CVoid>, bytes: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgWriteR(rcvid, msg.rawAddress.toString(), bytes.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWritev(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgWritev(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWritevR(rcvid: CInt, iov: ConstPtr<Iovec>, parts: ULong, offset: ULong): Long =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgWritevR(rcvid, iov.rawAddress.toString(), parts.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendPulse(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendPulse(coid, priority, code, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendPulseR(coid: CInt, priority: CInt, code: CInt, value: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendPulseR(coid, priority, code, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendPulsePtr(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendPulsePtr(coid, priority, code, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendPulsePtrR(coid: CInt, priority: CInt, code: CInt, value: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendPulsePtrR(coid, priority, code, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgDeliverEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgDeliverEvent(rcvid, event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgDeliverEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgDeliverEventR(rcvid, event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgVerifyEvent(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgVerifyEvent(rcvid, event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgVerifyEventR(rcvid: CInt, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgVerifyEventR(rcvid, event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgRegisterEvent(event: MutPtr<Sigevent>, coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgRegisterEvent(event.rawAddress.toString(), coid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgRegisterEventR(event: MutPtr<Sigevent>, coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgRegisterEventR(event.rawAddress.toString(), coid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgUnregisterEvent(event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgUnregisterEvent(event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgUnregisterEventR(event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgUnregisterEventR(event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgInfo(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgInfo(rcvid, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgInfoR(rcvid: CInt, info: MutPtr<MsgInfo64>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgInfoR(rcvid, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgKeyData(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgKeyData(rcvid, oper, key.toInt(), newkey.rawAddress.toString(), iov.rawAddress.toString(), parts) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgKeyDataR(rcvid: CInt, oper: CInt, key: UInt, newkey: MutPtr<UInt>, iov: ConstPtr<Iovec>, parts: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgKeyDataR(rcvid, oper, key.toInt(), newkey.rawAddress.toString(), iov.rawAddress.toString(), parts) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgError(rcvid: CInt, err: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgError(rcvid, err) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgErrorR(rcvid: CInt, err: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgErrorR(rcvid, err) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgCurrent(rcvid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgCurrent(rcvid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgCurrentR(rcvid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgCurrentR(rcvid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendAsyncGbl(coid: CInt, smsg: ConstPtr<CVoid>, sbytes: ULong, msgPrio: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendAsyncGbl(coid, smsg.rawAddress.toString(), sbytes.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgSendAsync(coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgSendAsync(coid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceiveAsyncGbl(chid: CInt, rmsg: MutPtr<CVoid>, rbytes: ULong, info: MutPtr<MsgInfo64>, coid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceiveAsyncGbl(chid, rmsg.rawAddress.toString(), rbytes.toString(), info.rawAddress.toString(), coid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgReceiveAsync(chid: CInt, iov: ConstPtr<Iovec>, parts: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgReceiveAsync(chid, iov.rawAddress.toString(), parts.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgPause(rcvid: CInt, cookie: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgPause(rcvid, cookie.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgPauseR(rcvid: CInt, cookie: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoMsgPauseR(rcvid, cookie.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalKill(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalKill(nd.toInt(), pid, tid, signo, code, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalKillR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalKillR(nd.toInt(), pid, tid, signo, code, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalKillSigval(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalKillSigval(nd.toInt(), pid, tid, signo, code, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalKillSigvalR(nd: UInt, pid: PidT, tid: CInt, signo: CInt, code: CInt, value: ConstPtr<Sigval>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalKillSigvalR(nd.toInt(), pid, tid, signo, code, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalReturn(info: MutPtr<SighandlerInfo>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalReturn(info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalFault(sigcode: CUint, regs: MutPtr<CVoid>, refaddr: ULong): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalFault(sigcode.toInt(), regs.rawAddress.toString(), refaddr.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalAction(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalAction(pid, 0L.toString(), signo, act.rawAddress.toString(), oact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalActionR(pid: PidT, sigstub: SignalActionSigstubCallback, signo: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalActionR(pid, 0L.toString(), signo, act.rawAddress.toString(), oact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalProcmask(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalProcmask(pid, tid, how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalProcmaskR(pid: PidT, tid: CInt, how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalProcmaskR(pid, tid, how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalSuspend(set: ConstPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalSuspend(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalSuspendR(set: ConstPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalSuspendR(set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalWaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalWaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalWaitinfoR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalWaitinfoR(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalWaitinfoMask(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalWaitinfoMask(set.rawAddress.toString(), info.rawAddress.toString(), mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalWaitinfoMaskR(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, mask: ConstPtr<SigsetT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSignalWaitinfoMaskR(set.rawAddress.toString(), info.rawAddress.toString(), mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCreate(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadCreate(pid, 0L.toString(), arg.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCreateR(pid: PidT, func: ThreadCreateFuncCallback, arg: MutPtr<CVoid>, attr: ConstPtr<ThreadAttr>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadCreateR(pid, 0L.toString(), arg.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadDestroy(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadDestroy(tid, priority, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadDestroyR(tid: CInt, priority: CInt, status: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadDestroyR(tid, priority, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadDetach(tid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadDetach(tid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadDetachR(tid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadDetachR(tid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadJoin(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadJoin(tid, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadJoinR(tid: CInt, status: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadJoinR(tid, status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCancel(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadCancel(tid, 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCancelR(tid: CInt, canstub: SignalActionSigstubCallback): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadCancelR(tid, 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCtl(cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadCtl(cmd, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCtlR(cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadCtlR(cmd, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCtlExt(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadCtlExt(pid, tid, cmd, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun threadCtlExtR(pid: PidT, tid: CInt, cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoThreadCtlExtR(pid, tid, cmd, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptHookTrace(handler: InterruptHookTraceHandlerCallback?, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptHookTrace(0L.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptHookIdle(handler: InterruptHookIdleHandlerCallback?, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptHookIdle(0L.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptHookIdle2(handler: InterruptHookIdle2HandlerCallback?, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptHookIdle2(0L.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptHookOverdriveEvent(event: ConstPtr<Sigevent>, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptHookOverdriveEvent(event.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachEvent(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptAttachEvent(intr, event.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachEventR(intr: CInt, event: ConstPtr<Sigevent>, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptAttachEventR(intr, event.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttach(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptAttach(intr, 0L.toString(), area.rawAddress.toString(), size, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachR(intr: CInt, handler: InterruptAttachHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptAttachR(intr, 0L.toString(), area.rawAddress.toString(), size, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachArray(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptAttachArray(intr, 0L.toString(), area.rawAddress.toString(), size, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptAttachArrayR(intr: CInt, handler: InterruptAttachArrayHandlerCallback?, area: ConstPtr<CVoid>, size: CInt, flags: CUint): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptAttachArrayR(intr, 0L.toString(), area.rawAddress.toString(), size, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptDetach(id: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptDetach(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptDetachR(id: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptDetachR(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptWait(flags: CInt, timeout: ConstPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptWait(flags, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptWaitR(flags: CInt, timeout: ConstPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptWaitR(flags, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptCharacteristic(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptCharacteristic(type, id, new.rawAddress.toString(), old.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptCharacteristicR(type: CInt, id: CInt, new: MutPtr<CUint>, old: MutPtr<CUint>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptCharacteristicR(type, id, new.rawAddress.toString(), old.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGet(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedGet(pid, tid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetR(pid: PidT, tid: CInt, param: MutPtr<SchedParam>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedGetR(pid, tid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetCpuNum(): CUint =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedGetCpuNum().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSet(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedSet(pid, tid, algorithm, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetR(pid: PidT, tid: CInt, algorithm: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedSetR(pid, tid, algorithm, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedInfo(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedInfo(pid, algorithm, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedInfoR(pid: PidT, algorithm: CInt, info: MutPtr<SchedInfo>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedInfoR(pid, algorithm, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedYield() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYieldR(): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedYieldR() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCtl(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedCtl(cmd, data.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCtlR(cmd: CInt, data: MutPtr<CVoid>, length: ULong): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedCtlR(cmd, data.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedJobCreate(job: MutPtr<NtoJobT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedJobCreate(job.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedJobCreateR(job: MutPtr<NtoJobT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedJobCreateR(job.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedJobDestroy(job: MutPtr<NtoJobT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedJobDestroy(job.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedJobDestroyR(job: MutPtr<NtoJobT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedJobDestroyR(job.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedWaypoint(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedWaypoint(job.rawAddress.toString(), new.rawAddress.toString(), max.rawAddress.toString(), old.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedWaypointR(job: MutPtr<NtoJobT>, new: ConstPtr<Long>, max: ConstPtr<Long>, old: MutPtr<Long>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSchedWaypointR(job.rawAddress.toString(), new.rawAddress.toString(), max.rawAddress.toString(), old.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(id: ClockidT, notify: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerCreate(id, notify.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreateR(id: ClockidT, notify: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerCreateR(id, notify.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDestroy(id: TimerT): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerDestroy(id.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDestroyR(id: TimerT): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerDestroyR(id.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerSettime(id.toLong().toString(), flags, itime.rawAddress.toString(), oitime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettimeR(id: TimerT, flags: CInt, itime: ConstPtr<Itimer>, oitime: MutPtr<Itimer>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerSettimeR(id.toLong().toString(), flags, itime.rawAddress.toString(), oitime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerInfo(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerInfo(pid, id.toLong().toString(), flags, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerInfoR(pid: PidT, id: TimerT, flags: CInt, info: MutPtr<TimerInfo>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerInfoR(pid, id.toLong().toString(), flags, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerAlarm(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerAlarm(id, itime.rawAddress.toString(), otime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerAlarmR(id: ClockidT, itime: ConstPtr<Itimer>, otime: MutPtr<Itimer>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerAlarmR(id, itime.rawAddress.toString(), otime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerTimeout(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerTimeout(id, flags, notify.rawAddress.toString(), ntime.rawAddress.toString(), otime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerTimeoutR(id: ClockidT, flags: CInt, notify: ConstPtr<Sigevent>, ntime: ConstPtr<ULong>, otime: MutPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoTimerTimeoutR(id, flags, notify.rawAddress.toString(), ntime.rawAddress.toString(), otime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncTypeCreate(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncTypeCreate(type.toInt(), sync.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncTypeCreateR(type: CUint, sync: MutPtr<SyncT>, attr: ConstPtr<SyncAttr>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncTypeCreateR(type.toInt(), sync.rawAddress.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncDestroy(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncDestroy(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncDestroyR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncDestroyR(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCtl(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncCtl(cmd, sync.rawAddress.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCtlR(cmd: CInt, sync: MutPtr<SyncT>, data: MutPtr<CVoid>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncCtlR(cmd, sync.rawAddress.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexEvent(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncMutexEvent(sync.rawAddress.toString(), event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexEventR(sync: MutPtr<SyncT>, event: ConstPtr<Sigevent>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncMutexEventR(sync.rawAddress.toString(), event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexLock(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncMutexLock(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexLockR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncMutexLockR(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexUnlock(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncMutexUnlock(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexUnlockR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncMutexUnlockR(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexRevive(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncMutexRevive(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncMutexReviveR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncMutexReviveR(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCondvarWait(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncCondvarWait(sync.rawAddress.toString(), mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCondvarWaitR(sync: MutPtr<SyncT>, mutex: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncCondvarWaitR(sync.rawAddress.toString(), mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCondvarSignal(sync: MutPtr<SyncT>, all: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncCondvarSignal(sync.rawAddress.toString(), all) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncCondvarSignalR(sync: MutPtr<SyncT>, all: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncCondvarSignalR(sync.rawAddress.toString(), all) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncSemPost(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncSemPost(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncSemPostR(sync: MutPtr<SyncT>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncSemPostR(sync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncSemWait(sync: MutPtr<SyncT>, tryto: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncSemWait(sync.rawAddress.toString(), tryto) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncSemWaitR(sync: MutPtr<SyncT>, tryto: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoSyncSemWaitR(sync.rawAddress.toString(), tryto) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockTime(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoClockTime(id, new.rawAddress.toString(), old.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockTimeR(id: ClockidT, new: ConstPtr<ULong>, old: MutPtr<ULong>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoClockTimeR(id, new.rawAddress.toString(), old.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjust(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoClockAdjust(id, new.rawAddress.toString(), old.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjustR(id: ClockidT, new: ConstPtr<Clockadjust>, old: MutPtr<Clockadjust>): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoClockAdjustR(id, new.rawAddress.toString(), old.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockPeriod(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoClockPeriod(id, new.rawAddress.toString(), old.rawAddress.toString(), reserved) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockPeriodR(id: ClockidT, new: ConstPtr<Clockperiod>, old: MutPtr<Clockperiod>, reserved: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoClockPeriodR(id, new.rawAddress.toString(), old.rawAddress.toString(), reserved) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockId(pid: PidT, tid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoClockId(pid, tid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockIdR(pid: PidT, tid: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoClockIdR(pid, tid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptMask(intr: CInt, id: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptMask(intr, id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun interruptUnmask(intr: CInt, id: CInt): CInt =
    if (unixNtoNeutrinoNapiAvailable) wasmLibcUnixNtoNeutrinoInterruptUnmask(intr, id) else throw UnsupportedOperationException("Native FFI addon is not available")
