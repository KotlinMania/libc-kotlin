@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList

private val _newQurtStdioNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fopen(filename, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_freopen(filename, mode, (stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun fclose(stream: FILE?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fclose((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fflush(stream: FILE?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fflush((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fread((ptr?.value ?: 0L).toString(), size.toString(), nmemb.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nmemb.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fgetc(stream: FILE?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fgetc((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fputc(c, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun getchar(): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_getchar() as Int) else 0

public actual fun putchar(c: CInt): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_putchar(c) as Int) else 0

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_ungetc(c, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fgets((s?.value ?: 0L).toString(), size, (stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fputs(s, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun gets(s: COpaquePointer?): COpaquePointer? =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_gets((s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun puts(s: String?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_puts(s) as Int) else 0

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun vprintf(format: String?, ap: VaList): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_vprintf(format, (ap?.value ?: 0L).toString()) as Int) else 0

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_vfprintf((stream?.handle ?: 0L).toString(), format, (ap?.value ?: 0L).toString()) as Int) else 0

public actual fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_vsprintf((s?.value ?: 0L).toString(), format, (ap?.value ?: 0L).toString()) as Int) else 0

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_vsnprintf((s?.value ?: 0L).toString(), n.toString(), format, (ap?.value ?: 0L).toString()) as Int) else 0

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else 0

public actual fun ftell(stream: FILE?): CLong =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_ftell((stream?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun rewind(stream: FILE?) {
    if (_newQurtStdioNapiAddon != null) {
        _newQurtStdioNapiAddon.libc_new_qurt_stdio_rewind((stream?.handle ?: 0L).toString())
    }
}

public actual fun fgetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fgetpos((stream?.handle ?: 0L).toString(), (pos?.value ?: 0L).toString()) as Int) else 0

public actual fun fsetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_fsetpos((stream?.handle ?: 0L).toString(), (pos?.value ?: 0L).toString()) as Int) else 0

public actual fun clearerr(stream: FILE?) {
    if (_newQurtStdioNapiAddon != null) {
        _newQurtStdioNapiAddon.libc_new_qurt_stdio_clearerr((stream?.handle ?: 0L).toString())
    }
}

public actual fun feof(stream: FILE?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_feof((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun ferror(stream: FILE?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_ferror((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun perror(s: String?) {
    if (_newQurtStdioNapiAddon != null) {
        _newQurtStdioNapiAddon.libc_new_qurt_stdio_perror(s)
    }
}

public actual fun remove(filename: String?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_remove(filename) as Int) else 0

public actual fun rename(old: String?, new: String?): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_rename(old, new) as Int) else 0

public actual fun tmpfile(): FILE? =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_tmpfile() as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun tmpnam(s: COpaquePointer?): COpaquePointer? =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_tmpnam((s?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_newQurtStdioNapiAddon != null) (_newQurtStdioNapiAddon.libc_new_qurt_stdio_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) as Int) else 0

public actual fun setbuf(stream: FILE?, buffer: COpaquePointer?) {
    if (_newQurtStdioNapiAddon != null) {
        _newQurtStdioNapiAddon.libc_new_qurt_stdio_setbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString())
    }
}
