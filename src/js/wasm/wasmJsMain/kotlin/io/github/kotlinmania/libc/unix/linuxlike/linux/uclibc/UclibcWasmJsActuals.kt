@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadRwlockattrT
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664.Termios
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeLinuxUclibcNapiAddon(): Boolean

private val unixLinuxlikeLinuxUclibcNapiAvailable: Boolean = initUnixLinuxlikeLinuxUclibcNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcGettimeofday(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcGettimeofday(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcPtrace(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcPtrace(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcSendmmsg(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcSendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcRecvmmsg(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcRecvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcOpenpty(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcOpenpty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcForkpty(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcForkpty(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcSethostid(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcSethostid(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcFanotifyMark(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcFanotifyMark(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcGetrlimit64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcGetrlimit64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcSetrlimit64(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcSetrlimit64(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcGetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcGetrlimit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcSetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcSetrlimit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcGetpriority(p0, p1)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeLinuxUclibcGetauxval(p0)")
private external fun wasmLibcUnixLinuxlikeLinuxUclibcGetauxval(p0: String): String

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp(attr.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp(attr.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcPtrace(request.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcSethostid(hostid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcFanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcGetrlimit64(resource.toString(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcSetrlimit64(resource.toString(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcGetrlimit(resource.toString(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcSetrlimit(resource.toString(), rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcGetpriority(which.toInt(), who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcSetpriority(which.toInt(), who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (unixLinuxlikeLinuxUclibcNapiAvailable) wasmLibcUnixLinuxlikeLinuxUclibcGetauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
