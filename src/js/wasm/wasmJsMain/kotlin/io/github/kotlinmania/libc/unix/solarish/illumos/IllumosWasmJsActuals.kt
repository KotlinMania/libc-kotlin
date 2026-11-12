@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixSolarishIllumosNapiAddon(): Boolean

private val unixSolarishIllumosNapiAvailable: Boolean = initUnixSolarishIllumosNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishIllumosEventfd(p0, p1)")
private external fun wasmLibcUnixSolarishIllumosEventfd(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixSolarishIllumosEpollPwait(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixSolarishIllumosEpollPwait(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishIllumosEpollCreate(p0)")
private external fun wasmLibcUnixSolarishIllumosEpollCreate(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishIllumosEpollCreate1(p0)")
private external fun wasmLibcUnixSolarishIllumosEpollCreate1(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishIllumosEpollWait(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishIllumosEpollWait(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishIllumosEpollCtl(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishIllumosEpollCtl(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishIllumosMincore(p0, p1, p2)")
private external fun wasmLibcUnixSolarishIllumosMincore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPsetBindLwp(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishIllumosPsetBindLwp(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPsetGetloadavg(p0, p1, p2)")
private external fun wasmLibcUnixSolarishIllumosPsetGetloadavg(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPthreadAttrGetNp(p0, p1)")
private external fun wasmLibcUnixSolarishIllumosPthreadAttrGetNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPthreadAttrGetstackaddr(p0, p1)")
private external fun wasmLibcUnixSolarishIllumosPthreadAttrGetstackaddr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPthreadAttrSetstack(p0, p1, p2)")
private external fun wasmLibcUnixSolarishIllumosPthreadAttrSetstack(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPthreadAttrSetstackaddr(p0, p1)")
private external fun wasmLibcUnixSolarishIllumosPthreadAttrSetstackaddr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPosixFadvise(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishIllumosPosixFadvise(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishIllumosPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishIllumosPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishIllumosGetpagesizes2(p0, p1)")
private external fun wasmLibcUnixSolarishIllumosGetpagesizes2(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp(p0, p1)")
private external fun wasmLibcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishIllumosPtsnameR(p0, p1, p2)")
private external fun wasmLibcUnixSolarishIllumosPtsnameR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixSolarishIllumosSyncfs(p0)")
private external fun wasmLibcUnixSolarishIllumosSyncfs(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixSolarishIllumosStrcasecmpL(p0, p1, p2)")
private external fun wasmLibcUnixSolarishIllumosStrcasecmpL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishIllumosStrncasecmpL(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishIllumosStrncasecmpL(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishIllumosTimerfdCreate(p0, p1)")
private external fun wasmLibcUnixSolarishIllumosTimerfdCreate(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixSolarishIllumosTimerfdGettime(p0, p1)")
private external fun wasmLibcUnixSolarishIllumosTimerfdGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixSolarishIllumosTimerfdSettime(p0, p1, p2, p3)")
private external fun wasmLibcUnixSolarishIllumosTimerfdSettime(p0: Int, p1: Int, p2: String, p3: String): Int

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosEventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollPwait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt, sigmask: ConstPtr): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosEpollPwait(epfd, events.rawAddress.toString(), maxevents, timeout, sigmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate(size: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosEpollCreate(size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCreate1(flags: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosEpollCreate1(flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosEpollWait(epfd, events.rawAddress.toString(), maxevents, timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosEpollCtl(epfd, op, fd, event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosMincore(addr.rawAddress.toString(), len.toString(), vec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: MutPtr): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPsetBindLwp(pset, id, pid, opset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psetGetloadavg(pset: PsetidT, load: MutPtr, num: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPsetGetloadavg(pset, load.rawAddress.toString(), num) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPthreadAttrGetNp(thread.toLong().toString(), attr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr, stackaddr: MutPtr): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPthreadAttrGetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPthreadAttrSetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstackaddr(attr: MutPtr, stackaddr: MutPtr): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPthreadAttrSetstackaddr(attr.rawAddress.toString(), stackaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPosixFadvise(fd, offset.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpagesizes2(pagesize: MutPtr, nelem: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosGetpagesizes2(pagesize.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixSpawnFileActionsAddfchdirNp(fileActions: MutPtr, fd: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPosixSpawnFileActionsAddfchdirNp(fileActions.rawAddress.toString(), fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fildes: CInt, name: MutPtr, namelen: SizeT): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosPtsnameR(fildes, name.rawAddress.toString(), namelen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syncfs(fd: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosSyncfs(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmpL(s1: ConstPtr, s2: ConstPtr, loc: LocaleT): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosStrcasecmpL(s1.rawAddress.toString(), s2.rawAddress.toString(), loc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmpL(s1: ConstPtr, s2: ConstPtr, n: SizeT, loc: LocaleT): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosStrncasecmpL(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString(), loc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosTimerfdCreate(clockid, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosTimerfdGettime(fd, currValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    if (unixSolarishIllumosNapiAvailable) wasmLibcUnixSolarishIllumosTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
