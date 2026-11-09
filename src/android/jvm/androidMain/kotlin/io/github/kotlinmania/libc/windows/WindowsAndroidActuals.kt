@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong

private object WindowsJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_windows_isalnum(c: Int): Int

    @JvmStatic
    external fun libc_windows_isalpha(c: Int): Int

    @JvmStatic
    external fun libc_windows_iscntrl(c: Int): Int

    @JvmStatic
    external fun libc_windows_isdigit(c: Int): Int

    @JvmStatic
    external fun libc_windows_isgraph(c: Int): Int

    @JvmStatic
    external fun libc_windows_islower(c: Int): Int

    @JvmStatic
    external fun libc_windows_isprint(c: Int): Int

    @JvmStatic
    external fun libc_windows_ispunct(c: Int): Int

    @JvmStatic
    external fun libc_windows_isspace(c: Int): Int

    @JvmStatic
    external fun libc_windows_isupper(c: Int): Int

    @JvmStatic
    external fun libc_windows_isxdigit(c: Int): Int

    @JvmStatic
    external fun libc_windows_isblank(c: Int): Int

    @JvmStatic
    external fun libc_windows_tolower(c: Int): Int

    @JvmStatic
    external fun libc_windows_toupper(c: Int): Int

    @JvmStatic
    external fun libc_windows_qsort(base: Long, num: Long, size: Long, compar: Long)

    @JvmStatic
    external fun libc_windows_qsortS(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libc_windows_fopen(filename: String?, mode: String?): Long

    @JvmStatic
    external fun libc_windows_freopen(filename: String?, mode: String?, file: Long): Long

    @JvmStatic
    external fun libc_windows_fflush(file: Long): Int

    @JvmStatic
    external fun libc_windows_fclose(file: Long): Int

    @JvmStatic
    external fun libc_windows_remove(filename: String?): Int

    @JvmStatic
    external fun libc_windows_rename(oldname: String?, newname: String?): Int

    @JvmStatic
    external fun libc_windows_tmpfile(): Long

    @JvmStatic
    external fun libc_windows_setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int

    @JvmStatic
    external fun libc_windows_setbuf(stream: Long, buf: Long)

    @JvmStatic
    external fun libc_windows_getchar(): Int

    @JvmStatic
    external fun libc_windows_putchar(c: Int): Int

    @JvmStatic
    external fun libc_windows_fgetc(stream: Long): Int

    @JvmStatic
    external fun libc_windows_fgets(buf: Long, n: Int, stream: Long): Long

    @JvmStatic
    external fun libc_windows_fputc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_windows_fputs(s: String?, stream: Long): Int

    @JvmStatic
    external fun libc_windows_puts(s: String?): Int

    @JvmStatic
    external fun libc_windows_ungetc(c: Int, stream: Long): Int

    @JvmStatic
    external fun libc_windows_fread(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_windows_fwrite(ptr: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_windows_fseek(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_windows_ftell(stream: Long): Long

    @JvmStatic
    external fun libc_windows_rewind(stream: Long)

    @JvmStatic
    external fun libc_windows_fgetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_windows_fsetpos(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_windows_feof(stream: Long): Int

    @JvmStatic
    external fun libc_windows_ferror(stream: Long): Int

    @JvmStatic
    external fun libc_windows_perror(s: String?)

    @JvmStatic
    external fun libc_windows_atof(s: String?): Double

    @JvmStatic
    external fun libc_windows_atoi(s: String?): Int

    @JvmStatic
    external fun libc_windows_atol(s: String?): Long

    @JvmStatic
    external fun libc_windows_atoll(s: String?): Long

    @JvmStatic
    external fun libc_windows_strtod(s: String?, endp: Long): Double

    @JvmStatic
    external fun libc_windows_strtof(s: String?, endp: Long): Float

    @JvmStatic
    external fun libc_windows_strtol(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_windows_strtoll(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_windows_strtoul(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_windows_strtoull(s: String?, endp: Long, base: Int): Long

    @JvmStatic
    external fun libc_windows_calloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libc_windows_malloc(size: Long): Long

    @JvmStatic
    external fun libc_windows_msize(p: Long): Long

    @JvmStatic
    external fun libc_windows_realloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libc_windows_free(p: Long)

    @JvmStatic
    external fun libc_windows_abort()

    @JvmStatic
    external fun libc_windows_exit(status: Int)

    @JvmStatic
    external fun libc_windows_atexit(cb: Long): Int

    @JvmStatic
    external fun libc_windows_system(s: String?): Int

    @JvmStatic
    external fun libc_windows_getenv(s: String?): Long

    @JvmStatic
    external fun libc_windows_strcpy(dst: Long, src: String?): Long

    @JvmStatic
    external fun libc_windows_strncpy(dst: Long, src: String?, n: Long): Long

    @JvmStatic
    external fun libc_windows_strcat(s: Long, ct: String?): Long

    @JvmStatic
    external fun libc_windows_strncat(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_windows_strcmp(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_windows_strncmp(cs: String?, ct: String?, n: Long): Int

    @JvmStatic
    external fun libc_windows_strcoll(cs: String?, ct: String?): Int

    @JvmStatic
    external fun libc_windows_strchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_windows_strrchr(cs: String?, c: Int): Long

    @JvmStatic
    external fun libc_windows_strspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_windows_strcspn(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_windows_strdup(cs: String?): Long

    @JvmStatic
    external fun libc_windows_strpbrk(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_windows_strstr(cs: String?, ct: String?): Long

    @JvmStatic
    external fun libc_windows_strlen(cs: String?): Long

    @JvmStatic
    external fun libc_windows_strnlen(cs: String?, maxlen: Long): Long

    @JvmStatic
    external fun libc_windows_strerror(n: Int): Long

    @JvmStatic
    external fun libc_windows_strtok(s: Long, t: String?): Long

    @JvmStatic
    external fun libc_windows_strxfrm(s: Long, ct: String?, n: Long): Long

    @JvmStatic
    external fun libc_windows_wcslen(buf: Long): Long

    @JvmStatic
    external fun libc_windows_wcsnlen(str: Long, numberOfElements: Long): Long

    @JvmStatic
    external fun libc_windows_wcstombs(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_windows_memchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_windows_memcmp(cx: Long, ct: Long, n: Long): Int

    @JvmStatic
    external fun libc_windows_memcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_windows_memmove(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libc_windows_memset(dest: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_windows_abs(i: Int): Int

    @JvmStatic
    external fun libc_windows_labs(i: Long): Long

    @JvmStatic
    external fun libc_windows_rand(): Int

    @JvmStatic
    external fun libc_windows_srand(seed: Int)

    @JvmStatic
    external fun libc_windows_signal(signum: Int, handler: Long): Long

    @JvmStatic
    external fun libc_windows_raise(signum: Int): Int

    @JvmStatic
    external fun libc_windows_clock(): Int

    @JvmStatic
    external fun libc_windows_ctime(sourceTime: Long): Long

    @JvmStatic
    external fun libc_windows_difftime(timeEnd: Long, timeStart: Long): Double

    @JvmStatic
    external fun libc_windows_gmtimeS(destTime: Long, srcTime: Long): Int

    @JvmStatic
    external fun libc_windows_getDaylight(hours: Long): Int

    @JvmStatic
    external fun libc_windows_getDstbias(seconds: Long): Int

    @JvmStatic
    external fun libc_windows_getTimezone(seconds: Long): Int

    @JvmStatic
    external fun libc_windows_getTzname(pReturnValue: Long, timeZoneName: Long, sizeInBytes: Long, index: Int): Int

    @JvmStatic
    external fun libc_windows_localtimeS(tmDest: Long, sourceTime: Long): Int

    @JvmStatic
    external fun libc_windows_time(destTime: Long): Long

    @JvmStatic
    external fun libc_windows_tzset()

    @JvmStatic
    external fun libc_windows_chmod(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_windows_wchmod(path: Long, mode: Int): Int

    @JvmStatic
    external fun libc_windows_mkdir(path: String?): Int

    @JvmStatic
    external fun libc_windows_wrmdir(path: Long): Int

    @JvmStatic
    external fun libc_windows_fstat(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_windows_stat(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_windows_wstat(path: Long, buf: Long): Int

    @JvmStatic
    external fun libc_windows_wutime(file: Long, buf: Long): Int

    @JvmStatic
    external fun libc_windows_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_windows_pclose(stream: Long): Int

    @JvmStatic
    external fun libc_windows_fdopen(fd: Int, mode: String?): Long

    @JvmStatic
    external fun libc_windows_fileno(stream: Long): Int

    @JvmStatic
    external fun libc_windows_creat(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_windows_access(path: String?, amode: Int): Int

    @JvmStatic
    external fun libc_windows_chdir(dir: String?): Int

    @JvmStatic
    external fun libc_windows_close(fd: Int): Int

    @JvmStatic
    external fun libc_windows_dup(fd: Int): Int

    @JvmStatic
    external fun libc_windows_dup2(src: Int, dst: Int): Int

    @JvmStatic
    external fun libc_windows_execv(prog: String?, argv: Long): Long

    @JvmStatic
    external fun libc_windows_execve(prog: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_windows_execvp(c: String?, argv: Long): Int

    @JvmStatic
    external fun libc_windows_execvpe(c: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_windows_wexecv(prog: Long, argv: Long): Long

    @JvmStatic
    external fun libc_windows_wexecve(prog: Long, argv: Long, envp: Long): Long

    @JvmStatic
    external fun libc_windows_wexecvp(c: Long, argv: Long): Long

    @JvmStatic
    external fun libc_windows_wexecvpe(c: Long, argv: Long, envp: Long): Long

    @JvmStatic
    external fun libc_windows_getcwd(buf: Long, size: Int): Long

    @JvmStatic
    external fun libc_windows_getpid(): Int

    @JvmStatic
    external fun libc_windows_isatty(fd: Int): Int

    @JvmStatic
    external fun libc_windows_lseek(fd: Int, offset: Long, origin: Int): Long

    @JvmStatic
    external fun libc_windows_lseek64(fd: Int, offset: Long, origin: Int): Long

    @JvmStatic
    external fun libc_windows_pipe(fds: Long, psize: Int, textmode: Int): Int

    @JvmStatic
    external fun libc_windows_read(fd: Int, buf: Long, count: Int): Int

    @JvmStatic
    external fun libc_windows_rmdir(path: String?): Int

    @JvmStatic
    external fun libc_windows_unlink(c: String?): Int

    @JvmStatic
    external fun libc_windows_write(fd: Int, buf: Long, count: Int): Int

    @JvmStatic
    external fun libc_windows_commit(fd: Int): Int

    @JvmStatic
    external fun libc_windows_getOsfhandle(fd: Int): Long

    @JvmStatic
    external fun libc_windows_openOsfhandle(osfhandle: Long, flags: Int): Int

    @JvmStatic
    external fun libc_windows_setlocale(category: Int, locale: String?): Long

    @JvmStatic
    external fun libc_windows_wsetlocale(category: Int, locale: Long): Long

    @JvmStatic
    external fun libc_windows_alignedMalloc(size: Long, alignment: Long): Long

    @JvmStatic
    external fun libc_windows_alignedFree(ptr: Long)

    @JvmStatic
    external fun libc_windows_alignedRealloc(memblock: Long, size: Long, alignment: Long): Long

    @JvmStatic
    external fun libc_windows_putenv(envstring: String?): Int

    @JvmStatic
    external fun libc_windows_wputenv(envstring: Long): Int

    @JvmStatic
    external fun libc_windows_putenvS(envstring: String?, valueString: String?): Int

    @JvmStatic
    external fun libc_windows_wputenvS(envstring: Long, valueString: Long): Int

    @JvmStatic
    external fun libc_windows_listen(s: Long, backlog: Int): Int

    @JvmStatic
    external fun libc_windows_accept(s: Long, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_windows_bind(s: Long, name: Long, namelen: Int): Int

    @JvmStatic
    external fun libc_windows_connect(s: Long, name: Long, namelen: Int): Int

    @JvmStatic
    external fun libc_windows_getpeername(s: Long, name: Long, nameln: Long): Int

    @JvmStatic
    external fun libc_windows_getsockname(s: Long, name: Long, nameln: Long): Int

    @JvmStatic
    external fun libc_windows_getsockopt(s: Long, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libc_windows_recvfrom(s: Long, buf: Long, len: Int, flags: Int, from: Long, fromlen: Long): Int

    @JvmStatic
    external fun libc_windows_sendto(s: Long, buf: String?, len: Int, flags: Int, to: Long, tolen: Int): Int

    @JvmStatic
    external fun libc_windows_setsockopt(s: Long, level: Int, optname: Int, optval: String?, optlen: Int): Int

    @JvmStatic
    external fun libc_windows_socket(af: Int, socketType: Int, protocol: Int): Long
}

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun isalnum(c: CInt): CInt =
    WindowsJniBridge.libc_windows_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    WindowsJniBridge.libc_windows_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    WindowsJniBridge.libc_windows_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    WindowsJniBridge.libc_windows_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    WindowsJniBridge.libc_windows_isgraph(c)

public actual fun islower(c: CInt): CInt =
    WindowsJniBridge.libc_windows_islower(c)

public actual fun isprint(c: CInt): CInt =
    WindowsJniBridge.libc_windows_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    WindowsJniBridge.libc_windows_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    WindowsJniBridge.libc_windows_isspace(c)

public actual fun isupper(c: CInt): CInt =
    WindowsJniBridge.libc_windows_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    WindowsJniBridge.libc_windows_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    WindowsJniBridge.libc_windows_isblank(c)

public actual fun tolower(c: CInt): CInt =
    WindowsJniBridge.libc_windows_tolower(c)

public actual fun toupper(c: CInt): CInt =
    WindowsJniBridge.libc_windows_toupper(c)

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback?) {
    WindowsJniBridge.libc_windows_qsort((base?.value ?: 0L), num.toLong(), size.toLong(), 0L)
}

public actual fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback1?, arg: COpaquePointer?) {
    WindowsJniBridge.libc_windows_qsortS((base?.value ?: 0L), num.toLong(), size.toLong(), 0L, (arg?.value ?: 0L))
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    WindowsJniBridge.libc_windows_fopen(filename, mode).let { if (it == 0L) null else FILE(it) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    WindowsJniBridge.libc_windows_freopen(filename, mode, (file?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun fflush(file: FILE?): CInt =
    WindowsJniBridge.libc_windows_fflush((file?.handle ?: 0L))

public actual fun fclose(file: FILE?): CInt =
    WindowsJniBridge.libc_windows_fclose((file?.handle ?: 0L))

public actual fun remove(filename: String?): CInt =
    WindowsJniBridge.libc_windows_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    WindowsJniBridge.libc_windows_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    WindowsJniBridge.libc_windows_tmpfile().let { if (it == 0L) null else FILE(it) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    WindowsJniBridge.libc_windows_setvbuf((stream?.handle ?: 0L), (buffer?.value ?: 0L), mode, size.toLong())

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    WindowsJniBridge.libc_windows_setbuf((stream?.handle ?: 0L), (buf?.value ?: 0L))
}

public actual fun getchar(): CInt =
    WindowsJniBridge.libc_windows_getchar()

public actual fun putchar(c: CInt): CInt =
    WindowsJniBridge.libc_windows_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    WindowsJniBridge.libc_windows_fgetc((stream?.handle ?: 0L))

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    WindowsJniBridge.libc_windows_fgets((buf?.value ?: 0L), n, (stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    WindowsJniBridge.libc_windows_fputc(c, (stream?.handle ?: 0L))

public actual fun fputs(s: String?, stream: FILE?): CInt =
    WindowsJniBridge.libc_windows_fputs(s, (stream?.handle ?: 0L))

public actual fun puts(s: String?): CInt =
    WindowsJniBridge.libc_windows_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    WindowsJniBridge.libc_windows_ungetc(c, (stream?.handle ?: 0L))

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    WindowsJniBridge.libc_windows_fread((ptr?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    WindowsJniBridge.libc_windows_fwrite((ptr?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    WindowsJniBridge.libc_windows_fseek((stream?.handle ?: 0L), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    WindowsJniBridge.libc_windows_ftell((stream?.handle ?: 0L))

public actual fun rewind(stream: FILE?) {
    WindowsJniBridge.libc_windows_rewind((stream?.handle ?: 0L))
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_fgetpos((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_fsetpos((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun feof(stream: FILE?): CInt =
    WindowsJniBridge.libc_windows_feof((stream?.handle ?: 0L))

public actual fun ferror(stream: FILE?): CInt =
    WindowsJniBridge.libc_windows_ferror((stream?.handle ?: 0L))

public actual fun perror(s: String?) {
    WindowsJniBridge.libc_windows_perror(s)
}

public actual fun atof(s: String?): CDouble =
    WindowsJniBridge.libc_windows_atof(s)

public actual fun atoi(s: String?): CInt =
    WindowsJniBridge.libc_windows_atoi(s)

public actual fun atol(s: String?): CLong =
    WindowsJniBridge.libc_windows_atol(s)

public actual fun atoll(s: String?): CLonglong =
    WindowsJniBridge.libc_windows_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    WindowsJniBridge.libc_windows_strtod(s, (endp?.value ?: 0L))

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    WindowsJniBridge.libc_windows_strtof(s, (endp?.value ?: 0L))

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    WindowsJniBridge.libc_windows_strtol(s, (endp?.value ?: 0L), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    WindowsJniBridge.libc_windows_strtoll(s, (endp?.value ?: 0L), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    WindowsJniBridge.libc_windows_strtoul(s, (endp?.value ?: 0L), base).toULong()

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    WindowsJniBridge.libc_windows_strtoull(s, (endp?.value ?: 0L), base).toULong()

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_calloc(nobj.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_malloc(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun msize(p: COpaquePointer?): SizeT =
    WindowsJniBridge.libc_windows_msize((p?.value ?: 0L)).toULong()

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_realloc((p?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    WindowsJniBridge.libc_windows_free((p?.value ?: 0L))
}

public actual fun abort(): Nothing {
    WindowsJniBridge.libc_windows_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    WindowsJniBridge.libc_windows_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: FnCallback2): CInt =
    WindowsJniBridge.libc_windows_atexit(0L)

public actual fun system(s: String?): CInt =
    WindowsJniBridge.libc_windows_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    WindowsJniBridge.libc_windows_getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    WindowsJniBridge.libc_windows_strcpy((dst?.value ?: 0L), src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_strncpy((dst?.value ?: 0L), src, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    WindowsJniBridge.libc_windows_strcat((s?.value ?: 0L), ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_strncat((s?.value ?: 0L), ct, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    WindowsJniBridge.libc_windows_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    WindowsJniBridge.libc_windows_strncmp(cs, ct, n.toLong())

public actual fun strcoll(cs: String?, ct: String?): CInt =
    WindowsJniBridge.libc_windows_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    WindowsJniBridge.libc_windows_strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    WindowsJniBridge.libc_windows_strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    WindowsJniBridge.libc_windows_strspn(cs, ct).toULong()

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    WindowsJniBridge.libc_windows_strcspn(cs, ct).toULong()

public actual fun strdup(cs: String?): COpaquePointer? =
    WindowsJniBridge.libc_windows_strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    WindowsJniBridge.libc_windows_strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    WindowsJniBridge.libc_windows_strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strlen(cs: String?): SizeT =
    WindowsJniBridge.libc_windows_strlen(cs).toULong()

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    WindowsJniBridge.libc_windows_strnlen(cs, maxlen.toLong()).toULong()

public actual fun strerror(n: CInt): COpaquePointer? =
    WindowsJniBridge.libc_windows_strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    WindowsJniBridge.libc_windows_strtok((s?.value ?: 0L), t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    WindowsJniBridge.libc_windows_strxfrm((s?.value ?: 0L), ct, n.toLong()).toULong()

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    WindowsJniBridge.libc_windows_wcslen((buf?.value ?: 0L)).toULong()

public actual fun wcsnlen(str: COpaquePointer?, numberOfElements: SizeT): SizeT =
    WindowsJniBridge.libc_windows_wcsnlen((str?.value ?: 0L), numberOfElements.toLong()).toULong()

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    WindowsJniBridge.libc_windows_wcstombs((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).toULong()

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_memchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    WindowsJniBridge.libc_windows_memcmp((cx?.value ?: 0L), (ct?.value ?: 0L), n.toLong())

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_memcpy((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_memmove((dest?.value ?: 0L), (src?.value ?: 0L), n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_memset((dest?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    WindowsJniBridge.libc_windows_abs(i)

public actual fun labs(i: CLong): CLong =
    WindowsJniBridge.libc_windows_labs(i)

public actual fun rand(): CInt =
    WindowsJniBridge.libc_windows_rand()

public actual fun srand(seed: CUint) {
    WindowsJniBridge.libc_windows_srand(seed.toInt())
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    WindowsJniBridge.libc_windows_signal(signum, handler.toLong()).toULong()

public actual fun raise(signum: CInt): CInt =
    WindowsJniBridge.libc_windows_raise(signum)

public actual fun clock(): ClockT =
    WindowsJniBridge.libc_windows_clock()

public actual fun ctime(sourceTime: COpaquePointer?): COpaquePointer? =
    WindowsJniBridge.libc_windows_ctime((sourceTime?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    WindowsJniBridge.libc_windows_difftime(timeEnd, timeStart)

public actual fun gmtimeS(destTime: COpaquePointer?, srcTime: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_gmtimeS((destTime?.value ?: 0L), (srcTime?.value ?: 0L))

public actual fun getDaylight(hours: COpaquePointer?): ErrnoT =
    WindowsJniBridge.libc_windows_getDaylight((hours?.value ?: 0L))

public actual fun getDstbias(seconds: COpaquePointer?): ErrnoT =
    WindowsJniBridge.libc_windows_getDstbias((seconds?.value ?: 0L))

public actual fun getTimezone(seconds: COpaquePointer?): ErrnoT =
    WindowsJniBridge.libc_windows_getTimezone((seconds?.value ?: 0L))

public actual fun getTzname(pReturnValue: COpaquePointer?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT =
    WindowsJniBridge.libc_windows_getTzname((pReturnValue?.value ?: 0L), (timeZoneName?.value ?: 0L), sizeInBytes.toLong(), index)

public actual fun localtimeS(tmDest: COpaquePointer?, sourceTime: COpaquePointer?): ErrnoT =
    WindowsJniBridge.libc_windows_localtimeS((tmDest?.value ?: 0L), (sourceTime?.value ?: 0L))

public actual fun time(destTime: COpaquePointer?): TimeT =
    WindowsJniBridge.libc_windows_time((destTime?.value ?: 0L))

public actual fun tzset() {
    WindowsJniBridge.libc_windows_tzset()
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    WindowsJniBridge.libc_windows_chmod(path, mode)

public actual fun wchmod(path: COpaquePointer?, mode: CInt): CInt =
    WindowsJniBridge.libc_windows_wchmod((path?.value ?: 0L), mode)

public actual fun mkdir(path: String?): CInt =
    WindowsJniBridge.libc_windows_mkdir(path)

public actual fun wrmdir(path: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_wrmdir((path?.value ?: 0L))

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_fstat(fildes, (buf?.value ?: 0L))

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_stat(path, (buf?.value ?: 0L))

public actual fun wstat(path: COpaquePointer?, buf: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_wstat((path?.value ?: 0L), (buf?.value ?: 0L))

public actual fun wutime(file: COpaquePointer?, buf: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_wutime((file?.value ?: 0L), (buf?.value ?: 0L))

public actual fun popen(command: String?, mode: String?): FILE? =
    WindowsJniBridge.libc_windows_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun pclose(stream: FILE?): CInt =
    WindowsJniBridge.libc_windows_pclose((stream?.handle ?: 0L))

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    WindowsJniBridge.libc_windows_fdopen(fd, mode).let { if (it == 0L) null else FILE(it) }

public actual fun fileno(stream: FILE?): CInt =
    WindowsJniBridge.libc_windows_fileno((stream?.handle ?: 0L))

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun wopen(path: COpaquePointer?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(path: String?, mode: CInt): CInt =
    WindowsJniBridge.libc_windows_creat(path, mode)

public actual fun access(path: String?, amode: CInt): CInt =
    WindowsJniBridge.libc_windows_access(path, amode)

public actual fun chdir(dir: String?): CInt =
    WindowsJniBridge.libc_windows_chdir(dir)

public actual fun close(fd: CInt): CInt =
    WindowsJniBridge.libc_windows_close(fd)

public actual fun dup(fd: CInt): CInt =
    WindowsJniBridge.libc_windows_dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    WindowsJniBridge.libc_windows_dup2(src, dst)

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun wexecl(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun wexecle(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun execlp(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun wexeclp(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun execlpe(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun wexeclpe(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    WindowsJniBridge.libc_windows_execv(prog, (argv?.value ?: 0L))

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_execve(prog, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_execvp(c, (argv?.value ?: 0L))

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_execvpe(c, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun wexecv(prog: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    WindowsJniBridge.libc_windows_wexecv((prog?.value ?: 0L), (argv?.value ?: 0L))

public actual fun wexecve(prog: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    WindowsJniBridge.libc_windows_wexecve((prog?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun wexecvp(c: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    WindowsJniBridge.libc_windows_wexecvp((c?.value ?: 0L), (argv?.value ?: 0L))

public actual fun wexecvpe(c: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    WindowsJniBridge.libc_windows_wexecvpe((c?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? =
    WindowsJniBridge.libc_windows_getcwd((buf?.value ?: 0L), size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpid(): CInt =
    WindowsJniBridge.libc_windows_getpid()

public actual fun isatty(fd: CInt): CInt =
    WindowsJniBridge.libc_windows_isatty(fd)

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    WindowsJniBridge.libc_windows_lseek(fd, offset, origin)

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    WindowsJniBridge.libc_windows_lseek64(fd, offset, origin)

public actual fun pipe(fds: COpaquePointer?, psize: CUint, textmode: CInt): CInt =
    WindowsJniBridge.libc_windows_pipe((fds?.value ?: 0L), psize.toInt(), textmode)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    WindowsJniBridge.libc_windows_read(fd, (buf?.value ?: 0L), count.toInt())

public actual fun rmdir(path: String?): CInt =
    WindowsJniBridge.libc_windows_rmdir(path)

public actual fun unlink(c: String?): CInt =
    WindowsJniBridge.libc_windows_unlink(c)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    WindowsJniBridge.libc_windows_write(fd, (buf?.value ?: 0L), count.toInt())

public actual fun commit(fd: CInt): CInt =
    WindowsJniBridge.libc_windows_commit(fd)

public actual fun getOsfhandle(fd: CInt): IntptrT =
    WindowsJniBridge.libc_windows_getOsfhandle(fd)

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    WindowsJniBridge.libc_windows_openOsfhandle(osfhandle, flags)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    WindowsJniBridge.libc_windows_setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wsetlocale(category: CInt, locale: COpaquePointer?): COpaquePointer? =
    WindowsJniBridge.libc_windows_wsetlocale(category, (locale?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_alignedMalloc(size.toLong(), alignment.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun alignedFree(ptr: COpaquePointer?) {
    WindowsJniBridge.libc_windows_alignedFree((ptr?.value ?: 0L))
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? =
    WindowsJniBridge.libc_windows_alignedRealloc((memblock?.value ?: 0L), size.toLong(), alignment.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun putenv(envstring: String?): CInt =
    WindowsJniBridge.libc_windows_putenv(envstring)

public actual fun wputenv(envstring: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_wputenv((envstring?.value ?: 0L))

public actual fun putenvS(envstring: String?, valueString: String?): ErrnoT =
    WindowsJniBridge.libc_windows_putenvS(envstring, valueString)

public actual fun wputenvS(envstring: COpaquePointer?, valueString: COpaquePointer?): ErrnoT =
    WindowsJniBridge.libc_windows_wputenvS((envstring?.value ?: 0L), (valueString?.value ?: 0L))

public actual fun listen(s: Socket, backlog: CInt): CInt =
    WindowsJniBridge.libc_windows_listen(s.toLong(), backlog)

public actual fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket =
    WindowsJniBridge.libc_windows_accept(s.toLong(), (addr?.value ?: 0L), (addrlen?.value ?: 0L)).toULong()

public actual fun bind(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    WindowsJniBridge.libc_windows_bind(s.toLong(), (name?.value ?: 0L), namelen)

public actual fun connect(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    WindowsJniBridge.libc_windows_connect(s.toLong(), (name?.value ?: 0L), namelen)

public actual fun getpeername(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_getpeername(s.toLong(), (name?.value ?: 0L), (nameln?.value ?: 0L))

public actual fun getsockname(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_getsockname(s.toLong(), (name?.value ?: 0L), (nameln?.value ?: 0L))

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_getsockopt(s.toLong(), level, optname, (optval?.value ?: 0L), (optlen?.value ?: 0L))

public actual fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: COpaquePointer?, fromlen: COpaquePointer?): CInt =
    WindowsJniBridge.libc_windows_recvfrom(s.toLong(), (buf?.value ?: 0L), len, flags, (from?.value ?: 0L), (fromlen?.value ?: 0L))

public actual fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: COpaquePointer?, tolen: CInt): CInt =
    WindowsJniBridge.libc_windows_sendto(s.toLong(), buf, len, flags, (to?.value ?: 0L), tolen)

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt =
    WindowsJniBridge.libc_windows_setsockopt(s.toLong(), level, optname, optval, optlen)

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    WindowsJniBridge.libc_windows_socket(af, socketType, protocol).toULong()
