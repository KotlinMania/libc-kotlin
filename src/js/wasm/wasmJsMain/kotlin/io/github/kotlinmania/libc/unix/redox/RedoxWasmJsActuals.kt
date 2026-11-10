@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixRedoxNapiAddon(): Boolean

private val _unixRedoxNapiAvailable: Boolean = _initUnixRedoxNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_redox_errnoLocation()")
private external fun _wasm_libc_unix_redox_errnoLocation(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_strerrorR(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_strerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_dirfd(p0)")
private external fun _wasm_libc_unix_redox_dirfd(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_pipe2(p0, p1)")
private external fun _wasm_libc_unix_redox_pipe2(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_redox_getdtablesize()")
private external fun _wasm_libc_unix_redox_getdtablesize(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_getresgid(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_getresgid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_getresuid(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_getresuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_setresgid(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_setresgid(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_setresuid(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_setresuid(p0: Int, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_redox_getgrent()")
private external fun _wasm_libc_unix_redox_getgrent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_redox_setgrent()")
private external fun _wasm_libc_unix_redox_setgrent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_redox_endgrent()")
private external fun _wasm_libc_unix_redox_endgrent()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_getgrgid(p0)")
private external fun _wasm_libc_unix_redox_getgrgid(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_redox_getgrgidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_redox_getgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_getgrnam(p0)")
private external fun _wasm_libc_unix_redox_getgrnam(p0: String?): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_redox_getgrnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_redox_getgrnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_redox_getgrouplist(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_redox_getgrouplist(p0: String?, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_memalign(p0, p1)")
private external fun _wasm_libc_unix_redox_memalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_redox_getnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_redox_getnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_pthreadAtfork(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_pthreadAtfork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_redox_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_redox_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_redox_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_redox_openpty(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_redox_openpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_redox_getpwent()")
private external fun _wasm_libc_unix_redox_getpwent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_redox_setpwent()")
private external fun _wasm_libc_unix_redox_setpwent()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_redox_endpwent()")
private external fun _wasm_libc_unix_redox_endpwent()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_redox_getpwnamR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_redox_getpwnamR(p0: String?, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_redox_getpwuidR(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_redox_getpwuidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_pthreadSigmask(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_pthreadSigmask(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_pthreadCancel(p0)")
private external fun _wasm_libc_unix_redox_pthreadCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_pthreadKill(p0, p1)")
private external fun _wasm_libc_unix_redox_pthreadKill(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_sigtimedwait(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_sigtimedwait(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_sigwait(p0, p1)")
private external fun _wasm_libc_unix_redox_sigwait(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_getsubopt(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_getsubopt(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_mkostemp(p0, p1)")
private external fun _wasm_libc_unix_redox_mkostemp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_mkostemps(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_mkostemps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_reallocarray(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_reallocarray(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_redox_renameat2(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_redox_renameat2(p0: Int, p1: String?, p2: Int, p3: String?, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_explicitBzero(p0, p1)")
private external fun _wasm_libc_unix_redox_explicitBzero(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_strlcat(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_strlcat(p0: String, p1: String?, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_strlcpy(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_strlcpy(p0: String, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_epollCreate(p0)")
private external fun _wasm_libc_unix_redox_epollCreate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_epollCreate1(p0)")
private external fun _wasm_libc_unix_redox_epollCreate1(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_redox_epollWait(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_redox_epollWait(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_redox_epollCtl(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_redox_epollCtl(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_redox_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_redox_ioctl(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_madvise(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_madvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_msync(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_msync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_mprotect(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_mprotect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_shmOpen(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_shmOpen(p0: String?, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_shmUnlink(p0)")
private external fun _wasm_libc_unix_redox_shmUnlink(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_getpriority(p0, p1)")
private external fun _wasm_libc_unix_redox_getpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_setpriority(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_setpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_getrlimit(p0, p1)")
private external fun _wasm_libc_unix_redox_getrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_setrlimit(p0, p1)")
private external fun _wasm_libc_unix_redox_setrlimit(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_cmsgData(p0)")
private external fun _wasm_libc_unix_redox_cmsgData(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_cmsgFirsthdr(p0)")
private external fun _wasm_libc_unix_redox_cmsgFirsthdr(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_cmsgNxthdr(p0, p1)")
private external fun _wasm_libc_unix_redox_cmsgNxthdr(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_bind(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_redox_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_redox_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_futimens(p0, p1)")
private external fun _wasm_libc_unix_redox_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_redox_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_redox_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_redox_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_redox_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_readv(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_redox_writev(p0, p1, p2)")
private external fun _wasm_libc_unix_redox_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_uname(p0)")
private external fun _wasm_libc_unix_redox_uname(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_gettimeofday(p0, p1)")
private external fun _wasm_libc_unix_redox_gettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_redox_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_redox_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_redox_strftime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_redox_strftime(p0: String, p1: String, p2: String?, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_redox_loginTty(p0)")
private external fun _wasm_libc_unix_redox_loginTty(p0: Int): Int

public actual fun errnoLocation(): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_errnoLocation().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_pipe2((fds?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getdtablesize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_setresgid(rgid, egid, sgid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_setresuid(ruid, euid, suid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrent(): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getgrent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixRedoxNapiAvailable) {
        _wasm_libc_unix_redox_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixRedoxNapiAvailable) {
        _wasm_libc_unix_redox_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getgrgid(gid).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getgrgidR(gid, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getgrnam(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getgrouplist(user, group, (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(addr: COpaquePointer?, addrlen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getnameinfo((addr?.value ?: 0L).toString(), addrlen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(tid: COpaquePointer?, attr: COpaquePointer?, start: PthreadCreateStartCallback, arg: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_pthreadCreate((tid?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (arg?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwent(): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getpwent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_unixRedoxNapiAvailable) {
        _wasm_libc_unix_redox_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixRedoxNapiAvailable) {
        _wasm_libc_unix_redox_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getpwuidR(uid, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_pthreadCancel((thread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_pthreadKill((thread?.value ?: 0L).toString(), sig) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, sig: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_sigtimedwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getsubopt((optionp?.value ?: 0L).toString(), (tokens?.value ?: 0L).toString(), (valuep?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_mkostemp((template?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_reallocarray((ptr?.value ?: 0L).toString(), nmemb.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_renameat2(olddirfd, oldpath, newdirfd, newpath, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(p: COpaquePointer?, len: SizeT) {
    if (_unixRedoxNapiAvailable) {
        _wasm_libc_unix_redox_explicitBzero((p?.value ?: 0L).toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun strlcat(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_strlcat((dst?.value ?: 0L).toString(), src, siz.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlcpy(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_strlcpy((dst?.value ?: 0L).toString(), src, siz.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_epollCreate(size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_epollCreate1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_epollWait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_epollCtl(epfd, op, fd, (event?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_ioctl(fd, request.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_msync((addr?.value ?: 0L).toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_shmOpen(name, oflag, mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_shmUnlink(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_setpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_getrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_setrlimit(resource, (rlim?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgData(cmsg: COpaquePointer?): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_cmsgData((cmsg?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgFirsthdr(mhdr: COpaquePointer?): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_cmsgFirsthdr((mhdr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmsgNxthdr(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer? =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_cmsgNxthdr((mhdr?.value ?: 0L).toString(), (cmsg?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_recvmsg(socket, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(socket: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_sendmsg(socket, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(utsname: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_uname((utsname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_clockGettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_strftime((s?.value ?: 0L).toString(), max.toString(), format, (tm?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (_unixRedoxNapiAvailable) _wasm_libc_unix_redox_loginTty(fd) else throw UnsupportedOperationException("Native FFI addon is not available")
