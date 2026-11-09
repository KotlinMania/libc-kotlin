@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.s390x

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

private val _unixLinuxlikeLinuxGnuB64S390xNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun sysctl(name: COpaquePointer?, namelen: CInt, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixLinuxlikeLinuxGnuB64S390xNapiAddon != null) (_unixLinuxlikeLinuxGnuB64S390xNapiAddon.libc_unix_linuxlike_linux_gnu_b64_s390x_sysctl((name?.value ?: 0L).toString(), namelen, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else 0

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuB64S390xNapiAddon != null) (_unixLinuxlikeLinuxGnuB64S390xNapiAddon.libc_unix_linuxlike_linux_gnu_b64_s390x_getcontext((ucp?.value ?: 0L).toString()) as Int) else 0

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuB64S390xNapiAddon != null) (_unixLinuxlikeLinuxGnuB64S390xNapiAddon.libc_unix_linuxlike_linux_gnu_b64_s390x_setcontext((ucp?.value ?: 0L).toString()) as Int) else 0

public actual fun makecontext(ucp: COpaquePointer?, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
}

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxGnuB64S390xNapiAddon != null) (_unixLinuxlikeLinuxGnuB64S390xNapiAddon.libc_unix_linuxlike_linux_gnu_b64_s390x_swapcontext((uocp?.value ?: 0L).toString(), (ucp?.value ?: 0L).toString()) as Int) else 0
