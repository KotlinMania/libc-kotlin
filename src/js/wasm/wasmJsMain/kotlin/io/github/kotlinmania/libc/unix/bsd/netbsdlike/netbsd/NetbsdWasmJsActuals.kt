@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.statvfs.Statvfs
import io.github.kotlinmania.libc.new.netbsd.sys.time.Itimerspec
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.new.netbsd.utmp.Utmp
import io.github.kotlinmania.libc.new.netbsd.utmpx.Utmpx
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.Passwd
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixBsdNetbsdlikeNetbsdNapiAddon(): Boolean

private val unixBsdNetbsdlikeNetbsdNapiAvailable: Boolean = initUnixBsdNetbsdlikeNetbsdNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdClockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdReallocarr(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdReallocarr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdChflags(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdChflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdFchflags(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdFchflags(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLchflags(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLchflags(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrListFd(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrListFd(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrListFile(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrListFile(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrListLink(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrListLink(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrGetFd(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrGetFd(p0: Int, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrGetFile(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrGetFile(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrGetLink(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrGetLink(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrSetFd(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrSetFd(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrSetFile(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrSetFile(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrSetLink(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrSetLink(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPtsnameR(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPtsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLutimes(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLutimes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGettimeofday(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMprotect(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSysctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSysctlbyname(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSysctlbyname(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSysctlnametomib(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSysctlnametomib(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdKevent(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdKevent(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMount(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMount(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqClose(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqGetattr(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqNotify(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqNotify(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqReceive(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqSend(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqSend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqSetattr(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqTimedreceive(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqTimedsend(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqTimedsend(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMqUnlink(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMqUnlink(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPtrace(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPtrace(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdUtrace(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdUtrace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdCpusetCreate()")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdCpusetCreate(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdCpusetDestroy(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdCpusetDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdCpusetClr(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdCpusetClr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdCpusetSet(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdCpusetSet(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdCpusetIsset(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdCpusetIsset(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdCpusetSize(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdCpusetSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdCpusetZero(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdCpusetZero(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSigwaitinfo(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdDuplocale(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdDuplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdFreelocale(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdFreelocale(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLocaleconvL(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLocaleconvL(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdNewlocale(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSettimeofday(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdDup3(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdDup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdKqueue1(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdKqueue1(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLwpSelf()")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLwpSelf(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdDlauxinfo()")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdDlauxinfo(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdIconvOpen(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdIconvOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdIconv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdIconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdIconvClose(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdIconvClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdTimerCreate(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdTimerCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdTimerDelete(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdTimerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdTimerGettime(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdTimerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdTimerSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdTimerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdDlvsym(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdDlvsym(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdExplicitMemset(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdExplicitMemset(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSetproctitle(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSetproctitle(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdMremap(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdMremap(p0: String, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSchedSetparam(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSchedGetparam(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdPollts(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdPollts(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdReboot(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdReboot(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLwpPark(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLwpPark(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLwpUnpark(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLwpUnpark(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetmntinfo(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetmntinfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetvfsstat(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetvfsstat(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEventfd(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEventfdRead(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEventfdRead(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEventfdWrite(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEventfdWrite(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdTimerfdCreate(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdTimerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdTimerfdGettime(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdTimerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdTimerfdSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdTimerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdQsortR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdQsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdAioRead(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdAioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdAioWrite(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdAioWrite(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdAioFsync(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdAioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdAioError(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdAioError(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdAioReturn(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdAioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdAioSuspend(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdAioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdAioCancel(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdAioCancel(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLioListio(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetpwentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetpwentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetgrentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetgrentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEmalloc(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEmalloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEcalloc(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEcalloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdErealloc(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdErealloc(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEreallocarr(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEreallocarr(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEstrdup(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEstrdup(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEstrndup(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEstrndup(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEstrlcpy(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEstrlcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEstrlcat(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEstrlcat(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEstrtoi(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEstrtoi(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEstrtou(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEstrtou(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEasprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEasprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEvasprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEvasprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdEsetfunc(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdEsetfunc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSecurePath(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSecurePath(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSnprintb(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSnprintb(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSnprintbM(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSnprintbM(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetbootfile()")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetbootfile(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetbyteorder()")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetbyteorder(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetdiskrawname(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetdiskrawname(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetfsspecname(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetfsspecname(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdStrpct(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdStrpct(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdStrspct(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdStrspct(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLogin(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLogin(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLoginx(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLoginx(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLogout(p0)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLogout(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLogoutx(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLogoutx(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLogwtmp(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLogwtmp(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLogwtmpx(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLogwtmpx(p0: String, p1: String, p2: String, p3: Int, p4: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdGetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdGetxattr(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLgetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLgetxattr(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdFgetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdFgetxattr(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdSetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdSetxattr(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLsetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLsetxattr(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdFsetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdFsetxattr(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdListxattr(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdListxattr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLlistxattr(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLlistxattr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdFlistxattr(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdFlistxattr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdRemovexattr(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdRemovexattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdLremovexattr(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdLremovexattr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdFremovexattr(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdFremovexattr(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdStringToFlags(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdStringToFlags(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdFlagsToString(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdFlagsToString(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdBacktrace(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdBacktrace(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(p0, p1)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(p0, p1, p2)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(p0, p1, p2, p3)")
private external fun wasmLibcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(p0: String, p1: String, p2: Int, p3: String): Int

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarr(ptr: MutPtr<CVoid>, number: SizeT, size: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdReallocarr(ptr.rawAddress.toString(), number.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdChflags(path.rawAddress.toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdFchflags(fd, flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLchflags(path.rawAddress.toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrListFd(fd, attrnamespace, data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrListFile(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrListLink(path.rawAddress.toString(), attrnamespace, data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrGetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrGetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(attrnamespace, string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrSetFile(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrSetLink(path.rawAddress.toString(), attrnamespace, attrname.rawAddress.toString(), data.rawAddress.toString(), nbytes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(string.rawAddress.toString(), attrnamespace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLutimes(file.rawAddress.toString(), times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSysctl(name.rawAddress.toString(), namelen.toInt(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSysctlbyname(name.rawAddress.toString(), oldp.rawAddress.toString(), oldlenp.rawAddress.toString(), newp.rawAddress.toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(sname: ConstPtr<CChar>, name: MutPtr<CInt>, namelenp: MutPtr<SizeT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSysctlnametomib(sname.rawAddress.toString(), name.rawAddress.toString(), namelenp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: SizeT, eventlist: MutPtr<Kevent>, nevents: SizeT, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdKevent(kq, changelist.rawAddress.toString(), nchanges.toString(), eventlist.rawAddress.toString(), nevents.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>, size: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMount(src.rawAddress.toString(), target.rawAddress.toString(), flags, data.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqClose(mqd.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqNotify(mqd.toLong().toString(), notification.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdMqUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CVoid>, data: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPtrace(request, pid, addr.rawAddress.toString(), data) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utrace(label: ConstPtr<CChar>, addr: MutPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdUtrace(label.rawAddress.toString(), addr.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(t: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(t.toLong().toString(), name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(t: PthreadT, name: ConstPtr<CChar>, arg: ConstPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(t.toLong().toString(), name.rawAddress.toString(), arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(thread.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(native.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(thread.toLong().toString(), size.toString(), set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(thread.toLong().toString(), size.toString(), set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetCreate(): MutPtr<CpusetT> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdCpusetCreate().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetDestroy(set: MutPtr<CpusetT>) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdCpusetDestroy(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cpusetClr(cpu: CpuidT, set: MutPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdCpusetClr(cpu.toString(), set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSet(cpu: CpuidT, set: MutPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdCpusetSet(cpu.toString(), set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetIsset(cpu: CpuidT, set: ConstPtr<CpusetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdCpusetIsset(cpu.toString(), set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSize(set: ConstPtr<CpusetT>): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdCpusetSize(set.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetZero(set: MutPtr<CpusetT>) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdCpusetZero(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun localeconvL(loc: LocaleT): MutPtr<Lconv> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdLocaleconvL(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdDup3(src, dst, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kqueue1(flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdKqueue1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpSelf(): LwpidT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLwpSelf() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlauxinfo(): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdDlauxinfo().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdIconvClose(cd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdTimerCreate(clockid, sevp.rawAddress.toString(), timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdTimerDelete(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdTimerGettime(timerid.toLong().toString(), currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdTimerSettime(timerid.toLong().toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdDlvsym(handle.rawAddress.toString(), symbol.rawAddress.toString(), version.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitMemset(b: MutPtr<CVoid>, c: CInt, len: SizeT) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdExplicitMemset(b.rawAddress.toString(), c, len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun consttimeMemequal(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(a.rawAddress.toString(), b.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdSetproctitle(fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mremap(oldp: MutPtr<CVoid>, oldsize: SizeT, newp: MutPtr<CVoid>, newsize: SizeT, flags: CInt): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdMremap(oldp.rawAddress.toString(), oldsize.toString(), newp.rawAddress.toString(), newsize.toString(), flags).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(pid, t.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollts(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdPollts(fds.rawAddress.toString(), nfds.toInt(), ts.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(mode: CInt, bootstr: MutPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdReboot(mode, bootstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: ConstPtr<Timespec>, unpark: LwpidT, hint: ConstPtr<CVoid>, unparkhint: MutPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLwpPark(clock, flags, ts.rawAddress.toString(), unpark, hint.rawAddress.toString(), unparkhint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpUnpark(lwp: LwpidT, hint: ConstPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLwpUnpark(lwp, hint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpUnparkAll(targets: ConstPtr<LwpidT>, ntargets: SizeT, hint: ConstPtr<CVoid>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(targets.rawAddress.toString(), ntargets.toString(), hint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdGetmntinfo(mntbufp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getvfsstat(buf: MutPtr<Statvfs>, bufsize: SizeT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdGetvfsstat(buf.rawAddress.toString(), bufsize.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdEventfd(value.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(efd: CInt, valp: MutPtr<EventfdT>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdEventfdRead(efd, valp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdTimerfdGettime(fd, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdQsortR(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdAioRead(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdAioWrite(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdAioFsync(op, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdAioError(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdAioReturn(aiocbp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdAioCancel(fd, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun efopen(p: ConstPtr<CChar>, m: ConstPtr<CChar>): FILE =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun emalloc(n: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdEmalloc(n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecalloc(n: SizeT, c: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdEcalloc(n.toString(), c.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erealloc(p: MutPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdErealloc(p.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ereallocarr(p: MutPtr<CVoid>, n: SizeT, s: SizeT) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdEreallocarr(p.rawAddress.toString(), n.toString(), s.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun estrdup(s: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdEstrdup(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrndup(s: ConstPtr<CChar>, len: SizeT): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdEstrndup(s.rawAddress.toString(), len.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrlcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdEstrlcpy(dst.rawAddress.toString(), src.rawAddress.toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrlcat(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdEstrlcat(dst.rawAddress.toString(), src.rawAddress.toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrtoi(nptr: ConstPtr<CChar>, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdEstrtoi(nptr.rawAddress.toString(), base, lo.toString(), hi.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrtou(nptr: ConstPtr<CChar>, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdEstrtou(nptr.rawAddress.toString(), base, lo.toString(), hi.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun easprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdEasprintf(string.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evasprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdEvasprintf(string.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun securePath(path: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSecurePath(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintb(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSnprintb(buf.rawAddress.toString(), buflen.toString(), fmt.rawAddress.toString(), value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintbM(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong, max: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSnprintbM(buf.rawAddress.toString(), buflen.toString(), fmt.rawAddress.toString(), value.toString(), max.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getbootfile(): ConstPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) ConstPtr(wasmLibcUnixBsdNetbsdlikeNetbsdGetbootfile().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getbyteorder(): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdGetbyteorder() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdiskrawname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) ConstPtr(wasmLibcUnixBsdNetbsdlikeNetbsdGetdiskrawname(buf.rawAddress.toString(), buflen.toString(), name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdiskcookedname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) ConstPtr(wasmLibcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(buf.rawAddress.toString(), buflen.toString(), name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsspecname(buf: MutPtr<CChar>, buflen: SizeT, spec: ConstPtr<CChar>): ConstPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) ConstPtr(wasmLibcUnixBsdNetbsdlikeNetbsdGetfsspecname(buf.rawAddress.toString(), buflen.toString(), spec.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdStrpct(buf.rawAddress.toString(), bufsiz.toString(), numerator.toString(), denominator.toString(), precision.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): MutPtr<CChar> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdStrspct(buf.rawAddress.toString(), bufsiz.toString(), numerator.toString(), denominator.toString(), precision.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun login(ut: ConstPtr<Utmp>) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdLogin(ut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun loginx(ut: ConstPtr<Utmpx>) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdLoginx(ut.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logout(line: ConstPtr<CChar>) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdLogout(line.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logoutx(line: ConstPtr<CChar>, status: CInt, tpe: CInt) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdLogoutx(line.rawAddress.toString(), status, tpe)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logwtmp(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdLogwtmp(line.rawAddress.toString(), name.rawAddress.toString(), host.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logwtmpx(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>, status: CInt, tpe: CInt) {
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) {
        wasmLibcUnixBsdNetbsdlikeNetbsdLogwtmpx(line.rawAddress.toString(), name.rawAddress.toString(), host.rawAddress.toString(), status, tpe)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLgetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLsetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLlistxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdFlistxattr(filedes, list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdRemovexattr(path.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdLremovexattr(path.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(fd: CInt, path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdFremovexattr(fd, path.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringToFlags(stringP: MutPtr<MutPtr<CChar>>, setp: MutPtr<CUlong>, clrp: MutPtr<CUlong>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdStringToFlags(stringP.rawAddress.toString(), setp.rawAddress.toString(), clrp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flagsToString(flags: CUlong, def: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdFlagsToString(flags.toString(), def.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<SizeT>): MutPtr<KinfoVmentry> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(pid, cntp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdBacktrace(addrlist.rawAddress.toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(addrlist.rawAddress.toString(), len.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(addrlist.rawAddress.toString(), len.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fmt: ConstPtr<CChar>): MutPtr<MutPtr<CChar>> =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) MutPtr(wasmLibcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(addrlist.rawAddress.toString(), len.toString(), fmt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFdFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt, fmt: ConstPtr<CChar>): CInt =
    if (unixBsdNetbsdlikeNetbsdNapiAvailable) wasmLibcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(addrlist.rawAddress.toString(), len.toString(), fd, fmt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
