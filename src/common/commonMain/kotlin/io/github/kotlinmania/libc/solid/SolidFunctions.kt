package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.solid.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface AtexitArg1Callback {
    public operator fun invoke()
}

public fun interface BsearchArg5Callback {
    public operator fun invoke(arg1: ConstPtr, arg2: ConstPtr): CInt
}

// ctype.h
public expect fun isalnum(c: CInt): CInt

public expect fun isalpha(c: CInt): CInt

public expect fun iscntrl(c: CInt): CInt

public expect fun isdigit(c: CInt): CInt

public expect fun isgraph(c: CInt): CInt

public expect fun islower(c: CInt): CInt

public expect fun isprint(c: CInt): CInt

public expect fun ispunct(c: CInt): CInt

public expect fun isspace(c: CInt): CInt

public expect fun isupper(c: CInt): CInt

public expect fun isxdigit(c: CInt): CInt

public expect fun isblank(c: CInt): CInt

public expect fun tolower(c: CInt): CInt

public expect fun toupper(c: CInt): CInt

// stdio.h
public expect fun getStdioFile(fileno: CInt): MutPtr

public expect fun clearerr(arg1: MutPtr)

public expect fun fclose(arg1: MutPtr): CInt

public expect fun feof(arg1: MutPtr): CInt

public expect fun ferror(arg1: MutPtr): CInt

public expect fun fflush(arg1: MutPtr): CInt

public expect fun fgetc(arg1: MutPtr): CInt

public expect fun fgets(arg1: MutPtr, arg2: CInt, arg3: MutPtr): MutPtr

public expect fun fopen(arg1: ConstPtr, arg2: ConstPtr): MutPtr

public expect fun fprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fputc(arg1: CInt, arg2: MutPtr): CInt

public expect fun fputs(arg1: ConstPtr, arg2: MutPtr): CInt

public expect fun fread(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: MutPtr): SizeT

public expect fun freopen(arg1: ConstPtr, arg2: ConstPtr, arg3: MutPtr): MutPtr

public expect fun fscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fseek(arg1: MutPtr, arg2: CLong, arg3: CInt): CInt

public expect fun ftell(arg1: MutPtr): CLong

public expect fun fwrite(arg1: ConstPtr, arg2: SizeT, arg3: SizeT, arg4: MutPtr): SizeT

public expect fun getc(arg1: MutPtr): CInt

public expect fun getchar(): CInt

public expect fun perror(arg1: ConstPtr)

