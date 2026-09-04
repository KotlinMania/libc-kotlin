// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum requires manual FFI bridge — not yet implemented")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha requires manual FFI bridge — not yet implemented")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl requires manual FFI bridge — not yet implemented")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit requires manual FFI bridge — not yet implemented")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph requires manual FFI bridge — not yet implemented")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower requires manual FFI bridge — not yet implemented")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint requires manual FFI bridge — not yet implemented")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct requires manual FFI bridge — not yet implemented")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace requires manual FFI bridge — not yet implemented")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper requires manual FFI bridge — not yet implemented")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit requires manual FFI bridge — not yet implemented")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank requires manual FFI bridge — not yet implemented")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower requires manual FFI bridge — not yet implemented")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper requires manual FFI bridge — not yet implemented")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen requires manual FFI bridge — not yet implemented")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires manual FFI bridge — not yet implemented")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush requires manual FFI bridge — not yet implemented")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose requires manual FFI bridge — not yet implemented")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove requires manual FFI bridge — not yet implemented")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename requires manual FFI bridge — not yet implemented")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires manual FFI bridge — not yet implemented")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires manual FFI bridge — not yet implemented")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")
}

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar requires manual FFI bridge — not yet implemented")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar requires manual FFI bridge — not yet implemented")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc requires manual FFI bridge — not yet implemented")

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc requires manual FFI bridge — not yet implemented")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs requires manual FFI bridge — not yet implemented")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts requires manual FFI bridge — not yet implemented")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc requires manual FFI bridge — not yet implemented")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires manual FFI bridge — not yet implemented")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek requires manual FFI bridge — not yet implemented")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell requires manual FFI bridge — not yet implemented")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind requires manual FFI bridge — not yet implemented")
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof requires manual FFI bridge — not yet implemented")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror requires manual FFI bridge — not yet implemented")

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror requires manual FFI bridge — not yet implemented")
}

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi requires manual FFI bridge — not yet implemented")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol requires manual FFI bridge — not yet implemented")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires manual FFI bridge — not yet implemented")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol requires manual FFI bridge — not yet implemented")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires manual FFI bridge — not yet implemented")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires manual FFI bridge — not yet implemented")

public actual fun msize(p: COpaquePointer?): ULong =
    throw UnsupportedOperationException("msize requires manual FFI bridge — not yet implemented")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires manual FFI bridge — not yet implemented")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("free requires manual FFI bridge — not yet implemented")
}

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system requires manual FFI bridge — not yet implemented")

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv requires manual FFI bridge — not yet implemented")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires manual FFI bridge — not yet implemented")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires manual FFI bridge — not yet implemented")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires manual FFI bridge — not yet implemented")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires manual FFI bridge — not yet implemented")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp requires manual FFI bridge — not yet implemented")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires manual FFI bridge — not yet implemented")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll requires manual FFI bridge — not yet implemented")

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires manual FFI bridge — not yet implemented")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires manual FFI bridge — not yet implemented")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn requires manual FFI bridge — not yet implemented")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn requires manual FFI bridge — not yet implemented")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup requires manual FFI bridge — not yet implemented")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk requires manual FFI bridge — not yet implemented")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr requires manual FFI bridge — not yet implemented")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen requires manual FFI bridge — not yet implemented")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires manual FFI bridge — not yet implemented")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror requires manual FFI bridge — not yet implemented")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires manual FFI bridge — not yet implemented")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires manual FFI bridge — not yet implemented")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen requires manual FFI bridge — not yet implemented")

public actual fun wcsnlen(str: WcharT?, numberOfElements: ULong): ULong =
    throw UnsupportedOperationException("wcsnlen requires manual FFI bridge — not yet implemented")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires manual FFI bridge — not yet implemented")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires manual FFI bridge — not yet implemented")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp requires manual FFI bridge — not yet implemented")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires manual FFI bridge — not yet implemented")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires manual FFI bridge — not yet implemented")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires manual FFI bridge — not yet implemented")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs requires manual FFI bridge — not yet implemented")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs requires manual FFI bridge — not yet implemented")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires manual FFI bridge — not yet implemented")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun raise(signum: CInt): CInt =
    throw UnsupportedOperationException("raise requires manual FFI bridge — not yet implemented")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("clock requires manual FFI bridge — not yet implemented")

public actual fun ctime(sourceTime: TimeT?): String? =
    throw UnsupportedOperationException("ctime requires manual FFI bridge — not yet implemented")

public actual fun gmtimeS(destTime: Tm?, srcTime: TimeT?): CInt =
    throw UnsupportedOperationException("gmtimeS requires manual FFI bridge — not yet implemented")

public actual fun getDaylight(hours: CInt?): ErrnoT =
    throw UnsupportedOperationException("getDaylight requires manual FFI bridge — not yet implemented")

public actual fun getDstbias(seconds: CLong?): ErrnoT =
    throw UnsupportedOperationException("getDstbias requires manual FFI bridge — not yet implemented")

public actual fun getTimezone(seconds: CLong?): ErrnoT =
    throw UnsupportedOperationException("getTimezone requires manual FFI bridge — not yet implemented")

public actual fun getTzname(pReturnValue: ULong?, timeZoneName: String?, sizeInBytes: ULong, index: CInt): ErrnoT =
    throw UnsupportedOperationException("getTzname requires manual FFI bridge — not yet implemented")

public actual fun localtimeS(tmDest: Tm?, sourceTime: TimeT?): ErrnoT =
    throw UnsupportedOperationException("localtimeS requires manual FFI bridge — not yet implemented")

