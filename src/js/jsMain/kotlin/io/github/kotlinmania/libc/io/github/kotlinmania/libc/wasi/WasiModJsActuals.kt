package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.COpaquePointer

public actual fun exit(code: CInt): Nothing =
    js("require('@kotlinmania/libc-native-bindings').exit(code)") as Nothing

public actual fun abort(): Nothing =
    js("require('@kotlinmania/libc-native-bindings').abort()") as Nothing

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').alignedAlloc(a, b)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').calloc(amt, amt2)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(ptr: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').free(ptr?.value ?: 0L)")
}

public actual fun getenv(s: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getenv(s)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(amt: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').malloc(amt)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mallocUsableSize(ptr?.value ?: 0L)") as SizeT

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sbrk(increment)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').read(fd, ptr?.value ?: 0L, size)") as SsizeT

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realloc(ptr?.value ?: 0L, amt)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setenv(k, v, a)") as CInt

public actual fun unsetenv(k: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unsetenv(k)") as CInt

public actual fun clearenv(): CInt =
    js("require('@kotlinmania/libc-native-bindings').clearenv()") as CInt

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').write(fd, ptr?.value ?: 0L, size)") as SsizeT

public actual fun fopen(a: String?, b: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fopen(a, b)") as FILE?

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').freopen(a, b, f?.toLong() ?: 0L)") as FILE?

public actual fun fclose(f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fclose(f?.toLong() ?: 0L)") as CInt

public actual fun remove(a: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').remove(a)") as CInt

public actual fun rename(a: String?, b: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rename(a, b)") as CInt

public actual fun feof(f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').feof(f?.toLong() ?: 0L)") as CInt

public actual fun ferror(f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ferror(f?.toLong() ?: 0L)") as CInt

public actual fun fflush(f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fflush(f?.toLong() ?: 0L)") as CInt

public actual fun clearerr(f: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').clearerr(f?.toLong() ?: 0L)")
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseek(f?.toLong() ?: 0L, b, c)") as CInt

public actual fun ftell(f: FILE?): CLong =
    js("require('@kotlinmania/libc-native-bindings').ftell(f?.toLong() ?: 0L)") as CLong

public actual fun rewind(f: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').rewind(f?.toLong() ?: 0L)")
}

public actual fun fgetpos(f: FILE?, pos: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpos(f?.toLong() ?: 0L, pos?.toLong() ?: 0L)") as CInt

public actual fun fsetpos(f: FILE?, pos: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetpos(f?.toLong() ?: 0L, pos?.toLong() ?: 0L)") as CInt

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fread(buf?.value ?: 0L, a, b, f?.toLong() ?: 0L)") as SizeT

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fwrite(buf?.value ?: 0L, a, b, f?.toLong() ?: 0L)") as SizeT

public actual fun fgetc(f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetc(f?.toLong() ?: 0L)") as CInt

public actual fun getc(f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getc(f?.toLong() ?: 0L)") as CInt

public actual fun getchar(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getchar()") as CInt

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ungetc(a, f?.toLong() ?: 0L)") as CInt

public actual fun fputc(a: CInt, f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputc(a, f?.toLong() ?: 0L)") as CInt

public actual fun putc(a: CInt, f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putc(a, f?.toLong() ?: 0L)") as CInt

public actual fun putchar(a: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').putchar(a)") as CInt

public actual fun fputs(a: String?, f: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputs(a, f?.toLong() ?: 0L)") as CInt

public actual fun puts(a: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').puts(a)") as CInt

public actual fun perror(a: String?) {
    js("require('@kotlinmania/libc-native-bindings').perror(a)")
}

public actual fun srand(a: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(a)")
}

public actual fun atexit(a: AtexitACallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').atexit(a)") as CInt

public actual fun atQuickExit(a: AtexitACallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').atQuickExit(a)") as CInt

public actual fun quickExit(a: CInt): Nothing =
    js("require('@kotlinmania/libc-native-bindings').quickExit(a)") as Nothing

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMemalign(a?.value ?: 0L, b, c)") as CInt

public actual fun randR(a: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').randR(a?.toLong() ?: 0L)") as CInt

public actual fun random(): CLong =
    js("require('@kotlinmania/libc-native-bindings').random()") as CLong

public actual fun srandom(a: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srandom(a)")
}

public actual fun putenv(a: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putenv(a?.value ?: 0L)") as CInt

public actual fun clock(): ClockT =
    js("require('@kotlinmania/libc-native-bindings').clock()") as ClockT

public actual fun time(a: CLonglong?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').time(a?.toLong() ?: 0L)") as TimeT

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    js("require('@kotlinmania/libc-native-bindings').difftime(a, b)") as CDouble

public actual fun mktime(a: Tm?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').mktime(a?.toLong() ?: 0L)") as TimeT

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(a?.value ?: 0L, b, c, d?.toLong() ?: 0L)") as SizeT

public actual fun gmtime(a: CLonglong?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtime(a?.toLong() ?: 0L)") as Tm?

public actual fun gmtimeR(a: CLonglong?, b: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').gmtimeR(a?.toLong() ?: 0L, b?.toLong() ?: 0L)") as Tm?

public actual fun localtime(a: CLonglong?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtime(a?.toLong() ?: 0L)") as Tm?

public actual fun localtimeR(a: CLonglong?, b: Tm?): Tm? =
    js("require('@kotlinmania/libc-native-bindings').localtimeR(a?.toLong() ?: 0L, b?.toLong() ?: 0L)") as Tm?

public actual fun asctimeR(a: Tm?, b: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctimeR(a?.toLong() ?: 0L, b?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(a: CLonglong?, b: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctimeR(a?.toLong() ?: 0L, b?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nanosleep(a: Timespec?, b: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').nanosleep(a?.toLong() ?: 0L, b?.toLong() ?: 0L)") as CInt

public actual fun clockGetres(a: ClockidT, b: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(a, b?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(a: ClockidT, b: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(a, b?.toLong() ?: 0L)") as CInt

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: Timespec?, c: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(a, a2, b?.toLong() ?: 0L, c?.toLong() ?: 0L)") as CInt

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

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)") as CInt

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').setbuf(stream?.toLong() ?: 0L, buf?.value ?: 0L)")
}

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').fgets(buf?.value ?: 0L, n, stream?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun atof(s: String?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').atof(s)") as CDouble

public actual fun atoi(s: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').atoi(s)") as CInt

public actual fun atol(s: String?): CLong =
    js("require('@kotlinmania/libc-native-bindings').atol(s)") as CLong

public actual fun atoll(s: String?): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').atoll(s)") as CLonglong

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').strtod(s, endp?.value ?: 0L)") as CDouble

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    js("require('@kotlinmania/libc-native-bindings').strtof(s, endp?.value ?: 0L)") as CFloat

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').strtol(s, endp?.value ?: 0L, base)") as CLong

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strtoll(s, endp?.value ?: 0L, base)") as CLonglong

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    js("require('@kotlinmania/libc-native-bindings').strtoul(s, endp?.value ?: 0L, base)") as CUlong

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    js("require('@kotlinmania/libc-native-bindings').strtoull(s, endp?.value ?: 0L, base)") as CUlonglong

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcpy(dst?.value ?: 0L, src)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strncpy(dst?.value ?: 0L, src, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcat(s?.value ?: 0L, ct)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strncat(s?.value ?: 0L, ct, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcmp(cs, ct)") as CInt

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncmp(cs, ct, n)") as CInt

public actual fun strcoll(cs: String?, ct: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcoll(cs, ct)") as CInt

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strchr(cs, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strrchr(cs, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strspn(cs, ct)") as SizeT

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strcspn(cs, ct)") as SizeT

public actual fun strdup(cs: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strdup(cs)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strndup(cs, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strpbrk(cs, ct)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strstr(cs, ct)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcasecmp(s1, s2)") as CInt

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncasecmp(s1, s2, n)") as CInt

public actual fun strlen(cs: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlen(cs)") as SizeT

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strnlen(cs, maxlen)") as SizeT

public actual fun strerror(n: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strerror(n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strtok(s?.value ?: 0L, t)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strxfrm(s?.value ?: 0L, ct, n)") as SizeT

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').memcmp(cx?.value ?: 0L, ct?.value ?: 0L, n)") as CInt

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memcpy(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmove(dest?.value ?: 0L, src?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memset(dest?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getcharUnlocked(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getcharUnlocked()") as CInt

public actual fun putcharUnlocked(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').putcharUnlocked(c)") as CInt

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shutdown(socket, how)") as CInt

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat(fildes, buf?.toLong() ?: 0L)") as CInt

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkdir(path, mode)") as CInt

public actual fun stat(path: String?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fdopen(fd, mode)") as FILE?

public actual fun fileno(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fileno(stream?.toLong() ?: 0L)") as CInt

public actual fun creat(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').creat(path, mode)") as CInt

public actual fun opendir(dirname: String?): DIR? =
    js("require('@kotlinmania/libc-native-bindings').opendir(dirname)") as DIR?

public actual fun fdopendir(fd: CInt): DIR? =
    js("require('@kotlinmania/libc-native-bindings').fdopendir(fd)") as DIR?

public actual fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent? =
    js("require('@kotlinmania/libc-native-bindings').readdir(dirp?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Dirent?

public actual fun closedir(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').closedir(dirp?.toLong() ?: 0L)") as CInt

public actual fun rewinddir(dirp: DIR?) {
    js("require('@kotlinmania/libc-native-bindings').rewinddir(dirp?.toLong() ?: 0L)")
}

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatat(dirfd, pathname, buf?.toLong() ?: 0L, flags)") as CInt

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').linkat(olddirfd, oldpath, newdirfd, newpath, flags)") as CInt

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkdirat(dirfd, pathname, mode)") as CInt

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readlinkat(dirfd, pathname, buf?.value ?: 0L, bufsiz)") as SsizeT

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').renameat(olddirfd, oldpath, newdirfd, newpath)") as CInt

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').symlinkat(target, newdirfd, linkpath)") as CInt

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlinkat(dirfd, pathname, flags)") as CInt

public actual fun access(path: String?, amode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').access(path, amode)") as CInt

public actual fun close(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').close(fd)") as CInt

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').fpathconf(filedes, name)") as CLong

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getopt(argc, argv?.value ?: 0L, optstr)") as CInt

public actual fun isatty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isatty(fd)") as CInt

public actual fun link(src: String?, dst: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').link(src, dst)") as CInt

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    js("require('@kotlinmania/libc-native-bindings').lseek(fd, offset, whence)") as OffT

public actual fun pathconf(path: String?, name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').pathconf(path, name)") as CLong

public actual fun rmdir(path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rmdir(path)") as CInt

public actual fun sleep(secs: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').sleep(secs)") as CUint

public actual fun unlink(c: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlink(c)") as CInt

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pread(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwrite(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun lstat(path: String?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lstat(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fsync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsync(fd)") as CInt

public actual fun fdatasync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fdatasync(fd)") as CInt

public actual fun symlink(path1: String?, path2: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').symlink(path1, path2)") as CInt

public actual fun truncate(path: String?, length: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').truncate(path, length)") as CInt

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ftruncate(fd, length)") as CInt

public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrusage(resource, usage?.toLong() ?: 0L)") as CInt

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT =
    js("require('@kotlinmania/libc-native-bindings').times(buf?.toLong() ?: 0L)") as io.github.kotlinmania.libc.ClockT

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun usleep(secs: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').usleep(secs)") as CInt

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').send(socket, buf?.value ?: 0L, len, flags)") as SsizeT

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recv(socket, buf?.value ?: 0L, len, flags)") as SsizeT

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').poll(fds?.toLong() ?: 0L, nfds, timeout)") as CInt

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').setlocale(category, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): Lconv? =
    js("require('@kotlinmania/libc-native-bindings').localeconv()") as Lconv?

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readlink(path, buf?.value ?: 0L, bufsz)") as SsizeT

public actual fun timegm(tm: io.github.kotlinmania.libc.Tm?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').timegm(tm?.toLong() ?: 0L)") as TimeT

public actual fun sysconf(name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').sysconf(name)") as CLong

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseeko(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun ftello(stream: FILE?): OffT =
    js("require('@kotlinmania/libc-native-bindings').ftello(stream?.toLong() ?: 0L)") as OffT

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strcasestr(cs, ct)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getline(lineptr?.value ?: 0L, n?.toLong() ?: 0L, stream?.toLong() ?: 0L)") as SsizeT

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(dirfd, pathname, mode, flags)") as CInt

public actual fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun pwritev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun preadv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise(fd, offset, len, advise)") as CInt

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buf?.value ?: 0L, buflen)") as CInt

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memrchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(i)") as CInt

public actual fun labs(i: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(i)") as CLong

public actual fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(base)") as io.github.kotlinmania.libc.LocaleT

public actual fun freelocale(loc: io.github.kotlinmania.libc.LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as io.github.kotlinmania.libc.LocaleT

public actual fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    js("require('@kotlinmania/libc-native-bindings').uselocale(loc)") as io.github.kotlinmania.libc.LocaleT

public actual fun schedYield(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedYield()") as CInt

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getcwd(buf?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun chdir(dir: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').chdir(dir)") as CInt

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, loc: io.github.kotlinmania.libc.LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfoL(item, loc)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').select(nfds, readfds?.toLong() ?: 0L, writefds?.toLong() ?: 0L, errorfds?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcRegisterPreopenedFd(fd, path)") as CInt

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcFdRenumber(fd, newfd)") as CInt

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcUnlinkat(fd, path)") as CInt

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcRmdirat(fd, path)") as CInt

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcFindRelpath(path, absPrefix?.value ?: 0L, relativePath?.value ?: 0L, relativePathLen)") as CInt

public actual fun wasilibcTell(fd: CInt): OffT =
    js("require('@kotlinmania/libc-native-bindings').wasilibcTell(fd)") as OffT

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdWasilibcUnlinkat(dirfd, path)") as CInt

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdWasilibcRmdirat(dirfd, path)") as CInt

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdLinkat(olddirfd, oldpath, newdirfd, newpath, flags)") as CInt

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdSymlinkat(target, dirfd, path)") as CInt

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdReadlinkat(dirfd, path, buf?.value ?: 0L, bufsize)") as Long

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdFaccessat(dirfd, path, mode, flags)") as CInt

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdRenameat(olddirfd, oldpath, newdirfd, newpath)") as CInt

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdOpenatNomode(dirfd, path, flags)") as CInt

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: Stat?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdFstatat(dirfd, path, buf?.toLong() ?: 0L, flags)") as CInt

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdMkdiratNomode(dirfd, path)") as CInt

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdUtimensat(dirfd, path, times?.toLong() ?: 0L, flags)") as CInt

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    js("require('@kotlinmania/libc-native-bindings').wasilibcNocwdOpendirat(dirfd, path)") as DIR?

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcAccess(pathname, mode, flags)") as CInt

public actual fun wasilibcStat(pathname: String?, buf: Stat?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcStat(pathname, buf?.toLong() ?: 0L, flags)") as CInt

public actual fun wasilibcUtimens(pathname: String?, times: io.github.kotlinmania.libc.Timespec?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcUtimens(pathname, times?.toLong() ?: 0L, flags)") as CInt

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcLink(oldpath, newpath, flags)") as CInt

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcLinkOldat(olddirfd, oldpath, newpath, flags)") as CInt

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcLinkNewat(oldpath, newdirfd, newpath, flags)") as CInt

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcRenameOldat(olddirfd, oldpath, newpath)") as CInt

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wasilibcRenameNewat(oldpath, newdirfd, newpath)") as CInt

public actual fun arc4random(): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4random()") as UInt

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').arc4randomBuf(a?.value ?: 0L, b)")
}

public actual fun arc4randomUniform(a: UInt): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4randomUniform(a)") as UInt

public actual fun errnoLocation(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errnoLocation()") as CInt?

public actual fun chmod(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').chmod(path, mode)") as CInt

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchmod(fd, mode)") as CInt

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realpath(pathname, resolved?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSelf(): PthreadT =
    js("require('@kotlinmania/libc-native-bindings').pthreadSelf()") as PthreadT

public actual fun pthreadCreate(native: COpaquePointer?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.value ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadEqual(t1, t2)") as CInt

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadJoin(native, value?.value ?: 0L)") as CInt

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstacksize(attr?.toLong() ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stackSize)") as CInt

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetdetachstate(attr?.toLong() ?: 0L, state)") as CInt

public actual fun pthreadDetach(thread: PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadDetach(thread)") as CInt

public actual fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyCreate(key?.toLong() ?: 0L, dtor?.toLong() ?: 0L)") as CInt

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyDelete(key)") as CInt

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetspecific(key)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetspecific(key, value?.value ?: 0L)") as CInt

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSettype(attr?.toLong() ?: 0L, type)") as CInt

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondWait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondTimedwait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondSignal(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondBroadcast(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondDestroy(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockRdlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTryrdlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockWrlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTrywrlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrDestroy(attr?.toLong() ?: 0L)") as CInt
