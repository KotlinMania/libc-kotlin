// port-lint: source Stdio.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen requires manual FFI bridge — not yet implemented")

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires manual FFI bridge — not yet implemented")

public actual fun fclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("fclose requires manual FFI bridge — not yet implemented")

public actual fun fflush(stream: FILE?): CInt =
    throw UnsupportedOperationException("fflush requires manual FFI bridge — not yet implemented")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires manual FFI bridge — not yet implemented")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc requires manual FFI bridge — not yet implemented")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc requires manual FFI bridge — not yet implemented")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar requires manual FFI bridge — not yet implemented")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar requires manual FFI bridge — not yet implemented")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc requires manual FFI bridge — not yet implemented")

public actual fun fgets(s: String?, size: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs requires manual FFI bridge — not yet implemented")

public actual fun gets(s: String?): String? =
    throw UnsupportedOperationException("gets requires manual FFI bridge — not yet implemented")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts requires manual FFI bridge — not yet implemented")

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
    throw UnsupportedOperationException("fseek requires manual FFI bridge — not yet implemented")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell requires manual FFI bridge — not yet implemented")

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
    throw UnsupportedOperationException("feof requires manual FFI bridge — not yet implemented")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror requires manual FFI bridge — not yet implemented")

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror requires manual FFI bridge — not yet implemented")
}

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove requires manual FFI bridge — not yet implemented")

public actual fun rename(old: String?, new: String?): CInt =
    throw UnsupportedOperationException("rename requires manual FFI bridge — not yet implemented")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires manual FFI bridge — not yet implemented")

public actual fun tmpnam(s: String?): String? =
    throw UnsupportedOperationException("tmpnam requires manual FFI bridge — not yet implemented")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires manual FFI bridge — not yet implemented")

public actual fun setbuf(stream: FILE?, buffer: String?) {
    throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")
}