public actual fun time(destTime: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun tzset() {
    throw UnsupportedOperationException("tzset requires manual FFI bridge — not yet implemented")
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("chmod requires manual FFI bridge — not yet implemented")

public actual fun wchmod(path: WcharT?, mode: CInt): CInt =
    throw UnsupportedOperationException("wchmod requires manual FFI bridge — not yet implemented")

public actual fun mkdir(path: String?): CInt =
    throw UnsupportedOperationException("mkdir requires manual FFI bridge — not yet implemented")

public actual fun wrmdir(path: WcharT?): CInt =
    throw UnsupportedOperationException("wrmdir requires manual FFI bridge — not yet implemented")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun wstat(path: WcharT?, buf: Stat?): CInt =
    throw UnsupportedOperationException("wstat requires manual FFI bridge — not yet implemented")

public actual fun wutime(file: WcharT?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("wutime requires manual FFI bridge — not yet implemented")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires manual FFI bridge — not yet implemented")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose requires manual FFI bridge — not yet implemented")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires manual FFI bridge — not yet implemented")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno requires manual FFI bridge — not yet implemented")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun wopen(path: WcharT?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("wopen requires manual FFI bridge — not yet implemented")

public actual fun creat(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("creat requires manual FFI bridge — not yet implemented")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access requires manual FFI bridge — not yet implemented")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("chdir requires manual FFI bridge — not yet implemented")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close requires manual FFI bridge — not yet implemented")

public actual fun dup(fd: CInt): CInt =
    throw UnsupportedOperationException("dup requires manual FFI bridge — not yet implemented")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("dup2 requires manual FFI bridge — not yet implemented")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execl requires manual FFI bridge — not yet implemented")

public actual fun wexecl(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexecl requires manual FFI bridge — not yet implemented")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execle requires manual FFI bridge — not yet implemented")

public actual fun wexecle(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexecle requires manual FFI bridge — not yet implemented")

public actual fun execlp(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execlp requires manual FFI bridge — not yet implemented")

public actual fun wexeclp(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexeclp requires manual FFI bridge — not yet implemented")

public actual fun execlpe(path: String?, arg0: String?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("execlpe requires manual FFI bridge — not yet implemented")

public actual fun wexeclpe(path: WcharT?, arg0: WcharT?, vararg args: Any?): IntptrT =
    throw UnsupportedOperationException("wexeclpe requires manual FFI bridge — not yet implemented")

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("execv requires manual FFI bridge — not yet implemented")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execve requires manual FFI bridge — not yet implemented")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvp requires manual FFI bridge — not yet implemented")

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun wexecv(prog: WcharT?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecv requires manual FFI bridge — not yet implemented")

public actual fun wexecve(prog: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecve requires manual FFI bridge — not yet implemented")

public actual fun wexecvp(c: WcharT?, argv: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecvp requires manual FFI bridge — not yet implemented")

public actual fun wexecvpe(c: WcharT?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    throw UnsupportedOperationException("wexecvpe requires manual FFI bridge — not yet implemented")

public actual fun getcwd(buf: String?, size: CInt): String? =
    throw UnsupportedOperationException("getcwd requires manual FFI bridge — not yet implemented")

public actual fun getpid(): CInt =
    throw UnsupportedOperationException("getpid requires manual FFI bridge — not yet implemented")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("isatty requires manual FFI bridge — not yet implemented")

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    throw UnsupportedOperationException("lseek requires manual FFI bridge — not yet implemented")

public actual fun lseek64(fd: CInt, offset: CLongLong, origin: CInt): CLongLong =
    throw UnsupportedOperationException("lseek64 requires manual FFI bridge — not yet implemented")

public actual fun pipe(fds: CInt?, psize: CUInt, textmode: CInt): CInt =
    throw UnsupportedOperationException("pipe requires manual FFI bridge — not yet implemented")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt =
    throw UnsupportedOperationException("read requires manual FFI bridge — not yet implemented")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir requires manual FFI bridge — not yet implemented")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("unlink requires manual FFI bridge — not yet implemented")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUInt): CInt =
    throw UnsupportedOperationException("write requires manual FFI bridge — not yet implemented")

public actual fun commit(fd: CInt): CInt =
    throw UnsupportedOperationException("commit requires manual FFI bridge — not yet implemented")

public actual fun getOsfhandle(fd: CInt): IntptrT =
    throw UnsupportedOperationException("getOsfhandle requires manual FFI bridge — not yet implemented")

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    throw UnsupportedOperationException("openOsfhandle requires manual FFI bridge — not yet implemented")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires manual FFI bridge — not yet implemented")

public actual fun wsetlocale(category: CInt, locale: WcharT?): WcharT? =
    throw UnsupportedOperationException("wsetlocale requires manual FFI bridge — not yet implemented")

public actual fun alignedMalloc(size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedMalloc requires manual FFI bridge — not yet implemented")

public actual fun alignedFree(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("alignedFree requires manual FFI bridge — not yet implemented")
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedRealloc requires manual FFI bridge — not yet implemented")

public actual fun putenv(envstring: String?): CInt =
    throw UnsupportedOperationException("putenv requires manual FFI bridge — not yet implemented")

public actual fun wputenv(envstring: WcharT?): CInt =
    throw UnsupportedOperationException("wputenv requires manual FFI bridge — not yet implemented")

public actual fun putenvS(envstring: String?, valueString: String?): ErrnoT =
    throw UnsupportedOperationException("putenvS requires manual FFI bridge — not yet implemented")

public actual fun wputenvS(envstring: WcharT?, valueString: WcharT?): ErrnoT =
    throw UnsupportedOperationException("wputenvS requires manual FFI bridge — not yet implemented")

public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")
}

public actual fun qsortS(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?) {
    throw UnsupportedOperationException("qsortS requires manual FFI bridge — not yet implemented")
}

public actual fun atexit(cb: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")
