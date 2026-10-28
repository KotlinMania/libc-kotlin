package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.internal.LibcJni

public actual fun printf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf not available on Android host — use androidNative target for FFI")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf not available on Android host — use androidNative target for FFI")

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum not available on Android host — use androidNative target for FFI")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha not available on Android host — use androidNative target for FFI")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl not available on Android host — use androidNative target for FFI")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit not available on Android host — use androidNative target for FFI")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph not available on Android host — use androidNative target for FFI")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower not available on Android host — use androidNative target for FFI")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint not available on Android host — use androidNative target for FFI")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct not available on Android host — use androidNative target for FFI")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace not available on Android host — use androidNative target for FFI")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper not available on Android host — use androidNative target for FFI")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit not available on Android host — use androidNative target for FFI")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank not available on Android host — use androidNative target for FFI")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower not available on Android host — use androidNative target for FFI")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper not available on Android host — use androidNative target for FFI")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on Android host — use androidNative target for FFI")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on Android host — use androidNative target for FFI")

public actual fun fflush(file: FILE?): Int =
    throw UnsupportedOperationException("fflush not available on Android host — use androidNative target for FFI")

public actual fun fclose(file: FILE?): Int =
    throw UnsupportedOperationException("fclose not available on Android host — use androidNative target for FFI")

public actual fun remove(filename: String?): Int =
    throw UnsupportedOperationException("remove not available on Android host — use androidNative target for FFI")

public actual fun rename(oldname: String?, newname: String?): Int =
    throw UnsupportedOperationException("rename not available on Android host — use androidNative target for FFI")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on Android host — use androidNative target for FFI")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf not available on Android host — use androidNative target for FFI")

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf not available on Android host — use androidNative target for FFI")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar not available on Android host — use androidNative target for FFI")

public actual fun putchar(c: Int): Int =
    throw UnsupportedOperationException("putchar not available on Android host — use androidNative target for FFI")

public actual fun fgetc(stream: FILE?): Int =
    throw UnsupportedOperationException("fgetc not available on Android host — use androidNative target for FFI")

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on Android host — use androidNative target for FFI")

public actual fun fputc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("fputc not available on Android host — use androidNative target for FFI")

public actual fun fputs(s: String?, stream: FILE?): Int =
    throw UnsupportedOperationException("fputs not available on Android host — use androidNative target for FFI")

public actual fun puts(s: String?): Int =
    throw UnsupportedOperationException("puts not available on Android host — use androidNative target for FFI")

public actual fun ungetc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("ungetc not available on Android host — use androidNative target for FFI")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on Android host — use androidNative target for FFI")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on Android host — use androidNative target for FFI")

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseek not available on Android host — use androidNative target for FFI")

public actual fun ftell(stream: FILE?): Long =
    throw UnsupportedOperationException("ftell not available on Android host — use androidNative target for FFI")

public actual fun rewind(stream: FILE?): Unit = throw UnsupportedOperationException("rewind not available on Android host — use androidNative target for FFI")

public actual fun fgetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos not available on Android host — use androidNative target for FFI")

public actual fun fsetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos not available on Android host — use androidNative target for FFI")

public actual fun feof(stream: FILE?): Int =
    throw UnsupportedOperationException("feof not available on Android host — use androidNative target for FFI")

public actual fun ferror(stream: FILE?): Int =
    throw UnsupportedOperationException("ferror not available on Android host — use androidNative target for FFI")

public actual fun perror(s: String?): Unit = throw UnsupportedOperationException("perror not available on Android host — use androidNative target for FFI")

public actual fun atoi(s: String?): Int =
    throw UnsupportedOperationException("atoi not available on Android host — use androidNative target for FFI")

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol not available on Android host — use androidNative target for FFI")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll not available on Android host — use androidNative target for FFI")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol not available on Android host — use androidNative target for FFI")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll not available on Android host — use androidNative target for FFI")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul not available on Android host — use androidNative target for FFI")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull not available on Android host — use androidNative target for FFI")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on Android host — use androidNative target for FFI")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on Android host — use androidNative target for FFI")

public actual fun msize(p: COpaquePointer?): ULong =
    throw UnsupportedOperationException("msize not available on Android host — use androidNative target for FFI")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on Android host — use androidNative target for FFI")

public actual fun free(p: COpaquePointer?): Unit = throw UnsupportedOperationException("free not available on Android host — use androidNative target for FFI")

public actual fun system(s: String?): Int =
    throw UnsupportedOperationException("system not available on Android host — use androidNative target for FFI")

public actual fun getenv(s: String?): String? =
    if (s == null) null else LibcJni.getenv(s)

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on Android host — use androidNative target for FFI")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on Android host — use androidNative target for FFI")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat not available on Android host — use androidNative target for FFI")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat not available on Android host — use androidNative target for FFI")

public actual fun strcmp(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcmp not available on Android host — use androidNative target for FFI")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncmp not available on Android host — use androidNative target for FFI")

