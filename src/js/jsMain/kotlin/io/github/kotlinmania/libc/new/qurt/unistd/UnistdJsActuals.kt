@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT

private val _newQurtUnistdNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun access(pathname: String?, mode: CInt): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_access(pathname, mode) as Int) else 0

public actual fun close(fd: CInt): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_close(fd) as Int) else 0

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_lseek(fd, offset.toString(), whence) as String).toLong() else 0L

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_read(fd, (buf?.value ?: 0L).toString(), count.toString()) as Int) else 0

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_write(fd, (buf?.value ?: 0L).toString(), count.toString()) as Int) else 0

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_ftruncate(fd, length.toString()) as Int) else 0

public actual fun unlink(pathname: String?): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_unlink(pathname) as Int) else 0

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_getcwd((buf?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun rmdir(pathname: String?): CInt =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_rmdir(pathname) as Int) else 0

public actual fun getpid(): PidT =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_getpid() as Int) else 0

public actual fun sleep(seconds: CUint): CUint =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_sleep(seconds.toInt()) as Int).toUInt() else 0u

public actual fun sysconf(name: CInt): CLong =
    if (_newQurtUnistdNapiAddon != null) (_newQurtUnistdNapiAddon.libc_new_qurt_unistd_sysconf(name) as String).toLong() else 0L
