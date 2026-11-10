@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

private val _unixHaikuBsdNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_daemon(nochdir, noclose) as Int) else 0

public actual fun getprogname(): COpaquePointer? =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_getprogname() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setprogname(progname: String?) {
    if (_unixHaikuBsdNapiAddon != null) {
        _unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_setprogname(progname)
    }
}

public actual fun arc4random(): UInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_arc4random() as Int).toUInt() else 0u

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_arc4randomUniform(upperBound.toInt()) as Int).toUInt() else 0u

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    if (_unixHaikuBsdNapiAddon != null) {
        _unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_arc4randomBuf((buf?.value ?: 0L).toString(), n.toString())
    }
}

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_mkstemps((template?.value ?: 0L).toString(), suffixlen) as Int) else 0

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_strtonum(nptr, minval.toString(), maxval.toString(), (errstr?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun loginTty(fd: CInt): CInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_loginTty(fd) as Int) else 0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_forkpty((amaster?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else 0

public actual fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_strsep((string?.value ?: 0L).toString(), delimiters) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun explicitBzero(buf: COpaquePointer?, len: SizeT) {
    if (_unixHaikuBsdNapiAddon != null) {
        _unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_explicitBzero((buf?.value ?: 0L).toString(), len.toString())
    }
}

public actual fun slInit(): COpaquePointer? =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_slInit() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun slAdd(sl: COpaquePointer?, n: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_slAdd((sl?.value ?: 0L).toString(), (n?.value ?: 0L).toString()) as Int) else 0

public actual fun slFree(sl: COpaquePointer?, i: CInt) {
    if (_unixHaikuBsdNapiAddon != null) {
        _unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_slFree((sl?.value ?: 0L).toString(), i)
    }
}

public actual fun slFind(sl: COpaquePointer?, n: COpaquePointer?): COpaquePointer? =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_slFind((sl?.value ?: 0L).toString(), (n?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun kqueue(): CInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_kqueue() as Int) else 0

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_kevent(kq, (changelist?.value ?: 0L).toString(), nchanges, (eventlist?.value ?: 0L).toString(), nevents, (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) as Int) else 0

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_lutimes(file, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    if (_unixHaikuBsdNapiAddon != null) (_unixHaikuBsdNapiAddon.libc_unix_haiku_bsd_wait4(pid, (status?.value ?: 0L).toString(), options, (rusage?.value ?: 0L).toString()) as Int) else 0
