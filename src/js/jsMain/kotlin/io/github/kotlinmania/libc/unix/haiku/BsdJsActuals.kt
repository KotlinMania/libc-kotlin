@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixHaikuBsdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprogname(): ConstPtr =
    if (unixHaikuBsdNapiAddon != null) ConstPtr((unixHaikuBsdNapiAddon.libcUnixHaikuBsdGetprogname() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setprogname(progname: ConstPtr) {
    if (unixHaikuBsdNapiAddon != null) {
        unixHaikuBsdNapiAddon.libcUnixHaikuBsdSetprogname(progname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun arc4random(): UInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdArc4random() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdArc4randomUniform(upperBound.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: MutPtr, n: SizeT) {
    if (unixHaikuBsdNapiAddon != null) {
        unixHaikuBsdNapiAddon.libcUnixHaikuBsdArc4randomBuf(buf.rawAddress.toString(), n.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdMkstemps(template.rawAddress.toString(), suffixlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtonum(nptr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstr: MutPtr): CLonglong =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdStrtonum(nptr.rawAddress.toString(), minval.toString(), maxval.toString(), errstr.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loginTty(fd: CInt): CInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdLoginTty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdForkpty(amaster.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsep(string: MutPtr, delimiters: ConstPtr): MutPtr =
    if (unixHaikuBsdNapiAddon != null) MutPtr((unixHaikuBsdNapiAddon.libcUnixHaikuBsdStrsep(string.rawAddress.toString(), delimiters.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun explicitBzero(buf: MutPtr, len: SizeT) {
    if (unixHaikuBsdNapiAddon != null) {
        unixHaikuBsdNapiAddon.libcUnixHaikuBsdExplicitBzero(buf.rawAddress.toString(), len.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun slInit(): MutPtr =
    if (unixHaikuBsdNapiAddon != null) MutPtr((unixHaikuBsdNapiAddon.libcUnixHaikuBsdSlInit() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun slAdd(sl: MutPtr, n: MutPtr): CInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdSlAdd(sl.rawAddress.toString(), n.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun slFree(sl: MutPtr, i: CInt) {
    if (unixHaikuBsdNapiAddon != null) {
        unixHaikuBsdNapiAddon.libcUnixHaikuBsdSlFree(sl.rawAddress.toString(), i)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun slFind(sl: MutPtr, n: MutPtr): MutPtr =
    if (unixHaikuBsdNapiAddon != null) MutPtr((unixHaikuBsdNapiAddon.libcUnixHaikuBsdSlFind(sl.rawAddress.toString(), n.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kqueue(): CInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdKqueue() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdKevent(kq, changelist.rawAddress.toString(), nchanges, eventlist.rawAddress.toString(), nevents, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdLutimes(file.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT =
    if (unixHaikuBsdNapiAddon != null) (unixHaikuBsdNapiAddon.libcUnixHaikuBsdWait4(pid, status.rawAddress.toString(), options, rusage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
