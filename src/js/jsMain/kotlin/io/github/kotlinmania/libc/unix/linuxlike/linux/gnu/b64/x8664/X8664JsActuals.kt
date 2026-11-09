@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

private val _unixLinuxlikeLinuxGnuB64X8664NapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuB64X8664NapiAddon != null) (_unixLinuxlikeLinuxGnuB64X8664NapiAddon.libc_unix_linuxlike_linux_gnu_b64_x8664_getcontext((ucp?.value ?: 0L).toString()) as Int) else 0

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuB64X8664NapiAddon != null) (_unixLinuxlikeLinuxGnuB64X8664NapiAddon.libc_unix_linuxlike_linux_gnu_b64_x8664_setcontext((ucp?.value ?: 0L).toString()) as Int) else 0

public actual fun makecontext(ucp: COpaquePointer?, func: SigactionSaRestorerCallback, argc: CInt) {
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuB64X8664NapiAddon != null) (_unixLinuxlikeLinuxGnuB64X8664NapiAddon.libc_unix_linuxlike_linux_gnu_b64_x8664_swapcontext((uocp?.value ?: 0L).toString(), (ucp?.value ?: 0L).toString()) as Int) else 0
