// port-lint: source new/qurt/stdio.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val BUFSIZ: UInt = 1024u
public const val FILENAME_MAX: UInt = 260u
public const val EOF: Int = -1

public expect fun fopen(filename: String?, mode: String?): FILE?

public expect fun freopen(filename: String?, mode: String?, stream: FILE?): FILE?

public expect fun fclose(stream: FILE?): Int

public expect fun fflush(stream: FILE?): Int

public expect fun fread(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong

public expect fun fwrite(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong

public expect fun fgetc(stream: FILE?): Int

public expect fun fputc(c: Int, stream: FILE?): Int

public expect fun getchar(): Int

public expect fun putchar(c: Int): Int

public expect fun ungetc(c: Int, stream: FILE?): Int

public expect fun fgets(s: String?, size: Int, stream: FILE?): String?

public expect fun fputs(s: String?, stream: FILE?): Int

public expect fun gets(s: String?): String?

public expect fun puts(s: String?): Int

public expect fun printf(format: String?, vararg args: Any?): Int

public expect fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int

public expect fun sprintf(s: String?, format: String?, vararg args: Any?): Int

public expect fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int

public expect fun vprintf(format: String?, ap: String?): Int

public expect fun vfprintf(stream: FILE?, format: String?, ap: String?): Int

public expect fun vsprintf(s: String?, format: String?, ap: String?): Int

public expect fun vsnprintf(s: String?, n: ULong, format: String?, ap: String?): Int

public expect fun scanf(format: String?, vararg args: Any?): Int

public expect fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int

public expect fun sscanf(s: String?, format: String?, vararg args: Any?): Int

public expect fun fseek(stream: FILE?, offset: Long, whence: Int): Int

public expect fun ftell(stream: FILE?): Long

public expect fun rewind(stream: FILE?)

public expect fun fgetpos(stream: FILE?, pos: Long?): Int

public expect fun fsetpos(stream: FILE?, pos: Long?): Int

public expect fun clearerr(stream: FILE?)

public expect fun feof(stream: FILE?): Int

public expect fun ferror(stream: FILE?): Int

public expect fun perror(s: String?)

public expect fun remove(filename: String?): Int

public expect fun rename(old: String?, new: String?): Int

public expect fun tmpfile(): FILE?

public expect fun tmpnam(s: String?): String?

public expect fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int

public expect fun setbuf(stream: FILE?, buffer: String?)
