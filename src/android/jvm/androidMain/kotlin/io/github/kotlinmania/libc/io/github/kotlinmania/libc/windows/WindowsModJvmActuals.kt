package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.COpaquePointer

internal object WindowsModRawLibc {
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
    external fun qsort(base: Long, num: Long, size: Long, compar: Long)
    external fun qsortS(base: Long, num: Long, size: Long, compar: Long, arg: Long)
    external fun fopen(filename: String?, mode: String?): Long?
    external fun freopen(filename: String?, mode: String?, file: Long): Long?
    external fun fflush(file: Long): Int
    external fun fclose(file: Long): Int
    external fun remove(filename: String?): Int
    external fun rename(oldname: String?, newname: String?): Int
    external fun tmpfile(): Long?
    external fun setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int
    external fun setbuf(stream: Long, buf: Long)
    external fun getchar(): Int
    external fun putchar(c: Int): Int
    external fun fgetc(stream: Long): Int
    external fun fgets(buf: Long, n: Int, stream: Long): Long?
    external fun fputc(c: Int, stream: Long): Int
    external fun fputs(s: String?, stream: Long): Int
    external fun puts(s: String?): Int
    external fun ungetc(c: Int, stream: Long): Int
    external fun fread(ptr: Long, size: Long, nobj: Long, stream: Long): Long
    external fun fwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long
    external fun fseek(stream: Long, offset: Long, whence: Int): Int
    external fun ftell(stream: Long): Long
    external fun rewind(stream: Long)
    external fun fgetpos(stream: Long, ptr: Long): Int
    external fun fsetpos(stream: Long, ptr: Long): Int
    external fun feof(stream: Long): Int
    external fun ferror(stream: Long): Int
    external fun perror(s: String?)
    external fun atof(s: String?): Double
    external fun atoi(s: String?): Int
    external fun atol(s: String?): Long
    external fun atoll(s: String?): Long
    external fun strtod(s: String?, endp: Long): Double
    external fun strtof(s: String?, endp: Long): Float
    external fun strtol(s: String?, endp: Long, base: Int): Long
    external fun strtoll(s: String?, endp: Long, base: Int): Long
    external fun strtoul(s: String?, endp: Long, base: Int): Long
    external fun strtoull(s: String?, endp: Long, base: Int): Long
    external fun calloc(nobj: Long, size: Long): Long?
    external fun malloc(size: Long): Long?
    external fun msize(p: Long): Long
    external fun realloc(p: Long, size: Long): Long?
    external fun free(p: Long)
    external fun abort(): Long
    external fun exit(status: Int): Long
    external fun atexit(cb: Long): Int
    external fun system(s: String?): Int
    external fun getenv(s: String?): Long?
    external fun strcpy(dst: Long, src: String?): Long?
    external fun strncpy(dst: Long, src: String?, n: Long): Long?
    external fun strcat(s: Long, ct: String?): Long?
    external fun strncat(s: Long, ct: String?, n: Long): Long?
    external fun strcmp(cs: String?, ct: String?): Int
    external fun strncmp(cs: String?, ct: String?, n: Long): Int
    external fun strcoll(cs: String?, ct: String?): Int
    external fun strchr(cs: String?, c: Int): Long?
    external fun strrchr(cs: String?, c: Int): Long?
    external fun strspn(cs: String?, ct: String?): Long
    external fun strcspn(cs: String?, ct: String?): Long
    external fun strdup(cs: String?): Long?
    external fun strpbrk(cs: String?, ct: String?): Long?
    external fun strstr(cs: String?, ct: String?): Long?
    external fun strlen(cs: String?): Long
    external fun strnlen(cs: String?, maxlen: Long): Long
    external fun strerror(n: Int): Long?
    external fun strtok(s: Long, t: String?): Long?
    external fun strxfrm(s: Long, ct: String?, n: Long): Long
    external fun wcslen(buf: Long): Long
    external fun wcsnlen(str: Long, numberOfElements: Long): Long
    external fun wcstombs(dest: Long, src: Long, n: Long): Long
    external fun memchr(cx: Long, c: Int, n: Long): Long?
    external fun memcmp(cx: Long, ct: Long, n: Long): Int
    external fun memcpy(dest: Long, src: Long, n: Long): Long?
    external fun memmove(dest: Long, src: Long, n: Long): Long?
    external fun memset(dest: Long, c: Int, n: Long): Long?
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun signal(signum: Int, handler: Long): Long
    external fun raise(signum: Int): Int
    external fun clock(): Long
    external fun ctime(sourceTime: Long): Long?
    external fun difftime(timeEnd: Long, timeStart: Long): Double
    external fun gmtimeS(destTime: Long, srcTime: Long): Int
    external fun getDaylight(hours: Long): Long
    external fun getDstbias(seconds: Long): Long
    external fun getTimezone(seconds: Long): Long
    external fun getTzname(pReturnValue: Long, timeZoneName: Long, sizeInBytes: Long, index: Int): Long
    external fun localtimeS(tmDest: Long, sourceTime: Long): Long
    external fun time(destTime: Long): Long
    external fun tzset()
    external fun chmod(path: String?, mode: Int): Int
    external fun wchmod(path: Long, mode: Int): Int
    external fun mkdir(path: String?): Int
    external fun wrmdir(path: Long): Int
    external fun fstat(fildes: Int, buf: Long): Int
    external fun stat(path: String?, buf: Long): Int
    external fun wstat(path: Long, buf: Long): Int
    external fun wutime(file: Long, buf: Long): Int
    external fun popen(command: String?, mode: String?): Long?
    external fun pclose(stream: Long): Int
    external fun fdopen(fd: Int, mode: String?): Long?
    external fun fileno(stream: Long): Int
    external fun creat(path: String?, mode: Int): Int
    external fun access(path: String?, amode: Int): Int
    external fun chdir(dir: String?): Int
    external fun close(fd: Int): Int
    external fun dup(fd: Int): Int
    external fun dup2(src: Int, dst: Int): Int
    external fun execv(prog: String?, argv: Long): Long
    external fun execve(prog: String?, argv: Long, envp: Long): Int
    external fun execvp(c: String?, argv: Long): Int
    external fun execvpe(c: String?, argv: Long, envp: Long): Int
    external fun wexecv(prog: Long, argv: Long): Long
    external fun wexecve(prog: Long, argv: Long, envp: Long): Long
    external fun wexecvp(c: Long, argv: Long): Long
    external fun wexecvpe(c: Long, argv: Long, envp: Long): Long
    external fun getcwd(buf: Long, size: Int): Long?
    external fun getpid(): Int
    external fun isatty(fd: Int): Int
    external fun lseek(fd: Int, offset: Long, origin: Int): Long
    external fun lseek64(fd: Int, offset: Long, origin: Int): Long
    external fun pipe(fds: Long, psize: Int, textmode: Int): Int
    external fun read(fd: Int, buf: Long, count: Int): Int
    external fun rmdir(path: String?): Int
    external fun unlink(c: String?): Int
    external fun write(fd: Int, buf: Long, count: Int): Int
    external fun commit(fd: Int): Int
    external fun getOsfhandle(fd: Int): Long
    external fun openOsfhandle(osfhandle: Long, flags: Int): Int
    external fun setlocale(category: Int, locale: String?): Long?
    external fun wsetlocale(category: Int, locale: Long): Long?
    external fun alignedMalloc(size: Long, alignment: Long): Long?
    external fun alignedFree(ptr: Long)
    external fun alignedRealloc(memblock: Long, size: Long, alignment: Long): Long?
    external fun putenv(envstring: String?): Int
    external fun wputenv(envstring: Long): Int
    external fun putenvS(envstring: String?, valueString: String?): Long
    external fun wputenvS(envstring: Long, valueString: Long): Long
    external fun listen(s: Long, backlog: Int): Int
    external fun accept(s: Long, addr: Long, addrlen: Long): Long
    external fun bind(s: Long, name: Long, namelen: Int): Int
    external fun connect(s: Long, name: Long, namelen: Int): Int
    external fun getpeername(s: Long, name: Long, nameln: Long): Int
    external fun getsockname(s: Long, name: Long, nameln: Long): Int
    external fun getsockopt(s: Long, level: Int, optname: Int, optval: Long, optlen: Long): Int
    external fun recvfrom(s: Long, buf: Long, len: Int, flags: Int, from: Long, fromlen: Long): Int
    external fun sendto(s: Long, buf: String?, len: Int, flags: Int, to: Long, tolen: Int): Int
    external fun setsockopt(s: Long, level: Int, optname: Int, optval: String?, optlen: Int): Int
    external fun socket(af: Int, socketType: Int, protocol: Int): Long
}

