@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_isblank(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_toupper(c)

public actual fun getStdioFile(fileno: CInt): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_get_stdio_file(fileno)?.let { FILE(it.toLong()) }

public actual fun clearerr(arg1: FILE?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_clearerr(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun fclose(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fclose(arg1?.handle?.toCPointer<ByteVar>())

public actual fun feof(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_feof(arg1?.handle?.toCPointer<ByteVar>())

public actual fun ferror(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ferror(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fflush(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fflush(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fgetc(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fgetc(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fgets(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fopen(arg1, arg2)?.let { FILE(it.toLong()) }

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fputc(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fputs(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fread(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.handle?.toCPointer<ByteVar>())

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_freopen(arg1, arg2, arg3?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fseek(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun ftell(arg1: FILE?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ftell(arg1?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fwrite(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.handle?.toCPointer<ByteVar>())

public actual fun getc(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getc(arg1?.handle?.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getchar()

public actual fun perror(arg1: String?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_perror(arg1)
}

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_putc(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun putchar(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_putchar(arg1)

public actual fun puts(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_puts(arg1)

public actual fun remove(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_remove(arg1)

public actual fun rewind(arg1: FILE?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_rewind(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_setbuf(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_setvbuf(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun tmpfile(): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_tmpfile()?.let { FILE(it.toLong()) }

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ungetc(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vfprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vprintf(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_gets(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_tmpnam(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vsprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun rename(arg1: String?, arg2: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_rename(arg1, arg2)

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vasiprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vfiprintf(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vfiscanf(arg1?.handle?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_viprintf(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_viscanf(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vsiprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vsiscanf(arg1, arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vsniprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vdiprintf(arg1, arg2, arg3?.value?.toCPointer<ByteVar>())

public actual fun fgetpos(arg1: FILE?, arg2: FposT?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fgetpos(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(arg1: FILE?, arg2: FposT?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fsetpos(arg1?.handle?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fdopen(arg1, arg2)?.let { FILE(it.toLong()) }

public actual fun fileno(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fileno(arg1?.handle?.toCPointer<ByteVar>())

public actual fun flockfile(arg1: FILE?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_flockfile(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ftrylockfile(arg1?.handle?.toCPointer<ByteVar>())

public actual fun funlockfile(arg1: FILE?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_funlockfile(arg1?.handle?.toCPointer<ByteVar>())
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getc_unlocked(arg1?.handle?.toCPointer<ByteVar>())

public actual fun getcharUnlocked(): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getchar_unlocked()

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_putc_unlocked(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun putcharUnlocked(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_putchar_unlocked(arg1)

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_vsnprintf(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun getw(arg1: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getw(arg1?.handle?.toCPointer<ByteVar>())

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_putw(arg1, arg2?.handle?.toCPointer<ByteVar>())

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_tempnam(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun atof(arg1: String?): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_atof(arg1)

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtod(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun drand48(): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_drand48()

public actual fun erand48(arg1: CUshort?): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_erand48(arg1?.value?.toCPointer<ByteVar>())

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtof(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtold(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtod_l(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtof_l(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtold_l(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun exit(arg1: CInt): Nothing {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_exit(arg1)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_abs(arg1)

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_atexit(arg1?.value?.toCPointer<ByteVar>())

public actual fun atoi(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_atoi(arg1)

public actual fun atol(arg1: String?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_atol(arg1)

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_itoa(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ltoa(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ultoa(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_bsearch(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4, arg5?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_calloc(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_div(arg1, arg2)

public actual fun free(arg1: COpaquePointer?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_free(arg1?.value?.toCPointer<ByteVar>())
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getenv(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun labs(arg1: CLong): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_labs(arg1)

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ldiv(arg1, arg2)

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_malloc(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_qsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())
}

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_rand()

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_realloc(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun srand(arg1: CUint) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_srand(arg1)
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtol(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtoul(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mblen(arg1, arg2)

public actual fun mbstowcs(arg1: WcharT?, arg2: String?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mbstowcs(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_wctomb(arg1?.value?.toCPointer<ByteVar>(), arg2)

public actual fun mbtowc(arg1: WcharT?, arg2: String?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mbtowc(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun wcstombs(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_wcstombs(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun randR(arg1: CUint?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_rand_r(arg1?.value?.toCPointer<ByteVar>())

public actual fun jrand48(arg1: CUshort?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_jrand48(arg1?.value?.toCPointer<ByteVar>())

public actual fun lcong48(arg1: CUshort?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_lcong48(arg1?.value?.toCPointer<ByteVar>())
}

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_lrand48()

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mrand48()

public actual fun nrand48(arg1: CUshort?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_nrand48(arg1?.value?.toCPointer<ByteVar>())

public actual fun seed48(arg1: CUshort?): CUshort? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_seed48(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun srand48(arg1: CLong) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_srand48(arg1)
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_putenv(arg1?.value?.toCPointer<ByteVar>())

public actual fun a64l(arg1: String?): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_a64l(arg1)

public actual fun l64a(arg1: CLong): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_l64a(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun random(): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_random()

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_setstate(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_initstate(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun srandom(arg1: CUint) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_srandom(arg1)
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mkostemp(arg1?.value?.toCPointer<ByteVar>(), arg2)

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mkostemps(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mkdtemp(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mkstemp(arg1?.value?.toCPointer<ByteVar>())

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mktemp(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun atoll(arg1: String?): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_atoll(arg1)

public actual fun llabs(arg1: CLonglong): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_llabs(arg1)

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_lldiv(arg1, arg2)

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtoll(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtoull(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_aligned_alloc(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_at_quick_exit(arg1?.value?.toCPointer<ByteVar>())

public actual fun quickExit(arg1: CInt) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_quick_exit(arg1)
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_setenv(arg1, arg2, arg3)

public actual fun unsetenv(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_unsetenv(arg1)

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_humanize_number(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4, arg5, arg6)

public actual fun dehumanizeNumber(arg1: String?, arg2: Long?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_dehumanize_number(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getenv_r(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_heapsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mergesort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_radixsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>(), arg4)

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_sradixsort(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>(), arg4)

public actual fun getprogname(): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getprogname()?.let { COpaquePointer(it.toLong()) }

public actual fun setprogname(arg1: String?) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_setprogname(arg1)
}

public actual fun qabs(arg1: QuadT): QuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_qabs(arg1)

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtoq(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtouq(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strsuftoll(arg1, arg2, arg3, arg4)

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strsuftollx(arg1, arg2, arg3, arg4, arg5?.value?.toCPointer<ByteVar>(), arg6)

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_l64a_r(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_qdiv(arg1, arg2)

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtol_l(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtoul_l(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtoll_l(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtoull_l(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtoq_l(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtouq_l(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mb_cur_max_l(arg1)

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mblen_l(arg1, arg2, arg3)

public actual fun mbstowcsL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mbstowcs_l(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4)

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_wctomb_l(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun mbtowcL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mbtowc_l(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4)

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT, arg4: LocaleT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_wcstombs_l(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_memchr(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_memcmp(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_memcpy(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_memmove(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_memset(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strcat(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strchr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strcmp(arg1, arg2)

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strcoll(arg1, arg2)

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strcpy(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strcspn(arg1, arg2)

public actual fun strerror(arg1: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strerror(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(arg1: String?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strlen(arg1)

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strncat(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strncmp(arg1, arg2, arg3)

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strncpy(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strpbrk(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strrchr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strspn(arg1, arg2)

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strstr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtok(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strtok_r(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strerror_r(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strxfrm(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_memccpy(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3, arg4)?.let { COpaquePointer(it.toLong()) }

public actual fun strdup(arg1: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strdup(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_stpcpy(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_stpncpy(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strnlen(arg1, arg2)

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_memmem(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3?.value?.toCPointer<ByteVar>(), arg4)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strcasestr(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strlcat(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strlcpy(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strsep(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_stresep(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strndup(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_memrchr(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_explicit_memset(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3)?.let { COpaquePointer(it.toLong()) }

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_consttime_memequal(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strcoll_l(arg1, arg2, arg3)

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strxfrm_l(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4)

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strerror_l(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_bcmp(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_bcopy(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3)
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_bzero(arg1?.value?.toCPointer<ByteVar>(), arg2)
}

public actual fun ffs(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ffs(arg1)

public actual fun popcount(arg1: CUint): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_popcount(arg1)

public actual fun popcountl(arg1: CUlong): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_popcountl(arg1)

public actual fun popcountll(arg1: CUlonglong): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_popcountll(arg1)

public actual fun popcount32(arg1: UInt): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_popcount32(arg1)

public actual fun popcount64(arg1: ULong): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_popcount64(arg1)

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_rindex(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strcasecmp(arg1, arg2)

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strncasecmp(arg1, arg2, arg3)

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_signal(arg1, arg2)

public actual fun raise(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_raise(arg1)

public actual fun asctime(arg1: Tm?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_asctime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clock(): ClockT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_clock()

public actual fun ctime(arg1: Long?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ctime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_difftime(arg1, arg2)

public actual fun gmtime(arg1: Long?): Tm? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_gmtime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(arg1: Long?): Tm? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_localtime(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun time(arg1: Long?): TimeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_time(arg1?.value?.toCPointer<ByteVar>())

public actual fun mktime(arg1: Tm?): TimeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mktime(arg1?.value?.toCPointer<ByteVar>())

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: Tm?): SizeT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_strftime(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun utime(arg1: String?, arg2: Long?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_utime(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun asctimeR(arg1: Tm?, arg2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_asctime_r(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(arg1: Long?, arg2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_ctime_r(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gmtimeR(arg1: Long?, arg2: Tm?): Tm? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_gmtime_r(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(arg1: Long?, arg2: Tm?): Tm? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_localtime_r(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun stat(arg1: String?, arg2: Stat?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_stat(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun lstat(arg1: String?, arg2: Stat?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_lstat(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun fstat(arg1: CInt, arg2: Stat?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_fstat(arg1, arg2?.value?.toCPointer<ByteVar>())

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_chmod(arg1, arg2)

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_mkdir(arg1, arg2)

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_creat(arg1, arg2)

public actual fun close(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_close(arg1)

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_read(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_write(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun unlink(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_unlink(arg1)

public actual fun tell(arg1: CInt): CLong =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_tell(arg1)

public actual fun dup(arg1: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_dup(arg1)

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_dup2(arg1, arg2)

public actual fun access(arg1: String?, arg2: CInt): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_access(arg1, arg2)

public actual fun rmdir(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_rmdir(arg1)

public actual fun chdir(arg1: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_chdir(arg1)

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getwd(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getcwd(arg1?.value?.toCPointer<ByteVar>(), arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getopt(arg1, arg2?.value?.toCPointer<ByteVar>(), arg3)

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getsubopt(arg1?.value?.toCPointer<ByteVar>(), arg2?.value?.toCPointer<ByteVar>(), arg3?.value?.toCPointer<ByteVar>())

public actual fun getpid(): PidT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_getpid()

public actual fun sleep(arg1: CUint): CUint =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_sleep(arg1)

public actual fun usleep(arg1: UsecondsT): CInt =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_usleep(arg1)

public actual fun localeconv(): Lconv? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_setlocale(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun duplocale(arg1: LocaleT): LocaleT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_duplocale(arg1)

public actual fun freelocale(arg1: LocaleT) {
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_freelocale(arg1)
}

public actual fun localeconvL(arg1: LocaleT): Lconv? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_localeconv_l(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_newlocale(arg1, arg2, arg3)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_nl_langinfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_nl_langinfo_l(item, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    io.github.kotlinmania.libc.solid.cinterop.libc_solid_mod_lseek(arg1, arg2, arg3)
