@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.KinfoProc
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.ShmidDs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Statfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Vnstat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.b64.Stat
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdFreebsdlikeFreebsdNapiAddon(): Boolean

private val unixBsdFreebsdlikeFreebsdNapiAvailable: Boolean = initUnixBsdFreebsdlikeFreebsdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFhlink(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFhlink(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFhlinkat(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFhlinkat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFhreadlink(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFhreadlink(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdGetfhat(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdGetfhat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdError()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdError(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioCancel(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioCancel(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioError(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioError(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioFsync(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioRead(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioReadv(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioReadv(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioReturn(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioSuspend(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioWrite(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioWrite(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioWritev(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioWritev(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCopyFileRange(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCopyFileRange(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdDevnameR(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdDevnameR(p0: Int, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrGetFd(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrGetFd(p0: Int, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrGetFile(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrGetFile(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrGetLink(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrGetLink(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrListFd(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrListFd(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrListFile(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrListFile(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrListLink(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrListLink(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrSetFd(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrSetFd(p0: Int, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrSetFile(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrSetFile(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrSetLink(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrSetLink(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFspacectl(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFspacectl(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdJail(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdJail(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdJailAttach(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdJailAttach(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdJailRemove(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdJailRemove(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdJailGet(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdJailGet(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdJailSet(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdJailSet(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdLioListio(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdLioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdGetutxuser(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdGetutxuser(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSetutxdb(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSetutxdb(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMqGetfdNp(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMqGetfdNp(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdWaitid(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPtsnameR(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPtsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFtok(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFtok(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdShmget(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdShmget(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdShmat(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdShmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdShmdt(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdShmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdShmctl(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdShmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSemget(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSemget(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSemctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSemctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSemop(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSemop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMsgctl(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMsgctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMsgget(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMsgget(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMsgsnd(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMsgsnd(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCfmakesane(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCfmakesane(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPdfork(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPdfork(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPdgetpid(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPdgetpid(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPdkill(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPdkill(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdRtprioThread(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdRtprioThread(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdUuidgen(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdUuidgen(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdThrKill(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdThrKill(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdThrKill2(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdThrKill2(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdThrSelf(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdThrSelf(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSchedGetcpu()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSchedGetcpu(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdStatfs(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdStatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFstatfs(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdDup3(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdDup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdXuname(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdXuname(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSendmmsg(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSendmmsg(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdRecvmmsg(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdRecvmmsg(p0: Int, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFhopen(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFhopen(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFhstat(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFhstat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFhstatfs(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFhstatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdGetfh(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdGetfh(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdLgetfh(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdLgetfh(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdGetfsstat(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdGetfsstat(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdGetmntinfo(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdGetmntinfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMount(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMount(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdNmount(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdNmount(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSetproctitle(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSetproctitle(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdRfork(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdRfork(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCpuset(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCpuset(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCpusetGetid(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCpusetGetid(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCpusetSetid(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCpusetSetid(p0: Int, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapEnter()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapEnter(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapGetmode(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapGetmode(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsInit(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsInit(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsGet(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsGet(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsSet(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsSet(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsClear(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsClear(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsLimit(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsLimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsMerge(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsMerge(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsRemove(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsRemove(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapRightsContains(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsContains(p0: String, p1: String): Boolean

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCapSandboxed()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCapSandboxed(): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdReallocarray(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdReallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFfs(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFfs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFfsl(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFfsl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFfsll(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFfsll(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFls(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFls(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFlsl(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFlsl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFlsll(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFlsll(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMallctl(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMallctl(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMallctlnametomib(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMallctlnametomib(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMallctlbymib(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMallctlbymib(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMallocx(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMallocx(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdRallocx(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdRallocx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdXallocx(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdXallocx(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSallocx(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSallocx(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdDallocx(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdDallocx(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSdallocx(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSdallocx(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdNallocx(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdNallocx(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcctl(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcctl(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdGetpagesize()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdGetpagesize(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdGetpagesizes(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdGetpagesizes(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdStrchrnul(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdStrchrnul(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdShmRename(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdShmRename(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemfdCreate(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemfdCreate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSetaudit(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSetaudit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdEventfd(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdEventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdEventfdRead(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdEventfdRead(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdEventfdWrite(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdEventfdWrite(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFdatasync(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFdatasync(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdElfAuxInfo(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdElfAuxInfo(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSetproctitleFast(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSetproctitleFast(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdUmtxOp(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdUmtxOp(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpPeeloff(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpPeeloff(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpBindx(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpBindx(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpConnectx(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpConnectx(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpOptInfo(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpOptInfo(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpSendv(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpSendv(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: Int, p8: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdSctpRecvv(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdSctpRecvv(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimerfdCreate(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimerfdGettime(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimerfdSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdClosefrom(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdClosefrom(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdCloseRange(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdCloseRange(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExecvpe(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExecvpe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKcmp(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKcmp(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdDlvsym(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdDlvsym(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemstatStrerror(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemstatStrerror(p0: Int): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdMemstatGetName(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdMemstatGetName(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmGetargv(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetargv(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmGetcptime(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetcptime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmGetenvv(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetenvv(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmGeterr(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmGeterr(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmGetncpus(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetncpus(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmNative(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmNative(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmNlist(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmNlist(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmNlist2(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmNlist2(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(p0: String, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKvmRead2(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKvmRead2(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdRealhostname(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdRealhostname(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdRealhostnameSa(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdRealhostnameSa(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKldIsloaded(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKldIsloaded(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKldLoad(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKldLoad(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdHexdump(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdHexdump(p0: String, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdHumanizeNumber(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdHumanizeNumber(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFlopen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFlopen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdFlopenat(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdFlopenat(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdGetlocalbase()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdGetlocalbase(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPidfileOpen(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPidfileOpen(p0: String, p1: Int, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPidfileWrite(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPidfileWrite(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPidfileClose(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPidfileClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPidfileRemove(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPidfileRemove(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdPidfileFileno(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdPidfileFileno(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl()")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatClose(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetargv(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetargv(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetumask(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetumask(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimerCreate(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimerCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimerDelete(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimerGettime(p0, p1)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdTimerSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdTimerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdDevstatGetversion(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdDevstatGetversion(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(p0)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(p0, p1, p2)")
private external fun wasmLibcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(p0: String, p1: String, p2: String): Int

public actual fun fhlink(fhp: MutPtr<FhandleT>, to: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFhlink(fhp.rawAddress.toString(), to.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhlinkat(fhp: MutPtr<FhandleT>, tofd: CInt, to: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFhlinkat(fhp.rawAddress.toString(), tofd, to.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhreadlink(fhp: MutPtr<FhandleT>, buf: MutPtr<CChar>, bufsize: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFhreadlink(fhp.rawAddress.toString(), buf.rawAddress.toString(), bufsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfhat(fd: CInt, path: MutPtr<CChar>, fhp: MutPtr<Fhandle>, flag: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdGetfhat(fd, path.rawAddress.toString(), fhp.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun error(): MutPtr<CInt> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdError().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioCancel(fd, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioError(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioFsync(op, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioRead(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReadv(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioReadv(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioReturn(aiocbp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioWrite(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWritev(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioWritev(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileRange(infd: CInt, inoffp: MutPtr<OffT>, outfd: CInt, outoffp: MutPtr<OffT>, len: SizeT, flags: CUint): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCopyFileRange(infd, inoffp.rawAddress.toString(), outfd, outoffp.rawAddress.toString(), len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: CInt): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdDevnameR(dev.toInt(), mode.toInt(), buf.rawAddress.toString(), len).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrGetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrGetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrListFd(fd, attrnamespace, data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrListFile(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrListLink(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrSetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrSetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: ConstPtr<SpacectlRange>, flags: CInt, rmsr: MutPtr<SpacectlRange>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFspacectl(fd, cmd, rqsr.rawAddress.toString(), flags, rmsr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jail(jail: MutPtr<Jail>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdJail(jail.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailAttach(jid: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdJailAttach(jid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailRemove(jid: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdJailRemove(jid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailGet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdJailGet(iov.rawAddress.toString(), niov.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jailSet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdJailSet(iov.rawAddress.toString(), niov.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxuser(user: ConstPtr<CChar>): MutPtr<Utmpx> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdGetutxuser(user.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxdb(type: CInt, file: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSetutxdb(type, file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(iocbp.rawAddress.toString(), timeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMqGetfdNp(mqd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdWaitid(idtype.toInt(), id.toString(), infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFtok(pathname.rawAddress.toString(), projId).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdShmget(key.toString(), size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdShmat(shmid, shmaddr.rawAddress.toString(), shmflg).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdShmdt(shmaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdShmctl(shmid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSemget(key.toString(), nsems, semflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSemop(semid, sops.rawAddress.toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMsgctl(msqid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMsgget(key.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakesane(termios: MutPtr<Termios>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdCfmakesane(termios.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pdfork(fdp: MutPtr<CInt>, flags: CInt): PidT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPdfork(fdp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdgetpid(fd: CInt, pidp: MutPtr<PidT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPdgetpid(fd, pidp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPdkill(fd, signum) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdRtprioThread(function, lwpid, rtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidgen(store: MutPtr<Uuid>, count: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdUuidgen(store.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdThrKill(id.toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdThrKill2(pid, id.toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thrSelf(tid: MutPtr<CLong>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdThrSelf(tid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetthreadidNp(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: MutPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(td.toLong().toString(), cpusetsize.toString(), cpusetp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: ConstPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(td.toLong().toString(), cpusetsize.toString(), cpusetp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: MutPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(pid, cpusetsz.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: ConstPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(pid, cpusetsz.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSchedGetcpu() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: MutPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(attr.rawAddress.toString(), robust.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(attr.rawAddress.toString(), robust) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(thread.toLong().toString(), retval.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFstatfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdDup3(src, dst, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xuname(nmln: CInt, buf: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdXuname(nmln, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt, timeout: ConstPtr<Timespec>): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toString(), flags, timeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhopen(fhp: ConstPtr<FhandleT>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFhopen(fhp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhstat(fhp: ConstPtr<Fhandle>, buf: MutPtr<Stat>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFhstat(fhp.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhstatfs(fhp: ConstPtr<FhandleT>, buf: MutPtr<Statfs>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFhstatfs(fhp.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdGetfh(path.rawAddress.toString(), fhp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdLgetfh(path.rawAddress.toString(), fhp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsstat(buf: MutPtr<Statfs>, bufsize: CLong, mode: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdGetfsstat(buf.rawAddress.toString(), bufsize.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mode: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdGetmntinfo(mntbufp.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(type: ConstPtr<CChar>, dir: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMount(type.rawAddress.toString(), dir.rawAddress.toString(), flags, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nmount(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdNmount(iov.rawAddress.toString(), niov.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdSetproctitle(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rfork(flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdRfork(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<CpusetT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(level, which, id.toString(), setsize.toString(), mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpuset(setid: MutPtr<CpusetidT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCpuset(setid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: MutPtr<CpusetidT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCpusetGetid(level, which, id.toString(), setid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCpusetSetid(which, id.toString(), setid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capEnter(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapEnter() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetmode(modep: MutPtr<CUint>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapGetmode(modep.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: MutPtr<UInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(fd, fcntlrightsp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd, fcntlrights.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capIoctlsGet(fd: CInt, cmds: MutPtr<ULong>, maxcmds: ULong): Long =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(fd, cmds.rawAddress.toString(), maxcmds.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capIoctlsLimit(fd: CInt, cmds: ConstPtr<ULong>, ncmds: ULong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(fd, cmds.rawAddress.toString(), ncmds.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsInit(version: CInt, rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsInit(version, rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: MutPtr<CapRightsT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsGet(version, fd, rightsp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsSet(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsSet(rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsClear(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsClear(rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsIsSet(rights: ConstPtr<CapRightsT>, vararg variadicArgs: Long): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(rights.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsIsValid(rights: ConstPtr<CapRightsT>): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(rights.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsLimit(fd: CInt, rights: ConstPtr<CapRightsT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsLimit(fd, rights.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsMerge(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsMerge(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsRemove(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsRemove(dst.rawAddress.toString(), src.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capRightsContains(big: ConstPtr<CapRightsT>, little: ConstPtr<CapRightsT>): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapRightsContains(big.rawAddress.toString(), little.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capSandboxed(): Boolean =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCapSandboxed() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffs(value: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFfs(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsl(value: CLong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFfsl(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ffsll(value: CLonglong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFfsll(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fls(value: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFls(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsl(value: CLong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFlsl(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flsll(value: CLonglong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFlsll(value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: MutPtr<CVoid>, opt: ConstPtr<CChar>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(0L.toString(), cbopaque.rawAddress.toString(), opt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallctl(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMallctl(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<SizeT>, miplen: MutPtr<SizeT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMallctlnametomib(name.rawAddress.toString(), mibp.rawAddress.toString(), miplen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallctlbymib(mib: ConstPtr<SizeT>, mible: SizeT, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMallctlbymib(mib.rawAddress.toString(), mible.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocx(size: SizeT, flags: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdMallocx(size.toString(), flags).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdRallocx(ptr.rawAddress.toString(), size.toString(), flags).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xallocx(ptr: MutPtr<CVoid>, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdXallocx(ptr.rawAddress.toString(), size.toString(), extra.toString(), flags).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sallocx(ptr: ConstPtr<CVoid>, flags: CInt): SizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSallocx(ptr.rawAddress.toString(), flags).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dallocx(ptr: MutPtr<CVoid>, flags: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdDallocx(ptr.rawAddress.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sdallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdSdallocx(ptr.rawAddress.toString(), size.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdNallocx(size.toString(), flags).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdProcctl(idtype.toInt(), id.toString(), cmd, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesize(): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdGetpagesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdGetpagesizes(pagesize.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: MutPtr<ClockidT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(arg1.toString(), arg2, arg3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdStrchrnul(s.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmCreateLargepage(path: ConstPtr<CChar>, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(path.rawAddress.toString(), flags, psind, allocPolicy, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmRename(pathFrom: ConstPtr<CChar>, pathTo: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdShmRename(pathFrom.rawAddress.toString(), pathTo.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMemfdCreate(name.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setaudit(auditinfo: ConstPtr<AuditinfoT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSetaudit(auditinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdEventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdEventfdRead(fd, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr<CVoid>, buflen: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdElfAuxInfo(aux, buf.rawAddress.toString(), buflen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitleFast(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdSetproctitleFast(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun timingsafeBcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timingsafeMemcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umtxOp(obj: MutPtr<CVoid>, op: CInt, value: CUlong, uaddr: MutPtr<CVoid>, uaddr2: MutPtr<CVoid>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdUmtxOp(obj.rawAddress.toString(), op, value.toString(), uaddr.rawAddress.toString(), uaddr2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s, id.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpBindx(s: CInt, addrs: MutPtr<Sockaddr>, num: CInt, tpe: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSctpBindx(s, addrs.rawAddress.toString(), num, tpe) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpConnectx(s: CInt, addrs: ConstPtr<Sockaddr>, addrcnt: CInt, id: MutPtr<SctpAssocT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSctpConnectx(s, addrs.rawAddress.toString(), addrcnt, id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(s, asocid.toInt(), addrs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpFreepaddrs(addrs: MutPtr<Sockaddr>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(addrs.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(s, asocid.toInt(), addrs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpFreeladdrs(addrs: MutPtr<Sockaddr>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(addrs.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: MutPtr<CVoid>, size: MutPtr<SocklenT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSctpOptInfo(s, id.toInt(), opt, arg.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpSendv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, addrs: MutPtr<Sockaddr>, addrcnt: CInt, info: MutPtr<CVoid>, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSctpSendv(sd, iov.rawAddress.toString(), iovcnt, addrs.rawAddress.toString(), addrcnt, info.rawAddress.toString(), infolen.toInt(), infotype.toInt(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sctpRecvv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<SocklenT>, info: MutPtr<CVoid>, infolen: MutPtr<SocklenT>, infotype: MutPtr<CUint>, flags: MutPtr<CInt>): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdSctpRecvv(sd, iov.rawAddress.toString(), iovcnt, from.rawAddress.toString(), fromlen.rawAddress.toString(), info.rawAddress.toString(), infolen.rawAddress.toString(), infotype.rawAddress.toString(), flags.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimerfdGettime(fd, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closefrom(lowfd: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdClosefrom(lowfd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdCloseRange(lowfd.toInt(), highfd.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKcmp(pid1, pid2, type, idx1.toString(), idx2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdDlvsym(handle.rawAddress.toString(), symbol.rawAddress.toString(), version.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatStrerror(error: CInt): ConstPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) ConstPtr(wasmLibcUnixBsdFreebsdlikeFreebsdMemstatStrerror(error).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlAlloc(): MutPtr<MemoryTypeList> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFirst(list: MutPtr<MemoryTypeList>): MutPtr<MemoryType> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(list.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlNext(mtp: MutPtr<MemoryType>): MutPtr<MemoryType> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(mtp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFind(list: MutPtr<MemoryTypeList>, allocator: CInt, name: ConstPtr<CChar>): MutPtr<MemoryType> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(list.rawAddress.toString(), allocator, name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatMtlFree(list: MutPtr<MemoryTypeList>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(list.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memstatMtlGeterror(list: MutPtr<MemoryTypeList>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(list.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memstatGetName(mtp: ConstPtr<MemoryType>): ConstPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) ConstPtr(wasmLibcUnixBsdFreebsdlikeFreebsdMemstatGetName(mtp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmDpcpuSetcpu(kd: MutPtr<KvmT>, cpu: CUint): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(kd.rawAddress.toString(), cpu.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetargv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetargv(kd.rawAddress.toString(), p.rawAddress.toString(), nchr).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetcptime(kd: MutPtr<KvmT>, cpTime: MutPtr<CLong>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetcptime(kd.rawAddress.toString(), cpTime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetenvv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetenvv(kd.rawAddress.toString(), p.rawAddress.toString(), nchr).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGeterr(kd: MutPtr<KvmT>): MutPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdKvmGeterr(kd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetmaxcpu(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(kd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetncpus(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetncpus(kd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetpcpu(kd: MutPtr<KvmT>, cpu: CInt): MutPtr<CVoid> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(kd.rawAddress.toString(), cpu).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmCounterU64Fetch(kd: MutPtr<KvmT>, base: CUlong): ULong =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(kd.rawAddress.toString(), base.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmGetswapinfo(kd: MutPtr<KvmT>, info: MutPtr<KvmSwap>, maxswap: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(kd.rawAddress.toString(), info.rawAddress.toString(), maxswap, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNative(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmNative(kd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNlist(kd: MutPtr<KvmT>, nl: MutPtr<Nlist>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmNlist(kd.rawAddress.toString(), nl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmNlist2(kd: MutPtr<KvmT>, nl: MutPtr<KvmNlist>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmNlist2(kd.rawAddress.toString(), nl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmReadZpcpu(kd: MutPtr<KvmT>, base: CUlong, buf: MutPtr<CVoid>, size: SizeT, cpu: CInt): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(kd.rawAddress.toString(), base.toString(), buf.rawAddress.toString(), size.toString(), cpu).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kvmRead2(kd: MutPtr<KvmT>, addr: KvaddrT, buf: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKvmRead2(kd.rawAddress.toString(), addr.toString(), buf.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(attrnamespace, string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(string.rawAddress.toString(), attrnamespace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realhostname(host: MutPtr<CChar>, hsize: SizeT, ip: ConstPtr<InAddr>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdRealhostname(host.rawAddress.toString(), hsize.toString(), ip.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realhostnameSa(host: MutPtr<CChar>, hsize: SizeT, addr: MutPtr<Sockaddr>, addrlen: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdRealhostnameSa(host.rawAddress.toString(), hsize.toString(), addr.rawAddress.toString(), addrlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kldIsloaded(name: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKldIsloaded(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kldLoad(name: ConstPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdKldLoad(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<CInt>): MutPtr<KinfoVmentry> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(pid, cntp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hexdump(ptr: ConstPtr<CVoid>, length: CInt, hdr: ConstPtr<CChar>, flags: CInt) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdHexdump(ptr.rawAddress.toString(), length, hdr.rawAddress.toString(), flags)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun humanizeNumber(buf: MutPtr<CChar>, len: SizeT, number: Long, suffix: ConstPtr<CChar>, scale: CInt, flags: CInt): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdHumanizeNumber(buf.rawAddress.toString(), len.toString(), number.toString(), suffix.rawAddress.toString(), scale, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flopen(path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFlopen(path.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flopenat(fd: CInt, path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdFlopenat(fd, path.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlocalbase(): ConstPtr<CChar> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) ConstPtr(wasmLibcUnixBsdFreebsdlikeFreebsdGetlocalbase().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileOpen(path: ConstPtr<CChar>, mode: ModeT, pidptr: MutPtr<PidT>): MutPtr<Pidfh> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdPidfileOpen(path.rawAddress.toString(), mode.toInt(), pidptr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileWrite(path: MutPtr<Pidfh>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPidfileWrite(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileClose(path: MutPtr<Pidfh>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPidfileClose(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileRemove(path: MutPtr<Pidfh>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPidfileRemove(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pidfileFileno(path: ConstPtr<Pidfh>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdPidfileFileno(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenSysctl(): MutPtr<Procstat> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetfiles(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, mmapped: CInt): MutPtr<FilestatList> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(procstat.rawAddress.toString(), kp.rawAddress.toString(), mmapped).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreefiles(procstat: MutPtr<Procstat>, head: MutPtr<FilestatList>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(procstat.rawAddress.toString(), head.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetprocs(procstat: MutPtr<Procstat>, what: CInt, arg: CInt, count: MutPtr<CUint>): MutPtr<KinfoProc> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(procstat.rawAddress.toString(), what, arg, count.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreeprocs(procstat: MutPtr<Procstat>, p: MutPtr<KinfoProc>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(procstat.rawAddress.toString(), p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetvmmap(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<KinfoVmentry> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(procstat.rawAddress.toString(), kp.rawAddress.toString(), count.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatFreevmmap(procstat: MutPtr<Procstat>, vmmap: MutPtr<KinfoVmentry>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(procstat.rawAddress.toString(), vmmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatClose(procstat: MutPtr<Procstat>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdProcstatClose(procstat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeargv(procstat: MutPtr<Procstat>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(procstat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeenvv(procstat: MutPtr<Procstat>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(procstat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreegroups(procstat: MutPtr<Procstat>, groups: MutPtr<GidT>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(procstat.rawAddress.toString(), groups.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatFreeptlwpinfo(procstat: MutPtr<Procstat>, pl: MutPtr<PtraceLwpinfo>) {
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) {
        wasmLibcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(procstat.rawAddress.toString(), pl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun procstatGetargv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetargv(procstat.rawAddress.toString(), kp.rawAddress.toString(), nchr.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetenvv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(procstat.rawAddress.toString(), kp.rawAddress.toString(), nchr.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetgroups(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<GidT> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(procstat.rawAddress.toString(), kp.rawAddress.toString(), count.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetosrel(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, osrelp: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(procstat.rawAddress.toString(), kp.rawAddress.toString(), osrelp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetpathname(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, pathname: MutPtr<CChar>, maxlen: SizeT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(procstat.rawAddress.toString(), kp.rawAddress.toString(), pathname.rawAddress.toString(), maxlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetrlimit(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, which: CInt, rlimit: MutPtr<Rlimit>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(procstat.rawAddress.toString(), kp.rawAddress.toString(), which, rlimit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetumask(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, maskp: MutPtr<CUshort>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetumask(procstat.rawAddress.toString(), kp.rawAddress.toString(), maskp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenCore(filename: ConstPtr<CChar>): MutPtr<Procstat> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(filename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatOpenKvm(nlistf: ConstPtr<CChar>, memf: ConstPtr<CChar>): MutPtr<Procstat> =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) MutPtr(wasmLibcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(nlistf.rawAddress.toString(), memf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetSocketInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, sock: MutPtr<Sockstat>, errbuf: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), sock.rawAddress.toString(), errbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetVnodeInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, vn: MutPtr<Vnstat>, errbuf: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), vn.rawAddress.toString(), errbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetPtsInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, pts: MutPtr<Ptsstat>, errbuf: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), pts.rawAddress.toString(), errbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun procstatGetShmInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, shm: MutPtr<Shmstat>, errbuf: MutPtr<CChar>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(proc.rawAddress.toString(), fst.rawAddress.toString(), shm.rawAddress.toString(), errbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimerCreate(clockId, evp.rawAddress.toString(), timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimerDelete(timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimerGettime(timerid.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr<Itimerspec>, ovalue: MutPtr<Itimerspec>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdTimerSettime(timerid.rawAddress.toString(), flags, value.rawAddress.toString(), ovalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetnumdevs(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(kd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetgeneration(kd: MutPtr<KvmT>): CLong =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(kd.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatGetversion(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdDevstatGetversion(kd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatCheckversion(kd: MutPtr<KvmT>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(kd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatSelectdevs(devSelect: MutPtr<MutPtr<DeviceSelection>>, numSelected: MutPtr<CInt>, numSelections: MutPtr<CInt>, selectGeneration: MutPtr<CLong>, currentGeneration: CLong, devices: MutPtr<Devstat>, numdevs: CInt, matches: MutPtr<DevstatMatch>, numMatches: CInt, devSelections: MutPtr<MutPtr<CChar>>, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devstatBuildmatch(matchStr: MutPtr<CChar>, matches: MutPtr<MutPtr<DevstatMatch>>, numMatches: MutPtr<CInt>): CInt =
    if (unixBsdFreebsdlikeFreebsdNapiAvailable) wasmLibcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(matchStr.rawAddress.toString(), matches.rawAddress.toString(), numMatches.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
