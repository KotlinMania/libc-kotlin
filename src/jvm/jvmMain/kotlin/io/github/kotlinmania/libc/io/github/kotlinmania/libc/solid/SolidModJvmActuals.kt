package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.COpaquePointer

internal object SolidModRawLibc {
    external fun isalnum(c: Int): Int
    external fun isalpha(c: Int): Int
    external fun iscntrl(c: Int): Int
    external fun isdigit(c: Int): Int
    external fun isgraph(c: Int): Int
    external fun islower(c: Int): Int
    external fun isprint(c: Int): Int
    external fun ispunct(c: Int): Int
    external fun isspace(c: Int): Int
    external fun isupper(c: Int): Int
    external fun isxdigit(c: Int): Int
    external fun isblank(c: Int): Int
    external fun tolower(c: Int): Int
    external fun toupper(c: Int): Int
    external fun getStdioFile(fileno: Int): Long?
    external fun clearerr(arg1: Long)
    external fun fclose(arg1: Long): Int
    external fun feof(arg1: Long): Int
    external fun ferror(arg1: Long): Int
    external fun fflush(arg1: Long): Int
    external fun fgetc(arg1: Long): Int
    external fun fgets(arg1: Long, arg2: Int, arg3: Long): Long?
    external fun fopen(arg1: String?, arg2: String?): Long?
    external fun fputc(arg1: Int, arg2: Long): Int
    external fun fputs(arg1: String?, arg2: Long): Int
    external fun fread(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long
    external fun freopen(arg1: String?, arg2: String?, arg3: Long): Long?
    external fun fseek(arg1: Long, arg2: Long, arg3: Int): Int
    external fun ftell(arg1: Long): Long
    external fun fwrite(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long
    external fun getc(arg1: Long): Int
    external fun getchar(): Int
    external fun perror(arg1: String?)
    external fun putc(arg1: Int, arg2: Long): Int
    external fun putchar(arg1: Int): Int
    external fun puts(arg1: String?): Int
    external fun remove(arg1: String?): Int
    external fun rewind(arg1: Long)
    external fun setbuf(arg1: Long, arg2: Long)
    external fun setvbuf(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Int
    external fun tmpfile(): Long?
    external fun ungetc(arg1: Int, arg2: Long): Int
    external fun vfprintf(arg1: Long, arg2: String?, arg3: Long): Int
    external fun vprintf(arg1: String?, arg2: Long): Int
    external fun gets(arg1: Long): Long?
    external fun tmpnam(arg1: String?): Long?
    external fun vsprintf(arg1: Long, arg2: String?, arg3: Long): Int
    external fun rename(arg1: String?, arg2: String?): Int
    external fun vasiprintf(arg1: Long, arg2: String?, arg3: Long): Int
    external fun vfiprintf(arg1: Long, arg2: String?, arg3: Long): Int
    external fun vfiscanf(arg1: Long, arg2: String?, arg3: Long): Int
    external fun viprintf(arg1: String?, arg2: Long): Int
    external fun viscanf(arg1: String?, arg2: Long): Int
    external fun vsiprintf(arg1: Long, arg2: String?, arg3: Long): Int
    external fun vsiscanf(arg1: String?, arg2: String?, arg3: Long): Int
    external fun vsniprintf(arg1: Long, arg2: Long, arg3: String?, arg4: Long): Int
    external fun vdiprintf(arg1: Int, arg2: String?, arg3: Long): Int
    external fun fgetpos(arg1: Long, arg2: Long): Int
    external fun fsetpos(arg1: Long, arg2: Long): Int
    external fun fdopen(arg1: Int, arg2: String?): Long?
    external fun fileno(arg1: Long): Int
    external fun flockfile(arg1: Long)
    external fun ftrylockfile(arg1: Long): Int
    external fun funlockfile(arg1: Long)
    external fun getcUnlocked(arg1: Long): Int
    external fun getcharUnlocked(): Int
    external fun putcUnlocked(arg1: Int, arg2: Long): Int
    external fun putcharUnlocked(arg1: Int): Int
    external fun vsnprintf(arg1: Long, arg2: Long, arg3: String?, arg4: Long): Int
    external fun getw(arg1: Long): Int
    external fun putw(arg1: Int, arg2: Long): Int
    external fun tempnam(arg1: String?, arg2: String?): Long?
    external fun fseeko(stream: Long, offset: Long, whence: Int): Int
    external fun ftello(stream: Long): Long
    external fun atof(arg1: String?): Double
    external fun strtod(arg1: String?, arg2: Long): Double
    external fun drand48(): Double
    external fun erand48(arg1: Long): Double
    external fun strtof(arg1: String?, arg2: Long): Float
    external fun strtold(arg1: String?, arg2: Long): Double
    external fun strtodL(arg1: String?, arg2: Long, arg3: Long): Double
    external fun strtofL(arg1: String?, arg2: Long, arg3: Long): Float
    external fun strtoldL(arg1: String?, arg2: Long, arg3: Long): Double
    external fun exit(arg1: Int): Long
    external fun abort(): Long
    external fun abs(arg1: Int): Int
    external fun atexit(arg1: Long): Int
    external fun atoi(arg1: String?): Int
    external fun atol(arg1: String?): Long
    external fun itoa(arg1: Int, arg2: Long, arg3: Int): Long?
    external fun ltoa(arg1: Long, arg2: Long, arg3: Int): Long?
    external fun ultoa(arg1: Long, arg2: Long, arg3: Int): Long?
    external fun bsearch(arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Long): Long?
    external fun calloc(arg1: Long, arg2: Long): Long?
    external fun div(arg1: Int, arg2: Int): Long
    external fun free(arg1: Long)
    external fun getenv(arg1: String?): Long?
    external fun labs(arg1: Long): Long
    external fun ldiv(arg1: Long, arg2: Long): Long
    external fun malloc(arg1: Long): Long?
    external fun qsort(arg1: Long, arg2: Long, arg3: Long, arg4: Long)
    external fun rand(): Int
    external fun realloc(arg1: Long, arg2: Long): Long?
    external fun srand(arg1: Int)
    external fun strtol(arg1: String?, arg2: Long, arg3: Int): Long
    external fun strtoul(arg1: String?, arg2: Long, arg3: Int): Long
    external fun mblen(arg1: String?, arg2: Long): Int
    external fun mbstowcs(arg1: Long, arg2: String?, arg3: Long): Long
    external fun wctomb(arg1: Long, arg2: Int): Int
    external fun mbtowc(arg1: Long, arg2: String?, arg3: Long): Int
    external fun wcstombs(arg1: Long, arg2: Long, arg3: Long): Long
    external fun randR(arg1: Long): Int
    external fun jrand48(arg1: Long): Long
    external fun lcong48(arg1: Long)
    external fun lrand48(): Long
    external fun mrand48(): Long
    external fun nrand48(arg1: Long): Long
    external fun seed48(arg1: Long): Long?
    external fun srand48(arg1: Long)
    external fun putenv(arg1: Long): Int
    external fun a64l(arg1: String?): Long
    external fun l64a(arg1: Long): Long?
    external fun random(): Long
    external fun setstate(arg1: Long): Long?
    external fun initstate(arg1: Int, arg2: Long, arg3: Long): Long?
    external fun srandom(arg1: Int)
    external fun mkostemp(arg1: Long, arg2: Int): Int
    external fun mkostemps(arg1: Long, arg2: Int, arg3: Int): Int
    external fun mkdtemp(arg1: Long): Long?
    external fun mkstemp(arg1: Long): Int
    external fun mktemp(arg1: Long): Long?
    external fun atoll(arg1: String?): Long
    external fun llabs(arg1: Long): Long
    external fun lldiv(arg1: Long, arg2: Long): Long
    external fun strtoll(arg1: String?, arg2: Long, arg3: Int): Long
    external fun strtoull(arg1: String?, arg2: Long, arg3: Int): Long
    external fun alignedAlloc(arg1: Long, arg2: Long): Long?
    external fun atQuickExit(arg1: Long): Int
    external fun quickExit(arg1: Int)
    external fun setenv(arg1: String?, arg2: String?, arg3: Int): Int
    external fun unsetenv(arg1: String?): Int
    external fun humanizeNumber(arg1: Long, arg2: Long, arg3: Long, arg4: String?, arg5: Int, arg6: Int): Int
    external fun dehumanizeNumber(arg1: String?, arg2: Long): Int
    external fun getenvR(arg1: String?, arg2: Long, arg3: Long): Int
    external fun heapsort(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Int
    external fun mergesort(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Int
    external fun radixsort(arg1: Long, arg2: Int, arg3: Long, arg4: Int): Int
    external fun sradixsort(arg1: Long, arg2: Int, arg3: Long, arg4: Int): Int
    external fun getprogname(): Long?
    external fun setprogname(arg1: String?)
    external fun qabs(arg1: Long): Long
    external fun strtoq(arg1: String?, arg2: Long, arg3: Int): Long
    external fun strtouq(arg1: String?, arg2: Long, arg3: Int): Long
    external fun strsuftoll(arg1: String?, arg2: String?, arg3: Long, arg4: Long): Long
    external fun strsuftollx(arg1: String?, arg2: String?, arg3: Long, arg4: Long, arg5: Long, arg6: Long): Long
    external fun l64aR(arg1: Long, arg2: Long, arg3: Int): Int
    external fun qdiv(arg1: Long, arg2: Long): Long
    external fun strtolL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long
    external fun strtoulL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long
    external fun strtollL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long
    external fun strtoullL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long
    external fun strtoqL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long
    external fun strtouqL(arg1: String?, arg2: Long, arg3: Int, arg4: Long): Long
    external fun mbCurMaxL(arg1: Long): Long
    external fun mblenL(arg1: String?, arg2: Long, arg3: Long): Int
    external fun mbstowcsL(arg1: Long, arg2: String?, arg3: Long, arg4: Long): Long
    external fun wctombL(arg1: Long, arg2: Int, arg3: Long): Int
    external fun mbtowcL(arg1: Long, arg2: String?, arg3: Long, arg4: Long): Int
    external fun wcstombsL(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long
    external fun memchr(arg1: Long, arg2: Int, arg3: Long): Long?
    external fun memcmp(arg1: Long, arg2: Long, arg3: Long): Int
    external fun memcpy(arg1: Long, arg2: Long, arg3: Long): Long?
    external fun memmove(arg1: Long, arg2: Long, arg3: Long): Long?
    external fun memset(arg1: Long, arg2: Int, arg3: Long): Long?
    external fun strcat(arg1: Long, arg2: String?): Long?
    external fun strchr(arg1: String?, arg2: Int): Long?
    external fun strcmp(arg1: String?, arg2: String?): Int
    external fun strcoll(arg1: String?, arg2: String?): Int
    external fun strcpy(arg1: Long, arg2: String?): Long?
    external fun strcspn(arg1: String?, arg2: String?): Long
    external fun strerror(arg1: Int): Long?
    external fun strlen(arg1: String?): Long
    external fun strncat(arg1: Long, arg2: String?, arg3: Long): Long?
    external fun strncmp(arg1: String?, arg2: String?, arg3: Long): Int
    external fun strncpy(arg1: Long, arg2: String?, arg3: Long): Long?
    external fun strpbrk(arg1: String?, arg2: String?): Long?
    external fun strrchr(arg1: String?, arg2: Int): Long?
    external fun strspn(arg1: String?, arg2: String?): Long
    external fun strstr(arg1: String?, arg2: String?): Long?
    external fun strtok(arg1: Long, arg2: String?): Long?
    external fun strtokR(arg1: Long, arg2: String?, arg3: Long): Long?
    external fun strerrorR(arg1: Int, arg2: Long, arg3: Long): Int
    external fun strxfrm(arg1: Long, arg2: String?, arg3: Long): Long
    external fun memccpy(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Long?
    external fun strdup(arg1: String?): Long?
    external fun stpcpy(arg1: Long, arg2: String?): Long?
    external fun stpncpy(arg1: Long, arg2: String?, arg3: Long): Long?
    external fun strnlen(arg1: String?, arg2: Long): Long
    external fun memmem(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long?
    external fun strcasestr(arg1: String?, arg2: String?): Long?
    external fun strlcat(arg1: Long, arg2: String?, arg3: Long): Long
    external fun strlcpy(arg1: Long, arg2: String?, arg3: Long): Long
    external fun strsep(arg1: Long, arg2: String?): Long?
    external fun stresep(arg1: Long, arg2: String?, arg3: Int): Long?
    external fun strndup(arg1: String?, arg2: Long): Long?
    external fun memrchr(arg1: Long, arg2: Int, arg3: Long): Long?
    external fun explicitMemset(arg1: Long, arg2: Int, arg3: Long): Long?
    external fun consttimeMemequal(arg1: Long, arg2: Long, arg3: Long): Int
    external fun strcollL(arg1: String?, arg2: String?, arg3: Long): Int
    external fun strxfrmL(arg1: Long, arg2: String?, arg3: Long, arg4: Long): Long
    external fun strerrorL(arg1: Int, arg2: Long): Long?
    external fun bcmp(arg1: Long, arg2: Long, arg3: Long): Int
    external fun bcopy(arg1: Long, arg2: Long, arg3: Long)
    external fun bzero(arg1: Long, arg2: Long)
    external fun ffs(arg1: Int): Int
    external fun popcount(arg1: Int): Int
    external fun popcountl(arg1: Long): Int
    external fun popcountll(arg1: Long): Int
    external fun popcount32(arg1: Int): Int
    external fun popcount64(arg1: Long): Int
    external fun rindex(arg1: String?, arg2: Int): Long?
    external fun strcasecmp(arg1: String?, arg2: String?): Int
    external fun strncasecmp(arg1: String?, arg2: String?, arg3: Long): Int
    external fun signal(arg1: Int, arg2: Long): Long
    external fun raise(arg1: Int): Int
    external fun asctime(arg1: Long): Long?
    external fun clock(): Long
    external fun ctime(arg1: Long): Long?
    external fun difftime(arg1: Long, arg2: Long): Double
    external fun gmtime(arg1: Long): Long?
    external fun localtime(arg1: Long): Long?
    external fun time(arg1: Long): Long
    external fun mktime(arg1: Long): Long
    external fun strftime(arg1: Long, arg2: Long, arg3: String?, arg4: Long): Long
    external fun utime(arg1: String?, arg2: Long): Int
    external fun asctimeR(arg1: Long, arg2: Long): Long?
    external fun ctimeR(arg1: Long, arg2: Long): Long?
    external fun gmtimeR(arg1: Long, arg2: Long): Long?
    external fun localtimeR(arg1: Long, arg2: Long): Long?
    external fun stat(arg1: String?, arg2: Long): Int
    external fun lstat(arg1: String?, arg2: Long): Int
    external fun fstat(arg1: Int, arg2: Long): Int
    external fun chmod(arg1: String?, arg2: Int): Int
    external fun mkdir(arg1: String?, arg2: Int): Int
    external fun creat(arg1: String?, arg2: Int): Int
    external fun close(arg1: Int): Int
    external fun read(arg1: Int, arg2: Long, arg3: Int): Int
    external fun write(arg1: Int, arg2: Long, arg3: Int): Int
    external fun unlink(arg1: String?): Int
    external fun tell(arg1: Int): Long
    external fun dup(arg1: Int): Int
    external fun dup2(arg1: Int, arg2: Int): Int
    external fun access(arg1: String?, arg2: Int): Int
    external fun rmdir(arg1: String?): Int
    external fun chdir(arg1: String?): Int
    external fun getwd(arg1: Long): Long?
    external fun getcwd(arg1: Long, arg2: Long): Long?
    external fun getopt(arg1: Int, arg2: Long, arg3: String?): Int
    external fun getsubopt(arg1: Long, arg2: Long, arg3: Long): Int
    external fun getpid(): Int
    external fun sleep(arg1: Int): Int
    external fun usleep(arg1: Int): Int
    external fun localeconv(): Long?
    external fun setlocale(arg1: Int, arg2: String?): Long?
    external fun duplocale(arg1: Long): Long
    external fun freelocale(arg1: Long)
    external fun localeconvL(arg1: Long): Long?
    external fun newlocale(arg1: Int, arg2: String?, arg3: Long): Long
    external fun nlLanginfo(item: Long): Long?
    external fun nlLanginfoL(item: Long, locale: Long): Long?
    external fun memalign(align: Long, size: Long): Long?
    external fun lseek(arg1: Int, arg2: Long, arg3: Int): Long
}

public actual fun isalnum(c: CInt): CInt =
    SolidModRawLibc.isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    SolidModRawLibc.isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    SolidModRawLibc.iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    SolidModRawLibc.isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    SolidModRawLibc.isgraph(c)

public actual fun islower(c: CInt): CInt =
    SolidModRawLibc.islower(c)

public actual fun isprint(c: CInt): CInt =
    SolidModRawLibc.isprint(c)

public actual fun ispunct(c: CInt): CInt =
    SolidModRawLibc.ispunct(c)

public actual fun isspace(c: CInt): CInt =
    SolidModRawLibc.isspace(c)

public actual fun isupper(c: CInt): CInt =
    SolidModRawLibc.isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    SolidModRawLibc.isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    SolidModRawLibc.isblank(c)

public actual fun tolower(c: CInt): CInt =
    SolidModRawLibc.tolower(c)

public actual fun toupper(c: CInt): CInt =
    SolidModRawLibc.toupper(c)

public actual fun getStdioFile(fileno: CInt): FILE? =
    SolidModRawLibc.getStdioFile(fileno)

public actual fun clearerr(arg1: FILE?) {
    SolidModRawLibc.clearerr(arg1?.toLong() ?: 0L)
}

public actual fun fclose(arg1: FILE?): CInt =
    SolidModRawLibc.fclose(arg1?.toLong() ?: 0L)

public actual fun feof(arg1: FILE?): CInt =
    SolidModRawLibc.feof(arg1?.toLong() ?: 0L)

public actual fun ferror(arg1: FILE?): CInt =
    SolidModRawLibc.ferror(arg1?.toLong() ?: 0L)

public actual fun fflush(arg1: FILE?): CInt =
    SolidModRawLibc.fflush(arg1?.toLong() ?: 0L)

public actual fun fgetc(arg1: FILE?): CInt =
    SolidModRawLibc.fgetc(arg1?.toLong() ?: 0L)

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    SolidModRawLibc.fgets(arg1?.value ?: 0L, arg2, arg3?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    SolidModRawLibc.fopen(arg1, arg2)

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    SolidModRawLibc.fputc(arg1, arg2?.toLong() ?: 0L)

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    SolidModRawLibc.fputs(arg1, arg2?.toLong() ?: 0L)

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    SolidModRawLibc.fread(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    SolidModRawLibc.freopen(arg1, arg2, arg3?.toLong() ?: 0L)

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    SolidModRawLibc.fseek(arg1?.toLong() ?: 0L, arg2, arg3)

public actual fun ftell(arg1: FILE?): CLong =
    SolidModRawLibc.ftell(arg1?.toLong() ?: 0L)

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    SolidModRawLibc.fwrite(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)

public actual fun getc(arg1: FILE?): CInt =
    SolidModRawLibc.getc(arg1?.toLong() ?: 0L)

public actual fun getchar(): CInt =
    SolidModRawLibc.getchar()

public actual fun perror(arg1: String?) {
    SolidModRawLibc.perror(arg1)
}

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    SolidModRawLibc.putc(arg1, arg2?.toLong() ?: 0L)

public actual fun putchar(arg1: CInt): CInt =
    SolidModRawLibc.putchar(arg1)

public actual fun puts(arg1: String?): CInt =
    SolidModRawLibc.puts(arg1)

public actual fun remove(arg1: String?): CInt =
    SolidModRawLibc.remove(arg1)

public actual fun rewind(arg1: FILE?) {
    SolidModRawLibc.rewind(arg1?.toLong() ?: 0L)
}

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    SolidModRawLibc.setbuf(arg1?.toLong() ?: 0L, arg2?.value ?: 0L)
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    SolidModRawLibc.setvbuf(arg1?.toLong() ?: 0L, arg2?.value ?: 0L, arg3, arg4)

public actual fun tmpfile(): FILE? =
    SolidModRawLibc.tmpfile()

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    SolidModRawLibc.ungetc(arg1, arg2?.toLong() ?: 0L)

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    SolidModRawLibc.vfprintf(arg1?.toLong() ?: 0L, arg2, arg3)

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    SolidModRawLibc.vprintf(arg1, arg2)

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    SolidModRawLibc.gets(arg1?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    SolidModRawLibc.tmpnam(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    SolidModRawLibc.vsprintf(arg1?.value ?: 0L, arg2, arg3)

public actual fun rename(arg1: String?, arg2: String?): CInt =
    SolidModRawLibc.rename(arg1, arg2)

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    SolidModRawLibc.vasiprintf(arg1?.value ?: 0L, arg2, arg3)

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    SolidModRawLibc.vfiprintf(arg1?.toLong() ?: 0L, arg2, arg3)

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    SolidModRawLibc.vfiscanf(arg1?.toLong() ?: 0L, arg2, arg3)

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    SolidModRawLibc.viprintf(arg1, arg2)

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    SolidModRawLibc.viscanf(arg1, arg2)

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    SolidModRawLibc.vsiprintf(arg1?.value ?: 0L, arg2, arg3)

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    SolidModRawLibc.vsiscanf(arg1, arg2, arg3)

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    SolidModRawLibc.vsniprintf(arg1?.value ?: 0L, arg2, arg3, arg4)

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    SolidModRawLibc.vdiprintf(arg1, arg2, arg3)

public actual fun fgetpos(arg1: FILE?, arg2: FposT?): CInt =
    SolidModRawLibc.fgetpos(arg1?.toLong() ?: 0L, arg2?.toLong() ?: 0L)

public actual fun fsetpos(arg1: FILE?, arg2: FposT?): CInt =
    SolidModRawLibc.fsetpos(arg1?.toLong() ?: 0L, arg2?.toLong() ?: 0L)

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    SolidModRawLibc.fdopen(arg1, arg2)

public actual fun fileno(arg1: FILE?): CInt =
    SolidModRawLibc.fileno(arg1?.toLong() ?: 0L)

public actual fun flockfile(arg1: FILE?) {
    SolidModRawLibc.flockfile(arg1?.toLong() ?: 0L)
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    SolidModRawLibc.ftrylockfile(arg1?.toLong() ?: 0L)

public actual fun funlockfile(arg1: FILE?) {
    SolidModRawLibc.funlockfile(arg1?.toLong() ?: 0L)
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    SolidModRawLibc.getcUnlocked(arg1?.toLong() ?: 0L)

public actual fun getcharUnlocked(): CInt =
    SolidModRawLibc.getcharUnlocked()

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    SolidModRawLibc.putcUnlocked(arg1, arg2?.toLong() ?: 0L)

public actual fun putcharUnlocked(arg1: CInt): CInt =
    SolidModRawLibc.putcharUnlocked(arg1)

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    SolidModRawLibc.vsnprintf(arg1?.value ?: 0L, arg2, arg3, arg4)

public actual fun getw(arg1: FILE?): CInt =
    SolidModRawLibc.getw(arg1?.toLong() ?: 0L)

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    SolidModRawLibc.putw(arg1, arg2?.toLong() ?: 0L)

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    SolidModRawLibc.tempnam(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    SolidModRawLibc.fseeko(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    SolidModRawLibc.ftello(stream?.toLong() ?: 0L)

public actual fun atof(arg1: String?): Double =
    SolidModRawLibc.atof(arg1)

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    SolidModRawLibc.strtod(arg1, arg2?.value ?: 0L)

public actual fun drand48(): Double =
    SolidModRawLibc.drand48()

public actual fun erand48(arg1: CUshort?): Double =
    SolidModRawLibc.erand48(arg1?.toLong() ?: 0L)

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    SolidModRawLibc.strtof(arg1, arg2?.value ?: 0L)

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    SolidModRawLibc.strtold(arg1, arg2?.value ?: 0L)

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    SolidModRawLibc.strtodL(arg1, arg2?.value ?: 0L, arg3)

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    SolidModRawLibc.strtofL(arg1, arg2?.value ?: 0L, arg3)

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    SolidModRawLibc.strtoldL(arg1, arg2?.value ?: 0L, arg3)

public actual fun exit(arg1: CInt): Nothing =
    SolidModRawLibc.exit(arg1)

public actual fun abort(): Nothing =
    SolidModRawLibc.abort()

public actual fun abs(arg1: CInt): CInt =
    SolidModRawLibc.abs(arg1)

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    SolidModRawLibc.atexit(arg1?.toLong() ?: 0L)

public actual fun atoi(arg1: String?): CInt =
    SolidModRawLibc.atoi(arg1)

public actual fun atol(arg1: String?): CLong =
    SolidModRawLibc.atol(arg1)

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    SolidModRawLibc.itoa(arg1, arg2?.value ?: 0L, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    SolidModRawLibc.ltoa(arg1, arg2?.value ?: 0L, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    SolidModRawLibc.ultoa(arg1, arg2?.value ?: 0L, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    SolidModRawLibc.bsearch(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3, arg4, arg5?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    SolidModRawLibc.calloc(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    SolidModRawLibc.div(arg1, arg2)

public actual fun free(arg1: COpaquePointer?) {
    SolidModRawLibc.free(arg1?.value ?: 0L)
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    SolidModRawLibc.getenv(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun labs(arg1: CLong): CLong =
    SolidModRawLibc.labs(arg1)

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    SolidModRawLibc.ldiv(arg1, arg2)

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    SolidModRawLibc.malloc(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    SolidModRawLibc.qsort(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)
}

public actual fun rand(): CInt =
    SolidModRawLibc.rand()

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    SolidModRawLibc.realloc(arg1?.value ?: 0L, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand(arg1: CUint) {
    SolidModRawLibc.srand(arg1)
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    SolidModRawLibc.strtol(arg1, arg2?.value ?: 0L, arg3)

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    SolidModRawLibc.strtoul(arg1, arg2?.value ?: 0L, arg3)

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    SolidModRawLibc.mblen(arg1, arg2)

public actual fun mbstowcs(arg1: WcharT?, arg2: String?, arg3: SizeT): SizeT =
    SolidModRawLibc.mbstowcs(arg1?.toLong() ?: 0L, arg2, arg3)

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    SolidModRawLibc.wctomb(arg1?.value ?: 0L, arg2)

public actual fun mbtowc(arg1: WcharT?, arg2: String?, arg3: SizeT): CInt =
    SolidModRawLibc.mbtowc(arg1?.toLong() ?: 0L, arg2, arg3)

public actual fun wcstombs(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT): SizeT =
    SolidModRawLibc.wcstombs(arg1?.value ?: 0L, arg2?.toLong() ?: 0L, arg3)

public actual fun randR(arg1: CUint?): CInt =
    SolidModRawLibc.randR(arg1?.toLong() ?: 0L)

public actual fun jrand48(arg1: CUshort?): CLong =
    SolidModRawLibc.jrand48(arg1?.toLong() ?: 0L)

public actual fun lcong48(arg1: CUshort?) {
    SolidModRawLibc.lcong48(arg1?.toLong() ?: 0L)
}

public actual fun lrand48(): CLong =
    SolidModRawLibc.lrand48()

public actual fun mrand48(): CLong =
    SolidModRawLibc.mrand48()

public actual fun nrand48(arg1: CUshort?): CLong =
    SolidModRawLibc.nrand48(arg1?.toLong() ?: 0L)

public actual fun seed48(arg1: CUshort?): CUshort? =
    SolidModRawLibc.seed48(arg1?.toLong() ?: 0L)

public actual fun srand48(arg1: CLong) {
    SolidModRawLibc.srand48(arg1)
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    SolidModRawLibc.putenv(arg1?.value ?: 0L)

public actual fun a64l(arg1: String?): CLong =
    SolidModRawLibc.a64l(arg1)

public actual fun l64a(arg1: CLong): COpaquePointer? =
    SolidModRawLibc.l64a(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun random(): CLong =
    SolidModRawLibc.random()

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    SolidModRawLibc.setstate(arg1?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.initstate(arg1, arg2?.value ?: 0L, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srandom(arg1: CUint) {
    SolidModRawLibc.srandom(arg1)
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    SolidModRawLibc.mkostemp(arg1?.value ?: 0L, arg2)

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    SolidModRawLibc.mkostemps(arg1?.value ?: 0L, arg2, arg3)

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    SolidModRawLibc.mkdtemp(arg1?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    SolidModRawLibc.mkstemp(arg1?.value ?: 0L)

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    SolidModRawLibc.mktemp(arg1?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun atoll(arg1: String?): CLonglong =
    SolidModRawLibc.atoll(arg1)

public actual fun llabs(arg1: CLonglong): CLonglong =
    SolidModRawLibc.llabs(arg1)

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    SolidModRawLibc.lldiv(arg1, arg2)

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    SolidModRawLibc.strtoll(arg1, arg2?.value ?: 0L, arg3)

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    SolidModRawLibc.strtoull(arg1, arg2?.value ?: 0L, arg3)

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    SolidModRawLibc.alignedAlloc(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    SolidModRawLibc.atQuickExit(arg1?.toLong() ?: 0L)

public actual fun quickExit(arg1: CInt) {
    SolidModRawLibc.quickExit(arg1)
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    SolidModRawLibc.setenv(arg1, arg2, arg3)

public actual fun unsetenv(arg1: String?): CInt =
    SolidModRawLibc.unsetenv(arg1)

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    SolidModRawLibc.humanizeNumber(arg1?.value ?: 0L, arg2, arg3, arg4, arg5, arg6)

public actual fun dehumanizeNumber(arg1: String?, arg2: Long?): CInt =
    SolidModRawLibc.dehumanizeNumber(arg1, arg2?.toLong() ?: 0L)

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidModRawLibc.getenvR(arg1, arg2?.value ?: 0L, arg3)

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    SolidModRawLibc.heapsort(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    SolidModRawLibc.mergesort(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt =
    SolidModRawLibc.radixsort(arg1?.value ?: 0L, arg2, arg3?.toLong() ?: 0L, arg4)

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt =
    SolidModRawLibc.sradixsort(arg1?.value ?: 0L, arg2, arg3?.toLong() ?: 0L, arg4)

public actual fun getprogname(): COpaquePointer? =
    SolidModRawLibc.getprogname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(arg1: String?) {
    SolidModRawLibc.setprogname(arg1)
}

public actual fun qabs(arg1: QuadT): QuadT =
    SolidModRawLibc.qabs(arg1)

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    SolidModRawLibc.strtoq(arg1, arg2?.value ?: 0L, arg3)

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    SolidModRawLibc.strtouq(arg1, arg2?.value ?: 0L, arg3)

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    SolidModRawLibc.strsuftoll(arg1, arg2, arg3, arg4)

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    SolidModRawLibc.strsuftollx(arg1, arg2, arg3, arg4, arg5?.value ?: 0L, arg6)

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    SolidModRawLibc.l64aR(arg1, arg2?.value ?: 0L, arg3)

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    SolidModRawLibc.qdiv(arg1, arg2)

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    SolidModRawLibc.strtolL(arg1, arg2?.value ?: 0L, arg3, arg4)

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    SolidModRawLibc.strtoulL(arg1, arg2?.value ?: 0L, arg3, arg4)

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    SolidModRawLibc.strtollL(arg1, arg2?.value ?: 0L, arg3, arg4)

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    SolidModRawLibc.strtoullL(arg1, arg2?.value ?: 0L, arg3, arg4)

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    SolidModRawLibc.strtoqL(arg1, arg2?.value ?: 0L, arg3, arg4)

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    SolidModRawLibc.strtouqL(arg1, arg2?.value ?: 0L, arg3, arg4)

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    SolidModRawLibc.mbCurMaxL(arg1)

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    SolidModRawLibc.mblenL(arg1, arg2, arg3)

public actual fun mbstowcsL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    SolidModRawLibc.mbstowcsL(arg1?.toLong() ?: 0L, arg2, arg3, arg4)

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    SolidModRawLibc.wctombL(arg1?.value ?: 0L, arg2, arg3)

public actual fun mbtowcL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    SolidModRawLibc.mbtowcL(arg1?.toLong() ?: 0L, arg2, arg3, arg4)

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT, arg4: LocaleT): SizeT =
    SolidModRawLibc.wcstombsL(arg1?.value ?: 0L, arg2?.toLong() ?: 0L, arg3, arg4)

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.memchr(arg1?.value ?: 0L, arg2, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidModRawLibc.memcmp(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.memcpy(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.memmove(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.memset(arg1?.value ?: 0L, arg2, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidModRawLibc.strcat(arg1?.value ?: 0L, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    SolidModRawLibc.strchr(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    SolidModRawLibc.strcmp(arg1, arg2)

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    SolidModRawLibc.strcoll(arg1, arg2)

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidModRawLibc.strcpy(arg1?.value ?: 0L, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    SolidModRawLibc.strcspn(arg1, arg2)

public actual fun strerror(arg1: CInt): COpaquePointer? =
    SolidModRawLibc.strerror(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(arg1: String?): SizeT =
    SolidModRawLibc.strlen(arg1)

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.strncat(arg1?.value ?: 0L, arg2, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    SolidModRawLibc.strncmp(arg1, arg2, arg3)

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.strncpy(arg1?.value ?: 0L, arg2, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    SolidModRawLibc.strpbrk(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    SolidModRawLibc.strrchr(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    SolidModRawLibc.strspn(arg1, arg2)

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    SolidModRawLibc.strstr(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidModRawLibc.strtok(arg1?.value ?: 0L, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    SolidModRawLibc.strtokR(arg1?.value ?: 0L, arg2, arg3?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidModRawLibc.strerrorR(arg1, arg2?.value ?: 0L, arg3)

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    SolidModRawLibc.strxfrm(arg1?.value ?: 0L, arg2, arg3)

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    SolidModRawLibc.memccpy(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3, arg4).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strdup(arg1: String?): COpaquePointer? =
    SolidModRawLibc.strdup(arg1).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidModRawLibc.stpcpy(arg1?.value ?: 0L, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.stpncpy(arg1?.value ?: 0L, arg2, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    SolidModRawLibc.strnlen(arg1, arg2)

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    SolidModRawLibc.memmem(arg1?.value ?: 0L, arg2, arg3?.value ?: 0L, arg4).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    SolidModRawLibc.strcasestr(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    SolidModRawLibc.strlcat(arg1?.value ?: 0L, arg2, arg3)

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    SolidModRawLibc.strlcpy(arg1?.value ?: 0L, arg2, arg3)

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    SolidModRawLibc.strsep(arg1?.value ?: 0L, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    SolidModRawLibc.stresep(arg1?.value ?: 0L, arg2, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    SolidModRawLibc.strndup(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.memrchr(arg1?.value ?: 0L, arg2, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    SolidModRawLibc.explicitMemset(arg1?.value ?: 0L, arg2, arg3).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidModRawLibc.consttimeMemequal(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    SolidModRawLibc.strcollL(arg1, arg2, arg3)

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    SolidModRawLibc.strxfrmL(arg1?.value ?: 0L, arg2, arg3, arg4)

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    SolidModRawLibc.strerrorL(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    SolidModRawLibc.bcmp(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    SolidModRawLibc.bcopy(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    SolidModRawLibc.bzero(arg1?.value ?: 0L, arg2)
}

public actual fun ffs(arg1: CInt): CInt =
    SolidModRawLibc.ffs(arg1)

public actual fun popcount(arg1: CUint): CUint =
    SolidModRawLibc.popcount(arg1)

public actual fun popcountl(arg1: CUlong): CUint =
    SolidModRawLibc.popcountl(arg1)

public actual fun popcountll(arg1: CUlonglong): CUint =
    SolidModRawLibc.popcountll(arg1)

public actual fun popcount32(arg1: UInt): CUint =
    SolidModRawLibc.popcount32(arg1)

public actual fun popcount64(arg1: ULong): CUint =
    SolidModRawLibc.popcount64(arg1)

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    SolidModRawLibc.rindex(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    SolidModRawLibc.strcasecmp(arg1, arg2)

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    SolidModRawLibc.strncasecmp(arg1, arg2, arg3)

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    SolidModRawLibc.signal(arg1, arg2)

public actual fun raise(arg1: CInt): CInt =
    SolidModRawLibc.raise(arg1)

public actual fun asctime(arg1: Tm?): COpaquePointer? =
    SolidModRawLibc.asctime(arg1?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clock(): ClockT =
    SolidModRawLibc.clock()

public actual fun ctime(arg1: Long?): COpaquePointer? =
    SolidModRawLibc.ctime(arg1?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    SolidModRawLibc.difftime(arg1, arg2)

public actual fun gmtime(arg1: Long?): Tm? =
    SolidModRawLibc.gmtime(arg1?.toLong() ?: 0L)

public actual fun localtime(arg1: Long?): Tm? =
    SolidModRawLibc.localtime(arg1?.toLong() ?: 0L)

public actual fun time(arg1: Long?): TimeT =
    SolidModRawLibc.time(arg1?.toLong() ?: 0L)

public actual fun mktime(arg1: Tm?): TimeT =
    SolidModRawLibc.mktime(arg1?.toLong() ?: 0L)

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: Tm?): SizeT =
    SolidModRawLibc.strftime(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)

public actual fun utime(arg1: String?, arg2: Long?): CInt =
    SolidModRawLibc.utime(arg1, arg2?.toLong() ?: 0L)

public actual fun asctimeR(arg1: Tm?, arg2: COpaquePointer?): COpaquePointer? =
    SolidModRawLibc.asctimeR(arg1?.toLong() ?: 0L, arg2?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(arg1: Long?, arg2: COpaquePointer?): COpaquePointer? =
    SolidModRawLibc.ctimeR(arg1?.toLong() ?: 0L, arg2?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gmtimeR(arg1: Long?, arg2: Tm?): Tm? =
    SolidModRawLibc.gmtimeR(arg1?.toLong() ?: 0L, arg2?.toLong() ?: 0L)

public actual fun localtimeR(arg1: Long?, arg2: Tm?): Tm? =
    SolidModRawLibc.localtimeR(arg1?.toLong() ?: 0L, arg2?.toLong() ?: 0L)

public actual fun stat(arg1: String?, arg2: Stat?): CInt =
    SolidModRawLibc.stat(arg1, arg2?.toLong() ?: 0L)

public actual fun lstat(arg1: String?, arg2: Stat?): CInt =
    SolidModRawLibc.lstat(arg1, arg2?.toLong() ?: 0L)

public actual fun fstat(arg1: CInt, arg2: Stat?): CInt =
    SolidModRawLibc.fstat(arg1, arg2?.toLong() ?: 0L)

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    SolidModRawLibc.chmod(arg1, arg2)

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    SolidModRawLibc.mkdir(arg1, arg2)

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    SolidModRawLibc.creat(arg1, arg2)

public actual fun close(arg1: CInt): CInt =
    SolidModRawLibc.close(arg1)

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    SolidModRawLibc.read(arg1, arg2?.value ?: 0L, arg3)

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    SolidModRawLibc.write(arg1, arg2?.value ?: 0L, arg3)

public actual fun unlink(arg1: String?): CInt =
    SolidModRawLibc.unlink(arg1)

public actual fun tell(arg1: CInt): CLong =
    SolidModRawLibc.tell(arg1)

public actual fun dup(arg1: CInt): CInt =
    SolidModRawLibc.dup(arg1)

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    SolidModRawLibc.dup2(arg1, arg2)

public actual fun access(arg1: String?, arg2: CInt): CInt =
    SolidModRawLibc.access(arg1, arg2)

public actual fun rmdir(arg1: String?): CInt =
    SolidModRawLibc.rmdir(arg1)

public actual fun chdir(arg1: String?): CInt =
    SolidModRawLibc.chdir(arg1)

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    SolidModRawLibc.getwd(arg1?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    SolidModRawLibc.getcwd(arg1?.value ?: 0L, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    SolidModRawLibc.getopt(arg1, arg2?.value ?: 0L, arg3)

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    SolidModRawLibc.getsubopt(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3?.value ?: 0L)

public actual fun getpid(): PidT =
    SolidModRawLibc.getpid()

public actual fun sleep(arg1: CUint): CUint =
    SolidModRawLibc.sleep(arg1)

public actual fun usleep(arg1: UsecondsT): CInt =
    SolidModRawLibc.usleep(arg1)

public actual fun localeconv(): Lconv? =
    SolidModRawLibc.localeconv()

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    SolidModRawLibc.setlocale(arg1, arg2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun duplocale(arg1: LocaleT): LocaleT =
    SolidModRawLibc.duplocale(arg1)

public actual fun freelocale(arg1: LocaleT) {
    SolidModRawLibc.freelocale(arg1)
}

public actual fun localeconvL(arg1: LocaleT): Lconv? =
    SolidModRawLibc.localeconvL(arg1)

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    SolidModRawLibc.newlocale(arg1, arg2, arg3)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    SolidModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    SolidModRawLibc.nlLanginfoL(item, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    SolidModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    SolidModRawLibc.lseek(arg1, arg2, arg3)
