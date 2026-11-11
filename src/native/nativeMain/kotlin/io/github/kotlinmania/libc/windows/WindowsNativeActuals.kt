@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_abort
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_abs
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_accept
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_access
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_alignedFree
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_alignedMalloc
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_alignedRealloc
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_atexit
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_atof
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_atoi
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_atol
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_atoll
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_bind
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_calloc
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_chdir
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_chmod
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_clock
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_close
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_commit
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_connect
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_creat
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_ctime
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_difftime
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_dup
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_dup2
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_execl
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_execle
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_execlp
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_execlpe
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_execv
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_execve
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_execvp
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_execvpe
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_exit
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fclose
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fdopen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_feof
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_ferror
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fflush
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fgetc
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fgetpos
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fgets
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fileno
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fopen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fprintf
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fputc
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fputs
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fread
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_free
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_freopen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fseek
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fsetpos
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fstat
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_ftell
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_fwrite
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getDaylight
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getDstbias
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getOsfhandle
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getTimezone
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getTzname
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getchar
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getcwd
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getenv
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getpeername
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getpid
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getsockname
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_getsockopt
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_gmtimeS
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isalnum
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isalpha
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isatty
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isblank
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_iscntrl
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isdigit
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isgraph
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_islower
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isprint
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_ispunct
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isspace
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isupper
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_isxdigit
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_labs
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_listen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_localtimeS
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_lseek
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_lseek64
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_malloc
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_memchr
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_memcmp
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_memcpy
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_memmove
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_memset
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_mkdir
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_msize
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_open
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_openOsfhandle
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_pclose
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_perror
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_pipe
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_popen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_printf
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_putchar
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_putenv
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_putenvS
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_puts
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_qsort
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_qsortS
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_raise
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_rand
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_read
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_realloc
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_recvfrom
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_remove
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_rename
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_rewind
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_rmdir
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_sendto
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_setbuf
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_setlocale
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_setsockopt
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_setvbuf
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_signal
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_socket
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_srand
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_stat
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strcat
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strchr
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strcmp
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strcoll
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strcpy
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strcspn
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strdup
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strerror
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strlen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strncat
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strncmp
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strncpy
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strnlen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strpbrk
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strrchr
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strspn
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strstr
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strtod
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strtof
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strtok
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strtol
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strtoll
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strtoul
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strtoull
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_strxfrm
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_system
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_time
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_tmpfile
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_tolower
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_toupper
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_tzset
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_ungetc
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_unlink
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wchmod
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wcslen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wcsnlen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wcstombs
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wexecl
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wexecle
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wexeclp
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wexeclpe
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wexecv
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wexecve
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wexecvp
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wexecvpe
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wopen
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wputenv
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wputenvS
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_write
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wrmdir
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wsetlocale
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wstat
import io.github.kotlinmania.libc.windows.cinterop.libc_windows_wutime
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    libc_windows_printf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    libc_windows_fprintf(stream?.handle?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun isalnum(c: CInt): CInt =
    libc_windows_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libc_windows_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libc_windows_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libc_windows_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libc_windows_isgraph(c)

public actual fun islower(c: CInt): CInt =
    libc_windows_islower(c)

public actual fun isprint(c: CInt): CInt =
    libc_windows_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    libc_windows_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    libc_windows_isspace(c)

public actual fun isupper(c: CInt): CInt =
    libc_windows_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libc_windows_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libc_windows_isblank(c)

public actual fun tolower(c: CInt): CInt =
    libc_windows_tolower(c)

public actual fun toupper(c: CInt): CInt =
    libc_windows_toupper(c)

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    libc_windows_qsort(base?.value?.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>())
}

