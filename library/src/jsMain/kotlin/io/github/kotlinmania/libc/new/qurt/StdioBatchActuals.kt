// port-lint: source Stdio.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (filename != null && mode != null) {
        val h = LibcNative.fopen(filename, mode)
        if (h != 0) FILE(h.toLong()) else null
    } else {
        null
    }

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun fclose(stream: FILE?): Int =
    LibcNative.fclose(stream?.handle?.toInt() ?: -1)

public actual fun fflush(stream: FILE?): Int =
    LibcNative.fflush(stream?.handle?.toInt() ?: -1)

public actual fun fread(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    LibcNative.fread(ptr?.value, size.toInt(), nmemb.toInt(), stream?.handle?.toInt() ?: -1).toULong()

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong =
    LibcNative.fwrite(ptr?.value, size.toInt(), nmemb.toInt(), stream?.handle?.toInt() ?: -1).toULong()

public actual fun fgetc(stream: FILE?): Int =
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun fputc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun putchar(c: Int): Int =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun ungetc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun fgets(s: String?, size: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun fputs(s: String?, stream: FILE?): Int =
    throw UnsupportedOperationException("fputs requires N-API addon")

public actual fun gets(s: String?): String? =
    throw UnsupportedOperationException("gets requires N-API addon")

public actual fun puts(s: String?): Int =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun printf(format: String?, vararg args: Any?): Int =
    if (format != null) LibcNative.printf(format) else -1

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires N-API addon")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires N-API addon")

public actual fun vprintf(format: String?, ap: String?): Int =
    throw UnsupportedOperationException("vprintf requires N-API addon")

public actual fun vfprintf(stream: FILE?, format: String?, ap: String?): Int =
    throw UnsupportedOperationException("vfprintf requires N-API addon")

public actual fun vsprintf(s: String?, format: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsprintf requires N-API addon")

public actual fun vsnprintf(s: String?, n: ULong, format: String?, ap: String?): Int =
    throw UnsupportedOperationException("vsnprintf requires N-API addon")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires N-API addon")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf requires N-API addon")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf requires N-API addon")

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    LibcNative.fseek(stream?.handle?.toInt() ?: -1, offset.toInt(), whence)

public actual fun ftell(stream: FILE?): Long =
    LibcNative.ftell(stream?.handle?.toInt() ?: -1).toLong()

public actual fun rewind(stream: FILE?): Unit = throw UnsupportedOperationException("rewind requires N-API addon")

public actual fun fgetpos(stream: FILE?, pos: Long?): Int =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(stream: FILE?, pos: Long?): Int =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun clearerr(stream: FILE?): Unit = throw UnsupportedOperationException("clearerr requires N-API addon")

public actual fun feof(stream: FILE?): Int =
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(stream: FILE?): Int =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun perror(s: String?): Unit = throw UnsupportedOperationException("perror requires N-API addon")

public actual fun remove(filename: String?): Int =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rename(old: String?, new: String?): Int =
    throw UnsupportedOperationException("rename requires N-API addon")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires N-API addon")

public actual fun tmpnam(s: String?): String? =
    throw UnsupportedOperationException("tmpnam requires N-API addon")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun setbuf(stream: FILE?, buffer: String?): Unit = throw UnsupportedOperationException("setbuf requires N-API addon")
