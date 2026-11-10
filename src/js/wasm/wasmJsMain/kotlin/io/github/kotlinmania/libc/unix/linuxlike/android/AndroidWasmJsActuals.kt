@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixLinuxlikeAndroidNapiAddon(): Boolean

private val _unixLinuxlikeAndroidNapiAvailable: Boolean = _initUnixLinuxlikeAndroidNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_setgrent()")
private external fun _wasm_libc_unix_linuxlike_android_setgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_endgrent()")
private external fun _wasm_libc_unix_linuxlike_android_endgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getgrent()")
private external fun _wasm_libc_unix_linuxlike_android_getgrent(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getrlimit64(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_getrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_setrlimit64(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_setrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_prlimit(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_prlimit(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_prlimit64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_prlimit64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_mlock2(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_mlock2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_madvise(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_linuxlike_android_getnameinfo(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_processVmReadv(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_android_processVmReadv(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_processVmWritev(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_android_processVmWritev(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_ptrace(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_android_ptrace(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getpriority(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedCpualloc(p0)")
private external fun _wasm_libc_unix_linuxlike_android_schedCpualloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedCpufree(p0)")
private external fun _wasm_libc_unix_linuxlike_android_schedCpufree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedCpucount(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_schedCpucount(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedGetcpu()")
private external fun _wasm_libc_unix_linuxlike_android_schedGetcpu(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_mallocInfo(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_mallocInfo(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_mallocUsableSize(p0)")
private external fun _wasm_libc_unix_linuxlike_android_mallocUsableSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_utmpname(p0)")
private external fun _wasm_libc_unix_linuxlike_android_utmpname(p0: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_setutent()")
private external fun _wasm_libc_unix_linuxlike_android_setutent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getutent()")
private external fun _wasm_libc_unix_linuxlike_android_getutent(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_seekdir(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_telldir(p0)")
private external fun _wasm_libc_unix_linuxlike_android_telldir(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_fallocate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_fallocate(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_fallocate64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_fallocate64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_posixFallocate64(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_posixFallocate64(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_getxattr(p0: String?, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_lgetxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_lgetxattr(p0: String?, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_fgetxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_fgetxattr(p0: Int, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_setxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_android_setxattr(p0: String?, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_lsetxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_android_lsetxattr(p0: String?, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_fsetxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_android_fsetxattr(p0: Int, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_listxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_listxattr(p0: String?, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_llistxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_llistxattr(p0: String?, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_flistxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_flistxattr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_removexattr(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_removexattr(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_lremovexattr(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_lremovexattr(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_fremovexattr(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_fremovexattr(p0: Int, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_signalfd(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_signalfd(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_timerfdCreate(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_timerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_timerfdGettime(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_timerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_timerfdSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_timerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_syscall(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_android_syscall(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedGetaffinity(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_schedGetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedSetaffinity(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_schedSetaffinity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_epollCreate(p0)")
private external fun _wasm_libc_unix_linuxlike_android_epollCreate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_epollCreate1(p0)")
private external fun _wasm_libc_unix_linuxlike_android_epollCreate1(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_epollWait(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_epollWait(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_epollCtl(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_epollCtl(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_unshare(p0)")
private external fun _wasm_libc_unix_linuxlike_android_unshare(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_umount(p0)")
private external fun _wasm_libc_unix_linuxlike_android_umount(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedGetPriorityMax(p0)")
private external fun _wasm_libc_unix_linuxlike_android_schedGetPriorityMax(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_tee(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_tee(p0: Int, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_settimeofday(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_settimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_splice(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_android_splice(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_eventfd(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_eventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_eventfdRead(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_eventfdRead(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_eventfdWrite(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_eventfdWrite(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedRrGetInterval(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_schedRrGetInterval(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_semTimedwait(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_semTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_semGetvalue(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_semGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedSetparam(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_setns(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_setns(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_swapoff(p0)")
private external fun _wasm_libc_unix_linuxlike_android_swapoff(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_vmsplice(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_vmsplice(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_mount(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_android_mount(p0: String?, p1: String?, p2: String?, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_personality(p0)")
private external fun _wasm_libc_unix_linuxlike_android_personality(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_prctl(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_linuxlike_android_prctl(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedGetparam(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_ppoll(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_ppoll(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_clone(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_libc_unix_linuxlike_android_clone(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedGetscheduler(p0)")
private external fun _wasm_libc_unix_linuxlike_android_schedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_clockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_sethostname(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_sethostname(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedGetPriorityMin(p0)")
private external fun _wasm_libc_unix_linuxlike_android_schedGetPriorityMin(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_sysinfo(p0)")
private external fun _wasm_libc_unix_linuxlike_android_sysinfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_umount2(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_umount2(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_swapon(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_swapon(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_sendfile(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_sendfile(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_sendfile64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_sendfile64(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_setfsgid(p0)")
private external fun _wasm_libc_unix_linuxlike_android_setfsgid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_setfsuid(p0)")
private external fun _wasm_libc_unix_linuxlike_android_setfsuid(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_sigsuspend(p0)")
private external fun _wasm_libc_unix_linuxlike_android_sigsuspend(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_android_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_sigaltstack(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_sigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_semClose(p0)")
private external fun _wasm_libc_unix_linuxlike_android_semClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_android_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_linuxlike_android_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getgrnam(p0)")
private external fun _wasm_libc_unix_linuxlike_android_getgrnam(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_semUnlink(p0)")
private external fun _wasm_libc_unix_linuxlike_android_semUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_daemon(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_sigwait(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_sigwait(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getgrgid(p0)")
private external fun _wasm_libc_unix_linuxlike_android_getgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_initgroups(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_popen(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_popen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_errno()")
private external fun _wasm_libc_unix_linuxlike_android_errno(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_inotifyRmWatch(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_inotifyRmWatch(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_inotifyInit()")
private external fun _wasm_libc_unix_linuxlike_android_inotifyInit(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_inotifyInit1(p0)")
private external fun _wasm_libc_unix_linuxlike_android_inotifyInit1(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_inotifyAddWatch(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_inotifyAddWatch(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_regcomp(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_regcomp(p0: String, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_regexec(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_android_regexec(p0: String, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_regerror(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_regerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_regfree(p0)")
private external fun _wasm_libc_unix_linuxlike_android_regfree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_androidSetAbortMessage(p0)")
private external fun _wasm_libc_unix_linuxlike_android_androidSetAbortMessage(p0: String?)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_gettid()")
private external fun _wasm_libc_unix_linuxlike_android_gettid(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_tgkill(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_tgkill(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getauxval(p0)")
private external fun _wasm_libc_unix_linuxlike_android_getauxval(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_getrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getentropy(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_systemPropertySet(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_systemPropertySet(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_systemPropertyGet(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_systemPropertyGet(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_systemPropertyFind(p0)")
private external fun _wasm_libc_unix_linuxlike_android_systemPropertyFind(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_systemPropertyFindNth(p0)")
private external fun _wasm_libc_unix_linuxlike_android_systemPropertyFindNth(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_systemPropertyForeach(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_systemPropertyForeach(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_dlIteratePhdr(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_dlIteratePhdr(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_arc4random()")
private external fun _wasm_libc_unix_linuxlike_android_arc4random(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_arc4randomUniform(p0)")
private external fun _wasm_libc_unix_linuxlike_android_arc4randomUniform(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_arc4randomBuf(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_arc4randomBuf(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_reallocarray(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_reallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_dirname(p0)")
private external fun _wasm_libc_unix_linuxlike_android_dirname(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_basename(p0)")
private external fun _wasm_libc_unix_linuxlike_android_basename(p0: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_getoptLong(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_android_getoptLong(p0: Int, p1: String, p2: String?, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_linuxlike_android_sync()")
private external fun _wasm_libc_unix_linuxlike_android_sync()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_syncfs(p0)")
private external fun _wasm_libc_unix_linuxlike_android_syncfs(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_memmem(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_memmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_freadUnlocked(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_freadUnlocked(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_fwriteUnlocked(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_linuxlike_android_fwriteUnlocked(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_fflushUnlocked(p0)")
private external fun _wasm_libc_unix_linuxlike_android_fflushUnlocked(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_fgetsUnlocked(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_fgetsUnlocked(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_klogctl(p0, p1, p2)")
private external fun _wasm_libc_unix_linuxlike_android_klogctl(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_memfdCreate(p0, p1)")
private external fun _wasm_libc_unix_linuxlike_android_memfdCreate(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_linuxlike_android_renameat2(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_linuxlike_android_renameat2(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

public actual fun setgrent() {
    if (_unixLinuxlikeAndroidNapiAvailable) {
        _wasm_libc_unix_linuxlike_android_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixLinuxlikeAndroidNapiAvailable) {
        _wasm_libc_unix_linuxlike_android_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getgrent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getrlimit64(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_setrlimit64(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_setrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_prlimit(pid, resource, (newLimit?.value ?: 0L).toString(), (oldLimit?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_prlimit64(pid, resource, (newLimit?.value ?: 0L).toString(), (oldLimit?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_mlock2((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toString(), (serv?.value ?: 0L).toString(), servlen.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_preadv(fd, (iov?.value ?: 0L).toString(), count, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_pwritev(fd, (iov?.value ?: 0L).toString(), count, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_processVmReadv(pid, (localIov?.value ?: 0L).toString(), localIovCount.toString(), (remoteIov?.value ?: 0L).toString(), remoteIovCount.toString(), flags.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, localIovCount: CUlong, remoteIov: COpaquePointer?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_processVmWritev(pid, (localIov?.value ?: 0L).toString(), localIovCount.toString(), (remoteIov?.value ?: 0L).toString(), remoteIovCount.toString(), flags.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CInt, vararg variadicArgs: Long): CLong =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_ptrace(request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_setpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCpualloc(count: SizeT): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedCpualloc(count.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedCpufree(set: COpaquePointer?) {
    if (_unixLinuxlikeAndroidNapiAvailable) {
        _wasm_libc_unix_linuxlike_android_schedCpufree((set?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun schedCpucount(setsize: SizeT, set: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedCpucount(setsize.toString(), (set?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedGetcpu() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_mallocInfo(options, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_mallocUsableSize((ptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_utmpname(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (_unixLinuxlikeAndroidNapiAvailable) {
        _wasm_libc_unix_linuxlike_android_setutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutent(): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getutent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixLinuxlikeAndroidNapiAvailable) {
        _wasm_libc_unix_linuxlike_android_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_fallocate(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_fallocate64(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_posixFallocate64(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getxattr(path, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_lgetxattr(path, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_fgetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_setxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_lsetxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_fsetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_listxattr(path, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_llistxattr(path, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_flistxattr(filedes, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: String?, name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_removexattr(path, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_lremovexattr(path, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_fremovexattr(filedes, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_signalfd(fd, (mask?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_timerfdCreate(clock, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currentValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_timerfdGettime(fd, (currentValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_syscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedGetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_epollCreate(size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_epollCreate1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_epollWait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_epollCtl(epfd, op, fd, (event?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unshare(flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_unshare(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_umount(target) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_tee(fdIn, fdOut, len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_splice(fdIn, (offIn?.value ?: 0L).toString(), fdOut, (offOut?.value ?: 0L).toString(), len.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_eventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_eventfdRead(fd, (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_eventfdWrite(fd, value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_setns(fd, nstype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(puath: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_swapoff(puath) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_vmsplice(fd, (iov?.value ?: 0L).toString(), nrSegs.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_mount(src, target, fstype, flags.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUint): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_personality(persona.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_prctl(option, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_ppoll((fds?.value ?: 0L).toString(), nfds.toInt(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_clone(0L.toString(), (childStack?.value ?: 0L).toString(), flags, (arg?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_sethostname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(info: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_sysinfo((info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: String?, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_umount2(target, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_swapon(path, swapflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_sendfile(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_sendfile64(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_setfsgid(gid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_setfsuid(uid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_initgroups(user, group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_faccessat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errno(): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_errno().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_inotifyRmWatch(fd, wd.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit(): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_inotifyInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyInit1(flags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_inotifyInit1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_inotifyAddWatch(fd, path, mask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixLinuxlikeAndroidNapiAvailable) {
        _wasm_libc_unix_linuxlike_android_regfree((preg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun androidSetAbortMessage(msg: String?) {
    if (_unixLinuxlikeAndroidNapiAvailable) {
        _wasm_libc_unix_linuxlike_android_androidSetAbortMessage(msg)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gettid(): PidT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_gettid() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_tgkill(tgid, tid, sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertySet(name: String?, value: String?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_systemPropertySet(name, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyGet(name: String?, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_systemPropertyGet(name, (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyFind(name: String?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_systemPropertyFind(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyFindNth(n: CUint): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_systemPropertyFindNth(n.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_systemPropertyForeach(0L.toString(), (cookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_arc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_arc4randomUniform(upperBound.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    if (_unixLinuxlikeAndroidNapiAvailable) {
        _wasm_libc_unix_linuxlike_android_arc4randomBuf((buf?.value ?: 0L).toString(), n.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: String?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_dirname(path).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun basename(path: String?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_basename(path).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixLinuxlikeAndroidNapiAvailable) {
        _wasm_libc_unix_linuxlike_android_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_syncfs(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_freadUnlocked((buf?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_fwriteUnlocked((buf?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflushUnlocked(stream: FILE?): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_fflushUnlocked((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetsUnlocked(buf: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_fgetsUnlocked((buf?.value ?: 0L).toString(), size, (stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_klogctl(syslogType, (bufp?.value ?: 0L).toString(), len) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_memfdCreate(name, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    if (_unixLinuxlikeAndroidNapiAvailable) _wasm_libc_unix_linuxlike_android_renameat2(olddirfd, oldpath, newdirfd, newpath, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
