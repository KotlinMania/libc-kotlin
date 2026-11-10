@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.NlItem

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixBsdNapiAddon(): Boolean

private val _unixBsdNapiAvailable: Boolean = _initUnixBsdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_bsd_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_bsd_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_abs(p0)")
private external fun _wasm_libc_unix_bsd_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_labs(p0)")
private external fun _wasm_libc_unix_bsd_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_rand()")
private external fun _wasm_libc_unix_bsd_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_srand(p0)")
private external fun _wasm_libc_unix_bsd_srand(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_getifaddrs(p0)")
private external fun _wasm_libc_unix_bsd_getifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_freeifaddrs(p0)")
private external fun _wasm_libc_unix_bsd_freeifaddrs(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_setgroups(p0, p1)")
private external fun _wasm_libc_unix_bsd_setgroups(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_setlogin(p0)")
private external fun _wasm_libc_unix_bsd_setlogin(p0: String?): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_ioctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_kqueue()")
private external fun _wasm_libc_unix_bsd_kqueue(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_unmount(p0, p1)")
private external fun _wasm_libc_unix_bsd_unmount(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_syscall(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_syscall(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_getpwent()")
private external fun _wasm_libc_unix_bsd_getpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_setpwent()")
private external fun _wasm_libc_unix_bsd_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_endpwent()")
private external fun _wasm_libc_unix_bsd_endpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_endgrent()")
private external fun _wasm_libc_unix_bsd_endgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_getgrent()")
private external fun _wasm_libc_unix_bsd_getgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_getprogname()")
private external fun _wasm_libc_unix_bsd_getprogname(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_setprogname(p0)")
private external fun _wasm_libc_unix_bsd_setprogname(p0: String?)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_getloadavg(p0, p1)")
private external fun _wasm_libc_unix_bsd_getloadavg(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_ifNameindex()")
private external fun _wasm_libc_unix_bsd_ifNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_ifFreenameindex(p0)")
private external fun _wasm_libc_unix_bsd_ifFreenameindex(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_getpeereid(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_getpeereid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_glob(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_glob(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_globfree(p0)")
private external fun _wasm_libc_unix_bsd_globfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_posixMadvise(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_posixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_shmUnlink(p0)")
private external fun _wasm_libc_unix_bsd_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_seekdir(p0, p1)")
private external fun _wasm_libc_unix_bsd_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_telldir(p0)")
private external fun _wasm_libc_unix_bsd_telldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_madvise(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_bsd_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_bsd_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_mkstemps(p0, p1)")
private external fun _wasm_libc_unix_bsd_mkstemps(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_futimes(p0, p1)")
private external fun _wasm_libc_unix_bsd_futimes(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_nlLanginfo(p0)")
private external fun _wasm_libc_unix_bsd_nlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_bind(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_writev(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_readv(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_sync()")
private external fun _wasm_libc_unix_bsd_sync()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_sigaltstack(p0, p1)")
private external fun _wasm_libc_unix_bsd_sigaltstack(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_sigsuspend(p0)")
private external fun _wasm_libc_unix_bsd_sigsuspend(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_semClose(p0)")
private external fun _wasm_libc_unix_bsd_semClose(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_getdtablesize()")
private external fun _wasm_libc_unix_bsd_getdtablesize(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_bsd_semOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_bsd_semOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_getgrnam(p0)")
private external fun _wasm_libc_unix_bsd_getgrnam(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_pthreadCancel(p0)")
private external fun _wasm_libc_unix_bsd_pthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_pthreadKill(p0, p1)")
private external fun _wasm_libc_unix_bsd_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_schedGetPriorityMin(p0)")
private external fun _wasm_libc_unix_bsd_schedGetPriorityMin(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_schedGetPriorityMax(p0)")
private external fun _wasm_libc_unix_bsd_schedGetPriorityMax(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_semUnlink(p0)")
private external fun _wasm_libc_unix_bsd_semUnlink(p0: String?): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_getpwnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_getpwnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_getpwuidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_getpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_sigwait(p0, p1)")
private external fun _wasm_libc_unix_bsd_sigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_getgrgid(p0)")
private external fun _wasm_libc_unix_bsd_getgrgid(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_popen(p0, p1)")
private external fun _wasm_libc_unix_bsd_popen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_acct(p0)")
private external fun _wasm_libc_unix_bsd_acct(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_wait4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_wait4(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_getitimer(p0, p1)")
private external fun _wasm_libc_unix_bsd_getitimer(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_setitimer(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_setitimer(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_bsd_regcomp(p0, p1, p2)")
private external fun _wasm_libc_unix_bsd_regcomp(p0: String, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_regexec(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_regexec(p0: String, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_regerror(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_regerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_regfree(p0)")
private external fun _wasm_libc_unix_bsd_regfree(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_arc4random()")
private external fun _wasm_libc_unix_bsd_arc4random(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_arc4randomBuf(p0, p1)")
private external fun _wasm_libc_unix_bsd_arc4randomBuf(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_arc4randomUniform(p0)")
private external fun _wasm_libc_unix_bsd_arc4randomUniform(p0: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_drand48()")
private external fun _wasm_libc_unix_bsd_drand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_erand48(p0)")
private external fun _wasm_libc_unix_bsd_erand48(p0: String): Double

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_lrand48()")
private external fun _wasm_libc_unix_bsd_lrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_nrand48(p0)")
private external fun _wasm_libc_unix_bsd_nrand48(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_mrand48()")
private external fun _wasm_libc_unix_bsd_mrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_jrand48(p0)")
private external fun _wasm_libc_unix_bsd_jrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_srand48(p0)")
private external fun _wasm_libc_unix_bsd_srand48(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_seed48(p0)")
private external fun _wasm_libc_unix_bsd_seed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_bsd_lcong48(p0)")
private external fun _wasm_libc_unix_bsd_lcong48(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_getoptLong(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_getoptLong(p0: Int, p1: String, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_bsd_strftime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_bsd_strftime(p0: String, p1: String, p2: String?, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_bsd_strftimeL(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_bsd_strftimeL(p0: String, p1: String, p2: String?, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_bsd_devname(p0, p1)")
private external fun _wasm_libc_unix_bsd_devname(p0: Int, p1: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_bsd_issetugid()")
private external fun _wasm_libc_unix_bsd_issetugid(): Int

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_setrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getifaddrs((ifap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_freeifaddrs((ifa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_setgroups(ngroups, (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlogin(name: String?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_setlogin(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_ioctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kqueue(): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_kqueue() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unmount(target: String?, arg: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_unmount(target, arg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syscall(num: CInt, vararg variadicArgs: Long): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_syscall(num, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getgrent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getprogname().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(name: String?) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_setprogname(name)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getloadavg((loadavg?.value ?: 0L).toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_ifNameindex().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_ifFreenameindex((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getpeereid(socket, (euid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_mkstemps((template?.value ?: 0L).toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_futimes(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_nlLanginfo(item).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_sendmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_recvmsg(fd, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_semClose((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_pthreadCancel(thread.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_pthreadKill(thread.toLong().toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_schedGetPriorityMin(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_schedGetPriorityMax(policy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_semUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_faccessat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: String?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_acct(filename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getitimer(which, (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_setitimer(which, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_regfree((preg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4random(): UInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_arc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_arc4randomBuf((buf?.value ?: 0L).toString(), size.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4randomUniform(l: UInt): UInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_arc4randomUniform(l.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drand48(): CDouble =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_drand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_erand48((xseed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_lrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_nrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_mrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_jrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_srand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_seed48((xseed?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixBsdNapiAvailable) {
        _wasm_libc_unix_bsd_lcong48((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_strftime((buf?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftimeL(buf: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, locale: LocaleT): SizeT =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_strftimeL((buf?.value ?: 0L).toString(), maxsize.toString(), format, (timeptr?.value ?: 0L).toString(), (locale?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun devname(dev: DevT, modeT: ModeT): COpaquePointer? =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_devname(dev, modeT.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun issetugid(): CInt =
    if (_unixBsdNapiAvailable) _wasm_libc_unix_bsd_issetugid() else throw UnsupportedOperationException("Native FFI addon is not available")
