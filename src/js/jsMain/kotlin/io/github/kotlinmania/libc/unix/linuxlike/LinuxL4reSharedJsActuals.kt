@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

private val _unixLinuxlikeLinuxL4reSharedNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun iopl(level: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_iopl(level) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_ioperm(from.toString(), num.toString(), turnOn) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_aioRead((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_aioWrite((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_aioFsync(op, (aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_aioError((aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_aioReturn((aiocbp?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_aioSuspend((aiocbList?.value ?: 0L).toString(), nitems, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_aioCancel(fd, (aiocbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_lioListio(mode, (aiocbList?.value ?: 0L).toString(), nitems, (sevp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getloadavg((loadavg?.value ?: 0L).toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmReadv(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_processVmReadv(pid, (localIov?.value ?: 0L).toString(), liovcnt.toString(), (remoteIov?.value ?: 0L).toString(), riovcnt.toString(), flags.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmWritev(pid: PidT, localIov: COpaquePointer?, liovcnt: CUlong, remoteIov: COpaquePointer?, riovcnt: CUlong, flags: CUlong): Long =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_processVmWritev(pid, (localIov?.value ?: 0L).toString(), liovcnt.toString(), (remoteIov?.value ?: 0L).toString(), riovcnt.toString(), flags.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_futimes(fd, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_abs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_labs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_rand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_drand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_erand48((xseed?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_lrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_nrand48((xseed?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_jrand48((xseed?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_srand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setpwent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_setspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_endspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspent(): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getspent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnam(name: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getspnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_shmget(key, size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_shmdt((shmaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_errnoLocation() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_mremap((addr?.value ?: 0L).toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_nlLanginfoL(item, (locale?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_schedGetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_mount(src, target, fstype, flags.toString(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_prctl(option, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_ppoll((fds?.value ?: 0L).toString(), nfds.toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_sethostname(name, len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_schedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(info: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_sysinfo((info?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_sigsuspend((mask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_semClose((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_initgroups(user, group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_semUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_daemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_faccessat(dirfd, pathname, mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_setmntent(filename, ty) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getmntent((stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_addmntent((stream?.handle ?: 0L).toString(), (mnt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endmntent(streamp: FILE?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_endmntent((streamp?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_hasmntopt((mnt?.value ?: 0L).toString(), opt) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_regcomp((preg?.value ?: 0L).toString(), pattern, cflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_regexec((preg?.value ?: 0L).toString(), input, nmatch.toString(), (pmatch?.value ?: 0L).toString(), eflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_regerror(errcode, (preg?.value ?: 0L).toString(), (errbuf?.value ?: 0L).toString(), errbufSize.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: COpaquePointer?) {
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        _unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_regfree((preg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_iconvOpen(tocode, fromcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_iconv((cd?.value ?: 0L).toString(), (inbuf?.value ?: 0L).toString(), (inbytesleft?.value ?: 0L).toString(), (outbuf?.value ?: 0L).toString(), (outbytesleft?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_iconvClose((cd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettid(): PidT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_gettid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_timerCreate(clockid, (sevp?.value ?: 0L).toString(), (timerid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_timerDelete((timerid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_timerGetoverrun((timerid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_timerGettime((timerid?.value ?: 0L).toString(), (currValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_timerSettime((timerid?.value ?: 0L).toString(), flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_memmem((haystack?.value ?: 0L).toString(), haystacklen.toString(), (needle?.value ?: 0L).toString(), needlelen.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_schedGetcpu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_getoptLong(argc, (argv?.value ?: 0L).toString(), optstring, (longopts?.value ?: 0L).toString(), (longindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileRange(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_copyFileRange(fdIn, (offIn?.value ?: 0L).toString(), fdOut, (offOut?.value ?: 0L).toString(), len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_freopen64(filename, mode, (file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_fseeko64((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_fsetpos64((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: FILE?): Off64T =
    if (_unixLinuxlikeLinuxL4reSharedNapiAddon != null) (_unixLinuxlikeLinuxL4reSharedNapiAddon.libc_unix_linuxlike_linux_l4re_shared_ftello64((stream?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
