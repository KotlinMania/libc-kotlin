@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Sysinfo
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeAndroidNapiAddon(): Boolean

private val unixLinuxlikeAndroidNapiAvailable: Boolean = initUnixLinuxlikeAndroidNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSetgrent()")
private external fun wasmLibcUnixLinuxlikeAndroidSetgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidEndgrent()")
private external fun wasmLibcUnixLinuxlikeAndroidEndgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetgrent()")
private external fun wasmLibcUnixLinuxlikeAndroidGetgrent(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetrlimit64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidGetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSetrlimit64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPrlimit(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidPrlimit(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPrlimit64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidPrlimit64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGettimeofday(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidMlock2(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidMlock2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidMadvise(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidMsync(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidMprotect(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeAndroidGetnameinfo(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidProcessVmReadv(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeAndroidProcessVmReadv(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidProcessVmWritev(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeAndroidProcessVmWritev(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPtrace(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeAndroidPtrace(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetpriority(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedCpualloc(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedCpualloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedCpufree(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedCpufree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedCpucount(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedCpucount(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedGetcpu()")
private external fun wasmLibcUnixLinuxlikeAndroidSchedGetcpu(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidMallocInfo(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidMallocInfo(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidMallocUsableSize(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidMallocUsableSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidUtmpname(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidUtmpname(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSetutent()")
private external fun wasmLibcUnixLinuxlikeAndroidSetutent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetutent()")
private external fun wasmLibcUnixLinuxlikeAndroidGetutent(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSeekdir(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidTelldir(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidTelldir(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFallocate(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidFallocate(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFallocate64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidFallocate64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPosixFallocate64(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidPosixFallocate64(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidGetxattr(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidLgetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidLgetxattr(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFgetxattr(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidFgetxattr(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeAndroidSetxattr(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidLsetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeAndroidLsetxattr(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFsetxattr(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeAndroidFsetxattr(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidListxattr(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidListxattr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidLlistxattr(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidLlistxattr(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFlistxattr(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidFlistxattr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidRemovexattr(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidRemovexattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidLremovexattr(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidLremovexattr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFremovexattr(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidFremovexattr(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSignalfd(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidSignalfd(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidTimerfdCreate(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidTimerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidTimerfdGettime(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidTimerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidTimerfdSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidTimerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSyscall(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeAndroidSyscall(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedGetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedSetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidEpollCreate(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidEpollCreate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidEpollCreate1(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidEpollCreate1(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidEpollWait(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidEpollWait(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidEpollCtl(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidEpollCtl(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidUnshare(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidUnshare(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidUmount(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidUmount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedGetPriorityMax(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidTee(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidTee(p0: Int, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSettimeofday(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSplice(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeAndroidSplice(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidEventfd(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidEventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidEventfdRead(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidEventfdRead(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidEventfdWrite(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidEventfdWrite(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedRrGetInterval(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSemTimedwait(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSemGetvalue(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedSetparam(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSetns(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSetns(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSwapoff(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSwapoff(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidVmsplice(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidVmsplice(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidMount(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeAndroidMount(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPersonality(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidPersonality(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPrctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeAndroidPrctl(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedGetparam(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPpoll(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidPpoll(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidClone(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmLibcUnixLinuxlikeAndroidClone(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedGetscheduler(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidClockNanosleep(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidClockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSethostname(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSethostname(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedGetPriorityMin(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedGetPriorityMin(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSysinfo(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSysinfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidUmount2(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidUmount2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSwapon(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSwapon(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSchedSetscheduler(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidSchedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSendfile(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidSendfile(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSendfile64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidSendfile64(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSetfsgid(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSetfsgid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSetfsuid(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSetfsuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSigsuspend(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSigsuspend(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeAndroidGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSigaltstack(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSemClose(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSemClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeAndroidGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeAndroidSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetgrnam(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidGetgrnam(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSemUnlink(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSemUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidDaemon(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSigtimedwait(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidSigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSigwait(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSigwait(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetgrgid(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidGetgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetgrouplist(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidGetgrouplist(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidInitgroups(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidPopen(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidPopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidErrno()")
private external fun wasmLibcUnixLinuxlikeAndroidErrno(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidInotifyRmWatch(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidInotifyRmWatch(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidInotifyInit()")
private external fun wasmLibcUnixLinuxlikeAndroidInotifyInit(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidInotifyInit1(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidInotifyInit1(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidInotifyAddWatch(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidInotifyAddWatch(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidRegcomp(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidRegcomp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidRegexec(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeAndroidRegexec(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidRegerror(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidRegerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidRegfree(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidRegfree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidAndroidSetAbortMessage(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidAndroidSetAbortMessage(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGettid()")
private external fun wasmLibcUnixLinuxlikeAndroidGettid(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidTgkill(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidTgkill(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetauxval(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidGetauxval(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetentropy(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSystemPropertySet(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSystemPropertySet(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSystemPropertyGet(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSystemPropertyGet(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSystemPropertyFind(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSystemPropertyFind(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSystemPropertyFindNth(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSystemPropertyFindNth(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSystemPropertyForeach(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidSystemPropertyForeach(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidDlIteratePhdr(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidDlIteratePhdr(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidArc4random()")
private external fun wasmLibcUnixLinuxlikeAndroidArc4random(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidArc4randomUniform(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidArc4randomUniform(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidArc4randomBuf(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidArc4randomBuf(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidReallocarray(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidReallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidDirname(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidDirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidBasename(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidBasename(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidGetoptLong(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeAndroidGetoptLong(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSync()")
private external fun wasmLibcUnixLinuxlikeAndroidSync()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidSyncfs(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidSyncfs(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFreadUnlocked(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidFreadUnlocked(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFwriteUnlocked(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeAndroidFwriteUnlocked(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFflushUnlocked(p0)")
private external fun wasmLibcUnixLinuxlikeAndroidFflushUnlocked(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidFgetsUnlocked(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidFgetsUnlocked(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidKlogctl(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeAndroidKlogctl(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidMemfdCreate(p0, p1)")
private external fun wasmLibcUnixLinuxlikeAndroidMemfdCreate(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeAndroidRenameat2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeAndroidRenameat2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

public actual fun setgrent() {
    if (unixLinuxlikeAndroidNapiAvailable) {
        wasmLibcUnixLinuxlikeAndroidSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixLinuxlikeAndroidNapiAvailable) {
        wasmLibcUnixLinuxlikeAndroidEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetrlimit64(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSetrlimit64(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPrlimit(pid, resource, newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPrlimit64(pid, resource, newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidMlock2(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toString(), serv.rawAddress.toString(), servlen.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPreadv(fd, iov.rawAddress.toString(), count, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPwritev(fd, iov.rawAddress.toString(), count, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidProcessVmReadv(pid, localIov.rawAddress.toString(), localIovCount.toString(), remoteIov.rawAddress.toString(), remoteIovCount.toString(), flags.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr<Iovec>, localIovCount: CUlong, remoteIov: ConstPtr<Iovec>, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidProcessVmWritev(pid, localIov.rawAddress.toString(), localIovCount.toString(), remoteIov.rawAddress.toString(), remoteIovCount.toString(), flags.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPtrace(request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSetpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCpualloc(count: SizeT): MutPtr<CpuSetT> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidSchedCpualloc(count.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCpufree(set: MutPtr<CpuSetT>) {
    if (unixLinuxlikeAndroidNapiAvailable) {
        wasmLibcUnixLinuxlikeAndroidSchedCpufree(set.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun schedCpucount(setsize: SizeT, set: ConstPtr<CpuSetT>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedCpucount(setsize.toString(), set.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedGetcpu() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidMallocInfo(options, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: ConstPtr<CVoid>): SizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidMallocUsableSize(ptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidUtmpname(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (unixLinuxlikeAndroidNapiAvailable) {
        wasmLibcUnixLinuxlikeAndroidSetutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutent(): MutPtr<Utmp> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidGetutent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixLinuxlikeAndroidNapiAvailable) {
        wasmLibcUnixLinuxlikeAndroidSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFallocate(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFallocate64(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPosixFallocate64(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidLgetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFgetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidLsetxattr(path.rawAddress.toString(), name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFsetxattr(filedes, name.rawAddress.toString(), value.rawAddress.toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidListxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidLlistxattr(path.rawAddress.toString(), list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFlistxattr(filedes, list.rawAddress.toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidRemovexattr(path.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidLremovexattr(path.rawAddress.toString(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFremovexattr(filedes, name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSignalfd(fd, mask.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidTimerfdCreate(clock, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currentValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidTimerfdGettime(fd, currentValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSyscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedGetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidEpollCreate(size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidEpollCreate1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidEpollWait(epfd, events.rawAddress.toString(), maxevents, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidEpollCtl(epfd, op, fd, event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unshare(flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidUnshare(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidUmount(target.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidTee(fdIn, fdOut, len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSplice(fdIn, offIn.rawAddress.toString(), fdOut, offOut.rawAddress.toString(), len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidEventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidEventfdRead(fd, value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidEventfdWrite(fd, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedRrGetInterval(pid, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedSetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSetns(fd, nstype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(puath: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSwapoff(puath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidVmsplice(fd, iov.rawAddress.toString(), nrSegs.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidMount(src.rawAddress.toString(), target.rawAddress.toString(), fstype.rawAddress.toString(), flags.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUint): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPersonality(persona.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPrctl(option, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedGetparam(pid, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidPpoll(fds.rawAddress.toString(), nfds.toInt(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidClone(0L.toString(), childStack.rawAddress.toString(), flags, arg.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(info: MutPtr<Sysinfo>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSysinfo(info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidUmount2(target.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSwapon(path.rawAddress.toString(), swapflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSchedSetscheduler(pid, policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSendfile(outFd, inFd, offset.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSendfile64(outFd, inFd, offset.rawAddress.toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSetfsgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSetfsuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidInitgroups(user.rawAddress.toString(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): MutPtr<CInt> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidErrno().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidInotifyRmWatch(fd, wd.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit(): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidInotifyInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit1(flags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidInotifyInit1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidInotifyAddWatch(fd, path.rawAddress.toString(), mask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixLinuxlikeAndroidNapiAvailable) {
        wasmLibcUnixLinuxlikeAndroidRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun androidSetAbortMessage(msg: ConstPtr<CChar>) {
    if (unixLinuxlikeAndroidNapiAvailable) {
        wasmLibcUnixLinuxlikeAndroidAndroidSetAbortMessage(msg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gettid(): PidT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGettid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidTgkill(tgid, tid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertySet(name: ConstPtr<CChar>, value: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSystemPropertySet(name.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyGet(name: ConstPtr<CChar>, value: MutPtr<CChar>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSystemPropertyGet(name.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyFind(name: ConstPtr<CChar>): ConstPtr<PropInfo> =
    if (unixLinuxlikeAndroidNapiAvailable) ConstPtr(wasmLibcUnixLinuxlikeAndroidSystemPropertyFind(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyFindNth(n: CUint): ConstPtr<PropInfo> =
    if (unixLinuxlikeAndroidNapiAvailable) ConstPtr(wasmLibcUnixLinuxlikeAndroidSystemPropertyFindNth(n.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSystemPropertyForeach(0L.toString(), cookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidArc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidArc4randomUniform(upperBound.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, n: SizeT) {
    if (unixLinuxlikeAndroidNapiAvailable) {
        wasmLibcUnixLinuxlikeAndroidArc4randomBuf(buf.rawAddress.toString(), n.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidDirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixLinuxlikeAndroidNapiAvailable) {
        wasmLibcUnixLinuxlikeAndroidSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidSyncfs(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFreadUnlocked(buf.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwriteUnlocked(buf: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFwriteUnlocked(buf.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflushUnlocked(stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidFflushUnlocked(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetsUnlocked(buf: MutPtr<CChar>, size: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (unixLinuxlikeAndroidNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeAndroidFgetsUnlocked(buf.rawAddress.toString(), size, stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun klogctl(syslogType: CInt, bufp: MutPtr<CChar>, len: CInt): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidKlogctl(syslogType, bufp.rawAddress.toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidMemfdCreate(name.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixLinuxlikeAndroidNapiAvailable) wasmLibcUnixLinuxlikeAndroidRenameat2(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
