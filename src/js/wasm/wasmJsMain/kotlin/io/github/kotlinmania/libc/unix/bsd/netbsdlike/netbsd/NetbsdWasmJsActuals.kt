@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixBsdNetbsdlikeNetbsdNapiAddon(): Boolean

private val _unixBsdNetbsdlikeNetbsdNapiAvailable: Boolean = _initUnixBsdNetbsdlikeNetbsdNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_clockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_reallocarr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_reallocarr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_chflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_chflags(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_fchflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_fchflags(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lchflags(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lchflags(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrListFd(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrListFd(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrListFile(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrListFile(p0: String?, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrListLink(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrListLink(p0: String?, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFd(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFd(p0: Int, p1: Int, p2: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFile(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFile(p0: String?, p1: Int, p2: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrDeleteLink(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrDeleteLink(p0: String?, p1: Int, p2: String?): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrGetFd(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrGetFd(p0: Int, p1: Int, p2: String?, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrGetFile(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrGetFile(p0: String?, p1: Int, p2: String?, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrGetLink(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrGetLink(p0: String?, p1: Int, p2: String?, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrNamespaceToString(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrNamespaceToString(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrSetFd(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrSetFd(p0: Int, p1: Int, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrSetFile(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrSetFile(p0: String?, p1: Int, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrSetLink(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrSetLink(p0: String?, p1: Int, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_extattrStringToNamespace(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrStringToNamespace(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_forkpty(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_forkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_ptsnameR(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_ptsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lutimes(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lutimes(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_sysctl(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_sysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_sysctlbyname(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_sysctlbyname(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_sysctlnametomib(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_sysctlnametomib(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_kevent(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_kevent(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mount(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mount(p0: String?, p1: String?, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqClose(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqGetattr(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqNotify(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqNotify(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqReceive(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqSend(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqSend(p0: String, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqSetattr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqTimedreceive(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqTimedsend(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqTimedsend(p0: String, p1: String?, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mqUnlink(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mqUnlink(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_ptrace(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_ptrace(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_utrace(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_utrace(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pthreadSetnameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadSetnameNp(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetNp(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pthreadGetattrNp(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetguardsize(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrSetguardsize(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pthreadGetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pthreadSetaffinityNp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_cpusetCreate()")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetCreate(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_cpusetDestroy(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetDestroy(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_cpusetClr(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetClr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_cpusetSet(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetSet(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_cpusetIsset(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetIsset(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_cpusetSize(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_cpusetZero(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetZero(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_sigwaitinfo(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_sigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_duplocale(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_duplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_freelocale(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_freelocale(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_localeconvL(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_localeconvL(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_newlocale(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_newlocale(p0: Int, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_settimeofday(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_settimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_dup3(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_dup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_kqueue1(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_kqueue1(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lwpSelf()")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lwpSelf(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_memmem(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_memmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_dlIteratePhdr(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_dlIteratePhdr(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_dlauxinfo()")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_dlauxinfo(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_iconvOpen(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_iconvOpen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_iconv(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_iconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_iconvClose(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_iconvClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_timerCreate(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_timerCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_timerDelete(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_timerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_timerGetoverrun(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_timerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_timerGettime(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_timerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_timerSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_timerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_dlvsym(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_dlvsym(p0: String, p1: String?, p2: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_explicitMemset(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_explicitMemset(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_consttimeMemequal(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_consttimeMemequal(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_setproctitle(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_setproctitle(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_mremap(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_mremap(p0: String, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_schedRrGetInterval(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_schedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_schedSetparam(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_schedGetparam(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_schedGetscheduler(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_schedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_pollts(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_pollts(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_reboot(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_reboot(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lwpPark(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lwpPark(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lwpUnpark(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lwpUnpark(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lwpUnparkAll(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lwpUnparkAll(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getmntinfo(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getmntinfo(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getvfsstat(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getvfsstat(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_eventfd(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_eventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_eventfdRead(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_eventfdRead(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_eventfdWrite(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_eventfdWrite(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_timerfdCreate(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_timerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_timerfdGettime(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_timerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_timerfdSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_timerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_qsortR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_qsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_aioRead(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_aioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_aioWrite(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_aioWrite(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_aioFsync(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_aioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_aioError(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_aioError(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_aioReturn(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_aioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_aioSuspend(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_aioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_aioCancel(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_aioCancel(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lioListio(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getpwentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getpwentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getgrentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getgrentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_efopen(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_efopen(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_emalloc(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_emalloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_ecalloc(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_ecalloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_erealloc(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_erealloc(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_ereallocarr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_ereallocarr(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_estrdup(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_estrdup(p0: String?): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_estrndup(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_estrndup(p0: String?, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_estrlcpy(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_estrlcpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_estrlcat(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_estrlcat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_estrtoi(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_estrtoi(p0: String?, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_estrtou(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_estrtou(p0: String?, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_easprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_easprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_evasprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_evasprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_esetfunc(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_esetfunc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_securePath(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_securePath(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_snprintb(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_snprintb(p0: String, p1: String, p2: String?, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_snprintbM(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_snprintbM(p0: String, p1: String, p2: String?, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getbootfile()")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getbootfile(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getbyteorder()")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getbyteorder(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getdiskrawname(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getdiskrawname(p0: String, p1: String, p2: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getdiskcookedname(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getdiskcookedname(p0: String, p1: String, p2: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getfsspecname(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getfsspecname(p0: String, p1: String, p2: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_strpct(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_strpct(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_strspct(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_strspct(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_login(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_login(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_loginx(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_loginx(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_logout(p0)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_logout(p0: String?)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_logoutx(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_logoutx(p0: String?, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_logwtmp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_logwtmp(p0: String?, p1: String?, p2: String?)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_logwtmpx(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_logwtmpx(p0: String?, p1: String?, p2: String?, p3: Int, p4: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_getxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_getxattr(p0: String?, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lgetxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lgetxattr(p0: String?, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_fgetxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_fgetxattr(p0: Int, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_setxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_setxattr(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lsetxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lsetxattr(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_fsetxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_fsetxattr(p0: Int, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_listxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_listxattr(p0: String?, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_llistxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_llistxattr(p0: String?, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_flistxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_flistxattr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_removexattr(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_removexattr(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_lremovexattr(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_lremovexattr(p0: String?, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_fremovexattr(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_fremovexattr(p0: Int, p1: String?, p2: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_stringToFlags(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_stringToFlags(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_flagsToString(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_flagsToString(p0: String, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_kinfoGetvmmap(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_kinfoGetvmmap(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_backtrace(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_backtrace(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbols(p0, p1)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_backtraceSymbols(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFd(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFd(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFmt(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFmt(p0: String, p1: String, p2: String?): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFdFmt(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFdFmt(p0: String, p1: String, p2: Int, p3: String?): Int

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarr(ptr: COpaquePointer?, number: SizeT, size: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_reallocarr((ptr?.value ?: 0L).toString(), number.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chflags(path: String?, flags: CUlong): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_chflags(path, flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_fchflags(fd, flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lchflags(path, flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrListFd(fd, attrnamespace, (data?.value ?: 0L).toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrListFile(path, attrnamespace, (data?.value ?: 0L).toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrListLink(path, attrnamespace, (data?.value ?: 0L).toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFd(fd, attrnamespace, attrname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrDeleteFile(path, attrnamespace, attrname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrDeleteLink(path, attrnamespace, attrname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrGetFd(fd, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrGetFile(path, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrGetLink(path, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrNamespaceToString(attrnamespace, (string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrSetFd(fd, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrSetFile(path, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrSetLink(path, attrnamespace, attrname, (data?.value ?: 0L).toString(), nbytes.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_extattrStringToNamespace(string, (attrnamespace?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lutimes(file, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_sysctl((name?.value ?: 0L).toString(), namelen.toInt(), (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_sysctlbyname(name, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctlnametomib(sname: String?, name: COpaquePointer?, namelenp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_sysctlnametomib(sname, (name?.value ?: 0L).toString(), (namelenp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: SizeT, eventlist: COpaquePointer?, nevents: SizeT, timeout: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_kevent(kq, (changelist?.value ?: 0L).toString(), nchanges.toString(), (eventlist?.value ?: 0L).toString(), nevents.toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mount(src, target, flags, (data?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqClose(mqd.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqGetattr(mqd.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqNotify(mqd.toLong().toString(), (notification?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqReceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqSend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqSetattr(mqd.toLong().toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqTimedreceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqTimedsend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mqUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_ptrace(request, pid, (addr?.value ?: 0L).toString(), data) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_utrace(label, (addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(t: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadGetnameNp(t.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadSetnameNp(t.toLong().toString(), name, (arg?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetNp(thread.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadGetattrNp(native.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadGetaffinityNp(thread.toLong().toString(), size.toString(), (set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pthreadSetaffinityNp(thread.toLong().toString(), size.toString(), (set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetCreate(): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetCreate().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetDestroy(set: COpaquePointer?) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetDestroy((set?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cpusetClr(cpu: CpuidT, set: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetClr(cpu.toString(), (set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSet(cpu: CpuidT, set: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetSet(cpu.toString(), (set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetIsset(cpu: CpuidT, set: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetIsset(cpu.toString(), (set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetSize(set: COpaquePointer?): SizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetSize((set?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cpusetZero(set: COpaquePointer?) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_cpusetZero((set?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_duplocale((base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun localeconvL(loc: LocaleT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_localeconvL((loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_newlocale(mask, locale, (base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_dup3(src, dst, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kqueue1(flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_kqueue1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpSelf(): LwpidT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lwpSelf() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlauxinfo(): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_dlauxinfo().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_iconvOpen(tocode, fromcode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_iconvClose((cd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_timerCreate(clockid, (sevp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_timerDelete(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_timerGetoverrun(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_timerGettime(timerid.toLong().toString(), (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_timerSettime(timerid.toLong().toString(), flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_dlvsym((handle?.value ?: 0L).toString(), symbol, version).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitMemset(b: COpaquePointer?, c: CInt, len: SizeT) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_explicitMemset((b?.value ?: 0L).toString(), c, len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_consttimeMemequal((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_setproctitle(fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mremap(oldp: COpaquePointer?, oldsize: SizeT, newp: COpaquePointer?, newsize: SizeT, flags: CInt): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_mremap((oldp?.value ?: 0L).toString(), oldsize.toString(), (newp?.value ?: 0L).toString(), newsize.toString(), flags).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_schedRrGetInterval(pid, (t?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pollts(fds: COpaquePointer?, nfds: NfdsT, ts: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_pollts((fds?.value ?: 0L).toString(), nfds.toInt(), (ts?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(mode: CInt, bootstr: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_reboot(mode, (bootstr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: COpaquePointer?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lwpPark(clock, flags, (ts?.value ?: 0L).toString(), unpark, (hint?.value ?: 0L).toString(), (unparkhint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lwpUnpark(lwp, (hint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lwpUnparkAll(targets: COpaquePointer?, ntargets: SizeT, hint: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lwpUnparkAll((targets?.value ?: 0L).toString(), ntargets.toString(), (hint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getmntinfo((mntbufp?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getvfsstat(buf: COpaquePointer?, bufsize: SizeT, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getvfsstat((buf?.value ?: 0L).toString(), bufsize.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_eventfd(value.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(efd: CInt, valp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_eventfdRead(efd, (valp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_eventfdWrite(efd, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_timerfdCreate(clockid, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_timerfdGettime(fd, (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_aioRead((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_aioWrite((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_aioFsync(op, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_aioError((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_aioReturn((aiocbp?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getgrentR((grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun efopen(p: String?, m: String?): FILE =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) FILE(_wasm_libc_unix_bsd_netbsdlike_netbsd_efopen(p, m).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun emalloc(n: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_emalloc(n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ecalloc(n: SizeT, c: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_ecalloc(n.toString(), c.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erealloc(p: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_erealloc((p?.value ?: 0L).toString(), n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ereallocarr(p: COpaquePointer?, n: SizeT, s: SizeT) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_ereallocarr((p?.value ?: 0L).toString(), n.toString(), s.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun estrdup(s: String?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_estrdup(s).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrndup(s: String?, len: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_estrndup(s, len.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrlcpy(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_estrlcpy((dst?.value ?: 0L).toString(), src, len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrlcat(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_estrlcat((dst?.value ?: 0L).toString(), src, len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrtoi(nptr: String?, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_estrtoi(nptr, base, lo.toString(), hi.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun estrtou(nptr: String?, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_estrtou(nptr, base, lo.toString(), hi.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun easprintf(string: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_easprintf((string?.value ?: 0L).toString(), fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evasprintf(string: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_evasprintf((string?.value ?: 0L).toString(), fmt, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun securePath(path: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_securePath(path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintb(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_snprintb((buf?.value ?: 0L).toString(), buflen.toString(), fmt, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintbM(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong, max: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_snprintbM((buf?.value ?: 0L).toString(), buflen.toString(), fmt, value.toString(), max.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getbootfile(): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getbootfile().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getbyteorder(): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getbyteorder() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdiskrawname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getdiskrawname((buf?.value ?: 0L).toString(), buflen.toString(), name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdiskcookedname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getdiskcookedname((buf?.value ?: 0L).toString(), buflen.toString(), name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getfsspecname(buf: COpaquePointer?, buflen: SizeT, spec: String?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getfsspecname((buf?.value ?: 0L).toString(), buflen.toString(), spec).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpct(buf: COpaquePointer?, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_strpct((buf?.value ?: 0L).toString(), bufsiz.toString(), numerator.toString(), denominator.toString(), precision.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspct(buf: COpaquePointer?, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_strspct((buf?.value ?: 0L).toString(), bufsiz.toString(), numerator.toString(), denominator.toString(), precision.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun login(ut: COpaquePointer?) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_login((ut?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun loginx(ut: COpaquePointer?) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_loginx((ut?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logout(line: String?) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_logout(line)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logoutx(line: String?, status: CInt, tpe: CInt) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_logoutx(line, status, tpe)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logwtmp(line: String?, name: String?, host: String?) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_logwtmp(line, name, host)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt) {
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) {
        _wasm_libc_unix_bsd_netbsdlike_netbsd_logwtmpx(line, name, host, status, tpe)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_getxattr(path, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lgetxattr(path, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_fgetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_setxattr(path, name, (value?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lsetxattr(path, name, (value?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_fsetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_listxattr(path, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_llistxattr(path, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_flistxattr(filedes, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: String?, name: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_removexattr(path, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_lremovexattr(path, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(fd: CInt, path: String?, name: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_fremovexattr(fd, path, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringToFlags(stringP: COpaquePointer?, setp: COpaquePointer?, clrp: COpaquePointer?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_stringToFlags((stringP?.value ?: 0L).toString(), (setp?.value ?: 0L).toString(), (clrp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flagsToString(flags: CUlong, def: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_flagsToString(flags.toString(), def) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_kinfoGetvmmap(pid, (cntp?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_backtrace((addrlist?.value ?: 0L).toString(), len.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_backtraceSymbols((addrlist?.value ?: 0L).toString(), len.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFd((addrlist?.value ?: 0L).toString(), len.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFmt((addrlist?.value ?: 0L).toString(), len.toString(), fmt).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: SizeT, fd: CInt, fmt: String?): CInt =
    if (_unixBsdNetbsdlikeNetbsdNapiAvailable) _wasm_libc_unix_bsd_netbsdlike_netbsd_backtraceSymbolsFdFmt((addrlist?.value ?: 0L).toString(), len.toString(), fd, fmt) else throw UnsupportedOperationException("Native FFI addon is not available")
