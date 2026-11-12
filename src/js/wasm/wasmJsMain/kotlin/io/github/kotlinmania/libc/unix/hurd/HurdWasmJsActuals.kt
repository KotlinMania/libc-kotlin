@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixHurdNapiAddon(): Boolean

private val unixHurdNapiAvailable: Boolean = initUnixHurdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdLutimes(p0, p1)")
private external fun wasmLibcUnixHurdLutimes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFutimes(p0, p1)")
private external fun wasmLibcUnixHurdFutimes(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFutimens(p0, p1)")
private external fun wasmLibcUnixHurdFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixHurdMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdMknodat(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdLibcCurrentSigrtmin()")
private external fun wasmLibcUnixHurdLibcCurrentSigrtmin(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdLibcCurrentSigrtmax()")
private external fun wasmLibcUnixHurdLibcCurrentSigrtmax(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdWait4(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdWait4(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdWaitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSigwait(p0, p1)")
private external fun wasmLibcUnixHurdSigwait(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdSigsuspend(p0)")
private external fun wasmLibcUnixHurdSigsuspend(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixHurdSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSigwaitinfo(p0, p1)")
private external fun wasmLibcUnixHurdSigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSigaltstack(p0, p1)")
private external fun wasmLibcUnixHurdSigaltstack(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixHurdIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixHurdIoctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPipe2(p0, p1)")
private external fun wasmLibcUnixHurdPipe2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdDup3(p0, p1, p2)")
private external fun wasmLibcUnixHurdDup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPread64(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPread64(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPwrite64(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPwrite64(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdReadv(p0, p1, p2)")
private external fun wasmLibcUnixHurdReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdWritev(p0, p1, p2)")
private external fun wasmLibcUnixHurdWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPreadv64(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPreadv64(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPwritev64(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPwritev64(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdFreadUnlocked(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdFreadUnlocked(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdAioRead(p0)")
private external fun wasmLibcUnixHurdAioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdAioWrite(p0)")
private external fun wasmLibcUnixHurdAioWrite(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdAioFsync(p0, p1)")
private external fun wasmLibcUnixHurdAioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdAioError(p0)")
private external fun wasmLibcUnixHurdAioError(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdAioReturn(p0)")
private external fun wasmLibcUnixHurdAioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdAioSuspend(p0, p1, p2)")
private external fun wasmLibcUnixHurdAioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdAioCancel(p0, p1)")
private external fun wasmLibcUnixHurdAioCancel(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdLioListio(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdLioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixHurdMqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixHurdMqOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdMqClose(p0)")
private external fun wasmLibcUnixHurdMqClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdMqUnlink(p0)")
private external fun wasmLibcUnixHurdMqUnlink(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdMqReceive(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdMqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdMqTimedreceive(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdMqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdMqSend(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdMqSend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdMqTimedsend(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdMqTimedsend(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdMqGetattr(p0, p1)")
private external fun wasmLibcUnixHurdMqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdMqSetattr(p0, p1, p2)")
private external fun wasmLibcUnixHurdMqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdLseek64(p0, p1, p2)")
private external fun wasmLibcUnixHurdLseek64(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdLseek(p0, p1, p2)")
private external fun wasmLibcUnixHurdLseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFgetpos64(p0, p1)")
private external fun wasmLibcUnixHurdFgetpos64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdFseeko64(p0, p1, p2)")
private external fun wasmLibcUnixHurdFseeko64(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFsetpos64(p0, p1)")
private external fun wasmLibcUnixHurdFsetpos64(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdFtello64(p0)")
private external fun wasmLibcUnixHurdFtello64(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdBind(p0, p1, p2)")
private external fun wasmLibcUnixHurdBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdAccept4(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdAccept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPpoll(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPpoll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixHurdRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixHurdSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHurdRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHurdRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdSendfile(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdSendfile(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdSendfile64(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdSendfile64(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdShutdown(p0, p1)")
private external fun wasmLibcUnixHurdShutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSethostname(p0, p1)")
private external fun wasmLibcUnixHurdSethostname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdGetdomainname(p0, p1)")
private external fun wasmLibcUnixHurdGetdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSetdomainname(p0, p1)")
private external fun wasmLibcUnixHurdSetdomainname(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdIfNameindex()")
private external fun wasmLibcUnixHurdIfNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdIfFreenameindex(p0)")
private external fun wasmLibcUnixHurdIfFreenameindex(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixHurdGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixHurdGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGetifaddrs(p0)")
private external fun wasmLibcUnixHurdGetifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdFreeifaddrs(p0)")
private external fun wasmLibcUnixHurdFreeifaddrs(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdUname(p0)")
private external fun wasmLibcUnixHurdUname(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdGethostid()")
private external fun wasmLibcUnixHurdGethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdSethostid(p0)")
private external fun wasmLibcUnixHurdSethostid(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdSetpwent()")
private external fun wasmLibcUnixHurdSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdEndpwent()")
private external fun wasmLibcUnixHurdEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdGetpwent()")
private external fun wasmLibcUnixHurdGetpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdSetgrent()")
private external fun wasmLibcUnixHurdSetgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdEndgrent()")
private external fun wasmLibcUnixHurdEndgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdGetgrent()")
private external fun wasmLibcUnixHurdGetgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdSetspent()")
private external fun wasmLibcUnixHurdSetspent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdEndspent()")
private external fun wasmLibcUnixHurdEndspent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdGetspent()")
private external fun wasmLibcUnixHurdGetspent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGetspnam(p0)")
private external fun wasmLibcUnixHurdGetspnam(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdGetpwentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdGetpwentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdGetgrentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdGetgrentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdFgetpwentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdFgetpwentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdFgetgrentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdFgetgrentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPutpwent(p0, p1)")
private external fun wasmLibcUnixHurdPutpwent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPutgrent(p0, p1)")
private external fun wasmLibcUnixHurdPutgrent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdFgetspentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdFgetspentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdSgetspentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdSgetspentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdGetspentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdGetspentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdGetspnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdGetspnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdGetmntentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdGetmntentR(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdUtmpname(p0)")
private external fun wasmLibcUnixHurdUtmpname(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdUtmpxname(p0)")
private external fun wasmLibcUnixHurdUtmpxname(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdGetutxent()")
private external fun wasmLibcUnixHurdGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGetutxid(p0)")
private external fun wasmLibcUnixHurdGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGetutxline(p0)")
private external fun wasmLibcUnixHurdGetutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPututxline(p0)")
private external fun wasmLibcUnixHurdPututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdSetutxent()")
private external fun wasmLibcUnixHurdSetutxent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdEndutxent()")
private external fun wasmLibcUnixHurdEndutxent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdGetresuid(p0, p1, p2)")
private external fun wasmLibcUnixHurdGetresuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdGetresgid(p0, p1, p2)")
private external fun wasmLibcUnixHurdGetresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdSetresuid(p0, p1, p2)")
private external fun wasmLibcUnixHurdSetresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdSetresgid(p0, p1, p2)")
private external fun wasmLibcUnixHurdSetresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdInitgroups(p0, p1)")
private external fun wasmLibcUnixHurdInitgroups(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGetgrgid(p0)")
private external fun wasmLibcUnixHurdGetgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGetgrnam(p0)")
private external fun wasmLibcUnixHurdGetgrnam(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSetgroups(p0, p1)")
private external fun wasmLibcUnixHurdSetgroups(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdAcct(p0)")
private external fun wasmLibcUnixHurdAcct(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSetmntent(p0, p1)")
private external fun wasmLibcUnixHurdSetmntent(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGetmntent(p0)")
private external fun wasmLibcUnixHurdGetmntent(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdAddmntent(p0, p1)")
private external fun wasmLibcUnixHurdAddmntent(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdEndmntent(p0)")
private external fun wasmLibcUnixHurdEndmntent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdHasmntopt(p0, p1)")
private external fun wasmLibcUnixHurdHasmntopt(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadKill(p0, p1)")
private external fun wasmLibcUnixHurdPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPthreadCancel(p0)")
private external fun wasmLibcUnixHurdPthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadEqual(p0, p1)")
private external fun wasmLibcUnixHurdPthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadGetattrNp(p0, p1)")
private external fun wasmLibcUnixHurdPthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcUnixHurdPthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadAttrSetguardsize(p0, p1)")
private external fun wasmLibcUnixHurdPthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcUnixHurdPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadMutexattrGetpshared(p0, p1)")
private external fun wasmLibcUnixHurdPthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadMutexattrSetpshared(p0, p1)")
private external fun wasmLibcUnixHurdPthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcUnixHurdPthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadRwlockattrGetpshared(p0, p1)")
private external fun wasmLibcUnixHurdPthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadRwlockattrSetpshared(p0, p1)")
private external fun wasmLibcUnixHurdPthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcUnixHurdPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixHurdPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadCondattrGetpshared(p0, p1)")
private external fun wasmLibcUnixHurdPthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadCondattrSetpshared(p0, p1)")
private external fun wasmLibcUnixHurdPthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadOnce(p0, p1)")
private external fun wasmLibcUnixHurdPthreadOnce(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPthreadBarrierattrInit(p0)")
private external fun wasmLibcUnixHurdPthreadBarrierattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPthreadBarrierattrDestroy(p0)")
private external fun wasmLibcUnixHurdPthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadBarrierattrGetpshared(p0, p1)")
private external fun wasmLibcUnixHurdPthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadBarrierattrSetpshared(p0, p1)")
private external fun wasmLibcUnixHurdPthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPthreadBarrierInit(p0, p1, p2)")
private external fun wasmLibcUnixHurdPthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPthreadBarrierDestroy(p0)")
private external fun wasmLibcUnixHurdPthreadBarrierDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPthreadBarrierWait(p0)")
private external fun wasmLibcUnixHurdPthreadBarrierWait(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadSpinInit(p0, p1)")
private external fun wasmLibcUnixHurdPthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPthreadSpinDestroy(p0)")
private external fun wasmLibcUnixHurdPthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPthreadSpinLock(p0)")
private external fun wasmLibcUnixHurdPthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPthreadSpinTrylock(p0)")
private external fun wasmLibcUnixHurdPthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPthreadSpinUnlock(p0)")
private external fun wasmLibcUnixHurdPthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcUnixHurdPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcUnixHurdPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSchedGetparam(p0, p1)")
private external fun wasmLibcUnixHurdSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSchedSetparam(p0, p1)")
private external fun wasmLibcUnixHurdSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdSchedGetscheduler(p0)")
private external fun wasmLibcUnixHurdSchedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcUnixHurdSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixHurdPthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixHurdPthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPthreadGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixHurdPthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdSemInit(p0, p1, p2)")
private external fun wasmLibcUnixHurdSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdSemDestroy(p0)")
private external fun wasmLibcUnixHurdSemDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSemTimedwait(p0, p1)")
private external fun wasmLibcUnixHurdSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSemGetvalue(p0, p1)")
private external fun wasmLibcUnixHurdSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdClockGetres(p0, p1)")
private external fun wasmLibcUnixHurdClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdClockGettime(p0, p1)")
private external fun wasmLibcUnixHurdClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdClockSettime(p0, p1)")
private external fun wasmLibcUnixHurdClockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdClockGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixHurdClockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdClockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdGettimeofday(p0, p1)")
private external fun wasmLibcUnixHurdGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSettimeofday(p0, p1)")
private external fun wasmLibcUnixHurdSettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdAsctimeR(p0, p1)")
private external fun wasmLibcUnixHurdAsctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdCtimeR(p0, p1)")
private external fun wasmLibcUnixHurdCtimeR(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdStrftime(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdStrptime(p0, p1, p2)")
private external fun wasmLibcUnixHurdStrptime(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdTimerCreate(p0, p1, p2)")
private external fun wasmLibcUnixHurdTimerCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdTimerDelete(p0)")
private external fun wasmLibcUnixHurdTimerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdTimerGetoverrun(p0)")
private external fun wasmLibcUnixHurdTimerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdTimerGettime(p0, p1)")
private external fun wasmLibcUnixHurdTimerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdTimerSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdTimerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFstat(p0, p1)")
private external fun wasmLibcUnixHurdFstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFstat64(p0, p1)")
private external fun wasmLibcUnixHurdFstat64(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdFstatat(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdFstatat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdFstatat64(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdFstatat64(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdStatx(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdStatx(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFtruncate(p0, p1)")
private external fun wasmLibcUnixHurdFtruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFtruncate64(p0, p1)")
private external fun wasmLibcUnixHurdFtruncate64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdTruncate64(p0, p1)")
private external fun wasmLibcUnixHurdTruncate64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdLstat(p0, p1)")
private external fun wasmLibcUnixHurdLstat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdLstat64(p0, p1)")
private external fun wasmLibcUnixHurdLstat64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdStatfs(p0, p1)")
private external fun wasmLibcUnixHurdStatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdStatfs64(p0, p1)")
private external fun wasmLibcUnixHurdStatfs64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFstatfs(p0, p1)")
private external fun wasmLibcUnixHurdFstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFstatfs64(p0, p1)")
private external fun wasmLibcUnixHurdFstatfs64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdStatvfs(p0, p1)")
private external fun wasmLibcUnixHurdStatvfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdStatvfs64(p0, p1)")
private external fun wasmLibcUnixHurdStatvfs64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFstatvfs(p0, p1)")
private external fun wasmLibcUnixHurdFstatvfs(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFstatvfs64(p0, p1)")
private external fun wasmLibcUnixHurdFstatvfs64(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixHurdOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixHurdOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixHurdOpen64(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixHurdOpen64(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixHurdOpenat(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixHurdOpenat(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixHurdOpenat64(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixHurdOpenat64(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFopen64(p0, p1)")
private external fun wasmLibcUnixHurdFopen64(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdFreopen64(p0, p1, p2)")
private external fun wasmLibcUnixHurdFreopen64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdCreat64(p0, p1)")
private external fun wasmLibcUnixHurdCreat64(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdMkostemp(p0, p1)")
private external fun wasmLibcUnixHurdMkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdMkostemps(p0, p1, p2)")
private external fun wasmLibcUnixHurdMkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdMkstemps(p0, p1)")
private external fun wasmLibcUnixHurdMkstemps(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdTmpfile64()")
private external fun wasmLibcUnixHurdTmpfile64(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPopen(p0, p1)")
private external fun wasmLibcUnixHurdPopen(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdGetdtablesize()")
private external fun wasmLibcUnixHurdGetdtablesize(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdCloseRange(p0, p1, p2)")
private external fun wasmLibcUnixHurdCloseRange(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdGetpt()")
private external fun wasmLibcUnixHurdGetpt(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPtsnameR(p0, p1, p2)")
private external fun wasmLibcUnixHurdPtsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdLoginTty(p0)")
private external fun wasmLibcUnixHurdLoginTty(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdCtermid(p0)")
private external fun wasmLibcUnixHurdCtermid(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdClearenv()")
private external fun wasmLibcUnixHurdClearenv(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdExecveat(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdExecveat(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdExecvpe(p0, p1, p2)")
private external fun wasmLibcUnixHurdExecvpe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdFexecve(p0, p1, p2)")
private external fun wasmLibcUnixHurdFexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdDaemon(p0, p1)")
private external fun wasmLibcUnixHurdDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHurdPosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHurdPosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrInit(p0)")
private external fun wasmLibcUnixHurdPosixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixHurdPosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrGetschedpolicy(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrSetschedpolicy(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrGetschedparam(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnattrSetschedparam(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixHurdPosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixHurdPosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdPosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixHurdPosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnFileActionsAddchdirNp(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnFileActionsAddchdirNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnFileActionsAddfchdirNp(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnFileActionsAddfchdirNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnFileActionsAddclosefromNp(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnFileActionsAddclosefromNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdPosixSpawnFileActionsAddtcsetpgrpNp(p0, p1)")
private external fun wasmLibcUnixHurdPosixSpawnFileActionsAddtcsetpgrpNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixHurdShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdShmUnlink(p0)")
private external fun wasmLibcUnixHurdShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdEuidaccess(p0, p1)")
private external fun wasmLibcUnixHurdEuidaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdEaccess(p0, p1)")
private external fun wasmLibcUnixHurdEaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdStat(p0, p1)")
private external fun wasmLibcUnixHurdStat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdStat64(p0, p1)")
private external fun wasmLibcUnixHurdStat64(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdReaddir(p0)")
private external fun wasmLibcUnixHurdReaddir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdReaddir64(p0)")
private external fun wasmLibcUnixHurdReaddir64(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdReaddirR(p0, p1, p2)")
private external fun wasmLibcUnixHurdReaddirR(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdReaddir64R(p0, p1, p2)")
private external fun wasmLibcUnixHurdReaddir64R(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSeekdir(p0, p1)")
private external fun wasmLibcUnixHurdSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdTelldir(p0)")
private external fun wasmLibcUnixHurdTelldir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdDirfd(p0)")
private external fun wasmLibcUnixHurdDirfd(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixHurdStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdErrnoLocation()")
private external fun wasmLibcUnixHurdErrnoLocation(): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHurdMmap64(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHurdMmap64(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libcUnixHurdMremap(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmLibcUnixHurdMremap(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdMprotect(p0, p1, p2)")
private external fun wasmLibcUnixHurdMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdMsync(p0, p1, p2)")
private external fun wasmLibcUnixHurdMsync(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdSync()")
private external fun wasmLibcUnixHurdSync()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdSyncfs(p0)")
private external fun wasmLibcUnixHurdSyncfs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdFdatasync(p0)")
private external fun wasmLibcUnixHurdFdatasync(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdFallocate64(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdFallocate64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixHurdPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPosixFallocate64(p0, p1, p2)")
private external fun wasmLibcUnixHurdPosixFallocate64(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdPosixFadvise64(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdPosixFadvise64(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdMadvise(p0, p1, p2)")
private external fun wasmLibcUnixHurdMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdPosixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixHurdPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdGetrlimit(p0, p1)")
private external fun wasmLibcUnixHurdGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdGetrlimit64(p0, p1)")
private external fun wasmLibcUnixHurdGetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSetrlimit(p0, p1)")
private external fun wasmLibcUnixHurdSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdSetrlimit64(p0, p1)")
private external fun wasmLibcUnixHurdSetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdGetpriority(p0, p1)")
private external fun wasmLibcUnixHurdGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixHurdSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixHurdGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdGetentropy(p0, p1)")
private external fun wasmLibcUnixHurdGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdMemrchr(p0, p1, p2)")
private external fun wasmLibcUnixHurdMemrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdStrchrnul(p0, p1)")
private external fun wasmLibcUnixHurdStrchrnul(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdAbs(p0)")
private external fun wasmLibcUnixHurdAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdLabs(p0)")
private external fun wasmLibcUnixHurdLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdRand()")
private external fun wasmLibcUnixHurdRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdSrand(p0)")
private external fun wasmLibcUnixHurdSrand(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdDrand48()")
private external fun wasmLibcUnixHurdDrand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdErand48(p0)")
private external fun wasmLibcUnixHurdErand48(p0: String): Double

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdLrand48()")
private external fun wasmLibcUnixHurdLrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdNrand48(p0)")
private external fun wasmLibcUnixHurdNrand48(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdMrand48()")
private external fun wasmLibcUnixHurdMrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdJrand48(p0)")
private external fun wasmLibcUnixHurdJrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdSrand48(p0)")
private external fun wasmLibcUnixHurdSrand48(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdSeed48(p0)")
private external fun wasmLibcUnixHurdSeed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdLcong48(p0)")
private external fun wasmLibcUnixHurdLcong48(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdQsortR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdQsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdBrk(p0)")
private external fun wasmLibcUnixHurdBrk(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdSbrk(p0)")
private external fun wasmLibcUnixHurdSbrk(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdMemalign(p0, p1)")
private external fun wasmLibcUnixHurdMemalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdMallopt(p0, p1)")
private external fun wasmLibcUnixHurdMallopt(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdMallocInfo(p0, p1)")
private external fun wasmLibcUnixHurdMallocInfo(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdMallocUsableSize(p0)")
private external fun wasmLibcUnixHurdMallocUsableSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdMallocTrim(p0)")
private external fun wasmLibcUnixHurdMallocTrim(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdIconvOpen(p0, p1)")
private external fun wasmLibcUnixHurdIconvOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdIconv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdIconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdIconvClose(p0)")
private external fun wasmLibcUnixHurdIconvClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdGetoptLong(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdGetoptLong(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdBacktrace(p0, p1)")
private external fun wasmLibcUnixHurdBacktrace(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdReboot(p0)")
private external fun wasmLibcUnixHurdReboot(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdGetloadavg(p0, p1)")
private external fun wasmLibcUnixHurdGetloadavg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdRegexec(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdRegexec(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdRegerror(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdRegerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdRegfree(p0)")
private external fun wasmLibcUnixHurdRegfree(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdGlob(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdGlob(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGlobfree(p0)")
private external fun wasmLibcUnixHurdGlobfree(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdGlob64(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdGlob64(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGlobfree64(p0)")
private external fun wasmLibcUnixHurdGlobfree64(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdGetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdGetxattr(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdLgetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdLgetxattr(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdFgetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdFgetxattr(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdSetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdSetxattr(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdLsetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdLsetxattr(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHurdFsetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHurdFsetxattr(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdListxattr(p0, p1, p2)")
private external fun wasmLibcUnixHurdListxattr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdLlistxattr(p0, p1, p2)")
private external fun wasmLibcUnixHurdLlistxattr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdFlistxattr(p0, p1, p2)")
private external fun wasmLibcUnixHurdFlistxattr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdRemovexattr(p0, p1)")
private external fun wasmLibcUnixHurdRemovexattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdLremovexattr(p0, p1)")
private external fun wasmLibcUnixHurdLremovexattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdFremovexattr(p0, p1)")
private external fun wasmLibcUnixHurdFremovexattr(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdDirname(p0)")
private external fun wasmLibcUnixHurdDirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdPosixBasename(p0)")
private external fun wasmLibcUnixHurdPosixBasename(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdGnuBasename(p0)")
private external fun wasmLibcUnixHurdGnuBasename(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdDlmopen(p0, p1, p2)")
private external fun wasmLibcUnixHurdDlmopen(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdDlinfo(p0, p1, p2)")
private external fun wasmLibcUnixHurdDlinfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHurdDladdr1(p0, p1, p2, p3)")
private external fun wasmLibcUnixHurdDladdr1(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdDuplocale(p0)")
private external fun wasmLibcUnixHurdDuplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdFreelocale(p0)")
private external fun wasmLibcUnixHurdFreelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHurdNewlocale(p0, p1, p2)")
private external fun wasmLibcUnixHurdNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdUselocale(p0)")
private external fun wasmLibcUnixHurdUselocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHurdNlLanginfo(p0)")
private external fun wasmLibcUnixHurdNlLanginfo(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdNlLanginfoL(p0, p1)")
private external fun wasmLibcUnixHurdNlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHurdDlIteratePhdr(p0, p1)")
private external fun wasmLibcUnixHurdDlIteratePhdr(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdGnuGetLibcRelease()")
private external fun wasmLibcUnixHurdGnuGetLibcRelease(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHurdGnuGetLibcVersion()")
private external fun wasmLibcUnixHurdGnuGetLibcVersion(): String

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLutimes(file.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFutimes(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(fd: CInt, path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMkfifoat(fd, path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmin(): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLibcCurrentSigrtmin() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmax(): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLibcCurrentSigrtmax() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPipe2(fds.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdDup3(oldfd, newfd, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPread64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPwrite64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdReadv(fd, iovec.rawAddress.toString(), count).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdWritev(fd, iovec.rawAddress.toString(), count).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPreadv(fd, iovec.rawAddress.toString(), count, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPwritev(fd, iovec.rawAddress.toString(), count, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPreadv64(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPwritev64(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFreadUnlocked(buf.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAioRead(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAioWrite(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAioFsync(op, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAioError(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAioReturn(aiocbp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAioCancel(fd, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMqClose(mqd.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMqUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLseek64(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFgetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFseeko64(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFsetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFtello64(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdBind(fd, addr.rawAddress.toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAccept4(fd, addr.rawAddress.toString(), len.rawAddress.toString(), flg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPpoll(fds.rawAddress.toString(), nfds.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, message: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdRecvmsg(fd, message.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, message: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSendmsg(fd, message.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSendfile(outFd, inFd, offset.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSendfile64(outFd, inFd, offset.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdShutdown(fd, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdIfNameindex().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetifaddrs(ifap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSethostid(hostid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdSetspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdEndspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspent(): MutPtr<Spwd> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetspent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetspnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwentR(stream: MutPtr<FILE>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFgetpwentR(stream.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrentR(stream: MutPtr<FILE>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFgetgrentR(stream.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putpwent(p: ConstPtr<Passwd>, stream: MutPtr<FILE>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPutpwent(p.rawAddress.toString(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putgrent(grp: ConstPtr<Group>, stream: MutPtr<FILE>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPutgrent(grp.rawAddress.toString(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetspentR(fp: MutPtr<FILE>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFgetspentR(fp.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(s: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSgetspentR(s.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetspentR(spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnamR(name: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetspnamR(name.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntentR(stream: MutPtr<FILE>, mntbuf: MutPtr<Mntent>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Mntent> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetmntentR(stream.rawAddress.toString(), mntbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdUtmpname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdUtmpxname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetutxid(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetutxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdPututxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdInitgroups(user.rawAddress.toString(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSetgroups(ngroups.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAcct(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdSetmntent(filename.rawAddress.toString(), ty.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGetmntent(stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addmntent(stream: MutPtr<FILE>, mnt: ConstPtr<Mntent>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAddmntent(stream.rawAddress.toString(), mnt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdEndmntent(streamp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdHasmntopt(mnt.rawAddress.toString(), opt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadKill(threadid.toString(), signo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadCancel(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadEqual(t1.toString(), t2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thr: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadGetattrNp(thr.toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(control: MutPtr<PthreadOnceT>, routine: PthreadOnceRoutineCallback): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadOnce(control.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadBarrierattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadBarrierattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadBarrierattrGetpshared(attr.rawAddress.toString(), shared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadBarrierattrSetpshared(attr.rawAddress.toString(), shared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadBarrierDestroy(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadBarrierWait(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, newmask: ConstPtr<SigsetT>, oldmask: MutPtr<SigsetT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadSigmask(how, newmask.rawAddress.toString(), oldmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadGetschedparam(native.toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadSetschedparam(native.toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPthreadGetcpuclockid(thread.toString(), clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdClockGetres(clockId, res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdClockGettime(clockId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdClockSettime(clockId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdClockGetcpuclockid(pid, clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdCtimeR(timep.rawAddress.toString(), buf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdStrftime(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdTimerCreate(clockid, sevp.rawAddress.toString(), timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdTimerDelete(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdTimerGetoverrun(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdTimerGettime(timerid.toLong().toString(), currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdTimerSettime(timerid.toLong().toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fd: CInt, buf: MutPtr<Stat>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFstat(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat64(fd: CInt, buf: MutPtr<Stat64>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFstat64(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(fd: CInt, file: ConstPtr<CChar>, buf: MutPtr<Stat>, flag: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFstatat(fd, file.rawAddress.toString(), buf.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat64(fd: CInt, file: ConstPtr<CChar>, buf: MutPtr<Stat64>, flag: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFstatat64(fd, file.rawAddress.toString(), buf.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statx(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, mask: CUint, statxbuf: MutPtr<Statx>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdStatx(dirfd, pathname.rawAddress.toString(), flags, mask.toInt(), statxbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFtruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFtruncate64(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate64(file: ConstPtr<CChar>, length: Off64T): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdTruncate64(file.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(file: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLstat(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat64(file: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLstat64(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs64(file: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdStatfs64(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFstatfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs64(fildes: CInt, buf: MutPtr<Statfs64>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFstatfs64(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(file: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdStatvfs(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs64(file: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdStatvfs64(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fildes: CInt, buf: MutPtr<Statvfs>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFstatvfs(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs64(fildes: CInt, buf: MutPtr<Statvfs64>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFstatvfs64(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdOpen(file.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open64(file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdOpen64(file.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(fd: CInt, file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdOpenat(fd, file.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat64(fd: CInt, file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdOpenat64(fd, file.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdFopen64(filename.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdFreopen64(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdCreat64(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMkostemp(template.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMkostemps(template.rawAddress.toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMkstemps(template.rawAddress.toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile64(): MutPtr<FILE> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdTmpfile64().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdCloseRange(first.toInt(), last.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpt(): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetpt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLoginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdCtermid(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdClearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execveat(dirfd: CInt, pathname: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdExecveat(dirfd, pathname.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnFileActionsInit(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnFileActionsDestroy(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr<PosixSpawnFileActionsT>, from: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnFileActionsAddclosefromNp(actions.rawAddress.toString(), from) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr<PosixSpawnFileActionsT>, tcfd: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress.toString(), tcfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdEuidaccess(pathname.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdEaccess(pathname.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(file: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdStat(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat64(file: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdStat64(file.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdReaddir(dirp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64(dirp: MutPtr<DIR>): MutPtr<Dirent64> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdReaddir64(dirp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdReaddirR(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64R(dirp: MutPtr<DIR>, entry: MutPtr<Dirent64>, result: MutPtr<MutPtr<Dirent64>>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdReaddir64R(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr<CInt> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdErrnoLocation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap64(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr<CVoid> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdMmap64(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: MutPtr<CVoid>, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr<CVoid> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdMremap(addr.rawAddress.toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSyncfs(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFallocate64(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixFallocate64(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixFadvise64(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetrlimit(resource.toInt(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetrlimit64(resource.toInt(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSetrlimit(resource.toInt(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSetrlimit64(resource.toInt(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetpriority(which.toInt(), who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSetpriority(which.toInt(), who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buffer: MutPtr<CVoid>, length: SizeT, flags: CUint): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetrandom(buffer.rawAddress.toString(), length.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buffer: MutPtr<CVoid>, length: SizeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetentropy(buffer.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdMemrchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdStrchrnul(s.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdDrand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdErand48(xseed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdNrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdJrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdSeed48(xseed.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr<CUshort>) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdQsortR(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdBrk(addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdSbrk(increment.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMallopt(param, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo2(): Mallinfo2 =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMallocInfo(options, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMallocUsableSize(ptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocTrim(pad: SizeT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdMallocTrim(pad.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdIconvClose(cd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdBacktrace(buf.rawAddress.toString(), sz) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdReboot(howTo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetloadavg(loadavg.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGlob64(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: MutPtr<Glob64T>) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdGlobfree64(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLgetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLsetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLlistxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFlistxattr(filedes, list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdRemovexattr(path.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdLremovexattr(path.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdFremovexattr(filedes, name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdDirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixBasename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdPosixBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuBasename(path: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdGnuBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdDlmopen(lmid.toString(), filename.rawAddress.toString(), flag).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlinfo(handle: MutPtr<CVoid>, request: CInt, info: MutPtr<CVoid>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdDlinfo(handle.rawAddress.toString(), request, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr1(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>, extraInfo: MutPtr<MutPtr<CVoid>>, flags: CInt): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdDladdr1(addr.rawAddress.toString(), info.rawAddress.toString(), extraInfo.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixHurdNapiAvailable) {
        wasmLibcUnixHurdFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    if (unixHurdNapiAvailable) MutPtr(wasmLibcUnixHurdNlLanginfoL(item, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixHurdNapiAvailable) wasmLibcUnixHurdDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcRelease(): ConstPtr<CChar> =
    if (unixHurdNapiAvailable) ConstPtr(wasmLibcUnixHurdGnuGetLibcRelease().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcVersion(): ConstPtr<CChar> =
    if (unixHurdNapiAvailable) ConstPtr(wasmLibcUnixHurdGnuGetLibcVersion().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
