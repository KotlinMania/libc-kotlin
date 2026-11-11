@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_clearerr
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fclose
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_feof
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_ferror
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fflush
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fgetc
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fgetpos
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fgets
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fopen
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fputc
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fputs
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fread
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_freopen
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fscanf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fseek
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fsetpos
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_ftell
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_fwrite
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_getchar
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_gets
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_perror
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_printf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_putchar
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_puts
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_remove
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_rename
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_rewind
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_scanf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_setbuf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_setvbuf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_snprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_sprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_sscanf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_tmpfile
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_tmpnam
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_ungetc
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_vfprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_vprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_vsnprintf
import io.github.kotlinmania.libc.new.qurt.stdio.cinterop.libc_new_qurt_stdio_vsprintf
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fopen(filename: String?, mode: String?): FILE? =
    libc_new_qurt_stdio_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    libc_new_qurt_stdio_freopen(filename, mode, stream?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fclose(stream: FILE?): CInt =
    libc_new_qurt_stdio_fclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun fflush(stream: FILE?): CInt =
    libc_new_qurt_stdio_fflush(stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    libc_new_qurt_stdio_fread(ptr?.value?.toCPointer<ByteVar>(), size, nmemb, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    libc_new_qurt_stdio_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nmemb, stream?.handle?.toCPointer<ByteVar>())

public actual fun fgetc(stream: FILE?): CInt =
    libc_new_qurt_stdio_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    libc_new_qurt_stdio_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    libc_new_qurt_stdio_getchar()

public actual fun putchar(c: CInt): CInt =
    libc_new_qurt_stdio_putchar(c)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    libc_new_qurt_stdio_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    libc_new_qurt_stdio_fgets(s?.value?.toCPointer<ByteVar>(), size, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputs(s: String?, stream: FILE?): CInt =
    libc_new_qurt_stdio_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun gets(s: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_stdio_gets(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun puts(s: String?): CInt =
    libc_new_qurt_stdio_puts(s)

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    libc_new_qurt_stdio_printf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    libc_new_qurt_stdio_fprintf(stream?.handle?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    libc_new_qurt_stdio_sprintf(s?.value?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    libc_new_qurt_stdio_snprintf(s?.value?.toCPointer<ByteVar>(), n, format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vprintf(format: String?, ap: VaList): CInt =
    libc_new_qurt_stdio_vprintf(format, ap?.value?.toCPointer<ByteVar>())

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    libc_new_qurt_stdio_vfprintf(stream?.handle?.toCPointer<ByteVar>(), format, ap?.value?.toCPointer<ByteVar>())

public actual fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt =
    libc_new_qurt_stdio_vsprintf(s?.value?.toCPointer<ByteVar>(), format, ap?.value?.toCPointer<ByteVar>())

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt =
    libc_new_qurt_stdio_vsnprintf(s?.value?.toCPointer<ByteVar>(), n, format, ap?.value?.toCPointer<ByteVar>())

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    libc_new_qurt_stdio_scanf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    libc_new_qurt_stdio_fscanf(stream?.handle?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    libc_new_qurt_stdio_sscanf(s, format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    libc_new_qurt_stdio_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    libc_new_qurt_stdio_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    libc_new_qurt_stdio_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    libc_new_qurt_stdio_fgetpos(stream?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    libc_new_qurt_stdio_fsetpos(stream?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun clearerr(stream: FILE?) {
    libc_new_qurt_stdio_clearerr(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun feof(stream: FILE?): CInt =
    libc_new_qurt_stdio_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    libc_new_qurt_stdio_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun perror(s: String?) {
    libc_new_qurt_stdio_perror(s)
}

public actual fun remove(filename: String?): CInt =
    libc_new_qurt_stdio_remove(filename)

public actual fun rename(old: String?, new: String?): CInt =
    libc_new_qurt_stdio_rename(old, new)

public actual fun tmpfile(): FILE? =
    libc_new_qurt_stdio_tmpfile()?.let { FILE(it.toLong()) }

public actual fun tmpnam(s: COpaquePointer?): COpaquePointer? =
    libc_new_qurt_stdio_tmpnam(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    libc_new_qurt_stdio_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buffer: COpaquePointer?) {
    libc_new_qurt_stdio_setbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())
}
