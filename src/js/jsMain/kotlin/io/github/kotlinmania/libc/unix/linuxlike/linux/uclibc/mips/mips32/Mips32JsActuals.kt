@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

private val _unixLinuxlikeLinuxUclibcMipsMips32NapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun sysctl(name: COpaquePointer?, namelen: CInt, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_sysctl((name?.value ?: 0L).toString(), namelen, (oldp?.value ?: 0L).toString(), (oldlenp?.value ?: 0L).toString(), (newp?.value ?: 0L).toString(), newlen.toString()) as Int) else 0

public actual fun glob64(pattern: String?, flags: CInt, errfunc: FnCallback?, pglob: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_glob64(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else 0

public actual fun globfree64(pglob: COpaquePointer?) {
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) {
        _unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_globfree64((pglob?.value ?: 0L).toString())
    }
}

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrGetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon != null) (_unixLinuxlikeLinuxUclibcMipsMips32NapiAddon.libc_unix_linuxlike_linux_uclibc_mips_mips32_pthreadAttrSetaffinityNp((attr?.value ?: 0L).toString(), cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else 0