public expect fun printf(arg1: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun putc(arg1: CInt, arg2: MutPtr): CInt

public expect fun putchar(arg1: CInt): CInt

public expect fun puts(arg1: ConstPtr): CInt

public expect fun remove(arg1: ConstPtr): CInt

public expect fun rewind(arg1: MutPtr)

public expect fun scanf(arg1: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun setbuf(arg1: MutPtr, arg2: MutPtr)

public expect fun setvbuf(arg1: MutPtr, arg2: MutPtr, arg3: CInt, arg4: SizeT): CInt

public expect fun sscanf(arg1: ConstPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun tmpfile(): MutPtr

public expect fun ungetc(arg1: CInt, arg2: MutPtr): CInt

public expect fun vfprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt

public expect fun vprintf(arg1: ConstPtr, arg2: VaList): CInt

public expect fun gets(arg1: MutPtr): MutPtr

public expect fun sprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun tmpnam(arg1: ConstPtr): MutPtr

public expect fun vsprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt

public expect fun rename(arg1: ConstPtr, arg2: ConstPtr): CInt

public expect fun asiprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fiprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fiscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun iprintf(arg1: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun iscanf(arg1: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun siprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun siscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sniprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun vasiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt

public expect fun vfiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt

public expect fun vfiscanf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt

public expect fun viprintf(arg1: ConstPtr, arg2: VaList): CInt

public expect fun viscanf(arg1: ConstPtr, arg2: VaList): CInt

public expect fun vsiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt

public expect fun vsiscanf(arg1: ConstPtr, arg2: ConstPtr, arg3: VaList): CInt

public expect fun vsniprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: VaList): CInt

public expect fun vdiprintf(arg1: CInt, arg2: ConstPtr, arg3: VaList): CInt

public expect fun diprintf(arg1: CInt, arg2: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fgetpos(arg1: MutPtr, arg2: MutPtr): CInt

public expect fun fsetpos(arg1: MutPtr, arg2: ConstPtr): CInt

public expect fun fdopen(arg1: CInt, arg2: ConstPtr): MutPtr

public expect fun fileno(arg1: MutPtr): CInt

public expect fun flockfile(arg1: MutPtr)

public expect fun ftrylockfile(arg1: MutPtr): CInt

public expect fun funlockfile(arg1: MutPtr)

public expect fun getcUnlocked(arg1: MutPtr): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcUnlocked(arg1: CInt, arg2: MutPtr): CInt

public expect fun putcharUnlocked(arg1: CInt): CInt

public expect fun snprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun vsnprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: VaList): CInt

public expect fun getw(arg1: MutPtr): CInt

public expect fun putw(arg1: CInt, arg2: MutPtr): CInt

public expect fun tempnam(arg1: ConstPtr, arg2: ConstPtr): MutPtr

public expect fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: MutPtr): OffT

// stdlib.h
public expect fun atof(arg1: ConstPtr): Double

public expect fun strtod(arg1: ConstPtr, arg2: MutPtr): Double

public expect fun drand48(): Double

public expect fun erand48(arg1: MutPtr): Double

public expect fun strtof(arg1: ConstPtr, arg2: MutPtr): Float

public expect fun strtold(arg1: ConstPtr, arg2: MutPtr): Double

public expect fun strtodL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Double

public expect fun strtofL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Float

public expect fun strtoldL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Double

public expect fun exit(arg1: CInt): Nothing

public expect fun abort(): Nothing

public expect fun abs(arg1: CInt): CInt

public expect fun atexit(arg1: AtexitArg1Callback?): CInt

public expect fun atoi(arg1: ConstPtr): CInt

public expect fun atol(arg1: ConstPtr): CLong

public expect fun itoa(arg1: CInt, arg2: MutPtr, arg3: CInt): MutPtr

public expect fun ltoa(arg1: CLong, arg2: MutPtr, arg3: CInt): MutPtr

public expect fun ultoa(arg1: CUlong, arg2: MutPtr, arg3: CInt): MutPtr

public expect fun bsearch(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): MutPtr

public expect fun calloc(arg1: SizeT, arg2: SizeT): MutPtr

public expect fun div(arg1: CInt, arg2: CInt): DivT

public expect fun free(arg1: MutPtr)

public expect fun getenv(arg1: ConstPtr): MutPtr

public expect fun labs(arg1: CLong): CLong

public expect fun ldiv(arg1: CLong, arg2: CLong): LdivT

public expect fun malloc(arg1: SizeT): MutPtr

public expect fun qsort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?)

public expect fun rand(): CInt

public expect fun realloc(arg1: MutPtr, arg2: SizeT): MutPtr

public expect fun srand(arg1: CUint)

public expect fun strtol(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CLong

public expect fun strtoul(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CUlong

public expect fun mblen(arg1: ConstPtr, arg2: SizeT): CInt

public expect fun mbstowcs(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT

public expect fun wctomb(arg1: MutPtr, arg2: WcharT): CInt

public expect fun mbtowc(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): CInt

public expect fun wcstombs(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT

public expect fun randR(arg1: MutPtr): CInt

public expect fun jrand48(arg1: MutPtr): CLong

public expect fun lcong48(arg1: MutPtr)

public expect fun lrand48(): CLong

public expect fun mrand48(): CLong

public expect fun nrand48(arg1: MutPtr): CLong

public expect fun seed48(arg1: MutPtr): MutPtr

public expect fun srand48(arg1: CLong)

public expect fun putenv(arg1: MutPtr): CInt

public expect fun a64l(arg1: ConstPtr): CLong

public expect fun l64a(arg1: CLong): MutPtr

public expect fun random(): CLong

public expect fun setstate(arg1: MutPtr): MutPtr

public expect fun initstate(arg1: CUint, arg2: MutPtr, arg3: SizeT): MutPtr

public expect fun srandom(arg1: CUint)

public expect fun mkostemp(arg1: MutPtr, arg2: CInt): CInt

public expect fun mkostemps(arg1: MutPtr, arg2: CInt, arg3: CInt): CInt

public expect fun mkdtemp(arg1: MutPtr): MutPtr

public expect fun mkstemp(arg1: MutPtr): CInt

public expect fun mktemp(arg1: MutPtr): MutPtr

public expect fun atoll(arg1: ConstPtr): CLonglong

public expect fun llabs(arg1: CLonglong): CLonglong

public expect fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT

public expect fun strtoll(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CLonglong

public expect fun strtoull(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CUlonglong

public expect fun alignedAlloc(arg1: SizeT, arg2: SizeT): MutPtr

public expect fun atQuickExit(arg1: AtexitArg1Callback?): CInt

public expect fun quickExit(arg1: CInt)

public expect fun setenv(arg1: ConstPtr, arg2: ConstPtr, arg3: CInt): CInt

public expect fun unsetenv(arg1: ConstPtr): CInt

public expect fun humanizeNumber(arg1: MutPtr, arg2: SizeT, arg3: Long, arg4: ConstPtr, arg5: CInt, arg6: CInt): CInt

public expect fun dehumanizeNumber(arg1: ConstPtr, arg2: MutPtr): CInt

public expect fun getenvR(arg1: ConstPtr, arg2: MutPtr, arg3: SizeT): CInt

public expect fun heapsort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt

public expect fun mergesort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt

public expect fun radixsort(arg1: MutPtr, arg2: CInt, arg3: ConstPtr, arg4: CUint): CInt

public expect fun sradixsort(arg1: MutPtr, arg2: CInt, arg3: ConstPtr, arg4: CUint): CInt

public expect fun getprogname(): ConstPtr

public expect fun setprogname(arg1: ConstPtr)

public expect fun qabs(arg1: QuadT): QuadT

public expect fun strtoq(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): QuadT

public expect fun strtouq(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): UQuadT

public expect fun strsuftoll(arg1: ConstPtr, arg2: ConstPtr, arg3: CLonglong, arg4: CLonglong): CLonglong

public expect fun strsuftollx(arg1: ConstPtr, arg2: ConstPtr, arg3: CLonglong, arg4: CLonglong, arg5: MutPtr, arg6: SizeT): CLonglong

public expect fun l64aR(arg1: CLong, arg2: MutPtr, arg3: CInt): CInt

public expect fun qdiv(arg1: QuadT, arg2: QuadT): QdivT

public expect fun strtolL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CLong

public expect fun strtoulL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CUlong

public expect fun strtollL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CLonglong

public expect fun strtoullL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CUlonglong

public expect fun strtoqL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): QuadT

public expect fun strtouqL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): UQuadT

public expect fun mbCurMaxL(arg1: LocaleT): SizeT

public expect fun mblenL(arg1: ConstPtr, arg2: SizeT, arg3: LocaleT): CInt

public expect fun mbstowcsL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT

public expect fun wctombL(arg1: MutPtr, arg2: WcharT, arg3: LocaleT): CInt

public expect fun mbtowcL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): CInt

public expect fun wcstombsL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT

// string.h
public expect fun memchr(arg1: ConstPtr, arg2: CInt, arg3: SizeT): MutPtr

public expect fun memcmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt

public expect fun memcpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr

public expect fun memmove(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr

public expect fun memset(arg1: MutPtr, arg2: CInt, arg3: SizeT): MutPtr

public expect fun strcat(arg1: MutPtr, arg2: ConstPtr): MutPtr

public expect fun strchr(arg1: ConstPtr, arg2: CInt): MutPtr

public expect fun strcmp(arg1: ConstPtr, arg2: ConstPtr): CInt

public expect fun strcoll(arg1: ConstPtr, arg2: ConstPtr): CInt

public expect fun strcpy(arg1: MutPtr, arg2: ConstPtr): MutPtr

public expect fun strcspn(arg1: ConstPtr, arg2: ConstPtr): SizeT

public expect fun strerror(arg1: CInt): MutPtr

public expect fun strlen(arg1: ConstPtr): SizeT

public expect fun strncat(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr

public expect fun strncmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt

public expect fun strncpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr

public expect fun strpbrk(arg1: ConstPtr, arg2: ConstPtr): MutPtr

public expect fun strrchr(arg1: ConstPtr, arg2: CInt): MutPtr

public expect fun strspn(arg1: ConstPtr, arg2: ConstPtr): SizeT

public expect fun strstr(arg1: ConstPtr, arg2: ConstPtr): MutPtr

public expect fun strtok(arg1: MutPtr, arg2: ConstPtr): MutPtr

public expect fun strtokR(arg1: MutPtr, arg2: ConstPtr, arg3: MutPtr): MutPtr

public expect fun strerrorR(arg1: CInt, arg2: MutPtr, arg3: SizeT): CInt

public expect fun strxfrm(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT

public expect fun memccpy(arg1: MutPtr, arg2: ConstPtr, arg3: CInt, arg4: SizeT): MutPtr

public expect fun strdup(arg1: ConstPtr): MutPtr

public expect fun stpcpy(arg1: MutPtr, arg2: ConstPtr): MutPtr

public expect fun stpncpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr

public expect fun strnlen(arg1: ConstPtr, arg2: SizeT): SizeT

public expect fun memmem(arg1: ConstPtr, arg2: SizeT, arg3: ConstPtr, arg4: SizeT): MutPtr

public expect fun strcasestr(arg1: ConstPtr, arg2: ConstPtr): MutPtr

public expect fun strlcat(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT

public expect fun strlcpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT

public expect fun strsep(arg1: MutPtr, arg2: ConstPtr): MutPtr

public expect fun stresep(arg1: MutPtr, arg2: ConstPtr, arg3: CInt): MutPtr

public expect fun strndup(arg1: ConstPtr, arg2: SizeT): MutPtr

public expect fun memrchr(arg1: ConstPtr, arg2: CInt, arg3: SizeT): MutPtr

public expect fun explicitMemset(arg1: MutPtr, arg2: CInt, arg3: SizeT): MutPtr

public expect fun consttimeMemequal(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt

public expect fun strcollL(arg1: ConstPtr, arg2: ConstPtr, arg3: LocaleT): CInt

public expect fun strxfrmL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT

public expect fun strerrorL(arg1: CInt, arg2: LocaleT): MutPtr

// strings.h
public expect fun bcmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt

public expect fun bcopy(arg1: ConstPtr, arg2: MutPtr, arg3: SizeT)

public expect fun bzero(arg1: MutPtr, arg2: SizeT)

public expect fun ffs(arg1: CInt): CInt

public expect fun popcount(arg1: CUint): CUint

public expect fun popcountl(arg1: CUlong): CUint

public expect fun popcountll(arg1: CUlonglong): CUint

public expect fun popcount32(arg1: UInt): CUint

public expect fun popcount64(arg1: ULong): CUint

public expect fun rindex(arg1: ConstPtr, arg2: CInt): MutPtr

public expect fun strcasecmp(arg1: ConstPtr, arg2: ConstPtr): CInt

public expect fun strncasecmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt

// signal.h
public expect fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT

public expect fun raise(arg1: CInt): CInt

// time.h
public expect fun asctime(arg1: ConstPtr): MutPtr

public expect fun clock(): ClockT

public expect fun ctime(arg1: ConstPtr): MutPtr

public expect fun difftime(arg1: TimeT, arg2: TimeT): Double

public expect fun gmtime(arg1: ConstPtr): MutPtr

public expect fun localtime(arg1: ConstPtr): MutPtr

public expect fun time(arg1: MutPtr): TimeT

public expect fun mktime(arg1: MutPtr): TimeT

public expect fun strftime(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: ConstPtr): SizeT

public expect fun utime(arg1: ConstPtr, arg2: MutPtr): CInt

public expect fun asctimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr

public expect fun ctimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr

public expect fun gmtimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr

public expect fun localtimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr

// sys/stat.h
public expect fun stat(arg1: ConstPtr, arg2: MutPtr): CInt

public expect fun lstat(arg1: ConstPtr, arg2: MutPtr): CInt

public expect fun fstat(arg1: CInt, arg2: MutPtr): CInt

public expect fun chmod(arg1: ConstPtr, arg2: ModeT): CInt

public expect fun mkdir(arg1: ConstPtr, arg2: ModeT): CInt

// fcntl.h
public expect fun open(arg1: ConstPtr, arg2: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(arg1: ConstPtr, arg2: CInt): CInt

public expect fun close(arg1: CInt): CInt

public expect fun read(arg1: CInt, arg2: MutPtr, arg3: CInt): CInt

public expect fun write(arg1: CInt, arg2: ConstPtr, arg3: CInt): CInt

public expect fun unlink(arg1: ConstPtr): CInt

public expect fun tell(arg1: CInt): CLong

public expect fun dup(arg1: CInt): CInt

public expect fun dup2(arg1: CInt, arg2: CInt): CInt

public expect fun access(arg1: ConstPtr, arg2: CInt): CInt

public expect fun rmdir(arg1: ConstPtr): CInt

public expect fun chdir(arg1: ConstPtr): CInt

public expect fun getwd(arg1: MutPtr): MutPtr

public expect fun getcwd(arg1: MutPtr, arg2: SizeT): MutPtr

public expect var OPTARG: MutPtr

public expect var OPTERR: CInt

public expect var OPTIND: CInt

public expect var OPTOPT: CInt

public expect var OPTRESET: CInt

public expect fun getopt(arg1: CInt, arg2: MutPtr, arg3: ConstPtr): CInt

public expect var SUBOPTARG: MutPtr

public expect fun getsubopt(arg1: MutPtr, arg2: ConstPtr, arg3: MutPtr): CInt

public expect fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt

public expect fun getpid(): PidT

public expect fun sleep(arg1: CUint): CUint

public expect fun usleep(arg1: UsecondsT): CInt

// locale.h
public expect fun localeconv(): MutPtr

public expect fun setlocale(arg1: CInt, arg2: ConstPtr): MutPtr

public expect fun duplocale(arg1: LocaleT): LocaleT

public expect fun freelocale(arg1: LocaleT)

public expect fun localeconvL(arg1: LocaleT): MutPtr

public expect fun newlocale(arg1: CInt, arg2: ConstPtr, arg3: LocaleT): LocaleT

// langinfo.h
public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr

// malloc.h
public expect fun memalign(align: SizeT, size: SizeT): MutPtr

// sys/types.h
public expect fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT
