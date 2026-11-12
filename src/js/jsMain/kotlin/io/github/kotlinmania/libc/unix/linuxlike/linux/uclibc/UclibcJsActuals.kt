@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val unixLinuxlikeLinuxUclibcNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp(attr.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp(attr.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcPtrace(request.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostid(hostid: CLong): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcSethostid(hostid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcFanotifyMark(fd, flags.toInt(), mask.toString(), dirfd, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcGetrlimit64(resource.toString(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcSetrlimit64(resource.toString(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcGetrlimit(resource.toString(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcSetrlimit(resource.toString(), rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcGetpriority(which.toInt(), who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcSetpriority(which.toInt(), who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (unixLinuxlikeLinuxUclibcNapiAddon != null) (unixLinuxlikeLinuxUclibcNapiAddon.libcUnixLinuxlikeLinuxUclibcGetauxval(type.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
