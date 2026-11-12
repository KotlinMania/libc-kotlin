@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.IdtypeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SiginfoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Stat64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statfs64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Statvfs64
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.powerpc64.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeNapiAddon(): Boolean

private val unixLinuxlikeNapiAvailable: Boolean = initUnixLinuxlikeNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeIoctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLibcCurrentSigrtmax()")
private external fun wasmLibcUnixLinuxlikeLibcCurrentSigrtmax(): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeLibcCurrentSigrtmin()")
private external fun wasmLibcUnixLinuxlikeLibcCurrentSigrtmin(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeSemDestroy(p0)")
private external fun wasmLibcUnixLinuxlikeSemDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeSemInit(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeSemInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeFdatasync(p0)")
private external fun wasmLibcUnixLinuxlikeFdatasync(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeMincore(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeMincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeClockGetres(p0, p1)")
private external fun wasmLibcUnixLinuxlikeClockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeClockGettime(p0, p1)")
private external fun wasmLibcUnixLinuxlikeClockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeClockSettime(p0, p1)")
private external fun wasmLibcUnixLinuxlikeClockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeClockGetcpuclockid(p0, p1)")
private external fun wasmLibcUnixLinuxlikeClockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeGetitimer(p0, p1)")
private external fun wasmLibcUnixLinuxlikeGetitimer(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeSetitimer(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeSetitimer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeDirfd(p0)")
private external fun wasmLibcUnixLinuxlikeDirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeMemalign(p0, p1)")
private external fun wasmLibcUnixLinuxlikeMemalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeSetgroups(p0, p1)")
private external fun wasmLibcUnixLinuxlikeSetgroups(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikePipe2(p0, p1)")
private external fun wasmLibcUnixLinuxlikePipe2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeStatfs(p0, p1)")
private external fun wasmLibcUnixLinuxlikeStatfs(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeFstatfs(p0, p1)")
private external fun wasmLibcUnixLinuxlikeFstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeMemrchr(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeMemrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikePosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikePosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeFutimens(p0, p1)")
private external fun wasmLibcUnixLinuxlikeFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeUtimensat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeUtimensat(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeDuplocale(p0)")
private external fun wasmLibcUnixLinuxlikeDuplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeFreelocale(p0)")
private external fun wasmLibcUnixLinuxlikeFreelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeNewlocale(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeNewlocale(p0: Int, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeUselocale(p0)")
private external fun wasmLibcUnixLinuxlikeUselocale(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeMknodat(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeMknodat(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikePtsnameR(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikePtsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeClearenv()")
private external fun wasmLibcUnixLinuxlikeClearenv(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeWaitid(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeWaitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeGetresuid(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeGetresuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeGetresgid(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeGetresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeAcct(p0)")
private external fun wasmLibcUnixLinuxlikeAcct(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeBrk(p0)")
private external fun wasmLibcUnixLinuxlikeBrk(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeSbrk(p0)")
private external fun wasmLibcUnixLinuxlikeSbrk(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeVfork()")
private external fun wasmLibcUnixLinuxlikeVfork(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeSetresgid(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeSetresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeSetresuid(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeSetresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeWait4(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeWait4(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLoginTty(p0)")
private external fun wasmLibcUnixLinuxlikeLoginTty(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeExecvpe(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeExecvpe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeFexecve(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeFexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeGetifaddrs(p0)")
private external fun wasmLibcUnixLinuxlikeGetifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeFreeifaddrs(p0)")
private external fun wasmLibcUnixLinuxlikeFreeifaddrs(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeBind(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeBind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeWritev(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeReadv(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeUname(p0)")
private external fun wasmLibcUnixLinuxlikeUname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeStrchrnul(p0, p1)")
private external fun wasmLibcUnixLinuxlikeStrchrnul(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeStrftime(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeStrftime(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeStrftimeL(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeStrftimeL(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeStrptime(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeStrptime(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeMkostemp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeMkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeMkostemps(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeMkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeGetdomainname(p0, p1)")
private external fun wasmLibcUnixLinuxlikeGetdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeSetdomainname(p0, p1)")
private external fun wasmLibcUnixLinuxlikeSetdomainname(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeIfNameindex()")
private external fun wasmLibcUnixLinuxlikeIfNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeIfFreenameindex(p0)")
private external fun wasmLibcUnixLinuxlikeIfFreenameindex(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeGetpwnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeGetpwnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeGetpwuidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeGetpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeFstatfs64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeFstatfs64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeStatvfs64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeStatvfs64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeFstatvfs64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeFstatvfs64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeStatfs64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeStatfs64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeCreat64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeCreat64(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeFstat64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeFstat64(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeFstatat64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeFstatat64(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeFtruncate64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeFtruncate64(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLseek64(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLseek64(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLstat64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLstat64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeMmap64(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeMmap64(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeOpen64(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeOpen64(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcUnixLinuxlikeOpenat64(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcUnixLinuxlikeOpenat64(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikePosixFadvise64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikePosixFadvise64(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikePread64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikePread64(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikePwrite64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikePwrite64(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeReaddir64(p0)")
private external fun wasmLibcUnixLinuxlikeReaddir64(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeReaddir64R(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeReaddir64R(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeStat64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeStat64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeTruncate64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeTruncate64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikePreadv64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikePreadv64(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikePwritev64(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikePwritev64(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeStatx(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeStatx(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

public actual fun ioctl(fd: CInt, request: Ioctl, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeIoctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmax(): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeLibcCurrentSigrtmax() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmin(): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeLibcCurrentSigrtmin() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeSemDestroy(sem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeSemInit(sem.rawAddress.toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeFdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CUchar>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeClockGetres(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeClockGettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeClockSettime(clkId, tp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeClockGetcpuclockid(pid, clkId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeGetitimer(which, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeSetitimer(which, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeDirfd(dirp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeMemalign(align.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeSetgroups(ngroups.toString(), ptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikePipe2(fds.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeFstatfs(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeMemrchr(cx.rawAddress.toString(), c, n.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikePosixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeDuplocale(base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (unixLinuxlikeNapiAvailable) {
        wasmLibcUnixLinuxlikeFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeUselocale(loc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikePtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeClearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeAcct(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeBrk(addr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeSbrk(increment.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfork(): PidT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeVfork() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeLoginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeGetifaddrs(ifap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    if (unixLinuxlikeNapiAvailable) {
        wasmLibcUnixLinuxlikeFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeBind(socket, address.rawAddress.toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeSendmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeRecvmsg(fd, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeUname(buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeStrchrnul(s.rawAddress.toString(), c).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeStrftime(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftimeL(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>, locale: LocaleT): SizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeStrftimeL(s.rawAddress.toString(), max.toString(), format.rawAddress.toString(), tm.rawAddress.toString(), locale.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeStrptime(s.rawAddress.toString(), format.rawAddress.toString(), tm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeMkostemp(template.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeMkostemps(template.rawAddress.toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeGetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeSetdomainname(name.rawAddress.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeIfNameindex().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    if (unixLinuxlikeNapiAvailable) {
        wasmLibcUnixLinuxlikeIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeFstatfs64(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeStatvfs64(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeFstatvfs64(fd, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeStatfs64(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeCreat64(path.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeFstat64(fildes, buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat64(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeFstatat64(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeFtruncate64(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeLseek64(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeLstat64(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap64(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr<CVoid> =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeMmap64(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeOpen64(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat64(fd: CInt, path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeOpenat64(fd, path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikePosixFadvise64(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikePread64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikePwrite64(fd, buf.rawAddress.toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64(dirp: MutPtr<DIR>): MutPtr<Dirent64> =
    if (unixLinuxlikeNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeReaddir64(dirp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64R(dirp: MutPtr<DIR>, entry: MutPtr<Dirent64>, result: MutPtr<MutPtr<Dirent64>>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeReaddir64R(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeStat64(path.rawAddress.toString(), buf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeTruncate64(path.rawAddress.toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikePreadv64(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikePwritev64(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statx(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, mask: CUint, statxbuf: MutPtr<Statx>): CInt =
    if (unixLinuxlikeNapiAvailable) wasmLibcUnixLinuxlikeStatx(dirfd, pathname.rawAddress.toString(), flags, mask.toInt(), statxbuf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
