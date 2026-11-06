@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun fopen(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    io.github.kotlinmania.libc.cinterop.libc_stdio_freopen(filename, mode, stream?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fclose(stream: FILE?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun fflush(stream: FILE?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fflush(stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fread(ptr?.value?.toCPointer<ByteVar>(), size, nmemb, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nmemb, stream?.handle?.toCPointer<ByteVar>())

public actual fun fgetc(stream: FILE?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_getchar()

public actual fun putchar(c: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_putchar(c)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fgets(s?.value?.toCPointer<ByteVar>(), size, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputs(s: String?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun gets(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_stdio_gets(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun puts(s: String?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_puts(s)

public actual fun vprintf(format: String?, ap: VaList): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_vprintf(format, ap.toInt())

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_vfprintf(stream?.handle?.toCPointer<ByteVar>(), format, ap.toInt())

public actual fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_vsprintf(s?.value?.toCPointer<ByteVar>(), format, ap.toInt())

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_vsnprintf(s?.value?.toCPointer<ByteVar>(), n, format, ap.toInt())

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    io.github.kotlinmania.libc.cinterop.libc_stdio_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    io.github.kotlinmania.libc.cinterop.libc_stdio_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, pos: FposT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fgetpos(stream?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, pos: FposT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_fsetpos(stream?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun clearerr(stream: FILE?) {
    io.github.kotlinmania.libc.cinterop.libc_stdio_clearerr(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun feof(stream: FILE?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun perror(s: String?) {
    io.github.kotlinmania.libc.cinterop.libc_stdio_perror(s)
}

public actual fun remove(filename: String?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_remove(filename)

public actual fun rename(old: String?, new: String?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_rename(old, new)

public actual fun tmpfile(): FILE? =
    io.github.kotlinmania.libc.cinterop.libc_stdio_tmpfile()?.let { FILE(it.toLong()) }

public actual fun tmpnam(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_stdio_tmpnam(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_stdio_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buffer: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_stdio_setbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())
}
