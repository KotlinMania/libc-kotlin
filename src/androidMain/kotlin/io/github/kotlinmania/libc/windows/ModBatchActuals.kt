// port-lint: source Mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf not available on Android host — use androidNative target for FFI")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf not available on Android host — use androidNative target for FFI")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum not available on Android host — use androidNative target for FFI")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha not available on Android host — use androidNative target for FFI")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl not available on Android host — use androidNative target for FFI")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit not available on Android host — use androidNative target for FFI")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph not available on Android host — use androidNative target for FFI")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower not available on Android host — use androidNative target for FFI")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint not available on Android host — use androidNative target for FFI")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct not available on Android host — use androidNative target for FFI")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace not available on Android host — use androidNative target for FFI")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper not available on Android host — use androidNative target for FFI")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit not available on Android host — use androidNative target for FFI")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank not available on Android host — use androidNative target for FFI")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower not available on Android host — use androidNative target for FFI")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper not available on Android host — use androidNative target for FFI")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on Android host — use androidNative target for FFI")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on Android host — use androidNative target for FFI")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush not available on Android host — use androidNative target for FFI")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose not available on Android host — use androidNative target for FFI")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove not available on Android host — use androidNative target for FFI")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename not available on Android host — use androidNative target for FFI")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on Android host — use androidNative target for FFI")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf not available on Android host — use androidNative target for FFI")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf not available on Android host — use androidNative target for FFI")
}

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar not available on Android host — use androidNative target for FFI")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar not available on Android host — use androidNative target for FFI")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc not available on Android host — use androidNative target for FFI")

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on Android host — use androidNative target for FFI")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc not available on Android host — use androidNative target for FFI")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs not available on Android host — use androidNative target for FFI")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts not available on Android host — use androidNative target for FFI")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc not available on Android host — use androidNative target for FFI")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on Android host — use androidNative target for FFI")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on Android host — use androidNative target for FFI")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek not available on Android host — use androidNative target for FFI")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell not available on Android host — use androidNative target for FFI")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind not available on Android host — use androidNative target for FFI")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos not available on Android host — use androidNative target for FFI")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos not available on Android host — use androidNative target for FFI")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof not available on Android host — use androidNative target for FFI")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror not available on Android host — use androidNative target for FFI")

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror not available on Android host — use androidNative target for FFI")
}

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi not available on Android host — use androidNative target for FFI")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol not available on Android host — use androidNative target for FFI")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll not available on Android host — use androidNative target for FFI")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol not available on Android host — use androidNative target for FFI")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll not available on Android host — use androidNative target for FFI")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul not available on Android host — use androidNative target for FFI")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull not available on Android host — use androidNative target for FFI")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on Android host — use androidNative target for FFI")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on Android host — use androidNative target for FFI")

public actual fun msize(p: COpaquePointer?): ULong =
    throw UnsupportedOperationException("msize not available on Android host — use androidNative target for FFI")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on Android host — use androidNative target for FFI")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free not available on Android host — use androidNative target for FFI")
}

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system not available on Android host — use androidNative target for FFI")

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv not available on Android host — use androidNative target for FFI")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on Android host — use androidNative target for FFI")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on Android host — use androidNative target for FFI")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat not available on Android host — use androidNative target for FFI")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat not available on Android host — use androidNative target for FFI")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp not available on Android host — use androidNative target for FFI")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp not available on Android host — use androidNative target for FFI")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll not available on Android host — use androidNative target for FFI")

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr not available on Android host — use androidNative target for FFI")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr not available on Android host — use androidNative target for FFI")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn not available on Android host — use androidNative target for FFI")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on Android host — use androidNative target for FFI")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on Android host — use androidNative target for FFI")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on Android host — use androidNative target for FFI")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr not available on Android host — use androidNative target for FFI")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on Android host — use androidNative target for FFI")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on Android host — use androidNative target for FFI")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror not available on Android host — use androidNative target for FFI")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok not available on Android host — use androidNative target for FFI")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on Android host — use androidNative target for FFI")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen not available on Android host — use androidNative target for FFI")

