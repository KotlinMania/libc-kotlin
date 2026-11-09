@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList

public actual fun fopen(filename: String?, mode: String?): FILE? =
    null

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    null

public actual fun fclose(stream: FILE?): CInt =
    0

public actual fun fflush(stream: FILE?): CInt =
    0

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fgetc(stream: FILE?): CInt =
    0

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    0

public actual fun getchar(): CInt =
    0

public actual fun putchar(c: CInt): CInt =
    0

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    0

public actual fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    null

public actual fun fputs(s: String?, stream: FILE?): CInt =
    0

public actual fun gets(s: COpaquePointer?): COpaquePointer? =
    null

public actual fun puts(s: String?): CInt =
    0

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun vprintf(format: String?, ap: VaList): CInt =
    0

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    0

public actual fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt =
    0

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt =
    0

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    0

public actual fun ftell(stream: FILE?): CLong =
    0L

public actual fun rewind(stream: FILE?) {
}

public actual fun fgetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    0

public actual fun fsetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    0

public actual fun clearerr(stream: FILE?) {
}

public actual fun feof(stream: FILE?): CInt =
    0

public actual fun ferror(stream: FILE?): CInt =
    0

public actual fun perror(s: String?) {
}

public actual fun remove(filename: String?): CInt =
    0

public actual fun rename(old: String?, new: String?): CInt =
    0

public actual fun tmpfile(): FILE? =
    null

public actual fun tmpnam(s: COpaquePointer?): COpaquePointer? =
    null

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    0

public actual fun setbuf(stream: FILE?, buffer: COpaquePointer?) {
}
