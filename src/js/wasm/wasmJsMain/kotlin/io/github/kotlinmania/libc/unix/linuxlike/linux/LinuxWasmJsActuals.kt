@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.Fpos64T
import io.github.kotlinmania.libc.unix.linuxlike.Itimerspec
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sembuf
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Spwd
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.MsqidDs
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SiginfoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.StackT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeLinuxNapiAddon(): Boolean

private val unixLinuxlikeLinuxNapiAvailable: Boolean = initUnixLinuxlikeLinuxNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGetspnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGetspnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeLinuxMqOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMqClose(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMqClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMqUnlink(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxMqUnlink(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMqReceive(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMqTimedreceive(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMqSend(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMqSend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMqTimedsend(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMqTimedsend(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMqGetattr(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMqSetattr(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMrand48()")
private external fun wasmLibcUnixLinuxlikeLinuxMrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSeed48(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxSeed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxLcong48(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxLcong48(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxLutimes(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxLutimes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxShmUnlink(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFtok(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxFtok(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSemget(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxSemget(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSemop(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxSemop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSemctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixLinuxlikeLinuxSemctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMsgctl(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMsgctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMsgget(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMsgget(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMsgrcv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxMsgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMsgsnd(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxMsgsnd(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFallocate(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxFallocate(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxReadahead(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxReadahead(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGetxattr(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxLgetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxLgetxattr(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFgetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxFgetxattr(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxSetxattr(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxLsetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxLsetxattr(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFsetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxFsetxattr(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxListxattr(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxListxattr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxLlistxattr(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxLlistxattr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFlistxattr(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxFlistxattr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxRemovexattr(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxRemovexattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxLremovexattr(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxLremovexattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFremovexattr(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxFremovexattr(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSignalfd(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxSignalfd(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxTimerfdCreate(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxTimerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxTimerfdGettime(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxTimerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxTimerfdSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxTimerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxQuotactl(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxQuotactl(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxEpollPwait(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxEpollPwait(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxDup3(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxDup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSigwaitinfo(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxSigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxAccept4(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxAccept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxReboot(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxReboot(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSetfsgid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxSetfsgid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSetfsuid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxSetfsuid(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSyncFileRange(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxSyncFileRange(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxRemapFilePages(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxRemapFilePages(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxMkstemps(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxMkstemps(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxVhangup()")
private external fun wasmLibcUnixLinuxlikeLinuxVhangup(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSync()")
private external fun wasmLibcUnixLinuxlikeLinuxSync()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSyncfs(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxSyncfs(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSyscall(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxSyscall(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSchedSetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxSchedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxEpollCreate(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxEpollCreate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxEpollCreate1(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxEpollCreate1(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxEpollWait(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxEpollWait(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxEpollCtl(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxEpollCtl(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUnshare(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxUnshare(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUmount(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxUmount(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxTee(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxTee(p0: Int, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSplice(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxSplice(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxEventfd(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxEventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxEventfdRead(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxEventfdRead(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxEventfdWrite(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxEventfdWrite(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSchedRrGetInterval(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxSchedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSchedSetparam(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSetns(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxSetns(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSwapoff(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxSwapoff(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxVmsplice(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxVmsplice(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPersonality(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxPersonality(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSchedGetparam(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxClone(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmLibcUnixLinuxlikeLinuxClone(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSchedGetscheduler(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxSchedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxClockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUmount2(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxUmount2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSwapon(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxSwapon(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSendfile(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxSendfile(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSigaltstack(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxSigaltstack(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGetdtablesize()")
private external fun wasmLibcUnixLinuxlikeLinuxGetdtablesize(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrInit(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFreadUnlocked(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxFreadUnlocked(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxInotifyRmWatch(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxInotifyRmWatch(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxInotifyInit()")
private external fun wasmLibcUnixLinuxlikeLinuxInotifyInit(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxInotifyInit1(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxInotifyInit1(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxInotifyAddWatch(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxInotifyAddWatch(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFanotifyInit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxFanotifyInit(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGethostid()")
private external fun wasmLibcUnixLinuxlikeLinuxGethostid(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxKlogctl(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxKlogctl(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFallocate64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxFallocate64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFgetpos64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxFgetpos64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxFopen64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxFopen64(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxPosixFallocate64(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxPosixFallocate64(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxSendfile64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxSendfile64(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxTmpfile64()")
private external fun wasmLibcUnixLinuxlikeLinuxTmpfile64(): String

public actual fun getspnamR(name: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxGetspnamR(name.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMqClose(mqd.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMqUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    if (unixLinuxlikeLinuxNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxSeed48(xseed.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr<CUshort>) {
    if (unixLinuxlikeLinuxNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxLutimes(file.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFtok(pathname.rawAddress.toString(), projId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSemget(key, nsems, semflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSemop(semid, sops.rawAddress.toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMsgctl(msqid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMsgget(key, msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMsgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFallocate(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxReadahead(fd, offset.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxLgetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxLsetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxLlistxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFlistxattr(filedes, list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxRemovexattr(path.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxLremovexattr(path.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFremovexattr(filedes, name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSignalfd(fd, mask.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxTimerfdCreate(clockid, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxTimerfdGettime(fd, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: CInt, special: ConstPtr<CChar>, id: CInt, data: MutPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxQuotactl(cmd, special.rawAddress.toString(), id, data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxEpollPwait(epfd, events.rawAddress.toString(), maxevents, timeout, sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxDup3(oldfd, newfd, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxAccept4(fd, addr.rawAddress.toString(), len.rawAddress.toString(), flg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxReboot(howTo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSetfsgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSetfsuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSyncFileRange(fd, offset.toString(), nbytes.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remapFilePages(addr: MutPtr<CVoid>, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxRemapFilePages(addr.rawAddress.toString(), size.toString(), prot, pgoff.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxMkstemps(template.rawAddress.toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxVhangup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixLinuxlikeLinuxNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSyncfs(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSyscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxEpollCreate(size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxEpollCreate1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxEpollWait(epfd, events.rawAddress.toString(), maxevents, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxEpollCtl(epfd, op, fd, event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unshare(flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxUnshare(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxUmount(target.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxTee(fdIn, fdOut, len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSplice(fdIn, offIn.rawAddress.toString(), fdOut, offOut.rawAddress.toString(), len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxEventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxEventfdRead(fd, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxEventfdWrite(fd, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSchedRrGetInterval(pid, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSetns(fd, nstype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSwapoff(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxVmsplice(fd, iov.rawAddress.toString(), nrSegs.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUlong): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPersonality(persona.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxClone(0L.toString(), childStack.rawAddress.toString(), flags, arg.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxUmount2(target.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSwapon(path.rawAddress.toString(), swapflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSendfile(outFd, inFd, offset.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsInit(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFreadUnlocked(buf.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxInotifyRmWatch(fd, wd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit(): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxInotifyInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit1(flags: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxInotifyInit1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxInotifyAddWatch(fd, path.rawAddress.toString(), mask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFanotifyInit(flags.toInt(), eventFFlags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxGethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun klogctl(syslogType: CInt, bufp: MutPtr<CChar>, len: CInt): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxKlogctl(syslogType, bufp.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFallocate64(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxFgetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixLinuxlikeLinuxNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxFopen64(filename.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxPosixFallocate64(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT =
    if (unixLinuxlikeLinuxNapiAvailable) wasmLibcUnixLinuxlikeLinuxSendfile64(outFd, inFd, offset.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile64(): MutPtr<FILE> =
    if (unixLinuxlikeLinuxNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxTmpfile64().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
