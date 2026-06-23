// port-lint: source new/qurt/stdio.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public const val BUFSIZ: CUInt = 1024u
public const val FILENAME_MAX: CUInt = 260u
public const val EOF: CInt = -1

public expect fun fopen(filename: String?, mode: String?): FILE?

public expect fun freopen(filename: String?, mode: String?, stream: FILE?): FILE?

public expect fun fclose(stream: FILE?): CInt

public expect fun fflush(stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong

public expect fun fwrite(ptr: COpaquePointer?, size: ULong, nmemb: ULong, stream: FILE?): ULong

public expect fun fgetc(stream: FILE?): CInt

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

public expect fun fgets(s: String?, size: CInt, stream: FILE?): String?

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun gets(s: String?): String?

public expect fun puts(s: String?): CInt

public expect fun printf(format: String?, vararg args: Any?): CInt

public expect fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt

public expect fun sprintf(s: String?, format: String?, vararg args: Any?): CInt

public expect fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt

public expect fun vprintf(format: String?, ap: VaList): CInt

public expect fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt

public expect fun vsprintf(s: String?, format: String?, ap: VaList): CInt

public expect fun vsnprintf(s: String?, n: ULong, format: String?, ap: VaList): CInt

public expect fun scanf(format: String?, vararg args: Any?): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt

public expect fun sscanf(s: String?, format: String?, vararg args: Any?): CInt

public expect fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: FILE?): CLong

public expect fun rewind(stream: FILE?)

public expect fun fgetpos(stream: FILE?, pos: FposT?): CInt

public expect fun fsetpos(stream: FILE?, pos: FposT?): CInt

public expect fun clearerr(stream: FILE?)

public expect fun feof(stream: FILE?): CInt

public expect fun ferror(stream: FILE?): CInt

public expect fun perror(s: String?)

public expect fun remove(filename: String?): CInt

public expect fun rename(old: String?, new: String?): CInt

public expect fun tmpfile(): FILE?

public expect fun tmpnam(s: String?): String?

public expect fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt

public expect fun setbuf(stream: FILE?, buffer: String?)
