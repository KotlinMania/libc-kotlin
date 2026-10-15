// port-lint: source Mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public actual fun printf(format: String?, vararg args: Any?): Int =
    if (format != null) LibcNative.printf(format) else -1

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum requires N-API addon")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl requires N-API addon")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph requires N-API addon")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct requires N-API addon")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper requires N-API addon")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit requires N-API addon")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank requires N-API addon")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper requires N-API addon")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (filename != null && mode != null) {
        val h = LibcNative.fopen(filename, mode)
        if (h != 0) FILE(h.toLong()) else null
    } else {
        null
    }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun fflush(file: FILE?): Int =
    LibcNative.fflush(file?.handle?.toInt() ?: -1)

public actual fun fclose(file: FILE?): Int =
    LibcNative.fclose(file?.handle?.toInt() ?: -1)

public actual fun remove(filename: String?): Int =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rename(oldname: String?, newname: String?): Int =
    throw UnsupportedOperationException("rename requires N-API addon")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires N-API addon")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf requires N-API addon")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun putchar(c: Int): Int =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun fgetc(stream: FILE?): Int =
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun fputc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun fputs(s: String?, stream: FILE?): Int =
    throw UnsupportedOperationException("fputs requires N-API addon")

public actual fun puts(s: String?): Int =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun ungetc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    LibcNative.fread(ptr?.value, size.toInt(), nobj.toInt(), stream?.handle?.toInt() ?: -1).toULong()

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    LibcNative.fwrite(ptr?.value, size.toInt(), nobj.toInt(), stream?.handle?.toInt() ?: -1).toULong()

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    LibcNative.fseek(stream?.handle?.toInt() ?: -1, offset.toInt(), whence)

public actual fun ftell(stream: FILE?): Long =
    LibcNative.ftell(stream?.handle?.toInt() ?: -1).toLong()

public actual fun rewind(stream: FILE?): Unit = throw UnsupportedOperationException("rewind requires N-API addon")

public actual fun fgetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun feof(stream: FILE?): Int =
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(stream: FILE?): Int =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun perror(s: String?): Unit = throw UnsupportedOperationException("perror requires N-API addon")

public actual fun atoi(s: String?): Int =
    atoiNapi(s)

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    strtolNapi(s, base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    callocNapi(nobj, size)

public actual fun malloc(size: ULong): COpaquePointer? =
    mallocNapi(size)

public actual fun msize(p: COpaquePointer?): ULong =
    throw UnsupportedOperationException("msize requires N-API addon")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    reallocNapi(p, size)

public actual fun free(p: COpaquePointer?) {
    freeNapi(p)
}

public actual fun system(s: String?): Int =
    systemNapi(s)

public actual fun getenv(s: String?): String? =
    getenvNapi(s)

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires N-API addon")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires N-API addon")