public actual fun strcoll(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcoll not available on Android host — use androidNative target for FFI")

public actual fun strchr(cs: String?, c: Int): String? =
    throw UnsupportedOperationException("strchr not available on Android host — use androidNative target for FFI")

public actual fun strrchr(cs: String?, c: Int): String? =
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

public actual fun strerror(n: Int): String? =
    throw UnsupportedOperationException("strerror not available on Android host — use androidNative target for FFI")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok not available on Android host — use androidNative target for FFI")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on Android host — use androidNative target for FFI")

public actual fun wcslen(buf: UShort?): ULong =
    throw UnsupportedOperationException("wcslen not available on Android host — use androidNative target for FFI")

public actual fun wcsnlen(str: UShort?, numberOfElements: ULong): ULong =
    throw UnsupportedOperationException("wcsnlen not available on Android host — use androidNative target for FFI")

public actual fun wcstombs(dest: String?, src: UShort?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs not available on Android host — use androidNative target for FFI")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on Android host — use androidNative target for FFI")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    throw UnsupportedOperationException("memcmp not available on Android host — use androidNative target for FFI")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on Android host — use androidNative target for FFI")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on Android host — use androidNative target for FFI")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on Android host — use androidNative target for FFI")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")

public actual fun raise(signum: Int): Int =
    throw UnsupportedOperationException("raise not available on Android host — use androidNative target for FFI")

public actual fun clock(): Int =
    throw UnsupportedOperationException("clock not available on Android host — use androidNative target for FFI")

public actual fun ctime(sourceTime: Long?): String? =
    throw UnsupportedOperationException("ctime not available on Android host — use androidNative target for FFI")

public actual fun gmtimeS(destTime: Tm?, srcTime: Long?): Int =
    throw UnsupportedOperationException("gmtimeS not available on Android host — use androidNative target for FFI")

public actual fun getDaylight(hours: Int?): Int =
    throw UnsupportedOperationException("getDaylight not available on Android host — use androidNative target for FFI")

public actual fun getDstbias(seconds: Long?): Int =
    throw UnsupportedOperationException("getDstbias not available on Android host — use androidNative target for FFI")

public actual fun getTimezone(seconds: Long?): Int =
    throw UnsupportedOperationException("getTimezone not available on Android host — use androidNative target for FFI")

public actual fun getTzname(pReturnValue: ULong?, timeZoneName: String?, sizeInBytes: ULong, index: Int): Int =
    throw UnsupportedOperationException("getTzname not available on Android host — use androidNative target for FFI")

public actual fun localtimeS(tmDest: Tm?, sourceTime: Long?): Int =
    throw UnsupportedOperationException("localtimeS not available on Android host — use androidNative target for FFI")

public actual fun time(destTime: Long?): Long =
    throw UnsupportedOperationException("time not available on Android host — use androidNative target for FFI")

public actual fun tzset(): Unit = throw UnsupportedOperationException("tzset not available on Android host — use androidNative target for FFI")

public actual fun chmod(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("chmod not available on Android host — use androidNative target for FFI")

public actual fun wchmod(path: UShort?, mode: Int): Int =
    throw UnsupportedOperationException("wchmod not available on Android host — use androidNative target for FFI")

public actual fun mkdir(path: String?): Int =
    throw UnsupportedOperationException("mkdir not available on Android host — use androidNative target for FFI")

public actual fun wrmdir(path: UShort?): Int =
    throw UnsupportedOperationException("wrmdir not available on Android host — use androidNative target for FFI")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat not available on Android host — use androidNative target for FFI")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat not available on Android host — use androidNative target for FFI")

public actual fun wstat(path: UShort?, buf: Stat?): Int =
    throw UnsupportedOperationException("wstat not available on Android host — use androidNative target for FFI")

