@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initUnixLinuxlikeEmscriptenNapiAddon(): Boolean

private val unixLinuxlikeEmscriptenNapiAvailable: Boolean = initUnixLinuxlikeEmscriptenNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenSetrlimit(p0, p1)")
private external fun wasmLibcUnixLinuxlikeEmscriptenSetrlimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenStrerrorR(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenStrerrorR(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenAbs(p0)")
private external fun wasmLibcUnixLinuxlikeEmscriptenAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenLabs(p0)")
private external fun wasmLibcUnixLinuxlikeEmscriptenLabs(p0: String): String

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenRand()")
private external fun wasmLibcUnixLinuxlikeEmscriptenRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenSrand(p0)")
private external fun wasmLibcUnixLinuxlikeEmscriptenSrand(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGettimeofday(p0, p1)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGettimeofday(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenSetpwent()")
private external fun wasmLibcUnixLinuxlikeEmscriptenSetpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenEndpwent()")
private external fun wasmLibcUnixLinuxlikeEmscriptenEndpwent()

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetpwent()")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetpwent(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenShmOpen(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenShmOpen(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenMprotect(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenMprotect(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenErrnoLocation()")
private external fun wasmLibcUnixLinuxlikeEmscriptenErrnoLocation(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenPosixFallocate(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenPosixFallocate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenPwritev(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeEmscriptenPwritev(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenPreadv(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeEmscriptenPreadv(p0: Int, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenDup3(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenDup3(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenNlLanginfoL(p0, p1)")
private external fun wasmLibcUnixLinuxlikeEmscriptenNlLanginfoL(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenAccept4(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeEmscriptenAccept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetnameinfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetnameinfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetloadavg(p0, p1)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetloadavg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenMkfifoat(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenMkfifoat(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenMremap(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmLibcUnixLinuxlikeEmscriptenMremap(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGlob(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGlob(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGlobfree(p0)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGlobfree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenPosixMadvise(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenPosixMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenShmUnlink(p0)")
private external fun wasmLibcUnixLinuxlikeEmscriptenShmUnlink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenSeekdir(p0, p1)")
private external fun wasmLibcUnixLinuxlikeEmscriptenSeekdir(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenTelldir(p0)")
private external fun wasmLibcUnixLinuxlikeEmscriptenTelldir(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenMadvise(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenMadvise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenMsync(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenMsync(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenRecvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcUnixLinuxlikeEmscriptenRecvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenMkstemps(p0, p1)")
private external fun wasmLibcUnixLinuxlikeEmscriptenMkstemps(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenNlLanginfo(p0)")
private external fun wasmLibcUnixLinuxlikeEmscriptenNlLanginfo(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenSendmmsg(p0, p1, p2, p3)")
private external fun wasmLibcUnixLinuxlikeEmscriptenSendmmsg(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenRecvmmsg(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeEmscriptenRecvmmsg(p0: Int, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenSync()")
private external fun wasmLibcUnixLinuxlikeEmscriptenSync()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenIoctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcUnixLinuxlikeEmscriptenIoctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetpriority(p0, p1)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetpriority(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenSetpriority(p0, p1, p2)")
private external fun wasmLibcUnixLinuxlikeEmscriptenSetpriority(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetentropy(p0, p1)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetentropy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetgrgid(p0)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetgrgid(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetgrnam(p0)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetgrnam(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetgrnamR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetgrnamR(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcUnixLinuxlikeEmscriptenGetgrgidR(p0, p1, p2, p3, p4)")
private external fun wasmLibcUnixLinuxlikeEmscriptenGetgrgidR(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenGetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenSetrlimit(resource, rlim.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenAbs(i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenLabs(i.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixLinuxlikeEmscriptenNapiAvailable) {
        wasmLibcUnixLinuxlikeEmscriptenSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (unixLinuxlikeEmscriptenNapiAvailable) {
        wasmLibcUnixLinuxlikeEmscriptenSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixLinuxlikeEmscriptenNapiAvailable) {
        wasmLibcUnixLinuxlikeEmscriptenEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeEmscriptenGetpwent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenMprotect(addr.rawAddress.toString(), len.toString(), prot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeEmscriptenErrnoLocation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenPosixFallocate(fd, offset.toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenDup3(oldfd, newfd, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeEmscriptenNlLanginfoL(item, locale.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenAccept4(fd, addr.rawAddress.toString(), len.rawAddress.toString(), flg) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenGetloadavg(loadavg.rawAddress.toString(), nelem) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeEmscriptenMremap(addr.rawAddress.toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr) {
    if (unixLinuxlikeEmscriptenNapiAvailable) {
        wasmLibcUnixLinuxlikeEmscriptenGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenShmUnlink(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    if (unixLinuxlikeEmscriptenNapiAvailable) {
        wasmLibcUnixLinuxlikeEmscriptenSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr): CLong =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenTelldir(dirp.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenMadvise(addr.rawAddress.toString(), len.toString(), advice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenMsync(addr.rawAddress.toString(), len.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenMkstemps(template.rawAddress.toString(), suffixlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeEmscriptenNlLanginfo(item).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint, timeout: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags.toInt(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (unixLinuxlikeEmscriptenNapiAvailable) {
        wasmLibcUnixLinuxlikeEmscriptenSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenGetpriority(which, who.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenSetpriority(which, who.toInt(), prio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenGetentropy(buf.rawAddress.toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeEmscriptenGetgrgid(gid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr): MutPtr =
    if (unixLinuxlikeEmscriptenNapiAvailable) MutPtr(wasmLibcUnixLinuxlikeEmscriptenGetgrnam(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    if (unixLinuxlikeEmscriptenNapiAvailable) wasmLibcUnixLinuxlikeEmscriptenGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
