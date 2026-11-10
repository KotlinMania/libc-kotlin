@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT

private val _unixLinuxlikeL4reUclibcNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrGetkindNp((attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_pthreadRwlockattrSetkindNp((attr?.value ?: 0L).toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_getrlimit64(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_setrlimit64(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_getrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_setrlimit(resource, (rlim?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (_unixLinuxlikeL4reUclibcNapiAddon != null) (_unixLinuxlikeL4reUclibcNapiAddon.libc_unix_linuxlike_l4re_uclibc_getauxval(type.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
