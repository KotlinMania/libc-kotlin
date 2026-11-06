package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.COpaquePointer

public actual fun isalnum(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isalnum(c)") as CInt

public actual fun isalpha(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isalpha(c)") as CInt

public actual fun iscntrl(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').iscntrl(c)") as CInt

public actual fun isdigit(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isdigit(c)") as CInt

public actual fun isgraph(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isgraph(c)") as CInt

public actual fun islower(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').islower(c)") as CInt

public actual fun isprint(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isprint(c)") as CInt

public actual fun ispunct(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ispunct(c)") as CInt

public actual fun isspace(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isspace(c)") as CInt

public actual fun isupper(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isupper(c)") as CInt

public actual fun isxdigit(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isxdigit(c)") as CInt

public actual fun isblank(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isblank(c)") as CInt

public actual fun tolower(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tolower(c)") as CInt

public actual fun toupper(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').toupper(c)") as CInt

public actual fun getStdioFile(fileno: CInt): FILE? =
    js("require('@kotlinmania/libc-native-bindings').getStdioFile(fileno)") as FILE?

public actual fun clearerr(arg1: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').clearerr(arg1?.toLong() ?: 0L)")
}

public actual fun fclose(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fclose(arg1?.toLong() ?: 0L)") as CInt

public actual fun feof(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').feof(arg1?.toLong() ?: 0L)") as CInt

public actual fun ferror(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ferror(arg1?.toLong() ?: 0L)") as CInt

public actual fun fflush(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fflush(arg1?.toLong() ?: 0L)") as CInt

public actual fun fgetc(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetc(arg1?.toLong() ?: 0L)") as CInt

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').fgets(arg1?.value ?: 0L, arg2, arg3?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fopen(arg1, arg2)") as FILE?

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputc(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputs(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fread(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)") as SizeT

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').freopen(arg1, arg2, arg3?.toLong() ?: 0L)") as FILE?

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseek(arg1?.toLong() ?: 0L, arg2, arg3)") as CInt

public actual fun ftell(arg1: FILE?): CLong =
    js("require('@kotlinmania/libc-native-bindings').ftell(arg1?.toLong() ?: 0L)") as CLong

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fwrite(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)") as SizeT

public actual fun getc(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getc(arg1?.toLong() ?: 0L)") as CInt

public actual fun getchar(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getchar()") as CInt

public actual fun perror(arg1: String?) {
    js("require('@kotlinmania/libc-native-bindings').perror(arg1)")
}

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putc(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun putchar(arg1: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').putchar(arg1)") as CInt

public actual fun puts(arg1: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').puts(arg1)") as CInt

public actual fun remove(arg1: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').remove(arg1)") as CInt

public actual fun rewind(arg1: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').rewind(arg1?.toLong() ?: 0L)")
}

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').setbuf(arg1?.toLong() ?: 0L, arg2?.value ?: 0L)")
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setvbuf(arg1?.toLong() ?: 0L, arg2?.value ?: 0L, arg3, arg4)") as CInt

public actual fun tmpfile(): FILE? =
    js("require('@kotlinmania/libc-native-bindings').tmpfile()") as FILE?

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ungetc(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vfprintf(arg1?.toLong() ?: 0L, arg2, arg3)") as CInt

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vprintf(arg1, arg2)") as CInt

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gets(arg1?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').tmpnam(arg1)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vsprintf(arg1?.value ?: 0L, arg2, arg3)") as CInt

public actual fun rename(arg1: String?, arg2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rename(arg1, arg2)") as CInt

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vasiprintf(arg1?.value ?: 0L, arg2, arg3)") as CInt

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vfiprintf(arg1?.toLong() ?: 0L, arg2, arg3)") as CInt

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vfiscanf(arg1?.toLong() ?: 0L, arg2, arg3)") as CInt

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').viprintf(arg1, arg2)") as CInt

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').viscanf(arg1, arg2)") as CInt

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vsiprintf(arg1?.value ?: 0L, arg2, arg3)") as CInt

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vsiscanf(arg1, arg2, arg3)") as CInt

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vsniprintf(arg1?.value ?: 0L, arg2, arg3, arg4)") as CInt

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vdiprintf(arg1, arg2, arg3)") as CInt

public actual fun fgetpos(arg1: FILE?, arg2: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpos(arg1?.toLong() ?: 0L, arg2?.toLong() ?: 0L)") as CInt

public actual fun fsetpos(arg1: FILE?, arg2: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetpos(arg1?.toLong() ?: 0L, arg2?.toLong() ?: 0L)") as CInt

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fdopen(arg1, arg2)") as FILE?

public actual fun fileno(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fileno(arg1?.toLong() ?: 0L)") as CInt

public actual fun flockfile(arg1: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').flockfile(arg1?.toLong() ?: 0L)")
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ftrylockfile(arg1?.toLong() ?: 0L)") as CInt

public actual fun funlockfile(arg1: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').funlockfile(arg1?.toLong() ?: 0L)")
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getcUnlocked(arg1?.toLong() ?: 0L)") as CInt

public actual fun getcharUnlocked(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getcharUnlocked()") as CInt

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putcUnlocked(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun putcharUnlocked(arg1: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').putcharUnlocked(arg1)") as CInt

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    js("require('@kotlinmania/libc-native-bindings').vsnprintf(arg1?.value ?: 0L, arg2, arg3, arg4)") as CInt

public actual fun getw(arg1: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getw(arg1?.toLong() ?: 0L)") as CInt

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putw(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').tempnam(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseeko(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun ftello(stream: FILE?): OffT =
    js("require('@kotlinmania/libc-native-bindings').ftello(stream?.toLong() ?: 0L)") as OffT

public actual fun atof(arg1: String?): Double =
    js("require('@kotlinmania/libc-native-bindings').atof(arg1)") as Double

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    js("require('@kotlinmania/libc-native-bindings').strtod(arg1, arg2?.value ?: 0L)") as Double

public actual fun drand48(): Double =
    js("require('@kotlinmania/libc-native-bindings').drand48()") as Double

public actual fun erand48(arg1: CUshort?): Double =
    js("require('@kotlinmania/libc-native-bindings').erand48(arg1?.toLong() ?: 0L)") as Double

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    js("require('@kotlinmania/libc-native-bindings').strtof(arg1, arg2?.value ?: 0L)") as Float

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    js("require('@kotlinmania/libc-native-bindings').strtold(arg1, arg2?.value ?: 0L)") as Double

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    js("require('@kotlinmania/libc-native-bindings').strtodL(arg1, arg2?.value ?: 0L, arg3)") as Double

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    js("require('@kotlinmania/libc-native-bindings').strtofL(arg1, arg2?.value ?: 0L, arg3)") as Float

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    js("require('@kotlinmania/libc-native-bindings').strtoldL(arg1, arg2?.value ?: 0L, arg3)") as Double

public actual fun exit(arg1: CInt): Nothing =
    js("require('@kotlinmania/libc-native-bindings').exit(arg1)") as Nothing

public actual fun abort(): Nothing =
    js("require('@kotlinmania/libc-native-bindings').abort()") as Nothing

public actual fun abs(arg1: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(arg1)") as CInt

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').atexit(arg1?.toLong() ?: 0L)") as CInt

public actual fun atoi(arg1: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').atoi(arg1)") as CInt

public actual fun atol(arg1: String?): CLong =
    js("require('@kotlinmania/libc-native-bindings').atol(arg1)") as CLong

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').itoa(arg1, arg2?.value ?: 0L, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ltoa(arg1, arg2?.value ?: 0L, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ultoa(arg1, arg2?.value ?: 0L, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').bsearch(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3, arg4, arg5?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').calloc(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    js("require('@kotlinmania/libc-native-bindings').div(arg1, arg2)") as DivT

public actual fun free(arg1: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').free(arg1?.value ?: 0L)")
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getenv(arg1)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun labs(arg1: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(arg1)") as CLong

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    js("require('@kotlinmania/libc-native-bindings').ldiv(arg1, arg2)") as LdivT

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').malloc(arg1)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    js("require('@kotlinmania/libc-native-bindings').qsort(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)")
}

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realloc(arg1?.value ?: 0L, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand(arg1: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(arg1)")
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').strtol(arg1, arg2?.value ?: 0L, arg3)") as CLong

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    js("require('@kotlinmania/libc-native-bindings').strtoul(arg1, arg2?.value ?: 0L, arg3)") as CUlong

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mblen(arg1, arg2)") as CInt

public actual fun mbstowcs(arg1: WcharT?, arg2: String?, arg3: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mbstowcs(arg1?.toLong() ?: 0L, arg2, arg3)") as SizeT

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    js("require('@kotlinmania/libc-native-bindings').wctomb(arg1?.value ?: 0L, arg2)") as CInt

public actual fun mbtowc(arg1: WcharT?, arg2: String?, arg3: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mbtowc(arg1?.toLong() ?: 0L, arg2, arg3)") as CInt

public actual fun wcstombs(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').wcstombs(arg1?.value ?: 0L, arg2?.toLong() ?: 0L, arg3)") as SizeT

public actual fun randR(arg1: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').randR(arg1?.toLong() ?: 0L)") as CInt

public actual fun jrand48(arg1: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').jrand48(arg1?.toLong() ?: 0L)") as CLong

public actual fun lcong48(arg1: CUshort?) {
    js("require('@kotlinmania/libc-native-bindings').lcong48(arg1?.toLong() ?: 0L)")
}

public actual fun lrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').lrand48()") as CLong

public actual fun mrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').mrand48()") as CLong

public actual fun nrand48(arg1: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').nrand48(arg1?.toLong() ?: 0L)") as CLong

public actual fun seed48(arg1: CUshort?): CUshort? =
    js("require('@kotlinmania/libc-native-bindings').seed48(arg1?.toLong() ?: 0L)") as CUshort?

public actual fun srand48(arg1: CLong) {
    js("require('@kotlinmania/libc-native-bindings').srand48(arg1)")
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putenv(arg1?.value ?: 0L)") as CInt

public actual fun a64l(arg1: String?): CLong =
    js("require('@kotlinmania/libc-native-bindings').a64l(arg1)") as CLong

public actual fun l64a(arg1: CLong): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').l64a(arg1)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun random(): CLong =
    js("require('@kotlinmania/libc-native-bindings').random()") as CLong

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').setstate(arg1?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').initstate(arg1, arg2?.value ?: 0L, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srandom(arg1: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srandom(arg1)")
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemp(arg1?.value ?: 0L, arg2)") as CInt

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemps(arg1?.value ?: 0L, arg2, arg3)") as CInt

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mkdtemp(arg1?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemp(arg1?.value ?: 0L)") as CInt

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mktemp(arg1?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun atoll(arg1: String?): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').atoll(arg1)") as CLonglong

public actual fun llabs(arg1: CLonglong): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').llabs(arg1)") as CLonglong

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    js("require('@kotlinmania/libc-native-bindings').lldiv(arg1, arg2)") as LldivT

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strtoll(arg1, arg2?.value ?: 0L, arg3)") as CLonglong

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    js("require('@kotlinmania/libc-native-bindings').strtoull(arg1, arg2?.value ?: 0L, arg3)") as CUlonglong

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').alignedAlloc(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').atQuickExit(arg1?.toLong() ?: 0L)") as CInt

public actual fun quickExit(arg1: CInt) {
    js("require('@kotlinmania/libc-native-bindings').quickExit(arg1)")
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setenv(arg1, arg2, arg3)") as CInt

public actual fun unsetenv(arg1: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unsetenv(arg1)") as CInt

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').humanizeNumber(arg1?.value ?: 0L, arg2, arg3, arg4, arg5, arg6)") as CInt

public actual fun dehumanizeNumber(arg1: String?, arg2: Long?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dehumanizeNumber(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getenvR(arg1, arg2?.value ?: 0L, arg3)") as CInt

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').heapsort(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)") as CInt

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mergesort(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)") as CInt

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').radixsort(arg1?.value ?: 0L, arg2, arg3?.toLong() ?: 0L, arg4)") as CInt

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: CUchar?, arg4: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').sradixsort(arg1?.value ?: 0L, arg2, arg3?.toLong() ?: 0L, arg4)") as CInt

public actual fun getprogname(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getprogname()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(arg1: String?) {
    js("require('@kotlinmania/libc-native-bindings').setprogname(arg1)")
}

public actual fun qabs(arg1: QuadT): QuadT =
    js("require('@kotlinmania/libc-native-bindings').qabs(arg1)") as QuadT

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    js("require('@kotlinmania/libc-native-bindings').strtoq(arg1, arg2?.value ?: 0L, arg3)") as QuadT

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    js("require('@kotlinmania/libc-native-bindings').strtouq(arg1, arg2?.value ?: 0L, arg3)") as UQuadT

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strsuftoll(arg1, arg2, arg3, arg4)") as CLonglong

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strsuftollx(arg1, arg2, arg3, arg4, arg5?.value ?: 0L, arg6)") as CLonglong

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').l64aR(arg1, arg2?.value ?: 0L, arg3)") as CInt

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    js("require('@kotlinmania/libc-native-bindings').qdiv(arg1, arg2)") as QdivT

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    js("require('@kotlinmania/libc-native-bindings').strtolL(arg1, arg2?.value ?: 0L, arg3, arg4)") as CLong

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    js("require('@kotlinmania/libc-native-bindings').strtoulL(arg1, arg2?.value ?: 0L, arg3, arg4)") as CUlong

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strtollL(arg1, arg2?.value ?: 0L, arg3, arg4)") as CLonglong

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    js("require('@kotlinmania/libc-native-bindings').strtoullL(arg1, arg2?.value ?: 0L, arg3, arg4)") as CUlonglong

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    js("require('@kotlinmania/libc-native-bindings').strtoqL(arg1, arg2?.value ?: 0L, arg3, arg4)") as QuadT

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    js("require('@kotlinmania/libc-native-bindings').strtouqL(arg1, arg2?.value ?: 0L, arg3, arg4)") as UQuadT

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mbCurMaxL(arg1)") as SizeT

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mblenL(arg1, arg2, arg3)") as CInt

public actual fun mbstowcsL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mbstowcsL(arg1?.toLong() ?: 0L, arg2, arg3, arg4)") as SizeT

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').wctombL(arg1?.value ?: 0L, arg2, arg3)") as CInt

public actual fun mbtowcL(arg1: WcharT?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mbtowcL(arg1?.toLong() ?: 0L, arg2, arg3, arg4)") as CInt

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: WcharT?, arg3: SizeT, arg4: LocaleT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').wcstombsL(arg1?.value ?: 0L, arg2?.toLong() ?: 0L, arg3, arg4)") as SizeT

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memchr(arg1?.value ?: 0L, arg2, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').memcmp(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)") as CInt

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memcpy(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmove(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memset(arg1?.value ?: 0L, arg2, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcat(arg1?.value ?: 0L, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strchr(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcmp(arg1, arg2)") as CInt

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcoll(arg1, arg2)") as CInt

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcpy(arg1?.value ?: 0L, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strcspn(arg1, arg2)") as SizeT

public actual fun strerror(arg1: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strerror(arg1)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(arg1: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlen(arg1)") as SizeT

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strncat(arg1?.value ?: 0L, arg2, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncmp(arg1, arg2, arg3)") as CInt

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strncpy(arg1?.value ?: 0L, arg2, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strpbrk(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strrchr(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strspn(arg1, arg2)") as SizeT

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strstr(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strtok(arg1?.value ?: 0L, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strtokR(arg1?.value ?: 0L, arg2, arg3?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(arg1, arg2?.value ?: 0L, arg3)") as CInt

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strxfrm(arg1?.value ?: 0L, arg2, arg3)") as SizeT

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memccpy(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3, arg4)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strdup(arg1: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strdup(arg1)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').stpcpy(arg1?.value ?: 0L, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').stpncpy(arg1?.value ?: 0L, arg2, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strnlen(arg1, arg2)") as SizeT

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(arg1?.value ?: 0L, arg2, arg3?.value ?: 0L, arg4)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcasestr(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlcat(arg1?.value ?: 0L, arg2, arg3)") as SizeT

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlcpy(arg1?.value ?: 0L, arg2, arg3)") as SizeT

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strsep(arg1?.value ?: 0L, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').stresep(arg1?.value ?: 0L, arg2, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strndup(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memrchr(arg1?.value ?: 0L, arg2, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').explicitMemset(arg1?.value ?: 0L, arg2, arg3)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').consttimeMemequal(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)") as CInt

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcollL(arg1, arg2, arg3)") as CInt

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strxfrmL(arg1?.value ?: 0L, arg2, arg3, arg4)") as SizeT

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strerrorL(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bcmp(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)") as CInt

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').bcopy(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3)")
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').bzero(arg1?.value ?: 0L, arg2)")
}

public actual fun ffs(arg1: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ffs(arg1)") as CInt

public actual fun popcount(arg1: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').popcount(arg1)") as CUint

public actual fun popcountl(arg1: CUlong): CUint =
    js("require('@kotlinmania/libc-native-bindings').popcountl(arg1)") as CUint

public actual fun popcountll(arg1: CUlonglong): CUint =
    js("require('@kotlinmania/libc-native-bindings').popcountll(arg1)") as CUint

public actual fun popcount32(arg1: UInt): CUint =
    js("require('@kotlinmania/libc-native-bindings').popcount32(arg1)") as CUint

public actual fun popcount64(arg1: ULong): CUint =
    js("require('@kotlinmania/libc-native-bindings').popcount64(arg1)") as CUint

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').rindex(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcasecmp(arg1, arg2)") as CInt

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncasecmp(arg1, arg2, arg3)") as CInt

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    js("require('@kotlinmania/libc-native-bindings').signal(arg1, arg2)") as SighandlerT

public actual fun raise(arg1: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').raise(arg1)") as CInt

public actual fun asctime(arg1: Tm?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctime(arg1?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clock(): ClockT =
    js("require('@kotlinmania/libc-native-bindings').clock()") as ClockT

public actual fun ctime(arg1: Long?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctime(arg1?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    js("require('@kotlinmania/libc-native-bindings').difftime(arg1, arg2)") as Double

public actual fun gmtime(arg1: Long?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtime(arg1?.toLong() ?: 0L)") as Tm?

public actual fun localtime(arg1: Long?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtime(arg1?.toLong() ?: 0L)") as Tm?

public actual fun time(arg1: Long?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').time(arg1?.toLong() ?: 0L)") as TimeT

public actual fun mktime(arg1: Tm?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').mktime(arg1?.toLong() ?: 0L)") as TimeT

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)") as SizeT

public actual fun utime(arg1: String?, arg2: Long?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utime(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun asctimeR(arg1: Tm?, arg2: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctimeR(arg1?.toLong() ?: 0L, arg2?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(arg1: Long?, arg2: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctimeR(arg1?.toLong() ?: 0L, arg2?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gmtimeR(arg1: Long?, arg2: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtimeR(arg1?.toLong() ?: 0L, arg2?.toLong() ?: 0L)") as Tm?

public actual fun localtimeR(arg1: Long?, arg2: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtimeR(arg1?.toLong() ?: 0L, arg2?.toLong() ?: 0L)") as Tm?

public actual fun stat(arg1: String?, arg2: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun lstat(arg1: String?, arg2: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lstat(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun fstat(arg1: CInt, arg2: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat(arg1, arg2?.toLong() ?: 0L)") as CInt

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').chmod(arg1, arg2)") as CInt

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkdir(arg1, arg2)") as CInt

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').creat(arg1, arg2)") as CInt

public actual fun close(arg1: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').close(arg1)") as CInt

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').read(arg1, arg2?.value ?: 0L, arg3)") as CInt

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').write(arg1, arg2?.value ?: 0L, arg3)") as CInt

public actual fun unlink(arg1: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlink(arg1)") as CInt

public actual fun tell(arg1: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').tell(arg1)") as CLong

public actual fun dup(arg1: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup(arg1)") as CInt

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup2(arg1, arg2)") as CInt

public actual fun access(arg1: String?, arg2: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').access(arg1, arg2)") as CInt

public actual fun rmdir(arg1: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rmdir(arg1)") as CInt

public actual fun chdir(arg1: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').chdir(arg1)") as CInt

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getwd(arg1?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getcwd(arg1?.value ?: 0L, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getopt(arg1, arg2?.value ?: 0L, arg3)") as CInt

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsubopt(arg1?.value ?: 0L, arg2?.value ?: 0L, arg3?.value ?: 0L)") as CInt

public actual fun getpid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').getpid()") as PidT

public actual fun sleep(arg1: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').sleep(arg1)") as CUint

public actual fun usleep(arg1: UsecondsT): CInt =
    js("require('@kotlinmania/libc-native-bindings').usleep(arg1)") as CInt

public actual fun localeconv(): Lconv? =
    js("require('@kotlinmania/libc-native-bindings').localeconv()") as Lconv?

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').setlocale(arg1, arg2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun duplocale(arg1: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(arg1)") as LocaleT

public actual fun freelocale(arg1: LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(arg1)")
}

public actual fun localeconvL(arg1: LocaleT): Lconv? =
    js("require('@kotlinmania/libc-native-bindings').localeconvL(arg1)") as Lconv?

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(arg1, arg2, arg3)") as LocaleT

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfoL(item, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    js("require('@kotlinmania/libc-native-bindings').lseek(arg1, arg2, arg3)") as OffT
