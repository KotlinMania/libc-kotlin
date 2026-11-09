@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT

private val _unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun setgrent(): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_setgrent() as Int) else 0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else 0

public actual fun freelocale(loc: LocaleT): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_freelocale(loc.toLong().toString()) as Int) else 0

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg) as Int) else 0

public actual fun dirname(path: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_dirname(path) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun basename(path: String?): COpaquePointer? =
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_basename(path) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    if (_unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon != null) {
        _unixBsdFreebsdlikeFreebsdFreebsd11NapiAddon.libc_unix_bsd_freebsdlike_freebsd_freebsd11_qsortR((base?.value ?: 0L).toString(), num.toString(), size.toString(), (arg?.value ?: 0L).toString(), 0L.toString())
    }
}
