@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.UidT

private val _newNetbsdUtmpxNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun setutxent() {
    if (_newNetbsdUtmpxNapiAddon != null) {
        _newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_setutxent()
    }
}

public actual fun endutxent() {
    if (_newNetbsdUtmpxNapiAddon != null) {
        _newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_endutxent()
    }
}

public actual fun getutxent(): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_updwtmpx(file, (ut?.value ?: 0L).toString()) as Int) else 0

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getlastlogx(fname, uid.toInt(), (ll?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_updlastlogx(fname, uid.toInt(), (ll?.value ?: 0L).toString()) as Int) else 0

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
    if (_newNetbsdUtmpxNapiAddon != null) {
        _newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutmp((ux?.value ?: 0L).toString(), (u?.value ?: 0L).toString())
    }
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
    if (_newNetbsdUtmpxNapiAddon != null) {
        _newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutmpx((u?.value ?: 0L).toString(), (ux?.value ?: 0L).toString())
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_utmpxname(file) as Int) else 0
