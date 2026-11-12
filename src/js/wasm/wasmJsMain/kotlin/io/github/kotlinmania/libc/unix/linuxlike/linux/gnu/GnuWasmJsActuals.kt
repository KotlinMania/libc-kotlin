@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.libc.unix.linuxlike.DlInfo
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.Mntent
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.Sigevent
import io.github.kotlinmania.libc.unix.linuxlike.Spwd
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.libc.unix.linuxlike.linux.MqdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadRwlockattrT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Timex
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.PthreadAttrT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeLinuxGnuNapiAddon(): Boolean

private val unixLinuxlikeLinuxGnuNapiAvailable: Boolean = initUnixLinuxlikeLinuxGnuNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuFgetspentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuFgetspentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuSgetspentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuSgetspentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetspentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetspentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuQsortR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuQsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuSendmmsg(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuSendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuRecvmmsg(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuRecvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetrlimit64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuSetrlimit64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuSetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuSetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPrlimit(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPrlimit(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPrlimit64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPrlimit64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuUtmpname(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuUtmpname(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuUtmpxname(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuUtmpxname(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetutxent()")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetutxid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetutxline(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPututxline(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuSetutxent()")
private external fun wasmLibcUnixLinuxlikeLinuxGnuSetutxent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuEndutxent()")
private external fun wasmLibcUnixLinuxlikeLinuxGnuEndutxent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetpt()")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetpt(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuMallopt(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuMallopt(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGettimeofday(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetentropy(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetrandom(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetauxval(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetauxval(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuAdjtimex(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuAdjtimex(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuNtpAdjtime(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuNtpAdjtime(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuNtpGettime(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuNtpGettime(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuClockAdjtime(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuClockAdjtime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuFanotifyMark(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuFanotifyMark(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPreadv2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPreadv2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPwritev2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPwritev2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPreadv64v2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPreadv64v2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPwritev64v2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPwritev64v2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuRenameat2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuRenameat2(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuExplicitBzero(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuExplicitBzero(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuReallocarray(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuReallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuCtermid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuCtermid(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuBacktrace(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuBacktrace(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuBacktraceSymbols(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuBacktraceSymbols(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGlob64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGlob64(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGlobfree64(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGlobfree64(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPtrace(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPtrace(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetpriority(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPthreadTryjoinNp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuMallocStats()")
private external fun wasmLibcUnixLinuxlikeLinuxGnuMallocStats()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuMallocInfo(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuMallocInfo(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuMallocUsableSize(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuMallocUsableSize(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetpwentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetpwentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetgrentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetgrentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuFgetpwentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuFgetpwentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuFgetgrentR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuFgetgrentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPutpwent(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPutpwent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPutgrent(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPutgrent(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuSethostid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuSethostid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuMemfdCreate(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuMemfdCreate(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuMlock2(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuMlock2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuEuidaccess(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuEuidaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuEaccess(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuEaccess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuAsctimeR(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuAsctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuCtimeR(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuCtimeR(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuDirname(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuDirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPosixBasename(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPosixBasename(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGnuBasename(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGnuBasename(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuDlmopen(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuDlmopen(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuDlinfo(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuDlinfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuDladdr1(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuDladdr1(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuDlvsym(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuDlvsym(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuMallocTrim(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuMallocTrim(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease()")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGnuGetLibcRelease(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion()")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGnuGetLibcVersion(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuGetmntentR(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuGetmntentR(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuExecveat(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuExecveat(p0: Int, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuCloseRange(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuCloseRange(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuMqNotify(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuMqNotify(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuEpollPwait2(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuEpollPwait2(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuMempcpy(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuMempcpy(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxGnuTgkill(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxGnuTgkill(p0: Int, p1: Int, p2: Int): Int

public actual fun fgetspentR(fp: MutPtr<FILE>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuFgetspentR(fp.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(s: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuSgetspentR(s.rawAddress.toString(), spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetspentR(spbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), spbufp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    if (unixLinuxlikeLinuxGnuNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxGnuQsortR(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetrlimit64(resource.toInt(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuSetrlimit64(resource.toInt(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetrlimit(resource.toInt(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuSetrlimit(resource.toInt(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPrlimit(pid, resource.toInt(), newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPrlimit64(pid, resource.toInt(), newLimit.rawAddress.toString(), oldLimit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuUtmpname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuUtmpxname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuGetutxid(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuGetutxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuPututxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (unixLinuxlikeLinuxGnuNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxGnuSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (unixLinuxlikeLinuxGnuNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxGnuEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpt(): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetpt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuMallopt(param, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetrandom(buf.rawAddress.toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtimex(buf: MutPtr<Timex>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuAdjtimex(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuNtpAdjtime(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuNtpGettime(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr<Timex>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuClockAdjtime(clkId, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuFanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPreadv2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPwritev2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPreadv64v2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPwritev64v2(fd, iov.rawAddress.toString(), iovcnt, offset.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuRenameat2(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    if (unixLinuxlikeLinuxGnuNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxGnuExplicitBzero(s.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuReallocarray(ptr.rawAddress.toString(), nmemb.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuCtermid(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuBacktrace(buf.rawAddress.toString(), sz) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbols(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt): MutPtr<MutPtr<CChar>> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuBacktraceSymbols(buffer.rawAddress.toString(), len).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtraceSymbolsFd(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt, fd: CInt) {
    if (unixLinuxlikeLinuxGnuNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd(buffer.rawAddress.toString(), len, fd)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGlob64(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: MutPtr<Glob64T>) {
    if (unixLinuxlikeLinuxGnuNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxGnuGlobfree64(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPtrace(request.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp(attr.rawAddress.toString(), cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetpriority(which.toInt(), who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuSetpriority(which.toInt(), who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp(attr.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp(attr.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPthreadTryjoinNp(thread.toLong().toString(), retval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp(thread.toLong().toString(), retval.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo2(): Mallinfo2 =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocStats() {
    if (unixLinuxlikeLinuxGnuNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxGnuMallocStats()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuMallocInfo(options, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuMallocUsableSize(ptr.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetpwentR(pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuGetgrentR(grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwentR(stream: MutPtr<FILE>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuFgetpwentR(stream.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrentR(stream: MutPtr<FILE>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuFgetgrentR(stream.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putpwent(p: ConstPtr<Passwd>, stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPutpwent(p.rawAddress.toString(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putgrent(grp: ConstPtr<Group>, stream: MutPtr<FILE>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPutgrent(grp.rawAddress.toString(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuSethostid(hostid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuMemfdCreate(name.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CUint): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuMlock2(addr.rawAddress.toString(), len.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuEuidaccess(pathname.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuEaccess(pathname.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuAsctimeR(tm.rawAddress.toString(), buf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuCtimeR(timep.rawAddress.toString(), buf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuDirname(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixBasename(path: MutPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuPosixBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuBasename(path: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuGnuBasename(path.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuDlmopen(lmid.toString(), filename.rawAddress.toString(), flag).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlinfo(handle: MutPtr<CVoid>, request: CInt, info: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuDlinfo(handle.rawAddress.toString(), request, info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr1(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>, extraInfo: MutPtr<MutPtr<CVoid>>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuDladdr1(addr.rawAddress.toString(), info.rawAddress.toString(), extraInfo.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuDlvsym(handle.rawAddress.toString(), symbol.rawAddress.toString(), version.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocTrim(pad: SizeT): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuMallocTrim(pad.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcRelease(): ConstPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) ConstPtr(wasmLibcUnixLinuxlikeLinuxGnuGnuGetLibcRelease().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcVersion(): ConstPtr<CChar> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) ConstPtr(wasmLibcUnixLinuxlikeLinuxGnuGnuGetLibcVersion().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr<PosixSpawnFileActionsT>, from: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp(actions.rawAddress.toString(), from) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr<PosixSpawnFileActionsT>, tcfd: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress.toString(), tcfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntentR(stream: MutPtr<FILE>, mntbuf: MutPtr<Mntent>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Mntent> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuGetmntentR(stream.rawAddress.toString(), mntbuf.rawAddress.toString(), buf.rawAddress.toString(), buflen).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execveat(dirfd: CInt, pathname: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>, flags: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuExecveat(dirfd, pathname.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuCloseRange(first.toInt(), last.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqNotify(mqdes: MqdT, sevp: ConstPtr<Sigevent>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuMqNotify(mqdes.toLong().toString(), sevp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait2(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuEpollPwait2(epfd, events.rawAddress.toString(), maxevents, timeout.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mempcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxGnuNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxGnuMempcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    if (unixLinuxlikeLinuxGnuNapiAvailable) wasmLibcUnixLinuxlikeLinuxGnuTgkill(tgid, tid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")
