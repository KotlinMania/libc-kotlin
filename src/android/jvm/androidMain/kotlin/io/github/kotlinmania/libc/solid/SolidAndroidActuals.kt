@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object SolidJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_solid_isalnum(c: Int): Int

    @JvmStatic
    external fun libc_solid_isalpha(c: Int): Int

    @JvmStatic
    external fun libc_solid_iscntrl(c: Int): Int

    @JvmStatic
    external fun libc_solid_isdigit(c: Int): Int

    @JvmStatic
    external fun libc_solid_isgraph(c: Int): Int

    @JvmStatic
    external fun libc_solid_islower(c: Int): Int

    @JvmStatic
    external fun libc_solid_isprint(c: Int): Int

    @JvmStatic
    external fun libc_solid_ispunct(c: Int): Int

    @JvmStatic
    external fun libc_solid_isspace(c: Int): Int

    @JvmStatic
    external fun libc_solid_isupper(c: Int): Int

    @JvmStatic
    external fun libc_solid_isxdigit(c: Int): Int

    @JvmStatic
    external fun libc_solid_isblank(c: Int): Int

    @JvmStatic
    external fun libc_solid_tolower(c: Int): Int

    @JvmStatic
    external fun libc_solid_toupper(c: Int): Int

    @JvmStatic
    external fun libc_solid_getStdioFile(fileno: Int): Long

    @JvmStatic
    external fun libc_solid_clearerr(arg1: Long)

    @JvmStatic
    external fun libc_solid_fclose(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_feof(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_ferror(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_fflush(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_fgetc(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_fgets(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_fopen(arg1: String?, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_fputc(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_fputs(arg1: String?, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_fread(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_freopen(arg1: String?, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_fseek(arg1: Long, arg2: Long, arg3: Int): Int

    @JvmStatic
    external fun libc_solid_ftell(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_fwrite(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_getc(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_getchar(): Int

    @JvmStatic
    external fun libc_solid_perror(arg1: String?)

    @JvmStatic
    external fun libc_solid_putc(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_putchar(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_puts(arg1: String?): Int

    @JvmStatic
    external fun libc_solid_remove(arg1: String?): Int

    @JvmStatic
    external fun libc_solid_rewind(arg1: Long)

    @JvmStatic
    external fun libc_solid_setbuf(arg1: Long, arg2: Long)

    @JvmStatic
    external fun libc_solid_setvbuf(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Int

    @JvmStatic
    external fun libc_solid_tmpfile(): Long

    @JvmStatic
    external fun libc_solid_ungetc(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_vfprintf(arg1: Long, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_vprintf(arg1: String?, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_gets(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_tmpnam(arg1: String?): Long

    @JvmStatic
    external fun libc_solid_vsprintf(arg1: Long, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_rename(arg1: String?, arg2: String?): Int

    @JvmStatic
    external fun libc_solid_vasiprintf(arg1: Long, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_vfiprintf(arg1: Long, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_vfiscanf(arg1: Long, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_viprintf(arg1: String?, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_viscanf(arg1: String?, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_vsiprintf(arg1: Long, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_vsiscanf(arg1: String?, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_vsniprintf(arg1: Long, arg2: Long, arg3: String?, arg4: Long): Int

    @JvmStatic
    external fun libc_solid_vdiprintf(arg1: Int, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_fgetpos(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_fsetpos(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_fdopen(arg1: Int, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_fileno(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_flockfile(arg1: Long)

    @JvmStatic
    external fun libc_solid_ftrylockfile(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_funlockfile(arg1: Long)

    @JvmStatic
    external fun libc_solid_getcUnlocked(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_getcharUnlocked(): Int

    @JvmStatic
    external fun libc_solid_putcUnlocked(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_putcharUnlocked(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_vsnprintf(arg1: Long, arg2: Long, arg3: String?, arg4: Long): Int

    @JvmStatic
    external fun libc_solid_getw(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_putw(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_tempnam(arg1: String?, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_fseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_solid_ftello(stream: Long): Long

    @JvmStatic
    external fun libc_solid_atof(arg1: String?): Double

    @JvmStatic
    external fun libc_solid_strtod(arg1: String?, arg2: Long): Double

    @JvmStatic
    external fun libc_solid_drand48(): Double

    @JvmStatic
    external fun libc_solid_erand48(arg1: Long): Double

    @JvmStatic
    external fun libc_solid_strtof(arg1: String?, arg2: Long): Float

    @JvmStatic
    external fun libc_solid_strtold(arg1: String?, arg2: Long): Double

    @JvmStatic
    external fun libc_solid_strtodL(arg1: String?, arg2: Long, arg3: Long): Double

    @JvmStatic
    external fun libc_solid_strtofL(arg1: String?, arg2: Long, arg3: Long): Float

    @JvmStatic
    external fun libc_solid_strtoldL(arg1: String?, arg2: Long, arg3: Long): Double

    @JvmStatic
    external fun libc_solid_exit(arg1: Int)

    @JvmStatic
    external fun libc_solid_abort()

    @JvmStatic
    external fun libc_solid_abs(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_atexit(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_atoi(arg1: String?): Int

    @JvmStatic
    external fun libc_solid_atol(arg1: String?): Long

    @JvmStatic
    external fun libc_solid_itoa(arg1: Int, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_ltoa(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_ultoa(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_bsearch(arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Long): Long

    @JvmStatic
    external fun libc_solid_calloc(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_free(arg1: Long)

    @JvmStatic
    external fun libc_solid_getenv(arg1: String?): Long

    @JvmStatic
    external fun libc_solid_labs(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_malloc(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_qsort(arg1: Long, arg2: Long, arg3: Long, arg4: Long)

    @JvmStatic
    external fun libc_solid_rand(): Int

    @JvmStatic
    external fun libc_solid_realloc(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_srand(arg1: Int)

    @JvmStatic
    external fun libc_solid_strtol(arg1: String?, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_strtoul(arg1: String?, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_mblen(arg1: String?, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_mbstowcs(arg1: Long, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_wctomb(arg1: Long, arg2: Int): Int

    @JvmStatic
    external fun libc_solid_mbtowc(arg1: Long, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_wcstombs(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_randR(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_jrand48(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_lcong48(arg1: Long)

    @JvmStatic
    external fun libc_solid_lrand48(): Long

    @JvmStatic
    external fun libc_solid_mrand48(): Long

    @JvmStatic
    external fun libc_solid_nrand48(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_seed48(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_srand48(arg1: Long)

    @JvmStatic
    external fun libc_solid_putenv(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_a64l(arg1: String?): Long

    @JvmStatic
    external fun libc_solid_l64a(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_random(): Long

    @JvmStatic
    external fun libc_solid_setstate(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_initstate(arg1: Int, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_srandom(arg1: Int)

    @JvmStatic
    external fun libc_solid_mkostemp(arg1: Long, arg2: Int): Int

    @JvmStatic
    external fun libc_solid_mkostemps(arg1: Long, arg2: Int, arg3: Int): Int

    @JvmStatic
    external fun libc_solid_mkdtemp(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_mkstemp(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_mktemp(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_atoll(arg1: String?): Long

    @JvmStatic
    external fun libc_solid_llabs(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_strtoll(arg1: String?, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_strtoull(arg1: String?, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_alignedAlloc(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_atQuickExit(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_quickExit(arg1: Int)

    @JvmStatic
    external fun libc_solid_setenv(arg1: String?, arg2: String?, arg3: Int): Int

    @JvmStatic
    external fun libc_solid_unsetenv(arg1: String?): Int

    @JvmStatic
    external fun libc_solid_humanizeNumber(arg1: Long, arg2: Long, arg3: Long, arg4: String?, arg5: Int, arg6: Int): Int

    @JvmStatic
    external fun libc_solid_dehumanizeNumber(arg1: String?, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_getenvR(arg1: String?, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_heapsort(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Int

    @JvmStatic
    external fun libc_solid_mergesort(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Int

    @JvmStatic
    external fun libc_solid_radixsort(arg1: Long, arg2: Int, arg3: Long, arg4: Int): Int

    @JvmStatic
    external fun libc_solid_sradixsort(arg1: Long, arg2: Int, arg3: Long, arg4: Int): Int

    @JvmStatic
    external fun libc_solid_getprogname(): Long

    @JvmStatic
    external fun libc_solid_setprogname(arg1: String?)

    @JvmStatic
    external fun libc_solid_qabs(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_strtoq(arg1: String?, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_strtouq(arg1: String?, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_strsuftoll(arg1: String?, arg2: String?, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_strsuftollx(arg1: String?, arg2: String?, arg3: Long, arg4: Long, arg5: Long, arg6: Long): Long

    @JvmStatic
    external fun libc_solid_l64aR(arg1: Long, arg2: Long, arg3: Int): Int

    @JvmStatic
    external fun libc_solid_strtolL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_strtoulL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_strtollL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_strtoullL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_strtoqL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_strtouqL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_mbCurMaxL(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_mblenL(arg1: String?, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_mbstowcsL(arg1: Long, arg2: String?, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_wctombL(arg1: Long, arg2: Int, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_mbtowcL(arg1: Long, arg2: String?, arg3: Long, arg4: Long): Int

    @JvmStatic
    external fun libc_solid_wcstombsL(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_memchr(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_memcmp(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_memcpy(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_memmove(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_memset(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_strcat(arg1: Long, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_strchr(arg1: String?, arg2: Int): Long

    @JvmStatic
    external fun libc_solid_strcmp(arg1: String?, arg2: String?): Int

    @JvmStatic
    external fun libc_solid_strcoll(arg1: String?, arg2: String?): Int

    @JvmStatic
    external fun libc_solid_strcpy(arg1: Long, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_strcspn(arg1: String?, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_strerror(arg1: Int): Long

    @JvmStatic
    external fun libc_solid_strlen(arg1: String?): Long

    @JvmStatic
    external fun libc_solid_strncat(arg1: Long, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_strncmp(arg1: String?, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_strncpy(arg1: Long, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_strpbrk(arg1: String?, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_strrchr(arg1: String?, arg2: Int): Long

    @JvmStatic
    external fun libc_solid_strspn(arg1: String?, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_strstr(arg1: String?, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_strtok(arg1: Long, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_strtokR(arg1: Long, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_strerrorR(arg1: Int, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_strxfrm(arg1: Long, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_memccpy(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_strdup(arg1: String?): Long

    @JvmStatic
    external fun libc_solid_stpcpy(arg1: Long, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_stpncpy(arg1: Long, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_strnlen(arg1: String?, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_memmem(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_strcasestr(arg1: String?, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_strlcat(arg1: Long, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_strlcpy(arg1: Long, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_strsep(arg1: Long, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_stresep(arg1: Long, arg2: String?, arg3: Int): Long

    @JvmStatic
    external fun libc_solid_strndup(arg1: String?, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_memrchr(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_explicitMemset(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_consttimeMemequal(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_strcollL(arg1: String?, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_strxfrmL(arg1: Long, arg2: String?, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_strerrorL(arg1: Int, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_bcmp(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_bcopy(arg1: Long, arg2: Long, arg3: Long)

    @JvmStatic
    external fun libc_solid_bzero(arg1: Long, arg2: Long)

    @JvmStatic
    external fun libc_solid_ffs(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_popcount(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_popcountl(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_popcountll(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_popcount32(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_popcount64(arg1: Long): Int

    @JvmStatic
    external fun libc_solid_rindex(arg1: String?, arg2: Int): Long

    @JvmStatic
    external fun libc_solid_strcasecmp(arg1: String?, arg2: String?): Int

    @JvmStatic
    external fun libc_solid_strncasecmp(arg1: String?, arg2: String?, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_signal(arg1: Int, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_raise(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_asctime(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_clock(): Int

    @JvmStatic
    external fun libc_solid_ctime(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_difftime(arg1: Long, arg2: Long): Double

    @JvmStatic
    external fun libc_solid_gmtime(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_localtime(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_time(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_mktime(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_strftime(arg1: Long, arg2: Long, arg3: String?, arg4: Long): Long

    @JvmStatic
    external fun libc_solid_utime(arg1: String?, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_asctimeR(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_ctimeR(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_gmtimeR(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_localtimeR(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_stat(arg1: String?, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_lstat(arg1: String?, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_fstat(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libc_solid_chmod(arg1: String?, arg2: Int): Int

    @JvmStatic
    external fun libc_solid_mkdir(arg1: String?, arg2: Int): Int

    @JvmStatic
    external fun libc_solid_creat(arg1: String?, arg2: Int): Int

    @JvmStatic
    external fun libc_solid_close(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_read(arg1: Int, arg2: Long, arg3: Int): Int

    @JvmStatic
    external fun libc_solid_write(arg1: Int, arg2: Long, arg3: Int): Int

    @JvmStatic
    external fun libc_solid_unlink(arg1: String?): Int

    @JvmStatic
    external fun libc_solid_tell(arg1: Int): Long

    @JvmStatic
    external fun libc_solid_dup(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_dup2(arg1: Int, arg2: Int): Int

    @JvmStatic
    external fun libc_solid_access(arg1: String?, arg2: Int): Int

    @JvmStatic
    external fun libc_solid_rmdir(arg1: String?): Int

    @JvmStatic
    external fun libc_solid_chdir(arg1: String?): Int

    @JvmStatic
    external fun libc_solid_getwd(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_getcwd(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libc_solid_getopt(arg1: Int, arg2: Long, arg3: String?): Int

    @JvmStatic
    external fun libc_solid_getsubopt(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libc_solid_getpid(): Int

    @JvmStatic
    external fun libc_solid_sleep(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_usleep(arg1: Int): Int

    @JvmStatic
    external fun libc_solid_localeconv(): Long

    @JvmStatic
    external fun libc_solid_setlocale(arg1: Int, arg2: String?): Long

    @JvmStatic
    external fun libc_solid_duplocale(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_freelocale(arg1: Long)

    @JvmStatic
    external fun libc_solid_localeconvL(arg1: Long): Long

    @JvmStatic
    external fun libc_solid_newlocale(arg1: Int, arg2: String?, arg3: Long): Long

    @JvmStatic
    external fun libc_solid_nlLanginfo(item: Long): Long

    @JvmStatic
    external fun libc_solid_nlLanginfoL(item: Long, locale: Long): Long

    @JvmStatic
    external fun libc_solid_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_solid_lseek(arg1: Int, arg2: Long, arg3: Int): Long
}

private var _ffi_static_OPTARG: COpaquePointer? = null
public actual var OPTARG: COpaquePointer?
    get() = _ffi_static_OPTARG
    set(value) {
        _ffi_static_OPTARG = value
    }

private var _ffi_static_OPTERR: CInt = 0
public actual var OPTERR: CInt
    get() = _ffi_static_OPTERR
    set(value) {
        _ffi_static_OPTERR = value
    }

private var _ffi_static_OPTIND: CInt = 0
public actual var OPTIND: CInt
    get() = _ffi_static_OPTIND
    set(value) {
        _ffi_static_OPTIND = value
    }

private var _ffi_static_OPTOPT: CInt = 0
public actual var OPTOPT: CInt
    get() = _ffi_static_OPTOPT
    set(value) {
        _ffi_static_OPTOPT = value
    }

private var _ffi_static_OPTRESET: CInt = 0
public actual var OPTRESET: CInt
    get() = _ffi_static_OPTRESET
    set(value) {
        _ffi_static_OPTRESET = value
    }

private var _ffi_static_SUBOPTARG: COpaquePointer? = null
public actual var SUBOPTARG: COpaquePointer?
    get() = _ffi_static_SUBOPTARG
    set(value) {
        _ffi_static_SUBOPTARG = value
    }

public actual fun isalnum(c: CInt): CInt =
    SolidJniBridge.libc_solid_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    SolidJniBridge.libc_solid_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    SolidJniBridge.libc_solid_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    SolidJniBridge.libc_solid_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    SolidJniBridge.libc_solid_isgraph(c)

public actual fun islower(c: CInt): CInt =
    SolidJniBridge.libc_solid_islower(c)

public actual fun isprint(c: CInt): CInt =
    SolidJniBridge.libc_solid_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    SolidJniBridge.libc_solid_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    SolidJniBridge.libc_solid_isspace(c)

public actual fun isupper(c: CInt): CInt =
    SolidJniBridge.libc_solid_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    SolidJniBridge.libc_solid_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    SolidJniBridge.libc_solid_isblank(c)

public actual fun tolower(c: CInt): CInt =
    SolidJniBridge.libc_solid_tolower(c)

public actual fun toupper(c: CInt): CInt =
    SolidJniBridge.libc_solid_toupper(c)

public actual fun getStdioFile(fileno: CInt): FILE? =
    SolidJniBridge.libc_solid_getStdioFile(fileno).let { if (it == 0L) null else FILE(it) }

public actual fun clearerr(arg1: FILE?) {
    SolidJniBridge.libc_solid_clearerr((arg1?.handle ?: 0L))
}

public actual fun fclose(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_fclose((arg1?.handle ?: 0L))

public actual fun feof(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_feof((arg1?.handle ?: 0L))

public actual fun ferror(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_ferror((arg1?.handle ?: 0L))

public actual fun fflush(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_fflush((arg1?.handle ?: 0L))

public actual fun fgetc(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_fgetc((arg1?.handle ?: 0L))

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    SolidJniBridge.libc_solid_fgets((arg1?.value ?: 0L), arg2, (arg3?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    SolidJniBridge.libc_solid_fopen(arg1, arg2).let { if (it == 0L) null else FILE(it) }

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    SolidJniBridge.libc_solid_fputc(arg1, (arg2?.handle ?: 0L))

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    SolidJniBridge.libc_solid_fputs(arg1, (arg2?.handle ?: 0L))

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    SolidJniBridge.libc_solid_fread((arg1?.value ?: 0L), arg2.toLong(), arg3.toLong(), (arg4?.handle ?: 0L)).toULong()

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    SolidJniBridge.libc_solid_freopen(arg1, arg2, (arg3?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    SolidJniBridge.libc_solid_fseek((arg1?.handle ?: 0L), arg2, arg3)

public actual fun ftell(arg1: FILE?): CLong =
    SolidJniBridge.libc_solid_ftell((arg1?.handle ?: 0L))

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    SolidJniBridge.libc_solid_fwrite((arg1?.value ?: 0L), arg2.toLong(), arg3.toLong(), (arg4?.handle ?: 0L)).toULong()

public actual fun getc(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_getc((arg1?.handle ?: 0L))

public actual fun getchar(): CInt =
    SolidJniBridge.libc_solid_getchar()

public actual fun perror(arg1: String?) {
    SolidJniBridge.libc_solid_perror(arg1)
}

public actual fun printf(arg1: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    SolidJniBridge.libc_solid_putc(arg1, (arg2?.handle ?: 0L))

public actual fun putchar(arg1: CInt): CInt =
    SolidJniBridge.libc_solid_putchar(arg1)

public actual fun puts(arg1: String?): CInt =
    SolidJniBridge.libc_solid_puts(arg1)

public actual fun remove(arg1: String?): CInt =
    SolidJniBridge.libc_solid_remove(arg1)

public actual fun rewind(arg1: FILE?) {
    SolidJniBridge.libc_solid_rewind((arg1?.handle ?: 0L))
}

public actual fun scanf(arg1: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    SolidJniBridge.libc_solid_setbuf((arg1?.handle ?: 0L), (arg2?.value ?: 0L))
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    SolidJniBridge.libc_solid_setvbuf((arg1?.handle ?: 0L), (arg2?.value ?: 0L), arg3, arg4.toLong())

public actual fun sscanf(arg1: String?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun tmpfile(): FILE? =
    SolidJniBridge.libc_solid_tmpfile().let { if (it == 0L) null else FILE(it) }

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    SolidJniBridge.libc_solid_ungetc(arg1, (arg2?.handle ?: 0L))

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    SolidJniBridge.libc_solid_vfprintf((arg1?.handle ?: 0L), arg2, (arg3?.value ?: 0L))

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    SolidJniBridge.libc_solid_vprintf(arg1, (arg2?.value ?: 0L))

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_gets((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_tmpnam(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    SolidJniBridge.libc_solid_vsprintf((arg1?.value ?: 0L), arg2, (arg3?.value ?: 0L))

public actual fun rename(arg1: String?, arg2: String?): CInt =
    SolidJniBridge.libc_solid_rename(arg1, arg2)

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun iprintf(arg1: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun iscanf(arg1: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun siprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun siscanf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    SolidJniBridge.libc_solid_vasiprintf((arg1?.value ?: 0L), arg2, (arg3?.value ?: 0L))

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    SolidJniBridge.libc_solid_vfiprintf((arg1?.handle ?: 0L), arg2, (arg3?.value ?: 0L))

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    SolidJniBridge.libc_solid_vfiscanf((arg1?.handle ?: 0L), arg2, (arg3?.value ?: 0L))

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    SolidJniBridge.libc_solid_viprintf(arg1, (arg2?.value ?: 0L))

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    SolidJniBridge.libc_solid_viscanf(arg1, (arg2?.value ?: 0L))

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    SolidJniBridge.libc_solid_vsiprintf((arg1?.value ?: 0L), arg2, (arg3?.value ?: 0L))

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    SolidJniBridge.libc_solid_vsiscanf(arg1, arg2, (arg3?.value ?: 0L))

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    SolidJniBridge.libc_solid_vsniprintf((arg1?.value ?: 0L), arg2.toLong(), arg3, (arg4?.value ?: 0L))

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    SolidJniBridge.libc_solid_vdiprintf(arg1, arg2, (arg3?.value ?: 0L))

public actual fun diprintf(arg1: CInt, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fgetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_fgetpos((arg1?.handle ?: 0L), (arg2?.value ?: 0L))

public actual fun fsetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_fsetpos((arg1?.handle ?: 0L), (arg2?.value ?: 0L))

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    SolidJniBridge.libc_solid_fdopen(arg1, arg2).let { if (it == 0L) null else FILE(it) }

public actual fun fileno(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_fileno((arg1?.handle ?: 0L))

public actual fun flockfile(arg1: FILE?) {
    SolidJniBridge.libc_solid_flockfile((arg1?.handle ?: 0L))
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_ftrylockfile((arg1?.handle ?: 0L))

public actual fun funlockfile(arg1: FILE?) {
    SolidJniBridge.libc_solid_funlockfile((arg1?.handle ?: 0L))
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_getcUnlocked((arg1?.handle ?: 0L))

public actual fun getcharUnlocked(): CInt =
    SolidJniBridge.libc_solid_getcharUnlocked()

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    SolidJniBridge.libc_solid_putcUnlocked(arg1, (arg2?.handle ?: 0L))

public actual fun putcharUnlocked(arg1: CInt): CInt =
    SolidJniBridge.libc_solid_putcharUnlocked(arg1)

public actual fun snprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    SolidJniBridge.libc_solid_vsnprintf((arg1?.value ?: 0L), arg2.toLong(), arg3, (arg4?.value ?: 0L))

public actual fun getw(arg1: FILE?): CInt =
    SolidJniBridge.libc_solid_getw((arg1?.handle ?: 0L))

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    SolidJniBridge.libc_solid_putw(arg1, (arg2?.handle ?: 0L))

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_tempnam(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    SolidJniBridge.libc_solid_fseeko((stream?.handle ?: 0L), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    SolidJniBridge.libc_solid_ftello((stream?.handle ?: 0L))

public actual fun atof(arg1: String?): Double =
    SolidJniBridge.libc_solid_atof(arg1)

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    SolidJniBridge.libc_solid_strtod(arg1, (arg2?.value ?: 0L))

public actual fun drand48(): Double =
    SolidJniBridge.libc_solid_drand48()

public actual fun erand48(arg1: COpaquePointer?): Double =
    SolidJniBridge.libc_solid_erand48((arg1?.value ?: 0L))

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    SolidJniBridge.libc_solid_strtof(arg1, (arg2?.value ?: 0L))

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    SolidJniBridge.libc_solid_strtold(arg1, (arg2?.value ?: 0L))

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    SolidJniBridge.libc_solid_strtodL(arg1, (arg2?.value ?: 0L), arg3.toLong())

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    SolidJniBridge.libc_solid_strtofL(arg1, (arg2?.value ?: 0L), arg3.toLong())

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    SolidJniBridge.libc_solid_strtoldL(arg1, (arg2?.value ?: 0L), arg3.toLong())

public actual fun exit(arg1: CInt): Nothing {
    SolidJniBridge.libc_solid_exit(arg1)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    SolidJniBridge.libc_solid_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    SolidJniBridge.libc_solid_abs(arg1)

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    SolidJniBridge.libc_solid_atexit(0L)

public actual fun atoi(arg1: String?): CInt =
    SolidJniBridge.libc_solid_atoi(arg1)

public actual fun atol(arg1: String?): CLong =
    SolidJniBridge.libc_solid_atol(arg1)

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    SolidJniBridge.libc_solid_itoa(arg1, (arg2?.value ?: 0L), arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    SolidJniBridge.libc_solid_ltoa(arg1, (arg2?.value ?: 0L), arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    SolidJniBridge.libc_solid_ultoa(arg1.toLong(), (arg2?.value ?: 0L), arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    SolidJniBridge.libc_solid_bsearch((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3.toLong(), arg4.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_calloc(arg1.toLong(), arg2.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    DivT()

public actual fun free(arg1: COpaquePointer?) {
    SolidJniBridge.libc_solid_free((arg1?.value ?: 0L))
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_getenv(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun labs(arg1: CLong): CLong =
    SolidJniBridge.libc_solid_labs(arg1)

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    LdivT()

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_malloc(arg1.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    SolidJniBridge.libc_solid_qsort((arg1?.value ?: 0L), arg2.toLong(), arg3.toLong(), 0L)
}

public actual fun rand(): CInt =
    SolidJniBridge.libc_solid_rand()

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_realloc((arg1?.value ?: 0L), arg2.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand(arg1: CUint) {
    SolidJniBridge.libc_solid_srand(arg1.toInt())
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    SolidJniBridge.libc_solid_strtol(arg1, (arg2?.value ?: 0L), arg3)

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    SolidJniBridge.libc_solid_strtoul(arg1, (arg2?.value ?: 0L), arg3).toULong()

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    SolidJniBridge.libc_solid_mblen(arg1, arg2.toLong())

public actual fun mbstowcs(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    SolidJniBridge.libc_solid_mbstowcs((arg1?.value ?: 0L), arg2, arg3.toLong()).toULong()

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    SolidJniBridge.libc_solid_wctomb((arg1?.value ?: 0L), arg2.toInt())

public actual fun mbtowc(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): CInt =
    SolidJniBridge.libc_solid_mbtowc((arg1?.value ?: 0L), arg2, arg3.toLong())

public actual fun wcstombs(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): SizeT =
    SolidJniBridge.libc_solid_wcstombs((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3.toLong()).toULong()

public actual fun randR(arg1: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_randR((arg1?.value ?: 0L))

public actual fun jrand48(arg1: COpaquePointer?): CLong =
    SolidJniBridge.libc_solid_jrand48((arg1?.value ?: 0L))

public actual fun lcong48(arg1: COpaquePointer?) {
    SolidJniBridge.libc_solid_lcong48((arg1?.value ?: 0L))
}

public actual fun lrand48(): CLong =
    SolidJniBridge.libc_solid_lrand48()

public actual fun mrand48(): CLong =
    SolidJniBridge.libc_solid_mrand48()

public actual fun nrand48(arg1: COpaquePointer?): CLong =
    SolidJniBridge.libc_solid_nrand48((arg1?.value ?: 0L))

public actual fun seed48(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_seed48((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand48(arg1: CLong) {
    SolidJniBridge.libc_solid_srand48(arg1)
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_putenv((arg1?.value ?: 0L))

public actual fun a64l(arg1: String?): CLong =
    SolidJniBridge.libc_solid_a64l(arg1)

public actual fun l64a(arg1: CLong): COpaquePointer? =
    SolidJniBridge.libc_solid_l64a(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun random(): CLong =
    SolidJniBridge.libc_solid_random()

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_setstate((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_initstate(arg1.toInt(), (arg2?.value ?: 0L), arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srandom(arg1: CUint) {
    SolidJniBridge.libc_solid_srandom(arg1.toInt())
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    SolidJniBridge.libc_solid_mkostemp((arg1?.value ?: 0L), arg2)

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    SolidJniBridge.libc_solid_mkostemps((arg1?.value ?: 0L), arg2, arg3)

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_mkdtemp((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_mkstemp((arg1?.value ?: 0L))

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_mktemp((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun atoll(arg1: String?): CLonglong =
    SolidJniBridge.libc_solid_atoll(arg1)

public actual fun llabs(arg1: CLonglong): CLonglong =
    SolidJniBridge.libc_solid_llabs(arg1)

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    LldivT()

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    SolidJniBridge.libc_solid_strtoll(arg1, (arg2?.value ?: 0L), arg3)

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    SolidJniBridge.libc_solid_strtoull(arg1, (arg2?.value ?: 0L), arg3).toULong()

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_alignedAlloc(arg1.toLong(), arg2.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    SolidJniBridge.libc_solid_atQuickExit(0L)

public actual fun quickExit(arg1: CInt) {
    SolidJniBridge.libc_solid_quickExit(arg1)
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    SolidJniBridge.libc_solid_setenv(arg1, arg2, arg3)

public actual fun unsetenv(arg1: String?): CInt =
    SolidJniBridge.libc_solid_unsetenv(arg1)

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    SolidJniBridge.libc_solid_humanizeNumber((arg1?.value ?: 0L), arg2.toLong(), arg3, arg4, arg5, arg6)

public actual fun dehumanizeNumber(arg1: String?, arg2: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_dehumanizeNumber(arg1, (arg2?.value ?: 0L))

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidJniBridge.libc_solid_getenvR(arg1, (arg2?.value ?: 0L), arg3.toLong())

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    SolidJniBridge.libc_solid_heapsort((arg1?.value ?: 0L), arg2.toLong(), arg3.toLong(), 0L)

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    SolidJniBridge.libc_solid_mergesort((arg1?.value ?: 0L), arg2.toLong(), arg3.toLong(), 0L)

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    SolidJniBridge.libc_solid_radixsort((arg1?.value ?: 0L), arg2, (arg3?.value ?: 0L), arg4.toInt())

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    SolidJniBridge.libc_solid_sradixsort((arg1?.value ?: 0L), arg2, (arg3?.value ?: 0L), arg4.toInt())

public actual fun getprogname(): COpaquePointer? =
    SolidJniBridge.libc_solid_getprogname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(arg1: String?) {
    SolidJniBridge.libc_solid_setprogname(arg1)
}

public actual fun qabs(arg1: QuadT): QuadT =
    SolidJniBridge.libc_solid_qabs(arg1)

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    SolidJniBridge.libc_solid_strtoq(arg1, (arg2?.value ?: 0L), arg3)

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    SolidJniBridge.libc_solid_strtouq(arg1, (arg2?.value ?: 0L), arg3).toULong()

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    SolidJniBridge.libc_solid_strsuftoll(arg1, arg2, arg3, arg4)

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    SolidJniBridge.libc_solid_strsuftollx(arg1, arg2, arg3, arg4, (arg5?.value ?: 0L), arg6.toLong())

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    SolidJniBridge.libc_solid_l64aR(arg1, (arg2?.value ?: 0L), arg3)

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    QdivT()

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    SolidJniBridge.libc_solid_strtolL(arg1, (arg2?.value ?: 0L), arg3, arg4.toLong())

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    SolidJniBridge.libc_solid_strtoulL(arg1, (arg2?.value ?: 0L), arg3, arg4.toLong()).toULong()

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    SolidJniBridge.libc_solid_strtollL(arg1, (arg2?.value ?: 0L), arg3, arg4.toLong())

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    SolidJniBridge.libc_solid_strtoullL(arg1, (arg2?.value ?: 0L), arg3, arg4.toLong()).toULong()

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    SolidJniBridge.libc_solid_strtoqL(arg1, (arg2?.value ?: 0L), arg3, arg4.toLong())

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    SolidJniBridge.libc_solid_strtouqL(arg1, (arg2?.value ?: 0L), arg3, arg4.toLong()).toULong()

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    SolidJniBridge.libc_solid_mbCurMaxL(arg1.toLong()).toULong()

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    SolidJniBridge.libc_solid_mblenL(arg1, arg2.toLong(), arg3.toLong())

public actual fun mbstowcsL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    SolidJniBridge.libc_solid_mbstowcsL((arg1?.value ?: 0L), arg2, arg3.toLong(), arg4.toLong()).toULong()

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    SolidJniBridge.libc_solid_wctombL((arg1?.value ?: 0L), arg2.toInt(), arg3.toLong())

public actual fun mbtowcL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    SolidJniBridge.libc_solid_mbtowcL((arg1?.value ?: 0L), arg2, arg3.toLong(), arg4.toLong())

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: LocaleT): SizeT =
    SolidJniBridge.libc_solid_wcstombsL((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3.toLong(), arg4.toLong()).toULong()

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_memchr((arg1?.value ?: 0L), arg2, arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidJniBridge.libc_solid_memcmp((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3.toLong())

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_memcpy((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_memmove((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_memset((arg1?.value ?: 0L), arg2, arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_strcat((arg1?.value ?: 0L), arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    SolidJniBridge.libc_solid_strchr(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    SolidJniBridge.libc_solid_strcmp(arg1, arg2)

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    SolidJniBridge.libc_solid_strcoll(arg1, arg2)

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_strcpy((arg1?.value ?: 0L), arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    SolidJniBridge.libc_solid_strcspn(arg1, arg2).toULong()

public actual fun strerror(arg1: CInt): COpaquePointer? =
    SolidJniBridge.libc_solid_strerror(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(arg1: String?): SizeT =
    SolidJniBridge.libc_solid_strlen(arg1).toULong()

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_strncat((arg1?.value ?: 0L), arg2, arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    SolidJniBridge.libc_solid_strncmp(arg1, arg2, arg3.toLong())

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_strncpy((arg1?.value ?: 0L), arg2, arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_strpbrk(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    SolidJniBridge.libc_solid_strrchr(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    SolidJniBridge.libc_solid_strspn(arg1, arg2).toULong()

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_strstr(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_strtok((arg1?.value ?: 0L), arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_strtokR((arg1?.value ?: 0L), arg2, (arg3?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidJniBridge.libc_solid_strerrorR(arg1, (arg2?.value ?: 0L), arg3.toLong())

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    SolidJniBridge.libc_solid_strxfrm((arg1?.value ?: 0L), arg2, arg3.toLong()).toULong()

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_memccpy((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3, arg4.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strdup(arg1: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_strdup(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_stpcpy((arg1?.value ?: 0L), arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_stpncpy((arg1?.value ?: 0L), arg2, arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    SolidJniBridge.libc_solid_strnlen(arg1, arg2.toLong()).toULong()

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_memmem((arg1?.value ?: 0L), arg2.toLong(), (arg3?.value ?: 0L), arg4.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_strcasestr(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    SolidJniBridge.libc_solid_strlcat((arg1?.value ?: 0L), arg2, arg3.toLong()).toULong()

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    SolidJniBridge.libc_solid_strlcpy((arg1?.value ?: 0L), arg2, arg3.toLong()).toULong()

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_strsep((arg1?.value ?: 0L), arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    SolidJniBridge.libc_solid_stresep((arg1?.value ?: 0L), arg2, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_strndup(arg1, arg2.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_memrchr((arg1?.value ?: 0L), arg2, arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_explicitMemset((arg1?.value ?: 0L), arg2, arg3.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidJniBridge.libc_solid_consttimeMemequal((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3.toLong())

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    SolidJniBridge.libc_solid_strcollL(arg1, arg2, arg3.toLong())

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    SolidJniBridge.libc_solid_strxfrmL((arg1?.value ?: 0L), arg2, arg3.toLong(), arg4.toLong()).toULong()

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    SolidJniBridge.libc_solid_strerrorL(arg1, arg2.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidJniBridge.libc_solid_bcmp((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3.toLong())

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    SolidJniBridge.libc_solid_bcopy((arg1?.value ?: 0L), (arg2?.value ?: 0L), arg3.toLong())
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    SolidJniBridge.libc_solid_bzero((arg1?.value ?: 0L), arg2.toLong())
}

public actual fun ffs(arg1: CInt): CInt =
    SolidJniBridge.libc_solid_ffs(arg1)

public actual fun popcount(arg1: CUint): CUint =
    SolidJniBridge.libc_solid_popcount(arg1.toInt()).toUInt()

public actual fun popcountl(arg1: CUlong): CUint =
    SolidJniBridge.libc_solid_popcountl(arg1.toLong()).toUInt()

public actual fun popcountll(arg1: CUlonglong): CUint =
    SolidJniBridge.libc_solid_popcountll(arg1.toLong()).toUInt()

public actual fun popcount32(arg1: UInt): CUint =
    SolidJniBridge.libc_solid_popcount32(arg1.toInt()).toUInt()

public actual fun popcount64(arg1: ULong): CUint =
    SolidJniBridge.libc_solid_popcount64(arg1.toLong()).toUInt()

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    SolidJniBridge.libc_solid_rindex(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    SolidJniBridge.libc_solid_strcasecmp(arg1, arg2)

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    SolidJniBridge.libc_solid_strncasecmp(arg1, arg2, arg3.toLong())

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    SolidJniBridge.libc_solid_signal(arg1, arg2.toLong()).toULong()

public actual fun raise(arg1: CInt): CInt =
    SolidJniBridge.libc_solid_raise(arg1)

public actual fun asctime(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_asctime((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clock(): ClockT =
    SolidJniBridge.libc_solid_clock().toUInt()

public actual fun ctime(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_ctime((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    SolidJniBridge.libc_solid_difftime(arg1, arg2)

public actual fun gmtime(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_gmtime((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtime(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_localtime((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun time(arg1: COpaquePointer?): TimeT =
    SolidJniBridge.libc_solid_time((arg1?.value ?: 0L))

public actual fun mktime(arg1: COpaquePointer?): TimeT =
    SolidJniBridge.libc_solid_mktime((arg1?.value ?: 0L))

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    SolidJniBridge.libc_solid_strftime((arg1?.value ?: 0L), arg2.toLong(), arg3, (arg4?.value ?: 0L)).toULong()

public actual fun utime(arg1: String?, arg2: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_utime(arg1, (arg2?.value ?: 0L))

public actual fun asctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_asctimeR((arg1?.value ?: 0L), (arg2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_ctimeR((arg1?.value ?: 0L), (arg2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gmtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_gmtimeR((arg1?.value ?: 0L), (arg2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_localtimeR((arg1?.value ?: 0L), (arg2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stat(arg1: String?, arg2: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_stat(arg1, (arg2?.value ?: 0L))

public actual fun lstat(arg1: String?, arg2: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_lstat(arg1, (arg2?.value ?: 0L))

public actual fun fstat(arg1: CInt, arg2: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_fstat(arg1, (arg2?.value ?: 0L))

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    SolidJniBridge.libc_solid_chmod(arg1, arg2.toInt())

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    SolidJniBridge.libc_solid_mkdir(arg1, arg2.toInt())

public actual fun open(arg1: String?, arg2: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    SolidJniBridge.libc_solid_creat(arg1, arg2)

public actual fun close(arg1: CInt): CInt =
    SolidJniBridge.libc_solid_close(arg1)

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    SolidJniBridge.libc_solid_read(arg1, (arg2?.value ?: 0L), arg3)

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    SolidJniBridge.libc_solid_write(arg1, (arg2?.value ?: 0L), arg3)

public actual fun unlink(arg1: String?): CInt =
    SolidJniBridge.libc_solid_unlink(arg1)

public actual fun tell(arg1: CInt): CLong =
    SolidJniBridge.libc_solid_tell(arg1)

public actual fun dup(arg1: CInt): CInt =
    SolidJniBridge.libc_solid_dup(arg1)

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    SolidJniBridge.libc_solid_dup2(arg1, arg2)

public actual fun access(arg1: String?, arg2: CInt): CInt =
    SolidJniBridge.libc_solid_access(arg1, arg2)

public actual fun rmdir(arg1: String?): CInt =
    SolidJniBridge.libc_solid_rmdir(arg1)

public actual fun chdir(arg1: String?): CInt =
    SolidJniBridge.libc_solid_chdir(arg1)

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    SolidJniBridge.libc_solid_getwd((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_getcwd((arg1?.value ?: 0L), arg2.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    SolidJniBridge.libc_solid_getopt(arg1, (arg2?.value ?: 0L), arg3)

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    SolidJniBridge.libc_solid_getsubopt((arg1?.value ?: 0L), (arg2?.value ?: 0L), (arg3?.value ?: 0L))

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun getpid(): PidT =
    SolidJniBridge.libc_solid_getpid()

public actual fun sleep(arg1: CUint): CUint =
    SolidJniBridge.libc_solid_sleep(arg1.toInt()).toUInt()

public actual fun usleep(arg1: UsecondsT): CInt =
    SolidJniBridge.libc_solid_usleep(arg1.toInt())

public actual fun localeconv(): COpaquePointer? =
    SolidJniBridge.libc_solid_localeconv().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    SolidJniBridge.libc_solid_setlocale(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun duplocale(arg1: LocaleT): LocaleT =
    SolidJniBridge.libc_solid_duplocale(arg1.toLong()).toULong()

public actual fun freelocale(arg1: LocaleT) {
    SolidJniBridge.libc_solid_freelocale(arg1.toLong())
}

public actual fun localeconvL(arg1: LocaleT): COpaquePointer? =
    SolidJniBridge.libc_solid_localeconvL(arg1.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    SolidJniBridge.libc_solid_newlocale(arg1, arg2, arg3.toLong()).toULong()

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    SolidJniBridge.libc_solid_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    SolidJniBridge.libc_solid_nlLanginfoL(item, locale.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    SolidJniBridge.libc_solid_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    SolidJniBridge.libc_solid_lseek(arg1, arg2, arg3)
