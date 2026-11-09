@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private val _newNetbsdUtmpNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun utmpname(file: String?): CInt =
    if (_newNetbsdUtmpNapiAddon != null) (_newNetbsdUtmpNapiAddon.libc_new_netbsd_utmp_utmpname(file) as Int) else 0

public actual fun setutent() {
    if (_newNetbsdUtmpNapiAddon != null) {
        _newNetbsdUtmpNapiAddon.libc_new_netbsd_utmp_setutent()
    }
}

public actual fun getutent(): COpaquePointer? =
    if (_newNetbsdUtmpNapiAddon != null) (_newNetbsdUtmpNapiAddon.libc_new_netbsd_utmp_getutent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun endutent() {
    if (_newNetbsdUtmpNapiAddon != null) {
        _newNetbsdUtmpNapiAddon.libc_new_netbsd_utmp_endutent()
    }
}
