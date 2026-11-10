@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.SizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixHurdNapiAddon(): Boolean

private val _unixHurdNapiAvailable: Boolean = _initUnixHurdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_lutimes(p0, p1)")
private external fun _wasm_libc_unix_hurd_lutimes(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_futimes(p0, p1)")
private external fun _wasm_libc_unix_hurd_futimes(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_futimens(p0, p1)")
private external fun _wasm_libc_unix_hurd_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_utimensat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_utimensat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_mkfifoat(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_mkfifoat(p0: Int, p1: String?, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_mknodat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_mknodat(p0: Int, p1: String?, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_libcCurrentSigrtmin()")
private external fun _wasm_libc_unix_hurd_libcCurrentSigrtmin(): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_libcCurrentSigrtmax()")
private external fun _wasm_libc_unix_hurd_libcCurrentSigrtmax(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_wait4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_wait4(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_waitid(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_waitid(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_sigwait(p0, p1)")
private external fun _wasm_libc_unix_hurd_sigwait(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_sigsuspend(p0)")
private external fun _wasm_libc_unix_hurd_sigsuspend(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_sigwaitinfo(p0, p1)")
private external fun _wasm_libc_unix_hurd_sigwaitinfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_sigaltstack(p0, p1)")
private external fun _wasm_libc_unix_hurd_sigaltstack(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_hurd_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_hurd_ioctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pipe2(p0, p1)")
private external fun _wasm_libc_unix_hurd_pipe2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_dup3(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_dup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_pread64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_pread64(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_pwrite64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_pwrite64(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_readv(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_writev(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_preadv64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_preadv64(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_pwritev64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_pwritev64(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_freadUnlocked(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_freadUnlocked(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_aioRead(p0)")
private external fun _wasm_libc_unix_hurd_aioRead(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_aioWrite(p0)")
private external fun _wasm_libc_unix_hurd_aioWrite(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_aioFsync(p0, p1)")
private external fun _wasm_libc_unix_hurd_aioFsync(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_aioError(p0)")
private external fun _wasm_libc_unix_hurd_aioError(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_aioReturn(p0)")
private external fun _wasm_libc_unix_hurd_aioReturn(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_aioSuspend(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_aioSuspend(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_aioCancel(p0, p1)")
private external fun _wasm_libc_unix_hurd_aioCancel(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_lioListio(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_lioListio(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_hurd_mqOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_hurd_mqOpen(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_mqClose(p0)")
private external fun _wasm_libc_unix_hurd_mqClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_mqUnlink(p0)")
private external fun _wasm_libc_unix_hurd_mqUnlink(p0: String?): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_mqReceive(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_mqReceive(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_mqTimedreceive(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_mqTimedreceive(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_mqSend(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_mqSend(p0: String, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_mqTimedsend(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_mqTimedsend(p0: String, p1: String?, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_mqGetattr(p0, p1)")
private external fun _wasm_libc_unix_hurd_mqGetattr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_mqSetattr(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_mqSetattr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_lseek64(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_lseek64(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_lseek(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_lseek(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fgetpos64(p0, p1)")
private external fun _wasm_libc_unix_hurd_fgetpos64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_fseeko64(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_fseeko64(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fsetpos64(p0, p1)")
private external fun _wasm_libc_unix_hurd_fsetpos64(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_ftello64(p0)")
private external fun _wasm_libc_unix_hurd_ftello64(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_bind(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_ppoll(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_ppoll(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_hurd_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_hurd_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_sendfile(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_sendfile(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_sendfile64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_sendfile64(p0: Int, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_shutdown(p0, p1)")
private external fun _wasm_libc_unix_hurd_shutdown(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_sethostname(p0, p1)")
private external fun _wasm_libc_unix_hurd_sethostname(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_getdomainname(p0, p1)")
private external fun _wasm_libc_unix_hurd_getdomainname(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_setdomainname(p0, p1)")
private external fun _wasm_libc_unix_hurd_setdomainname(p0: String?, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_ifNameindex()")
private external fun _wasm_libc_unix_hurd_ifNameindex(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_ifFreenameindex(p0)")
private external fun _wasm_libc_unix_hurd_ifFreenameindex(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_hurd_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_hurd_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_getifaddrs(p0)")
private external fun _wasm_libc_unix_hurd_getifaddrs(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_freeifaddrs(p0)")
private external fun _wasm_libc_unix_hurd_freeifaddrs(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_uname(p0)")
private external fun _wasm_libc_unix_hurd_uname(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_gethostid()")
private external fun _wasm_libc_unix_hurd_gethostid(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_sethostid(p0)")
private external fun _wasm_libc_unix_hurd_sethostid(p0: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_setpwent()")
private external fun _wasm_libc_unix_hurd_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_endpwent()")
private external fun _wasm_libc_unix_hurd_endpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_getpwent()")
private external fun _wasm_libc_unix_hurd_getpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_setgrent()")
private external fun _wasm_libc_unix_hurd_setgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_endgrent()")
private external fun _wasm_libc_unix_hurd_endgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_getgrent()")
private external fun _wasm_libc_unix_hurd_getgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_setspent()")
private external fun _wasm_libc_unix_hurd_setspent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_endspent()")
private external fun _wasm_libc_unix_hurd_endspent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_getspent()")
private external fun _wasm_libc_unix_hurd_getspent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_getspnam(p0)")
private external fun _wasm_libc_unix_hurd_getspnam(p0: String?): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_getpwentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_getpwentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_getgrentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_getgrentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_fgetpwentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_fgetpwentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_fgetgrentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_fgetgrentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_putpwent(p0, p1)")
private external fun _wasm_libc_unix_hurd_putpwent(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_putgrent(p0, p1)")
private external fun _wasm_libc_unix_hurd_putgrent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_getpwnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_getpwnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_getpwuidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_getpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_fgetspentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_fgetspentR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_sgetspentR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_sgetspentR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_getspentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_getspentR(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_getspnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_getspnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_getmntentR(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_getmntentR(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_utmpname(p0)")
private external fun _wasm_libc_unix_hurd_utmpname(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_utmpxname(p0)")
private external fun _wasm_libc_unix_hurd_utmpxname(p0: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_getutxent()")
private external fun _wasm_libc_unix_hurd_getutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_getutxid(p0)")
private external fun _wasm_libc_unix_hurd_getutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_getutxline(p0)")
private external fun _wasm_libc_unix_hurd_getutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pututxline(p0)")
private external fun _wasm_libc_unix_hurd_pututxline(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_setutxent()")
private external fun _wasm_libc_unix_hurd_setutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_endutxent()")
private external fun _wasm_libc_unix_hurd_endutxent()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_getresuid(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_getresuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_getresgid(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_getresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_setresuid(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_setresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_setresgid(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_setresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_initgroups(p0, p1)")
private external fun _wasm_libc_unix_hurd_initgroups(p0: String?, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_getgrgid(p0)")
private external fun _wasm_libc_unix_hurd_getgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_getgrnam(p0)")
private external fun _wasm_libc_unix_hurd_getgrnam(p0: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_setgroups(p0, p1)")
private external fun _wasm_libc_unix_hurd_setgroups(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_acct(p0)")
private external fun _wasm_libc_unix_hurd_acct(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_setmntent(p0, p1)")
private external fun _wasm_libc_unix_hurd_setmntent(p0: String?, p1: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_getmntent(p0)")
private external fun _wasm_libc_unix_hurd_getmntent(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_addmntent(p0, p1)")
private external fun _wasm_libc_unix_hurd_addmntent(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_endmntent(p0)")
private external fun _wasm_libc_unix_hurd_endmntent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_hasmntopt(p0, p1)")
private external fun _wasm_libc_unix_hurd_hasmntopt(p0: String, p1: String?): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadKill(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadCancel(p0)")
private external fun _wasm_libc_unix_hurd_pthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadEqual(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadEqual(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadGetattrNp(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadGetattrNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadAttrGetguardsize(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadAttrGetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadAttrSetguardsize(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadAttrSetguardsize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadAttrGetstack(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_pthreadAttrGetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadMutexattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadMutexattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadMutexattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadMutexattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadMutexTimedlock(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadMutexTimedlock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadRwlockattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadRwlockattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadRwlockattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadRwlockattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadCondattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadCondattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadCondattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadCondattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadOnce(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadOnce(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadBarrierattrInit(p0)")
private external fun _wasm_libc_unix_hurd_pthreadBarrierattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadBarrierattrDestroy(p0)")
private external fun _wasm_libc_unix_hurd_pthreadBarrierattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadBarrierattrGetpshared(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadBarrierattrGetpshared(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadBarrierattrSetpshared(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadBarrierattrSetpshared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadBarrierInit(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_pthreadBarrierInit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadBarrierDestroy(p0)")
private external fun _wasm_libc_unix_hurd_pthreadBarrierDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadBarrierWait(p0)")
private external fun _wasm_libc_unix_hurd_pthreadBarrierWait(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadSpinInit(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadSpinInit(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadSpinDestroy(p0)")
private external fun _wasm_libc_unix_hurd_pthreadSpinDestroy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadSpinLock(p0)")
private external fun _wasm_libc_unix_hurd_pthreadSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadSpinTrylock(p0)")
private external fun _wasm_libc_unix_hurd_pthreadSpinTrylock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadSpinUnlock(p0)")
private external fun _wasm_libc_unix_hurd_pthreadSpinUnlock(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_schedGetparam(p0, p1)")
private external fun _wasm_libc_unix_hurd_schedGetparam(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_schedSetparam(p0, p1)")
private external fun _wasm_libc_unix_hurd_schedSetparam(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_schedGetscheduler(p0)")
private external fun _wasm_libc_unix_hurd_schedGetscheduler(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_schedSetscheduler(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_schedSetscheduler(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadGetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_pthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadSetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_pthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_pthreadGetcpuclockid(p0, p1)")
private external fun _wasm_libc_unix_hurd_pthreadGetcpuclockid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_semInit(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_semInit(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_semDestroy(p0)")
private external fun _wasm_libc_unix_hurd_semDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_semTimedwait(p0, p1)")
private external fun _wasm_libc_unix_hurd_semTimedwait(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_semGetvalue(p0, p1)")
private external fun _wasm_libc_unix_hurd_semGetvalue(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_clockGetres(p0, p1)")
private external fun _wasm_libc_unix_hurd_clockGetres(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_hurd_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_clockSettime(p0, p1)")
private external fun _wasm_libc_unix_hurd_clockSettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_clockGetcpuclockid(p0, p1)")
private external fun _wasm_libc_unix_hurd_clockGetcpuclockid(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_clockNanosleep(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_clockNanosleep(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_hurd_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_settimeofday(p0, p1)")
private external fun _wasm_libc_unix_hurd_settimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_asctimeR(p0, p1)")
private external fun _wasm_libc_unix_hurd_asctimeR(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_ctimeR(p0, p1)")
private external fun _wasm_libc_unix_hurd_ctimeR(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_strftime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_strftime(p0: String, p1: String, p2: String?, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_strptime(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_strptime(p0: String?, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_timerCreate(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_timerCreate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_timerDelete(p0)")
private external fun _wasm_libc_unix_hurd_timerDelete(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_timerGetoverrun(p0)")
private external fun _wasm_libc_unix_hurd_timerGetoverrun(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_timerGettime(p0, p1)")
private external fun _wasm_libc_unix_hurd_timerGettime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_timerSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_timerSettime(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fstat(p0, p1)")
private external fun _wasm_libc_unix_hurd_fstat(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fstat64(p0, p1)")
private external fun _wasm_libc_unix_hurd_fstat64(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_fstatat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_fstatat(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_fstatat64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_fstatat64(p0: Int, p1: String?, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_statx(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_statx(p0: Int, p1: String?, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_ftruncate(p0, p1)")
private external fun _wasm_libc_unix_hurd_ftruncate(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_ftruncate64(p0, p1)")
private external fun _wasm_libc_unix_hurd_ftruncate64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_truncate64(p0, p1)")
private external fun _wasm_libc_unix_hurd_truncate64(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_lstat(p0, p1)")
private external fun _wasm_libc_unix_hurd_lstat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_lstat64(p0, p1)")
private external fun _wasm_libc_unix_hurd_lstat64(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_statfs(p0, p1)")
private external fun _wasm_libc_unix_hurd_statfs(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_statfs64(p0, p1)")
private external fun _wasm_libc_unix_hurd_statfs64(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fstatfs(p0, p1)")
private external fun _wasm_libc_unix_hurd_fstatfs(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fstatfs64(p0, p1)")
private external fun _wasm_libc_unix_hurd_fstatfs64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_statvfs(p0, p1)")
private external fun _wasm_libc_unix_hurd_statvfs(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_statvfs64(p0, p1)")
private external fun _wasm_libc_unix_hurd_statvfs64(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fstatvfs(p0, p1)")
private external fun _wasm_libc_unix_hurd_fstatvfs(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fstatvfs64(p0, p1)")
private external fun _wasm_libc_unix_hurd_fstatvfs64(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_hurd_open(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_hurd_open(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_hurd_open64(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_hurd_open64(p0: String?, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_hurd_openat(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_hurd_openat(p0: Int, p1: String?, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_unix_hurd_openat64(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_unix_hurd_openat64(p0: Int, p1: String?, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fopen64(p0, p1)")
private external fun _wasm_libc_unix_hurd_fopen64(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_freopen64(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_freopen64(p0: String?, p1: String?, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_creat64(p0, p1)")
private external fun _wasm_libc_unix_hurd_creat64(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_mkostemp(p0, p1)")
private external fun _wasm_libc_unix_hurd_mkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_mkostemps(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_mkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_mkstemps(p0, p1)")
private external fun _wasm_libc_unix_hurd_mkstemps(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_tmpfile64()")
private external fun _wasm_libc_unix_hurd_tmpfile64(): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_popen(p0, p1)")
private external fun _wasm_libc_unix_hurd_popen(p0: String?, p1: String?): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_getdtablesize()")
private external fun _wasm_libc_unix_hurd_getdtablesize(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_closeRange(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_closeRange(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_forkpty(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_forkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_getpt()")
private external fun _wasm_libc_unix_hurd_getpt(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_ptsnameR(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_ptsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_loginTty(p0)")
private external fun _wasm_libc_unix_hurd_loginTty(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_ctermid(p0)")
private external fun _wasm_libc_unix_hurd_ctermid(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_clearenv()")
private external fun _wasm_libc_unix_hurd_clearenv(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_execveat(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_execveat(p0: Int, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_execvpe(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_execvpe(p0: String?, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_fexecve(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_fexecve(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_daemon(p0, p1)")
private external fun _wasm_libc_unix_hurd_daemon(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawn(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_hurd_posixSpawn(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_hurd_posixSpawnp(p0: String, p1: String?, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrInit(p0)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrDestroy(p0)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrDestroy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrGetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrGetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrSetsigdefault(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrSetsigdefault(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrGetsigmask(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrGetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrSetsigmask(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrSetsigmask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrGetflags(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrGetflags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrSetflags(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrSetflags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrGetpgroup(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrGetpgroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrSetpgroup(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrSetpgroup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrGetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrGetschedpolicy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrSetschedpolicy(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrSetschedpolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrGetschedparam(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnattrSetschedparam(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnattrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnFileActionsInit(p0)")
private external fun _wasm_libc_unix_hurd_posixSpawnFileActionsInit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnFileActionsDestroy(p0)")
private external fun _wasm_libc_unix_hurd_posixSpawnFileActionsDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnFileActionsAddopen(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_posixSpawnFileActionsAddopen(p0: String, p1: Int, p2: String?, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnFileActionsAddclose(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnFileActionsAddclose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnFileActionsAdddup2(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_posixSpawnFileActionsAdddup2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnFileActionsAddchdirNp(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnFileActionsAddchdirNp(p0: String, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnFileActionsAddfchdirNp(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnFileActionsAddfchdirNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnFileActionsAddclosefromNp(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnFileActionsAddclosefromNp(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_posixSpawnFileActionsAddtcsetpgrpNp(p0, p1)")
private external fun _wasm_libc_unix_hurd_posixSpawnFileActionsAddtcsetpgrpNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_shmUnlink(p0)")
private external fun _wasm_libc_unix_hurd_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_euidaccess(p0, p1)")
private external fun _wasm_libc_unix_hurd_euidaccess(p0: String?, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_eaccess(p0, p1)")
private external fun _wasm_libc_unix_hurd_eaccess(p0: String?, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_faccessat(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_faccessat(p0: Int, p1: String?, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_stat(p0, p1)")
private external fun _wasm_libc_unix_hurd_stat(p0: String?, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_stat64(p0, p1)")
private external fun _wasm_libc_unix_hurd_stat64(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_readdir(p0)")
private external fun _wasm_libc_unix_hurd_readdir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_readdir64(p0)")
private external fun _wasm_libc_unix_hurd_readdir64(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_readdirR(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_readdirR(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_readdir64R(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_readdir64R(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_seekdir(p0, p1)")
private external fun _wasm_libc_unix_hurd_seekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_telldir(p0)")
private external fun _wasm_libc_unix_hurd_telldir(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_dirfd(p0)")
private external fun _wasm_libc_unix_hurd_dirfd(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_errnoLocation()")
private external fun _wasm_libc_unix_hurd_errnoLocation(): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_hurd_mmap64(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_hurd_mmap64(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libc_unix_hurd_mremap(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_libc_unix_hurd_mremap(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_msync(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_sync()")
private external fun _wasm_libc_unix_hurd_sync()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_syncfs(p0)")
private external fun _wasm_libc_unix_hurd_syncfs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_fdatasync(p0)")
private external fun _wasm_libc_unix_hurd_fdatasync(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_fallocate64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_fallocate64(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_posixFallocate(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_posixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_posixFallocate64(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_posixFallocate64(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_posixFadvise(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_posixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_posixFadvise64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_posixFadvise64(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_madvise(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_posixMadvise(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_posixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_hurd_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_getrlimit64(p0, p1)")
private external fun _wasm_libc_unix_hurd_getrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_hurd_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_setrlimit64(p0, p1)")
private external fun _wasm_libc_unix_hurd_setrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_getpriority(p0, p1)")
private external fun _wasm_libc_unix_hurd_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_getrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_getrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_getentropy(p0, p1)")
private external fun _wasm_libc_unix_hurd_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_memrchr(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_memrchr(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_memmem(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_memmem(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_strchrnul(p0, p1)")
private external fun _wasm_libc_unix_hurd_strchrnul(p0: String?, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_abs(p0)")
private external fun _wasm_libc_unix_hurd_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_labs(p0)")
private external fun _wasm_libc_unix_hurd_labs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_rand()")
private external fun _wasm_libc_unix_hurd_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_srand(p0)")
private external fun _wasm_libc_unix_hurd_srand(p0: Int)

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_drand48()")
private external fun _wasm_libc_unix_hurd_drand48(): Double

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_erand48(p0)")
private external fun _wasm_libc_unix_hurd_erand48(p0: String): Double

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_lrand48()")
private external fun _wasm_libc_unix_hurd_lrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_nrand48(p0)")
private external fun _wasm_libc_unix_hurd_nrand48(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_mrand48()")
private external fun _wasm_libc_unix_hurd_mrand48(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_jrand48(p0)")
private external fun _wasm_libc_unix_hurd_jrand48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_srand48(p0)")
private external fun _wasm_libc_unix_hurd_srand48(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_seed48(p0)")
private external fun _wasm_libc_unix_hurd_seed48(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_lcong48(p0)")
private external fun _wasm_libc_unix_hurd_lcong48(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_qsortR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_qsortR(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_brk(p0)")
private external fun _wasm_libc_unix_hurd_brk(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_sbrk(p0)")
private external fun _wasm_libc_unix_hurd_sbrk(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_memalign(p0, p1)")
private external fun _wasm_libc_unix_hurd_memalign(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_mallopt(p0, p1)")
private external fun _wasm_libc_unix_hurd_mallopt(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_mallocInfo(p0, p1)")
private external fun _wasm_libc_unix_hurd_mallocInfo(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_mallocUsableSize(p0)")
private external fun _wasm_libc_unix_hurd_mallocUsableSize(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_mallocTrim(p0)")
private external fun _wasm_libc_unix_hurd_mallocTrim(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_iconvOpen(p0, p1)")
private external fun _wasm_libc_unix_hurd_iconvOpen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_iconv(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_iconv(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_iconvClose(p0)")
private external fun _wasm_libc_unix_hurd_iconvClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_getoptLong(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_getoptLong(p0: Int, p1: String, p2: String?, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_backtrace(p0, p1)")
private external fun _wasm_libc_unix_hurd_backtrace(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_reboot(p0)")
private external fun _wasm_libc_unix_hurd_reboot(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_getloadavg(p0, p1)")
private external fun _wasm_libc_unix_hurd_getloadavg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_regexec(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_regexec(p0: String, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_regerror(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_regerror(p0: Int, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_regfree(p0)")
private external fun _wasm_libc_unix_hurd_regfree(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_glob(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_glob(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_globfree(p0)")
private external fun _wasm_libc_unix_hurd_globfree(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_glob64(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_glob64(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_globfree64(p0)")
private external fun _wasm_libc_unix_hurd_globfree64(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_getxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_getxattr(p0: String?, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_lgetxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_lgetxattr(p0: String?, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_fgetxattr(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_fgetxattr(p0: Int, p1: String?, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_setxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_setxattr(p0: String?, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_lsetxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_lsetxattr(p0: String?, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_hurd_fsetxattr(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_hurd_fsetxattr(p0: Int, p1: String?, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_listxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_listxattr(p0: String?, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_llistxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_llistxattr(p0: String?, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_flistxattr(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_flistxattr(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_removexattr(p0, p1)")
private external fun _wasm_libc_unix_hurd_removexattr(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_lremovexattr(p0, p1)")
private external fun _wasm_libc_unix_hurd_lremovexattr(p0: String?, p1: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_fremovexattr(p0, p1)")
private external fun _wasm_libc_unix_hurd_fremovexattr(p0: Int, p1: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_dirname(p0)")
private external fun _wasm_libc_unix_hurd_dirname(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_posixBasename(p0)")
private external fun _wasm_libc_unix_hurd_posixBasename(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_gnuBasename(p0)")
private external fun _wasm_libc_unix_hurd_gnuBasename(p0: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_dlmopen(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_dlmopen(p0: String, p1: String?, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_dlinfo(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_dlinfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_hurd_dladdr1(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_hurd_dladdr1(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_duplocale(p0)")
private external fun _wasm_libc_unix_hurd_duplocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_freelocale(p0)")
private external fun _wasm_libc_unix_hurd_freelocale(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_hurd_newlocale(p0, p1, p2)")
private external fun _wasm_libc_unix_hurd_newlocale(p0: Int, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_uselocale(p0)")
private external fun _wasm_libc_unix_hurd_uselocale(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_hurd_nlLanginfo(p0)")
private external fun _wasm_libc_unix_hurd_nlLanginfo(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_nlLanginfoL(p0, p1)")
private external fun _wasm_libc_unix_hurd_nlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_hurd_dlIteratePhdr(p0, p1)")
private external fun _wasm_libc_unix_hurd_dlIteratePhdr(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_gnuGetLibcRelease()")
private external fun _wasm_libc_unix_hurd_gnuGetLibcRelease(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_hurd_gnuGetLibcVersion()")
private external fun _wasm_libc_unix_hurd_gnuGetLibcVersion(): String

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lutimes(file, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_futimes(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mkfifoat(fd, path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mknodat(dirfd, pathname, mode.toInt(), dev.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmin(): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_libcCurrentSigrtmin() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun libcCurrentSigrtmax(): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_libcCurrentSigrtmax() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L).toString(), options) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sigsuspend((mask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_ioctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pipe2((fds?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_dup3(oldfd, newfd, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pread64(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pwrite64(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iovec: COpaquePointer?, count: CInt): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_readv(fd, (iovec?.value ?: 0L).toString(), count).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iovec: COpaquePointer?, count: CInt): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_writev(fd, (iovec?.value ?: 0L).toString(), count).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iovec: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_preadv(fd, (iovec?.value ?: 0L).toString(), count, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iovec: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pwritev(fd, (iovec?.value ?: 0L).toString(), count, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_preadv64(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pwritev64(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_freadUnlocked((buf?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_aioRead((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_aioWrite((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_aioFsync(op, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_aioError((aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_aioReturn((aiocbp?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mqClose(mqd.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: String?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mqUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mqReceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mqTimedreceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mqSend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mqTimedsend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mqGetattr(mqd.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mqSetattr(mqd.toLong().toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lseek64(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lseek(fd, offset.toString(), whence).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fgetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fseeko64((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fsetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: FILE?): Off64T =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_ftello64((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_bind(fd, (addr?.value ?: 0L).toString(), len.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_accept4(fd, (addr?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), flg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_ppoll((fds?.value ?: 0L).toString(), nfds.toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, message: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_recvmsg(fd, (message?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, message: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sendmsg(fd, (message?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sendfile(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sendfile64(outFd, inFd, (offset?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_shutdown(fd, how) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sethostname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getdomainname((name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_setdomainname(name, len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_ifNameindex().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_ifFreenameindex((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getifaddrs((ifap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_freeifaddrs((ifa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_uname((buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostid(): CLong =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_gethostid().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sethostid(hostid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getgrent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_setspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_endspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspent(): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getspent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnam(name: String?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getspnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getpwentR((pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getgrentR((grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fgetpwentR((stream?.handle ?: 0L).toString(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fgetgrentR((stream?.handle ?: 0L).toString(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putpwent(p: COpaquePointer?, stream: FILE?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_putpwent((p?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_putgrent((grp?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fgetspentR((fp?.handle ?: 0L).toString(), (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sgetspentR(s, (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getspentR((spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getspnamR(name, (spbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (spbufp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getmntentR((stream?.handle ?: 0L).toString(), (mntbuf?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpname(file: String?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_utmpname(file) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utmpxname(file: String?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_utmpxname(file) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxent(): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getutxent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getutxid((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getutxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pututxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutxent() {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_setresuid(ruid.toInt(), euid.toInt(), suid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_initgroups(user, group.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getgrgid(gid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_setgroups(ngroups.toString(), (ptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: String?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_acct(filename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_setmntent(filename, ty).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getmntent((stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_addmntent((stream?.handle ?: 0L).toString(), (mnt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endmntent(streamp: FILE?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_endmntent((streamp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_hasmntopt((mnt?.value ?: 0L).toString(), opt).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadKill(threadid.toString(), signo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadCancel(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadEqual(t1.toString(), t2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(thr: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadGetattrNp(thr.toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadMutexattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadMutexattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadRwlockattrGetpshared((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadRwlockattrSetpshared((attr?.value ?: 0L).toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadCondattrGetpshared((attr?.value ?: 0L).toString(), (pshared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadCondattrSetpshared((attr?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadOnce(control: COpaquePointer?, routine: PthreadOnceRoutineCallback): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadOnce((control?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadBarrierattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadBarrierattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadBarrierattrGetpshared((attr?.value ?: 0L).toString(), (shared?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadBarrierattrSetpshared((attr?.value ?: 0L).toString(), shared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadBarrierInit((barrier?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadBarrierDestroy((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadBarrierWait((barrier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadSpinInit((lock?.value ?: 0L).toString(), pshared) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadSpinDestroy((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadSpinLock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadSpinTrylock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadSpinUnlock((lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, newmask: COpaquePointer?, oldmask: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadSigmask(how, (newmask?.value ?: 0L).toString(), (oldmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_schedGetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_schedSetparam(pid, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_schedGetscheduler(pid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadGetschedparam(native.toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadSetschedparam(native.toString(), policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_pthreadGetcpuclockid(thread.toString(), (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_semDestroy((sem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_clockGetres(clockId, (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_clockGettime(clockId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_clockSettime(clockId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_clockGetcpuclockid(pid, (clkId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_asctimeR((tm?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_ctimeR((timep?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_strftime((s?.value ?: 0L).toString(), max.toString(), format, (tm?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_strptime(s, format, (tm?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_timerCreate(clockid, (sevp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_timerDelete(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_timerGetoverrun(timerid.toLong().toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_timerGettime(timerid.toLong().toString(), (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_timerSettime(timerid.toLong().toString(), flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fstat(fd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat64(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fstat64(fd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(fd: CInt, file: String?, buf: COpaquePointer?, flag: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fstatat(fd, file, (buf?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat64(fd: CInt, file: String?, buf: COpaquePointer?, flag: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fstatat64(fd, file, (buf?.value ?: 0L).toString(), flag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_statx(dirfd, pathname, flags, mask.toInt(), (statxbuf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_ftruncate(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_ftruncate64(fd, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate64(file: String?, length: Off64T): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_truncate64(file, length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lstat(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat64(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lstat64(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_statfs(path, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs64(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_statfs64(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fstatfs(fd, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs64(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fstatfs64(fildes, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_statvfs(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs64(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_statvfs64(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fstatvfs(fildes, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs64(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fstatvfs64(fildes, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_open(file, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open64(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_open64(file, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_openat(fd, file, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat64(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_openat64(fd, file, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fopen64(filename, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_freopen64(filename, mode, (file?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat64(path: String?, mode: ModeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_creat64(path, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mkostemp((template?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mkstemps((template?.value ?: 0L).toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile64(): FILE? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_tmpfile64().toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_popen(command, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_closeRange(first.toInt(), last.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpt(): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getpt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_loginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_ctermid((s?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_clearenv() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_execveat(dirfd, pathname, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_daemon(nochdir, noclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawn((pid?.value ?: 0L).toString(), path, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnp((pid?.value ?: 0L).toString(), file, (fileActions?.value ?: 0L).toString(), (attrp?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrInit((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrDestroy((attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrGetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrSetsigdefault((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrGetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrSetsigmask((attr?.value ?: 0L).toString(), (default?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrGetflags((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrSetflags((attr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrGetpgroup((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrSetpgroup((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrGetschedpolicy((attr?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrSetschedpolicy((attr?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnattrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnFileActionsInit((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnFileActionsDestroy((actions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnFileActionsAddopen((actions?.value ?: 0L).toString(), fd, path, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnFileActionsAddclose((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnFileActionsAdddup2((actions?.value ?: 0L).toString(), fd, newfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L).toString(), path) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnFileActionsAddclosefromNp((actions?.value ?: 0L).toString(), from) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixSpawnFileActionsAddtcsetpgrpNp((actions?.value ?: 0L).toString(), tcfd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_shmOpen(name, oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_euidaccess(pathname, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_eaccess(pathname, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_faccessat(dirfd, pathname, mode, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_stat(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat64(file: String?, buf: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_stat64(file, (buf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_readdir((dirp?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64(dirp: DIR?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_readdir64((dirp?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_readdirR((dirp?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_readdir64R((dirp?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_telldir((dirp?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_errnoLocation().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mmap64((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mremap((addr?.value ?: 0L).toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncfs(fd: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_syncfs(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fdatasync(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fallocate64(fd, mode, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixFallocate64(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixFadvise(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixFadvise64(fd, offset.toString(), len.toString(), advise) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getrlimit(resource.toInt(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getrlimit64(resource.toInt(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_setrlimit(resource.toInt(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_setrlimit64(resource.toInt(), (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getpriority(which.toInt(), who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_setpriority(which.toInt(), who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buffer: COpaquePointer?, length: SizeT, flags: CUint): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getrandom((buffer?.value ?: 0L).toString(), length.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buffer: COpaquePointer?, length: SizeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getentropy((buffer?.value ?: 0L).toString(), length.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_memrchr((cx?.value ?: 0L).toString(), c, n.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_strchrnul(s, c).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_abs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_labs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_drand48() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_erand48((xseed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_nrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrand48(): CLong =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mrand48().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_jrand48((xseed?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_srand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_seed48((xseed?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lcong48(p: COpaquePointer?) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_lcong48((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun brk(addr: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_brk((addr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_sbrk(increment.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mallopt(param, value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallinfo2(): Mallinfo2 =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mallocInfo(options, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mallocUsableSize((ptr?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mallocTrim(pad: SizeT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_mallocTrim(pad.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_iconvOpen(tocode, fromcode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_iconvClose((cd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_backtrace((buf?.value ?: 0L).toString(), sz) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_reboot(howTo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getloadavg((loadavg?.value ?: 0L).toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_regfree((preg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_glob64(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree64(pglob: COpaquePointer?) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_globfree64((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_getxattr(path, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lgetxattr(path, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fgetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_setxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lsetxattr(path, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fsetxattr(filedes, name, (value?.value ?: 0L).toString(), size.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_listxattr(path, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_llistxattr(path, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_flistxattr(filedes, (list?.value ?: 0L).toString(), size.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removexattr(path: String?, name: String?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_removexattr(path, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_lremovexattr(path, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_fremovexattr(filedes, name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_dirname((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_posixBasename((path?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuBasename(path: String?): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_gnuBasename(path).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_dlmopen(lmid.toString(), filename, flag).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_dlinfo((handle?.value ?: 0L).toString(), request, (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_dladdr1((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (extraInfo?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_duplocale((base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_unixHurdNapiAvailable) {
        _wasm_libc_unix_hurd_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_newlocale(mask, locale, (base?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_uselocale((loc?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_nlLanginfo(item).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_nlLanginfoL(item, (locale?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_gnuGetLibcRelease().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    if (_unixHurdNapiAvailable) _wasm_libc_unix_hurd_gnuGetLibcVersion().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
