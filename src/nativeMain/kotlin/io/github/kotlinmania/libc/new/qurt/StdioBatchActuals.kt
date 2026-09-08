// port-lint: source Stdio.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fopen(filename: String?, mode: String?): FILE? =
    libc.cinterop.libc_fopen(filename, mode)?.let { FILE(it.toLong()) }
public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    libc.cinterop.libc_freopen(filename, mode, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())?.let { FILE(it.toLong()) }
public actual fun fclose(stream: FILE?): CInt =
    libc.cinterop.libc_fclose(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fflush(stream: FILE?): CInt =
    libc.cinterop.libc_fflush(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fread(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    libc.cinterop.libc_fwrite(ptr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), size, nmemb, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fgetc(stream: FILE?): CInt =
    libc.cinterop.libc_fgetc(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fputc(c: CInt, stream: FILE?): CInt =
    libc.cinterop.libc_fputc(c, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun getchar(): CInt = libc.cinterop.libc_getchar()
public actual fun putchar(c: CInt): CInt = libc.cinterop.libc_putchar(c)
public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    libc.cinterop.libc_ungetc(c, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fgets(s: String?, size: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    libc.cinterop.libc_fputs(s, stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun gets(s: String?): String? =
    throw UnsupportedOperationException("gets requires manual FFI bridge — not yet implemented")

public actual fun puts(s: String?): CInt =
    libc.cinterop.libc_puts(s)
public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun vprintf(format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vprintf requires manual FFI bridge — not yet implemented")

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vfprintf requires manual FFI bridge — not yet implemented")

public actual fun vsprintf(s: String?, format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vsprintf requires manual FFI bridge — not yet implemented")

public actual fun vsnprintf(s: String?, n: ULong, format: String?, ap: VaList): CInt =
    throw UnsupportedOperationException("vsnprintf requires manual FFI bridge — not yet implemented")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf requires manual FFI bridge — not yet implemented")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf requires manual FFI bridge — not yet implemented")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    libc.cinterop.libc_fseek(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)
public actual fun ftell(stream: FILE?): CLong =
    libc.cinterop.libc_ftell(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind requires manual FFI bridge — not yet implemented")
}

public actual fun fgetpos(stream: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(stream: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun clearerr(stream: FILE?) {
    throw UnsupportedOperationException("clearerr requires manual FFI bridge — not yet implemented")
}

public actual fun feof(stream: FILE?): CInt =
    libc.cinterop.libc_feof(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun ferror(stream: FILE?): CInt =
    libc.cinterop.libc_ferror(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror requires manual FFI bridge — not yet implemented")
}

public actual fun remove(filename: String?): CInt =
    libc.cinterop.libc_remove(filename)
public actual fun rename(old: String?, new: String?): CInt =
    libc.cinterop.libc_rename(old, new)
public actual fun tmpfile(): FILE? =
    libc.cinterop.libc_tmpfile()?.let { FILE(it.toLong()) }
public actual fun tmpnam(s: String?): String? =
    throw UnsupportedOperationException("tmpnam requires manual FFI bridge — not yet implemented")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    libc.cinterop.libc_setvbuf(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), buffer, mode, size)
public actual fun setbuf(stream: FILE?, buffer: String?) {
    throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")
}
