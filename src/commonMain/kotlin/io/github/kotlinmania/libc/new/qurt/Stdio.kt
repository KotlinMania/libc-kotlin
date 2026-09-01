// port-lint: source new/qurt/stdio.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public const val BUFSIZ: CUInt = 1024u
public const val FILENAME_MAX: CUInt = 260u
public const val EOF: CInt = -1

public fun fopen(filename: String?, mode: String?): FILE? = null

public fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? = null

public fun fclose(stream: FILE?): CInt = -1

public fun fflush(stream: FILE?): CInt = -1

public fun fread(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong = 0uL

public fun fwrite(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong = 0uL

public fun fgetc(stream: FILE?): CInt = -1

public fun fputc(c: CInt, stream: FILE?): CInt = -1

public fun getchar(): CInt = -1

public fun putchar(c: CInt): CInt = -1

public fun ungetc(c: CInt, stream: FILE?): CInt = -1

public fun fgets(s: String?, size: CInt, stream: FILE?): String? = null

public fun fputs(s: String?, stream: FILE?): CInt = -1

public fun gets(s: String?): String? = null

public fun puts(s: String?): CInt = -1

public fun printf(format: String?, vararg args: Any?): CInt = -1

public fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt = -1

public fun sprintf(s: String?, format: String?, vararg args: Any?): CInt = -1

public fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt = -1

public fun vprintf(format: String?, ap: VaList): CInt = -1

public fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt = -1

public fun vsprintf(s: String?, format: String?, ap: VaList): CInt = -1

public fun vsnprintf(s: String?, n: ULong, format: String?, ap: VaList): CInt = -1

public fun scanf(format: String?, vararg args: Any?): CInt = -1

public fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt = -1

public fun sscanf(s: String?, format: String?, vararg args: Any?): CInt = -1

public fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt = -1

public fun ftell(stream: FILE?): CLong = -1L

public fun rewind(stream: FILE?) { }

public fun fgetpos(stream: FILE?, pos: FposT?): CInt = -1

public fun fsetpos(stream: FILE?, pos: FposT?): CInt = -1

public fun clearerr(stream: FILE?) { }

public fun feof(stream: FILE?): CInt = -1

public fun ferror(stream: FILE?): CInt = -1

public fun perror(s: String?) { }

public fun remove(filename: String?): CInt = -1

public fun rename(old: String?, new: String?): CInt = -1

public fun tmpfile(): FILE? = null

public fun tmpnam(s: String?): String? = null

public fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt = -1

public fun setbuf(stream: FILE?, buffer: String?) { }
