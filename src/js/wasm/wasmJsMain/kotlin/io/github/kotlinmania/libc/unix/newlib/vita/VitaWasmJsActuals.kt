@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadCondattrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixNewlibVitaNapiAddon(): Boolean

private val unixNewlibVitaNapiAvailable: Boolean = initUnixNewlibVitaNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibVitaFutimens(p0, p1)")
private external fun wasmLibcUnixNewlibVitaFutimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibVitaWritev(p0, p1, p2)")
private external fun wasmLibcUnixNewlibVitaWritev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibVitaReadv(p0, p1, p2)")
private external fun wasmLibcUnixNewlibVitaReadv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibVitaSendmsg(p0, p1, p2)")
private external fun wasmLibcUnixNewlibVitaSendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibVitaRecvmsg(p0, p1, p2)")
private external fun wasmLibcUnixNewlibVitaRecvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadCreate(p0, p1, p2, p3)")
private external fun wasmLibcUnixNewlibVitaPthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadAttrGetschedparam(p0, p1)")
private external fun wasmLibcUnixNewlibVitaPthreadAttrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadAttrSetschedparam(p0, p1)")
private external fun wasmLibcUnixNewlibVitaPthreadAttrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadAttrGetprocessoridNp(p0, p1)")
private external fun wasmLibcUnixNewlibVitaPthreadAttrGetprocessoridNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadAttrSetprocessoridNp(p0, p1)")
private external fun wasmLibcUnixNewlibVitaPthreadAttrSetprocessoridNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadGetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixNewlibVitaPthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadSetschedparam(p0, p1, p2)")
private external fun wasmLibcUnixNewlibVitaPthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadCondattrGetclock(p0, p1)")
private external fun wasmLibcUnixNewlibVitaPthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadCondattrSetclock(p0, p1)")
private external fun wasmLibcUnixNewlibVitaPthreadCondattrSetclock(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixNewlibVitaPthreadGetprocessoridNp()")
private external fun wasmLibcUnixNewlibVitaPthreadGetprocessoridNp(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibVitaGetentropy(p0, p1)")
private external fun wasmLibcUnixNewlibVitaGetentropy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixNewlibVitaPipe2(p0, p1)")
private external fun wasmLibcUnixNewlibVitaPipe2(p0: String, p1: Int): Int

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaFutimens(fd, times.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaWritev(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaReadv(fd, iov.rawAddress.toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(s: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaSendmsg(s, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(s: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaRecvmsg(s, msg.rawAddress.toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadAttrGetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadAttrSetschedparam(attr.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr<PthreadAttrT>, processorId: MutPtr<CInt>): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadAttrGetprocessoridNp(attr.rawAddress.toString(), processorId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr<PthreadAttrT>, processorId: CInt): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadAttrSetprocessoridNp(attr.rawAddress.toString(), processorId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadCondattrSetclock(attr.rawAddress.toString(), clockId.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetprocessoridNp(): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPthreadGetprocessoridNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (unixNewlibVitaNapiAvailable) wasmLibcUnixNewlibVitaPipe2(fds.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")
