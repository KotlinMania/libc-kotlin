@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NlItem
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Aiocb
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.RegexT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Sysinfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.ShmidDs
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixLinuxlikeLinuxL4reSharedNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun iopl(level: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedIopl(level) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioperm(from: CUlong, num: CUlong, turnOn: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedIoperm(from.toString(), num.toString(), turnOn) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedAioRead(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedAioWrite(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedAioFsync(op, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedAioError(aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedAioReturn(aiocbp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedAioSuspend(aiocbList.rawAddress.toString(), nitems, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedAioCancel(fd, aiocbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedLioListio(mode, aiocbList.rawAddress.toString(), nitems, sevp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetloadavg(loadavg.rawAddress.toString(), nelem) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmReadv(pid: PidT, localIov: ConstPtr<Iovec>, liovcnt: CUlong, remoteIov: ConstPtr<Iovec>, riovcnt: CUlong, flags: CUlong): Long =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedProcessVmReadv(pid, localIov.rawAddress.toString(), liovcnt.toString(), remoteIov.rawAddress.toString(), riovcnt.toString(), flags.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processVmWritev(pid: PidT, localIov: ConstPtr<Iovec>, liovcnt: CUlong, remoteIov: ConstPtr<Iovec>, riovcnt: CUlong, flags: CUlong): Long =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedProcessVmWritev(pid, localIov.rawAddress.toString(), liovcnt.toString(), remoteIov.rawAddress.toString(), riovcnt.toString(), flags.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedFutimes(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drand48(): CDouble =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedDrand48() as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedErand48(xseed.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lrand48(): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedLrand48() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedNrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedJrand48(xseed.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand48(seed: CLong) {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSrand48(seed.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setpwent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr<Passwd> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetgrent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setspent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSetspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endspent() {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedEndspent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getspent(): MutPtr<Spwd> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetspent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetspnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedShmget(key, size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedShmat(shmid, shmaddr.rawAddress.toString(), shmflg) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedShmdt(shmaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedShmctl(shmid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr<CInt> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedErrnoLocation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mremap(addr: MutPtr<CVoid>, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedMremap(addr.rawAddress.toString(), len.toString(), newLen.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedNlLanginfoL(item, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSchedGetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedMount(src.rawAddress.toString(), target.rawAddress.toString(), fstype.rawAddress.toString(), flags.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prctl(option: CInt, vararg variadicArgs: Long): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedPrctl(option, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedPpoll(fds.rawAddress.toString(), nfds.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSchedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysinfo(info: MutPtr<Sysinfo>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSysinfo(info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedInitgroups(user.rawAddress.toString(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedPopen(command.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSetmntent(filename.rawAddress.toString(), ty.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetmntent(stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addmntent(stream: MutPtr<FILE>, mnt: ConstPtr<Mntent>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedAddmntent(stream.rawAddress.toString(), mnt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedEndmntent(streamp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedHasmntopt(mnt.rawAddress.toString(), opt.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedRegcomp(preg.rawAddress.toString(), pattern.rawAddress.toString(), cflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedRegexec(preg.rawAddress.toString(), input.rawAddress.toString(), nmatch.toString(), pmatch.rawAddress.toString(), eflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedRegerror(errcode, preg.rawAddress.toString(), errbuf.rawAddress.toString(), errbufSize.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regfree(preg: MutPtr<RegexT>) {
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) {
        unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedRegfree(preg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedIconvOpen(tocode.rawAddress.toString(), fromcode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedIconv(cd.rawAddress.toString(), inbuf.rawAddress.toString(), inbytesleft.rawAddress.toString(), outbuf.rawAddress.toString(), outbytesleft.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iconvClose(cd: IconvT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedIconvClose(cd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettid(): PidT =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGettid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedTimerCreate(clockid, sevp.rawAddress.toString(), timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerDelete(timerid: TimerT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedTimerDelete(timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedTimerGetoverrun(timerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedTimerGettime(timerid.rawAddress.toString(), currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedTimerSettime(timerid.rawAddress.toString(), flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedMemmem(haystack.rawAddress.toString(), haystacklen.toString(), needle.rawAddress.toString(), needlelen.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetcpu(): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedSchedGetcpu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedGetoptLong(argc, argv.rawAddress.toString(), optstring.rawAddress.toString(), longopts.rawAddress.toString(), longindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileRange(fdIn: CInt, offIn: MutPtr<Off64T>, fdOut: CInt, offOut: MutPtr<Off64T>, len: SizeT, flags: CUint): SsizeT =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedCopyFileRange(fdIn, offIn.rawAddress.toString(), fdOut, offOut.rawAddress.toString(), len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) MutPtr((unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedFreopen64(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedFseeko64(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedFsetpos64(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    if (unixLinuxlikeLinuxL4reSharedNapiAddon != null) (unixLinuxlikeLinuxL4reSharedNapiAddon.libcUnixLinuxlikeLinuxL4reSharedFtello64(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")
