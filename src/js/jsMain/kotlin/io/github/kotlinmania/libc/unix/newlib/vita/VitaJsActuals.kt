@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT

private val _unixNewlibVitaNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_futimens(fd, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_sendmsg(s, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_recvmsg(s, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadAttrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadAttrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetprocessoridNp(attr: COpaquePointer?, processorId: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadAttrGetprocessoridNp((attr?.value ?: 0L).toString(), (processorId?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetprocessoridNp(attr: COpaquePointer?, processorId: CInt): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadAttrSetprocessoridNp((attr?.value ?: 0L).toString(), processorId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetprocessoridNp(): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pthreadGetprocessoridNp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixNewlibVitaNapiAddon != null) (_unixNewlibVitaNapiAddon.libc_unix_newlib_vita_pipe2((fds?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