public actual fun wcsnlen(str: WcharT?, numberOfElements: ULong): ULong =
    throw UnsupportedOperationException("wcsnlen not available on Android host — use androidNative target for FFI")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs not available on Android host — use androidNative target for FFI")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on Android host — use androidNative target for FFI")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp not available on Android host — use androidNative target for FFI")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on Android host — use androidNative target for FFI")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on Android host — use androidNative target for FFI")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on Android host — use androidNative target for FFI")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")
}

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("raise not available on Android host — use androidNative target for FFI")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("clock not available on Android host — use androidNative target for FFI")

public actual fun ctime(sourceTime: TimeT?): String? =
    throw UnsupportedOperationException("ctime not available on Android host — use androidNative target for FFI")

public actual fun gmtimeS(destTime: Tm?, srcTime: TimeT?): CInt =
    throw UnsupportedOperationException("gmtimeS not available on Android host — use androidNative target for FFI")

public actual fun getDaylight(hours: CInt?): ErrnoT =
    throw UnsupportedOperationException("getDaylight not available on Android host — use androidNative target for FFI")

public actual fun getDstbias(seconds: CLong?): ErrnoT =
    throw UnsupportedOperationException("getDstbias not available on Android host — use androidNative target for FFI")

public actual fun getTimezone(seconds: CLong?): ErrnoT =
    throw UnsupportedOperationException("getTimezone not available on Android host — use androidNative target for FFI")

public actual fun getTzname(pReturnValue: ULong?, timeZoneName: String?, sizeInBytes: ULong, index: CInt): ErrnoT =
    throw UnsupportedOperationException("getTzname not available on Android host — use androidNative target for FFI")

public actual fun localtimeS(tmDest: Tm?, sourceTime: TimeT?): ErrnoT =
    throw UnsupportedOperationException("localtimeS not available on Android host — use androidNative target for FFI")

public actual fun time(destTime: TimeT?): TimeT =
    throw UnsupportedOperationException("time not available on Android host — use androidNative target for FFI")

public actual fun tzset() {
    throw UnsupportedOperationException("tzset not available on Android host — use androidNative target for FFI")
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("chmod not available on Android host — use androidNative target for FFI")

public actual fun wchmod(path: WcharT?, mode: CInt): CInt =
    throw UnsupportedOperationException("wchmod not available on Android host — use androidNative target for FFI")

public actual fun mkdir(path: String?): CInt =
    throw UnsupportedOperationException("mkdir not available on Android host — use androidNative target for FFI")

public actual fun wrmdir(path: WcharT?): CInt =
    throw UnsupportedOperationException("wrmdir not available on Android host — use androidNative target for FFI")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat not available on Android host — use androidNative target for FFI")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat not available on Android host — use androidNative target for FFI")

public actual fun wstat(path: WcharT?, buf: Stat?): CInt =
    throw UnsupportedOperationException("wstat not available on Android host — use androidNative target for FFI")

public actual fun wutime(file: WcharT?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("wutime not available on Android host — use androidNative target for FFI")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on Android host — use androidNative target for FFI")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose not available on Android host — use androidNative target for FFI")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on Android host — use androidNative target for FFI")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno not available on Android host — use androidNative target for FFI")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open not available on Android host — use androidNative target for FFI")