public actual fun strcmp(cs: String?, ct: String?): Int =
    strcmpNapi(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    strncmpNapi(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strchr(cs: String?, c: Int): String? =
    if (cs == null) {
        null
    } else {
        val idx = cs.indexOf(c.toChar())
        if (idx >= 0) cs.substring(idx) else null
    }

public actual fun strrchr(cs: String?, c: Int): String? =
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
    strlenNapi(cs)

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strerror(n: Int): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun wcslen(buf: UShort?): ULong =
    throw UnsupportedOperationException("wcslen requires N-API addon")

public actual fun wcsnlen(str: UShort?, numberOfElements: ULong): ULong =
    throw UnsupportedOperationException("wcsnlen requires N-API addon")

public actual fun wcstombs(dest: String?, src: UShort?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires N-API addon")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    LibcNative.memcmp(cx?.value, ct?.value, n.toInt())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    run {
        val r = LibcNative.memcpy(dest?.value, src?.value, n.toInt())
        if (r != null && r != 0) COpaquePointer(r.toLong()) else null
    }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    run {
        val r = LibcNative.memset(dest?.value, c, n.toInt())
        if (r != null && r != 0) COpaquePointer(r.toLong()) else null
    }

public actual fun abs(i: Int): Int =
    LibcNative.abs(i)

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun raise(signum: Int): Int =
    throw UnsupportedOperationException("raise requires N-API addon")

public actual fun clock(): Int =
    throw UnsupportedOperationException("clock requires N-API addon")

public actual fun ctime(sourceTime: Long?): String? =
    throw UnsupportedOperationException("ctime requires N-API addon")

public actual fun gmtimeS(destTime: Tm?, srcTime: Long?): Int =
    throw UnsupportedOperationException("gmtimeS requires N-API addon")

public actual fun getDaylight(hours: Int?): Int =
    throw UnsupportedOperationException("getDaylight requires N-API addon")

public actual fun getDstbias(seconds: Long?): Int =
    throw UnsupportedOperationException("getDstbias requires N-API addon")

public actual fun getTimezone(seconds: Long?): Int =
    throw UnsupportedOperationException("getTimezone requires N-API addon")

public actual fun getTzname(pReturnValue: ULong?, timeZoneName: String?, sizeInBytes: ULong, index: Int): Int =
    throw UnsupportedOperationException("getTzname requires N-API addon")

public actual fun localtimeS(tmDest: Tm?, sourceTime: Long?): Int =
    throw UnsupportedOperationException("localtimeS requires N-API addon")

public actual fun time(destTime: Long?): Long =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun tzset(): Unit = throw UnsupportedOperationException("tzset requires N-API addon")

public actual fun chmod(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("chmod requires N-API addon")

public actual fun wchmod(path: UShort?, mode: Int): Int =
    throw UnsupportedOperationException("wchmod requires N-API addon")

public actual fun mkdir(path: String?): Int =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun wrmdir(path: UShort?): Int =
    throw UnsupportedOperationException("wrmdir requires N-API addon")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires N-API addon")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun wstat(path: UShort?, buf: Stat?): Int =
    throw UnsupportedOperationException("wstat requires N-API addon")

public actual fun wutime(file: UShort?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("wutime requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun pclose(stream: FILE?): Int =
    throw UnsupportedOperationException("pclose requires N-API addon")

public actual fun fdopen(fd: Int, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon")

public actual fun fileno(stream: FILE?): Int =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun wopen(path: UShort?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("wopen requires N-API addon")

public actual fun creat(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun access(path: String?, amode: Int): Int =
    accessNapi(path, amode)

public actual fun chdir(dir: String?): Int =
    throw UnsupportedOperationException("chdir requires N-API addon")

public actual fun close(fd: Int): Int =
    closeNapi(fd)

public actual fun dup(fd: Int): Int =
    throw UnsupportedOperationException("dup requires N-API addon")

public actual fun dup2(src: Int, dst: Int): Int =
    throw UnsupportedOperationException("dup2 requires N-API addon")

public actual fun execl(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execl requires N-API addon")

public actual fun wexecl(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexecl requires N-API addon")

public actual fun execle(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execle requires N-API addon")

public actual fun wexecle(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexecle requires N-API addon")

public actual fun execlp(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execlp requires N-API addon")

public actual fun wexeclp(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexeclp requires N-API addon")

public actual fun execlpe(path: String?, arg0: String?, vararg args: Any?): Long =
    throw UnsupportedOperationException("execlpe requires N-API addon")

public actual fun wexeclpe(path: UShort?, arg0: UShort?, vararg args: Any?): Long =
    throw UnsupportedOperationException("wexeclpe requires N-API addon")

public actual fun execv(prog: String?, argv: COpaquePointer?): Long =
    throw UnsupportedOperationException("execv requires N-API addon")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execve requires N-API addon")

public actual fun execvp(c: String?, argv: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvp requires N-API addon")

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun wexecv(prog: UShort?, argv: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecv requires N-API addon")

public actual fun wexecve(prog: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecve requires N-API addon")

public actual fun wexecvp(c: UShort?, argv: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecvp requires N-API addon")

public actual fun wexecvpe(c: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): Long =
    throw UnsupportedOperationException("wexecvpe requires N-API addon")

public actual fun getcwd(buf: String?, size: Int): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun getpid(): Int =
    getpidNapi()

public actual fun isatty(fd: Int): Int =
    isattyNapi(fd)

public actual fun lseek(fd: Int, offset: Long, origin: Int): Long =
    LibcNative.lseek(fd, offset.toInt(), origin).toLong()

public actual fun lseek64(fd: Int, offset: Long, origin: Int): Long =
    throw UnsupportedOperationException("lseek64 requires N-API addon")

public actual fun pipe(fds: Int?, psize: UInt, textmode: Int): Int =
    throw UnsupportedOperationException("pipe requires N-API addon")

public actual fun read(fd: Int, buf: COpaquePointer?, count: UInt): Int =
    LibcNative.read(fd, buf?.value, count.toInt())

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun unlink(c: String?): Int =
    unlinkNapi(c)

public actual fun write(fd: Int, buf: COpaquePointer?, count: UInt): Int =
    LibcNative.write(fd, buf?.value, count.toInt())

public actual fun commit(fd: Int): Int =
    throw UnsupportedOperationException("commit requires N-API addon")

public actual fun getOsfhandle(fd: Int): Long =
    throw UnsupportedOperationException("getOsfhandle requires N-API addon")

public actual fun openOsfhandle(osfhandle: Long, flags: Int): Int =
    throw UnsupportedOperationException("openOsfhandle requires N-API addon")

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon")

public actual fun wsetlocale(category: Int, locale: UShort?): UShort? =
    throw UnsupportedOperationException("wsetlocale requires N-API addon")

public actual fun alignedMalloc(size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedMalloc requires N-API addon")

public actual fun alignedFree(ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("alignedFree requires N-API addon")

public actual fun alignedRealloc(memblock: COpaquePointer?, size: ULong, alignment: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedRealloc requires N-API addon")

public actual fun putenv(envstring: String?): Int =
    putenvNapi(envstring)

public actual fun wputenv(envstring: UShort?): Int =
    throw UnsupportedOperationException("wputenv requires N-API addon")

public actual fun putenvS(envstring: String?, valueString: String?): Int =
    putenvSNapi(envstring, valueString)

public actual fun wputenvS(envstring: UShort?, valueString: UShort?): Int =
    throw UnsupportedOperationException("wputenvS requires N-API addon")

public actual fun qsort(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires N-API addon")

public actual fun qsortS(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortS requires N-API addon")

public actual fun atexit(cb: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires N-API addon")
