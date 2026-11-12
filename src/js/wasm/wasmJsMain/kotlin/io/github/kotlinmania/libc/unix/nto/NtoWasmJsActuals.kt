@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixNtoNapiAddon(): Boolean

private val unixNtoNapiAvailable: Boolean = initUnixNtoNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoGetSYSPAGEPTR()")
private external fun wasmLibcUnixNtoGetSYSPAGEPTR(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoSetSYSPAGEPTR(p0)")
private external fun wasmLibcUnixNtoSetSYSPAGEPTR(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoSendmmsg(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoSendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoRecvmmsg(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoRecvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoSemDestroy(p0)")
private external fun wasmLibcUnixNtoSemDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoSemInit(p0, p1, p2)")
private external fun wasmLibcUnixNtoSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoFdatasync(p0)")
private external fun wasmLibcUnixNtoFdatasync(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoGetpriority(p0, p1)")
private external fun wasmLibcUnixNtoGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixNtoSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixNtoMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoMknodat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoClockGetres(p0, p1)")
private external fun wasmLibcUnixNtoClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoClockGettime(p0, p1)")
private external fun wasmLibcUnixNtoClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoClockSettime(p0, p1)")
private external fun wasmLibcUnixNtoClockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoClockGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixNtoClockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcUnixNtoPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoMemalign(p0, p1)")
private external fun wasmLibcUnixNtoMemalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSetgroups(p0, p1)")
private external fun wasmLibcUnixNtoSetgroups(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoPosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoPosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoFutimens(p0, p1)")
private external fun wasmLibcUnixNtoFutimens(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoNlLanginfo(p0)")
private external fun wasmLibcUnixNtoNlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcUnixNtoPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixNtoPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadCondattrSetpshared(p0, p1)")
private external fun wasmLibcUnixNtoPthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadMutexattrSetpshared(p0, p1)")
private external fun wasmLibcUnixNtoPthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadRwlockattrGetpshared(p0, p1)")
private external fun wasmLibcUnixNtoPthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadRwlockattrSetpshared(p0, p1)")
private external fun wasmLibcUnixNtoPthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPtsnameR(p0, p1, p2)")
private external fun wasmLibcUnixNtoPtsnameR(p0: Int, p1: String, p2: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoClearenv()")
private external fun wasmLibcUnixNtoClearenv(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoWaitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoWait4(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoWait4(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoExecvpe(p0, p1, p2)")
private external fun wasmLibcUnixNtoExecvpe(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoGetifaddrs(p0)")
private external fun wasmLibcUnixNtoGetifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoFreeifaddrs(p0)")
private external fun wasmLibcUnixNtoFreeifaddrs(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoBind(p0, p1, p2)")
private external fun wasmLibcUnixNtoBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoWritev(p0, p1, p2)")
private external fun wasmLibcUnixNtoWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoReadv(p0, p1, p2)")
private external fun wasmLibcUnixNtoReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixNtoSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixNtoRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoLoginTty(p0)")
private external fun wasmLibcUnixNtoLoginTty(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoUname(p0)")
private external fun wasmLibcUnixNtoUname(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoGetpeereid(p0, p1, p2)")
private external fun wasmLibcUnixNtoGetpeereid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixNtoStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoAbs(p0)")
private external fun wasmLibcUnixNtoAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoLabs(p0)")
private external fun wasmLibcUnixNtoLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoRand()")
private external fun wasmLibcUnixNtoRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoSrand(p0)")
private external fun wasmLibcUnixNtoSrand(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoSetpwent()")
private external fun wasmLibcUnixNtoSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoEndpwent()")
private external fun wasmLibcUnixNtoEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoGetpwent()")
private external fun wasmLibcUnixNtoGetpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoSetgrent()")
private external fun wasmLibcUnixNtoSetgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoEndgrent()")
private external fun wasmLibcUnixNtoEndgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoGetgrent()")
private external fun wasmLibcUnixNtoGetgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoSetspent()")
private external fun wasmLibcUnixNtoSetspent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoEndspent()")
private external fun wasmLibcUnixNtoEndspent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixNtoShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoFtok(p0, p1)")
private external fun wasmLibcUnixNtoFtok(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoMprotect(p0, p1, p2)")
private external fun wasmLibcUnixNtoMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixNtoPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoMkostemp(p0, p1)")
private external fun wasmLibcUnixNtoMkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoMkostemps(p0, p1, p2)")
private external fun wasmLibcUnixNtoMkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixNtoSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSigwaitinfo(p0, p1)")
private external fun wasmLibcUnixNtoSigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadSetschedprio(p0, p1)")
private external fun wasmLibcUnixNtoPthreadSetschedprio(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoIfNameindex()")
private external fun wasmLibcUnixNtoIfNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoIfFreenameindex(p0)")
private external fun wasmLibcUnixNtoIfFreenameindex(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoGlob(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoGlob(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoGlobfree(p0)")
private external fun wasmLibcUnixNtoGlobfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPosixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixNtoPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoShmUnlink(p0)")
private external fun wasmLibcUnixNtoShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSeekdir(p0, p1)")
private external fun wasmLibcUnixNtoSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoTelldir(p0)")
private external fun wasmLibcUnixNtoTelldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoMsync(p0, p1, p2)")
private external fun wasmLibcUnixNtoMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoMkstemps(p0, p1)")
private external fun wasmLibcUnixNtoMkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoGetdomainname(p0, p1)")
private external fun wasmLibcUnixNtoGetdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSetdomainname(p0, p1)")
private external fun wasmLibcUnixNtoSetdomainname(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoSync()")
private external fun wasmLibcUnixNtoSync()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixNtoPthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoUmount(p0, p1)")
private external fun wasmLibcUnixNtoUmount(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoSchedGetPriorityMax(p0)")
private external fun wasmLibcUnixNtoSchedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSettimeofday(p0, p1)")
private external fun wasmLibcUnixNtoSettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSchedRrGetInterval(p0, p1)")
private external fun wasmLibcUnixNtoSchedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSemTimedwait(p0, p1)")
private external fun wasmLibcUnixNtoSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSemGetvalue(p0, p1)")
private external fun wasmLibcUnixNtoSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSchedSetparam(p0, p1)")
private external fun wasmLibcUnixNtoSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoMount(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoMount(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSchedGetparam(p0, p1)")
private external fun wasmLibcUnixNtoSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadMutexConsistent(p0)")
private external fun wasmLibcUnixNtoPthreadMutexConsistent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcUnixNtoPthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadSpinInit(p0, p1)")
private external fun wasmLibcUnixNtoPthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadSpinDestroy(p0)")
private external fun wasmLibcUnixNtoPthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadSpinLock(p0)")
private external fun wasmLibcUnixNtoPthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadSpinTrylock(p0)")
private external fun wasmLibcUnixNtoPthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadSpinUnlock(p0)")
private external fun wasmLibcUnixNtoPthreadSpinUnlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadBarrierattrInit(p0)")
private external fun wasmLibcUnixNtoPthreadBarrierattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadBarrierattrDestroy(p0)")
private external fun wasmLibcUnixNtoPthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadBarrierattrGetpshared(p0, p1)")
private external fun wasmLibcUnixNtoPthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadBarrierattrSetpshared(p0, p1)")
private external fun wasmLibcUnixNtoPthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPthreadBarrierInit(p0, p1, p2)")
private external fun wasmLibcUnixNtoPthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadBarrierDestroy(p0)")
private external fun wasmLibcUnixNtoPthreadBarrierDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadBarrierWait(p0)")
private external fun wasmLibcUnixNtoPthreadBarrierWait(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoSchedGetscheduler(p0)")
private external fun wasmLibcUnixNtoSchedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoClockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcUnixNtoPthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadAttrSetguardsize(p0, p1)")
private external fun wasmLibcUnixNtoPthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSethostname(p0, p1)")
private external fun wasmLibcUnixNtoSethostname(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoSchedGetPriorityMin(p0)")
private external fun wasmLibcUnixNtoSchedGetPriorityMin(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadCondattrGetpshared(p0, p1)")
private external fun wasmLibcUnixNtoPthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixNtoPthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcUnixNtoSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoSigsuspend(p0)")
private external fun wasmLibcUnixNtoSigsuspend(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoSemClose(p0)")
private external fun wasmLibcUnixNtoSemClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoGetdtablesize()")
private external fun wasmLibcUnixNtoGetdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoInitgroups(p0, p1)")
private external fun wasmLibcUnixNtoInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcUnixNtoPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixNtoSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixNtoSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoGetgrnam(p0)")
private external fun wasmLibcUnixNtoGetgrnam(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPthreadCancel(p0)")
private external fun wasmLibcUnixNtoPthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadKill(p0, p1)")
private external fun wasmLibcUnixNtoPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoSemUnlink(p0)")
private external fun wasmLibcUnixNtoSemUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoDaemon(p0, p1)")
private external fun wasmLibcUnixNtoDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSigwait(p0, p1)")
private external fun wasmLibcUnixNtoSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcUnixNtoPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoGetgrgid(p0)")
private external fun wasmLibcUnixNtoGetgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadMutexattrGetpshared(p0, p1)")
private external fun wasmLibcUnixNtoPthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadMutexattrGetrobust(p0, p1)")
private external fun wasmLibcUnixNtoPthreadMutexattrGetrobust(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadMutexattrSetrobust(p0, p1)")
private external fun wasmLibcUnixNtoPthreadMutexattrSetrobust(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoGetitimer(p0, p1)")
private external fun wasmLibcUnixNtoGetitimer(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoSetitimer(p0, p1, p2)")
private external fun wasmLibcUnixNtoSetitimer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoPosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoPosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrInit(p0)")
private external fun wasmLibcUnixNtoPosixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixNtoPosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrGetschedpolicy(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrSetschedpolicy(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrGetschedparam(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnattrSetschedparam(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixNtoPosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixNtoPosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoPosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixNtoPosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixNtoPosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPopen(p0, p1)")
private external fun wasmLibcUnixNtoPopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoInotifyRmWatch(p0, p1)")
private external fun wasmLibcUnixNtoInotifyRmWatch(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoInotifyInit()")
private external fun wasmLibcUnixNtoInotifyInit(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoInotifyAddWatch(p0, p1, p2)")
private external fun wasmLibcUnixNtoInotifyAddWatch(p0: Int, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoGettid()")
private external fun wasmLibcUnixNtoGettid(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixNtoPthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixNtoGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixNtoGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoMallopt(p0, p1)")
private external fun wasmLibcUnixNtoMallopt(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoGettimeofday(p0, p1)")
private external fun wasmLibcUnixNtoGettimeofday(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoCtermid(p0)")
private external fun wasmLibcUnixNtoCtermid(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixNtoIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixNtoIoctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoGetpwentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoGetpwentR(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoPthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcUnixNtoPthreadGetnameNp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoPthreadSetnameNp(p0, p1)")
private external fun wasmLibcUnixNtoPthreadSetnameNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixNtoSysctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixNtoSysctl(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoGetrlimit(p0, p1)")
private external fun wasmLibcUnixNtoGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoSetrlimit(p0, p1)")
private external fun wasmLibcUnixNtoSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoLioListio(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoLioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoDlIteratePhdr(p0, p1)")
private external fun wasmLibcUnixNtoDlIteratePhdr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoMemsetS(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoMemsetS(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoRegcomp(p0, p1, p2)")
private external fun wasmLibcUnixNtoRegcomp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoRegexec(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoRegexec(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoRegerror(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoRegerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoRegfree(p0)")
private external fun wasmLibcUnixNtoRegfree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoDirfd(p0)")
private external fun wasmLibcUnixNtoDirfd(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixNtoDircntl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixNtoDircntl(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoAioCancel(p0, p1)")
private external fun wasmLibcUnixNtoAioCancel(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoAioError(p0)")
private external fun wasmLibcUnixNtoAioError(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoAioFsync(p0, p1)")
private external fun wasmLibcUnixNtoAioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoAioRead(p0)")
private external fun wasmLibcUnixNtoAioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoAioReturn(p0)")
private external fun wasmLibcUnixNtoAioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoAioSuspend(p0, p1, p2)")
private external fun wasmLibcUnixNtoAioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoAioWrite(p0)")
private external fun wasmLibcUnixNtoAioWrite(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoMqClose(p0)")
private external fun wasmLibcUnixNtoMqClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoMqGetattr(p0, p1)")
private external fun wasmLibcUnixNtoMqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNtoMqNotify(p0, p1)")
private external fun wasmLibcUnixNtoMqNotify(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixNtoMqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixNtoMqOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoMqReceive(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoMqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNtoMqSend(p0, p1, p2, p3)")
private external fun wasmLibcUnixNtoMqSend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNtoMqSetattr(p0, p1, p2)")
private external fun wasmLibcUnixNtoMqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoMqTimedreceive(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoMqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixNtoMqTimedsend(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixNtoMqTimedsend(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoMqUnlink(p0)")
private external fun wasmLibcUnixNtoMqUnlink(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNtoGetErrnoPtr()")
private external fun wasmLibcUnixNtoGetErrnoPtr(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixNtoMyThreadExit(p0)")
private external fun wasmLibcUnixNtoMyThreadExit(p0: String)

public actual var SYSPAGE_PTR: MutPtr<SyspageEntry>
    get() = if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoGetSYSPAGEPTR().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
    set(value) {
        if (unixNtoNapiAvailable) {
            wasmLibcUnixNtoSetSYSPAGEPTR(value.rawAddress.toString())
        } else {
            throw UnsupportedOperationException("Native FFI addon is not available")
        }
    }

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint, timeout: MutPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags.toInt(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetpriority(which, who) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSetpriority(which, who, prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(fd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMknodat(fd, pathname.rawAddress.toString(), mode.toInt(), dev.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoClockGetres(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoClockSettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoClockGetcpuclockid(pid, clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSetgroups(ngroups, ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadCondattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadMutexattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadRwlockattrGetpshared(attr.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadRwlockattrSetpshared(attr.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): MutPtr<CChar> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoClearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoWaitid(idtype.toInt(), id, infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetifaddrs(ifap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoBind(socket, address.rawAddress.toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSendmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoRecvmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoLoginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetpeereid(socket, euid.rawAddress.toString(), egid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setpwent() {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoSetspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoEndspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoFtok(pathname.rawAddress.toString(), projId).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMkostemp(template.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMkostemps(template.rawAddress.toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadSetschedprio(native.toLong().toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoIfNameindex().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMkstemps(template.rawAddress.toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoUmount(target.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSchedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSchedRrGetInterval(pid, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(specialDevice: ConstPtr<CChar>, mountDirectory: ConstPtr<CChar>, flags: CInt, mountType: ConstPtr<CChar>, mountData: ConstPtr<CVoid>, mountDatalen: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMount(specialDevice.rawAddress.toString(), mountDirectory.rawAddress.toString(), flags, mountType.rawAddress.toString(), mountData.rawAddress.toString(), mountDatalen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadMutexConsistent(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadBarrierattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadBarrierattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadBarrierattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, pshared: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadBarrierattrSetpshared(attr.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadBarrierInit(barrier.rawAddress.toString(), attr.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadBarrierDestroy(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadBarrierWait(barrier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSchedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadCondattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoInitgroups(user.rawAddress.toString(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadCancel(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadMutexattrGetpshared(attr.rawAddress.toString(), pshared.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robustness: MutPtr<CInt>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadMutexattrGetrobust(attr.rawAddress.toString(), robustness.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadMutexattrSetrobust(attr.rawAddress.toString(), robustness) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetitimer(which, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, value: ConstPtr<Itimerval>, ovalue: MutPtr<Itimerval>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSetitimer(which, value.rawAddress.toString(), ovalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrGetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrSetsigmask(attr.rawAddress.toString(), default.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrGetpgroup(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrSetpgroup(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrGetschedpolicy(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrSetschedpolicy(attr.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnattrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnFileActionsInit(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnFileActionsDestroy(actions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnFileActionsAddopen(actions.rawAddress.toString(), fd, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnFileActionsAddclose(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPosixSpawnFileActionsAdddup2(actions.rawAddress.toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoInotifyRmWatch(fd, wd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit(): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoInotifyInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoInotifyAddWatch(fd, path.rawAddress.toString(), mask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettid(): PidT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGettid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadGetcpuclockid(thread.toLong().toString(), clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: Long): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMallopt(param, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoCtermid(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, bufsize: CInt, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), bufsize, result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadGetnameNp(thread.toLong().toString(), name.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoPthreadSetnameNp(thread.toLong().toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysctl(arg0: ConstPtr<CInt>, arg1: CUint, arg2: MutPtr<CVoid>, arg3: MutPtr<SizeT>, arg4: ConstPtr<CVoid>, arg5: SizeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSysctl(arg0.rawAddress.toString(), arg1.toInt(), arg2.rawAddress.toString(), arg3.rawAddress.toString(), arg4.rawAddress.toString(), arg5.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlp: ConstPtr<Rlimit>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoSetrlimit(resource, rlp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, list: ConstPtr<MutPtr<Aiocb>>, nent: CInt, sig: MutPtr<Sigevent>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoLioListio(mode, list.rawAddress.toString(), nent, sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMemsetS(s.rawAddress.toString(), smax.toString(), c, n.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, str: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoRegexec(preg.rawAddress.toString(), str.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dircntl(dir: MutPtr<DIR>, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoDircntl(dir.rawAddress.toString(), cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoAioCancel(fd, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoAioError(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(operation: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoAioFsync(operation, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoAioRead(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocpb: MutPtr<Aiocb>): SsizeT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoAioReturn(aiocpb.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(list: ConstPtr<ConstPtr<Aiocb>>, nent: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoAioSuspend(list.rawAddress.toString(), nent, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocpb: MutPtr<Aiocb>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoAioWrite(aiocpb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqdes: MqdT): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqClose(mqdes.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqdes: MqdT, mqstat: MutPtr<MqAttr>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqGetattr(mqdes.toLong().toString(), mqstat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqdes: MqdT, notification: ConstPtr<Sigevent>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqNotify(mqdes.toLong().toString(), notification.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqdes: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqReceive(mqdes.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqdes: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqSend(mqdes.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqdes: MqdT, mqstat: ConstPtr<MqAttr>, omqstat: MutPtr<MqAttr>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqSetattr(mqdes.toLong().toString(), mqstat.rawAddress.toString(), omqstat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqTimedreceive(mqdes.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqTimedsend(mqdes.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (unixNtoNapiAvailable) wasmLibcUnixNtoMqUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getErrnoPtr(): MutPtr<CInt> =
    if (unixNtoNapiAvailable) MutPtr(wasmLibcUnixNtoGetErrnoPtr().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun myThreadExit(valuePtr: MutPtr<ConstPtr<CVoid>>) {
    if (unixNtoNapiAvailable) {
        wasmLibcUnixNtoMyThreadExit(valuePtr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
