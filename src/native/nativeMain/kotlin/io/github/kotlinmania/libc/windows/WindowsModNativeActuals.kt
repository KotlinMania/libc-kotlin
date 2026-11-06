@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isblank(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_toupper(c)

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_qsort(base?.value?.toCPointer<ByteVar>(), num, size, compar?.value?.toCPointer<ByteVar>())
}

public actual fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_qsort_s(base?.value?.toCPointer<ByteVar>(), num, size, compar?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_freopen(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fflush(file: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fflush(file?.handle?.toCPointer<ByteVar>())

public actual fun fclose(file: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fclose(file?.handle?.toCPointer<ByteVar>())

public actual fun remove(filename: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_tmpfile()?.let { FILE(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_getchar()

public actual fun putchar(c: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fputs(s: String?, stream: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun puts(s: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fread(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fgetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fsetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun feof(stream: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun perror(s: String?) {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_perror(s)
}

public actual fun atof(s: String?): CDouble =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_atof(s)

public actual fun atoi(s: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_atoi(s)

public actual fun atol(s: String?): CLong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_atol(s)

public actual fun atoll(s: String?): CLonglong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun msize(p: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_msize(p?.value?.toCPointer<ByteVar>())

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_atexit(cb.toInt())

public actual fun system(s: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun wcslen(buf: UShort?): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wcslen(buf?.value?.toCPointer<ByteVar>())

public actual fun wcsnlen(str: UShort?, numberOfElements: SizeT): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wcsnlen(str?.value?.toCPointer<ByteVar>(), numberOfElements)

public actual fun wcstombs(dest: COpaquePointer?, src: UShort?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wcstombs(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_labs(i)

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_rand()

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_srand(seed)
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_signal(signum, handler)

public actual fun raise(signum: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_raise(signum)

public actual fun clock(): ClockT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_clock()

public actual fun ctime(sourceTime: Long?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_ctime(sourceTime?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_difftime(timeEnd, timeStart)

public actual fun gmtimeS(destTime: Tm?, srcTime: Long?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_gmtime_s(destTime?.value?.toCPointer<ByteVar>(), srcTime?.value?.toCPointer<ByteVar>())

public actual fun getDaylight(hours: CInt?): ErrnoT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_get_daylight(hours?.value?.toCPointer<ByteVar>())

public actual fun getDstbias(seconds: CLong?): ErrnoT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_get_dstbias(seconds?.value?.toCPointer<ByteVar>())

public actual fun getTimezone(seconds: CLong?): ErrnoT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_get_timezone(seconds?.value?.toCPointer<ByteVar>())

public actual fun getTzname(pReturnValue: ULong?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_get_tzname(pReturnValue?.value?.toCPointer<ByteVar>(), timeZoneName?.value?.toCPointer<ByteVar>(), sizeInBytes, index)

public actual fun localtimeS(tmDest: Tm?, sourceTime: Long?): io.github.kotlinmania.libc.ErrnoT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_localtime_s(tmDest?.value?.toCPointer<ByteVar>(), sourceTime?.value?.toCPointer<ByteVar>())

public actual fun time(destTime: Long?): TimeT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_time(destTime?.value?.toCPointer<ByteVar>())

public actual fun tzset() {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_tzset()
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_chmod(path, mode)

public actual fun wchmod(path: UShort?, mode: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wchmod(path?.value?.toCPointer<ByteVar>(), mode)

public actual fun mkdir(path: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_mkdir(path)

public actual fun wrmdir(path: UShort?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wrmdir(path?.value?.toCPointer<ByteVar>())

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun stat(path: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun wstat(path: UShort?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wstat(path?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun wutime(file: UShort?, buf: Utimbuf?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wutime(file?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun pclose(stream: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_pclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun creat(path: String?, mode: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_creat(path, mode)

public actual fun access(path: String?, amode: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_access(path, amode)

public actual fun chdir(dir: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_chdir(dir)

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_close(fd)

public actual fun dup(fd: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_dup2(src, dst)

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_execv(prog, argv?.value?.toCPointer<ByteVar>())

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_execve(prog, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_execvp(c, argv?.value?.toCPointer<ByteVar>())

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_execvpe(c, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun wexecv(prog: UShort?, argv: COpaquePointer?): IntptrT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wexecv(prog?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>())

public actual fun wexecve(prog: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wexecve(prog?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun wexecvp(c: UShort?, argv: COpaquePointer?): IntptrT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wexecvp(c?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>())

public actual fun wexecvpe(c: UShort?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wexecvpe(c?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun getpid(): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_getpid()

public actual fun isatty(fd: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_isatty(fd)

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_lseek(fd, offset, origin)

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_lseek64(fd, offset, origin)

public actual fun pipe(fds: CInt?, psize: CUint, textmode: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_pipe(fds?.value?.toCPointer<ByteVar>(), psize, textmode)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_rmdir(path)

public actual fun unlink(c: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_unlink(c)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun commit(fd: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_commit(fd)

public actual fun getOsfhandle(fd: CInt): IntptrT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_get_osfhandle(fd)

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_open_osfhandle(osfhandle, flags)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun wsetlocale(category: CInt, locale: UShort?): UShort? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wsetlocale(category, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_aligned_malloc(size, alignment)?.let { COpaquePointer(it.toLong()) }

public actual fun alignedFree(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_aligned_free(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_aligned_realloc(memblock?.value?.toCPointer<ByteVar>(), size, alignment)?.let { COpaquePointer(it.toLong()) }

public actual fun putenv(envstring: String?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_putenv(envstring)

public actual fun wputenv(envstring: UShort?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wputenv(envstring?.value?.toCPointer<ByteVar>())

public actual fun putenvS(envstring: String?, valueString: String?): io.github.kotlinmania.libc.ErrnoT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_putenv_s(envstring, valueString)

public actual fun wputenvS(envstring: UShort?, valueString: UShort?): io.github.kotlinmania.libc.ErrnoT =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_wputenv_s(envstring?.value?.toCPointer<ByteVar>(), valueString?.value?.toCPointer<ByteVar>())

public actual fun listen(s: Socket, backlog: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_listen(s, backlog)

public actual fun accept(s: Socket, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CInt?): Socket =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_accept(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun bind(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_bind(s, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun connect(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_connect(s, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun getpeername(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, nameln: CInt?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_getpeername(s, name?.value?.toCPointer<ByteVar>(), nameln?.value?.toCPointer<ByteVar>())

public actual fun getsockname(s: Socket, name: io.github.kotlinmania.libc.Sockaddr?, nameln: CInt?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_getsockname(s, name?.value?.toCPointer<ByteVar>(), nameln?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CInt?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_getsockopt(s, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: io.github.kotlinmania.libc.Sockaddr?, fromlen: CInt?): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_recvfrom(s, buf?.value?.toCPointer<ByteVar>(), len, flags, from?.value?.toCPointer<ByteVar>(), fromlen?.value?.toCPointer<ByteVar>())

public actual fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: io.github.kotlinmania.libc.Sockaddr?, tolen: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_sendto(s, buf, len, flags, to?.value?.toCPointer<ByteVar>(), tolen)

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_setsockopt(s, level, optname, optval, optlen)

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    io.github.kotlinmania.libc.windows.cinterop.libc_windows_mod_socket(af, socketType, protocol)
