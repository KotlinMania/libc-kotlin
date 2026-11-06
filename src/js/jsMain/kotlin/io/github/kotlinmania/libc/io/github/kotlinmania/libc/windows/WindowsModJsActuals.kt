package io.github.kotlinmania.libc.windows

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

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    js("require('@kotlinmania/libc-native-bindings').qsort(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L)")
}

public actual fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').qsortS(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)")
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fopen(filename, mode)") as FILE?

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').freopen(filename, mode, file?.toLong() ?: 0L)") as FILE?

public actual fun fflush(file: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fflush(file?.toLong() ?: 0L)") as CInt

public actual fun fclose(file: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fclose(file?.toLong() ?: 0L)") as CInt

public actual fun remove(filename: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').remove(filename)") as CInt

public actual fun rename(oldname: String?, newname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rename(oldname, newname)") as CInt

public actual fun tmpfile(): FILE? =
    js("require('@kotlinmania/libc-native-bindings').tmpfile()") as FILE?

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)") as CInt

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').setbuf(stream?.toLong() ?: 0L, buf?.value ?: 0L)")
}

public actual fun getchar(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getchar()") as CInt

public actual fun putchar(c: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').putchar(c)") as CInt

public actual fun fgetc(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetc(stream?.toLong() ?: 0L)") as CInt

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').fgets(buf?.value ?: 0L, n, stream?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputc(c, stream?.toLong() ?: 0L)") as CInt

public actual fun fputs(s: String?, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fputs(s, stream?.toLong() ?: 0L)") as CInt

public actual fun puts(s: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').puts(s)") as CInt

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ungetc(c, stream?.toLong() ?: 0L)") as CInt

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fread(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)") as SizeT

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fwrite(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)") as SizeT

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseek(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun ftell(stream: FILE?): CLong =
    js("require('@kotlinmania/libc-native-bindings').ftell(stream?.toLong() ?: 0L)") as CLong

public actual fun rewind(stream: FILE?) {
    js("require('@kotlinmania/libc-native-bindings').rewind(stream?.toLong() ?: 0L)")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun feof(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').feof(stream?.toLong() ?: 0L)") as CInt

public actual fun ferror(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ferror(stream?.toLong() ?: 0L)") as CInt

public actual fun perror(s: String?) {
    js("require('@kotlinmania/libc-native-bindings').perror(s)")
}

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

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').calloc(nobj, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').malloc(size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun msize(p: COpaquePointer?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').msize(p?.value ?: 0L)") as SizeT

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realloc(p?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').free(p?.value ?: 0L)")
}

public actual fun abort(): Nothing =
    js("require('@kotlinmania/libc-native-bindings').abort()") as Nothing

public actual fun exit(status: CInt): Nothing =
    js("require('@kotlinmania/libc-native-bindings').exit(status)") as Nothing

public actual fun atexit(cb: AtexitCbCallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').atexit(cb)") as CInt

public actual fun system(s: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').system(s)") as CInt

public actual fun getenv(s: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getenv(s)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

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

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strpbrk(cs, ct)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strstr(cs, ct)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

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

public actual fun wcslen(buf: UShort?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').wcslen(buf?.toLong() ?: 0L)") as SizeT

public actual fun wcsnlen(str: UShort?, numberOfElements: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').wcsnlen(str?.toLong() ?: 0L, numberOfElements)") as SizeT

public actual fun wcstombs(dest: COpaquePointer?, src: UShort?, n: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').wcstombs(dest?.value ?: 0L, src?.toLong() ?: 0L, n)") as SizeT

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

public actual fun abs(i: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(i)") as CInt

public actual fun labs(i: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(i)") as CLong

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    js("require('@kotlinmania/libc-native-bindings').signal(signum, handler)") as SighandlerT

public actual fun raise(signum: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').raise(signum)") as CInt

public actual fun clock(): ClockT =
    js("require('@kotlinmania/libc-native-bindings').clock()") as ClockT

public actual fun ctime(sourceTime: Long?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctime(sourceTime?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    js("require('@kotlinmania/libc-native-bindings').difftime(timeEnd, timeStart)") as CDouble

public actual fun gmtimeS(destTime: Tm?, srcTime: Long?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gmtimeS(destTime?.toLong() ?: 0L, srcTime?.toLong() ?: 0L)") as CInt

public actual fun getDaylight(hours: CInt?): ErrnoT =
    js("require('@kotlinmania/libc-native-bindings').getDaylight(hours?.toLong() ?: 0L)") as ErrnoT

public actual fun getDstbias(seconds: CLong?): ErrnoT =
    js("require('@kotlinmania/libc-native-bindings').getDstbias(seconds?.toLong() ?: 0L)") as ErrnoT

public actual fun getTimezone(seconds: CLong?): ErrnoT =
    js("require('@kotlinmania/libc-native-bindings').getTimezone(seconds?.toLong() ?: 0L)") as ErrnoT

public actual fun getTzname(pReturnValue: ULong?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT =
    js("require('@kotlinmania/libc-native-bindings').getTzname(pReturnValue?.toLong() ?: 0L, timeZoneName?.value ?: 0L, sizeInBytes, index)") as ErrnoT

public actual fun localtimeS(tmDest: Tm?, sourceTime: Long?): io.github.kotlinmania.libc.ErrnoT =
    js("require('@kotlinmania/libc-native-bindings').localtimeS(tmDest?.toLong() ?: 0L, sourceTime?.toLong() ?: 0L)") as io.github.kotlinmania.libc.ErrnoT

public actual fun time(destTime: Long?): TimeT =
    js("require('@kotlinmania/libc-native-bindings').time(destTime?.toLong() ?: 0L)") as TimeT

public actual fun tzset() {
    js("require('@kotlinmania/libc-native-bindings').tzset()")
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').chmod(path, mode)") as CInt

public actual fun wchmod(path: UShort?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').wchmod(path?.toLong() ?: 0L, mode)") as CInt

public actual fun mkdir(path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkdir(path)") as CInt

public actual fun wrmdir(path: UShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wrmdir(path?.toLong() ?: 0L)") as CInt

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat(fildes, buf?.toLong() ?: 0L)") as CInt

public actual fun stat(path: String?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat(path, buf?.toLong() ?: 0L)") as CInt

public actual fun wstat(path: UShort?, buf: Stat?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wstat(path?.toLong() ?: 0L, buf?.toLong() ?: 0L)") as CInt

public actual fun wutime(file: UShort?, buf: Utimbuf?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wutime(file?.toLong() ?: 0L, buf?.toLong() ?: 0L)") as CInt

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun pclose(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pclose(stream?.toLong() ?: 0L)") as CInt

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fdopen(fd, mode)") as FILE?

public actual fun fileno(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fileno(stream?.toLong() ?: 0L)") as CInt

public actual fun creat(path: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').creat(path, mode)") as CInt

public actual fun access(path: String?, amode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').access(path, amode)") as CInt

public actual fun chdir(dir: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').chdir(dir)") as CInt

public actual fun close(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').close(fd)") as CInt

public actual fun dup(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup(fd)") as CInt

public actual fun dup2(src: CInt, dst: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup2(src, dst)") as CInt

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    js("require('@kotlinmania/libc-native-bindings').execv(prog, argv?.value ?: 0L)") as IntptrT

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execve(prog, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvp(c, argv?.value ?: 0L)") as CInt

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvpe(c, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun wexecv(prog: UShort?, argv: COpaquePointer?): IntptrT =
    js("require('@kotlinmania/libc-native-bindings').wexecv(prog?.toLong() ?: 0L, argv?.value ?: 0L)") as IntptrT

public actual fun wexecve(prog: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    js("require('@kotlinmania/libc-native-bindings').wexecve(prog?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as IntptrT

public actual fun wexecvp(c: UShort?, argv: COpaquePointer?): IntptrT =
    js("require('@kotlinmania/libc-native-bindings').wexecvp(c?.toLong() ?: 0L, argv?.value ?: 0L)") as IntptrT

public actual fun wexecvpe(c: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    js("require('@kotlinmania/libc-native-bindings').wexecvpe(c?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as IntptrT

public actual fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getcwd(buf?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpid(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpid()") as CInt

public actual fun isatty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').isatty(fd)") as CInt

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').lseek(fd, offset, origin)") as CLong

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').lseek64(fd, offset, origin)") as CLonglong

public actual fun pipe(fds: CInt?, psize: CUint, textmode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe(fds?.toLong() ?: 0L, psize, textmode)") as CInt

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').read(fd, buf?.value ?: 0L, count)") as CInt

public actual fun rmdir(path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rmdir(path)") as CInt

public actual fun unlink(c: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlink(c)") as CInt

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').write(fd, buf?.value ?: 0L, count)") as CInt

public actual fun commit(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').commit(fd)") as CInt

public actual fun getOsfhandle(fd: CInt): IntptrT =
    js("require('@kotlinmania/libc-native-bindings').getOsfhandle(fd)") as IntptrT

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').openOsfhandle(osfhandle, flags)") as CInt

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').setlocale(category, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wsetlocale(category: CInt, locale: UShort?): UShort? =
    js("require('@kotlinmania/libc-native-bindings').wsetlocale(category, locale?.toLong() ?: 0L)") as UShort?

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').alignedMalloc(size, alignment)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedFree(ptr: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').alignedFree(ptr?.value ?: 0L)")
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').alignedRealloc(memblock?.value ?: 0L, size, alignment)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun putenv(envstring: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').putenv(envstring)") as CInt

public actual fun wputenv(envstring: UShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').wputenv(envstring?.toLong() ?: 0L)") as CInt

public actual fun putenvS(envstring: String?, valueString: String?): io.github.kotlinmania.libc.ErrnoT =
    js("require('@kotlinmania/libc-native-bindings').putenvS(envstring, valueString)") as io.github.kotlinmania.libc.ErrnoT

public actual fun wputenvS(envstring: UShort?, valueString: UShort?): io.github.kotlinmania.libc.ErrnoT =
    js("require('@kotlinmania/libc-native-bindings').wputenvS(envstring?.toLong() ?: 0L, valueString?.toLong() ?: 0L)") as io.github.kotlinmania.libc.ErrnoT

public actual fun listen(s: Socket, backlog: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').listen(s, backlog)") as CInt

public actual fun accept(s: Socket, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CInt?): Socket =
    js("require('@kotlinmania/libc-native-bindings').accept(s, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as Socket

public actual fun bind(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(s, name?.toLong() ?: 0L, namelen)") as CInt

public actual fun connect(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').connect(s, name?.toLong() ?: 0L, namelen)") as CInt

public actual fun getpeername(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, nameln: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpeername(s, name?.toLong() ?: 0L, nameln?.toLong() ?: 0L)") as CInt

public actual fun getsockname(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, nameln: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsockname(s, name?.toLong() ?: 0L, nameln?.toLong() ?: 0L)") as CInt

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsockopt(s, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)") as CInt

public actual fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: io.github.kotlinmania.libc.Sockaddr?, fromlen: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(s, buf?.value ?: 0L, len, flags, from?.toLong() ?: 0L, fromlen?.toLong() ?: 0L)") as CInt

public actual fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: io.github.kotlinmania.libc.Sockaddr?, tolen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendto(s, buf, len, flags, to?.toLong() ?: 0L, tolen)") as CInt

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setsockopt(s, level, optname, optval, optlen)") as CInt

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    js("require('@kotlinmania/libc-native-bindings').socket(af, socketType, protocol)") as Socket
