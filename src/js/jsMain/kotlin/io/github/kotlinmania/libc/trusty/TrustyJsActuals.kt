@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

private val _trustyNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_calloc(nobj.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_malloc(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_realloc((p?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun free(p: COpaquePointer?) {
    if (_trustyNapiAddon != null) {
        _trustyNapiAddon.libc_trusty_free((p?.value ?: 0L).toString())
    }
}

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_posixMemalign((memptr?.value ?: 0L).toString(), align.toString(), size.toString()) as Int) else 0

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_write(fd, (buf?.value ?: 0L).toString(), count.toString()) as String).toLong() else 0L

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun close(fd: CInt): CInt =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_close(fd) as Int) else 0

public actual fun strlen(cs: String?): SizeT =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_strlen(cs) as String).toULong() else 0uL

public actual fun getauxval(type: CUlong): CUlong =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_getauxval(type.toString()) as String).toULong() else 0uL

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_munmap((addr?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else 0

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_trustyNapiAddon != null) (_trustyNapiAddon.libc_trusty_nanosleep((rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else 0
