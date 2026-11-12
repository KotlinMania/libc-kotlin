@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Aiocb
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.RegexT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Sysinfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.ShmidDs
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeLinuxL4reSharedNapiAddon(): Boolean

private val unixLinuxlikeLinuxL4reSharedNapiAvailable: Boolean = initUnixLinuxlikeLinuxL4reSharedNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedIopl(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedIopl(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedIoperm(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedIoperm(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedAioRead(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedAioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedAioWrite(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedAioWrite(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedAioFsync(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedAioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedAioError(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedAioError(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedAioReturn(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedAioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedAioSuspend(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedAioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedAioCancel(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedAioCancel(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedLioListio(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedLioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetloadavg(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetloadavg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedProcessVmReadv(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedProcessVmReadv(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedProcessVmWritev(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedProcessVmWritev(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedFutimes(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedFutimes(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedAbs(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedLabs(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedRand()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSrand(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSrand(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedDrand48()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedDrand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedErand48(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedErand48(p0: String): Double

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedLrand48()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedLrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedNrand48(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedNrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedJrand48(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedJrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSrand48(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSrand48(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSetpwent()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedEndpwent()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetpwent()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSetgrent()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSetgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedEndgrent()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedEndgrent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetgrent()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSetspent()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSetspent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedEndspent()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedEndspent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetspent()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetspent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetspnam(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetspnam(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedShmget(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedShmget(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedShmat(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedShmat(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedShmdt(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedShmdt(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedShmctl(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedShmctl(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedMprotect(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedErrnoLocation()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedErrnoLocation(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedMremap(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedMremap(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGlob(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGlob(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGlobfree(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGlobfree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSeekdir(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedTelldir(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedTelldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedMadvise(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedMsync(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedNlLanginfo(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedNlLanginfo(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedNlLanginfoL(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedNlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSettimeofday(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSemTimedwait(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSemTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSemGetvalue(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSemGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedMount(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedMount(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedPrctl(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedPrctl(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedPpoll(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedPpoll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSethostname(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSethostname(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSysinfo(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSysinfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSigsuspend(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSigsuspend(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSemClose(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSemClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedInitgroups(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedInitgroups(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSemOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSemOpen(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetgrnam(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrnam(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSemUnlink(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSemUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedDaemon(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedDaemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSigwait(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSigwait(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetgrgid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrgid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedPopen(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedPopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedFaccessat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedFaccessat(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSetmntent(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSetmntent(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetmntent(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetmntent(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedAddmntent(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedAddmntent(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedEndmntent(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedEndmntent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedHasmntopt(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedHasmntopt(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedRegcomp(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedRegcomp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedRegexec(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedRegexec(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedRegerror(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedRegerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedRegfree(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedRegfree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedIconvOpen(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedIconvOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedIconv(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedIconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedIconvClose(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedIconvClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGettid()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGettid(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedTimerCreate(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedTimerCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedTimerDelete(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedTimerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedTimerGettime(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedTimerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedTimerSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedTimerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedMemmem(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedMemmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedSchedGetcpu()")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedSchedGetcpu(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedGetoptLong(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedGetoptLong(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedCopyFileRange(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedCopyFileRange(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedFreopen64(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedFreopen64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedFseeko64(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedFseeko64(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedFsetpos64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedFsetpos64(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxL4reSharedFtello64(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxL4reSharedFtello64(p0: String): String

public actual fun iopl(level: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedIopl(level) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedIoperm(from.toString(), num.toString(), turnOn) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedAioRead(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedAioWrite(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedAioFsync(op, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedAioError(aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedAioReturn(aiocbp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedAioCancel(fd, aiocbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedGetloadavg(loadavg.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr<Iovec>, liovcnt: CUlong, remoteIov: ConstPtr<Iovec>, riovcnt: CUlong, flags: CUlong): Long =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedProcessVmReadv(pid, localIov.rawAddress.toString(), liovcnt.toString(), remoteIov.rawAddress.toString(), riovcnt.toString(), flags.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr<Iovec>, liovcnt: CUlong, remoteIov: ConstPtr<Iovec>, riovcnt: CUlong, flags: CUlong): Long =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedProcessVmWritev(pid, localIov.rawAddress.toString(), liovcnt.toString(), remoteIov.rawAddress.toString(), riovcnt.toString(), flags.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedFutimes(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedDrand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedErand48(xseed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedLrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedNrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedJrand48(xseed.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setpwent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedSetspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedEndspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspent(): MutPtr<Spwd> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedGetspent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedGetspnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedShmget(key, size.toString(), shmflg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedShmat(shmid, shmaddr.rawAddress.toString(), shmflg).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedShmdt(shmaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedShmctl(shmid, cmd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr<CInt> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedErrnoLocation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: MutPtr<CVoid>, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedMremap(addr.rawAddress.toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedNlLanginfoL(item, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedMount(src.rawAddress.toString(), target.rawAddress.toString(), fstype.rawAddress.toString(), flags.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedPrctl(option, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedPpoll(fds.rawAddress.toString(), nfds.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSethostname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(info: MutPtr<Sysinfo>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSysinfo(info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSigsuspend(mask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSemClose(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedInitgroups(user.rawAddress.toString(), group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSemUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedDaemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedPopen(command.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr(0L.toString(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedSetmntent(filename.rawAddress.toString(), ty.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedGetmntent(stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addmntent(stream: MutPtr<FILE>, mnt: ConstPtr<Mntent>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedAddmntent(stream.rawAddress.toString(), mnt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedEndmntent(streamp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedHasmntopt(mnt.rawAddress.toString(), opt.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) {
        wasmLibcUnixLinuxlikeLinuxL4reSharedRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedIconvClose(cd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettid(): PidT =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedGettid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedTimerCreate(clockid, sevp.rawAddress.toString(), timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedTimerDelete(timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun(timerid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedTimerGettime(timerid.rawAddress.toString(), currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedTimerSettime(timerid.rawAddress.toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedSchedGetcpu() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileRange(fdIn: CInt, offIn: MutPtr<Off64T>, fdOut: CInt, offOut: MutPtr<Off64T>, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedCopyFileRange(fdIn, offIn.rawAddress.toString(), fdOut, offOut.rawAddress.toString(), len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeLinuxL4reSharedFreopen64(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedFseeko64(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedFsetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    if (unixLinuxlikeLinuxL4reSharedNapiAvailable) wasmLibcUnixLinuxlikeLinuxL4reSharedFtello64(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