public actual fun wopen(path: WcharT?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("wopen not available on Android host — use androidNative target for FFI")

public actual fun creat(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("creat not available on Android host — use androidNative target for FFI")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access not available on Android host — use androidNative target for FFI")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("chdir not available on Android host — use androidNative target for FFI")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close not available on Android host — use androidNative target for FFI")

public actual fun dup(fd: CInt): CInt =
    throw UnsupportedOperationException("dup not available on Android host — use androidNative target for FFI")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("dup2 not available on Android host — use androidNative target for FFI")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execl not available on Android host — use androidNative target for FFI")

public actual fun wexecl(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexecl not available on Android host — use androidNative target for FFI")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execle not available on Android host — use androidNative target for FFI")

public actual fun wexecle(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexecle not available on Android host — use androidNative target for FFI")

public actual fun execlp(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execlp not available on Android host — use androidNative target for FFI")

public actual fun wexeclp(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexeclp not available on Android host — use androidNative target for FFI")

public actual fun execlpe(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execlpe not available on Android host — use androidNative target for FFI")

public actual fun wexeclpe(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexeclpe not available on Android host — use androidNative target for FFI")

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("execv not available on Android host — use androidNative target for FFI")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve not available on Android host — use androidNative target for FFI")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvp not available on Android host — use androidNative target for FFI")

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe not available on Android host — use androidNative target for FFI")

public actual fun wexecv(prog: WcharT?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecv not available on Android host — use androidNative target for FFI")

public actual fun wexecve(prog: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecve not available on Android host — use androidNative target for FFI")

public actual fun wexecvp(c: WcharT?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecvp not available on Android host — use androidNative target for FFI")

public actual fun wexecvpe(c: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecvpe not available on Android host — use androidNative target for FFI")

public actual fun getcwd(buf: String?, size: CInt): String? =
    throw UnsupportedOperationException("getcwd not available on Android host — use androidNative target for FFI")

public actual fun getpid(): CInt =
    throw UnsupportedOperationException("getpid not available on Android host — use androidNative target for FFI")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("isatty not available on Android host — use androidNative target for FFI")

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    throw UnsupportedOperationException("lseek not available on Android host — use androidNative target for FFI")

public actual fun lseek64(fd: CInt, offset: CLongLong, origin: CInt): CLongLong =
    throw UnsupportedOperationException("lseek64 not available on Android host — use androidNative target for FFI")

public actual fun pipe(fds: CInt?, psize: CUInt, textmode: CInt): CInt =
    throw UnsupportedOperationException("pipe not available on Android host — use androidNative target for FFI")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt =
    throw UnsupportedOperationException("read not available on Android host — use androidNative target for FFI")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir not available on Android host — use androidNative target for FFI")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("unlink not available on Android host — use androidNative target for FFI")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt =
    throw UnsupportedOperationException("write not available on Android host — use androidNative target for FFI")

public actual fun commit(fd: CInt): CInt =
    throw UnsupportedOperationException("commit not available on Android host — use androidNative target for FFI")

public actual fun getOsfhandle(fd: CInt): IntptrT =
    throw UnsupportedOperationException("getOsfhandle not available on Android host — use androidNative target for FFI")

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    throw UnsupportedOperationException("openOsfhandle not available on Android host — use androidNative target for FFI")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on Android host — use androidNative target for FFI")

public actual fun wsetlocale(category: CInt, locale: WcharT?): WcharT? =
    throw UnsupportedOperationException("wsetlocale not available on Android host — use androidNative target for FFI")

public actual fun alignedMalloc(size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedMalloc not available on Android host — use androidNative target for FFI")

public actual fun alignedFree(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("alignedFree not available on Android host — use androidNative target for FFI")
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedRealloc not available on Android host — use androidNative target for FFI")

public actual fun putenv(envstring: String?): CInt =
    throw UnsupportedOperationException("putenv not available on Android host — use androidNative target for FFI")

public actual fun wputenv(envstring: WcharT?): CInt =
    throw UnsupportedOperationException("wputenv not available on Android host — use androidNative target for FFI")

public actual fun putenvS(envstring: String?, valueString: String?): ErrnoT =
    throw UnsupportedOperationException("putenvS not available on Android host — use androidNative target for FFI")

public actual fun wputenvS(envstring: WcharT?, valueString: WcharT?): ErrnoT =
    throw UnsupportedOperationException("wputenvS not available on Android host — use androidNative target for FFI")


public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort not available on Android host — use androidNative target for FFI")
}

public actual fun qsortS(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?) {
    throw UnsupportedOperationException("qsortS not available on Android host — use androidNative target for FFI")
}

public actual fun atexit(cb: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit not available on Android host — use androidNative target for FFI")