public actual fun wutime(file: UShort?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("wutime not available on Android host — use androidNative target for FFI")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on Android host — use androidNative target for FFI")

public actual fun pclose(stream: FILE?): Int =
    throw UnsupportedOperationException("pclose not available on Android host — use androidNative target for FFI")

public actual fun fdopen(fd: Int, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on Android host — use androidNative target for FFI")

public actual fun fileno(stream: FILE?): Int =
    throw UnsupportedOperationException("fileno not available on Android host — use androidNative target for FFI")

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open not available on Android host — use androidNative target for FFI")

public actual fun wopen(path: UShort?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("wopen not available on Android host — use androidNative target for FFI")

public actual fun creat(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("creat not available on Android host — use androidNative target for FFI")

public actual fun access(path: String?, amode: Int): Int =
    throw UnsupportedOperationException("access not available on Android host — use androidNative target for FFI")

public actual fun chdir(dir: String?): Int =
    throw UnsupportedOperationException("chdir not available on Android host — use androidNative target for FFI")

public actual fun close(fd: Int): Int =
    throw UnsupportedOperationException("close not available on Android host — use androidNative target for FFI")

public actual fun dup(fd: Int): Int =
    throw UnsupportedOperationException("dup not available on Android host — use androidNative target for FFI")

public actual fun dup2(src: Int, dst: Int): Int =
    throw UnsupportedOperationException("dup2 not available on Android host — use androidNative target for FFI")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execl not available on Android host — use androidNative target for FFI")

public actual fun wexecl(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexecl not available on Android host — use androidNative target for FFI")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execle not available on Android host — use androidNative target for FFI")

public actual fun wexecle(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexecle not available on Android host — use androidNative target for FFI")

public actual fun execlp(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execlp not available on Android host — use androidNative target for FFI")

public actual fun wexeclp(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexeclp not available on Android host — use androidNative target for FFI")

public actual fun execlpe(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execlpe not available on Android host — use androidNative target for FFI")

public actual fun wexeclpe(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexeclpe not available on Android host — use androidNative target for FFI")

public actual fun execv(prog: String?, argv: COpaquePointer?): Long =
    throw UnsupportedOperationException("execv not available on Android host — use androidNative target for FFI")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execve not available on Android host — use androidNative target for FFI")

public actual fun execvp(c: String?, argv: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvp not available on Android host — use androidNative target for FFI")

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe not available on Android host — use androidNative target for FFI")

public actual fun wexecv(prog: UShort?, argv: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecv not available on Android host — use androidNative target for FFI")

public actual fun wexecve(prog: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecve not available on Android host — use androidNative target for FFI")

public actual fun wexecvp(c: UShort?, argv: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecvp not available on Android host — use androidNative target for FFI")

public actual fun wexecvpe(c: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecvpe not available on Android host — use androidNative target for FFI")

public actual fun getcwd(buf: String?, size: Int): String? =
    throw UnsupportedOperationException("getcwd not available on Android host — use androidNative target for FFI")

public actual fun getpid(): Int =
    throw UnsupportedOperationException("getpid not available on Android host — use androidNative target for FFI")

public actual fun isatty(fd: Int): Int =
    LibcJni.isatty(fd)

public actual fun lseek(fd: Int, offset: Long, origin: Int): Long =
    throw UnsupportedOperationException("lseek not available on Android host — use androidNative target for FFI")

public actual fun lseek64(fd: Int, offset: Long, origin: Int): Long =
    throw UnsupportedOperationException("lseek64 not available on Android host — use androidNative target for FFI")

public actual fun pipe(fds: Int?, psize: UInt, textmode: Int): Int =
    throw UnsupportedOperationException("pipe not available on Android host — use androidNative target for FFI")

public actual fun read(fd: Int, buf: COpaquePointer?, count: UInt): Int =
    throw UnsupportedOperationException("read not available on Android host — use androidNative target for FFI")

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("rmdir not available on Android host — use androidNative target for FFI")

public actual fun unlink(c: String?): Int =
    throw UnsupportedOperationException("unlink not available on Android host — use androidNative target for FFI")

public actual fun write(fd: Int, buf: COpaquePointer?, count: UInt): Int =
    throw UnsupportedOperationException("write not available on Android host — use androidNative target for FFI")

public actual fun commit(fd: Int): Int =
    throw UnsupportedOperationException("commit not available on Android host — use androidNative target for FFI")

public actual fun getOsfhandle(fd: Int): Long =
    throw UnsupportedOperationException("getOsfhandle not available on Android host — use androidNative target for FFI")

public actual fun openOsfhandle(osfhandle: Long, flags: Int): Int =
    throw UnsupportedOperationException("openOsfhandle not available on Android host — use androidNative target for FFI")

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on Android host — use androidNative target for FFI")

public actual fun wsetlocale(category: Int, locale: UShort?): UShort? =
    throw UnsupportedOperationException("wsetlocale not available on Android host — use androidNative target for FFI")

public actual fun alignedMalloc(size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedMalloc not available on Android host — use androidNative target for FFI")

public actual fun alignedFree(ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("alignedFree not available on Android host — use androidNative target for FFI")

public actual fun alignedRealloc(memblock: COpaquePointer?, size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedRealloc not available on Android host — use androidNative target for FFI")

public actual fun putenv(envstring: String?): Int =
    if (envstring == null) -1 else LibcJni.putenv(envstring)

public actual fun wputenv(envstring: UShort?): Int =
    throw UnsupportedOperationException("wputenv not available on Android host — use androidNative target for FFI")

public actual fun putenvS(envstring: String?, valueString: String?): Int =
    if (envstring == null || valueString == null) 22 else LibcJni.putenvS(envstring, valueString)

public actual fun wputenvS(envstring: UShort?, valueString: UShort?): Int =
    throw UnsupportedOperationException("wputenvS not available on Android host — use androidNative target for FFI")

public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort not available on Android host — use androidNative target for FFI")

public actual fun qsortS(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortS not available on Android host — use androidNative target for FFI")

public actual fun atexit(cb: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit not available on Android host — use androidNative target for FFI")