public actual fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: COpaquePointer?) {
    libc_windows_qsortS(base?.value?.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    libc_windows_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    libc_windows_freopen(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fflush(file: FILE?): CInt =
    libc_windows_fflush(file?.handle?.toCPointer<ByteVar>())

public actual fun fclose(file: FILE?): CInt =
    libc_windows_fclose(file?.handle?.toCPointer<ByteVar>())

public actual fun remove(filename: String?): CInt =
    libc_windows_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    libc_windows_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    libc_windows_tmpfile()?.let { FILE(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    libc_windows_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    libc_windows_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    libc_windows_getchar()

public actual fun putchar(c: CInt): CInt =
    libc_windows_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    libc_windows_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    libc_windows_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    libc_windows_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fputs(s: String?, stream: FILE?): CInt =
    libc_windows_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun puts(s: String?): CInt =
    libc_windows_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    libc_windows_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    libc_windows_fread(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    libc_windows_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    libc_windows_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    libc_windows_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    libc_windows_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_windows_fgetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_windows_fsetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun feof(stream: FILE?): CInt =
    libc_windows_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    libc_windows_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun perror(s: String?) {
    libc_windows_perror(s)
}

public actual fun atof(s: String?): CDouble =
    libc_windows_atof(s)

public actual fun atoi(s: String?): CInt =
    libc_windows_atoi(s)

public actual fun atol(s: String?): CLong =
    libc_windows_atol(s)

public actual fun atoll(s: String?): CLonglong =
    libc_windows_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    libc_windows_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    libc_windows_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    libc_windows_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    libc_windows_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    libc_windows_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    libc_windows_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    libc_windows_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    libc_windows_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun msize(p: COpaquePointer?): SizeT =
    libc_windows_msize(p?.value?.toCPointer<ByteVar>())

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_windows_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    libc_windows_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    libc_windows_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    libc_windows_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    libc_windows_atexit(0L.toCPointer<ByteVar>())

public actual fun system(s: String?): CInt =
    libc_windows_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    libc_windows_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    libc_windows_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    libc_windows_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    libc_windows_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    libc_windows_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    libc_windows_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    libc_windows_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    libc_windows_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    libc_windows_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    libc_windows_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    libc_windows_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    libc_windows_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    libc_windows_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    libc_windows_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    libc_windows_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(cs: String?): SizeT =
    libc_windows_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    libc_windows_strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    libc_windows_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    libc_windows_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    libc_windows_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    libc_windows_wcslen(buf?.value?.toCPointer<ByteVar>())

public actual fun wcsnlen(str: COpaquePointer?, numberOfElements: SizeT): SizeT =
    libc_windows_wcsnlen(str?.value?.toCPointer<ByteVar>(), numberOfElements)

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    libc_windows_wcstombs(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_windows_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    libc_windows_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_windows_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_windows_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_windows_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    libc_windows_abs(i)

public actual fun labs(i: CLong): CLong =
    libc_windows_labs(i)

public actual fun rand(): CInt =
    libc_windows_rand()

public actual fun srand(seed: CUint) {
    libc_windows_srand(seed)
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    libc_windows_signal(signum, handler)

public actual fun raise(signum: CInt): CInt =
    libc_windows_raise(signum)

public actual fun clock(): ClockT =
    libc_windows_clock()

public actual fun ctime(sourceTime: COpaquePointer?): COpaquePointer? =
    libc_windows_ctime(sourceTime?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    libc_windows_difftime(timeEnd, timeStart)

public actual fun gmtimeS(destTime: COpaquePointer?, srcTime: COpaquePointer?): CInt =
    libc_windows_gmtimeS(destTime?.value?.toCPointer<ByteVar>(), srcTime?.value?.toCPointer<ByteVar>())

public actual fun getDaylight(hours: COpaquePointer?): ErrnoT =
    libc_windows_getDaylight(hours?.value?.toCPointer<ByteVar>())

public actual fun getDstbias(seconds: COpaquePointer?): ErrnoT =
    libc_windows_getDstbias(seconds?.value?.toCPointer<ByteVar>())

public actual fun getTimezone(seconds: COpaquePointer?): ErrnoT =
    libc_windows_getTimezone(seconds?.value?.toCPointer<ByteVar>())

public actual fun getTzname(pReturnValue: COpaquePointer?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT =
    libc_windows_getTzname(pReturnValue?.value?.toCPointer<ByteVar>(), timeZoneName?.value?.toCPointer<ByteVar>(), sizeInBytes, index)

public actual fun localtimeS(tmDest: COpaquePointer?, sourceTime: COpaquePointer?): ErrnoT =
    libc_windows_localtimeS(tmDest?.value?.toCPointer<ByteVar>(), sourceTime?.value?.toCPointer<ByteVar>())

public actual fun time(destTime: COpaquePointer?): TimeT =
    libc_windows_time(destTime?.value?.toCPointer<ByteVar>())

public actual fun tzset() {
    libc_windows_tzset()
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    libc_windows_chmod(path, mode)

public actual fun wchmod(path: COpaquePointer?, mode: CInt): CInt =
    libc_windows_wchmod(path?.value?.toCPointer<ByteVar>(), mode)

public actual fun mkdir(path: String?): CInt =
    libc_windows_mkdir(path)

public actual fun wrmdir(path: COpaquePointer?): CInt =
    libc_windows_wrmdir(path?.value?.toCPointer<ByteVar>())

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    libc_windows_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    libc_windows_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun wstat(path: COpaquePointer?, buf: COpaquePointer?): CInt =
    libc_windows_wstat(path?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun wutime(file: COpaquePointer?, buf: COpaquePointer?): CInt =
    libc_windows_wutime(file?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())

public actual fun popen(command: String?, mode: String?): FILE? =
    libc_windows_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun pclose(stream: FILE?): CInt =
    libc_windows_pclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    libc_windows_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    libc_windows_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_windows_open(path, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wopen(path: COpaquePointer?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_windows_wopen(path?.value?.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: String?, mode: CInt): CInt =
    libc_windows_creat(path, mode)

public actual fun access(path: String?, amode: CInt): CInt =
    libc_windows_access(path, amode)

public actual fun chdir(dir: String?): CInt =
    libc_windows_chdir(dir)

public actual fun close(fd: CInt): CInt =
    libc_windows_close(fd)

public actual fun dup(fd: CInt): CInt =
    libc_windows_dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    libc_windows_dup2(src, dst)

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    libc_windows_execl(path, arg0, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexecl(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    libc_windows_wexecl(path?.value?.toCPointer<ByteVar>(), arg0?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    libc_windows_execle(path, arg0, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexecle(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    libc_windows_wexecle(path?.value?.toCPointer<ByteVar>(), arg0?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    libc_windows_execlp(path, arg0, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexeclp(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    libc_windows_wexeclp(path?.value?.toCPointer<ByteVar>(), arg0?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlpe(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    libc_windows_execlpe(path, arg0, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wexeclpe(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    libc_windows_wexeclpe(path?.value?.toCPointer<ByteVar>(), arg0?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    libc_windows_execv(prog, argv?.value?.toCPointer<ByteVar>())

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_windows_execve(prog, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    libc_windows_execvp(c, argv?.value?.toCPointer<ByteVar>())

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_windows_execvpe(c, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun wexecv(prog: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    libc_windows_wexecv(prog?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>())

public actual fun wexecve(prog: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    libc_windows_wexecve(prog?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun wexecvp(c: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    libc_windows_wexecvp(c?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>())

public actual fun wexecvpe(c: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    libc_windows_wexecvpe(c?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? =
    libc_windows_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun getpid(): CInt =
    libc_windows_getpid()

public actual fun isatty(fd: CInt): CInt =
    libc_windows_isatty(fd)

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    libc_windows_lseek(fd, offset, origin)

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    libc_windows_lseek64(fd, offset, origin)

public actual fun pipe(fds: COpaquePointer?, psize: CUint, textmode: CInt): CInt =
    libc_windows_pipe(fds?.value?.toCPointer<ByteVar>(), psize, textmode)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    libc_windows_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: String?): CInt =
    libc_windows_rmdir(path)

public actual fun unlink(c: String?): CInt =
    libc_windows_unlink(c)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    libc_windows_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun commit(fd: CInt): CInt =
    libc_windows_commit(fd)

public actual fun getOsfhandle(fd: CInt): IntptrT =
    libc_windows_getOsfhandle(fd)

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    libc_windows_openOsfhandle(osfhandle, flags)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    libc_windows_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun wsetlocale(category: CInt, locale: COpaquePointer?): COpaquePointer? =
    libc_windows_wsetlocale(category, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? =
    libc_windows_alignedMalloc(size, alignment)?.let { COpaquePointer(it.toLong()) }

public actual fun alignedFree(ptr: COpaquePointer?) {
    libc_windows_alignedFree(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? =
    libc_windows_alignedRealloc(memblock?.value?.toCPointer<ByteVar>(), size, alignment)?.let { COpaquePointer(it.toLong()) }

public actual fun putenv(envstring: String?): CInt =
    libc_windows_putenv(envstring)

public actual fun wputenv(envstring: COpaquePointer?): CInt =
    libc_windows_wputenv(envstring?.value?.toCPointer<ByteVar>())

public actual fun putenvS(envstring: String?, valueString: String?): ErrnoT =
    libc_windows_putenvS(envstring, valueString)

public actual fun wputenvS(envstring: COpaquePointer?, valueString: COpaquePointer?): ErrnoT =
    libc_windows_wputenvS(envstring?.value?.toCPointer<ByteVar>(), valueString?.value?.toCPointer<ByteVar>())

public actual fun listen(s: Socket, backlog: CInt): CInt =
    libc_windows_listen(s, backlog)

public actual fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket =
    libc_windows_accept(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun bind(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    libc_windows_bind(s, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun connect(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    libc_windows_connect(s, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun getpeername(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    libc_windows_getpeername(s, name?.value?.toCPointer<ByteVar>(), nameln?.value?.toCPointer<ByteVar>())

public actual fun getsockname(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    libc_windows_getsockname(s, name?.value?.toCPointer<ByteVar>(), nameln?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    libc_windows_getsockopt(s, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: COpaquePointer?, fromlen: COpaquePointer?): CInt =
    libc_windows_recvfrom(s, buf?.value?.toCPointer<ByteVar>(), len, flags, from?.value?.toCPointer<ByteVar>(), fromlen?.value?.toCPointer<ByteVar>())

public actual fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: COpaquePointer?, tolen: CInt): CInt =
    libc_windows_sendto(s, buf, len, flags, to?.value?.toCPointer<ByteVar>(), tolen)

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt =
    libc_windows_setsockopt(s, level, optname, optval, optlen)

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    libc_windows_socket(af, socketType, protocol)
