@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.haiku

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
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixHaikuNapiAddon(): Boolean

private val unixHaikuNapiAvailable: Boolean = initUnixHaikuNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuGetrlimit(p0, p1)")
private external fun wasmLibcUnixHaikuGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuSetrlimit(p0, p1)")
private external fun wasmLibcUnixHaikuSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuGetpriority(p0, p1)")
private external fun wasmLibcUnixHaikuGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixHaikuSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuEndusershell()")
private external fun wasmLibcUnixHaikuEndusershell()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuGetpass(p0)")
private external fun wasmLibcUnixHaikuGetpass(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuGetusershell()")
private external fun wasmLibcUnixHaikuGetusershell(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuIssetugid()")
private external fun wasmLibcUnixHaikuIssetugid(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuSetusershell()")
private external fun wasmLibcUnixHaikuSetusershell()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuFutimens(p0, p1)")
private external fun wasmLibcUnixHaikuFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixHaikuStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuErrnop()")
private external fun wasmLibcUnixHaikuErrnop(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuAbs(p0)")
private external fun wasmLibcUnixHaikuAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuLabs(p0)")
private external fun wasmLibcUnixHaikuLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuRand()")
private external fun wasmLibcUnixHaikuRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuSrand(p0)")
private external fun wasmLibcUnixHaikuSrand(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuGetifaddrs(p0)")
private external fun wasmLibcUnixHaikuGetifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuFreeifaddrs(p0)")
private external fun wasmLibcUnixHaikuFreeifaddrs(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuPpoll(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuPpoll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuGetspent()")
private external fun wasmLibcUnixHaikuGetspent(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuGetspentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuGetspentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuSetspent()")
private external fun wasmLibcUnixHaikuSetspent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuEndspent()")
private external fun wasmLibcUnixHaikuEndspent()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuGetspnam(p0)")
private external fun wasmLibcUnixHaikuGetspnam(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuGetspnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuGetspnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuSgetspent(p0)")
private external fun wasmLibcUnixHaikuSgetspent(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuSgetspentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuSgetspentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuFgetspent(p0)")
private external fun wasmLibcUnixHaikuFgetspent(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuFgetspentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuFgetspentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixHaikuMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuMknodat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuSemDestroy(p0)")
private external fun wasmLibcUnixHaikuSemDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuSemInit(p0, p1, p2)")
private external fun wasmLibcUnixHaikuSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuClockGetres(p0, p1)")
private external fun wasmLibcUnixHaikuClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuClockGettime(p0, p1)")
private external fun wasmLibcUnixHaikuClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuClockSettime(p0, p1)")
private external fun wasmLibcUnixHaikuClockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuClockGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixHaikuClockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPthreadAttrGetguardsize(p0, p1)")
private external fun wasmLibcUnixHaikuPthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPthreadAttrSetguardsize(p0, p1)")
private external fun wasmLibcUnixHaikuPthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuPthreadAttrGetstack(p0, p1, p2)")
private external fun wasmLibcUnixHaikuPthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcUnixHaikuPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixHaikuPthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuValloc(p0)")
private external fun wasmLibcUnixHaikuValloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuMallocUsableSize(p0)")
private external fun wasmLibcUnixHaikuMallocUsableSize(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuMemalign(p0, p1)")
private external fun wasmLibcUnixHaikuMemalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuSetgroups(p0, p1)")
private external fun wasmLibcUnixHaikuSetgroups(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuInitgroups(p0, p1)")
private external fun wasmLibcUnixHaikuInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixHaikuIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixHaikuIoctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuMprotect(p0, p1, p2)")
private external fun wasmLibcUnixHaikuMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuDirfd(p0)")
private external fun wasmLibcUnixHaikuDirfd(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixHaikuGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixHaikuGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPthreadMutexTimedlock(p0, p1)")
private external fun wasmLibcUnixHaikuPthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPthreadSpinInit(p0, p1)")
private external fun wasmLibcUnixHaikuPthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuPthreadSpinDestroy(p0)")
private external fun wasmLibcUnixHaikuPthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuPthreadSpinLock(p0)")
private external fun wasmLibcUnixHaikuPthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuPthreadSpinTrylock(p0)")
private external fun wasmLibcUnixHaikuPthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuPthreadSpinUnlock(p0)")
private external fun wasmLibcUnixHaikuPthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuWaitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuGlob(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuGlob(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuGlobfree(p0)")
private external fun wasmLibcUnixHaikuGlobfree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuGettimeofday(p0, p1)")
private external fun wasmLibcUnixHaikuGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuPosixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixHaikuPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuPosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuPosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuPosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixHaikuPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixHaikuShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuShmUnlink(p0)")
private external fun wasmLibcUnixHaikuShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuSeekdir(p0, p1)")
private external fun wasmLibcUnixHaikuSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuTelldir(p0)")
private external fun wasmLibcUnixHaikuTelldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuMadvise(p0, p1, p2)")
private external fun wasmLibcUnixHaikuMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuMsync(p0, p1, p2)")
private external fun wasmLibcUnixHaikuMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNlLanginfo(p0)")
private external fun wasmLibcUnixHaikuNlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuBind(p0, p1, p2)")
private external fun wasmLibcUnixHaikuBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuAccept4(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuAccept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuWritev(p0, p1, p2)")
private external fun wasmLibcUnixHaikuWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuReadv(p0, p1, p2)")
private external fun wasmLibcUnixHaikuReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixHaikuSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixHaikuRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuExecvpe(p0, p1, p2)")
private external fun wasmLibcUnixHaikuExecvpe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuSigaltstack(p0, p1)")
private external fun wasmLibcUnixHaikuSigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuSigsuspend(p0)")
private external fun wasmLibcUnixHaikuSigsuspend(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuSemClose(p0)")
private external fun wasmLibcUnixHaikuSemClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuGetdtablesize()")
private external fun wasmLibcUnixHaikuGetdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuPthreadSigmask(p0, p1, p2)")
private external fun wasmLibcUnixHaikuPthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixHaikuSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixHaikuSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuGetgrnam(p0)")
private external fun wasmLibcUnixHaikuGetgrnam(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPthreadKill(p0, p1)")
private external fun wasmLibcUnixHaikuPthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuSemUnlink(p0)")
private external fun wasmLibcUnixHaikuSemUnlink(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuGetpwent()")
private external fun wasmLibcUnixHaikuGetpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuSetpwent()")
private external fun wasmLibcUnixHaikuSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuEndpwent()")
private external fun wasmLibcUnixHaikuEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuEndgrent()")
private external fun wasmLibcUnixHaikuEndgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuGetgrent()")
private external fun wasmLibcUnixHaikuGetgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuSetgrent()")
private external fun wasmLibcUnixHaikuSetgrent()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuSigwait(p0, p1)")
private external fun wasmLibcUnixHaikuSigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuPthreadAtfork(p0, p1, p2)")
private external fun wasmLibcUnixHaikuPthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuGetgrgid(p0)")
private external fun wasmLibcUnixHaikuGetgrgid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPopen(p0, p1)")
private external fun wasmLibcUnixHaikuPopen(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuSethostname(p0, p1)")
private external fun wasmLibcUnixHaikuSethostname(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuUname(p0)")
private external fun wasmLibcUnixHaikuUname(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuGetutxent()")
private external fun wasmLibcUnixHaikuGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuGetutxid(p0)")
private external fun wasmLibcUnixHaikuGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuGetutxline(p0)")
private external fun wasmLibcUnixHaikuGetutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuPututxline(p0)")
private external fun wasmLibcUnixHaikuPututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuSetutxent()")
private external fun wasmLibcUnixHaikuSetutxent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuEndutxent()")
private external fun wasmLibcUnixHaikuEndutxent()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixHaikuSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuSigwaitinfo(p0, p1)")
private external fun wasmLibcUnixHaikuSigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuGetitimer(p0, p1)")
private external fun wasmLibcUnixHaikuGetitimer(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuSetitimer(p0, p1, p2)")
private external fun wasmLibcUnixHaikuSetitimer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuRegcomp(p0, p1, p2)")
private external fun wasmLibcUnixHaikuRegcomp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuRegexec(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuRegexec(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuRegerror(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuRegerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuRegfree(p0)")
private external fun wasmLibcUnixHaikuRegfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuMsgctl(p0, p1, p2)")
private external fun wasmLibcUnixHaikuMsgctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuMsgget(p0, p1)")
private external fun wasmLibcUnixHaikuMsgget(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuMsgrcv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuMsgrcv(p0: Int, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuMsgsnd(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuMsgsnd(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuSemget(p0, p1, p2)")
private external fun wasmLibcUnixHaikuSemget(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixHaikuSemctl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixHaikuSemctl(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuSemop(p0, p1, p2)")
private external fun wasmLibcUnixHaikuSemop(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuFtok(p0, p1)")
private external fun wasmLibcUnixHaikuFtok(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuMemrchr(p0, p1, p2)")
private external fun wasmLibcUnixHaikuMemrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuLsearch(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuLsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuLfind(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuLfind(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuHcreate(p0)")
private external fun wasmLibcUnixHaikuHcreate(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuHdestroy()")
private external fun wasmLibcUnixHaikuHdestroy()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuDrand48()")
private external fun wasmLibcUnixHaikuDrand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuErand48(p0)")
private external fun wasmLibcUnixHaikuErand48(p0: String): Double

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuLrand48()")
private external fun wasmLibcUnixHaikuLrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuNrand48(p0)")
private external fun wasmLibcUnixHaikuNrand48(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuMrand48()")
private external fun wasmLibcUnixHaikuMrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuJrand48(p0)")
private external fun wasmLibcUnixHaikuJrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuSrand48(p0)")
private external fun wasmLibcUnixHaikuSrand48(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuSeed48(p0)")
private external fun wasmLibcUnixHaikuSeed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuLcong48(p0)")
private external fun wasmLibcUnixHaikuLcong48(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuClearenv()")
private external fun wasmLibcUnixHaikuClearenv(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuCtermid(p0)")
private external fun wasmLibcUnixHaikuCtermid(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuSync()")
private external fun wasmLibcUnixHaikuSync()

@JsFun("() => globalThis.__km_napi_libc.libcUnixHaikuGetpagesize()")
private external fun wasmLibcUnixHaikuGetpagesize(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuBrk(p0)")
private external fun wasmLibcUnixHaikuBrk(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuSbrk(p0)")
private external fun wasmLibcUnixHaikuSbrk(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuPosixSpawn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixHaikuPosixSpawnp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnFileActionsInit(p0)")
private external fun wasmLibcUnixHaikuPosixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnFileActionsDestroy(p0)")
private external fun wasmLibcUnixHaikuPosixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuPosixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnFileActionsAddclose(p0, p1)")
private external fun wasmLibcUnixHaikuPosixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun wasmLibcUnixHaikuPosixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrInit(p0)")
private external fun wasmLibcUnixHaikuPosixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrDestroy(p0)")
private external fun wasmLibcUnixHaikuPosixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrGetflags(p0, p1)")
private external fun wasmLibcUnixHaikuPosixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrSetflags(p0, p1)")
private external fun wasmLibcUnixHaikuPosixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrGetpgroup(p0, p1)")
private external fun wasmLibcUnixHaikuPosixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrSetpgroup(p0, p1)")
private external fun wasmLibcUnixHaikuPosixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrGetsigdefault(p0, p1)")
private external fun wasmLibcUnixHaikuPosixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrSetsigdefault(p0, p1)")
private external fun wasmLibcUnixHaikuPosixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrGetsigmask(p0, p1)")
private external fun wasmLibcUnixHaikuPosixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPosixSpawnattrSetsigmask(p0, p1)")
private external fun wasmLibcUnixHaikuPosixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixHaikuGetoptLong(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixHaikuGetoptLong(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuStrcasecmpL(p0, p1, p2)")
private external fun wasmLibcUnixHaikuStrcasecmpL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuStrncasecmpL(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuStrncasecmpL(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuGetentropy(p0, p1)")
private external fun wasmLibcUnixHaikuGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixHaikuMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixHaikuMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPthreadGetattrNp(p0, p1)")
private external fun wasmLibcUnixHaikuPthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixHaikuPthreadGetnameNp(p0, p1, p2)")
private external fun wasmLibcUnixHaikuPthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixHaikuPthreadSetnameNp(p0, p1)")
private external fun wasmLibcUnixHaikuPthreadSetnameNp(p0: String, p1: String): Int

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetpriority(which, who) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSetpriority(which, who, priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endusershell() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuEndusershell()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpass(prompt: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetpass(prompt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getusershell(): MutPtr<CChar> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetusershell().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun issetugid(): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuIssetugid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setusershell() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuSetusershell()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utimensat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuUtimensat(fd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnop(): MutPtr<CInt> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuErrnop().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetifaddrs(ifap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ppoll(fds: MutPtr<Pollfd>, numfds: NfdsT, timeout: ConstPtr<Timespec>, sigMask: ConstPtr<SigsetT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPpoll(fds.rawAddress.toString(), numfds.toString(), timeout.rawAddress.toString(), sigMask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspent(): MutPtr<Spwd> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetspent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(pwd: MutPtr<Spwd>, buf: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetspentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), bufferSize.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuSetspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuEndspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetspnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnamR(name: ConstPtr<CChar>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetspnamR(name.rawAddress.toString(), spwd.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspent(line: ConstPtr<CChar>): MutPtr<Spwd> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuSgetspent(line.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(line: ConstPtr<CChar>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSgetspentR(line.rawAddress.toString(), spwd.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetspent(file: MutPtr<FILE>): MutPtr<Spwd> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuFgetspent(file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetspentR(file: MutPtr<FILE>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuFgetspentR(file.rawAddress.toString(), spwd.rawAddress.toString(), buffer.rawAddress.toString(), bufferSize.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuClockGetres(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuClockSettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuClockGetcpuclockid(pid, clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadCreate(thread.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun valloc(numBytes: SizeT): MutPtr<CVoid> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuValloc(numBytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMallocUsableSize(ptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSetgroups(ngroups, ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuInitgroups(name.rawAddress.toString(), basegid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadSpinInit(lock.rawAddress.toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadSpinDestroy(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadSpinLock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadSpinTrylock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadSpinUnlock(lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuWaitid(idtype, id, infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixFadvise(fd, offset.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuBind(socket, address.rawAddress.toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(socket: CInt, address: MutPtr<Sockaddr>, addressLength: MutPtr<SocklenT>, flags: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuAccept4(socket, address.rawAddress.toString(), addressLength.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, count: CInt): SsizeT =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuWritev(fd, iov.rawAddress.toString(), count).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, count: CInt): SsizeT =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuReadv(fd, iov.rawAddress.toString(), count).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSendmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuRecvmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, environment: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), environment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, basegroup: GidT, grouplist: MutPtr<GidT>, groupcount: MutPtr<CInt>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetgrouplist(user.rawAddress.toString(), basegroup.toInt(), grouplist.rawAddress.toString(), groupcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetutxid(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuGetutxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuPututxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetitimer(which, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMsgctl(msqid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMsgget(key, msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMsgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtype.toString(), msgflg).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSemget(key, nsems, semflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuSemop(semid, sops.rawAddress.toString(), nsops.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuFtok(pathname.rawAddress.toString(), projId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuMemrchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuLsearch(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuLfind(key.rawAddress.toString(), base.rawAddress.toString(), nelp.rawAddress.toString(), width.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcreate(nelt: SizeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuHcreate(nelt.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdestroy() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuHdestroy()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): CDouble =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuDrand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuErand48(xseed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuLrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuNrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuMrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuJrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuSeed48(xseed.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: MutPtr<CUshort>) {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuLcong48(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clearenv(): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuClearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuCtermid(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixHaikuNapiAvailable) {
        wasmLibcUnixHaikuSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpagesize(): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetpagesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuBrk(addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuSbrk(increment.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawn(pid.rawAddress.toString(), path.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnp(pid.rawAddress.toString(), file.rawAddress.toString(), fileActions.rawAddress.toString(), attrp.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnFileActionsInit(fileActions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnFileActionsDestroy(fileActions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnFileActionsAddopen(fileActions.rawAddress.toString(), fildes, path.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnFileActionsAddclose(fileActions.rawAddress.toString(), fildes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, newfildes: CInt): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnFileActionsAdddup2(fileActions.rawAddress.toString(), fildes, newfildes) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrInit(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrDestroy(attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrGetflags(attr.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrSetflags(attr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, pgroup: MutPtr<PidT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrGetpgroup(attr.rawAddress.toString(), pgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, pgroup: PidT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrSetpgroup(attr.rawAddress.toString(), pgroup) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, sigdefault: MutPtr<SigsetT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrGetsigdefault(attr.rawAddress.toString(), sigdefault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, sigdefault: ConstPtr<SigsetT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrSetsigdefault(attr.rawAddress.toString(), sigdefault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, sigmask: MutPtr<SigsetT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrGetsigmask(attr.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPosixSpawnattrSetsigmask(attr.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuStrcasecmpL(string1.rawAddress.toString(), string2.rawAddress.toString(), locale.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuStrncasecmpL(string1.rawAddress.toString(), string2.rawAddress.toString(), length.toString(), locale.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(source: ConstPtr<CVoid>, sourceLength: SizeT, search: ConstPtr<CVoid>, searchLength: SizeT): MutPtr<CVoid> =
    if (unixHaikuNapiAvailable) MutPtr(wasmLibcUnixHaikuMemmem(source.rawAddress.toString(), sourceLength.toString(), search.rawAddress.toString(), searchLength.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadGetattrNp(thread.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr<CChar>, length: SizeT): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadGetnameNp(thread.toLong().toString(), buffer.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    if (unixHaikuNapiAvailable) wasmLibcUnixHaikuPthreadSetnameNp(thread.toLong().toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
