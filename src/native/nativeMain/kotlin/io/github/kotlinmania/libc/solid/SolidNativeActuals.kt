@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.solid.aarch64.WcharT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var OPTARG: COpaquePointer?
    get() = io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTARG()?.let { COpaquePointer(it.toLong()) }
    set(value) {
        io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTARG(value?.value?.toCPointer<ByteVar>())
    }

public actual var OPTERR: CInt
    get() = io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTERR()
    set(value) {
        io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTERR(value)
    }

public actual var OPTIND: CInt
    get() = io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTIND()
    set(value) {
        io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTIND(value)
    }

public actual var OPTOPT: CInt
    get() = io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTOPT()
    set(value) {
        io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTOPT(value)
    }

public actual var OPTRESET: CInt
    get() = io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_OPTRESET()
    set(value) {
        io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_OPTRESET(value)
    }

public actual var SUBOPTARG: COpaquePointer?
    get() = io.github.kotlinmania.libc.solid.cinterop.libc_solid_get_SUBOPTARG()?.let { COpaquePointer(it.toLong()) }
    set(value) {
        io.github.kotlinmania.libc.solid.cinterop.libc_solid_set_SUBOPTARG(value?.value?.toCPointer<ByteVar>())
    }

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_isblank(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_toupper(c)

public actual fun getStdioFile(fileno: CInt): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getStdioFile(fileno)?.let { FILE(it.toLong()) }

public actual fun clearerr(arg1: FILE?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_clearerr(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun fclose(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fclose(arg1?.handle?.toCPointer<ByteVar>())

public actual fun feof(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_feof(arg1?.handle?.toCPointer<ByteVar>())

public actual fun ferror(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ferror(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fflush(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fflush(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fgetc(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fgetc(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fgets(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fopen(arg1, arg2)?.let { FILE(it.toLong()) }

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fputc(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fputs(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fread(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.handle?.toCPointer<ByteVar>())

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_freopen(arg1, arg2, arg3?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fscanf(arg1?.handle?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fseek(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun ftell(arg1: FILE?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ftell(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fwrite(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.handle?.toCPointer<ByteVar>())

public actual fun getc(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getc(arg1?.handle?.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getchar()

public actual fun perror(arg1: String?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_perror(arg1)
}

public actual fun printf(arg1: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_printf(arg1, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_putc(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun putchar(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_putchar(arg1)

public actual fun puts(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_puts(arg1)

public actual fun remove(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_remove(arg1)

public actual fun rewind(arg1: FILE?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_rewind(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun scanf(arg1: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_scanf(arg1, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_setbuf(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_setvbuf(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun sscanf(arg1: String?, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_sscanf(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tmpfile(): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_tmpfile()?.let { FILE(it.toLong()) }

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ungetc(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vfprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vprintf(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_gets(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_sprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_tmpnam(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun rename(arg1: String?, arg2: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_rename(arg1, arg2)

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_asiprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fiprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fiscanf(arg1?.handle?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun iprintf(arg1: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_iprintf(arg1, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun iscanf(arg1: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_iscanf(arg1, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun siprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_siprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun siscanf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_siscanf(arg1?.value?.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_sniprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vasiprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vfiprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vfiscanf(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_viprintf(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_viscanf(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsiprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsiscanf(arg1, arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsniprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vdiprintf(arg1, arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun diprintf(arg1: CInt, arg2: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_diprintf(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fgetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fgetpos(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fsetpos(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fdopen(arg1, arg2)?.let { FILE(it.toLong()) }

public actual fun fileno(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fileno(arg1?.handle?.toCPointer<ByteVar>())

public actual fun flockfile(arg1: FILE?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_flockfile(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ftrylockfile(arg1?.handle?.toCPointer<ByteVar>())

public actual fun funlockfile(arg1: FILE?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_funlockfile(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getcUnlocked(arg1?.handle?.toCPointer<ByteVar>())

public actual fun getcharUnlocked(): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getcharUnlocked()

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_putcUnlocked(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun putcharUnlocked(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_putcharUnlocked(arg1)

public actual fun snprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_snprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_vsnprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun getw(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getw(arg1?.handle?.toCPointer<ByteVar>())

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_putw(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_tempnam(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun atof(arg1: String?): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_atof(arg1)

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtod(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun drand48(): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_drand48()

public actual fun erand48(arg1: COpaquePointer?): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_erand48(arg1?.value?.toCPointer<ByteVar>())

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtof(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtold(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtodL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtofL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoldL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun exit(arg1: CInt): Nothing {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_exit(arg1)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_abs(arg1)

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_atexit(0L.toCPointer<ByteVar>())

public actual fun atoi(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_atoi(arg1)

public actual fun atol(arg1: String?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_atol(arg1)

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_itoa(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ltoa(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ultoa(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_bsearch(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_calloc(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    DivT()

public actual fun free(arg1: COpaquePointer?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_free(arg1?.value?.toCPointer<ByteVar>())
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getenv(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun labs(arg1: CLong): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_labs(arg1)

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    LdivT()

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_malloc(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_qsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, 0L.toCPointer<ByteVar>())
}

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_rand()

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_realloc(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun srand(arg1: CUint) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_srand(arg1)
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtol(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoul(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mblen(arg1, arg2)

public actual fun mbstowcs(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbstowcs(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_wctomb(arg1?.value?.toCPointer<ByteVar>(), arg2)

public actual fun mbtowc(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbtowc(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun wcstombs(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_wcstombs(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun randR(arg1: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_randR(arg1?.value?.toCPointer<ByteVar>())

public actual fun jrand48(arg1: COpaquePointer?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_jrand48(arg1?.value?.toCPointer<ByteVar>())

public actual fun lcong48(arg1: COpaquePointer?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_lcong48(arg1?.value?.toCPointer<ByteVar>())
}

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_lrand48()

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mrand48()

public actual fun nrand48(arg1: COpaquePointer?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_nrand48(arg1?.value?.toCPointer<ByteVar>())

public actual fun seed48(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_seed48(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun srand48(arg1: CLong) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_srand48(arg1)
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_putenv(arg1?.value?.toCPointer<ByteVar>())

public actual fun a64l(arg1: String?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_a64l(arg1)

public actual fun l64a(arg1: CLong): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_l64a(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun random(): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_random()

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_setstate(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_initstate(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun srandom(arg1: CUint) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_srandom(arg1)
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkostemp(arg1?.value?.toCPointer<ByteVar>(), arg2)

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkostemps(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkdtemp(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkstemp(arg1?.value?.toCPointer<ByteVar>())

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mktemp(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun atoll(arg1: String?): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_atoll(arg1)

public actual fun llabs(arg1: CLonglong): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_llabs(arg1)

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    LldivT()

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoll(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoull(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_alignedAlloc(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_atQuickExit(0L.toCPointer<ByteVar>())

public actual fun quickExit(arg1: CInt) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_quickExit(arg1)
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_setenv(arg1, arg2, arg3)

public actual fun unsetenv(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_unsetenv(arg1)

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_humanizeNumber(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4, arg5, arg6)

public actual fun dehumanizeNumber(arg1: String?, arg2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_dehumanizeNumber(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getenvR(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_heapsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, 0L.toCPointer<ByteVar>())

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mergesort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, 0L.toCPointer<ByteVar>())

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_radixsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>(), arg4)

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_sradixsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>(), arg4)

public actual fun getprogname(): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(arg1: String?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_setprogname(arg1)
}

public actual fun qabs(arg1: QuadT): QuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_qabs(arg1)

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoq(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtouq(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strsuftoll(arg1, arg2, arg3, arg4)

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strsuftollx(arg1, arg2, arg3, arg4, arg5?.value?.toCPointer<ByteVar>(), arg6)

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_l64aR(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    QdivT()

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtolL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoulL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtollL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoullL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtoqL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtouqL(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbCurMaxL(arg1.toLong().toCPointer<ByteVar>())

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mblenL(arg1, arg2, arg3.toLong().toCPointer<ByteVar>())

public actual fun mbstowcsL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbstowcsL(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_wctombL(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3.toLong().toCPointer<ByteVar>())

public actual fun mbtowcL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mbtowcL(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: LocaleT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_wcstombsL(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_memchr(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_memcmp(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_memcpy(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_memmove(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_memset(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcat(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strchr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcmp(arg1, arg2)

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcoll(arg1, arg2)

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcpy(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcspn(arg1, arg2)

public actual fun strerror(arg1: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strerror(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(arg1: String?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strlen(arg1)

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strncat(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strncmp(arg1, arg2, arg3)

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strncpy(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strpbrk(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strrchr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strspn(arg1, arg2)

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strstr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtok(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strtokR(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strerrorR(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strxfrm(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_memccpy(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)?.let { COpaquePointer(it.toLong()) }

public actual fun strdup(arg1: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strdup(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_stpcpy(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_stpncpy(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strnlen(arg1, arg2)

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_memmem(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>(), arg4)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcasestr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strlcat(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strlcpy(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strsep(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_stresep(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strndup(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_memrchr(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_explicitMemset(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_consttimeMemequal(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcollL(arg1, arg2, arg3.toLong().toCPointer<ByteVar>())

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strxfrmL(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strerrorL(arg1, arg2.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_bcmp(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_bcopy(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_bzero(arg1?.value?.toCPointer<ByteVar>(), arg2)
}

public actual fun ffs(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ffs(arg1)

public actual fun popcount(arg1: CUint): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcount(arg1)

public actual fun popcountl(arg1: CUlong): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcountl(arg1)

public actual fun popcountll(arg1: CUlonglong): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcountll(arg1)

public actual fun popcount32(arg1: UInt): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcount32(arg1)

public actual fun popcount64(arg1: ULong): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_popcount64(arg1)

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_rindex(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strcasecmp(arg1, arg2)

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strncasecmp(arg1, arg2, arg3)

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_signal(arg1, arg2)

public actual fun raise(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_raise(arg1)

public actual fun asctime(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_asctime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clock(): ClockT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_clock()

public actual fun ctime(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ctime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_difftime(arg1, arg2)

public actual fun gmtime(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_gmtime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_localtime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun time(arg1: COpaquePointer?): TimeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_time(arg1?.value?.toCPointer<ByteVar>())

public actual fun mktime(arg1: COpaquePointer?): TimeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mktime(arg1?.value?.toCPointer<ByteVar>())

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_strftime(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun utime(arg1: String?, arg2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_utime(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun asctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_asctimeR(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_ctimeR(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gmtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_gmtimeR(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_localtimeR(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun stat(arg1: String?, arg2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_stat(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun lstat(arg1: String?, arg2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_lstat(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun fstat(arg1: CInt, arg2: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fstat(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_chmod(arg1, arg2)

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mkdir(arg1, arg2)

public actual fun open(arg1: String?, arg2: CInt, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_open(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_creat(arg1, arg2)

public actual fun close(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_close(arg1)

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_read(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_write(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun unlink(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_unlink(arg1)

public actual fun tell(arg1: CInt): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_tell(arg1)

public actual fun dup(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_dup(arg1)

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_dup2(arg1, arg2)

public actual fun access(arg1: String?, arg2: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_access(arg1, arg2)

public actual fun rmdir(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_rmdir(arg1)

public actual fun chdir(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_chdir(arg1)

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getwd(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getcwd(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getopt(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getsubopt(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3?.value?.toCPointer<ByteVar>())

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_fcntl(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpid(): PidT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_getpid()

public actual fun sleep(arg1: CUint): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_sleep(arg1)

public actual fun usleep(arg1: UsecondsT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_usleep(arg1)

public actual fun localeconv(): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_setlocale(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun duplocale(arg1: LocaleT): LocaleT =
    (io.github.kotlinmania.libc.solid.cinterop.libc_solid_duplocale(arg1.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L).toULong()

public actual fun freelocale(arg1: LocaleT) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_freelocale(arg1.toLong().toCPointer<ByteVar>())
}

public actual fun localeconvL(arg1: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_localeconvL(arg1.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    (io.github.kotlinmania.libc.solid.cinterop.libc_solid_newlocale(arg1, arg2, arg3.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L).toULong()

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_nlLanginfoL(item, locale.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_lseek(arg1, arg2, arg3)
