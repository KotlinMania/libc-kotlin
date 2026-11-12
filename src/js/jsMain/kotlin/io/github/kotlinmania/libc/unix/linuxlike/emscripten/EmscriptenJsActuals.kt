@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixLinuxlikeEmscriptenNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenSetrlimit(resource, rlim.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixLinuxlikeEmscriptenNapiAddon != null) {
        unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixLinuxlikeEmscriptenNapiAddon != null) {
        unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixLinuxlikeEmscriptenNapiAddon != null) {
        unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAddon != null) MutPtr((unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAddon != null) MutPtr((unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenErrnoLocation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenDup3(oldfd, newfd, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAddon != null) MutPtr((unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenNlLanginfoL(item, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenAccept4(fd, addr.rawAddress.toString(), len.rawAddress.toString(), flg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetloadavg(loadavg.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAddon != null) MutPtr((unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenMremap(addr.rawAddress.toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr) {
    if (unixLinuxlikeEmscriptenNapiAddon != null) {
        unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (unixLinuxlikeEmscriptenNapiAddon != null) {
        unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenMkstemps(template.rawAddress.toString(), suffixlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAddon != null) MutPtr((unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint, timeout: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags.toInt(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixLinuxlikeEmscriptenNapiAddon != null) {
        unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetpriority(which, who.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenSetpriority(which, who.toInt(), prio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetentropy(buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAddon != null) MutPtr((unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAddon != null) MutPtr((unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAddon != null) (unixLinuxlikeEmscriptenNapiAddon.libcUnixLinuxlikeEmscriptenGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
