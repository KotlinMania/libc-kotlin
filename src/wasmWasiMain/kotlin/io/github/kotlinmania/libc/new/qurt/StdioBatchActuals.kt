// port-lint: source Stdio.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on WASI — no C library access")

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on WASI — no C library access")

public actual fun fclose(stream: FILE?): Int =
    throw UnsupportedOperationException("fclose not available on WASI — no C library access")

public actual fun fflush(stream: FILE?): Int =
    throw UnsupportedOperationException("fflush not available on WASI — no C library access")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on WASI — no C library access")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on WASI — no C library access")

public actual fun fgetc(stream: FILE?): Int =
    throw UnsupportedOperationException("fgetc not available on WASI — no C library access")

public actual fun fputc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("fputc not available on WASI — no C library access")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar not available on WASI — no C library access")

public actual fun putchar(c: Int): Int =
    throw UnsupportedOperationException("putchar not available on WASI — no C library access")

public actual fun ungetc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("ungetc not available on WASI — no C library access")

public actual fun fgets(s: String?, size: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on WASI — no C library access")

public actual fun fputs(s: String?, stream: FILE?): Int =
    throw UnsupportedOperationException("fputs not available on WASI — no C library access")

public actual fun gets(s: String?): String? =
    throw UnsupportedOperationException("gets not available on WASI — no C library access")

public actual fun puts(s: String?): Int =
    throw UnsupportedOperationException("puts not available on WASI — no C library access")

public actual fun printf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf not available on WASI — no C library access")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf not available on WASI — no C library access")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf not available on WASI — no C library access")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf not available on WASI — no C library access")

public actual fun vprintf(format: String?, ap: String?): Int =
    throw UnsupportedOperationException("vprintf not available on WASI — no C library access")

public actual fun vfprintf(stream: FILE?, format: String?, ap: String?): Int =
    throw UnsupportedOperationException("vfprintf not available on WASI — no C library access")

public actual fun vsprintf(s: String?, format: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsprintf not available on WASI — no C library access")

public actual fun vsnprintf(s: String?, n: ULong, format: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsnprintf not available on WASI — no C library access")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf not available on WASI — no C library access")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf not available on WASI — no C library access")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf not available on WASI — no C library access")

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseek not available on WASI — no C library access")

public actual fun ftell(stream: FILE?): Long =
    throw UnsupportedOperationException("ftell not available on WASI — no C library access")

public actual fun rewind(stream: FILE?): Unit = throw UnsupportedOperationException("rewind not available on WASI — no C library access")

public actual fun fgetpos(stream: FILE?, pos: Long?): Int =
    throw UnsupportedOperationException("fgetpos not available on WASI — no C library access")

public actual fun fsetpos(stream: FILE?, pos: Long?): Int =
    throw UnsupportedOperationException("fsetpos not available on WASI — no C library access")

public actual fun clearerr(stream: FILE?): Unit = throw UnsupportedOperationException("clearerr not available on WASI — no C library access")

public actual fun feof(stream: FILE?): Int =
    throw UnsupportedOperationException("feof not available on WASI — no C library access")

public actual fun ferror(stream: FILE?): Int =
    throw UnsupportedOperationException("ferror not available on WASI — no C library access")

public actual fun perror(s: String?): Unit = throw UnsupportedOperationException("perror not available on WASI — no C library access")

public actual fun remove(filename: String?): Int =
    throw UnsupportedOperationException("remove not available on WASI — no C library access")

public actual fun rename(old: String?, new: String?): Int =
    throw UnsupportedOperationException("rename not available on WASI — no C library access")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on WASI — no C library access")

public actual fun tmpnam(s: String?): String? =
    throw UnsupportedOperationException("tmpnam not available on WASI — no C library access")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf not available on WASI — no C library access")

public actual fun setbuf(stream: FILE?, buffer: String?): Unit = throw UnsupportedOperationException("setbuf not available on WASI — no C library access")
