@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.solarish.CaddrT
import io.github.kotlinmania.libc.unix.solarish.IdT
import io.github.kotlinmania.libc.unix.solarish.OffT
import io.github.kotlinmania.libc.unix.solarish.PsetidT
import io.github.kotlinmania.libc.unix.solarish.PthreadT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixSolarishIllumosNapiAddon(): Boolean

private val _unixSolarishIllumosNapiAvailable: Boolean = _initUnixSolarishIllumosNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_eventfd(p0, p1)")
private external fun _wasm_libc_unix_solarish_illumos_eventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_epollPwait(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_unix_solarish_illumos_epollPwait(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_epollCreate(p0)")
private external fun _wasm_libc_unix_solarish_illumos_epollCreate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_epollCreate1(p0)")
private external fun _wasm_libc_unix_solarish_illumos_epollCreate1(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_epollWait(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_illumos_epollWait(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_epollCtl(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_illumos_epollCtl(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_mincore(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_illumos_mincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_psetBindLwp(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_illumos_psetBindLwp(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_psetGetloadavg(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_illumos_psetGetloadavg(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_pthreadAttrGetNp(p0, p1)")
private external fun _wasm_libc_unix_solarish_illumos_pthreadAttrGetNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_pthreadAttrGetstackaddr(p0, p1)")
private external fun _wasm_libc_unix_solarish_illumos_pthreadAttrGetstackaddr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_pthreadAttrSetstack(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_illumos_pthreadAttrSetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_pthreadAttrSetstackaddr(p0, p1)")
private external fun _wasm_libc_unix_solarish_illumos_pthreadAttrSetstackaddr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_posixFadvise(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_illumos_posixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_preadv(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_illumos_preadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_pwritev(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_illumos_pwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_getpagesizes2(p0, p1)")
private external fun _wasm_libc_unix_solarish_illumos_getpagesizes2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_posixSpawnFileActionsAddfchdirNp(p0, p1)")
private external fun _wasm_libc_unix_solarish_illumos_posixSpawnFileActionsAddfchdirNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_ptsnameR(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_illumos_ptsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_syncfs(p0)")
private external fun _wasm_libc_unix_solarish_illumos_syncfs(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_strcasecmpL(p0, p1, p2)")
private external fun _wasm_libc_unix_solarish_illumos_strcasecmpL(p0: String?, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_strncasecmpL(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_illumos_strncasecmpL(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_timerfdCreate(p0, p1)")
private external fun _wasm_libc_unix_solarish_illumos_timerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_timerfdGettime(p0, p1)")
private external fun _wasm_libc_unix_solarish_illumos_timerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_solarish_illumos_timerfdSettime(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_solarish_illumos_timerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_eventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_epollPwait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout, (sigmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_epollCreate(size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_epollCreate1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_epollWait(epfd, (events?.value ?: 0L).toString(), maxevents, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_epollCtl(epfd, op, fd, (event?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_mincore((addr?.value ?: 0L).toString(), len.toString(), (vec?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_psetBindLwp(pset, id, pid, (opset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetGetloadavg(pset: PsetidT, load: COpaquePointer?, num: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_psetGetloadavg(pset, (load?.value ?: 0L).toString(), num) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_pthreadAttrGetNp(thread.toLong().toString(), (attr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_pthreadAttrGetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_pthreadAttrSetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_pthreadAttrSetstackaddr((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_posixFadvise(fd, offset.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes2(pagesize: COpaquePointer?, nelem: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_getpagesizes2((pagesize?.value ?: 0L).toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: COpaquePointer?, fd: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_posixSpawnFileActionsAddfchdirNp((fileActions?.value ?: 0L).toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fildes: CInt, name: COpaquePointer?, namelen: SizeT): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_ptsnameR(fildes, (name?.value ?: 0L).toString(), namelen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncfs(fd: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_syncfs(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_strcasecmpL(s1, s2, (loc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_strncasecmpL(s1, s2, n.toString(), (loc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_timerfdCreate(clockid, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_timerfdGettime(fd, (currValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixSolarishIllumosNapiAvailable) _wasm_libc_unix_solarish_illumos_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
