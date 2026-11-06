package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object StdioRawLibc {
    external fun fopen(filename: String?, mode: String?): Long?
    external fun freopen(filename: String?, mode: String?, stream: Long): Long?
    external fun fclose(stream: Long): Int
    external fun fflush(stream: Long): Int
    external fun fread(ptr: Long, size: Long, nmemb: Long, stream: Long): Long
    external fun fwrite(ptr: Long, size: Long, nmemb: Long, stream: Long): Long
    external fun fgetc(stream: Long): Int
    external fun fputc(c: Int, stream: Long): Int
    external fun getchar(): Int
    external fun putchar(c: Int): Int
    external fun ungetc(c: Int, stream: Long): Int
    external fun fgets(s: Long, size: Int, stream: Long): Long?
    external fun fputs(s: String?, stream: Long): Int
    external fun gets(s: Long): Long?
    external fun puts(s: String?): Int
    external fun vprintf(format: String?, ap: Long): Int
    external fun vfprintf(stream: Long, format: String?, ap: Long): Int
    external fun vsprintf(s: Long, format: String?, ap: Long): Int
    external fun vsnprintf(s: Long, n: Long, format: String?, ap: Long): Int
    external fun fseek(stream: Long, offset: Long, whence: Int): Int
    external fun ftell(stream: Long): Long
    external fun rewind(stream: Long)
    external fun fgetpos(stream: Long, pos: Long): Int
    external fun fsetpos(stream: Long, pos: Long): Int
    external fun clearerr(stream: Long)
    external fun feof(stream: Long): Int
    external fun ferror(stream: Long): Int
    external fun perror(s: String?)
    external fun remove(filename: String?): Int
    external fun rename(old: String?, new: String?): Int
    external fun tmpfile(): Long?
    external fun tmpnam(s: Long): Long?
    external fun setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int
    external fun setbuf(stream: Long, buffer: Long)
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    StdioRawLibc.fopen(filename, mode)

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    StdioRawLibc.freopen(filename, mode, stream?.toLong() ?: 0L)

public actual fun fclose(stream: FILE?): CInt =
    StdioRawLibc.fclose(stream?.toLong() ?: 0L)

public actual fun fflush(stream: FILE?): CInt =
    StdioRawLibc.fflush(stream?.toLong() ?: 0L)

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    StdioRawLibc.fread(ptr?.value ?: 0L, size, nmemb, stream?.toLong() ?: 0L)

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    StdioRawLibc.fwrite(ptr?.value ?: 0L, size, nmemb, stream?.toLong() ?: 0L)

public actual fun fgetc(stream: FILE?): CInt =
    StdioRawLibc.fgetc(stream?.toLong() ?: 0L)

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    StdioRawLibc.fputc(c, stream?.toLong() ?: 0L)

public actual fun getchar(): CInt =
    StdioRawLibc.getchar()

public actual fun putchar(c: CInt): CInt =
    StdioRawLibc.putchar(c)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    StdioRawLibc.ungetc(c, stream?.toLong() ?: 0L)

public actual fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    StdioRawLibc.fgets(s?.value ?: 0L, size, stream?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputs(s: String?, stream: FILE?): CInt =
    StdioRawLibc.fputs(s, stream?.toLong() ?: 0L)

public actual fun gets(s: COpaquePointer?): COpaquePointer? =
    StdioRawLibc.gets(s?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun puts(s: String?): CInt =
    StdioRawLibc.puts(s)

public actual fun vprintf(format: String?, ap: VaList): CInt =
    StdioRawLibc.vprintf(format, ap)

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    StdioRawLibc.vfprintf(stream?.toLong() ?: 0L, format, ap)

public actual fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt =
    StdioRawLibc.vsprintf(s?.value ?: 0L, format, ap)

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt =
    StdioRawLibc.vsnprintf(s?.value ?: 0L, n, format, ap)

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    StdioRawLibc.fseek(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    StdioRawLibc.ftell(stream?.toLong() ?: 0L)

public actual fun rewind(stream: FILE?) {
    StdioRawLibc.rewind(stream?.toLong() ?: 0L)
}

public actual fun fgetpos(stream: FILE?, pos: FposT?): CInt =
    StdioRawLibc.fgetpos(stream?.toLong() ?: 0L, pos?.toLong() ?: 0L)

public actual fun fsetpos(stream: FILE?, pos: FposT?): CInt =
    StdioRawLibc.fsetpos(stream?.toLong() ?: 0L, pos?.toLong() ?: 0L)

public actual fun clearerr(stream: FILE?) {
    StdioRawLibc.clearerr(stream?.toLong() ?: 0L)
}

public actual fun feof(stream: FILE?): CInt =
    StdioRawLibc.feof(stream?.toLong() ?: 0L)

public actual fun ferror(stream: FILE?): CInt =
    StdioRawLibc.ferror(stream?.toLong() ?: 0L)

public actual fun perror(s: String?) {
    StdioRawLibc.perror(s)
}

public actual fun remove(filename: String?): CInt =
    StdioRawLibc.remove(filename)

public actual fun rename(old: String?, new: String?): CInt =
    StdioRawLibc.rename(old, new)

public actual fun tmpfile(): FILE? =
    StdioRawLibc.tmpfile()

public actual fun tmpnam(s: COpaquePointer?): COpaquePointer? =
    StdioRawLibc.tmpnam(s?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    StdioRawLibc.setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)

public actual fun setbuf(stream: FILE?, buffer: COpaquePointer?) {
    StdioRawLibc.setbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L)
}
