@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT

private val _unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun setgrent() {
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_setgrent()
    }
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun freelocale(loc: LocaleT) {
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_freelocale((loc?.value ?: 0L).toString())
    }
}

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg) as String).toLong() else 0L

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: COpaquePointer?): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetGetdomain(level, which, id.toString(), setsize.toString(), (mask?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else 0

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?, policy: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_cpusetSetdomain(level, which, id.toString(), setsize.toString(), (mask?.value ?: 0L).toString(), policy) as Int) else 0

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_dirname((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_basename((path?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback?, arg: COpaquePointer?) {
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    }
}

public actual fun kvmKerndisp(kd: COpaquePointer?): KssizeT =
    if (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd15NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd15_kvmKerndisp((kd?.value ?: 0L).toString()) as String).toLong() else 0L
