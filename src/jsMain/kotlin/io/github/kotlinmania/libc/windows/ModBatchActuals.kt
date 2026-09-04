// port-lint: source Mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires N-API addon")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum requires N-API addon")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl requires N-API addon")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph requires N-API addon")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct requires N-API addon")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper requires N-API addon")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit requires N-API addon")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank requires N-API addon")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper requires N-API addon")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen requires N-API addon")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush requires N-API addon")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose requires N-API addon")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename requires N-API addon")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires N-API addon")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf requires N-API addon")
}

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs requires N-API addon")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires N-API addon")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires N-API addon")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek requires N-API addon")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell requires N-API addon")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind requires N-API addon")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror requires N-API addon")
}

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi requires N-API addon")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol requires N-API addon")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires N-API addon")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires N-API addon")

public actual fun msize(p: COpaquePointer?): ULong =
    throw UnsupportedOperationException("msize requires N-API addon")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires N-API addon")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free requires N-API addon")
}

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system requires N-API addon")

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv requires N-API addon")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires N-API addon")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires N-API addon")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp requires N-API addon")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires N-API addon")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires N-API addon")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires N-API addon")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn requires N-API addon")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn requires N-API addon")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup requires N-API addon")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk requires N-API addon")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr requires N-API addon")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen requires N-API addon")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen requires N-API addon")

public actual fun wcsnlen(str: WcharT?, numberOfElements: ULong): ULong =
    throw UnsupportedOperationException("wcsnlen requires N-API addon")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires N-API addon")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp requires N-API addon")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires N-API addon")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires N-API addon")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires N-API addon")
}

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("raise requires N-API addon")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("clock requires N-API addon")

public actual fun ctime(sourceTime: TimeT?): String? =
    throw UnsupportedOperationException("ctime requires N-API addon")

public actual fun gmtimeS(destTime: Tm?, srcTime: TimeT?): CInt =
    throw UnsupportedOperationException("gmtimeS requires N-API addon")

public actual fun getDaylight(hours: CInt?): ErrnoT =
    throw UnsupportedOperationException("getDaylight requires N-API addon")

public actual fun getDstbias(seconds: CLong?): ErrnoT =
    throw UnsupportedOperationException("getDstbias requires N-API addon")

public actual fun getTimezone(seconds: CLong?): ErrnoT =
    throw UnsupportedOperationException("getTimezone requires N-API addon")

public actual fun getTzname(pReturnValue: ULong?, timeZoneName: String?, sizeInBytes: ULong, index: CInt): ErrnoT =
    throw UnsupportedOperationException("getTzname requires N-API addon")

public actual fun localtimeS(tmDest: Tm?, sourceTime: TimeT?): ErrnoT =
    throw UnsupportedOperationException("localtimeS requires N-API addon")

public actual fun time(destTime: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun tzset() {
    throw UnsupportedOperationException("tzset requires N-API addon")
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("chmod requires N-API addon")

public actual fun wchmod(path: WcharT?, mode: CInt): CInt =
    throw UnsupportedOperationException("wchmod requires N-API addon")

public actual fun mkdir(path: String?): CInt =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun wrmdir(path: WcharT?): CInt =
    throw UnsupportedOperationException("wrmdir requires N-API addon")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires N-API addon")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun wstat(path: WcharT?, buf: Stat?): CInt =
    throw UnsupportedOperationException("wstat requires N-API addon")

public actual fun wutime(file: WcharT?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("wutime requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose requires N-API addon")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun wopen(path: WcharT?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("wopen requires N-API addon")

public actual fun creat(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access requires N-API addon")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("chdir requires N-API addon")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close requires N-API addon")

public actual fun dup(fd: CInt): CInt =
    throw UnsupportedOperationException("dup requires N-API addon")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("dup2 requires N-API addon")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execl requires N-API addon")

public actual fun wexecl(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexecl requires N-API addon")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execle requires N-API addon")

public actual fun wexecle(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexecle requires N-API addon")

public actual fun execlp(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execlp requires N-API addon")

public actual fun wexeclp(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexeclp requires N-API addon")

public actual fun execlpe(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execlpe requires N-API addon")

public actual fun wexeclpe(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexeclpe requires N-API addon")

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("execv requires N-API addon")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve requires N-API addon")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvp requires N-API addon")

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun wexecv(prog: WcharT?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecv requires N-API addon")

public actual fun wexecve(prog: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecve requires N-API addon")

public actual fun wexecvp(c: WcharT?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecvp requires N-API addon")

public actual fun wexecvpe(c: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecvpe requires N-API addon")

public actual fun getcwd(buf: String?, size: CInt): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun getpid(): CInt =
    throw UnsupportedOperationException("getpid requires N-API addon")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("isatty requires N-API addon")

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    throw UnsupportedOperationException("lseek requires N-API addon")

public actual fun lseek64(fd: CInt, offset: CLongLong, origin: CInt): CLongLong =
    throw UnsupportedOperationException("lseek64 requires N-API addon")

public actual fun pipe(fds: CInt?, psize: CUInt, textmode: CInt): CInt =
    throw UnsupportedOperationException("pipe requires N-API addon")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt =
    throw UnsupportedOperationException("read requires N-API addon")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("unlink requires N-API addon")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt =
    throw UnsupportedOperationException("write requires N-API addon")

public actual fun commit(fd: CInt): CInt =
    throw UnsupportedOperationException("commit requires N-API addon")

public actual fun getOsfhandle(fd: CInt): IntptrT =
    throw UnsupportedOperationException("getOsfhandle requires N-API addon")

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    throw UnsupportedOperationException("openOsfhandle requires N-API addon")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon")

public actual fun wsetlocale(category: CInt, locale: WcharT?): WcharT? =
    throw UnsupportedOperationException("wsetlocale requires N-API addon")

public actual fun alignedMalloc(size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedMalloc requires N-API addon")

public actual fun alignedFree(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("alignedFree requires N-API addon")
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedRealloc requires N-API addon")

public actual fun putenv(envstring: String?): CInt =
    throw UnsupportedOperationException("putenv requires N-API addon")

public actual fun wputenv(envstring: WcharT?): CInt =
    throw UnsupportedOperationException("wputenv requires N-API addon")

public actual fun putenvS(envstring: String?, valueString: String?): ErrnoT =
    throw UnsupportedOperationException("putenvS requires N-API addon")

public actual fun wputenvS(envstring: WcharT?, valueString: WcharT?): ErrnoT =
    throw UnsupportedOperationException("wputenvS requires N-API addon")

