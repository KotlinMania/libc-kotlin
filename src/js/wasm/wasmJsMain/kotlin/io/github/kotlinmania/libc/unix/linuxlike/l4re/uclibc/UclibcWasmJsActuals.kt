@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.l4re.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.l4re.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64.Termios
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeL4reUclibcNapiAddon(): Boolean

private val unixLinuxlikeL4reUclibcNapiAvailable: Boolean = initUnixLinuxlikeL4reUclibcNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcGettimeofday(p0, p1)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcPthreadRwlockattrGetkindNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcPthreadRwlockattrGetkindNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcPthreadRwlockattrSetkindNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcPthreadRwlockattrSetkindNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcGetrlimit64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcGetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcSetrlimit64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcSetrlimit64(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcGetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcSetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeL4reUclibcGetauxval(p0)")
private external fun wasmLibcUnixLinuxlikeL4reUclibcGetauxval(p0: String): String

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcPthreadRwlockattrGetkindNp(attr.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcPthreadRwlockattrSetkindNp(attr.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcGetrlimit64(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcSetrlimit64(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (unixLinuxlikeL4reUclibcNapiAvailable) wasmLibcUnixLinuxlikeL4reUclibcGetauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