public actual fun isalnum(c: CInt): CInt =
    WindowsModRawLibc.isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    WindowsModRawLibc.isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    WindowsModRawLibc.iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    WindowsModRawLibc.isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    WindowsModRawLibc.isgraph(c)

public actual fun islower(c: CInt): CInt =
    WindowsModRawLibc.islower(c)

public actual fun isprint(c: CInt): CInt =
    WindowsModRawLibc.isprint(c)

public actual fun ispunct(c: CInt): CInt =
    WindowsModRawLibc.ispunct(c)

public actual fun isspace(c: CInt): CInt =
    WindowsModRawLibc.isspace(c)

public actual fun isupper(c: CInt): CInt =
    WindowsModRawLibc.isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    WindowsModRawLibc.isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    WindowsModRawLibc.isblank(c)

public actual fun tolower(c: CInt): CInt =
    WindowsModRawLibc.tolower(c)

public actual fun toupper(c: CInt): CInt =
    WindowsModRawLibc.toupper(c)

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    WindowsModRawLibc.qsort(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L)
}

public actual fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?) {
    WindowsModRawLibc.qsortS(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    WindowsModRawLibc.fopen(filename, mode)

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    WindowsModRawLibc.freopen(filename, mode, file?.toLong() ?: 0L)

public actual fun fflush(file: FILE?): CInt =
    WindowsModRawLibc.fflush(file?.toLong() ?: 0L)

public actual fun fclose(file: FILE?): CInt =
    WindowsModRawLibc.fclose(file?.toLong() ?: 0L)

public actual fun remove(filename: String?): CInt =
    WindowsModRawLibc.remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    WindowsModRawLibc.rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    WindowsModRawLibc.tmpfile()

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    WindowsModRawLibc.setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    WindowsModRawLibc.setbuf(stream?.toLong() ?: 0L, buf?.value ?: 0L)
}

public actual fun getchar(): CInt =
    WindowsModRawLibc.getchar()

public actual fun putchar(c: CInt): CInt =
    WindowsModRawLibc.putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    WindowsModRawLibc.fgetc(stream?.toLong() ?: 0L)

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    WindowsModRawLibc.fgets(buf?.value ?: 0L, n, stream?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    WindowsModRawLibc.fputc(c, stream?.toLong() ?: 0L)

public actual fun fputs(s: String?, stream: FILE?): CInt =
    WindowsModRawLibc.fputs(s, stream?.toLong() ?: 0L)

public actual fun puts(s: String?): CInt =
    WindowsModRawLibc.puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    WindowsModRawLibc.ungetc(c, stream?.toLong() ?: 0L)

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    WindowsModRawLibc.fread(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    WindowsModRawLibc.fwrite(ptr?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    WindowsModRawLibc.fseek(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    WindowsModRawLibc.ftell(stream?.toLong() ?: 0L)

public actual fun rewind(stream: FILE?) {
    WindowsModRawLibc.rewind(stream?.toLong() ?: 0L)
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    WindowsModRawLibc.fgetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    WindowsModRawLibc.fsetpos(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun feof(stream: FILE?): CInt =
    WindowsModRawLibc.feof(stream?.toLong() ?: 0L)

public actual fun ferror(stream: FILE?): CInt =
    WindowsModRawLibc.ferror(stream?.toLong() ?: 0L)

public actual fun perror(s: String?) {
    WindowsModRawLibc.perror(s)
}

public actual fun atof(s: String?): CDouble =
    WindowsModRawLibc.atof(s)

public actual fun atoi(s: String?): CInt =
    WindowsModRawLibc.atoi(s)

public actual fun atol(s: String?): CLong =
    WindowsModRawLibc.atol(s)

public actual fun atoll(s: String?): CLonglong =
    WindowsModRawLibc.atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    WindowsModRawLibc.strtod(s, endp?.value ?: 0L)

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    WindowsModRawLibc.strtof(s, endp?.value ?: 0L)

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    WindowsModRawLibc.strtol(s, endp?.value ?: 0L, base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    WindowsModRawLibc.strtoll(s, endp?.value ?: 0L, base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    WindowsModRawLibc.strtoul(s, endp?.value ?: 0L, base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    WindowsModRawLibc.strtoull(s, endp?.value ?: 0L, base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    WindowsModRawLibc.calloc(nobj, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    WindowsModRawLibc.malloc(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun msize(p: COpaquePointer?): SizeT =
    WindowsModRawLibc.msize(p?.value ?: 0L)

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    WindowsModRawLibc.realloc(p?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    WindowsModRawLibc.free(p?.value ?: 0L)
}

public actual fun abort(): Nothing =
    WindowsModRawLibc.abort()

public actual fun exit(status: CInt): Nothing =
    WindowsModRawLibc.exit(status)

public actual fun atexit(cb: AtexitCbCallback): CInt =
    WindowsModRawLibc.atexit(cb)

public actual fun system(s: String?): CInt =
    WindowsModRawLibc.system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    WindowsModRawLibc.getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    WindowsModRawLibc.strcpy(dst?.value ?: 0L, src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    WindowsModRawLibc.strncpy(dst?.value ?: 0L, src, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    WindowsModRawLibc.strcat(s?.value ?: 0L, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    WindowsModRawLibc.strncat(s?.value ?: 0L, ct, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    WindowsModRawLibc.strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    WindowsModRawLibc.strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    WindowsModRawLibc.strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    WindowsModRawLibc.strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    WindowsModRawLibc.strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    WindowsModRawLibc.strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    WindowsModRawLibc.strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    WindowsModRawLibc.strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    WindowsModRawLibc.strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    WindowsModRawLibc.strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(cs: String?): SizeT =
    WindowsModRawLibc.strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    WindowsModRawLibc.strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    WindowsModRawLibc.strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    WindowsModRawLibc.strtok(s?.value ?: 0L, t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    WindowsModRawLibc.strxfrm(s?.value ?: 0L, ct, n)

public actual fun wcslen(buf: UShort?): SizeT =
    WindowsModRawLibc.wcslen(buf?.toLong() ?: 0L)

public actual fun wcsnlen(str: UShort?, numberOfElements: SizeT): SizeT =
    WindowsModRawLibc.wcsnlen(str?.toLong() ?: 0L, numberOfElements)

public actual fun wcstombs(dest: COpaquePointer?, src: UShort?, n: SizeT): SizeT =
    WindowsModRawLibc.wcstombs(dest?.value ?: 0L, src?.toLong() ?: 0L, n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WindowsModRawLibc.memchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    WindowsModRawLibc.memcmp(cx?.value ?: 0L, ct?.value ?: 0L, n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    WindowsModRawLibc.memcpy(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    WindowsModRawLibc.memmove(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WindowsModRawLibc.memset(dest?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    WindowsModRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    WindowsModRawLibc.labs(i)

public actual fun rand(): CInt =
    WindowsModRawLibc.rand()

public actual fun srand(seed: CUint) {
    WindowsModRawLibc.srand(seed)
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    WindowsModRawLibc.signal(signum, handler)

public actual fun raise(signum: CInt): CInt =
    WindowsModRawLibc.raise(signum)

public actual fun clock(): ClockT =
    WindowsModRawLibc.clock()

public actual fun ctime(sourceTime: Long?): COpaquePointer? =
    WindowsModRawLibc.ctime(sourceTime?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    WindowsModRawLibc.difftime(timeEnd, timeStart)

public actual fun gmtimeS(destTime: Tm?, srcTime: Long?): CInt =
    WindowsModRawLibc.gmtimeS(destTime?.toLong() ?: 0L, srcTime?.toLong() ?: 0L)

public actual fun getDaylight(hours: CInt?): ErrnoT =
    WindowsModRawLibc.getDaylight(hours?.toLong() ?: 0L)

public actual fun getDstbias(seconds: CLong?): ErrnoT =
    WindowsModRawLibc.getDstbias(seconds?.toLong() ?: 0L)

public actual fun getTimezone(seconds: CLong?): ErrnoT =
    WindowsModRawLibc.getTimezone(seconds?.toLong() ?: 0L)

public actual fun getTzname(pReturnValue: ULong?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT =
    WindowsModRawLibc.getTzname(pReturnValue?.toLong() ?: 0L, timeZoneName?.value ?: 0L, sizeInBytes, index)

public actual fun localtimeS(tmDest: Tm?, sourceTime: Long?): io.github.kotlinmania.libc.ErrnoT =
    WindowsModRawLibc.localtimeS(tmDest?.toLong() ?: 0L, sourceTime?.toLong() ?: 0L)

public actual fun time(destTime: Long?): TimeT =
    WindowsModRawLibc.time(destTime?.toLong() ?: 0L)

public actual fun tzset() {
    WindowsModRawLibc.tzset()
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    WindowsModRawLibc.chmod(path, mode)

public actual fun wchmod(path: UShort?, mode: CInt): CInt =
    WindowsModRawLibc.wchmod(path?.toLong() ?: 0L, mode)

public actual fun mkdir(path: String?): CInt =
    WindowsModRawLibc.mkdir(path)

public actual fun wrmdir(path: UShort?): CInt =
    WindowsModRawLibc.wrmdir(path?.toLong() ?: 0L)

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    WindowsModRawLibc.fstat(fildes, buf?.toLong() ?: 0L)

public actual fun stat(path: String?, buf: Stat?): CInt =
    WindowsModRawLibc.stat(path, buf?.toLong() ?: 0L)

public actual fun wstat(path: UShort?, buf: Stat?): CInt =
    WindowsModRawLibc.wstat(path?.toLong() ?: 0L, buf?.toLong() ?: 0L)

public actual fun wutime(file: UShort?, buf: Utimbuf?): CInt =
    WindowsModRawLibc.wutime(file?.toLong() ?: 0L, buf?.toLong() ?: 0L)

public actual fun popen(command: String?, mode: String?): FILE? =
    WindowsModRawLibc.popen(command, mode)

public actual fun pclose(stream: FILE?): CInt =
    WindowsModRawLibc.pclose(stream?.toLong() ?: 0L)

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    WindowsModRawLibc.fdopen(fd, mode)

public actual fun fileno(stream: FILE?): CInt =
    WindowsModRawLibc.fileno(stream?.toLong() ?: 0L)

public actual fun creat(path: String?, mode: CInt): CInt =
    WindowsModRawLibc.creat(path, mode)

public actual fun access(path: String?, amode: CInt): CInt =
    WindowsModRawLibc.access(path, amode)

public actual fun chdir(dir: String?): CInt =
    WindowsModRawLibc.chdir(dir)

public actual fun close(fd: CInt): CInt =
    WindowsModRawLibc.close(fd)

public actual fun dup(fd: CInt): CInt =
    WindowsModRawLibc.dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    WindowsModRawLibc.dup2(src, dst)

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    WindowsModRawLibc.execv(prog, argv?.value ?: 0L)

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    WindowsModRawLibc.execve(prog, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    WindowsModRawLibc.execvp(c, argv?.value ?: 0L)

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    WindowsModRawLibc.execvpe(c, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun wexecv(prog: UShort?, argv: COpaquePointer?): IntptrT =
    WindowsModRawLibc.wexecv(prog?.toLong() ?: 0L, argv?.value ?: 0L)

public actual fun wexecve(prog: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    WindowsModRawLibc.wexecve(prog?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun wexecvp(c: UShort?, argv: COpaquePointer?): IntptrT =
    WindowsModRawLibc.wexecvp(c?.toLong() ?: 0L, argv?.value ?: 0L)

public actual fun wexecvpe(c: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    WindowsModRawLibc.wexecvpe(c?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? =
    WindowsModRawLibc.getcwd(buf?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpid(): CInt =
    WindowsModRawLibc.getpid()

public actual fun isatty(fd: CInt): CInt =
    WindowsModRawLibc.isatty(fd)

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    WindowsModRawLibc.lseek(fd, offset, origin)

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    WindowsModRawLibc.lseek64(fd, offset, origin)

public actual fun pipe(fds: CInt?, psize: CUint, textmode: CInt): CInt =
    WindowsModRawLibc.pipe(fds?.toLong() ?: 0L, psize, textmode)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    WindowsModRawLibc.read(fd, buf?.value ?: 0L, count)

public actual fun rmdir(path: String?): CInt =
    WindowsModRawLibc.rmdir(path)

public actual fun unlink(c: String?): CInt =
    WindowsModRawLibc.unlink(c)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    WindowsModRawLibc.write(fd, buf?.value ?: 0L, count)

public actual fun commit(fd: CInt): CInt =
    WindowsModRawLibc.commit(fd)

public actual fun getOsfhandle(fd: CInt): IntptrT =
    WindowsModRawLibc.getOsfhandle(fd)

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    WindowsModRawLibc.openOsfhandle(osfhandle, flags)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    WindowsModRawLibc.setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wsetlocale(category: CInt, locale: UShort?): UShort? =
    WindowsModRawLibc.wsetlocale(category, locale?.toLong() ?: 0L)

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? =
    WindowsModRawLibc.alignedMalloc(size, alignment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedFree(ptr: COpaquePointer?) {
    WindowsModRawLibc.alignedFree(ptr?.value ?: 0L)
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? =
    WindowsModRawLibc.alignedRealloc(memblock?.value ?: 0L, size, alignment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun putenv(envstring: String?): CInt =
    WindowsModRawLibc.putenv(envstring)

public actual fun wputenv(envstring: UShort?): CInt =
    WindowsModRawLibc.wputenv(envstring?.toLong() ?: 0L)

public actual fun putenvS(envstring: String?, valueString: String?): io.github.kotlinmania.libc.ErrnoT =
    WindowsModRawLibc.putenvS(envstring, valueString)

public actual fun wputenvS(envstring: UShort?, valueString: UShort?): io.github.kotlinmania.libc.ErrnoT =
    WindowsModRawLibc.wputenvS(envstring?.toLong() ?: 0L, valueString?.toLong() ?: 0L)

public actual fun listen(s: Socket, backlog: CInt): CInt =
    WindowsModRawLibc.listen(s, backlog)

public actual fun accept(s: Socket, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CInt?): Socket =
    WindowsModRawLibc.accept(s, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun bind(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CInt): CInt =
    WindowsModRawLibc.bind(s, name?.toLong() ?: 0L, namelen)

public actual fun connect(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CInt): CInt =
    WindowsModRawLibc.connect(s, name?.toLong() ?: 0L, namelen)

public actual fun getpeername(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, nameln: CInt?): CInt =
    WindowsModRawLibc.getpeername(s, name?.toLong() ?: 0L, nameln?.toLong() ?: 0L)

public actual fun getsockname(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, nameln: CInt?): CInt =
    WindowsModRawLibc.getsockname(s, name?.toLong() ?: 0L, nameln?.toLong() ?: 0L)

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CInt?): CInt =
    WindowsModRawLibc.getsockopt(s, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)

public actual fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: io.github.kotlinmania.libc.Sockaddr?, fromlen: CInt?): CInt =
    WindowsModRawLibc.recvfrom(s, buf?.value ?: 0L, len, flags, from?.toLong() ?: 0L, fromlen?.toLong() ?: 0L)

public actual fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: io.github.kotlinmania.libc.Sockaddr?, tolen: CInt): CInt =
    WindowsModRawLibc.sendto(s, buf, len, flags, to?.toLong() ?: 0L, tolen)

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt =
    WindowsModRawLibc.setsockopt(s, level, optname, optval, optlen)

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    WindowsModRawLibc.socket(af, socketType, protocol)
